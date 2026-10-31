package p;

import android.os.Build;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzhm;
import java.util.Collections;
import java.util.Timer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zdm1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdm1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new zdm1((cem1) this.b, (rk41) obj2, lnmVar, (byte) 0);
            case 1:
                return new zdm1((g3o1) this.b, (yln1) obj2, lnmVar, (byte) 1);
            case 2:
                zdm1 zdm1Var = new zdm1((a4o1) obj2, lnmVar, (byte) 2);
                zdm1Var.b = obj;
                return zdm1Var;
            case 3:
                zdm1 zdm1Var2 = new zdm1((oao1) obj2, lnmVar, (byte) 3);
                zdm1Var2.b = obj;
                return zdm1Var2;
            case 4:
                zdm1 zdm1Var3 = new zdm1((vfo1) obj2, lnmVar, (byte) 4);
                zdm1Var3.b = obj;
                return zdm1Var3;
            default:
                return new zdm1((fqn1) this.b, (bon1) obj2, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                ycm1 ycm1Var = ((cem1) this.b).e;
                boolean z = ((rk41) this.c).b;
                ycm1Var.m = z;
                m3c m3cVar = ycm1Var.j;
                if (m3cVar != null) {
                    m3cVar.j(z);
                }
                return rih1.a;
            case 1:
                tgo1 tgo1Var = tgo1.c;
                hm5.M(obj);
                g3o1 g3o1Var = (g3o1) this.b;
                if (!g3o1Var.d.j()) {
                    return new e331(new m231(new zzhm(tgo1Var, ij81.e1, null, null)));
                }
                yln1 yln1Var = (yln1) this.c;
                if (!yln1Var.B() || yln1Var.C().x().w()) {
                    return new e331(new m231(new zzhm(tgo1Var, ij81.p1, null, null)));
                }
                lc80 lc80Var = new lc80();
                o9n1 o9n1VarS = yto1.s(g3o1Var.b);
                asd1 asd1VarB = asd1.b();
                asd1VarB.a = new pl10[]{fqo1.b};
                asd1VarB.d = new ezb1(lc80Var, (byte) 28);
                asd1VarB.c = (char) 34001;
                g3o1Var.c = nko1.K(o9n1VarS.e(0, asd1VarB.a()));
                return new e331(rih1.a);
            case 2:
                hm5.M(obj);
                zwo1 zwo1Var = (zwo1) this.b;
                int i = Build.VERSION.SDK_INT;
                oln1 oln1VarX = pln1.x();
                String str = zwo1Var.c.c;
                oln1VarX.d();
                ((pln1) oln1VarX.b).y(str);
                a4o1 a4o1Var = (a4o1) this.c;
                String packageName = a4o1Var.a.getPackageName();
                oln1VarX.d();
                ((pln1) oln1VarX.b).z(packageName);
                aje0 aje0Var = a4o1Var.b;
                int i2 = aje0Var.m() + (-2) != 1 ? 4 : 3;
                oln1VarX.d();
                ((pln1) oln1VarX.b).H(i2);
                oln1VarX.d();
                ((pln1) oln1VarX.b).A("18.9.3");
                String strValueOf = String.valueOf(i);
                oln1VarX.d();
                ((pln1) oln1VarX.b).B(strValueOf);
                String str2 = zwo1Var.c.d;
                oln1VarX.d();
                ((pln1) oln1VarX.b).C(str2);
                boolean zJ = aje0Var.j();
                oln1VarX.d();
                ((pln1) oln1VarX.b).D(zJ);
                boolean zK = aje0Var.k();
                oln1VarX.d();
                ((pln1) oln1VarX.b).E(zK);
                String strL = aje0Var.l();
                oln1VarX.d();
                ((pln1) oln1VarX.b).F(strL);
                String strN = ghk1.n();
                oln1VarX.d();
                ((pln1) oln1VarX.b).G(strN);
                byte[] bArrD = ((pln1) oln1VarX.e()).d();
                String strD = q8p1.d.d(bArrD, bArrD.length);
                rnn1 rnn1VarY = unn1.y();
                snn1 snn1VarX = tnn1.x();
                snn1VarX.j(strD);
                rnn1VarY.i(Collections.singletonList((tnn1) snn1VarX.e()));
                return bmq0.l0(a4o1Var, (unn1) rnn1VarY.e());
            case 3:
                hm5.M(obj);
                zwo1 zwo1Var2 = (zwo1) this.b;
                oao1 oao1Var = (oao1) this.c;
                if (!oao1Var.e) {
                    new Timer().schedule(new y9o1(oao1Var, zwo1Var2), 28800000L, 28800000L);
                    oao1Var.e = true;
                }
                return rih1.a;
            case 4:
                hm5.M(obj);
                zwo1 zwo1Var3 = (zwo1) this.b;
                vfo1 vfo1Var = (vfo1) this.c;
                synchronized (zwo1Var3) {
                    try {
                        s2t s2tVar = vfo1Var.b;
                        if (s2tVar == null || s2tVar.v()) {
                            vfo1Var.b = fn31.q(vfo1Var.d.a(), (o8n) null, 0, new xoh1(zwo1Var3, vfo1Var, (lnm) null, (byte) 16), 3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rih1.a;
            default:
                hm5.M(obj);
                try {
                    fqn1 fqn1Var = (fqn1) this.b;
                    f2g1 f2g1Var = (f2g1) fqn1Var.b;
                    byte[] bArrD2 = ((bon1) this.c).d();
                    f2g1Var.h(Collections.singletonList(new qvo1(System.currentTimeMillis(), 0, q8p1.c.d(bArrD2, bArrD2.length))));
                    fn31.T(((pjo1) ((qeh1) fqn1Var.d).b).f.a, (o8n) null, 0, new gld(fqn1Var, 20, (lnm) null), 3);
                    break;
                } catch (Exception unused) {
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdm1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
