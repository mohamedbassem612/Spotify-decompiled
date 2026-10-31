package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mv11 extends hab0 implements vu30 {
    public final /* synthetic */ j2i X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ jmb1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ w5w0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ c380 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv11(jmb1 jmb1Var, String str, vu30 vu30Var, w5w0 w5w0Var, boolean z, boolean z2, boolean z3, c380 c380Var, boolean z4, j2i j2iVar, boolean z5, boolean z6, int i) {
        super(2);
        this.b = jmb1Var;
        this.c = str;
        this.d = vu30Var;
        this.e = w5w0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = c380Var;
        this.t = z4;
        this.X = j2iVar;
        this.Y = z5;
        this.Z = z6;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = this.c;
                    if (str == null) {
                        str = "";
                    }
                    u4p1.y(this.b, str, this.d, this.e, this.f, this.g, this.h, this.i, this.t, apo.r(391318094, new j2r0(this.X, (byte) 9), x340Var2), this.Y, this.Z, x340Var2, 805306368);
                }
                break;
            default:
                ((Number) obj2).intValue();
                u4p1.y(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, czo1.p(805306369));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv11(jmb1 jmb1Var, String str, vu30 vu30Var, w5w0 w5w0Var, boolean z, boolean z2, boolean z3, c380 c380Var, boolean z4, boolean z5, boolean z6, j2i j2iVar) {
        super(2);
        this.b = jmb1Var;
        this.c = str;
        this.d = vu30Var;
        this.e = w5w0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = c380Var;
        this.t = z4;
        this.Y = z5;
        this.Z = z6;
        this.X = j2iVar;
    }
}
