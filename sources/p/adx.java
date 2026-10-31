package p;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class adx extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ adx(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var = (x340) b0kVar;
                if (x340Var.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b3o1.f(((gdx) obj5).f, (j2i) obj4, x340Var, 0);
                } else {
                    x340Var.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var2 = (x340) b0kVar2;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b3o1.f(((lex) obj5).e, (j2i) obj4, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                g2c g2cVar = (g2c) obj;
                b0k b0kVar3 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                xd10 xd10Var = ((le10) obj5).f;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((x340) b0kVar3).g(g2cVar) ? 4 : 2;
                }
                x340 x340Var3 = (x340) b0kVar3;
                if (!x340Var3.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x340Var3.b0();
                } else if (u890.j(xd10Var, wd10.a)) {
                    x340Var3.i0(-936201041);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-936547962);
                    re10 re10Var = (re10) obj4;
                    otw.c(re10Var.t, new jao0(xd10Var, re10Var.e), g2cVar.b(nim0Var), null, x340Var3, 0, 8);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 3:
                hsl1 hsl1Var = (hsl1) obj2;
                int i = hsl1Var.a.i(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SET_CONTEXT_FAILED).d;
                RecyclerView recyclerView = (RecyclerView) obj5;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i);
                n830 n830Var = (n830) obj4;
                xhk1.c(n830Var.d(), j6p1.k(new jp80(new cc00(n830Var, i)), new h3h1(m830.b)));
                return hsl1Var;
            case 4:
                ((Number) obj3).intValue();
                d1u.B((ic40) obj5, (iu30) obj4, (b0k) obj2);
                return rih1Var;
            case 5:
                jqi0 jqi0Var = (jqi0) obj;
                b0k b0kVar4 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                lc20 lc20Var = (lc20) obj4;
                lh50 lh50Var = (lh50) obj5;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((x340) b0kVar4).g(jqi0Var) ? 4 : 2;
                }
                x340 x340Var4 = (x340) b0kVar4;
                if (x340Var4.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = qxd0.M(o6x.a, x340Var4);
                        x340Var4.s0(objT);
                    }
                    c9n c9nVar = (c9n) objT;
                    boolean zI = x340Var4.i(lh50Var) | ((iIntValue4 & 14) == 4) | x340Var4.i(lc20Var);
                    Object objT2 = x340Var4.T();
                    if (zI || objT2 == m4cVar) {
                        piu piuVar = new piu(lh50Var, jqi0Var, lc20Var, (lnm) null, (byte) 25);
                        x340Var4.s0(piuVar);
                        objT2 = piuVar;
                    }
                    qxd0.t(rih1Var, x340Var4, (vu30) objT2);
                    jqi0Var.getClass();
                    boolean zI2 = x340Var4.i(lc20Var) | x340Var4.i(c9nVar) | x340Var4.i(lh50Var);
                    Object objT3 = x340Var4.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new lb50(lc20Var, c9nVar, lh50Var, (byte) 1);
                        x340Var4.s0(objT3);
                    }
                    iu30 iu30Var = (iu30) objT3;
                    boolean zI3 = x340Var4.i(lc20Var) | x340Var4.i(lh50Var);
                    Object objT4 = x340Var4.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new fz40(lc20Var, lh50Var, (byte) 7);
                        x340Var4.s0(objT4);
                    }
                    jhc1.e(jqi0Var, iu30Var, (iu30) objT4, (qim0) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarX = uyn1.x(qim0VarF, cbx.b(b0kVar5).e.a());
                ahk1 ahk1Var = (ahk1) obj5;
                String strB = ahk1Var.b();
                String strA = ahk1Var.a();
                iu30 iu30Var2 = (iu30) obj4;
                x340 x340Var5 = (x340) b0kVar5;
                Object objT5 = x340Var5.T();
                if (objT5 == fkj0.X) {
                    objT5 = new izj1(iu30Var2, (byte) 22);
                    x340Var5.s0(objT5);
                }
                aq8.u(strB, strA, qim0VarX, (Function0) objT5, x340Var5);
                return rih1Var;
        }
    }
}
