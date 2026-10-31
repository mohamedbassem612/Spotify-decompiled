package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j44 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final luk i;
    public final idd1 j;

    public j44(int i, int i2, luk lukVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i2;
        this.h = z6;
        this.i = lukVar;
        this.j = new idd1(new g82(this, (byte) 27));
    }

    public final int a() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.a() : this.a;
    }

    public final boolean b() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.b() : this.b;
    }

    public final j44 c() {
        return (j44) this.j.getValue();
    }

    public final boolean d() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.d() : this.c;
    }

    public final boolean e() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.e() : this.d;
    }

    public final boolean f() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.f() : this.e;
    }

    public final boolean g() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.g() : this.f;
    }

    public final int h() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.h() : this.g;
    }

    public final boolean i() {
        j44 j44VarC = c();
        return j44VarC != null ? j44VarC.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("canvas_render_delay_ms", "android-adsdisplay-embeddedad", a(), 0, 9999999), new fpb("canvas_skeleton_enabled", "android-adsdisplay-embeddedad", b()), new fpb("embedded_ad_html_element_enabled", "android-adsdisplay-embeddedad", d()), new fpb("foreground_enabled", "android-adsdisplay-embeddedad", e()), new fpb("music_track_change_enabled", "android-adsdisplay-embeddedad", f()), new fpb("prioritize_canvas", "android-adsdisplay-embeddedad", g()), new fpb("render_delay_ms", "android-adsdisplay-embeddedad", h(), 0, 9999999), new fpb("tablet_supported", "android-adsdisplay-embeddedad", i()));
    }

    public j44(luk lukVar) {
        this(2000, 2000, lukVar, false, false, false, false, true, false);
    }
}
