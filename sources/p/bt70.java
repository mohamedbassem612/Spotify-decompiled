package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bt70 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt70(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        lnm lnmVar;
        tob1 tob1Var;
        hdn0 hdn0Var;
        ys70 ys70Var;
        n1x n1xVar;
        l0x0 l0x0Var;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        int i;
        pr90 as90Var;
        pr90 pr90Var;
        pr90 ez90Var;
        pr90 pr90Var2;
        int i2;
        Object obj5;
        String string;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                ys70 ys70Var2 = (ys70) obj2;
                int iIntValue = ((Number) obj4).intValue();
                nl9 nl9Var = (nl9) obj6;
                ArrayList arrayList = ys70Var2.b;
                int i3 = ys70Var2.c;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1262885528);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                Object objH = objT;
                if (objT == m4cVar) {
                    objH = bb00.h(i3, x340Var);
                }
                hdn0 hdn0Var2 = (hdn0) objH;
                Object objT2 = x340Var.T();
                Object obj7 = objT2;
                if (objT2 == m4cVar) {
                    xfh0 xfh0Var = (xfh0) o7h.t0(i3, arrayList);
                    String str = xfh0Var != null ? xfh0Var.f : null;
                    hrr0 hrr0VarQ = v8r.q(str != null ? str : "");
                    x340Var.s0(hrr0VarQ);
                    obj7 = hrr0VarQ;
                }
                tob1 tob1Var2 = (ven0) obj7;
                Object objT3 = x340Var.T();
                Object obj8 = objT3;
                if (objT3 == m4cVar) {
                    hrr0 hrr0VarQ2 = v8r.q(null);
                    x340Var.s0(hrr0VarQ2);
                    obj8 = hrr0VarQ2;
                }
                tob1 tob1Var3 = (ven0) obj8;
                Object objT4 = x340Var.T();
                Object obj9 = objT4;
                if (objT4 == m4cVar) {
                    hrr0 hrr0VarQ3 = v8r.q(Boolean.TRUE);
                    x340Var.s0(hrr0VarQ3);
                    obj9 = hrr0VarQ3;
                }
                tob1 tob1Var4 = (ven0) obj9;
                Object objT5 = x340Var.T();
                Object obj10 = objT5;
                if (objT5 == m4cVar) {
                    hrr0 hrr0VarQ4 = v8r.q(Boolean.TRUE);
                    x340Var.s0(hrr0VarQ4);
                    obj10 = hrr0VarQ4;
                }
                ven0 ven0Var = (ven0) obj10;
                ven0 ven0VarK = f4p1.k(((qkh0) nl9Var.t).b, (iac0) null, x340Var, 7);
                if (ys70Var2.e != null) {
                    x340Var.i0(1291307213);
                    String str2 = (String) tob1Var2.getValue();
                    boolean zI = x340Var.i(nl9Var);
                    Object objT6 = x340Var.T();
                    if (zI || objT6 == m4cVar) {
                        lnmVar = null;
                        objT6 = new at70(nl9Var, tob1Var2, tob1Var3, (lnm) null, (byte) 0);
                        x340Var.s0(objT6);
                    } else {
                        lnmVar = null;
                    }
                    qxd0.t(str2, x340Var, (vu30) objT6);
                    x340Var.r(false);
                } else {
                    lnmVar = null;
                    tob1Var3 = tob1Var3;
                    x340Var.i0(1291596474);
                    x340Var.r(false);
                }
                String str3 = (String) tob1Var2.getValue();
                boolean zI2 = x340Var.i(nl9Var);
                Object objT7 = x340Var.T();
                if (zI2 || objT7 == m4cVar) {
                    objT7 = new at70(nl9Var, tob1Var2, ven0Var, lnmVar, (byte) 1);
                    x340Var.s0(objT7);
                }
                qxd0.t(str3, x340Var, (vu30) objT7);
                boolean zI3 = ((((iIntValue & 112) ^ 48) > 32 && x340Var.g(ys70Var2)) || (iIntValue & 48) == 32) | x340Var.i(nl9Var);
                Object objT8 = x340Var.T();
                if (zI3 || objT8 == m4cVar) {
                    tob1Var = tob1Var4;
                    hdn0Var = hdn0Var2;
                    objT8 = new pov(ys70Var2, nl9Var, hdn0Var, tob1Var2, tob1Var, (lnm) null);
                    ys70Var = ys70Var2;
                    tob1Var2 = tob1Var2;
                    x340Var.s0(objT8);
                } else {
                    ys70Var = ys70Var2;
                    tob1Var = tob1Var4;
                    hdn0Var = hdn0Var2;
                }
                jjm0Var.a((zu30) objT8, x340Var, (iIntValue << 3) & 112);
                zs70 zs70Var = new zs70(ys70Var.a, arrayList, ((err0) hdn0Var).s(), (String) tob1Var2.getValue(), (String) tob1Var3.getValue(), ys70Var.e, ((Boolean) tob1Var.getValue()).booleanValue() && !((Boolean) ven0VarK.getValue()).booleanValue(), ((Boolean) ven0Var.getValue()).booleanValue());
                x340Var.r(false);
                return zs70Var;
            case 1:
                hv70 hv70Var = (hv70) obj2;
                kyd kydVar = (kyd) obj4;
                if (!hv70Var.e || (n1xVar = hv70Var.f) == null || (l0x0Var = ((wu70) obj6).Z) == null) {
                    return null;
                }
                l0x0Var.o(new z00(wgo1.x(n1xVar), gho1.r(n1xVar), kydVar.a));
                return null;
            case 2:
                ug3 ug3Var = (ug3) obj6;
                return new dv70((kly0) ug3Var.b, (ViewGroup) obj3, new zi50(ug3Var, (byte) 26), (Context) obj2, true);
            case 3:
                ((Number) obj3).intValue();
                return new mvk0(new uvk0(((j780) obj6).a));
            case 4:
                ((Number) obj3).intValue();
                ynb0 ynb0Var = ((cb0) obj6).b;
                pb80 pb80Var = ((qb80) obj2).a;
                if (pb80Var instanceof ob80) {
                    fyk0 fyk0Var = (fyk0) ynb0Var.get();
                    fyk0Var.getClass();
                    return new dyk0(fyk0Var, (byte) 0);
                }
                if (!(pb80Var instanceof nb80)) {
                    eg.o();
                    return null;
                }
                fyk0 fyk0Var2 = (fyk0) ynb0Var.get();
                fyk0Var2.getClass();
                return new dyk0(fyk0Var2, (byte) 1);
            case 5:
                ((Number) obj3).intValue();
                return new h0m0(new uqk0(((lik1) ((rt01) obj6).c).a, (r6h1) obj4));
            case 6:
                jjm0 jjm0Var2 = (jjm0) obj;
                jh80 jh80Var = (jh80) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(-1587662040);
                rwj rwjVar = (rwj) obj6;
                boolean zI4 = x340Var2.i(rwjVar);
                Object objT9 = x340Var2.T();
                Object obj11 = objT9;
                if (zI4 || objT9 == m4cVar2) {
                    vd2 vd2Var = new vd2(rwjVar, (lnm) null, (byte) 18);
                    x340Var2.s0(vd2Var);
                    obj11 = vd2Var;
                }
                jjm0Var2.a((zu30) obj11, x340Var2, (iIntValue2 << 3) & 112);
                x340Var2.i0(-1859597404);
                z740 z740Var = new z740(((ij81) rwjVar.e).b, jh80Var.a, jh80Var.b);
                boolean zI5 = x340Var2.i(rwjVar) | x340Var2.i(z740Var);
                Object objT10 = x340Var2.T();
                Object obj12 = objT10;
                if (zI5 || objT10 == m4cVar2) {
                    lqv lqvVar = new lqv(rwjVar, z740Var, (lnm) null, (byte) 29);
                    x340Var2.s0(lqvVar);
                    obj12 = lqvVar;
                }
                nh80 nh80Var = (nh80) yto.p(mh80.a, jh80Var, (vu30) obj12, x340Var2, iIntValue2 & 112).getValue();
                x340Var2.r(false);
                x340Var2.r(false);
                return nh80Var;
            case 7:
                pal0 pal0Var = (pal0) obj;
                si80 si80Var = (si80) obj4;
                r6h1 r6h1Var = pal0Var.a;
                y6h1 y6h1Var = pal0Var.b;
                if (si80Var instanceof qi80) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                } else if (si80Var instanceof mi80) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("submit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_message", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!si80Var.equals(oi80.a)) {
                        if (si80Var instanceof ji80) {
                            vi80 vi80Var = ((xi80) obj6).b;
                            if (!vi80Var.equals(ti80.a)) {
                                if (vi80Var.equals(ui80.a)) {
                                    x6h1 x6h1VarC2 = y6h1Var.c();
                                    x6h1VarC2.i.add(new a7h1("mic_button", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC2.j = false;
                                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                                } else {
                                    eg.o();
                                }
                            }
                        } else if (!si80Var.equals(ki80.a) && !(si80Var instanceof ri80) && !(si80Var instanceof pi80) && !(si80Var instanceof li80) && !si80Var.equals(ni80.a)) {
                            eg.o();
                        }
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("stop_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 8:
                qal0 qal0Var = (qal0) obj;
                ky80 ky80Var = (ky80) obj2;
                iy80 iy80Var = (iy80) obj4;
                bz80 bz80Var = (bz80) obj6;
                vz80 vz80Var = bz80Var.b;
                r6h1 r6h1Var2 = qal0Var.a;
                y6h1 y6h1Var2 = qal0Var.b;
                boolean z = ky80Var.i;
                if (iy80Var instanceof ux80) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("dj_icon", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ky80Var.c)), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                } else if (iy80Var instanceof ey80) {
                    if (z && !bz80Var.h.e()) {
                        x6h1 x6h1VarC5 = y6h1Var2.c();
                        x6h1VarC5.i.add(new a7h1("text_box", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                    } else if (z || ky80Var.g) {
                        x6h1 x6h1VarC6 = y6h1Var2.c();
                        x6h1VarC6.i.add(new a7h1("text_box", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        y6h1 y6h1VarA = x6h1VarC6.a();
                        String str4 = bz80.Q0;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC7 = y6h1Var2.c();
                        x6h1VarC7.i.add(new a7h1("text_box", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", vz80Var.b)), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else if (iy80Var instanceof zx80) {
                    x6h1 x6h1VarC8 = y6h1Var2.c();
                    x6h1VarC8.i.add(new a7h1("microphone", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", vz80Var.b)), x6h1VarC8.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(iy80Var instanceof cy80)) {
                        if (!(iy80Var instanceof dy80) && !(iy80Var instanceof hy80) && !(iy80Var instanceof wx80) && !(iy80Var instanceof xx80) && !(iy80Var instanceof fy80) && !(iy80Var instanceof gy80) && !(iy80Var instanceof yx80) && !(iy80Var instanceof ay80) && !(iy80Var instanceof by80) && !(iy80Var instanceof vx80)) {
                            eg.o();
                        }
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("text_box", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_message", 1, b7xVar), x6h1VarC9.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 9:
                pnb1 pnb1Var = (pnb1) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i = iIntValue3 | ((iIntValue3 & 8) == 0 ? x340Var3.g(pnb1Var) : x340Var3.i(pnb1Var) ? 4 : 2);
                } else {
                    i = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i |= x340Var3.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i & 1, (i & 147) != 146)) {
                    pnb1Var.getClass();
                    m190 m190Var = (m190) obj6;
                    lcc.j(pnb1Var, m190Var.a.a, iu30Var, m190Var.e, x340Var4, (i << 3) & 896);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 10:
                return new vh((Context) obj2, (ViewGroup) obj3, (bs0) obj6, (iu30) obj4);
            case 11:
                yr90 yr90Var = (yr90) obj2;
                vr90 vr90Var = (vr90) obj3;
                cs90 cs90Var = (cs90) obj6;
                if (!(yr90Var instanceof wr90)) {
                    CompletableEmpty completableEmpty = CompletableEmpty.a;
                    completableEmpty.getClass();
                    return completableEmpty;
                }
                int iOrdinal = vr90Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        as90Var = new as90(cs90Var, yr90Var, vr90Var, (byte) 1);
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        pr90Var = new pr90(cs90Var, (byte) 1);
                    }
                    return new CompletableFromAction(new kur(pr90Var, (byte) 1)).h(new od30(vr90Var, (byte) 24)).o(Functions.h);
                }
                as90Var = new as90(cs90Var, yr90Var, vr90Var, (byte) 0);
                pr90Var = as90Var;
                return new CompletableFromAction(new kur(pr90Var, (byte) 1)).h(new od30(vr90Var, (byte) 24)).o(Functions.h);
            case 12:
                cz90 cz90Var = (cz90) obj2;
                zy90 zy90Var = (zy90) obj3;
                cs90 cs90Var2 = (cs90) obj6;
                if (!(cz90Var instanceof az90)) {
                    CompletableEmpty completableEmpty2 = CompletableEmpty.a;
                    completableEmpty2.getClass();
                    return completableEmpty2;
                }
                int iOrdinal2 = zy90Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        ez90Var = new ez90(cs90Var2, cz90Var, zy90Var, (byte) 1);
                    } else {
                        if (iOrdinal2 != 2) {
                            eg.o();
                            return null;
                        }
                        pr90Var2 = new pr90(cs90Var2, (byte) 3);
                    }
                    return new CompletableFromAction(new kur(pr90Var2, (byte) 2)).h(new od30(zy90Var, (byte) 25)).o(Functions.h);
                }
                ez90Var = new ez90(cs90Var2, cz90Var, zy90Var, (byte) 0);
                pr90Var2 = ez90Var;
                return new CompletableFromAction(new kur(pr90Var2, (byte) 2)).h(new od30(zy90Var, (byte) 25)).o(Functions.h);
            case 13:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                iys0 iys0Var = ((vta0) obj).a;
                String strConcat = "spotify:prosup-text:".concat(nhc1.W(URLEncoder.encode(iys0Var.e, "UTF-8"), "+", "%20"));
                String str5 = iys0Var.g;
                String str6 = str5 == null ? "" : str5;
                String str7 = iys0Var.k;
                return new b2m0(str6, Integer.valueOf(((wta0) obj6).a), str7 == null ? "" : str7, strConcat, r6h1Var3);
            case 14:
                d4n d4nVar = (d4n) obj;
                int iIntValue4 = ((Number) obj4).intValue();
                d4nVar.getClass();
                ljo1.d(d4nVar, ((yva0) obj6).a, (iu30) obj2, (b0k) obj3, (iIntValue4 << 3) & 896);
                return rih1Var;
            case 15:
                s8w s8wVar = (s8w) obj;
                int iIntValue5 = ((Number) obj4).intValue();
                s8wVar.getClass();
                xyn1.e(s8wVar, ((cwa0) obj6).c, (iu30) obj2, (b0k) obj3, (iIntValue5 << 3) & 896);
                return rih1Var;
            case 16:
                hxa0 hxa0Var = (hxa0) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                jxa0 jxa0Var = (jxa0) obj6;
                xk xkVar = jxa0Var.d;
                if (jxa0Var.b.d instanceof xxa0) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(1571865035);
                    hxa0Var.getClass();
                    blo1.f(hxa0Var, xkVar, jxa0Var.e, (qim0) null, iu30Var2, x340Var6, (iIntValue6 << 9) & 57344);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(1572100077);
                    hxa0Var.getClass();
                    zko1.g(hxa0Var, xkVar, jxa0Var.e, (qim0) null, iu30Var2, x340Var7, (iIntValue6 << 9) & 57344);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 17:
                svr0 svr0Var = (svr0) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var8 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                if ((iIntValue7 & 6) == 0) {
                    i2 = (x340Var8.g(svr0Var) ? 4 : 2) | iIntValue7;
                } else {
                    i2 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i2 |= x340Var8.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var9 = x340Var8;
                if (!x340Var9.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var9.b0();
                    return rih1Var;
                }
                qdh1 qdh1Var = svr0Var.b;
                if (u890.j(qdh1Var, kdh1.a)) {
                    x340Var9.i0(569467753);
                    ujo1.g(iu30Var3, x340Var9, (i2 >> 3) & 14);
                    x340Var9.r(false);
                    return rih1Var;
                }
                if (u890.j(qdh1Var, odh1.a)) {
                    x340Var9.i0(569578981);
                    dko1.k((qim0) null, x340Var9, 0);
                    x340Var9.r(false);
                    return rih1Var;
                }
                if (!u890.j(qdh1Var, ldh1.a)) {
                    throw p3d1.k(x340Var9, 1680936761, false);
                }
                x340Var9.i0(569669098);
                String str8 = svr0Var.c;
                if (str8 == null || ihc1.y0(str8)) {
                    hhg1.n("childId should never be null or blank if the managed account was successfully created");
                    return null;
                }
                ljo1.i(svr0Var.a, svr0Var.c, ((qxa0) obj6).g, iu30Var3, (qim0) null, x340Var9, (i2 << 6) & 7168);
                x340Var9.r(false);
                return rih1Var;
            case 18:
                mya0 mya0Var = (mya0) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                oya0 oya0Var = (oya0) obj6;
                yxa0 yxa0Var = mya0Var.e;
                yig1 yig1Var = mya0Var.b;
                if (yxa0Var instanceof xxa0) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(-778109138);
                    String str9 = oya0Var.f.f(new gl(yig1Var)).a;
                    thg1 thg1Var = oya0Var.c;
                    iko1.i(mya0Var, thg1Var.d, thg1Var.e, str9, oya0Var.e, iu30Var4, (qim0) null, x340Var11, (iIntValue8 << 12) & 458752);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(-777579224);
                    j0o1.i(mya0Var, cfm0.i("spotify:internal:kid-account-transition:legal-consent:", yig1Var.getValue(), nik1.H3).a, oya0Var.e, iu30Var4, (qim0) null, x340Var12, (iIntValue8 << 6) & 7168);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 19:
                cib0 cib0Var = (cib0) obj;
                iu30 iu30Var5 = (iu30) obj2;
                int iIntValue9 = ((Number) obj4).intValue();
                fib0 fib0Var = (fib0) obj6;
                los losVar = fib0Var.f;
                x340 x340Var13 = (b0k) obj3;
                int i4 = iIntValue9 & 112;
                boolean zI6 = x340Var13.i(fib0Var) | (((i4 ^ 48) > 32 && x340Var13.g(iu30Var5)) || (iIntValue9 & 48) == 32);
                Object objT11 = x340Var13.T();
                if (zI6 != 0 || objT11 == fkj0.X) {
                    obj5 = objT11;
                    vq80 vq80Var = new vq80(fib0Var, iu30Var5, (byte) 14);
                    x340Var13.s0(vq80Var);
                    obj5 = vq80Var;
                }
                obj5 = objT11;
                qxd0.i(losVar, (iu30) obj5, x340Var13);
                lgo1.e(cib0Var, iu30Var5, nim0.a, (zgb0) fib0Var.d.get(), x340Var13, (iIntValue9 & 14) | 384 | i4);
                return rih1Var;
            case 20:
                ((Number) obj3).intValue();
                return new k6m0((l6m0) ((yxb0) obj6).f, 1);
            case 21:
                n8h1 n8h1Var = (n8h1) obj;
                eyb0 eyb0Var = (eyb0) obj3;
                zxb0 zxb0Var = (zxb0) obj4;
                dyb0 dyb0Var = eyb0Var.h;
                i8h1 i8h1Var = (i8h1) ((yxb0) obj6).f;
                if (((n8h1) dyb0Var.b).getClass().isInstance(n8h1Var)) {
                    return (w7h1) ((zu30) dyb0Var.c).J(n8h1Var, i8h1Var, eyb0Var, zxb0Var);
                }
                return null;
            case 22:
                ((Number) obj3).intValue();
                k5m0 k5m0Var = new k5m0(new mjl0(new uqk0((r6h1) obj4, (byte) 4)));
                zec0 zec0Var = ((qec0) obj2).a;
                int i5 = zec0Var != null ? zec0Var.c : 0;
                if (zec0Var == null || (string = ihc1.e1(nhc1.W(zec0Var.b, "tags contains ", "")).toString()) == null) {
                    string = ihc1.e1(nhc1.W((String) ((et90) obj6).e, "tags contains ", "")).toString();
                }
                return new j5m0(k5m0Var, string, Integer.valueOf(i5));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                fgc0 fgc0Var = ((igc0) obj).a;
                String strY = zro1.y(fgc0Var.a);
                r4m0 r4m0Var = (r4m0) ((bs0) obj6).e;
                r4m0Var.getClass();
                return new q4m0(Integer.valueOf(fgc0Var.c), strY, new mjl0(r4m0Var));
            case 24:
                return new yhc0((Context) obj2, (ViewGroup) obj3, (zhc0) obj6);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new b14((Context) obj2, (ViewGroup) obj3, (w2s) obj6, (iu30) obj4);
            case 26:
                ((Number) obj3).intValue();
                yxb0 yxb0Var = (yxb0) obj6;
                String str10 = (String) yxb0Var.e;
                return new u4m0(new mjl0(new mjl0(new v4m0(((n6r0) yxb0Var.d).path(), str10, (r6h1) obj4))), str10);
            case 27:
                ((Number) obj3).intValue();
                String strD = pcf.d(6, ((cbd0) obj6).d, (String) null);
                r6h1 r6h1Var4 = r6h1.c;
                return new hcl0(strD);
            case 28:
                ((Number) obj3).intValue();
                String str11 = ((bgd0) obj6).a;
                r6h1 r6h1Var5 = r6h1.c;
                return new zvk0(str11);
            default:
                ((Number) obj3).intValue();
                bzl0 bzl0Var = (bzl0) ((et90) obj6).e;
                bzl0Var.getClass();
                return new zyl0(bzl0Var);
        }
    }
}
