package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ws9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Comparable h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws9(xi80 xi80Var, boolean z, Uri uri, boolean z2, boolean z3, boolean z4, boolean z5, qim0 qim0Var) {
        super(2);
        this.g = xi80Var;
        this.b = z;
        this.h = uri;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.i = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        rih1 rih1Var;
        byte b = this.a;
        Object obj3 = this.i;
        boolean z = this.e;
        Comparable comparable = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                yu3 yu3Var = (yu3) obj3;
                String str = (String) comparable;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var2;
                }
                boolean z2 = this.b;
                if (!z2 || ((String) obj4).length() <= 0) {
                    x340Var2.i0(-1050820331);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1050953910);
                    yu3Var.d(0, (String) obj4, x340Var2, this.c, this.d);
                    rqo1.g(0, 1, x340Var2, (qim0) null);
                    x340Var2.r(false);
                }
                if (str == null || str.length() == 0) {
                    x340Var2.i0(-1050558443);
                    x340Var2.r(false);
                    return rih1Var2;
                }
                x340Var2.i0(-1050770824);
                yu3Var.e(0, str, x340Var2, z);
                if (z2 && this.f) {
                    x340Var2.i0(-1050648126);
                    rih1Var = rih1Var2;
                    otw.c((br0) yu3Var.d, rih1Var, (qim0) null, (ipb1) null, x340Var2, 56, 12);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                } else {
                    rih1Var = rih1Var2;
                    x340Var2.i0(-1050568363);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xi80 xi80Var = (xi80) obj4;
                    Uri uri = (Uri) comparable;
                    boolean z3 = this.c;
                    otw.c(xi80Var, new wi80(this.b, uri, z3, this.d, z && !z3, this.f), (qim0) obj3, (ipb1) null, x340Var4, 0, 8);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws9(boolean z, String str, yu3 yu3Var, boolean z2, boolean z3, String str2, boolean z4, boolean z5) {
        super(2);
        this.b = z;
        this.g = str;
        this.i = yu3Var;
        this.c = z2;
        this.d = z3;
        this.h = str2;
        this.e = z4;
        this.f = z5;
    }
}
