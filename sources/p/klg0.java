package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class klg0 extends grn1 {
    public final int e;

    public klg0(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klg0) && this.e == ((klg0) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final int q() {
        return this.e;
    }
}
