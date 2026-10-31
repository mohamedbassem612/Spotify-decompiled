package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hja0 implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    static {
        new hja0(joj0.g.a);
        new hja0(joj0.h.a);
    }

    public hja0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i < 0) {
            hhg1.n("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            hhg1.n("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        hhg1.n("Patch version should be not less than 0");
        throw null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(hja0 hja0Var) {
        int iQ = u890.q(this.a, hja0Var.a);
        if (iQ != 0) {
            return iQ;
        }
        int iQ2 = u890.q(this.b, hja0Var.b);
        return iQ2 != 0 ? iQ2 : u890.q(this.c, hja0Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hja0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hja0 hja0Var = (hja0) obj;
        return this.a == hja0Var.a && this.b == hja0Var.b && this.c == hja0Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    public hja0(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
    }
}
