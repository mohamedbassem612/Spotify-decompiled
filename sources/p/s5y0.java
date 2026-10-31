package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s5y0 implements u5y0 {
    public final List a;

    public s5y0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5y0) && this.a.equals(((s5y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
