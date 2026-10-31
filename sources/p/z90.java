package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z90 extends ga0 {
    public final boolean d;

    public z90(boolean z) {
        super(2131951801, 2, cmx.c);
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z90) && this.d == ((z90) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }
}
