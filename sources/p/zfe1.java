package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zfe1 implements bge1 {
    public final int a;

    public zfe1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfe1) && this.a == ((zfe1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
