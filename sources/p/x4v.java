package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x4v extends z031 implements vu30 {
    public final /* synthetic */ byte b = 1;
    public byte c;
    public /* synthetic */ Object d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ cv30 g;
    public final /* synthetic */ cv30 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4v(n4k n4kVar, nhd nhdVar, vu30 vu30Var, Function0 function0, ki5 ki5Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = n4kVar;
        this.f = nhdVar;
        this.g = vu30Var;
        this.h = function0;
        this.i = ki5Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.i;
        iu30 iu30Var = this.h;
        xu30 xu30Var = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                x4v x4vVar = new x4v((n4k) this.e, (nhd) obj3, (vu30) xu30Var, (Function0) iu30Var, (ki5) obj2, lnmVar);
                x4vVar.d = obj;
                return x4vVar;
            default:
                x4v x4vVar2 = new x4v((c9n) obj3, xu30Var, iu30Var, (p9w0) obj2, lnmVar);
                x4vVar2.d = obj;
                return x4vVar2;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (r3 == r9) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x4v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4v(c9n c9nVar, xu30 xu30Var, iu30 iu30Var, p9w0 p9w0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = c9nVar;
        this.g = xu30Var;
        this.h = iu30Var;
        this.i = p9w0Var;
    }
}
