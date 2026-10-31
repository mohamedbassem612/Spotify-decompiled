package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uq2 {
    public final String a;

    public uq2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uq2) && u890.j(this.a, ((uq2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
