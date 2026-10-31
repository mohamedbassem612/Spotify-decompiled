package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ec91 implements fc91 {
    public final List a;

    public ec91(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec91) && u890.j(this.a, ((ec91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
