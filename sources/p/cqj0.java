package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cqj0 implements fqj0 {
    public final List a;

    public cqj0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqj0) && this.a.equals(((cqj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
