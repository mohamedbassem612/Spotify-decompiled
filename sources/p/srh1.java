package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class srh1 implements urh1 {
    public final String a;

    public srh1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srh1) && u890.j(this.a, ((srh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
