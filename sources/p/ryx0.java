package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ryx0 implements uyx0 {
    public final String a;

    public ryx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryx0) && this.a.equals(((ryx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
