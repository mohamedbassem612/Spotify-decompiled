package p;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.CompletableSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q8e0 implements qrg0, o5q0 {
    public final Scheduler a;
    public final r8e0 b;
    public final t7y c;
    public final zdz d;
    public final CompositeDisposable e = new CompositeDisposable();
    public int f = 50;
    public boolean g;

    public q8e0(Scheduler scheduler, r8e0 r8e0Var, t7y t7yVar, zdz zdzVar, nbc nbcVar) {
        this.a = scheduler;
        this.b = r8e0Var;
        this.c = t7yVar;
        this.d = zdzVar;
    }

    public static lnn1 f(n6v0 n6v0Var) {
        if ((n6v0Var instanceof k6v0) || (n6v0Var instanceof l6v0)) {
            return h2z.c;
        }
        if (n6v0Var instanceof m6v0) {
            m6v0 m6v0Var = (m6v0) n6v0Var;
            return new i2z(m6v0Var.a, m6v0Var.b, m6v0Var.c, m6v0Var.d, m6v0Var.e, m6v0Var.f);
        }
        eg.o();
        return null;
    }

    public final void a(int i) {
        this.f = i;
        this.e.g();
        e(null);
    }

    public final void b(int i) {
        if (i == 1) {
            this.e.g();
            e(null);
        }
    }

    public final boolean c() {
        return this.g;
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt("range_length", this.f);
        r8e0 r8e0Var = this.b;
        r8e0Var.getClass();
        Bundle bundle2 = new Bundle();
        RecyclerView recyclerView = r8e0Var.g;
        if (recyclerView == null) {
            u890.C("recyclerView");
            throw null;
        }
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            bundle2.putParcelable("recycler_view_layout_manager_state", layoutManager.x0());
        }
        bundle.putAll(bundle2);
        return bundle;
    }

    public final void e(o9v0 o9v0Var) {
        Observable observableStartWithItem;
        CompletableSubject completableSubject = this.b.e;
        int i = this.f;
        zdz zdzVar = this.d;
        if (o9v0Var == null) {
            observableStartWithItem = zdzVar.a(i);
        } else {
            observableStartWithItem = zdzVar.a(i).startWithItem(o9v0Var);
            observableStartWithItem.getClass();
        }
        this.e.b(completableSubject.d(observableStartWithItem).observeOn(this.a).subscribe(new p8e0(this, (byte) 0), new p8e0(this, (byte) 1)));
    }
}
