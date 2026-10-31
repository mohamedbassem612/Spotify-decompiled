package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class caa1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ caa1(String str, String str2, float f, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = this.b;
                if (str != null) {
                    Uri uri2 = Uri.parse(str);
                    if (uri2.equals(Uri.EMPTY)) {
                        uri = null;
                    } else {
                        uri = uri2;
                    }
                } else {
                    uri = null;
                }
                float f = this.d;
                String str2 = this.c;
                if (uri != null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(1104368999);
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    w2g0.e(str2, f, x340Var2, 0);
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    cbx.a.getClass();
                    eso1.e(uri, isl.a, qim0VarD2, (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var2, 27696, 0, 3520);
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1104846492);
                    w2g0.e(str2, f, x340Var3, 0);
                    x340Var3.r(false);
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                w2g0.k(this.b, this.c, this.d, null, null, false, (b0k) obj2, 0, 56);
                return rih1Var;
        }
    }
}
