package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hqv implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ pe21 c;
    public final /* synthetic */ vqv d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ nqm0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ru31 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ cqs0 t;

    public hqv(List list, c380 c380Var, pe21 pe21Var, vqv vqvVar, tob1 tob1Var, nqm0 nqm0Var, boolean z, ru31 ru31Var, boolean z2, cqs0 cqs0Var) {
        this.a = list;
        this.b = c380Var;
        this.c = pe21Var;
        this.d = vqvVar;
        this.e = tob1Var;
        this.f = nqm0Var;
        this.g = z;
        this.h = ru31Var;
        this.i = z2;
        this.t = cqs0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        x340 x340Var;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var2.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var2.e(iIntValue) ? 32 : 16;
        }
        int i2 = i;
        x340 x340Var3 = x340Var2;
        if (x340Var3.Y(i2 & 1, (i2 & 147) != 146)) {
            ftv ftvVar = (ftv) this.a.get(iIntValue);
            x340Var3.i0(-1753851549);
            c380 c380Var = this.b;
            ftv ftvVar2 = (ftv) o7h.t0(iIntValue + 1, c380Var);
            tob1 tob1Var = this.e;
            boolean zI0 = o7h.i0((Set) tob1Var.getValue(), ftvVar2 != null ? ftvVar2.a : null);
            Set set = (Set) tob1Var.getValue();
            ftv ftvVar3 = (ftv) o7h.t0(iIntValue - 1, c380Var);
            boolean zI1 = o7h.i0(set, ftvVar3 != null ? ftvVar3.a : null);
            pe21 pe21Var = this.c;
            vqv vqvVar = this.d;
            if (pe21Var != null) {
                x340Var3.i0(-1753640471);
                z = false;
                t8p1.f(aqb0Var, this.c, ftvVar.a, (qim0) null, (qim0) null, false, apo.r(-610897883, new fqv(vqvVar, this.f, ftvVar, iIntValue, ftvVar2, this.g, this.h, zI0, this.i, zI1, this.t), x340Var3), x340Var3, (i2 & 14) | 1572864);
                x340Var3.r(false);
                x340Var = x340Var3;
            } else {
                z = false;
                x340Var3.i0(-1752678169);
                j2i j2iVarR = apo.r(1174206210, new gqv(vqvVar, ftvVar, iIntValue, ftvVar2, this.g, this.h, zI0, this.i, zI1, this.t), x340Var3);
                x340Var = x340Var3;
                vqvVar.b(48, 1, j2iVarR, x340Var, (qim0) null);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var3.b0();
        }
        return rih1.a;
    }
}
