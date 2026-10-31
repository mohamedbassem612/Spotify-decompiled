package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class le51 {
    public final String a;

    public le51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le51) && u890.j(this.a, ((le51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
