package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ql4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 12));

    public ql4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ql4 ql4Var = (ql4) this.c.getValue();
        return ql4Var != null ? ql4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("settings_entry_point_enabled", "android-libraryimport-settings-impl", a()));
    }
}
