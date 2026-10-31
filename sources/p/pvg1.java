package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pvg1 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof pvg1) {
            return u890.j(this.a, ((pvg1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("TriggerType(name=", this.a, ")");
    }
}
