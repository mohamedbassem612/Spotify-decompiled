package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k401 implements l401 {
    public final String a;

    public k401(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k401) && this.a.equals(((k401) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
