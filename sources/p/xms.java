package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xms {
    public final List a;

    public xms(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xms) && u890.j(this.a, ((xms) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
