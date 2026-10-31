package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zec1 implements eec1 {
    public final afc1 a;

    public zec1(afc1 afc1Var) {
        this.a = afc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zec1) && this.a == ((zec1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
