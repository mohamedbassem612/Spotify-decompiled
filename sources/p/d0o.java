package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d0o implements g0o {
    public final bxn a;
    public final bxn b;
    public final List c;

    public d0o(bxn bxnVar, bxn bxnVar2) {
        this.a = bxnVar;
        this.b = bxnVar2;
        this.c = Collections.singletonList(bxnVar2);
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0o)) {
            return false;
        }
        d0o d0oVar = (d0o) obj;
        return u890.j(this.a, d0oVar.a) && u890.j(this.b, d0oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
