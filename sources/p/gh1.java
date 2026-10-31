package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gh1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh1(List list, ws61 ws61Var, boolean z, iu30 iu30Var) {
        super(1);
        this.a = (byte) 27;
        this.c = list;
        this.e = ws61Var;
        this.b = z;
        this.d = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x02db  */
    public final Object invoke(Object obj) {
        float fFloatValue;
        qa20 qa20Var;
        w7h1 w7h1Var;
        byte b = this.a;
        byte b2 = 3;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                rtb0 rtb0Var = (rtb0) obj;
                af10 af10Var = (af10) obj4;
                iu30 iu30Var = (iu30) obj2;
                yg1 yg1Var = (yg1) obj3;
                rtb0.c(rtb0Var, (Object) null, new j2i(-1995884026, new ch1(yg1Var, (byte) 1), true), 3);
                if (z) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(1113570401, new eh1((byte) 0, yg1Var, iu30Var), true), 3);
                    if (yg1Var.j.c.length() > 0) {
                        rtb0.c(rtb0Var, (Object) null, new j2i(-666416900, new eh1((byte) 1, yg1Var, iu30Var), true), 3);
                    }
                } else {
                    rtb0.c(rtb0Var, (Object) null, new j2i(-1854522198, new ch1(yg1Var, (byte) 2), true), 3);
                }
                mh1 mh1Var = yg1Var.d;
                String str = yg1Var.f;
                if (mh1Var.a.length() > 0) {
                    if (z) {
                        rtb0.c(rtb0Var, (Object) null, new j2i(-1986609229, new fh1(yg1Var, af10Var, iu30Var, (byte) 0), true), 3);
                    } else {
                        rtb0.c(rtb0Var, (Object) null, new j2i(1850350204, new fh1(yg1Var, af10Var, iu30Var, (byte) 1), true), 3);
                    }
                }
                if (!z) {
                    rtb0.c(rtb0Var, (Object) null, k4i.a, 3);
                    rtb0.c(rtb0Var, (Object) null, new j2i(-1128789415, new eh1((byte) 2, yg1Var, iu30Var), true), 3);
                    rtb0.c(rtb0Var, (Object) null, k4i.b, 3);
                } else if (yg1Var.h.a.length() > 0) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(1849722548, new ch1(yg1Var, (byte) 3), true), 3);
                }
                if (yg1Var.g.c.length() > 0) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(-1733067814, new eh1((byte) 3, yg1Var, iu30Var), true), 3);
                }
                if (str.length() > 0) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(2103263963, new pf1(xxq0.b(str, new qj(iu30Var, (byte) 27)), (byte) 1), true), 3);
                }
                return rih1Var;
            case 1:
                return l6o1.A(new jpg0(((azo) ((x83) obj3).b.i).a((elo) obj2, z), new k83((wto) obj4, (byte) 0)));
            case 2:
                ven0 ven0Var = (ven0) obj2;
                if (z && obj3 != null && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.valueOf(lz20.b((lz20) obj4)));
                }
                return rih1Var;
            case 3:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, ((String) obj3) + ". " + ((String) obj2) + ". " + ((String) obj4));
                b261.x(e261Var, 2);
                b261.E(e261Var, z ? rze1.a : rze1.b);
                return rih1Var;
            case 4:
                eg80 eg80Var = (eg80) obj;
                if (z) {
                    xu30 xu30Var = (xu30) obj3;
                    m0d m0dVar = (m0d) obj2;
                    if (m0dVar == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    xu30Var.invoke(m0dVar, (String) obj4, eg80Var);
                }
                return rih1Var;
            case 5:
                rtb0 rtb0Var2 = (rtb0) obj;
                iu30 iu30Var2 = (iu30) obj2;
                vu30 vu30Var = (vu30) obj4;
                c380 c380Var = (c380) obj3;
                if (z) {
                    rtb0Var2.e(c380Var.size(), new kwd(c380Var, (byte) 4), new kwd(c380Var, (byte) 5), new j2i(2039820996, new oi1(c380Var, vu30Var, iu30Var2, c380Var, (byte) 2), true));
                } else {
                    rtb0Var2.e(c380Var.size(), new kwd(c380Var, (byte) 6), new kwd(c380Var, (byte) 7), new j2i(2039820996, new rf1((List) c380Var, (Object) vu30Var, iu30Var2, b2), true));
                }
                return rih1Var;
            case 6:
                kd31 kd31Var = (kd31) obj;
                tob1 tob1Var = (tob1) obj4;
                if (z) {
                    fFloatValue = ((Number) ((o95) obj3).e()).floatValue() * ((Number) ((tob1) obj2).getValue()).floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                kd31Var.b(fFloatValue);
                kd31Var.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 7:
                lik1 lik1Var = (lik1) obj4;
                zeu zeuVar = (zeu) obj3;
                ayl aylVar = (ayl) zeuVar.c;
                String str2 = (String) obj2;
                z4q z4qVar = (z4q) zeuVar.a;
                if (z) {
                    drj0 drj0VarA = z4qVar.a(lik1Var);
                    ayl.c(aylVar, str2, lik1Var.a, 4);
                    drj0VarA.j(str2, 4, false);
                    kt91 kt91Var = (kt91) zeuVar.b;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963291});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131963291, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                } else {
                    drj0 drj0VarA2 = z4qVar.a(lik1Var);
                    ayl.b(aylVar, str2, lik1Var.a, 4);
                    drj0VarA2.j(str2, 4, true);
                }
                return rih1Var;
            case 8:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, ((af5) obj3).b);
                b261.t(e261Var2, 0);
                if (z) {
                    b261.g(e261Var2, (String) obj4, new q7u((iu30) obj2, (byte) 15));
                }
                return rih1Var;
            case 9:
                ((bk90) ((byp) obj3).e).a(new yj90(((hwq) obj2).a, (zuc0) obj4, new rj90(3, z), (tv80) obj));
                return rih1Var;
            case 10:
                wfx wfxVar = ((pp) obj4).b;
                return new afr(wfxVar.b, wfxVar.a, (bi4) obj3, this.b, (ai4) obj2);
            case 11:
                ((Boolean) obj).getClass();
                qa20 qa20Var2 = (qa20) obj2;
                bw91 bw91Var = (bw91) obj3;
                if (z) {
                    bw91Var.remove(qa20Var2.a);
                } else {
                    bw91Var.add(qa20Var2.a);
                }
                uny unyVar = (uny) obj4;
                String str3 = qa20Var2.a;
                bw91 bw91Var2 = (bw91) unyVar.b;
                ek60 ek60VarListIterator = bw91Var2.listIterator();
                do {
                    ek60 ek60Var = ek60VarListIterator;
                    if (!ek60Var.hasNext()) {
                        bhn0.t("Collection contains no element matching the predicate.");
                        return null;
                    }
                    qa20Var = (qa20) ek60Var.next();
                } while (!u890.j(qa20Var.a, str3));
                int iIndexOf = bw91Var2.indexOf(qa20Var);
                if (iIndexOf != -1) {
                    if (((a720) unyVar.c).a) {
                        bw91Var2.replaceAll(wrn.c);
                    }
                    qa20 qa20Var3 = new qa20(qa20Var.a, !qa20Var.b, qa20Var.c);
                    bw91Var2.set(iIndexOf, qa20Var3);
                    ((iu30) unyVar.d).invoke(qa20Var3);
                }
                return rih1Var;
            case 12:
                xmu0 xmu0Var = ((h630) obj3).f;
                int iOrdinal = ((pc31) obj).ordinal();
                if (iOrdinal == 0) {
                    xmu0Var.f(z ? (byte) 1 : (byte) 3, (String) obj2, ((x4i1) obj4).a);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    xmu0Var.e();
                }
                return rih1Var;
            case 13:
                c630 c630Var = (c630) obj;
                xmu0 xmu0Var2 = ((h630) obj3).f;
                int i = z ? 1 : 3;
                int iOrdinal2 = c630Var.ordinal();
                if (iOrdinal2 == 0) {
                    i8h1 i8h1Var = (i8h1) xmu0Var2.b;
                    tdl0 tdl0Var = (tdl0) xmu0Var2.c;
                    x6h1 x6h1VarC = tdl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = tdl0Var.c;
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    String str4 = (String) obj2;
                    String str5 = (String) obj4;
                    x6h1 x6h1VarC2 = ((tdl0) xmu0Var2.c).b.c();
                    x6h1VarC2.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    i8h1 i8h1Var2 = (i8h1) xmu0Var2.b;
                    int iC = l1d.C(i);
                    b7x b7xVar = b7x.a;
                    if (iC == 0) {
                        x6h1 x6h1VarC3 = y6h1VarA2.c();
                        x6h1VarC3.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str4)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iC == 1) {
                        x6h1 x6h1VarC4 = y6h1VarA2.c();
                        x6h1VarC4.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_user_from_playlist", 1, sqg0.J(new mmr0[]{new mmr0("playlist", str5), new mmr0("user_to_be_removed", str4)})), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iC == 2) {
                        x6h1 x6h1VarC5 = y6h1VarA2.c();
                        x6h1VarC5.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str4)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iC == 3) {
                        x6h1 x6h1VarC6 = y6h1VarA2.c();
                        x6h1VarC6.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_playlist", 1, Collections.singletonMap("playlist", str5)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iC == 4) {
                        x6h1 x6h1VarC7 = y6h1VarA2.c();
                        x6h1VarC7.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_user_a_playlist_collaborator", 1, sqg0.J(new mmr0[]{new mmr0("playlist", str5), new mmr0("user_to_be_made_collaborator", str4)})), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC != 5) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC8 = y6h1VarA2.c();
                        x6h1VarC8.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_user_as_playlist_collaborator", 1, sqg0.J(new mmr0[]{new mmr0("playlist", str5), new mmr0("user_to_be_removed_as_collaborator", str4)})), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                    }
                    i8h1Var2.m(w7h1Var, (xj61) null);
                }
                return rih1Var;
            case 14:
                ((x860) obj3).b((String) obj2, (String) obj4, (tv80) obj, z);
                return rih1Var;
            case 15:
                Function0 function0 = (Function0) obj;
                if (!z && !((Boolean) ((tob1) obj2).getValue()).booleanValue()) {
                    w9i1 w9i1Var = (w9i1) obj3;
                    if (ihc1.y0(w9i1Var.t1.d().d) && ihc1.y0(w9i1Var.s1.d().d)) {
                        String string = w9i1Var.u1.d().d.toString();
                        String strE = w9i1Var.t.a.e(a390.b, (String) null);
                        if (strE == null) {
                            strE = "";
                        }
                        if (u890.j(string, strE) && ((Collection) w9i1Var.n1.a.getValue()).isEmpty()) {
                            function0.invoke();
                        } else {
                            ((ven0) obj4).setValue(function0);
                        }
                    } else {
                        ((ven0) obj4).setValue(function0);
                    }
                }
                return rih1Var;
            case 16:
                List list = (List) obj3;
                ((rtb0) obj).e(list.size(), (iu30) null, new xg50(list, (byte) 17), new j2i(2039820996, new mxb0(list, this.b, (String) obj2, (Function0) obj4, (byte) 0), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Context context = (Context) obj;
                cfe1 cfe1Var = z ? new cfe1(context) : new VideoSurfaceView(context);
                cfe1Var.setScaleType((b3k1) obj3);
                cfe1Var.setContentDescription((String) obj2);
                cfe1Var.addOnAttachStateChangeListener(new t760((ven0) obj4, (byte) 1));
                return cfe1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                xmu0 xmu0Var3 = ((k3g0) obj3).e;
                int iOrdinal3 = ((pc31) obj).ordinal();
                if (iOrdinal3 == 0) {
                    xmu0Var3.f(z ? 5 : 6, (String) obj2, ((x4i1) obj4).a);
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    xmu0Var3.e();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                tv80 tv80Var = (tv80) obj;
                if (z) {
                    ((j0j0) obj3).a.a((String) obj2, tv80Var, (Bundle) null);
                } else {
                    ((Function0) obj4).invoke();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                gid gidVar = (gid) obj3;
                p8n0 p8n0VarA = ((r8n0) gidVar.b).a((String) obj2);
                if (p8n0VarA != null) {
                    fn31.T((llm) gidVar.c, (o8n) null, 0, new hl1(this.b, p8n0VarA, (String) obj4, (lnm) null, (byte) 10), 3);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj).longValue();
                p3u0 p3u0Var = (p3u0) obj3;
                lgy lgyVar = p3u0Var.h;
                m0u0 m0u0Var = p3u0Var.i;
                lgyVar.N(m0u0Var, p3u0Var.c.getDuration(), 0L, this.b);
                lgyVar.M(m0u0Var, ((p8u0) obj2).f, ((p8u0) obj4).f, this.b);
                return rih1Var;
            case 22:
                e261 e261Var3 = (e261) obj;
                String strI = (String) obj2;
                jmb1 jmb1Var = (jmb1) obj3;
                boolean zJ = u890.j(jmb1Var.i, j6u.a);
                if (!zJ && z) {
                    strI = xcg1.i(jmb1Var.b.a, ", ", strI);
                } else if (zJ) {
                    strI = (String) obj4;
                }
                if (strI != null) {
                    b261.n(e261Var3, strI);
                }
                return rih1Var;
            case 23:
                mzr0 mzr0Var = (mzr0) obj3;
                fn31.T(cto1.q((dg30) mzr0Var.a), (o8n) null, 0, new du2(mzr0Var, (String) obj2, this.b, (String) obj4, (lnm) null, (byte) 14), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((wmy) obj3).s((String) obj2, (String) obj4, (tv80) obj, z);
                return rih1Var;
            case 25:
                c380 c380Var2 = (c380) obj3;
                ((rtb0) obj).e(c380Var2.size(), new rw11(c380Var2, (byte) 3), new rw11(c380Var2, (byte) 4), new j2i(802480018, new mxb0((List) c380Var2, this.b, obj2, obj4, (byte) 2), true));
                return rih1Var;
            case 26:
                float fFloatValue2 = ((Number) obj).floatValue();
                ven0 ven0Var2 = (ven0) obj4;
                if (z && !((Boolean) ven0Var2.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.TRUE);
                    ((Function0) obj3).invoke();
                }
                ((iu30) obj2).invoke(Long.valueOf((long) fFloatValue2));
                return rih1Var;
            case 27:
                List list2 = (List) obj3;
                ((rtb0) obj).e(list2.size(), (iu30) null, new rw11(list2, (byte) 8), new j2i(2039820996, new mxb0(list2, (ws61) obj4, z, (iu30) obj2), true));
                return rih1Var;
            case 28:
                rtb0 rtb0Var3 = (rtb0) obj;
                boolean z2 = this.b;
                if (z2) {
                    rtb0.c(rtb0Var3, "header", rgj.b, 2);
                }
                List list3 = (List) obj3;
                rtb0Var3.e(list3.size(), new rw11(list3, (byte) 9), new rw11(list3, (byte) 10), new j2i(2039820996, new mxb0(list3, (ib60) obj2, (ga51) obj4, z2, (byte) 4), true));
                return rih1Var;
            default:
                kex kexVar = (kex) obj;
                if (z) {
                    kexVar.a("smart_filter_clear", new j2i(1654731887, new h621((Function0) obj4, (byte) 10), true));
                } else {
                    kexVar.a("smart_filter_all", djj.a);
                }
                c380 c380Var3 = (c380) obj3;
                kexVar.b(c380Var3.size(), new j2i(-1673449743, new u40(c380Var3, (iu30) obj2, (byte) 4), true), new nec0(c380Var3, (byte) 24));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh1(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh1(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh1(byte b, Object obj, String str, String str2, boolean z) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = str;
        this.e = str2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh1(af5 af5Var, boolean z, String str, iu30 iu30Var) {
        super(1);
        this.a = (byte) 8;
        this.c = af5Var;
        this.b = z;
        this.e = str;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh1(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh1(boolean z, c380 c380Var, cv30 cv30Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = c380Var;
        this.e = cv30Var;
        this.d = iu30Var;
    }
}
