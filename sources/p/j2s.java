package p;

import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j2s extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m2s b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2s(m2s m2sVar, tob1 tob1Var, byte b) {
        super(2);
        this.a = b;
        this.b = m2sVar;
        this.c = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.c;
        m2s m2sVar = this.b;
        byte b2 = 1;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    nt70 nt70Var = (nt70) tob1Var.getValue();
                    boolean zI = x340Var2.i(m2sVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        h2s h2sVar = new h2s(m2sVar, (byte) 0);
                        x340Var2.s0(h2sVar);
                        obj3 = h2sVar;
                    }
                    qim0 qim0VarU = lrn1.u(nim0.a, (iu30) obj3);
                    boolean zI2 = x340Var2.i(m2sVar);
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        i2s i2sVar = new i2s(m2sVar, (byte) 0);
                        x340Var2.s0(i2sVar);
                        obj4 = i2sVar;
                    }
                    Function0 function0 = (Function0) obj4;
                    boolean zI3 = x340Var2.i(m2sVar);
                    Object objT3 = x340Var2.T();
                    Object obj5 = objT3;
                    if (zI3 || objT3 == m4cVar) {
                        h2s h2sVar2 = new h2s(m2sVar, (byte) 1);
                        x340Var2.s0(h2sVar2);
                        obj5 = h2sVar2;
                    }
                    gho1.d(nt70Var, function0, qim0VarU, (iu30) obj5, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.c(new obk1((BehaviorRetainingAppBarLayout) m2sVar.h.b), apo.r(-365398994, new j2s(m2sVar, tob1Var, z ? 1 : 0), x340Var4), x340Var4, 48);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    mod.b(oi7.a.a(m2sVar.a), apo.r(429319983, new j2s(m2sVar, tob1Var, b2), x340Var6), x340Var6, 56);
                }
                break;
        }
        return rih1Var;
    }
}
