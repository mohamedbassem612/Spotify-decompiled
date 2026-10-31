package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ijo {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;

    public ijo(Set set, Set set2, Set set3, Set set4) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
    }

    public static ijo a(ijo ijoVar, Set set, Set set2, Set set3, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            set = ijoVar.a;
        }
        if ((i & 2) != 0) {
            set2 = ijoVar.b;
        }
        if ((i & 4) != 0) {
            set3 = ijoVar.c;
        }
        Set set4 = linkedHashSet;
        if ((i & 8) != 0) {
            set4 = ijoVar.d;
        }
        return new ijo(set, set2, set3, set4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijo)) {
            return false;
        }
        ijo ijoVar = (ijo) obj;
        return u890.j(this.a, ijoVar.a) && u890.j(this.b, ijoVar.b) && u890.j(this.c, ijoVar.c) && u890.j(this.d, ijoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gvg.c(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ijo(int i, Set set, Set set2) {
        w7x w7xVar = w7x.a;
        this(set, set2, w7xVar, w7xVar);
    }
}
