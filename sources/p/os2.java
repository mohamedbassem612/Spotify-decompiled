package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class os2 {
    public final String a;

    public os2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os2) && this.a.equals(((os2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
