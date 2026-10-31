package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ry implements m10 {
    public final int a;
    public final int b;
    public final q5v c;

    public ry(int i, int i2, q5v q5vVar) {
        this.a = i;
        this.b = i2;
        this.c = q5vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry)) {
            return false;
        }
        ry ryVar = (ry) obj;
        return this.a == ryVar.a && this.b == ryVar.b && this.c.equals(ryVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
