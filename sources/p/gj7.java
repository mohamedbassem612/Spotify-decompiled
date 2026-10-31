package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gj7 {
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof gj7) {
            return u890.j(this.a, ((gj7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return cy30.m("AsyncTypefaceResult(result=", this.a, ")");
    }
}
