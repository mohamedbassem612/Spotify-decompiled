package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ng3 {
    public final String a;

    public ng3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng3) && this.a.equals(((ng3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
