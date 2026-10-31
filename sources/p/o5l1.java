package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o5l1 {
    public final String a;

    public o5l1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5l1) && u890.j(this.a, ((o5l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
