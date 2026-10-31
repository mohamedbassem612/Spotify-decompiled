package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ocm0 implements qcm0 {
    public static final ncm0 Companion = new ncm0();
    public final String a;

    public /* synthetic */ ocm0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, mcm0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocm0) && u890.j(this.a, ((ocm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
