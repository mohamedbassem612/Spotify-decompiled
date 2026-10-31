package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eh4 implements pdy0 {
    public final bh4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final tgp0 l;
    public final luk m;
    public final idd1 n;
    public final idd1 o;

    public eh4(bh4 bh4Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, tgp0 tgp0Var, luk lukVar) {
        this.a = bh4Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = tgp0Var;
        this.m = lukVar;
        this.n = new idd1(new q30(this, (byte) 10));
        this.o = new idd1(new cg4(this, (byte) 17));
    }

    public final eh4 a() {
        return (eh4) this.o.getValue();
    }

    public final bh4 b() {
        bh4 bh4VarB;
        eh4 eh4VarA = a();
        return (eh4VarA == null || (bh4VarB = eh4VarA.b()) == null) ? this.a : bh4VarB;
    }

    public final boolean c() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.c() : this.b;
    }

    public final boolean d() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.d() : this.c;
    }

    public final boolean e() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.e() : this.d;
    }

    public final boolean f() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.f() : this.e;
    }

    public final boolean g() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.g() : this.f;
    }

    public final boolean h() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.h() : this.g;
    }

    public final boolean i() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.i() : this.h;
    }

    public final Observable j() {
        if (this.l == null) {
            return l1d.h(this.b);
        }
        Observable observableDistinctUntilChanged = ((Observable) this.n.getValue()).map(s321.g).distinctUntilChanged();
        observableDistinctUntilChanged.getClass();
        return observableDistinctUntilChanged;
    }

    public final boolean k() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.k() : this.k;
    }

    public final boolean l() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.l() : this.i;
    }

    public final boolean m() {
        eh4 eh4VarA = a();
        return eh4VarA != null ? eh4VarA.m() : this.j;
    }

    @Override // p.pdy0
    public final List models() {
        String str = b().a;
        bh4[] bh4VarArrValues = bh4.values();
        ArrayList arrayList = new ArrayList(bh4VarArrValues.length);
        for (bh4 bh4Var : bh4VarArrValues) {
            arrayList.add(bh4Var.a);
        }
        return p7h.M(new fpb("enable_group_matches_session_modifier", "android-feature-nowplaying-queue-bottom-sheet", str, arrayList), new fpb("enable_mft_plus_queue", "android-feature-nowplaying-queue-bottom-sheet", c()), new fpb("enable_mixing_metadata", "android-feature-nowplaying-queue-bottom-sheet", d()), new fpb("enable_play_next_in_context_menus", "android-feature-nowplaying-queue-bottom-sheet", e()), new fpb("enable_player_state_restrictions", "android-feature-nowplaying-queue-bottom-sheet", f()), new fpb("enable_queue_traits", "android-feature-nowplaying-queue-bottom-sheet", g()), new fpb("enable_reshuffle", "android-feature-nowplaying-queue-bottom-sheet", h()), new fpb("enable_track_row_element", "android-feature-nowplaying-queue-bottom-sheet", i()), new fpb("is_queue_peek_persistent_enabled", "android-feature-nowplaying-queue-bottom-sheet", l()), new fpb("is_swipe_to_play_next_in_queue_enabled", "android-feature-nowplaying-queue-bottom-sheet", m()), new fpb("use_resolved_subtitles", "android-feature-nowplaying-queue-bottom-sheet", k()));
    }

    public eh4(tgp0 tgp0Var, luk lukVar) {
        this(bh4.OFF, false, false, false, false, false, false, false, false, false, false, tgp0Var, lukVar);
    }
}
