package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wi2 extends aj2 {
    public final int a;

    public wi2(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi2) && this.a == ((wi2) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
