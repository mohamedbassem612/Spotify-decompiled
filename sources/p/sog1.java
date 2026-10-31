package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sog1 extends div {
    public final vx40 m;

    public sog1(Function0 function0, vx40 vx40Var) {
        super(null, "spotify-transsion-card-widget", function0, 90);
        this.m = vx40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.div
    public final void d(Context context, kx5 kx5Var, lnm lnmVar) {
        qog1 qog1Var;
        boolean zBooleanValue;
        if (lnmVar instanceof qog1) {
            qog1Var = (qog1) lnmVar;
            int i = qog1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qog1Var.d = i - Integer.MIN_VALUE;
            } else {
                qog1Var = new qog1(this, (onm) lnmVar);
            }
        } else {
            qog1Var = new qog1(this, (onm) lnmVar);
        }
        Object objU = qog1Var.b;
        int i2 = qog1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objU);
                vx40 vx40Var = this.m;
                qog1Var.a = kx5Var;
                qog1Var.d = 1;
                ((at40) ((idd1) ((ro30) vx40Var.c).c).getValue()).getClass();
                objU = vx40Var.u(kx5Var.a, qog1Var);
                if (objU == d9n.a) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw l1d.v(objU);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                kx5Var = qog1Var.a;
                hm5.M(objU);
            }
            zBooleanValue = ((Boolean) objU).booleanValue();
        } catch (IllegalArgumentException e) {
            Logger.d("[TranssionCardWidget] Failed to resolve appWidgetId from GlanceId=" + kx5Var, new Object[]{e});
            zBooleanValue = false;
        }
        j2i j2iVar = new j2i(-1991067845, new rog1(kx5Var, zBooleanValue, this), true);
        qog1Var.a = null;
        qog1Var.d = 2;
        cev0.I(j2iVar, qog1Var);
    }

    public final void h(WidgetState widgetState, boolean z, b0k b0kVar, int i) {
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1360737509);
        int i2 = (x340Var.i(widgetState) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.h(false) ? 256 : 128) | (x340Var.g(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                str = yon1.G1("PROACTIVE_PLATFORMS_HOME_SCREEN_CARD_WIDGET", "proactive-platforms/home-screen-card-widget", 1563, "proactive-platforms").c;
            } else {
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                str = yon1.G1("PROACTIVE_PLATFORMS_TRANSSION_NPV_WIDGET", "proactive-platforms/transsion-npv-widget", 1568, "proactive-platforms").c;
            }
            String str2 = str;
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            f(widgetState, str2, z ? "TRANSSION_HOME_SCREEN_CARD" : "TRANSSION_HOME_SCREEN", x340Var, i3 | (i4 & 7168) | (i4 & 57344), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ene1(this, widgetState, z, i, (byte) 2);
        }
    }
}
