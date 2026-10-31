package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b5v extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public m811 c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5v(iu30 iu30Var, vu30 vu30Var, Function0 function0, Function0 function1, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.f = iu30Var;
        this.g = vu30Var;
        this.h = function0;
        this.i = function1;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.b) {
            case 0:
                b5v b5vVar = new b5v(this.f, this.g, this.h, this.i, lnmVar, (byte) 0);
                b5vVar.e = obj;
                return b5vVar;
            default:
                b5v b5vVar2 = new b5v(this.f, this.g, this.h, this.i, lnmVar, (byte) 1);
                b5vVar2.e = obj;
                return b5vVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014a, code lost:
    
        if (r0 == r10) goto L50;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.a5v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b5v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
