package p;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class afo1 implements y2p1, h8q0, d5q0, z1q0 {
    public final /* synthetic */ byte a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public afo1(Executor executor, z1q0 z1q0Var) {
        this.a = (byte) 0;
        this.c = new Object();
        this.b = executor;
        this.d = z1q0Var;
    }

    @Override // p.y2p1
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                if (((hfp1) task).d) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new seg1(this, (byte) 21));
                    return;
                }
                return;
            case 1:
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new ni(this, task, (byte) 8));
                return;
            case 2:
                if (task.j() || ((hfp1) task).d) {
                    return;
                }
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new ni(this, task, (byte) 9));
                return;
            case 3:
                if (task.j()) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new ni(this, task, (byte) 10));
                    return;
                }
                return;
            default:
                this.b.execute(new ni(this, task, (byte) 11));
                return;
        }
    }

    @Override // p.z1q0
    public void c() {
        ((hfp1) this.d).s();
    }

    @Override // p.d5q0
    public void i(Exception exc) {
        ((hfp1) this.d).q(exc);
    }

    @Override // p.h8q0
    public void onSuccess(Object obj) {
        ((hfp1) this.d).r(obj);
    }

    public afo1(Executor executor, i2q0 i2q0Var) {
        this.a = (byte) 1;
        this.c = new Object();
        this.b = executor;
        this.d = i2q0Var;
    }

    public afo1(Executor executor, d5q0 d5q0Var) {
        this.a = (byte) 2;
        this.c = new Object();
        this.b = executor;
        this.d = d5q0Var;
    }

    public afo1(Executor executor, h8q0 h8q0Var) {
        this.a = (byte) 3;
        this.c = new Object();
        this.b = executor;
        this.d = h8q0Var;
    }

    public afo1(Executor executor, fsc1 fsc1Var, hfp1 hfp1Var) {
        this.a = (byte) 4;
        this.b = executor;
        this.c = fsc1Var;
        this.d = hfp1Var;
    }
}
