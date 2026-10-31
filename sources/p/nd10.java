package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nd10 implements whm0 {
    public final List a;

    public /* synthetic */ nd10() {
        this(z6x.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd10) && u890.j(this.a, ((nd10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public nd10(List list) {
        this.a = list;
    }
}
