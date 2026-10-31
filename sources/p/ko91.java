package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ko91 {
    public final List a;

    public ko91(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko91) && this.a.equals(((ko91) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + kaa0.f(0, kaa0.f(0, this.a.hashCode() * 31, 31), 31);
    }
}
