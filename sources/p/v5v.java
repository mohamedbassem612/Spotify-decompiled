package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v5v {
    public final int a;
    public final float b;

    public v5v(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5v)) {
            return false;
        }
        v5v v5vVar = (v5v) obj;
        return this.a == v5vVar.a && Float.compare(this.b, v5vVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
