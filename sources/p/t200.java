package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t200 implements y600 {
    public final String a;

    public t200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t200) && u890.j(this.a, ((t200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
