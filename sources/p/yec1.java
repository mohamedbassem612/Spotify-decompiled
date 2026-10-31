package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yec1 implements dec1 {
    public final afc1 a;

    public yec1(afc1 afc1Var) {
        this.a = afc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yec1) && this.a == ((yec1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
