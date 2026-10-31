package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cdk1 {
    public final Object a;

    public cdk1(Object obj) {
        this.a = obj;
        if ((obj instanceof maa) || (obj instanceof laa)) {
            return;
        }
        hhg1.n("Element must be either a Compose Element or a View Element");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdk1) && u890.j(this.a, ((cdk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
