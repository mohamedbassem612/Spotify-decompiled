package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f5b implements Consumer {
    public final /* synthetic */ byte a;
    public final lzn0 b;

    public f5b(lzn0 lzn0Var, bi50 bi50Var) {
        this.a = (byte) 9;
        this.b = lzn0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Boolean boolValueOf = null;
        lzn0 lzn0Var = this.b;
        switch (b) {
            case 0:
                lzn0Var.h(((c5b) obj).g);
                break;
            case 1:
                lzn0Var.e();
                break;
            case 2:
                vyv vyvVar = (vyv) obj;
                Set set = s4b1.f;
                String strZ = uic.x("spotify:edit:profile:pronouns").z();
                if (strZ != null) {
                    Bundle bundle = new Bundle();
                    String str = vyvVar.c;
                    if (str == null) {
                        str = "";
                    }
                    bundle.putString("pronouns", str);
                    lzn0Var.g(bundle, strZ);
                }
                break;
            case 3:
                azv azvVar = (azv) obj;
                String str2 = nik1.f3.a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("kids_avatar_picker_username", azvVar.c);
                bundle2.putString("kids_avatar_picker_display_name", azvVar.b);
                bundle2.putString("kids_avatar_picker_image", azvVar.d);
                Integer num = azvVar.e;
                if (num != null) {
                    bundle2.putInt("kids_avatar_picker_color", num.intValue());
                }
                lzn0Var.g(bundle2, str2);
                break;
            case 4:
                lzn0Var.e();
                break;
            case 5:
                lzn0Var.a(nik1.i4.a, ((adw) obj).a, (Bundle) null);
                break;
            case 6:
                lzn0Var.e();
                break;
            case 7:
                lzn0Var.a(nik1.f4.a, ((fdw) obj).a, (Bundle) null);
                break;
            case 8:
                lzn0Var.h(((c5b) obj).g);
                break;
            case 9:
                Set set2 = s4b1.f;
                lzn0Var.g(pzm.g("com.spotify.blend.tastematch.effecthandlers.group.KEY_IS_INVITE", true), "spotify:blend:story:".concat(uic.x(((z4b) obj).g).h()));
                break;
            case 10:
                lzn0Var.e();
                break;
            case 11:
                tv80 tv80Var = ((zwd0) obj).a;
                if (tv80Var == null) {
                    lzn0Var.h("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties");
                } else {
                    lzn0Var.a("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", tv80Var, (Bundle) null);
                }
                break;
            case 12:
                h101 h101Var = (h101) obj;
                tv80 tv80Var2 = h101Var.b;
                String str3 = h101Var.a;
                if (tv80Var2 == null) {
                    lzn0Var.h(str3);
                } else {
                    lzn0Var.a(str3, tv80Var2, (Bundle) null);
                }
                break;
            case 13:
                hnh hnhVar = (hnh) obj;
                tv80 tv80Var3 = hnhVar.b;
                String str4 = hnhVar.a;
                if (tv80Var3 == null) {
                    lzn0Var.h(str4);
                } else {
                    lzn0Var.a(str4, tv80Var3, (Bundle) null);
                }
                break;
            case 14:
                axd0 axd0Var = (axd0) obj;
                tv80 tv80Var4 = axd0Var.b;
                String str5 = axd0Var.a;
                if (tv80Var4 == null) {
                    lzn0Var.h(str5);
                } else {
                    lzn0Var.a(str5, tv80Var4, (Bundle) null);
                }
                break;
            case 15:
                nqx0 nqx0Var = (nqx0) obj;
                lzn0Var.h(gvg.h("spotify:watch-feed:ai-playlist?sessionId=", nqx0Var.a, "&messageId=", nqx0Var.b));
                break;
            case 16:
                lzn0Var.f(new dwn0(((f0w0) obj).d, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                break;
            case 17:
                lzn0Var.a(nik1.v2.a, ((po61) obj).a, (Bundle) null);
                break;
            case 18:
                ro61 ro61Var = (ro61) obj;
                lzn0Var.a(ro61Var.a, ro61Var.b, (Bundle) null);
                break;
            case 19:
                nlg1 nlg1Var = (nlg1) obj;
                boolean z = nlg1Var.c;
                zzy zzyVar = z ? yzy.b : vzy.b;
                String strA = zzyVar.a(nik1.n0.b("spotify:internal:parental-control:login-choice:" + nlg1Var.b));
                if (z) {
                    yq00 yq00Var = nlg1Var.d;
                    if (yq00Var != null) {
                        boolValueOf = Boolean.valueOf(yq00Var instanceof wq00);
                    }
                } else if (z) {
                    eg.o();
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                Bundle bundleG = mno1.g();
                if (boolValueOf != null) {
                    bundleG.putBoolean("is_free_override", boolValueOf.booleanValue());
                }
                lzn0Var.i(new dwn0(strA, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundleG);
                break;
            case 20:
                lzn0Var.f(new dwn0(cfm0.i("spotify:internal:regular-member-sub-account-details:", ((qlg1) obj).b, nik1.Y3).a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                break;
            default:
                lzn0Var.a(nik1.u2.a, ((pqm1) obj).d, (Bundle) null);
                break;
        }
    }

    public /* synthetic */ f5b(lzn0 lzn0Var, byte b) {
        this.a = b;
        this.b = lzn0Var;
    }
}
