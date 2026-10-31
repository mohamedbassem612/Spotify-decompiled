package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lme0 extends nme0 {
    public final String a;

    public lme0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lme0) && this.a.equals(((lme0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
