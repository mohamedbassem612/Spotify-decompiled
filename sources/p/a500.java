package p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a500 implements b500 {
    public final ContextTrack a;
    public final String b;
    public final List c;
    public final List d;
    public final qtf1 e;

    public a500(ContextTrack contextTrack, String str, List list, List list2, qtf1 qtf1Var) {
        this.a = contextTrack;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = qtf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a500)) {
            return false;
        }
        a500 a500Var = (a500) obj;
        return u890.j(this.a, a500Var.a) && u890.j(this.b, a500Var.b) && u890.j(this.c, a500Var.c) && u890.j(this.d, a500Var.d) && u890.j(this.e, a500Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iB = f4i1.b(f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        qtf1 qtf1Var = this.e;
        return iB + (qtf1Var != null ? qtf1Var.hashCode() : 0);
    }

    public /* synthetic */ a500(ContextTrack contextTrack, List list) {
        this(contextTrack, null, list, z6x.a, null);
    }
}
