package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j101 implements k101 {
    public final String a;

    public j101(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j101) && u890.j(this.a, ((j101) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
