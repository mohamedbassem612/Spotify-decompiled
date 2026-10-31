package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rki1 implements eli1 {
    public final String a;

    public rki1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rki1) && this.a.equals(((rki1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
