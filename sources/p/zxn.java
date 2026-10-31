package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zxn implements ayn {
    public final String a;

    public zxn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxn) && u890.j(this.a, ((zxn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
