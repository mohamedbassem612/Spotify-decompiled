package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nlq0 implements qlq0 {
    public final Set a;

    public nlq0(Set set) {
        this.a = set;
    }

    public final Set a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlq0) && this.a.equals(((nlq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
