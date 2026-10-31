package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ih10 extends c4p1 {
    public final int c;

    public ih10(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih10) && this.c == ((ih10) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }
}
