package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w7d0 implements y7d0 {
    public final String a;

    public w7d0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7d0) && u890.j(this.a, ((w7d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
