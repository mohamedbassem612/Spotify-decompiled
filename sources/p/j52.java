package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import defpackage.m;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j52 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ h52 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(iu30 iu30Var, h52 h52Var, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = iu30Var;
                this.c = h52Var;
                super(2);
                break;
            default:
                this.b = iu30Var;
                this.c = h52Var;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                    x340Var2.j0(475845883);
                    wat watVar = (wat) x340Var2.k(t4k.h);
                    x340Var2.j0(-492369756);
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = x0d.o(watVar, x340Var2);
                    }
                    x340Var2.r(false);
                    ufh0 ufh0Var = (ufh0) objT;
                    x340Var2.j0(-492369756);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = x0d.m(x340Var2);
                    }
                    x340Var2.r(false);
                    xhl xhlVar = (xhl) objT2;
                    x340Var2.j0(-492369756);
                    Object objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT3);
                    }
                    x340Var2.r(false);
                    ven0 ven0Var = (ven0) objT3;
                    x340Var2.j0(-492369756);
                    Object objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = x0d.n(xhlVar, x340Var2);
                    }
                    x340Var2.r(false);
                    nil nilVar = (nil) objT4;
                    x340Var2.j0(-492369756);
                    Object objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = bb00.i(rih1Var, f331.X0, x340Var2);
                    }
                    x340Var2.r(false);
                    ven0 ven0Var2 = (ven0) objT5;
                    who1.h(s161.b(qim0VarD, false, new tu(ufh0Var, (byte) 1)), apo.i(x340Var2, -1488813576, new m((Object) ven0Var2, (Object) xhlVar, (Object) new su(ven0Var, nilVar, (byte) 1), (Object) this.b, (Object) this.c, (byte) 6)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 1), x340Var2, 48);
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-986696614, new j52(this.b, this.c, (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
