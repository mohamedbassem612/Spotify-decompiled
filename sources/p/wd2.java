package p;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wd2 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd2(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        byte b2 = 4;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                wd2 wd2Var = new wd2((kl1) this.c, (lnm) obj4, (byte) 0);
                wd2Var.b = (tv80) obj3;
                wd2Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                wd2 wd2Var2 = new wd2((ven0) this.c, (lnm) obj4, (byte) 1);
                wd2Var2.b = (k77) obj2;
                wd2Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                wd2 wd2Var3 = new wd2((fzu) this.c, (lnm) obj4, (byte) 2);
                wd2Var3.b = (ezu) obj2;
                wd2Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                wd2 wd2Var4 = new wd2((ven0) this.c, (lnm) obj4, (byte) 3);
                wd2Var4.b = (qet) obj2;
                wd2Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                wd2 wd2Var5 = new wd2((psy) this.c, (lnm) obj4, b2);
                wd2Var5.b = (nab0) obj2;
                wd2Var5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                wd2 wd2Var6 = new wd2((ccb0) this.c, (lnm) obj4, (byte) 5);
                wd2Var6.b = (zbb0) obj2;
                wd2Var6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                wd2 wd2Var7 = new wd2((fad0) this.c, (lnm) obj4, (byte) 6);
                wd2Var7.b = (String) obj2;
                wd2Var7.invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                wd2 wd2Var8 = new wd2((aru0) this.c, (lnm) obj4, (byte) 7);
                wd2Var8.b = (String) obj2;
                wd2Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                wd2 wd2Var9 = new wd2((ngs0) this.c, (lnm) obj4, (byte) 8);
                wd2Var9.b = (dc01) obj2;
                wd2Var9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                wd2 wd2Var10 = new wd2((nl9) this.c, (lnm) obj4, (byte) 9);
                wd2Var10.b = (pd01) obj2;
                wd2Var10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                wd2 wd2Var11 = new wd2((he01) this.c, (lnm) obj4, (byte) 10);
                wd2Var11.b = (ee01) obj2;
                wd2Var11.invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                wd2 wd2Var12 = new wd2((he01) this.c, (lnm) obj4, (byte) 11);
                wd2Var12.b = (ne01) obj2;
                wd2Var12.invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                wd2 wd2Var13 = new wd2((svh0) this.c, (lnm) obj4, (byte) 12);
                wd2Var13.b = (tv80) obj3;
                wd2Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                wd2 wd2Var14 = new wd2((zg81) this.c, (lnm) obj4, (byte) 13);
                wd2Var14.b = (tg81) obj2;
                wd2Var14.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                wd2 wd2Var15 = new wd2(b2, (lnm) obj4);
                wd2Var15.b = (ko70) obj2;
                wd2Var15.c = (jo70) obj3;
                return wd2Var15.invokeSuspend(rih1Var);
            case 15:
                wd2 wd2Var16 = new wd2((ccd1) this.c, (lnm) obj4, (byte) 15);
                wd2Var16.b = (bcd1) obj2;
                wd2Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                wd2 wd2Var17 = new wd2((v0e1) this.c, (lnm) obj4, (byte) 16);
                wd2Var17.b = (t0e1) obj2;
                wd2Var17.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                wd2 wd2Var18 = new wd2((ven0) this.c, (lnm) obj4, (byte) 17);
                wd2Var18.b = (c2g1) obj2;
                wd2Var18.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                tv80 tv80Var = (tv80) this.b;
                hm5.M(obj);
                vb2.a((vb2) ((kl1) this.c).c, tv80Var);
                return rih1Var;
            case 1:
                ven0 ven0Var = (ven0) this.c;
                k77 k77Var = (k77) this.b;
                hm5.M(obj);
                if (u890.j(k77Var, j77.a)) {
                    ((o77) ven0Var.getValue()).o.invoke(ta7.a);
                    return rih1Var;
                }
                if (!(k77Var instanceof i77)) {
                    eg.o();
                    return null;
                }
                i77 i77Var = (i77) k77Var;
                ((o77) ven0Var.getValue()).o.invoke(new ka7(i77Var.a, i77Var.b));
                return rih1Var;
            case 2:
                ezu ezuVar = (ezu) this.b;
                hm5.M(obj);
                if (!u890.j(ezuVar, ezu.a)) {
                    eg.o();
                    return null;
                }
                Function0 function0 = ((fzu) this.c).a;
                if (function0 == null) {
                    return rih1Var;
                }
                function0.invoke();
                return rih1Var;
            case 3:
                ven0 ven0Var2 = (ven0) this.c;
                qet qetVar = (qet) this.b;
                hm5.M(obj);
                if (qetVar instanceof net) {
                    ven0Var2.setValue(Boolean.TRUE);
                } else if (qetVar instanceof met) {
                    ven0Var2.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 4:
                nab0 nab0Var = (nab0) this.b;
                hm5.M(obj);
                if (u890.j(nab0Var, nab0.a)) {
                    ((lzn0) ((psy) this.c).t).e();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                ccb0 ccb0Var = (ccb0) this.c;
                sbb0 sbb0Var = ccb0Var.a;
                xbb0 xbb0Var = (zbb0) this.b;
                hm5.M(obj);
                if (u890.j(xbb0Var, wbb0.a)) {
                    ccb0Var.b.invoke();
                    return rih1Var;
                }
                if (xbb0Var instanceof xbb0) {
                    sbb0Var.a(xbb0Var.a);
                    return rih1Var;
                }
                if (u890.j(xbb0Var, ybb0.a)) {
                    sbb0Var.a(null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                String str = (String) this.b;
                hm5.M(obj);
                z710 z710Var = (z710) ((fad0) this.c).b;
                z710.c(z710Var, Uri.parse(str), z710Var.a(), 2);
                return rih1Var;
            case 7:
                String str2 = (String) this.b;
                hm5.M(obj);
                z710.d((z710) ((aru0) this.c).d, str2, false, 6);
                return rih1Var;
            case 8:
                gc01 gc01Var = (gc01) ((ngs0) this.c).d;
                dc01 dc01Var = (dc01) this.b;
                hm5.M(obj);
                if (dc01Var instanceof bc01) {
                    gc01Var.a.m((Object) null, Boolean.FALSE);
                    return rih1Var;
                }
                if (!(dc01Var instanceof cc01)) {
                    eg.o();
                    return null;
                }
                String str3 = ((cc01) dc01Var).a;
                gc01Var.a.m((Object) null, Boolean.FALSE);
                gc01Var.c.a(str3);
                return rih1Var;
            case 9:
                nl9 nl9Var = (nl9) this.c;
                td01 td01Var = (td01) nl9Var.b;
                pd01 pd01Var = (pd01) this.b;
                hm5.M(obj);
                if (pd01Var instanceof nd01) {
                    td01Var.a.m((Object) null, Boolean.FALSE);
                    return rih1Var;
                }
                if (!(pd01Var instanceof od01)) {
                    eg.o();
                    return null;
                }
                td01Var.a.m((Object) null, Boolean.FALSE);
                ((ygt0) nl9Var.g).a(((od01) pd01Var).a);
                return rih1Var;
            case 10:
                qe01 qe01Var = ((he01) this.c).b;
                ee01 ee01Var = (ee01) this.b;
                hm5.M(obj);
                if (ee01Var instanceof be01) {
                    int i = ((be01) ee01Var).a;
                    qe01Var.getClass();
                    qe01Var.a(new po60(i, (byte) 24));
                    return rih1Var;
                }
                if (ee01Var instanceof de01) {
                    int i2 = ((de01) ee01Var).a;
                    qe01Var.getClass();
                    qe01Var.a(new po60(i2, (byte) 25));
                    return rih1Var;
                }
                if (!(ee01Var instanceof ce01)) {
                    if (ee01Var instanceof zd01) {
                        qe01Var.j.m((Object) null, Boolean.FALSE);
                        qe01Var.h.m((Object) null, Boolean.TRUE);
                        return rih1Var;
                    }
                    if (ee01Var instanceof ae01) {
                        qe01Var.j.m((Object) null, Boolean.FALSE);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                bpb1 bpb1Var = qe01Var.f;
                te01 te01VarA = te01.a((te01) bpb1Var.getValue(), 0, 2, 1, 1);
                bpb1Var.m((Object) null, te01VarA);
                hma1 hma1VarEdit = qe01Var.a.edit();
                hma1VarEdit.b(qe01.n, te01VarA.a);
                hma1VarEdit.b(qe01.o, te01VarA.b);
                hma1VarEdit.b(qe01.f40p, te01VarA.c);
                hma1VarEdit.b(qe01.q, te01VarA.d);
                hma1VarEdit.g();
                return rih1Var;
            case 11:
                qe01 qe01Var2 = ((he01) this.c).b;
                ne01 ne01Var = (ne01) this.b;
                hm5.M(obj);
                if (ne01Var instanceof me01) {
                    hc01 hc01Var = ((me01) ne01Var).a;
                    qe01Var2.b.m((Object) null, hc01Var);
                    hma1 hma1VarEdit2 = qe01Var2.a.edit();
                    hma1VarEdit2.d(qe01.l, hc01Var.name());
                    hma1VarEdit2.g();
                    return rih1Var;
                }
                if (ne01Var instanceof je01) {
                    fd01 fd01Var = ((je01) ne01Var).a;
                    qe01Var2.d.m((Object) null, fd01Var);
                    hma1 hma1VarEdit3 = qe01Var2.a.edit();
                    hma1VarEdit3.d(qe01.m, fd01Var.name());
                    hma1VarEdit3.g();
                    return rih1Var;
                }
                if (ne01Var instanceof ke01) {
                    int i3 = ((ke01) ne01Var).a;
                    qe01Var2.getClass();
                    qe01Var2.a(new po60(i3, (byte) 23));
                    return rih1Var;
                }
                if (ne01Var instanceof le01) {
                    qe01Var2.h.m((Object) null, Boolean.FALSE);
                    qe01Var2.j.m((Object) null, Boolean.TRUE);
                    return rih1Var;
                }
                if (ne01Var instanceof ie01) {
                    qe01Var2.h.m((Object) null, Boolean.FALSE);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 12:
                tv80 tv80Var2 = (tv80) this.b;
                hm5.M(obj);
                ur00 ur00Var = (ur00) ((svh0) this.c).c;
                xab1 xab1Var = (xab1) ur00Var.f;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                ur00Var.f = fn31.T((llm) ur00Var.e, (o8n) null, 4, new z290(ur00Var, e490.b, tv80Var2, (lnm) null, (byte) 0), 1);
                return rih1Var;
            case 13:
                tg81 tg81Var = (tg81) this.b;
                hm5.M(obj);
                wf81 wf81Var = ((zg81) this.c).g;
                if (tg81Var instanceof sg81) {
                    z = true;
                } else if (!(tg81Var instanceof rg81) && !(tg81Var instanceof qg81) && !(tg81Var instanceof pg81)) {
                    eg.o();
                    return null;
                }
                wf81Var.a(z);
                return rih1Var;
            case 14:
                ko70 ko70Var = (ko70) this.b;
                jo70 jo70Var = (jo70) this.c;
                hm5.M(obj);
                if (ko70Var != null) {
                    return jo70Var != null ? new huz(jo70.a(ko70Var.a, jo70Var), (byte) 10) : r6x.a;
                }
                eg.o();
                return null;
            case 15:
                bcd1 bcd1Var = (bcd1) this.b;
                hm5.M(obj);
                if (u890.j(bcd1Var, bcd1.a)) {
                    ((ccd1) this.c).b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                v0e1 v0e1Var = (v0e1) this.c;
                r0e1 r0e1Var = (t0e1) this.b;
                hm5.M(obj);
                if (r0e1Var instanceof r0e1) {
                    v0e1Var.d.invoke(r0e1Var.a);
                    return rih1Var;
                }
                if (r0e1Var instanceof p0e1) {
                    v0e1Var.b.invoke();
                    return rih1Var;
                }
                if (r0e1Var instanceof s0e1) {
                    v0e1Var.c.invoke();
                    return rih1Var;
                }
                if (r0e1Var instanceof q0e1) {
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                c2g1 c2g1Var = (c2g1) this.b;
                hm5.M(obj);
                if (!u890.j(c2g1Var, c2g1.a)) {
                    eg.o();
                    return null;
                }
                ven0 ven0Var3 = (ven0) this.c;
                ven0Var3.setValue(Boolean.valueOf(!((Boolean) ven0Var3.getValue()).booleanValue()));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd2(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 14;
    }
}
