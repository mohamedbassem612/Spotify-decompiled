package p;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l1q0 implements ah70 {
    public boolean a;
    public final Object b;
    public Object c;

    public l1q0(byte b) {
        switch (b) {
            case 2:
                this.b = new Object();
                break;
            default:
                this.a = false;
                this.b = new HashMap();
                this.c = new LinkedBlockingQueue();
                break;
        }
    }

    public void a() {
        ((bbc) this.b).e(new CancellationException("onBack cancelled"), true);
        ha71.o((faa0) this.c);
    }

    public synchronized rue0 b(String str) {
        bpc1 bpc1Var;
        bpc1Var = (bpc1) ((HashMap) this.b).get(str);
        if (bpc1Var == null) {
            bpc1Var = new bpc1(str, (LinkedBlockingQueue) this.c, this.a);
            ((HashMap) this.b).put(str, bpc1Var);
        }
        return bpc1Var;
    }

    public void c(y2p1 y2p1Var) {
        synchronized (this.b) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.c;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.c = arrayDeque;
                }
                arrayDeque.add(y2p1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Task task) {
        y2p1 y2p1Var;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            y2p1Var = (y2p1) ((ArrayDeque) this.c).poll();
                            if (y2p1Var == null) {
                                this.a = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    y2p1Var.a(task);
                }
            }
        }
    }

    public l1q0(String str, String str2, boolean z) {
        this.c = str;
        this.b = str2;
        this.a = z;
    }

    public l1q0(c9n c9nVar, boolean z, vu30 vu30Var, gnv0 gnv0Var) {
        this.a = z;
        this.b = mno1.a(-2, 1, 4);
        this.c = c921.y(c9nVar, (o8n) null, 0, new g1y(gnv0Var, vu30Var, this, null, (byte) 1), 3);
    }
}
