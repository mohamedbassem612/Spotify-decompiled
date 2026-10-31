package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bzz0 implements jzz0 {
    public final List a;

    public bzz0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzz0) && u890.j(this.a, ((bzz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
