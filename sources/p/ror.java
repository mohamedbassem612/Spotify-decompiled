package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ror {
    public final kly0 a;
    public final ynb0 b;
    public final ynb0 c;

    public ror(a8p a8pVar, ynb0 ynb0Var, ynb0 ynb0Var2) {
        this.a = a8pVar;
        this.b = ynb0Var;
        this.c = ynb0Var2;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1516308481);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            spr sprVar = (spr) this.a.get();
            sprVar.getClass();
            otw.c(sprVar, new anl(1, zg91.b), u291.f(nim0.a, 1.0f), (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i4o(this, i);
        }
    }

    public final View b(Context context, ViewGroup viewGroup, int i, zg91 zg91Var) {
        spr sprVar = (spr) this.a.get();
        sprVar.getClass();
        qtw qtwVarA = f6o1.A(sprVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        tka0 tka0Var = dtw.C;
        View view = mhc.b(context, viewGroup, qtwVarA, new anl(i, zg91Var), (ipb1) null, 112).w;
        op80 jp80Var = new jp80(view);
        op80 eq80Var = new eq80(new e3h1((l6h1) this.c.get(), (n7h1) null, (i8h1) this.b.get()));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(view, jp80Var);
        return view;
    }
}
