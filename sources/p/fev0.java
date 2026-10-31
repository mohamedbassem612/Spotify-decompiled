package p;

import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fev0 implements h611, View.OnAttachStateChangeListener {
    public final RecyclerView a;
    public final kn90 b;
    public final LinkedHashMap c;
    public boolean d;

    public fev0(RecyclerView recyclerView) {
        this.a = recyclerView;
        dev0 dev0Var = dev0.a;
        this.b = new kn90(recyclerView);
        this.c = new LinkedHashMap();
        recyclerView.addOnAttachStateChangeListener(this);
        d();
    }

    public final void b(View view) {
        if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            eg.m("Check failed.");
            return;
        }
        emc0 emc0Var = this.a.T(view).S0;
        emc0 emc0Var2 = emc0Var instanceof emc0 ? emc0Var : null;
        if (emc0Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(emc0Var2)) {
            return;
        }
        eev0 eev0Var = new eev0(emc0Var2, this);
        linkedHashMap.put(emc0Var2, eev0Var);
        emc0Var2.w(eev0Var);
    }

    public final void c(View view) {
        b(view);
    }

    public final void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        RecyclerView recyclerView = this.a;
        recyclerView.k(this);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            b(recyclerView.getChildAt(i));
        }
    }

    public final void e() {
        this.d = false;
        LinkedHashMap linkedHashMap = this.c;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((emc0) entry.getKey()).z((b611) entry.getValue());
        }
        linkedHashMap.clear();
        this.a.o0(this);
        this.b.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        e();
    }

    public final void a(View view) {
    }
}
