package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class blk extends vlk {
    public final String a;

    public blk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blk) && u890.j(this.a, ((blk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
