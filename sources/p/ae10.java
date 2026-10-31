package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ae10 implements fe10 {
    public final List a;

    public ae10(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae10) && u890.j(this.a, ((ae10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
