package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o94 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 18));

    public o94(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        o94 o94Var = (o94) this.c.getValue();
        return o94Var != null ? o94Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("clear_cache_on_trim_enabled", "android-companion-content-loader-impl", a()));
    }
}
