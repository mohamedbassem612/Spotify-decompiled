package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zbh extends a8d1 implements vu30 {
    public final /* synthetic */ xu30 X;
    public final /* synthetic */ vr20 Y;
    public Object[] a;
    public jfe b;
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public byte g;
    public /* synthetic */ Object h;
    public final /* synthetic */ mr20[] i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbh(Function0 function0, lnm lnmVar, vr20 vr20Var, xu30 xu30Var, mr20[] mr20VarArr) {
        super(2, lnmVar);
        this.i = mr20VarArr;
        this.t = function0;
        this.X = xu30Var;
        this.Y = vr20Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        xu30 xu30Var = this.X;
        zbh zbhVar = new zbh(this.t, lnmVar, this.Y, xu30Var, this.i);
        zbhVar.h = obj;
        return zbhVar;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((zbh) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0 A[LOOP:0: B:29:0x00d0->B:37:0x00f1, LOOP_START, PHI: r2 r14
      0x00d0: PHI (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:26:0x00cb, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r14v6 p.aa80) = (r14v5 p.aa80), (r14v10 p.aa80) binds: [B:26:0x00cb, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3 A[EDGE_INSN: B:51:0x00f3->B:38:0x00f3 BREAK  A[LOOP:0: B:29:0x00d0->B:37:0x00f1], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0135 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013a -> B:44:0x011a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p.faa
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zbh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
