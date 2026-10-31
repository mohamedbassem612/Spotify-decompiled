package p;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pwu implements q2i0, zqh0, Handler.Callback {
    public boolean X;
    public final qba a;
    public final qwu b;
    public final a9a c = new a9a((byte) 1);
    public final ArrayList d = new ArrayList();
    public final Handler e = zoi1.s(new owu(this, 0));
    public final HandlerThread f;
    public final Handler g;
    public sqe1 h;
    public fn51 i;
    public arh0[] t;

    public pwu(qba qbaVar, qwu qwuVar) {
        this.a = qbaVar;
        this.b = qwuVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
        this.f = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.g = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // p.q2i0
    public final void a(qba qbaVar, sqe1 sqe1Var) {
        arh0[] arh0VarArr;
        if (this.h != null) {
            return;
        }
        if (sqe1Var.n(0, new oqe1(), 0L).c()) {
            this.e.obtainMessage(2, new IOException() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$LiveContentUnsupportedException
            }).sendToTarget();
            return;
        }
        this.h = sqe1Var;
        this.t = new arh0[sqe1Var.h()];
        int i = 0;
        while (true) {
            arh0VarArr = this.t;
            if (i >= arh0VarArr.length) {
                break;
            }
            arh0 arh0VarF = this.a.f(new p2i0(sqe1Var.l(i)), this.c, 0L);
            this.t[i] = arh0VarF;
            this.d.add(arh0VarF);
            i++;
        }
        for (arh0 arh0Var : arh0VarArr) {
            arh0Var.v(this, 0L);
        }
    }

    public final void c(v561 v561Var) {
        arh0 arh0Var = (arh0) v561Var;
        if (this.d.contains(arh0Var)) {
            this.g.obtainMessage(3, arh0Var).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Handler handler = this.g;
        qba qbaVar = this.a;
        if (i == 1) {
            if (qbaVar instanceof akx0) {
                ((akx0) qbaVar).W0 = this;
            }
            qbaVar.q(this, dbu0.c, o4a.l);
            handler.sendEmptyMessage(2);
            return true;
        }
        ArrayList arrayList = this.d;
        int i2 = 0;
        if (i == 2) {
            try {
                if (this.t == null) {
                    qbaVar.o();
                } else {
                    while (i2 < arrayList.size()) {
                        ((arh0) arrayList.get(i2)).q();
                        i2++;
                    }
                }
                handler.sendEmptyMessageDelayed(2, 100L);
                return true;
            } catch (IOException e) {
                this.e.obtainMessage(2, e).sendToTarget();
                return true;
            }
        }
        if (i == 3) {
            arh0 arh0Var = (arh0) message.obj;
            if (arrayList.contains(arh0Var)) {
                gae0 gae0Var = new gae0();
                gae0Var.a = 0L;
                arh0Var.i(new hae0(gae0Var));
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        arh0[] arh0VarArr = this.t;
        if (arh0VarArr != null) {
            int length = arh0VarArr.length;
            while (i2 < length) {
                qbaVar.t(arh0VarArr[i2]);
                i2++;
            }
        }
        if (qbaVar instanceof akx0) {
            ((akx0) qbaVar).W0 = null;
        }
        qbaVar.u(this);
        handler.removeCallbacksAndMessages(null);
        this.f.quit();
        return true;
    }

    @Override // p.zqh0
    public final void j(arh0 arh0Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(arh0Var);
        if (arrayList.isEmpty()) {
            this.g.removeMessages(2);
            this.e.sendEmptyMessage(1);
        }
    }
}
