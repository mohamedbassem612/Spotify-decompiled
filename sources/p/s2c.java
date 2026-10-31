package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2c {
    public final int a;
    public final int b;

    public s2c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2c)) {
            return false;
        }
        s2c s2cVar = (s2c) obj;
        return this.a == s2cVar.a && this.b == s2cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
