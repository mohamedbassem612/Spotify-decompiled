package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vz4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new uz4(this, (byte) 0));

    public vz4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        vz4 vz4Var = (vz4) this.d.getValue();
        return vz4Var != null ? vz4Var.a() : this.a;
    }

    public final boolean b() {
        vz4 vz4Var = (vz4) this.d.getValue();
        return vz4Var != null ? vz4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_external_link", "android-read-along-list", a()), new fpb("enable_transcript_translation", "android-read-along-list", b())});
    }
}
