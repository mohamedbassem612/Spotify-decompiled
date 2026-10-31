package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xx4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public xx4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new sx4(this, (byte) 2));
    }

    public final boolean a() {
        xx4 xx4Var = (xx4) this.d.getValue();
        return xx4Var != null ? xx4Var.a() : this.a;
    }

    public final boolean b() {
        xx4 xx4Var = (xx4) this.d.getValue();
        return xx4Var != null ? xx4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("list_entity_selection_long_press_enabled", "android-playlist-editing-selection", a()), new fpb("list_entity_selection_ui_enabled", "android-playlist-editing-selection", b())});
    }

    public xx4(luk lukVar) {
        this(false, false, lukVar);
    }
}
