package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9m implements cam {
    public final String a;
    public final int b;

    public t9m(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9m)) {
            return false;
        }
        t9m t9mVar = (t9m) obj;
        return this.a.equals(t9mVar.a) && this.b == t9mVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
