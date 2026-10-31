package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qal implements tal {
    public final int a;

    public qal(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qal) && this.a == ((qal) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
