package p;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class blo0 {
    public static void a(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<dlo0> list) {
        Iterator<dlo0> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(i(it.next()));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<elo0> list) {
        Iterator<elo0> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(j(it.next()));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }

    public static Notification.ProgressStyle.Point i(dlo0 dlo0Var) {
        return new Notification.ProgressStyle.Point(dlo0Var.a).setColor(dlo0Var.c).setId(dlo0Var.b);
    }

    public static Notification.ProgressStyle.Segment j(elo0 elo0Var) {
        return new Notification.ProgressStyle.Segment(elo0Var.a).setColor(elo0Var.c).setId(elo0Var.b);
    }
}
