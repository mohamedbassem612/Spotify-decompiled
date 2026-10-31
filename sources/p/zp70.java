package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class zp70 {
    public static final qp70 Companion = new qp70();
    public final String a;

    public /* synthetic */ zp70(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, hp70.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp70) && u890.j(this.a, ((zp70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
