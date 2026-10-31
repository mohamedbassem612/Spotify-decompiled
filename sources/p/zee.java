package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zee extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zee(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        nng nngVar;
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        mq70 mq70Var2;
        up70 up70VarA2;
        ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj3;
        x340Var.i0(-921761998);
        String str2 = ((mng) obj2).a;
        boolean zG = x340Var.g(str2);
        qng qngVar = (qng) this.b;
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = d3p1.F(qngVar.a, qngVar.i, str2);
            x340Var.s0(objT);
        }
        i1r i1rVar = (k1r) rwq.h((zob1) objT, x340Var, 0).getValue();
        if (i1rVar instanceof j1r) {
            nngVar = new nng(30, true);
        } else if (i1rVar instanceof i1r) {
            fng fngVar = (fng) i1rVar.a;
            xkk1 xkk1Var = fngVar.b;
            vp70 vp70Var = vp70.c;
            String str3 = (xkk1Var == null || (mq70Var2 = xkk1Var.b) == null || (up70VarA2 = mq70Var2.a(vp70Var)) == null) ? null : up70VarA2.a.a;
            xkk1 xkk1Var2 = fngVar.b;
            String str4 = (xkk1Var2 == null || (mq70Var = xkk1Var2.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a;
            if (str3 == null) {
                if (str4 == null) {
                    str4 = "";
                }
                str = str4;
            } else {
                str = str3;
            }
            boolean z = !(str3 == null || str3.length() == 0);
            jo70 jo70Var = fngVar.a;
            nngVar = new nng(false, z, str, jo70Var != null ? jo70Var.c : null, jo70Var != null ? jo70Var.a : null);
        } else {
            if (!(i1rVar instanceof h1r)) {
                eg.o();
                return null;
            }
            nngVar = new nng(30, false);
        }
        boolean zI = x340Var.i(qngVar) | x340Var.g(nngVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new pid(qngVar, nngVar, (lnm) null, (byte) 18);
            x340Var.s0(objT2);
        }
        qxd0.t(nngVar.e, x340Var, (vu30) objT2);
        x340Var.r(false);
        return nngVar;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        return new vh((Context) obj2, (ViewGroup) obj3, (kfh) this.b);
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        rph rphVar = (rph) obj3;
        iph iphVar = (iph) obj4;
        xmh xmhVar = (xmh) this.b;
        String str = rphVar.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-comments-interactivity-sheet";
        x6h1VarI.f = "6.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        boolean z = iphVar instanceof hoh;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        }
        if (iphVar instanceof znh) {
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
        if (iphVar instanceof bph) {
            x6h1 x6h1VarC3 = y6h1VarA.c();
            x6h1VarC3.i.add(new a7h1("show_all_comments_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
        }
        if (iphVar instanceof ynh) {
            x6h1 x6h1VarC4 = y6h1VarA.c();
            x6h1VarC4.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            x6h1 x6h1VarC5 = x6h1VarC4.a().c();
            x6h1VarC5.i.add(new a7h1("dismiss_reply_reminder_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
        }
        if (iphVar instanceof zoh) {
            x6h1 x6h1VarC6 = y6h1VarA.c();
            x6h1VarC6.i.add(new a7h1("sensitive_comments_disclaimer", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = true;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
        }
        if (!(iphVar instanceof yoh)) {
            if (!(iphVar instanceof gph)) {
                return null;
            }
            x6h1 x6h1VarC7 = y6h1VarA.c();
            x6h1VarC7.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            x6h1 x6h1VarC8 = x6h1VarC7.a().c();
            x6h1VarC8.i.add(new a7h1("add_timestamp_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
        }
        ebe0 ebe0Var = rphVar.c;
        ebe0 ebe0Var2 = ebe0Var instanceof ebe0 ? ebe0Var : null;
        qmy qmyVar = ebe0Var2 != null ? (qmy) ebe0Var2.a : null;
        cwe1 cwe1Var = xmhVar.c;
        boolean z2 = qmyVar != null ? qmyVar.e : true;
        wjh wjhVar = cwe1Var.a;
        int i2 = 2;
        if (!wjhVar.a() || (z2 && !wjhVar.b())) {
            i = 3;
        } else {
            i = hwe1.a(qmyVar != null ? qmyVar.d : 0, rphVar.i) ? 1 : 2;
        }
        x6h1 x6h1VarC9 = y6h1VarA.c();
        x6h1VarC9.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC9.j = false;
        y6h1 y6h1VarA2 = x6h1VarC9.a();
        int iC = l1d.C(i);
        if (iC == 0) {
            i2 = 1;
        } else if (iC != 1) {
            if (iC != 2) {
                eg.o();
                return null;
            }
            i2 = 4;
        }
        x6h1 x6h1VarC10 = y6h1VarA2.c();
        x6h1VarC10.i.add(new a7h1("post_comment_button", (String) null, (Integer) null, (String) null, ktk0.g(i2)));
        x6h1VarC10.j = false;
        y6h1 y6h1VarA3 = x6h1VarC10.a();
        Comment comment = rphVar.p;
        String strR = comment != null ? comment.r() : null;
        if (strR != null) {
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit_comment_reply", 1, Collections.singletonMap("comment_uri", strR)), y6h1VarA3, r6h1.c, System.currentTimeMillis());
        }
        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("submit_comment", 1, Collections.singletonMap("entity_id", str)), y6h1VarA3, r6h1.c, System.currentTimeMillis());
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        jjm0 jjm0Var = (jjm0) obj;
        swh swhVar = (swh) obj2;
        int iIntValue = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj3;
        x340Var.i0(-205041612);
        pt ptVar = (pt) this.b;
        ven0 ven0VarH = rwq.h((xe01) ((lc20) ptVar.i).d, x340Var, 0);
        String str = swhVar.a;
        boolean zI = x340Var.i(ptVar) | x340Var.i(swhVar);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new bag(ptVar, swhVar, (lnm) null, (byte) 15);
            x340Var.s0(objT);
        }
        qxd0.t(str, x340Var, (vu30) objT);
        boolean zI2 = x340Var.i(ptVar) | x340Var.i(swhVar);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new vd2(ptVar, swhVar, (lnm) null, (byte) 7);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        twh twhVar = new twh(swhVar, new gae(((vf50) ven0VarH.getValue()).a).f());
        x340Var.r(false);
        return twhVar;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        return new uvk0(((yyh) this.b).b);
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ihm0 ihm0Var = (ihm0) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(ihm0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            ((ham) ((zsc) this.b).d).c(ihm0Var, iu30Var, (qim0) null, x340Var2, i & 126);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return new as0((Context) obj2, (sbk) this.b, (iu30) obj4);
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        kdn0 kdn0Var = new kdn0();
        jb3 jb3Var = (jb3) this.b;
        return new b14((Context) obj2, (ViewGroup) obj3, new ne(3, new puh(kdn0Var, jb3Var, (byte) 29)), jb3Var, kdn0Var);
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        gok gokVar = (gok) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? x340Var.g(gokVar) : x340Var.i(gokVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            v8r.a(gokVar, ((lok) this.b).d.a(), iu30Var, x340Var2, (i & 14) | ((i << 3) & 896));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj3;
        erk erkVar = (erk) this.b;
        return new jrk(viewGroup, (Context) obj2, erkVar.a, erkVar.b, erkVar.c);
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj3;
        grk grkVar = (grk) this.b;
        return new jrk(viewGroup, (Context) obj2, grkVar.a, grkVar.b, grkVar.d);
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        oxk oxkVar = (oxk) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        ayk aykVar = (ayk) this.b;
        u9b u9bVar = aykVar.e;
        jf4 jf4Var = u9bVar.a;
        jf4 jf4Var2 = u9bVar.a;
        boolean z3 = jf4Var2.v() && jf4Var2.e();
        int i = aykVar.a.N0;
        boolean z4 = false;
        nu nuVar = aykVar.g;
        boolean z5 = jf4Var.v() && jf4Var.a();
        if (jf4Var.v() && jf4Var.t()) {
            z2 = true;
            z = true;
        } else {
            z = false;
            z2 = true;
        }
        e27 e27Var = aykVar.h;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(aykVar);
        if ((((iIntValue & 112) ^ 48) > 32 && x340Var2.g(iu30Var)) || (iIntValue & 48) == 32) {
            z4 = z2;
        }
        boolean z6 = zI | z4;
        Object objT = x340Var2.T();
        if (z6 || objT == fkj0.X) {
            objT = new kjk(aykVar, iu30Var, (byte) 8);
            x340Var2.s0(objT);
        }
        x2g0.b(oxkVar, (iu30) objT, z3, nuVar, e27Var, (qim0) null, i, z5, z, x340Var2, iIntValue & 14);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:221:0x0775 A[PHI: r8
      0x0775: PHI (r8v22 java.lang.String) = (r8v10 java.lang.String), (r8v0 java.lang.String) binds: [B:226:0x0783, B:220:0x0773] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:279:0x085f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0863  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        CompletableCreate completableFromAction;
        CompletableCreate completableCreateD;
        w7h1 w7h1Var;
        String str;
        w4i1 w4i1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        String str2 = "";
        Object obj5 = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                yee yeeVar = (yee) obj2;
                vee veeVar = (vee) obj3;
                tqw tqwVar = (tqw) obj4;
                bfe bfeVar = (bfe) this.b;
                q8n q8nVar = bfeVar.d;
                yee yeeVar2 = bfe.X;
                BehaviorSubject behaviorSubject = bfeVar.g;
                mr4 mr4Var = bfeVar.e;
                behaviorSubject.onNext(yee.a(yeeVar, false));
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                int iOrdinal = veeVar.ordinal();
                if (iOrdinal != 0) {
                    int i = 1;
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    if (!mr4Var.j() || tv80VarY == null) {
                        completableFromAction = new CompletableFromAction(new afe(bfeVar, i, tv80VarY, (byte) 0));
                        completableCreateD = completableFromAction;
                    } else {
                        completableCreateD = j2h1.D(q8nVar, new hl0(bfeVar, tv80VarY, true, (lnm) null, (byte) 7));
                    }
                } else if (!mr4Var.j() || tv80VarY == null) {
                    completableFromAction = new CompletableFromAction(new afe(bfeVar, 2, tv80VarY, (byte) 0));
                    completableCreateD = completableFromAction;
                } else {
                    completableCreateD = j2h1.D(q8nVar, new hl0(bfeVar, tv80VarY, false, (lnm) null, (byte) 7));
                }
                return new CompletableDoFinally(completableCreateD, new bm0(bfeVar, yeeVar, (byte) 16));
            case 1:
                ((Number) obj3).intValue();
                return new txl0(new dsk0((String) ((umf0) this.b).d, (byte) 14));
            case 2:
                ale aleVar = (ale) obj;
                ((Number) obj3).intValue();
                hyl0 hyl0Var = ((ele) this.b).c;
                hyl0Var.getClass();
                x6h1 x6h1VarC = hyl0Var.b.c();
                x6h1VarC.i.add(new a7h1("share_cards_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String strA = aleVar.a.a();
                Integer numValueOf = Integer.valueOf(aleVar.b);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("share_card", strA, numValueOf, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = hyl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA2);
                return new iyl0(new opl0(new r6h1(arrayList, r6h1Var2.b), (byte) 19));
            case 3:
                hle hleVar = (hle) obj2;
                ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(1219857149);
                jle jleVar = (jle) this.b;
                String str3 = ((gle) rwq.h(d3p1.H(jleVar.a, jleVar.b, hleVar), x340Var, 0).getValue()).a;
                ile ileVar = new ile(str3 != null ? str3 : "", hleVar.b);
                x340Var.r(false);
                return ileVar;
            case 4:
                ((Number) obj3).intValue();
                return new ifl0(n3p1.o(((rqe) this.b).a.D));
            case 5:
                bve bveVar = (bve) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var2 = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? x340Var2.g(bveVar) : x340Var2.i(bveVar) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= x340Var2.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(i2 & 1, (i2 & 147) != 146)) {
                    ((eve) this.b).c(bveVar, iu30Var, x340Var3, i2 & 126);
                } else {
                    x340Var3.b0();
                }
                return rih1.a;
            case 6:
                wve wveVar = (wve) obj;
                ((Number) obj3).intValue();
                return new cvk0(new dvk0(new bqk0(((yve) this.b).e, (byte) 22)), Integer.valueOf(wveVar.a), wveVar.b);
            case 7:
                ddl0 ddl0Var = (ddl0) obj;
                whf whfVar = (whf) obj2;
                h2f h2fVar = (p3f) obj4;
                b7x b7xVar = b7x.a;
                r6h1 r6h1Var3 = ddl0Var.a;
                y6h1 y6h1Var = ddl0Var.b;
                r6h1 r6h1VarB = ddl0Var.b();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-live-entity-chat-user-profile-sheet";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA3 = x6h1VarI.a();
                if (h2fVar instanceof u2f) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("chat_feed", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC3.a(), r6h1Var3, System.currentTimeMillis());
                } else if (h2fVar instanceof h2f) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("chat_feed", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC4.a();
                    h2f h2fVar2 = h2fVar;
                    String str4 = h2fVar2.a;
                    Integer numValueOf2 = Integer.valueOf(h2fVar2.b);
                    x6h1 x6h1VarC5 = y6h1VarA4.c();
                    x6h1VarC5.i.add(new a7h1("message_row", str4, numValueOf2, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("overflow_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (h2fVar instanceof n3f) {
                        i8h1 i8h1Var = ((s0f) this.b).f;
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA3;
                        ((xjn) k7h1Var).b = r6h1VarB;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var.f(k7h1Var.a(), (Set) null);
                        return null;
                    }
                    if (h2fVar instanceof q2f) {
                        x6h1 x6h1VarC7 = y6h1VarA3.c();
                        x6h1VarC7.i.add(new a7h1("report_comment_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", u2p1.r(whfVar.a))), x6h1VarC7.a(), r6h1VarB, System.currentTimeMillis());
                    } else {
                        if (!(h2fVar instanceof m1f)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC8 = y6h1Var.c();
                        x6h1VarC8.i.add(new a7h1("chat_feed", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                        x6h1VarC9.i.add(new a7h1("disclaimer_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                        x6h1VarC10.i.add(new a7h1("rules_link", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC10.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", ((m1f) h2fVar).a)), x6h1VarC10.a(), r6h1Var3, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 8:
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                xtb0 xtb0VarA = aub0.a(0, b0kVar, 3);
                y9f y9fVar = (y9f) this.b;
                irn1.u((qim0) null, apo.r(-2107067947, new u9f(y9fVar, (byte) 1), b0kVar), (vu30) null, (erl1) null, apo.r(-2078798769, new k8((r9f) obj, xtb0VarA, y9fVar, (iu30) obj2, (byte) 18), b0kVar), b0kVar, 24624, 13);
                return rih1.a;
            case 9:
                rih1 rih1Var = rih1.a;
                ncf ncfVar = (ncf) obj;
                iu30 iu30Var2 = (iu30) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                Object obj6 = fkj0.X;
                uff uffVar = (uff) this.b;
                tgf tgfVar = uffVar.e;
                goe goeVar = ncfVar.a;
                String str5 = goeVar.a;
                x340 x340Var4 = (b0k) obj3;
                boolean zG = x340Var4.g(str5);
                Object objT = x340Var4.T();
                if (zG || objT == obj6) {
                    uvk0 uvk0Var = new uvk0(pcf.d(6, str5, (String) null));
                    x340Var4.s0(uvk0Var);
                    objT = uvk0Var;
                }
                uvk0 uvk0Var2 = (uvk0) objT;
                qgf qgfVar = tgfVar.b;
                if (qgfVar instanceof qgf) {
                    String str6 = qgfVar.a;
                    if (str6 == null) {
                        str = str2;
                    } else {
                        str = str6;
                    }
                } else {
                    if (qgfVar instanceof rgf) {
                        str2 = ((rgf) qgfVar).b;
                        if (str2 != null) {
                            str = str2;
                        }
                    } else if (!(qgfVar instanceof ogf) && !(qgfVar instanceof pgf)) {
                        eg.o();
                        return null;
                    }
                    str = str5;
                }
                cir0 cir0Var = (cir0) x340Var4.k(k2r0.a);
                int i3 = (iIntValue2 & 112) ^ 48;
                boolean zG2 = x340Var4.g(cir0Var) | ((i3 > 32 && x340Var4.g(iu30Var2)) || (iIntValue2 & 48) == 32);
                Object objT2 = x340Var4.T();
                if (zG2 || objT2 == obj6) {
                    objT2 = new xw0(cir0Var, iu30Var2, (lnm) null, (byte) 1);
                    x340Var4.s0(objT2);
                }
                qxd0.t(rih1Var, x340Var4, (vu30) objT2);
                g431 g431VarH = cir0Var.h();
                boolean zI = x340Var4.i(uffVar);
                if ((i3 <= 32 || !x340Var4.g(iu30Var2)) && (iIntValue2 & 48) != 32) {
                    z = false;
                }
                boolean z2 = zI | z;
                Object objT3 = x340Var4.T();
                if (z2 || objT3 == obj6) {
                    objT3 = new mff(uffVar, iu30Var2, (byte) 0);
                    x340Var4.s0(objT3);
                }
                r331 r331Var = (r331) objT3;
                Object objT4 = x340Var4.T();
                if (objT4 == obj6) {
                    objT4 = g431VarH.a(uj1.m, r331Var);
                    x340Var4.s0(objT4);
                }
                b431 b431Var = (b431) objT4;
                Object objT5 = x340Var4.T();
                if (objT5 == obj6) {
                    objT5 = pzm.i(x340Var4);
                }
                lz20 lz20Var = (lz20) objT5;
                boolean zG3 = x340Var4.g(goeVar.k());
                Object objT6 = x340Var4.T();
                if (zG3 || objT6 == obj6) {
                    objT6 = goeVar.k();
                    x340Var4.s0(objT6);
                }
                List list = (List) objT6;
                boolean zG4 = x340Var4.g(list);
                Object objT7 = x340Var4.T();
                if (zG4 || objT7 == obj6) {
                    for (Object obj7 : list) {
                        if (u890.j(((w4i1) obj7).a, tgfVar.c)) {
                            obj5 = obj7;
                            w4i1Var = (w4i1) obj5;
                            if (w4i1Var == null) {
                                objT7 = w4i1.f;
                            } else {
                                objT7 = w4i1Var;
                            }
                            x340Var4.s0(objT7);
                        }
                    }
                    w4i1Var = (w4i1) obj5;
                    if (w4i1Var == null) {
                        objT7 = w4i1.f;
                    } else {
                        objT7 = w4i1Var;
                    }
                    x340Var4.s0(objT7);
                }
                w4i1 w4i1Var2 = (w4i1) objT7;
                boolean zG5 = x340Var4.g(list);
                Object objT8 = x340Var4.T();
                if (zG5 || objT8 == obj6) {
                    objT8 = uffVar.d(list);
                    x340Var4.s0(objT8);
                }
                w4i1 w4i1Var3 = (w4i1) o7h.s0((List) objT8);
                if (w4i1Var3 == null) {
                    w4i1Var3 = w4i1.f;
                }
                w4i1 w4i1Var4 = w4i1Var3;
                Object objT9 = x340Var4.T();
                if (objT9 == obj6) {
                    kwe kweVar = new kwe((pbr0) ((g5p) uffVar.a0.a.c).r.get(), cir0Var);
                    x340Var4.s0(kweVar);
                    objT9 = kweVar;
                }
                kwe kweVar2 = (kwe) objT9;
                Object objT10 = x340Var4.T();
                if (objT10 == obj6) {
                    g5p g5pVar = (g5p) uffVar.r.a.c;
                    yqg yqgVarV = g5pVar.b.v();
                    c8o.l(yqgVarV);
                    yff yffVar = g5pVar.b;
                    lzn0 lzn0VarD0 = yffVar.d0();
                    c8o.l(lzn0VarD0);
                    cwe cweVarN = yffVar.n();
                    c8o.l(cweVarN);
                    add addVarK = yffVar.k();
                    c8o.l(addVarK);
                    s3f s3fVar = new s3f(yqgVarV, lzn0VarD0, cweVarN, addVarK, kweVar2);
                    x340Var4.s0(s3fVar);
                    objT10 = s3fVar;
                }
                mod.c(new ely0[]{ade0.a.a(uffVar.i), ade0.b.a(uffVar.m), ade0.c.a(uffVar.j)}, apo.r(583529540, new hrc(uffVar, ncfVar, goeVar.b instanceof btf, w4i1Var4, iu30Var2, uvk0Var2, v8r.s((s3f) objT10, x340Var4), cir0Var, str, w4i1Var2, lz20Var, b431Var), x340Var4), x340Var4, 56);
                return rih1Var;
            case 10:
                vif vifVar = (vif) obj3;
                uif uifVar = (uif) obj4;
                xif xifVar = (xif) this.b;
                b7x b7xVar2 = b7x.a;
                y6h1 y6h1Var3 = ((uvk0) obj).a;
                if (uifVar.equals(iif.a)) {
                    int iE = xifVar.e();
                    x6h1 x6h1VarC11 = y6h1Var3.c();
                    x6h1VarC11.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, ktk0.e(iE)));
                    x6h1VarC11.j = true;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("accept_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC12.a();
                    w7h1Var2 = vifVar.c ? new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), y6h1VarA5, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), y6h1VarA5, r6h1.c, System.currentTimeMillis());
                } else if (uifVar.equals(sif.a)) {
                    int iE2 = xifVar.e();
                    x6h1 x6h1VarC13 = y6h1Var3.c();
                    x6h1VarC13.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, ktk0.e(iE2)));
                    x6h1VarC13.j = true;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("reject_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                } else if (uifVar instanceof jif) {
                    int iE3 = xifVar.e();
                    x6h1 x6h1VarC15 = y6h1Var3.c();
                    x6h1VarC15.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, ktk0.e(iE3)));
                    x6h1VarC15.j = true;
                    x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                    x6h1VarC16.i.add(new a7h1("block_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
                } else if (uifVar instanceof mif) {
                    x6h1 x6h1VarC17 = y6h1Var3.c();
                    x6h1VarC17.i.add(new a7h1("block_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC17.a();
                    String str7 = ((mif) uifVar).a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("block_user", 1, Collections.singletonMap("user_to_be_blocked", str7 != null ? str7 : "")), y6h1VarA6, r6h1.c, System.currentTimeMillis());
                } else if (uifVar.equals(nif.a)) {
                    x6h1 x6h1VarC18 = y6h1Var3.c();
                    x6h1VarC18.i.add(new a7h1("block_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                } else if (uifVar.equals(oif.a)) {
                    x6h1 x6h1VarC19 = y6h1Var3.c();
                    x6h1VarC19.i.add(new a7h1("reject_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("reject_chat", 1, b7xVar2), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis());
                } else if (uifVar.equals(pif.a)) {
                    x6h1 x6h1VarC20 = y6h1Var3.c();
                    x6h1VarC20.i.add(new a7h1("reject_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis());
                } else if (uifVar.equals(kif.a)) {
                    x6h1 x6h1VarC21 = y6h1Var3.c();
                    x6h1VarC21.i.add(new a7h1("accept_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("accept_chat", 1, b7xVar2), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!uifVar.equals(lif.a)) {
                        if ((uifVar instanceof qif) || (uifVar instanceof tif) || uifVar.equals(rif.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC22 = y6h1Var3.c();
                    x6h1VarC22.i.add(new a7h1("accept_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 11:
                ijf ijfVar = (ijf) obj4;
                b7x b7xVar3 = b7x.a;
                y6h1 y6h1Var4 = ((rvk0) obj).a;
                if (ijfVar.equals(gjf.a)) {
                    x6h1 x6h1VarC23 = y6h1Var4.c();
                    x6h1VarC23.i.add(new a7h1("notifications_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC23.j = false;
                    y6h1 y6h1VarA7 = x6h1VarC23.a();
                    String str8 = (String) ((njf) this.b).f.getValue();
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), y6h1VarA7, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!ijfVar.equals(hjf.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC24 = y6h1Var4.c();
                    x6h1VarC24.i.add(new a7h1("manage_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC24.j = false;
                    y6h1 y6h1VarA8 = x6h1VarC24.a();
                    String str9 = nik1.e1.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), y6h1VarA8, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 12:
                eof eofVar = (eof) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                kof kofVar = (kof) this.b;
                int i4 = (iIntValue3 & 6) == 0 ? iIntValue3 | ((iIntValue3 & 8) == 0 ? x340Var5.g(eofVar) : x340Var5.i(eofVar) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i4 |= x340Var5.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i4 & 1, (i4 & 147) != 146)) {
                    mod.b(ade0.c.a(kofVar.d), apo.r(-1591289349, new hwd(eofVar, kofVar, iu30Var3, ((cir0) x340Var6.k(k2r0.a)).c(), (byte) 9), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
            case 13:
                quf qufVar = (quf) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                ttf ttfVar = (ttf) this.b;
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? x340Var7.g(qufVar) : x340Var7.i(qufVar) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= x340Var7.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i5 & 1, (i5 & 147) != 146)) {
                    x340Var8.i0(-1502176311);
                    ttfVar.d.a(ttfVar, x340Var8, 0);
                    x340Var8.r(false);
                    yuf yufVar = qufVar.c;
                    boolean zI2 = x340Var8.i(ttfVar) | ((i5 & 14) == 4 || ((i5 & 8) != 0 && x340Var8.i(qufVar)));
                    Object objT11 = x340Var8.T();
                    if (zI2 || objT11 == m4cVar) {
                        objT11 = new pid(ttfVar, qufVar, (lnm) null, (byte) 10);
                        x340Var8.s0(objT11);
                    }
                    qxd0.t(yufVar, x340Var8, (vu30) objT11);
                    int i6 = i5 & 112;
                    boolean zI3 = x340Var8.i(ttfVar) | (i6 == 32);
                    Object objT12 = x340Var8.T();
                    if (zI3 || objT12 == m4cVar) {
                        objT12 = new rtf(ttfVar, iu30Var4, (byte) 0);
                        x340Var8.s0(objT12);
                    }
                    Function0 function0 = (Function0) objT12;
                    boolean zI4 = x340Var8.i(ttfVar) | (i6 == 32);
                    Object objT13 = x340Var8.T();
                    if (zI4 || objT13 == m4cVar) {
                        objT13 = new rtf(ttfVar, iu30Var4, (byte) 1);
                        x340Var8.s0(objT13);
                    }
                    hxo1.e(qufVar, function0, (Function0) objT13, (qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1.a;
            case 14:
                v1g v1gVar = (v1g) obj;
                int iIntValue5 = ((Number) obj4).intValue();
                v1gVar.getClass();
                hyo1.d(v1gVar, (iu30) obj2, ((x1g) this.b).e, (qim0) null, (b0k) obj3, iIntValue5 & 112);
                return rih1.a;
            case 15:
                return a(obj, obj2, obj3, obj4);
            case 16:
                return new t0m0(new u0m0(new brl0(((lwm) ((qlb) this.b).c).e, (byte) 10)), Integer.valueOf(((Number) obj3).intValue()), ((eyg) obj).a);
            case 17:
                t5l0 t5l0Var = (t5l0) obj;
                y7h y7hVar = (y7h) obj4;
                b7x b7xVar4 = b7x.a;
                r6h1 r6h1Var4 = t5l0Var.a;
                y6h1 y6h1Var5 = t5l0Var.b;
                if (y7hVar instanceof w7h) {
                    List list2 = ((c8h) this.b).c;
                    int i7 = ((w7h) y7hVar).a;
                    s5l0 s5l0Var = (s5l0) o7h.t0(i7, list2);
                    if (s5l0Var == null) {
                        return null;
                    }
                    Integer numValueOf3 = Integer.valueOf(i7);
                    x6h1 x6h1VarC25 = y6h1Var5.c();
                    x6h1VarC25.i.add(new a7h1("color_swatch_button", s5l0Var.a, numValueOf3, (String) null, (String) null));
                    x6h1VarC25.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar4), new x7h1("ui_select", 1, b7xVar4), x6h1VarC25.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(y7hVar instanceof x7h)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC26 = y6h1Var5.c();
                    x6h1VarC26.i.add(new a7h1("dismiss_interaction", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC26.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("drag", 1, b7xVar4), new x7h1("ui_hide", 1, b7xVar4), x6h1VarC26.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 18:
                return d(obj, obj2, obj3, obj4);
            case 19:
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
                oll ollVar = (oll) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var9 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i8 = (iIntValue6 & 6) == 0 ? iIntValue6 | (x340Var9.g(ollVar) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i8 |= x340Var9.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i8 & 1, (i8 & 147) != 146)) {
                    ((qll) this.b).e.a(new yxe1(new ehc1(ollVar.a)));
                    w6d1.a(ollVar, iu30Var5, (qim0) null, x340Var10, i8 & 112);
                } else {
                    x340Var10.b0();
                }
                return rih1.a;
        }
    }
}
