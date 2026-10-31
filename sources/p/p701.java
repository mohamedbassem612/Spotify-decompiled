package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p701 implements owo0 {
    public final ha01 a;
    public final hbg1 b;
    public final n6r0 c;
    public final o701 d;
    public final boolean e;

    public p701(ha01 ha01Var, hbg1 hbg1Var, n6r0 n6r0Var, o701 o701Var, boolean z) {
        this.a = ha01Var;
        this.b = hbg1Var;
        this.c = n6r0Var;
        this.d = o701Var;
        this.e = z;
    }

    @Override // p.owo0
    public final void c(ji50 ji50Var, zq41 zq41Var, iyo0 iyo0Var) {
        ji50Var.b.put(vxo0.class, new r3r(new wzq(fdg1.m0(this.a.a(ji50Var.a, this.b.a(this.c, this.d, zq41Var, (hyy0) null), this.c, this.e, zq41Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), k301.R0), atz0.i, (vu30) null));
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(vxo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        throw new IllegalStateException("Use register(groupBuilder, lifecycleOwner) instead");
    }
}
