package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class isa1 implements dta1 {
    public final int a;

    public isa1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isa1) && this.a == ((isa1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
