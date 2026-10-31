package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pgb {
    public final lkb a;

    public pgb(lkb lkbVar) {
        this.a = lkbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgb) && u890.j(this.a, ((pgb) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a.a);
    }
}
