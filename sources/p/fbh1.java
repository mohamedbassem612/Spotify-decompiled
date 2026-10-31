package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fbh1 implements hbh1 {
    public final boolean a;

    public fbh1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbh1) && this.a == ((fbh1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
