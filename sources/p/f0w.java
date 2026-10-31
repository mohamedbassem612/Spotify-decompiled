package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f0w extends l0w {
    public final String a;

    public f0w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0w) && this.a.equals(((f0w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
