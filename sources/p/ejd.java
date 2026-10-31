package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ejd {
    public final float a;
    public final float b;

    public ejd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejd)) {
            return false;
        }
        ejd ejdVar = (ejd) obj;
        return Float.compare(this.a, ejdVar.a) == 0 && Float.compare(this.b, ejdVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
