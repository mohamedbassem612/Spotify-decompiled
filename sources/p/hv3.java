package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hv3 implements iv3 {
    public final String a;

    public hv3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv3) && u890.j(this.a, ((hv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
