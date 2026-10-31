package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ht1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jt1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht1(jt1 jt1Var, byte b) {
        super(2);
        this.a = b;
        this.b = jt1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jt1 jt1Var = this.b;
        boolean z = false;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        gxo gxoVar = jt1Var.H1;
                        if (gxoVar == null) {
                            obj3 = objT;
                            u890.C("screenElementFactory");
                            throw null;
                        }
                        obj3 = objT;
                        xw1 xw1VarA = gxoVar.a(null);
                        x340Var2.s0(xw1VarA);
                        obj3 = xw1VarA;
                    }
                    obj3 = objT;
                    xw1 xw1Var = (xw1) obj3;
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (objT2 == m4cVar) {
                        mj11 mj11Var = new mj11(wy71.a, new g3(jt1Var, (byte) 22), null, 22);
                        x340Var2.s0(mj11Var);
                        obj4 = mj11Var;
                    }
                    otw.b(xw1Var, new vw1((mj11) obj4), new joa0("add-to-playlist"), (qim0) null, x340Var2, 8, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(591652066, new ht1(jt1Var, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
