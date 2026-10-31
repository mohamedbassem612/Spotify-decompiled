package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gch extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ich c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gch(ich ichVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ichVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ich ichVar = this.c;
        switch (b) {
            case 0:
                return new gch(ichVar, lnmVar, (byte) 0);
            case 1:
                return new gch(ichVar, lnmVar, (byte) 1);
            case 2:
                return new gch(ichVar, lnmVar, (byte) 2);
            case 3:
                return new gch(ichVar, lnmVar, (byte) 3);
            default:
                return new gch(ichVar, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ich ichVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    long jB = ((e8k1) lcc.z(ichVar, t4k.t)).b();
                    this.b = true;
                    if (hap1.i(jB, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Function0 function0 = ichVar.l1;
                if (function0 != null) {
                    function0.invoke();
                }
                if (ichVar.n1) {
                    ((ss50) lcc.z(ichVar, t4k.l)).a(0);
                }
                ichVar.u1 = true;
                faa0 faa0Var = ichVar.s1;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ichVar.s1 = null;
                ichVar.r1 = null;
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    long jB2 = ((e8k1) lcc.z(ichVar, t4k.t)).b();
                    this.b = true;
                    if (hap1.i(jB2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Function0 function1 = ichVar.l1;
                if (function1 != null) {
                    function1.invoke();
                }
                if (ichVar.n1) {
                    ((ss50) lcc.z(ichVar, t4k.l)).a(0);
                }
                ichVar.B1 = true;
                faa0 faa0Var2 = ichVar.z1;
                if (faa0Var2 != null) {
                    faa0Var2.d((CancellationException) null);
                }
                ichVar.z1 = null;
                ichVar.y1 = null;
                return rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    long jA = ((e8k1) lcc.z(ichVar, t4k.t)).a();
                    this.b = true;
                    if (hap1.i(jA, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((i6) ichVar).W0.invoke();
                ichVar.s1 = null;
                return rih1Var;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    long jA2 = ((e8k1) lcc.z(ichVar, t4k.t)).a();
                    this.b = true;
                    if (hap1.i(jA2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((i6) ichVar).W0.invoke();
                ichVar.z1 = null;
                return rih1Var;
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    long jB3 = ((e8k1) lcc.z(ichVar, t4k.t)).b();
                    this.b = true;
                    if (hap1.i(jB3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Function0 function2 = ichVar.l1;
                if (function2 == null) {
                    return rih1Var;
                }
                function2.invoke();
                return rih1Var;
        }
    }
}
