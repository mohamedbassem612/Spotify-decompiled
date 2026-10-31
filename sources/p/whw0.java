package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class whw0 extends thw0 {
    public final int a;

    public whw0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whw0) && this.a == ((whw0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
