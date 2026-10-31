package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m511 {
    public static final m511 e;
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    static {
        float f = 0.0f;
        e = new m511(15, f, f);
    }

    public /* synthetic */ m511(int i, float f, float f2) {
        this(0.0f, 0.0f, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2);
    }

    public static m511 a(m511 m511Var, float f, float f2, int i) {
        float f3 = m511Var.a;
        if ((i & 2) != 0) {
            f = m511Var.b;
        }
        float f4 = m511Var.c;
        if ((i & 8) != 0) {
            f2 = m511Var.d;
        }
        return new m511(f3, f, f4, f2);
    }

    public final int b(m511 m511Var) {
        float f = this.c;
        float f2 = this.a;
        float f3 = this.d;
        float f4 = this.b;
        float f5 = 0.0f;
        if ((f3 - f4) * (f - f2) == 0.0f) {
            return 0;
        }
        float fMax = Math.max(f2, m511Var.a);
        float fMax2 = Math.max(f4, m511Var.b);
        float fMin = Math.min(f, m511Var.c);
        float fMin2 = Math.min(f3, m511Var.d);
        if (fMax < fMin && fMax2 < fMin2) {
            f5 = (fMin2 - fMax2) * (fMin - fMax);
        }
        return (int) ((f5 / ((f3 - f4) * (f - f2))) * 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m511)) {
            return false;
        }
        m511 m511Var = (m511) obj;
        return Float.compare(this.a, m511Var.a) == 0 && Float.compare(this.b, m511Var.b) == 0 && Float.compare(this.c, m511Var.c) == 0 && Float.compare(this.d, m511Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public m511(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
