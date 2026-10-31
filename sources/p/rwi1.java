package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rwi1 extends vwi1 {
    public final String a;

    public rwi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwi1) && this.a.equals(((rwi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
