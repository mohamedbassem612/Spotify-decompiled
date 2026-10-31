package p;

import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class l1k extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1k(byte b) {
        super(0, uo5.i, ejn.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
        this.a = b;
        switch (b) {
            case 15:
                super(0, uo5.i, ejn.class, "isBlockingThread", "isBlockingThread()Z", 0);
                break;
            case 16:
                super(0, uo5.i, ejn.class, "isNotMainThread", "isNotMainThread()Z", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((jto) ((lyc) this).receiver).dispose();
                return rih1.a;
            case 1:
                return Long.valueOf(((yqg) ((lyc) this).receiver).b());
            case 2:
                ((p1l) ((lyc) this).receiver).e();
                return rih1.a;
            case 3:
                return (n1n0) ((kly0) ((lyc) this).receiver).get();
            case 4:
                ((p1m) ((lyc) this).receiver).a(ozl.a);
                return rih1.a;
            case 5:
                ((p1m) ((lyc) this).receiver).a(vzl.a);
                return rih1.a;
            case 6:
                ((p1m) ((lyc) this).receiver).a(xzl.a);
                return rih1.a;
            case 7:
                ((p1m) ((lyc) this).receiver).a(vzl.a);
                return rih1.a;
            case 8:
                ((p1m) ((lyc) this).receiver).a(szl.a);
                return rih1.a;
            case 9:
                ((ozg) ((lyc) this).receiver).b.t(0.0f);
                return rih1.a;
            case 10:
                ((p1m) ((lyc) this).receiver).a(szl.a);
                return rih1.a;
            case 11:
                ((rfm) ((lyc) this).receiver).dismiss();
                return rih1.a;
            case 12:
                ((rfm) ((lyc) this).receiver).dismiss();
                return rih1.a;
            case 13:
                ((s0u) ((lyc) this).receiver).getClass();
                return s0u.f;
            case 14:
                ((ejn) ((lyc) this).receiver).getClass();
                return Boolean.valueOf(ihc1.h0(Thread.currentThread().getName(), "Firebase Background Thread #", false));
            case 15:
                ((ejn) ((lyc) this).receiver).getClass();
                return Boolean.valueOf(ihc1.h0(Thread.currentThread().getName(), "Firebase Blocking Thread #", false));
            case 16:
                ((ejn) ((lyc) this).receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 17:
                ((jto) ((lyc) this).receiver).dispose();
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                s0s s0sVar = (s0s) ((lyc) this).receiver;
                gv50 gv50Var = ((q260) s0sVar.b.a.getValue()).b;
                if (gv50Var != null) {
                    s0sVar.c.a(gv50Var);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                es20 es20Var = (es20) ((lyc) this).receiver;
                if (es20Var.i.getValue() != null && !((gw20) es20Var.e.getValue()).c) {
                    es20Var.d();
                }
                return rih1.a;
            case 20:
                ((es20) ((lyc) this).receiver).i.l((Object) null);
                return rih1.a;
            case 21:
                return (s1r) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return Long.valueOf(((qzr) ((lyc) this).receiver).a.b());
            case 23:
                ((q0s) ((lyc) this).receiver).getClass();
                qk50 qk50Var = new qk50("fake-groupable-1", (String) null, (String) null, (String) null);
                g0u g0uVar = g0u.e;
                mk50 mk50Var = new mk50(false, false);
                gq50 gq50Var = gq50.c;
                return new fj50(p7h.M(new lk50[]{new lk50(qk50Var, "Bedroom Speaker", g0uVar, "Sonos One", mk50Var, gq50Var, (rk50) null), new lk50(new qk50("fake-groupable-2", (String) null, (String) null, (String) null), "Office Speaker", g0uVar, "Sonos Era", new mk50(false, false), gq50Var, (rk50) null)}), new ki50(8));
            case 24:
                ((r0s) ((lyc) this).receiver).getClass();
                qk50 qk50Var2 = new qk50("fake-grouped-1", (String) null, (String) null, (String) null);
                g0u g0uVar2 = g0u.e;
                mk50 mk50Var2 = new mk50(true, false);
                gq50 gq50Var2 = gq50.b;
                return new fj50(p7h.M(new lk50[]{new lk50(qk50Var2, "Living Room Speaker", g0uVar2, "Sonos One", mk50Var2, gq50Var2, new rk50(0.65d, 100)), new lk50(new qk50("fake-grouped-2", (String) null, (String) null, (String) null), "Kitchen Speaker", g0uVar2, "Sonos Era", new mk50(true, true), gq50Var2, new rk50(0.45d, 100)), new lk50(new qk50("fake-grouped-3", (String) null, (String) null, (String) null), "Bose Speaker", g0uVar2, "Bose", new mk50(false, false), gq50Var2, new rk50(0.4d, (Integer) null))}), new ki50(8));
            case 25:
                int[] iArr = new int[2];
                ConstraintLayout constraintLayout = ((tcs) ((lyc) this).receiver).A1;
                if (constraintLayout != null) {
                    constraintLayout.getLocationInWindow(iArr);
                    return Integer.valueOf(iArr[1]);
                }
                u890.C("playbackControlsContainer");
                throw null;
            case 26:
                ((PeekScrollView) ((lyc) this).receiver).o();
                return rih1.a;
            case 27:
                ((cks) ((lyc) this).receiver).a();
                return rih1.a;
            case 28:
                return ((g3e1) ((lyc) this).receiver).R();
            default:
                return Long.valueOf(((g1t) ((lyc) this).receiver).a.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1k(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
