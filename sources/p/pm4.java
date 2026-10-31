package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public pm4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new om4(this, (byte) 0));
    }

    public final boolean a() {
        pm4 pm4Var = (pm4) this.f.getValue();
        return pm4Var != null ? pm4Var.a() : this.a;
    }

    public final boolean b() {
        pm4 pm4Var = (pm4) this.f.getValue();
        return pm4Var != null ? pm4Var.b() : this.c;
    }

    public final boolean c() {
        pm4 pm4Var = (pm4) this.f.getValue();
        return pm4Var != null ? pm4Var.c() : this.d;
    }

    public final boolean d() {
        pm4 pm4Var = (pm4) this.f.getValue();
        return pm4Var != null ? pm4Var.d() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("error_dialogs_enabled", "android-libs-greenroom", a()), new fpb("is_upcoming_state_check_enabled", "android-libs-greenroom", d()), new fpb("list_playback_enabled", "android-libs-greenroom", b()), new fpb("reporting_enabled", "android-libs-greenroom", c()));
    }

    public pm4(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
