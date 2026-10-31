package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jm80 {
    public final String a;

    public jm80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm80) && u890.j(this.a, ((jm80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
