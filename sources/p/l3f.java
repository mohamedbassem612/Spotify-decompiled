package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l3f implements q3f {
    public final List a;

    public l3f(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3f) && u890.j(this.a, ((l3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
