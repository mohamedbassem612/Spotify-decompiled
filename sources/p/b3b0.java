package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b3b0 extends k3b0 {
    public final String a;

    public b3b0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3b0) && u890.j(this.a, ((b3b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("KClassValue("), this.a, ')');
    }
}
