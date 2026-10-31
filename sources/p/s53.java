package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s53 {
    public final List a;

    public s53(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s53) && u890.j(this.a, ((s53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
