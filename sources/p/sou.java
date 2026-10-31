package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sou implements uou {
    public final String a;

    public sou(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sou) && u890.j(this.a, ((sou) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
