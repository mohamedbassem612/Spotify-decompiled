package p;

import android.app.Notification;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class clo0 {
    public static void a(Notification.ProgressStyle progressStyle, List<dlo0> list) {
        Iterator<dlo0> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(c(it.next()));
        }
    }

    public static void b(Notification.ProgressStyle progressStyle, List<elo0> list) {
        Iterator<elo0> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(d(it.next()));
        }
    }

    public static Notification.ProgressStyle.Point c(dlo0 dlo0Var) {
        return blo0.i(dlo0Var).setSemanticStyle(dlo0Var.d);
    }

    public static Notification.ProgressStyle.Segment d(elo0 elo0Var) {
        return blo0.j(elo0Var).setSemanticStyle(elo0Var.d);
    }
}
