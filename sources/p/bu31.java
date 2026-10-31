package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bu31 implements du31 {
    public final ftv a;

    public bu31(ftv ftvVar) {
        this.a = ftvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu31) && u890.j(this.a, ((bu31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
