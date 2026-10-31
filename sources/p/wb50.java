package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wb50 {
    public final String a;

    public wb50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb50) && u890.j(this.a, ((wb50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
