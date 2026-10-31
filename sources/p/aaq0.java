package p;

import android.net.Uri;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aaq0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaq0(Object obj, byte b) {
        super(4);
        this.a = b;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        kvk0 kvk0Var = (n8h1) obj;
        gg31 gg31Var = (gg31) obj2;
        uf31 uf31Var = (uf31) obj4;
        String str = gg31Var.c;
        List list = gg31Var.q;
        apl aplVar = gg31Var.a;
        boolean z = aplVar instanceof wol;
        b7x b7xVar = b7x.a;
        rf31 rf31Var = rf31.a;
        of31 of31Var = of31.a;
        mf31 mf31Var = mf31.a;
        Object obj5 = null;
        if (z) {
            kvk0 kvk0Var2 = kvk0Var instanceof kvk0 ? kvk0Var : null;
            if (kvk0Var2 != null) {
                y6h1 y6h1Var = kvk0Var2.a;
                if (uf31Var.equals(mf31Var)) {
                    for (Object obj6 : list) {
                        if (u890.j(((gxz0) obj6).c.a, str)) {
                            obj5 = obj6;
                            break;
                        }
                    }
                    gxz0 gxz0Var = (gxz0) obj5;
                    if (gxz0Var == null) {
                        return new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", "❤️")), y6h1Var, r6h1.c, System.currentTimeMillis());
                    }
                    String str2 = gxz0Var.b;
                    return new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str2 == null ? "" : str2)), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                if (uf31Var.equals(of31Var)) {
                    return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                if (uf31Var.equals(rf31Var)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                if (uf31Var instanceof sf31) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (uf31Var instanceof kf31) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(uf31Var instanceof pf31) && !(uf31Var instanceof qf31) && !(uf31Var instanceof lf31) && !(uf31Var instanceof nf31)) {
                    eg.o();
                    return null;
                }
            }
        } else if (aplVar instanceof ppl) {
            pvk0 pvk0Var = kvk0Var instanceof pvk0 ? (pvk0) kvk0Var : null;
            if (pvk0Var != null) {
                y6h1 y6h1Var2 = pvk0Var.a;
                if (uf31Var.equals(mf31Var)) {
                    for (Object obj7 : list) {
                        if (u890.j(((gxz0) obj7).c.a, str)) {
                            obj5 = obj7;
                            break;
                        }
                    }
                    gxz0 gxz0Var2 = (gxz0) obj5;
                    if (gxz0Var2 == null) {
                        return new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", "❤️")), y6h1Var2, r6h1.c, System.currentTimeMillis());
                    }
                    String str3 = gxz0Var2.b;
                    return new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str3 == null ? "" : str3)), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                if (uf31Var.equals(of31Var)) {
                    return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                if (uf31Var instanceof sf31) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                if (uf31Var instanceof kf31) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!uf31Var.equals(rf31Var) && !(uf31Var instanceof pf31) && !(uf31Var instanceof qf31) && !(uf31Var instanceof lf31) && !(uf31Var instanceof nf31)) {
                    eg.o();
                    return null;
                }
            }
        } else {
            if (!(aplVar instanceof mpl)) {
                eg.o();
                return null;
            }
            qvk0 qvk0Var = kvk0Var instanceof qvk0 ? (qvk0) kvk0Var : null;
            if (qvk0Var != null) {
                if (uf31Var.equals(mf31Var)) {
                    for (Object obj8 : list) {
                        if (u890.j(((gxz0) obj8).c.a, str)) {
                            obj5 = obj8;
                            break;
                        }
                    }
                    gxz0 gxz0Var3 = (gxz0) obj5;
                    return gxz0Var3 == null ? qvk0Var.e() : qvk0Var.h(gxz0Var3.b);
                }
                if (uf31Var.equals(of31Var)) {
                    return qvk0Var.g();
                }
                if (uf31Var.equals(rf31Var)) {
                    return qvk0Var.i();
                }
                if (!(uf31Var instanceof sf31) && !(uf31Var instanceof kf31) && !(uf31Var instanceof qf31) && !(uf31Var instanceof pf31) && !(uf31Var instanceof lf31) && !(uf31Var instanceof nf31)) {
                    eg.o();
                }
            }
        }
        return null;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        jh5 jh5Var = (jh5) obj;
        int iIntValue = ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        ((ses0) obj2).p(iIntValue, new jh5(new xv00(jh5Var.a.a), (String) jh5Var.b));
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        mq70 mq70Var;
        up70 up70VarA;
        xkk1 xkk1Var = (xkk1) obj2;
        hll hllVar = (hll) obj3;
        a7q0 a7q0Var = (a7q0) obj4;
        return new h641((jo70) obj, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a, hllVar != null ? hllVar.b : null, a7q0Var != null ? Long.valueOf(a7q0Var.c) : null, null);
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        g8l0 g8l0Var = (g8l0) obj;
        uv41 uv41Var = (uv41) obj2;
        if (!((tv41) obj4).equals(tv41.a)) {
            eg.o();
            return null;
        }
        String strF = yup0.f(uv41Var);
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (strF == null) {
            strF = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), g8l0Var.a, r6h1.c, System.currentTimeMillis());
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        nnl0 nnl0Var = (nnl0) obj;
        zy41 zy41Var = (zy41) obj2;
        if (((yy41) obj4).equals(yy41.a)) {
            return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l1d.m("spotify:assisted-curation:search?context=", zy41Var.a))), nnl0Var.a, nnl0Var.b.c.a, System.currentTimeMillis());
        }
        eg.o();
        return null;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        vb61 vb61Var = ((qb61) obj).a;
        String str = vb61Var.a;
        String str2 = vb61Var.g;
        return new mwl0(new mjl0(new opl0((r6h1) obj4, (byte) 5), o7h.y0(o7h.Z0(vb61Var.f), ",", (String) null, (String) null, (iu30) null, 62), str2), str);
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        n8h1 n8h1Var = (n8h1) obj;
        fn61 fn61Var = (fn61) obj4;
        vm61 vm61Var = ((gn61) obj2).d;
        if (fn61Var instanceof cn61) {
            if (vm61Var instanceof vm61) {
                return (w7h1) new gy00(n8h1Var, (byte) 3).invoke(vm61Var.e);
            }
            if (vm61Var instanceof zm61) {
                return (w7h1) new gy00(n8h1Var, (byte) 4).invoke(((zm61) vm61Var).h);
            }
            if (vm61Var instanceof xm61) {
                return (w7h1) new gy00(n8h1Var, (byte) 5).invoke(((xm61) vm61Var).k);
            }
            eg.o();
            return null;
        }
        if (!(fn61Var instanceof dn61)) {
            if (fn61Var instanceof en61) {
                return null;
            }
            eg.o();
            return null;
        }
        if (vm61Var instanceof vm61) {
            return (w7h1) new gy00(n8h1Var, (byte) 6).invoke(vm61Var.e);
        }
        if (vm61Var instanceof zm61) {
            return (w7h1) new gy00(n8h1Var, (byte) 7).invoke(((zm61) vm61Var).h);
        }
        if (vm61Var instanceof xm61) {
            return (w7h1) new gy00(n8h1Var, (byte) 8).invoke(((xm61) vm61Var).k);
        }
        eg.o();
        return null;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        n8h1 n8h1Var = (n8h1) obj;
        bi81 bi81Var = (bi81) obj2;
        ai81 ai81Var = (ai81) obj4;
        if (ai81Var instanceof yh81) {
            hh81 hh81Var = bi81Var.a;
            jh81 jh81Var = hh81Var.e;
            return (w7h1) jh81Var.b.invoke(n8h1Var, hh81Var.c);
        }
        if (ai81Var instanceof zh81) {
            return null;
        }
        eg.o();
        return null;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        th91 th91Var = (th91) obj3;
        rh91 rh91Var = (rh91) obj4;
        y6h1 y6h1Var = ((iwl0) obj).a;
        List listJ = th91Var.e;
        boolean z = rh91Var instanceof ph91;
        b7x b7xVar = b7x.a;
        if (z) {
            Iterator it = th91Var.a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (u890.j(((oh91) it.next()).a, ((ph91) rh91Var).a)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                if (listJ == null) {
                    listJ = tx9.j(th91Var);
                }
                String str = ((ph91) rh91Var).a;
                if (listJ.contains(str)) {
                    Integer numValueOf = Integer.valueOf(i);
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("filter", str, numValueOf, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("filter", str, numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            }
        } else {
            if (!rh91Var.equals(qh91.a)) {
                eg.o();
                return null;
            }
            if (listJ == null) {
                listJ = tx9.j(th91Var);
            }
            if (!listJ.isEmpty()) {
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            }
        }
        return null;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        return new f1m0(l1d.m("spotify:internal:songdna:search?seedUri=", Uri.encode(ngs0.m(((fba1) obj).a))), (r6h1) obj4);
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        f1m0 f1m0Var = (f1m0) obj;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l1d.m("spotify:internal:songdna:search?seedUri=", Uri.encode(ngs0.m(((fba1) obj2).a))))), f1m0Var.b, f1m0Var.a, System.currentTimeMillis());
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        uba1 uba1Var = (uba1) obj;
        ((Number) obj3).intValue();
        c1m0 c1m0VarF = vba1.f(uba1Var);
        if (c1m0VarF != null) {
            return c1m0VarF;
        }
        bhn0.g(uba1Var, "No Find for ");
        return null;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b = this.a;
        int i = 3;
        int i2 = 2;
        String strP = "";
        b7x b7xVar = b7x.a;
        String w7h1Var4 = null;
        switch (b) {
            case 0:
                r6h1 r6h1Var = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                EventCardInfoResponse eventCardInfoResponse = ((k900) obj).a;
                int i3 = eventCardInfoResponse.q() ? 2 : 1;
                int iP = eventCardInfoResponse.p();
                int i4 = iP == 0 ? -1 : z9q0.a[l1d.C(iP)];
                if (i4 == 1) {
                    strP = eventCardInfoResponse.t().p();
                } else if (i4 == 2) {
                    strP = eventCardInfoResponse.n();
                } else if (i4 != 3) {
                    int iP2 = eventCardInfoResponse.p();
                    String strN = eventCardInfoResponse.n();
                    StringBuilder sb = new StringBuilder("Unsupported DetailsCase ");
                    if (iP2 == 1) {
                        str = "SINGLE_EVENT_DETAILS";
                    } else if (iP2 != 2) {
                        str = iP2 != 3 ? "null" : "DETAILS_NOT_SET";
                    } else {
                        str = "MULTI_EVENT_DETAILS";
                    }
                    sb.append(str);
                    sb.append(" for artist concerts uri: {");
                    sb.append(strN);
                    sb.append("}");
                    n57.e(sb.toString());
                } else {
                    l1d.z("DetailsCase not set for artist concerts uri: {", eventCardInfoResponse.n(), "}");
                }
                return new til0(i3, numValueOf, strP, r6h1Var);
            case 1:
                l8l0 l8l0Var = (l8l0) obj;
                pxr0 pxr0Var = (pxr0) obj2;
                if (((oxr0) obj4).equals(oxr0.a)) {
                    String strF = md1.f(pxr0Var);
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF != null ? strF : "")), l8l0Var.a, l8l0Var.b.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var4;
            case 2:
                tfl0 tfl0Var = (tfl0) obj;
                x6h1 x6h1VarC = tfl0Var.b.c();
                x6h1VarC.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("parental_hub_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String strE = nyr0.e(((lyr0) obj2).a);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE != null ? strE : "")), y6h1VarA, tfl0Var.a, System.currentTimeMillis());
            case 3:
                x6h1 x6h1VarC3 = ((o7l0) obj).a.c();
                x6h1VarC3.i.add(new a7h1("parental_hub_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                String strE2 = oyr0.e((myr0) obj2);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE2 != null ? strE2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                hll0 hll0Var = new hll0((String) null, (String) null);
                c10 c10VarE = yas0.e((lbt0) obj2);
                return new gll0(hll0Var, c10VarE != null ? c10VarE.e : null);
            case 5:
                n7l0 n7l0Var = (n7l0) obj;
                String str2 = nik1.a6.b("spotify:internal:managed-account-allowlisting-requests:child:".concat(((kfs0) obj2).a)).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), n7l0Var.a, r6h1.c, System.currentTimeMillis());
            case 6:
                ruk0 ruk0Var = (n8h1) obj;
                gzv0 gzv0Var = (hzv0) obj3;
                azv0 azv0Var = (azv0) obj4;
                String str3 = ((ezv0) obj2).j;
                if (gzv0Var instanceof fzv0) {
                    return null;
                }
                if (!(gzv0Var instanceof gzv0)) {
                    eg.o();
                    return null;
                }
                ruk0 ruk0Var2 = ruk0Var;
                r6h1 r6h1Var2 = ruk0Var2.a;
                y6h1 y6h1Var = ruk0Var2.b;
                if (azv0Var.equals(wyv0.a)) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC4.a();
                    String str4 = gzv0Var.c;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                } else if (azv0Var.equals(xyv0.a)) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                    x6h1VarC7.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                } else if (azv0Var.equals(yyv0.a)) {
                    gzv0 gzv0Var2 = gzv0Var;
                    String str5 = gzv0Var2.c;
                    boolean z = gzv0Var2.g;
                    String str6 = gzv0Var2.n;
                    boolean z2 = gzv0Var2.h;
                    if (z) {
                        if (z2) {
                            x6h1 x6h1VarC8 = y6h1Var.c();
                            x6h1VarC8.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC8.j = false;
                            x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                            x6h1VarC9.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC9.j = false;
                            x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                            x6h1VarC10.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC10.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str6 != null ? str6 : "")), x6h1VarC10.a(), r6h1Var2, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC11 = y6h1Var.c();
                            x6h1VarC11.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC11.j = false;
                            x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                            x6h1VarC12.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC12.j = false;
                            x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                            x6h1VarC13.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC13.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str6 != null ? str6 : "")), x6h1VarC13.a(), r6h1Var2, System.currentTimeMillis());
                        }
                    } else {
                        if (z) {
                            eg.o();
                            return null;
                        }
                        if (z2) {
                            x6h1 x6h1VarC14 = y6h1Var.c();
                            x6h1VarC14.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC14.j = false;
                            x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                            x6h1VarC15.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC15.j = false;
                            x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                            x6h1VarC16.i.add(new a7h1("presave_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC16.j = false;
                            y6h1 y6h1VarA4 = x6h1VarC16.a();
                            String str7 = (String) o7h.A0(ihc1.P0(str5, new char[]{':'}, 6));
                            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                            if (str7 == null) {
                                str7 = "";
                            }
                            mmr0 mmr0Var = new mmr0("prerelease_id", str7);
                            if (str5 == null) {
                                str5 = "";
                            }
                            w7h1Var = new w7h1("", "", z7h1Var, new x7h1("remove_presave", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("item_to_be_removed_from_presaved", str5), new mmr0("context_uri", str3 != null ? str3 : "")})), y6h1VarA4, r6h1Var2, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC17 = y6h1Var.c();
                            x6h1VarC17.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC17.j = false;
                            x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                            x6h1VarC18.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC18.j = false;
                            x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                            x6h1VarC19.i.add(new a7h1("presave_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC19.j = false;
                            y6h1 y6h1VarA5 = x6h1VarC19.a();
                            String str8 = (String) o7h.A0(ihc1.P0(str5, new char[]{':'}, 6));
                            z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                            if (str8 == null) {
                                str8 = "";
                            }
                            mmr0 mmr0Var2 = new mmr0("prerelease_id", str8);
                            if (str5 == null) {
                                str5 = "";
                            }
                            w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("presave", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("item_to_be_presaved", str5), new mmr0("context_uri", str3 != null ? str3 : "")})), y6h1VarA5, r6h1Var2, System.currentTimeMillis());
                        }
                    }
                } else {
                    if (!azv0Var.equals(zyv0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC20 = y6h1Var.c();
                    x6h1VarC20.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                    x6h1VarC21.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                    x6h1VarC22.i.add(new a7h1("share_item", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 7:
                x6h1 x6h1VarC23 = ((o7l0) obj).a.c();
                x6h1VarC23.i.add(new a7h1("profile_visibility_settings_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC23.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", f4i1.f("spotify:internal:managed-account-details:teen:", ((nex0) obj2).a, ":profile-visibility-settings"))), x6h1VarC23.a(), r6h1.c, System.currentTimeMillis());
            case 8:
                lhb1 lhb1Var = (lhb1) obj4;
                y6h1 y6h1Var2 = ((esl0) obj).a;
                String str9 = ((rcz0) obj2).a;
                if (u890.j(str9, "reorder_restricted")) {
                    i = 1;
                } else {
                    u890.j(str9, "songs_in_random_order");
                }
                if (lhb1Var.equals(jhb1.a)) {
                    x6h1 x6h1VarC24 = y6h1Var2.c();
                    x6h1VarC24.i.add(new a7h1("explore_premium_bottom_sheet", (String) null, (Integer) null, (String) null, dsl0.a(i)));
                    x6h1VarC24.j = true;
                    x6h1 x6h1VarC25 = x6h1VarC24.a().c();
                    x6h1VarC25.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC25.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination")), x6h1VarC25.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!lhb1Var.equals(khb1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC26 = y6h1Var2.c();
                x6h1VarC26.i.add(new a7h1("explore_premium_bottom_sheet", (String) null, (Integer) null, (String) null, dsl0.a(i)));
                x6h1VarC26.j = true;
                x6h1 x6h1VarC27 = x6h1VarC26.a().c();
                x6h1VarC27.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC27.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC27.a(), r6h1.c, System.currentTimeMillis());
            case 9:
                r3l0 r3l0Var = (r3l0) obj;
                if (ftz0.a[((jsz0) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), r3l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 10:
                utl0 utl0Var = (n8h1) obj;
                oey0 oey0Var = (oey0) obj2;
                String str10 = oey0Var.h;
                switch (l1d.C(jxa.J((e700) obj4, oey0Var, ((kob1) obj3).s))) {
                    case 0:
                        utl0 utl0Var2 = utl0Var instanceof utl0 ? utl0Var : null;
                        if (utl0Var2 != null) {
                            return utl0Var2.h(str10);
                        }
                        return null;
                    case 1:
                        utl0 utl0Var3 = utl0Var instanceof utl0 ? utl0Var : null;
                        if (utl0Var3 != null) {
                            return utl0Var3.a(str10);
                        }
                        return null;
                    case 2:
                        String str11 = oey0Var.r;
                        if (str11 == null) {
                            return null;
                        }
                        utl0 utl0Var4 = utl0Var instanceof utl0 ? utl0Var : null;
                        if (utl0Var4 != null) {
                            return utl0Var4.a(str11);
                        }
                        return null;
                    case 3:
                        utl0 utl0Var5 = utl0Var instanceof utl0 ? utl0Var : null;
                        if (utl0Var5 != null) {
                            return utl0Var5.i();
                        }
                        return null;
                    case 4:
                        utl0 utl0Var6 = utl0Var instanceof utl0 ? utl0Var : null;
                        if (utl0Var6 == null) {
                            return null;
                        }
                        x6h1 x6h1VarC28 = utl0Var6.a.c();
                        x6h1VarC28.i.add(new a7h1("reaction_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC28.j = true;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC28.a(), r6h1.c, System.currentTimeMillis());
                    case 5:
                    case 6:
                        return null;
                    default:
                        eg.o();
                        return null;
                }
            case 11:
                sy01 sy01Var = (sy01) obj;
                return new wqk0(sy01Var.d, Integer.valueOf(((Number) obj3).intValue()), sy01Var.a, (r6h1) obj4, (byte) 19);
            case 12:
                return null;
            case 13:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new w2m0(new ksk0(yon1.X4().a, nik1.g1.a, (byte) 22), ((r911) obj2).c ? 2 : 1);
            case 14:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                int iC = l1d.C(1);
                if (iC == 0) {
                    i2 = 1;
                } else if (iC != 1) {
                    eg.o();
                    return null;
                }
                return new wtl0(i2, r6h1Var3);
            case 15:
                tfl0 tfl0Var2 = (tfl0) obj;
                v521 v521Var = (v521) obj2;
                u521 u521Var = (u521) obj4;
                y6h1 y6h1Var3 = tfl0Var2.b;
                String str12 = v521Var.a;
                int iC2 = l1d.C(v521Var.d);
                u521 u521Var2 = u521.a;
                if (iC2 != 0) {
                    if (iC2 != 1) {
                        if (iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        if (!u521Var.equals(u521Var2)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC29 = y6h1Var3.c();
                        x6h1VarC29.i.add(new a7h1("legacy_managed_group", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC29.j = false;
                        x6h1 x6h1VarC30 = x6h1VarC29.a().c();
                        x6h1VarC30.i.add(new a7h1("remove_from_plan_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC30.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", x521.e(str12))), x6h1VarC30.a(), tfl0Var2.a, System.currentTimeMillis());
                    } else {
                        if (!u521Var.equals(u521Var2)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC31 = y6h1Var3.c();
                        x6h1VarC31.i.add(new a7h1("self_managed_group", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC31.j = false;
                        x6h1 x6h1VarC32 = x6h1VarC31.a().c();
                        x6h1VarC32.i.add(new a7h1("remove_from_plan_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC32.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", x521.e(str12))), x6h1VarC32.a(), tfl0Var2.a, System.currentTimeMillis());
                    }
                } else {
                    if (!u521Var.equals(u521Var2)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC33 = y6h1Var3.c();
                    x6h1VarC33.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC33.j = false;
                    x6h1 x6h1VarC34 = x6h1VarC33.a().c();
                    x6h1VarC34.i.add(new a7h1("remove_from_plan_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC34.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", x521.e(str12))), x6h1VarC34.a(), tfl0Var2.a, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 16:
                p7l0 p7l0Var = (p7l0) obj;
                n921 n921Var = (n921) obj2;
                if (!((m921) obj4).equals(m921.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC35 = p7l0Var.b.c();
                x6h1VarC35.i.add(new a7h1("remove_from_plan_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC35.j = false;
                y6h1 y6h1VarA6 = x6h1VarC35.a();
                String str13 = nik1.k0.b("spotify:account-management:member-details:remove-member:".concat(n921Var.a)).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str13 != null ? str13 : "")), y6h1VarA6, p7l0Var.a, System.currentTimeMillis());
            case 17:
                return a(obj, obj2, obj3, obj4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return d(obj, obj2, obj3, obj4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return e(obj, obj2, obj3, obj4);
            case 20:
                return f(obj, obj2, obj3, obj4);
            case 21:
                return g(obj, obj2, obj3, obj4);
            case 22:
                return h(obj, obj2, obj3, obj4);
            case 23:
                return i(obj, obj2, obj3, obj4);
            case 24:
                return j(obj, obj2, obj3, obj4);
            case 25:
                return k(obj, obj2, obj3, obj4);
            case 26:
                return m(obj, obj2, obj3, obj4);
            case 27:
                return n(obj, obj2, obj3, obj4);
            case 28:
                return o(obj, obj2, obj3, obj4);
            default:
                zga1 zga1Var = (zga1) obj;
                vga1 vga1Var = (vga1) obj3;
                qga1 qga1Var = (rga1) obj4;
                y6h1 y6h1Var4 = zga1Var.b.b;
                if (qga1Var instanceof qga1) {
                    eia1 eia1Var = qga1Var.a;
                    if (eia1Var.equals(ug3.i(vga1Var.a))) {
                        x6h1 x6h1VarC36 = y6h1Var4.c();
                        x6h1VarC36.i.add(new a7h1("same_sort_order_selected", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC36.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC36.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC37 = y6h1Var4.c();
                    x6h1VarC37.i.add(new a7h1("sort", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC37.j = false;
                    y6h1 y6h1VarA7 = x6h1VarC37.a();
                    if (eia1Var instanceof bia1) {
                        x6h1 x6h1VarC38 = y6h1VarA7.c();
                        x6h1VarC38.i.add(new a7h1("provided_sort_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC38.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC38.a(), r6h1.c, System.currentTimeMillis());
                    } else if (eia1Var.equals(aia1.b)) {
                        x6h1 x6h1VarC39 = y6h1VarA7.c();
                        x6h1VarC39.i.add(new a7h1("new_to_old_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC39.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC39.a(), r6h1.c, System.currentTimeMillis());
                    } else if (eia1Var.equals(aia1.c)) {
                        x6h1 x6h1VarC40 = y6h1VarA7.c();
                        x6h1VarC40.i.add(new a7h1("old_to_new_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC40.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC40.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!eia1Var.equals(aia1.a)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC41 = y6h1VarA7.c();
                        x6h1VarC41.i.add(new a7h1("most_popular_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC41.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC41.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else if (qga1Var instanceof oga1) {
                    bb20 bb20Var = ((oga1) qga1Var).a;
                    if (bb20Var.equals(ug3.g(vga1Var.b))) {
                        x6h1 x6h1VarC42 = y6h1Var4.c();
                        x6h1VarC42.i.add(new a7h1("same_filter_selected", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC42.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC42.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC43 = y6h1Var4.c();
                    x6h1VarC43.i.add(new a7h1("filter", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC43.j = false;
                    y6h1 y6h1VarA8 = x6h1VarC43.a();
                    if (bb20Var.equals(bb20.a)) {
                        x6h1 x6h1VarC44 = y6h1VarA8.c();
                        x6h1VarC44.i.add(new a7h1("all_episodes_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC44.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC44.a(), r6h1.c, System.currentTimeMillis());
                    } else if (bb20Var.equals(bb20.b)) {
                        x6h1 x6h1VarC45 = y6h1VarA8.c();
                        x6h1VarC45.i.add(new a7h1("downloads_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC45.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC45.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!bb20Var.equals(bb20.c)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC46 = y6h1VarA8.c();
                        x6h1VarC46.i.add(new a7h1("unplayed_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC46.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC46.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (!(qga1Var instanceof nga1)) {
                        if (!(qga1Var instanceof mga1)) {
                            return null;
                        }
                        String str14 = zga1Var.a;
                        x6h1 x6h1VarC47 = y6h1Var4.c();
                        x6h1VarC47.i.add(new a7h1("dismiss", (String) null, (Integer) null, str14, (String) null));
                        x6h1VarC47.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC47.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC48 = zga1Var.c.a.c();
                    x6h1VarC48.i.add(new a7h1("retrieval_content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC48.j = false;
                    x6h1 x6h1VarC49 = x6h1VarC48.a().c();
                    x6h1VarC49.i.add(new a7h1("sort_and_filter_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC49.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC49.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaq0(int i, byte b) {
        super(i);
        this.a = b;
    }
}
