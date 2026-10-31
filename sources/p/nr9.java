package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nr9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr9(or9 or9Var, float f, n8b1 n8b1Var, float f2, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.f = or9Var;
        this.c = f;
        this.g = n8b1Var;
        this.d = f2;
        this.e = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new nr9((or9) obj4, this.c, (n8b1) obj3, this.d, (Function0) obj2, lnmVar);
            case 1:
                return new nr9((upo) obj4, this.c, this.d, (Function0) obj2, (iu30) obj3, lnmVar);
            default:
                float f = this.d;
                return new nr9((iu30) obj4, (o95) obj3, this.c, (o95) obj2, f, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.g;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                or9 or9Var = (or9) obj2;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    o95 o95VarB = c97.b(or9Var.a.s());
                    Float f3 = new Float(f2);
                    Float f4 = new Float(f);
                    mr9 mr9Var = new mr9(or9Var, (byte) 0);
                    this.b = true;
                    if (qfn0.a(o95VarB.f, new l95(o95VarB, f4, ern1.k((n8b1) obj4, rno1.a, o95VarB.e(), f3, f4), o95VarB.c.d, mr9Var, (lnm) null), this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) obj3).invoke();
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    objF = ((upo) obj2).f(f2, f, (Function0) obj3, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                if (((wy71) objF) != wy71.c) {
                    return rih1Var;
                }
                ((iu30) obj4).invoke(ahd.a);
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    ovg0 ovg0Var = new ovg0((o95) obj4, this.c, (o95) obj3, this.d, (lnm) null, (byte) 0);
                    this.b = true;
                    if (smo1.s(ovg0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((iu30) obj2).invoke(bwg0.a);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr9(upo upoVar, float f, float f2, Function0 function0, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = upoVar;
        this.c = f;
        this.d = f2;
        this.e = function0;
        this.g = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr9(iu30 iu30Var, o95 o95Var, float f, o95 o95Var2, float f2, lnm lnmVar) {
        super(2, lnmVar);
        this.f = iu30Var;
        this.g = o95Var;
        this.c = f;
        this.e = o95Var2;
        this.d = f2;
    }
}
