package p;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qb91 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ksg c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Function0 g;

    public qb91(boolean z, iu30 iu30Var, ksg ksgVar, int i, boolean z2, float f, Function0 function0) {
        this.a = z;
        this.b = iu30Var;
        this.c = ksgVar;
        this.d = i;
        this.e = z2;
        this.f = f;
        this.g = function0;
    }

    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((cpa0) obj).a;
        if (!this.a) {
            return Boolean.FALSE;
        }
        iu30 iu30Var = this.b;
        if (iu30Var == null) {
            return Boolean.FALSE;
        }
        int iT = ern1.t(keyEvent);
        boolean z = false;
        if (iT == 2) {
            ksg ksgVar = this.c;
            float fAbs = Math.abs(((Number) ksgVar.n()).floatValue() - ((Number) ksgVar.m()).floatValue());
            int i = this.d;
            int i2 = i > 0 ? i + 1 : 100;
            float f = fAbs / i2;
            int i3 = this.e ? -1 : 1;
            long jD = mno1.d(keyEvent.getKeyCode());
            boolean zA = toa0.a(jD, toa0.e);
            float f2 = this.f;
            if (zA) {
                iu30Var.invoke(yoi1.u(Float.valueOf((i3 * f) + f2), ksgVar));
            } else if (toa0.a(jD, toa0.f)) {
                iu30Var.invoke(yoi1.u(Float.valueOf(f2 - (i3 * f)), ksgVar));
            } else if (toa0.a(jD, toa0.h)) {
                iu30Var.invoke(yoi1.u(Float.valueOf((i3 * f) + f2), ksgVar));
            } else if (toa0.a(jD, toa0.g)) {
                iu30Var.invoke(yoi1.u(Float.valueOf(f2 - (i3 * f)), ksgVar));
            } else if (toa0.a(jD, toa0.w)) {
                iu30Var.invoke(ksgVar.m());
            } else if (toa0.a(jD, toa0.x)) {
                iu30Var.invoke(ksgVar.n());
            } else if (toa0.a(jD, toa0.D)) {
                iu30Var.invoke(yoi1.u(Float.valueOf(f2 - (yoi1.p(i2 / 10, 1, 10) * f)), ksgVar));
            } else if (toa0.a(jD, toa0.E)) {
                iu30Var.invoke(yoi1.u(Float.valueOf((yoi1.p(i2 / 10, 1, 10) * f) + f2), ksgVar));
            }
            z = true;
        } else if (iT == 1) {
            long jD2 = mno1.d(keyEvent.getKeyCode());
            if (toa0.a(jD2, toa0.e) || toa0.a(jD2, toa0.f) || toa0.a(jD2, toa0.h) || toa0.a(jD2, toa0.g) || toa0.a(jD2, toa0.w) || toa0.a(jD2, toa0.x) || toa0.a(jD2, toa0.D) || toa0.a(jD2, toa0.E)) {
                Function0 function0 = this.g;
                if (function0 != null) {
                    function0.invoke();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
