package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qpu {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final int f;
    public final int g;
    public final int h;

    public qpu(Integer num, String str, Integer num2, Integer num3, Integer num4, int i, int i2, int i3) {
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpu)) {
            return false;
        }
        qpu qpuVar = (qpu) obj;
        return u890.j(this.a, qpuVar.a) && u890.j(this.b, qpuVar.b) && u890.j(this.c, qpuVar.c) && u890.j(this.d, qpuVar.d) && u890.j(this.e, qpuVar.e) && this.f == qpuVar.f && this.g == qpuVar.g && this.h == qpuVar.h;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return Integer.hashCode(this.h) + kaa0.f(this.g, kaa0.f(this.f, (iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31, 31), 31);
    }
}
