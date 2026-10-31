package p;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w55 extends q8n {
    public final a65 Y;
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean t;
    public static final idd1 Z = new idd1(new ya4((byte) 6));
    public static final i92 N0 = new i92((byte) 7);
    public final Object e = new Object();
    public final n36 f = new n36();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final u55 X = new u55(this);

    public w55(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.Y = new a65(choreographer, this);
    }

    public final void N() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.e) {
                runnable = (Runnable) this.f.p();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.e) {
                    runnable = (Runnable) this.f.p();
                }
            }
            synchronized (this.e) {
                if (this.f.isEmpty()) {
                    z = false;
                    this.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final void h(o8n o8nVar, Runnable runnable) {
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.i) {
                this.i = true;
                this.d.post(this.X);
                if (!this.t) {
                    this.t = true;
                    this.c.postFrameCallback(this.X);
                }
            }
        }
    }
}
