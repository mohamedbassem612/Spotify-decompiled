package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class nao0 {
    public static final mao0 Companion = new mao0();
    public final String a;

    public /* synthetic */ nao0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, lao0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nao0) && u890.j(this.a, ((nao0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public nao0(String str) {
        this.a = str;
    }
}
