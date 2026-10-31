package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pln {
    public final sln a;

    public pln(sln slnVar) {
        this.a = slnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pln) && this.a.equals(((pln) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
