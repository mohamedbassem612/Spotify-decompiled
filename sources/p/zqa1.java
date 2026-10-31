package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zqa1 implements era1 {
    public final String a;

    public zqa1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqa1) && u890.j(this.a, ((zqa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
