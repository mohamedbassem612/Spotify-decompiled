package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ch51 {
    public final String a;

    public ch51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch51) && u890.j(this.a, ((ch51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
