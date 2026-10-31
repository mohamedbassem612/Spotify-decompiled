package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f3j1 implements g3j1 {
    public final String a;

    public f3j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3j1) && this.a.equals(((f3j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
