package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k321 extends l6p1 {
    public final String d;

    public k321(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k321) && u890.j(this.d, ((k321) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
