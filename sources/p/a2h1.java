package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a2h1 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final zsc b;
    public volatile int c = 0;

    public a2h1(zsc zscVar, int i) {
        this.b = zscVar;
        this.a = i;
    }

    public final int a(int i) {
        mkj0 mkj0VarC = c();
        int iA = mkj0VarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = mkj0VarC.b;
        int i2 = iA + mkj0VarC.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final short b() {
        mkj0 mkj0VarC = c();
        int iA = mkj0VarC.a(10);
        if (iA != 0) {
            return mkj0VarC.b.getShort(iA + mkj0VarC.a);
        }
        return (short) 0;
    }

    public final mkj0 c() {
        ThreadLocal threadLocal = d;
        mkj0 mkj0Var = (mkj0) threadLocal.get();
        if (mkj0Var == null) {
            mkj0Var = new mkj0();
            threadLocal.set(mkj0Var);
        }
        rkj0 rkj0Var = (rkj0) this.b.b;
        int iA = rkj0Var.a(6);
        if (iA != 0) {
            int i = iA + rkj0Var.a;
            int i2 = (this.a * 4) + rkj0Var.b.getInt(i) + i + 4;
            int i3 = rkj0Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = rkj0Var.b;
            mkj0Var.b = byteBuffer;
            if (byteBuffer != null) {
                mkj0Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                mkj0Var.c = i4;
                mkj0Var.d = mkj0Var.b.getShort(i4);
                return mkj0Var;
            }
            mkj0Var.a = 0;
            mkj0Var.c = 0;
            mkj0Var.d = 0;
        }
        return mkj0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        mkj0 mkj0VarC = c();
        int iA = mkj0VarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? mkj0VarC.b.getInt(iA + mkj0VarC.a) : 0));
        sb.append(", codepoints:");
        mkj0 mkj0VarC2 = c();
        int iA2 = mkj0VarC2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + mkj0VarC2.a;
            i = mkj0VarC2.b.getInt(mkj0VarC2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
