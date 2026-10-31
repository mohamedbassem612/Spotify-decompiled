package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qn30 {
    public final String a;

    public qn30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn30) && this.a.equals(((qn30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
