package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uya1 {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ uya1(int i, boolean z) {
        this((i & 1) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uya1)) {
            return false;
        }
        uya1 uya1Var = (uya1) obj;
        return this.a == uya1Var.a && this.b == uya1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public uya1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
