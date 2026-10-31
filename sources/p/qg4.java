package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new cg4(this, (byte) 7));

    public qg4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        qg4 qg4Var = (qg4) this.f.getValue();
        return qg4Var != null ? qg4Var.a() : this.a;
    }

    public final boolean b() {
        qg4 qg4Var = (qg4) this.f.getValue();
        return qg4Var != null ? qg4Var.b() : this.b;
    }

    public final boolean c() {
        qg4 qg4Var = (qg4) this.f.getValue();
        return qg4Var != null ? qg4Var.c() : this.c;
    }

    public final boolean d() {
        qg4 qg4Var = (qg4) this.f.getValue();
        return qg4Var != null ? qg4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("clear_cache_on_trim_enabled", "android-feature-lyrics-repository", a()), new fpb("enable_dynamic_colors", "android-feature-lyrics-repository", b()), new fpb("enable_has_lyrics_check_bypass", "android-feature-lyrics-repository", c()), new fpb("enable_translated_lyrics_request_sharing", "android-feature-lyrics-repository", d()));
    }
}
