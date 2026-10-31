package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w56 {
    public final List a;

    public w56(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w56) && u890.j(this.a, ((w56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
