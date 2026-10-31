package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u3h1 extends cs80 {
    public final /* synthetic */ byte b = 0;

    public u3h1(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // p.sgl
    public final a8b0 a(zim0 zim0Var) {
        qx81 qx81VarM;
        qx81 qx81VarM2;
        qx81 qx81VarM3;
        qx81 qx81VarM4;
        byte b = this.b;
        zjz zjzVar = zjz.Z0;
        switch (b) {
            case 0:
                beg begVarH = x1p1.h(zim0Var, rfb1.S);
                return (begVarH == null || (qx81VarM = begVarH.m()) == null) ? bkz.b(zjzVar, "UByte") : qx81VarM;
            case 1:
                beg begVarH2 = x1p1.h(zim0Var, rfb1.U);
                return (begVarH2 == null || (qx81VarM2 = begVarH2.m()) == null) ? bkz.b(zjzVar, "UInt") : qx81VarM2;
            case 2:
                beg begVarH3 = x1p1.h(zim0Var, rfb1.V);
                return (begVarH3 == null || (qx81VarM3 = begVarH3.m()) == null) ? bkz.b(zjzVar, "ULong") : qx81VarM3;
            default:
                beg begVarH4 = x1p1.h(zim0Var, rfb1.T);
                return (begVarH4 == null || (qx81VarM4 = begVarH4.m()) == null) ? bkz.b(zjzVar, "UShort") : qx81VarM4;
        }
    }

    @Override // p.sgl
    public final String toString() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public u3h1(short s) {
        super(Short.valueOf(s));
    }

    public u3h1(int i) {
        super(Integer.valueOf(i));
    }

    public u3h1(long j) {
        super(Long.valueOf(j));
    }
}
