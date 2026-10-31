package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ydv0 {
    public final List a;

    public /* synthetic */ ydv0() {
        this(z6x.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydv0) && u890.j(this.a, ((ydv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ydv0(List list) {
        this.a = list;
    }
}
