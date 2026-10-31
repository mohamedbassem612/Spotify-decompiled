package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m51 extends x3p1 {
    public final int c;

    public m51(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m51) && this.c == ((m51) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }

    public final int x() {
        return this.c;
    }
}
