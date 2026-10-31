package p;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wlv {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public wlv(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(qon1.p(edgeEffect) == 0.0f);
    }

    public final EdgeEffect a(qqq0 qqq0Var) {
        EdgeEffect edgeEffectN = qon1.n(this.a);
        edgeEffectN.setColor(this.b);
        if (!yr80.b(this.c, 0L)) {
            long j = this.c;
            if (qqq0Var == qqq0.a) {
                edgeEffectN.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectN;
            }
            edgeEffectN.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectN;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(qqq0.a);
        this.e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(qqq0.b);
        this.f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(qqq0.b);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(qqq0.a);
        this.d = edgeEffectA;
        return edgeEffectA;
    }
}
