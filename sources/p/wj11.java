package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class wj11 {
    public static final vj11 Companion = new vj11();
    public final String a;

    public /* synthetic */ wj11(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, uj11.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj11) && u890.j(this.a, ((wj11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wj11(String str) {
        this.a = str;
    }
}
