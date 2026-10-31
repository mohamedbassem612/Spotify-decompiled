package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cp9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp9(String str, hux huxVar) {
        super(2);
        this.a = (byte) 7;
        this.c = str;
        this.b = huxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        String str = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a(this.b, new jsl(str), (qim0) null, 0L, 0L, false, x340Var2, 8, 60);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w0h1.a(this.b, new jsl(str), (qim0) null, 0L, 0L, false, x340Var4, 8, 60);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    w0h1.a(this.b, new jsl(str), (qim0) null, 0L, 0L, false, x340Var6, 8, 60);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    w0h1.a(this.b, new jsl(str), (qim0) null, 0L, 0L, false, x340Var8, 8, 60);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    jsl jslVar = new jsl(str);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var10).g;
                    w0h1.a(this.b, jslVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var10).b.b, 0L, false, x340Var10, 8, 48);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fra fraVar = een.N0;
                    jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var12, 0);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var12, nim0Var2);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(hmb0.t1);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(jw31VarA, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var12).b;
                    qim0 qim0VarB = uyn1.B(nim0Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    zov0 zov0Var2 = cbx.b(x340Var12).g;
                    w0h1.a(this.b, isl.a, u291.r(qim0VarB, 16.0f).then(new i5j1(fraVar)), cbx.a(x340Var12).b.a, 0L, false, x340Var12, 56, 48);
                    uwo1.e(this.c, anm1.N("labeled.tool.button.label", nim0Var2), cbx.d(x340Var12).k, cbx.a(x340Var12).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var12, 0, 0, 1712);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    w0h1.a(this.b, new jsl(str), (qim0) null, 0L, 0L, false, x340Var14, 8, 60);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            default:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    jsl jslVar2 = new jsl(str);
                    uwr uwrVar3 = cbx.a;
                    long j = cbx.a(x340Var16).b.a;
                    zov0 zov0Var3 = cbx.b(x340Var16).g;
                    w0h1.a(this.b, jslVar2, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var16, 8, 48);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp9(hux huxVar, String str, byte b) {
        super(2);
        this.a = b;
        this.b = huxVar;
        this.c = str;
    }
}
