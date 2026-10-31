package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fsb1 implements osi1 {
    public final Object a;

    public fsb1(Object obj) {
        this.a = obj;
    }

    @Override // p.osi1
    public final Object a(xos0 xos0Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fsb1) && u890.j(this.a, ((fsb1) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return cy30.m("StaticValueHolder(value=", this.a, ")");
    }
}
