package p;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jbf1 extends hab0 implements Function0 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ wgm1 Y;
    public final /* synthetic */ ven0 Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ iv21 b;
    public final /* synthetic */ lf6 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ cj40 e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ rk41 g;
    public final /* synthetic */ qam1 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ jfe t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbf1(int i, iv21 iv21Var, lf6 lf6Var, c9n c9nVar, cj40 cj40Var, Map map, rk41 rk41Var, qam1 qam1Var, ven0 ven0Var, jfe jfeVar, ven0 ven0Var2, wgm1 wgm1Var, ven0 ven0Var3) {
        super(0);
        this.a = i;
        this.b = iv21Var;
        this.c = lf6Var;
        this.d = c9nVar;
        this.e = cj40Var;
        this.f = map;
        this.g = rk41Var;
        this.h = qam1Var;
        this.i = ven0Var;
        this.t = jfeVar;
        this.X = ven0Var2;
        this.Y = wgm1Var;
        this.Z = ven0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[PHI: r5
      0x0090: PHI (r5v1 int) = (r5v0 int), (r5v3 int), (r5v4 int) binds: [B:31:0x0081, B:35:0x0088, B:37:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke() {
        int i;
        xhm1 xhm1Var;
        ven0 ven0Var = this.i;
        Integer num = (Integer) ven0Var.getValue();
        int i2 = 1;
        boolean z = this.b.c != null;
        lf6 lf6Var = this.c;
        boolean z2 = ((fbf1) lf6Var.f).e;
        int i3 = this.a;
        boolean z3 = num == null || num.intValue() != i3;
        boolean z4 = !z3 && z;
        boolean z5 = (z3 || z4) && z2;
        String str = null;
        if (z4) {
            fn31.T(this.d, (o8n) null, 0, new w3b(this.t, null, (byte) 2), 3);
        }
        cj40 cj40Var = this.e;
        if (!cj40Var.d.isEmpty()) {
            int iIntValue = ((Number) this.f.getOrDefault(Integer.valueOf(i3), 0)).intValue();
            ArrayList arrayList = cj40Var.d;
            sju sjuVar = ((rx7) arrayList.get(iIntValue % arrayList.size())).c;
            if (sjuVar != null) {
                str = sjuVar.c;
            }
        }
        String str2 = str;
        int i4 = i3 + 1;
        if (i4 == 1) {
            i = i2;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 != 3) {
            i2 = 4;
            if (i4 != 4) {
                i2 = 5;
                if (i4 != 5) {
                    i = 0;
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
        } else {
            i = 3;
        }
        if (i != 0 && (xhm1Var = (xhm1) this.X.getValue()) != null) {
            ((ard1) lf6Var.h).b(xhm1Var, zqd1.a, this.a, str2, i);
        }
        ven0Var.setValue(Integer.valueOf(i3));
        ven0 ven0Var2 = this.Z;
        int i5 = this.a;
        wgm1 wgm1Var = this.Y;
        Map map = this.f;
        rk41 rk41Var = this.g;
        lf6.e(wgm1Var, lf6Var, map, rk41Var, ven0Var2, i5);
        ((xgm1) rk41Var.c).a(new qgm1(Integer.valueOf(i3), false));
        if (z5) {
            sam1.b(this.h);
        }
        return rih1.a;
    }
}
