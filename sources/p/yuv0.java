package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yuv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zuv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yuv0(zuv0 zuv0Var, byte b) {
        super(1);
        this.a = b;
        this.b = zuv0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zuv0 zuv0Var = this.b;
        switch (b) {
            case 0:
                z2s z2sVar = (z2s) obj;
                z2sVar.R(gvv0.class, zuv0Var.a, hlv0.Y0, hlv0.Z0, xuv0.h, false, vbv0.O0);
                z2sVar.R(hvv0.class, zuv0Var.b, hlv0.a1, hlv0.b1, xuv0.i, false, vbv0.P0);
                z2sVar.R(evv0.class, zuv0Var.c, hlv0.c1, hlv0.d1, xuv0.t, false, vbv0.Q0);
                z2sVar.R(jvv0.class, zuv0Var.f, hlv0.e1, xuv0.b, xuv0.X, false, vbv0.R0);
                z2sVar.R(ivv0.class, zuv0Var.d, xuv0.c, hlv0.P0, xuv0.Y, false, vbv0.t);
                z2sVar.R(fvv0.class, zuv0Var.e, hlv0.Q0, hlv0.R0, xuv0.d, false, vbv0.X);
                z2sVar.R(bvv0.class, zuv0Var.g, hlv0.S0, hlv0.T0, xuv0.e, false, vbv0.Y);
                z2sVar.R(cvv0.class, zuv0Var.h, hlv0.U0, hlv0.V0, xuv0.f, false, vbv0.Z);
                z2sVar.R(dvv0.class, zuv0Var.i, hlv0.W0, hlv0.X0, xuv0.g, false, vbv0.N0);
                break;
            default:
                o4o1.o((y2s) obj, zuv0Var.t, new yuv0(zuv0Var, (byte) 0));
                break;
        }
        return rih1Var;
    }
}
