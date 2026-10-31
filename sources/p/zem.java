package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zem extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zem(cfm cfmVar, byte b) {
        super(4);
        this.a = b;
        this.b = cfmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        byte b = this.a;
        cfm cfmVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                return cfmVar.c;
            default:
                pem pemVar = (tem) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if (pemVar instanceof oem) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(2128966530);
                    x340Var2.r(false);
                } else if (pemVar instanceof qem) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(2128967611);
                    int i = cfm.t;
                    cfmVar.j((qim0) null, x340Var3, 0);
                    x340Var3.r(false);
                } else {
                    if (!(pemVar instanceof pem)) {
                        throw p3d1.k(x340Var, 2128965199, false);
                    }
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(2128969438);
                    int i2 = cfm.t;
                    cfmVar.f(pemVar, x340Var4, (iIntValue >> 3) & 14);
                    x340Var4.r(false);
                }
                return rih1.a;
        }
    }
}
