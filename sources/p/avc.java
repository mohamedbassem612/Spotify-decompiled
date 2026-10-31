package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class avc implements hvc {
    public final int a;
    public final Integer b;
    public final float c;
    public final float d;
    public final int e;

    public avc(int i, Integer num, float f, float f2, int i2) {
        this.a = i;
        this.b = num;
        this.c = f;
        this.d = f2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avc)) {
            return false;
        }
        avc avcVar = (avc) obj;
        return this.a == avcVar.a && u890.j(this.b, avcVar.b) && Float.compare(this.c, avcVar.c) == 0 && Float.compare(this.d, avcVar.d) == 0 && this.e == avcVar.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.e) + x0d.f(x0d.f((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
