package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q060 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s060 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q060(s060 s060Var, byte b) {
        super(1);
        this.a = b;
        this.b = s060Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        s060 s060Var = this.b;
        switch (b) {
            case 0:
                n060 n060Var = (n060) obj;
                String str = n060Var.a;
                String str2 = n060Var.b;
                String str3 = n060Var.d;
                rz50 rz50Var = n060Var.c;
                return new nt70(str, str2, str3, rz50Var != null ? rz50Var.a : null, rz50Var != null ? rz50Var.b : null, (maa) s060Var.h, (maa) s060Var.g, (maa) s060Var.f, (kpg0) s060Var.t, n060Var.e, (xzq) s060Var.X, (ArrayList) s060Var.Z, (ArrayList) s060Var.N0, (maa) s060Var.i, s060Var.d, s060Var.b, 32);
            default:
                return ((lun) s060Var.O0).a((l0i) null);
        }
    }
}
