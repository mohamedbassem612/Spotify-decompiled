package p;

import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rvg0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvg0(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        String strK;
        boolean z;
        Collection collection;
        Object n0g0Var;
        boolean z2;
        boolean z3;
        Function0 function0;
        iu30 iu30Var;
        hax haxVar;
        byte b = this.a;
        byte b2 = 9;
        byte b3 = 23;
        nim0 nim0Var = nim0.a;
        vu30 vu30VarR = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                hav0 hav0Var = (hav0) obj;
                long j = ((Offset) obj2).a;
                ((tui1) obj5).a(hav0Var.b, hav0Var.c);
                ven0 ven0Var = (ven0) obj4;
                ven0Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (j >> 32)) + uvg0.g(ven0Var)));
                ven0 ven0Var2 = (ven0) obj3;
                ven0Var2.setValue(Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L)) + uvg0.h(ven0Var2)));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                uvg0.f((fwg0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                i1o1.h((xtb0) obj5, (q1d0) obj4, (String) obj3, (b0k) obj, czo1.p(65));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                p2o1.d((iu30) obj5, (j2e0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                a6h0 a6h0Var = (a6h0) obj4;
                boolean z4 = a6h0Var.d;
                f6h0 f6h0Var = (f6h0) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    idd1 idd1Var = f6h0Var.q;
                    boolean z5 = f6h0Var.r;
                    mr4 mr4Var = f6h0Var.e;
                    n7h0 n7h0Var = (n7h0) idd1Var.getValue();
                    boolean z6 = a6h0Var.c;
                    Collection collection2 = a6h0Var.a;
                    if (z4) {
                        strK = x0d.k(x340Var2, 335199299, 2131958283, x340Var2, false);
                    } else {
                        x340Var2.i0(335297352);
                        x340Var2.r(false);
                        strK = a6h0Var.e;
                    }
                    boolean z7 = a6h0Var.d;
                    boolean z8 = a6h0Var.f;
                    if (z7) {
                        z = true;
                    } else {
                        if (collection2 == null || !collection2.isEmpty()) {
                            Iterator it = collection2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((h5h0) it.next()) instanceof g5h0) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    boolean z9 = !z6;
                    boolean z10 = z;
                    boolean z11 = z6 && a6h0Var.E > 0 && !a6h0Var.z && mr4Var.v();
                    boolean z12 = a6h0Var.z;
                    lg01 lg01Var = z5 ? null : (lg01) f6h0Var.n.getValue();
                    boolean zBooleanValue = ((Boolean) f6h0Var.o.getValue()).booleanValue();
                    if (!z5) {
                        ((ipk1) f6h0Var.h.get()).getClass();
                    }
                    boolean zI = x340Var2.i(f6h0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        collection = collection2;
                        z2 = z7;
                        n0g0Var = new n0g0(0, f6h0Var, f6h0.class, "createRealtimeVoiceHandle", "createRealtimeVoiceHandle()Lcom/spotify/martini/elements/realtimevoice/api/RealtimeVoiceElement$Handle;", 0, (byte) 1);
                        x340Var2.s0(n0g0Var);
                    } else {
                        n0g0Var = objT;
                        collection = collection2;
                        z2 = z7;
                    }
                    Function0 function1 = (nla0) n0g0Var;
                    zh80 zh80Var = a6h0Var.k;
                    if (z5 || a6h0Var.b != null || z4) {
                        z3 = false;
                    } else {
                        if (collection == null || !collection.isEmpty()) {
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((h5h0) it2.next()) instanceof g5h0) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        z3 = true;
                    }
                    String str = a6h0Var.b;
                    boolean zC = f6h0Var.t.c();
                    boolean zX = mr4Var.x();
                    boolean z13 = a6h0Var.j;
                    boolean z14 = f6h0Var.b.d == 2;
                    boolean zBooleanValue2 = ((Boolean) f6h0Var.p.getValue()).booleanValue();
                    boolean zK = mr4Var.k();
                    Uri uri = a6h0Var.C;
                    iu30 iu30Var2 = (iu30) obj3;
                    boolean zI2 = x340Var2.i(f6h0Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new d6h0(f6h0Var, (byte) 0);
                        x340Var2.s0(objT2);
                    }
                    Function0 function2 = (Function0) objT2;
                    boolean zI3 = x340Var2.i(f6h0Var);
                    Object objT3 = x340Var2.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new d6h0(f6h0Var, (byte) 1);
                        x340Var2.s0(objT3);
                    }
                    Function0 function3 = (Function0) objT3;
                    Function0 function4 = function1;
                    boolean zI4 = x340Var2.i(f6h0Var);
                    Object objT4 = x340Var2.T();
                    if (zI4 || objT4 == m4cVar) {
                        objT4 = new d6h0(f6h0Var, (byte) 2);
                        x340Var2.s0(objT4);
                    }
                    i3o1.b(strK, z2, z8, z10, z9, zh80Var, z3, iu30Var2, function2, z11, z9, str, zC, zX, z13, z14, zK, uri, z12, lg01Var, zBooleanValue, function3, false, function4, zBooleanValue2, (Function0) objT4, n7h0Var, x340Var2, 805306368);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((n7h0) obj5).c(czo1.p(1), (b0k) obj, (iu30) obj4, (qim0) obj3);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                l8h0.a((bl80) obj5, (hcx) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var3 = (iu30) obj3;
                mah0 mah0Var = (mah0) obj4;
                bbh0 bbh0Var = (bbh0) obj5;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strT = o4o1.t(bbh0Var, x340Var4);
                    z6x z6xVar = (List) mah0Var.a.get(bbh0Var);
                    if (z6xVar == null) {
                        z6xVar = z6x.a;
                    }
                    String strN0 = cwl1.n0(2131957270, new Object[]{strT, Integer.valueOf(z6xVar.size())}, x340Var4);
                    boolean z15 = mah0Var.d == bbh0Var;
                    boolean zG = x340Var4.g(iu30Var3) | x340Var4.e(bbh0Var.ordinal());
                    Object objT5 = x340Var4.T();
                    if (zG || objT5 == fkj0.X) {
                        objT5 = new eah0(iu30Var3, bbh0Var, (byte) 0);
                        x340Var4.s0(objT5);
                    }
                    o4o1.d(0, strN0, (Function0) objT5, x340Var4, z15);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Object obj6 = fkj0.X;
                axh0 axh0Var = (axh0) obj5;
                cxh0 cxh0Var = (cxh0) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zE = x340Var6.e(axh0Var.a.size());
                    Object objT6 = x340Var6.T();
                    if (zE || objT6 == obj6) {
                        Object obj7 = cxh0Var.c.get(Integer.valueOf(axh0Var.a.size()));
                        if (obj7 == null) {
                            hhg1.n("Required value was null.");
                            return null;
                        }
                        objT6 = (blb0) obj7;
                        x340Var6.s0(objT6);
                    }
                    blb0 blb0Var = (blb0) objT6;
                    boolean zG2 = x340Var6.g(axh0Var);
                    Object objT7 = x340Var6.T();
                    if (zG2 || objT7 == obj6) {
                        objT7 = v8r.q(Boolean.FALSE);
                        x340Var6.s0(objT7);
                    }
                    ven0 ven0Var3 = (ven0) objT7;
                    o0i o0iVar = (o0i) obj4;
                    boolean zG3 = x340Var6.g(ven0Var3);
                    Object objT8 = x340Var6.T();
                    if (zG3 || objT8 == obj6) {
                        objT8 = new abh0(ven0Var3, (byte) 1);
                        x340Var6.s0(objT8);
                    }
                    oto1.c(axh0Var, o0iVar, (iu30) objT8, x340Var6, 64);
                    wat watVar = (wat) x340Var6.k(t4k.h);
                    boolean zG4 = x340Var6.g(watVar);
                    Object objT9 = x340Var6.T();
                    if (zG4 || objT9 == obj6) {
                        objT9 = Float.valueOf(watVar.X0(8.0f));
                        x340Var6.s0(objT9);
                    }
                    float fFloatValue = ((Number) objT9).floatValue();
                    Object objT10 = x340Var6.T();
                    if (objT10 == obj6) {
                        objT10 = new bxh0(fFloatValue);
                        x340Var6.s0(objT10);
                    }
                    bxh0 bxh0Var = (bxh0) objT10;
                    boolean zG5 = x340Var6.g(blb0Var) | x340Var6.g(axh0Var) | x340Var6.i(cxh0Var);
                    Object objT11 = x340Var6.T();
                    if (zG5 || objT11 == obj6) {
                        objT11 = new gnf0(blb0Var, axh0Var, cxh0Var, (byte) 11);
                        x340Var6.s0(objT11);
                    }
                    iu30 iu30Var4 = (iu30) objT11;
                    boolean zI5 = x340Var6.i(cxh0Var) | x340Var6.i(bxh0Var);
                    Object objT12 = x340Var6.T();
                    if (zI5 || objT12 == obj6) {
                        objT12 = new uah0(cxh0Var, bxh0Var, (byte) 4);
                        x340Var6.s0(objT12);
                    }
                    iu30 iu30Var5 = (iu30) objT12;
                    boolean zI6 = x340Var6.i(bxh0Var);
                    Object objT13 = x340Var6.T();
                    if (zI6 || objT13 == obj6) {
                        objT13 = new z6h0(bxh0Var, b2);
                        x340Var6.s0(objT13);
                    }
                    iu30 iu30Var6 = (iu30) objT13;
                    boolean zI7 = x340Var6.i(cxh0Var) | x340Var6.g(ven0Var3) | x340Var6.i(bxh0Var);
                    Object objT14 = x340Var6.T();
                    if (zI7 || objT14 == obj6) {
                        objT14 = new gnf0(cxh0Var, bxh0Var, ven0Var3, (byte) 12);
                        x340Var6.s0(objT14);
                    }
                    dm5.b(iu30Var4, (qim0) null, iu30Var5, iu30Var6, (iu30) objT14, x340Var6, 0, 2);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(34963046, new y46((w5i0) obj5, (n5i0) obj4, (ipb1) obj3, (byte) 4), x340Var8), x340Var8, 3078, 6);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                vno1.d((ctf) obj5, (String) obj4, (Function0) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                boo1.g((String) obj5, (ecx) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    znb0 znb0Var = (znb0) obj5;
                    i091 i091Var = (i091) obj4;
                    iu30 iu30Var7 = (iu30) obj3;
                    if (znb0Var == null) {
                        x340Var10.i0(-1392952328);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-1392952327);
                        otw.c((maa) znb0Var.getValue(), rpo1.w((xfn0) null, i091Var, iu30Var7, x340Var10, 6), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                        x340Var10.r(false);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                mey0 mey0Var = (mey0) obj;
                t810 t810Var = (t810) obj2;
                return aqo1.t(mey0Var, t810Var, umf0.e(t810Var.a, mey0Var), (fza) obj4, (ytp0) obj3, new eei0((vu30) ((umf0) obj5).e, mey0Var, (byte) 2));
            case 14:
                mey0 mey0Var2 = (mey0) obj;
                lei0 lei0Var = (lei0) obj2;
                return aqo1.t(mey0Var2, lei0Var.a, lei0Var.b, (fza) obj5, (ytp0) obj4, new eei0((vu30) ((qlb) obj3).c, mey0Var2, (byte) 3));
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iz0 iz0Var = (iz0) obj3;
                m4c m4cVar2 = fkj0.X;
                lfi0 lfi0Var = (lfi0) obj5;
                iu30 iu30Var8 = (iu30) obj4;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    if (lfi0Var.t != null) {
                        x340Var12.i0(-1835004199);
                        boolean zG6 = x340Var12.g(iu30Var8);
                        Object objT15 = x340Var12.T();
                        if (zG6 || objT15 == m4cVar2) {
                            objT15 = new edi0(iu30Var8, (byte) 8);
                            x340Var12.s0(objT15);
                        }
                        x340Var12.r(false);
                        function0 = (Function0) objT15;
                    } else {
                        x340Var12.i0(-1834953235);
                        x340Var12.r(false);
                        function0 = null;
                    }
                    boolean z16 = iz0Var.b;
                    wcm wcmVar = lfi0Var.k;
                    if (wcmVar == null) {
                        x340Var12.i0(-1834678173);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(-1834678172);
                        vu30VarR = apo.r(-146551662, new q0g0(iz0Var, wcmVar, b3), x340Var12);
                        x340Var12.r(false);
                    }
                    vu30 vu30Var = vu30VarR;
                    boolean z17 = lfi0Var.m;
                    boolean zG7 = x340Var12.g(iu30Var8);
                    Object objT16 = x340Var12.T();
                    if (zG7 || objT16 == m4cVar2) {
                        objT16 = new edi0(iu30Var8, (byte) 7);
                        x340Var12.s0(objT16);
                    }
                    fqo1.s(lfi0Var, z16, z17, (qim0) null, function0, (Function0) objT16, vu30Var, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                fqo1.x((fim0) obj5, (String) obj4, (hfi0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                oii0 oii0Var = (oii0) obj;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj5;
                String str2 = oii0Var.a;
                pii0 pii0VarO = qro1.o(oii0Var, (lii0) obj2);
                boolean zIsEmpty = pii0VarO.b.isEmpty();
                if (zIsEmpty && !atomicBoolean.getAndSet(true)) {
                    iu30 iu30Var9 = (iu30) obj4;
                    if (iu30Var9 != null) {
                        iu30Var9.invoke(str2);
                    }
                } else if (!zIsEmpty && atomicBoolean.getAndSet(false) && (iu30Var = (iu30) obj3) != null) {
                    iu30Var.invoke(str2);
                }
                return pii0VarO;
            case 18:
                ((Number) obj2).intValue();
                kto1.l((joi0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Icon icon = ((Button) obj5).getStyle().getIcon();
                    if (icon == null) {
                        x340Var14.i0(-917177214);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-917177213);
                        y9j0.k(icon, (MessageTemplate) obj4, null, ((gdx) obj3).d, null, 0L, x340Var14, Icon.$stable, 52);
                        x340Var14.r(false);
                    }
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var10 = (iu30) obj3;
                vcj0 vcj0Var = (vcj0) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    rcj0 rcj0Var = (rcj0) ((scj0) obj5).e.get(vcj0Var.a.a);
                    if (rcj0Var == null) {
                        rcj0Var = rcj0.a;
                    }
                    boolean zG8 = x340Var16.g(iu30Var10) | x340Var16.g(vcj0Var);
                    Object objT17 = x340Var16.T();
                    if (zG8 || objT17 == fkj0.X) {
                        objT17 = new dvg0((Object) iu30Var10, (Object) vcj0Var, (byte) 13);
                        x340Var16.s0(objT17);
                    }
                    gyo1.p(rcj0Var, (Function0) objT17, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                htj0.a((vnr0) obj5, (tob1) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                p1p1.s((wvj0) obj5, (iu30) obj4, (xsk) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                b2p1.n((j2i) obj5, (j2i) obj4, (j2i) obj3, (b0k) obj, czo1.p(439));
                return rih1Var;
            case 24:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                iu30 iu30Var11 = (iu30) obj3;
                ven0 ven0Var4 = (ven0) obj4;
                vdk0 vdk0Var = (vdk0) obj5;
                bek0 bek0Var = vdk0Var.b;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pex pexVar = pex.b;
                    lex lexVarZ = yoo1.z(x340Var18);
                    boolean zEquals = bek0Var.equals(wdk0.a);
                    ydk0 ydk0Var = ydk0.a;
                    if (zEquals || bek0Var.equals(xdk0.a) || bek0Var.equals(zdk0.a)) {
                        haxVar = jax.a;
                    } else {
                        if (!bek0Var.equals(ydk0Var)) {
                            eg.o();
                            return null;
                        }
                        haxVar = new hax("Unable to reorder");
                    }
                    hax haxVar2 = haxVar;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    if ((bek0Var instanceof aek0) && !bek0Var.equals(ydk0Var)) {
                        qim0VarF = qim0VarF.then(pqo.h(nim0Var, true));
                    }
                    qim0 qim0Var = qim0VarF;
                    boolean zI8 = x340Var18.i(ven0Var4) | x340Var18.i(vdk0Var) | x340Var18.g(iu30Var11);
                    Object objT18 = x340Var18.T();
                    if (zI8 || objT18 == fkj0.X) {
                        objT18 = new gnf0(vdk0Var, iu30Var11, ven0Var4, (byte) 21);
                        x340Var18.s0(objT18);
                    }
                    poo1.g(false, (iu30) objT18, pexVar, lexVarZ, qim0Var, 0, (qex) null, (String) null, haxVar2, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, c2j.a, x340Var18, 6, 196608, 32480);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    cgj1.n(o0c.H(nim0Var), (vu30) null, (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(-1638617674, new iwf0((wik0) obj5, (kak0) obj4, (tob1) obj3, (byte) 23), x340Var20), x340Var20, 805306368, 510);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    el9 el9Var = (el9) obj3;
                    t3p1.o((kkk0) obj5, (iu30) obj4, (xsk) el9Var.h, (hvj0) el9Var.t, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                x340 x340Var23 = (b0k) obj;
                x340Var23.i0(689981097);
                kjm0 kjm0Var = (kjm0) obj5;
                bpb1 bpb1Var = kjm0Var.b;
                h141 h141Var = (h141) obj4;
                jjm0 jjm0Var = kjm0Var.e;
                j2i j2iVar = (j2i) obj3;
                ven0 ven0VarH = rwq.h(bpb1Var, x340Var23, 0);
                Object objT19 = x340Var23.T();
                if (objT19 == fkj0.X) {
                    objT19 = v8r.q(h141Var.getState());
                    x340Var23.s0(objT19);
                }
                ven0 ven0Var5 = (ven0) objT19;
                mod.b(jfe0.a.a(kjm0Var), apo.r(688314358, new w0f0(j2iVar, jjm0Var, ven0Var5, ven0VarH, (byte) 24), x340Var23), x340Var23, 56);
                Object value = ven0Var5.getValue();
                x340Var23.r(false);
                return value;
            case 28:
                ((Number) obj2).intValue();
                e130.g((pkm0) obj5, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((m0n0) obj5).a((oyx[]) obj4, (j2i) obj3, (b0k) obj, czo1.p(57));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvg0(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
