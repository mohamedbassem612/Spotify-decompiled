package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qyu {
    public final int a;
    public final int b;

    public /* synthetic */ qyu() {
        this(Integer.MAX_VALUE, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyu)) {
            return false;
        }
        qyu qyuVar = (qyu) obj;
        return this.a == qyuVar.a && this.b == qyuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public qyu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
