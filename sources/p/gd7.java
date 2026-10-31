package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gd7 extends ld7 {
    public final List a;

    public gd7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd7) && this.a.equals(((gd7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
