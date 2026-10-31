package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n7u {
    public final String a;
    public final int b = 2;

    public n7u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7u)) {
            return false;
        }
        n7u n7uVar = (n7u) obj;
        return this.a.equals(n7uVar.a) && this.b == n7uVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(2131954987, cy30.d(kaa0.f(2131954989, Integer.hashCode(2131954993) * 31, 31), 31, this.a), 31), 31, false), 31, false), 31, false), 31, true);
    }
}
