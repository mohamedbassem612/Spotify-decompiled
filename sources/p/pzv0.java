package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pzv0 implements rzv0 {
    public final String a;

    public pzv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzv0) && u890.j(this.a, ((pzv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
