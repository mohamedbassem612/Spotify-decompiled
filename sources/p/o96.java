package p;

import android.view.View;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o96 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(ckd0 ckd0Var, String str, boolean z, String str2, Function0 function0) {
        super(1);
        this.a = (byte) 8;
        this.c = ckd0Var;
        this.d = str;
        this.b = z;
        this.e = str2;
        this.f = function0;
    }

    public final Object invoke(Object obj) {
        rm70 rm70Var;
        krw jrwVar;
        String str;
        String str2;
        String str3;
        l7h1 l7h1VarA;
        int i = 0;
        t480 t480VarP = null;
        byte b = 2;
        switch (this.a) {
            case 0:
                e261 e261Var = (e261) obj;
                ven0 ven0Var = (ven0) this.f;
                ven0 ven0Var2 = (ven0) this.c;
                String str4 = (String) this.d;
                b261.q(e261Var, new af5(str4));
                b261.n(e261Var, (String) this.e);
                if (this.b) {
                    b261.s(e261Var, false);
                    b261.j(e261Var, new ma0(ven0Var2, (byte) 17));
                    b261.D(e261Var, new xj0(ven0Var2, (byte) 19));
                    b261.e(e261Var, new xj0(ven0Var2, (byte) 20));
                } else {
                    b261.s(e261Var, true);
                    b261.j(e261Var, ng5.O0);
                    b261.D(e261Var, new xj0(ven0Var, (byte) 21));
                    b261.e(e261Var, new n96(str4, ven0Var, (byte) 0));
                }
                return rih1.a;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((ven0) this.c).setValue(bool);
                mbm1 mbm1Var = ((a6d) this.d).e;
                Object obj2 = this.e;
                if (this.b && zBooleanValue) {
                    i = 1;
                }
                synchronized (mbm1Var) {
                    LinkedHashSet linkedHashSet = mbm1Var.d;
                    if (i != 0) {
                        linkedHashSet.add(obj2);
                    } else {
                        linkedHashSet.remove(obj2);
                    }
                }
                ((iu30) this.f).invoke(new rwz(zBooleanValue));
                return rih1.a;
            case 2:
                List list = (List) this.e;
                ((rtb0) obj).e(list.size(), new kwd(list, (byte) 14), new kwd(list, (byte) 15), new j2i(2039820996, new ymh(list, list, (String) this.d, this.b, (oih) this.c, (iu30) this.f), true));
                return rih1.a;
            case 3:
                ((Number) obj).longValue();
                String str5 = (String) this.d;
                fie1 fie1VarW = this.b ? p9p1.w(str5, (String) this.e) : null;
                tjj1 tjj1VarU = rwo1.u(str5);
                ((ayh) this.c).m0(new u4k((String) this.d, fie1VarW, tjj1VarU != null ? Integer.valueOf(tjj1VarU.a) : null, tjj1VarU != null ? Integer.valueOf(tjj1VarU.b) : null, (Map) this.f));
                return rih1.a;
            case 4:
                r6h1 r6h1Var = r6h1.c;
                rrk0 rrk0Var = new rrk0((byte) 15);
                cp31 cp31Var = (cp31) this.c;
                dg30 dg30Var = (dg30) cp31Var.d;
                pbh0 pbh0Var = new pbh0(dg30Var, 0);
                pbh0Var.f(2131962953);
                ((uh3) pbh0Var).a.f = dg30Var.getString(2131962950, (String) this.d);
                pbh0Var.d(2131962952, new h7t(cp31Var, rrk0Var, (String) this.e, this.b, (String) this.f)).c(2131962951, new ln5(cp31Var, rrk0Var, (byte) 6)).create().show();
                return rih1.a;
            case 5:
                zeu zeuVar = (zeu) this.e;
                fn31.T(cto1.q((dg30) zeuVar.a), (o8n) null, 0, new lru(zeuVar, (String) this.d, (lik1) this.c, this.b, (fbp1) this.f, (tv80) obj, (lnm) null), 3);
                return rih1.a;
            case 6:
                h6t h6tVar = (h6t) obj;
                Function0 function0 = (Function0) this.d;
                iu30 iu30Var = (iu30) this.e;
                y2s y2sVar = new y2s();
                iu30Var.invoke(y2sVar);
                ArrayList arrayList = (ArrayList) y2sVar.a.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    hrw hrwVar = (irw) obj3;
                    if (!(hrwVar instanceof hrw)) {
                        arrayList2.add(hrwVar);
                    } else if (arrayList2.isEmpty() || !(o7h.A0(arrayList2) instanceof grw)) {
                        hrw hrwVar2 = hrwVar;
                        qtw qtwVar = hrwVar2.a;
                        lu8 lu8Var = hrwVar2.b;
                        Integer numValueOf = Integer.valueOf(i);
                        iu30 iu30Var2 = hrwVar2.d;
                        k7f k7fVar = hrwVar2.c;
                        w0h1.o(2, k7fVar);
                        arrayList2.add(new grw(p7h.O(new uqw[]{new uqw(qtwVar, lu8Var, numValueOf, function0, iu30Var2, k7fVar)})));
                    } else {
                        ArrayList arrayList3 = ((grw) o7h.A0(arrayList2)).a;
                        hrw hrwVar3 = hrwVar;
                        qtw qtwVar2 = hrwVar3.a;
                        lu8 lu8Var2 = hrwVar3.b;
                        Integer numValueOf2 = Integer.valueOf(i);
                        iu30 iu30Var3 = hrwVar3.d;
                        k7f k7fVar2 = hrwVar3.c;
                        w0h1.o(2, k7fVar2);
                        arrayList3.add(new uqw(qtwVar2, lu8Var2, numValueOf2, function0, iu30Var3, k7fVar2));
                    }
                    i = i2;
                    function0 = function0;
                }
                Function0 function1 = function0;
                ArrayList<krw> arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (true) {
                    byte b2 = 23;
                    if (!it.hasNext()) {
                        t8r0 t8r0Var = (t8r0) this.c;
                        vu30 vu30Var = (vu30) this.f;
                        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                        for (krw krwVar : arrayList4) {
                            if (krwVar instanceof krw) {
                                rm70Var = new rm70();
                                rm70Var.y(2);
                                rm70Var.C(krwVar.a);
                            } else {
                                if (!(krwVar instanceof jrw)) {
                                    eg.o();
                                    return null;
                                }
                                rm70Var = new rm70();
                                rm70Var.y(2);
                                if (t8r0Var != null) {
                                    ((ArrayList) t8r0Var.a).add(new d4e(rm70Var, (byte) 23));
                                }
                                c9s c9sVar = new c9s(new p811(), new tus(new zeu(((jrw) krwVar).a, new w3w(vu30Var, rm70Var, b)), (byte) 2), (byte) 17);
                                h6tVar.b.add(c9sVar);
                                if (h6tVar.a) {
                                    View view = h6tVar.d;
                                    view.getClass();
                                    c9sVar.onViewAttachedToWindow(view);
                                }
                            }
                            arrayList5.add(rm70Var);
                        }
                        return new m5k(wdu0.t, (List) new gy((byte) 21, this.b).invoke(arrayList5));
                    }
                    grw grwVar = (irw) it.next();
                    if (grwVar instanceof grw) {
                        jrwVar = new krw(grwVar.a);
                    } else {
                        if (!(grwVar instanceof frw)) {
                            if (grwVar instanceof hrw) {
                                eg.m("The static item should already be grouped.");
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        frw frwVar = (frw) grwVar;
                        yo50 yo50Var = frwVar.a;
                        if (yo50Var instanceof xo50) {
                            jrwVar = new jrw(Flowable.F(((xo50) yo50Var).a).t(Functions.a).J(new gmt(frwVar, function1, b2)));
                        } else {
                            if (!(yo50Var instanceof wo50)) {
                                eg.o();
                                return null;
                            }
                            jrwVar = new jrw(q601.b(new ipr(rqt0.u(((wo50) yo50Var).a), frwVar, function1, (byte) 8)));
                        }
                    }
                    arrayList4.add(jrwVar);
                }
                break;
            case 7:
                rtb0 rtb0Var = (rtb0) obj;
                ldo ldoVar = (ldo) this.c;
                lw90 lw90Var = (lw90) this.d;
                iu30 iu30Var4 = (iu30) this.e;
                rtb0.c(rtb0Var, (Object) null, new j2i(1641104401, new cex(lw90Var, iu30Var4, (byte) 28), true), 3);
                byte b3 = 11;
                if (lw90Var.d()) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(1329092246, new ipy(iu30Var4, b3), true), 3);
                }
                List list2 = lw90Var.c().b;
                rtb0Var.e(list2.size(), new xg50(list2, (byte) 10), new xg50(list2, (byte) 11), new j2i(2039820996, new vw90(list2, lw90Var, ldoVar, (byte) 0), true));
                cw90 cw90VarB = lw90Var.b();
                if (cw90VarB != null) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(607993939, new tf((ng20) this.f, lw90Var, cw90VarB, this.b, (byte) 14), true), 3);
                    List list3 = cw90VarB.b;
                    rtb0Var.e(list3.size(), new xg50(list3, (byte) 12), new xg50(list3, (byte) 13), new j2i(2039820996, new vw90(list3, lw90Var, ldoVar, (byte) 1), true));
                }
                return rih1.a;
            case 8:
                e261 e261Var2 = (e261) obj;
                ckd0 ckd0Var = (ckd0) this.c;
                List listI0 = f46.i0(new String[]{ckd0Var.d, (String) this.d, ckd0Var.i, ckd0Var.j, ckd0Var.l});
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : listI0) {
                    if (!ihc1.y0((String) obj4)) {
                        arrayList6.add(obj4);
                    }
                }
                b261.n(e261Var2, o7h.y0(arrayList6, ". ", (String) null, (String) null, (iu30) null, 62));
                if (this.b && ckd0Var.f != 3) {
                    b261.p(e261Var2, Collections.singletonList(new epo((String) this.e, new aba0((Function0) this.f, (byte) 18))));
                }
                return rih1.a;
            case 9:
                huj0 huj0Var = (huj0) this.c;
                if (((tm81) this.e).d == 1) {
                    x1i1.a(huj0Var.e, kno1.a, 6);
                } else {
                    fn31.T(cto1.q(huj0Var.a), huj0Var.d, 0, new guj0(this.b, huj0Var, (String) this.d, !this.b, !u890.j((g3d0) this.f, u2d0.a), null, (byte) 0), 2);
                }
                return rih1.a;
            case 10:
                rtb0 rtb0Var2 = (rtb0) obj;
                boolean z = this.b;
                ahi0 ahi0Var = (ahi0) this.e;
                g5r0 g5r0Var = (g5r0) this.d;
                if (((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    rtb0.c(rtb0Var2, "GroupedDevices", new j2i(416506414, new y4r0(ahi0Var, g5r0Var, (byte) 1), true), 2);
                }
                List list4 = g5r0Var.i;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : list4) {
                    if (((v081) obj5).a != x081.a) {
                        arrayList7.add(obj5);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    rtb0.c(rtb0Var2, "ActiveRowShortcuts", new j2i(-978479515, new hf50(arrayList7, (byte) 1), true), 2);
                }
                rtb0.c(rtb0Var2, "SharedContent", new j2i(-353306605, new y4r0(ahi0Var, g5r0Var, (byte) 2), true), 2);
                rtb0.c(rtb0Var2, "GroupableDevices", new j2i(-2034415862, new z4r0(ahi0Var, g5r0Var, z, (Function0) this.f, (byte) 1), true), 2);
                if (!z) {
                    ahi0Var.m(rtb0Var2, g5r0Var);
                }
                return rih1.a;
            case 11:
                lnl0 lnl0Var = (lnl0) obj;
                b7x b7xVar = b7x.a;
                y6h1 y6h1Var = lnl0Var.a;
                fjl0 fjl0Var = lnl0Var.b;
                if (this.b) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) this.d)), y6h1Var, fjl0Var.b, System.currentTimeMillis());
                }
                p811 p811Var = (p811) this.e;
                if (p811Var.a == null) {
                    p811Var.a = ((f9q) ((phi0) this.c).d).a(lnl0Var.b());
                }
                dwu0 dwu0Var = (dwu0) this.f;
                dwu0 dwu0Var2 = dwu0.a;
                char c = dwu0Var == dwu0Var2 ? (char) 1 : (char) 2;
                char c2 = dwu0Var == dwu0Var2 ? (char) 2 : (char) 1;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (c == 1) {
                    str = "off";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    str = "on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", str);
                if (c2 == 1) {
                    str2 = "off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    str2 = "on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str2)})), y6h1Var, fjl0Var.b, System.currentTimeMillis());
            case 12:
                dc61 dc61Var = (dc61) this.e;
                ven0 ven0Var3 = (ven0) this.c;
                kex kexVar = (kex) obj;
                if (this.b && ((ljx0) ven0Var3.getValue()) != ljx0.a) {
                    kexVar.a("playlist_prompt", new j2i(-1778331303, new u841(dc61Var, (byte) 16), true));
                }
                c380 c380Var = (c380) this.d;
                kexVar.b(c380Var.size(), new j2i(-1673449743, new n2y0((Object) c380Var, c380Var, (Object) dc61Var, (iu30) this.f, (Object) ven0Var3, (byte) 8), true), new nec0(c380Var, (byte) 20));
                return rih1.a;
            case 13:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, (String) this.d);
                b261.p(e261Var3, Collections.singletonList(new epo((String) this.e, new eb7(this.b, (Function0) this.c, (Function0) this.f, (byte) 4))));
                return rih1.a;
            case 14:
                rtb0 rtb0Var3 = (rtb0) obj;
                y0k1 y0k1Var = (y0k1) this.d;
                rtb0.c(rtb0Var3, "description", zqj.c, 2);
                if (this.b) {
                    rtb0.c(rtb0Var3, "musicVideosToggle", new j2i(-1186527638, new f0k1(y0k1Var, (Function0) this.e, (byte) 0), true), 2);
                }
                rtb0.c(rtb0Var3, "canvasToggle", new j2i(-318931898, new f0k1(y0k1Var, (Function0) this.c, (byte) 1), true), 2);
                rtb0.c(rtb0Var3, "otherVideosToggle", new j2i(1144706119, new f0k1(y0k1Var, (Function0) this.f, (byte) 2), true), 2);
                rtb0.c(rtb0Var3, "otherVideosFooter", zqj.d, 2);
                return rih1.a;
            case 15:
                d08 d08Var = (d08) this.e;
                if (d08Var != null && (str3 = (String) this.d) != null && this.b) {
                    zz7 zz7Var = (c08) this.c;
                    opl0 opl0VarA = d08Var.a(str3, (hp80) this.f);
                    r6h1 r6h1Var2 = opl0VarA.b;
                    y6h1 y6h1Var2 = opl0VarA.c;
                    if (zz7Var.equals(b08.a)) {
                        x6h1 x6h1VarC = y6h1Var2.c();
                        x6h1VarC.i.add(new a7h1("logo", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).b = r6h1Var2;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        l7h1VarA = (l7h1) k7h1Var.a();
                    } else if (zz7Var instanceof zz7) {
                        zz7 zz7Var2 = zz7Var;
                        int iC = l1d.C(zz7Var2.b);
                        if (iC == 0) {
                            b = 1;
                        } else if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        String str6 = zz7Var2.a;
                        x6h1 x6h1VarC2 = y6h1Var2.c();
                        x6h1VarC2.i.add(new a7h1("chip", (String) null, (Integer) null, str6, z3m0.i(b)));
                        x6h1VarC2.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        k7h1 k7h1Var2 = new k7h1();
                        ((xjn) k7h1Var2).a = y6h1VarA2;
                        ((xjn) k7h1Var2).b = r6h1Var2;
                        ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                        l7h1VarA = (l7h1) k7h1Var2.a();
                    } else {
                        if (!(zz7Var instanceof a08)) {
                            eg.o();
                            return null;
                        }
                        a08 a08Var = (a08) zz7Var;
                        int iY = yto1.y(a08Var.b);
                        String str7 = a08Var.a;
                        x6h1 x6h1VarC3 = y6h1Var2.c();
                        x6h1VarC3.i.add(new a7h1("entity_card", (String) null, (Integer) null, str7, z3m0.j(iY)));
                        x6h1VarC3.j = true;
                        y6h1 y6h1VarA3 = x6h1VarC3.a();
                        k7h1 k7h1Var3 = new k7h1();
                        ((xjn) k7h1Var3).a = y6h1VarA3;
                        ((xjn) k7h1Var3).b = r6h1Var2;
                        ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                        l7h1VarA = k7h1Var3.a();
                    }
                    t480VarP = d08Var.b.p(l7h1VarA, d08.d);
                }
                return new zxg1(d08Var, t480VarP, (byte) 16);
            default:
                rtb0 rtb0Var4 = (rtb0) obj;
                boolean z2 = this.b;
                azr azrVar = (azr) this.d;
                rtb0.c(rtb0Var4, "title", new j2i(-478816821, new n8k0(z2, azrVar, (Function0) this.c, (byte) 22), true), 2);
                if (azrVar != null) {
                    rtb0.c(rtb0Var4, "filter_reordering", new j2i(1169109734, new eom1(azrVar, (byte) 3), true), 2);
                }
                List list5 = (List) this.e;
                rtb0Var4.e(list5.size(), new vse1(list5, (byte) 21), new vse1(list5, (byte) 22), new j2i(802480018, new ot(list5, (bzr) this.f, (byte) 24), true));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o96(Object obj, String str, boolean z, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.e = obj;
        this.d = str;
        this.b = z;
        this.c = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(a6d a6dVar, Object obj, boolean z, iu30 iu30Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 1;
        this.d = a6dVar;
        this.e = obj;
        this.b = z;
        this.f = iu30Var;
        this.c = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(zeu zeuVar, String str, lik1 lik1Var, boolean z, fbp1 fbp1Var) {
        super(1);
        this.a = (byte) 5;
        this.e = zeuVar;
        this.d = str;
        this.c = lik1Var;
        this.b = z;
        this.f = fbp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(lw90 lw90Var, iu30 iu30Var, ldo ldoVar, ng20 ng20Var, boolean z) {
        super(1);
        this.a = (byte) 7;
        this.d = lw90Var;
        this.e = iu30Var;
        this.c = ldoVar;
        this.f = ng20Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o96(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(g5r0 g5r0Var, boolean z, ahi0 ahi0Var, ven0 ven0Var, Function0 function0) {
        super(1);
        this.a = (byte) 10;
        this.d = g5r0Var;
        this.b = z;
        this.e = ahi0Var;
        this.c = ven0Var;
        this.f = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(cp31 cp31Var, String str, String str2, boolean z, String str3) {
        super(1);
        this.a = (byte) 4;
        this.c = cp31Var;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.f = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(tm81 tm81Var, huj0 huj0Var, boolean z, g3d0 g3d0Var, String str) {
        super(1);
        this.a = (byte) 9;
        this.e = tm81Var;
        this.c = huj0Var;
        this.b = z;
        this.f = g3d0Var;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o96(boolean z, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(boolean z, c380 c380Var, ven0 ven0Var, dc61 dc61Var, iu30 iu30Var) {
        super(1);
        this.a = (byte) 12;
        this.b = z;
        this.d = c380Var;
        this.c = ven0Var;
        this.e = dc61Var;
        this.f = iu30Var;
    }
}
