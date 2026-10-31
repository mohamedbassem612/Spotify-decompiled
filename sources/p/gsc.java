package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gsc implements wmc {
    public final String a;

    public gsc(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsc) && this.a.equals(((gsc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
