package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gh50 implements ih50 {
    public final List a;

    public gh50(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh50) && u890.j(this.a, ((gh50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
