package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w00 implements i10 {
    public final String a;

    public w00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w00) && u890.j(this.a, ((w00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
