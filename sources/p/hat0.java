package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hat0 implements ebt0 {
    public final int a;

    public hat0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hat0) && this.a == ((hat0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
