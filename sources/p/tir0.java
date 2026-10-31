package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tir0 implements vir0 {
    public final int a;

    public tir0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tir0) && this.a == ((tir0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
