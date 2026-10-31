package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ila1 extends mla1 {
    public static final hla1 Companion = new hla1();
    public final String b;

    public /* synthetic */ ila1(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            o6p1.t(i, 1, gla1.a.getDescriptor());
            throw null;
        }
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ila1) && u890.j(this.b, ((ila1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
