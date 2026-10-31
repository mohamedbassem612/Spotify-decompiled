package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x0q implements jly0 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final boolean c;
    public final dl4 d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x0q(daq daqVar, dl4 dl4Var, int i, byte b) {
        this.a = b;
        this.b = daqVar;
        this.d = dl4Var;
        this.c = i;
    }

    public final Object get() {
        byte b = this.a;
        daq daqVar = this.b;
        k9k k9kVar = this.d;
        boolean z = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                qqp qqpVar = (qqp) k9kVar;
                ChoiceScreenUcActivity choiceScreenUcActivity = (ChoiceScreenUcActivity) qqpVar.d;
                if (!z) {
                    c2r0 c2r0Var = (c2r0) daqVar.hm.get();
                    bma1 bma1Var = u5g.a;
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    return c2r0Var.e(choiceScreenUcActivity, yon1.G1("CHECKOUT_CHOICESCREEN_UC", "checkout/choicescreen-uc", 334, "checkout"), new lik1("spotify:checkout:choice-screen-uc").a());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                hik1 hik1Var = (hik1) daqVar.zm.get();
                b2r0 b2r0Var = (b2r0) ((jly0) qqpVar.b).get();
                bma1 bma1Var2 = u5g.a;
                return hik1Var.a(choiceScreenUcActivity, b2r0Var);
            case 1:
                qqp qqpVar2 = (qqp) k9kVar;
                GoogleCheckoutActivity googleCheckoutActivity = (GoogleCheckoutActivity) qqpVar2.d;
                if (!z) {
                    c2r0 c2r0Var2 = (c2r0) daqVar.hm.get();
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    return c2r0Var2.e(googleCheckoutActivity, yon1.G1("CHECKOUT_GPB", "checkout/gpb", 337, "checkout"), new lik1("spotify:checkout:gpb").a());
                }
                if (z) {
                    return ((hik1) daqVar.zm.get()).a(googleCheckoutActivity, (b2r0) ((jly0) qqpVar2.b).get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 2:
                qqp qqpVar3 = (qqp) k9kVar;
                if (!z) {
                    return new t1o0((i8h1) daqVar.A5.get(), new xok0((byte) 9), (q1o0) ((x0q) qqpVar3.c).get(), (d3o0) daqVar.E2.get(), new o2o0(qqpVar3.a()));
                }
                if (z) {
                    return new q1o0((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (Flowable) daqVar.z2.get(), (Scheduler) daqVar.A2.get(), (Scheduler) daqVar.z1.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 3:
                g1i g1iVar = (g1i) k9kVar;
                daq daqVar2 = (daq) g1iVar.b;
                if (!z) {
                    return new c1s0((g1s0) ((jly0) g1iVar.d).get(), (dxz0) daqVar.I4.get(), (u0s0) ((jly0) g1iVar.e).get(), new lze0((Flowable) daqVar2.z2.get()), new bjx((g1s0) ((jly0) g1iVar.d).get(), (i8h1) daqVar2.A5.get(), new pdl0((byte) 6), (xov0) daqVar2.D6.get(), new lvc((t2j0) daqVar2.f2.get())), new mka((byte) 19));
                }
                if (z) {
                    h72 h72Var = (h72) g1iVar.c;
                    return new g1s0(new vrv0(new w741((PartnerAccountLinkingActivity) h72Var.b, false), (x0s0) ((jly0) h72Var.Y).get(), new d1s0(false, false, (luk) daqVar2.L1.get()), new g741((Context) daqVar2.x1.a)), new ep31(j310.q((RetrofitMaker) daqVar2.Y3.get()), (byte) 2), new g741((Context) daqVar2.x1.a), new g931((f741) daqVar2.a.l1.get(), (Context) daqVar2.x1.a, (q8n) daqVar2.E1.get(), (byte) 8));
                }
                jah.e(z ? 1 : 0);
                return null;
            case 4:
                if (!z) {
                    return new b3q(this, b2);
                }
                if (z) {
                    return "SpotOnService";
                }
                jah.e(z ? 1 : 0);
                return null;
            default:
                k9k k9kVar2 = k9kVar;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    c2r0 c2r0Var3 = (c2r0) daqVar.hm.get();
                    String str = (String) ((jly0) k9kVar2.e).get();
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    return c2r0Var3.d(yon1.G1("BLEND_ENTITY_TRACKAFFILIATION", "blend/entity/trackaffiliation", 219, "blend"), new qir0(str));
                }
                xjf1 parcelable = ((ujf1) k9kVar2.b).O0().getParcelable("key-view-data");
                parcelable.getClass();
                xjf1 xjf1Var = parcelable;
                Set set = s4b1.f;
                String strZ = uic.x("spotify:blend:track-affiliation:" + xjf1Var.a + ":" + xjf1Var.b).z();
                strZ.getClass();
                return strZ;
        }
    }
}
