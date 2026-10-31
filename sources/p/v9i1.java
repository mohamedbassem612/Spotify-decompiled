package p;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v9i1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9i1(o0i o0iVar, boolean z, l8m1 l8m1Var, boolean z2, ycl1 ycl1Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.e = o0iVar;
        this.c = z;
        this.f = l8m1Var;
        this.d = z2;
        this.g = ycl1Var;
        this.h = ven0Var;
        this.i = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                return new v9i1((w9i1) obj6, this.c, (String) obj5, (String) obj4, (String) obj3, this.d, (Function0) obj2, lnmVar);
            default:
                return new v9i1((o0i) obj6, this.c, (l8m1) obj5, this.d, (ycl1) obj4, (ven0) obj3, (ven0) obj2, lnmVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        long j;
        Long lA;
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.h;
        Object obj4 = this.e;
        d9n d9nVar = d9n.a;
        Object obj5 = this.f;
        Object obj6 = this.i;
        Integer num = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    w9i1 w9i1Var = (w9i1) obj4;
                    q8n q8nVar = w9i1Var.d;
                    u9i1 u9i1Var = new u9i1(w9i1Var, this.c, (String) obj5, (String) obj2, (String) obj3, this.d, (Function0) obj6, null);
                    this.b = true;
                    if (fn31.Y(q8nVar, u9i1Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                ven0 ven0Var = (ven0) obj6;
                l8m1 l8m1Var = (l8m1) obj5;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    n2u0 n2u0Var = ((o0i) obj4).c.b;
                    if (n2u0Var != null) {
                        h3k h3kVar = (i3k) ((ven0) obj3).getValue();
                        h3k h3kVar2 = h3kVar instanceof h3k ? h3kVar : null;
                        long jLongValue = 0;
                        if (h3kVar2 != null) {
                            ok41 ok41Var = h3kVar2.a.b;
                            j = ok41Var instanceof ok41 ? ok41Var.a : 0L;
                        } else {
                            j = 0;
                        }
                        if (h3kVar2 != null && this.c) {
                            num = new Integer(1);
                        }
                        Integer num2 = num;
                        py7 py7Var = l8m1Var.b;
                        if (((Boolean) ven0Var.getValue()).booleanValue()) {
                            py7Var.getClass();
                        } else {
                            n2u0 n2u0Var2 = py7Var.c;
                            if (n2u0Var2 != null && (lA = n2u0Var2.a()) != null) {
                                jLongValue = lA.longValue();
                            }
                        }
                        long j2 = jLongValue;
                        ven0Var.setValue(Boolean.FALSE);
                        boolean z3 = this.d;
                        n2u0Var.b(new l2u0(!z3, j2, j, 0L, l8m1Var.k.b(), 1.0f, num2, (Integer) null, 320));
                        bpb1 bpb1Var = ((ycl1) obj2).c;
                        heb hebVar = new heb(n2u0Var, z3, l8m1Var, (byte) 4);
                        this.b = true;
                        bpb1Var.collect(hebVar, this);
                        return d9nVar;
                    }
                    hhg1.n("Required value was null.");
                } else {
                    if (z2) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9i1(w9i1 w9i1Var, boolean z, String str, String str2, String str3, boolean z2, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.e = w9i1Var;
        this.c = z;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.d = z2;
        this.i = function0;
    }
}
