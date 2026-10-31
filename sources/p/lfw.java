package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lfw extends iiw {
    public final String a;

    public lfw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfw) && this.a.equals(((lfw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
