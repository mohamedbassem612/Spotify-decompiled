package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wrg1 implements xrg1 {
    public final int a;

    public wrg1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrg1) && this.a == ((wrg1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
