package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sdn {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public sdn(float f, float f2, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdn)) {
            return false;
        }
        sdn sdnVar = (sdn) obj;
        return Float.compare(this.a, sdnVar.a) == 0 && Float.compare(this.b, sdnVar.b) == 0 && Float.compare(this.c, sdnVar.c) == 0 && Float.compare(this.d, sdnVar.d) == 0 && this.e == sdnVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
