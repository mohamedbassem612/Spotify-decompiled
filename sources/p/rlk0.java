package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rlk0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nlk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rlk0(nlk0 nlk0Var, byte b) {
        super(3);
        this.a = b;
        this.b = nlk0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nlk0 nlk0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                xkk1 xkk1Var = nlk0Var.c;
                if (xkk1Var != null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(945730363);
                    as80 as80Var = mif1.P0;
                    cbx.a.getClass();
                    ecx ecxVarA = uwr.a();
                    up70 up70VarA = xkk1Var.a.a(vp70.c);
                    if (up70VarA == null || (str = up70VarA.a.a) == null || (uri = Uri.parse(str)) == null) {
                        uri = Uri.EMPTY;
                    }
                    uri.getClass();
                    fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, x340Var2, ltx.d, 30);
                    eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var2, 1073741872, 0, 3484);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(945730362);
                    x340Var3.r(false);
                }
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                jo70 jo70Var = nlk0Var.b;
                String str2 = jo70Var != null ? jo70Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                slk0.a(0, str2, b0kVar, u291.f(nim0.a, 1.0f));
                break;
        }
        return rih1Var;
    }
}
