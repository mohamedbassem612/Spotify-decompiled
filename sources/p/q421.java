package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q421 implements s421 {
    public final Set a;

    public q421(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q421) && this.a.equals(((q421) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
