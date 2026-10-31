package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f4 {
    public final String a;

    public f4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4) && u890.j(this.a, ((f4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
