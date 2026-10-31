package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qss {
    public final int a;
    public final int b;

    public qss(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qss)) {
            return false;
        }
        qss qssVar = (qss) obj;
        return this.a == qssVar.a && this.b == qssVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
