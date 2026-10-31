package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j680 implements l680 {
    public final String a;

    public j680(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j680) && u890.j(this.a, ((j680) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
