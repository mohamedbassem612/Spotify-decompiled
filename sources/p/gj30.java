package p;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gj30 implements ghg1 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public gj30(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void f(jhg1 jhg1Var) {
        jhg1Var.G(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    public final void g(jhg1 jhg1Var) {
        jhg1Var.G(this);
        jhg1Var.a(this);
    }

    public final void a() {
    }

    public final void c() {
    }

    public final void b(jhg1 jhg1Var) {
    }
}
