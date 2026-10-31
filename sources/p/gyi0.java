package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gyi0 implements lyi0 {
    public final String a;

    public gyi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyi0) && u890.j(this.a, ((gyi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
