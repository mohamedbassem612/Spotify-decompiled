package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s681 implements t681 {
    public final List a;

    public s681(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s681) && u890.j(this.a, ((s681) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
