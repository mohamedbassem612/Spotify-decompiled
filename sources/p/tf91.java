package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tf91 {
    public final String a;

    public tf91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tf91) && u890.j(this.a, ((tf91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
