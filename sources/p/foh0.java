package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class foh0 extends goh0 {
    public final int a;

    public foh0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof foh0) && this.a == ((foh0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
