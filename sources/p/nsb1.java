package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nsb1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsb1(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:305:0x0b0e  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int length;
        vnd1 vnd1Var;
        w7h1 w7h1Var;
        int i5;
        jfe jfeVarA;
        CompletableFromAction completableFromAction;
        rof1 rof1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        int i6 = 5;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                boolean z = false;
                ksb1 ksb1Var = (ksb1) obj;
                lsb1 lsb1Var = (lsb1) obj2;
                ((Number) obj3).intValue();
                mjl0 mjl0Var = new mjl0(new c4m0((r6h1) obj4, (byte) 7));
                qsb1 qsb1Var = (qsb1) obj5;
                xsb1 xsb1Var = ksb1Var.b;
                switch (xsb1Var.ordinal()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 8;
                        break;
                    case 3:
                        i = 7;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 1;
                        break;
                    default:
                        n57.s("Unable to determine the stats tile id, defaulting to Identifier.TOP_TRACKS");
                        i = 8;
                        break;
                }
                Integer numValueOf = Integer.valueOf(ksb1Var.c.a());
                int iOrdinal = xsb1Var.ordinal();
                int i7 = 4;
                if (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) {
                    boolean zB = qsb1Var.d.b();
                    btb1 btb1Var = ksb1Var.a;
                    atb1 atb1Var = btb1Var instanceof atb1 ? (atb1) btb1Var : null;
                    boolean z2 = xsb1Var != xsb1.g ? !(atb1Var == null || !atb1Var.k) : !(atb1Var == null || !atb1Var.l);
                    Integer num = lsb1Var.b;
                    if (num != null && num.intValue() > 0) {
                        z = true;
                    }
                    if (!zB) {
                        i7 = 1;
                    } else if (!z2 || !z) {
                        if (z2) {
                            i7 = 5;
                        } else {
                            i7 = z ? 2 : 3;
                        }
                    }
                } else {
                    i7 = 6;
                }
                return new m6m0(mjl0Var, i, numValueOf, i7);
            case 1:
                jjm0 jjm0Var = (jjm0) obj;
                rwb1 rwb1Var = (rwb1) obj2;
                int iIntValue = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                String str2 = rwb1Var.a;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1322147687);
                jd6 jd6Var = (jd6) obj5;
                k1r k1rVar = (k1r) rwq.g(d3p1.F((d0r) jd6Var.b, jd6Var.c, rwb1Var), (Object) null, (o8n) null, x340Var, 48, 2).getValue();
                if (k1rVar == null) {
                    str = null;
                } else {
                    if (!(k1rVar instanceof i1r)) {
                        k1rVar = null;
                    }
                    if (k1rVar != null) {
                        fxb1 fxb1Var = ((pyb1) u890.k(k1rVar, (d0r) null, (n4r) null)).a.f;
                        fxb1 fxb1Var2 = fxb1Var instanceof fxb1 ? fxb1Var : null;
                        if (fxb1Var2 != null) {
                            str = fxb1Var2.c;
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                }
                boolean zG = x340Var.g(str) | x340Var.g(str2);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    if (str != null) {
                        e821 e821Var = (e821) jd6Var.f;
                        objT = h5p1.s(((zau0) e821Var.a).b, hu20.e((bpb1) e821Var.c, new o681(3, (lnm) null, (byte) 4)), (bpb1) e821Var.d, new kw0(str2, str, (lnm) null, (byte) 17));
                    } else {
                        objT = new huz(Boolean.FALSE, (byte) 10);
                    }
                    x340Var.s0(objT);
                }
                ven0 ven0VarG = rwq.g((mr20) objT, Boolean.FALSE, (o8n) null, x340Var, 48, 2);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT2);
                }
                c9n c9nVar = (c9n) objT2;
                boolean zI = x340Var.i(jd6Var) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.g(rwb1Var)) || (iIntValue & 48) == 32) | x340Var.i(c9nVar);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    l14 l14Var = new l14(jd6Var, rwb1Var, c9nVar, (lnm) null, (byte) 9);
                    x340Var.s0(l14Var);
                    objT3 = l14Var;
                }
                jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
                swb1 swb1Var = new swb1(str, ((Boolean) ven0VarG.getValue()).booleanValue());
                x340Var.r(false);
                return swb1Var;
            case 2:
                ((Number) obj3).intValue();
                return (fyk0) ((cb0) obj5).b.get();
            case 3:
                return new hzb1((Context) obj2, (w2s) obj5, (iu30) obj4);
            case 4:
                ((Number) obj3).intValue();
                bzl0 bzl0Var = (bzl0) ((kls0) obj5).c;
                bzl0Var.getClass();
                return new azl0(bzl0Var);
            case 5:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                iys0 iys0Var = ((zvc1) obj).a;
                String strConcat = "spotify:prosup-text:".concat(nhc1.W(URLEncoder.encode(iys0Var.e, "UTF-8"), "+", "%20"));
                String str3 = iys0Var.g;
                String str4 = str3 == null ? "" : str3;
                String str5 = iys0Var.k;
                return new b2m0(str4, Integer.valueOf(((awc1) obj5).a), str5 == null ? "" : str5, strConcat, r6h1Var);
            case 6:
                ((Number) obj3).intValue();
                return new f6m0(((txc1) obj5).c);
            case 7:
                c9d1 c9d1Var = (c9d1) obj2;
                ((Number) obj3).intValue();
                hyl0 hyl0Var = ((d9d1) obj5).a;
                hyl0Var.getClass();
                x6h1 x6h1VarC = hyl0Var.b.c();
                x6h1VarC.i.add(new a7h1("share_cards_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str6 = c9d1Var.c;
                Integer numValueOf2 = Integer.valueOf(c9d1Var.d);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("share_card", str6, numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                r6h1 r6h1Var3 = hyl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var3.a);
                arrayList.add(y6h1VarA2);
                return new nyl0(new opl0(new r6h1(arrayList, r6h1Var3.b), (byte) 22), c9d1Var.a.a(), Integer.valueOf(c9d1Var.b));
            case 8:
                jjm0 jjm0Var2 = (jjm0) obj;
                k9d1 k9d1Var = (k9d1) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                smp0 smp0Var = (smp0) obj5;
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(948767639);
                Object objT4 = x340Var2.T();
                m4c m4cVar2 = fkj0.X;
                if (objT4 == m4cVar2) {
                    objT4 = v8r.q(k9d1Var);
                    x340Var2.s0(objT4);
                }
                ven0 ven0Var = (ven0) objT4;
                boolean zI2 = x340Var2.i(ven0Var) | x340Var2.i(k9d1Var);
                Object objT5 = x340Var2.T();
                if (zI2 || objT5 == m4cVar2) {
                    objT5 = new kwb1(k9d1Var, ven0Var, (lnm) null, (byte) 5);
                    x340Var2.s0(objT5);
                }
                qxd0.t(k9d1Var, x340Var2, (vu30) objT5);
                boolean zI3 = x340Var2.i(ven0Var) | x340Var2.i(smp0Var);
                Object objT6 = x340Var2.T();
                if (zI3 || objT6 == m4cVar2) {
                    objT6 = new jvu(smp0Var, ven0Var, (lnm) null, (byte) 5);
                    x340Var2.s0(objT6);
                }
                jjm0Var2.a((zu30) objT6, x340Var2, (iIntValue2 << 3) & 112);
                k9d1 k9d1Var2 = (k9d1) ven0Var.getValue();
                x340Var2.r(false);
                return k9d1Var2;
            case 9:
                jjm0 jjm0Var3 = (jjm0) obj;
                ccd1 ccd1Var = (ccd1) obj2;
                int iIntValue3 = ((Number) obj4).intValue();
                x340 x340Var3 = (b0k) obj3;
                x340Var3.i0(119253720);
                ven0 ven0VarH = rwq.h(((fcd1) ((ecd1) obj5).c).b, x340Var3, 0);
                boolean z3 = (((iIntValue3 & 112) ^ 48) > 32 && x340Var3.g(ccd1Var)) || (iIntValue3 & 48) == 32;
                Object objT7 = x340Var3.T();
                if (z3 || objT7 == fkj0.X) {
                    objT7 = new wd2(ccd1Var, (lnm) null, (byte) 15);
                    x340Var3.s0(objT7);
                }
                jjm0Var3.a((zu30) objT7, x340Var3, (iIntValue3 << 3) & 112);
                dcd1 dcd1Var = new dcd1(((Boolean) ven0VarH.getValue()).booleanValue());
                x340Var3.r(false);
                return dcd1Var;
            case 10:
                boolean z4 = true;
                sud1 sud1Var = (sud1) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var4 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var4.g(sud1Var) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var4.i(iu30Var) ? 32 : 16;
                }
                if ((i2 & 147) == 146) {
                    z4 = false;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i2 & 1, z4)) {
                    ((xud1) ((uud1) obj5).a.get()).b(sud1Var, iu30Var, (qim0) null, x340Var5, i2 & 126);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 11:
                shm0 shm0Var = (shm0) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var6 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i3 = iIntValue5 | (x340Var6.g(shm0Var) ? 4 : 2);
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i3 |= x340Var6.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(i3 & 1, (i3 & 147) != 146)) {
                    o1p1.s(shm0Var, ((jwd1) obj5).d, iu30Var2, (qim0) null, x340Var7, ((i3 << 3) & 896) | (i3 & 14));
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 12:
                xtk0 xtk0Var = (xtk0) obj;
                String str7 = (String) ((kls0) obj5).c;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), xtk0Var.a, r6h1.c, System.currentTimeMillis());
            case 13:
                jjm0 jjm0Var4 = (jjm0) obj;
                uce1 uce1Var = (uce1) obj2;
                int iIntValue6 = ((Number) obj4).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var8 = (b0k) obj3;
                x340Var8.i0(946935810);
                smp0 smp0Var2 = (smp0) obj5;
                ven0 ven0VarH2 = rwq.h(((ede1) smp0Var2.d).b, x340Var8, 0);
                boolean zG2 = x340Var8.g((dde1) ven0VarH2.getValue());
                Object objT8 = x340Var8.T();
                if (zG2 || objT8 == m4cVar3) {
                    objT8 = yv91.a(new x0e1(uce1Var, ven0VarH2, (byte) 2));
                    x340Var8.s0(objT8);
                }
                tob1 tob1Var = (tob1) objT8;
                boolean zI4 = x340Var8.i(smp0Var2) | x340Var8.i(uce1Var);
                Object objT9 = x340Var8.T();
                if (zI4 || objT9 == m4cVar3) {
                    objT9 = new xzu0(smp0Var2, uce1Var, (lnm) null);
                    x340Var8.s0(objT9);
                }
                jjm0Var4.a((zu30) objT9, x340Var8, (iIntValue6 << 3) & 112);
                vce1 vce1Var = new vce1(uce1Var, (q061) tob1Var.getValue());
                x340Var8.r(false);
                return vce1Var;
            case 14:
                jjm0 jjm0Var5 = (jjm0) obj;
                sde1 sde1Var = (sde1) obj2;
                int iIntValue7 = ((Number) obj4).intValue();
                String str8 = sde1Var.a;
                List list = sde1Var.j;
                int i8 = sde1Var.c;
                String str9 = sde1Var.e;
                x340 x340Var9 = (b0k) obj3;
                x340Var9.i0(679445951);
                yxb0 yxb0Var = (yxb0) obj5;
                Object objT10 = x340Var9.T();
                m4c m4cVar4 = fkj0.X;
                if (objT10 == m4cVar4) {
                    objT10 = qxd0.M((q8n) yxb0Var.e, x340Var9);
                    x340Var9.s0(objT10);
                }
                c9n c9nVar2 = (c9n) objT10;
                boolean zG3 = x340Var9.g(str8);
                Object objT11 = x340Var9.T();
                if (zG3 || objT11 == m4cVar4) {
                    bnj0 bnj0Var = (bnj0) yxb0Var.d;
                    kge kgeVar = (kge) bnj0Var.c;
                    FlowableMap flowableMap = (FlowableMap) bnj0Var.b;
                    vbm[] vbmVarArr = q601.a;
                    x010 x010Var = new x010(kgeVar, new kge(flowableMap), new yuy(str8, (lnm) null, (byte) 1), (byte) 1);
                    x340Var9.s0(x010Var);
                    objT11 = x010Var;
                }
                Long l = (Long) rwq.g((mr20) objT11, (Object) null, (o8n) null, x340Var9, 48, 2).getValue();
                Integer numValueOf3 = l != null ? Integer.valueOf((int) l.longValue()) : null;
                if (numValueOf3 != null) {
                    int iIntValue8 = numValueOf3.intValue();
                    int iC = l1d.C(sde1Var.i);
                    if (iC != 0) {
                        if (iC != 1) {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                        } else if (iIntValue8 >= i8) {
                            length = str9.length();
                        }
                    } else if (iIntValue8 >= sde1Var.d) {
                        length = str9.length();
                    } else if (iIntValue8 < i8 || list.isEmpty()) {
                        length = iIntValue8 >= i8 ? str9.length() : 0;
                    } else {
                        length = ((fx31) list.get(hxo1.o(list, iIntValue8, ude1.b))).b;
                        int length2 = str9.length();
                        if (length > length2) {
                            length = length2;
                        }
                    }
                    i4 = length;
                } else {
                    i4 = 0;
                }
                boolean zI5 = x340Var9.i(sde1Var) | x340Var9.i(yxb0Var) | x340Var9.i(c9nVar2);
                Object objT12 = x340Var9.T();
                if (zI5 || objT12 == m4cVar4) {
                    objT12 = new w63(sde1Var, yxb0Var, c9nVar2, (lnm) null);
                    x340Var9.s0(objT12);
                }
                jjm0Var5.a((zu30) objT12, x340Var9, (iIntValue7 << 3) & 112);
                String str10 = sde1Var.b;
                String str11 = sde1Var.e;
                boolean z5 = sde1Var.h;
                int i9 = sde1Var.i;
                z0e1 z0e1Var = sde1Var.f;
                tde1 tde1Var = new tde1(str10, str11, i4, z5, i9, z0e1Var.a, z0e1Var.b, sde1Var.g, sde1Var.c);
                x340Var9.r(false);
                return tde1Var;
            case 15:
                Context context = (Context) obj2;
                ViewGroup viewGroup = (ViewGroup) obj3;
                iu30 iu30Var3 = (iu30) obj4;
                switch (((fpq) ((dfm) obj5).e).a) {
                    case 0:
                        vnd1Var = new vnd1(context, viewGroup);
                        break;
                    default:
                        vnd1Var = new vnd1(context, viewGroup);
                        break;
                }
                return new vh(vnd1Var, iu30Var3);
            case 16:
                ((Number) obj3).intValue();
                return ((zke1) obj5).e;
            case 17:
                jjm0 jjm0Var6 = (jjm0) obj;
                bue1 bue1Var = (bue1) obj2;
                int iIntValue9 = ((Number) obj4).intValue();
                ecd1 ecd1Var = (ecd1) obj5;
                x340 x340Var10 = (b0k) obj3;
                x340Var10.i0(153940941);
                Object objT13 = x340Var10.T();
                m4c m4cVar5 = fkj0.X;
                if (objT13 == m4cVar5) {
                    objT13 = v8r.q(new nue1());
                    x340Var10.s0(objT13);
                }
                ven0 ven0Var2 = (ven0) objT13;
                Object objT14 = x340Var10.T();
                if (objT14 == m4cVar5) {
                    objT14 = v8r.q((Object) null);
                    x340Var10.s0(objT14);
                }
                ven0 ven0Var3 = (ven0) objT14;
                if (!bue1Var.equals(ven0Var3.getValue())) {
                    bue1 bue1Var2 = (bue1) ven0Var3.getValue();
                    ven0Var3.setValue(bue1Var);
                    if ((!(((nue1) ven0Var2.getValue()).d instanceof z061) && !(((nue1) ven0Var2.getValue()).d instanceof c161)) || bue1Var2 == null || bue1Var.e != bue1Var2.e || !u890.j(bue1Var.f, bue1Var2.f)) {
                        ven0Var2.setValue(mue1.R((nue1) ven0Var2.getValue(), new l00(bue1Var.b, bue1Var.c, bue1Var.d, bue1Var.e, bue1Var.f, bue1Var.g, bue1Var.h)).a);
                    }
                }
                boolean zI6 = x340Var10.i(ven0Var2) | x340Var10.i(ecd1Var);
                Object objT15 = x340Var10.T();
                if (zI6 || objT15 == m4cVar5) {
                    objT15 = new cj81(ven0Var2, ecd1Var, (lnm) null);
                    x340Var10.s0(objT15);
                }
                jjm0Var6.a((zu30) objT15, x340Var10, (iIntValue9 << 3) & 112);
                nue1 nue1Var = (nue1) ven0Var2.getValue();
                x340Var10.r(false);
                return nue1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                tml0 tml0Var = (tml0) obj;
                k2f1 k2f1Var = (k2f1) obj4;
                z2f1 z2f1Var = (z2f1) obj5;
                r6h1 r6h1Var4 = tml0Var.a;
                y6h1 y6h1Var = tml0Var.b;
                if (k2f1Var instanceof f2f1) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1Var4, System.currentTimeMillis());
                } else if (k2f1Var instanceof h2f1) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("find_clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC4.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(k2f1Var instanceof i2f1)) {
                        eg.o();
                        return null;
                    }
                    if (z2f1Var.Y) {
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("text_filter_input", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC5.a(), r6h1Var4, System.currentTimeMillis());
                    z2f1Var.Y = true;
                }
                return w7h1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                n8f1 n8f1Var = (n8f1) obj;
                ((Number) obj3).intValue();
                l6m0 l6m0Var = (l6m0) ((z72) obj5).Y;
                if (n8f1Var instanceof s8f1) {
                    i5 = 4;
                } else {
                    if (!(n8f1Var instanceof o8f1)) {
                        eg.o();
                        return null;
                    }
                    i5 = 2;
                }
                return new k6m0(l6m0Var, i5);
            case 20:
                int iIntValue10 = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue11 = ((Number) obj4).intValue();
                m4c m4cVar6 = fkj0.X;
                b0k b0kVar = (x340) ((b0k) obj3);
                b0kVar.i0(1442467537);
                Integer numValueOf4 = Integer.valueOf(iIntValue10);
                lcf1 lcf1Var = (lcf1) obj5;
                boolean zI7 = b0kVar.i(lcf1Var);
                Object objT16 = b0kVar.T();
                if (zI7 || objT16 == m4cVar6) {
                    objT16 = new ibf1(lcf1Var, (byte) 1);
                    b0kVar.s0(objT16);
                }
                qxd0.i(numValueOf4, (iu30) objT16, b0kVar);
                jia jiaVar = (jia) ((tob1) lcf1Var.f).getValue();
                if (jiaVar == null) {
                    b0kVar.i0(1402751304);
                    b0kVar.r(false);
                    jfeVarA = null;
                } else {
                    b0kVar.i0(-1063128615);
                    jfeVarA = jiaVar.a(iIntValue10, iIntValue11 & 126, b0kVar, zBooleanValue);
                    b0kVar.r(false);
                }
                if (jfeVarA == null) {
                    b0kVar.i0(-1063126457);
                    Object objT17 = b0kVar.T();
                    if (objT17 == m4cVar6) {
                        objT17 = mno1.a(-2, 0, 6);
                        b0kVar.s0(objT17);
                    }
                    jfeVarA = (jfe) objT17;
                    boolean zI8 = b0kVar.i(jfeVarA);
                    Object objT18 = b0kVar.T();
                    if (zI8 || objT18 == m4cVar6) {
                        objT18 = new zw11(jfeVarA, (byte) 16);
                        b0kVar.s0(objT18);
                    }
                    qxd0.i(rih1Var, (iu30) objT18, b0kVar);
                } else {
                    b0kVar.i0(-1063129340);
                }
                b0kVar.r(false);
                jfe jfeVar = (jfe) lcf1Var.e;
                boolean zI9 = b0kVar.i(lcf1Var) | b0kVar.i(jfeVarA);
                Object objT19 = b0kVar.T();
                if (zI9 || objT19 == m4cVar6) {
                    objT19 = new q721(lcf1Var, jfeVarA, (lnm) null, (byte) 25);
                    b0kVar.s0(objT19);
                }
                qxd0.s(jfeVarA, jfeVar, (vu30) objT19, b0kVar);
                b0kVar.r(false);
                return jfeVarA;
            case 21:
                wff1 wff1Var = (wff1) obj;
                ((Number) obj3).intValue();
                l6m0 l6m0Var2 = (l6m0) ((pt) obj5).h;
                if (!(wff1Var instanceof agf1)) {
                    if (!(wff1Var instanceof xff1)) {
                        eg.o();
                        return null;
                    }
                    i6 = 3;
                }
                return new k6m0(l6m0Var2, i6);
            case 22:
                wgf1 wgf1Var = (wgf1) ((lbq) ((vgf1) obj5).d.a.b).b;
                htr htrVar = (htr) wgf1Var.c.get();
                c8o.l(htrVar);
                lzn0 lzn0Var = (lzn0) wgf1Var.f.get();
                c8o.l(lzn0Var);
                r6h1 r6h1Var5 = r6h1.c;
                yok0 yok0Var = new yok0((byte) 6);
                i8h1 i8h1Var = (i8h1) wgf1Var.g.get();
                c8o.l(i8h1Var);
                return new ygf1((LayoutInflater) obj2, (ViewGroup) obj3, new pgf1(htrVar, lzn0Var, new vnd1(yok0Var, i8h1Var, (byte) 26)));
            case 23:
                im0 im0Var = (im0) obj5;
                w9u0 w9u0Var = (w9u0) im0Var.e;
                Flowable flowable = (Flowable) im0Var.d;
                Flowable flowable2 = im0Var.b;
                int iOrdinal2 = ((ckf1) obj3).ordinal();
                if (iOrdinal2 == 0) {
                    FlowableSingleSingle flowableSingleSingle = new FlowableSingleSingle(ydh.f(flowable2, flowable2));
                    flowable.getClass();
                    return Single.zip(flowableSingleSingle.map(i2x0.Q0), new FlowableSingleSingle(new FlowableTake(flowable)), new up41(im0Var, (byte) 27)).flatMap(h2x0.S0).flatMapCompletable(new c681(new cmd1(flowableSingleSingle, im0Var, (byte) 25), (byte) 22)).c(w9u0Var.a(new l9u0()).ignoreElement());
                }
                if (iOrdinal2 == 1) {
                    return Single.zip(new FlowableSingleSingle(ydh.f(flowable2, flowable2)).map(f2x0.T0), new FlowableSingleSingle(ydh.f(flowable, flowable)), new q881(im0Var, (byte) 21)).flatMapCompletable(e2x0.T0).c(w9u0Var.a(new n9u0()).ignoreElement());
                }
                eg.o();
                return null;
            case 24:
                ((Number) obj3).intValue();
                qmf1 qmf1Var = (qmf1) obj5;
                return new x0m0(qmf1Var.d.c, qmf1Var.e.a);
            case 25:
                mof1 mof1Var = (mof1) obj2;
                hof1 hof1Var = (hof1) obj3;
                tqw tqwVar = (tqw) obj4;
                dpf1 dpf1Var = (dpf1) obj5;
                if (!u890.j(mof1Var.l, ((nof1) obj).a())) {
                    CompletableEmpty completableEmpty = CompletableEmpty.a;
                    completableEmpty.getClass();
                    return completableEmpty;
                }
                int iOrdinal3 = hof1Var.ordinal();
                if (iOrdinal3 == 0) {
                    completableFromAction = new CompletableFromAction(new apf1(mof1Var, tqwVar, dpf1Var, (byte) 0));
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    if (u890.j(mof1Var.k, "spotify:local-files")) {
                        completableFromAction = new CompletableFromAction(new dkb1(tqwVar, dpf1Var, (byte) 5));
                    } else {
                        completableFromAction = mof1Var.g ? new CompletableFromAction(new dkb1(mof1Var, dpf1Var, (byte) 6)) : new CompletableFromAction(new apf1(mof1Var, tqwVar, dpf1Var, (byte) 1));
                    }
                }
                return completableFromAction;
            case 26:
                pof1 pof1Var = (pof1) obj2;
                ((Number) obj4).intValue();
                x340 x340Var11 = (b0k) obj3;
                x340Var11.i0(-1398641884);
                boolean zG4 = x340Var11.g(pof1Var);
                ujo ujoVar = (ujo) obj5;
                Object objT20 = x340Var11.T();
                if (zG4 || objT20 == fkj0.X) {
                    objT20 = d3p1.F(ujoVar.b, (o3r) ujoVar.e, pof1Var);
                    x340Var11.s0(objT20);
                }
                ven0 ven0VarH3 = rwq.h((zob1) objT20, x340Var11, 0);
                k1r k1rVar2 = (k1r) ven0VarH3.getValue();
                k1rVar2.getClass();
                if (k1rVar2 instanceof i1r) {
                    rof1Var = new rof1((fof1) u890.k((k1r) ven0VarH3.getValue(), (d0r) null, (n4r) null));
                } else {
                    k1r k1rVar3 = (k1r) ven0VarH3.getValue();
                    k1rVar3.getClass();
                    rof1Var = k1rVar3 instanceof h1r ? qof1.a : sof1.a;
                }
                x340Var11.r(false);
                return rof1Var;
            case 27:
                return new wc3((Context) obj2, (dx0) obj5, (char) 0);
            case 28:
                ((Number) obj3).intValue();
                return new k6m0(((grf1) obj5).c, 5);
            default:
                ((Number) obj3).intValue();
                return new kul0(((ile1) ((et90) obj5).c).a());
        }
    }
}
