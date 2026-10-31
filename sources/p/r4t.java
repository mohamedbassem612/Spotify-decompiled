package p;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r4t {
    public final q4t a;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicBoolean c = new AtomicBoolean(false);

    public r4t(q4t q4tVar) {
        this.a = q4tVar;
    }

    public final rm5 c() {
        if (this.c.get()) {
            eg.m("Cannot acquire handle after delayed execution has fired");
            return null;
        }
        rm5 rm5Var = new rm5();
        rm5Var.b = this;
        rm5Var.a = new AtomicBoolean(false);
        d().incrementAndGet();
        return rm5Var;
    }

    public final AtomicInteger d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r4t.class.equals(obj.getClass())) {
            return false;
        }
        r4t r4tVar = (r4t) obj;
        return this.a.equals(r4tVar.a) && this.b.get() == r4tVar.b.get() && this.c.get() == r4tVar.c.get();
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
