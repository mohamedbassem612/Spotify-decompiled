package p;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$NoEventConsumerOrViewBinderFound;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qf8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf8(int i, khc khcVar, lqg lqgVar, iac0 iac0Var, iu30 iu30Var) {
        super(1);
        this.a = (byte) 2;
        this.b = i;
        this.c = khcVar;
        this.d = lqgVar;
        this.f = iac0Var;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                k1i k1iVar = (k1i) obj5;
                kg0.e((kg0) k1iVar.c, (dkt) ((iu30) obj3).invoke(k1iVar.m(i, (jj8) obj4)), (ifl1) obj2);
                return rih1Var;
            case 1:
                p1d0 p1d0Var = (p1d0) obj5;
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), i);
                tob1 tob1Var = (tob1) obj3;
                if (((rnc0) tob1Var.getValue()).b.isEmpty()) {
                    p1d0Var.a(recyclerView, (iac0) obj4, new StaggeredGridLayoutManager(), false);
                }
                if (((Boolean) ((tob1) obj2).getValue()).booleanValue()) {
                    p1d0Var.b((rnc0) tob1Var.getValue());
                    recyclerView.setVisibility(0);
                } else {
                    p1d0Var.b(new rnc0());
                    recyclerView.setVisibility(4);
                }
                return rih1Var;
            case 2:
                RecyclerView recyclerView2 = new RecyclerView((Context) obj);
                khc khcVar = (khc) obj5;
                lqg lqgVar = (lqg) obj4;
                iac0 iac0Var = (iac0) obj2;
                recyclerView2.setHasFixedSize(true);
                recyclerView2.setClipToPadding(false);
                recyclerView2.setPadding(0, 0, 0, i);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                linearLayoutManager.x1(1);
                recyclerView2.setLayoutManager(linearLayoutManager);
                recyclerView2.j(new j1e(i, (byte) 11));
                recyclerView2.m(new zl7((iu30) obj3, (byte) 2));
                LinkedHashMap linkedHashMap = lqgVar.e;
                if (linkedHashMap == null) {
                    u890.C("elementFactories");
                    throw null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    vu30 vu30Var = (vu30) entry.getValue();
                    snc0 snc0Var = lqgVar.f;
                    if (snc0Var == null) {
                        u890.C("listContentRuntime");
                        throw null;
                    }
                    linkedHashMap2.put(key, (laa) vu30Var.invoke(snc0Var.getMetadata(), iac0Var));
                }
                p1d0 p1d0VarF = khc.f(khcVar, linkedHashMap2, (Map) null, tpg.h, 14);
                p1d0VarF.a(recyclerView2, iac0Var, recyclerView2.getLayoutManager(), false);
                snc0 snc0Var2 = lqgVar.f;
                if (snc0Var2 != null) {
                    t5p1.j(snc0Var2.b(), 3).f(iac0Var, new z11(p1d0VarF, (byte) 8));
                    return recyclerView2;
                }
                u890.C("listContentRuntime");
                throw null;
            case 3:
                t1i t1iVar = (t1i) obj5;
                u1i u1iVar = (u1i) obj4;
                if (t1iVar != null) {
                    t1iVar.k(new r1i((qzh) obj3, i, obj2, obj));
                } else {
                    bkl bklVar = (bkl) u1iVar.W0;
                    if (bklVar == null) {
                        throw new ComponentRecyclerAdapter$NoEventConsumerOrViewBinderFound("No Consumer<AnyEvent> or ComponentViewBinder<AnyModel, AnyEvent> instance for " + rc11.a.b(obj2.getClass()) + " supplied.");
                    }
                    bklVar.accept(obj);
                }
                return rih1Var;
            case 4:
                kil kilVar = (kil) obj;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj2;
                View view = (View) obj4;
                List list = (List) obj3;
                List list2 = (List) obj5;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    op71.t((View) it.next(), kilVar);
                }
                op71.t(view, kilVar);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    op71.t((View) it2.next(), kilVar);
                }
                kilVar.g(((View) o7h.q0(list2)).getId(), 6, constraintLayout.getId(), 6);
                for (mmr0 mmr0Var : o7h.w1(list2)) {
                    View view2 = (View) mmr0Var.a;
                    View view3 = (View) mmr0Var.b;
                    kilVar.g(view3.getId(), 6, view2.getId(), 7);
                    kilVar.t(view3.getId(), i);
                }
                kilVar.g(view.getId(), 6, ((View) o7h.A0(list2)).getId(), 7);
                kilVar.g(view.getId(), 7, ((View) o7h.q0(list)).getId(), 6);
                for (mmr0 mmr0Var2 : o7h.w1(list)) {
                    kilVar.g(((View) mmr0Var2.a).getId(), 7, ((View) mmr0Var2.b).getId(), 6);
                }
                kilVar.g(((View) o7h.A0(list)).getId(), 7, constraintLayout.getId(), 7);
                return rih1Var;
            case 5:
                ((Number) obj).longValue();
                p3u0 p3u0Var = (p3u0) obj5;
                p3u0Var.h.F(p3u0Var.i, this.b, (r4t) obj4, ((o811) obj3).a);
                rm5 rm5Var = (rm5) obj2;
                if (rm5Var != null) {
                    kks0 kks0Var = new kks0(rm5Var, (byte) 20);
                    if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                        kks0Var.invoke();
                    } else {
                        p3u0Var.h1.post(new an90(kks0Var, (byte) 22));
                    }
                }
                return rih1Var;
            case 6:
                t45 t45Var = (t45) obj5;
                t45Var.g(hs41.b(i, (ScrollCardType) obj3));
                t45Var.a("load_outcome", ((gs41) obj).toString());
                t45Var.b("entity_uri", (String) obj2);
                ((hs41) obj4).a.b(t45Var.e());
                return rih1Var;
            default:
                ptf1 ptf1Var = (ptf1) obj5;
                dlg1 dlg1Var = (dlg1) obj4;
                int iC = l1d.C(i);
                if (iC == 0) {
                    ptf1Var.w();
                } else if (iC == 1) {
                    kt91 kt91Var = (kt91) ptf1Var.c;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962911});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131962911, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                } else if (iC != 4) {
                    fn31.T(cto1.q((dg30) dlg1Var.a), (q8n) dlg1Var.b, 0, new hex0((d0r) obj3, (String) obj2, null, (byte) 2), 2);
                } else {
                    x1i1.a((x1i1) dlg1Var.c, kno1.b, 6);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf8(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf8(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf8(List list, View view, List list2, ConstraintLayout constraintLayout, int i) {
        super(1);
        this.a = (byte) 4;
        this.c = list;
        this.d = view;
        this.e = list2;
        this.f = constraintLayout;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf8(t45 t45Var, hs41 hs41Var, int i, ScrollCardType scrollCardType, String str) {
        super(1);
        this.a = (byte) 6;
        this.c = t45Var;
        this.d = hs41Var;
        this.b = i;
        this.e = scrollCardType;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf8(t1i t1iVar, u1i u1iVar, qzh qzhVar, int i, Object obj) {
        super(1);
        this.a = (byte) 3;
        this.c = t1iVar;
        this.d = u1iVar;
        this.e = qzhVar;
        this.b = i;
        this.f = obj;
    }
}
