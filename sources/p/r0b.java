package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r0b implements p4h1 {
    public final i0b a;
    public final lzn0 b;
    public final iyc0 c;
    public final it8 d;
    public final rku e = new rku();
    public final View f;
    public final LinearLayout g;

    public r0b(LayoutInflater layoutInflater, ViewGroup viewGroup, i0b i0bVar, lzn0 lzn0Var, iyc0 iyc0Var, it8 it8Var) {
        this.a = i0bVar;
        this.b = lzn0Var;
        this.c = iyc0Var;
        this.d = it8Var;
        View viewInflate = layoutInflater.inflate(2131624091, viewGroup, false);
        this.f = viewInflate;
        int i = kgr0.T0;
        this.g = xyn1.z(viewInflate);
    }

    @Override // p.p4h1
    public final View a() {
        return this.g;
    }
}
