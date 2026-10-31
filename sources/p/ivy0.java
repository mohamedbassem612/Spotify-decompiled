package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleSource;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ivy0 implements vu30 {
    public final ssy0 a;
    public final x5u b;
    public final yfu c;
    public final qpy0 d;
    public final p8o e;

    public ivy0(ssy0 ssy0Var, x5u x5uVar, yfu yfuVar, qpy0 qpy0Var, p8o p8oVar) {
        this.a = ssy0Var;
        this.b = x5uVar;
        this.c = yfuVar;
        this.d = qpy0Var;
        this.e = p8oVar;
    }

    public static void a(sy21 sy21Var, lpx0 lpx0Var) {
        if (sy21Var.a.Q0) {
            return;
        }
        Logger.d("[Puffin] PushCrossDeviceFilterUseCase error response " + sy21Var, new Object[0]);
        lpx0Var.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, lnm lnmVar) {
        evy0 evy0Var;
        String str2;
        int i;
        if (lnmVar instanceof evy0) {
            evy0Var = (evy0) lnmVar;
            int i2 = evy0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                evy0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                evy0Var = new evy0(this, lnmVar);
            }
        } else {
            evy0Var = new evy0(this, lnmVar);
        }
        evy0 evy0Var2 = evy0Var;
        Object obj = evy0Var2.c;
        int i3 = evy0Var2.e;
        Object obj2 = rih1.a;
        Object obj3 = d9n.a;
        if (i3 == 0) {
            hm5.M(obj);
            if (this.d.a()) {
                int iL = this.e.a.l(q8o.a, 0);
                SingleSource singleSource = (SingleSource) this.b.invoke();
                evy0Var2.a = str;
                evy0Var2.b = iL;
                evy0Var2.e = 1;
                Object objJ = fc11.j(singleSource, evy0Var2);
                if (objJ != obj3) {
                    str2 = str;
                    i = iL;
                    obj = objJ;
                }
                return obj3;
            }
            return obj2;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(obj);
                return obj2;
            }
            if (i3 == 3) {
                hm5.M(obj);
                return obj2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = evy0Var2.b;
        String str3 = evy0Var2.a;
        hm5.M(obj);
        str2 = str3;
        tb0 tb0Var = (tb0) obj;
        fvy0 fvy0Var = new fvy0(this, i, (byte) 1);
        fvy0 fvy0Var2 = new fvy0(this, i, (byte) 0);
        if (tb0Var instanceof ob0) {
            evy0Var2.a = null;
            evy0Var2.b = i;
            evy0Var2.e = 2;
            Object objE = e("BLUETOOTH", ((ob0) tb0Var).a.a, str2, fvy0Var, fvy0Var2, evy0Var2);
            if (objE != obj3) {
                objE = obj2;
            }
            if (objE == obj3) {
                return obj3;
            }
            return obj2;
        }
        if (tb0Var instanceof sb0) {
            evy0Var2.a = null;
            evy0Var2.b = i;
            evy0Var2.e = 3;
            if (f(str2, fvy0Var, fvy0Var2, evy0Var2) == obj3) {
                return obj3;
            }
        } else if (!tb0Var.equals(pb0.a) && !tb0Var.equals(qb0.a)) {
            eg.o();
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, String str3, Function0 function0, Function0 function1, onm onmVar) {
        gvy0 gvy0Var;
        if (onmVar instanceof gvy0) {
            gvy0Var = (gvy0) onmVar;
            int i = gvy0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gvy0Var.d = i - Integer.MIN_VALUE;
            } else {
                gvy0Var = new gvy0(this, onmVar);
            }
        } else {
            gvy0Var = new gvy0(this, onmVar);
        }
        Object objA = gvy0Var.b;
        int i2 = gvy0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                function0.invoke();
                ssy0 ssy0Var = this.a;
                gvy0Var.a = function1;
                gvy0Var.d = 1;
                objA = ssy0Var.a(str, str2, str3, gvy0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function1 = gvy0Var.a;
                hm5.M(objA);
            }
            a((sy21) objA, new lpx0(function1, (byte) 6));
        } catch (IOException unused) {
            function1.invoke();
            Logger.d("[Puffin] PushCrossDeviceCrossDeviceFilterUseCaseImpl IOException " + this, new Object[0]);
        } catch (Throwable th) {
            function1.invoke();
            throw th;
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r13 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (e("WIRED", r13, r4, r5, r6, r7) == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r10, p.fvy0 r11, p.fvy0 r12, p.onm r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof p.hvy0
            if (r0 == 0) goto L14
            r0 = r13
            p.hvy0 r0 = (p.hvy0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.hvy0 r0 = new p.hvy0
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.d
            int r0 = r7.f
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r8 = p.d9n.a
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2d
            p.hm5.M(r13)
            goto L7b
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r3
        L33:
            p.fvy0 r12 = r7.c
            p.fvy0 r11 = r7.b
            java.lang.String r10 = r7.a
            p.hm5.M(r13)
            goto L5b
        L3d:
            p.hm5.M(r13)
            if (r10 == 0) goto L65
            p.yfu r13 = r9.c
            java.lang.Object r13 = r13.c
            p.uny r13 = (p.uny) r13
            io.reactivex.rxjava3.core.Single r13 = r13.l(r10)
            r7.a = r10
            r7.b = r11
            r7.c = r12
            r7.f = r2
            java.lang.Object r13 = p.fc11.j(r13, r7)
            if (r13 != r8) goto L5b
            goto L7a
        L5b:
            p.l3c1 r13 = (p.l3c1) r13
            p.q3c1 r13 = (p.q3c1) r13
            java.lang.String r13 = r13.e
        L61:
            r4 = r10
            r5 = r11
            r6 = r12
            goto L68
        L65:
            java.lang.String r13 = "GENERIC"
            goto L61
        L68:
            r7.a = r3
            r7.b = r3
            r7.c = r3
            r7.f = r1
            java.lang.String r2 = "WIRED"
            r1 = r9
            r3 = r13
            java.lang.Object r9 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r9 != r8) goto L7b
        L7a:
            return r8
        L7b:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ivy0.f(java.lang.String, p.fvy0, p.fvy0, p.onm):java.lang.Object");
    }
}
