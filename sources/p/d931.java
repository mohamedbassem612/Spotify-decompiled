package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d931 extends kw81 {
    public final /* synthetic */ byte f = 0;
    public final nhr0 g;
    public final Bundle h;
    public final iu30 i;

    public d931(nhr0 nhr0Var, iu30 iu30Var, Bundle bundle) {
        this.g = nhr0Var;
        this.i = iu30Var;
        this.h = bundle;
    }

    @Override // p.kw81
    public final f4h1 f(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, jhl jhlVar) {
        byte b = this.f;
        Bundle bundle = this.h;
        nhr0 nhr0Var = this.g;
        v721 v721Var = this.i;
        switch (b) {
            case 0:
                return ((g4h1) v721Var.invoke(nhr0Var)).a(context, bundle, layoutInflater, viewGroup);
            default:
                return ((g4h1) v721Var.invoke(nhr0Var)).a(context, bundle, layoutInflater, viewGroup);
        }
    }

    public final Bundle serialize() {
        switch (this.f) {
            case 0:
                f4h1 f4h1Var = this.a;
                if (f4h1Var != null) {
                    return f4h1Var.serialize();
                }
                return null;
            default:
                f4h1 f4h1Var2 = this.a;
                if (f4h1Var2 != null) {
                    return f4h1Var2.serialize();
                }
                return null;
        }
    }

    public d931(nhr0 nhr0Var, Bundle bundle, v721 v721Var) {
        this.g = nhr0Var;
        this.h = bundle;
        this.i = v721Var;
    }
}
