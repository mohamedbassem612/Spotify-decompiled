package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w7v0 extends b8v0 {
    public final String a;

    public w7v0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7v0) && u890.j(this.a, ((w7v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
