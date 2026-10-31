package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class su31 implements ct31 {
    public final s7s0 a;
    public final oi b;

    public su31(s7s0 s7s0Var) {
        this.a = s7s0Var;
        this.b = new oi((ViewGroup) s7s0Var.findViewById(2131427413));
    }

    public final View getView() {
        return this.a;
    }

    @Override // p.ct31
    public final void i(View view) {
        oi oiVar = this.b;
        oiVar.J(view);
        View view2 = (View) oiVar.d;
        ((ViewGroup) oiVar.c).setVisibility(view2 != null ? view2.getVisibility() : 8);
    }

    @Override // p.ct31
    public final View o() {
        return (View) this.b.d;
    }

    @Override // p.qa0
    public final void setActive(boolean z) {
        this.a.setActive(z);
    }

    public final void setAppearsDisabled(boolean z) {
        this.a.setAppearsDisabled(z);
    }
}
