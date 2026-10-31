package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bul {
    public final String a;

    public bul(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bul) && this.a.equals(((bul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
