package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yp31 {
    public final List a;

    public yp31(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp31) && u890.j(this.a, ((yp31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
