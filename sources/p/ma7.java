package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ma7 implements za7 {
    public final List a;

    public ma7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma7) && u890.j(this.a, ((ma7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
