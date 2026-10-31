package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bt4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new rq4(this, (byte) 19));

    public bt4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        bt4 bt4Var = (bt4) this.d.getValue();
        return bt4Var != null ? bt4Var.a() : this.a;
    }

    public final boolean b() {
        bt4 bt4Var = (bt4) this.d.getValue();
        return bt4Var != null ? bt4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("autoplay_and_looping_enabled", "android-mediatrimmer-mediatrimmerpage", a()), new fpb("is_range_recommendation_enabled", "android-mediatrimmer-mediatrimmerpage", b())});
    }
}
