package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z821 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z821(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:217:0x097c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0991  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        ne31 ne31Var;
        le31 le31Var;
        String str;
        String str2;
        mq70 mq70Var;
        up70 up70VarA;
        io70 io70Var;
        io70 io70Var2;
        w7h1 w7h1Var;
        Object obj5;
        Object mmb1Var;
        l761 l761Var;
        String str3;
        mq70 mq70Var2;
        up70 up70VarA2;
        Object hmb1Var;
        jo70 jo70Var;
        mq70 mq70Var3;
        up70 up70VarA3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        vp70 vp70Var = vp70.c;
        rih1 rih1Var = rih1.a;
        String str4 = null;
        str4 = null;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                xul0 xul0Var = new xul0(Integer.valueOf(((w821) obj).g), ((x821) obj2).a, (r6h1) obj4);
                ((b921) obj6).b = xul0Var;
                return xul0Var;
            case 1:
                ia21 ia21Var = (ia21) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | (x340Var.g(ia21Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    f7p1.c(ia21Var, iu30Var, ((la21) obj6).d, (qim0) null, x340Var2, i & 126);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                vb21 vb21Var = (vb21) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var3.g(vb21Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    h7p1.m(vb21Var, ((yb21) obj6).e, (qim0) null, iu30Var2, x340Var4, (i2 & 14) | ((i2 << 6) & 7168));
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ue21 ue21Var = (ue21) obj2;
                int i3 = ue21Var.c;
                int i4 = ue21Var.d;
                if (i3 != i4) {
                    Completable completableIgnoreElement = ((xbu0) ((dx0) obj6).d).setRepeatMode(i4).ignoreElement();
                    completableIgnoreElement.getClass();
                    return completableIgnoreElement;
                }
                CompletableEmpty completableEmpty = CompletableEmpty.a;
                completableEmpty.getClass();
                return completableEmpty;
            case 4:
                xi21 xi21Var = (xi21) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                bj21 bj21Var = (bj21) obj6;
                int i5 = (iIntValue3 & 6) == 0 ? iIntValue3 | (x340Var5.g(xi21Var) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i5 |= x340Var5.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i5 & 1, (i5 & 147) != 146)) {
                    yla ylaVar = bj21Var.d;
                    xi21Var.getClass();
                    ylaVar.k(xi21Var, bj21Var.e, iu30Var3, x340Var6, ((i5 << 3) & 896) | 3072);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ka31 ka31Var = (ka31) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i6 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? x340Var7.g(ka31Var) : x340Var7.i(ka31Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i6 |= x340Var7.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i6 & 1, (i6 & 147) != 146)) {
                    nyx.a(2, (wux) null, apo.r(361830411, new la31(ka31Var, (oa31) obj6, iu30Var4), x340Var8), x340Var8, 3078, 6);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue5 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                String str5 = ((ke31) obj2).a;
                x340 x340Var9 = (b0k) obj3;
                x340Var9.i0(-1316890674);
                qe31 qe31Var = (qe31) obj6;
                boolean zI = x340Var9.i(qe31Var);
                Object objT = x340Var9.T();
                Object obj7 = objT;
                if (zI || objT == m4cVar) {
                    w63 w63Var = new w63(qe31Var, (lnm) null, (byte) 18);
                    x340Var9.s0(w63Var);
                    obj7 = w63Var;
                }
                jjm0Var.a((zu30) obj7, x340Var9, (iIntValue5 << 3) & 112);
                x340Var9.i0(746167730);
                boolean zG = x340Var9.g(str5);
                Object objT2 = x340Var9.T();
                Object obj8 = objT2;
                if (zG || objT2 == m4cVar) {
                    ay8 ay8VarF = d3p1.F(qe31Var.b, qe31Var.e, str5);
                    x340Var9.s0(ay8VarF);
                    obj8 = ay8VarF;
                }
                i1r i1rVar = (k1r) rwq.h((zob1) obj8, x340Var9, 0).getValue();
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 == null || (le31Var = (le31) i1rVar2.a) == null) {
                    ne31Var = new ne31();
                } else {
                    jo70 jo70Var2 = le31Var.b;
                    zc8 zc8Var = le31Var.a;
                    if (jo70Var2 == null || (io70Var2 = jo70Var2.e) == null) {
                        str = null;
                    } else {
                        str = io70Var2.b;
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                    }
                    if (jo70Var2 == null || (io70Var = jo70Var2.e) == null || (str2 = io70Var.a) == null) {
                        str2 = zc8Var.h;
                    } else {
                        if (ihc1.y0(str2)) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = zc8Var.h;
                        }
                    }
                    xkk1 xkk1Var = le31Var.c;
                    String str6 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a;
                    o6o o6oVar = (o6o) o7h.s0(zc8Var.c.c);
                    if (o6oVar != null) {
                        String str7 = o6oVar.a;
                        if (!ihc1.y0(str7)) {
                            str4 = str7;
                        }
                    }
                    ne31Var = new ne31(str2, str4, str6, str);
                }
                x340Var9.r(false);
                x340Var9.r(false);
                return ne31Var;
            case 7:
                ((Number) obj3).intValue();
                ((Number) obj4).intValue();
                return new j3r(((hws) obj6).invoke(((jh5) obj).b));
            case 8:
                ses0 ses0Var = (ses0) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                int iIntValue7 = ((Number) obj4).intValue();
                Object obj9 = ((jh5) obj).b;
                for (int i7 = 0; i7 < iIntValue7; i7++) {
                    ses0Var.p(iIntValue6 + i7, (jh5) ((y6w0) obj6).invoke(obj9, Integer.valueOf(i7)));
                }
                return rih1Var;
            case 9:
                int iIntValue8 = ((Number) obj3).intValue();
                return new j3r(((y6w0) obj6).invoke(((jh5) obj).b, new ms31((ses0) obj2, iIntValue8, ((Number) obj4).intValue() - iIntValue8)));
            case 10:
                gu31 gu31Var = (gu31) obj;
                ((Number) obj3).intValue();
                uks uksVar = (uks) ((ynb0) ((smp0) obj6).d).get();
                ki90 ki90Var = gu31Var.a;
                return uksVar.a(ki90Var.b).b(ki90Var.a, gu31Var.b, gu31Var.c);
            case 11:
                return new j5l0(Integer.valueOf(((Number) obj3).intValue()), ((fu31) obj).b.b, new jpk0(((ru31) obj6).d, (byte) 0));
            case 12:
                ((Number) obj3).intValue();
                return new g8l0((h8l0) ((yup0) obj6).d);
            case 13:
                m251 m251Var = (m251) obj2;
                z151 z151Var = (j251) obj4;
                z72 z72Var = (z72) obj6;
                e8r0 e8r0Var = (e8r0) z72Var.f;
                bpb1 bpb1Var = (bpb1) z72Var.X;
                y6h1 y6h1Var = ((urk0) z72Var.e).b;
                d8r0 d8r0VarA = e8r0Var.a();
                if (z151Var.equals(c251.b)) {
                    if (((m251) bpb1Var.getValue()).b) {
                        return null;
                    }
                    String str8 = d8r0VarA.b;
                    String str9 = d8r0VarA.a;
                    String str10 = d8r0VarA.e;
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("page", str8, (Integer) null, str10, str9));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else if (z151Var.equals(c251.a)) {
                    String str11 = d8r0VarA.b;
                    String str12 = d8r0VarA.a;
                    String str13 = d8r0VarA.e;
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("page", str11, (Integer) null, str13, str12));
                    x6h1VarC4.j = false;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else if (z151Var instanceof y151) {
                    String str14 = m251Var.a;
                    y151 y151Var = (y151) z151Var;
                    String str15 = y151Var.a;
                    if (u890.j(str14, str15)) {
                        return null;
                    }
                    String str16 = d8r0VarA.b;
                    String str17 = y151Var.b;
                    String str18 = d8r0VarA.e;
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("page", str16, (Integer) null, str18, str17));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                    x6h1VarC9.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", str15 != null ? str15 : "")), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                } else if (z151Var instanceof z151) {
                    String str19 = d8r0VarA.b;
                    String str20 = z151Var.b;
                    String str21 = d8r0VarA.e;
                    x6h1 x6h1VarC10 = y6h1Var.c();
                    x6h1VarC10.i.add(new a7h1("page", str19, (Integer) null, str21, str20));
                    x6h1VarC10.j = false;
                    x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                    x6h1VarC11.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("search", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                } else if (z151Var instanceof a251) {
                    String str22 = d8r0VarA.b;
                    String str23 = d8r0VarA.a;
                    String str24 = d8r0VarA.e;
                    x6h1 x6h1VarC13 = y6h1Var.c();
                    x6h1VarC13.i.add(new a7h1("page", str22, (Integer) null, str24, str23));
                    x6h1VarC13.j = false;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                    x6h1VarC15.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(z151Var instanceof d251)) {
                        eg.o();
                        return null;
                    }
                    d251 d251Var = (d251) z151Var;
                    if (!d251Var.a || !d251Var.b || ((m251) bpb1Var.getValue()).b) {
                        return null;
                    }
                    String str25 = d8r0VarA.b;
                    String str26 = d8r0VarA.a;
                    String str27 = d8r0VarA.e;
                    x6h1 x6h1VarC16 = y6h1Var.c();
                    x6h1VarC16.i.add(new a7h1("page", str25, (Integer) null, str27, str26));
                    x6h1VarC16.j = false;
                    x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                    x6h1VarC17.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                    x6h1VarC18.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 14:
                ((Number) obj3).intValue();
                return new msk0((bqk0) ((smp0) obj6).c);
            case 15:
                r751 r751Var = (r751) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var = r751Var.a;
                return new qvl0(new pvl0(new lvl0(new mjl0(new mjl0(((ufd) obj6).b, d8r0Var.b, d8r0Var.a, d8r0Var.e), ""), (byte) 1), (byte) 1), Integer.valueOf(r751Var.c), r751Var.b.b);
            case 16:
                ((Number) obj3).intValue();
                return new npl0(((n6r0) ((kls0) obj6).c).path(), (r6h1) obj4);
            case 17:
                ((Number) obj3).intValue();
                i4m0 i4m0Var = ((tk51) obj6).a;
                i4m0Var.getClass();
                return new h4m0(i4m0Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                am51 am51Var = (am51) obj6;
                Flowable flowableH = Flowable.h(am51Var.a, am51Var.b, p5x0.t);
                return new FlowableSingleSingle(ydh.f(flowableH, flowableH)).flatMapCompletable(new m021((yl51) obj2, am51Var, (byte) 25));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                qm51 qm51Var = (qm51) obj6;
                Flowable flowableH2 = Flowable.h(qm51Var.a, qm51Var.b, r6x0.t);
                return new FlowableSingleSingle(ydh.f(flowableH2, flowableH2)).flatMapCompletable(new nt21((nm51) obj2, qm51Var, (byte) 19));
            case 20:
                return new b14((Context) obj2, (ViewGroup) obj3, (jjv0) obj6);
            case 21:
                e0g1 e0g1Var = (e0g1) obj3;
                qo51 qo51Var = (qo51) obj6;
                if (e0g1Var instanceof d0g1) {
                    return new CompletableFromAction(new oo51(qo51Var, (byte) 0));
                }
                if (e0g1Var instanceof c0g1) {
                    return new CompletableFromAction(new po51(qo51Var, e0g1Var, (byte) 0));
                }
                if (e0g1Var instanceof b0g1) {
                    return qo51Var.c.a(new i9u0(((b0g1) e0g1Var).a)).ignoreElement().c(new CompletableFromAction(new po51(qo51Var, e0g1Var, (byte) 1)));
                }
                if (e0g1Var instanceof a0g1) {
                    return new CompletableFromAction(new oo51(qo51Var, (byte) 1));
                }
                if (e0g1Var instanceof zzf1) {
                    return new CompletableFromAction(new oo51(qo51Var, (byte) 2));
                }
                eg.o();
                return null;
            case 22:
                return new sxl0(new dsk0(((sv51) obj6).c, (byte) 14), Integer.valueOf(((Number) obj3).intValue()), ((oke) obj).a);
            case 23:
                jjm0 jjm0Var2 = (jjm0) obj;
                k761 k761Var = (k761) obj2;
                int iIntValue9 = ((Number) obj4).intValue();
                x340 x340Var10 = (b0k) obj3;
                x340Var10.i0(1686562777);
                qe31 qe31Var2 = (qe31) obj6;
                boolean zI2 = x340Var10.i(qe31Var2);
                Object objT3 = x340Var10.T();
                if (zI2 || objT3 == fkj0.X) {
                    obj5 = objT3;
                    w63 w63Var2 = new w63(qe31Var2, (lnm) null, (byte) 20);
                    x340Var10.s0(w63Var2);
                    obj5 = w63Var2;
                }
                obj5 = objT3;
                jjm0Var2.a((zu30) obj5, x340Var10, (iIntValue9 << 3) & 112);
                x340Var10.i0(10798269);
                i1r i1rVar3 = (k1r) rwq.h(d3p1.F(qe31Var2.b, qe31Var2.e, k761Var.a), x340Var10, 0).getValue();
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                if (i1rVar4 == null || (l761Var = (l761) i1rVar4.a) == null) {
                    x340Var10.r(false);
                    mmb1Var = rmb1.a;
                } else {
                    jo70 jo70Var3 = l761Var.a;
                    xkk1 xkk1Var2 = l761Var.b;
                    String str28 = (xkk1Var2 == null || (mq70Var2 = xkk1Var2.a) == null || (up70VarA2 = mq70Var2.a(vp70Var)) == null) ? null : up70VarA2.a.a;
                    List list = jo70Var3.d;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str29 = ((ho70) it.next()).a;
                        if (ihc1.y0(str29)) {
                            str29 = null;
                        }
                        if (str29 != null) {
                            arrayList.add(str29);
                        }
                    }
                    String str30 = k761Var.a;
                    zc8 zc8Var2 = l761Var.c;
                    if (zc8Var2 != null) {
                        String str31 = zc8Var2.i;
                        if (ihc1.y0(str31)) {
                            str3 = null;
                        } else {
                            str3 = str31;
                        }
                    } else {
                        str3 = null;
                    }
                    String str32 = jo70Var3.a;
                    String strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
                    mmb1Var = new mmb1(str30, str28, str3, str32, !ihc1.y0(strY0) ? strY0 : null);
                    x340Var10.r(false);
                }
                x340Var10.r(false);
                return mmb1Var;
            case 24:
                jjm0 jjm0Var3 = (jjm0) obj;
                j861 j861Var = (j861) obj2;
                int iIntValue10 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                String str33 = j861Var.a;
                x340 x340Var11 = (b0k) obj3;
                x340Var11.i0(2096039766);
                ve51 ve51Var = (ve51) obj6;
                boolean zI3 = x340Var11.i(ve51Var) | x340Var11.i(j861Var);
                Object objT4 = x340Var11.T();
                Object obj10 = objT4;
                if (zI3 || objT4 == m4cVar2) {
                    l861 l861Var = new l861(ve51Var, j861Var, (lnm) null);
                    x340Var11.s0(l861Var);
                    obj10 = l861Var;
                }
                jjm0Var3.a((zu30) obj10, x340Var11, (iIntValue10 << 3) & 112);
                x340Var11.i0(383221490);
                boolean zG2 = x340Var11.g(str33);
                Object objT5 = x340Var11.T();
                Object obj11 = objT5;
                if (zG2 || objT5 == m4cVar2) {
                    ay8 ay8VarF2 = d3p1.F(ve51Var.b, ve51Var.d, str33);
                    x340Var11.s0(ay8VarF2);
                    obj11 = ay8VarF2;
                }
                i1r i1rVar5 = (k1r) rwq.h((zob1) obj11, x340Var11, 0).getValue();
                i1r i1rVar6 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                k861 k861Var = i1rVar6 != null ? (k861) i1rVar6.a : null;
                if (k861Var == null || (jo70Var = k861Var.a) == null) {
                    x340Var11.r(false);
                    hmb1Var = nmb1.a;
                } else {
                    xkk1 xkk1Var3 = k861Var.b;
                    hmb1Var = new hmb1((xkk1Var3 == null || (mq70Var3 = xkk1Var3.a) == null || (up70VarA3 = mq70Var3.a(vp70Var)) == null) ? null : up70VarA3.a.a, jo70Var.a, ve51Var.c ? 3 : null);
                    x340Var11.r(false);
                }
                x340Var11.r(false);
                return hmb1Var;
            case 25:
                hc61 hc61Var = (hc61) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                ((res) obj6).g = r6h1Var;
                opl0 opl0Var = new opl0(r6h1Var, (byte) 5);
                List list2 = hc61Var.c;
                String strL = ioo1.L(list2);
                mb61 mb61VarW = ioo1.w(list2);
                String str34 = mb61VarW != null ? mb61VarW.e : null;
                return new mwl0(new mjl0(opl0Var, strL, str34 != null ? str34 : ""), hc61Var.b.getId());
            case 26:
                vc61 vc61Var = (vc61) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                ((cm0) obj6).i = r6h1Var2;
                opl0 opl0Var2 = new opl0(r6h1Var2, (byte) 5);
                List list3 = vc61Var.c;
                String strL2 = ioo1.L(list3);
                mb61 mb61VarW2 = ioo1.w(list3);
                String str35 = mb61VarW2 != null ? mb61VarW2.e : null;
                return new mwl0(new mjl0(opl0Var2, strL2, str35 != null ? str35 : ""), vc61Var.b.getId());
            case 27:
                bd61 bd61Var = (bd61) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                ((et90) obj6).d = r6h1Var3;
                return new mwl0(new mjl0(new opl0(r6h1Var3, (byte) 5), bd61Var.c, bd61Var.d), bd61Var.b);
            case 28:
                aml0 aml0Var = (aml0) obj;
                if (rm61.a[((om61) obj4).ordinal()] == 1) {
                    String str36 = (String) ((kls0) obj6).c;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str36 != null ? str36 : "")), aml0Var.a, aml0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            default:
                return new b14((Context) obj2, (au8) obj6, (iu30) obj4);
        }
    }
}
