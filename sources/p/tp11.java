package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tp11 implements up11 {
    public final String a;

    public tp11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp11) && u890.j(this.a, ((tp11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
