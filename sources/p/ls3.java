package p;

import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls3 {
    public final EntryPoint a;
    public final wub1 b;
    public final List c;

    public ls3(EntryPoint entryPoint, wub1 wub1Var, List list) {
        this.a = entryPoint;
        this.b = wub1Var;
        this.c = list;
    }

    public final wub1 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls3)) {
            return false;
        }
        ls3 ls3Var = (ls3) obj;
        return this.a == ls3Var.a && u890.j(this.b, ls3Var.b) && u890.j(this.c, ls3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
