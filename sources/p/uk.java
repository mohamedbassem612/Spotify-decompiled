package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uk implements ne41 {
    public final /* synthetic */ byte a;
    public final Object b;

    public uk(oe41 oe41Var) {
        this.a = (byte) 15;
        this.b = new LinkedHashSet();
        oe41Var.c("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        Integer numValueOf;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                xk xkVar = (xk) obj;
                bundle.putParcelable("account_creation_flow_model", xkVar.c);
                bundle.putParcelableArrayList("account_creation_flow_steps", new ArrayList<>(xkVar.d));
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("STATE_KEY_SHOWN_ERROR", ((ChoiceScreenUcActivity) obj).x1);
                return bundle2;
            case 2:
                Bundle bundle3 = new Bundle();
                ((c8l) ((fdc) obj).e).f(bundle3);
                return bundle3;
            case 3:
                return (Bundle) ((Function0) obj).invoke();
            case 4:
                akr akrVar = (akr) obj;
                BottomSheetBehavior bottomSheetBehavior = akrVar.l;
                if (bottomSheetBehavior != null) {
                    numValueOf = Integer.valueOf(bottomSheetBehavior.e ? -1 : bottomSheetBehavior.d);
                } else {
                    numValueOf = null;
                }
                mmr0 mmr0Var = new mmr0("peekHeight", numValueOf);
                BottomSheetBehavior bottomSheetBehavior2 = akrVar.l;
                mmr0 mmr0Var2 = new mmr0("maxWidth", bottomSheetBehavior2 != null ? Integer.valueOf(bottomSheetBehavior2.j) : null);
                BottomSheetBehavior bottomSheetBehavior3 = akrVar.l;
                mmr0 mmr0Var3 = new mmr0("isDraggable", bottomSheetBehavior3 != null ? Boolean.valueOf(bottomSheetBehavior3.F) : null);
                BottomSheetBehavior bottomSheetBehavior4 = akrVar.l;
                return mno1.h(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, new mmr0("skipCollapsed", bottomSheetBehavior4 != null ? Boolean.valueOf(bottomSheetBehavior4.E) : null)});
            case 5:
                zh30 zh30Var = (zh30) obj;
                lmw lmwVar = zh30Var.i;
                while (zh30.c(lmwVar.t())) {
                }
                zh30Var.t.g(k8c0.ON_CREATE);
                Bundle bundle4 = new Bundle();
                ai30 ai30Var = ((tg30) lmwVar.b).g;
                if (((th30) ai30Var).x instanceof qe41) {
                    ai30Var.o0(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
                    throw null;
                }
                Bundle bundleE0 = ai30Var.e0();
                Parcelable parcelable = bundleE0.isEmpty() ? null : bundleE0;
                if (parcelable != null) {
                    bundle4.putParcelable("android:support:spotify:fragments", parcelable);
                }
                return bundle4;
            case 6:
                h950 h950Var = (h950) obj;
                Bundle bundle5 = new Bundle();
                xa50 xa50Var = h950Var.h;
                if (xa50Var != null) {
                    bundle5.putSerializable("graduation_status", xa50Var);
                }
                String str = h950Var.i;
                if (str != null) {
                    bundle5.putString("current_message", str);
                }
                return bundle5;
            case 7:
                Bundle bundle6 = new Bundle();
                rmc0 rmc0VarListIterator = ((smc0) ((lmw) ((st60) obj).c).b).listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (!rmc0Var.hasNext()) {
                        return bundle6;
                    }
                    ((cyf0) ((ynb0) rmc0Var.next()).get()).f(bundle6);
                }
                break;
            case 8:
                Bundle bundle7 = new Bundle();
                bundle7.putParcelable("kid_creation_account_model", ((swa0) obj).d);
                return bundle7;
            case 9:
                mrd0 mrd0Var = (mrd0) obj;
                Bundle bundle8 = new Bundle();
                bundle8.putBoolean("live_sharing_session_dismissed", mrd0Var.P0);
                if (mrd0Var.X.a() && mrd0Var.Q0) {
                    z = true;
                }
                bundle8.putBoolean("live_sharing_banner_dismissed", z);
                bundle8.putParcelable("live_sharing_dialog", (Parcelable) mrd0Var.R0.h());
                return bundle8;
            case 10:
                Bundle bundle9 = new Bundle();
                ph20 ph20Var = (ph20) ((fas) obj).invoke();
                bundle9.putString("search_query", ph20Var != null ? ph20Var.a : null);
                return bundle9;
            case 11:
                t0n0 t0n0Var = (t0n0) obj;
                return mno1.h(new mmr0[]{new mmr0("lastItemUri", t0n0Var.b), new mmr0("lastItemWithoutClosableTargetUri", t0n0Var.c)});
            case 12:
                p410 p410Var = (p410) obj;
                Bundle bundle10 = new Bundle();
                w0r0 w0r0Var = (w0r0) p410Var.b;
                bundle10.putBundle("nav_manager_state", w0r0Var.f.f(w0r0Var.d.c()));
                th61 th61Var = ((jvn0) p410Var.h).d;
                if (th61Var != null) {
                    bundle10.putParcelable("recent_session_state", th61Var);
                }
                return bundle10;
            case 13:
                x1r0 x1r0Var = (x1r0) obj;
                boolean zBooleanValue = ((Boolean) x1r0Var.i.invoke()).booleanValue();
                qhe0 qhe0Var = x1r0Var.a;
                Bundle bundle11 = new Bundle();
                if (zBooleanValue) {
                    bundle11.putBoolean("USER_BEHAVIOR_PAGE_FOCUSED_KEY", x1r0Var.b);
                    bundle11.putBoolean("USER_BEHAVIOR_DATA_LOAD_COMPLETE_FOCUSED_KEY", x1r0Var.c);
                    bundle11.putBundle("USER_BEHAVIOR_LOGGER_KEY".concat(((wnh1) qhe0Var).P0.path()), qhe0Var.I());
                }
                return bundle11;
            case 14:
                return ((g2r0) obj).z();
            case 15:
                Bundle bundleH = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
                bundleH.putStringArrayList("classes_to_restore", mth1.H(o7h.l1((LinkedHashSet) obj)));
                return bundleH;
            case 16:
                Bundle bundle12 = new Bundle();
                bundle12.putParcelable("navigation.referrer-accessor.state_last_referrer", ((w911) obj).b);
                return bundle12;
            case 17:
                Bundle bundle13 = new Bundle();
                ik21 ik21Var = (ik21) obj;
                bundle13.putParcelable("report_blocking_data", ik21Var.h);
                bundle13.putString("report_blocking_entity_uri", ik21Var.j);
                return bundle13;
            case 18:
                return mno1.h(new mmr0[]{new mmr0("is_expanded", Boolean.valueOf(((dt31) obj).c()))});
            case 19:
                Bundle bundle14 = new Bundle();
                bundle14.putString("session_id", ((pf61) obj).d);
                return bundle14;
            case 20:
                Bundle bundle15 = new Bundle();
                SpotifyCheckoutActivity spotifyCheckoutActivity = (SpotifyCheckoutActivity) obj;
                bundle15.putSerializable("STATE_KEY_RESULT", spotifyCheckoutActivity.C1);
                bundle15.putParcelable("STATE_KEY_CURRENT_PAYMENT_ARGS", spotifyCheckoutActivity.y1);
                return bundle15;
            default:
                w9i1 w9i1Var = (w9i1) obj;
                return mno1.h(new mmr0[]{new mmr0("title", w9i1Var.t1.d().d.toString()), new mmr0("description", w9i1Var.s1.d().d.toString()), new mmr0("reporter", w9i1Var.u1.d().d.toString())});
        }
    }

    public void b(String str) {
        ((LinkedHashSet) this.b).add(str);
    }

    public /* synthetic */ uk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
