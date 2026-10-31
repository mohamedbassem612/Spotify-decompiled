package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e0o implements g0o {
    public final List a;
    public final List b;

    public e0o(List list) {
        this.a = list;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0o) && u890.j(this.a, ((e0o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
