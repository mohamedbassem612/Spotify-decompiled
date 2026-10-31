package p;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vdy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdy(String str, boolean z, boolean z2, boolean z3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final Object invoke(Object obj, Object obj2) {
        hax haxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m861 m861Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xdy.b((String) m861Var, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                sgc1.t((String) m861Var, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m861 m861Var2 = m861Var;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(m861Var2);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new qv61(m861Var2, (byte) 19);
                        x340Var2.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT);
                    oex oexVar = new oex(0, ea71.W0, ea71.U0, ea71.V0, 1);
                    lex lexVarZ = yoo1.z(x340Var2);
                    qim0 qim0VarN = anm1.N("shares_make_playlist_chip", nim0.a);
                    boolean z = this.c;
                    if (z) {
                        x340Var2.i0(1770242366);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131962390));
                        x340Var2.r(false);
                    } else if (this.d) {
                        x340Var2.i0(1770245583);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131962388));
                        x340Var2.r(false);
                    } else if (this.e) {
                        x340Var2.i0(1770251666);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var2.i0(1770248775);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131962391));
                        x340Var2.r(false);
                    }
                    hax haxVar2 = haxVar;
                    j2i j2iVarR = apo.r(-1139168122, new ov51((byte) 1, z), x340Var2);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    poo1.e(gbxVar, oexVar, lexVarZ, qim0VarN, 0, (String) null, haxVar2, j2iVarR, (vu30) null, (idn0) null, (ga80) null, false, uyn1.h(2, 16.0f, 0.0f), apo.r(761157913, new ov51((byte) 2, z), x340Var2), x340Var2, 12585984, 3072, 3888);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdy(m861 m861Var, boolean z, boolean z2, boolean z3) {
        super(2);
        this.a = (byte) 2;
        this.b = m861Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
