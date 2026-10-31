package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bhc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zma1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bhc1(zma1 zma1Var, String str, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = zma1Var;
        this.c = str;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        String str = this.c;
        zma1 zma1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ye5 ye5Var = (ye5) obj;
                String str2 = (String) obj2;
                if (zma1Var == null) {
                    vhg.a(ye5Var, str2, str, vhg.a, iu30Var);
                } else {
                    vhg.a(ye5Var, str2, str, zma1Var, iu30Var);
                }
                break;
            default:
                ye5 ye5Var2 = (ye5) obj;
                String str3 = (String) obj2;
                if (zma1Var == null) {
                    vhg.c(ye5Var2, str3, str, vhg.a, iu30Var);
                } else {
                    vhg.c(ye5Var2, str3, str, zma1Var, iu30Var);
                }
                break;
        }
        return rih1Var;
    }
}
