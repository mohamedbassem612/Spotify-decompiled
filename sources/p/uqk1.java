package p;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uqk1 {
    public static final boolean c = vqk1.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new tqk1(j, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((tqk1) arrayList.get(arrayList.size() - 1)).c - ((tqk1) arrayList.get(0)).c;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((tqk1) this.a.get(0)).c;
        vqk1.a("(%-4d ms) %s", Long.valueOf(j), str);
        for (tqk1 tqk1Var : this.a) {
            long j3 = tqk1Var.c;
            vqk1.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(tqk1Var.b), tqk1Var.a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        vqk1.a("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
