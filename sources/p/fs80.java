package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class fs80 {
    public static final es80 Companion = new es80();
    public final boolean a;
    public final String b;

    public /* synthetic */ fs80(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ds80.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs80)) {
            return false;
        }
        fs80 fs80Var = (fs80) obj;
        return this.a == fs80Var.a && u890.j(this.b, fs80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
