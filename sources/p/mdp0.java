package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class mdp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdp0(Object obj, byte b) {
        super(0, obj, aip0.class, "currentTimeMonotonic", "currentTimeMonotonic()J", 0);
        this.a = b;
        switch (b) {
            case 21:
                super(0, obj, aip0.class, "currentTimeWallClock", "currentTimeWallClock()J", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke() {
        xg30 xg30VarA;
        byte b = this.a;
        String str = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (fpu) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (ooe1) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (mut0) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (ooe1) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (xrc0) ((kly0) ((lyc) this).receiver).get();
            case grn1.d /* 12 */:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (dma1) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 18:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 19:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return Long.valueOf(((aip0) ((lyc) this).receiver).a());
            case 21:
                ((aip0) ((lyc) this).receiver).getClass();
                return Long.valueOf(b9p1.m(System.currentTimeMillis()));
            case 22:
                k241 k241Var = ((des) ((lyc) this).receiver).a.p1;
                if (k241Var != null && k241Var.c != null) {
                    k241Var.c();
                    if (k241Var.c != null) {
                        eg.m("Loader is already running.");
                        return null;
                    }
                    k241Var.c = k241Var.a.subscribe(new fv5(k241Var, (byte) 17));
                }
                return rih1Var;
            case 23:
                ((r1q0) ((lyc) this).receiver).f();
                return rih1Var;
            case 24:
                ((r1q0) ((lyc) this).receiver).f();
                return rih1Var;
            case 25:
                zvq0 zvq0Var = (zvq0) ((lyc) this).receiver;
                yun0 yun0Var = zvq0Var.a;
                if (zvq0Var.e == null && (yun0Var.h() instanceof vun0)) {
                    yun0Var.o(yun0Var.h());
                }
                return rih1Var;
            case 26:
                zvq0 zvq0Var2 = (zvq0) ((lyc) this).receiver;
                qwn0 qwn0Var = zvq0Var2.b;
                yun0 yun0Var2 = zvq0Var2.a;
                xun0 xun0VarH = yun0Var2.h();
                if (xun0VarH != null && (xg30VarA = xun0VarH.a()) != null) {
                    str = xg30VarA.a;
                }
                qwn0Var.b.m(str);
                yun0Var2.k();
                zvq0Var2.c.a();
                return rih1Var;
            case 27:
                ((w0r0) ((lyc) this).receiver).f();
                return rih1Var;
            case 28:
                ((w0r0) ((lyc) this).receiver).p();
                return rih1Var;
            default:
                ((w0r0) ((lyc) this).receiver).p();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mdp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdp0(r1q0 r1q0Var, byte b) {
        super(0, r1q0Var, r1q0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        this.a = b;
        switch (b) {
            case 24:
                super(0, r1q0Var, r1q0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
                break;
            default:
                break;
        }
    }
}
