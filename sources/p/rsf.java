package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rsf implements ssf {
    public final List a;

    public rsf(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsf) && this.a.equals(((rsf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
