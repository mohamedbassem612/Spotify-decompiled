package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i2f1 implements k2f1 {
    public final String a;

    public i2f1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2f1) && u890.j(this.a, ((i2f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
