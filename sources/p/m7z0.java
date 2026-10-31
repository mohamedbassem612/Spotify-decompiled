package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m7z0 extends z8z0 {
    public final List a;

    public m7z0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7z0) && u890.j(this.a, ((m7z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
