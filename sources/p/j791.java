package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j791 implements k791 {
    public final List a;

    public j791(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j791) && u890.j(this.a, ((j791) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
