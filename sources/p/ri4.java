package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ri4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public ri4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new sh4(this, (byte) 15));
    }

    public final boolean a() {
        ri4 ri4Var = (ri4) this.f.getValue();
        return ri4Var != null ? ri4Var.a() : this.a;
    }

    public final boolean b() {
        ri4 ri4Var = (ri4) this.f.getValue();
        return ri4Var != null ? ri4Var.b() : this.b;
    }

    public final boolean c() {
        ri4 ri4Var = (ri4) this.f.getValue();
        return ri4Var != null ? ri4Var.c() : this.c;
    }

    public final boolean d() {
        ri4 ri4Var = (ri4) this.f.getValue();
        return ri4Var != null ? ri4Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_external_link", "android-feature-transcript-npv", a()), new fpb("enable_passthrough", "android-feature-transcript-npv", b()), new fpb("enable_transcript_npv", "android-feature-transcript-npv", c()), new fpb("enable_translation", "android-feature-transcript-npv", d())});
    }

    public ri4(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
