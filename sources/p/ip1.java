package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ip1 implements cq1 {
    public final Set a;

    public ip1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip1) && this.a.equals(((ip1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
