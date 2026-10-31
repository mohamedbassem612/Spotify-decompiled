package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mf40 {
    public final String a;

    public mf40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf40) && u890.j(this.a, ((mf40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
