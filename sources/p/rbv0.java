package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rbv0 implements sbv0 {
    public final List a;

    public rbv0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbv0) && this.a.equals(((rbv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
