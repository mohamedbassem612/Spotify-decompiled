package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zs1 implements bt1 {
    public final Set a;

    public zs1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs1) && u890.j(this.a, ((zs1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
