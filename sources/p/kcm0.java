package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class kcm0 implements qcm0 {
    public static final jcm0 Companion = new jcm0();
    public final String a;

    public /* synthetic */ kcm0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, icm0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcm0) && u890.j(this.a, ((kcm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public kcm0(String str) {
        this.a = str;
    }
}
