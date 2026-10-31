package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tlt {
    public final String a;

    public tlt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlt) && u890.j(this.a, ((tlt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
