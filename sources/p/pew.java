package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pew {
    public final String a;

    public pew(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pew) && u890.j(this.a, ((pew) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
