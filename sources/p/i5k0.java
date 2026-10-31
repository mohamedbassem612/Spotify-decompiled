package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i5k0 implements m5k0 {
    public final String a;

    public i5k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5k0) && u890.j(this.a, ((i5k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
