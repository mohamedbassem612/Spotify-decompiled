package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mvz implements z500 {
    public final int a;
    public final String b;

    public mvz(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvz)) {
            return false;
        }
        mvz mvzVar = (mvz) obj;
        return this.a == mvzVar.a && u890.j(this.b, mvzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
