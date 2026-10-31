package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final luk d;
    public final idd1 e;

    public o35(int i, luk lukVar, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = lukVar;
        this.e = new idd1(new k25(this, (byte) 18));
    }

    public final boolean a() {
        o35 o35Var = (o35) this.e.getValue();
        return o35Var != null ? o35Var.a() : this.a;
    }

    public final boolean b() {
        o35 o35Var = (o35) this.e.getValue();
        return o35Var != null ? o35Var.b() : this.b;
    }

    public final int c() {
        o35 o35Var = (o35) this.e.getValue();
        return o35Var != null ? o35Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_mobius_preview_coordinator", "android-system-previewcard-previewcoordinator-impl", a()), new fpb("enable_pre_acquisition_debounce", "android-system-previewcard-previewcoordinator-impl", b()), new fpb("pre_acquisition_debounce_ms", "android-system-previewcard-previewcoordinator-impl", c(), 0, 1000)});
    }

    public o35(luk lukVar) {
        this(150, lukVar, false, false);
    }
}
