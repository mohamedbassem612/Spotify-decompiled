package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qzc1 extends szc1 {
    public final buo1 a;

    public qzc1(buo1 buo1Var) {
        this.a = buo1Var;
    }

    public final buo1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzc1) && u890.j(this.a, ((qzc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
