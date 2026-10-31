package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jvd1 {
    public final List a;

    public jvd1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvd1) && this.a.equals(((jvd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
