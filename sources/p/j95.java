package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j95 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final i95 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final luk j;
    public final idd1 k = new idd1(new f85(this, (byte) 15));

    public j95(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, i95 i95Var, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i95Var;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = lukVar;
    }

    public final boolean a() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.a() : this.a;
    }

    public final boolean b() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.b() : this.b;
    }

    public final j95 c() {
        return (j95) this.k.getValue();
    }

    public final boolean d() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.d() : this.c;
    }

    public final boolean e() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.e() : this.d;
    }

    public final boolean f() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.f() : this.e;
    }

    public final i95 g() {
        i95 i95VarG;
        j95 j95VarC = c();
        return (j95VarC == null || (i95VarG = j95VarC.g()) == null) ? this.f : i95VarG;
    }

    public final boolean h() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.h() : this.g;
    }

    public final boolean i() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.i() : this.h;
    }

    public final boolean j() {
        j95 j95VarC = c();
        return j95VarC != null ? j95VarC.j() : this.i;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("chip_selection_enabled", "android-zephyr", a());
        fpb fpbVar2 = new fpb("connect_transfer_messaging_enabled", "android-zephyr", b());
        fpb fpbVar3 = new fpb(rca.d, "android-zephyr", d());
        fpb fpbVar4 = new fpb("opt_in_enabled", "android-zephyr", e());
        fpb fpbVar5 = new fpb("playlist_speed_opt_out_context_menu_enabled", "android-zephyr", f());
        String strA = g().a();
        i95[] i95VarArrValues = i95.values();
        ArrayList arrayList = new ArrayList(i95VarArrValues.length);
        for (i95 i95Var : i95VarArrValues) {
            arrayList.add(i95Var.a());
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, new fpb("speed_disclosure_and_opt_out", "android-zephyr", strA, arrayList), new fpb("sync_lyrics_enabled", "android-zephyr", h()), new fpb("track_context_menu_enabled", "android-zephyr", i()), new fpb("validate_transitions_using_core_enabled", "android-zephyr", j()));
    }
}
