package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vt61 {
    public static final lqs0 j;
    public static final se11 k;
    public final lzn0 a;
    public final i8h1 b;
    public final qyj c;
    public final r961 d;
    public final mt61 e;
    public final ynb0 f;
    public final rzo0 g;
    public final kly0 h;
    public final oxl0 i = new oxl0(new ksk0((byte) 20));

    static {
        char[] cArr = {'-', '\'', 8216, 8217, '\"', 8220, 8221, ',', ':', '(', ')', '#'};
        LinkedHashSet linkedHashSet = new LinkedHashSet(zno1.s(12));
        for (int i = 0; i < 12; i++) {
            linkedHashSet.add(Character.valueOf(cArr[i]));
        }
        j = mqo1.H(linkedHashSet);
        k = new se11("[ .,!?]+");
    }

    public vt61(lzn0 lzn0Var, i8h1 i8h1Var, qyj qyjVar, r961 r961Var, mt61 mt61Var, ynb0 ynb0Var, rzo0 rzo0Var, ipq ipqVar) {
        this.a = lzn0Var;
        this.b = i8h1Var;
        this.c = qyjVar;
        this.d = r961Var;
        this.e = mt61Var;
        this.f = ynb0Var;
        this.g = rzo0Var;
        this.h = ipqVar;
    }

    public static lqs0 e(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if (!j.c.containsKey(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        List listH = k.h(sb.toString());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (!ihc1.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return mqo1.H(arrayList);
    }

    public final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-363117140);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ldx ldxVar = ldx.c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0Var3);
            boolean z = true;
            gdx gdxVarS = yla.s(x340Var);
            if ((i2 & 14) != 4) {
                z = false;
            }
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 0);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarZ, (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, qgj.a, x340Var, 48, 6, 984);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(this, function0, qim0Var2, i, (byte) 24);
        }
    }

    public final void b(c8e1 c8e1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1963863136);
        int i2 = i | (b0kVar3.g(c8e1Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.g(qim0Var) ? 256 : 128) | (b0kVar3.i(this) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(b0kVar3).d;
            qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0Var);
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 3, 119);
            n6a1 n6a1Var = new n6a1(cbx.a(b0kVar3).b.c);
            lee1 lee1VarA = lee1.a(cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            boolean zI = b0kVar3.i(this) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new c861(this, iu30Var, (byte) 6);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            xea.d(c8e1Var, (iu30) objT, qim0VarJ, false, lee1VarA, kua0Var, (bua0) null, true, 0, 0, (elk1) null, (iu30) null, n6a1Var, apo.r(564106115, new nu31(c8e1Var, this, iu30Var, (byte) 7), b0kVar3), b0kVar2, (i2 & 14) | 102236160, 196608, 16024);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, this, c8e1Var, iu30Var, qim0Var, (byte) 1);
        }
    }

    public final void c(sjq0 sjq0Var, b0k b0kVar, int i) {
        ven0 ven0Var;
        vt61 vt61Var = this;
        sjq0 sjq0Var2 = sjq0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1492724709);
        int i2 = (x340Var.i(sjq0Var2) ? 4 : 2) | i | (x340Var.i(vt61Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = w661.V0;
                x340Var.s0(objT);
            }
            ven0 ven0VarV = k5p1.v(objArr, c8e1.d, (Function0) objT, x340Var, 384);
            Object objT2 = x340Var.T();
            lnm lnmVar = null;
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            String str = ((c8e1) ven0VarV.getValue()).a.b;
            boolean zG = x340Var.g(ven0VarV) | x340Var.i(vt61Var) | x340Var.i(sjq0Var2);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                qt61 qt61Var = new qt61(vt61Var, ven0VarV, sjq0Var2, ven0Var2, null);
                x340Var.s0(qt61Var);
                objT3 = qt61Var;
            }
            qxd0.t(str, x340Var, (vu30) objT3);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                x340Var.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) objT4;
            qv01 qv01Var = (qv01) vt61Var.f.get();
            ima1 ima1Var = qv01Var.a;
            bma1 bma1Var = qv01.b;
            List list = (List) rwq.g(rqt0.u(i6p1.u(new uop0(ima1Var.r(bma1Var), (byte) 28), myo1.u(qv01Var.a.e(bma1Var, (String) null)))), (Object) null, (o8n) null, x340Var, 48, 2).getValue();
            Set setP1 = list != null ? o7h.p1(list) : null;
            if (setP1 == null) {
                x340Var.i0(-328200378);
                x340Var.r(false);
                ven0Var = ven0Var3;
            } else {
                x340Var.i0(-328200377);
                boolean zI = x340Var.i(sjq0Var2) | x340Var.g(setP1);
                Object objT5 = x340Var.T();
                if (zI || objT5 == m4cVar) {
                    ven0Var = ven0Var3;
                    p651 p651Var = new p651((Object) sjq0Var2, (Object) setP1, (Object) ven0Var, lnmVar, (byte) 8);
                    x340Var.s0(p651Var);
                    objT5 = p651Var;
                } else {
                    ven0Var = ven0Var3;
                }
                qxd0.t(setP1, x340Var, (vu30) objT5);
                x340Var.r(false);
            }
            az20 az20Var = (az20) x340Var.k(t4k.i);
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            j2i j2iVarR = apo.r(-945473198, new hl11((Object) vt61Var, (Object) cir0Var, (Object) ven0VarV, (byte) 25), x340Var);
            ven0 ven0Var4 = ven0Var;
            vt61Var = vt61Var;
            sjq0Var2 = sjq0Var;
            irn1.u((qim0) null, j2iVarR, (vu30) null, (erl1) null, apo.r(-653054260, new kj21((Object) vt61Var, (Object) az20Var, (Object) ven0Var2, (Object) ven0Var4, (byte) 7), x340Var), x340Var, 24624, 13);
            if (vt61Var.e.b) {
                x340Var.i0(-326068042);
                boolean zI2 = x340Var.i(vt61Var) | x340Var.g(cir0Var);
                Object objT6 = x340Var.T();
                if (zI2 || objT6 == m4cVar) {
                    objT6 = new rt61(vt61Var, cir0Var, (byte) 1);
                    x340Var.s0(objT6);
                }
                q3p1.b(0, 1, (Function0) objT6, x340Var, false);
                x340Var.r(false);
            } else {
                x340Var.i0(-325969059);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(vt61Var, sjq0Var2, i, (byte) 14);
        }
    }

    public final p2r0 d() {
        return this.c.a(new j2i(-13413245, new u841(this, (byte) 19), true));
    }
}
