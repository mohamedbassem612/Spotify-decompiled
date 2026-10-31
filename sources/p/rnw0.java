package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rnw0 {
    public final Object a;
    public final byte[] b;
    public final rpa0 c;
    public final fuq0 d;

    public rnw0(Object obj, byte[] bArr, rpa0 rpa0Var, fuq0 fuq0Var) {
        this.a = obj;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.c = rpa0Var;
        this.d = fuq0Var;
    }

    public final byte[] a() {
        byte[] bArr = this.b;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
