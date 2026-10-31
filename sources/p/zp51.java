package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zp51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(cua cuaVar, cvx cvxVar, String str, String str2, boolean z, String str3) {
        super(2);
        this.a = (byte) 9;
        this.b = str;
        this.d = str2;
        this.c = z;
        this.e = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        hax haxVar;
        x340 x340Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                wgo1.q((String) obj4, this.c, (lee1) obj3, (cjc0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                puo1.h((tyq) obj3, (String) obj4, this.c, (qim0) obj5, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 2:
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj5;
                ew71 ew71Var = (ew71) obj4;
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ew71 ew71Var2 = (ew71) obj3;
                    boolean z2 = ew71Var == ew71Var2;
                    if (z && ew71Var == ew71Var2) {
                        x340Var3.i0(-1229368275);
                        haxVar = new hax(cwl1.o0(x340Var3, 2131962388));
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(-1229268393);
                        x340Var3.r(false);
                        haxVar = jax.a;
                    }
                    hax haxVar2 = haxVar;
                    nex nexVar = new nex(4);
                    lex lexVarZ = yoo1.z(x340Var3);
                    boolean zG = x340Var3.g(iu30Var) | x340Var3.e(ew71Var.ordinal());
                    Object objT = x340Var3.T();
                    if (zG || objT == fkj0.X) {
                        objT = new c861(iu30Var, ew71Var, (byte) 17);
                        x340Var3.s0(objT);
                    }
                    poo1.g(z2, (iu30) objT, nexVar, lexVarZ, null, 0, null, null, haxVar2, null, null, null, null, false, null, apo.r(-115209838, new dj71(ew71Var, (byte) 7), x340Var3), x340Var3, 0, 196608, 32496);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((zg81) obj4).e(czo1.p(1), (Function0) obj3, (b0k) obj, (qim0) obj5, this.c);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                g0p1.t(this.c, (Long) obj4, (Long) obj3, (Long) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var4 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj3;
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dxo1 dxo1Var = (dxo1) obj4;
                    boolean zG2 = x340Var5.g(function1) | x340Var5.g(function0);
                    Object objT2 = x340Var5.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new o350(function1, function0, (byte) 1);
                        x340Var5.s0(objT2);
                    }
                    lcc.v(dxo1Var, this.c, (Function0) objT2, (Function0) obj5, (qim0) null, x340Var5, 0);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var6 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj5;
                v260 v260Var = (v260) obj3;
                uu0 uu0Var = (uu0) obj4;
                x340 x340Var7 = x340Var6;
                if (!x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var7.b0();
                } else if (z) {
                    x340Var7.i0(309943408);
                    uu0Var.d(v260Var, x340Var7, 8);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(309945933);
                    boolean zI = x340Var7.i(tob1Var);
                    Object objT3 = x340Var7.T();
                    if (zI || objT3 == fkj0.X) {
                        objT3 = new qdd0(tob1Var, (byte) 3);
                        x340Var7.s0(objT3);
                    }
                    qim0 qim0VarX = j9k1.x(nim0Var, (xu30) objT3);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM = x340Var7.m();
                    qim0 qim0VarE = zr7.E(x340Var7, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var7.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var7.m0();
                    if (x340Var7.S) {
                        x340Var7.l(n4kVar);
                    } else {
                        x340Var7.v0();
                    }
                    nko1.H(gfh0VarC, x340Var7, y580.O0);
                    nko1.H(xos0VarM, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE, x340Var7, y580.Y);
                    uu0Var.d(v260Var, x340Var7, 8);
                    x340Var7.r(true);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                x760.o((zff1) obj4, (srt0) obj3, (qim0) obj5, this.c, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                bwp0.d((String) obj4, this.c, (iu30) obj3, (esf1) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var9 = x340Var8;
                if (!x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var9.b0();
                    return rih1Var;
                }
                qim0 qim0VarQ = i1p1.q(u291.d(nim0Var, 1.0f), er31.b(8.0f));
                uwr uwrVar = cbx.a;
                qim0 qim0VarX2 = uyn1.x(dug.f(qim0VarQ, cbx.a(x340Var9).a.c, d4o1.a), 8.0f);
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj5;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var9, 0);
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                qim0 qim0VarE2 = zr7.E(x340Var9, qim0VarX2);
                hzj.A.getClass();
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(mbhVarA, x340Var9, y580.O0);
                nko1.H(xos0VarM2, x340Var9, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var9, y580.R0);
                nko1.F(x340Var9);
                nko1.H(qim0VarE2, x340Var9, y580.Y);
                if (str != null) {
                    x340Var9.i0(200390841);
                    eso1.e(Uri.parse(str), two1.C(2131962251, 0, str2, x340Var9), i1p1.q(d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), z ? er31.a : er31.b(4.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var9, 0, 6, 3064);
                    x340Var = x340Var9;
                    x0d.s(nim0Var, 8.0f, x340Var, false);
                } else {
                    x340Var = x340Var9;
                    x340Var.i0(200948221);
                    x340Var.r(false);
                }
                x340 x340Var10 = x340Var;
                uwo1.e(str2, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var10, 1572864, 0, 1714);
                uwo1.e(str3, null, cbx.d(x340Var10).j, cbx.a(x340Var10).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var10, 1572864, 0, 1714);
                x340Var10.r(true);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                zho1.A(this.c, (String) obj4, (c380) obj3, (bqm) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                ljo1.l(this.c, (c9) obj4, (gj90) obj3, (vu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                fqo1.u(this.c, (yxa0) obj3, (String) obj4, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((qlb) obj3).m((String) obj4, this.c, (ecx) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                oon1.k((vu30) obj4, (tob1) obj3, this.c, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp51(Object obj, boolean z, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = z;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp51(tyq tyqVar, String str, boolean z, Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.d = tyqVar;
        this.b = str;
        this.c = z;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(vu30 vu30Var, tob1 tob1Var, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 14;
        this.b = vu30Var;
        this.d = tob1Var;
        this.c = z;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(ew71 ew71Var, ew71 ew71Var2, boolean z, iu30 iu30Var) {
        super(2);
        this.a = (byte) 2;
        this.b = ew71Var;
        this.d = ew71Var2;
        this.c = z;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(zff1 zff1Var, srt0 srt0Var, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 7;
        this.b = zff1Var;
        this.d = srt0Var;
        this.e = qim0Var;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(dxo1 dxo1Var, boolean z, Function0 function0, Function0 function1) {
        super(2);
        this.a = (byte) 5;
        this.b = dxo1Var;
        this.c = z;
        this.d = function0;
        this.e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp51(boolean z, Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = z;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(boolean z, uu0 uu0Var, v260 v260Var, tob1 tob1Var) {
        super(2);
        this.a = (byte) 6;
        this.c = z;
        this.b = uu0Var;
        this.d = v260Var;
        this.e = tob1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(boolean z, yxa0 yxa0Var, String str, Function0 function0, int i) {
        super(2);
        this.a = (byte) 12;
        this.c = z;
        this.d = yxa0Var;
        this.b = str;
        this.e = function0;
    }
}
