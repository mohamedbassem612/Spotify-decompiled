package p;

import android.view.View;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimeout;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b6u extends ov61 {
    public final kt91 a;
    public final xvo b;
    public final t8u0 c;
    public final lt20 d;

    public b6u(kt91 kt91Var, xvo xvoVar, t8u0 t8u0Var) {
        this.a = kt91Var;
        this.b = xvoVar;
        this.c = t8u0Var;
        this.d = new lt20(new tu41(new p3t(yoi1.g(xvoVar.a(true)), (byte) 7), (byte) 9), new q8t0(3, null, (byte) 13), (byte) 0);
    }

    public final mr20 getValue() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #2 {Exception -> 0x0045, blocks: (B:14:0x003f, B:20:0x0052, B:41:0x00c9, B:23:0x005d, B:33:0x00a9, B:36:0x00c1, B:26:0x0068, B:30:0x007a), top: B:63:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final Object setValue(Boolean bool, boolean z, tv80 tv80Var, lnm lnmVar) {
        z5u z5uVar;
        Integer num;
        int i;
        rih1 rih1Var;
        Object obj;
        boolean z2;
        d9n d9nVar;
        ezc ezcVarG;
        qjr qjrVar;
        boolean z3;
        d9n d9nVar2;
        boolean z4;
        boolean z5 = z;
        if (lnmVar instanceof z5u) {
            z5uVar = (z5u) lnmVar;
            int i2 = z5uVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z5uVar.e = i2 - Integer.MIN_VALUE;
            } else {
                z5uVar = new z5u(this, (onm) lnmVar);
            }
        } else {
            z5uVar = new z5u(this, (onm) lnmVar);
        }
        Object obj2 = z5uVar.c;
        int i3 = z5uVar.e;
        xvo xvoVar = this.b;
        d9n d9nVar3 = d9n.a;
        try {
            try {
                if (i3 == 0) {
                    hm5.M(obj2);
                    i = !z5 ? 1 : 0;
                    wvo wvoVar = xvoVar.a;
                    vvo.Companion.getClass();
                    Completable completableA = wvoVar.a(new vvo(new awo(!z5 ? "1" : "0")));
                    CompletableError completableErrorJ = Completable.j(new TimeoutException());
                    completableA.getClass();
                    CompletableTimeout completableTimeoutT = completableA.t(30L, TimeUnit.SECONDS, Schedulers.b, completableErrorJ);
                    z5uVar.a = z5;
                    z5uVar.b = i;
                    z5uVar.e = 1;
                    if (fc11.i(completableTimeoutT, z5uVar) != d9nVar3) {
                    }
                    return d9nVar3;
                }
                if (i3 == 1) {
                    int i4 = z5uVar.b;
                    boolean z6 = z5uVar.a;
                    hm5.M(obj2);
                    i = i4;
                    z5 = z6;
                } else if (i3 == 2) {
                    int i5 = z5uVar.b;
                    boolean z7 = z5uVar.a;
                    hm5.M(obj2);
                    i = i5;
                    z5 = z7;
                    obj = rih1Var;
                    obj = objY;
                    if (i != 0) {
                        kt91 kt91Var = this.a;
                        try {
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961810});
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                            d9nVar = d9nVar3;
                            z2 = true;
                            kt91Var.k(new er91((fs91) null, "", 2131961810, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        } catch (Exception unused) {
                            num = null;
                            op71.x(z5uVar.getContext());
                            return new ht61(num, 0);
                        }
                    } else {
                        z2 = true;
                        d9nVar = d9nVar3;
                    }
                    ezcVarG = yoi1.g(xvoVar.a(z2));
                    if (i != 0) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    num = null;
                    qjrVar = new qjr(z3, (lnm) null);
                    z5uVar.a = z5;
                    z5uVar.b = i;
                    z5uVar.e = 3;
                    d9nVar2 = d9nVar;
                    if (b5p1.j(ezcVarG, qjrVar, z5uVar) == d9nVar2) {
                        return d9nVar2;
                    }
                    z4 = z5;
                } else {
                    if (i3 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z4 = z5uVar.a;
                    hm5.M(obj2);
                    num = null;
                }
                return new it61(Boolean.valueOf(z4));
                qjrVar = new qjr(z3, (lnm) null);
                z5uVar.a = z5;
                z5uVar.b = i;
                z5uVar.e = 3;
                d9nVar2 = d9nVar;
                if (b5p1.j(ezcVarG, qjrVar, z5uVar) == d9nVar2) {
                    return d9nVar2;
                }
                z4 = z5;
                return new it61(Boolean.valueOf(z4));
            } catch (Exception unused2) {
                op71.x(z5uVar.getContext());
                return new ht61(num, 0);
            }
            z5uVar.a = z5;
            z5uVar.b = i;
            z5uVar.e = 2;
            fns fnsVar = igu.a;
            Object objY = fn31.Y(pyf0.a, new n5s(this, (lnm) null, (byte) 26), z5uVar);
            if (objY != d9nVar3) {
                rih1Var = rih1.a;
            }
            if (obj == d9nVar3) {
                obj = rih1Var;
                obj = objY;
                return d9nVar3;
            }
            obj = rih1Var;
            obj = objY;
            if (i != 0) {
                kt91 kt91Var2 = this.a;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961810});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                d9nVar = d9nVar3;
                z2 = true;
                kt91Var2.k(new er91((fs91) null, "", 2131961810, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            } else {
                z2 = true;
                d9nVar = d9nVar3;
            }
            ezcVarG = yoi1.g(xvoVar.a(z2));
            if (i != 0) {
                z3 = z2;
            } else {
                z3 = false;
            }
            num = null;
        } catch (Exception unused3) {
            num = null;
        }
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, lnmVar);
    }
}
