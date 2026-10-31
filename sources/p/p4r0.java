package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p4r0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public /* synthetic */ int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4r0(w3t0 w3t0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 2;
        this.f = w3t0Var;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                p4r0 p4r0Var = new p4r0((zl5) obj5, (String) obj4, this.e, (lnm) obj3, (byte) 0);
                p4r0Var.b = (ioj0) obj;
                p4r0Var.f = (List) obj2;
                return p4r0Var.invokeSuspend(rih1Var);
            case 1:
                p4r0 p4r0Var2 = new p4r0((zl5) obj5, (String) obj4, this.e, (lnm) obj3, (byte) 1);
                p4r0Var2.f = (lev0) obj;
                p4r0Var2.b = (ioj0) obj2;
                return p4r0Var2.invokeSuspend(rih1Var);
            default:
                int iIntValue = ((Number) obj).intValue();
                p4r0 p4r0Var3 = new p4r0((w3t0) this.f, (ven0) obj5, (ven0) obj4, (lnm) obj3);
                p4r0Var3.e = iIntValue;
                p4r0Var3.b = (u8l1) obj2;
                p4r0Var3.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ioj0 ioj0Var = (ioj0) this.b;
                List list = (List) this.f;
                hm5.M(obj);
                return ((zl5) obj2).d(ioj0Var, (String) obj3, this.e, !list.isEmpty());
            case 1:
                lev0 lev0Var = (lev0) this.f;
                ioj0 ioj0Var2 = (ioj0) this.b;
                hm5.M(obj);
                zl5 zl5Var = (zl5) obj2;
                return zl5Var.D(ioj0Var2, (String) obj3, this.e, lev0Var.b, lev0Var.a, lev0Var.c == null, ((xf4) zl5Var.i).p() ? lev0Var.d : 0);
            default:
                ven0 ven0Var = (ven0) obj3;
                w3t0 w3t0Var = (w3t0) this.f;
                ven0 ven0Var2 = (ven0) obj2;
                int i = this.e;
                s8l1 s8l1Var = (u8l1) this.b;
                hm5.M(obj);
                if (s8l1Var instanceof s8l1) {
                    r160 r160Var = s8l1Var.a;
                    z0i z0iVar = r160Var.a;
                    if (z0iVar == null) {
                        z0iVar = (z0i) w3t0Var.a.get(i);
                    }
                    ven0Var2.setValue(z0iVar);
                    ven0Var.setValue(r160Var.b);
                } else {
                    if (!u890.j(s8l1Var, t8l1.a)) {
                        eg.o();
                        return null;
                    }
                    ven0Var2.setValue((z0i) w3t0Var.a.get(i));
                    ven0Var.setValue((Object) null);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4r0(zl5 zl5Var, String str, int i, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = zl5Var;
        this.d = str;
        this.e = i;
    }
}
