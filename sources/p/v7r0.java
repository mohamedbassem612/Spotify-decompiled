package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v7r0 {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ v7r0(int i, boolean z) {
        this((i & 1) != 0 ? true : z, false);
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7r0)) {
            return false;
        }
        v7r0 v7r0Var = (v7r0) obj;
        return this.a == v7r0Var.a && this.b == v7r0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public v7r0() {
        this(3, false);
    }

    public v7r0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
