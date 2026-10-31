package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oid0 implements aik1 {
    public final String a;

    public oid0(String str) {
        this.a = str;
    }

    @Override // p.aik1
    public final int a() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oid0) && u890.j(this.a, ((oid0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
