package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zk2 implements fl2 {
    public final String a;

    public zk2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk2) && u890.j(this.a, ((zk2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
