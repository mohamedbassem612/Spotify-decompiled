package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zqd {
    public final Set a;

    public zqd(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqd) && u890.j(this.a, ((zqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
