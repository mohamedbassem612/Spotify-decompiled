package p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoAfterNext;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rw41 {
    public final wao0 a;
    public int b;
    public final bpb1 c;
    public final RecyclerView d;
    public final v751 e;
    public boolean f;
    public boolean g;
    public final ne h;
    public b851 i;

    public rw41(esw eswVar, tl7 tl7Var, di4 di4Var, hc51 hc51Var, w751 w751Var, wao0 wao0Var) {
        this.a = wao0Var;
        bpb1 bpb1VarB = gio1.b(new ow41(this.b, z6x.a, null, false));
        this.c = bpb1VarB;
        RecyclerView recyclerView = new RecyclerView(w751Var.getContext());
        this.d = recyclerView;
        v751 v751Var = new v751(recyclerView, new ggx0(0, w751Var, ViewGroup.class, "postInvalidateOnAnimation", "postInvalidateOnAnimation()V", 0, (byte) 21), new v3v0(1, hc51Var, hc51.class, "isAwaitingContentPresentation", "isAwaitingContentPresentation-Q-2MKTo(I)Z", 0, (byte) 26), new v3v0(1, hc51Var, hc51.class, "renderContentPresented", "renderContentPresented-Q-2MKTo(I)Z", 0, (byte) 27));
        this.e = v751Var;
        FlowableDoAfterNext flowableDoAfterNext = new FlowableDoAfterNext(Flowable.F(q601.b(bpb1VarB)).v(new pw41(this, (byte) 0)), new pw41(this, (byte) 1));
        qw41 qw41Var = qw41.b;
        ne neVar = new ne(3, new m3n(flowableDoAfterNext.J(new c9c((byte) 23)), eswVar, wao0Var, (byte) 22));
        this.h = neVar;
        this.i = new b851(false, false);
        ig7 ig7Var = new ig7(this, (byte) 2);
        zl7 zl7Var = new zl7(this, (byte) 18);
        recyclerView.setId(2131430811);
        recyclerView.m(ig7Var);
        recyclerView.m(zl7Var);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator((e611) null);
        rwq0.s(recyclerView, new a7x0(recyclerView, (byte) 1));
        w751Var.getContext();
        neVar.f(recyclerView, new LinearLayoutManager(1), false);
        if (di4Var.m0()) {
            aiq0.a(w751Var, new xfz0(w751Var, this));
            recyclerView.addOnAttachStateChangeListener(new c9s(this, tl7Var, (byte) 8));
        }
        z511 z511Var = v751Var.j;
        pn pnVar = v751Var.k;
        if (z511Var != null) {
            z511Var.z(pnVar);
        }
        z511 adapter = recyclerView.getAdapter();
        v751Var.j = adapter;
        if (adapter != null) {
            adapter.w(pnVar);
        }
        w751Var.c.add(v751Var);
        new fn90(new w9d1(recyclerView.getContext())).i(recyclerView);
    }

    public final void a(List list, xb51 xb51Var) {
        bpb1 bpb1Var = this.c;
        List list2 = ((ow41) bpb1Var.getValue()).b;
        int i = this.b + 1;
        this.b = i;
        v751 v751Var = this.e;
        v751Var.e = i;
        v751Var.f = 0L;
        v751Var.i = null;
        ow41 ow41Var = new ow41(i, list, xb51Var, !u890.j(list, list2));
        bpb1Var.getClass();
        bpb1Var.m((Object) null, ow41Var);
    }
}
