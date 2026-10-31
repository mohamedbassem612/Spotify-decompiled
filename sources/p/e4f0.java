package p;

import android.view.View;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e4f0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4f0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0162  */
    /* JADX WARN: Code duplicated, block: B:44:0x0167  */
    /* JADX WARN: Code duplicated, block: B:51:0x017b  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    public final Object invoke(Object obj) {
        String str;
        r1f1 q1f1Var;
        vu30 vu30Var;
        p9m p9mVarP;
        ox3 ox3Var;
        ArrayList arrayList;
        c9 c9Var;
        c9 c9VarS;
        dhv0 dhv0Var;
        c9 c9Var2;
        List list;
        boolean z;
        c9 c9VarA;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = 10;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qc40 qc40Var = (qc40) obj;
                if (qc40Var.equals(pc40.a)) {
                    ((f4f0) obj2).a.a(yg8.d);
                    return rih1Var;
                }
                if (qc40Var.equals(oc40.a)) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                dqu dquVar = ((g9f0) obj2).b.c;
                ivb1 ivb1Var = new ivb1(2131957759, 2131957758, 1, 2131957752, "spotify:image:ab671fcc00009256b7cc70ee7bb00967a825348e");
                ivb1 ivb1Var2 = new ivb1(2131957761, 2131957760, 2, 2131957752, "spotify:image:ab671fcc00009256dbbf398619b24f4635946641");
                gys0 gys0Var = (gys0) dquVar.b;
                c9 c9VarS2 = mqo1.s(new ivb1[]{ivb1Var, ivb1Var2, new ivb1(2131957763, 2131957762, 2, gys0Var.a() ? 2131957750 : 2131957751, "spotify:image:ab671fcc0000925657a98faaa3f245c73d236728")});
                return new e9f0(0, (ivb1) o7h.q0(c9VarS2), c9VarS2, gys0Var.a() ? 1 : 2);
            case 2:
                w6e0 w6e0Var = (w6e0) obj2;
                fn31.T(smo1.e((q8n) w6e0Var.b), (o8n) null, 0, new e9c0(w6e0Var, (tv80) obj, (lnm) null, (byte) 20), 3);
                return rih1Var;
            case 3:
                if (((m5j0) obj) instanceof l5j0) {
                    ((bsc0) obj2).invoke();
                }
                return rih1Var;
            case 4:
                n271 n271Var = (n271) obj;
                q1f1 q1f1Var2 = n271Var.c;
                q1f1 q1f1Var3 = q1f1Var2 instanceof q1f1 ? q1f1Var2 : null;
                if (q1f1Var3 != null) {
                    pn71 pn71Var = q1f1Var3.a;
                    cgf0 cgf0Var = pn71Var instanceof cgf0 ? (cgf0) pn71Var : null;
                    str = cgf0Var != null ? cgf0Var.e : null;
                } else {
                    str = null;
                }
                z771 z771Var = n271Var.a;
                int i2 = n271Var.b;
                q1f1Var2.getClass();
                if (q1f1Var2 instanceof r1f1) {
                    q1f1Var = r1f1.a;
                } else if (q1f1Var2 instanceof p1f1) {
                    q1f1Var = p1f1.a;
                } else {
                    if (!(q1f1Var2 instanceof q1f1)) {
                        eg.o();
                        return null;
                    }
                    q1f1Var = new q1f1((cgf0) q1f1Var2.a);
                }
                kgf0 kgf0Var = (kgf0) obj2;
                return new jgf0(z771Var, i2, q1f1Var, kgf0Var.b, kgf0Var.c, 0L, str);
            case 5:
                cas casVar = (a7m0) obj;
                casVar.d = i0f0.R0;
                casVar.e = i0f0.S0;
                casVar.a(z1f0.P0, z1f0.Q0);
                casVar.c = new qn(z1f0.O0, (q8n) obj2, (byte) 7);
                return rih1Var;
            case 6:
                xa5 xa5Var = (xa5) obj;
                if (((jkf0) obj2).a() > ((jkf0) xa5Var.e()).a()) {
                    vu30Var = null;
                    p9mVarP = hm5.P(xa5Var.g(0, irn1.o0(300, 0, (dlv) null, 6)).a(xay.e(2, irn1.o0(300, 0, (dlv) null, 6))), xa5Var.c(0, irn1.o0(300, 0, (dlv) null, 6)).a(xay.f(2, irn1.o0(300, 0, (dlv) null, 6))));
                } else {
                    vu30Var = null;
                    p9mVarP = hm5.P(xa5Var.g(1, irn1.o0(300, 0, (dlv) null, 6)).a(xay.e(2, irn1.o0(300, 0, (dlv) null, 6))), xa5Var.c(1, irn1.o0(300, 0, (dlv) null, 6)).a(xay.f(2, irn1.o0(300, 0, (dlv) null, 6))));
                }
                return xa5Var.a(p9mVarP, hm5.h(2, vu30Var));
            case 7:
                kt91 kt91Var = (kt91) obj2;
                int i3 = ((Boolean) obj).booleanValue() ? 2131957905 : 2131957845;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i3)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i3), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 8:
                ((Number) obj).intValue();
                x6h1 x6h1VarC = ((uel0) obj2).a.c();
                x6h1VarC.i.add(new a7h1("footer_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 9:
                return ((w9u0) obj2).a(new i9u0(((shf0) obj).a)).ignoreElement().d(Observable.empty());
            case 10:
                j7s j7sVar = (j7s) obj2;
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                sjb sjbVar = new sjb((byte) 15);
                cof0 cof0Var = new cof0((t2j0) j7sVar.d);
                ykf0 ykf0Var = (ykf0) j7sVar.c;
                wh71 wh71Var = (wh71) j7sVar.e;
                c8o.l(wh71Var);
                flw0 flw0Var = (flw0) j7sVar.f;
                c8o.l(flw0Var);
                return new u7p0(new xnf0(sjbVar, cof0Var, ykf0Var, wh71Var, (oud) obj, flw0Var, j7sVar.a, j7sVar.b), new f70((byte) 10));
            case 11:
                return t5p1.i(((buf0) obj2).a());
            case 12:
                return ((tuf0) obj2).b;
            case 13:
                jyk0 jyk0Var = (jyk0) obj;
                String str2 = ((cvg1) obj2).e;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("connect_to_remote_device", 1, Collections.singletonMap("remote_device_id", str2)), jyk0Var.a, jyk0Var.b.a, System.currentTimeMillis());
            case 14:
                return new k6r((MainLayoutContentContainerView) obj2, (byte) 21);
            case 15:
                return obj != null ? ((pzf0) obj2).a(obj) : gio1.b((Object) null);
            case 16:
                return (n2g0) obj2;
            case 17:
                ((Number) obj).intValue();
                n8l0 n8l0Var = (n8l0) obj2;
                x6h1 x6h1VarC2 = n8l0Var.b.c();
                x6h1VarC2.i.add(new a7h1("items", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                r6h1 r6h1Var3 = n8l0Var.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var3.a);
                arrayList2.add(y6h1VarA2);
                return new r6h1(arrayList2, r6h1Var3.b);
            case 18:
                int iC = l1d.C(((v8g0) obj2).b);
                if (iC == 0) {
                    ox3Var = ox3.b;
                } else if (iC == 1) {
                    ox3Var = ox3.c;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    ox3Var = ox3.a;
                }
                return new a9g0(ox3Var, false);
            case 19:
                String str3 = (String) obj;
                ahg0 ahg0Var = (ahg0) obj2;
                yge0 yge0Var = ahg0Var.f;
                i8h1 i8h1Var = (i8h1) ((kly0) yge0Var.b).get();
                x6h1 x6h1VarC3 = ((h7l0) yge0Var.c).b.c();
                x6h1VarC3.i.add(new a7h1("explicit_content_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                z710.d(ahg0Var.d, str3, false, 6);
                return rih1Var;
            case 20:
                tnm tnmVar = (tnm) ((ikg0) obj2).b.a.c;
                return new gvj((xqp) ((jly0) tnmVar.e).get(), (yqp) ((jly0) tnmVar.g).get(), (cir0) obj);
            case 21:
                n560 n560Var = (n560) obj;
                Consumer consumer = (Consumer) ((s59) ((eb80) obj2).b).b;
                if (consumer != null) {
                    consumer.accept(new ljg0(n560Var));
                }
                return rih1Var;
            case 22:
                return (Boolean) ((wao0) obj2).invoke((ContextTrack) obj);
            case 23:
                return new kgl0(new ttk0(new ttk0(new lgl0((rrk0) ((j2e0) obj2).c))));
            case 24:
                return ((bsg0) obj2).h;
            case 25:
                ((rs10) obj2).dismiss();
                return rih1Var;
            case 26:
                byte b2 = 1;
                ivg0 ivg0VarZ0 = ((mwg0) obj2).Z0();
                vku vkuVar = ivg0VarZ0.q;
                Set set = s4b1.f;
                iug0 iug0Var = ivg0VarZ0.a;
                String str4 = iug0Var.Y;
                if (uic.x(str4).c == blc0.de) {
                    boolean z2 = ivg0VarZ0.f35p.a == qk1.b;
                    vkuVar.a(ivg0VarZ0.f.c(str4, iug0Var.a, z2).g(new djg0(z2, ivg0VarZ0, b2)).o(Functions.h).subscribe());
                } else {
                    vkuVar.a(j2h1.D(ivg0VarZ0.i, new gvg0(ivg0VarZ0, null, b2)).o(Functions.h).subscribe());
                }
                return rih1Var;
            case 27:
                tnm tnmVar2 = (tnm) ((nwg0) obj2).b.a.c;
                q7r0 q7r0Var = (q7r0) tnmVar2.c;
                iug0 iug0Var2 = ((qwg0) tnmVar2.b).a;
                c8o.m(iug0Var2);
                pwg0 pwg0Var = (pwg0) tnmVar2.d;
                ao0 ao0Var = (ao0) pwg0Var.b.get();
                c8o.l(ao0Var);
                cyg0 cyg0Var = (cyg0) ((jly0) tnmVar2.f).get();
                kly0 kly0Var = pwg0Var.a;
                gw70 gw70Var = (gw70) kly0Var.get();
                c8o.l(gw70Var);
                qr20 qr20Var = (qr20) pwg0Var.c.get();
                c8o.l(qr20Var);
                gw70 gw70Var2 = (gw70) kly0Var.get();
                c8o.l(gw70Var2);
                sw9 sw9Var = new sw9(gw70Var2, -7829368, (byte) 0);
                lug0 lug0Var = (lug0) ((jly0) tnmVar2.g).get();
                kt91 kt91Var2 = (kt91) pwg0Var.d.get();
                c8o.l(kt91Var2);
                dto0 dto0Var = (dto0) pwg0Var.e.get();
                c8o.l(dto0Var);
                luk lukVar = (luk) pwg0Var.h.get();
                c8o.l(lukVar);
                tm4 tm4Var = new tm4(lukVar);
                luk lukVar2 = (luk) pwg0Var.h.get();
                c8o.l(lukVar2);
                return new byg0(q7r0Var, iug0Var2, ao0Var, cyg0Var, gw70Var, qr20Var, sw9Var, lug0Var, kt91Var2, dto0Var, tm4Var, new tm4(lukVar2).a(), (cir0) obj);
            case 28:
                ((qtr) obj).b(new ql6((ezg0) obj2, (lnm) null));
                return rih1Var;
            default:
                f6h0 f6h0Var = (f6h0) obj2;
                x6h0 x6h0Var = f6h0Var.b;
                mr4 mr4Var = f6h0Var.e;
                exg1 exg1Var = f6h0Var.i;
                yrn yrnVar = f6h0Var.j;
                s6h0 s6h0Var = x6h0Var.a;
                List list2 = x6h0Var.g;
                te30 te30Var = x6h0Var.h;
                if (te30Var != null) {
                    ArrayList<qqr0> arrayList3 = te30Var.a;
                    arrayList = new ArrayList(q7h.U(arrayList3, 10));
                    for (qqr0 qqr0Var : arrayList3) {
                        String str5 = qqr0Var.a;
                        String str6 = qqr0Var.b;
                        ArrayList<irr0> arrayList4 = qqr0Var.c;
                        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, i));
                        for (irr0 irr0Var : arrayList4) {
                            arrayList5.add(new iys0((hux) null, 0L, u7h.k, irr0Var.a, irr0Var.c, irr0Var.b, false, false, irr0Var.d, 807));
                            mr4Var = mr4Var;
                        }
                        arrayList.add(new zs80(str5, str6, mqo1.A(arrayList5)));
                        i = 10;
                        mr4Var = mr4Var;
                    }
                } else {
                    arrayList = null;
                }
                mr4 mr4Var2 = mr4Var;
                boolean zY = mr4Var2.y();
                boolean z3 = s6h0Var instanceof m6h0;
                c9 c9Var3 = fg91.b;
                if (z3) {
                    c9VarS = mqo1.s(new d5h0[]{new d5h0(((m6h0) s6h0Var).b, mr4Var2.b() == lr4.b)});
                } else {
                    if (arrayList == null || arrayList.isEmpty() || !zY) {
                        List list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            c9Var = c9Var3;
                        } else {
                            List list4 = list2;
                            ArrayList arrayList6 = new ArrayList(q7h.U(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList6.add(new iys0((hux) null, 0L, u7h.k, (String) it.next(), (String) null, false, false, false, (String) null, 2023));
                            }
                            c9VarS = mqo1.s(new e5h0[]{new e5h0(mqo1.A(arrayList6))});
                        }
                        String strR = y2o1.r(s6h0Var);
                        String str7 = x6h0Var.f;
                        boolean z4 = x6h0Var.i;
                        boolean zA = exg1Var.a();
                        if (x6h0Var.X) {
                            dhv0Var = dhv0.a;
                        } else {
                            dhv0Var = null;
                        }
                        Map mapU = sqg0.U(yrnVar.a);
                        if (arrayList != null || (c9VarA = mqo1.A(arrayList)) == null) {
                            c9Var2 = c9Var3;
                        } else {
                            c9Var2 = c9VarA;
                        }
                        list = list2;
                        if (list != null || list.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return new a6h0(c9Var, strR, false, z4, null, true, str7, new lpu(false, false), null, zA, zh80.a, dhv0Var, false, null, null, mapU, false, false, null, c9Var2, !z, x6h0Var.t, mr4Var2.a(), zY, q1o1.k(mr4Var2), false, 0L, null, null, null, 0L, w7x.a);
                    }
                    c9VarS = mqo1.s(new x4h0[]{new x4h0(mqo1.A(arrayList))});
                }
                c9Var = c9VarS;
                String strR2 = y2o1.r(s6h0Var);
                String str8 = x6h0Var.f;
                boolean z5 = x6h0Var.i;
                boolean zA2 = exg1Var.a();
                if (x6h0Var.X) {
                    dhv0Var = dhv0.a;
                } else {
                    dhv0Var = null;
                }
                Map mapU2 = sqg0.U(yrnVar.a);
                if (arrayList != null) {
                    c9Var2 = c9Var3;
                } else {
                    c9Var2 = c9Var3;
                }
                list = list2;
                if (list != null) {
                    z = true;
                } else {
                    z = true;
                }
                return new a6h0(c9Var, strR2, false, z5, null, true, str8, new lpu(false, false), null, zA2, zh80.a, dhv0Var, false, null, null, mapU2, false, false, null, c9Var2, !z, x6h0Var.t, mr4Var2.a(), zY, q1o1.k(mr4Var2), false, 0L, null, null, null, 0L, w7x.a);
        }
    }
}
