package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ztn implements aun {
    public final String a;

    public ztn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztn) && this.a.equals(((ztn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
