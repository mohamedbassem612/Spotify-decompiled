package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c951 implements g951 {
    public final List a;

    public c951(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c951) && u890.j(this.a, ((c951) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
