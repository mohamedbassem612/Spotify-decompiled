package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class op2 extends a8d1 implements vu30 {
    public String N0;
    public bp2 O0;
    public String P0;
    public tn2 Q0;
    public ls50 R0;
    public boolean S0;
    public int T0;
    public int U0;
    public byte V0;
    public /* synthetic */ Object W0;
    public xs2 X;
    public final /* synthetic */ fq2 X0;
    public String Y;
    public final /* synthetic */ gp21 Y0;
    public String Z;
    public final /* synthetic */ String Z0;
    public zob1 a;
    public Object b;
    public cp2 c;
    public String d;
    public p811 e;
    public Serializable f;
    public String g;
    public ap2 h;
    public hr2 i;
    public String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op2(fq2 fq2Var, gp21 gp21Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.X0 = fq2Var;
        this.Y0 = gp21Var;
        this.Z0 = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        op2 op2Var = new op2(this.X0, this.Y0, this.Z0, lnmVar);
        op2Var.W0 = obj;
        return op2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Not initialized variable reg: 18, insn: 0x0220: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r18 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:545), block:B:66:0x021d */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0292: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:659), block:B:76:0x0292 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0afa: MOVE (r0 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:2811), block:B:515:0x0afa */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x009e: MOVE (r0 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:159), block:B:31:0x009e */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
