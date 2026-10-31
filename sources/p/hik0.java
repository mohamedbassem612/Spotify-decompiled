package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hik0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4h1 b;
    public final /* synthetic */ kak0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hik0(kak0 kak0Var, t4h1 t4h1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.c = kak0Var;
        this.b = t4h1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        t4h1 t4h1Var = this.b;
        kak0 kak0Var = this.c;
        switch (b) {
            case 0:
                return new hik0(t4h1Var, kak0Var, lnmVar, (byte) 0);
            case 1:
                return new hik0(t4h1Var, kak0Var, lnmVar, (byte) 1);
            case 2:
                return new hik0(t4h1Var, kak0Var, lnmVar, (byte) 2);
            case 3:
                return new hik0(t4h1Var, kak0Var, lnmVar, (byte) 3);
            default:
                return new hik0(kak0Var, t4h1Var, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ha20 ha20Var;
        byte b = this.a;
        ijf1 ijf1Var = ijf1.a;
        ijf1 ijf1Var2 = ijf1.b;
        rih1 rih1Var = rih1.a;
        t4h1 t4h1Var = this.b;
        kak0 kak0Var = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                t4h1Var.d.setValue(Boolean.valueOf(kak0Var.S0.a.a == b8w0.None));
                if (((Boolean) ((hrr0) t4h1Var.a(ijf1Var).a).getValue()).booleanValue()) {
                    t4h1Var.a(ijf1Var).o();
                }
                if (((Boolean) ((hrr0) t4h1Var.a(ijf1Var2).a).getValue()).booleanValue()) {
                    t4h1Var.a(ijf1Var2).o();
                }
                break;
            case 1:
                hm5.M(obj);
                boolean z2 = kak0Var.X0;
                t4h1Var.f.setValue(Boolean.valueOf(z2));
                if (z2) {
                    if (((Boolean) ((hrr0) t4h1Var.a(ijf1Var).a).getValue()).booleanValue()) {
                        t4h1Var.a(ijf1Var).o();
                    }
                    if (((Boolean) ((hrr0) t4h1Var.a(ijf1Var2).a).getValue()).booleanValue()) {
                        t4h1Var.a(ijf1Var2).o();
                    }
                }
                break;
            case 2:
                hm5.M(obj);
                t4h1Var.b(kak0Var.v1.b);
                break;
            case 3:
                hm5.M(obj);
                lyj0 lyj0Var = kak0Var.v1;
                t4h1Var.getClass();
                long j = lyj0Var.b;
                boolean z3 = lyj0Var.c || lyj0Var.d;
                boolean z4 = z3 && !(t4h1Var.r && j == t4h1Var.s);
                t4h1Var.r = z3;
                t4h1Var.s = j;
                if (!z3) {
                    xab1 xab1Var = t4h1Var.t;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    t4h1Var.t = null;
                    t4h1Var.q.setValue(Boolean.FALSE);
                } else if (z4) {
                    t4h1Var.e();
                }
                break;
            default:
                hm5.M(obj);
                lhg1 lhg1Var = kak0Var.S0;
                ruq0 ruq0Var = lhg1Var.b;
                String str = ruq0Var.a;
                String str2 = ruq0Var.g;
                String str3 = ruq0Var.b;
                String str4 = ruq0Var.h;
                long j2 = kak0Var.v1.b;
                q6w0 q6w0Var = lhg1Var.a;
                s69 s69Var = q6w0Var.h;
                s69 s69Var2 = q6w0Var.i;
                buk1 buk1Var = q6w0Var.b;
                duk1 duk1Var = buk1Var != null ? buk1Var.a : null;
                gez gezVar = q6w0Var.t;
                gez gezVar2 = q6w0Var.X;
                hez hezVar = q6w0Var.c;
                jez jezVar = hezVar != null ? hezVar.a : null;
                r920 r920Var = q6w0Var.Y;
                r920 r920Var2 = q6w0Var.Z;
                fa20 fa20Var = q6w0Var.d;
                ha20 ha20Var2 = fa20Var != null ? fa20Var.a : null;
                ox30 ox30Var = q6w0Var.N0;
                ox30 ox30Var2 = q6w0Var.O0;
                px30 px30Var = q6w0Var.e;
                rx30 rx30Var = px30Var != null ? px30Var.a : null;
                r4h1 r4h1Var = t4h1Var.w;
                rx30 rx30Var2 = rx30Var;
                s4h1 s4h1Var = new s4h1(str, str2, str3, str4);
                s4h1 s4h1Var2 = t4h1Var.f14p;
                if (s4h1Var2 == null || s4h1Var2.equals(s4h1Var)) {
                    z = false;
                } else {
                    ((hce1) r4h1Var.a).l();
                    ((hce1) r4h1Var.b).l();
                    ((hce1) r4h1Var.c).l();
                    ((hce1) r4h1Var.d).l();
                    if (t4h1Var.b(j2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                t4h1Var.f14p = s4h1Var;
                if (!z) {
                    hce1 hce1Var = (hce1) r4h1Var.d;
                    hce1 hce1Var2 = (hce1) r4h1Var.c;
                    hce1 hce1Var3 = (hce1) r4h1Var.b;
                    hce1 hce1Var4 = (hce1) r4h1Var.a;
                    if (s69Var != null) {
                        hce1Var4.E(ijf1Var, s69Var, duk1Var);
                    }
                    if (s69Var2 != null) {
                        hce1Var4.E(ijf1Var2, s69Var2, duk1Var);
                    }
                    if (gezVar != null) {
                        hce1Var3.E(ijf1Var, gezVar, jezVar);
                    }
                    if (gezVar2 != null) {
                        hce1Var3.E(ijf1Var2, gezVar2, jezVar);
                    }
                    if (r920Var != null) {
                        ha20Var = ha20Var2;
                        hce1Var2.E(ijf1Var, r920Var, ha20Var);
                    } else {
                        ha20Var = ha20Var2;
                    }
                    if (r920Var2 != null) {
                        hce1Var2.E(ijf1Var2, r920Var2, ha20Var);
                    }
                    if (ox30Var != null) {
                        hce1Var.E(ijf1Var, ox30Var, rx30Var2);
                    }
                    if (ox30Var2 != null) {
                        hce1Var.E(ijf1Var2, ox30Var2, rx30Var2);
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hik0(t4h1 t4h1Var, kak0 kak0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = t4h1Var;
        this.c = kak0Var;
    }
}
