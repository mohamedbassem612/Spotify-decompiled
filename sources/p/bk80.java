package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bk80 extends swf0 {
    public final String a;

    public bk80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk80) && u890.j(this.a, ((bk80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
