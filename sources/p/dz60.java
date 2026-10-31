package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dz60 implements oz60 {
    public final String a;

    public dz60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz60) && u890.j(this.a, ((dz60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
