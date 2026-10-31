package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dk51 {
    public final String a;

    public dk51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk51) && u890.j(this.a, ((dk51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
