package p;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xql1 implements vql1 {
    public final View a;
    public final ArrayList b = new ArrayList();
    public wql1 c;

    public xql1(View view) {
        this.a = view;
    }

    @Override // p.vql1
    public final void a(uql1 uql1Var) {
        ArrayList arrayList = this.b;
        arrayList.add(uql1Var);
        if (arrayList.isEmpty() || this.c != null) {
            return;
        }
        View.OnApplyWindowInsetsListener wql1Var = new wql1(this);
        this.c = wql1Var;
        this.a.setOnApplyWindowInsetsListener(wql1Var);
    }

    @Override // p.vql1
    public final void b(gua0 gua0Var) {
        ArrayList arrayList = this.b;
        arrayList.remove(gua0Var);
        if (!arrayList.isEmpty() || this.c == null) {
            return;
        }
        this.a.setOnApplyWindowInsetsListener(null);
        this.c = null;
    }
}
