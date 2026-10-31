package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r421 implements s421 {
    public final Set a;

    public r421(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r421) && this.a.equals(((r421) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
