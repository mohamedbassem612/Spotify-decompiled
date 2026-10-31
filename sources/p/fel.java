package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fel implements iel {
    public final String a;

    public fel(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fel) && u890.j(this.a, ((fel) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
