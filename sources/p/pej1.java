package p;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pej1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pej1(g2z g2zVar, zej1 zej1Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 1;
        this.c = g2zVar;
        this.b = zej1Var;
        this.d = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027a  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:113:0x030d  */
    /* JADX WARN: Code duplicated, block: B:117:0x032f  */
    /* JADX WARN: Code duplicated, block: B:121:0x034d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0367  */
    /* JADX WARN: Code duplicated, block: B:129:0x037e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0397  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:192:0x0517  */
    /* JADX WARN: Code duplicated, block: B:195:0x0535  */
    /* JADX WARN: Code duplicated, block: B:196:0x053c  */
    /* JADX WARN: Code duplicated, block: B:201:0x054f  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:74:0x0205  */
    /* JADX WARN: Code duplicated, block: B:77:0x0212  */
    /* JADX WARN: Code duplicated, block: B:78:0x0217  */
    /* JADX WARN: Code duplicated, block: B:81:0x021d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0229  */
    /* JADX WARN: Code duplicated, block: B:84:0x022b A[PHI: r15
      0x022b: PHI (r15v27 p.xz7) = (r15v26 p.xz7), (r15v40 p.xz7) binds: [B:80:0x021b, B:83:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x022e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0234  */
    /* JADX WARN: Code duplicated, block: B:90:0x0240  */
    /* JADX WARN: Code duplicated, block: B:91:0x0242 A[PHI: r15
      0x0242: PHI (r15v29 p.g08) = (r15v28 p.g08), (r15v36 p.g08) binds: [B:87:0x0232, B:90:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0245  */
    /* JADX WARN: Code duplicated, block: B:98:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x025d  */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Integer num;
        boolean z;
        boolean zI;
        Object objT;
        StoryCard storyCard;
        String id;
        boolean z2;
        tob1 tob1Var;
        Integer num2;
        boolean z3;
        tob1 tob1VarH;
        bal1 bal1Var;
        z9l1 z9l1Var;
        boolean z4;
        tob1 tob1VarH2;
        String str2;
        boolean z5;
        sju sjuVarA;
        String str3;
        sju sjuVarA2;
        String str4;
        xz7 xz7Var;
        xz7 xz7Var2;
        g08 g08Var;
        g08 g08Var2;
        boolean zG;
        Object objT2;
        ven0 ven0VarG;
        qk1 qk1Var;
        Object objT3;
        c9n c9nVar;
        boolean zG2;
        Object objT4;
        boolean zH;
        Object objT5;
        boolean zI2;
        Object objT6;
        boolean zI3;
        Object objT7;
        boolean zI4;
        Object objT8;
        boolean zI5;
        Object objT9;
        StoryCard storyCard2;
        String id2;
        boolean z6;
        sju sjuVarA3;
        sju sjuVarA4;
        StoryCard storyCard3;
        String id3;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        byte b2 = 6;
        t8l1 t8l1Var = t8l1.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qej1.b((zej1) obj4, (Function0) obj5, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                g2z g2zVar = (g2z) obj5;
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                zej1 zej1Var = (zej1) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str5 = ((gn10) g2zVar.b).a;
                    boolean zI6 = x340Var2.i(g2zVar);
                    Object objT10 = x340Var2.T();
                    if (zI6 || objT10 == m4cVar) {
                        objT10 = new dch1(g2zVar, (byte) 18);
                        x340Var2.s0(objT10);
                    }
                    Function0 function0 = (Function0) objT10;
                    boolean zG3 = x340Var2.g(iu30Var) | x340Var2.i(zej1Var);
                    Object objT11 = x340Var2.T();
                    if (zG3 || objT11 == m4cVar) {
                        objT11 = new nfj1(iu30Var, zej1Var, (byte) 0);
                        x340Var2.s0(objT11);
                    }
                    Function0 function1 = (Function0) objT11;
                    boolean zG4 = x340Var2.g(iu30Var) | x340Var2.i(zej1Var);
                    Object objT12 = x340Var2.T();
                    if (zG4 || objT12 == m4cVar) {
                        objT12 = new nfj1(iu30Var, zej1Var, (byte) 1);
                        x340Var2.s0(objT12);
                    }
                    Function0 function2 = (Function0) objT12;
                    boolean zG5 = x340Var2.g(iu30Var) | x340Var2.i(zej1Var);
                    Object objT13 = x340Var2.T();
                    if (zG5 || objT13 == m4cVar) {
                        objT13 = new nfj1(iu30Var, zej1Var, (byte) 2);
                        x340Var2.s0(objT13);
                    }
                    Function0 function3 = (Function0) objT13;
                    j2i j2iVarR = apo.r(-1185939669, new eii1(zej1Var, g2zVar, (byte) 10), x340Var2);
                    Object objT14 = x340Var2.T();
                    if (objT14 == m4cVar) {
                        objT14 = l6j1.W0;
                        x340Var2.s0(objT14);
                    }
                    qej1.l(zej1Var, function0, str5, function1, function2, function3, null, j2iVarR, (iu30) objT14, x340Var2, 113246208);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qij1 qij1Var = (qij1) obj4;
                    b2p1.t(qij1Var, (qim0) obj5, apo.r(-628729949, new eii1((xwa) obj3, qij1Var, (byte) 11), x340Var4), x340Var4, 384, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                c2p1.m(iP, (b0k) obj, (iu30) obj3, (qim0) obj5, (adj1) obj4);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                i3p1.n((l090) obj4, (Function0) obj5, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarR = u291.r(nim0Var, 64.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarP = vby0.p(dug.f(qim0VarR, cbx.a(x340Var6).a.c, er31.a), (lz20) obj4);
                    Object objT15 = x340Var6.T();
                    if (objT15 == fkj0.X) {
                        objT15 = fsj1.e1;
                        x340Var6.s0(objT15);
                    }
                    qim0 qim0VarX = bin.x(s161.b(qim0VarP, false, (iu30) objT15), false, (String) null, (pm31) null, (idn0) null, (Function0) obj5, 15);
                    gra graVar = een.h;
                    String str6 = ((oxj1) obj3).g;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    w0h1.a(xpx.c, str6.length() == 0 ? isl.a : new jsl(str6), uyn1.x(u291.d(nim0Var, 1.0f), 16.0f), 0L, 0L, false, x340Var6, xpx.d | 384, 56);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    czj1 czj1Var = (czj1) obj4;
                    f5p1.b(czj1Var.f, czj1Var.a, czj1Var.g, (wxj1) obj5, ((jzj1) obj3).e, (qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    era eraVar = een.Q0;
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var10).g, 32, nim0Var);
                    c1k1 c1k1Var = (c1k1) obj4;
                    c380 c380Var = (c380) obj5;
                    err0 err0Var = (hdn0) obj3;
                    mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var10, 0);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarO);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA, x340Var10, y580.O0);
                    nko1.H(xos0VarM2, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE2, x340Var10, y580.Y);
                    String strO0 = cwl1.o0(x340Var10, c1k1Var.h ? 2131959836 : 2131959223);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var10).g;
                    long j = cbx.a(x340Var10).b.a;
                    cvx cvxVar = cbx.b(x340Var10).b;
                    uwo1.e(strO0, uyn1.x(nim0Var, 16.0f), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2016);
                    long jA = cbx.a(x340Var10).a.b.a();
                    cvx cvxVar2 = cbx.b(x340Var10).b;
                    hr80.d(uyn1.z(0.0f, 8.0f, 1, nim0Var), 1.0f, jA, x340Var10, 0, 0);
                    x340Var10.f0(-601455432, Integer.valueOf(err0Var.s()));
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    cvx cvxVar3 = cbx.b(x340Var10).b;
                    zzq0 zzq0VarH = uyn1.h(2, 4.0f, 0.0f);
                    boolean zI7 = x340Var10.i(c380Var) | x340Var10.i(c1k1Var);
                    Object objT16 = x340Var10.T();
                    if (zI7 || objT16 == fkj0.X) {
                        objT16 = new hij1(c380Var, c1k1Var, (byte) 10);
                        x340Var10.s0(objT16);
                    }
                    ujo1.d(qim0VarF, (xtb0) null, zzq0VarH, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT16, x340Var10, 0, 506);
                    x340Var10.r(false);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((c1k1) obj4).c((c380) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Uri uri = (Uri) obj4;
                    uri.getClass();
                    eso1.e(uri, isl.a, u291.d(nim0Var, 1.0f), null, null, (ecx) obj5, null, null, null, (qux) obj3, false, false, x340Var12, 48, 0, 3544);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                o6k1 o6k1Var = (o6k1) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objT17 = x340Var14.T();
                    if (objT17 == fkj0.X) {
                        objT17 = new ffj1(o6k1Var.a, o6k1Var.b, o6k1Var.h);
                        x340Var14.s0(objT17);
                    }
                    o6p1.k((ffj1) objT17, o6k1Var.c, o6k1Var.g, (iu30) obj5, (n6k1) obj3, (qim0) null, x340Var14, 0, 32);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fwk1 fwk1Var = (fwk1) obj4;
                    lvb lvbVar = fwk1Var.g;
                    int iG = fwk1Var.g();
                    if (iG != 0) {
                        str = iG != 1 ? lvbVar.d : lvbVar.c;
                    } else {
                        str = lvbVar.e;
                    }
                    m87.c(String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(iG)}, 1)), ((jhx) ((uo5) obj5).d).a, (bwx) obj3, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                hyk1 hyk1Var = (hyk1) obj5;
                eyk1 eyk1Var = (eyk1) obj4;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    aq8.f(new ahk1(eyk1Var.b, mqo1.A(eyk1Var.c), hyk1Var.d.c, eyk1Var.e, eyk1Var.f), (iu30) obj3, apo.r(-1840644353, new fyk1(hyk1Var, (byte) 0), x340Var18), (lxk1) hyk1Var.a.get(), (qim0) null, x340Var18, 384);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    otw.c((o6k1) obj4, (m6k1) obj5, (qim0) obj3, (ipb1) null, x340Var20, 0, 8);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                nel1.a((nue1) obj4, (zge1) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                c680.s((qim0) obj4, (Function0) obj5, (vu30) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 16:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                lik1 lik1Var = (lik1) obj5;
                mml1 mml1Var = (mml1) obj4;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zI8 = x340Var22.i(mml1Var) | x340Var22.g(lik1Var) | x340Var22.g(iu30Var2);
                    Object objT18 = x340Var22.T();
                    if (zI8 || objT18 == fkj0.X) {
                        objT18 = new hml1(mml1Var, lik1Var, iu30Var2, (byte) 0);
                        x340Var22.s0(objT18);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT18), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, esj.a, x340Var22, 0, 48, 2044);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                vby0.l((h631) obj4, (String) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                wpb1.o((b2m1) obj4, (zxl1) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                mth1.k((gzl1) obj4, (iu30) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                o0i o0iVar = (o0i) obj5;
                tam1 tam1Var = (tam1) obj4;
                m4c m4cVar2 = fkj0.X;
                sh40 sh40Var = (sh40) obj3;
                q9l1 q9l1Var = (q9l1) sh40Var.d;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zG6 = x340Var24.g(tam1Var);
                    Object objT19 = x340Var24.T();
                    if (zG6 || objT19 == m4cVar2) {
                        objT19 = v8r.q(Boolean.FALSE);
                        x340Var24.s0(objT19);
                    }
                    ven0 ven0Var = (ven0) objT19;
                    boolean zI9 = x340Var24.i(ven0Var);
                    Object objT20 = x340Var24.T();
                    if (zI9 || objT20 == m4cVar2) {
                        objT20 = new e7m1(ven0Var, (byte) 5);
                        x340Var24.s0(objT20);
                    }
                    oto1.c(tam1Var, o0iVar, (iu30) objT20, x340Var24, 64);
                    float fM0 = ((wat) x340Var24.k(t4k.h)).M0(((Rect) q9l1Var.h.d.e).height());
                    ven0 ven0VarH = rwq.h(q9l1Var.h.e, x340Var24, 0);
                    s8l1 s8l1Var = (u8l1) ven0VarH.getValue();
                    if (!(s8l1Var instanceof s8l1)) {
                        if (u890.j(s8l1Var, t8l1Var)) {
                            num = null;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    num = s8l1Var.a.b;
                    ven0 ven0VarH2 = rwq.h(((g9l1) sh40Var.e).f15p, x340Var24, 0);
                    bal1 bal1Var2 = (bal1) rwq.g(yoi1.g(((m0t) sh40Var.b).d), aal1.a, (o8n) null, x340Var24, 0, 2).getValue();
                    z9l1 z9l1Var2 = bal1Var2 instanceof z9l1 ? (z9l1) bal1Var2 : null;
                    boolean z7 = z9l1Var2 != null && z9l1Var2.a;
                    ven0 ven0VarH3 = rwq.h(((xgm1) sh40Var.f).getState(), x340Var24, 0);
                    s8l1 s8l1Var2 = (u8l1) ven0VarH.getValue();
                    if (s8l1Var2 instanceof s8l1) {
                        if (s8l1Var2.a.c) {
                            z = false;
                        }
                        mt71 mt71Var = (mt71) ven0VarH2.getValue();
                        zI = x340Var24.i(sh40Var);
                        objT = x340Var24.T();
                        if (zI || objT == m4cVar2) {
                            objT = new c4m1(sh40Var, b2);
                            x340Var24.s0(objT);
                        }
                        iu30 iu30Var3 = (iu30) objT;
                        d08 d08Var = (d08) sh40Var.g;
                        hp80 hp80Var = o0iVar.e;
                        storyCard = ((wgm1) ven0VarH3.getValue()).a;
                        if (storyCard != null) {
                            id = storyCard.getId();
                        } else {
                            id = null;
                        }
                        if (((Boolean) ven0Var.getValue()).booleanValue() || !z) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        lnn1.d(fM0, num, mt71Var, (qim0) null, false, false, false, false, false, false, false, (String) null, (f08) null, (xz7) null, (g08) null, (pk1) null, (Function0) null, (Function0) null, (iu30) null, z7, iu30Var3, (Function0) null, (Function0) null, d08Var, hp80Var, id, z2, x340Var24, 0, 6815736);
                    } else if (!u890.j(s8l1Var2, t8l1Var)) {
                        eg.o();
                        return null;
                    }
                    z = true;
                    mt71 mt71Var2 = (mt71) ven0VarH2.getValue();
                    zI = x340Var24.i(sh40Var);
                    objT = x340Var24.T();
                    if (zI) {
                        objT = new c4m1(sh40Var, b2);
                        x340Var24.s0(objT);
                    } else {
                        objT = new c4m1(sh40Var, b2);
                        x340Var24.s0(objT);
                    }
                    iu30 iu30Var4 = (iu30) objT;
                    d08 d08Var2 = (d08) sh40Var.g;
                    hp80 hp80Var2 = o0iVar.e;
                    storyCard = ((wgm1) ven0VarH3.getValue()).a;
                    if (storyCard != null) {
                        id = storyCard.getId();
                    } else {
                        id = null;
                    }
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    lnn1.d(fM0, num, mt71Var2, (qim0) null, false, false, false, false, false, false, false, (String) null, (f08) null, (xz7) null, (g08) null, (pk1) null, (Function0) null, (Function0) null, (iu30) null, z7, iu30Var4, (Function0) null, (Function0) null, d08Var2, hp80Var2, id, z2, x340Var24, 0, 6815736);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            default:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                o0i o0iVar2 = (o0i) obj5;
                ibm1 ibm1Var = (ibm1) obj4;
                lbm1 lbm1Var = (lbm1) obj3;
                q9l1 q9l1Var2 = lbm1Var.a;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Object objT21 = x340Var26.T();
                    Object obj6 = fkj0.X;
                    if (objT21 == obj6) {
                        objT21 = (tjs0) lbm1Var.d.get();
                        x340Var26.s0(objT21);
                    }
                    tjs0 tjs0Var = (tjs0) objT21;
                    boolean zG7 = x340Var26.g(ibm1Var);
                    Object objT22 = x340Var26.T();
                    if (zG7 || objT22 == obj6) {
                        objT22 = v8r.q(Boolean.FALSE);
                        x340Var26.s0(objT22);
                    }
                    ven0 ven0Var2 = (ven0) objT22;
                    pe peVarA = ef.a(x340Var26);
                    tjs0Var.getClass();
                    Context context = (Context) x340Var26.k(AndroidCompositionLocals_androidKt.b);
                    ContentResolver contentResolver = context.getContentResolver();
                    boolean zG8 = x340Var26.g(context);
                    Object objT23 = x340Var26.T();
                    if (zG8 || objT23 == obj6) {
                        objT23 = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
                        x340Var26.s0(objT23);
                    }
                    AccessibilityManager accessibilityManager = (AccessibilityManager) objT23;
                    boolean zG9 = x340Var26.g(peVarA) | x340Var26.g(tjs0Var);
                    Object objT24 = x340Var26.T();
                    if (zG9 || objT24 == obj6) {
                        objT24 = v8r.q(Boolean.valueOf(pwo1.v(peVarA, tjs0Var)));
                        x340Var26.s0(objT24);
                    }
                    tob1 tob1Var2 = (ven0) objT24;
                    Object[] objArr = {contentResolver, accessibilityManager, peVarA, tjs0Var};
                    boolean zI10 = x340Var26.i(tob1Var2) | x340Var26.i(peVarA) | x340Var26.i(tjs0Var) | x340Var26.i(contentResolver) | x340Var26.i(accessibilityManager);
                    Object objT25 = x340Var26.T();
                    if (zI10 || objT25 == obj6) {
                        tob1Var = tob1Var2;
                        objT25 = new kdg1(contentResolver, accessibilityManager, peVarA, tjs0Var, tob1Var, (byte) 3);
                        x340Var26.s0(objT25);
                    } else {
                        tob1Var = tob1Var2;
                    }
                    qxd0.j(objArr, (iu30) objT25, x340Var26);
                    boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
                    boolean zI11 = x340Var26.i(ven0Var2);
                    Object objT26 = x340Var26.T();
                    if (zI11 || objT26 == obj6) {
                        objT26 = new e7m1(ven0Var2, (byte) 6);
                        x340Var26.s0(objT26);
                    }
                    oto1.c(ibm1Var, o0iVar2, (iu30) objT26, x340Var26, 64);
                    float fM1 = ((wat) x340Var26.k(t4k.h)).M0(((Rect) q9l1Var2.h.d.e).height());
                    ven0 ven0VarH4 = rwq.h(q9l1Var2.h.e, x340Var26, 0);
                    s8l1 s8l1Var3 = (u8l1) ven0VarH4.getValue();
                    if (!(s8l1Var3 instanceof s8l1)) {
                        if (u890.j(s8l1Var3, t8l1Var)) {
                            num2 = null;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    num2 = s8l1Var3.a.b;
                    s8l1 s8l1Var4 = (u8l1) ven0VarH4.getValue();
                    if (s8l1Var4 instanceof s8l1) {
                        if (s8l1Var4.a.c) {
                            z3 = false;
                        }
                        tob1VarH = rwq.h(lbm1Var.b.f15p, x340Var26, 0);
                        bal1Var = (bal1) rwq.g(yoi1.g(lbm1Var.g.d), aal1.a, (o8n) null, x340Var26, 0, 2).getValue();
                        if (bal1Var instanceof z9l1) {
                            z9l1Var = (z9l1) bal1Var;
                        } else {
                            z9l1Var = null;
                        }
                        if (z9l1Var == null && z9l1Var.a) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        tob1VarH2 = rwq.h(lbm1Var.c.getState(), x340Var26, 0);
                        boolean z8 = ((wgm1) tob1VarH2.getValue()).c.a;
                        boolean z9 = ((wgm1) tob1VarH2.getValue()).d;
                        str2 = ibm1Var.a;
                        if (str2 == null) {
                            z5 = true;
                        } else {
                            storyCard3 = ((wgm1) tob1VarH2.getValue()).a;
                            if (storyCard3 != null) {
                                id3 = storyCard3.getId();
                            } else {
                                id3 = null;
                            }
                            if (str2.equals(id3)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                        }
                        sjuVarA = ((mt71) tob1VarH.getValue()).a();
                        if (sjuVarA != null) {
                            str3 = sjuVarA.c;
                        } else {
                            str3 = null;
                        }
                        sjuVarA2 = ((mt71) tob1VarH.getValue()).a();
                        if (sjuVarA2 != null) {
                            str4 = sjuVarA2.d;
                        } else {
                            str4 = null;
                        }
                        xz7Var = ibm1Var.e;
                        if (xz7Var != null) {
                            xz7Var2 = xz7Var;
                        } else {
                            sjuVarA4 = ((mt71) tob1VarH.getValue()).a();
                            if (sjuVarA4 != null) {
                                xz7Var = sjuVarA4.f;
                                xz7Var2 = xz7Var;
                            } else {
                                xz7Var2 = null;
                            }
                        }
                        g08Var = ibm1Var.g;
                        if (g08Var != null) {
                            g08Var2 = g08Var;
                        } else {
                            sjuVarA3 = ((mt71) tob1VarH.getValue()).a();
                            if (sjuVarA3 != null) {
                                g08Var = sjuVarA3.g;
                                g08Var2 = g08Var;
                            } else {
                                g08Var2 = null;
                            }
                        }
                        zG = x340Var26.g(str3);
                        objT2 = x340Var26.T();
                        if (!zG || objT2 == obj6) {
                            if (str3 != null) {
                                objT2 = new lt20(lbm1Var.e.z(str3), new u9a1(3, (lnm) null, (byte) 8), (byte) 0);
                            } else {
                                objT2 = new huz(Boolean.FALSE, (byte) 10);
                            }
                            x340Var26.s0(objT2);
                        } else {
                            tob1VarH2 = tob1VarH2;
                            z3 = z3;
                            tob1VarH = tob1VarH;
                        }
                        ven0VarG = rwq.g((mr20) objT2, Boolean.FALSE, (o8n) null, x340Var26, 48, 2);
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            qk1Var = qk1.b;
                        } else {
                            qk1Var = qk1.a;
                        }
                        pk1 pk1Var = new pk1(qk1Var, false, (String) null, (String) null, tk1.c, 14);
                        objT3 = x340Var26.T();
                        if (objT3 == obj6) {
                            objT3 = qxd0.M(o6x.a, x340Var26);
                            x340Var26.s0(objT3);
                        }
                        c9nVar = (c9n) objT3;
                        mt71 mt71Var3 = (mt71) tob1VarH.getValue();
                        boolean z10 = ibm1Var.b;
                        boolean z11 = ibm1Var.c;
                        boolean z12 = ibm1Var.d;
                        boolean zBooleanValue2 = ((Boolean) ven0VarG.getValue()).booleanValue();
                        f08 f08Var = ibm1Var.f;
                        zG2 = x340Var26.g(str3) | x340Var26.i(c9nVar) | x340Var26.i(ven0VarG) | x340Var26.i(lbm1Var);
                        objT4 = x340Var26.T();
                        if (zG2 || objT4 == obj6) {
                            objT4 = new odp0(str3, c9nVar, lbm1Var, ven0VarG, (byte) 28);
                            x340Var26.s0(objT4);
                        }
                        Function0 function4 = (Function0) objT4;
                        zH = x340Var26.h(zBooleanValue);
                        objT5 = x340Var26.T();
                        if (zH || objT5 == obj6) {
                            objT5 = new sg6((byte) 5, zBooleanValue);
                            x340Var26.s0(objT5);
                        }
                        Function0 function5 = (Function0) objT5;
                        zI2 = x340Var26.i(ven0VarH4) | x340Var26.i(lbm1Var);
                        objT6 = x340Var26.T();
                        if (zI2 || objT6 == obj6) {
                            objT6 = new f2m1(lbm1Var, ven0VarH4, (byte) 12);
                            x340Var26.s0(objT6);
                        }
                        iu30 iu30Var5 = (iu30) objT6;
                        zI3 = x340Var26.i(lbm1Var);
                        objT7 = x340Var26.T();
                        if (zI3 || objT7 == obj6) {
                            objT7 = new c4m1((Object) lbm1Var, (byte) 7);
                            x340Var26.s0(objT7);
                        }
                        iu30 iu30Var6 = (iu30) objT7;
                        zI4 = x340Var26.i(lbm1Var);
                        objT8 = x340Var26.T();
                        if (zI4 || objT8 == obj6) {
                            objT8 = new kbm1(lbm1Var, (byte) 0);
                            x340Var26.s0(objT8);
                        }
                        Function0 function6 = (Function0) objT8;
                        zI5 = x340Var26.i(lbm1Var);
                        objT9 = x340Var26.T();
                        if (zI5 || objT9 == obj6) {
                            objT9 = new kbm1(lbm1Var, (byte) 1);
                            x340Var26.s0(objT9);
                        }
                        Function0 function7 = (Function0) objT9;
                        d08 d08Var3 = lbm1Var.f;
                        hp80 hp80Var3 = o0iVar2.e;
                        storyCard2 = ((wgm1) tob1VarH2.getValue()).a;
                        if (storyCard2 != null) {
                            id2 = storyCard2.getId();
                        } else {
                            id2 = null;
                        }
                        if (((Boolean) ven0Var2.getValue()).booleanValue() || !z3) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        lnn1.d(fM1, num2, mt71Var3, (qim0) null, z10, z11, z12, z8, z9, z5, zBooleanValue2, str4, f08Var, xz7Var2, g08Var2, pk1Var, function4, function5, iu30Var5, z4, iu30Var6, function6, function7, d08Var3, hp80Var3, id2, z6, x340Var26, 0, 8);
                    } else if (!u890.j(s8l1Var4, t8l1Var)) {
                        eg.o();
                        return null;
                    }
                    z3 = true;
                    tob1VarH = rwq.h(lbm1Var.b.f15p, x340Var26, 0);
                    bal1Var = (bal1) rwq.g(yoi1.g(lbm1Var.g.d), aal1.a, (o8n) null, x340Var26, 0, 2).getValue();
                    if (bal1Var instanceof z9l1) {
                        z9l1Var = (z9l1) bal1Var;
                    } else {
                        z9l1Var = null;
                    }
                    if (z9l1Var == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    tob1VarH2 = rwq.h(lbm1Var.c.getState(), x340Var26, 0);
                    boolean z13 = ((wgm1) tob1VarH2.getValue()).c.a;
                    boolean z14 = ((wgm1) tob1VarH2.getValue()).d;
                    str2 = ibm1Var.a;
                    if (str2 == null) {
                        z5 = true;
                    } else {
                        storyCard3 = ((wgm1) tob1VarH2.getValue()).a;
                        if (storyCard3 != null) {
                            id3 = storyCard3.getId();
                        } else {
                            id3 = null;
                        }
                        if (str2.equals(id3)) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    sjuVarA = ((mt71) tob1VarH.getValue()).a();
                    if (sjuVarA != null) {
                        str3 = sjuVarA.c;
                    } else {
                        str3 = null;
                    }
                    sjuVarA2 = ((mt71) tob1VarH.getValue()).a();
                    if (sjuVarA2 != null) {
                        str4 = sjuVarA2.d;
                    } else {
                        str4 = null;
                    }
                    xz7Var = ibm1Var.e;
                    if (xz7Var != null) {
                        xz7Var2 = xz7Var;
                    } else {
                        sjuVarA4 = ((mt71) tob1VarH.getValue()).a();
                        if (sjuVarA4 != null) {
                            xz7Var = sjuVarA4.f;
                            xz7Var2 = xz7Var;
                        } else {
                            xz7Var2 = null;
                        }
                    }
                    g08Var = ibm1Var.g;
                    if (g08Var != null) {
                        g08Var2 = g08Var;
                    } else {
                        sjuVarA3 = ((mt71) tob1VarH.getValue()).a();
                        if (sjuVarA3 != null) {
                            g08Var = sjuVarA3.g;
                            g08Var2 = g08Var;
                        } else {
                            g08Var2 = null;
                        }
                    }
                    zG = x340Var26.g(str3);
                    objT2 = x340Var26.T();
                    if (zG) {
                        if (str3 != null) {
                            objT2 = new lt20(lbm1Var.e.z(str3), new u9a1(3, (lnm) null, (byte) 8), (byte) 0);
                        } else {
                            objT2 = new huz(Boolean.FALSE, (byte) 10);
                        }
                        x340Var26.s0(objT2);
                    } else {
                        if (str3 != null) {
                            objT2 = new lt20(lbm1Var.e.z(str3), new u9a1(3, (lnm) null, (byte) 8), (byte) 0);
                        } else {
                            objT2 = new huz(Boolean.FALSE, (byte) 10);
                        }
                        x340Var26.s0(objT2);
                    }
                    ven0VarG = rwq.g((mr20) objT2, Boolean.FALSE, (o8n) null, x340Var26, 48, 2);
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        qk1Var = qk1.b;
                    } else {
                        qk1Var = qk1.a;
                    }
                    pk1 pk1Var2 = new pk1(qk1Var, false, (String) null, (String) null, tk1.c, 14);
                    objT3 = x340Var26.T();
                    if (objT3 == obj6) {
                        objT3 = qxd0.M(o6x.a, x340Var26);
                        x340Var26.s0(objT3);
                    }
                    c9nVar = (c9n) objT3;
                    mt71 mt71Var4 = (mt71) tob1VarH.getValue();
                    boolean z15 = ibm1Var.b;
                    boolean z16 = ibm1Var.c;
                    boolean z17 = ibm1Var.d;
                    boolean zBooleanValue3 = ((Boolean) ven0VarG.getValue()).booleanValue();
                    f08 f08Var2 = ibm1Var.f;
                    zG2 = x340Var26.g(str3) | x340Var26.i(c9nVar) | x340Var26.i(ven0VarG) | x340Var26.i(lbm1Var);
                    objT4 = x340Var26.T();
                    if (zG2) {
                        objT4 = new odp0(str3, c9nVar, lbm1Var, ven0VarG, (byte) 28);
                        x340Var26.s0(objT4);
                    } else {
                        objT4 = new odp0(str3, c9nVar, lbm1Var, ven0VarG, (byte) 28);
                        x340Var26.s0(objT4);
                    }
                    Function0 function8 = (Function0) objT4;
                    zH = x340Var26.h(zBooleanValue);
                    objT5 = x340Var26.T();
                    if (zH) {
                        objT5 = new sg6((byte) 5, zBooleanValue);
                        x340Var26.s0(objT5);
                    } else {
                        objT5 = new sg6((byte) 5, zBooleanValue);
                        x340Var26.s0(objT5);
                    }
                    Function0 function9 = (Function0) objT5;
                    zI2 = x340Var26.i(ven0VarH4) | x340Var26.i(lbm1Var);
                    objT6 = x340Var26.T();
                    if (zI2) {
                        objT6 = new f2m1(lbm1Var, ven0VarH4, (byte) 12);
                        x340Var26.s0(objT6);
                    } else {
                        objT6 = new f2m1(lbm1Var, ven0VarH4, (byte) 12);
                        x340Var26.s0(objT6);
                    }
                    iu30 iu30Var7 = (iu30) objT6;
                    zI3 = x340Var26.i(lbm1Var);
                    objT7 = x340Var26.T();
                    if (zI3) {
                        objT7 = new c4m1((Object) lbm1Var, (byte) 7);
                        x340Var26.s0(objT7);
                    } else {
                        objT7 = new c4m1((Object) lbm1Var, (byte) 7);
                        x340Var26.s0(objT7);
                    }
                    iu30 iu30Var8 = (iu30) objT7;
                    zI4 = x340Var26.i(lbm1Var);
                    objT8 = x340Var26.T();
                    if (zI4) {
                        objT8 = new kbm1(lbm1Var, (byte) 0);
                        x340Var26.s0(objT8);
                    } else {
                        objT8 = new kbm1(lbm1Var, (byte) 0);
                        x340Var26.s0(objT8);
                    }
                    Function0 function10 = (Function0) objT8;
                    zI5 = x340Var26.i(lbm1Var);
                    objT9 = x340Var26.T();
                    if (zI5) {
                        objT9 = new kbm1(lbm1Var, (byte) 1);
                        x340Var26.s0(objT9);
                    } else {
                        objT9 = new kbm1(lbm1Var, (byte) 1);
                        x340Var26.s0(objT9);
                    }
                    Function0 function11 = (Function0) objT9;
                    d08 d08Var4 = lbm1Var.f;
                    hp80 hp80Var4 = o0iVar2.e;
                    storyCard2 = ((wgm1) tob1VarH2.getValue()).a;
                    if (storyCard2 != null) {
                        id2 = storyCard2.getId();
                    } else {
                        id2 = null;
                    }
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    lnn1.d(fM1, num2, mt71Var4, (qim0) null, z15, z16, z17, z13, z14, z5, zBooleanValue3, str4, f08Var2, xz7Var2, g08Var2, pk1Var2, function8, function9, iu30Var7, z4, iu30Var8, function10, function11, d08Var4, hp80Var4, id2, z6, x340Var26, 0, 8);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pej1(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pej1(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pej1(c1k1 c1k1Var, c380 c380Var, hdn0 hdn0Var) {
        super(2);
        this.a = (byte) 7;
        this.b = c1k1Var;
        this.c = c380Var;
        this.d = hdn0Var;
    }
}
