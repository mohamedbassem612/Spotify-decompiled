package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f130 {
    public final List a;

    public f130(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f130) && u890.j(this.a, ((f130) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
