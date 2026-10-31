package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fx81 extends kw81 {
    public final nhr0 f;
    public final iu30 g;
    public final dx81 h;
    public final Bundle i;
    public final MobiusLoop.Controller t;

    public fx81(nhr0 nhr0Var, iu30 iu30Var, dx81 dx81Var, Bundle bundle) {
        this.f = nhr0Var;
        this.g = iu30Var;
        this.h = dx81Var;
        Bundle bundle2 = bundle != null ? bundle.getBundle("mobius-model") : null;
        this.i = bundle != null ? bundle.getBundle("uiholder") : null;
        this.t = MobiusAndroid.b((MobiusLoop.Factory) dx81Var.a.invoke(nhr0Var), dx81Var.b.invoke(bundle2), dx81Var.c);
    }

    @Override // p.kw81
    public final f4h1 f(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, jhl jhlVar) {
        h8l h8lVarA = ((i8l) this.g.invoke(this.f)).a(context, this.i, layoutInflater, viewGroup);
        jhlVar.c.a(new ex81(this, h8lVarA));
        return h8lVarA;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        f4h1 f4h1Var = this.a;
        Bundle bundleSerialize = f4h1Var != null ? f4h1Var.serialize() : null;
        if (bundleSerialize != null) {
            bundle.putBundle("uiholder", bundleSerialize);
        }
        iu30 iu30Var = this.h.d;
        if (iu30Var != null) {
            bundle.putBundle("mobius-model", (Bundle) iu30Var.invoke(this.t.a()));
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
