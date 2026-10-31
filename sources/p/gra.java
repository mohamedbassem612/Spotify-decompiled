package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gra implements tl3 {
    public final float a;
    public final float b;

    public gra(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // p.tl3
    public final long a(long j, long j2, flb0 flb0Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        flb0 flb0Var2 = flb0.a;
        float f3 = this.a;
        if (flb0Var != flb0Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gra)) {
            return false;
        }
        gra graVar = (gra) obj;
        return Float.compare(this.a, graVar.a) == 0 && Float.compare(this.b, graVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
