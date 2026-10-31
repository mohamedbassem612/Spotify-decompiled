package p;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ncx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ j2i i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncx(u390 u390Var, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vu30 vu30Var, j2i j2iVar) {
        super(2);
        this.t = u390Var;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = vu30Var;
        this.i = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.t;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x74.c((vy71) obj3, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(100663297));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ViewParent parent = ((View) x340Var2.k(AndroidCompositionLocals_androidKt.f)).getParent();
                    a4u a4uVar = parent instanceof a4u ? (a4u) parent : null;
                    Window window = a4uVar != null ? a4uVar.getWindow() : null;
                    if (window == null) {
                        x340Var2.i0(184873532);
                    } else {
                        x340Var2.i0(184873533);
                        boolean zG = x340Var2.g(window);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            x74.x(window);
                            x340Var2.s0(rih1Var);
                        }
                    }
                    x340Var2.r(false);
                    x74.c(((u390) obj3).a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, apo.r(2133175719, new rv71(this.i, (byte) 14), x340Var2), x340Var2, 100663296);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncx(vy71 vy71Var, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vu30 vu30Var, j2i j2iVar, int i) {
        super(2);
        this.t = vy71Var;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = vu30Var;
        this.i = j2iVar;
    }
}
