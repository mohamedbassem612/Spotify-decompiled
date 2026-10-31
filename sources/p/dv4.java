package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new st4(this, (byte) 28));

    public dv4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        dv4 dv4Var = (dv4) this.d.getValue();
        return dv4Var != null ? dv4Var.a() : this.a;
    }

    public final boolean b() {
        dv4 dv4Var = (dv4) this.d.getValue();
        return dv4Var != null ? dv4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("should_use_video_thumbnail", "android-nowplaying-mini-uicomponents", a()), new fpb("should_use_vit", "android-nowplaying-mini-uicomponents", b())});
    }
}
