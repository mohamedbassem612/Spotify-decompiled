package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mng {
    public final String a;

    public mng(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mng) && u890.j(this.a, ((mng) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
