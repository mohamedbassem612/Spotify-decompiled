package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e0w extends l0w {
    public final String a;

    public e0w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0w) && this.a.equals(((e0w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
