package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mvf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvf(String str, boolean z, long j, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.f = str;
        this.e = z;
        this.b = j;
        this.c = iu30Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        lee1 lee1VarA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                yxo1.b((String) obj5, this.e, this.b, (iu30) obj4, (qim0) obj3, (b0k) obj, iP);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                boolean z = this.e;
                int iP2 = czo1.p(1);
                cev0.q(this.b, (Function0) obj5, (iu30) obj4, (qim0) obj3, z, (b0k) obj, iP2);
                return rih1Var;
            case 2:
                uwr uwrVar = cbx.a;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                qim0 qim0VarN = anm1.N("EpisodeStatusOverMediaPill", nim0.a);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = f9z.W0;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT);
                qcz qczVar = (qcz) obj4;
                yqg yqgVar = (yqg) obj3;
                String str = (String) obj5;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
                hzj.A.getClass();
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                if (qczVar instanceof ocz) {
                    x340Var2.i0(-272151615);
                    hqn1.e(((ocz) qczVar).a, yqgVar, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-272053996);
                    if (str == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    u7h u7hVar = qczVar.equals(new ncz(2)) ? new u7h(this.b) : null;
                    if (qczVar instanceof ncz) {
                        x340Var2.i0(1515252990);
                        lee1VarA = cbx.d(x340Var2).m;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1515254904);
                        lee1VarA = lee1.a(cbx.d(x340Var2).m, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151);
                        x340Var2.r(false);
                    }
                    lee1 lee1Var = lee1VarA;
                    long jB = cbx.a(x340Var2).a.c;
                    if (this.e) {
                        jB = u7h.b(jB, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    w6d1.d(str, (qim0) null, u7hVar, lee1Var, jB, 0.0f, 0.0f, 0.0f, new cjc0(1), 2, x340Var2, 0, 226);
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                ((b0i0) obj5).a((iu30) obj4, this.e, this.b, (qim0) obj3, (b0k) obj, iP3);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                boolean z2 = this.e;
                int iP4 = czo1.p(1);
                k1p1.g(this.b, (String) obj5, (String) obj4, (hdn0) obj3, z2, (b0k) obj, iP4);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvf(long j, Object obj, Object obj2, Object obj3, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvf(qcz qczVar, yqg yqgVar, String str, long j, boolean z) {
        super(2);
        this.a = (byte) 2;
        this.c = qczVar;
        this.d = yqgVar;
        this.f = str;
        this.b = j;
        this.e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvf(b0i0 b0i0Var, iu30 iu30Var, boolean z, long j, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.f = b0i0Var;
        this.c = iu30Var;
        this.e = z;
        this.b = j;
        this.d = qim0Var;
    }
}
