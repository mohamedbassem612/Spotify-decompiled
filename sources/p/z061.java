package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z061 implements d161 {
    public final int a;
    public final uvg1 b;
    public final float c;

    public z061(int i, uvg1 uvg1Var, float f) {
        this.a = i;
        this.b = uvg1Var;
        this.c = f;
    }

    public static z061 a(z061 z061Var, uvg1 uvg1Var, float f, int i) {
        int i2 = z061Var.a;
        if ((i & 2) != 0) {
            uvg1Var = z061Var.b;
        }
        if ((i & 4) != 0) {
            f = z061Var.c;
        }
        return new z061(i2, uvg1Var, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z061)) {
            return false;
        }
        z061 z061Var = (z061) obj;
        return this.a == z061Var.a && u890.j(this.b, z061Var.b) && Float.compare(this.c, z061Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
