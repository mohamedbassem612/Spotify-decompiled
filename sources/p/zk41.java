package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zk41 {
    public final String a;

    public zk41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk41) && u890.j(this.a, ((zk41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
