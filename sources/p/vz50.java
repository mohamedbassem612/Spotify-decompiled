package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vz50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wz50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz50(wz50 wz50Var, byte b) {
        super(1);
        this.a = b;
        this.b = wz50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wz50 wz50Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return d3p1.H(wz50Var.a, wz50Var.i, (sz50) obj);
            case 1:
                tz50 tz50Var = (tz50) obj;
                String str = tz50Var.a;
                String str2 = tz50Var.b;
                rz50 rz50Var = tz50Var.c;
                return new nt70(str, str2, null, rz50Var != null ? rz50Var.a : null, rz50Var != null ? rz50Var.b : null, wz50Var.c, wz50Var.b, null, null, null, null, wz50Var.d, z6x.a, wz50Var.e, wz50Var.g, wz50Var.f, 3620);
            default:
                return wz50Var.h.a((l0i) null);
        }
    }
}
