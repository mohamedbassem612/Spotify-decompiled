package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final luk g;
    public final idd1 h = new idd1(new k25(this, (byte) 23));

    public w35(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = i2;
        this.g = lukVar;
    }

    public final w35 a() {
        return (w35) this.h.getValue();
    }

    public final boolean b() {
        w35 w35VarA = a();
        return w35VarA != null ? w35VarA.b() : this.a;
    }

    public final boolean c() {
        w35 w35VarA = a();
        return w35VarA != null ? w35VarA.c() : this.b;
    }

    public final boolean d() {
        w35 w35VarA = a();
        return w35VarA != null ? w35VarA.d() : this.c;
    }

    public final boolean e() {
        w35 w35VarA = a();
        return w35VarA != null ? w35VarA.e() : this.d;
    }

    public final int f() {
        w35 w35VarA = a();
        return w35VarA != null ? w35VarA.f() : this.e;
    }

    public final int g() {
        w35 w35VarA = a();
        return w35VarA != null ? w35VarA.g() : this.f;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_error_popup", "android-tasteprofile-page", b()), new fpb("enable_first_note_bottom_sheet", "android-tasteprofile-page", c()), new fpb("enable_notes", "android-tasteprofile-page", d()), new fpb("enable_processing_status", "android-tasteprofile-page", e()), new fpb("polling_interval_seconds", "android-tasteprofile-page", f(), 1, 60), new fpb("polling_max_attempts", "android-tasteprofile-page", g(), 0, 100)});
    }
}
