package p;

import android.app.Notification;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.TimeConversions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zko0 {
    private static Notification.Metric b(yko0 yko0Var) {
        return new Notification.Metric(c(yko0Var.a), yko0Var.b, yko0Var.c);
    }

    private static Notification.Metric.MetricValue c(wko0 wko0Var) {
        if (wko0Var instanceof xko0) {
            xko0 xko0Var = (xko0) wko0Var;
            boolean z = xko0Var.d;
            int i = xko0Var.e;
            Instant instant = xko0Var.a;
            if (instant != null) {
                return z ? Notification.Metric.TimeDifference.forTimer(TimeConversions.convert(instant), i) : Notification.Metric.TimeDifference.forStopwatch(TimeConversions.convert(instant), i);
            }
            Long l = xko0Var.b;
            if (l != null) {
                return z ? Notification.Metric.TimeDifference.forTimer(l.longValue(), i) : Notification.Metric.TimeDifference.forStopwatch(l.longValue(), i);
            }
            Duration duration = xko0Var.c;
            if (duration != null) {
                return z ? Notification.Metric.TimeDifference.forPausedTimer(TimeConversions.convert(duration), i) : Notification.Metric.TimeDifference.forPausedStopwatch(TimeConversions.convert(duration), i);
            }
            hhg1.g(xko0Var, "Unexpected TimeDifference: ");
            return null;
        }
        if (wko0Var instanceof rko0) {
            rko0 rko0Var = (rko0) wko0Var;
            return new Notification.Metric.FixedDate(TimeConversions.convert(rko0Var.a), rko0Var.b);
        }
        if (wko0Var instanceof sko0) {
            sko0 sko0Var = (sko0) wko0Var;
            return new Notification.Metric.FixedFloat(sko0Var.a, sko0Var.b, sko0Var.c, sko0Var.d);
        }
        if (wko0Var instanceof tko0) {
            tko0 tko0Var = (tko0) wko0Var;
            return new Notification.Metric.FixedInt(tko0Var.a, tko0Var.b);
        }
        if (wko0Var instanceof uko0) {
            uko0 uko0Var = (uko0) wko0Var;
            return new Notification.Metric.FixedText(uko0Var.a, uko0Var.b);
        }
        if (wko0Var instanceof vko0) {
            return new Notification.Metric.FixedTime(TimeConversions.convert(((vko0) wko0Var).a));
        }
        hhg1.g(wko0Var, "Unexpected MetricValue: ");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Notification.Style d(alo0 alo0Var) {
        Notification.Style metricStyle = new Notification.MetricStyle();
        ArrayList arrayList = alo0Var.e;
        Iterator it = Collections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            metricStyle.addMetric(b((yko0) it.next()));
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        int i = alo0Var.f;
        metricStyle.setCriticalMetric(listUnmodifiableList.indexOf((i < 0 || i >= arrayList.size()) ? null : (yko0) arrayList.get(alo0Var.f)));
        return metricStyle;
    }
}
