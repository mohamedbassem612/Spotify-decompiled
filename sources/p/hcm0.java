package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class hcm0 implements qcm0 {
    public static final gcm0 Companion = new gcm0();
    public final String a;

    public /* synthetic */ hcm0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, fcm0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcm0) && u890.j(this.a, ((hcm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
