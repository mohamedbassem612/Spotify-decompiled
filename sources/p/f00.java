package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f00 {
    public final List a;

    public f00(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f00) && this.a.equals(((f00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
