package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w840 implements x840 {
    public final boolean a;

    public w840(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w840) && this.a == ((w840) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
