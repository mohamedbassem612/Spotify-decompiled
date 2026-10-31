package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e671 implements h671 {
    public final int a;

    public e671(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e671) && this.a == ((e671) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
