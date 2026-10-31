package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class er4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new rq4(this, (byte) 9));

    public er4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        er4 er4Var = (er4) this.d.getValue();
        return er4Var != null ? er4Var.a() : this.a;
    }

    public final boolean b() {
        er4 er4Var = (er4) this.d.getValue();
        return er4Var != null ? er4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_composer_share", "android-lyrics-share-controller", a()), new fpb("enable_lyrics_multilanguage", "android-lyrics-share-controller", b()));
    }
}
