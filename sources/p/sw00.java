package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sw00 implements ww00 {
    public final String a;

    public sw00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw00) && this.a.equals(((sw00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
