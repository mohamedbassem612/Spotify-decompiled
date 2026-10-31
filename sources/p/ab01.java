package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ab01 extends yyj {
    public final /* synthetic */ byte b;
    public final /* synthetic */ bb01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab01(bb01 bb01Var, byte b) {
        super((byte) 1);
        this.b = b;
        this.c = bb01Var;
    }

    public final void h(String[] strArr) {
        byte b = this.b;
        bb01 bb01Var = this.c;
        switch (b) {
            case 0:
                if (strArr == null) {
                    hhg1.n("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((cb01) bb01Var.b).d = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    hhg1.n("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((cb01) bb01Var.b).e = strArr;
                }
                break;
        }
    }
}
