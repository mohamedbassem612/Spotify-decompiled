package p;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class upf1 extends m570 implements o570 {
    public final pd80 a;
    public final zpg0 b;
    public final iac0 c;
    public final Scheduler d;

    public upf1(pd80 pd80Var, zpg0 zpg0Var, iac0 iac0Var, Scheduler scheduler) {
        this.a = pd80Var;
        this.b = zpg0Var;
        this.c = iac0Var;
        this.d = scheduler;
    }

    public final int a() {
        return 2131429646;
    }

    @Override // p.m570
    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setLayoutParams(new g611(-1, -2));
        constraintLayout.setPadding((int) viewGroup.getContext().getResources().getDimension(2131166184), (int) viewGroup.getContext().getResources().getDimension(2131166184), (int) viewGroup.getContext().getResources().getDimension(2131166184), 0);
        return new tpf1(constraintLayout, this.a, this.b, viewGroup.getContext(), this.c, this.d);
    }
}
