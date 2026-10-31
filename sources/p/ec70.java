package p;

import android.view.View;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ec70 extends f770 {
    public ec70(Class cls) {
        super(EnumSet.of(ix40.c), cls, (byte) 1);
        new jh51();
    }

    @Override // p.f770
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void f(bh51 bh51Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        bh51Var.c = ((id70) y570Var.n()).a.a;
        bh51Var.a();
        View view = bh51Var.a;
        if (view != null) {
            boolean z = y570Var.t() != null;
            bh51Var.e = z;
            view.setClickable(z);
            bh51Var.a();
            two1.r(l670Var, view, y570Var);
        } else {
            bh51Var.e = false;
            view.setClickable(false);
            bh51Var.a();
        }
        hd70 hd70Var = ((id70) y570Var.n()).a;
    }
}
