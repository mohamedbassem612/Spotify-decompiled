package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c4 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(String str, String str2, qim0 qim0Var) {
        super(2);
        this.a = (byte) 21;
        this.b = str;
        this.c = str2;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        qim0 qim0Var = this.d;
        String str2 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                wro1.a(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                hxo1.b(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                i3p1.a(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                i3p1.b(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                qqn1.a(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                hso1.h(czo1.p(385), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                k4p1.c(czo1.p(385), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                k4p1.f(czo1.p(385), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                zko1.b(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                qhf.c(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                aym.c(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                l4p1.d(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                t8p1.b(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                t8p1.c(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                bs51.a(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                nyn1.b(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 16:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cr31 cr31VarB = er31.b(28.0f);
                    qim0 qim0VarQ = i1p1.q(sto1.o(this.d, 30.0f, cr31VarB, false, 0L, u7h.b(u7h.b, 0.4f, 0.0f, 0.0f, 0.0f, 14), 12), cr31VarB);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var2).a.c, d4o1.a);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    nim0 nim0Var = nim0.a;
                    if (str2 != null) {
                        x340Var2.i0(-1850651151);
                        boolean zG = x340Var2.g(str2);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = Uri.parse(str2);
                            x340Var2.s0(objT);
                        }
                        Uri uri = (Uri) objT;
                        uri.getClass();
                        zov0 zov0Var = cbx.b(x340Var2).g;
                        eso1.e(uri, isl.a, i1p1.q(u291.r(nim0Var, 24.0f), er31.a), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4024);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1850319606);
                        x340Var2.r(false);
                    }
                    lee1 lee1Var = cbx.d(x340Var2).j;
                    long j = cbx.a(x340Var2).b.a;
                    cjc0 cjc0Var = new cjc0(1);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    uwo1.e(this.c, uyn1.z(8.0f, 0.0f, 2, nim0Var), lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1712);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                nyn1.b(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ryn1.d(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                dko1.f(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 20:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG2 = x340Var4.g(str2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = yv91.a(new yt3(str2, (byte) 3));
                        x340Var4.s0(objT2);
                    }
                    eso1.e((Uri) ((tob1) objT2).getValue(), new jsl(str), anm1.N("image", qim0Var), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var4, 1769472, 0, 3992);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    q7f0.a("image-gallery", this.b, this.c, anm1.N("video", qim0Var), (b3k1) null, false, x340Var6, 6, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                zro1.b(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                c921.g(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ajo1.d(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ton1.h(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                m6p1.k(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                ozn1.g(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                kbb.m(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ryn1.h(czo1.p(1), str2, str, (b0k) obj, qim0Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(String str, String str2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(String str, qim0 qim0Var, String str2) {
        super(2);
        this.a = (byte) 20;
        this.b = str;
        this.d = qim0Var;
        this.c = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(String str, qim0 qim0Var, String str2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.d = qim0Var;
        this.c = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(qim0 qim0Var, String str, String str2) {
        super(2);
        this.a = (byte) 16;
        this.d = qim0Var;
        this.b = str;
        this.c = str2;
    }
}
