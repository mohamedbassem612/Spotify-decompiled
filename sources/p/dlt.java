package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dlt {
    public final String a;

    public dlt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlt) && u890.j(this.a, ((dlt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
