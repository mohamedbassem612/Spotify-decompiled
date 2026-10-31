package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f0o implements g0o {
    public final bxn a;
    public final List b;

    public f0o(bxn bxnVar) {
        this.a = bxnVar;
        this.b = Collections.singletonList(bxnVar);
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0o) && this.a.equals(((f0o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
