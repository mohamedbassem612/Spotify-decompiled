package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b33 implements d33 {
    public final List a;

    public b33(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b33) && u890.j(this.a, ((b33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
