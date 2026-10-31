package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zgi1 implements chi1 {
    public final String a;

    public zgi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgi1) && u890.j(this.a, ((zgi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
