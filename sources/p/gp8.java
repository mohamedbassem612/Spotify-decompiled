package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gp8 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ep8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp8(ep8 ep8Var, byte b) {
        super(3);
        this.a = b;
        this.b = ep8Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ep8 ep8Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarQ = i1p1.q(nim0.a, er31.a);
                    Uri uri = Uri.parse(ep8Var.a.d);
                    fwx fwxVarG = hso1.G(qkx.c, 0L, 0L, x340Var2, qkx.d, 30);
                    eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var2, 1075314736, 0, 3512);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String str = ep8Var.a.c;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var4).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 1572864, 0, 1722);
                }
                break;
        }
        return rih1Var;
    }
}
