package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g0x0 extends hab0 implements iu30 {
    public final /* synthetic */ iac0 a;
    public final /* synthetic */ MobiusLoop.Controller b;
    public final /* synthetic */ j0x0 c;
    public final /* synthetic */ iis d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0x0(iac0 iac0Var, MobiusLoop.Controller controller, j0x0 j0x0Var, iis iisVar) {
        super(1);
        this.a = iac0Var;
        this.b = controller;
        this.c = j0x0Var;
        this.d = iisVar;
    }

    public final Object invoke(Object obj) {
        x8c0 lifecycle = this.a.getLifecycle();
        f0x0 f0x0Var = new f0x0(this.b, this.c, this.d);
        lifecycle.a(f0x0Var);
        return new w9d0(lifecycle, f0x0Var, (byte) 10);
    }
}
