package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eoh0 extends goh0 {
    public final int a;

    public eoh0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eoh0) && this.a == ((eoh0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
