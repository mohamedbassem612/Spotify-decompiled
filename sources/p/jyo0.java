package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jyo0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyo0(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        iu30 iu30Var = (iu30) this.c;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            vms0 vms0Var = (vms0) this.b;
            String str = vms0Var.a;
            cns0 cns0Var = vms0Var.b;
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new g0s0(iu30Var, (byte) 11);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zG2 = x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new g0s0(iu30Var, (byte) 12);
                x340Var2.s0(objT2);
            }
            wro1.v(str, cns0Var, function0, (Function0) objT2, (qim0) null, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        int i;
        iu30 iu30Var;
        boolean z;
        long j;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        byte b2 = 19;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ContextTrack contextTrack = (ContextTrack) obj;
                String str = (String) obj2;
                kyo0 kyo0Var = (kyo0) obj3;
                ArrayList<owo0> arrayList = new ArrayList();
                for (Object obj5 : (Set) obj4) {
                    if (((owo0) obj5).e().equals(rc11.a.b(xxo0.class)) ? ((nl4) kyo0Var.k.b).a() : true) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (owo0 owo0Var : arrayList) {
                    arrayList2.add(new mmr0(owo0Var.e(), owo0Var.d(contextTrack, str)));
                }
                return arrayList2;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                x1p0 x1p0Var = (y1p0) obj4;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (x1p0Var instanceof x1p0) {
                    x340Var2.i0(-1291368002);
                    x1p0 x1p0Var2 = x1p0Var;
                    ns60 ns60Var = x1p0Var2.a;
                    ps60 ps60Var = ns60Var.b;
                    String str2 = ps60Var.b;
                    if (str2 == null) {
                        str2 = ps60Var.a;
                    }
                    String str3 = str2;
                    int i2 = x1p0Var2.b;
                    ps60 ps60Var2 = ns60Var.a;
                    boolean zG = x340Var2.g(iu30Var2);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new tro0(iu30Var2, (byte) 5);
                        x340Var2.s0(objT);
                    }
                    vqo1.d(ps60Var2, str3, i2, (qim0) null, (Function0) objT, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    if (!(x1p0Var instanceof w1p0)) {
                        throw p3d1.k(x340Var2, 373983312, false);
                    }
                    x340Var2.i0(-1290935180);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                boolean zY = b0kVar2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                j06 j06Var = ((x340) b0kVar2).a;
                if (zY) {
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var2, 1.0f);
                    w9p0 w9p0Var = (w9p0) obj4;
                    iu30 iu30Var3 = (iu30) obj3;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM = b0kVar2.m();
                    qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, b0kVar2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, b0kVar2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, b0kVar2, lljVar3);
                    nko1.F(b0kVar2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, b0kVar2, lljVar4);
                    Object objT2 = b0kVar2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        objT2 = pzm.i(b0kVar2);
                    }
                    lz20 lz20Var = (lz20) objT2;
                    boolean z2 = w9p0Var.d;
                    int i3 = w9p0Var.f;
                    boolean z3 = w9p0Var.N0;
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    boolean zG2 = b0kVar2.g(w9p0Var) | b0kVar2.i(lz20Var);
                    Object objT3 = b0kVar2.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new e3p0(w9p0Var, lz20Var, (lnm) null, (byte) 1);
                        b0kVar2.s0(objT3);
                    }
                    qxd0.t(boolValueOf, b0kVar2, (vu30) objT3);
                    era eraVar = een.P0;
                    mbh mbhVarA = jbh.a(h36.f, eraVar, b0kVar2, 0);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM2 = b0kVar2.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar2, nim0Var2);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA, b0kVar2, lljVar);
                    nko1.H(xos0VarM2, b0kVar2, lljVar2);
                    x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                    nko1.H(qim0VarE2, b0kVar2, lljVar4);
                    fra fraVar = een.N0;
                    gex0 gex0Var = h36.a;
                    jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar2, 0);
                    int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM3 = b0kVar2.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar2, nim0Var2);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(jw31VarA, b0kVar2, lljVar);
                    nko1.H(xos0VarM3, b0kVar2, lljVar2);
                    x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                    nko1.H(qim0VarE3, b0kVar2, lljVar4);
                    String str4 = w9p0Var.g;
                    Uri uri = str4 != null ? Uri.parse(str4) : null;
                    if (uri == null) {
                        b0kVar2.i0(1963876455);
                        i = 0;
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(1963876456);
                        Object objT4 = b0kVar2.T();
                        if (objT4 == m4cVar) {
                            objT4 = pzo0.P0;
                            b0kVar2.s0(objT4);
                        }
                        cwl1.f(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT4, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 384, 126974), (String) null, i1p1.q(u291.u(nim0Var2, 0.0f, 0.0f, 116.0f, 116.0f, 3), er31.b(24.0f)), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
                        b0kVar2 = b0kVar2;
                        i = 0;
                        b0kVar2.r(false);
                    }
                    qim0 qim0VarB = uyn1.B(nim0Var2, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, i);
                    int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM4 = b0kVar2.m();
                    qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarB);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA2, b0kVar2, lljVar);
                    nko1.H(xos0VarM4, b0kVar2, lljVar2);
                    x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
                    nko1.H(qim0VarE4, b0kVar2, lljVar4);
                    b0k b0kVar3 = b0kVar2;
                    r9e1.a(w9p0Var.b, (qim0) null, 0L, fc11.G(32), (FontWeight) null, 0L, 0, 0L, 0, false, 2, 0, (iu30) null, (lee1) null, b0kVar3, 0, 24576, 245742);
                    r9e1.a(w9p0Var.c, (qim0) null, 0L, fc11.G(20), (FontWeight) null, 0L, 0, 0L, 0, false, 1, 0, (iu30) null, (lee1) null, b0kVar3, 0, 24576, 245742);
                    b0kVar3.r(true);
                    b0kVar3.r(true);
                    obg1.j(w9p0Var.h, w9p0Var.i, w9p0Var.t, w9p0Var.X, w9p0Var.e, uyn1.z(0.0f, 16.0f, 1, u291.f(nim0Var2, 1.0f)), b0kVar3, 0);
                    boolean z4 = i3 == 2;
                    qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                    jw31 jw31VarA2 = ew31.a(gex0Var, een.Z, b0kVar3, 0);
                    int iHashCode5 = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM5 = b0kVar3.m();
                    qim0 qim0VarE5 = zr7.E(b0kVar3, qim0VarF);
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(n4kVar);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(jw31VarA2, b0kVar3, lljVar);
                    nko1.H(xos0VarM5, b0kVar3, lljVar2);
                    x0d.q(iHashCode5, b0kVar3, lljVar3, b0kVar3);
                    nko1.H(qim0VarE5, b0kVar3, lljVar4);
                    if (z4) {
                        b0kVar3.i0(711769742);
                        b180 b180Var = qkm1.f;
                        boolean z5 = !z3;
                        boolean zG3 = b0kVar3.g(iu30Var);
                        Object objT5 = b0kVar3.T();
                        if (zG3 || objT5 == m4cVar) {
                            iu30Var = iu30Var3;
                            objT5 = new tro0(iu30Var, (byte) 8);
                            b0kVar3.s0(objT5);
                        }
                        epo1.v(b180Var, z5, (Function0) objT5, b0kVar3, 0);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(711996011);
                        b180 b180Var2 = qkm1.d;
                        if (!w9p0Var.Y || z3 == 0) {
                            iu30Var = iu30Var3;
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zG4 = b0kVar3.g(iu30Var);
                        Object objT6 = b0kVar3.T();
                        if (zG4 || objT6 == m4cVar) {
                            objT6 = new tro0(iu30Var, (byte) 9);
                            b0kVar3.s0(objT6);
                        }
                        epo1.v(b180Var2, z, (Function0) objT6, b0kVar3, 0);
                        b0kVar3.r(false);
                    }
                    op71.g(b0kVar3, u291.r(nim0Var2, 8.0f));
                    boolean zG5 = b0kVar3.g(w9p0Var) | b0kVar3.g(iu30Var);
                    Object objT7 = b0kVar3.T();
                    if (zG5 || objT7 == m4cVar) {
                        objT7 = new w7p0(w9p0Var, iu30Var, (byte) 1);
                        b0kVar3.s0(objT7);
                    }
                    Function0 function0 = (Function0) objT7;
                    boolean zH = b0kVar3.h(z4) | b0kVar3.g(iu30Var);
                    Object objT8 = b0kVar3.T();
                    if (zH || objT8 == m4cVar) {
                        objT8 = new z20(z4, iu30Var, (byte) 21);
                        b0kVar3.s0(objT8);
                    }
                    Function0 function1 = (Function0) objT8;
                    boolean zH2 = b0kVar3.h(z4) | b0kVar3.g(iu30Var);
                    Object objT9 = b0kVar3.T();
                    if (zH2 || objT9 == m4cVar) {
                        objT9 = new z20(z4, iu30Var, (byte) 22);
                        b0kVar3.s0(objT9);
                    }
                    epo1.o(0, y7y0.M(function0, function1, (Function0) objT9, b0kVar3), b0kVar3, vby0.p(nim0Var2, lz20Var), w9p0Var.e, w9p0Var.d);
                    op71.g(b0kVar3, u291.r(nim0Var2, 8.0f));
                    if (z4) {
                        b0kVar3.i0(713261896);
                        b180 b180Var3 = qkm1.g;
                        boolean z6 = !z3;
                        boolean zG6 = b0kVar3.g(iu30Var);
                        Object objT10 = b0kVar3.T();
                        if (zG6 || objT10 == m4cVar) {
                            objT10 = new tro0(iu30Var, (byte) 10);
                            b0kVar3.s0(objT10);
                        }
                        epo1.v(b180Var3, z6, (Function0) objT10, b0kVar3, 0);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(713492753);
                        b180 b180Var4 = qkm1.c;
                        boolean z7 = !w9p0Var.Z;
                        boolean zG7 = b0kVar3.g(iu30Var);
                        Object objT11 = b0kVar3.T();
                        if (zG7 || objT11 == m4cVar) {
                            objT11 = new tro0(iu30Var, (byte) 11);
                            b0kVar3.s0(objT11);
                        }
                        epo1.v(b180Var4, z7, (Function0) objT11, b0kVar3, 0);
                        b0kVar3.r(false);
                    }
                    if (i3 == 1) {
                        b0kVar3.i0(713765956);
                        op71.g(b0kVar3, new wnb0(1.0f, true));
                        boolean z8 = w9p0Var.O0;
                        boolean zG8 = b0kVar3.g(iu30Var);
                        Object objT12 = b0kVar3.T();
                        if (zG8 || objT12 == m4cVar) {
                            objT12 = new tro0(iu30Var, (byte) 12);
                            b0kVar3.s0(objT12);
                        }
                        qpn1.e((Function0) objT12, (qim0) null, z8, m4j.a, b0kVar3, 3072, 2);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(714018699);
                        b0kVar3.r(false);
                    }
                    us71.m(b0kVar3, true, true, true);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g471 g471Var = (g471) obj4;
                    kmp0 kmp0Var = (kmp0) obj3;
                    q571 q571Var = new q571(g471Var.e(), g471Var.d(), kmp0Var.b, kmp0Var.c, kmp0Var.e);
                    uwr uwrVar = cbx.a;
                    nyo1.i(q571Var, u291.v(nim0Var, if71.b), cbx.d(x340Var4).j, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj3;
                eop0 eop0Var = (fop0) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    eop0 eop0Var2 = eop0Var;
                    phm0 phm0Var = new phm0(cwl1.o0(x340Var6, 2131959313), eop0Var2.a, eop0Var2.b, cwl1.o0(x340Var6, 2131959312), false, eop0Var2.d, 1);
                    qim0 qim0VarN = anm1.N("offline_available_songs_ui", nim0Var);
                    boolean zG9 = x340Var6.g(iu30Var4);
                    Object objT13 = x340Var6.T();
                    if (zG9 || objT13 == fkj0.X) {
                        objT13 = new tro0(iu30Var4, b2);
                        x340Var6.s0(objT13);
                    }
                    xto1.l(phm0Var, qim0VarN, (Function0) objT13, x340Var6, 8);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((doe) obj4).e((List) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    jap1.l(uyn1.z(0.0f, 8.0f, 1, qim0VarF2), (qim0) null, ((Resources) ((et90) obj4).c).getString(2131959334), ((hrp0) obj3).a, (String) null, (gbx) null, (yf) null, (vu30) null, x340Var8, 0, 498);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                z72 z72Var = (z72) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zrp0 zrp0Var = (zrp0) obj4;
                    String str5 = zrp0Var.a;
                    String str6 = zrp0Var.b;
                    hux huxVar = zrp0Var.c;
                    c380 c380Var = zrp0Var.d;
                    boolean zI = x340Var10.i(z72Var);
                    Object objT14 = x340Var10.T();
                    if (zI || objT14 == m4cVar2) {
                        objT14 = new asp0(z72Var, (byte) 0);
                        x340Var10.s0(objT14);
                    }
                    Function0 function2 = (Function0) objT14;
                    boolean zI2 = x340Var10.i(z72Var);
                    Object objT15 = x340Var10.T();
                    if (zI2 || objT15 == m4cVar2) {
                        objT15 = new asp0(z72Var, (byte) 1);
                        x340Var10.s0(objT15);
                    }
                    xap1.g(str5, str6, huxVar, c380Var, function2, (Function0) objT15, (qim0) null, x340Var10, 512);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    hux huxVarI = c1q0.i((e0q0) obj4, (j82) obj3);
                    if (huxVarI != null) {
                        x340Var12.i0(-1484866951);
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var12).g;
                        c1q0.c(huxVarI, 24.0f, x340Var12, 8);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(-1484770696);
                        uwr uwrVar4 = cbx.a;
                        xto1.e((qim0) null, 0, cbx.a(x340Var12).b.a, 0L, x340Var12, 0, 11);
                        x340Var12.r(false);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nim0 nim0Var3 = nim0.a;
                    qim0 qim0VarF3 = u291.f(nim0Var3, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarA = uyn1.A(x0d.p(lhc.g(x340Var14).g, 32, qim0VarF3), 24.0f, 32.0f, 24.0f, 40.0f);
                    Context context = (Context) obj4;
                    u2q0 u2q0Var = (u2q0) obj3;
                    mbh mbhVarA3 = jbh.a(f36Var, een.Q0, x340Var14, 0);
                    int iHashCode6 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM6 = x340Var14.m();
                    qim0 qim0VarE6 = zr7.E(x340Var14, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(mbhVarA3, x340Var14, y580.O0);
                    nko1.H(xos0VarM6, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode6), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE6, x340Var14, y580.Y);
                    String strO0 = cwl1.o0(x340Var14, 2131959397);
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(strO0, uyn1.B(nim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(x340Var14).d, cbx.a(x340Var14).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2016);
                    Resources resources = context.getResources();
                    int i4 = u2q0Var.Z1;
                    uwo1.e(resources.getQuantityString(2131820778, i4, Integer.valueOf(i4)), uyn1.B(nim0Var3, 16.0f, 0.0f, 16.0f, 32.0f, 2), cbx.d(x340Var14).g, cbx.a(x340Var14).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2016);
                    idx idxVar = new idx(4);
                    boolean zI3 = x340Var14.i(u2q0Var);
                    Object objT16 = x340Var14.T();
                    if (zI3 || objT16 == m4cVar3) {
                        objT16 = new t2q0(u2q0Var, (byte) 0);
                        x340Var14.s0(objT16);
                    }
                    z50 z50Var = z50.c;
                    foo1.c(new gbx(z50Var, (Function0) objT16), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, u4j.a, x340Var14, 0, 48, 2044);
                    op71.g(x340Var14, u291.h(nim0Var3, 8.0f));
                    ldx ldxVar = ldx.c;
                    boolean zI4 = x340Var14.i(u2q0Var);
                    Object objT17 = x340Var14.T();
                    if (zI4 || objT17 == m4cVar3) {
                        objT17 = new t2q0(u2q0Var, (byte) 1);
                        x340Var14.s0(objT17);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT17), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, u4j.b, x340Var14, 0, 48, 2044);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((u2q0) obj4).n1((xtj) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 11:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    hux huxVar2 = (hux) obj4;
                    if (((Boolean) obj3).booleanValue()) {
                        x340Var16.i0(1808988263);
                        uwr uwrVar6 = cbx.a;
                        j = cbx.a(x340Var16).c.c;
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(1808990175);
                        uwr uwrVar7 = cbx.a;
                        j = cbx.a(x340Var16).c.a;
                        x340Var16.r(false);
                    }
                    w0h1.a(huxVar2, isl.a, (qim0) null, j, 0L, false, x340Var16, 56, 52);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj3;
                m4c m4cVar4 = fkj0.X;
                rhq0 rhq0Var = (rhq0) obj4;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zI5 = x340Var18.i(rhq0Var) | x340Var18.g(iu30Var5);
                    Object objT18 = x340Var18.T();
                    if (zI5 || objT18 == m4cVar4) {
                        objT18 = new shq0(rhq0Var, iu30Var5, (byte) 0);
                        x340Var18.s0(objT18);
                    }
                    Function0 function3 = (Function0) objT18;
                    int iC = l1d.C(rhq0Var.e);
                    if (iC == 0) {
                        x340Var18.i0(592118618);
                        boolean zG10 = x340Var18.g(function3);
                        Object objT19 = x340Var18.T();
                        if (zG10 || objT19 == m4cVar4) {
                            objT19 = new kek0(function3, (byte) 23);
                            x340Var18.s0(objT19);
                        }
                        rwq0.k(rhq0Var, (qim0) null, (Function0) objT19, x340Var18, 0);
                        x340Var18.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var18, 592117378, false);
                        }
                        x340Var18.i0(592122113);
                        String str7 = rhq0Var.a;
                        String str8 = rhq0Var.d;
                        String strW = str8 != null ? nhc1.W(str8, "{0}", str7) : str7;
                        String str9 = rhq0Var.f;
                        ohq0 ohq0Var = rhq0Var.b;
                        ohq0 ohq0Var2 = ohq0Var instanceof ohq0 ? ohq0Var : null;
                        String str10 = ohq0Var2 != null ? ohq0Var2.a : null;
                        boolean zG11 = x340Var18.g(function3);
                        Object objT20 = x340Var18.T();
                        if (zG11 || objT20 == m4cVar4) {
                            objT20 = new kek0(function3, (byte) 24);
                            x340Var18.s0(objT20);
                        }
                        y2o1.d(str7, strW, str9, str10, (Function0) objT20, (qim0) null, x340Var18, 0);
                        x340Var18.r(false);
                    }
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((nu) obj4).e((String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qsw.c(new obk1((View) obj4), apo.r(2059156798, new sjr((cxb) obj3, (byte) 1), x340Var20), x340Var20, 48);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ((j2i) obj4).invoke(((kwq0) obj3).b, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                fdg1.j((mwq0) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 17:
                x340 x340Var23 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                q7r0 q7r0Var = (q7r0) obj4;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zI6 = x340Var24.i(q7r0Var);
                    Object objT21 = x340Var24.T();
                    if (zI6 || objT21 == fkj0.X) {
                        objT21 = new qa2(q7r0Var, (byte) 19);
                        x340Var24.s0(objT21);
                    }
                    k2r0.b((Function0) objT21, apo.r(-63728066, new j2r0((j2i) obj3, (byte) 0), x340Var24), x340Var24, 48);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                k2r0.a((cir0) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                cpn1.e((jkr0) obj4, (qim0) obj3, (b0k) obj, czo1.p(28081));
                return rih1Var;
            case 20:
                x340 x340Var25 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    p8r0 p8r0Var = (p8r0) obj4;
                    p8r0Var.d.a(p8r0Var.e.a, apo.r(-1326834995, new wh(p8r0Var, (hx60) obj3, (byte) 21), x340Var26), x340Var26, 48);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                b3o1.d((String) obj4, (wux) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                eio1.i((str0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((ywr0) obj4).e((xwr0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((cxr0) obj4).f((bxr0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                mmo1.r((uyr0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                bno1.e((zmo1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                x340 x340Var27 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                qbs0 qbs0Var = (qbs0) obj4;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    nyx.a(0, (wux) null, apo.r(-1890396130, new obs0(qbs0Var, (ComposeView) obj3, b2p1.B(qbs0Var.Z0().b, qbs0Var.Z0().V(), x340Var28, 0), (byte) 1), x340Var28), x340Var28, 3072, 7);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 28:
                return a(obj, obj2);
            default:
                x340 x340Var29 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    otw.c((hz5) obj4, new rrs0((Function0) obj3), (qim0) null, (ipb1) null, x340Var30, 0, 12);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyo0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
