package p;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xxu {
    public static final cq21 m = new cq21(1);
    public final Context a;
    public final qvr b;
    public final uxu c;
    public final thn d;
    public int f;
    public int i;
    public boolean j;
    public at7 l;
    public byte h = 3;
    public boolean g = true;
    public List k = Collections.EMPTY_LIST;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public xxu(Context context, qvr qvrVar, toj0 toj0Var) {
        this.a = context.getApplicationContext();
        this.b = qvrVar;
        Handler handlerS = zoi1.s(new owu(this, (byte) 1));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        uxu uxuVar = new uxu(handlerThread, qvrVar, toj0Var, handlerS, this.h, this.g);
        this.c = uxuVar;
        thn thnVar = new thn(this, (byte) 15);
        this.d = thnVar;
        at7 at7Var = new at7(context, thnVar, m);
        this.l = at7Var;
        int iL = at7Var.l();
        this.i = iL;
        this.f = 1;
        uxuVar.obtainMessage(1, iL, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((zma) it.next()).getClass();
        }
    }

    public final void b(at7 at7Var, int i) {
        at7Var.getClass();
        if (this.i != i) {
            this.i = i;
            this.f++;
            this.c.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean zC = c();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((zma) it.next()).getClass();
        }
        if (zC) {
            a();
        }
    }

    public final boolean c() {
        boolean z;
        if (!this.g && this.i != 0) {
            int i = 0;
            while (true) {
                if (i >= this.k.size()) {
                    z = false;
                    break;
                }
                if (((kru) this.k.get(i)).b == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z2 = this.j != z;
        this.j = z;
        return z2;
    }
}
