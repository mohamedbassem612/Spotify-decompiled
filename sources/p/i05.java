package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i05 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new uz4(this, (byte) 11));

    public i05(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        i05 i05Var = (i05) this.d.getValue();
        return i05Var != null ? i05Var.a() : this.a;
    }

    public final boolean b() {
        i05 i05Var = (i05) this.d.getValue();
        return i05Var != null ? i05Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("use_product_composer", "android-reinventfree-smartshufflerecommednationsimpl", a()), new fpb("use_unbrand_smart_shuffle_recs_copy_in_external_integration", "android-reinventfree-smartshufflerecommednationsimpl", b()));
    }
}
