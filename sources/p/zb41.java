package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zb41 {
    public final String a;

    public zb41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb41) && u890.j(this.a, ((zb41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
