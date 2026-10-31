package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qew {
    public final String a;

    public qew(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qew) && u890.j(this.a, ((qew) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
