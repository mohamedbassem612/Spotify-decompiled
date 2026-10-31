package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class phz implements whz {
    public final String a;

    public phz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phz) && u890.j(this.a, ((phz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
