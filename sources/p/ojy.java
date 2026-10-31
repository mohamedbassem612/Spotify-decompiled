package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ojy {
    public final String a;

    public ojy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojy) && u890.j(this.a, ((ojy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
