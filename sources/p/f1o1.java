package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f1o1 implements gzq {
    public final String a;
    public final String b;

    public f1o1(l1o1 l1o1Var) {
        this.a = l1o1Var.getId();
        this.b = l1o1Var.a();
    }

    public final String a() {
        return this.b;
    }

    public final String getId() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        return l1d.n(this.b, "]", sb);
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
