package p;

import com.spotify.player.model.ContextTrack;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zlm {
    public final ContextTrack a;
    public final su00 b;
    public final boolean c;
    public final Map d;
    public final ktl e;
    public final boolean f;
    public final boolean g;

    public zlm(ContextTrack contextTrack, su00 su00Var, boolean z, Map map, ktl ktlVar, boolean z2, boolean z3) {
        this.a = contextTrack;
        this.b = su00Var;
        this.c = z;
        this.d = map;
        this.e = ktlVar;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlm)) {
            return false;
        }
        zlm zlmVar = (zlm) obj;
        return this.a.equals(zlmVar.a) && u890.j(this.b, zlmVar.b) && this.c == zlmVar.c && u890.j(this.d, zlmVar.d) && this.e == zlmVar.e && this.f == zlmVar.f && this.g == zlmVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        su00 su00Var = this.b;
        return Boolean.hashCode(this.g) + xcg1.g((this.e.hashCode() + cy30.e(xcg1.g((iHashCode + (su00Var == null ? 0 : su00Var.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
    }
}
