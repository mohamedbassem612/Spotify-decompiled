package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ie9 extends je9 {
    public final String c;
    public final be9 d;
    public final byte[] e;

    public ie9(String str, be9 be9Var, byte[] bArr) {
        this.c = str;
        this.d = be9Var;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ie9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ie9 ie9Var = (ie9) obj;
        return u890.j(this.c, ie9Var.c) && this.d.equals(ie9Var.d) && Arrays.equals(this.e, ie9Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // p.je9
    public final be9 n() {
        return this.d;
    }
}
