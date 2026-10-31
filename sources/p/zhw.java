package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zhw implements giw {
    public final String a;

    public zhw(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhw) && this.a.equals(((zhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
