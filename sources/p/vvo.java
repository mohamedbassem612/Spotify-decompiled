package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class vvo {
    public static final uvo Companion = new uvo();
    public final String a;
    public final awo b;

    public /* synthetic */ vvo(int i, String str, awo awoVar) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, tvo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = awoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvo)) {
            return false;
        }
        vvo vvoVar = (vvo) obj;
        return u890.j(this.a, vvoVar.a) && u890.j(this.b, vvoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public vvo(awo awoVar) {
        this.a = "dsa-mode-enabled";
        this.b = awoVar;
    }
}
