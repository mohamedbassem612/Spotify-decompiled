package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bzg1 extends f311 {
    public final gyg1 a;
    public final wj31 b;
    public final List c;
    public final boolean d;
    public final zob1 e;
    public final wyg1 f;
    public final hcf1 g;
    public final xyg1 h;
    public final Function0 i;
    public final boolean j;
    public final iu30 k;
    public final ok41 l;

    public bzg1(gyg1 gyg1Var, wj31 wj31Var, List list, boolean z, zob1 zob1Var, wyg1 wyg1Var, hcf1 hcf1Var, xyg1 xyg1Var, boolean z2, yyg1 yyg1Var) {
        q9f1 q9f1Var = q9f1.b1;
        this.a = gyg1Var;
        this.b = wj31Var;
        this.c = list;
        this.d = z;
        this.e = zob1Var;
        this.f = wyg1Var;
        this.g = hcf1Var;
        this.h = xyg1Var;
        this.i = q9f1Var;
        this.j = z2;
        this.k = yyg1Var;
        this.l = new ok41(1866);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        i2c i2cVar2;
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1677561721);
        if ((i & 6) == 0) {
            i2cVar2 = i2cVar;
            i2 = (b0kVar3.g(i2cVar2) ? 4 : 2) | i;
        } else {
            i2cVar2 = i2cVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1043) != 1042)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                this.i.invoke();
                b0kVar3.s0(rih1.a);
            }
            ven0 ven0VarH = rwq.h(this.e, b0kVar3, 0);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            b0kVar2 = b0kVar3;
            ern1.m(i2cVar2, this.a, this.b, this.c, true, this.d, ((Boolean) ven0Var.getValue()).booleanValue(), rk41Var, this.g, this.h, this.k, b0kVar2, (i2 & 14) | 24576 | ((i2 << 18) & 29360128));
            int i3 = this.j ? 0 : 1666;
            pxg1 pxg1VarO0 = irn1.o0(i3, 0, (dlv) null, 6);
            Integer numValueOf = Integer.valueOf(i3);
            tzg1 tzg1Var = rno1.b;
            zod.R(new hsi1("locationRevealTimeout", 0, numValueOf, pxg1VarO0, tzg1Var), rk41Var.a, this.f, b0kVar2, 8, 0);
            hsi1 hsi1Var = new hsi1("profileRevealHandoff", 0, 200, irn1.o0(200, 0, (dlv) null, 6), tzg1Var);
            boolean z = rk41Var.a || !((Boolean) ven0VarH.getValue()).booleanValue();
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar) {
                objT3 = new aya1(ven0Var, (byte) 17);
                b0kVar2.s0(objT3);
            }
            zod.R(hsi1Var, z, (Function0) objT3, b0kVar2, 392, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, i2cVar, rk41Var, function0, (byte) 12);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.l;
    }
}
