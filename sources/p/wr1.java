package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wr1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(q880 q880Var, boolean z, j2i j2iVar, vg41 vg41Var, iu30 iu30Var, ji41 ji41Var) {
        super(2);
        this.a = (byte) 12;
        this.c = q880Var;
        this.b = z;
        this.d = j2iVar;
        this.e = vg41Var;
        this.f = iu30Var;
        this.g = ji41Var;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final Object invoke(Object obj, Object obj2) {
        mmr0 m231Var;
        dgx0 cgx0Var;
        byte b = this.a;
        qim0 qim0VarF = nim0.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                w8p1.g(this.b, (y7e1) obj7, (xtb0) obj6, (String) obj5, (q01) obj4, (bx1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                o2p1.a((c380) obj7, (j2i) obj6, (Function0) obj5, this.b, (qim0) obj4, (u7h) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                mqo1.f((String) obj5, (jwm) obj7, this.b, (c380) obj6, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                qyo1.f((ArrayList) obj7, (String) obj5, this.b, (iu30) obj6, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj6;
                m4c m4cVar = fkj0.X;
                String str = (String) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("CollapsibleSectionHeading", u291.f(qim0VarF, 1.0f));
                    boolean zG = x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new irf(str, (byte) 9);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                    String str2 = (String) obj7;
                    boolean zG2 = x340Var2.g(function0);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new ukf(function0, (byte) 20);
                        x340Var2.s0(objT2);
                    }
                    cwl1.b(qim0VarB, (tl3) null, d4o1.a, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str2), (Function0) objT2), (gbx) null, apo.r(-2034907610, new o3(obj4, z, obj3, (byte) 8), x340Var2), x340Var2, 0, 48, 1514);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                aqo1.g((Uri) obj6, (y7e1) obj7, (lz20) obj5, (Function0) obj4, this.b, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                dro.g((String) obj5, (b4v0) obj7, this.b, (qim0) obj6, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                pxd0.q((y7e1) obj7, (String) obj5, this.b, (iu30) obj6, (zeu) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                kqn1.f((String) obj5, (vzq0) obj7, (qim0) obj6, this.b, (Function0) obj4, (j2i) obj3, (b0k) obj, czo1.p(196609));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                mth1.g((lzn0) obj7, (lik1) obj6, (lik1) obj5, this.b, (lc20) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((nhc) obj7).h((td10) obj6, this.b, (Function0) obj5, (qim0) obj4, (es41) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                n1p1.d(this.b, (j2i) obj7, (qim0) obj6, (j2i) obj5, (j2i) obj4, (j2i) obj3, (b0k) obj, czo1.p(224305));
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q880 q880Var = (q880) obj7;
                    a4d a4dVar = q880Var.e;
                    j2i j2iVar = z ? psi.a : (j2i) obj6;
                    vg41 vg41Var = (vg41) obj5;
                    j2i j2iVarR = apo.r(1724943375, new o880(q880Var, (ji41) obj3), x340Var4);
                    boolean zG3 = x340Var4.g(iu30Var);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == m4cVar2) {
                        objT3 = new u460(iu30Var, (byte) 27);
                        x340Var4.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zG4 = x340Var4.g(iu30Var);
                    Object objT4 = x340Var4.T();
                    if (zG4 || objT4 == m4cVar2) {
                        objT4 = new bv70(iu30Var, (byte) 1);
                        x340Var4.s0(objT4);
                    }
                    otw.c(a4dVar, new w3d(vg41Var, (v3d) null, j2iVarR, function1, (iu30) objT4, j2iVar, this.b, false, 290), (qim0) null, (ipb1) null, x340Var4, 72, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                x2g0.l((nkf0) obj7, (String) obj5, (String) obj6, this.b, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(196609));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                r4o1.v((String) obj5, (ItemAlternative) obj7, this.b, (p410) obj6, (String) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                two1.m(this.b, (String) obj5, (c380) obj7, (bqm) obj6, (znb0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                s1p1.h(this.b, (iu30) obj7, (jgx) obj6, (qim0) obj5, (pgx) obj4, (vu30) obj3, (b0k) obj, czo1.p(196609));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                c1q0.d((e0q0) obj7, (Function0) obj6, (String) obj5, (Function0) obj4, (j82) obj3, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                c680.k((String) obj5, (String) obj7, this.b, (Boolean) obj6, (p8q0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                bpo1.h(this.b, (String) obj5, (String) obj7, (vu30) obj6, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                iac0 iac0Var = (iac0) obj2;
                w2c1 w2c1Var = (y1c1) obj5;
                epb1 epb1Var = new epb1((zob1) obj);
                ms11 ms11Var = (ms11) obj7;
                e50 e50Var = ms11Var.e;
                vtw vtwVarX = e50Var != null ? two1.x(e50Var, epb1Var, iac0Var) : null;
                e50 e50Var2 = ms11Var.f;
                vtw vtwVarX2 = e50Var2 != null ? two1.x(e50Var2, epb1Var, iac0Var) : null;
                e50 e50Var3 = ms11Var.a;
                vtw vtwVarX3 = e50Var3 != null ? two1.x(e50Var3, epb1Var, iac0Var) : null;
                e50 e50Var4 = ms11Var.b;
                vtw vtwVarX4 = e50Var4 != null ? two1.x(e50Var4, epb1Var, iac0Var) : null;
                e50 e50Var5 = ms11Var.c;
                vtw vtwVarX5 = e50Var5 != null ? two1.x(e50Var5, epb1Var, iac0Var) : null;
                e50 e50Var6 = ms11Var.d;
                vtw vtwVarX6 = e50Var6 != null ? two1.x(e50Var6, epb1Var, iac0Var) : null;
                yt11 yt11Var = ms11Var.g;
                uxy0 uxy0Var = new uxy0((w3l0) obj6, ms11Var, (byte) 17);
                em0 em0Var = new em0(new lh2(3, (w6g1) ms11Var.l.d, w6g1.class, "extractTraits", "extractTraits(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Ljava/lang/Object;", 0, (byte) 17), epb1Var, ms11Var.i, ms11Var.j, ms11Var.r, ms11Var.s, new dmo0(w2c1Var, (byte) 2), ms11Var.m, ms11Var.t, ms11Var.u, 8);
                boolean z2 = ms11Var.o;
                mka mkaVar = ms11Var.k;
                int iG = k4p1.G(ms11Var.y);
                int i = ms11Var.z;
                ppc1 ppc1Var = ms11Var.n;
                boolean z3 = ms11Var.p;
                try {
                    m231Var = w2c1Var.V(whx0.class);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                pwn pwnVar = !(m231Var instanceof m231) ? new pwn(w2c1Var, iac0Var, (byte) 1) : null;
                zob1 zob1Var = pwnVar != null ? (zob1) pwnVar.invoke() : null;
                if (zob1Var == null) {
                    cgx0Var = dgx0.a;
                } else {
                    cgx0Var = z3 ? new cgx0(zob1Var) : new agx0(zob1Var);
                }
                return new jpg0(zsc.j((zsc) obj4, em0Var, mkaVar, iG, this.b, vtwVarX, vtwVarX2, vtwVarX3, vtwVarX4, vtwVarX5, vtwVarX6, yt11Var, uxy0Var, (toc) obj3, z2, 0, ms11Var.p, ppc1Var, ms11Var.v, ms11Var.q, ms11Var.w, cgx0Var, i, 1214152736), br11.Z0);
            case 21:
                ((Number) obj2).intValue();
                u4p1.u((String) obj5, (n6u) obj7, this.b, (u37) obj6, (o27) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                vnr0 vnr0Var = (vnr0) obj7;
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (z) {
                        qim0VarF = u291.f(qim0VarF, 1.0f);
                    }
                    qim0 qim0Var = qim0VarF;
                    if (vnr0Var == null) {
                        x340Var6.i0(-1115577658);
                        iec iecVar = (iec) obj6;
                        uwo1.e((((Boolean) ((ven0) obj3).getValue()).booleanValue() ? iecVar.a : iecVar.b).a, qim0Var, ((gdx) obj5).f, 0L, new a0e1(3), null, 2, false, (djc0) obj4, 0, null, x340Var6, 1572864, 0, 1704);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-1115219577);
                        a0e1 a0e1Var = vnr0Var.e;
                        qgo1.f(vnr0Var, qim0Var, new a0e1(a0e1Var != null ? a0e1Var.a : 3), 0, false, null, x340Var6, 8, 56);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                y2o1.i((dwz0) obj7, this.b, (iyr0) obj6, (d0r) obj5, (sjq0) obj4, (vb1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                b3o1.l(this.b, (String) obj5, (String) obj7, (Function0) obj6, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                vno1.e((String) obj5, (rb61) obj7, (qim0) obj6, this.b, (hux) obj4, (Function0) obj3, (b0k) obj, czo1.p(32769));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                yxo1.k((String) obj5, (String) obj7, (Uri) obj6, (Float) obj4, this.b, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                lfe1.a((String) obj5, (String) obj7, (String) obj6, (qim0) obj4, this.b, (vu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((ce6) obj7).f((c380) obj6, this.b, (Integer) obj5, (iu30) obj4, (Function0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                nln.o((p8f1) obj7, (vu30) obj6, (qim0) obj5, (vu30) obj4, (iu30) obj3, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(Object obj, String str, boolean z, iu30 iu30Var, Object obj2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.e = str;
        this.b = z;
        this.d = iu30Var;
        this.f = obj2;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(Object obj, cv30 cv30Var, Object obj2, cv30 cv30Var2, Object obj3, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = cv30Var;
        this.e = obj2;
        this.f = cv30Var2;
        this.g = obj3;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(String str, Object obj, qim0 qim0Var, boolean z, Object obj2, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.e = str;
        this.c = obj;
        this.d = qim0Var;
        this.b = z;
        this.f = obj2;
        this.g = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(String str, Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.e = str;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(String str, String str2, Comparable comparable, Object obj, boolean z, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.e = str;
        this.c = str2;
        this.d = comparable;
        this.f = obj;
        this.b = z;
        this.g = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(String str, String str2, Function0 function0, String str3, boolean z, Integer num) {
        super(2);
        this.a = (byte) 4;
        this.e = str;
        this.c = str2;
        this.d = function0;
        this.f = str3;
        this.b = z;
        this.g = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(Uri uri, y7e1 y7e1Var, lz20 lz20Var, Function0 function0, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.d = uri;
        this.c = y7e1Var;
        this.e = lz20Var;
        this.f = function0;
        this.b = z;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(nkf0 nkf0Var, String str, String str2, boolean z, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 13;
        this.c = nkf0Var;
        this.e = str;
        this.d = str2;
        this.b = z;
        this.f = iu30Var;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(dwz0 dwz0Var, boolean z, iyr0 iyr0Var, d0r d0rVar, sjq0 sjq0Var, vb1 vb1Var, int i) {
        super(2);
        this.a = (byte) 23;
        this.c = dwz0Var;
        this.b = z;
        this.d = iyr0Var;
        this.e = d0rVar;
        this.f = sjq0Var;
        this.g = vb1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(ms11 ms11Var, w3l0 w3l0Var, y1c1 y1c1Var, zsc zscVar, boolean z, toc tocVar) {
        super(2);
        this.a = (byte) 20;
        this.c = ms11Var;
        this.d = w3l0Var;
        this.e = y1c1Var;
        this.f = zscVar;
        this.b = z;
        this.g = tocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(boolean z, Object obj, Object obj2, Object obj3, Object obj4, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(boolean z, String str, Object obj, Object obj2, Object obj3, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.e = str;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(boolean z, vnr0 vnr0Var, iec iecVar, gdx gdxVar, djc0 djc0Var, ven0 ven0Var) {
        super(2);
        this.a = (byte) 22;
        this.b = z;
        this.c = vnr0Var;
        this.d = iecVar;
        this.e = gdxVar;
        this.f = djc0Var;
        this.g = ven0Var;
    }
}
