package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eao0 extends i3o1 {
    public final int c;

    public eao0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eao0) && this.c == ((eao0) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }
}
