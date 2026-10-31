package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o8e0 implements lqb1 {
    public final r8e0 a;
    public final q8e0 b;
    public final o9v0 c;

    public o8e0(r8e0 r8e0Var, q8e0 q8e0Var, o9v0 o9v0Var) {
        this.a = r8e0Var;
        this.b = q8e0Var;
        this.c = o9v0Var;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a.b(layoutInflater, viewGroup);
    }

    public final void d(Bundle bundle) {
        q8e0 q8e0Var = this.b;
        q8e0Var.getClass();
        q8e0Var.f = bundle.getInt("range_length", 50);
        RecyclerView recyclerView = q8e0Var.b.g;
        if (recyclerView == null) {
            u890.C("recyclerView");
            throw null;
        }
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.w0(bundle.getParcelable("recycler_view_layout_manager_state"));
    }

    public final Bundle f() {
        return this.b.d();
    }

    public final View getView() {
        return this.a.f;
    }

    public final void start() {
        q8e0 q8e0Var = this.b;
        q8e0Var.b.d = q8e0Var;
        q8e0Var.e(this.c);
    }

    public final void stop() {
        this.b.e.g();
    }
}
