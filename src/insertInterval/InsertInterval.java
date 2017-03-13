package insertInterval;

import java.util.ArrayList;

/**
 * @author Kevin
 * @description 给出一个无重叠的按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * @date 2017/3/13
 */
public class InsertInterval {

    public static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
            ArrayList<Interval> result = new ArrayList<Interval>();
            if (intervals == null || newInterval == null) {
                return intervals;
            }

            // 确定区间插入的位置
            int intervalPos = 0;
            for (Interval interval : intervals) {
                if (interval.end < newInterval.start) {
                    result.add(interval);
                    intervalPos++;
                } else if (interval.start > newInterval.end) {
                    result.add(interval);
                } else {
                    newInterval.start = Math.min(interval.start, newInterval.start);
                    newInterval.end = Math.max(interval.end, newInterval.end);
                }
            }
            result.add(intervalPos, newInterval);
            return result;
        }
    }
}