package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tcc1 implements g4h1 {
    public final ycc1 a;
    public final dsq b;
    public final cir0 c;
    public final ick1 d;
    public final String e;

    public tcc1(ycc1 ycc1Var, dsq dsqVar, cir0 cir0Var, ick1 ick1Var, String str) {
        this.a = ycc1Var;
        this.b = dsqVar;
        this.c = cir0Var;
        this.d = ick1Var;
        this.e = str;
    }

    @Override // p.g4h1
    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new scc1(context, this.c.e(), this.d, this.a, this.b, this.e);
    }
}
