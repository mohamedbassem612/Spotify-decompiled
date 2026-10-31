package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lio0 implements nio0 {
    public final List a;

    public lio0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lio0) && this.a.equals(((lio0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
