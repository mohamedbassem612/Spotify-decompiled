package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j3o {
    public final String a;

    public j3o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3o) && this.a.equals(((j3o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
