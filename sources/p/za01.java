package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class za01 extends yyj {
    public final /* synthetic */ byte b;
    public final /* synthetic */ r6b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za01(r6b0 r6b0Var, byte b) {
        super((byte) 1);
        this.b = b;
        this.c = r6b0Var;
    }

    public final void h(String[] strArr) {
        byte b = this.b;
        n0v0 n0v0Var = this.c;
        switch (b) {
            case 0:
                if (strArr == null) {
                    hhg1.n("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((cb01) ((vqv0) n0v0Var).b).d = strArr;
                }
                break;
            case 1:
                if (strArr == null) {
                    hhg1.n("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((cb01) ((vqv0) n0v0Var).b).e = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    hhg1.n("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((cb01) n0v0Var.b).h = strArr;
                }
                break;
        }
    }
}
