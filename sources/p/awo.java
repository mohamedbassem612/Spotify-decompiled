package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class awo {
    public static final zvo Companion = new zvo();
    public final String a;

    public /* synthetic */ awo(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, yvo.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awo) && u890.j(this.a, ((awo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public awo(String str) {
        this.a = str;
    }
}
