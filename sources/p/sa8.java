package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sa8 {
    public final String a;

    public sa8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa8) && u890.j(this.a, ((sa8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
