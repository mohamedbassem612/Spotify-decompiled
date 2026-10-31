package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fp1 implements cq1 {
    public final Set a;

    public fp1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp1) && u890.j(this.a, ((fp1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
