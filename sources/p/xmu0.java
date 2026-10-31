package p;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimer;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xmu0 implements Function, m6o0, ix30, l381 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public xmu0(o0g1 o0g1Var, z0w0 z0w0Var) {
        this.a = (byte) 12;
        this.b = o0g1Var;
        this.c = z0w0Var;
        ViewGroup viewGroup = (ViewGroup) o0g1Var.c;
        ViewGroup viewGroup2 = (ViewGroup) b8k1.n(viewGroup, 2131428249);
        uhs uhsVar = (uhs) o0g1Var.d;
        viewGroup2.addView((View) uhsVar.d.b, 0);
        ((hoc) o0g1Var.e).b(viewGroup);
        r7k1.c((BehaviorRetainingAppBarLayout) uhsVar.d.b, new uqv0(o0g1Var, (byte) 2));
        RecyclerView recyclerView = z0w0Var.a;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        bk7 bk7Var = z0w0Var.k;
        recyclerView.setAdapter(bk7Var);
        z0w0Var.l = recyclerView.getPaddingBottom();
        if (z0w0Var.j) {
            z0w0Var.i.b(recyclerView);
        }
        r7k1.c(recyclerView, new l1p0(z0w0Var, (byte) 23));
        em0 em0Var = (em0) z0w0Var.g.a.c;
        k3w0 k3w0Var = new k3w0(bk7Var, new p3w0((ywp) em0Var.f, em0Var.o0()), (jly0) em0Var.t);
        if (k3w0Var.f.add(recyclerView)) {
            recyclerView.k(k3w0Var);
        }
    }

    public static String i(String str) {
        return f46.r0(MessageDigest.getInstance("SHA-256").digest(str.getBytes(nne.a)), p7w0.t, 30);
    }

    public static kpy0 j(c560 c560Var, boolean z) {
        if (c560Var instanceof a560) {
            return z ? kpy0.d : kpy0.c;
        }
        if (c560Var instanceof b560) {
            return z ? kpy0.g : kpy0.f;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r14 == r11) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        if (r12.a(r14, r6) == r11) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(p.aby0 r13, p.onm r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xmu0.a(p.aby0, p.onm):java.lang.Object");
    }

    public Object apply(Object obj) {
        byte b = this.a;
        byte b2 = 14;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 3:
                Boolean bool = (Boolean) obj;
                p68 p68Var = (p68) obj2;
                q6z q6zVar = (a6z) p68Var.c;
                waz0 waz0Var = (waz0) p68Var.f;
                lik1 lik1Var = (lik1) p68Var.b;
                l4v0 l4v0Var = (l4v0) obj3;
                String str = l4v0Var.b;
                boolean z = l4v0Var.f;
                return q6zVar.k(str, (String) null, (Map) null, lik1Var, new r6z((String) null, l4v0Var.c && !z, waz0Var.a().a, p68Var.a, !waz0Var.a().k.contains(abz0.d), false, true, false, false, !z, false, false, bool.booleanValue(), false, false, !bool.booleanValue(), (ugo0) null, (c821) null, false, false, false, false, (ok51) null, false, (String) null, false, (p860) null, 1073695777));
            case 7:
                Boolean bool2 = (Boolean) obj;
                tzr0 tzr0Var = (tzr0) obj2;
                if (bool2.equals(Boolean.TRUE)) {
                    qx qxVar = (qx) ((bsp) tzr0Var.b).get();
                    return qxVar.a.a.h(SubValuesRequest.o()).map(kuw0.b).publish(new yo31(qxVar, (byte) 3)).map(fmv.b).compose(qxVar.c);
                }
                if (bool2.equals(Boolean.FALSE)) {
                    return ((mlv0) ((jn41) obj3).a).c().e().b.ofType(wpb.class).map(sl10.f1);
                }
                eg.o();
                return null;
            case 9:
                wtv0 wtv0Var = (wtv0) obj;
                return ((mzr0) obj2).f((String) null, wtv0Var.b, wtv0Var.c, false).map(new uip0((zhq0) obj3, (byte) 19)).map(xj20.d1).onErrorReturn(new l1p0(wtv0Var, (byte) 22));
            case 10:
                tv80 tv80Var = (tv80) obj3;
                ywv0 ywv0Var = (ywv0) obj2;
                return ((Boolean) obj).booleanValue() ? new CompletableFromAction(new tt60(ywv0Var, tv80Var, b2)).s((Scheduler) ywv0Var.i) : yoi1.i(((u4q0) ywv0Var.d).d(), o6x.a).firstOrError().onErrorReturn(c710.c1).flatMapCompletable(new yeu0(ywv0Var, tv80Var, (byte) 14));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                SingleSubject singleSubject = new SingleSubject();
                lis lisVar = (lis) obj2;
                i8h1 i8h1Var = lisVar.a;
                x6h1 x6h1VarC = lisVar.c.b.c();
                x6h1VarC.i.add(new a7h1("profile_picture_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("change_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("change_photo_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                b7x b7xVar = b7x.a;
                String str2 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                ((lls0) obj3).A(new iyw0(lisVar, singleSubject, (byte) 0), new iyw0(lisVar, singleSubject, (byte) 1), (jzv) null, false);
                return singleSubject;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Uri uri = Uri.parse(((u1x0) obj).g);
                uri.getClass();
                return ((g341) obj2).b(uri).observeOn((Scheduler) obj3).map(h2x0.b).map(i2x0.b);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                List list = (List) obj;
                sdx0 sdx0Var = (sdx0) obj2;
                udx0 udx0Var = (udx0) obj3;
                return sdx0Var.a(list, false, udx0Var).g(new wf0(sdx0Var, udx0Var, list, (byte) 14));
            case 22:
                return obx0.a((v9x0) obj2, (nbx0) null, (String) obj3, (String) null, (String) null, (q730) null, (Integer) null, 0, 4091);
            default:
                ContextTrack contextTrack = (ContextTrack) obj3;
                et90 et90Var = (et90) obj2;
                if (!((Boolean) obj).booleanValue() || !((cbv) et90Var.e).a(contextTrack)) {
                    return Flowable.I(Boolean.FALSE);
                }
                FlowableJust flowableJustI = Flowable.I(Boolean.TRUE);
                FlowableTimer flowableTimerA0 = Flowable.a0(5L, TimeUnit.SECONDS, Schedulers.b);
                yeu0 yeu0Var = new yeu0(et90Var, contextTrack, (byte) 29);
                int i = Flowable.a;
                return Flowable.k(flowableJustI, flowableTimerA0.A(yeu0Var, i, i));
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public void c() {
        ((PublishSubject) ((wva0) this.b).f).onNext((NestedScrollView) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        nvy0 nvy0Var;
        if (onmVar instanceof nvy0) {
            nvy0Var = (nvy0) onmVar;
            int i = nvy0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvy0Var.c = i - Integer.MIN_VALUE;
            } else {
                nvy0Var = new nvy0(this, onmVar);
            }
        } else {
            nvy0Var = new nvy0(this, onmVar);
        }
        Object objY = nvy0Var.a;
        int i2 = nvy0Var.c;
        boolean zBooleanValue = false;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                ne neVar = new ne((byte) 9);
                neVar.e0(str);
                ln21 ln21Var = new ln21(neVar);
                q8n q8nVar = (q8n) this.c;
                cqu0 cqu0Var = new cqu0(this, ln21Var, lnmVar, (byte) 29);
                nvy0Var.c = 1;
                objY = fn31.Y(q8nVar, cqu0Var, nvy0Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objY);
            }
            zBooleanValue = ((Boolean) objY).booleanValue();
        } catch (IOException | IllegalArgumentException unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public void e() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((tdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void f(int i, String str, String str2) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        x6h1 x6h1VarC = ((tdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        i8h1 i8h1Var = (i8h1) this.b;
        int iC = l1d.C(i);
        b7x b7xVar = b7x.a;
        if (iC != 0) {
            if (iC == 1) {
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_user_from_playlist", 1, sqg0.J(new mmr0[]{new mmr0("playlist", str2), new mmr0("user_to_be_removed", str)})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            } else if (iC == 2) {
                x6h1 x6h1VarC3 = y6h1VarA.c();
                x6h1VarC3.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            } else if (iC == 3) {
                x6h1 x6h1VarC4 = y6h1VarA.c();
                x6h1VarC4.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_playlist", 1, Collections.singletonMap("playlist", str2)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            } else if (iC == 4) {
                x6h1 x6h1VarC5 = y6h1VarA.c();
                x6h1VarC5.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_user_a_playlist_collaborator", 1, sqg0.J(new mmr0[]{new mmr0("playlist", str2), new mmr0("user_to_be_made_collaborator", str)})), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
            } else {
                if (iC != 5) {
                    eg.o();
                    return;
                }
                x6h1 x6h1VarC6 = y6h1VarA.c();
                x6h1VarC6.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_user_as_playlist_collaborator", 1, sqg0.J(new mmr0[]{new mmr0("playlist", str2), new mmr0("user_to_be_removed_as_collaborator", str)})), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
            }
            i8h1Var.m(w7h1Var2, (xj61) null);
        }
        x6h1 x6h1VarC7 = y6h1VarA.c();
        x6h1VarC7.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC7.j = false;
        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
        w7h1Var2 = w7h1Var;
        i8h1Var.m(w7h1Var2, (xj61) null);
    }

    public ydv0 g(aev0 aev0Var) {
        String str = aev0Var.b;
        if (aev0Var.b().size() < 2) {
            return new ydv0();
        }
        ArrayList<uod1> arrayListB = aev0Var.b();
        ArrayList arrayList = new ArrayList(q7h.U(arrayListB, 10));
        for (uod1 uod1Var : arrayListB) {
            String str2 = uod1Var.a;
            arrayList.add(new xdv0(str2, uod1Var.b, u890.j(str, str2)));
        }
        return new ydv0(o7h.N0(arrayList, Collections.singletonList(new xdv0(null, ((Context) this.b).getString(2131960254), str == null))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Comparable h(InputStream inputStream, onm onmVar) {
        w1v0 w1v0Var;
        if (onmVar instanceof w1v0) {
            w1v0Var = (w1v0) onmVar;
            int i = w1v0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1v0Var.d = i - Integer.MIN_VALUE;
            } else {
                w1v0Var = new w1v0(this, onmVar);
            }
        } else {
            w1v0Var = new w1v0(this, onmVar);
        }
        Object objA = w1v0Var.b;
        int i2 = w1v0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                o771 o771Var = (o771) this.c;
                w1v0Var.a = inputStream;
                w1v0Var.d = 1;
                objA = n771.a(o771Var, ".png", w1v0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                inputStream = w1v0Var.a;
                hm5.M(objA);
            }
            return ((uo5) this.b).L(inputStream, (l420) objA);
        } catch (IOException e) {
            Logger.e(e, "Failed to create temporary PNG file", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(File file, String str, onm onmVar) {
        ovy0 ovy0Var;
        File file2;
        if (onmVar instanceof ovy0) {
            ovy0Var = (ovy0) onmVar;
            int i = ovy0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovy0Var.e = i - Integer.MIN_VALUE;
            } else {
                ovy0Var = new ovy0(this, onmVar);
            }
        } else {
            ovy0Var = new ovy0(this, onmVar);
        }
        Object objY = ovy0Var.c;
        int i2 = ovy0Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                try {
                    ne neVar = new ne((byte) 9);
                    neVar.e0(str);
                    try {
                        ln21 ln21Var = new ln21(neVar);
                        q8n q8nVar = (q8n) this.c;
                        file2 = file;
                        try {
                            i3y0 i3y0Var = new i3y0((Object) this, (Object) ln21Var, (Object) file2, (lnm) null, (byte) 3);
                            ovy0Var.a = str;
                            ovy0Var.b = file2;
                            ovy0Var.e = 1;
                            objY = fn31.Y(q8nVar, i3y0Var, ovy0Var);
                            d9n d9nVar = d9n.a;
                            if (objY == d9nVar) {
                                return d9nVar;
                            }
                            file = file2;
                        } catch (IOException unused) {
                            file = file2;
                            return new sjm1(l1d.m("IOException with ", file.getName()));
                        }
                    } catch (IOException unused2) {
                        file2 = file;
                    }
                } catch (IOException unused3) {
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = ovy0Var.b;
                str = ovy0Var.a;
                try {
                    hm5.M(objY);
                } catch (IOException unused4) {
                    return new sjm1(l1d.m("IOException with ", file.getName()));
                }
            }
            return (ujm1) objY;
        } catch (IllegalArgumentException unused5) {
            return new sjm1(l1d.m("IllegalArgumentException with ", str));
        }
    }

    public void onFailure(Throwable th) {
        ((mzc) this.b).c(th);
    }

    public void onSuccess(Object obj) {
        ((mzc) this.b).b((d5d) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:39:0x008f->B:60:?, LOOP_END, SYNTHETIC] */
    public boolean t(Object obj) {
        String string;
        String string2;
        qxc0 qxc0Var = (qxc0) obj;
        Map map = qxc0Var.X;
        f6y0 f6y0Var = (f6y0) this.c;
        if (!f6y0Var.b.e()) {
            return false;
        }
        Set set = h4d0.a;
        String str = (String) map.get("generation_status");
        String str2 = "";
        if (str == null || (string = ihc1.e1(str).toString()) == null) {
            string = "";
        }
        h4d0 h4d0VarU = qyo1.u(string);
        boolean z = qxc0Var.S0 == 0;
        if ((!h4d0VarU.a() || !z) && ((!z || !h4d0.a.contains(h4d0VarU)) && (!z || !h4d0VarU.b()))) {
            nfa0 nfa0Var = f6y0Var.e;
            String str3 = (String) map.get("error_list");
            List listB = str3 != null ? uiz.b(str3, nfa0Var) : z6x.a;
            Object obj2 = null;
            if ((listB instanceof Collection) && listB.isEmpty()) {
                for (Object obj3 : listB) {
                    if (((n4y0) obj3) instanceof l4y0) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (n4y0) obj2;
            } else {
                Iterator it = listB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        while (r7.hasNext()) {
                            if (((n4y0) obj3) instanceof l4y0) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        obj2 = (n4y0) obj2;
                    } else if (((n4y0) it.next()) instanceof g4y0) {
                    }
                }
            }
            if (obj2 == null) {
                Set set2 = h4d0.a;
                String str4 = (String) map.get("generation_status");
                if (str4 != null && (string2 = ihc1.e1(str4).toString()) != null) {
                    str2 = string2;
                }
                h4d0 h4d0VarU2 = qyo1.u(str2);
                h4d0VarU2.getClass();
                return h4d0VarU2 == h4d0.h;
            }
        }
        return true;
    }

    public xmu0(Context context) {
        this.a = (byte) 5;
        yqu0 yqu0Var = new yqu0();
        this.b = context;
        this.c = yqu0Var;
    }

    public xmu0(i8h1 i8h1Var) {
        this.a = (byte) 25;
        this.b = i8h1Var;
        this.c = new tdl0((byte) 27);
    }

    public xmu0(bhf bhfVar, wh71 wh71Var, gqg gqgVar) {
        this.a = (byte) 11;
        this.b = wh71Var;
        this.c = gqgVar;
    }

    public xmu0(d0r d0rVar) {
        this.a = (byte) 24;
        this.b = d0rVar;
        this.c = w3p1.o(new l4r(pwc0.b, 1, xox0.T0, new j4r(xox0.R0), xox0.U0), xox0.S0);
    }

    public xmu0(f6y0 f6y0Var) {
        this.a = (byte) 26;
        this.c = f6y0Var;
        this.b = f6y0Var.f;
    }

    public /* synthetic */ xmu0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
