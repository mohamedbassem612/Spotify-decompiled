package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zd10 {
    public final String a;

    public zd10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd10) && u890.j(this.a, ((zd10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
