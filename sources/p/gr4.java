package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gr4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final fr4 f;
    public final boolean g;
    public final boolean h;
    public final luk i;
    public final idd1 j = new idd1(new rq4(this, (byte) 10));

    public gr4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, fr4 fr4Var, boolean z6, boolean z7, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = fr4Var;
        this.g = z6;
        this.h = z7;
        this.i = lukVar;
    }

    public final boolean a() {
        gr4 gr4VarC = c();
        return gr4VarC != null ? gr4VarC.a() : this.a;
    }

    public final boolean b() {
        gr4 gr4VarC = c();
        return gr4VarC != null ? gr4VarC.b() : this.b;
    }

    public final gr4 c() {
        return (gr4) this.j.getValue();
    }

    public final boolean d() {
        gr4 gr4VarC = c();
        return gr4VarC != null ? gr4VarC.d() : this.c;
    }

    public final boolean e() {
        gr4 gr4VarC = c();
        return gr4VarC != null ? gr4VarC.e() : this.d;
    }

    public final boolean f() {
        gr4 gr4VarC = c();
        return gr4VarC != null ? gr4VarC.f() : this.e;
    }

    public final fr4 g() {
        fr4 fr4VarG;
        gr4 gr4VarC = c();
        return (gr4VarC == null || (fr4VarG = gr4VarC.g()) == null) ? this.f : fr4VarG;
    }

    public final boolean h() {
        gr4 gr4VarC = c();
        return gr4VarC != null ? gr4VarC.h() : this.g;
    }

    public final boolean i() {
        gr4 gr4VarC = c();
        return gr4VarC != null ? gr4VarC.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("active_line_size_indicator_enabled", "android-lyrics-textelement", a());
        fpb fpbVar2 = new fpb("center_single_line_enabled", "android-lyrics-textelement", b());
        fpb fpbVar3 = new fpb("deferred_geometry_reads_enabled", "android-lyrics-textelement", d());
        fpb fpbVar4 = new fpb("fixed_card_constraints_enabled", "android-lyrics-textelement", e());
        fpb fpbVar5 = new fpb("instrumentation_container_support_enabled", "android-lyrics-textelement", f());
        String str = g().a;
        fr4[] fr4VarArrValues = fr4.values();
        ArrayList arrayList = new ArrayList(fr4VarArrValues.length);
        for (fr4 fr4Var : fr4VarArrValues) {
            arrayList.add(fr4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, new fpb("lyrics_type_style", "android-lyrics-textelement", str, arrayList), new fpb("single_line_touch_through_enabled", "android-lyrics-textelement", h()), new fpb("stable_highlight_colour_enabled", "android-lyrics-textelement", i()));
    }
}
