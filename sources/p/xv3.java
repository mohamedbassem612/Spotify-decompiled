package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xv3 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof xv3) {
            return u890.j(this.a, ((xv3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("AllocationRequestSuccessMessage(text=", this.a, ")");
    }
}
