package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mo20 extends du1 {
    public final w190[] c;

    /* JADX WARN: Illegal instructions before constructor call */
    public mo20(int i, w190[] w190VarArr) {
        if (w190VarArr == null) {
            hhg1.n("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = w190VarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            bhn0.y(w190VarArr.getClass(), "Empty enum: ");
            throw null;
        }
        super(i, i2);
        this.c = w190VarArr;
    }

    @Override // p.du1
    public final Object d(int i) {
        int i2 = (1 << this.b) - 1;
        int i3 = this.a;
        int i4 = (i & (i2 << i3)) >> i3;
        for (w190 w190Var : this.c) {
            if (w190Var.getNumber() == i4) {
                return w190Var;
            }
        }
        return null;
    }
}
