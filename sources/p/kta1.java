package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kta1 implements mta1 {
    public final Set a;

    public kta1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kta1) && this.a.equals(((kta1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
