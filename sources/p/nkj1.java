package p;

import com.spotify.adsinternal.adscore.model.Format;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nkj1 implements dsw {
    public final q290 a;
    public final gcq b;
    public final qaj1 c;
    public final lbj1 d;
    public final boolean e;

    public nkj1(q290 q290Var, gcq gcqVar, qaj1 qaj1Var, lbj1 lbj1Var, boolean z) {
        this.a = q290Var;
        this.b = gcqVar;
        this.c = qaj1Var;
        this.d = lbj1Var;
        this.e = z;
    }

    @Override // p.dsw
    public final boolean accept(Object obj) {
        ji0 ji0Var = (ji0) o7h.s0((List) obj);
        return (ji0Var != null ? ji0Var.Z : null) == Format.VIDEO;
    }

    @Override // p.dsw
    public final kpg0 element() {
        return this.e ? new kpg0(this.b.a(this.d), egj1.W0) : new kpg0(this.a.a(this.c), egj1.X0);
    }
}
