package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bsf1 {
    public final String a;

    public bsf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsf1) && this.a.equals(((bsf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
