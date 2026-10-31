package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pgb1 extends wgb1 {
    public final boolean a;

    public pgb1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgb1) && this.a == ((pgb1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
