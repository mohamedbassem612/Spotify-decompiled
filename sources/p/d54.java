package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d54 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 12));

    public d54(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        d54 d54Var = (d54) this.c.getValue();
        return d54Var != null ? d54Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("artist_context_menu_page_api_enabled", "android-artist-contextmenuimpl", a()));
    }
}
