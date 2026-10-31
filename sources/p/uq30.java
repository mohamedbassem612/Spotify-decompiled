package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uq30 {
    public final String a;

    public uq30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uq30) && u890.j(this.a, ((uq30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
