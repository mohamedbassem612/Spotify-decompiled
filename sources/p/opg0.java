package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class opg0 implements qpg0 {
    public final int a;

    public opg0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opg0) && this.a == ((opg0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
