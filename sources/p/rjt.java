package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rjt implements dkt {
    public final String a;

    public rjt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjt) && this.a.equals(((rjt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
