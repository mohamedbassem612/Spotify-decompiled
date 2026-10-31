package p;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k3j0 implements iyf0 {
    public final bbr0 a;
    public final j3j0 b;

    public k3j0(bbr0 bbr0Var, j3j0 j3j0Var) {
        this.a = bbr0Var;
        this.b = j3j0Var;
    }

    @Override // p.iyf0
    public final void c() {
        this.b.d = new z8i0(this, (byte) 16);
    }

    @Override // p.iyf0
    public final void d() {
        String str;
        j3j0 j3j0Var = this.b;
        Function0 function0 = j3j0Var.d;
        j3j0Var.d = (function0 == null || (str = (String) function0.invoke()) == null) ? null : new yt3(str, (byte) 4);
    }

    @Override // p.iyf0
    public final void i() {
        j3j0 j3j0Var = this.b;
        j3j0Var.c = Long.valueOf(j3j0Var.a.b() / 1000);
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
