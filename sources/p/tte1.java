package p;

import android.net.Uri;
import com.spotify.mobius.functions.Consumer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tte1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tte1(x811 x811Var, es41 es41Var, dgq dgqVar, u911 u911Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 17;
        this.c = x811Var;
        this.d = es41Var;
        this.e = dgqVar;
        this.f = u911Var;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String strK;
        String str;
        rih1 rih1Var;
        boolean z2;
        qim0 qim0VarD;
        int i;
        int i2;
        int iOrdinal;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var2 = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    si1 si1Var = (si1) obj7;
                    Integer numValueOf = si1Var != null ? Integer.valueOf(si1Var.o()) : null;
                    if (numValueOf == null) {
                        x340Var2.i0(-1638788923);
                        z = false;
                        x340Var2.r(false);
                        strK = null;
                    } else {
                        z = false;
                        strK = kk0.k(x340Var2, -1638788922, numValueOf, x340Var2, false);
                    }
                    if (strK == null) {
                        strK = "";
                    }
                    irn1.u((qim0) null, apo.r(596839471, new qgd((byte) 15, strK, (iu30) obj6, z), x340Var2), (vu30) null, (erl1) null, apo.r(-1624618071, new n2y0(obj7, obj5, obj4, obj3, (iu30) obj6, (byte) 10), x340Var2), x340Var2, 24624, 13);
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 1:
                ((Number) obj2).intValue();
                mp10.h((String) obj7, (djc0) obj5, (qim0) obj4, (iu30) obj6, (lee1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 2:
                ((Number) obj2).intValue();
                up30.g((qef1) obj7, (iu30) obj6, (j2i) obj5, (j2i) obj4, (qim0) obj3, (b0k) obj, czo1.p(3457));
                return rih1Var2;
            case 3:
                ((Number) obj2).intValue();
                exd0.l((xjf1) obj7, (Uri) obj5, (iu30) obj6, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 4:
                ((Number) obj2).intValue();
                crm0.t((crf1) obj7, (srt0) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var2;
            case 5:
                ((Number) obj2).intValue();
                ((tva1) obj7).g((String) obj6, (String) obj5, (String) obj4, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 6:
                ((Number) obj2).intValue();
                hqn1.j((c380) obj7, (mxf0) obj6, (yp71) obj5, (String) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                j06 j06Var = x340Var4.a;
                if (!zY) {
                    x340Var4.b0();
                    return rih1Var2;
                }
                fra fraVar = een.Z;
                String str2 = (String) obj7;
                j2i j2iVar = (j2i) obj6;
                u251 u251Var = (u251) obj5;
                lee1 lee1Var = (lee1) obj4;
                tvh1 tvh1Var = (tvh1) obj3;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var4, 0);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf2, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                wnb0 wnb0VarQ = kk0.q(x340Var4, qim0VarE, lljVar4, 1.0f, true);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, wnb0VarQ);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                j2iVar.invoke(x340Var4, 0);
                if (u251Var == null || str2.length() <= 0) {
                    str = str2;
                    rih1Var = rih1Var2;
                    z2 = false;
                    x340Var4.i0(-385788479);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-386230539);
                    String str3 = u251Var.a;
                    qim0 qim0VarY = u291.y(nim0Var, fraVar, true);
                    boolean zI = x340Var4.i(tvh1Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == m4cVar) {
                        objT = new uvh1(tvh1Var, (byte) 0);
                        x340Var4.s0(objT);
                    }
                    str = str2;
                    y251.f(str, str3, lee1Var, qim0VarY, 0L, 3, (iu30) objT, x340Var4, 196608, 16);
                    boolean zI2 = x340Var4.i(tvh1Var);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new uvh1(tvh1Var, (byte) 1);
                        x340Var4.s0(objT2);
                    }
                    rih1Var = rih1Var2;
                    qxd0.i(rih1Var, (iu30) objT2, x340Var4);
                    z2 = false;
                    x340Var4.r(false);
                }
                x340Var4.r(true);
                if (str.length() > 0) {
                    x340Var4.i0(258304798);
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var4).d;
                    ab80.p(nim0Var, 48.0f, x340Var4, z2);
                } else {
                    x340Var4.i0(258394171);
                    x340Var4.r(z2);
                }
                x340Var4.r(true);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ilo1.q((oyh1) obj7, (htl1) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 9:
                ((Number) obj2).intValue();
                epo1.y((e680) obj7, (Function0) obj6, (z710) obj5, (n9i1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 10:
                ((Number) obj2).intValue();
                rpo1.p((w9i1) obj7, (Function0) obj6, (Function0) obj5, (n9i1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 11:
                ((Number) obj2).intValue();
                myo1.m((tvi1) obj7, (iu30) obj6, (qim0) obj5, (aod0) obj4, (yqg) obj3, (b0k) obj, czo1.p(4097));
                return rih1Var2;
            case 12:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fdj1 fdj1Var = (fdj1) obj7;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ji0 ji0Var = fdj1Var.a;
                    p1p1.l(ji0Var.S0, ji0Var.R0, ji0Var.b(), fdj1Var.f, fdj1Var.c, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var2;
            case 13:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                paj1 paj1Var = (paj1) obj6;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    if (!((Boolean) ((ven0) obj5).getValue()).booleanValue() || ((((adj1) obj7) instanceof ycj1) && (iOrdinal = paj1Var.ordinal()) != 0 && iOrdinal != 2)) {
                        qim0VarD2 = anm1.N("videoplayer_highlighted_foreground", zr7.i(qim0VarD2, rre1.S0));
                    }
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarD2, cbx.a(x340Var8).a.c, d4o1.a);
                    gra graVar = een.h;
                    uoa uoaVar = (uoa) obj4;
                    List list = ((taj1) obj3).e;
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM3 = x340Var8.m();
                    qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var8, y580.O0);
                    nko1.H(xos0VarM3, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE3, x340Var8, y580.Y);
                    b3k1 b3k1Var = prj1.a[paj1Var.ordinal()] == 1 ? b3k1.d : b3k1.b;
                    a7j1 a7j1VarK = a4p1.k(list);
                    int iOrdinal2 = paj1Var.ordinal();
                    if (iOrdinal2 == 0) {
                        qim0VarD = u291.d(nim0Var, 1.0f);
                    } else if (iOrdinal2 != 2) {
                        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                        cbx.a.getClass();
                        qim0VarD = hno1.f(qim0VarF2, uwr.d());
                    } else {
                        a7j1 a7j1Var = (a7j1) o7h.s0(list);
                        if (a7j1Var == null || (i = a7j1Var.b) > (i2 = a7j1Var.c)) {
                            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                            cbx.a.getClass();
                            qim0VarD = hno1.f(qim0VarF3, uwr.d());
                        } else {
                            qim0VarD = i == i2 ? xcg1.k(cbx.a, u291.f(nim0Var, 1.0f)) : u291.d(nim0Var, 1.0f);
                        }
                    }
                    a4p1.d(uoaVar, b3k1Var, a7j1VarK, qim0VarD, x340Var8, 0);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var2;
            case 14:
                ((Number) obj2).intValue();
                aq8.f((ahk1) obj7, (iu30) obj6, (j2i) obj5, (lxk1) obj4, (qim0) obj3, (b0k) obj, czo1.p(385));
                return rih1Var2;
            case 15:
                ((Number) obj2).intValue();
                sok.g((q9l1) obj7, (bcl1) obj6, (Consumer) obj5, (p5j1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 16:
                ((Number) obj2).intValue();
                qxd0.G((uek) obj7, (Function0) obj6, (Function0) obj5, (fod0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 17:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x811 x811Var = (x811) obj7;
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else if (x811Var != null) {
                    String str4 = x811Var.b;
                    x340Var10.i0(-2109193864);
                    boolean zG = x340Var10.g(str4);
                    dgq dgqVar = (dgq) obj4;
                    u911 u911Var = (u911) obj3;
                    iu30 iu30Var = (iu30) obj6;
                    Object objT3 = x340Var10.T();
                    if (zG || objT3 == fkj0.X) {
                        objT3 = new yzm1(str4, u911Var, new frl1(iu30Var, x811Var, (byte) 9), (k911) dgqVar.a.c.a.ke.get());
                        x340Var10.s0(objT3);
                    }
                    String str5 = x811Var.a;
                    otw.c((yzm1) objT3, new xzm1(str5, str5, (es41) obj5), (qim0) null, (ipb1) null, x340Var10, 64, 12);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(-2108473114);
                    x340Var10.r(false);
                }
                return rih1Var2;
            default:
                ((Number) obj2).intValue();
                irn1.G((kjo0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tte1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tte1(String str, djc0 djc0Var, qim0 qim0Var, iu30 iu30Var, lee1 lee1Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.c = str;
        this.d = djc0Var;
        this.e = qim0Var;
        this.b = iu30Var;
        this.f = lee1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tte1(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tte1(xjf1 xjf1Var, Uri uri, iu30 iu30Var, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.c = xjf1Var;
        this.d = uri;
        this.b = iu30Var;
        this.e = function0;
        this.f = qim0Var;
    }
}
