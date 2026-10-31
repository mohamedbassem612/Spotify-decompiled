package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tj91 extends bk91 {
    public final String a;

    public tj91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj91) && u890.j(this.a, ((tj91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
