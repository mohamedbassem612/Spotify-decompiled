package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.ResultReceiver;
import android.os.Trace;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class sjf1 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjf1() {
        super(0, mif1.b, mif1.class, "endSection", "endSection()V", 0);
        this.a = (byte) 22;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ujf1 ujf1Var = (ujf1) ((lyc) this).receiver;
                nu9 nu9Var = new nu9(ujf1Var.j0());
                nu9Var.m(ujf1Var);
                nu9Var.f();
                return rih1Var;
            case 1:
                rah1 rah1Var = (rah1) ((lyc) this).receiver;
                rah1Var.o.a(ixb.c);
                ResultReceiver resultReceiver = rah1Var.a.b;
                if (resultReceiver != null) {
                    resultReceiver.send(-1, null);
                }
                return rih1Var;
            case 2:
                ((pua0) ((lyc) this).receiver).dispose();
                return rih1Var;
            case 3:
                ((Activity) ((lyc) this).receiver).finish();
                return rih1Var;
            case 4:
                y8i1 y8i1Var = (y8i1) ((lyc) this).receiver;
                e490 e490Var = y8i1Var.f;
                Activity activity = y8i1Var.d;
                if (e490Var == e490.a) {
                    activity.finish();
                } else {
                    activity.startActivity(new Intent().setComponent(new ComponentName(activity, "com.spotify.app.music.debugtools.menu.DebugMenuActivity")).addFlags(537001984));
                    activity.finish();
                }
                return rih1Var;
            case 5:
                l9i1 l9i1Var = (l9i1) ((lyc) this).receiver;
                fn31.T(l9i1Var.i, (o8n) null, 0, new i7u0(l9i1Var, (lnm) null, (byte) 14), 3);
                return rih1Var;
            case 6:
                return ((pk00) ((lyc) this).receiver).a();
            case 7:
                ((cej1) ((lyc) this).receiver).c();
                return rih1Var;
            case 8:
                ((cej1) ((lyc) this).receiver).d();
                return rih1Var;
            case 9:
                ((cej1) ((lyc) this).receiver).c();
                return rih1Var;
            case 10:
                ((cej1) ((lyc) this).receiver).c();
                return rih1Var;
            case 11:
                ((cej1) ((lyc) this).receiver).d();
                return rih1Var;
            case 12:
                ((cej1) ((lyc) this).receiver).c();
                return rih1Var;
            case 13:
                ((cej1) ((lyc) this).receiver).c();
                return rih1Var;
            case 14:
                ((cej1) ((lyc) this).receiver).d();
                return rih1Var;
            case 15:
                q7m0 q7m0Var = (q7m0) ((lyc) this).receiver;
                w2l1 w2l1Var = q7m0Var.j;
                w2l1Var.a.remove(q7m0Var.a);
                for (rcm1 rcm1Var : q7m0Var.b.w) {
                    rcm1Var.c = false;
                    rcm1Var.b.dispose();
                }
                return rih1Var;
            case 16:
                return ((pk00) ((lyc) this).receiver).a();
            case 17:
                return ((pk00) ((lyc) this).receiver).a();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                tac0 tac0Var = ((xal1) ((lyc) this).receiver).a;
                if (tac0Var.i != w8c0.a) {
                    tac0Var.i(w8c0.c);
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((vbl1) ((lyc) this).receiver).c.a(fcl1.a);
                return rih1Var;
            case 20:
                ((vbl1) ((lyc) this).receiver).c.a(ccl1.a);
                return rih1Var;
            case 21:
                o0i o0iVar = (o0i) ((obm1) ((lyc) this).receiver).a.c.getValue();
                if (o0iVar != null) {
                    o0iVar.d.A();
                }
                return rih1Var;
            default:
                Trace.endSection();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sjf1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjf1(pua0 pua0Var) {
        super(0, pua0Var, pua0.class, "dispose", "dispose()V", 0);
        this.a = (byte) 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjf1(l9i1 l9i1Var) {
        super(0, l9i1Var, l9i1.class, "handleShakeDetected", "handleShakeDetected()V", 0);
        this.a = (byte) 5;
    }
}
