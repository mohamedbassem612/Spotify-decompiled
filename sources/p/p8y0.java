package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p8y0 extends r8y0 {
    public final List a;

    public p8y0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8y0) && this.a.equals(((p8y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
