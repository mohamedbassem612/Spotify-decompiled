package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w1d0 implements x1d0 {
    public final String a;

    public w1d0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1d0) && u890.j(this.a, ((w1d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
