package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lk91 extends yk91 {
    public final boolean a;

    public lk91(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lk91) && this.a == ((lk91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
