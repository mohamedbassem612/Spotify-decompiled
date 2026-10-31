package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v9c1 implements Connectable {
    public final ex30 X;
    public final llm Y;
    public final iu30 a;
    public final iu30 b;
    public final q881 c;
    public final rmr d;
    public final ViewGroup e;
    public final View f;
    public final View g;
    public a6c1 h;
    public boolean i;
    public final r4u t;

    public v9c1(LayoutInflater layoutInflater, ViewGroup viewGroup, iu30 iu30Var, l5b1 l5b1Var, q881 q881Var, rmr rmrVar) {
        this.a = iu30Var;
        this.b = l5b1Var;
        this.c = q881Var;
        this.d = rmrVar;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131626204, viewGroup, false);
        this.e = viewGroup2;
        this.f = b8k1.n(viewGroup2, 2131429833);
        View viewN = b8k1.n(viewGroup2, 2131430686);
        this.g = viewN;
        this.t = r4u.c(new r4u(a4x0.Q0, new dn81(this, (byte) 12)), r4u.d(new z1w(t9c1.b, (byte) 2), r4u.a(new q881(this, (byte) 13))), r4u.d(new z1w(u9c1.b, (byte) 2), r4u.a(new c681(this, (byte) 16))));
        this.X = ex30.c(new ex30[]{ex30.b(b4x0.Q0, s8p1.p(viewN))});
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        z8n z8nVar = new z8n("StoryViews");
        bs50Var.getClass();
        this.Y = smo1.e(ilo1.B(bs50Var, z8nVar));
    }

    public final Connection L(Consumer consumer) {
        return new pee0(this, this.X.a(new vr51(consumer, (byte) 21)), (byte) 10);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(kas0 kas0Var) throws NoWhenBranchMatchedException {
        int iOrdinal = kas0Var.ordinal();
        if (iOrdinal == 0) {
            a6c1 a6c1Var = this.h;
            if (a6c1Var != null) {
                a6c1Var.a();
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            eg.o();
            return;
        }
        a6c1 a6c1Var2 = this.h;
        if (a6c1Var2 != null) {
            a6c1Var2.d();
        }
    }
}
