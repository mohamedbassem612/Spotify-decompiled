package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ykh implements hlh {
    public final int a;
    public final boolean b;
    public final pkh c;

    public ykh(int i, pkh pkhVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = pkhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykh)) {
            return false;
        }
        ykh ykhVar = (ykh) obj;
        return this.a == ykhVar.a && this.b == ykhVar.b && this.c.equals(ykhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
