package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rx90 implements h0r0 {
    public final vx40 a;
    public final xw90 b;
    public final xv90 c;
    public final a1r0 d;
    public final tx90 e;
    public final c9c0 f;
    public final y5a0 g;
    public final b0a0 h;
    public final st60 i;
    public final d6d0 j;
    public final idd1 k;
    public final cbr0 l;

    public rx90(vx40 vx40Var, xw90 xw90Var, xv90 xv90Var, a1r0 a1r0Var, tx90 tx90Var, c9c0 c9c0Var, y5a0 y5a0Var, b0a0 b0a0Var, st60 st60Var, Resources resources, d6d0 d6d0Var) {
        this.a = vx40Var;
        this.b = xw90Var;
        this.c = xv90Var;
        this.d = a1r0Var;
        this.e = tx90Var;
        this.f = c9c0Var;
        this.g = y5a0Var;
        this.h = b0a0Var;
        this.i = st60Var;
        this.j = d6d0Var;
        idd1 idd1Var = new idd1(new pr90(this, (byte) 2));
        this.k = idd1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.l = new cbr0(new dbr0[]{new bn70(yon1.G1("JAM_MANAGEPARTICIPANTSSHEET", "jam/manageparticipantssheet", 865, "jam"), nik1.t5, new qbl0(tx90Var.a)), new t1r0(true), new nxb(Integer.valueOf(((Number) idd1Var.getValue()).intValue()), ixb.a, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, null, null, false, false, false, null, 4088), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.l;
    }

    public final p2r0 b() {
        j2i j2iVar = new j2i(-1573716141, new yy80(this, (byte) 9), true);
        vx40 vx40Var = this.a;
        return ((ix81) vx40Var.b).a(new vq80(vx40Var, j2iVar, (byte) 8));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1574650967);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new bu(this, (lnm) null, (byte) 20);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new px90(this, i, (byte) 0);
        }
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1867262666);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new no70(this, (lnm) null, (byte) 11);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new px90(this, i, (byte) 1);
        }
    }
}
