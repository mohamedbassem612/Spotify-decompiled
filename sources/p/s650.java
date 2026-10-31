package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s650 {
    public final List a;

    public s650(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s650) && this.a.equals(((s650) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
