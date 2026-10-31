package p;

import android.app.Activity;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7s extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7s(Object obj, int i, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return new m7s(this.c, obj3, obj2, this.b, lnmVar, (byte) 0);
            case 1:
                m7s m7sVar = new m7s((p811) obj3, (xtb0) obj2, this.b, lnmVar);
                m7sVar.c = obj;
                return m7sVar;
            case 2:
                m7s m7sVar2 = new m7s((iu30) this.c, (hdn0) obj3, (ven0) obj2, lnmVar);
                m7sVar2.b = ((Number) obj).intValue();
                return m7sVar2;
            case 3:
                return new m7s(this.c, obj3, obj2, this.b, lnmVar, (byte) 3);
            case 4:
                return new m7s(this.c, this.b, obj3, obj2, lnmVar, (byte) 4);
            default:
                return new m7s(this.c, this.b, obj3, obj2, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 2:
                create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        lfj1 lfj1Var;
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                p7s p7sVar = (p7s) this.c;
                p7sVar.c().a(omo1.v((ewh0) obj3), p7sVar.b((w2z) obj2, false), this.b);
                break;
            case 1:
                c9n c9nVar = (c9n) this.c;
                hm5.M(obj);
                ((p811) obj3).a = fn31.T(c9nVar, (o8n) null, 0, new x0e((xtb0) obj2, this.b, (lnm) null, (byte) 2), 3);
                break;
            case 2:
                int i = this.b;
                hm5.M(obj);
                if (i != ((hdn0) obj3).s() && !((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    ((iu30) this.c).invoke(new us70(i));
                }
                break;
            case 3:
                hm5.M(obj);
                Set set = (Set) this.c;
                String str2 = ((eno0) obj3).a;
                if (set.add(str2)) {
                    ((vu30) obj2).invoke(str2, new Integer(this.b));
                }
                break;
            case 4:
                hm5.M(obj);
                tc31 tc31Var = (tc31) this.c;
                int i2 = this.b;
                SingleSubject singleSubject = (SingleSubject) obj3;
                iu30 iu30Var = (iu30) obj2;
                Activity activity = tc31Var.a;
                String string = activity.getString(2131960073);
                String string2 = activity.getString(i2);
                String string3 = activity.getString(2131960072);
                String string4 = activity.getString(2131960071);
                mw40 mw40VarT = yoi1.T(tc31Var.b.a, string, string2);
                sc31 sc31Var = new sc31(tc31Var, iu30Var, singleSubject, b2);
                mw40VarT.a = string3;
                mw40VarT.c = sc31Var;
                sc31 sc31Var2 = new sc31(tc31Var, iu30Var, singleSubject, b3);
                mw40VarT.b = string4;
                mw40VarT.d = sc31Var2;
                mw40VarT.f = new vae(singleSubject, (byte) 12);
                mw40VarT.b().b();
                break;
            default:
                hm5.M(obj);
                w9i1 w9i1Var = (w9i1) this.c;
                if (!w9i1Var.w1) {
                    kt91 kt91Var = w9i1Var.c;
                    int i3 = this.b;
                    n57.k(i3 != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i3)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    Integer numValueOf = Integer.valueOf(i3);
                    qx10 qx10Var = (qx10) obj3;
                    String str3 = (String) obj2;
                    if (u890.j(qx10Var.b, hy10.a)) {
                        str = null;
                        lfj1Var = null;
                    } else {
                        str = "Dismiss";
                        lfj1Var = new lfj1(w9i1Var, qx10Var, str3, b3);
                    }
                    kt91Var.k(new er91((fs91) null, "", numValueOf, str, (Integer) null, lfj1Var, (cvr) null, (xq91) null, false));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7s(Object obj, Object obj2, Object obj3, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7s(iu30 iu30Var, hdn0 hdn0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = iu30Var;
        this.d = hdn0Var;
        this.e = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7s(p811 p811Var, xtb0 xtb0Var, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.d = p811Var;
        this.e = xtb0Var;
        this.b = i;
    }
}
