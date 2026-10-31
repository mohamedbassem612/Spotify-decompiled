package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m3a0 implements q3a0 {
    public final String a;
    public final be9 b;
    public final byte[] c;

    public m3a0(String str, be9 be9Var, byte[] bArr) {
        this.a = str;
        this.b = be9Var;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m3a0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m3a0 m3a0Var = (m3a0) obj;
        return u890.j(this.a, m3a0Var.a) && this.b.equals(m3a0Var.b) && Arrays.equals(this.c, m3a0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
