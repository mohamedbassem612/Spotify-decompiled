package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w53 {
    public final List a;

    public w53(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w53) && u890.j(this.a, ((w53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
