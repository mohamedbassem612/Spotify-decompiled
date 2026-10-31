package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t3j1 implements u3j1 {
    public final String a;

    public t3j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3j1) && this.a.equals(((t3j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
