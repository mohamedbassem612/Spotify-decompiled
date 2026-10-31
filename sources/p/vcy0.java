package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vcy0 extends a8d1 implements zu30 {
    public /* synthetic */ tcy0 a;
    public /* synthetic */ lcy0 b;
    public /* synthetic */ tqw c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ cm0 g;
    public final /* synthetic */ ncy0 h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcy0(c9n c9nVar, iu30 iu30Var, ven0 ven0Var, cm0 cm0Var, ncy0 ncy0Var, ven0 ven0Var2, lnm lnmVar) {
        super(4, lnmVar);
        this.d = c9nVar;
        this.e = iu30Var;
        this.f = ven0Var;
        this.g = cm0Var;
        this.h = ncy0Var;
        this.i = ven0Var2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        ncy0 ncy0Var = this.h;
        ven0 ven0Var = this.i;
        vcy0 vcy0Var = new vcy0(this.d, this.e, this.f, this.g, ncy0Var, ven0Var, (lnm) obj4);
        vcy0Var.a = (tcy0) obj;
        vcy0Var.b = (lcy0) obj2;
        vcy0Var.c = (tqw) obj3;
        rih1 rih1Var = rih1.a;
        vcy0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        tcy0 tcy0Var = this.a;
        lcy0 lcy0Var = this.b;
        tqw tqwVar = this.c;
        hm5.M(obj);
        boolean zJ = u890.j(lcy0Var, icy0.a);
        ven0 ven0Var = this.f;
        if (zJ) {
            b431 b431Var = (b431) ven0Var.getValue();
            if (b431Var != null) {
                b431Var.a(zpn1.y(2, tcy0Var.a(), (String) null), (String) null);
            }
        } else if (u890.j(lcy0Var, gcy0.a)) {
            qcy0 qcy0Var = tcy0Var instanceof qcy0 ? (qcy0) tcy0Var : null;
            String str = qcy0Var != null ? qcy0Var.f : null;
            b431 b431Var2 = (b431) ven0Var.getValue();
            if (b431Var2 != null) {
                b431Var2.a(new arr0(2, tcy0Var.a(), str), (String) null);
            }
        } else {
            boolean zJ2 = u890.j(lcy0Var, jcy0.a);
            c9n c9nVar = this.d;
            cm0 cm0Var = this.g;
            iu30 iu30Var = this.e;
            if (zJ2) {
                if (tcy0Var instanceof qcy0) {
                    qcy0 qcy0Var2 = (qcy0) tcy0Var;
                    String str2 = qcy0Var2.f;
                    if (str2 == null) {
                        b431 b431Var3 = (b431) ven0Var.getValue();
                        if (b431Var3 != null) {
                            b431Var3.a(zpn1.y(2, qcy0Var2.a, (String) null), (String) null);
                        }
                    } else {
                        fn31.T(c9nVar, (o8n) null, 0, new elu0(iu30Var, tcy0Var, str2, cm0Var, (lnm) null, (byte) 10), 3);
                    }
                }
            } else if (u890.j(lcy0Var, ecy0.a)) {
                if (tcy0Var instanceof qcy0) {
                    iu30Var.invoke(qcy0.b((qcy0) tcy0Var, null, null, false, true, 511));
                }
            } else if (u890.j(lcy0Var, fcy0.a)) {
                if (tcy0Var instanceof qcy0) {
                    fn31.T(c9nVar, (o8n) null, 0, new elu0(cm0Var, tcy0Var, iu30Var, this.h, (lnm) null, (byte) 11), 3);
                }
            } else if (u890.j(lcy0Var, dcy0.a)) {
                if (tcy0Var instanceof qcy0) {
                    iu30Var.invoke(qcy0.b((qcy0) tcy0Var, null, null, false, false, 511));
                }
            } else if (u890.j(lcy0Var, kcy0.a)) {
                if (tcy0Var instanceof pcy0) {
                    ven0 ven0Var2 = this.i;
                    ven0Var2.setValue(Integer.valueOf(((Number) ven0Var2.getValue()).intValue() + 1));
                    b431 b431Var4 = (b431) ven0Var.getValue();
                    if (b431Var4 != null) {
                        pcy0 pcy0Var = (pcy0) tcy0Var;
                        b431Var4.a(new arr0(2, pcy0Var.a, pcy0Var.c), (String) null);
                    }
                }
            } else {
                if (!u890.j(lcy0Var, hcy0.a)) {
                    eg.o();
                    return null;
                }
                if ((tcy0Var instanceof qcy0) && tqwVar != null) {
                    ((lo60) cm0Var.g).a(((qcy0) tcy0Var).e, n3o1.y(tqwVar), (Bundle) null);
                }
            }
        }
        return rih1.a;
    }
}
