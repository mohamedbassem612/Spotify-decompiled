package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h551 {
    public final w751 a;
    public final wao0 b;
    public final bpb1 c;
    public int d;
    public long e;
    public i551 f;
    public final RecyclerView g;
    public final s551 h;
    public final v751 i;
    public rnc0 j;
    public List k;
    public final b851 l;
    public final p1d0 m;
    public final ig7 n;
    public final zl7 o;

    public h551(w751 w751Var, wao0 wao0Var, iac0 iac0Var, znp znpVar, hc51 hc51Var, y751 y751Var, khc khcVar) {
        this.a = w751Var;
        this.b = wao0Var;
        z6x z6xVar = z6x.a;
        bpb1 bpb1VarB = gio1.b(z6xVar);
        this.c = bpb1VarB;
        RecyclerView recyclerView = new RecyclerView(w751Var.getContext());
        this.g = recyclerView;
        this.i = new v751(recyclerView, new ggx0(0, w751Var, ViewGroup.class, "postInvalidateOnAnimation", "postInvalidateOnAnimation()V", 0, (byte) 22), new hf31(y751Var, hc51Var, (byte) 23), new v721(this, y751Var, hc51Var, (byte) 24));
        this.j = new rnc0();
        this.k = z6xVar;
        this.l = new b851(false, false);
        this.n = new ig7(this, (byte) 3);
        this.o = new zl7(this, (byte) 20);
        t5p1.j(new x010(y751Var.b, y751Var.d, new xx0(3, (lnm) null, (byte) 22), (byte) 1), 3).f(iac0Var, new g551(this, (byte) 0));
        m021 m021VarE = znpVar.a(wao0Var, bpb1VarB).e();
        cnc0 cnc0Var = (cnc0) m021VarE.b;
        s551 s551Var = (s551) ((dt90) m021VarE.c).invoke();
        this.h = s551Var;
        iac0Var.getLifecycle().a(new i83(s551Var, (byte) 20));
        LinkedHashMap linkedHashMap = cnc0Var.c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (laa) ((vu30) entry.getValue()).invoke(s551Var.a.getMetadata(), iac0Var));
        }
        p1d0 p1d0VarF = khc.f(khcVar, linkedHashMap2, cnc0Var.b, new v3v0(1, s551Var, s551.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 28), 12);
        this.m = p1d0VarF;
        RecyclerView recyclerView2 = this.g;
        recyclerView2.setId(2131430811);
        recyclerView2.m(this.n);
        recyclerView2.m(this.o);
        recyclerView2.setClipToPadding(false);
        recyclerView2.setItemAnimator((e611) null);
        rwq0.s(recyclerView2, new a7x0(recyclerView2, (byte) 1));
        RecyclerView recyclerView3 = this.g;
        recyclerView3.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.x1(1);
        p1d0VarF.a(recyclerView3, iac0Var, linearLayoutManager, false);
        new fn90(new w9d1(this.g.getContext())).i(this.g);
        w6d1.h(t5p1.j(s551Var.a.b(), 3)).f(iac0Var, new g551(this, (byte) 1));
        v751 v751Var = this.i;
        pn pnVar = v751Var.k;
        z511 z511Var = v751Var.j;
        if (z511Var != null) {
            z511Var.z(pnVar);
        }
        z511 adapter = v751Var.a.getAdapter();
        v751Var.j = adapter;
        if (adapter != null) {
            adapter.w(pnVar);
        }
        w751 w751Var2 = this.a;
        w751Var2.c.add(this.i);
    }

    public final boolean a(i551 i551Var, int i, rnc0 rnc0Var) {
        RecyclerView recyclerView;
        z511 adapter;
        r551 r551VarJ;
        qnc0 qnc0Var = new qnc0(rnc0Var.a, c(rnc0Var));
        s551 s551Var = this.h;
        bpb1 bpb1Var = s551Var.g;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, qnc0Var);
        List list = i551Var.b;
        xb51 xb51Var = i551Var.e;
        x751 x751Var = (x751) s551Var.d.b.a.getValue();
        if (x751Var != null) {
            int i2 = x751Var.b;
            if (xb51Var != null && i2 == xb51Var.a && (x751Var.c || x751Var.d != null)) {
                Map mapJ = s551Var.b.j();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    pd51 pd51Var = (pd51) obj;
                    f4r f4rVar = (f4r) s551Var.c.get(pd51Var.getClass());
                    f1r f1rVarA = f4rVar != null ? f4rVar.a(pd51Var) : null;
                    if (f1rVarA == null || (r551VarJ = l0o1.j(Collections.singletonList(f1rVarA), mapJ)) == null || r551VarJ.a <= 0) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
        }
        int i3 = i551Var.a;
        int i4 = i551Var.c;
        boolean z = i551Var.d;
        List list2 = rnc0Var.b;
        if (i3 != i) {
            return false;
        }
        if ((z && rnc0Var.a == i4) || (adapter = (recyclerView = this.g).getAdapter()) == null || adapter.e() != list2.size()) {
            return false;
        }
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return false;
        }
        int iH1 = linearLayoutManager.h1();
        View viewD = linearLayoutManager.D(iH1);
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pd51) it.next()).getId());
        }
        List list4 = list2;
        ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((h8k1) it2.next()).b.toString());
        }
        return k1o1.m(arrayList2, arrayList3, iH1, viewD != null ? viewD.getBottom() : -1, recyclerView.getHeight() - recyclerView.getPaddingBottom());
    }

    public final void b(List list, xb51 xb51Var) {
        bpb1 bpb1Var = this.c;
        boolean zJ = u890.j(list, bpb1Var.getValue());
        int i = this.d + 1;
        this.d = i;
        v751 v751Var = this.i;
        v751Var.e = i;
        v751Var.f = 0L;
        v751Var.i = null;
        this.f = new i551(i, list, this.j.a, !zJ, xb51Var);
        bpb1Var.getClass();
        bpb1Var.m((Object) null, list);
        if (zJ) {
            i551 i551Var = this.f;
            int i2 = this.d;
            rl21 rl21Var = new rl21(i551Var, this, (byte) 17);
            if (xb51Var == null || i2 != v751Var.e) {
                return;
            }
            long j = 1 + v751Var.f;
            v751Var.f = j;
            v751Var.i = new u751(i2, j, xb51Var.a, rl21Var, true);
            v751Var.b.invoke();
        }
    }

    public final List c(rnc0 rnc0Var) {
        LinearLayoutManager layoutManager = this.g.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return z6x.a;
        }
        tr80 tr80Var = new tr80(linearLayoutManager.f1(), linearLayoutManager.h1(), 1);
        List list = rnc0Var.b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            if (i <= ((rr80) tr80Var).b && ((rr80) tr80Var).a <= i) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return arrayList;
    }
}
