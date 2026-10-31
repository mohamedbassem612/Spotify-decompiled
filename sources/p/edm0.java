package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class edm0 implements fdm0 {
    public static final ddm0 Companion = new ddm0();
    public final String a;

    public /* synthetic */ edm0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, cdm0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edm0) && u890.j(this.a, ((edm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public edm0(String str) {
        this.a = str;
    }
}
