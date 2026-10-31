package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hra0 implements sra0 {
    public final List a;

    public hra0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hra0) && this.a.equals(((hra0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
