package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w140 implements xpw {
    public final v5n a;
    public final ggv b;
    public final boolean c;
    public final fgv d = new fgv(2, 2);
    public final js20 e = x3p1.n(new u140(this, (byte) 0), new u140(this, (byte) 1), bp30.N0, (o8n) null, (iu30) null, 24);
    public final eih1 f = new eih1();
    public final psw g;

    public w140(v5n v5nVar, ggv ggvVar, boolean z) {
        this.a = v5nVar;
        this.b = ggvVar;
        this.c = z;
        j2i j2iVar = cqi.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0105  */
    public final s140 e(n140 n140Var, Map map) {
        Object obj = n140Var.a;
        boolean z = n140Var.e;
        int i = n140Var.c;
        eww0 eww0Var = (eww0) map.get(obj);
        z040 z040Var = n140Var.d;
        boolean z2 = z040Var instanceof y040;
        fgv fgvVar = this.d;
        ggv ggvVar = this.b;
        boolean z3 = this.c;
        if (z2) {
            String str = n140Var.a;
            return new s140(new r140(str, n140Var.b, eww0Var != null ? eww0Var.b : str, eww0Var != null ? eww0Var.f : null, false, (String) null), new p140(i > 0 ? ggvVar.a(i, fgvVar) : null), z3, z);
        }
        if (!(z040Var instanceof x040)) {
            eg.o();
            return null;
        }
        ice iceVar = ((x040) z040Var).a;
        String str2 = iceVar.b;
        int i2 = iceVar.c;
        ggi1 ggi1Var = iceVar.a;
        Integer num = ggi1Var.b;
        eww0 eww0Var2 = (eww0) map.get(str2);
        String strA = i > 0 ? ggvVar.a(i, fgvVar) : null;
        boolean z4 = false;
        int iIntValue = num != null ? num.intValue() : 0;
        String strA2 = iIntValue > 0 ? ggvVar.a(iIntValue, fgvVar) : null;
        boolean z5 = t140.a[l1d.C(i2)] == 1;
        int iIntValue2 = num != null ? num.intValue() : 0;
        boolean z6 = z5 && i < iIntValue2 && i > 0;
        boolean z7 = z5 && iIntValue2 < i && iIntValue2 > 0;
        String str3 = n140Var.a;
        r140 r140Var = new r140(str3, n140Var.b, eww0Var != null ? eww0Var.b : str3, eww0Var != null ? eww0Var.f : null, z6, strA);
        r140 r140Var2 = new r140(str2, ggi1Var.a, eww0Var2 != null ? eww0Var2.b : str2, eww0Var2 != null ? eww0Var2.f : null, z7, strA2);
        int iC = l1d.C(i2);
        if (iC == 0) {
            if (i < (num != null ? num.intValue() : 0)) {
                z4 = true;
            }
        } else if (iC == 1) {
            z4 = true;
        } else if (iC != 2 && iC != 3) {
            eg.o();
            return null;
        }
        r140 r140Var3 = (z4 || z5) ? r140Var : r140Var2;
        if (!z4 && !z5) {
            r140Var2 = r140Var;
        }
        return new s140(r140Var, new o140(r140Var3, r140Var2, z5, iceVar.d.a), z3, z);
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
