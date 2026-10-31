package p;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pxn1 implements y2p1, h8q0, d5q0, z1q0 {
    public final /* synthetic */ byte a;
    public final Executor b;
    public final mnm c;
    public final hfp1 d;

    public /* synthetic */ pxn1(Executor executor, mnm mnmVar, hfp1 hfp1Var, byte b) {
        this.a = b;
        this.b = executor;
        this.c = mnmVar;
        this.d = hfp1Var;
    }

    @Override // p.y2p1
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new ni(this, task, (byte) 6));
                break;
            default:
                this.b.execute(new ni(this, task, (byte) 7));
                break;
        }
    }

    @Override // p.z1q0
    public void c() {
        this.d.s();
    }

    @Override // p.d5q0
    public void i(Exception exc) {
        this.d.q(exc);
    }

    @Override // p.h8q0
    public void onSuccess(Object obj) {
        this.d.r(obj);
    }
}
