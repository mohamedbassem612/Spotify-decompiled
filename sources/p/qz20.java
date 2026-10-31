package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qz20 extends tz20 {
    public final int a;

    public qz20(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz20) && this.a == ((qz20) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
