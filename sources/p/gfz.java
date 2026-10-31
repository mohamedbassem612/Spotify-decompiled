package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gfz implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new pdy(this, (byte) 16));

    public gfz(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        gfz gfzVar = (gfz) this.d.getValue();
        return gfzVar != null ? gfzVar.a() : this.a;
    }

    public final boolean b() {
        gfz gfzVar = (gfz) this.d.getValue();
        return gfzVar != null ? gfzVar.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("always_use_equalizer", "equalizer", a()), new fpb("enable_equalizer", "equalizer", b())});
    }
}
