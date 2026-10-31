package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class at1 implements bt1 {
    public final Set a;

    public at1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at1) && this.a.equals(((at1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
