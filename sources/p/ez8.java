package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ez8 extends zhn {
    public final String a;
    public final byte[] b;

    public ez8(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zhn) {
            zhn zhnVar = (zhn) obj;
            ez8 ez8Var = (ez8) zhnVar;
            if (this.a.equals(ez8Var.a)) {
                if (Arrays.equals(this.b, zhnVar instanceof ez8 ? ((ez8) zhnVar).b : ez8Var.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
