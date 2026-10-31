package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ufe1 {
    public final List a;

    public ufe1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufe1) && u890.j(this.a, ((ufe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
