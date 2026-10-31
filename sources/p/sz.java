package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sz implements d10 {
    public final List a;

    public sz(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz) && u890.j(this.a, ((sz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
