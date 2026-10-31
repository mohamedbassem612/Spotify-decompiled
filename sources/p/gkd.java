package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gkd implements View.OnLayoutChangeListener {
    public View a;
    public final bpb1 b;
    public final bpb1 c;
    public final vku d;

    public gkd() {
        bpb1 bpb1VarB = gio1.b(Boolean.TRUE);
        this.b = bpb1VarB;
        this.c = bpb1VarB;
        this.d = new vku();
    }

    public final void a(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(2131427918);
        this.a = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(this);
        }
    }

    public final void b() {
        View view = this.a;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        this.d.c();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.b;
            value = bpb1Var.getValue();
            ((Boolean) value).getClass();
        } while (!bpb1Var.k(value, Boolean.valueOf(i6 > i2)));
    }
}
