package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class gm70 {
    public static final fm70 Companion = new fm70();
    public final String a;

    public /* synthetic */ gm70(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, em70.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm70) && u890.j(this.a, ((gm70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
