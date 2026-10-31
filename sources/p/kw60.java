package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kw60 implements h0r0 {
    public final ye90 a;
    public final mjp b;
    public final oac0 c;
    public final vu60 d;
    public final nw60 e;
    public final Resources f;
    public final idd1 g;
    public final cbr0 h;

    public kw60(ye90 ye90Var, mjp mjpVar, oac0 oac0Var, vu60 vu60Var, los losVar, nw60 nw60Var, Resources resources) {
        this.a = ye90Var;
        this.b = mjpVar;
        this.c = oac0Var;
        this.d = vu60Var;
        this.e = nw60Var;
        this.f = resources;
        idd1 idd1Var = new idd1(new g050(this, (byte) 22));
        this.g = idd1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{new bn70(yon1.k2(), nik1.w5, (nar0) null), new nxb(Integer.valueOf(((Number) idd1Var.getValue()).intValue()), ixb.a, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, null, losVar, false, false, false, null, 4056), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        os60 os60Var = (os60) d5p1.h(this.d.e).a.getValue();
        ms60 ms60Var = os60Var != null ? os60Var.b : null;
        j2i j2iVar = new j2i(-923078462, new cex(this, ms60Var instanceof ls60 ? (ls60) ms60Var : null, (byte) 23), true);
        ye90 ye90Var = this.a;
        return ((ix81) ye90Var.b).a(new vq80(ye90Var, j2iVar, (byte) 9));
    }

    public final int c() {
        os60 os60Var = (os60) d5p1.h(this.d.e).a.getValue();
        ms60 ms60Var = os60Var != null ? os60Var.b : null;
        ls60 ls60Var = ms60Var instanceof ls60 ? (ls60) ms60Var : null;
        if (ls60Var != null) {
            return ls60Var.b.a.size();
        }
        return 0;
    }

    public final int d(Integer num, int i) {
        Resources resources = this.f;
        if (i > 1) {
            return (int) (resources.getDisplayMetrics().heightPixels * 0.66f);
        }
        int iIntValue = num != null ? num.intValue() : (int) (resources.getConfiguration().fontScale * 340.0f * resources.getDisplayMetrics().density);
        int i2 = (int) (resources.getDisplayMetrics().heightPixels * 0.66f);
        return iIntValue > i2 ? i2 : iIntValue;
    }
}
