package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.Date;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u451 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u451(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:119:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:122:0x04f4  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        ou80 ou80Var;
        Object objN;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        gxz0 gxz0Var;
        tv80 tv80Var;
        w7h1 w7h1Var3;
        byte b = 2;
        ou80 ou80Var2 = null;
        Object obj5 = null;
        str = null;
        String str = null;
        switch (this.a) {
            case 0:
                tqw tqwVar = (tqw) obj3;
                ((hg7) ((smp0) this.b).d).invoke((s451) obj2, tqwVar != null ? n3o1.y(tqwVar).a : null);
                return rih1.a;
            case 1:
                c751 c751Var = (c751) obj;
                ((Number) obj3).intValue();
                q651 q651Var = (q651) this.b;
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    zoq zoqVar = q651Var.c;
                    c751Var.getClass();
                    v3v0 v3v0Var = new v3v0(1, c751Var, c751.class, "dispatchEvent", "dispatchEvent(Lcom/spotify/search/mobius/SearchEvent;)V", 0, (byte) 29);
                    String str2 = c751Var.W0.a;
                    boolean z = c751Var.a1.a;
                    ykq ykqVar = zoqVar.a;
                    bop bopVar = (bop) ((apq) ykqVar.c).x.get();
                    dop dopVar = (dop) ((apq) ykqVar.c).y.get();
                    eop eopVar = (eop) ((apq) ykqVar.c).z.get();
                    gop gopVar = (gop) ((apq) ykqVar.c).A.get();
                    nu nuVar = new nu((byte) 19);
                    ((apq) ykqVar.c).getClass();
                    br0 br0Var = new br0(new urk0((byte) 4));
                    znp znpVar = (znp) ((apq) ykqVar.c).Y0.get();
                    hc51 hc51VarA0 = ((apq) ykqVar.c).a.a0();
                    c8o.l(hc51VarA0);
                    y751 y751Var = (y751) ((apq) ykqVar.c).v.get();
                    sco0 sco0VarI = ((apq) ykqVar.c).a.I();
                    c8o.l(sco0VarI);
                    u651 u651Var = new u651(bopVar, dopVar, eopVar, gopVar, nuVar, br0Var, znpVar, hc51VarA0, y751Var, sco0VarI, (e8r0) ((apq) ykqVar.c).Z0.get(), (w651) ((apq) ykqVar.c).b1.get(), v3v0Var, str2, z);
                    z72 z72Var = u651Var.h;
                    boolean z2 = c751Var.a1.b;
                    bpb1 bpb1Var = (bpb1) z72Var.Y;
                    Boolean boolValueOf = Boolean.valueOf(z2 || !((m251) ((bpb1) z72Var.X).getValue()).b);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, boolValueOf);
                    x340Var.s0(u651Var);
                    objT = u651Var;
                }
                u651 u651Var2 = (u651) objT;
                wat watVar = (wat) x340Var.k(t4k.h);
                WeakHashMap weakHashMap = osl1.x;
                u85 u85Var = lhc.g(x340Var).c;
                boolean zI = x340Var.i(u651Var2) | x340Var.i(u85Var) | x340Var.i(watVar) | x340Var.i(c751Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    p651 p651Var = new p651(u651Var2, u85Var, watVar, c751Var, (lnm) null, (byte) 0);
                    c751Var = c751Var;
                    x340Var.s0(p651Var);
                    objT2 = p651Var;
                }
                qxd0.t(watVar, x340Var, (vu30) objT2);
                Object objT3 = x340Var.T();
                Object obj6 = objT3;
                if (objT3 == m4cVar) {
                    c9n c9nVarM = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(c9nVarM);
                    obj6 = c9nVarM;
                }
                c9n c9nVar = (c9n) obj6;
                q651 q651Var2 = (q651) this.b;
                Object objT4 = x340Var.T();
                byte b2 = 25;
                Object obj7 = objT4;
                if (objT4 == m4cVar) {
                    i751 i751VarA = q651Var2.d.a(new fp8(u651Var2.h, (byte) 25), u651Var2.l, c9nVar);
                    x340Var.s0(i751VarA);
                    obj7 = i751VarA;
                }
                i751 i751Var = (i751) obj7;
                rih1 rih1Var = rih1.a;
                boolean zI2 = x340Var.i(c751Var) | x340Var.i(i751Var);
                Object objT5 = x340Var.T();
                Object obj8 = objT5;
                if (zI2 || objT5 == m4cVar) {
                    lc41 lc41Var = new lc41(c751Var, i751Var, ou80Var2, (byte) 14);
                    x340Var.s0(lc41Var);
                    obj8 = lc41Var;
                }
                qxd0.t(rih1Var, x340Var, (vu30) obj8);
                cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
                boolean zI3 = x340Var.i(c751Var) | x340Var.i(i751Var) | x340Var.i(cir0Var);
                Object objT6 = x340Var.T();
                Object obj9 = objT6;
                if (zI3 || objT6 == m4cVar) {
                    v721 v721Var = new v721(cir0Var, c751Var, i751Var, b2);
                    x340Var.s0(v721Var);
                    obj9 = v721Var;
                }
                qxd0.i(rih1Var, (iu30) obj9, x340Var);
                od51 od51Var = (od51) rwq.h(c751Var.b1, x340Var, 0).getValue();
                if (od51Var != null) {
                    x340Var.i0(-964778719);
                    nyx.a(2, (wux) null, apo.r(-1147782310, new jt41(u651Var2, od51Var, b), x340Var), x340Var, 3078, 6);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-964508678);
                    x340Var.r(false);
                }
                return rih1Var;
            case 2:
                tqw tqwVar2 = (tqw) obj3;
                ((ufd) this.b).c.invoke(new q051(((q751) obj2).a, ((r751) obj).b.a, tqwVar2 != null ? n3o1.y(tqwVar2) : null));
                return rih1.a;
            case 3:
                ea51 ea51Var = (ea51) obj2;
                tqw tqwVar3 = (tqw) obj3;
                ga51 ga51Var = (ga51) this.b;
                kly0 kly0Var = ga51Var.c;
                wq61 wq61Var = ((fa51) obj).b;
                if (ea51Var instanceof ca51) {
                    qv01 qv01Var = (qv01) kly0Var.get();
                    Object obj10 = wq61Var.e;
                    String id = ((sq61) obj10).getId();
                    qv01Var.getClass();
                    qv01Var.a(o7h.d1(o7h.N0(o7h.J0(myo1.u(qv01Var.a.e(qv01.b, (String) null)), id), Collections.singletonList(id)), 3));
                    if (ga51Var.b.b) {
                        ot61 ot61Var = (ot61) ga51Var.d.get();
                        tbr0 tbr0Var = ga51Var.e;
                        String id2 = ((sq61) obj10).getId();
                        ot61Var.getClass();
                        tbr0Var.a(new y231(new nt61(id2)));
                    } else {
                        lzn0 lzn0Var = ga51Var.a;
                        String str3 = wq61Var.a.getViewUri().a;
                        tv80 tv80VarD = cvl1.d(tqwVar3);
                        Bundle bundle = new Bundle();
                        bundle.putString("settings_deeplink_item_id", ((sq61) obj10).getId());
                        bundle.putString("EXTRA_SOURCE", "SEARCH");
                        lzn0Var.a(str3, tv80VarD, bundle);
                    }
                } else {
                    if (!(ea51Var instanceof da51)) {
                        eg.o();
                        return null;
                    }
                    qv01 qv01Var2 = (qv01) kly0Var.get();
                    qv01Var2.a(o7h.J0(myo1.u(qv01Var2.a.e(qv01.b, (String) null)), ((sq61) wq61Var.e).getId()));
                }
                return rih1.a;
            case 4:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    gbx gbxVar = (gbx) this.b;
                    ldx ldxVar = ldx.c;
                    nim0 nim0Var = nim0.a;
                    Object objT7 = x340Var3.T();
                    if (objT7 == fkj0.X) {
                        obj4 = objT7;
                        ej41 ej41Var = ej41.S0;
                        x340Var3.s0(ej41Var);
                        obj4 = ej41Var;
                    }
                    obj4 = objT7;
                    wro1.h(gbxVar, ldxVar, s161.a(nim0Var, (iu30) obj4), (max) null, yla.s(x340Var3), (vzq0) null, false, (idn0) null, (ga80) null, cfj.a, x340Var3, 48, 6, 984);
                } else {
                    x340Var3.b0();
                }
                return rih1.a;
            case 5:
                ph51 ph51Var = (ph51) obj2;
                tqw tqwVar4 = (tqw) obj3;
                String str4 = ((qh51) obj).d;
                if (ph51Var != ph51.a) {
                    eg.o();
                    return null;
                }
                if (tqwVar4 != null) {
                    na9 na9Var = (na9) this.b;
                    if (str4 != null) {
                        if ((!ihc1.y0(str4) ? str4 : null) != null) {
                            na9Var.b.a(str4, n3o1.y(tqwVar4), (Bundle) null);
                        }
                    }
                }
                return rih1.a;
            case 6:
                kk51 kk51Var = (kk51) obj;
                tqw tqwVar5 = (tqw) obj3;
                if (((jk51) obj2).equals(jk51.a)) {
                    ((lzn0) ((kls0) this.b).b).a(kk51Var.a, cvl1.d(tqwVar5), (Bundle) null);
                    return rih1.a;
                }
                eg.o();
                return null;
            case 7:
                rk51 rk51Var = (rk51) obj;
                tqw tqwVar6 = (tqw) obj3;
                Parcelable m6h0Var = new m6h0(rk51Var.a, rk51Var.b);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("martini-launch-parameters", m6h0Var);
                a1r0 a1r0Var = ((uk51) this.b).b;
                String str5 = nik1.w6.a;
                if (tqwVar6 != null && (ou80Var = n3o1.y(tqwVar6).a) != null) {
                    str = ou80Var.a;
                }
                a1r0.j(a1r0Var, str5, str, bundle2, false, 8);
                return rih1.a;
            case 8:
                km61 km61Var = (km61) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                c8u0 c8u0Var = (c8u0) this.b;
                if (zBooleanValue) {
                    fn31.T(smo1.e(flo1.l(op71.f(), c8u0Var.e)), (o8n) null, 0, new b751(c8u0Var, (lnm) null, (byte) 4), 3);
                    return new it61(Boolean.TRUE);
                }
                km61.a(km61Var, "disableSeenReceipts", (Bundle) null, false, 6);
                return new it61(Boolean.TRUE);
            case 9:
                ((Number) obj3).intValue();
                wgo1.b((up51) this.b, (b0k) obj2, 0);
                return rih1.a;
            case 10:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    lb91 lb91Var = lb91.a;
                    Object objT8 = x340Var5.T();
                    if (objT8 == fkj0.X) {
                        objN = objT8;
                        objN = ktd.n(x340Var5);
                    }
                    objN = objT8;
                    lb91Var.a((idn0) objN, (qim0) null, (fb91) this.b, false, rr51.a, x340Var5, 24576, 10);
                } else {
                    x340Var5.b0();
                }
                return rih1.a;
            case 11:
                dv51 dv51Var = (fv51) obj;
                cv51 cv51Var = (cv51) obj2;
                tqw tqwVar7 = (tqw) obj3;
                if (cv51Var.equals(bv51.a)) {
                    dv51Var.a().invoke(Boolean.valueOf(!dv51Var.f()));
                } else {
                    if (!(cv51Var instanceof av51)) {
                        eg.o();
                        return null;
                    }
                    if (dv51Var instanceof dv51) {
                        to71 to71Var = (to71) ((gv51) this.b).b.get();
                        dv51 dv51Var2 = dv51Var;
                        w4i1 w4i1Var = dv51Var2.a;
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        yon1.C0();
                        to71Var.a(w4i1Var, tqwVar7 != null ? n3o1.y(tqwVar7) : null, dv51Var2.h);
                    } else if (!(dv51Var instanceof ev51)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1.a;
            case 12:
                ((mv51) this.b).a.invoke((vcv) obj2);
                return rih1.a;
            case 13:
                ((Number) obj3).intValue();
                uwo1.e(((wcv) this.b).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, (b0k) obj2, 0, 0, 1790);
                return rih1.a;
            case 14:
                int iOrdinal = ((jc61) obj2).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    ((lc61) ((et90) this.b).d).invoke();
                    return rih1.a;
                }
                eg.o();
                return null;
            case 15:
                tqw tqwVar8 = (tqw) obj3;
                if (qm61.a[((om61) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                kls0 kls0Var = (kls0) this.b;
                ((lzn0) kls0Var.b).a((String) kls0Var.c, cvl1.d(tqwVar8), (Bundle) null);
                return rih1.a;
            case 16:
                tqw tqwVar9 = (tqw) obj3;
                if (oq61.a[((mq61) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                yup0 yup0Var = (yup0) this.b;
                ((lzn0) yup0Var.c).a((String) yup0Var.d, cvl1.d(tqwVar9), (Bundle) null);
                return rih1.a;
            case 17:
                ny61 ny61Var = (ny61) obj;
                tqw tqwVar10 = (tqw) obj3;
                xh71.b(((xy61) this.b).a, new wa71(ny61Var.a, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, new vm71("ai-agent"), tqwVar10 != null ? n3o1.y(tqwVar10) : null, ny61Var.b, 2);
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                l071 l071Var = (x071) obj3;
                b7x b7xVar = b7x.a;
                r171 r171Var = (r171) this.b;
                uvk0 uvk0Var = (uvk0) r171Var.s1.getValue();
                tom tomVar = ((j171) obj).j;
                String str6 = tomVar.a;
                uvk0Var.getClass();
                sqk0 sqk0Var = new sqk0(uvk0Var, str6);
                y6h1 y6h1Var = sqk0Var.b;
                if (l071Var.equals(m071.a)) {
                    return null;
                }
                if (l071Var.equals(p071.a)) {
                    for (Object obj11 : tomVar.h) {
                        if (u890.j(((gxz0) obj11).c.a, r171Var.d1)) {
                            obj5 = obj11;
                            gxz0Var = (gxz0) obj5;
                            if (gxz0Var == null) {
                                w7h1Var = new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", "❤️")), y6h1Var, r6h1.c, System.currentTimeMillis());
                            } else {
                                String str7 = gxz0Var.b;
                                w7h1Var = new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str7 != null ? str7 : "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                            }
                        }
                    }
                    gxz0Var = (gxz0) obj5;
                    if (gxz0Var == null) {
                        w7h1Var = new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", "❤️")), y6h1Var, r6h1.c, System.currentTimeMillis());
                    } else {
                        String str8 = gxz0Var.b;
                        w7h1Var = new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str8 != null ? str8 : "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (l071Var.equals(q071.a)) {
                        return sqk0Var.g();
                    }
                    if (l071Var instanceof k071) {
                        j071 j071Var = ((k071) l071Var).a;
                        if (j071Var instanceof c071) {
                            x6h1 x6h1VarC = y6h1Var.c();
                            x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                        } else if (j071Var instanceof h071) {
                            x6h1 x6h1VarC2 = y6h1Var.c();
                            x6h1VarC2.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!(j071Var instanceof d071)) {
                                if (j071Var instanceof f071) {
                                    return ((vrl0) r171Var.t1.getValue()).e(((f071) j071Var).a);
                                }
                                return null;
                            }
                            x6h1 x6h1VarC3 = y6h1Var.c();
                            x6h1VarC3.i.add(new a7h1("expand_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var2;
                    }
                    if (!(l071Var instanceof u071)) {
                        if (l071Var instanceof l071) {
                            return sqk0Var.a(l071Var.a);
                        }
                        if ((l071Var instanceof v071) || (l071Var instanceof s071) || (l071Var instanceof n071) || (l071Var instanceof r071) || (l071Var instanceof t071) || (l071Var instanceof o071)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                i871 i871Var = (i871) obj;
                tqw tqwVar11 = (tqw) obj3;
                if (!((h871) obj2).equals(h871.a)) {
                    eg.o();
                    return null;
                }
                tv80 tv80VarY = tqwVar11 != null ? n3o1.y(tqwVar11) : null;
                kls0 kls0Var2 = (kls0) this.b;
                ((byp) kls0Var2.c).A(i871Var.a.a, new m551(kls0Var2, i871Var, tv80VarY));
                return rih1.a;
            case 20:
                xe71 xe71Var = (xe71) obj;
                we71 we71Var = (we71) obj2;
                tqw tqwVar12 = (tqw) obj3;
                ze71 ze71Var = (ze71) this.b;
                String str9 = xe71Var.a;
                if (tqwVar12 != null) {
                    tv80Var = n3o1.y(tqwVar12);
                } else {
                    ou80.Companion.getClass();
                    tv80Var = new tv80(new ou80(""), (y6r0) null);
                }
                if (we71Var.equals(ve71.a)) {
                    pcf.a(ze71Var.a, str9, tv80Var, (Bundle) null);
                } else {
                    if (!we71Var.equals(ue71.a)) {
                        eg.o();
                        return null;
                    }
                    ze71Var.c.b(nzy.k(str9), ze71Var.d, ze71Var.e, xe71Var.b, tv80Var);
                }
                return rih1.a;
            case 21:
                dz dzVar = dz.a;
                qh71 qh71Var = (qh71) obj;
                ph71 ph71Var = (ph71) obj2;
                gjz gjzVar = (gjz) ((ngs0) this.b).d;
                if (ph71Var.equals(nh71.a)) {
                    if (!u890.j(qh71Var.d, dzVar)) {
                        eg.o();
                        return null;
                    }
                    gjzVar.a.l();
                } else {
                    if (!ph71Var.equals(oh71.a)) {
                        eg.o();
                        return null;
                    }
                    dz dzVar2 = qh71Var.e;
                    if (dzVar2 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    if (!u890.j(dzVar2, dzVar)) {
                        eg.o();
                        return null;
                    }
                    gjzVar.a.l();
                }
                return rih1.a;
            case 22:
                jm71 jm71Var = (jm71) obj;
                fm71 fm71Var = (im71) obj3;
                if (!(fm71Var instanceof fm71)) {
                    return null;
                }
                hyl0 hyl0Var = (hyl0) this.b;
                hyl0Var.getClass();
                x6h1 x6h1VarC4 = hyl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("share_cards_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA = x6h1VarC4.a();
                c380 c380Var = jm71Var.a;
                int i = fm71Var.a;
                String strA = ((z771) c380Var.get(i)).a();
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC5 = y6h1VarA.c();
                x6h1VarC5.i.add(new a7h1("tab", strA, numValueOf, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA2 = x6h1VarC5.a();
                b7x b7xVar2 = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_select", 1, b7xVar2), y6h1VarA2, hyl0Var.a, System.currentTimeMillis());
            case 23:
                wp71 wp71Var = (wp71) obj;
                tp71 tp71Var = (tp71) obj3;
                b7x b7xVar3 = b7x.a;
                idd1 idd1Var = ((yp71) this.b).Z;
                if (tp71Var instanceof pp71) {
                    qyl0 qyl0Var = (qyl0) idd1Var.getValue();
                    qyl0Var.getClass();
                    x6h1 x6h1VarC6 = qyl0Var.b.c();
                    x6h1VarC6.i.add(new a7h1("existing_chats", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC6.a();
                    Integer numValueOf2 = Integer.valueOf(wp71Var.getPosition());
                    String chatUri = wp71Var.getChatUri();
                    x6h1 x6h1VarC7 = y6h1VarA3.c();
                    x6h1VarC7.i.add(new a7h1("chat_row", (String) null, numValueOf2, chatUri, (String) null));
                    x6h1VarC7.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC7.a();
                    String destination = wp71Var.getDestination();
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", destination != null ? destination : "")), y6h1VarA4, qyl0Var.a, System.currentTimeMillis());
                } else {
                    if (tp71Var.equals(qp71.a)) {
                        qyl0 qyl0Var2 = (qyl0) idd1Var.getValue();
                        qyl0Var2.getClass();
                        x6h1 x6h1VarC8 = qyl0Var2.b.c();
                        x6h1VarC8.i.add(new a7h1("existing_chats", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        y6h1 y6h1VarA5 = x6h1VarC8.a();
                        Integer numValueOf3 = Integer.valueOf(wp71Var.getPosition());
                        String chatUri2 = wp71Var.getChatUri();
                        x6h1 x6h1VarC9 = y6h1VarA5.c();
                        x6h1VarC9.i.add(new a7h1("chat_row", (String) null, numValueOf3, chatUri2, (String) null));
                        x6h1VarC9.j = true;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_reveal", 1, b7xVar3), x6h1VarC9.a(), qyl0Var2.a, System.currentTimeMillis());
                    }
                    if (!tp71Var.equals(sp71.a)) {
                        if (tp71Var instanceof rp71) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    qyl0 qyl0Var3 = (qyl0) idd1Var.getValue();
                    qyl0Var3.getClass();
                    x6h1 x6h1VarC10 = qyl0Var3.b.c();
                    x6h1VarC10.i.add(new a7h1("suggested_chats", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC10.a();
                    Integer numValueOf4 = Integer.valueOf(wp71Var.getPosition());
                    String chatUri3 = wp71Var.getChatUri();
                    x6h1 x6h1VarC11 = y6h1VarA6.c();
                    x6h1VarC11.i.add(new a7h1("chat_row", (String) null, numValueOf4, chatUri3, (String) null));
                    x6h1VarC11.j = true;
                    y6h1 y6h1VarA7 = x6h1VarC11.a();
                    String destination2 = wp71Var.getDestination();
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", destination2 != null ? destination2 : "")), y6h1VarA7, qyl0Var3.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 24:
                tqw tqwVar13 = (tqw) obj3;
                pcf.a(((ls71) this.b).b, ((ks71) obj).b, tqwVar13 != null ? n3o1.y(tqwVar13) : null, (Bundle) null);
                return rih1.a;
            case 25:
                if (((ms71) obj2).equals(ms71.a)) {
                    ((ps71) this.b).c.invoke();
                    return rih1.a;
                }
                eg.o();
                return null;
            case 26:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    uwo1.e(cwl1.o0(x340Var7, ((mw71) this.b).b), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var7, 0, 0, 1790);
                } else {
                    x340Var7.b0();
                }
                return rih1.a;
            case 27:
                pz71 pz71Var = (pz71) this.b;
                String str10 = ((nz71) obj2).a;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str10));
                    intent.addFlags(268435456);
                    pz71Var.a.startActivity(intent);
                    break;
                } catch (Exception e) {
                    n57.s("Exception in ShimmeringStoryTextElementImpl for url " + str10 + ": " + e.getMessage());
                }
                return rih1.a;
            case 28:
                ((Number) obj3).intValue();
                zkt0 zkt0Var = (zkt0) this.b;
                nim0 nim0Var2 = nim0.a;
                yz71 yz71Var = a081.a;
                wkt0.a(zkt0Var, u291.r(nim0Var2, 12.0f), (ksl) null, 0L, false, (b0k) obj2, 0, 28);
                return rih1.a;
            default:
                long jLongValue = ((Number) obj).longValue();
                Long l = (Long) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                return ((zwg) ((mre0) this.b).b).L(new m4v0(jLongValue, l != null ? l.longValue() : -1L, zBooleanValue2, new Date(0L), !zBooleanValue2, true, false, false, (String) null, (iix0) null, 4, (String) null, 2944));
        }
    }
}
