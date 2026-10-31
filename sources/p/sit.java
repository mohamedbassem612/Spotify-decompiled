package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sit implements dkt {
    public final String a;
    public final boolean b;

    public sit(String str, int i, boolean z) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 8) != 0 ? false : z;
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sit)) {
            return false;
        }
        sit sitVar = (sit) obj;
        return u890.j(this.a, sitVar.a) && this.b == sitVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 961, false);
    }
}
