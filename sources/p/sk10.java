package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sk10 {
    public final String a;

    public sk10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk10) && u890.j(this.a, ((sk10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
