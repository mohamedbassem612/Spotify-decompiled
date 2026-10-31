package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ch00 extends mh00 {
    public final String a;

    public ch00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch00) && u890.j(this.a, ((ch00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
