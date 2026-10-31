package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yw51 {
    public final int a;
    public final int b;
    public final long c;

    public yw51(int i, long j, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw51)) {
            return false;
        }
        yw51 yw51Var = (yw51) obj;
        return this.a == yw51Var.a && this.b == yw51Var.b && this.c == yw51Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + kaa0.f(this.b, l1d.C(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(fd21.p(this.a));
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return pze0.h(this.c, ")", sb);
    }
}
