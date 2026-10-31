package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bjz implements djz {
    public final String a;

    public bjz(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjz) && u890.j(this.a, ((bjz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
