package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xl7 {
    public final tl7 a;
    public final boolean b;
    public View c;
    public View d;
    public Rect e;
    public Float f;
    public final rm5 g;

    public xl7(bbr0 bbr0Var, iac0 iac0Var, fkk1 fkk1Var, kw4 kw4Var) {
        this.e = (Rect) fkk1Var.a().e();
        rm5 rm5Var = new rm5(new rr6(this, (byte) 13), (byte) 13);
        this.g = rm5Var;
        q1r0 q1r0Var = (q1r0) bbr0Var.b0(q1r0.class).a();
        if (q1r0Var == null || !q1r0Var.a) {
            this.a = new qbo0();
            this.b = false;
        } else {
            this.a = new pgr(rm5Var, kw4Var.a());
            this.b = true;
        }
        fkk1Var.a().f(iac0Var, new z11(this, (byte) 2));
    }

    public static RecyclerView a(View view) {
        RecyclerView recyclerViewA;
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        d7 it = new i46((ViewGroup) view, (byte) 8).iterator();
        do {
            d7 d7Var = it;
            if (!d7Var.hasNext()) {
                return null;
            }
            recyclerViewA = a((View) d7Var.next());
        } while (recyclerViewA == null);
        return recyclerViewA;
    }
}
