package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zg00 extends mh00 {
    public final String a;

    public zg00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg00) && u890.j(this.a, ((zg00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
