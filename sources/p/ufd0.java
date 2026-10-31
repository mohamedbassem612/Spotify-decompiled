package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ufd0 {
    public final String a;

    public ufd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufd0) && this.a.equals(((ufd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
