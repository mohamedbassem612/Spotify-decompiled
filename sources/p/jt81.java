package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jt81 implements kt81 {
    public final List a;

    public jt81(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt81) && this.a.equals(((jt81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
