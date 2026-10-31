package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e3c0 {
    public final List a;

    public e3c0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3c0) && u890.j(this.a, ((e3c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public /* synthetic */ e3c0() {
        this(z6x.a);
    }
}
