package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pb8 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h72 b;
    public final /* synthetic */ zuc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb8(h72 h72Var, zuc0 zuc0Var, byte b) {
        super(3);
        this.a = b;
        this.b = h72Var;
        this.c = zuc0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zuc0 zuc0Var = this.c;
        h72 h72Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                rit0 rit0Var = (rit0) h72Var.c;
                String str = (String) h72Var.b;
                String str2 = zuc0Var.a;
                fh90 fh90VarS = h72.S(zuc0Var);
                tu00 tu00Var = zuc0Var.q;
                w281 w281VarA = tu00Var.a(w281.class);
                int i = 3;
                if (w281VarA != null) {
                    if (w281VarA.a instanceof o281) {
                        i = 2;
                    } else {
                        att0 att0VarA = tu00Var.a(att0.class);
                        if (att0VarA != null && att0VarA.a) {
                            i = !w281VarA.c ? 1 : 0;
                        }
                    }
                }
                otw.c(rit0Var, new git0(str2, str, fh90VarS, i), (qim0) null, (ipb1) null, b0kVar, 0, 12);
                break;
            default:
                ((Number) obj3).intValue();
                otw.c((u7p0) h72Var.Y, new q671(zuc0Var.c, zuc0Var.i, (String) h72Var.b), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
        }
        return rih1Var;
    }
}
