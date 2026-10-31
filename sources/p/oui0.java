package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oui0 {
    public final String a;

    public oui0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oui0) && u890.j(this.a, ((oui0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
