package p;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gop0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gop0(xt61 xt61Var, int i, kv61 kv61Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 2;
        this.d = xt61Var;
        this.b = i;
        this.e = kv61Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                gop0 gop0Var = new gop0(obj5, obj4, (lnm) obj3, (byte) 0);
                gop0Var.b = iIntValue;
                gop0Var.c = (ioj0) obj2;
                return gop0Var.invokeSuspend(rih1Var);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                gop0 gop0Var2 = new gop0(obj5, obj4, (lnm) obj3, (byte) 1);
                gop0Var2.b = iIntValue2;
                gop0Var2.c = (List) obj2;
                return gop0Var2.invokeSuspend(rih1Var);
            default:
                gop0 gop0Var3 = new gop0((xt61) obj5, this.b, (kv61) obj4, (lnm) obj3);
                gop0Var3.c = (Context) obj;
                return gop0Var3.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    public final Object invokeSuspend(Object obj) {
        String str;
        goj0 goj0VarA;
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                int i = this.b;
                ioj0 ioj0Var = (ioj0) this.c;
                hm5.M(obj);
                hoj0 hoj0VarC = ioj0Var.c(xkk1.class, ((cop0) obj3).a);
                xkk1 xkk1Var = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (xkk1) goj0VarA.a;
                if (xkk1Var != null) {
                    Set set = lop0.t;
                    up70 up70VarA = xkk1Var.a.a(vp70.c);
                    str = up70VarA != null ? up70VarA.a.a : null;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                return new bop0(i, str, ioj0Var);
            case 1:
                int i2 = this.b;
                List list = (List) this.c;
                hm5.M(obj);
                aek1 aek1Var = (aek1) obj3;
                aek1Var.c = new Integer(list.size());
                if (aek1Var.b(i2)) {
                    aek1Var.a(i2);
                }
                int i3 = aek1Var.d;
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = ((j1v0) obj2).k + i3;
                int size = list.size();
                if (i4 > size) {
                    i4 = size;
                }
                if (i3 > i4) {
                    i3 = i4;
                }
                return list.subList(i3, i4);
            default:
                Context context = (Context) this.c;
                hm5.M(obj);
                xt61 xt61Var = (xt61) obj3;
                String strT = zmo1.t(context, xt61Var.b, (String) null);
                if5 if5Var = new if5(xt61Var.c, (String) null, (b2i) null, (hf5) null, 8);
                String strValueOf = String.valueOf(this.b);
                int i5 = kv61.r;
                return new wu61(strValueOf, (String) null, (g460) ((kv61) obj2).k.getValue(), new f460(strT, if5Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gop0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }
}
