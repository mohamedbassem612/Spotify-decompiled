package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tkv0 implements blv0 {
    public final Set a;

    public tkv0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkv0) && this.a.equals(((tkv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
