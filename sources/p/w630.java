package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w630 {
    public final String a;

    public w630(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w630) && u890.j(this.a, ((w630) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
