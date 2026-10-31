package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qgc1 implements we5 {
    public final String a;

    public /* synthetic */ qgc1(String str) {
        this.a = str;
    }

    public static final /* synthetic */ qgc1 a(String str) {
        return new qgc1(str);
    }

    public final /* synthetic */ String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qgc1) {
            return this.a.equals(((qgc1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("StringAnnotation(value=", this.a, ")");
    }
}
