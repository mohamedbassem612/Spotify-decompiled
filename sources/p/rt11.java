package p;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rt11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt11(a221 a221Var, m0u m0uVar, uvx uvxVar) {
        super(3);
        this.a = (byte) 2;
        this.b = m0uVar;
        this.c = uvxVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
    /* JADX WARN: Code duplicated, block: B:42:0x016c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0170  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f4 A[LOOP:0: B:51:0x01ee->B:53:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0226  */
    private final Object a(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        qim0 qim0VarQ;
        cr31 cr31Var;
        cr31 cr31Var2;
        float fC;
        qim0 qim0VarM;
        qim0 qim0Var;
        boolean z;
        hcx hcxVar;
        ArrayList arrayList;
        wat watVar;
        Drawable drawable;
        boolean zG;
        Object objT;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        hy81 hy81Var = (hy81) this.b;
        j47 j47Var = hy81Var.a;
        ekt ektVar = hy81Var.b;
        cr31 cr31Var3 = (cr31) ((k9) (j47Var.a instanceof l07 ? y37.c : a47.c)).b;
        nim0 nim0Var = nim0.a;
        if (ektVar != null) {
            qim0 qim0VarK = u291.k(uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 8.0f, 6), i2cVar.c() * 0.911f);
            j47Var.b.getClass();
            qim0VarQ = i1p1.q(d7e.r(1.0f, qim0VarK, false), cr31Var3);
        } else {
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            j47Var.b.getClass();
            qim0VarQ = i1p1.q(d7e.r(1.0f, qim0VarD, false), cr31Var3);
        }
        String str = j47Var.a.a().a;
        if (str == null) {
            str = "";
        }
        Uri uri = Uri.parse(str);
        isl islVar = isl.a;
        eso1.e(uri, islVar, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
        if (ektVar == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1564057497);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1564057498);
            iu30 iu30Var = (iu30) this.c;
            boolean z2 = ektVar instanceof ekt;
            if (z2 || (ektVar instanceof hkt)) {
                cr31Var = (cr31) ((k9) z37.c).b;
            } else {
                if (ektVar instanceof ikt) {
                    cr31Var = (cr31) ((k9) y37.c).b;
                } else {
                    if (!(ektVar instanceof gkt)) {
                        eg.o();
                        return null;
                    }
                    cr31Var2 = null;
                }
                fC = i2cVar.c() * 0.356f;
                qim0VarM = u291.m(i2cVar.a(nim0Var, een.t), fC);
                if (cr31Var2 != null) {
                    qim0VarM = sto1.o(qim0VarM, 8.0f, cr31Var2, true, 0L, 0L, 24);
                }
                qim0Var = qim0VarM;
                if (z2) {
                    x340Var3.i0(930039724);
                    watVar = (wat) x340Var3.k(t4k.h);
                    drawable = (Drawable) iu30Var.invoke(ektVar.d);
                    zG = x340Var3.g(drawable) | x340Var3.d(fC);
                    objT = x340Var3.T();
                    if (zG || objT == fkj0.X) {
                        objT = new yk4(mno1.y(drawable, watVar.i0(fC), watVar.i0(fC), Bitmap.Config.ARGB_8888));
                        x340Var3.s0(objT);
                    }
                    eso1.f((yk4) objT, islVar, qim0Var, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var3, 48, 504);
                    x340Var3.r(false);
                } else if (ektVar instanceof hkt) {
                    x340Var3.i0(930853257);
                    eso1.e(Uri.parse(((hkt) ektVar).d), islVar, qim0Var, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 48, 0, 4088);
                    x340Var3.r(false);
                } else {
                    z = ektVar instanceof ikt;
                    hcxVar = hcx.b;
                    if (z) {
                        x340Var3.i0(931143014);
                        ikt iktVar = (ikt) ektVar;
                        bmq0.a(Uri.parse(iktVar.d), qim0Var, hcxVar, iktVar.e, iktVar.f, 0L, 0L, false, x340Var3, 384, 224);
                        x340Var3.r(false);
                    } else {
                        if (ektVar instanceof gkt) {
                            throw p3d1.k(x340Var3, 722736613, false);
                        }
                        x340Var3.i0(931512255);
                        ArrayList<ikt> arrayList2 = ((gkt) ektVar).d;
                        arrayList = new ArrayList(q7h.U(arrayList2, 10));
                        for (ikt iktVar2 : arrayList2) {
                            arrayList.add(new phx(8, 0L, iktVar2.d, iktVar2.e, iktVar2.f));
                        }
                        shx.a(mqo1.A(arrayList), qim0Var, hcxVar, (idn0) null, x340Var3, 392, 56);
                        x340Var3.r(false);
                    }
                }
                x340Var3.r(false);
            }
            cr31Var2 = cr31Var;
            fC = i2cVar.c() * 0.356f;
            qim0VarM = u291.m(i2cVar.a(nim0Var, een.t), fC);
            if (cr31Var2 != null) {
                qim0VarM = sto1.o(qim0VarM, 8.0f, cr31Var2, true, 0L, 0L, 24);
            }
            qim0Var = qim0VarM;
            if (z2) {
                x340Var3.i0(930039724);
                watVar = (wat) x340Var3.k(t4k.h);
                drawable = (Drawable) iu30Var.invoke(ektVar.d);
                zG = x340Var3.g(drawable) | x340Var3.d(fC);
                objT = x340Var3.T();
                if (zG) {
                    objT = new yk4(mno1.y(drawable, watVar.i0(fC), watVar.i0(fC), Bitmap.Config.ARGB_8888));
                    x340Var3.s0(objT);
                } else {
                    objT = new yk4(mno1.y(drawable, watVar.i0(fC), watVar.i0(fC), Bitmap.Config.ARGB_8888));
                    x340Var3.s0(objT);
                }
                eso1.f((yk4) objT, islVar, qim0Var, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var3, 48, 504);
                x340Var3.r(false);
            } else if (ektVar instanceof hkt) {
                x340Var3.i0(930853257);
                eso1.e(Uri.parse(((hkt) ektVar).d), islVar, qim0Var, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 48, 0, 4088);
                x340Var3.r(false);
            } else {
                z = ektVar instanceof ikt;
                hcxVar = hcx.b;
                if (z) {
                    x340Var3.i0(931143014);
                    ikt iktVar3 = (ikt) ektVar;
                    bmq0.a(Uri.parse(iktVar3.d), qim0Var, hcxVar, iktVar3.e, iktVar3.f, 0L, 0L, false, x340Var3, 384, 224);
                    x340Var3.r(false);
                } else {
                    if (ektVar instanceof gkt) {
                        throw p3d1.k(x340Var3, 722736613, false);
                    }
                    x340Var3.i0(931512255);
                    ArrayList<ikt> arrayList3 = ((gkt) ektVar).d;
                    arrayList = new ArrayList(q7h.U(arrayList3, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new phx(8, 0L, iktVar2.d, iktVar2.e, iktVar2.f));
                    }
                    shx.a(mqo1.A(arrayList), qim0Var, hcxVar, (idn0) null, x340Var3, 392, 56);
                    x340Var3.r(false);
                }
            }
            x340Var3.r(false);
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1v k1vVar;
        float f;
        Object obj4;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                tt11 tt11Var = (tt11) obj6;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else if (tt11Var.S0 != null) {
                    x340Var2.i0(-798233279);
                    otw.c(tt11Var.S0, new sfv(((jmb1) obj5).a.a, zBooleanValue ? 2 : 1, 4), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-797657640);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 1:
                return new u3l0(new s3l0(new w3l0(((n6r0) obj6).path(), (String) obj5), (byte) 1), Integer.valueOf(((Number) obj).intValue()), (String) obj2);
            case 2:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                rw21 rw21Var = ((m0u) obj6).d;
                int iC = l1d.C(rw21Var.b);
                if (iC == 0) {
                    k1vVar = h1v.a;
                } else if (iC == 1 || iC == 2) {
                    k1vVar = n1v.a;
                } else if (iC == 3) {
                    k1vVar = new k1v(Float.valueOf(rw21Var.a / 100.0f));
                } else if (iC == 4) {
                    k1vVar = i1v.a;
                } else {
                    if (iC != 5) {
                        eg.o();
                        return null;
                    }
                    k1vVar = l1v.a;
                }
                p3v p3vVar = ((uvx) obj5).i;
                if (p3vVar == null) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(1076431505);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    x340Var4.r(false);
                    f = 24.0f;
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(1076429645);
                    x340Var5.r(false);
                    f = p3vVar.a;
                }
                hqq0.g(k1vVar, u291.r(nim0Var, f), x340Var3, 0, 0);
                return rih1Var;
            case 3:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj5;
                x340 x340Var7 = x340Var6;
                if (!x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var7.b0();
                } else if (((x821) obj6).g) {
                    x340Var7.i0(-1790775432);
                    idx idxVar = new idx();
                    boolean zG = x340Var7.g(iu30Var);
                    Object objT = x340Var7.T();
                    if (zG || objT == fkj0.X) {
                        objT = new dv11(iu30Var, (byte) 13);
                        x340Var7.s0(objT);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT), idxVar, (qim0) null, (max) null, yla.s(x340Var7), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, cdj.d, x340Var7, 0, 48, 2012);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(-1790448382);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 4:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj5;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    pqs0 it = ((lqs0) obj6).iterator();
                    while (true) {
                        pqs0 pqs0Var = it;
                        if (pqs0Var.hasNext()) {
                            hkf0 hkf0Var = (hkf0) pqs0Var.next();
                            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                            ldx ldxVar = ldx.c;
                            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                            boolean zG2 = x340Var9.g(iu30Var2) | x340Var9.e(hkf0Var.ordinal());
                            Object objT2 = x340Var9.T();
                            if (zG2 || objT2 == fkj0.X) {
                                objT2 = new rl21(iu30Var2, hkf0Var, (byte) 0);
                                x340Var9.s0(objT2);
                            }
                            foo1.c(new gbx(z50Var, (Function0) objT2), ldxVar, qim0VarF, (max) null, (gdx) null, zzq0VarH, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(880091536, new ps11(hkf0Var, (byte) 15), x340Var9), x340Var9, 1573296, 48, 1976);
                        }
                    }
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 5:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                wro1.h(new gbx(z50Var, (Function0) obj6), new idx(18), (qim0) null, (max) null, yla.s(b0kVar), (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-1485056141, new ps11((ziu) obj5, (byte) 18), b0kVar), b0kVar, 0, 6, 988);
                return rih1Var;
            case 6:
                int iIntValue4 = ((Number) obj).intValue();
                String str = (String) obj2;
                Object obj7 = ((Map) obj6).get(str);
                obj7.getClass();
                List list = (List) obj7;
                kdy0 kdy0Var = (kdy0) obj5;
                int iC2 = l1d.C(((((apn0) obj3) instanceof n4h) || ((nma0) kdy0Var.c).getDescriptor().i(iIntValue4)) ? 2 : 1);
                if (iC2 == 0) {
                    if (list.size() != 1) {
                        StringBuilder sbT = l1d.t("Expected one value for argument ", str, ", found ");
                        sbT.append(list.size());
                        sbT.append("values instead.");
                        throw new IllegalArgumentException(sbT.toString().toString());
                    }
                    kdy0Var.e = ((String) kdy0Var.e) + '/' + ((String) o7h.q0(list));
                } else if (iC2 == 1) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        kdy0Var.b(str, (String) it2.next());
                    }
                }
                return rih1Var;
            case 7:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    List list2 = ((zv31) obj6).i;
                    tm80.t(list2 != null ? mqo1.A(list2) : null, (vu30) obj5, x340Var11, 0);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var12 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    fu31 fu31Var = (fu31) obj6;
                    ru31 ru31Var = (ru31) obj5;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var13, 48);
                    int iHashCode = Long.hashCode(x340Var13.T);
                    xos0 xos0VarM = x340Var13.m();
                    qim0 qim0VarE = zr7.E(x340Var13, nim0Var);
                    hzj.A.getClass();
                    if (x340Var13.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var13.m0();
                    if (x340Var13.S) {
                        x340Var13.l(n4kVar);
                    } else {
                        x340Var13.v0();
                    }
                    nko1.H(jw31VarA, x340Var13, y580.O0);
                    nko1.H(xos0VarM, x340Var13, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var13, y580.R0);
                    nko1.F(x340Var13);
                    nko1.H(qim0VarE, x340Var13, y580.Y);
                    if (fu31Var.d && ru31Var.p(fu31Var)) {
                        x340Var13.i0(-588918325);
                        ru31Var.k(fu31Var, x340Var13, 0);
                        x340Var13.r(false);
                    } else {
                        x340Var13.i0(-588857782);
                        x340Var13.r(false);
                    }
                    vu30 vu30Var = fu31Var.i;
                    if (vu30Var == null) {
                        x340Var13.i0(-588733535);
                    } else {
                        c13.o(x340Var13, 396650592, 0, vu30Var, x340Var13);
                    }
                    x340Var13.r(false);
                    x340Var13.r(true);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 9:
                i2c i2cVar = (i2c) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var14.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    xat xatVar = new xat(hjl.i(i2cVar.b) / 213.75f, 1.0f);
                    kiv kivVar = AndroidCompositionLocals_androidKt.a;
                    Configuration configuration = (Configuration) x340Var15.k(kivVar);
                    boolean zG3 = x340Var15.g(configuration);
                    Object objT3 = x340Var15.T();
                    if (zG3 || objT3 == fkj0.X) {
                        obj4 = objT3;
                        Configuration configuration2 = new Configuration(configuration);
                        configuration2.screenWidthDp = 360;
                        x340Var15.s0(configuration2);
                        obj4 = configuration2;
                    }
                    obj4 = objT3;
                    p811 p811Var = new p811();
                    mod.b(kivVar.a((Configuration) obj4), apo.r(1954319053, new j3(p811Var, (byte) 2), x340Var15), x340Var15, 56);
                    Object obj8 = p811Var.a;
                    if (obj8 == null) {
                        u890.C("layoutTheme");
                        throw null;
                    }
                    nyx.a(0, (wux) obj8, apo.r(-121918785, new hl11((Object) xatVar, obj6, obj5, (byte) 15), x340Var15), x340Var15, 3072, 5);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 10:
                float fFloatValue = ((Number) obj).floatValue();
                x340 x340Var16 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var16.d(fFloatValue) ? 4 : 2;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    nyn1.s(fFloatValue, ((pu41) ((ven0) obj5).getValue()).b, (qim0) null, ((ru41) obj6).b, x340Var17, iIntValue8 & 14);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 11:
                b0k b0kVar2 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                b0k b0kVar3 = (x340) b0kVar2;
                if (b0kVar3.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    wq61 wq61Var = (wq61) obj5;
                    ((ga51) obj6).e(wq61Var.b, wq61Var.c, wq61Var.d, null, b0kVar3, 520);
                } else {
                    b0kVar3.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    String strQ = tro1.q((sq61) obj6, x340Var19, 0);
                    if (strQ == null) {
                        x340Var19.i0(983734905);
                    } else {
                        x340Var19.i0(983734906);
                        uwo1.f(pno1.f(strQ, ((fa51) obj5).c, x340Var19), (qim0) null, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var19, 0, 0, 4094);
                    }
                    x340Var19.r(false);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 13:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                jmr0 jmr0Var = (jmr0) obj5;
                eso1.h(oi7.a(Uri.parse(((xcv) obj6).f), (gw70) null, (xb10) null, (yqi1) null, jmr0Var, jmr0Var, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar4, 2359296, 0, 130974), new jsl(cwl1.o0(b0kVar4, 2131955158)), (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar4, 0, 508);
                return rih1Var;
            case 14:
                x340 x340Var20 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    cx cxVar = (cx) obj5;
                    otw.c((es00) obj6, new ds00(2, cxVar.c, cxVar.b), (qim0) null, (ipb1) null, x340Var21, 6, 12);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var22 = (b0k) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    otw.c((r9g) obj6, new q9g(((fli0) obj5).a), (qim0) null, (ipb1) null, x340Var23, 6, 12);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    otw.c((hx) obj6, new gx(2, ((cx) obj5).b), (qim0) null, (ipb1) null, x340Var25, 6, 12);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var26 = (b0k) obj2;
                int iIntValue14 = ((Number) obj3).intValue();
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    otw.c((fw3) obj6, new dw3(((cx) obj5).h), (qim0) null, (ipb1) null, x340Var27, 6, 12);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue15 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    otw.c((ff8) obj6, new df8(((cx) obj5).g), (qim0) null, (ipb1) null, x340Var29, 6, 12);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj3).intValue();
                uwo1.e(((ze71) obj6).b.a(((xe71) obj5).f), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return rih1Var;
            case 20:
                x340 x340Var30 = (b0k) obj2;
                int iIntValue16 = ((Number) obj3).intValue();
                t7q0 t7q0Var = ((dp71) obj5).b;
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    String uri = t7q0Var.getUri();
                    t7q0Var.getClass();
                    otw.c((mxf0) obj6, new jxf0(uri, t7q0Var instanceof g7q0, true), (qim0) null, (ipb1) null, x340Var31, 0, 12);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var32 = (b0k) obj2;
                int iIntValue17 = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var33).b;
                    qim0 qim0VarX = uyn1.x(nim0Var, 4.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarY = too1.y(qim0VarX, lhc.g(x340Var33).e);
                    cvx cvxVar2 = cbx.b(x340Var33).b;
                    iu30 iu30Var3 = (iu30) obj6;
                    mw71 mw71Var = (mw71) obj5;
                    mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var33, 0);
                    int iHashCode2 = Long.hashCode(x340Var33.T);
                    xos0 xos0VarM2 = x340Var33.m();
                    qim0 qim0VarE2 = zr7.E(x340Var33, qim0VarY);
                    hzj.A.getClass();
                    if (x340Var33.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var33.m0();
                    if (x340Var33.S) {
                        x340Var33.l(n4kVar);
                    } else {
                        x340Var33.v0();
                    }
                    nko1.H(mbhVarA, x340Var33, y580.O0);
                    nko1.H(xos0VarM2, x340Var33, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var33, y580.R0);
                    nko1.F(x340Var33);
                    nko1.H(qim0VarE2, x340Var33, y580.Y);
                    uwo1.e(cwl1.o0(x340Var33, 2131962400), u291.f(nim0Var, 1.0f), cbx.d(x340Var33).h, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var33, 48, 0, 1768);
                    rqo1.g(6, 0, x340Var33, u291.f(nim0Var, 1.0f));
                    x340Var33.i0(1655912219);
                    for (mw71 mw71Var2 : mw71.f) {
                        boolean zG4 = x340Var33.g(iu30Var3) | x340Var33.e(mw71Var2.ordinal());
                        Object objT4 = x340Var33.T();
                        if (zG4 || objT4 == m4cVar) {
                            objT4 = new fh61(iu30Var3, mw71Var2, (byte) 19);
                            x340Var33.s0(objT4);
                        }
                        gbx gbxVar = new gbx(z50Var, (Function0) objT4);
                        boolean zE = x340Var33.e(mw71Var2.ordinal()) | x340Var33.e(mw71Var.ordinal());
                        Object objT5 = x340Var33.T();
                        if (zE || objT5 == m4cVar) {
                            objT5 = new c861(mw71Var2, mw71Var, (byte) 18);
                            x340Var33.s0(objT5);
                        }
                        jto1.b(s161.b(nim0Var, true, (iu30) objT5), (uvx) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, mw71Var2 == mw71Var ? ihj.b : null, (xu30) null, (xu30) null, apo.r(978321815, new u451(mw71Var2, (byte) 26), x340Var33), x340Var33, 0, 196608, 28606);
                    }
                    x340Var33.r(false);
                    x340Var33.r(true);
                } else {
                    x340Var33.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                r6p1.l((j681) obj6, (String) obj5, (b0k) obj2, 0);
                return rih1Var;
            case 23:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                zg81 zg81Var = (zg81) obj6;
                vvx.a(new k681(zg81Var, (wg81) obj5, (byte) 6), apo.r(-758913408, new og81(zg81Var, (ug81) obj), b0kVar5), b0kVar5, 48);
                return rih1Var;
            case 24:
                ((Number) obj3).intValue();
                ((pt) obj6).e((li81) obj5, (qim0) null, (b0k) obj2, 8, 2);
                return rih1Var;
            case 25:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                ti81 ti81Var = (ti81) obj6;
                String str2 = ti81Var.c;
                if (str2 == null && (str2 = ti81Var.a) == null) {
                    str2 = "";
                }
                String str3 = str2;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str3, (qim0) obj5, cbx.d(b0kVar6).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar6, 0, 0, 1720);
                return rih1Var;
            case 26:
                x340 x340Var34 = (b0k) obj2;
                ((Number) obj3).intValue();
                ti81 ti81Var2 = (ti81) obj6;
                if (ti81Var2.i) {
                    x340 x340Var35 = x340Var34;
                    x340Var35.i0(276263851);
                    x340Var35.r(false);
                } else {
                    x340 x340Var36 = x340Var34;
                    x340Var36.i0(276220606);
                    rqo1.g(0, 1, x340Var36, (qim0) null);
                    x340Var36.r(false);
                }
                ((pt) obj5).e(ti81Var2.h, u291.f(nim0Var, 1.0f), x340Var34, 8, 0);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj3).intValue();
                i9p1.q((vu30) obj6, (vu30) obj5, (qim0) null, (b0k) obj2, 0, 4);
                return rih1Var;
            case 28:
                return a(obj, obj2, obj3);
            default:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strA = ((x991) obj6).a.a(((w991) obj5).b);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar4 = cbx.a;
                uwo1.e(strA, qim0VarF2, cbx.d(b0kVar7).h, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar7, 0, 0, 1768);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rt11(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
