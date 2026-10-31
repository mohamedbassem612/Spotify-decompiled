package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rmd {
    public final Map a;
    public final Set b;

    public rmd(Map map, Set set) {
        this.a = map;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmd)) {
            return false;
        }
        rmd rmdVar = (rmd) obj;
        return u890.j(this.a, rmdVar.a) && u890.j(this.b, rmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
