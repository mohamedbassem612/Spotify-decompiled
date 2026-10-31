package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lh60 implements vh60 {
    public final String a;

    public lh60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh60) && this.a.equals(((lh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
