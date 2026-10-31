package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q4z implements o01 {
    public final vx40 a;
    public final jh51 b;

    public q4z(vx40 vx40Var, jh51 jh51Var) {
        this.a = vx40Var;
        this.b = jh51Var;
    }

    public final n01 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        m4c m4cVar = this.b.a;
        View viewInflate = LayoutInflater.from(context).inflate(2131626175, viewGroup, false);
        bh51 bh51Var = new bh51(viewInflate, false);
        viewInflate.setTag(2131429011, bh51Var);
        ((ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams()).topMargin = context.getResources().getDimensionPixelSize(2131166884);
        b8k1.q(viewInflate, true);
        return new p4z(bh51Var);
    }

    public final void b(a2z a2zVar, w611 w611Var) {
        bh51 bh51Var = ((p4z) w611Var).U0;
        String str = ((o4z) a2zVar).a.b;
        vx40 vx40Var = this.a;
        Integer num = (Integer) ((j380) vx40Var.c).get(str);
        if (num == null) {
            num = 2131955587;
        }
        bh51Var.c = ((Context) vx40Var.b).getString(num.intValue());
        bh51Var.a();
    }
}
