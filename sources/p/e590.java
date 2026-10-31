package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e590 extends f590 {
    public final zby a;

    public e590(zby zbyVar) {
        this.a = zbyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e590) && this.a.equals(((e590) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
