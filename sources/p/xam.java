package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xam implements zam {
    public final String a;

    public xam(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xam) && this.a.equals(((xam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
