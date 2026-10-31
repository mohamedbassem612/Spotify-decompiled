package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uj1 implements u331 {
    public final /* synthetic */ byte a;
    public static final uj1 b = new uj1(0);
    public static final uj1 c = new uj1(1);
    public static final uj1 d = new uj1(2);
    public static final uj1 e = new uj1(3);
    public static final uj1 f = new uj1(4);
    public static final uj1 g = new uj1(5);
    public static final uj1 h = new uj1(6);
    public static final uj1 i = new uj1(7);
    public static final uj1 j = new uj1(8);
    public static final uj1 k = new uj1(9);
    public static final uj1 l = new uj1(10);
    public static final uj1 m = new uj1(11);
    public static final uj1 n = new uj1(12);
    public static final uj1 o = new uj1(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uj1 f38p = new uj1(14);
    public static final uj1 q = new uj1(15);
    public static final uj1 r = new uj1(16);
    public static final uj1 s = new uj1(17);
    public static final uj1 t = new uj1(18);
    public static final uj1 u = new uj1(19);
    public static final uj1 v = new uj1(20);
    public static final uj1 w = new uj1(21);
    public static final uj1 x = new uj1(22);
    public static final uj1 y = new uj1(23);
    public static final uj1 z = new uj1(24);
    public static final uj1 A = new uj1(25);
    public static final uj1 B = new uj1(26);
    public static final uj1 C = new uj1(27);
    public static final uj1 D = new uj1(28);
    public static final uj1 E = new uj1(29);

    public /* synthetic */ uj1(byte b2) {
        this.a = b2;
    }

    public static zsh0 c(Bundle bundle) {
        if (bundle != null) {
            return (zsh0) jhc1.t(bundle, "media-picker-extras", zsh0.class);
        }
        return null;
    }

    public static Bundle d(kqo kqoVar) {
        hfm0 hfm0Var = kqoVar.a;
        if (hfm0Var instanceof hfm0) {
            return mno1.h(new mmr0[]{new mmr0("mode_type", "PageResult"), new mmr0("contribution_id", hfm0Var.a)});
        }
        if (hfm0Var instanceof gfm0) {
            gfm0 gfm0Var = (gfm0) hfm0Var;
            return mno1.h(new mmr0[]{new mmr0("mode_type", "ListeningActivityReaction"), new mmr0("entity_uri", gfm0Var.a), new mmr0("activity_username", gfm0Var.b), new mmr0("launch_chat", Boolean.valueOf(gfm0Var.c)), new mmr0("chat_id", gfm0Var.d)});
        }
        eg.o();
        return null;
    }

    @Override // p.u331
    public final Bundle a(Object obj) {
        switch (this.a) {
            case 0:
                return mno1.h(new mmr0[]{new mmr0("provide_result", Boolean.TRUE)});
            case 1:
                yu1 yu1Var = (yu1) obj;
                Bundle bundleG = pzm.g("started_for_result", true);
                bundleG.putString("source_view_uri", yu1Var.a);
                bundleG.putString("source_context_uri", yu1Var.c);
                bundleG.putStringArrayList("item_uris", new ArrayList<>(yu1Var.b));
                bundleG.putParcelable("use_case", yu1Var.e);
                bundleG.putBoolean("force_expanded", yu1Var.d);
                return bundleG;
            case 2:
                return mno1.h(new mmr0[]{new mmr0("artist_releases_category_sheet_parameters", (pu6) obj)});
            case 3:
                return mno1.h(new mmr0[]{new mmr0("artist_releases_filter_sheet_parameters", (jv6) obj)});
            case 4:
                return mno1.h(new mmr0[]{new mmr0("artist_releases_sort_sheet_parameters", (tw6) obj)});
            case 5:
                Bundle bundle = new Bundle();
                bundle.putParcelable("navigation_parameters", (fe7) obj);
                return bundle;
            case 6:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("navigation_parameters", (re7) obj);
                return bundle2;
            case 7:
                return mno1.h(new mmr0[]{new mmr0("assisted_curation_selection_input", (ng7) obj)});
            case 8:
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("blend_prompt_input_page_input", (a3b) obj);
                return bundle3;
            case 9:
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("extra_key", (swb) obj);
                return bundle4;
            case 10:
                jse jseVar = (jse) obj;
                mmr0 mmr0Var = new mmr0("chat_id", jseVar.a);
                mmr0 mmr0Var2 = new mmr0("tab_id", jseVar.b);
                List list = jseVar.c;
                return mno1.h(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("requested_tab_ids", list != null ? new ArrayList(list) : null)});
            case 11:
                return mno1.h(new mmr0[]{new mmr0("chat_id", ((hve) obj).a)});
            case 12:
                qof qofVar = (qof) obj;
                return mno1.h(new mmr0[]{new mmr0("chat_id", qofVar.a), new mmr0("number_of_contributors", Integer.valueOf(qofVar.b))});
            case 13:
                lzk lzkVar = (lzk) obj;
                Bundle bundle5 = new Bundle();
                bundle5.putString("initialPrompt", lzkVar.a);
                bundle5.putString("initialTitle", lzkVar.b);
                bundle5.putString("initialLocation", lzkVar.c);
                return bundle5;
            case 14:
                return mno1.h(new mmr0[]{new mmr0("connector_apps_authentication_input", (mdl) obj)});
            case 15:
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("bluejay_connector_apps_params", (zel) obj);
                return bundle6;
            case 16:
                Bundle bundle7 = new Bundle();
                bundle7.putParcelable("create_playlist_page_contract_input", (cqn) obj);
                return bundle7;
            case 17:
                return d((kqo) obj);
            case 18:
                return mno1.h(new mmr0[]{new mmr0("bluejay_onboarding_edit_customization_input", (dso) obj)});
            case 19:
                return mno1.h(new mmr0[]{new mmr0("bluejay_onboarding_generate_customization_input", (eso) obj)});
            case 20:
                return mno1.h(new mmr0[]{new mmr0("device_location_permission_page_input", (ast) obj)});
            case 21:
                return mno1.h(new mmr0[]{new mmr0("filter_and_sort_config_parameter", (e720) obj)});
            case 22:
                gc50 gc50Var = (gc50) obj;
                Bundle bundle8 = new Bundle();
                bundle8.putString("graduation_view_request_child_id", gc50Var.a);
                bundle8.putString("graduation_view_request_flow", gc50Var.b.name());
                return bundle8;
            case 23:
                Bundle bundle9 = new Bundle();
                bundle9.putParcelable("image-picker-extras", (jx70) obj);
                return bundle9;
            case 24:
                return mno1.h(new mmr0[]{new mmr0("language_picker_parameters", (fcb0) obj)});
            case 25:
                return mno1.h(new mmr0[]{new mmr0("later_in_playlist_input", (hib0) obj)});
            case 26:
                return mno1.h(new mmr0[]{new mmr0("lyrics_share_selector_contract_input", (yof0) obj)});
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                Bundle bundle10 = new Bundle();
                bundle10.putParcelable("media-picker-extras", (zsh0) obj);
                return bundle10;
            case 28:
                return mno1.h(new mmr0[]{new mmr0("extra_bottom_sheet_message", ((dum1) obj).a)});
            default:
                return mno1.h(new mmr0[]{new mmr0("chat_id", ((fgn0) obj).a)});
        }
    }

    @Override // p.u331
    public final Class b() {
        switch (this.a) {
            case 0:
                return nt61.class;
            case 1:
                return hv1.class;
            case 2:
                return qu6.class;
            case 3:
                return kv6.class;
            case 4:
                return uw6.class;
            case 5:
                return qe7.class;
            case 6:
                return qe7.class;
            case 7:
                return og7.class;
            case 8:
                return c3b.class;
            case 9:
                return pxb.class;
            case 10:
                return tse.class;
            case 11:
                return mve.class;
            case 12:
                return vof.class;
            case 13:
                return ke40.class;
            case 14:
                return udl.class;
            case 15:
                return ofl.class;
            case 16:
                return eqn.class;
            case 17:
                return oqo.class;
            case 18:
                return gso.class;
            case 19:
                return hso.class;
            case 20:
                return cst.class;
            case 21:
                return f720.class;
            case 22:
                return oc50.class;
            case 23:
                return Intent.class;
            case 24:
                return jcb0.class;
            case 25:
                return qib0.class;
            case 26:
                return gpf0.class;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return eth0.class;
            case 28:
                return lom0.class;
            default:
                return ggn0.class;
        }
    }

    @Override // p.u331
    public final iu30 getUri() {
        switch (this.a) {
            case 0:
                return uh1.i;
            case 1:
                return im1.Z0;
            case 2:
                return ys6.N0;
            case 3:
                return cv6.c;
            case 4:
                return cv6.i;
            case 5:
                return fz6.e1;
            case 6:
                return ge7.f;
            case 7:
                return ge7.g;
            case 8:
                return rza.X0;
            case 9:
                return iub.e;
            case 10:
                return mle.d1;
            case 11:
                return nve.b;
            case 12:
                return rmf.e;
            case 13:
                return tqk.V0;
            case 14:
                return tqk.b1;
            case 15:
                return tqk.d1;
            case 16:
                return eln.g;
            case 17:
                return eno.g;
            case 18:
                return eno.X;
            case 19:
                return eno.Y;
            case 20:
                return zlt.R0;
            case 21:
                return zs10.V0;
            case 22:
                return r850.Y;
            case 23:
                return vu70.O0;
            case 24:
                return rab0.O0;
            case 25:
                return rab0.T0;
            case 26:
                return klf0.t;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return zdh0.Y0;
            case 28:
                return xjm0.Y;
            default:
                return sbn0.Y;
        }
    }
}
