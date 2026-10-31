package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aj9 implements bj9 {
    public final String a;
    public final ee9 b;
    public final byte[] c;

    public aj9(String str, ee9 ee9Var, byte[] bArr) {
        this.a = str;
        this.b = ee9Var;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!aj9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        aj9 aj9Var = (aj9) obj;
        return u890.j(this.a, aj9Var.a) && u890.j(this.b, aj9Var.b) && Arrays.equals(this.c, aj9Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
