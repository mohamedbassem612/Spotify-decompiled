package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.subjects.CompletableSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r8e0 implements o5q0 {
    public final ewn0 a;
    public final esa1 b;
    public final t19 c;
    public q8e0 d;
    public View f;
    public RecyclerView g;
    public NestedScrollView h;
    public final CompletableSubject e = new CompletableSubject();
    public final ig7 i = new ig7(new ojv(this, (byte) 2), (byte) 1);

    public r8e0(ewn0 ewn0Var, esa1 esa1Var, t19 t19Var, v9c v9cVar) {
        this.a = ewn0Var;
        this.b = esa1Var;
        this.c = t19Var;
    }

    public final void a(int i) {
        q8e0 q8e0Var = this.d;
        if (q8e0Var != null) {
            q8e0Var.a(i);
        }
    }

    public final void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131624699, viewGroup, false);
        RecyclerView recyclerViewN = b8k1.n(viewInflate, 2131429799);
        RecyclerView recyclerView = recyclerViewN;
        viewInflate.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        k3s k3sVar = new k3s();
        ((zw81) k3sVar).g = false;
        recyclerView.setItemAnimator(k3sVar);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter((d7v0) this.a.b);
        recyclerView.m(this.i);
        rwq0.s(recyclerView, j830.c1);
        this.g = recyclerViewN;
        Context context = viewInflate.getContext();
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        View.OnClickListener kptVar = new kpt(this.b, (byte) 5);
        t19 t19Var = this.c;
        String str = t19Var.b;
        String str2 = t19Var.c;
        uw40 uw40VarA = xw40.a(context, viewGroup2);
        uw40VarA.a.setBackgroundColor(0);
        uw40 uw40Var = uw40VarA;
        uw40Var.setTitle(str);
        uw40Var.setSubtitle("");
        Button button = uw40Var.d;
        button.setText(str2);
        button.setOnClickListener(kptVar);
        View view = uw40Var.a;
        view.setId(2131428620);
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nestedScrollView.addView(view);
        nestedScrollView.setFillViewport(true);
        nestedScrollView.setId(2131428614);
        nestedScrollView.setVisibility(8);
        viewGroup2.addView(nestedScrollView);
        this.h = nestedScrollView;
        this.f = viewInflate;
        this.e.onComplete();
    }

    public final boolean c() {
        q8e0 q8e0Var = this.d;
        if (q8e0Var != null) {
            return q8e0Var.g;
        }
        return false;
    }

    public final void d() {
        NestedScrollView nestedScrollView = this.h;
        if (nestedScrollView == null) {
            u890.C("emptyView");
            throw null;
        }
        nestedScrollView.setVisibility(0);
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        } else {
            u890.C("recyclerView");
            throw null;
        }
    }
}
