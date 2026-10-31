package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z4v extends z031 implements vu30 {
    public final /* synthetic */ byte b = 0;
    public Object c;
    public byte d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4v(iu30 iu30Var, Function0 function0, Function0 function1, vu30 vu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = iu30Var;
        this.f = function0;
        this.g = function1;
        this.h = vu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                z4v z4vVar = new z4v((iu30) this.e, (Function0) this.f, (Function0) obj3, (vu30) obj2, lnmVar);
                z4vVar.c = obj;
                return z4vVar;
            default:
                z4v z4vVar2 = new z4v((mmr0) obj3, (n561) obj2, lnmVar);
                z4vVar2.f = obj;
                return z4vVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((r561) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ca A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:23:0x0087, B:46:0x00ed, B:48:0x00f5, B:50:0x0104, B:52:0x0110, B:53:0x0113, B:54:0x0116, B:55:0x011e, B:29:0x0098, B:41:0x00c6, B:43:0x00ca, B:32:0x00a0, B:38:0x00b7, B:35:0x00ac), top: B:59:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        if (r12 == r5) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z4v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4v(mmr0 mmr0Var, n561 n561Var, lnm lnmVar) {
        super(2, lnmVar);
        this.g = mmr0Var;
        this.h = n561Var;
    }
}
