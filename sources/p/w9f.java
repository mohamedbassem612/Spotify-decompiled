package p;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w9f extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9f(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    public final Object invoke(Object obj) {
        Object next;
        l1h h1hVar;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        xnh bohVar;
        xnh bohVar2;
        byte b = this.a;
        boolean z = false;
        xnh hphVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rtb0 rtb0Var = (rtb0) obj;
                y9f y9fVar = (y9f) obj3;
                r9f r9fVar = (r9f) obj2;
                if (r9fVar.c) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(1511719743, new v9f(y9fVar, (byte) 0), true), 3);
                }
                rtb0.c(rtb0Var, (Object) null, new j2i(-1938366492, new v9f(y9fVar, (byte) 1), true), 3);
                List list = r9fVar.b;
                rtb0Var.e(list.size(), new kwd(list, (byte) 8), new kwd(list, (byte) 9), new j2i(2039820996, new ot(list, y9fVar, (byte) 4), true));
                return rih1Var;
            case 1:
                tom tomVar = (tom) obj;
                if (u890.j(tomVar.a, ((k1f) obj2).b) && lro1.v(tomVar, (tom) obj3)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                tom tomVar2 = (tom) obj;
                if (u890.j(tomVar2.a, ((y2f) obj2).a) && lro1.v(tomVar2, (tom) obj3)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                tom tomVar3 = (tom) obj;
                ArrayList arrayList = new ArrayList(tomVar3.h);
                arrayList.set(arrayList.indexOf((gxz0) obj2), (gxz0) obj3);
                return tom.a(tomVar3, (w4i1) null, (upl) null, (rom) null, arrayList, (List) null, (nom) null, false, 3967);
            case 4:
                ven0 ven0Var = (ven0) obj3;
                ven0Var.setValue(mqo1.A(o7h.O0(new oe90((String) obj, ((jwm) obj2).a), (c380) ven0Var.getValue())));
                return rih1Var;
            case 5:
                String str = (String) obj;
                uff uffVar = (uff) obj2;
                fpf fpfVar = uffVar.q;
                String str2 = (String) obj3;
                int iG = uffVar.j.a.G();
                LinkedHashMap linkedHashMap = new LinkedHashMap(fpfVar.b());
                if (str.length() == 0) {
                    linkedHashMap.remove(str2);
                } else {
                    if (!linkedHashMap.containsKey(str2) && linkedHashMap.size() >= iG) {
                        Iterator it = linkedHashMap.entrySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                long j = ((dpf) ((Map.Entry) next).getValue()).b;
                                do {
                                    Object next2 = it.next();
                                    long j2 = ((dpf) ((Map.Entry) next2).getValue()).b;
                                    if (j > j2) {
                                        next = next2;
                                        j = j2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry = (Map.Entry) next;
                        hphVar = entry != null ? (String) entry.getKey() : null;
                        if (hphVar != null) {
                            linkedHashMap.remove(hphVar);
                        }
                    }
                    linkedHashMap.put(str2, new dpf(str, fpfVar.a.b()));
                }
                fpfVar.c(linkedHashMap);
                return rih1Var;
            case 6:
                View view = (View) obj2;
                ViewTreeObserver.OnGlobalLayoutListener ngfVar = new ngf(view, (hdn0) obj3, (byte) 0);
                view.getViewTreeObserver().addOnGlobalLayoutListener(ngfVar);
                return new ht0(view, ngfVar, (byte) 10);
            case 7:
                ((iu30) obj2).invoke(new wnf(((kof) obj3).b.getViewUri(), (tv80) obj));
                return rih1Var;
            case 8:
                kb61 kb61Var = (kb61) obj;
                return new sr0(kb61Var.c0().b(), (aiq) obj2, kb61Var, (jqd0) obj3, (byte) 6);
            case 9:
                ((iu30) obj2).invoke(new ivf(((Boolean) obj).booleanValue(), ((o220) obj3).a));
                return rih1Var;
            case 10:
                ((Boolean) obj).getClass();
                if (!((t2g) ((v2g) obj2)).b) {
                    ((Function0) obj3).invoke();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ArrayList arrayList2 = (ArrayList) obj2;
                ((kex) obj).b(arrayList2.size(), new j2i(1658481532, new ef8(arrayList2, (iu30) obj3, (byte) 20), true), new ib5(arrayList2, (byte) 7));
                return rih1Var;
            case grn1.d /* 12 */:
                return new ht0((gag) obj2, (ven0) obj3, (byte) 12);
            case 13:
                pd8 pd8Var = new pd8((ven0) obj3, (byte) 5);
                ((cir0) obj2).j(pd8Var);
                return new rm(pd8Var, (byte) 20);
            case 14:
                ((iu30) obj2).invoke(ing.a);
                z710.d(((qng) obj3).c, (String) obj, false, 6);
                return rih1Var;
            case 15:
                uog uogVar = (uog) obj;
                return v1p1.j(uogVar, ((drj0) obj2).h(uogVar.c), ((yqg) obj3).b());
            case 16:
                fna fnaVar = ((vyg) obj2).a;
                oud oudVar = (oud) obj3;
                oudVar.getClass();
                k6p k6pVar = (k6p) iy81.a(new fyo((byte) 8)).get();
                hyl0 hyl0Var = (hyl0) fnaVar.b;
                c8o.l(hyl0Var);
                return new kpg0(new tm(k6pVar, hyl0Var, oudVar), tpg.Y0);
            case 17:
                jzg jzgVar = (jzg) obj2;
                jzgVar.b.b = ((t6p0) obj3).a;
                return new rm(jzgVar, (byte) 22);
            case 18:
                szo0 szo0Var = new szo0((wen0) obj2);
                View view2 = (View) obj3;
                view2.setTag(2131430183, szo0Var);
                return new ht0(view2, szo0Var, (byte) 13);
            case 19:
                sp spVar = (sp) obj2;
                cce cceVar = (cce) spVar.c;
                int iOrdinal = ((y1h) obj).ordinal();
                b7x b7xVar = b7x.a;
                if (iOrdinal == 0) {
                    i8h1 i8h1Var = (i8h1) cceVar.b;
                    x6h1 x6h1VarC = ((bqk0) cceVar.c).b.c();
                    x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    h1hVar = new h1h(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a);
                } else if (iOrdinal == 1) {
                    String str3 = (String) cceVar.d;
                    o2h o2hVar = (u2h) spVar.e;
                    if (o2hVar == null) {
                        u890.C("playerState");
                        throw null;
                    }
                    imb1 imb1Var = (imb1) spVar.h;
                    boolean z2 = imb1Var != null ? imb1Var.d : true;
                    x6h1 x6h1VarC3 = ((bqk0) cceVar.c).b.c();
                    x6h1VarC3.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("play_button", (String) null, (Integer) null, str3, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA = x6h1VarC4.a();
                    if (o2hVar.equals(n2h.a)) {
                        w7h1Var = z2 ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str3)), y6h1VarA, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str3)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                    } else {
                        if (o2hVar instanceof o2h) {
                            String string = o2hVar.a.toString();
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", string != null ? string : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!(o2hVar instanceof p2h)) {
                                eg.o();
                                return null;
                            }
                            String string2 = ((p2h) o2hVar).a.toString();
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", string2 != null ? string2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                        }
                    }
                    h1hVar = new n1h(((i8h1) cceVar.b).m(w7h1Var, (xj61) null).a);
                } else if (iOrdinal == 2) {
                    imb1 imb1Var2 = (imb1) spVar.h;
                    if (imb1Var2 != null) {
                        boolean z3 = imb1Var2.d;
                        i8h1 i8h1Var2 = (i8h1) cceVar.b;
                        bqk0 bqk0Var = (bqk0) cceVar.c;
                        if (z3) {
                            x6h1 x6h1VarC5 = bqk0Var.b.c();
                            x6h1VarC5.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                            x6h1VarC6.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC6.j = false;
                            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{new mmr0("previous_mode", "shuffle"), new mmr0("selected_mode", "linear")})), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        } else {
                            x6h1 x6h1VarC7 = bqk0Var.b.c();
                            x6h1VarC7.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC7.j = false;
                            x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                            x6h1VarC8.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC8.j = false;
                            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{new mmr0("previous_mode", "linear"), new mmr0("selected_mode", "shuffle")})), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        }
                    }
                    h1hVar = o1h.a;
                } else if (iOrdinal == 3) {
                    String str4 = (String) cceVar.d;
                    qz50 qz50Var = (qz50) spVar.f;
                    if (qz50Var == null) {
                        u890.C("headerData");
                        throw null;
                    }
                    boolean z4 = qz50Var.c;
                    y6h1 y6h1Var = ((bqk0) cceVar.c).b;
                    if (z4) {
                        x6h1 x6h1VarC9 = y6h1Var.c();
                        x6h1VarC9.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                        x6h1VarC10.i.add(new a7h1("follow_button", (String) null, (Integer) null, str4, (String) null));
                        x6h1VarC10.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str4)), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC11 = y6h1Var.c();
                        x6h1VarC11.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                        x6h1VarC12.i.add(new a7h1("follow_button", (String) null, (Integer) null, str4, (String) null));
                        x6h1VarC12.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str4)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                    }
                    h1hVar = new j1h(((i8h1) cceVar.b).m(w7h1Var2, (xj61) null));
                } else if (iOrdinal == 4) {
                    String str5 = (String) cceVar.d;
                    qz50 qz50Var2 = (qz50) spVar.f;
                    if (qz50Var2 == null) {
                        u890.C("headerData");
                        throw null;
                    }
                    boolean zEquals = qz50Var2.e.equals("no");
                    y6h1 y6h1Var2 = ((bqk0) cceVar.c).b;
                    if (zEquals) {
                        x6h1 x6h1VarC13 = y6h1Var2.c();
                        x6h1VarC13.i.add(new a7h1("item_list", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                        x6h1VarC14.i.add(new a7h1("download_toggle", (String) null, (Integer) null, str5, (String) null));
                        x6h1VarC14.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("download", 1, Collections.singletonMap("item_to_download", str5)), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC15 = y6h1Var2.c();
                        x6h1VarC15.i.add(new a7h1("item_list", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                        x6h1VarC16.i.add(new a7h1("download_toggle", (String) null, (Integer) null, str5, (String) null));
                        x6h1VarC16.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str5)), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
                    }
                    h1hVar = new i1h(((i8h1) cceVar.b).m(w7h1Var3, (xj61) null));
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    i8h1 i8h1Var3 = (i8h1) cceVar.b;
                    x6h1 x6h1VarC17 = ((bqk0) cceVar.c).b.c();
                    x6h1VarC17.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                    x6h1VarC18.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    h1hVar = new l1h(i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                }
                ((Consumer) obj3).accept(h1hVar);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                l4h l4hVar = (l4h) obj;
                Context context = ((y5h) obj2).a;
                o6h o6hVar = (o6h) obj3;
                int i = o6hVar.a;
                z771 z771Var = o6hVar.b;
                ez61 ez61Var = o6hVar.c;
                Set set = o6hVar.d;
                wa71 wa71Var = o6hVar.e;
                String str6 = l4hVar.a;
                String str7 = l4hVar.b;
                String str8 = l4hVar.c;
                int i2 = l4hVar.d;
                return new q6h(i, z771Var, ez61Var, set, wa71Var, str6, str7, str8, i2, new ilw0(i2, i2, context.getString(2131956351)), new ilw0(l4hVar.d, -16777216, context.getString(2131956351)), (ArrayList) null, 0, (ArrayList) null, (sxq0) null, l4hVar.e, 61472);
            case 21:
                mmr0 mmr0Var = (mmr0) ((zsq0) obj).a;
                return new zsq0(new q8v0(((yv00) ((zsq0) mmr0Var.a).a).a, ((Boolean) obj2).booleanValue(), (n131) obj3, (Map) mmr0Var.b));
            case 22:
                ((ihm) obj2).d.invoke((tv80) obj);
                ((c861) obj3).invoke(zgh.b);
                return rih1Var;
            case 23:
                uhh uhhVar = (uhh) obj2;
                eg0 eg0Var = uhhVar.e;
                rhh rhhVar = new rhh(uhhVar, (khh) obj3, (lnm) null, (byte) 1);
                pbh0 pbh0Var = new pbh0(eg0Var.a, 0);
                pbh0Var.f(2131954087);
                pbh0Var.b(2131954085);
                pbh0Var.d(2131954084, new ln5(eg0Var, rhhVar, (byte) 5)).c(2131954083, new k6b((byte) 18)).create().show();
                return rih1Var;
            case 24:
                return new ht0((ven0) obj2, (xmh) obj3, (byte) 14);
            case 25:
                Connection connection = (Connection) ((ven0) obj2).getValue();
                if (connection != null) {
                    connection.accept((rph) obj3);
                }
                return rih1Var;
            case 26:
                cih cihVar = (eih) obj;
                Comment comment = ((ekh) obj2).b;
                if (!(cihVar instanceof yhh)) {
                    if (cihVar instanceof zhh) {
                        bohVar = new boh(comment.r(), p8p1.D(comment), (tv80) null, false);
                    } else if (cihVar instanceof aih) {
                        hphVar = new roh(comment.r());
                    } else if (cihVar instanceof bih) {
                        hphVar = new voh(comment.r());
                    } else if (cihVar instanceof cih) {
                        hphVar = new hph(cihVar.a, (tv80) null);
                    } else if (!(cihVar instanceof dih)) {
                        eg.o();
                        return null;
                    }
                    if (hphVar != null) {
                        ((iu30) obj3).invoke(hphVar);
                    }
                    return rih1Var;
                }
                bohVar = new xnh(p8p1.D(comment), (tv80) null);
                hphVar = bohVar;
                if (hphVar != null) {
                    ((iu30) obj3).invoke(hphVar);
                }
                return rih1Var;
            case 27:
                cih cihVar2 = (eih) obj;
                Reply reply = ((hkh) obj2).b;
                if (!(cihVar2 instanceof yhh)) {
                    if (cihVar2 instanceof zhh) {
                        bohVar2 = new boh(reply.o(), p8p1.E(reply), (tv80) null, true);
                    } else if (cihVar2 instanceof cih) {
                        hphVar = new hph(cihVar2.a, (tv80) null);
                    } else if (!(cihVar2 instanceof aih) && !(cihVar2 instanceof bih) && !(cihVar2 instanceof dih)) {
                        eg.o();
                        return null;
                    }
                    if (hphVar != null) {
                        ((iu30) obj3).invoke(hphVar);
                    }
                    return rih1Var;
                }
                bohVar2 = new xnh(p8p1.E(reply), (tv80) null);
                hphVar = bohVar2;
                if (hphVar != null) {
                    ((iu30) obj3).invoke(hphVar);
                }
                return rih1Var;
            case 28:
                ((iu30) obj2).invoke(new voh(((ikh) obj3).b));
                return rih1Var;
            default:
                yih yihVar = (yih) obj;
                String str9 = ((okh) obj3).b;
                iu30 iu30Var = (iu30) obj2;
                if (yihVar instanceof vih) {
                    iu30Var.invoke(new ioh(str9));
                } else if (yihVar instanceof wih) {
                    iu30Var.invoke(new aoh(str9));
                } else {
                    if (!(yihVar instanceof xih)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new roh(str9));
                }
                return rih1Var;
        }
    }
}
