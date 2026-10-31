package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p44 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new m44(this, (byte) 2));

    public p44(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        p44 p44Var = (p44) this.d.getValue();
        return p44Var != null ? p44Var.a() : this.a;
    }

    public final boolean b() {
        p44 p44Var = (p44) this.d.getValue();
        return p44Var != null ? p44Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_contiguous_viewability_observer_for_in_stream_ads", "android-adsinternal-playback", a()), new fpb("enable_continuous_viewability_observer_for_in_stream_ads", "android-adsinternal-playback", b()));
    }
}
