package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mg1 implements qg1 {
    public final String a;

    public mg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg1) && this.a.equals(((mg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
