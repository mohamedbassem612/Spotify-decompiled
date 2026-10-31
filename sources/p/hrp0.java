package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hrp0 {
    public final String a;

    public hrp0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrp0) && this.a.equals(((hrp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
