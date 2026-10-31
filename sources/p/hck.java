package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hck extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hck(boolean z, bmf0 bmf0Var, boolean z2, float f, Function0 function0, boolean z3) {
        super(2);
        this.b = z;
        this.f = bmf0Var;
        this.c = z2;
        this.d = f;
        this.g = function0;
        this.e = z3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        boolean z = this.c;
        boolean z2 = this.e;
        Object obj3 = this.g;
        boolean z3 = this.b;
        qim0 qim0Var = nim0.a;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                String str = (String) obj4;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (z3) {
                    x340Var2.i0(451164636);
                    qim0 qim0VarF = z ? u291.f(qim0Var, 1.0f) : qim0Var;
                    wck wckVar = (wck) obj3;
                    jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    int i = wckVar instanceof uck ? 3 : 0;
                    x340Var2.i0(2113878445);
                    x340Var2.r(false);
                    a0e1 a0e1Var = (!z2 || f <= 1.0f) ? null : new a0e1(3);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).k;
                    qim0 wnb0Var = z2 ? new wnb0(1.0f, false) : qim0Var;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    uwo1.e(str, uyn1.z(0.0f, 4.0f, 1, wnb0Var), lee1Var, 0L, a0e1Var, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
                    if (i != 0) {
                        x340Var2.i0(2114309500);
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        op71.g(x340Var2, u291.v(qim0Var, 8.0f));
                        hux huxVarK = rck.k(i);
                        zov0 zov0Var = cbx.b(x340Var2).g;
                        w0h1.a(huxVarK, isl.a, u291.r(qim0Var, 16.0f), 0L, 0L, false, x340Var2, 56, 56);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(2114571853);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(452706297);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var2 = cbx.d(x340Var2).k;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    uwo1.e(str, uyn1.z(0.0f, 4.0f, 1, qim0Var), lee1Var2, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
                    x340Var2.r(false);
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                bmf0 bmf0Var = (bmf0) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.i0(1449549273);
                    qim0 qim0VarF2 = u291.f(anm1.N("#LyricsTranslationLineTag", qim0Var), 1.0f);
                    Function0 function0 = (Function0) obj3;
                    if (z3) {
                        flb0 flb0Var = (flb0) x340Var4.k(t4k.n);
                        qim0VarF2 = qim0VarF2.then(z2 ? j9k1.x(qim0Var, new h6a0((Object) function0, (Object) flb0Var, (byte) 20)) : j9k1.x(qim0Var, new ye6(((Number) function0.invoke()).floatValue(), flb0Var, (byte) 4)));
                    }
                    x340Var4.r(false);
                    qim0 qim0VarD = o0c.d(qim0VarF2, irn1.l0(0.0f, 1000.0f, (Object) null, 5), 2);
                    String str2 = bmf0Var.e;
                    long j = z ? bmf0Var.i : bmf0Var.h;
                    uwr uwrVar3 = cbx.a;
                    lee1 lee1Var3 = cbx.d(x340Var4).g;
                    long j2 = cbx.d(x340Var4).g.a.b;
                    fc11.o(j2);
                    uwo1.e(str2, qim0VarD, lee1.a(lee1Var3, 0L, fc11.Y(TextUnit.c(j2) * f, 1095216660480L & j2), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), j, new a0e1(bmf0Var.d), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2016);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hck(boolean z, boolean z2, String str, wck wckVar, boolean z3, float f) {
        super(2);
        this.b = z;
        this.c = z2;
        this.f = str;
        this.g = wckVar;
        this.e = z3;
        this.d = f;
    }
}
