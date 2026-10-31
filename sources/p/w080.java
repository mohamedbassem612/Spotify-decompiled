package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class w080 {
    public static final v080 Companion = new v080();
    public final String a;

    public /* synthetic */ w080(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, u080.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w080) && u890.j(this.a, ((w080) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public w080() {
        this.a = "";
    }
}
