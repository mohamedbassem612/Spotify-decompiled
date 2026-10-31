package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class grv implements irv {
    public final int a;

    public grv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grv) && this.a == ((grv) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
