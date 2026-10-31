package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bqf0 implements gqf0 {
    public final String a;

    public bqf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqf0) && this.a.equals(((bqf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
