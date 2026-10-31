package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e9d1 {
    public final List a;

    public e9d1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9d1) && this.a.equals(((e9d1) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.a.hashCode() * 31);
    }
}
