package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c300 implements a700 {
    public final String a;

    public c300(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c300) && u890.j(this.a, ((c300) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
