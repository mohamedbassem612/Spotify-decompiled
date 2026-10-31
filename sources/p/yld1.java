package p;

import com.spotify.creativework.v1.Release;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yld1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n3z b;
    public final /* synthetic */ nmd1 c;
    public final /* synthetic */ y1c1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yld1(n3z n3zVar, nmd1 nmd1Var, y1c1 y1c1Var, byte b) {
        super(2);
        this.a = b;
        this.b = n3zVar;
        this.c = nmd1Var;
        this.d = y1c1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nmd1 nmd1Var = this.c;
        n3z n3zVar = this.b;
        switch (b) {
            case 0:
                iac0 iac0Var = (iac0) obj2;
                lo11 lo11VarO = Release.o();
                lo11VarO.q(n3zVar.a);
                Release releaseBuild = lo11VarO.build();
                t7y t7yVar = nmd1Var.q;
                releaseBuild.getClass();
                return new jpg0(new q1v0(this.d, releaseBuild, iac0Var, nmd1Var.v, t7yVar), new vld1(releaseBuild, (byte) 3));
            default:
                iac0 iac0Var2 = (iac0) obj2;
                lo11 lo11VarO2 = Release.o();
                lo11VarO2.q(n3zVar.a);
                Release releaseBuild2 = lo11VarO2.build();
                w2z w2zVar = nmd1Var.p;
                releaseBuild2.getClass();
                return new jpg0(new q1v0(this.d, releaseBuild2, iac0Var2, nmd1Var.v, w2zVar), new vld1(releaseBuild2, (byte) 4));
        }
    }
}
