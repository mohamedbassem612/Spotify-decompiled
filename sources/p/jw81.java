package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jw81 extends kw81 {
    public final nhr0 f;
    public final k241 g;
    public final ef8 h;
    public final Bundle i;

    public jw81(nhr0 nhr0Var, k241 k241Var, ef8 ef8Var, Bundle bundle) {
        this.f = nhr0Var;
        this.g = k241Var;
        this.h = ef8Var;
        this.i = bundle;
    }

    public final f4h1 f(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, jhl jhlVar) {
        return ((g4h1) this.h.invoke(this.f, this.g.b, new fe81(this, (byte) 7))).a(context, this.i, layoutInflater, viewGroup);
    }

    public final Bundle serialize() {
        f4h1 f4h1Var = ((kw81) this).a;
        if (f4h1Var != null) {
            return f4h1Var.serialize();
        }
        return null;
    }
}
