package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nsj1 {
    public final String a;
    public final Map b;

    public nsj1(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsj1)) {
            return false;
        }
        nsj1 nsj1Var = (nsj1) obj;
        return u890.j(this.a, nsj1Var.a) && u890.j(this.b, nsj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
