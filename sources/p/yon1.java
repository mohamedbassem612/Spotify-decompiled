package p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Looper;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import com.spotify.kidsview.v1.proto.AccountType;
import com.spotify.kidsview.v1.proto.DeleteAction;
import com.spotify.kidsview.v1.proto.DeletePlanDetails;
import com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponse;
import com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.v1.proto.ManagedAccountProfile;
import com.spotify.kidsview.v1.proto.ParentalControls;
import com.spotify.kidsview.v1.proto.PlanMembership;
import com.spotify.kidsview.v1.proto.RemoveFromPlanAction;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.Entity;
import com.spotify.signup.signup.v2.proto.Error;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class yon1 {
    public static final swg0 a = new swg0((byte) 0);
    public static final float b = 30.0f;
    public static b180 c;

    public static p6r0 A() {
        return G1("ADDRESS", "address", 17, "address");
    }

    public static p6r0 A0() {
        return G1("CHAT_MUTE", "chat/mute", 327, "chat");
    }

    public static p6r0 A1() {
        return G1("EXTERNAL_GOOGLE", "external/google", 538, "external");
    }

    public static p6r0 A2() {
        return G1("LOGIN_DIALOG_PASSKEY_NOT_FOUND", "login/dialog/passkey-not-found", 951, "login");
    }

    public static p6r0 A3() {
        return G1("PLAYLIST", "playlist", 1449, "playlist");
    }

    public static p6r0 A4() {
        return G1("QUIZ_RESULTS", "quiz/results", 1610, "quiz");
    }

    public static final q9g0 A5(GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse) {
        exr0 exr0Var;
        String childId = getManagedAccountDetailsViewResponse.getChildId();
        cww0 cww0VarC5 = C5(getManagedAccountDetailsViewResponse.getProfile());
        int iX5 = x5(getManagedAccountDetailsViewResponse.getAccountType());
        boolean hasAudiobooksAvailable = getManagedAccountDetailsViewResponse.getHasAudiobooksAvailable();
        int pendingRequestCount = getManagedAccountDetailsViewResponse.getPendingRequestCount();
        if (getManagedAccountDetailsViewResponse.hasParentalControls()) {
            ParentalControls parentalControls = getManagedAccountDetailsViewResponse.getParentalControls();
            exr0Var = new exr0(parentalControls.getAllowExplicitContent(), parentalControls.getAllowVideo(), parentalControls.getDateOfBirth(), parentalControls.getDateOfBirthMinDate(), parentalControls.getDateOfBirthMaxDate());
        } else {
            exr0Var = null;
        }
        return new q9g0(childId, cww0VarC5, iX5, hasAudiobooksAvailable, pendingRequestCount, exr0Var, getManagedAccountDetailsViewResponse.hasGraduationBanner() ? new e850(getManagedAccountDetailsViewResponse.getGraduationBanner().getMinGraduationAge()) : null, getManagedAccountDetailsViewResponse.hasPlanMembership() ? B5(getManagedAccountDetailsViewResponse.getPlanMembership()) : null, y5(getManagedAccountDetailsViewResponse.getDeleteAction()));
    }

    public static p6r0 B() {
        return G1("ADS_AD_ON_APP_OPEN", "ads/ad-on-app-open", 19, "ads");
    }

    public static p6r0 B0() {
        return G1("CHAT_SETTINGS", "chat/settings", 330, "chat");
    }

    public static p6r0 B1() {
        return G1("FAST_TRACK_PAGE_1", "fast-track/page-1", 551, "fast-track");
    }

    public static p6r0 B2() {
        return G1("LOGIN_SOMETHINGWENTWRONG", "login/somethingwentwrong", 964, "login");
    }

    public static p6r0 B3() {
        return G1("PLAYLIST_ADDTOPLAYLIST", "playlist/addtoplaylist", 1450, "playlist");
    }

    public static p6r0 B4() {
        return G1("RADIO", "radio", 1611, "radio");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final i9t0 B5(PlanMembership planMembership) {
        z721 z721Var;
        int i;
        String planLabel = planMembership.getPlanLabel();
        int i2 = 4;
        nn1 nn1Var = null;
        if (planMembership.hasRemoveAction()) {
            RemoveFromPlanAction removeAction = planMembership.getRemoveAction();
            int i3 = wag0.c[removeAction.getState().ordinal()];
            if (i3 == 1) {
                i = 1;
            } else if (i3 == 2) {
                i = 2;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    eg.o();
                    return null;
                }
                i = 1;
            } else {
                i = 3;
            }
            z721Var = new z721(i, removeAction.getMemberId());
        } else {
            z721Var = null;
        }
        if (planMembership.hasAddAction()) {
            switch (wag0.d[planMembership.getAddAction().getState().ordinal()]) {
                case 1:
                case 6:
                    i2 = 1;
                    nn1Var = new nn1(i2);
                    break;
                case 2:
                    i2 = 2;
                    nn1Var = new nn1(i2);
                    break;
                case 3:
                    i2 = 3;
                    nn1Var = new nn1(i2);
                    break;
                case 4:
                    nn1Var = new nn1(i2);
                    break;
                case 5:
                    i2 = 5;
                    nn1Var = new nn1(i2);
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        return new i9t0(planLabel, z721Var, nn1Var);
    }

    public static p6r0 C() {
        return G1("ADS_FEEDBACK", "ads/feedback", 21, "ads");
    }

    public static p6r0 C0() {
        return G1("CHAT_SHARE", "chat/share", 331, "chat");
    }

    public static p6r0 C1() {
        return G1("FAST_TRACK_PAGE_2", "fast-track/page-2", 552, "fast-track");
    }

    public static p6r0 C2() {
        return G1("LOGIN_WRONGEMAILORPASSWORD", "login/wrongemailorpassword", 966, "login");
    }

    public static p6r0 C3() {
        return G1("PLAYLIST_COVER_ART_SNAKE", "playlist/cover-art-snake", 1453, "playlist");
    }

    public static p6r0 C4() {
        return G1("REACTION_SHEET", "reaction-sheet", 1624, "reaction-sheet");
    }

    public static final cww0 C5(ManagedAccountProfile managedAccountProfile) {
        return new cww0(managedAccountProfile.getDisplayName(), managedAccountProfile.hasImageUrl() ? managedAccountProfile.getImageUrl() : null, managedAccountProfile.hasColor() ? Integer.valueOf(managedAccountProfile.getColor()) : null);
    }

    public static p6r0 D() {
        return G1("AGE_ASSURANCE", "age-assurance", 119, "age-assurance");
    }

    public static p6r0 D0() {
        return G1("CHECKOUT_COUNTRYPICKER", "checkout/countrypicker", 336, "checkout");
    }

    public static p6r0 D1() {
        return G1("FAST_TRACK_PAGE_3", "fast-track/page-3", 553, "fast-track");
    }

    public static p6r0 D2() {
        return G1("MADE_FOR_YOU", "made-for-you", 974, "made-for-you");
    }

    public static p6r0 D3() {
        return G1("PLAYLIST_CREATE", "playlist/create", 1454, "playlist");
    }

    public static p6r0 D4() {
        return G1("READALONG_FULLSCREEN", "readalong/fullscreen", 1627, "readalong");
    }

    public static final xk41 D5(mvh1 mvh1Var) {
        if (mvh1Var instanceof hvh1) {
            return new xk41(2, (n7r) null);
        }
        if (mvh1Var instanceof ivh1) {
            return new xk41(4, (n7r) null);
        }
        if (!(mvh1Var instanceof kvh1)) {
            if (mvh1Var instanceof jvh1) {
                return new xk41(1, (n7r) null);
            }
            eg.o();
            return null;
        }
        n7r n7rVar = (n7r) o7h.t0(((kvh1) mvh1Var).a - 1, n7r.i);
        if (n7rVar == null) {
            n7rVar = n7r.a;
        }
        return new xk41(3, n7rVar);
    }

    public static p6r0 E() {
        return G1("AGE_ASSURANCE_REQUEST_PARENTAL_CONSENT", "age-assurance/request-parental-consent", 123, "age-assurance");
    }

    public static p6r0 E0() {
        return G1("CHILDACCOUNTCLOSURE", "childaccountclosure", 344, "childaccountclosure");
    }

    public static p6r0 E1() {
        return G1("FILTERANDSORT", "filterandsort", 554, "filterandsort");
    }

    public static p6r0 E2() {
        return G1("MAGICLINK_ALREADYAUTHENTICATED", "magiclink/alreadyauthenticated", 975, "magiclink");
    }

    public static p6r0 E3() {
        return G1("PLAYLIST_CREATE_EUTERPE", "playlist/create/euterpe", 1455, "playlist");
    }

    public static p6r0 E4() {
        return G1("RECENTS", "recents", 1631, "recents");
    }

    public static final pd51 E5(cwl cwlVar, String str, d8r0 d8r0Var) {
        if (cwlVar instanceof wvl) {
            return new xlf1(str, d8r0Var, ((wvl) cwlVar).a);
        }
        if (cwlVar instanceof iul) {
            return new xl6(str, d8r0Var, ((iul) cwlVar).a);
        }
        if (cwlVar instanceof gul) {
            return new d73(str, d8r0Var, ((gul) cwlVar).a);
        }
        if (cwlVar instanceof nvl) {
            return new lhu0(str, d8r0Var, ((nvl) cwlVar).a);
        }
        if (cwlVar instanceof uvl) {
            return new k381(str, d8r0Var, ((uvl) cwlVar).a);
        }
        if (cwlVar instanceof yul) {
            return new u2z(str, d8r0Var, ((yul) cwlVar).a);
        }
        if (cwlVar instanceof kul) {
            return new e88(str, d8r0Var, ((kul) cwlVar).a);
        }
        if (cwlVar instanceof mul) {
            return new un8(str, d8r0Var, ((mul) cwlVar).a);
        }
        if (cwlVar instanceof qvl) {
            return new u0x0(str, d8r0Var, ((qvl) cwlVar).a);
        }
        if (cwlVar instanceof avl) {
            return new ui40(str, d8r0Var, ((avl) cwlVar).a);
        }
        if (cwlVar instanceof qul) {
            return new hfk(str, d8r0Var, ((qul) cwlVar).a);
        }
        if (cwlVar instanceof zvl) {
            return new wvi1(str, d8r0Var, ((zvl) cwlVar).a);
        }
        if (cwlVar instanceof cvl) {
            return new ud60(str, d8r0Var, ((cvl) cwlVar).a);
        }
        if (cwlVar instanceof tvl) {
            return new a431(str, d8r0Var, ((tvl) cwlVar).a);
        }
        if (cwlVar instanceof pul) {
            return new h0e(str, d8r0Var, ((pul) cwlVar).a);
        }
        if (cwlVar instanceof awl) {
            return new tfj1(str, d8r0Var, ((awl) cwlVar).a);
        }
        if (cwlVar instanceof uul) {
            return new pao(str, d8r0Var, ((uul) cwlVar).a);
        }
        if (cwlVar instanceof vul) {
            return new gbo(str, d8r0Var, ((vul) cwlVar).a);
        }
        if (cwlVar instanceof tul) {
            return new o8o(str, d8r0Var, ((tul) cwlVar).a);
        }
        if (cwlVar instanceof wul) {
            return new fco(str, d8r0Var, ((wul) cwlVar).a);
        }
        if (cwlVar instanceof gvl) {
            return new xo80(str, d8r0Var, ((gvl) cwlVar).a);
        }
        if (cwlVar instanceof fvl) {
            return new vo80(str, d8r0Var, ((fvl) cwlVar).a);
        }
        if (cwlVar instanceof svl) {
            return new um11(str, d8r0Var, ((svl) cwlVar).a);
        }
        if (cwlVar instanceof sul) {
            return new j2n(str, d8r0Var, ((sul) cwlVar).a);
        }
        if (cwlVar instanceof yvl) {
            return new l2g1(str, d8r0Var, ((yvl) cwlVar).a);
        }
        if (cwlVar instanceof pvl) {
            return new w2v0(str, d8r0Var, ((pvl) cwlVar).a);
        }
        if (cwlVar instanceof lvl) {
            return new owi0(str, d8r0Var, ((lvl) cwlVar).a);
        }
        if (cwlVar instanceof kvl) {
            mwi0 mwi0Var = ((kvl) cwlVar).a;
            return new iwi0(str, mwi0Var.a, mwi0Var.b, mwi0Var.c, mwi0Var.d, mwi0Var.f, d8r0Var, mwi0Var.h);
        }
        if (cwlVar instanceof bwl) {
            return new w6k1(str, d8r0Var, ((bwl) cwlVar).a);
        }
        if (cwlVar instanceof mvl) {
            return new qvp0(str, d8r0Var, ((mvl) cwlVar).a);
        }
        if (cwlVar instanceof hvl) {
            return new ona0(str, d8r0Var, ((hvl) cwlVar).a);
        }
        if (cwlVar.equals(ivl.a)) {
            return new gpi1(str, d8r0Var);
        }
        if (!(cwlVar instanceof xvl) && !(cwlVar instanceof jul) && !(cwlVar instanceof hul) && !(cwlVar instanceof ovl) && !(cwlVar instanceof vvl) && !(cwlVar instanceof zul) && !(cwlVar instanceof lul) && !(cwlVar instanceof nul) && !(cwlVar instanceof rvl) && !(cwlVar instanceof bvl) && !(cwlVar instanceof oul)) {
            eg.o();
            return null;
        }
        bhn0.B(rc11.a.b(cwlVar.getClass()), "First-step ContentItem variants should not reach this converter: ");
        return null;
    }

    public static p6r0 F() {
        return G1("AGE_ASSURANCE_SHARE_PARENTAL_CONSENT", "age-assurance/share-parental-consent", 125, "age-assurance");
    }

    public static p6r0 F0() {
        return G1("CHURNLOCK", "churnlock", 345, "churnlock");
    }

    public static p6r0 F1() {
        return G1("FREE_TIER_TRACK", "free-tier-track", 578, "free-tier-track");
    }

    public static p6r0 F2() {
        return G1("MAGPIE_ASSISTANCE", "magpie/assistance", 976, "magpie");
    }

    public static p6r0 F3() {
        return G1("PLAYLIST_CREATE_EUTERPE_REPORT_A_PROBLEM", "playlist/create/euterpe-report-a-problem", 1456, "playlist");
    }

    public static p6r0 F4() {
        return G1("REFLECTION", "reflection", 1633, "reflection");
    }

    public static p6r0 F5() {
        return G1("TRACK_CREDITS_CREDITS", "track-credits/credits", Entity.AUTOCOMPLETE_FIELD_NUMBER, "track-credits");
    }

    public static p6r0 G() {
        return G1("AGE_ASSURANCE_UNDERAGE_BLOCKING", "age-assurance/underage/blocking", 127, "age-assurance");
    }

    public static p6r0 G0() {
        return G1("COLLECTION_ARTISTS_ARTIST", "collection/artists/artist", 350, "collection");
    }

    public static p6r0 G1(String str, String str2, int i, String str3) {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0Var = (p6r0) atomicReferenceArray.get(i);
        if (p6r0Var != null) {
            return p6r0Var;
        }
        p6r0 p6r0Var2 = new p6r0(str, str2, i, str3);
        while (!atomicReferenceArray.compareAndSet(i, null, p6r0Var2)) {
            if (atomicReferenceArray.get(i) != null) {
                Object obj = p6r0.e.get(i);
                obj.getClass();
                return (p6r0) obj;
            }
        }
        return p6r0Var2;
    }

    public static p6r0 G2() {
        return G1("MAGPIE_CADENCE", "magpie/cadence", 977, "magpie");
    }

    public static p6r0 G3() {
        return G1("PLAYLIST_EDIT_COVERART", "playlist/edit-coverart", 1457, "playlist");
    }

    public static p6r0 G4() {
        return G1("REINVENTFREE_BACKSKIP_UPSELL", "reinventfree-backskip-upsell", 1635, "reinventfree-backskip-upsell");
    }

    public static p6r0 G5() {
        return G1("UNBOXING_FEATURE_FLOW", "unboxing/feature-flow", 2060, "unboxing");
    }

    public static p6r0 H() {
        return G1("AI_DISCLOSURE", "ai-disclosure", 137, "ai-disclosure");
    }

    public static p6r0 H0() {
        return G1("COLLECTION_YOUREPISODES_SETTINGS", "collection/yourepisodes/settings", 370, "collection");
    }

    public static p6r0 H1() {
        return G1("GRADUATION_APPROVED", "graduation/approved", 765, "graduation");
    }

    public static p6r0 H2() {
        return G1("MAGPIE_CAP", "magpie/cap", 978, "magpie");
    }

    public static p6r0 H3() {
        return G1("PLAYLIST_EDITORS_PICKER", "playlist/editors/picker", 1460, "playlist");
    }

    public static p6r0 H4() {
        return G1("REINVENTFREE_DOWNLOAD_UPSELL", "reinventfree-download-upsell", 1636, "reinventfree-download-upsell");
    }

    public static p6r0 H5() {
        return G1("UNKNOWN", "unknown", 2063, "unknown");
    }

    public static p6r0 I() {
        return G1("AIDJ_INTERACTIVITY_CONTAINER", "aidj/interactivity-container", 139, "aidj");
    }

    public static p6r0 I0() {
        return G1("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOAD", "collection/yourepisodes/settings/autodownload", 371, "collection");
    }

    public static p6r0 I1() {
        return G1("GRADUATION_EDUCATION", "graduation/education", 766, "graduation");
    }

    public static p6r0 I2() {
        return G1("MAGPIE_ERROR", "magpie/error", 979, "magpie");
    }

    public static p6r0 I3() {
        return G1("PLAYLIST_NOTLOADED", "playlist/notloaded", 1468, "playlist");
    }

    public static p6r0 I4() {
        return G1("REINVENTFREE_FMA_UPSELL", "reinventfree-fma-upsell", 1637, "reinventfree-fma-upsell");
    }

    public static p6r0 I5() {
        return G1("UNKNOWN_UNCOVERED", "unknown/uncovered", 2066, "unknown");
    }

    public static p6r0 J() {
        return G1("AIDJ_MIC_PERMISSION", "aidj/mic-permission", 140, "aidj");
    }

    public static p6r0 J0() {
        return G1("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOADLIMIT", "collection/yourepisodes/settings/autodownloadlimit", 372, "collection");
    }

    public static p6r0 J1() {
        return G1("GRADUATION_INITIATE", "graduation/initiate", 768, "graduation");
    }

    public static p6r0 J2() {
        return G1("MAGPIE_NOTIFICATIONS", "magpie/notifications", 982, "magpie");
    }

    public static p6r0 J3() {
        return G1("PLAYLIST_OVERLAP_MESSAGING", "playlist/overlap-messaging", 1471, "playlist");
    }

    public static p6r0 J4() {
        return G1("REINVENTFREE_SCRUB_UPSELL", "reinventfree-scrub-upsell", 1639, "reinventfree-scrub-upsell");
    }

    public static p6r0 J5() {
        return G1("UPCOMINGRELEASES", "upcomingreleases", 2068, "upcomingreleases");
    }

    public static p6r0 K() {
        return G1("ALBUM", "album", 141, "album");
    }

    public static p6r0 K0() {
        return G1("COMMENTS_NOTIFICATION_OPT_IN", "comments/notification-opt-in", 377, "comments");
    }

    public static p6r0 K1() {
        return G1("GRADUATION_REJECTED", "graduation/rejected", 770, "graduation");
    }

    public static p6r0 K2() {
        return G1("MAGPIE_PRIVACY", "magpie/privacy", 983, "magpie");
    }

    public static p6r0 K3() {
        return G1("PLAYLIST_PARTICIPANTS", "playlist/participants", 1472, "playlist");
    }

    public static p6r0 K4() {
        return G1("REINVENTFREE_SKIP_LIMIT_UPSELL", "reinventfree-skip-limit-upsell", 1640, "reinventfree-skip-limit-upsell");
    }

    public static final void K5(mxc mxcVar, iu30 iu30Var) {
        List list = mxcVar.a;
        iu30Var.invoke(list.get(((rr80) p7h.K(list)).b));
    }

    public static p6r0 L() {
        return G1("ALIGNED_CURATION_FIRST_SAVE", "aligned-curation/first-save", 142, "aligned-curation");
    }

    public static p6r0 L0() {
        return G1("COMMENTS_TERMS", "comments/terms", 382, "comments");
    }

    public static p6r0 L1() {
        return G1("GRADUATION_SUPERVISION", "graduation/supervision", 772, "graduation");
    }

    public static p6r0 L2() {
        return G1("MAGPIE_UCP_PROMPT", "magpie/ucp-prompt", 989, "magpie");
    }

    public static p6r0 L3() {
        return G1("PLAYLIST_PERMISSIONS_CLAIMDIALOG", "playlist/permissions/claimdialog", 1473, "playlist");
    }

    public static p6r0 L4() {
        return G1("REINVENTFREE_TIME_CAP_PIVOT_MULTI_SONG_UPSELL", "reinventfree-time-cap-pivot-multi-song-upsell", 1641, "reinventfree-time-cap-pivot-multi-song-upsell");
    }

    public static p6r0 L5() {
        return G1("UPSELL", "upsell", 2070, "upsell");
    }

    public static p6r0 M() {
        return G1("ALLBOARDING_HOST", "allboarding/host", 146, "allboarding");
    }

    public static p6r0 M0() {
        return G1("CONCERT_GALLERY", "concert-gallery", 384, "concert-gallery");
    }

    public static p6r0 M1() {
        return G1("GRADUATION_TERMS", "graduation/terms", 775, "graduation");
    }

    public static p6r0 M2() {
        return G1("MARQUEE", "marquee", 1013, "marquee");
    }

    public static p6r0 M3() {
        return G1("PLAYLISTS_EDIT_PRIVACY", "playlists/edit-privacy", 1475, "playlists");
    }

    public static p6r0 M4() {
        return G1("REINVENTFREE_TIME_CAP_PIVOT_MUSIC_VIDEO_UPSELL", "reinventfree-time-cap-pivot-music-video-upsell", 1642, "reinventfree-time-cap-pivot-music-video-upsell");
    }

    public static p6r0 M5(String str) {
        p6r0 p6r0Var;
        p6r0 p6r0VarN5;
        switch (str.hashCode() & 15) {
            case 0:
                p6r0Var = null;
                p6r0VarN5 = N5(str);
                break;
            case 1:
                p6r0Var = null;
                p6r0VarN5 = O5(str);
                break;
            case 2:
                p6r0Var = null;
                p6r0VarN5 = U5(str);
                break;
            case 3:
                p6r0Var = null;
                p6r0VarN5 = V5(str);
                break;
            case 4:
                p6r0Var = null;
                p6r0VarN5 = W5(str);
                break;
            case 5:
                p6r0Var = null;
                p6r0VarN5 = X5(str);
                break;
            case 6:
                p6r0Var = null;
                p6r0VarN5 = Y5(str);
                break;
            case 7:
                p6r0Var = null;
                p6r0VarN5 = Z5(str);
                break;
            case 8:
                p6r0Var = null;
                p6r0VarN5 = a6(str);
                break;
            case 9:
                p6r0Var = null;
                p6r0VarN5 = b6(str);
                break;
            case 10:
                p6r0Var = null;
                p6r0VarN5 = P5(str);
                break;
            case 11:
                p6r0Var = null;
                p6r0VarN5 = Q5(str);
                break;
            case 12:
                p6r0Var = null;
                p6r0VarN5 = R5(str);
                break;
            case 13:
                p6r0Var = null;
                p6r0VarN5 = S5(str);
                break;
            case 14:
                p6r0Var = null;
                p6r0VarN5 = T5(str);
                break;
            case 15:
                p6r0Var = null;
                switch (str) {
                    case "ADSTUDIO_SBL_STOP_SURVEY":
                        p6r0VarN5 = G1("ADSTUDIO_SBL_STOP_SURVEY", "adstudio/sbl/stop-survey", 114, "adstudio");
                        break;
                    case "LYRICS_REPORT":
                        p6r0VarN5 = G1("LYRICS_REPORT", "lyrics/report", 970, "lyrics");
                        break;
                    case "WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_PARENTALSETTINGS":
                        p6r0VarN5 = G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_PARENTALSETTINGS", "www-account-pages/parental-settings/parentalsettings", 2227, "www-account-pages");
                        break;
                    case "QUIZ_FEEDBACK":
                        p6r0VarN5 = w4();
                        break;
                    case "ADSTUDIO_AD_SET_DETAILS":
                        p6r0VarN5 = G1("ADSTUDIO_AD_SET_DETAILS", "adstudio/ad-set/details", 34, "adstudio");
                        break;
                    case "EXPRESSIVE_PLAYLISTS_EDIT":
                        p6r0VarN5 = G1("EXPRESSIVE_PLAYLISTS_EDIT", "expressive-playlists-edit", 534, "expressive-playlists-edit");
                        break;
                    case "HOMETHING_ACTIVATION_ERROR":
                        p6r0VarN5 = G1("HOMETHING_ACTIVATION_ERROR", "homething/activation/error", 822, "homething");
                        break;
                    case "GOLDENPATH_VALERIIL":
                        p6r0VarN5 = G1("GOLDENPATH_VALERIIL", "goldenpath/valeriil", 754, "goldenpath");
                        break;
                    case "RUNNING":
                        p6r0VarN5 = G1("RUNNING", "running", 1658, "running");
                        break;
                    case "MADE_FOR_YOU":
                        p6r0VarN5 = D2();
                        break;
                    case "PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS":
                        p6r0VarN5 = b4();
                        break;
                    case "EMBED_MCP_UI":
                        p6r0VarN5 = G1("EMBED_MCP_UI", "embed-mcp-ui", 511, "embed-mcp-ui");
                        break;
                    case "ARTIST_ARTIST_ATTRIBUTION":
                        p6r0VarN5 = P();
                        break;
                    case "LIVE_AUDIO_ENTITY":
                        p6r0VarN5 = G1("LIVE_AUDIO_ENTITY", "live-audio/entity", 930, "live-audio");
                        break;
                    case "INTERIMSHARE":
                        p6r0VarN5 = G1("INTERIMSHARE", "interimshare", 843, "interimshare");
                        break;
                    case "ADSTUDIO_BILLING_CENTER":
                        p6r0VarN5 = G1("ADSTUDIO_BILLING_CENTER", "adstudio/billing-center", 50, "adstudio");
                        break;
                    case "MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_ADD_DETAILS":
                        p6r0VarN5 = G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_ADD_DETAILS", "mrkt/artist/campaigns/marquee-and-showcase/create/flights/add-details", 1067, "mrkt");
                        break;
                    case "COMMENTS_REACTIONS":
                        p6r0VarN5 = G1("COMMENTS_REACTIONS", "comments/reactions", 379, "comments");
                        break;
                    case "GOLDENPATH_MAXR":
                        p6r0VarN5 = G1("GOLDENPATH_MAXR", "goldenpath/maxr", 697, "goldenpath");
                        break;
                    case "SHOWS_RESOLVER":
                        p6r0VarN5 = G1("SHOWS_RESOLVER", "shows/resolver", 1878, "shows");
                        break;
                    case "SUPPORT_SITE_OLD_HOME":
                        p6r0VarN5 = G1("SUPPORT_SITE_OLD_HOME", "support-site/old/home", 2028, "support-site");
                        break;
                    case "PARENTAL_CONTROL_ACCOUNT_DETAILS_PROFILE_VISIBILITY_SETTINGS":
                        p6r0VarN5 = G1("PARENTAL_CONTROL_ACCOUNT_DETAILS_PROFILE_VISIBILITY_SETTINGS", "parental-control/account-details/profile-visibility-settings", 1400, "parental-control");
                        break;
                    case "FOLLOWFEED":
                        p6r0VarN5 = G1("FOLLOWFEED", "followfeed", 559, "followfeed");
                        break;
                    case "PREMIUM_WWW":
                        p6r0VarN5 = G1("PREMIUM_WWW", "premium-www", 1557, "premium-www");
                        break;
                    case "PROFILE_FRIENDS":
                        p6r0VarN5 = G1("PROFILE_FRIENDS", "profile/friends", 1583, "profile");
                        break;
                    case "AUTHOR_BIOGRAPHY":
                        p6r0VarN5 = G1("AUTHOR_BIOGRAPHY", "author/biography", 209, "author");
                        break;
                    case "SEARCH_VIDEOS":
                        p6r0VarN5 = G1("SEARCH_VIDEOS", "search/videos", 1801, "search");
                        break;
                    case "SHARE_MENU":
                        p6r0VarN5 = G1("SHARE_MENU", "share-menu", 1854, "share-menu");
                        break;
                    case "ADSTUDIO_REPORT_EDIT":
                        p6r0VarN5 = G1("ADSTUDIO_REPORT_EDIT", "adstudio/report/edit", 108, "adstudio");
                        break;
                    case "WEAR_SEARCH_RESULTS":
                        p6r0VarN5 = G1("WEAR_SEARCH_RESULTS", "wear/search/results", 2155, "wear");
                        break;
                    case "YOUR_ADDONS":
                        p6r0VarN5 = G1("YOUR_ADDONS", "your-addons", 2251, "your-addons");
                        break;
                    case "EXTERNAL_YOTI":
                        p6r0VarN5 = G1("EXTERNAL_YOTI", "external/yoti", 540, "external");
                        break;
                    case "ADSTUDIO_EDIT_CAMPAIGN":
                        p6r0VarN5 = G1("ADSTUDIO_EDIT_CAMPAIGN", "adstudio/edit/campaign", 95, "adstudio");
                        break;
                    case "MRKT_FRONTDOOR_FAN_STUDY_MERCH_AND_LIVE":
                        p6r0VarN5 = G1("MRKT_FRONTDOOR_FAN_STUDY_MERCH_AND_LIVE", "mrkt/frontdoor/fan-study/merch-and-live", 1253, "mrkt");
                        break;
                    case "SEARCH_EPISODES":
                        p6r0VarN5 = G1("SEARCH_EPISODES", "search/episodes", 1785, "search");
                        break;
                    case "MRKT_ARTIST_MUSIC_UPCOMING_MANAGE_RELEASE":
                        p6r0VarN5 = G1("MRKT_ARTIST_MUSIC_UPCOMING_MANAGE_RELEASE", "mrkt/artist/music/upcoming/manage-release", 1100, "mrkt");
                        break;
                    case "GOLDENPATH_MARKUSK":
                        p6r0VarN5 = G1("GOLDENPATH_MARKUSK", "goldenpath/markusk", 693, "goldenpath");
                        break;
                    case "MRKT_LEGAL_TERMS_AND_CONDITIONS":
                        p6r0VarN5 = G1("MRKT_LEGAL_TERMS_AND_CONDITIONS", "mrkt/legal/terms-and-conditions", 1284, "mrkt");
                        break;
                    case "MRKT_VIDEO_EDIT":
                        p6r0VarN5 = G1("MRKT_VIDEO_EDIT", "mrkt/video/edit", 1328, "mrkt");
                        break;
                    case "TERMS_TERMSOFSERVICE":
                        p6r0VarN5 = G1("TERMS_TERMSOFSERVICE", "terms/termsofservice", 2040, "terms");
                        break;
                    case "COLLECTION_FOLDER":
                        p6r0VarN5 = G1("COLLECTION_FOLDER", "collection/folder", 353, "collection");
                        break;
                    case "WATCHAPP_ONBOARDING_DOWNLOAD_ON_WATCH":
                        p6r0VarN5 = G1("WATCHAPP_ONBOARDING_DOWNLOAD_ON_WATCH", "watchapp/onboarding-download-on-watch", 2113, "watchapp");
                        break;
                    case "SETTINGS_NOTIFICATIONS_CATEGORIES":
                        p6r0VarN5 = e5();
                        break;
                    case "PODCAST_SHOW_SEARCH":
                        p6r0VarN5 = Q3();
                        break;
                    case "BOOTCAMP_TOPCOUNTRYPLAYLIST":
                        p6r0VarN5 = G1("BOOTCAMP_TOPCOUNTRYPLAYLIST", "bootcamp/topcountryplaylist", 246, "bootcamp");
                        break;
                    case "SHARE_SHEET":
                        p6r0VarN5 = G1("SHARE_SHEET", "share-sheet", 1856, "share-sheet");
                        break;
                    case "GOLDENPATH_ERICKR":
                        p6r0VarN5 = G1("GOLDENPATH_ERICKR", "goldenpath/erickr", 646, "goldenpath");
                        break;
                    case "GOLDENPATH_HAMIDM":
                        p6r0VarN5 = G1("GOLDENPATH_HAMIDM", "goldenpath/hamidm", 655, "goldenpath");
                        break;
                    case "MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ROOT":
                        p6r0VarN5 = G1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ROOT", "mrkt/artist/video/other-videos/root", 1176, "mrkt");
                        break;
                    case "WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_WIFI_STREAMING":
                        p6r0VarN5 = G1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_WIFI_STREAMING", "wear/settings/audio_quality_settings/wifi_streaming", 2163, "wear");
                        break;
                    case "SARABANDA":
                        p6r0VarN5 = G1("SARABANDA", "sarabanda", 1774, "sarabanda");
                        break;
                    case "S4P_SHOWS_VIEW_IN_BROWSER":
                        p6r0VarN5 = G1("S4P_SHOWS_VIEW_IN_BROWSER", "s4p/shows/view-in-browser", 1765, "s4p");
                        break;
                    case "S4P_SETTINGS_ORGANIZATION":
                        p6r0VarN5 = G1("S4P_SETTINGS_ORGANIZATION", "s4p/settings/organization", 1743, "s4p");
                        break;
                    case "PROFILE_FOLLOWERS":
                        p6r0VarN5 = p4();
                        break;
                    case "SEARCH_SHOWS":
                        p6r0VarN5 = G1("SEARCH_SHOWS", "search/shows", 1799, "search");
                        break;
                    case "WEAR_YOUR_LIBRARY":
                        p6r0VarN5 = G1("WEAR_YOUR_LIBRARY", "wear/your_library", 2173, "wear");
                        break;
                    case "FREE_TIER_PROFILE":
                        p6r0VarN5 = G1("FREE_TIER_PROFILE", "free-tier-profile", 576, "free-tier-profile");
                        break;
                    case "ARTIST_ABOUT_WEBVIEW":
                        p6r0VarN5 = G1("ARTIST_ABOUT_WEBVIEW", "artist/about/webview", 156, "artist");
                        break;
                    case "BUNDLING":
                        p6r0VarN5 = G1("BUNDLING", "bundling", 254, "bundling");
                        break;
                    case "KID_ACCOUNT_CREATION_LEGAL_CONSENT":
                        p6r0VarN5 = G1("KID_ACCOUNT_CREATION_LEGAL_CONSENT", "kid-account-creation/legal-consent", 879, "kid-account-creation");
                        break;
                    case "ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD_SET":
                        p6r0VarN5 = G1("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD_SET", "adstudio/duplicate-ad-set-with-ads/ad-set", 89, "adstudio");
                        break;
                    case "WWW_ACCOUNT_PAGES_HERO":
                        p6r0VarN5 = G1("WWW_ACCOUNT_PAGES_HERO", "www-account-pages/hero", 2209, "www-account-pages");
                        break;
                    case "GOLDENPATH_ROQUEB":
                        p6r0VarN5 = G1("GOLDENPATH_ROQUEB", "goldenpath/roqueb", 737, "goldenpath");
                        break;
                    case "MRKT_ARTIST_MUSIC_APPROVALS":
                        p6r0VarN5 = G1("MRKT_ARTIST_MUSIC_APPROVALS", "mrkt/artist/music/approvals", 1093, "mrkt");
                        break;
                    case "HIFI_TOGGLE":
                        p6r0VarN5 = G1("HIFI_TOGGLE", "hifi/toggle", 793, "hifi");
                        break;
                    case "GOLDENPATH_DAVIDEA":
                        p6r0VarN5 = G1("GOLDENPATH_DAVIDEA", "goldenpath/davidea", 632, "goldenpath");
                        break;
                    case "WATCHAPP_TESTING_TOOLS":
                        p6r0VarN5 = G1("WATCHAPP_TESTING_TOOLS", "watchapp/testing-tools", 2125, "watchapp");
                        break;
                    case "PUFFIN_PIGEON_ONBOARDING":
                        p6r0VarN5 = v4();
                        break;
                    case "LIST_CREATIONMENU":
                        p6r0VarN5 = G1("LIST_CREATIONMENU", "list/creationmenu", 910, "list");
                        break;
                    case "YOURLIBRARY_EPISODES":
                        p6r0VarN5 = k6();
                        break;
                    case "MRKT_USER_SETTINGS_NOTIFICATIONS":
                        p6r0VarN5 = G1("MRKT_USER_SETTINGS_NOTIFICATIONS", "mrkt/user-settings/notifications", 1326, "mrkt");
                        break;
                    case "MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_BILLING":
                        p6r0VarN5 = G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_BILLING", "mrkt/artist/campaigns/marquee-and-showcase/update/billing", 1075, "mrkt");
                        break;
                    case "BLEND_TASTE_MATCH":
                        p6r0VarN5 = g0();
                        break;
                    case "WWW_ACCOUNT_PAGES_ADDRESS":
                        p6r0VarN5 = G1("WWW_ACCOUNT_PAGES_ADDRESS", "www-account-pages/address", 2186, "www-account-pages");
                        break;
                    case "EPISODECHAPTERS_EPISODECHAPTER_CONTEXTMENU":
                        p6r0VarN5 = G1("EPISODECHAPTERS_EPISODECHAPTER_CONTEXTMENU", "episodechapters/episodechapter/contextmenu", 524, "episodechapters");
                        break;
                    case "S4P_HOME":
                        p6r0VarN5 = G1("S4P_HOME", "s4p/home", 1711, "s4p");
                        break;
                    case "AUDIOBOOK_TOPUP_PRODUCTPAGE":
                        p6r0VarN5 = G1("AUDIOBOOK_TOPUP_PRODUCTPAGE", "audiobook/topup/productpage", 206, "audiobook");
                        break;
                    case "LOGIN_DIALOG_UNKNOWNERROR":
                        p6r0VarN5 = G1("LOGIN_DIALOG_UNKNOWNERROR", "login/dialog/unknownerror", 953, "login");
                        break;
                    case "WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VISIBLEONPROFILE":
                        p6r0VarN5 = G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VISIBLEONPROFILE", "www-account-pages/parental-settings/visibleonprofile", 2232, "www-account-pages");
                        break;
                    case "SSO":
                        p6r0VarN5 = G1("SSO", "sso", 1976, "sso");
                        break;
                    case "YOU":
                        p6r0VarN5 = G1("YOU", "you", 2250, "you");
                        break;
                    case "HOME":
                        p6r0VarN5 = O1();
                        break;
                    case "PLAYLISTS_EDIT_PROFILE_VISIBILITY":
                        p6r0VarN5 = N3();
                        break;
                    case "YOURLIBRARY_DEFAULT_SAVE_LOCATION_SELECTION":
                        p6r0VarN5 = G1("YOURLIBRARY_DEFAULT_SAVE_LOCATION_SELECTION", "yourlibrary/default-save-location-selection", 2260, "yourlibrary");
                        break;
                    case "ALBUM":
                        p6r0VarN5 = K();
                        break;
                    case "SHARE":
                        p6r0VarN5 = G1("SHARE", "share", 1853, "share");
                        break;
                    case "TOPIC":
                        p6r0VarN5 = G1("TOPIC", "topic", 2044, "topic");
                        break;
                    case "VENUE":
                        p6r0VarN5 = c6();
                        break;
                    case "SPONSORED_RECOMMENDATION":
                        p6r0VarN5 = G1("SPONSORED_RECOMMENDATION", "sponsored-recommendation", 1930, "sponsored-recommendation");
                        break;
                    case "PROMPTABLE_SECTION_INPUT":
                        p6r0VarN5 = u4();
                        break;
                    case "VIDEO_DEBUG":
                        p6r0VarN5 = G1("VIDEO_DEBUG", "video/debug", 2078, "video");
                        break;
                    case "PLAYLIST_OVERLAP_EDIT_PAGE":
                        p6r0VarN5 = G1("PLAYLIST_OVERLAP_EDIT_PAGE", "playlist/overlap-edit-page", 1470, "playlist");
                        break;
                    case "MEMBERSHIP_CONSUMER_MANAGE_CHANGE_TIER_CONFIRM_DIALOG":
                        p6r0VarN5 = G1("MEMBERSHIP_CONSUMER_MANAGE_CHANGE_TIER_CONFIRM_DIALOG", "membership/consumer/manage/change-tier/confirm-dialog", 1023, "membership");
                        break;
                    case "REINVENTFREE_TIME_CAP_UPSELL_PREVIEW":
                        p6r0VarN5 = G1("REINVENTFREE_TIME_CAP_UPSELL_PREVIEW", "reinventfree-time-cap-upsell-preview", 1645, "reinventfree-time-cap-upsell-preview");
                        break;
                    case "INAPPMESSAGE_FULLSCREEN":
                        p6r0VarN5 = d2();
                        break;
                    case "ADS_REPORT_AD":
                        p6r0VarN5 = G1("ADS_REPORT_AD", "ads/report-ad", 24, "ads");
                        break;
                    case "MRKT_ROSTER_RELEASES":
                        p6r0VarN5 = G1("MRKT_ROSTER_RELEASES", "mrkt/roster/releases", 1300, "mrkt");
                        break;
                    case "S4P_PODCAST_EPISODE_OPTIONS":
                        p6r0VarN5 = G1("S4P_PODCAST_EPISODE_OPTIONS", "s4p/podcast/episode/options", 1732, "s4p");
                        break;
                    case "PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT_SEARCH":
                        p6r0VarN5 = G1("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT_SEARCH", "parental-control/manage-blocked-content/search", 1411, "parental-control");
                        break;
                    case "MRKT_FRONTDOOR_GET_STARTED":
                        p6r0VarN5 = G1("MRKT_FRONTDOOR_GET_STARTED", "mrkt/frontdoor/get-started", 1258, "mrkt");
                        break;
                    case "MRKT_BULK_CAMPAIGNS_FORECAST_SUBMITTED":
                        p6r0VarN5 = G1("MRKT_BULK_CAMPAIGNS_FORECAST_SUBMITTED", "mrkt/bulk-campaigns/forecast/submitted", 1191, "mrkt");
                        break;
                    case "PUFFIN_MANUAL_SELECT_REDUCED":
                        p6r0VarN5 = G1("PUFFIN_MANUAL_SELECT_REDUCED", "puffin/manual-select-reduced", 1599, "puffin");
                        break;
                    case "ACTIVATION_AUTO_TRIAL":
                        p6r0VarN5 = G1("ACTIVATION_AUTO_TRIAL", "activation/auto-trial", 7, "activation");
                        break;
                    case "CHECKOUT_UNIFIEDCHECKOUT":
                        p6r0VarN5 = G1("CHECKOUT_UNIFIEDCHECKOUT", "checkout/unifiedcheckout", 339, "checkout");
                        break;
                    case "ADSTUDIO_COLD_START_CAMPAIGN_RESERVED_BOOKING":
                        p6r0VarN5 = G1("ADSTUDIO_COLD_START_CAMPAIGN_RESERVED_BOOKING", "adstudio/cold-start/campaign/reserved-booking", 73, "adstudio");
                        break;
                    case "HOMETHING":
                        p6r0VarN5 = G1("HOMETHING", "homething", 819, "homething");
                        break;
                    case "PODCASTCLIPS":
                        p6r0VarN5 = G1("PODCASTCLIPS", "podcastclips", 1513, "podcastclips");
                        break;
                    case "PLAYLIST_OVERLAP_MESSAGING":
                        p6r0VarN5 = J3();
                        break;
                    case "CHAT_CONTRIBUTION_MEDIA_GALLERY":
                        p6r0VarN5 = r0();
                        break;
                    case "WEB3_NFTSHOWCASEPREVIEW":
                        p6r0VarN5 = G1("WEB3_NFTSHOWCASEPREVIEW", "web3/nftshowcasepreview", 2176, "web3");
                        break;
                    case "SUPPORT_HOME":
                        p6r0VarN5 = G1("SUPPORT_HOME", "support/home", 2033, "support");
                        break;
                    case "MRKT_LICENSOR_DISCOVERYMODE_CREATE":
                        p6r0VarN5 = G1("MRKT_LICENSOR_DISCOVERYMODE_CREATE", "mrkt/licensor/discoverymode/create", 1287, "mrkt");
                        break;
                    case "ADSTUDIO_DASHBOARD_ADS":
                        p6r0VarN5 = G1("ADSTUDIO_DASHBOARD_ADS", "adstudio/dashboard/ads", 79, "adstudio");
                        break;
                    case "LOGIN_PIN":
                        p6r0VarN5 = G1("LOGIN_PIN", "login/pin", 962, "login");
                        break;
                    case "ADD_CHILD_PLAN_MEMBER":
                        p6r0VarN5 = y();
                        break;
                    case "PERMISSIONS_BLUETOOTH_INFO_BOTTOMSHEET":
                        p6r0VarN5 = G1("PERMISSIONS_BLUETOOTH_INFO_BOTTOMSHEET", "permissions/bluetooth/info/bottomsheet", 1428, "permissions");
                        break;
                    case "PHONENUMBERSIGNUP_CALLINGCODEPICKER":
                        p6r0VarN5 = G1("PHONENUMBERSIGNUP_CALLINGCODEPICKER", "phonenumbersignup/callingcodepicker", 1440, "phonenumbersignup");
                        break;
                    case "PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT":
                        p6r0VarN5 = G1("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT", "parental-control/manage-approved-content", 1408, "parental-control");
                        break;
                    case "WWW_ACCOUNT_PAGES_SAVEDPAYMENTCARDS":
                        p6r0VarN5 = G1("WWW_ACCOUNT_PAGES_SAVEDPAYMENTCARDS", "www-account-pages/savedpaymentcards", 2243, "www-account-pages");
                        break;
                    case "SEARCH_AUTOCOMPLETE":
                        p6r0VarN5 = G1("SEARCH_AUTOCOMPLETE", "search/autocomplete", 1784, "search");
                        break;
                    case "GOLDENPATH_ADAMPSB":
                        p6r0VarN5 = G1("GOLDENPATH_ADAMPSB", "goldenpath/adampsb", 613, "goldenpath");
                        break;
                    case "FREE_TIER_SEARCH_PLAYLIST":
                        p6r0VarN5 = G1("FREE_TIER_SEARCH_PLAYLIST", "free-tier-search-playlist", 577, "free-tier-search-playlist");
                        break;
                    case "PLAYLIST_COVER_ART_SNAKE":
                        p6r0VarN5 = C3();
                        break;
                    case "WRAPPED_DATASTORIES":
                        p6r0VarN5 = G1("WRAPPED_DATASTORIES", "wrapped/datastories", 2179, "wrapped");
                        break;
                    case "WEAR_CONNECT_VOLUME":
                        p6r0VarN5 = G1("WEAR_CONNECT_VOLUME", "wear/connect_volume", 2138, "wear");
                        break;
                    case "WEB3_NFTSHOWCASEGRID":
                        p6r0VarN5 = G1("WEB3_NFTSHOWCASEGRID", "web3/nftshowcasegrid", 2175, "web3");
                        break;
                    case "UBI_SHOWCASE_TEST_CONTEXTUAL":
                        p6r0VarN5 = G1("UBI_SHOWCASE_TEST_CONTEXTUAL", "ubi/showcase-test-contextual", 2058, "ubi");
                        break;
                    case "GOLDENPATH_DHOROWITZ":
                        p6r0VarN5 = G1("GOLDENPATH_DHOROWITZ", "goldenpath/dhorowitz", 633, "goldenpath");
                        break;
                    case "HOME_PODCASTS":
                        p6r0VarN5 = T1();
                        break;
                    case "MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS":
                        p6r0VarN5 = G1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS", "mrkt/artist/video/other-videos/manage-associations", 1173, "mrkt");
                        break;
                    case "RESETPASSWORD_EMAILSENT":
                        p6r0VarN5 = G1("RESETPASSWORD_EMAILSENT", "resetpassword/emailsent", 1656, "resetpassword");
                        break;
                    case "PLAN_OVERVIEW":
                        p6r0VarN5 = y3();
                        break;
                    case "WEAR_HOME":
                        p6r0VarN5 = G1("WEAR_HOME", "wear/home", 2147, "wear");
                        break;
                    case "SETTINGS_STORAGE":
                        p6r0VarN5 = G1("SETTINGS_STORAGE", "settings/storage", 1847, "settings");
                        break;
                    case "SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE":
                        p6r0VarN5 = G1("SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE", "settings/notifications/language-preference", 1839, "settings");
                        break;
                    case "YOURLIBRARY_SHOWS":
                        p6r0VarN5 = G1("YOURLIBRARY_SHOWS", "yourlibrary/shows", 2272, "yourlibrary");
                        break;
                    case "ADSTUDIO_EVENTS":
                        p6r0VarN5 = G1("ADSTUDIO_EVENTS", "adstudio/events", 98, "adstudio");
                        break;
                    case "GOLDENPATH_POLINAKIM":
                        p6r0VarN5 = G1("GOLDENPATH_POLINAKIM", "goldenpath/polinakim", 730, "goldenpath");
                        break;
                    case "PHONENUMBERSIGNUP":
                        p6r0VarN5 = G1("PHONENUMBERSIGNUP", "phonenumbersignup", 1439, "phonenumbersignup");
                        break;
                    case "GRADUATION_REJECTED":
                        p6r0VarN5 = K1();
                        break;
                    case "S4P_CREATION_AUDIO_TRIMMER":
                        p6r0VarN5 = G1("S4P_CREATION_AUDIO_TRIMMER", "s4p/creation/audio-trimmer", 1693, "s4p");
                        break;
                    case "YOURLIBRARY_SEARCH":
                        p6r0VarN5 = m6();
                        break;
                    case "CANVAS_NOWPLAYING":
                        p6r0VarN5 = G1("CANVAS_NOWPLAYING", "canvas/nowplaying", 271, "canvas");
                        break;
                    case "MAGICLINK_ALREADYAUTHENTICATED":
                        p6r0VarN5 = E2();
                        break;
                    default:
                        p6r0VarN5 = null;
                        break;
                }
                break;
            default:
                p6r0VarN5 = null;
                p6r0Var = null;
                break;
        }
        if (p6r0VarN5 != null) {
            return p6r0VarN5;
        }
        hhg1.n("No page identifier named ".concat(str));
        return p6r0Var;
    }

    public static p6r0 N() {
        return G1("ARTIST", "artist", 154, "artist");
    }

    public static p6r0 N0() {
        return G1("CONCERTS", "concerts", 385, "concerts");
    }

    public static p6r0 N1() {
        return G1("GRADUATION_VIEW_REQUEST", "graduation/view-request", 776, "graduation");
    }

    public static p6r0 N2() {
        return G1("MARTINI_CHAT", "martini/chat", 1014, "martini");
    }

    public static p6r0 N3() {
        return G1("PLAYLISTS_EDIT_PROFILE_VISIBILITY", "playlists/edit-profile-visibility", 1476, "playlists");
    }

    public static p6r0 N4() {
        return G1("REINVENTFREE_TIME_CAP_PIVOT_TRACK_RADIO_UPSELL", "reinventfree-time-cap-pivot-track-radio-upsell", 1643, "reinventfree-time-cap-pivot-track-radio-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 N5(String str) {
        switch (str.hashCode()) {
            case -2120814208:
                if (str.equals("AUTHOR_RELEASES")) {
                    return G1("AUTHOR_RELEASES", "author/releases", 210, "author");
                }
                return null;
            case -2103785360:
                if (str.equals("ADS_SPLIT_VIDEO_BROWSER")) {
                    return G1("ADS_SPLIT_VIDEO_BROWSER", "ads/split-video-browser", 26, "ads");
                }
                return null;
            case -2082108064:
                if (str.equals("PODCAST_IMPORT")) {
                    return G1("PODCAST_IMPORT", "podcast/import", 1488, "podcast");
                }
                return null;
            case -2063380384:
                if (str.equals("KID_ACCOUNT_CREATION_NAME")) {
                    return G1("KID_ACCOUNT_CREATION_NAME", "kid-account-creation/name", 880, "kid-account-creation");
                }
                return null;
            case -2012940192:
                if (str.equals("YOURLIBRARY_AUDIOBOOK_PROGRESS_NUDGE")) {
                    return G1("YOURLIBRARY_AUDIOBOOK_PROGRESS_NUDGE", "yourlibrary/audiobook-progress-nudge", 2258, "yourlibrary");
                }
                return null;
            case -2010547760:
                if (str.equals("QUIZ_RECOMMENDATIONS")) {
                    return z4();
                }
                return null;
            case -1975868976:
                if (str.equals("CHAT_INVITE")) {
                    return G1("CHAT_INVITE", "chat/invite", 323, "chat");
                }
                return null;
            case -1964624496:
                if (str.equals("HOMEMIX_ABOUTVIDEO")) {
                    return G1("HOMEMIX_ABOUTVIDEO", "homemix/aboutvideo", 812, "homemix");
                }
                return null;
            case -1960301680:
                if (str.equals("NOWPLAYING_NOWPLAYINGSIDEBAREMPTY")) {
                    return a3();
                }
                return null;
            case -1945036592:
                if (str.equals("WEAR_EXTERNAL_INTENT")) {
                    return G1("WEAR_EXTERNAL_INTENT", "wear/external_intent", 2146, "wear");
                }
                return null;
            case -1932288576:
                if (str.equals("CHILD_LED_SIGNUP_SHARE_PARENTAL_CONSENT")) {
                    return G1("CHILD_LED_SIGNUP_SHARE_PARENTAL_CONSENT", "child-led-signup/share-parental-consent", 343, "child-led-signup");
                }
                return null;
            case -1926908304:
                if (str.equals("PLAYLIST_HISTORY_PREVIEW")) {
                    return G1("PLAYLIST_HISTORY_PREVIEW", "playlist/history-preview", 1464, "playlist");
                }
                return null;
            case -1919228032:
                if (str.equals("SIGNUP_TERMS")) {
                    return G1("SIGNUP_TERMS", "signup/terms", 1897, "signup");
                }
                return null;
            case -1853197568:
                if (str.equals("PUFFIN_CLOUD")) {
                    return G1("PUFFIN_CLOUD", "puffin/cloud", 1595, "puffin");
                }
                return null;
            case -1840794464:
                if (str.equals("SHARE_SHEET_COMPOSER")) {
                    return G1("SHARE_SHEET_COMPOSER", "share-sheet/composer", 1857, "share-sheet");
                }
                return null;
            case -1832934176:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOAD")) {
                    return I0();
                }
                return null;
            case -1826628160:
                if (str.equals("ADAPTIVEAUTHENTICATION_WEBCHALLENGE")) {
                    return G1("ADAPTIVEAUTHENTICATION_WEBCHALLENGE", "adaptiveauthentication/webchallenge", 12, "adaptiveauthentication");
                }
                return null;
            case -1801631808:
                if (str.equals("RADIO_DAILY_MIXES")) {
                    return G1("RADIO_DAILY_MIXES", "radio/daily-mixes", 1613, "radio");
                }
                return null;
            case -1778864608:
                if (str.equals("SHOWS_FORMAT_SHARE")) {
                    return G1("SHOWS_FORMAT_SHARE", "shows/format/share", 1875, "shows");
                }
                return null;
            case -1776335824:
                if (str.equals("ADSTUDIO_DASHBOARD_CAMPAIGN_DRAFTS")) {
                    return G1("ADSTUDIO_DASHBOARD_CAMPAIGN_DRAFTS", "adstudio/dashboard/campaign-drafts", 80, "adstudio");
                }
                return null;
            case -1774252288:
                if (str.equals("MRKT_ARTIST_LISTENING_PARTY_CREATE")) {
                    return G1("MRKT_ARTIST_LISTENING_PARTY_CREATE", "mrkt/artist/listening-party/create", 1087, "mrkt");
                }
                return null;
            case -1758903120:
                if (str.equals("RADIO_STATION")) {
                    return G1("RADIO_STATION", "radio/station", 1615, "radio");
                }
                return null;
            case -1733143312:
                if (str.equals("SHOWS_AUDIO_SKIP_FINISHED_EPISODES_DIALOG")) {
                    return G1("SHOWS_AUDIO_SKIP_FINISHED_EPISODES_DIALOG", "shows/audio/skip-finished-episodes-dialog", 1870, "shows");
                }
                return null;
            case -1711264128:
                if (str.equals("LISTENINGPARTY_HYPE_ROOM")) {
                    return G1("LISTENINGPARTY_HYPE_ROOM", "listeningparty/hype-room", 921, "listeningparty");
                }
                return null;
            case -1705541600:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_REQUESTEMAIL")) {
                    return G1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAIL", "login/accountrecovery/requestemail", 940, "login");
                }
                return null;
            case -1689855152:
                if (str.equals("ENTITYSEGMENTS_CHAPTERSELECTOR")) {
                    return v1();
                }
                return null;
            case -1628115536:
                if (str.equals("AGE_SIGNAL_SIGNUP_CONFIRM_AGE")) {
                    return G1("AGE_SIGNAL_SIGNUP_CONFIRM_AGE", "age-signal/signup/confirm-age", 134, "age-signal");
                }
                return null;
            case -1572230448:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSKEYS")) {
                    return G1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSKEYS", "www-account-pages/login-methods-v2-passkeys", 2214, "www-account-pages");
                }
                return null;
            case -1480702560:
                if (str.equals("NOWPLAYING_VIDEOSETTINGS_VIDEOQUALITYSELECTION")) {
                    return G1("NOWPLAYING_VIDEOSETTINGS_VIDEOQUALITYSELECTION", "nowplaying/videosettings/videoqualityselection", 1365, "nowplaying");
                }
                return null;
            case -1360550384:
                if (str.equals("GOLDENPATH_WSANTOSBARBOSA")) {
                    return G1("GOLDENPATH_WSANTOSBARBOSA", "goldenpath/wsantosbarbosa", 758, "goldenpath");
                }
                return null;
            case -1341705872:
                if (str.equals("S4P_PODCAST_EPISODE")) {
                    return G1("S4P_PODCAST_EPISODE", "s4p/podcast/episode", 1727, "s4p");
                }
                return null;
            case -1329990896:
                if (str.equals("PROFILE_PRIVACY_SETTINGS")) {
                    return r4();
                }
                return null;
            case -1313005488:
                if (str.equals("RESETPASSWORD_EMAILLANDING")) {
                    return G1("RESETPASSWORD_EMAILLANDING", "resetpassword/emaillanding", 1655, "resetpassword");
                }
                return null;
            case -1261303264:
                if (str.equals("PODCAST_EPISODE_TIMELINE")) {
                    return G1("PODCAST_EPISODE_TIMELINE", "podcast/episode/timeline", 1486, "podcast");
                }
                return null;
            case -1209281984:
                if (str.equals("CHARTS_UNKNOWN")) {
                    return G1("CHARTS_UNKNOWN", "charts/unknown", 310, "charts");
                }
                return null;
            case -1178841392:
                if (str.equals("WATCHAPP_SETTINGS")) {
                    return G1("WATCHAPP_SETTINGS", "watchapp/settings", 2121, "watchapp");
                }
                return null;
            case -1140786336:
                if (str.equals("LOGIN_CONTINUEWITH_EMAIL")) {
                    return G1("LOGIN_CONTINUEWITH_EMAIL", "login/continuewith/email", 946, "login");
                }
                return null;
            case -1138064464:
                if (str.equals("GOLDENPATH_AKOSO")) {
                    return G1("GOLDENPATH_AKOSO", "goldenpath/akoso", 615, "goldenpath");
                }
                return null;
            case -1087139392:
                if (str.equals("S4P_ANALYTICS_NOTIFICATION_CHARTS")) {
                    return G1("S4P_ANALYTICS_NOTIFICATION_CHARTS", "s4p/analytics/notification/charts", 1670, "s4p");
                }
                return null;
            case -1079486592:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_RELEASE")) {
                    return G1("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_RELEASE", "mrkt/artist/video/clips/create/select-release", 1154, "mrkt");
                }
                return null;
            case -991327488:
                if (str.equals("GOLDENPATH_MAHEENK")) {
                    return G1("GOLDENPATH_MAHEENK", "goldenpath/maheenk", 688, "goldenpath");
                }
                return null;
            case -913842176:
                if (str.equals("GOLDENPATH_ARNAVA")) {
                    return G1("GOLDENPATH_ARNAVA", "goldenpath/arnava", 620, "goldenpath");
                }
                return null;
            case -893331920:
                if (str.equals("GOLDENPATH_HITSTER")) {
                    return G1("GOLDENPATH_HITSTER", "goldenpath/hitster", 656, "goldenpath");
                }
                return null;
            case -859799968:
                if (str.equals("MRKT_ACTIVITY")) {
                    return G1("MRKT_ACTIVITY", "mrkt/activity", 1037, "mrkt");
                }
                return null;
            case -852534560:
                if (str.equals("REINVENTFREE_BACKSKIP_UPSELL")) {
                    return G4();
                }
                return null;
            case -832176640:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_DELETEMANAGEDACCOUNT")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_DELETEMANAGEDACCOUNT", "www-account-pages/parental-settings/deletemanagedaccount", 2222, "www-account-pages");
                }
                return null;
            case -776225872:
                if (str.equals("DIALOG_CONNECT_PLAYBACK_ERROR")) {
                    return s1();
                }
                return null;
            case -764918288:
                if (str.equals("HOMETHING_ACTIVATION_CONNECTED")) {
                    return G1("HOMETHING_ACTIVATION_CONNECTED", "homething/activation/connected", 820, "homething");
                }
                return null;
            case -724691200:
                if (str.equals("PROFILE_EDIT")) {
                    return m4();
                }
                return null;
            case -705485440:
                if (str.equals("WATCHAPP_ESDK_DEBUG_COUNTERS")) {
                    return G1("WATCHAPP_ESDK_DEBUG_COUNTERS", "watchapp/esdk-debug-counters", 2105, "watchapp");
                }
                return null;
            case -683246960:
                if (str.equals("STATIONSPROMO")) {
                    return G1("STATIONSPROMO", "stationspromo", 1982, "stationspromo");
                }
                return null;
            case -674662800:
                if (str.equals("COLLECTION_PODCASTS")) {
                    return G1("COLLECTION_PODCASTS", "collection/podcasts", 356, "collection");
                }
                return null;
            case -655294704:
                if (str.equals("PARENTAL_CONTROL_MAKE_ALLOWLISTING_REQUEST")) {
                    return G1("PARENTAL_CONTROL_MAKE_ALLOWLISTING_REQUEST", "parental-control/make-allowlisting-request", 1407, "parental-control");
                }
                return null;
            case -636677760:
                if (str.equals("PUFFIN_MANUAL_SELECT")) {
                    return G1("PUFFIN_MANUAL_SELECT", "puffin/manual-select", 1598, "puffin");
                }
                return null;
            case -620849584:
                if (str.equals("WEAR_ACCOUNT_WELCOME")) {
                    return G1("WEAR_ACCOUNT_WELCOME", "wear/account_welcome", 2130, "wear");
                }
                return null;
            case -596154224:
                if (str.equals("SUPERBIRD_SETUP_TESTSOUND")) {
                    return G1("SUPERBIRD_SETUP_TESTSOUND", "superbird/setup/testsound", 2016, "superbird");
                }
                return null;
            case -595080672:
                if (str.equals("MRKT_LEGAL_PRIVACY_POLICY")) {
                    return G1("MRKT_LEGAL_PRIVACY_POLICY", "mrkt/legal/privacy-policy", 1283, "mrkt");
                }
                return null;
            case -591364992:
                if (str.equals("SUPERBIRD_SETUP_MOUNTSELECTION")) {
                    return G1("SUPERBIRD_SETUP_MOUNTSELECTION", "superbird/setup/mountselection", 2012, "superbird");
                }
                return null;
            case -576782960:
                if (str.equals("ABOUTENTITY")) {
                    return r();
                }
                return null;
            case -573323600:
                if (str.equals("GOLDENPATH_MOEING")) {
                    return G1("GOLDENPATH_MOEING", "goldenpath/moeing", 708, "goldenpath");
                }
                return null;
            case -553427360:
                if (str.equals("PERMISSIONS_LOCATION_REQUEST")) {
                    return t3();
                }
                return null;
            case -528749568:
                if (str.equals("WATCHAPP_ALBUM_ENTITY")) {
                    return G1("WATCHAPP_ALBUM_ENTITY", "watchapp/album-entity", 2090, "watchapp");
                }
                return null;
            case -513708544:
                if (str.equals("CHECKOUT_GPB")) {
                    return G1("CHECKOUT_GPB", "checkout/gpb", 337, "checkout");
                }
                return null;
            case -506402832:
                if (str.equals("S4P_INTERACT_COMMENTS_INSIGHTS_DETAILS")) {
                    return G1("S4P_INTERACT_COMMENTS_INSIGHTS_DETAILS", "s4p/interact/comments-insights-details", 1715, "s4p");
                }
                return null;
            case -484731248:
                if (str.equals("HOMEMIX_TASTEONBOARDING")) {
                    return G1("HOMEMIX_TASTEONBOARDING", "homemix/tasteonboarding", 817, "homemix");
                }
                return null;
            case -425898464:
                if (str.equals("GOLDENPATH_MPASOTTI")) {
                    return G1("GOLDENPATH_MPASOTTI", "goldenpath/mpasotti", 711, "goldenpath");
                }
                return null;
            case -417523760:
                if (str.equals("MRKT_VIDEO_WRAPPED")) {
                    return G1("MRKT_VIDEO_WRAPPED", "mrkt/video/wrapped", 1330, "mrkt");
                }
                return null;
            case -410631504:
                if (str.equals("GOLDENPATH_SEJMAK")) {
                    return G1("GOLDENPATH_SEJMAK", "goldenpath/sejmak", 745, "goldenpath");
                }
                return null;
            case -409331968:
                if (str.equals("ADS_SENSITIVE_AD_CATEGORIES")) {
                    return G1("ADS_SENSITIVE_AD_CATEGORIES", "ads/sensitive-ad-categories", 25, "ads");
                }
                return null;
            case -398659792:
                if (str.equals("CAR_MODE_HOME")) {
                    return G1("CAR_MODE_HOME", "car-mode/home", 275, "car-mode");
                }
                return null;
            case -394502304:
                if (str.equals("SUPPORT_SITE_OLD_CONTACT")) {
                    return G1("SUPPORT_SITE_OLD_CONTACT", "support-site/old/contact", 2027, "support-site");
                }
                return null;
            case -379973376:
                if (str.equals("GOLDENPATH_MAREIKEK")) {
                    return G1("GOLDENPATH_MAREIKEK", "goldenpath/mareikek", 692, "goldenpath");
                }
                return null;
            case -375297120:
                if (str.equals("MRKT_ARTIST_MUSIC_PLAYLISTS")) {
                    return G1("MRKT_ARTIST_MUSIC_PLAYLISTS", "mrkt/artist/music/playlists", 1095, "mrkt");
                }
                return null;
            case -372721680:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS", "mrkt/debug/hubs/component-reference/page-headers", 1206, "mrkt");
                }
                return null;
            case -368540960:
                if (str.equals("CONCERTS_RESERVED_ONBOARDING")) {
                    return G1("CONCERTS_RESERVED_ONBOARDING", "concerts/reserved-onboarding", 393, "concerts");
                }
                return null;
            case -332786176:
                if (str.equals("MRKT_WAITING_ROOM_HOME")) {
                    return G1("MRKT_WAITING_ROOM_HOME", "mrkt/waiting-room/home", 1332, "mrkt");
                }
                return null;
            case -305430112:
                if (str.equals("PODCAST_EPISODE_AUDIOBOOK")) {
                    return G1("PODCAST_EPISODE_AUDIOBOOK", "podcast/episode/audiobook", 1482, "podcast");
                }
                return null;
            case -295274256:
                if (str.equals("GOLDENPATH_DIEGOALFREDOR")) {
                    return G1("GOLDENPATH_DIEGOALFREDOR", "goldenpath/diegoalfredor", 634, "goldenpath");
                }
                return null;
            case -263995872:
                if (str.equals("SIGNUP_BASICUSERINFO")) {
                    return G1("SIGNUP_BASICUSERINFO", "signup/basicuserinfo", 1885, "signup");
                }
                return null;
            case -244944992:
                if (str.equals("WATCHAPP_SIRI_ERROR_ALERT")) {
                    return G1("WATCHAPP_SIRI_ERROR_ALERT", "watchapp/siri-error-alert", 2123, "watchapp");
                }
                return null;
            case -129753872:
                if (str.equals("CONTRIBUTION_NOTES_MANAGEMENT")) {
                    return h1();
                }
                return null;
            case -42064992:
                if (str.equals("MRKT_CANVAS_EDIT")) {
                    return G1("MRKT_CANVAS_EDIT", "mrkt/canvas/edit", 1196, "mrkt");
                }
                return null;
            case -22687664:
                if (str.equals("WWW_ACCOUNT_PAGES_AUTHENTICATIONSETTINGS")) {
                    return G1("WWW_ACCOUNT_PAGES_AUTHENTICATIONSETTINGS", "www-account-pages/authenticationsettings", 2188, "www-account-pages");
                }
                return null;
            case -20510512:
                if (str.equals("CHAT_GIF_PICKER")) {
                    return v0();
                }
                return null;
            case 64656:
                if (str.equals("ADS")) {
                    return G1("ADS", "ads", 18, "ads");
                }
                return null;
            case 18658800:
                if (str.equals("EXPERIMENTAL_LISTENINGHISTORY")) {
                    return G1("EXPERIMENTAL_LISTENINGHISTORY", "experimental/listeninghistory", 532, "experimental");
                }
                return null;
            case 34537008:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_DETAILS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_DETAILS", "spotify-for-authors/audiobook/details", 1937, "spotify-for-authors");
                }
                return null;
            case 40103472:
                if (str.equals("WATCHAPP_AUDIOBOOK_ENTITY")) {
                    return G1("WATCHAPP_AUDIOBOOK_ENTITY", "watchapp/audiobook-entity", 2094, "watchapp");
                }
                return null;
            case 47539136:
                if (str.equals("CONTEXTMENU_DJSUBMITFEEDBACK_REPORT_CONCERN")) {
                    return G1("CONTEXTMENU_DJSUBMITFEEDBACK_REPORT_CONCERN", "contextmenu/djsubmitfeedback/report-concern", 427, "contextmenu");
                }
                return null;
            case 78838864:
                if (str.equals("ENTERPRISEPODCASTS")) {
                    return G1("ENTERPRISEPODCASTS", "enterprisepodcasts", 515, "enterprisepodcasts");
                }
                return null;
            case 120896032:
                if (str.equals("GOLDENPATH_NICOLAM")) {
                    return G1("GOLDENPATH_NICOLAM", "goldenpath/nicolam", 721, "goldenpath");
                }
                return null;
            case 141086368:
                if (str.equals("CHAT_MUTE")) {
                    return A0();
                }
                return null;
            case 157534560:
                if (str.equals("INAPPMESSAGE_BOTTOMSHEET")) {
                    return c2();
                }
                return null;
            case 187619120:
                if (str.equals("MEMBERSHIP_CONSUMER_RETURN")) {
                    return G1("MEMBERSHIP_CONSUMER_RETURN", "membership/consumer/return", 1029, "membership");
                }
                return null;
            case 236758064:
                if (str.equals("GOLDENPATH_SHEROZN")) {
                    return G1("GOLDENPATH_SHEROZN", "goldenpath/sherozn", 748, "goldenpath");
                }
                return null;
            case 265520896:
                if (str.equals("GOLDENPATH_JMAKINDA")) {
                    return G1("GOLDENPATH_JMAKINDA", "goldenpath/jmakinda", 667, "goldenpath");
                }
                return null;
            case 389980032:
                if (str.equals("SHARE_MENU_COMPOSER")) {
                    return G1("SHARE_MENU_COMPOSER", "share-menu/composer", 1855, "share-menu");
                }
                return null;
            case 421995568:
                if (str.equals("BLUEJAY_QUESTION_PICKER")) {
                    return G1("BLUEJAY_QUESTION_PICKER", "bluejay/question-picker", 234, "bluejay");
                }
                return null;
            case 431950768:
                if (str.equals("WWW_ACCOUNT_PAGES_RECEIPTS")) {
                    return G1("WWW_ACCOUNT_PAGES_RECEIPTS", "www-account-pages/receipts", 2239, "www-account-pages");
                }
                return null;
            case 438694480:
                if (str.equals("MRKT_APP_SETTINGS_PUSH_NOTIFICATIONS")) {
                    return G1("MRKT_APP_SETTINGS_PUSH_NOTIFICATIONS", "mrkt/app-settings/push-notifications", 1040, "mrkt");
                }
                return null;
            case 449979168:
                if (str.equals("KID_ACCOUNT_CREATION_COPPA")) {
                    return G1("KID_ACCOUNT_CREATION_COPPA", "kid-account-creation/coppa", 876, "kid-account-creation");
                }
                return null;
            case 457884976:
                if (str.equals("AGE_ASSURANCE_START")) {
                    return G1("AGE_ASSURANCE_START", "age-assurance/start", 126, "age-assurance");
                }
                return null;
            case 546991680:
                if (str.equals("DIALOG_SHOW_VIDEOUNAVAILABLE")) {
                    return G1("DIALOG_SHOW_VIDEOUNAVAILABLE", "dialog/show/videounavailable", 490, "dialog");
                }
                return null;
            case 548719040:
                if (str.equals("ADSDISPLAY_CTAWIDGETNPV_SEEALL")) {
                    return G1("ADSDISPLAY_CTAWIDGETNPV_SEEALL", "adsdisplay/ctawidgetnpv/seeall", 27, "adsdisplay");
                }
                return null;
            case 558436704:
                if (str.equals("MRKT_PROFILE_PROTECTION")) {
                    return G1("MRKT_PROFILE_PROTECTION", "mrkt/profile-protection", 1295, "mrkt");
                }
                return null;
            case 575513072:
                if (str.equals("NOWPLAYING_QUEUE_PEEK")) {
                    return G1("NOWPLAYING_QUEUE_PEEK", "nowplaying/queue/peek", 1362, "nowplaying");
                }
                return null;
            case 589840592:
                if (str.equals("LISTENINGACTIVITY_ONBOARDING")) {
                    return r2();
                }
                return null;
            case 637474432:
                if (str.equals("PARENTAL_CONTROL_MANAGED_ACCOUNTS_REQUEST_SETTINGS")) {
                    return G1("PARENTAL_CONTROL_MANAGED_ACCOUNTS_REQUEST_SETTINGS", "parental-control/managed-accounts-request-settings", 1413, "parental-control");
                }
                return null;
            case 656303312:
                if (str.equals("QUIZ_GAMEPLAY")) {
                    return x4();
                }
                return null;
            case 664264800:
                if (str.equals("MRKT_ARTIST_EVENTS")) {
                    return G1("MRKT_ARTIST_EVENTS", "mrkt/artist/events", 1083, "mrkt");
                }
                return null;
            case 691172032:
                if (str.equals("SETTINGS_VIDEOQUALITY")) {
                    return G1("SETTINGS_VIDEOQUALITY", "settings/videoquality", 1850, "settings");
                }
                return null;
            case 699396112:
                if (str.equals("PUFFIN_ONBOARDING")) {
                    return G1("PUFFIN_ONBOARDING", "puffin/onboarding", 1600, "puffin");
                }
                return null;
            case 703650688:
                if (str.equals("PODCAST_EPISODE")) {
                    return O3();
                }
                return null;
            case 708675856:
                if (str.equals("S4P_PODCAST_CLIP_BETAMAX_PLAYER")) {
                    return G1("S4P_PODCAST_CLIP_BETAMAX_PLAYER", "s4p/podcast/clip/betamax-player", 1725, "s4p");
                }
                return null;
            case 713810080:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUTHORS_PROFILE")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUTHORS_PROFILE", "spotify-for-authors/authors/profile", 1941, "spotify-for-authors");
                }
                return null;
            case 747596832:
                if (str.equals("PREMIUM_SIGNUP")) {
                    return g4();
                }
                return null;
            case 764725504:
                if (str.equals("KID_ACCOUNT_CREATION_PIN")) {
                    return G1("KID_ACCOUNT_CREATION_PIN", "kid-account-creation/pin", 882, "kid-account-creation");
                }
                return null;
            case 776117424:
                if (str.equals("AGE_ASSURANCE_WELCOME")) {
                    return G1("AGE_ASSURANCE_WELCOME", "age-assurance/welcome", 129, "age-assurance");
                }
                return null;
            case 791621664:
                if (str.equals("UBI_SHOWCASE_TEST_ROOT")) {
                    return G1("UBI_SHOWCASE_TEST_ROOT", "ubi/showcase-test-root", 2059, "ubi");
                }
                return null;
            case 833460320:
                if (str.equals("AGE_SIGNAL_SIGNUP_ASK_PARENT")) {
                    return G1("AGE_SIGNAL_SIGNUP_ASK_PARENT", "age-signal/signup/ask-parent", 133, "age-signal");
                }
                return null;
            case 867300672:
                if (str.equals("S4P_WEB_VIEW_HOW_TO_INSERT_AD_BREAKS")) {
                    return G1("S4P_WEB_VIEW_HOW_TO_INSERT_AD_BREAKS", "s4p/web-view/how-to-insert-ad-breaks", 1771, "s4p");
                }
                return null;
            case 884980880:
                if (str.equals("BOOTCAMP_MASHUP")) {
                    return G1("BOOTCAMP_MASHUP", "bootcamp/mashup", 242, "bootcamp");
                }
                return null;
            case 917548864:
                if (str.equals("WATCHAPP_ERROR_LOG")) {
                    return G1("WATCHAPP_ERROR_LOG", "watchapp/error-log", 2104, "watchapp");
                }
                return null;
            case 1050183824:
                if (str.equals("PORTAL_SEARCH_PLATFORMS_AND_TOOLS")) {
                    return G1("PORTAL_SEARCH_PLATFORMS_AND_TOOLS", "portal/search-platforms-and-tools", 1534, "portal");
                }
                return null;
            case 1128244016:
                if (str.equals("S4P_SETUP_SHOW_PLATFORM_SELECTION")) {
                    return G1("S4P_SETUP_SHOW_PLATFORM_SELECTION", "s4p/setup-show/platform-selection", 1757, "s4p");
                }
                return null;
            case 1153594880:
                if (str.equals("CHALLENGE_AUTH_CALLBACK")) {
                    return G1("CHALLENGE_AUTH_CALLBACK", "challenge/auth-callback", 290, "challenge");
                }
                return null;
            case 1241660928:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_REMOVEPLAYED")) {
                    return G1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEPLAYED", "collection/yourepisodes/settings/removeplayed", 373, "collection");
                }
                return null;
            case 1273264128:
                if (str.equals("CHARTS_VIRAL")) {
                    return G1("CHARTS_VIRAL", "charts/viral", 311, "charts");
                }
                return null;
            case 1303457136:
                if (str.equals("STS_KUNGSHOLMEN_IMPORT")) {
                    return G1("STS_KUNGSHOLMEN_IMPORT", "sts/kungsholmen/import", 1987, "sts");
                }
                return null;
            case 1312098304:
                if (str.equals("S4P_WEB_VIEW_HOW_TO_GROW_AN_AUDIENCE")) {
                    return G1("S4P_WEB_VIEW_HOW_TO_GROW_AN_AUDIENCE", "s4p/web-view/how-to-grow-an-audience", 1770, "s4p");
                }
                return null;
            case 1312439344:
                if (str.equals("MRKT_DM_MANAGED_SERVICE")) {
                    return G1("MRKT_DM_MANAGED_SERVICE", "mrkt/dm-managed-service", 1229, "mrkt");
                }
                return null;
            case 1353952272:
                if (str.equals("MRKT_TEAM_MANAGEMENT_BILLING")) {
                    return G1("MRKT_TEAM_MANAGEMENT_BILLING", "mrkt/team-management/billing", 1307, "mrkt");
                }
                return null;
            case 1402102816:
                if (str.equals("KID_PARENTAL_BLOCKING_ARTIST")) {
                    return G1("KID_PARENTAL_BLOCKING_ARTIST", "kid-parental-blocking/artist", 900, "kid-parental-blocking");
                }
                return null;
            case 1425762816:
                if (str.equals("JAM_LISTENINGALONGINPUTSHEET")) {
                    return G1("JAM_LISTENINGALONGINPUTSHEET", "jam/listeningalonginputsheet", 864, "jam");
                }
                return null;
            case 1437220656:
                if (str.equals("MRKT_TEAM_LABEL_ARTISTS")) {
                    return G1("MRKT_TEAM_LABEL_ARTISTS", "mrkt/team/label/artists", 1320, "mrkt");
                }
                return null;
            case 1592705856:
                if (str.equals("OFFLINE_SYNC_ERROR")) {
                    return G1("OFFLINE_SYNC_ERROR", "offline-sync/error", 1375, "offline-sync");
                }
                return null;
            case 1594307056:
                if (str.equals("WWW_ACCOUNT_PAGES_CONSUMPTION_TRACKING")) {
                    return G1("WWW_ACCOUNT_PAGES_CONSUMPTION_TRACKING", "www-account-pages/consumption-tracking", 2196, "www-account-pages");
                }
                return null;
            case 1606653136:
                if (str.equals("PLAYLIST_CREATE_EUTERPE")) {
                    return E3();
                }
                return null;
            case 1618956896:
                if (str.equals("RESETPASSWORD_CHANGEPASSWORD")) {
                    return G1("RESETPASSWORD_CHANGEPASSWORD", "resetpassword/changepassword", 1654, "resetpassword");
                }
                return null;
            case 1689484272:
                if (str.equals("FREETIER_TASTEONBOARDING_UPDATETASTE")) {
                    return G1("FREETIER_TASTEONBOARDING_UPDATETASTE", "freetier/tasteonboarding/updatetaste", 589, "freetier");
                }
                return null;
            case 1739470448:
                if (str.equals("SRC_RIGHTSHOLDER_DISPUTES")) {
                    return G1("SRC_RIGHTSHOLDER_DISPUTES", "src/rightsholder/disputes", 1972, "src");
                }
                return null;
            case 1771249920:
                if (str.equals("MRKT_ARTIST_RELEASE_STATS")) {
                    return G1("MRKT_ARTIST_RELEASE_STATS", "mrkt/artist/release/stats", 1137, "mrkt");
                }
                return null;
            case 1823154912:
                if (str.equals("MRKT_ARTIST_AUDIENCE_COUNTRIES")) {
                    return G1("MRKT_ARTIST_AUDIENCE_COUNTRIES", "mrkt/artist/audience/countries", 1047, "mrkt");
                }
                return null;
            case 1836387664:
                if (str.equals("CHAT_ADD_FRIENDS")) {
                    return G1("CHAT_ADD_FRIENDS", "chat/add-friends", 315, "chat");
                }
                return null;
            case 1837080592:
                if (str.equals("MRKT_ARTIST_PROFILE_ABOUT")) {
                    return G1("MRKT_ARTIST_PROFILE_ABOUT", "mrkt/artist/profile/about", 1113, "mrkt");
                }
                return null;
            case 1898983520:
                if (str.equals("COLLECTION_PLAYLISTS")) {
                    return G1("COLLECTION_PLAYLISTS", "collection/playlists", 355, "collection");
                }
                return null;
            case 1909422064:
                if (str.equals("GIFT_SHARE")) {
                    return G1("GIFT_SHARE", "gift-share", 605, "gift-share");
                }
                return null;
            case 1915870784:
                if (str.equals("WWW_ACCOUNT_PAGES_SIGNEDOUT_CANCEL_SUBSCRIPTION")) {
                    return G1("WWW_ACCOUNT_PAGES_SIGNEDOUT_CANCEL_SUBSCRIPTION", "www-account-pages/signedout-cancel-subscription", 2244, "www-account-pages");
                }
                return null;
            case 1915887888:
                if (str.equals("CHILD_LED_SIGNUP_REQUEST_PARENTAL_CONSENT")) {
                    return G1("CHILD_LED_SIGNUP_REQUEST_PARENTAL_CONSENT", "child-led-signup/request-parental-consent", 342, "child-led-signup");
                }
                return null;
            case 1918319264:
                if (str.equals("MRKT_FRONTDOOR_CAMPAIGN_KIT")) {
                    return G1("MRKT_FRONTDOOR_CAMPAIGN_KIT", "mrkt/frontdoor/campaign-kit", 1242, "mrkt");
                }
                return null;
            case 2053390560:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_DETAILS")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_DETAILS", "mrkt/artist/video/music-videos/details", 1161, "mrkt");
                }
                return null;
            case 2121208784:
                if (str.equals("KID_ACCOUNT_CREATION_AGE_VERIFICATION")) {
                    return l2();
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 O() {
        return G1("ARTIST_ABOUT", "artist/about", 155, "artist");
    }

    public static p6r0 O0() {
        return G1("CONCERTS_ARTIST", "concerts/artist", 386, "concerts");
    }

    public static p6r0 O1() {
        return G1("HOME", "home", 795, "home");
    }

    public static p6r0 O2() {
        return G1("MARTINI_FEEDBACK", "martini/feedback", 1016, "martini");
    }

    public static p6r0 O3() {
        return G1("PODCAST_EPISODE", "podcast/episode", 1481, "podcast");
    }

    public static p6r0 O4() {
        return G1("REINVENTFREE_TIME_CAP_UPSELL", "reinventfree-time-cap-upsell", 1644, "reinventfree-time-cap-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 O5(String str) {
        switch (str.hashCode()) {
            case -2139850287:
                if (str.equals("MRKT_FRONTDOOR_GET_READY_FOR_WRAPPED")) {
                    return G1("MRKT_FRONTDOOR_GET_READY_FOR_WRAPPED", "mrkt/frontdoor/get-ready-for-wrapped", 1257, "mrkt");
                }
                return null;
            case -2124290175:
                if (str.equals("MRKT_EXPRESSION_VIDEO_YOUR_ARTIST_MESSAGE")) {
                    return G1("MRKT_EXPRESSION_VIDEO_YOUR_ARTIST_MESSAGE", "mrkt/expression-video/your-artist-message", 1235, "mrkt");
                }
                return null;
            case -2109967311:
                if (str.equals("MRKT_VIDEO_CREATE")) {
                    return G1("MRKT_VIDEO_CREATE", "mrkt/video/create", 1327, "mrkt");
                }
                return null;
            case -2080380207:
                if (str.equals("CHALLENGE_TRANSITION")) {
                    return G1("CHALLENGE_TRANSITION", "challenge/transition", 301, "challenge");
                }
                return null;
            case -2053631551:
                if (str.equals("LANGUAGEPICKER_NOSKIPDIALOG")) {
                    return p2();
                }
                return null;
            case -2036674511:
                if (str.equals("MRKT_ARTIST_SONG_COUNTRIES")) {
                    return G1("MRKT_ARTIST_SONG_COUNTRIES", "mrkt/artist/song/countries", 1143, "mrkt");
                }
                return null;
            case -2036164751:
                if (str.equals("CARS_MEDIASERVICE")) {
                    return G1("CARS_MEDIASERVICE", "cars/mediaservice", 284, "cars");
                }
                return null;
            case -2001759119:
                if (str.equals("S4P_ANALYTICSWIDGET_CONFIGURATION")) {
                    return G1("S4P_ANALYTICSWIDGET_CONFIGURATION", "s4p/analyticswidget-configuration", 1672, "s4p");
                }
                return null;
            case -1989559455:
                if (str.equals("LOGIN_DIALOG_FACEBOOKERROR")) {
                    return G1("LOGIN_DIALOG_FACEBOOKERROR", "login/dialog/facebookerror", 947, "login");
                }
                return null;
            case -1980227375:
                if (str.equals("DOWNLOAD_VIDEO_SELECTION")) {
                    return G1("DOWNLOAD_VIDEO_SELECTION", "download/video-selection", 501, "download");
                }
                return null;
            case -1932690975:
                if (str.equals("PAGE_MATCH_INBOUND_SCANNING")) {
                    return G1("PAGE_MATCH_INBOUND_SCANNING", "page-match/inbound-scanning", 1392, "page-match");
                }
                return null;
            case -1924753935:
                if (str.equals("SETTINGS_ACCOUNT")) {
                    return X4();
                }
                return null;
            case -1878425535:
                if (str.equals("FREE_TIER_TRACK")) {
                    return F1();
                }
                return null;
            case -1866339423:
                if (str.equals("MRKT_ARTIST_AUDIENCE_SEGMENTS_NO_ARTIST_REDIRECT")) {
                    return G1("MRKT_ARTIST_AUDIENCE_SEGMENTS_NO_ARTIST_REDIRECT", "mrkt/artist/audience/segments/no-artist-redirect", 1055, "mrkt");
                }
                return null;
            case -1846178591:
                if (str.equals("PLAYLIST_ADDTOPLAYLIST")) {
                    return B3();
                }
                return null;
            case -1790183983:
                if (str.equals("BLUEJAY_ERROR_SHEET")) {
                    return G1("BLUEJAY_ERROR_SHEET", "bluejay/error-sheet", 231, "bluejay");
                }
                return null;
            case -1776611247:
                if (str.equals("FACEBOOK_CONNECT")) {
                    return G1("FACEBOOK_CONNECT", "facebook/connect", 541, "facebook");
                }
                return null;
            case -1763403007:
                if (str.equals("STUDIO_LANGUAGE_SETTINGS")) {
                    return G1("STUDIO_LANGUAGE_SETTINGS", "studio/language-settings", 1991, "studio");
                }
                return null;
            case -1710227775:
                if (str.equals("PODCAST_LOADING")) {
                    return G1("PODCAST_LOADING", "podcast/loading", 1489, "podcast");
                }
                return null;
            case -1698561183:
                if (str.equals("GOLDENPATH_YOGA")) {
                    return G1("GOLDENPATH_YOGA", "goldenpath/yoga", 760, "goldenpath");
                }
                return null;
            case -1670362063:
                if (str.equals("STS_ACCESS")) {
                    return G1("STS_ACCESS", "sts/access", 1984, "sts");
                }
                return null;
            case -1624548543:
                if (str.equals("SETTINGS_IMPORT")) {
                    return G1("SETTINGS_IMPORT", "settings/import", 1821, "settings");
                }
                return null;
            case -1615448831:
                if (str.equals("RATINGS_AND_REVIEWS_RATINGS_AUDIOBOOK")) {
                    return G1("RATINGS_AND_REVIEWS_RATINGS_AUDIOBOOK", "ratings-and-reviews/ratings/audiobook", 1623, "ratings-and-reviews");
                }
                return null;
            case -1568930943:
                if (str.equals("HOME_PODCASTS_FOLLOWING")) {
                    return U1();
                }
                return null;
            case -1524127359:
                if (str.equals("BLUEJAY_LOCATION_PICKER")) {
                    return G1("BLUEJAY_LOCATION_PICKER", "bluejay/location-picker", 232, "bluejay");
                }
                return null;
            case -1515666815:
                if (str.equals("GOLDENPATH_CAMPBANDITS")) {
                    return G1("GOLDENPATH_CAMPBANDITS", "goldenpath/campbandits", 625, "goldenpath");
                }
                return null;
            case -1508897567:
                if (str.equals("S4P_SETUP_SHOW_TABLE_OF_CONTENTS")) {
                    return G1("S4P_SETUP_SHOW_TABLE_OF_CONTENTS", "s4p/setup-show/table-of-contents", 1759, "s4p");
                }
                return null;
            case -1503717071:
                if (str.equals("BOOTCAMP_TOPTRACKS")) {
                    return G1("BOOTCAMP_TOPTRACKS", "bootcamp/toptracks", 247, "bootcamp");
                }
                return null;
            case -1502698735:
                if (str.equals("WEAR_YOUR_LIBRARY_YOUR_LIBRARY_DETAIL")) {
                    return G1("WEAR_YOUR_LIBRARY_YOUR_LIBRARY_DETAIL", "wear/your_library/your_library_detail", 2174, "wear");
                }
                return null;
            case -1427972591:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_ERRORS")) {
                    return G1("MRKT_BULK_CAMPAIGNS_UPLOAD_ERRORS", "mrkt/bulk-campaigns/upload/errors", 1192, "mrkt");
                }
                return null;
            case -1377382239:
                if (str.equals("SEARCH_PROFILES")) {
                    return G1("SEARCH_PROFILES", "search/profiles", 1797, "search");
                }
                return null;
            case -1369918559:
                if (str.equals("MRKT_ARTIST_NOTIFICATIONS")) {
                    return G1("MRKT_ARTIST_NOTIFICATIONS", "mrkt/artist/notifications", 1105, "mrkt");
                }
                return null;
            case -1307129327:
                if (str.equals("SUPERBIRD_SETUP_MOUNTINSTRUCTIONS")) {
                    return G1("SUPERBIRD_SETUP_MOUNTINSTRUCTIONS", "superbird/setup/mountinstructions", 2011, "superbird");
                }
                return null;
            case -1278134767:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_EMAIL")) {
                    return G1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_EMAIL", "www-account-pages/login-methods-v2-email", 2213, "www-account-pages");
                }
                return null;
            case -1252827039:
                if (str.equals("ADSTUDIO_REPORT_CREATE")) {
                    return G1("ADSTUDIO_REPORT_CREATE", "adstudio/report/create", Error.INVALID_COUNTRY_FIELD_NUMBER, "adstudio");
                }
                return null;
            case -1227559535:
                if (str.equals("SHARE_MISSINGUSER")) {
                    return G1("SHARE_MISSINGUSER", "share/missinguser", 1864, "share");
                }
                return null;
            case -1129676863:
                if (str.equals("GOLDENPATH_JNASH")) {
                    return G1("GOLDENPATH_JNASH", "goldenpath/jnash", 669, "goldenpath");
                }
                return null;
            case -1129643039:
                if (str.equals("GOLDENPATH_JOEYK")) {
                    return G1("GOLDENPATH_JOEYK", "goldenpath/joeyk", 671, "goldenpath");
                }
                return null;
            case -1104091151:
                if (str.equals("PAGE_MATCH_ADD_PAGE_NUMBER")) {
                    return G1("PAGE_MATCH_ADD_PAGE_NUMBER", "page-match/add-page-number", 1389, "page-match");
                }
                return null;
            case -1018323535:
                if (str.equals("PODCAST_CREATOR")) {
                    return G1("PODCAST_CREATOR", "podcast/creator", 1479, "podcast");
                }
                return null;
            case -998412015:
                if (str.equals("COURSE_UPSELL")) {
                    return G1("COURSE_UPSELL", "course/upsell", 460, "course");
                }
                return null;
            case -941625279:
                if (str.equals("OURSONG_SHARE")) {
                    return G1("OURSONG_SHARE", "oursong/share", 1386, "oursong");
                }
                return null;
            case -907458399:
                if (str.equals("HOME_PODCASTS_FOLLOW")) {
                    return G1("HOME_PODCASTS_FOLLOW", "home/podcasts-follow", 804, "home");
                }
                return null;
            case -884181151:
                if (str.equals("HOMEMIX_USERTOGGLE")) {
                    return G1("HOMEMIX_USERTOGGLE", "homemix/usertoggle", 818, "homemix");
                }
                return null;
            case -872410671:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGE_GALLERY")) {
                    return G1("MRKT_ARTIST_PROFILE_IMAGE_GALLERY", "mrkt/artist/profile/image-gallery", 1128, "mrkt");
                }
                return null;
            case -871264655:
                if (str.equals("BYOM_VOLUME_CONTROLS")) {
                    return G1("BYOM_VOLUME_CONTROLS", "byom/volume-controls", 264, "byom");
                }
                return null;
            case -807078927:
                if (str.equals("CHECKOUT_CODEREDEMPTION")) {
                    return G1("CHECKOUT_CODEREDEMPTION", "checkout/coderedemption", 335, "checkout");
                }
                return null;
            case -801785135:
                if (str.equals("GOLDENPATH_EMITSUISHI")) {
                    return G1("GOLDENPATH_EMITSUISHI", "goldenpath/emitsuishi", 642, "goldenpath");
                }
                return null;
            case -791687743:
                if (str.equals("WEAR_NOW_PLAYING_VIEW_DEFAULT")) {
                    return G1("WEAR_NOW_PLAYING_VIEW_DEFAULT", "wear/now_playing_view_default", 2150, "wear");
                }
                return null;
            case -778906799:
                if (str.equals("FULLSCREEN_STORY")) {
                    return G1("FULLSCREEN_STORY", "fullscreen-story", 599, "fullscreen-story");
                }
                return null;
            case -761024351:
                if (str.equals("CHECKOUT_SPOTIFY")) {
                    return G1("CHECKOUT_SPOTIFY", "checkout/spotify", 338, "checkout");
                }
                return null;
            case -661166847:
                if (str.equals("GOLDENPATH_JMATIC")) {
                    return G1("GOLDENPATH_JMATIC", "goldenpath/jmatic", 668, "goldenpath");
                }
                return null;
            case -650767839:
                if (str.equals("LOGIN_PHONENUMBER")) {
                    return G1("LOGIN_PHONENUMBER", "login/phonenumber", 960, "login");
                }
                return null;
            case -650578511:
                if (str.equals("FRIENDSHOME_FINDFRIENDS")) {
                    return G1("FRIENDSHOME_FINDFRIENDS", "friendshome/findfriends", 596, "friendshome");
                }
                return null;
            case -621378047:
                if (str.equals("S4P_ANALYTICS_IMPRESSIONS")) {
                    return G1("S4P_ANALYTICS_IMPRESSIONS", "s4p/analytics/impressions", 1666, "s4p");
                }
                return null;
            case -602431983:
                if (str.equals("FREE_TIER_LIKES_SONGS")) {
                    return G1("FREE_TIER_LIKES_SONGS", "free-tier-likes/songs", 572, "free-tier-likes");
                }
                return null;
            case -518490527:
                if (str.equals("HOMEMIX_GENRESPAGE")) {
                    return G1("HOMEMIX_GENRESPAGE", "homemix/genrespage", 816, "homemix");
                }
                return null;
            case -493364191:
                if (str.equals("STUDIO_CHAT")) {
                    return G1("STUDIO_CHAT", "studio/chat", 1990, "studio");
                }
                return null;
            case -487837807:
                if (str.equals("JAM_MANAGEPARTICIPANTSSHEET")) {
                    return G1("JAM_MANAGEPARTICIPANTSSHEET", "jam/manageparticipantssheet", 865, "jam");
                }
                return null;
            case -444237887:
                if (str.equals("PROFILE_RECENTLY_PLAYED_ARTISTS")) {
                    return G1("PROFILE_RECENTLY_PLAYED_ARTISTS", "profile/recently-played-artists", 1589, "profile");
                }
                return null;
            case -406338639:
                if (str.equals("BLEND_ENTITY")) {
                    return c0();
                }
                return null;
            case -394825199:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS")) {
                    return G1("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS", "premium-account-management/regular-member-sub-account-details", 1547, "premium-account-management");
                }
                return null;
            case -312419887:
                if (str.equals("REFRESHEDPROFILE_FOLLOW_SUGGESTIONS")) {
                    return G1("REFRESHEDPROFILE_FOLLOW_SUGGESTIONS", "refreshedprofile/follow-suggestions", 1634, "refreshedprofile");
                }
                return null;
            case -206765439:
                if (str.equals("QUICKPLAY")) {
                    return G1("QUICKPLAY", "quickplay", 1605, "quickplay");
                }
                return null;
            case -200523727:
                if (str.equals("WEAR_QUEUE")) {
                    return G1("WEAR_QUEUE", "wear/queue", 2152, "wear");
                }
                return null;
            case -196324431:
                if (str.equals("AD_STANDALONE_MOBILE_OVERLAY")) {
                    return G1("AD_STANDALONE_MOBILE_OVERLAY", "ad-standalone-mobile-overlay", 9, "ad-standalone-mobile-overlay");
                }
                return null;
            case -195845983:
                if (str.equals("REINVENTFREE_TIME_CAP_PIVOT_MUSIC_VIDEO_UPSELL")) {
                    return M4();
                }
                return null;
            case -126777839:
                if (str.equals("MANAGED_ACCOUNT_LINKING_INVITE_OPTIONS")) {
                    return G1("MANAGED_ACCOUNT_LINKING_INVITE_OPTIONS", "managed-account-linking/invite-options", 1005, "managed-account-linking");
                }
                return null;
            case -125505583:
                if (str.equals("OAUTH_PAIR_ENTER_CODE")) {
                    return G1("OAUTH_PAIR_ENTER_CODE", "oauth/pair/enter-code", 1371, "oauth");
                }
                return null;
            case -115812543:
                if (str.equals("INAPPUSERFEEDBACK_BOTTOMSHEET")) {
                    return i2();
                }
                return null;
            case -108376735:
                if (str.equals("SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE_DIALOG_ERROR")) {
                    return G1("SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE_DIALOG_ERROR", "settings/notifications/language-preference/dialog/error", 1840, "settings");
                }
                return null;
            case -8184271:
                if (str.equals("MRKT_TEAM_ACCESS_ARTIST")) {
                    return G1("MRKT_TEAM_ACCESS_ARTIST", "mrkt/team/access/artist", 1316, "mrkt");
                }
                return null;
            case 37523121:
                if (str.equals("PROFILE_MESSAGE_SHEET")) {
                    return G1("PROFILE_MESSAGE_SHEET", "profile-message-sheet", 1571, "profile-message-sheet");
                }
                return null;
            case 43060561:
                if (str.equals("FULLSCREEN_STORY_SHARE")) {
                    return G1("FULLSCREEN_STORY_SHARE", "fullscreen-story-share", 600, "fullscreen-story-share");
                }
                return null;
            case 79114129:
                if (str.equals("SPOTS")) {
                    return G1("SPOTS", "spots", 1969, "spots");
                }
                return null;
            case 103407969:
                if (str.equals("FREE_TIER_ARTIST_SUBPAGE")) {
                    return G1("FREE_TIER_ARTIST_SUBPAGE", "free-tier-artist/subpage", 566, "free-tier-artist");
                }
                return null;
            case 236259537:
                if (str.equals("MRKT_ARTIST_AUDIENCE_DEMOGRAPHIC")) {
                    return G1("MRKT_ARTIST_AUDIENCE_DEMOGRAPHIC", "mrkt/artist/audience/demographic", 1048, "mrkt");
                }
                return null;
            case 344812097:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_SPOTIFY_PLAYLISTS")) {
                    return G1("MRKT_FRONTDOOR_FAN_STUDY_SPOTIFY_PLAYLISTS", "mrkt/frontdoor/fan-study/spotify-playlists", 1255, "mrkt");
                }
                return null;
            case 346401521:
                if (str.equals("DIALOG_DISKALMOSTFULL")) {
                    return G1("DIALOG_DISKALMOSTFULL", "dialog/diskalmostfull", 480, "dialog");
                }
                return null;
            case 349350257:
                if (str.equals("YOURLIBRARY_PROONBOARDING")) {
                    return G1("YOURLIBRARY_PROONBOARDING", "yourlibrary/proonboarding", 2270, "yourlibrary");
                }
                return null;
            case 362958769:
                if (str.equals("MRKT_FRONTDOOR_CANVAS")) {
                    return G1("MRKT_FRONTDOOR_CANVAS", "mrkt/frontdoor/canvas", 1243, "mrkt");
                }
                return null;
            case 426678801:
                if (str.equals("WATCHAPP_PLAYLIST_WORKOUT_LIMITED_EXPERIENCE")) {
                    return G1("WATCHAPP_PLAYLIST_WORKOUT_LIMITED_EXPERIENCE", "watchapp/playlist/workout-limited-experience", 2115, "watchapp");
                }
                return null;
            case 559358033:
                if (str.equals("WWW_ACCOUNT_PAGES_YOURPLAN")) {
                    return G1("WWW_ACCOUNT_PAGES_YOURPLAN", "www-account-pages/yourplan", 2247, "www-account-pages");
                }
                return null;
            case 622424913:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_LOGINOPTIONS")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_LOGINOPTIONS", "www-account-pages/genalpha/loginoptions", 2205, "www-account-pages");
                }
                return null;
            case 641180561:
                if (str.equals("TRAVEL_WITH_MUSIC")) {
                    return G1("TRAVEL_WITH_MUSIC", "travel-with-music", Entity.SERP_METADATA_FIELD_NUMBER, "travel-with-music");
                }
                return null;
            case 716703441:
                if (str.equals("LOGIN_PASSWORD")) {
                    return G1("LOGIN_PASSWORD", "login/password", 959, "login");
                }
                return null;
            case 720836481:
                if (str.equals("PARENTAL_CONTROL_MY_ALLOWLISTING_REQUESTS")) {
                    return p3();
                }
                return null;
            case 729851553:
                if (str.equals("TRACK_CREDITS_CREDITS")) {
                    return F5();
                }
                return null;
            case 812365985:
                if (str.equals("SETTINGS_DEVICES")) {
                    return G1("SETTINGS_DEVICES", "settings/devices", 1816, "settings");
                }
                return null;
            case 901896257:
                if (str.equals("PORTAL_DATA_HOME")) {
                    return G1("PORTAL_DATA_HOME", "portal/data-home", 1524, "portal");
                }
                return null;
            case 913986993:
                if (str.equals("MRKT_FRONTDOOR_VIDEOS")) {
                    return G1("MRKT_FRONTDOOR_VIDEOS", "mrkt/frontdoor/videos", 1276, "mrkt");
                }
                return null;
            case 927656145:
                if (str.equals("FORCEUPGRADE")) {
                    return G1("FORCEUPGRADE", "forceupgrade", 560, "forceupgrade");
                }
                return null;
            case 947875217:
                if (str.equals("SUPPORT_SITE_INTELLIGENT_HELP")) {
                    return G1("SUPPORT_SITE_INTELLIGENT_HELP", "support-site/intelligent-help", 2024, "support-site");
                }
                return null;
            case 973013217:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_OVERVIEW")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_OVERVIEW", "mrkt/artist/campaigns/marquee-and-showcase/update/flights/overview", 1078, "mrkt");
                }
                return null;
            case 981687761:
                if (str.equals("MRKT_WELCOME")) {
                    return G1("MRKT_WELCOME", "mrkt/welcome", 1336, "mrkt");
                }
                return null;
            case 1042548801:
                if (str.equals("S4P_SETTINGS_PERSONAL_INFO")) {
                    return G1("S4P_SETTINGS_PERSONAL_INFO", "s4p/settings/personal-info", 1744, "s4p");
                }
                return null;
            case 1045155329:
                if (str.equals("WEAR_SECONDARY_CONTROLS")) {
                    return G1("WEAR_SECONDARY_CONTROLS", "wear/secondary_controls", 2156, "wear");
                }
                return null;
            case 1072769841:
                if (str.equals("ADAPTIVEAUTHENTICATION_START")) {
                    return v();
                }
                return null;
            case 1089677329:
                if (str.equals("ADSTUDIO_USER_SETTINGS")) {
                    return G1("ADSTUDIO_USER_SETTINGS", "adstudio/user-settings", 116, "adstudio");
                }
                return null;
            case 1093609505:
                if (str.equals("ASSISTED_CURATION_SEARCH_SHOW_ENTITY")) {
                    return G1("ASSISTED_CURATION_SEARCH_SHOW_ENTITY", "assisted-curation/search/show-entity", 190, "assisted-curation");
                }
                return null;
            case 1167101937:
                if (str.equals("S4P_SUBMITTED_SHOW")) {
                    return G1("S4P_SUBMITTED_SHOW", "s4p/submitted-show", 1766, "s4p");
                }
                return null;
            case 1170727617:
                if (str.equals("S4P_POLL_DETAIL")) {
                    return G1("S4P_POLL_DETAIL", "s4p/poll-detail", 1737, "s4p");
                }
                return null;
            case 1262264497:
                if (str.equals("SIGNUP_SIGNUPUNAVAILABLE")) {
                    return n5();
                }
                return null;
            case 1270963473:
                if (str.equals("WEAR_SETTINGS_ABOUT")) {
                    return G1("WEAR_SETTINGS_ABOUT", "wear/settings/about", 2159, "wear");
                }
                return null;
            case 1294422881:
                if (str.equals("ADSTUDIO_WRAPPED_2025")) {
                    return G1("ADSTUDIO_WRAPPED_2025", "adstudio/wrapped/2025", 117, "adstudio");
                }
                return null;
            case 1314207969:
                if (str.equals("YOURLIBRARY_LAYOUT_SHEET_SETTINGS")) {
                    return G1("YOURLIBRARY_LAYOUT_SHEET_SETTINGS", "yourlibrary/layout-sheet-settings", 2267, "yourlibrary");
                }
                return null;
            case 1346720641:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD_SET")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD_SET", "adstudio/add-to-existing-campaign/ad-set", 45, "adstudio");
                }
                return null;
            case 1354968817:
                if (str.equals("FREE_TIER_ARTIST")) {
                    return G1("FREE_TIER_ARTIST", "free-tier-artist", 565, "free-tier-artist");
                }
                return null;
            case 1366343681:
                if (str.equals("OAUTH_AUTHORIZE")) {
                    return G1("OAUTH_AUTHORIZE", "oauth/authorize", 1368, "oauth");
                }
                return null;
            case 1371312865:
                if (str.equals("HIFI_REMOTE_SHEET")) {
                    return G1("HIFI_REMOTE_SHEET", "hifi/remote-sheet", 790, "hifi");
                }
                return null;
            case 1419840337:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_REVIEW")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_REVIEW", "mrkt/artist/campaigns/marquee-and-showcase/create/review", 1070, "mrkt");
                }
                return null;
            case 1463899217:
                if (str.equals("SETTINGS_ABOUT")) {
                    return G1("SETTINGS_ABOUT", "settings/about", 1803, "settings");
                }
                return null;
            case 1479060017:
                if (str.equals("CUSTOM_REACTIONS_PICKER")) {
                    return p1();
                }
                return null;
            case 1497699425:
                if (str.equals("KID_ACCOUNT_SELECTION")) {
                    return G1("KID_ACCOUNT_SELECTION", "kid-account-selection", 886, "kid-account-selection");
                }
                return null;
            case 1536119217:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIENCE_AFFINITY")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUDIENCE_AFFINITY", "spotify-for-authors/audience/affinity", 1934, "spotify-for-authors");
                }
                return null;
            case 1558148241:
                if (str.equals("SEARCH_AUTHORS")) {
                    return G1("SEARCH_AUTHORS", "search/authors", 1783, "search");
                }
                return null;
            case 1656403185:
                if (str.equals("PLAYLISTS_EDIT_PRIVACY")) {
                    return M3();
                }
                return null;
            case 1774265377:
                if (str.equals("RATINGS_AND_REVIEWS_RATINGS")) {
                    return G1("RATINGS_AND_REVIEWS_RATINGS", "ratings-and-reviews/ratings", 1622, "ratings-and-reviews");
                }
                return null;
            case 1826168049:
                if (str.equals("MRKT_FRONTDOOR_UNKNOWN")) {
                    return G1("MRKT_FRONTDOOR_UNKNOWN", "mrkt/frontdoor/unknown", 1274, "mrkt");
                }
                return null;
            case 1835728753:
                if (str.equals("S4P_ANALYTICSWIDGET_PIN_FALLBACK")) {
                    return G1("S4P_ANALYTICSWIDGET_PIN_FALLBACK", "s4p/analyticswidget-pin-fallback", 1673, "s4p");
                }
                return null;
            case 1837641473:
                if (str.equals("ARTIST_CATALOG")) {
                    return G1("ARTIST_CATALOG", "artist/catalog", 161, "artist");
                }
                return null;
            case 1896127153:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_EDIT")) {
                    return G1("MRKT_ARTIST_VIDEO_CLIPS_EDIT", "mrkt/artist/video/clips/edit", 1157, "mrkt");
                }
                return null;
            case 1936639857:
                if (str.equals("PORTAL_AIKA")) {
                    return G1("PORTAL_AIKA", "portal/aika", 1522, "portal");
                }
                return null;
            case 1939347409:
                if (str.equals("ALLBOARDING_PLACEHOLDER")) {
                    return G1("ALLBOARDING_PLACEHOLDER", "allboarding/placeholder", 147, "allboarding");
                }
                return null;
            case 1967452689:
                if (str.equals("APPRATER")) {
                    return G1("APPRATER", "apprater", 152, "apprater");
                }
                return null;
            case 1969703697:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_REVIEW")) {
                    return G1("MRKT_BTC_BOOKING_UPLOAD_REVIEW", "mrkt/btc/booking/upload/review", 1184, "mrkt");
                }
                return null;
            case 2002672097:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_DRAFTS")) {
                    return G1("MRKT_DM_MANAGED_SERVICE_DRAFTS", "mrkt/dm-managed-service/drafts", 1230, "mrkt");
                }
                return null;
            case 2007989937:
                if (str.equals("PLAYLIST_MIXING_FEEDBACK_SHEET")) {
                    return G1("PLAYLIST_MIXING_FEEDBACK_SHEET", "playlist/mixing-feedback-sheet", 1465, "playlist");
                }
                return null;
            case 2055142897:
                if (str.equals("ADSTUDIO_BUSINESS_SIGNUP")) {
                    return G1("ADSTUDIO_BUSINESS_SIGNUP", "adstudio/business/signup", 60, "adstudio");
                }
                return null;
            case 2057341073:
                if (str.equals("HOMETHING_ACTIVATION_CONNECTING")) {
                    return G1("HOMETHING_ACTIVATION_CONNECTING", "homething/activation/connecting", 821, "homething");
                }
                return null;
            case 2076544545:
                if (str.equals("CONCERTS_MULTIEVENTBOTTOMSHEET")) {
                    return S0();
                }
                return null;
            case 2089582673:
                if (str.equals("YOURSPOTIFY_PROFILE")) {
                    return G1("YOURSPOTIFY_PROFILE", "yourspotify/profile", 2278, "yourspotify");
                }
                return null;
            case 2116024305:
                if (str.equals("FREE_TIER_ALL_SONGS_DIALOG")) {
                    return G1("FREE_TIER_ALL_SONGS_DIALOG", "free-tier-all-songs-dialog", 564, "free-tier-all-songs-dialog");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 P() {
        return G1("ARTIST_ARTIST_ATTRIBUTION", "artist/artist-attribution", 159, "artist");
    }

    public static p6r0 P0() {
        return G1("CONCERTS_CAMPAIGN", "concerts/campaign", 387, "concerts");
    }

    public static p6r0 P1() {
        return G1("HOME_AUDIOBOOKS", "home/audiobooks", 797, "home");
    }

    public static p6r0 P2() {
        return G1("MEDIA_TRIMMER", "media-trimmer", 1018, "media-trimmer");
    }

    public static p6r0 P3() {
        return G1("PODCAST_NEW_EPISODE_NOTIFICATIONS_SETTINGS", "podcast-new-episode-notifications/settings", 1478, "podcast-new-episode-notifications");
    }

    public static p6r0 P4() {
        return G1("REINVENTFREE_WEAR_DOWNLOAD_UPSELL", "reinventfree-wear-download-upsell", 1648, "reinventfree-wear-download-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 P5(String str) {
        switch (str.hashCode()) {
            case -2128839382:
                if (str.equals("GOLDENPATH_MIRELLYSD")) {
                    return G1("GOLDENPATH_MIRELLYSD", "goldenpath/mirellysd", 704, "goldenpath");
                }
                return null;
            case -2083146022:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOW")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOW", "www-account-pages/genalpha/childaccountcreationflow", 2203, "www-account-pages");
                }
                return null;
            case -2077452966:
                if (str.equals("SUPPORT_SITE_OLD_CHILDCATEGORY")) {
                    return G1("SUPPORT_SITE_OLD_CHILDCATEGORY", "support-site/old/childcategory", 2026, "support-site");
                }
                return null;
            case -2061101958:
                if (str.equals("ADSTUDIO_REPORT")) {
                    return G1("ADSTUDIO_REPORT", "adstudio/report", 105, "adstudio");
                }
                return null;
            case -2046057942:
                if (str.equals("GOLDENPATH_VALERIOM")) {
                    return G1("GOLDENPATH_VALERIOM", "goldenpath/valeriom", 755, "goldenpath");
                }
                return null;
            case -2035850422:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_SUCCESS")) {
                    return G1("MRKT_BTC_BOOKING_UPLOAD_SUCCESS", "mrkt/btc/booking/upload/success", 1186, "mrkt");
                }
                return null;
            case -2015328310:
                if (str.equals("ADSTUDIO_AD_REPORT")) {
                    return G1("ADSTUDIO_AD_REPORT", "adstudio/ad/report", 38, "adstudio");
                }
                return null;
            case -2010549414:
                if (str.equals("SONG_DNA_SEARCH")) {
                    return G1("SONG_DNA_SEARCH", "song-dna/search", 1925, "song-dna");
                }
                return null;
            case -1975246614:
                if (str.equals("ALLBOARDING_HOST")) {
                    return M();
                }
                return null;
            case -1974928694:
                if (str.equals("ALLBOARDING_SEND")) {
                    return G1("ALLBOARDING_SEND", "allboarding/send", 149, "allboarding");
                }
                return null;
            case -1937648022:
                if (str.equals("SIGNUP_PARENTALCONSENTEDUCATION")) {
                    return G1("SIGNUP_PARENTALCONSENTEDUCATION", "signup/parentalconsenteducation", 1893, "signup");
                }
                return null;
            case -1931603382:
                if (str.equals("YOURLIBRARY_PLAYLISTS")) {
                    return G1("YOURLIBRARY_PLAYLISTS", "yourlibrary/playlists", 2269, "yourlibrary");
                }
                return null;
            case -1899746598:
                if (str.equals("KID_ACCOUNT_TRANSITION_AGE_VERIFICATION")) {
                    return G1("KID_ACCOUNT_TRANSITION_AGE_VERIFICATION", "kid-account-transition/age-verification", 887, "kid-account-transition");
                }
                return null;
            case -1890215254:
                if (str.equals("S4P_SETUP_SHOW_ZERO_STATE")) {
                    return G1("S4P_SETUP_SHOW_ZERO_STATE", "s4p/setup-show/zero-state", 1760, "s4p");
                }
                return null;
            case -1871131014:
                if (str.equals("JAM_GUESTCONTROLSSHEET")) {
                    return G1("JAM_GUESTCONTROLSSHEET", "jam/guestcontrolssheet", 856, "jam");
                }
                return null;
            case -1840010038:
                if (str.equals("PLAYLIST_ALLSONGS")) {
                    return G1("PLAYLIST_ALLSONGS", "playlist/allsongs", 1452, "playlist");
                }
                return null;
            case -1813600198:
                if (str.equals("GOLDENPATH_JTOMLINSON")) {
                    return G1("GOLDENPATH_JTOMLINSON", "goldenpath/jtomlinson", 677, "goldenpath");
                }
                return null;
            case -1806700598:
                if (str.equals("WEAR_AMBIENT_MODE")) {
                    return G1("WEAR_AMBIENT_MODE", "wear/ambient_mode", 2132, "wear");
                }
                return null;
            case -1783454758:
                if (str.equals("WEAR_VOLUME")) {
                    return G1("WEAR_VOLUME", "wear/volume", 2171, "wear");
                }
                return null;
            case -1744362662:
                if (str.equals("BLUEJAY_SHOW_GENERATION_LIST_SHEET")) {
                    return G1("BLUEJAY_SHOW_GENERATION_LIST_SHEET", "bluejay/show-generation-list-sheet", 235, "bluejay");
                }
                return null;
            case -1740894774:
                if (str.equals("DRIVINGMODE")) {
                    return G1("DRIVINGMODE", "drivingmode", 503, "drivingmode");
                }
                return null;
            case -1653298902:
                if (str.equals("SPOTIFY_FOR_AUTHORS_SIGNUP")) {
                    return G1("SPOTIFY_FOR_AUTHORS_SIGNUP", "spotify-for-authors/signup", 1955, "spotify-for-authors");
                }
                return null;
            case -1653197142:
                if (str.equals("MRKT_TEAM_ACCESS_LABEL")) {
                    return G1("MRKT_TEAM_ACCESS_LABEL", "mrkt/team/access/label", 1318, "mrkt");
                }
                return null;
            case -1650437398:
                if (str.equals("S4P_ANALYTICS_STREAMS")) {
                    return G1("S4P_ANALYTICS_STREAMS", "s4p/analytics/streams", 1671, "s4p");
                }
                return null;
            case -1642614198:
                if (str.equals("HACKWEEK2023_PRERELEASE_EVENT")) {
                    return G1("HACKWEEK2023_PRERELEASE_EVENT", "hackweek2023/prerelease-event", 781, "hackweek2023");
                }
                return null;
            case -1641419574:
                if (str.equals("GRADUATION_FORCED")) {
                    return G1("GRADUATION_FORCED", "graduation/forced", 767, "graduation");
                }
                return null;
            case -1622308806:
                if (str.equals("ADSTUDIO_SBL_DETAILS")) {
                    return G1("ADSTUDIO_SBL_DETAILS", "adstudio/sbl/details", 111, "adstudio");
                }
                return null;
            case -1603921446:
                if (str.equals("S4P_DEBUG_EXPERIMENTS")) {
                    return G1("S4P_DEBUG_EXPERIMENTS", "s4p/debug/experiments", 1699, "s4p");
                }
                return null;
            case -1578400742:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_SET")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_SET", "adstudio/duplicate-ad-set-only/ad-set", 86, "adstudio");
                }
                return null;
            case -1503043510:
                if (str.equals("SPEED_CONTROL_MESSAGING")) {
                    return G1("SPEED_CONTROL_MESSAGING", "speed-control/messaging", 1929, "speed-control");
                }
                return null;
            case -1467913366:
                if (str.equals("EMAILAUTHENTICATION_VALIDATEOTP")) {
                    return G1("EMAILAUTHENTICATION_VALIDATEOTP", "emailauthentication/validateotp", 510, "emailauthentication");
                }
                return null;
            case -1441590774:
                if (str.equals("CONTEXTMENU_EPISODE")) {
                    return Y0();
                }
                return null;
            case -1347096502:
                if (str.equals("GRADUATION_INITIATE")) {
                    return J1();
                }
                return null;
            case -1299310470:
                if (str.equals("S4P_POLL_EDIT")) {
                    return G1("S4P_POLL_EDIT", "s4p/poll/edit", 1738, "s4p");
                }
                return null;
            case -1286262774:
                if (str.equals("SETTINGS_INFO_SHEET")) {
                    return G1("SETTINGS_INFO_SHEET", "settings/info-sheet", 1822, "settings");
                }
                return null;
            case -1267781430:
                if (str.equals("RESETPASSWORD")) {
                    return G1("RESETPASSWORD", "resetpassword", 1653, "resetpassword");
                }
                return null;
            case -1231756102:
                if (str.equals("PAGE_MATCH_BARCODE_SCANNING")) {
                    return G1("PAGE_MATCH_BARCODE_SCANNING", "page-match/barcode-scanning", 1390, "page-match");
                }
                return null;
            case -1211564966:
                if (str.equals("FREETIER_DATASAVER")) {
                    return G1("FREETIER_DATASAVER", "freetier/datasaver", 580, "freetier");
                }
                return null;
            case -1185166118:
                if (str.equals("MRKT_VIDEO_UPLOAD_CLIPS_THANKYOU")) {
                    return G1("MRKT_VIDEO_UPLOAD_CLIPS_THANKYOU", "mrkt/video/upload/clips/thankyou", 1329, "mrkt");
                }
                return null;
            case -1113634438:
                if (str.equals("WWW_ACCOUNT_PAGES_UPDATEPAYMENTDETAILS")) {
                    return G1("WWW_ACCOUNT_PAGES_UPDATEPAYMENTDETAILS", "www-account-pages/updatepaymentdetails", 2246, "www-account-pages");
                }
                return null;
            case -1094681830:
                if (str.equals("FAST_TRACK_PAGE_3")) {
                    return D1();
                }
                return null;
            case -980318102:
                if (str.equals("ARTIST_WORKS")) {
                    return G1("ARTIST_WORKS", "artist/works", 179, "artist");
                }
                return null;
            case -949720998:
                if (str.equals("S4P_SETTINGS_EMAIL_NOTIFICATION")) {
                    return G1("S4P_SETTINGS_EMAIL_NOTIFICATION", "s4p/settings/email-notification", 1742, "s4p");
                }
                return null;
            case -910825206:
                if (str.equals("MAGPIE_PROMPT")) {
                    return G1("MAGPIE_PROMPT", "magpie/prompt", 984, "magpie");
                }
                return null;
            case -850436694:
                if (str.equals("PODCAST_SHOW_MEMBERSHIPUPSELL")) {
                    return G1("PODCAST_SHOW_MEMBERSHIPUPSELL", "podcast/show/membershipupsell", 1500, "podcast");
                }
                return null;
            case -838880390:
                if (str.equals("CHALLENGE_EMAIL_VERIFICATION")) {
                    return G1("CHALLENGE_EMAIL_VERIFICATION", "challenge/email-verification", 293, "challenge");
                }
                return null;
            case -817382550:
                if (str.equals("PODCAST_PEPAREPISODE")) {
                    return G1("PODCAST_PEPAREPISODE", "podcast/peparepisode", 1490, "podcast");
                }
                return null;
            case -779747046:
                if (str.equals("GOLDENPATH_TKREUGER")) {
                    return G1("GOLDENPATH_TKREUGER", "goldenpath/tkreuger", 752, "goldenpath");
                }
                return null;
            case -699379638:
                if (str.equals("CONTEXTMENU_SHOWSCANNABLECODE")) {
                    return G1("CONTEXTMENU_SHOWSCANNABLECODE", "contextmenu/showscannablecode", 441, "contextmenu");
                }
                return null;
            case -684999078:
                if (str.equals("PROACTIVE_PLATFORMS_NPV_WIDGET")) {
                    return j4();
                }
                return null;
            case -609604886:
                if (str.equals("SEARCH_PLAYLISTS")) {
                    return G1("SEARCH_PLAYLISTS", "search/playlists", 1793, "search");
                }
                return null;
            case -585830038:
                if (str.equals("GOLDENPATH_MASONW")) {
                    return G1("GOLDENPATH_MASONW", "goldenpath/masonw", 695, "goldenpath");
                }
                return null;
            case -461026630:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_METADATA")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_METADATA", "spotify-for-authors/dvn-creation/metadata", 1945, "spotify-for-authors");
                }
                return null;
            case -435158614:
                if (str.equals("MRKT_ARTIST_SETTINGS")) {
                    return G1("MRKT_ARTIST_SETTINGS", "mrkt/artist/settings", 1139, "mrkt");
                }
                return null;
            case -369784982:
                if (str.equals("WEAR_UNKNOWN")) {
                    return G1("WEAR_UNKNOWN", "wear/unknown", 2168, "wear");
                }
                return null;
            case -366660982:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_AUDIO")) {
                    return G1("SPOTIFY_FOR_AUTHORS_UPLOAD_AUDIO", "spotify-for-authors/upload/audio", 1956, "spotify-for-authors");
                }
                return null;
            case -298142038:
                if (str.equals("GOLDENPATH_RTOLMAN")) {
                    return G1("GOLDENPATH_RTOLMAN", "goldenpath/rtolman", 738, "goldenpath");
                }
                return null;
            case -296015110:
                if (str.equals("COLLECTION_RADIO")) {
                    return G1("COLLECTION_RADIO", "collection/radio", 364, "collection");
                }
                return null;
            case -292082822:
                if (str.equals("COLLECTION_VIDEO")) {
                    return G1("COLLECTION_VIDEO", "collection/video", 368, "collection");
                }
                return null;
            case -280287638:
                if (str.equals("KID_ACCOUNT_TRANSITION_NAME")) {
                    return G1("KID_ACCOUNT_TRANSITION_NAME", "kid-account-transition/name", 894, "kid-account-transition");
                }
                return null;
            case -261989654:
                if (str.equals("JAM_STORIES")) {
                    return G1("JAM_STORIES", "jam/stories", 873, "jam");
                }
                return null;
            case -232137414:
                if (str.equals("MAGPIE_UCP_ACTIONS")) {
                    return G1("MAGPIE_UCP_ACTIONS", "magpie/ucp-actions", 988, "magpie");
                }
                return null;
            case -207687926:
                if (str.equals("MRKT_ARTIST_PROFILE_CONCERTS")) {
                    return G1("MRKT_ARTIST_PROFILE_CONCERTS", "mrkt/artist/profile/concerts", 1124, "mrkt");
                }
                return null;
            case -182886038:
                if (str.equals("ADSTUDIO_ACCOUNT_DETAILS")) {
                    return G1("ADSTUDIO_ACCOUNT_DETAILS", "adstudio/account-details", 29, "adstudio");
                }
                return null;
            case -163566774:
                if (str.equals("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT_NO_ARTIST_REDIRECT")) {
                    return G1("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT_NO_ARTIST_REDIRECT", "mrkt/artist/audience/release-engagement/no-artist-redirect", 1053, "mrkt");
                }
                return null;
            case -155696134:
                if (str.equals("GOLDENPATH_DILVANG")) {
                    return G1("GOLDENPATH_DILVANG", "goldenpath/dilvang", 635, "goldenpath");
                }
                return null;
            case 92472970:
                if (str.equals("NOWPLAYING_QUEUE")) {
                    return c3();
                }
                return null;
            case 133025290:
                if (str.equals("WEAR_APP_IN_BACKGROUND")) {
                    return G1("WEAR_APP_IN_BACKGROUND", "wear/app_in_background", 2133, "wear");
                }
                return null;
            case 136109866:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_DOWNLOAD")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_DOWNLOAD", "mrkt/discovery-mode/unified-buying/create/csv/download", 1217, "mrkt");
                }
                return null;
            case 139951290:
                if (str.equals("EXTERNAL_FACEBOOK")) {
                    return z1();
                }
                return null;
            case 191957706:
                if (str.equals("MANAGE_PARTNER_OVERVIEW")) {
                    return G1("MANAGE_PARTNER_OVERVIEW", "manage/partner-overview", 999, "manage");
                }
                return null;
            case 246238474:
                if (str.equals("LYRICS_LANGUAGE_PICKER")) {
                    return G1("LYRICS_LANGUAGE_PICKER", "lyrics/language-picker", 969, "lyrics");
                }
                return null;
            case 302034954:
                if (str.equals("LYRICS_SHARE_SELECTOR")) {
                    return G1("LYRICS_SHARE_SELECTOR", "lyrics/share-selector", 972, "lyrics");
                }
                return null;
            case 316842810:
                if (str.equals("FANDOMCOLLECTIBLES_STORIES")) {
                    return G1("FANDOMCOLLECTIBLES_STORIES", "fandomcollectibles/stories", 549, "fandomcollectibles");
                }
                return null;
            case 368678186:
                if (str.equals("CHAT_SETTINGS")) {
                    return B0();
                }
                return null;
            case 368960442:
                if (str.equals("ADSTUDIO_COLD_START_AD_QUICK_AUDIO")) {
                    return G1("ADSTUDIO_COLD_START_AD_QUICK_AUDIO", "adstudio/cold-start/ad-quick-audio", 67, "adstudio");
                }
                return null;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return H5();
                }
                return null;
            case 468698218:
                if (str.equals("ALLBOARDING_SEARCH")) {
                    return G1("ALLBOARDING_SEARCH", "allboarding/search", 148, "allboarding");
                }
                return null;
            case 524559450:
                if (str.equals("FRIENDSACTIVITY_STORY")) {
                    return G1("FRIENDSACTIVITY_STORY", "friendsactivity/story", 593, "friendsactivity");
                }
                return null;
            case 566287658:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GUARDIANDETAILS")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GUARDIANDETAILS", "www-account-pages/parental-settings/guardiandetails", 2224, "www-account-pages");
                }
                return null;
            case 653883642:
                if (str.equals("CACHED_FILES")) {
                    return n0();
                }
                return null;
            case 660480170:
                if (str.equals("EXPRESSIVE_PLAYLISTS")) {
                    return G1("EXPRESSIVE_PLAYLISTS", "expressive-playlists", 533, "expressive-playlists");
                }
                return null;
            case 747199066:
                if (str.equals("FANDOM_ARTISTBLEND")) {
                    return G1("FANDOM_ARTISTBLEND", "fandom/artistblend", 545, "fandom");
                }
                return null;
            case 771595258:
                if (str.equals("MRKT_TEAM_MANAGEMENT_ACTIVITY")) {
                    return G1("MRKT_TEAM_MANAGEMENT_ACTIVITY", "mrkt/team-management/activity", 1306, "mrkt");
                }
                return null;
            case 777747386:
                if (str.equals("MISSEDCONNECTIONS")) {
                    return G1("MISSEDCONNECTIONS", "missedconnections", 1034, "missedconnections");
                }
                return null;
            case 851977530:
                if (str.equals("AGE_SIGNAL_BLOCKED_ASK_PARENT")) {
                    return G1("AGE_SIGNAL_BLOCKED_ASK_PARENT", "age-signal/blocked/ask-parent", 130, "age-signal");
                }
                return null;
            case 863206602:
                if (str.equals("HOME_UNKNOWN")) {
                    return X1();
                }
                return null;
            case 866407434:
                if (str.equals("WEAR_CONNECT")) {
                    return G1("WEAR_CONNECT", "wear/connect", 2137, "wear");
                }
                return null;
            case 875792810:
                if (str.equals("DISCOVERWEEKLY")) {
                    return G1("DISCOVERWEEKLY", "discoverweekly", 495, "discoverweekly");
                }
                return null;
            case 920243866:
                if (str.equals("MRKT_LEGAL_THIRD_PARTY_LICENSES")) {
                    return G1("MRKT_LEGAL_THIRD_PARTY_LICENSES", "mrkt/legal/third-party-licenses", 1285, "mrkt");
                }
                return null;
            case 924450714:
                if (str.equals("ASSISTED_CURATION_SEARCH_SONGS")) {
                    return G1("ASSISTED_CURATION_SEARCH_SONGS", "assisted-curation/search/songs", 192, "assisted-curation");
                }
                return null;
            case 976149178:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GRADUATIONREQUEST")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GRADUATIONREQUEST", "www-account-pages/parental-settings/graduationrequest", 2223, "www-account-pages");
                }
                return null;
            case 1062337754:
                if (str.equals("GUILTYPLEASURE_LIST")) {
                    return G1("GUILTYPLEASURE_LIST", "guiltypleasure/list", 780, "guiltypleasure");
                }
                return null;
            case 1085621818:
                if (str.equals("ARTIST_GALLERY")) {
                    return G1("ARTIST_GALLERY", "artist/gallery", 169, "artist");
                }
                return null;
            case 1100934346:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES_DARK")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES_DARK", "mrkt/debug/hubs/component-reference/tiles-dark", 1213, "mrkt");
                }
                return null;
            case 1207415082:
                if (str.equals("PODCASTMIX_ENTITY")) {
                    return G1("PODCASTMIX_ENTITY", "podcastmix/entity", 1519, "podcastmix");
                }
                return null;
            case 1218792314:
                if (str.equals("COMMENTS_SECTION")) {
                    return G1("COMMENTS_SECTION", "comments/section", 380, "comments");
                }
                return null;
            case 1233610682:
                if (str.equals("WRAPPED_RETRIEVAL")) {
                    return G1("WRAPPED_RETRIEVAL", "wrapped/retrieval", 2183, "wrapped");
                }
                return null;
            case 1238860026:
                if (str.equals("VOTING_ROOT")) {
                    return e6();
                }
                return null;
            case 1245251242:
                if (str.equals("WWW_ACCOUNT_PAGES_ACTIVATIONHUB")) {
                    return G1("WWW_ACCOUNT_PAGES_ACTIVATIONHUB", "www-account-pages/activationhub", 2185, "www-account-pages");
                }
                return null;
            case 1256423530:
                if (str.equals("GRANDSLAM_EA")) {
                    return G1("GRANDSLAM_EA", "grandslam/ea", 777, "grandslam");
                }
                return null;
            case 1277669034:
                if (str.equals("PARENTAL_CONSENT_WEBVIEW")) {
                    return G1("PARENTAL_CONSENT_WEBVIEW", "parental-consent/webview", 1398, "parental-consent");
                }
                return null;
            case 1282946234:
                if (str.equals("EXPERIMENTAL_AUDIOPLAYBACK")) {
                    return G1("EXPERIMENTAL_AUDIOPLAYBACK", "experimental/audioplayback", 530, "experimental");
                }
                return null;
            case 1308492058:
                if (str.equals("CONTEXTMENU_TRACK")) {
                    return G1("CONTEXTMENU_TRACK", "contextmenu/track", 442, "contextmenu");
                }
                return null;
            case 1310221658:
                if (str.equals("COMMENTS_NOTIFICATION_OPT_IN")) {
                    return K0();
                }
                return null;
            case 1320794970:
                if (str.equals("GOLDENPATH_LENNARTS")) {
                    return G1("GOLDENPATH_LENNARTS", "goldenpath/lennarts", 686, "goldenpath");
                }
                return null;
            case 1335862202:
                if (str.equals("MANAGE_ORG_UNITS")) {
                    return G1("MANAGE_ORG_UNITS", "manage/org-units", 998, "manage");
                }
                return null;
            case 1372688842:
                if (str.equals("GOLDENPATH_MAXIMILIANF")) {
                    return G1("GOLDENPATH_MAXIMILIANF", "goldenpath/maximilianf", 696, "goldenpath");
                }
                return null;
            case 1397504394:
                if (str.equals("MRKT_FRONTDOOR_CLIPS")) {
                    return G1("MRKT_FRONTDOOR_CLIPS", "mrkt/frontdoor/clips", 1245, "mrkt");
                }
                return null;
            case 1420399130:
                if (str.equals("S4P_PODCAST_CLIP_OPTIONS")) {
                    return G1("S4P_PODCAST_CLIP_OPTIONS", "s4p/podcast/clip/options", 1726, "s4p");
                }
                return null;
            case 1440662042:
                if (str.equals("ADSTUDIO_DASHBOARD_AD_SET_DRAFTS")) {
                    return G1("ADSTUDIO_DASHBOARD_AD_SET_DRAFTS", "adstudio/dashboard/ad-set-drafts", 77, "adstudio");
                }
                return null;
            case 1454425866:
                if (str.equals("GOLDENPATH_MTANNENBERG")) {
                    return G1("GOLDENPATH_MTANNENBERG", "goldenpath/mtannenberg", 714, "goldenpath");
                }
                return null;
            case 1462071498:
                if (str.equals("ACCOUNTSWITCHING_ADDACCOUNT")) {
                    return t();
                }
                return null;
            case 1590753482:
                if (str.equals("ARTIST_MUSIC_VIDEOS")) {
                    return G1("ARTIST_MUSIC_VIDEOS", "artist/music-videos", 170, "artist");
                }
                return null;
            case 1650873610:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_ALL_PLANS")) {
                    return Z3();
                }
                return null;
            case 1663597386:
                if (str.equals("REACTIONS")) {
                    return G1("REACTIONS", "reactions", 1625, "reactions");
                }
                return null;
            case 1714818666:
                if (str.equals("NEWRELEASESFEED")) {
                    return G1("NEWRELEASESFEED", "newreleasesfeed", 1347, "newreleasesfeed");
                }
                return null;
            case 1752111370:
                if (str.equals("PODCAST_SHOW_SETTINGS")) {
                    return R3();
                }
                return null;
            case 1768512330:
                if (str.equals("VOICETIPS")) {
                    return G1("VOICETIPS", "voicetips", 2083, "voicetips");
                }
                return null;
            case 1789165930:
                if (str.equals("MOMENTS_CATEGORY")) {
                    return G1("MOMENTS_CATEGORY", "moments/category", 1036, "moments");
                }
                return null;
            case 1810045802:
                if (str.equals("CHILDACCOUNTCLOSURE")) {
                    return E0();
                }
                return null;
            case 1960162442:
                if (str.equals("REINVENTFREE_WEAR_DOWNLOAD_UPSELL")) {
                    return P4();
                }
                return null;
            case 1967692426:
                if (str.equals("BROWSE")) {
                    return G1("BROWSE", "browse", 248, "browse");
                }
                return null;
            case 2004673770:
                if (str.equals("S4P_INCOMPLETE_HOSTING_SWITCH")) {
                    return G1("S4P_INCOMPLETE_HOSTING_SWITCH", "s4p/incomplete-hosting-switch", 1712, "s4p");
                }
                return null;
            case 2116336218:
                if (str.equals("GOLDENPATH_RICARDOQ")) {
                    return G1("GOLDENPATH_RICARDOQ", "goldenpath/ricardoq", 735, "goldenpath");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 Q() {
        return G1("ASSISTED_CURATION", "assisted-curation", 181, "assisted-curation");
    }

    public static p6r0 Q0() {
        return G1("CONCERTS_CITYSEARCH", "concerts/citysearch", 388, "concerts");
    }

    public static p6r0 Q1() {
        return G1("HOME_MUSIC", "home/music", 800, "home");
    }

    public static p6r0 Q2() {
        return G1("MEDIAPICKER", "mediapicker", 1019, "mediapicker");
    }

    public static p6r0 Q3() {
        return G1("PODCAST_SHOW_SEARCH", "podcast/show/search", 1502, "podcast");
    }

    public static final gon0 Q4(mzn0[] mzn0VarArr, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        Object[] objArrCopyOf = Arrays.copyOf(mzn0VarArr, mzn0VarArr.length);
        df41 df41Var = new df41(new ork(context, (byte) 5), b5n0.T0);
        boolean zI = x340Var.i(context);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new qnd0(context, (byte) 10);
            x340Var.s0(objT);
        }
        gon0 gon0Var = (gon0) k5p1.t(objArrCopyOf, df41Var, (String) null, (Function0) objT, x340Var, 0, 4);
        for (mzn0 mzn0Var : mzn0VarArr) {
            gon0Var.v.a(mzn0Var);
        }
        return gon0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 Q5(String str) {
        switch (str.hashCode()) {
            case -2135340165:
                if (str.equals("PLAYLIST_FOLDER")) {
                    return G1("PLAYLIST_FOLDER", "playlist/folder", 1462, "playlist");
                }
                return null;
            case -2117036437:
                if (str.equals("MRKT_FRONTDOOR_MUSIC_VIDEOS")) {
                    return G1("MRKT_FRONTDOOR_MUSIC_VIDEOS", "mrkt/frontdoor/music-videos", 1264, "mrkt");
                }
                return null;
            case -2113547701:
                if (str.equals("PORTAL_DATA_DISCOVER")) {
                    return G1("PORTAL_DATA_DISCOVER", "portal/data-discover", 1523, "portal");
                }
                return null;
            case -1953056181:
                if (str.equals("JAM_PARTNER_INTEGRATION_GOOGLEMEET")) {
                    return G1("JAM_PARTNER_INTEGRATION_GOOGLEMEET", "jam/partner-integration/googlemeet", 867, "jam");
                }
                return null;
            case -1898235301:
                if (str.equals("SEARCH_ALBUMS")) {
                    return G1("SEARCH_ALBUMS", "search/albums", 1779, "search");
                }
                return null;
            case -1885113269:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_OFFLINE")) {
                    return G1("COLLECTION_PODCASTS_EPISODES_OFFLINE", "collection/podcasts/episodes/offline", 359, "collection");
                }
                return null;
            case -1838488133:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_CUSTOMIZE")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_CUSTOMIZE", "mrkt/artist/campaigns/marquee-and-showcase/update/flights/customize", 1077, "mrkt");
                }
                return null;
            case -1740606597:
                if (str.equals("STUDIO_PERMISSIONS")) {
                    return G1("STUDIO_PERMISSIONS", "studio/permissions", 1992, "studio");
                }
                return null;
            case -1720323365:
                if (str.equals("YOURLIBRARY_HIDDEN_CONTENT")) {
                    return G1("YOURLIBRARY_HIDDEN_CONTENT", "yourlibrary/hidden-content", 2265, "yourlibrary");
                }
                return null;
            case -1698745509:
                if (str.equals("GOLDENPATH_SIMA")) {
                    return G1("GOLDENPATH_SIMA", "goldenpath/sima", 749, "goldenpath");
                }
                return null;
            case -1622052069:
                if (str.equals("IRONCHEF_EDIT")) {
                    return G1("IRONCHEF_EDIT", "ironchef/edit", 847, "ironchef");
                }
                return null;
            case -1615518581:
                if (str.equals("MAGPIE_CADENCE")) {
                    return G2();
                }
                return null;
            case -1576585045:
                if (str.equals("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS")) {
                    return G1("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS", "mrkt/third-party-agency/campaigns", 1321, "mrkt");
                }
                return null;
            case -1542968837:
                if (str.equals("RECENTLYPLAYED")) {
                    return G1("RECENTLYPLAYED", "recentlyplayed", 1630, "recentlyplayed");
                }
                return null;
            case -1524705221:
                if (str.equals("CHAT_DETAILS")) {
                    return s0();
                }
                return null;
            case -1489235429:
                if (str.equals("SETTINGS_NEARBY")) {
                    return G1("SETTINGS_NEARBY", "settings/nearby", 1831, "settings");
                }
                return null;
            case -1478807461:
                if (str.equals("CULTURALMOMENTS_UPSELL")) {
                    return o1();
                }
                return null;
            case -1467221381:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_VIDEO_CREATE")) {
                    return G1("MRKT_ARTIST_PRE_RELEASE_VIDEO_CREATE", "mrkt/artist/pre-release/video/create", 1111, "mrkt");
                }
                return null;
            case -1443513669:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOADLIMIT")) {
                    return J0();
                }
                return null;
            case -1402988613:
                if (str.equals("KID_ACCOUNT_TRANSITION_CONSENT")) {
                    return n2();
                }
                return null;
            case -1321140629:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES", "mrkt/debug/hubs/component-reference/tiles", 1212, "mrkt");
                }
                return null;
            case -1276024597:
                if (str.equals("PHONENUMBERSIGNUP_PHONENUMBERENTRY")) {
                    return G1("PHONENUMBERSIGNUP_PHONENUMBERENTRY", "phonenumbersignup/phonenumberentry", 1441, "phonenumbersignup");
                }
                return null;
            case -1215514933:
                if (str.equals("STUDIO_SKILLS")) {
                    return G1("STUDIO_SKILLS", "studio/skills", 1995, "studio");
                }
                return null;
            case -1196751285:
                if (str.equals("GOLDENPATH_SBASUTKAR")) {
                    return G1("GOLDENPATH_SBASUTKAR", "goldenpath/sbasutkar", 744, "goldenpath");
                }
                return null;
            case -1168643365:
                if (str.equals("CONNECT_OUTPUTSWITCHERDEVICEPICKER")) {
                    return G1("CONNECT_OUTPUTSWITCHERDEVICEPICKER", "connect/outputSwitcherDevicePicker", 398, "connect");
                }
                return null;
            case -1138342421:
                if (str.equals("GOLDENPATH_ABELD")) {
                    return G1("GOLDENPATH_ABELD", "goldenpath/abeld", 608, "goldenpath");
                }
                return null;
            case -1134533861:
                if (str.equals("ARTIST_FEATURING")) {
                    return G1("ARTIST_FEATURING", "artist/featuring", 168, "artist");
                }
                return null;
            case -1134308357:
                if (str.equals("GOLDENPATH_EMREG")) {
                    return G1("GOLDENPATH_EMREG", "goldenpath/emreg", 643, "goldenpath");
                }
                return null;
            case -1107941445:
                if (str.equals("WEAR_SEARCH_ENTRY")) {
                    return G1("WEAR_SEARCH_ENTRY", "wear/search/entry", 2154, "wear");
                }
                return null;
            case -1088835301:
                if (str.equals("S4P_SETUP_SHOW_NAME")) {
                    return G1("S4P_SETUP_SHOW_NAME", "s4p/setup-show/name", 1756, "s4p");
                }
                return null;
            case -1047306181:
                if (str.equals("SOCIAL_LISTENING_PARTICIPANTLIST")) {
                    return G1("SOCIAL_LISTENING_PARTICIPANTLIST", "social-listening/participantlist", 1911, "social-listening");
                }
                return null;
            case -998886389:
                if (str.equals("ARTIST_CLIPS")) {
                    return G1("ARTIST_CLIPS", "artist/clips", 165, "artist");
                }
                return null;
            case -997228949:
                if (str.equals("BLEND_ENTITY_MEMBERS")) {
                    return e0();
                }
                return null;
            case -984600101:
                if (str.equals("ADSTUDIO_ACCOUNT_SETTINGS")) {
                    return G1("ADSTUDIO_ACCOUNT_SETTINGS", "adstudio/account-settings", 31, "adstudio");
                }
                return null;
            case -982279765:
                if (str.equals("INAPPMESSAGE")) {
                    return G1("INAPPMESSAGE", "inappmessage", 830, "inappmessage");
                }
                return null;
            case -957395589:
                if (str.equals("AGE_VERIFICATION")) {
                    return G1("AGE_VERIFICATION", "age-verification", 136, "age-verification");
                }
                return null;
            case -956171333:
                if (str.equals("SETTINGS_INTEGRATIONS")) {
                    return G1("SETTINGS_INTEGRATIONS", "settings/integrations", 1823, "settings");
                }
                return null;
            case -952436213:
                if (str.equals("MRKT_TEAM_MANAGEMENT_BULK_INVITE")) {
                    return G1("MRKT_TEAM_MANAGEMENT_BULK_INVITE", "mrkt/team-management/bulk-invite", 1308, "mrkt");
                }
                return null;
            case -928618165:
                if (str.equals("COLLECTION_FILEPICKER")) {
                    return G1("COLLECTION_FILEPICKER", "collection/filepicker", 352, "collection");
                }
                return null;
            case -921966373:
                if (str.equals("CONTRIBUTION_NOTES_MANAGE_PICKER")) {
                    return g1();
                }
                return null;
            case -894161013:
                if (str.equals("MRKT_ARTIST_AUDIENCE")) {
                    return G1("MRKT_ARTIST_AUDIENCE", "mrkt/artist/audience", 1042, "mrkt");
                }
                return null;
            case -886007173:
                if (str.equals("SETTINGS_CONTENTPREFERENCES")) {
                    return G1("SETTINGS_CONTENTPREFERENCES", "settings/contentpreferences", 1814, "settings");
                }
                return null;
            case -881207253:
                if (str.equals("REFLECTION")) {
                    return F4();
                }
                return null;
            case -847267781:
                if (str.equals("PROFILE_EDIT_SOCIAL_HANDLE")) {
                    return o4();
                }
                return null;
            case -826455589:
                if (str.equals("EPISODE")) {
                    return G1("EPISODE", "episode", 522, "episode");
                }
                return null;
            case -773690021:
                if (str.equals("MRKT_ARTIST_AUDIENCE_SOURCE_OF_STREAMS")) {
                    return G1("MRKT_ARTIST_AUDIENCE_SOURCE_OF_STREAMS", "mrkt/artist/audience/source-of-streams", 1056, "mrkt");
                }
                return null;
            case -754130661:
                if (str.equals("WWW_ACCOUNT_PAGES_ACCOUNTSETTINGS")) {
                    return G1("WWW_ACCOUNT_PAGES_ACCOUNTSETTINGS", "www-account-pages/accountsettings", 2184, "www-account-pages");
                }
                return null;
            case -747472789:
                if (str.equals("FACEBOOK_PERMISSIONS")) {
                    return G1("FACEBOOK_PERMISSIONS", "facebook/permissions", 542, "facebook");
                }
                return null;
            case -743279125:
                if (str.equals("AGE_ASSURANCE_PARENTAL_CONSENT_EDUCATION")) {
                    return G1("AGE_ASSURANCE_PARENTAL_CONSENT_EDUCATION", "age-assurance/parental-consent-education", 122, "age-assurance");
                }
                return null;
            case -735071205:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_DETAILS")) {
                    return G1("MRKT_ARTIST_VIDEO_CLIPS_DETAILS", "mrkt/artist/video/clips/details", 1156, "mrkt");
                }
                return null;
            case -722950661:
                if (str.equals("CAPPED_ONDEMAND_DIALOG")) {
                    return G1("CAPPED_ONDEMAND_DIALOG", "capped-ondemand/dialog", 273, "capped-ondemand");
                }
                return null;
            case -671905701:
                if (str.equals("GOLDENPATH_JAMESN")) {
                    return G1("GOLDENPATH_JAMESN", "goldenpath/jamesn", 662, "goldenpath");
                }
                return null;
            case -653461781:
                if (str.equals("GOLDENPATH_JULIAS")) {
                    return G1("GOLDENPATH_JULIAS", "goldenpath/julias", 679, "goldenpath");
                }
                return null;
            case -605586629:
                if (str.equals("PROFILE_FOLLOWING")) {
                    return q4();
                }
                return null;
            case -576718293:
                if (str.equals("PORTAL_SEARCH_BATCH_WORKFLOWS")) {
                    return G1("PORTAL_SEARCH_BATCH_WORKFLOWS", "portal/search-batch-workflows", 1528, "portal");
                }
                return null;
            case -570178005:
                if (str.equals("YOUR_PREMIUM")) {
                    return o6();
                }
                return null;
            case -551032021:
                if (str.equals("SETTINGS_YOUR_LIBRARY")) {
                    return i5();
                }
                return null;
            case -520370085:
                if (str.equals("MRKT_ARTIST_MERCH_DETAILS")) {
                    return G1("MRKT_ARTIST_MERCH_DETAILS", "mrkt/artist/merch/details", 1090, "mrkt");
                }
                return null;
            case -500245253:
                if (str.equals("BLUEJAY_CONNECTOR_APPS")) {
                    return i0();
                }
                return null;
            case -487043029:
                if (str.equals("YOURLIBRARY_AUDIOBOOKS")) {
                    return G1("YOURLIBRARY_AUDIOBOOKS", "yourlibrary/audiobooks", 2259, "yourlibrary");
                }
                return null;
            case -478510149:
                if (str.equals("PORTAL_DATA_MY_DATA")) {
                    return G1("PORTAL_DATA_MY_DATA", "portal/data-my-data", 1525, "portal");
                }
                return null;
            case -444462629:
                if (str.equals("ASSISTED_CURATION_NAMING")) {
                    return G1("ASSISTED_CURATION_NAMING", "assisted-curation/naming", 182, "assisted-curation");
                }
                return null;
            case -438362181:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_RESOLVECONTENTREQUEST")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_RESOLVECONTENTREQUEST", "www-account-pages/parental-settings/resolvecontentrequest", 2230, "www-account-pages");
                }
                return null;
            case -415047077:
                if (str.equals("ADSTUDIO_COLD_START_AD_QUICK_AI_AUDIO")) {
                    return G1("ADSTUDIO_COLD_START_AD_QUICK_AI_AUDIO", "adstudio/cold-start/ad-quick-ai-audio", 66, "adstudio");
                }
                return null;
            case -412267973:
                if (str.equals("DIALOG_FINDFRIENDS_CONFIRMALL")) {
                    return G1("DIALOG_FINDFRIENDS_CONFIRMALL", "dialog/findfriends/confirmall", 481, "dialog");
                }
                return null;
            case -396643349:
                if (str.equals("ALLBOARDING_SINGLEITEMPICKER")) {
                    return G1("ALLBOARDING_SINGLEITEMPICKER", "allboarding/singleitempicker", 150, "allboarding");
                }
                return null;
            case -306381397:
                if (str.equals("MRKT_TEAM_MANAGEMENT_TEAM_DETAILS")) {
                    return G1("MRKT_TEAM_MANAGEMENT_TEAM_DETAILS", "mrkt/team-management/team-details", 1313, "mrkt");
                }
                return null;
            case -305845909:
                if (str.equals("CHAT_AI_DISCLAIMER")) {
                    return G1("CHAT_AI_DISCLAIMER", "chat-ai-disclaimer", 314, "chat-ai-disclaimer");
                }
                return null;
            case -297971973:
                if (str.equals("ASSISTED_CURATION_SEARCH")) {
                    return G1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 183, "assisted-curation");
                }
                return null;
            case -205008869:
                if (str.equals("SOCIAL_INVITE")) {
                    return G1("SOCIAL_INVITE", "social/invite", 1915, "social");
                }
                return null;
            case -182671765:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE_DETAIL")) {
                    return G1("MEMBERSHIP_CONSUMER_MANAGE_DETAIL", "membership/consumer/manage/detail", 1024, "membership");
                }
                return null;
            case -176534997:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_REPORTING")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_REPORTING", "mrkt/artist/campaigns/reporting", 1081, "mrkt");
                }
                return null;
            case -155443765:
                if (str.equals("WWW_ACCOUNT_PAGES_CANCELLATIONOFFLINE")) {
                    return G1("WWW_ACCOUNT_PAGES_CANCELLATIONOFFLINE", "www-account-pages/cancellationoffline", 2191, "www-account-pages");
                }
                return null;
            case -81219397:
                if (str.equals("CONNECT_TUTORIALBLUETOOTH")) {
                    return G1("CONNECT_TUTORIALBLUETOOTH", "connect/tutorialbluetooth", 403, "connect");
                }
                return null;
            case 37412651:
                if (str.equals("GOLDENPATH_SAFWANH")) {
                    return G1("GOLDENPATH_SAFWANH", "goldenpath/safwanh", 739, "goldenpath");
                }
                return null;
            case 77732827:
                if (str.equals("RADIO")) {
                    return B4();
                }
                return null;
            case 80083243:
                if (str.equals("TRACK")) {
                    return G1("TRACK", "track", 2045, "track");
                }
                return null;
            case 83950523:
                if (str.equals("REINVENTFREE_TIME_CAP_PIVOT_TRACK_RADIO_UPSELL")) {
                    return N4();
                }
                return null;
            case 115459067:
                if (str.equals("S4P_DEBUG_MENU")) {
                    return G1("S4P_DEBUG_MENU", "s4p/debug/menu", 1701, "s4p");
                }
                return null;
            case 120057931:
                if (str.equals("EVENTSENDER_ITGC_DEBUG")) {
                    return G1("EVENTSENDER_ITGC_DEBUG", "eventsender/itgc/debug", 528, "eventsender");
                }
                return null;
            case 125873899:
                if (str.equals("MEMBERSHIP_CONSUMER_RETURN_ACCESS_ERROR_DIALOG")) {
                    return G1("MEMBERSHIP_CONSUMER_RETURN_ACCESS_ERROR_DIALOG", "membership/consumer/return/access-error-dialog", 1030, "membership");
                }
                return null;
            case 162538539:
                if (str.equals("GOLDENPATH_SERGEIG")) {
                    return G1("GOLDENPATH_SERGEIG", "goldenpath/sergeig", 746, "goldenpath");
                }
                return null;
            case 198813547:
                if (str.equals("RADIO_STATION_CREATE")) {
                    return G1("RADIO_STATION_CREATE", "radio/station/create", 1616, "radio");
                }
                return null;
            case 204000331:
                if (str.equals("MRKT_FRONTDOOR_DISCOVERY_MODE")) {
                    return G1("MRKT_FRONTDOOR_DISCOVERY_MODE", "mrkt/frontdoor/discovery-mode", 1247, "mrkt");
                }
                return null;
            case 257684667:
                if (str.equals("CONTRIBUTOR")) {
                    return G1("CONTRIBUTOR", "contributor", 454, "contributor");
                }
                return null;
            case 309923403:
                if (str.equals("PLAYLIST_NOTLOADED")) {
                    return I3();
                }
                return null;
            case 334967243:
                if (str.equals("MRKT_FRONTDOOR_BUILDING_A_TRUSTED_PLATFORM")) {
                    return G1("MRKT_FRONTDOOR_BUILDING_A_TRUSTED_PLATFORM", "mrkt/frontdoor/building-a-trusted-platform", 1241, "mrkt");
                }
                return null;
            case 475896347:
                if (str.equals("REINVENTFREE_TIME_CAP_PIVOT_MULTI_SONG_UPSELL")) {
                    return L4();
                }
                return null;
            case 570440107:
                if (str.equals("HOMEMIX_ABOUT")) {
                    return G1("HOMEMIX_ABOUT", "homemix/about", 811, "homemix");
                }
                return null;
            case 577219787:
                if (str.equals("S4P_PODCAST_EPISODE_RICH_TEXT_EDITOR")) {
                    return G1("S4P_PODCAST_EPISODE_RICH_TEXT_EDITOR", "s4p/podcast/episode/rich-text-editor", 1736, "s4p");
                }
                return null;
            case 593976523:
                if (str.equals("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT")) {
                    return G1("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT", "mrkt/artist/audience/release-engagement", 1052, "mrkt");
                }
                return null;
            case 659528443:
                if (str.equals("CHAT_CONTENT_PICKER")) {
                    return q0();
                }
                return null;
            case 689771131:
                if (str.equals("SETTINGS_ACCOUNT_UPSELL")) {
                    return G1("SETTINGS_ACCOUNT_UPSELL", "settings/account/upsell", 1805, "settings");
                }
                return null;
            case 796711691:
                if (str.equals("LISTENINGSTATS_SUMMARY")) {
                    return w2();
                }
                return null;
            case 814170379:
                if (str.equals("S4P_SETUP_SHOW_COVER_ART")) {
                    return G1("S4P_SETUP_SHOW_COVER_ART", "s4p/setup-show/cover-art", 1752, "s4p");
                }
                return null;
            case 822181051:
                if (str.equals("COLLECTION_ARTISTS_ARTIST")) {
                    return G0();
                }
                return null;
            case 833885531:
                if (str.equals("MAGPIE_SOURCE_WEBVIEW")) {
                    return G1("MAGPIE_SOURCE_WEBVIEW", "magpie/source-webview", 987, "magpie");
                }
                return null;
            case 841039787:
                if (str.equals("CHARTS_WEEKLY")) {
                    return G1("CHARTS_WEEKLY", "charts/weekly", 312, "charts");
                }
                return null;
            case 876335163:
                if (str.equals("MRKT_FRONTDOOR_BLOG")) {
                    return G1("MRKT_FRONTDOOR_BLOG", "mrkt/frontdoor/blog", 1239, "mrkt");
                }
                return null;
            case 878945819:
                if (str.equals("JAM_PREMIUMGATEDSTARTUPSELLSHEET")) {
                    return G1("JAM_PREMIUMGATEDSTARTUPSELLSHEET", "jam/premiumgatedstartupsellsheet", 871, "jam");
                }
                return null;
            case 879168091:
                if (str.equals("DIALOG_PAYWALL")) {
                    return G1("DIALOG_PAYWALL", "dialog/paywall", 486, "dialog");
                }
                return null;
            case 880842539:
                if (str.equals("GUEST_LIBRARYTABWALL")) {
                    return G1("GUEST_LIBRARYTABWALL", "guest/librarytabwall", 778, "guest");
                }
                return null;
            case 911071467:
                if (str.equals("LOGIN_DIALOG_OFFLINE_ERROR")) {
                    return y2();
                }
                return null;
            case 917198827:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM_REVIEW")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_DM_REVIEW", "mrkt/artist/campaigns/dm/review", 1064, "mrkt");
                }
                return null;
            case 936594507:
                if (str.equals("CHECKOUT_COUNTRYPICKER")) {
                    return D0();
                }
                return null;
            case 1011240347:
                if (str.equals("ADS_AD_ON_APP_OPEN")) {
                    return B();
                }
                return null;
            case 1011656187:
                if (str.equals("RADIO_DASHBOARD_MIXES")) {
                    return G1("RADIO_DASHBOARD_MIXES", "radio/dashboard/mixes", 1614, "radio");
                }
                return null;
            case 1013066011:
                if (str.equals("ALIGNED_CURATION_FIRST_SAVE")) {
                    return L();
                }
                return null;
            case 1020302907:
                if (str.equals("AGE_ASSURANCE_UNDERAGE_BLOCKING")) {
                    return G();
                }
                return null;
            case 1026823035:
                if (str.equals("SONG_DNA_ABOUT")) {
                    return G1("SONG_DNA_ABOUT", "song-dna-about", 1918, "song-dna-about");
                }
                return null;
            case 1056189643:
                if (str.equals("REINVENTFREE_SKIP_LIMIT_UPSELL")) {
                    return K4();
                }
                return null;
            case 1057636747:
                if (str.equals("PROFILE_PLAYLISTS")) {
                    return G1("PROFILE_PLAYLISTS", "profile/playlists", 1586, "profile");
                }
                return null;
            case 1082669627:
                if (str.equals("DIALOG_AGELIMITDIALOG")) {
                    return G1("DIALOG_AGELIMITDIALOG", "dialog/agelimitdialog", 473, "dialog");
                }
                return null;
            case 1191009275:
                if (str.equals("ADSTUDIO_ACCOUNT_MANAGEMENT")) {
                    return G1("ADSTUDIO_ACCOUNT_MANAGEMENT", "adstudio/account-management", 30, "adstudio");
                }
                return null;
            case 1220049867:
                if (str.equals("MRKT_FRONTDOOR_VIDEOS_CONTENT")) {
                    return G1("MRKT_FRONTDOOR_VIDEOS_CONTENT", "mrkt/frontdoor/videos/content", 1277, "mrkt");
                }
                return null;
            case 1231315115:
                if (str.equals("WEAR_ENTITY_PAGE")) {
                    return G1("WEAR_ENTITY_PAGE", "wear/entity_page", 2142, "wear");
                }
                return null;
            case 1239693131:
                if (str.equals("CONTEXTMENU_EPISODE_SPEEDCONTROL")) {
                    return G1("CONTEXTMENU_EPISODE_SPEEDCONTROL", "contextmenu/episode/speedcontrol", 431, "contextmenu");
                }
                return null;
            case 1247801371:
                if (str.equals("S4P_SETUP_SHOW_AUTHOR")) {
                    return G1("S4P_SETUP_SHOW_AUTHOR", "s4p/setup-show/author", 1749, "s4p");
                }
                return null;
            case 1257056779:
                if (str.equals("TERMS_TERMSOFSERVICE_REACCEPT")) {
                    return G1("TERMS_TERMSOFSERVICE_REACCEPT", "terms/termsofservice/reaccept", 2041, "terms");
                }
                return null;
            case 1285806091:
                if (str.equals("WEAR_DOWNLOADS")) {
                    return G1("WEAR_DOWNLOADS", "wear/downloads", 2140, "wear");
                }
                return null;
            case 1304790907:
                if (str.equals("CONSUMPTION")) {
                    return U0();
                }
                return null;
            case 1316542827:
                if (str.equals("GOLDENPATH_MCOMISSO")) {
                    return G1("GOLDENPATH_MCOMISSO", "goldenpath/mcomisso", 700, "goldenpath");
                }
                return null;
            case 1329881515:
                if (str.equals("VERSIONSUNSETTING_DIALOG")) {
                    return d6();
                }
                return null;
            case 1389996251:
                if (str.equals("UNRESOLVED_PROFILE")) {
                    return G1("UNRESOLVED_PROFILE", "unresolved-profile", 2067, "unresolved-profile");
                }
                return null;
            case 1502163451:
                if (str.equals("CATEGORIES_ONBOARDING_LOADING")) {
                    return G1("CATEGORIES_ONBOARDING_LOADING", "categories/onboarding/loading", 288, "categories");
                }
                return null;
            case 1544265803:
                if (str.equals("START_RETRY")) {
                    return G1("START_RETRY", "start/retry", 1981, "start");
                }
                return null;
            case 1570737915:
                if (str.equals("YOURLIBRARY_ALBUMS")) {
                    return G1("YOURLIBRARY_ALBUMS", "yourlibrary/albums", 2256, "yourlibrary");
                }
                return null;
            case 1591105867:
                if (str.equals("COLLECTION_ARTISTS")) {
                    return G1("COLLECTION_ARTISTS", "collection/artists", 349, "collection");
                }
                return null;
            case 1628997611:
                if (str.equals("MRKT_BULK_CAMPAIGNS_FORECAST_RULES")) {
                    return G1("MRKT_BULK_CAMPAIGNS_FORECAST_RULES", "mrkt/bulk-campaigns/forecast/rules", 1190, "mrkt");
                }
                return null;
            case 1641254395:
                if (str.equals("GOLDENPATH_YUHANGZ")) {
                    return G1("GOLDENPATH_YUHANGZ", "goldenpath/yuhangz", 761, "goldenpath");
                }
                return null;
            case 1714429547:
                if (str.equals("CONTEXTMENU_DJNARRATION")) {
                    return G1("CONTEXTMENU_DJNARRATION", "contextmenu/djnarration", 425, "contextmenu");
                }
                return null;
            case 1749341947:
                if (str.equals("MRKT_ARTIST_PROFILE_ARTISTPICK_PICK")) {
                    return G1("MRKT_ARTIST_PROFILE_ARTISTPICK_PICK", "mrkt/artist/profile/artistpick/pick", 1117, "mrkt");
                }
                return null;
            case 1756630587:
                if (str.equals("INAPPMESSAGE_HTML_FULLSCREEN")) {
                    return e2();
                }
                return null;
            case 1770662539:
                if (str.equals("WATCHAPP_PODCAST_ENTITY")) {
                    return G1("WATCHAPP_PODCAST_ENTITY", "watchapp/podcast-entity", 2116, "watchapp");
                }
                return null;
            case 1773632475:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_METADATA")) {
                    return G1("SPOTIFY_FOR_AUTHORS_UPLOAD_METADATA", "spotify-for-authors/upload/metadata", 1958, "spotify-for-authors");
                }
                return null;
            case 1792515499:
                if (str.equals("ADS_PREFERRED_AD_CATEGORIES")) {
                    return G1("ADS_PREFERRED_AD_CATEGORIES", "ads/preferred-ad-categories", 23, "ads");
                }
                return null;
            case 1840204683:
                if (str.equals("SEARCH_AUDIOBOOKS")) {
                    return G1("SEARCH_AUDIOBOOKS", "search/audiobooks", 1781, "search");
                }
                return null;
            case 1849092203:
                if (str.equals("JAM_JOINJAMPROACTIVEPROMPTSHEET")) {
                    return G1("JAM_JOINJAMPROACTIVEPROMPTSHEET", "jam/joinjamproactivepromptsheet", 861, "jam");
                }
                return null;
            case 1855046747:
                if (str.equals("CREATEMENU")) {
                    return k1();
                }
                return null;
            case 1891813035:
                if (str.equals("ANCHORFUNNEL")) {
                    return G1("ANCHORFUNNEL", "anchorfunnel", 151, "anchorfunnel");
                }
                return null;
            case 1901414619:
                if (str.equals("PORTAL_SEARCH")) {
                    return G1("PORTAL_SEARCH", "portal/search", 1527, "portal");
                }
                return null;
            case 1905536299:
                if (str.equals("LOGIN_DIALOG_SAMSUNGEFFORTLESSLOGIN")) {
                    return G1("LOGIN_DIALOG_SAMSUNGEFFORTLESSLOGIN", "login/dialog/samsungeffortlesslogin", 952, "login");
                }
                return null;
            case 1909853179:
                if (str.equals("HIFI_NON_METERED_SHEET")) {
                    return G1("HIFI_NON_METERED_SHEET", "hifi/non-metered-sheet", 788, "hifi");
                }
                return null;
            case 1912769515:
                if (str.equals("PARENTAL_CONTROL_MANAGE_CONTENT")) {
                    return o3();
                }
                return null;
            case 1941043915:
                if (str.equals("S4P_PODCAST_EPISODE_OPTIONS_VIDEO")) {
                    return G1("S4P_PODCAST_EPISODE_OPTIONS_VIDEO", "s4p/podcast/episode/options/video", 1734, "s4p");
                }
                return null;
            case 1941968267:
                if (str.equals("AUTHOR")) {
                    return Y();
                }
                return null;
            case 1993724955:
                if (str.equals("COURSE")) {
                    return G1("COURSE", "course", 455, "course");
                }
                return null;
            case 2088336507:
                if (str.equals("JAM_PERMISSIONUPGRADESHEET")) {
                    return G1("JAM_PERMISSIONUPGRADESHEET", "jam/permissionupgradesheet", 870, "jam");
                }
                return null;
            case 2122072347:
                if (str.equals("PREMIUM_MINI_DOWNLOADED_ENTITY")) {
                    return G1("PREMIUM_MINI_DOWNLOADED_ENTITY", "premium-mini/downloaded-entity", 1554, "premium-mini");
                }
                return null;
            case 2131921227:
                if (str.equals("S4P_EPISODES_SELECT_POLL")) {
                    return G1("S4P_EPISODES_SELECT_POLL", "s4p/episodes/select/poll", 1708, "s4p");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 R() {
        return G1("AUDIO_LANGUAGE_SELECTOR", "audio-language-selector", 194, "audio-language-selector");
    }

    public static p6r0 R0() {
        return G1("CONCERTS_CONCERT", "concerts/concert", 389, "concerts");
    }

    public static p6r0 R1() {
        return G1("HOME_MUSIC_FOLLOWING", "home/music-following", 801, "home");
    }

    public static p6r0 R2() {
        return G1("MULTI_USER_PLAN_VERIFICATION_ONBOARDING", "multi-user-plan-verification/onboarding", 1338, "multi-user-plan-verification");
    }

    public static p6r0 R3() {
        return G1("PODCAST_SHOW_SETTINGS", "podcast/show/settings", 1503, "podcast");
    }

    public static p6r0 R4() {
        return G1("REMOTEDOWNLOADS_ONBOARDING", "remotedownloads/onboarding", 1650, "remotedownloads");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 R5(String str) {
        switch (str.hashCode()) {
            case -2142243204:
                if (str.equals("IRONCHEF_CHOOSEKIND")) {
                    return G1("IRONCHEF_CHOOSEKIND", "ironchef/choosekind", 845, "ironchef");
                }
                return null;
            case -2130891364:
                if (str.equals("PLAYLIST_PERMISSIONS_CLAIMDIALOG")) {
                    return L3();
                }
                return null;
            case -2129819812:
                if (str.equals("BLUEJAY_SKIP_FORWARD")) {
                    return k0();
                }
                return null;
            case -2105145316:
                if (str.equals("PROMODISCLOSURE")) {
                    return t4();
                }
                return null;
            case -2072291508:
                if (str.equals("S4P_SETUP_SHOW_DESCRIPTION")) {
                    return G1("S4P_SETUP_SHOW_DESCRIPTION", "s4p/setup-show/description", 1754, "s4p");
                }
                return null;
            case -2067779972:
                if (str.equals("MRKT_ARTIST_NMS_EDIT")) {
                    return G1("MRKT_ARTIST_NMS_EDIT", "mrkt/artist/nms/edit", 1104, "mrkt");
                }
                return null;
            case -2054302452:
                if (str.equals("S4P_MODERATION_SETTINGS")) {
                    return G1("S4P_MODERATION_SETTINGS", "s4p/moderation-settings", 1718, "s4p");
                }
                return null;
            case -2028249092:
                if (str.equals("S4P_CLAIM_PODCAST_ADD_EXISTING_PODCAST")) {
                    return G1("S4P_CLAIM_PODCAST_ADD_EXISTING_PODCAST", "s4p/claim-podcast/add-existing-podcast", 1683, "s4p");
                }
                return null;
            case -1960579332:
                if (str.equals("PICKINSIGHTS")) {
                    return G1("PICKINSIGHTS", "pickinsights", 1443, "pickinsights");
                }
                return null;
            case -1957586388:
                if (str.equals("CONTRIBUTION_NOTES_REPORT_PICKER")) {
                    return j1();
                }
                return null;
            case -1901251700:
                if (str.equals("GOLDENPATH_RMALMLING")) {
                    return G1("GOLDENPATH_RMALMLING", "goldenpath/rmalmling", 736, "goldenpath");
                }
                return null;
            case -1882516916:
                if (str.equals("ADSTUDIO_AD_DETAILS")) {
                    return G1("ADSTUDIO_AD_DETAILS", "adstudio/ad/details", 37, "adstudio");
                }
                return null;
            case -1744055604:
                if (str.equals("LEGACYSHARE_SENDTO")) {
                    return G1("LEGACYSHARE_SENDTO", "legacyshare/sendto", 907, "legacyshare");
                }
                return null;
            case -1727953572:
                if (str.equals("FRIENDRECOMMENDATIONS")) {
                    return G1("FRIENDRECOMMENDATIONS", "friendrecommendations", 590, "friendrecommendations");
                }
                return null;
            case -1698753188:
                if (str.equals("GOLDENPATH_SAMJ")) {
                    return G1("GOLDENPATH_SAMJ", "goldenpath/samj", 740, "goldenpath");
                }
                return null;
            case -1595186196:
                if (str.equals("QUIZ_RESULTS")) {
                    return A4();
                }
                return null;
            case -1570838212:
                if (str.equals("S4P_SETUP_SHOW_CROP_COVER_ART")) {
                    return G1("S4P_SETUP_SHOW_CROP_COVER_ART", "s4p/setup-show/crop-cover-art", 1753, "s4p");
                }
                return null;
            case -1452428884:
                if (str.equals("SETTINGS_NOTIFICATIONS")) {
                    return G1("SETTINGS_NOTIFICATIONS", "settings/notifications", 1832, "settings");
                }
                return null;
            case -1419391892:
                if (str.equals("S4P_SHARING_SHARE")) {
                    return G1("S4P_SHARING_SHARE", "s4p/sharing/share", 1761, "s4p");
                }
                return null;
            case -1410360068:
                if (str.equals("ADSTUDIO_AD_ACCOUNTS")) {
                    return G1("ADSTUDIO_AD_ACCOUNTS", "adstudio/ad-accounts", 32, "adstudio");
                }
                return null;
            case -1389595780:
                if (str.equals("EXTERNAL_NAVER")) {
                    return G1("EXTERNAL_NAVER", "external/naver", 539, "external");
                }
                return null;
            case -1377493204:
                if (str.equals("ADSTUDIO_BUSINESS_AD_ACCOUNTS_DETAILS")) {
                    return G1("ADSTUDIO_BUSINESS_AD_ACCOUNTS_DETAILS", "adstudio/business/ad-accounts/details", 52, "adstudio");
                }
                return null;
            case -1270000644:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_ADD_DETAILS")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_ADD_DETAILS", "mrkt/artist/campaigns/marquee-and-showcase/update/flights/add-details", 1076, "mrkt");
                }
                return null;
            case -1250149972:
                if (str.equals("MRKT_ARTIST_SONG_SOURCE_OF_STREAMS")) {
                    return G1("MRKT_ARTIST_SONG_SOURCE_OF_STREAMS", "mrkt/artist/song/source-of-streams", 1147, "mrkt");
                }
                return null;
            case -1195558052:
                if (str.equals("COMMENTS_TERMS")) {
                    return L0();
                }
                return null;
            case -1188200804:
                if (str.equals("ASSISTED_CURATION_SEARCH_EPISODES")) {
                    return G1("ASSISTED_CURATION_SEARCH_EPISODES", "assisted-curation/search/episodes", 188, "assisted-curation");
                }
                return null;
            case -1166229748:
                if (str.equals("PODCAST_SPEED")) {
                    return G1("PODCAST_SPEED", "podcast/speed", 1505, "podcast");
                }
                return null;
            case -1115286132:
                if (str.equals("GOLDENPATH_ZACKL")) {
                    return G1("GOLDENPATH_ZACKL", "goldenpath/zackl", 762, "goldenpath");
                }
                return null;
            case -1104338660:
                if (str.equals("MRKT_BULK_CAMPAIGNS_DASHBOARD")) {
                    return G1("MRKT_BULK_CAMPAIGNS_DASHBOARD", "mrkt/bulk-campaigns/dashboard", 1187, "mrkt");
                }
                return null;
            case -1095177428:
                if (str.equals("PROFILE_TOP_ARTISTS")) {
                    return G1("PROFILE_TOP_ARTISTS", "profile/top-artists", 1590, "profile");
                }
                return null;
            case -1094365188:
                if (str.equals("COURSE_REVIEW")) {
                    return G1("COURSE_REVIEW", "course/review", 459, "course");
                }
                return null;
            case -1079989220:
                if (str.equals("AUDIOBOOK_CONSIDERATION")) {
                    return U();
                }
                return null;
            case -1071849956:
                if (str.equals("MRKT_ROSTER")) {
                    return G1("MRKT_ROSTER", "mrkt/roster", 1298, "mrkt");
                }
                return null;
            case -1056248212:
                if (str.equals("CONNECT_DODO_NEWSTREAM")) {
                    return G1("CONNECT_DODO_NEWSTREAM", "connect/dodo/newstream", 396, "connect");
                }
                return null;
            case -1048256660:
                if (str.equals("SPOTIFLY")) {
                    return G1("SPOTIFLY", "spotifly", 1931, "spotifly");
                }
                return null;
            case -967978596:
                if (str.equals("PARENTAL_CONTROL_LOGIN_OPTIONS")) {
                    return G1("PARENTAL_CONTROL_LOGIN_OPTIONS", "parental-control/login-options", 1406, "parental-control");
                }
                return null;
            case -958169124:
                if (str.equals("ARTIST_ALBUMS")) {
                    return G1("ARTIST_ALBUMS", "artist/albums", 157, "artist");
                }
                return null;
            case -940209972:
                if (str.equals("GOLDENPATH_MCAPANO")) {
                    return G1("GOLDENPATH_MCAPANO", "goldenpath/mcapano", 699, "goldenpath");
                }
                return null;
            case -927601284:
                if (str.equals("SUPERBIRD_SETUP_CHECKFORUPDATES")) {
                    return G1("SUPERBIRD_SETUP_CHECKFORUPDATES", "superbird/setup/checkforupdates", AudioEpisode.VIDEO_FORMAT_FIELD_NUMBER, "superbird");
                }
                return null;
            case -910969108:
                if (str.equals("S4P_COMMENTS_DETAIL")) {
                    return G1("S4P_COMMENTS_DETAIL", "s4p/comments-detail", 1691, "s4p");
                }
                return null;
            case -902500484:
                if (str.equals("MRKT_DEBUG_S4P_COMPONENT_REFERENCE")) {
                    return G1("MRKT_DEBUG_S4P_COMPONENT_REFERENCE", "mrkt/debug/s4p/component-reference", 1215, "mrkt");
                }
                return null;
            case -881311620:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD_PREVIEW")) {
                    return G1("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD_PREVIEW", "mrkt/artist/profile/image-gallery/add/preview", 1130, "mrkt");
                }
                return null;
            case -864757012:
                if (str.equals("UBI_DEBUG_MONITOR_JOURNEY")) {
                    return G1("UBI_DEBUG_MONITOR_JOURNEY", "ubi/debug-monitor/journey", 2055, "ubi");
                }
                return null;
            case -848914404:
                if (str.equals("STUDIO_SANDBOX_SETUP")) {
                    return G1("STUDIO_SANDBOX_SETUP", "studio/sandbox-setup", 1994, "studio");
                }
                return null;
            case -799753476:
                if (str.equals("SUPERBIRD_SETUP_CONNECTTOCAR")) {
                    return G1("SUPERBIRD_SETUP_CONNECTTOCAR", "superbird/setup/connecttocar", 2004, "superbird");
                }
                return null;
            case -757236340:
                if (str.equals("CHALLENGE_DUMMY")) {
                    return G1("CHALLENGE_DUMMY", "challenge/dummy", 292, "challenge");
                }
                return null;
            case -709714004:
                if (str.equals("NOTIFICATIONS_CENTER")) {
                    return W2();
                }
                return null;
            case -666553972:
                if (str.equals("ENTITYSEGMENTS_CLIP")) {
                    return G1("ENTITYSEGMENTS_CLIP", "entitysegments/clip", 518, "entitysegments");
                }
                return null;
            case -637840340:
                if (str.equals("CONNECT_TUTORIALCHROMECAST")) {
                    return G1("CONNECT_TUTORIALCHROMECAST", "connect/tutorialchromecast", 404, "connect");
                }
                return null;
            case -630880244:
                if (str.equals("MRKT_LICENSOR_DISCOVERYMODE")) {
                    return G1("MRKT_LICENSOR_DISCOVERYMODE", "mrkt/licensor/discoverymode", 1286, "mrkt");
                }
                return null;
            case -578358612:
                if (str.equals("GOLDENPATH_MIVICO")) {
                    return G1("GOLDENPATH_MIVICO", "goldenpath/mivico", 706, "goldenpath");
                }
                return null;
            case -556786964:
                if (str.equals("PODCASTONBOARDING_SENDTOPICS")) {
                    return G1("PODCASTONBOARDING_SENDTOPICS", "podcastonboarding/sendtopics", 1520, "podcastonboarding");
                }
                return null;
            case -546073108:
                if (str.equals("DYNAMIC_SESSION_ENTITY")) {
                    return G1("DYNAMIC_SESSION_ENTITY", "dynamic-session/entity", 504, "dynamic-session");
                }
                return null;
            case -527867476:
                if (str.equals("ASSISTED_CURATION_SEARCH_PLAYLIST_ENTITY")) {
                    return G1("ASSISTED_CURATION_SEARCH_PLAYLIST_ENTITY", "assisted-curation/search/playlist-entity", 189, "assisted-curation");
                }
                return null;
            case -497604980:
                if (str.equals("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT_RESERVED_BOOKING")) {
                    return G1("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT_RESERVED_BOOKING", "adstudio/cold-start/review-and-submit/reserved-booking", 75, "adstudio");
                }
                return null;
            case -497469796:
                if (str.equals("UBI_DEBUG_MONITOR_EVENTDETAILS")) {
                    return G1("UBI_DEBUG_MONITOR_EVENTDETAILS", "ubi/debug-monitor/eventdetails", 2053, "ubi");
                }
                return null;
            case -484675828:
                if (str.equals("PLAN_DETAILS")) {
                    return w3();
                }
                return null;
            case -477800628:
                if (str.equals("CONNECT_PERMISSIONOVERLAY")) {
                    return G1("CONNECT_PERMISSIONOVERLAY", "connect/permissionoverlay", 402, "connect");
                }
                return null;
            case -458770740:
                if (str.equals("MRKT_ARTIST_SONG_CITIES")) {
                    return G1("MRKT_ARTIST_SONG_CITIES", "mrkt/artist/song/cities", 1142, "mrkt");
                }
                return null;
            case -437155076:
                if (str.equals("FREE_TIER_PLAYLIST")) {
                    return G1("FREE_TIER_PLAYLIST", "free-tier-playlist", 574, "free-tier-playlist");
                }
                return null;
            case -410109268:
                if (str.equals("MRKT_ADD_TEAM")) {
                    return G1("MRKT_ADD_TEAM", "mrkt/add-team", 1038, "mrkt");
                }
                return null;
            case -330370388:
                if (str.equals("ADSTUDIO_EDIT_AD_SET_RESERVED_BOOKING")) {
                    return G1("ADSTUDIO_EDIT_AD_SET_RESERVED_BOOKING", "adstudio/edit/ad-set/reserved-booking", 94, "adstudio");
                }
                return null;
            case -280067364:
                if (str.equals("PREMIUM_MESSAGING")) {
                    return G1("PREMIUM_MESSAGING", "premium-messaging", 1553, "premium-messaging");
                }
                return null;
            case -265170276:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AUDIO")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AUDIO", "adstudio/duplicate-ad-set-only/ad-quick-audio", 85, "adstudio");
                }
                return null;
            case -262273732:
                if (str.equals("FITNESS_WORKOUT_SETTINGS")) {
                    return G1("FITNESS_WORKOUT_SETTINGS", "fitness/workout-settings", 558, "fitness");
                }
                return null;
            case -225181572:
                if (str.equals("ARTIST_CATALOG_CATEGORY")) {
                    return G1("ARTIST_CATALOG_CATEGORY", "artist/catalog/category", 162, "artist");
                }
                return null;
            case -165417460:
                if (str.equals("WATCHAPP_HOME")) {
                    return G1("WATCHAPP_HOME", "watchapp/home", 2108, "watchapp");
                }
                return null;
            case -152925780:
                if (str.equals("LISTENINGHISTORY_PLAYSFROMCONTEXT")) {
                    return G1("LISTENINGHISTORY_PLAYSFROMCONTEXT", "listeninghistory/playsfromcontext", 918, "listeninghistory");
                }
                return null;
            case -144213556:
                if (str.equals("MAGPIE_CAP")) {
                    return H2();
                }
                return null;
            case -103761892:
                if (str.equals("STS_KUNGSHOLMEN_IMPORT_DISCLOSURE")) {
                    return G1("STS_KUNGSHOLMEN_IMPORT_DISCLOSURE", "sts/kungsholmen/import-disclosure", 1988, "sts");
                }
                return null;
            case -89431172:
                if (str.equals("DIALOG_TERMS_TERMSCHANGED")) {
                    return G1("DIALOG_TERMS_TERMSCHANGED", "dialog/terms/termschanged", 491, "dialog");
                }
                return null;
            case -37187108:
                if (str.equals("HARMONYPLAYER_NPV")) {
                    return G1("HARMONYPLAYER_NPV", "harmonyplayer/npv", 783, "harmonyplayer");
                }
                return null;
            case -13579300:
                if (str.equals("SUPERBIRD_SETUP_CONNECTED")) {
                    return G1("SUPERBIRD_SETUP_CONNECTED", "superbird/setup/connected", 2003, "superbird");
                }
                return null;
            case 2644956:
                if (str.equals("VTEC")) {
                    return g6();
                }
                return null;
            case 39039004:
                if (str.equals("ARTIST_CATALOG_SORT")) {
                    return G1("ARTIST_CATALOG_SORT", "artist/catalog/sort", 164, "artist");
                }
                return null;
            case 44248364:
                if (str.equals("GOLDENPATH_SANDORD")) {
                    return G1("GOLDENPATH_SANDORD", "goldenpath/sandord", 741, "goldenpath");
                }
                return null;
            case 63688380:
                if (str.equals("WEAR_ENTITY_PAGE_DEVICE_LIMIT_ERROR_SCREEN")) {
                    return G1("WEAR_ENTITY_PAGE_DEVICE_LIMIT_ERROR_SCREEN", "wear/entity_page/device_limit_error_screen", 2143, "wear");
                }
                return null;
            case 80428684:
                if (str.equals("MRKT_ARTIST_SONG_ABOUT_THE_SONG_FEEDBACK")) {
                    return G1("MRKT_ARTIST_SONG_ABOUT_THE_SONG_FEEDBACK", "mrkt/artist/song/about-the-song/feedback", 1141, "mrkt");
                }
                return null;
            case 149283628:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_RESETPASSWORDCONFIRMATION")) {
                    return G1("LOGIN_ACCOUNTRECOVERY_RESETPASSWORDCONFIRMATION", "login/accountrecovery/resetpasswordconfirmation", 943, "login");
                }
                return null;
            case 202503324:
                if (str.equals("GOLDENPATH_BOOTGLAMP")) {
                    return G1("GOLDENPATH_BOOTGLAMP", "goldenpath/bootglamp", 624, "goldenpath");
                }
                return null;
            case 219509068:
                if (str.equals("CONNECT_TUTORIALSPEAKER")) {
                    return G1("CONNECT_TUTORIALSPEAKER", "connect/tutorialspeaker", 407, "connect");
                }
                return null;
            case 254904556:
                if (str.equals("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE_NO_ARTIST_REDIRECT")) {
                    return G1("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE_NO_ARTIST_REDIRECT", "mrkt/artist/audience/active-audience/no-artist-redirect", 1045, "mrkt");
                }
                return null;
            case 274231388:
                if (str.equals("MANAGE_CREATE_INVITE_PAGE")) {
                    return G1("MANAGE_CREATE_INVITE_PAGE", "manage/create-invite-page", 995, "manage");
                }
                return null;
            case 289450220:
                if (str.equals("CONTRIBUTION_NOTES_MANAGE_MENU")) {
                    return f1();
                }
                return null;
            case 401399484:
                if (str.equals("BUNDLING_OFFER")) {
                    return G1("BUNDLING_OFFER", "bundling/offer", 255, "bundling");
                }
                return null;
            case 406583324:
                if (str.equals("WATCHAPP_END_SONGS_LIMIT_REACHED")) {
                    return G1("WATCHAPP_END_SONGS_LIMIT_REACHED", "watchapp/end-songs-limit-reached", 2103, "watchapp");
                }
                return null;
            case 430071148:
                if (str.equals("MRKT_ARTIST_RELEASE_STATS_PRE_RELEASE")) {
                    return G1("MRKT_ARTIST_RELEASE_STATS_PRE_RELEASE", "mrkt/artist/release/stats/pre-release", 1138, "mrkt");
                }
                return null;
            case 447200748:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_WELCOME")) {
                    return G1("SPOTIFYBUTTON_ACTIVATION_WELCOME", "spotifybutton/activation/welcome", 1964, "spotifybutton");
                }
                return null;
            case 470677820:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_REMOVEGUARDIAN")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_REMOVEGUARDIAN", "www-account-pages/parental-settings/removeguardian", 2228, "www-account-pages");
                }
                return null;
            case 556378012:
                if (str.equals("OFFLINE_PLAYABLE_ARTIST")) {
                    return G1("OFFLINE_PLAYABLE_ARTIST", "offline-playable-artist", 1374, "offline-playable-artist");
                }
                return null;
            case 584279004:
                if (str.equals("RADIO_STATION_CREATE_TRACKS")) {
                    return G1("RADIO_STATION_CREATE_TRACKS", "radio/station/create/tracks", 1621, "radio");
                }
                return null;
            case 646232812:
                if (str.equals("ADSTUDIO_COLD_START_AD_RESERVED_BOOKING")) {
                    return G1("ADSTUDIO_COLD_START_AD_RESERVED_BOOKING", "adstudio/cold-start/ad/reserved-booking", 70, "adstudio");
                }
                return null;
            case 681209052:
                if (str.equals("PROACTIVE_PLATFORMS_TRANSSION_NPV_WIDGET")) {
                    return G1("PROACTIVE_PLATFORMS_TRANSSION_NPV_WIDGET", "proactive-platforms/transsion-npv-widget", 1568, "proactive-platforms");
                }
                return null;
            case 724050332:
                if (str.equals("OVERLAY_SHUFFLEPLAYLIST")) {
                    return G1("OVERLAY_SHUFFLEPLAYLIST", "overlay/shuffleplaylist", 1388, "overlay");
                }
                return null;
            case 724219292:
                if (str.equals("FINDFRIENDS")) {
                    return G1("FINDFRIENDS", "findfriends", 556, "findfriends");
                }
                return null;
            case 759268028:
                if (str.equals("MRKT_TEAM_SWITCHER_DEBUG_SETTINGS")) {
                    return G1("MRKT_TEAM_SWITCHER_DEBUG_SETTINGS", "mrkt/team-switcher/debug-settings", 1315, "mrkt");
                }
                return null;
            case 761743676:
                if (str.equals("WATCHAPP_DOWNLOADS_ONBOARDING")) {
                    return G1("WATCHAPP_DOWNLOADS_ONBOARDING", "watchapp/downloads/onboarding", 2100, "watchapp");
                }
                return null;
            case 789511244:
                if (str.equals("CARS_BMW")) {
                    return G1("CARS_BMW", "cars/bmw", 280, "cars");
                }
                return null;
            case 818195980:
                if (str.equals("GOLDENPATH_JROULEAU")) {
                    return G1("GOLDENPATH_JROULEAU", "goldenpath/jrouleau", 675, "goldenpath");
                }
                return null;
            case 819683900:
                if (str.equals("BLUEJAY_CONNECTOR_APPS_AUTHENTICATION")) {
                    return j0();
                }
                return null;
            case 834291532:
                if (str.equals("AGE_ASSURANCE_CANCEL")) {
                    return G1("AGE_ASSURANCE_CANCEL", "age-assurance/cancel", 121, "age-assurance");
                }
                return null;
            case 855185420:
                if (str.equals("LISTENINGPARTY_CHAT")) {
                    return s2();
                }
                return null;
            case 959090972:
                if (str.equals("ADSTUDIO_DASHBOARD_AD_SETS")) {
                    return G1("ADSTUDIO_DASHBOARD_AD_SETS", "adstudio/dashboard/ad-sets", 78, "adstudio");
                }
                return null;
            case 1070340556:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD", "adstudio/duplicate-ad-set-with-ads/ad", 88, "adstudio");
                }
                return null;
            case 1094647516:
                if (str.equals("KID_ACCOUNT_TRANSITION_BIRTHDAY")) {
                    return G1("KID_ACCOUNT_TRANSITION_BIRTHDAY", "kid-account-transition/birthday", 888, "kid-account-transition");
                }
                return null;
            case 1139109132:
                if (str.equals("FORMATLISTPLATFORM_OFFLINE")) {
                    return G1("FORMATLISTPLATFORM_OFFLINE", "formatlistplatform/offline", 562, "formatlistplatform");
                }
                return null;
            case 1142446284:
                if (str.equals("WEAR_OUTPUT_PICKER")) {
                    return G1("WEAR_OUTPUT_PICKER", "wear/output_picker", 2151, "wear");
                }
                return null;
            case 1154063084:
                if (str.equals("JAM_JOINJAMDEVICESELECTIONSHEET")) {
                    return G1("JAM_JOINJAMDEVICESELECTIONSHEET", "jam/joinjamdeviceselectionsheet", 858, "jam");
                }
                return null;
            case 1203849292:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_UPLOAD")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_UPLOAD", "spotify-for-authors/dvn-creation/upload", 1948, "spotify-for-authors");
                }
                return null;
            case 1213515084:
                if (str.equals("S4P_ANALYTICS_GEO_LOCATION")) {
                    return G1("S4P_ANALYTICS_GEO_LOCATION", "s4p/analytics/geo-location", 1665, "s4p");
                }
                return null;
            case 1349375516:
                if (str.equals("COLLECTION_PODCASTSONLY")) {
                    return G1("COLLECTION_PODCASTSONLY", "collection/podcastsonly", 363, "collection");
                }
                return null;
            case 1355508812:
                if (str.equals("LOGIN_WELCOME")) {
                    return G1("LOGIN_WELCOME", "login/welcome", 965, "login");
                }
                return null;
            case 1367935868:
                if (str.equals("CONTEXTMENU_AUTHOR")) {
                    return G1("CONTEXTMENU_AUTHOR", "contextmenu/author", 421, "contextmenu");
                }
                return null;
            case 1415057068:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_REVIEW_AND_SUBMIT")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_REVIEW_AND_SUBMIT", "adstudio/add-to-existing-campaign/review-and-submit", 46, "adstudio");
                }
                return null;
            case 1419692556:
                if (str.equals("CONTEXTMENU_COURSE")) {
                    return G1("CONTEXTMENU_COURSE", "contextmenu/course", 422, "contextmenu");
                }
                return null;
            case 1462643292:
                if (str.equals("AIDJ_INTERACTIVITY_CONTAINER")) {
                    return I();
                }
                return null;
            case 1529434172:
                if (str.equals("MRKT_ROSTER_OVERVIEW")) {
                    return G1("MRKT_ROSTER_OVERVIEW", "mrkt/roster/overview", 1299, "mrkt");
                }
                return null;
            case 1562909260:
                if (str.equals("ASSISTED_CURATION")) {
                    return Q();
                }
                return null;
            case 1612335884:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_DM", "mrkt/artist/campaigns/dm", 1061, "mrkt");
                }
                return null;
            case 1621174060:
                if (str.equals("MANAGED_ACCOUNT_LINKING_TEEN_EDUCATION")) {
                    return G1("MANAGED_ACCOUNT_LINKING_TEEN_EDUCATION", "managed-account-linking/teen-education", 1011, "managed-account-linking");
                }
                return null;
            case 1651592716:
                if (str.equals("ONBOARDING_OVERLAY")) {
                    return G1("ONBOARDING_OVERLAY", "onboarding/overlay", 1379, "onboarding");
                }
                return null;
            case 1660978636:
                if (str.equals("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS_COLLAPSED")) {
                    return G1("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS_COLLAPSED", "settings/notifications/category-details-collapsed", 1835, "settings");
                }
                return null;
            case 1781578444:
                if (str.equals("START_CHOOSESIGNUP")) {
                    return G1("START_CHOOSESIGNUP", "start/choosesignup", 1980, "start");
                }
                return null;
            case 1791813900:
                if (str.equals("CONTEXTMENU_POSTTO")) {
                    return G1("CONTEXTMENU_POSTTO", "contextmenu/postto", 436, "contextmenu");
                }
                return null;
            case 1794945516:
                if (str.equals("LOCALFILES")) {
                    return G1("LOCALFILES", "localfiles", 935, "localfiles");
                }
                return null;
            case 1797507724:
                if (str.equals("OAUTH_PAIR_CONNECTED")) {
                    return G1("OAUTH_PAIR_CONNECTED", "oauth/pair/connected", 1369, "oauth");
                }
                return null;
            case 1798957196:
                if (str.equals("PERSONALISED_SET")) {
                    return G1("PERSONALISED_SET", "personalised-set", 1434, "personalised-set");
                }
                return null;
            case 1822177036:
                if (str.equals("COLLECTION_YOUREPISODES")) {
                    return G1("COLLECTION_YOUREPISODES", "collection/yourepisodes", 369, "collection");
                }
                return null;
            case 1916580540:
                if (str.equals("LISTENINGSTATS_HIGHLIGHT_DETAILS")) {
                    return v2();
                }
                return null;
            case 1928779692:
                if (str.equals("MRKT_BTC_BOOKING_BTC")) {
                    return G1("MRKT_BTC_BOOKING_BTC", "mrkt/btc/booking/btc", 1180, "mrkt");
                }
                return null;
            case 1939949724:
                if (str.equals("MRKT_ARTIST_SONG_STATS")) {
                    return G1("MRKT_ARTIST_SONG_STATS", "mrkt/artist/song/stats", 1148, "mrkt");
                }
                return null;
            case 1964346876:
                if (str.equals("S4P_INTERACT_SETTINGS")) {
                    return G1("S4P_INTERACT_SETTINGS", "s4p/interact/settings", 1716, "s4p");
                }
                return null;
            case 2021288252:
                if (str.equals("SUPPORT_SITE_CONTACT_US_ARTICLE")) {
                    return G1("SUPPORT_SITE_CONTACT_US_ARTICLE", "support-site/contact-us-article", 2022, "support-site");
                }
                return null;
            case 2054155852:
                if (str.equals("ATV_PIN_ENTRY")) {
                    return G1("ATV_PIN_ENTRY", "atv-pin-entry", 193, "atv-pin-entry");
                }
                return null;
            case 2067658284:
                if (str.equals("SETTINGS_THIRD_PARTY_LIBRARIES")) {
                    return h5();
                }
                return null;
            case 2096410044:
                if (str.equals("COLLECTION_RECENTLYPLAYED")) {
                    return G1("COLLECTION_RECENTLYPLAYED", "collection/recentlyplayed", 365, "collection");
                }
                return null;
            case 2129298844:
                if (str.equals("TV_DIALOG_EXIT_CONFIRMATION")) {
                    return G1("TV_DIALOG_EXIT_CONFIRMATION", "tv/dialog/exit-confirmation", 2050, "tv");
                }
                return null;
            case 2131530972:
                if (str.equals("S4P_EPISODES_SELECT_CLIP")) {
                    return G1("S4P_EPISODES_SELECT_CLIP", "s4p/episodes/select/clip", 1707, "s4p");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 S() {
        return G1("AUDIOBOOK_CHAPTERPLAYBACKCONFIRMATION", "audiobook/chapterplaybackconfirmation", 196, "audiobook");
    }

    public static p6r0 S0() {
        return G1("CONCERTS_MULTIEVENTBOTTOMSHEET", "concerts/multieventbottomsheet", 392, "concerts");
    }

    public static p6r0 S1() {
        return G1("HOME_MUSIC_VIDEOS", "home/music-videos", 802, "home");
    }

    public static p6r0 S2() {
        return G1("MULTI_USER_PLAN_VERIFICATION_START", "multi-user-plan-verification/start", 1339, "multi-user-plan-verification");
    }

    public static p6r0 S3() {
        return G1("PODCAST_SHOW_SETTINGS_MARKASPLAYED", "podcast/show/settings/markasplayed", 1504, "podcast");
    }

    public static p6r0 S4() {
        return G1("REMOTEDOWNLOADS_ONBOARDING_EDUCATION", "remotedownloads/onboarding/education", 1651, "remotedownloads");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 S5(String str) {
        switch (str.hashCode()) {
            case -2126728339:
                if (str.equals("ADSTUDIO_CHANGE_HISTORY_ALL")) {
                    return G1("ADSTUDIO_CHANGE_HISTORY_ALL", "adstudio/change-history/all", 62, "adstudio");
                }
                return null;
            case -2075076035:
                if (str.equals("PODCASTMIX_CONTROLS")) {
                    return G1("PODCASTMIX_CONTROLS", "podcastmix/controls", 1515, "podcastmix");
                }
                return null;
            case -2059278499:
                if (str.equals("FREETIER_TASTEONBOARDING_LIKEDARTISTS")) {
                    return G1("FREETIER_TASTEONBOARDING_LIKEDARTISTS", "freetier/tasteonboarding/likedartists", 586, "freetier");
                }
                return null;
            case -2027237747:
                if (str.equals("MRKT_ARTIST_MUSIC_RELEASES")) {
                    return G1("MRKT_ARTIST_MUSIC_RELEASES", "mrkt/artist/music/releases", 1096, "mrkt");
                }
                return null;
            case -1977365587:
                if (str.equals("AGE_ASSURANCE")) {
                    return D();
                }
                return null;
            case -1975741747:
                if (str.equals("SONG_DNA")) {
                    return G1("SONG_DNA", "song-dna", 1917, "song-dna");
                }
                return null;
            case -1951118835:
                if (str.equals("SUPERBIRD_SETUP_SEARCHING")) {
                    return G1("SUPERBIRD_SETUP_SEARCHING", "superbird/setup/searching", 2015, "superbird");
                }
                return null;
            case -1923625043:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTDETAILS")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTDETAILS", "www-account-pages/parental-settings/managedaccountdetails", 2226, "www-account-pages");
                }
                return null;
            case -1862564211:
                if (str.equals("JAM_PENDINGREQUESTSSHEET")) {
                    return k2();
                }
                return null;
            case -1842429523:
                if (str.equals("SPOTIT")) {
                    return G1("SPOTIT", "spotit", 1965, "spotit");
                }
                return null;
            case -1832567171:
                if (str.equals("GUEST_LOGINTABWALL")) {
                    return G1("GUEST_LOGINTABWALL", "guest/logintabwall", 779, "guest");
                }
                return null;
            case -1788495155:
                if (str.equals("WATCHFEED")) {
                    return h6();
                }
                return null;
            case -1785066387:
                if (str.equals("UPSELL")) {
                    return L5();
                }
                return null;
            case -1707761635:
                if (str.equals("SRC_CREATOR_DISPUTES")) {
                    return G1("SRC_CREATOR_DISPUTES", "src/creator/disputes", 1970, "src");
                }
                return null;
            case -1705662979:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_SUCCESS")) {
                    return G1("MRKT_BULK_CAMPAIGNS_UPLOAD_SUCCESS", "mrkt/bulk-campaigns/upload/success", 1195, "mrkt");
                }
                return null;
            case -1701024467:
                if (str.equals("WWW_ACCOUNT_PAGES_CANCEL_SUBSCRIPTION")) {
                    return G1("WWW_ACCOUNT_PAGES_CANCEL_SUBSCRIPTION", "www-account-pages/cancel-subscription", 2190, "www-account-pages");
                }
                return null;
            case -1639447363:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT")) {
                    return Y3();
                }
                return null;
            case -1592174035:
                if (str.equals("OURSONG_RECEIVER")) {
                    return G1("OURSONG_RECEIVER", "oursong/receiver", 1385, "oursong");
                }
                return null;
            case -1561301923:
                if (str.equals("MANAGE_TEAM_MEMBERS_PAGE")) {
                    return G1("MANAGE_TEAM_MEMBERS_PAGE", "manage/team-members-page", 1002, "manage");
                }
                return null;
            case -1558630291:
                if (str.equals("AUDIOBOOK_SUPPLEMENTARYCONTENTREADER")) {
                    return G1("AUDIOBOOK_SUPPLEMENTARYCONTENTREADER", "audiobook/supplementarycontentreader", 204, "audiobook");
                }
                return null;
            case -1538646915:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_DOWNLOAD")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_DOWNLOAD", "mrkt/discovery-mode/unified-buying/update/csv/download", 1223, "mrkt");
                }
                return null;
            case -1530889987:
                if (str.equals("WRAPPED_ENTITY")) {
                    return G1("WRAPPED_ENTITY", "wrapped/entity", 2180, "wrapped");
                }
                return null;
            case -1505783699:
                if (str.equals("YOURLIBRARY_MESSAGING")) {
                    return l6();
                }
                return null;
            case -1484279299:
                if (str.equals("WATCHAPP_ALIGNED_CURATION")) {
                    return G1("WATCHAPP_ALIGNED_CURATION", "watchapp/aligned-curation", 2091, "watchapp");
                }
                return null;
            case -1453977795:
                if (str.equals("ADSTUDIO_AD_SET_ADS")) {
                    return G1("ADSTUDIO_AD_SET_ADS", "adstudio/ad-set/ads", 33, "adstudio");
                }
                return null;
            case -1421664243:
                if (str.equals("S4P_INTERACT_COMMENTS_INSIGHTS")) {
                    return G1("S4P_INTERACT_COMMENTS_INSIGHTS", "s4p/interact/comments-insights", 1714, "s4p");
                }
                return null;
            case -1348837187:
                if (str.equals("WWW_ACCOUNT_PAGES_SAMPLEINAPP")) {
                    return G1("WWW_ACCOUNT_PAGES_SAMPLEINAPP", "www-account-pages/sampleinapp", 2242, "www-account-pages");
                }
                return null;
            case -1299615907:
                if (str.equals("PODCAST_EPISODE_LOADING")) {
                    return G1("PODCAST_EPISODE_LOADING", "podcast/episode/loading", 1485, "podcast");
                }
                return null;
            case -1297157683:
                if (str.equals("S4P_BLOCKED_WORDS_COMMENTS")) {
                    return G1("S4P_BLOCKED_WORDS_COMMENTS", "s4p/blocked-words-comments", 1681, "s4p");
                }
                return null;
            case -1274957891:
                if (str.equals("NOWPLAYING_NOWPLAYINGSIDEBAR")) {
                    return Z2();
                }
                return null;
            case -1166971043:
                if (str.equals("S4P_ANALYTICS_MILESTONE_FOLLOWERS")) {
                    return G1("S4P_ANALYTICS_MILESTONE_FOLLOWERS", "s4p/analytics/milestone/followers", 1668, "s4p");
                }
                return null;
            case -1136101571:
                if (str.equals("GOLDENPATH_COLES")) {
                    return G1("GOLDENPATH_COLES", "goldenpath/coles", 630, "goldenpath");
                }
                return null;
            case -1110300963:
                if (str.equals("JAM_ADSDISCLAIMERSHEET")) {
                    return G1("JAM_ADSDISCLAIMERSHEET", "jam/adsdisclaimersheet", 852, "jam");
                }
                return null;
            case -1081868979:
                if (str.equals("KID_ACCOUNT_CREATION_WELCOME")) {
                    return G1("KID_ACCOUNT_CREATION_WELCOME", "kid-account-creation/welcome", 885, "kid-account-creation");
                }
                return null;
            case -1056025651:
                if (str.equals("NOWPLAYING_HISTORY")) {
                    return G1("NOWPLAYING_HISTORY", "nowplaying/history", 1355, "nowplaying");
                }
                return null;
            case -1022820755:
                if (str.equals("S4P_FORCED_UPGRADES")) {
                    return G1("S4P_FORCED_UPGRADES", "s4p/forced-upgrades", 1710, "s4p");
                }
                return null;
            case -982148019:
                if (str.equals("GOLDENPATH_MARCINH")) {
                    return G1("GOLDENPATH_MARCINH", "goldenpath/marcinh", 691, "goldenpath");
                }
                return null;
            case -962810179:
                if (str.equals("YOURSPOTIFY_DISCOVEREDFEATURES")) {
                    return G1("YOURSPOTIFY_DISCOVEREDFEATURES", "yourspotify/discoveredfeatures", 2276, "yourspotify");
                }
                return null;
            case -924137955:
                if (str.equals("PODCASTONBOARDING_TOPICPICKER")) {
                    return G1("PODCASTONBOARDING_TOPICPICKER", "podcastonboarding/topicpicker", 1521, "podcastonboarding");
                }
                return null;
            case -912692947:
                if (str.equals("GOLDENPATH_BELLERINAH")) {
                    return G1("GOLDENPATH_BELLERINAH", "goldenpath/bellerinah", 623, "goldenpath");
                }
                return null;
            case -889038035:
                if (str.equals("WWW_ACCOUNT_PAGES_PREMIUM_SUBSCRIPTION_MANAGEMENT_COMPONENTS")) {
                    return G1("WWW_ACCOUNT_PAGES_PREMIUM_SUBSCRIPTION_MANAGEMENT_COMPONENTS", "www-account-pages/premium-subscription-management-components", 2235, "www-account-pages");
                }
                return null;
            case -881387155:
                if (str.equals("SRC_RIGHTSHOLDER_TRACK_DETAILS")) {
                    return G1("SRC_RIGHTSHOLDER_TRACK_DETAILS", "src/rightsholder/track/details", 1975, "src");
                }
                return null;
            case -837776675:
                if (str.equals("GRADUATION_POSTPONED")) {
                    return G1("GRADUATION_POSTPONED", "graduation/postponed", 769, "graduation");
                }
                return null;
            case -764583379:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AUDIO")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AUDIO", "adstudio/add-to-existing-ad-set/ad-quick-audio", 42, "adstudio");
                }
                return null;
            case -705723603:
                if (str.equals("SHOWS_AUDIO")) {
                    return j5();
                }
                return null;
            case -700116867:
                if (str.equals("MRKT_PLAYLIST_REPORTER")) {
                    return G1("MRKT_PLAYLIST_REPORTER", "mrkt/playlist-reporter", 1294, "mrkt");
                }
                return null;
            case -677190035:
                if (str.equals("CONTEXTMENU_VIDEOSETTINGS")) {
                    return G1("CONTEXTMENU_VIDEOSETTINGS", "contextmenu/videosettings", 443, "contextmenu");
                }
                return null;
            case -664954083:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_DEVICESCANNING")) {
                    return G1("SPOTIFYBUTTON_ACTIVATION_DEVICESCANNING", "spotifybutton/activation/devicescanning", 1961, "spotifybutton");
                }
                return null;
            case -619574403:
                if (str.equals("MRKT_ARTIST_MERCH_NO_ARTIST_REDIRECT")) {
                    return G1("MRKT_ARTIST_MERCH_NO_ARTIST_REDIRECT", "mrkt/artist/merch/no-artist-redirect", 1091, "mrkt");
                }
                return null;
            case -619208611:
                if (str.equals("OAUTH_PAIR_CONSENT")) {
                    return G1("OAUTH_PAIR_CONSENT", "oauth/pair/consent", 1370, "oauth");
                }
                return null;
            case -550292899:
                if (str.equals("GOLDENPATH_NICKYB")) {
                    return G1("GOLDENPATH_NICKYB", "goldenpath/nickyb", 720, "goldenpath");
                }
                return null;
            case -490290483:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_RESPONDTOGRADUATIONREQUEST")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_RESPONDTOGRADUATIONREQUEST", "www-account-pages/genalpha/respondtograduationrequest", 2207, "www-account-pages");
                }
                return null;
            case -477143619:
                if (str.equals("MRKT_FRONTDOOR_COUNTDOWN_PAGES")) {
                    return G1("MRKT_FRONTDOOR_COUNTDOWN_PAGES", "mrkt/frontdoor/countdown-pages", 1246, "mrkt");
                }
                return null;
            case -428581459:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REPORTS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REPORTS", "spotify-for-authors/audiobook/reports", 1939, "spotify-for-authors");
                }
                return null;
            case -411670275:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS", "mrkt/artist/video/music-videos", 1159, "mrkt");
                }
                return null;
            case -373732339:
                if (str.equals("INAPPMESSAGE_HTML_MODAL")) {
                    return f2();
                }
                return null;
            case -335354995:
                if (str.equals("LISTENINGACTIVITY_DETAILS")) {
                    return G1("LISTENINGACTIVITY_DETAILS", "listeningactivity/details", 912, "listeningactivity");
                }
                return null;
            case -329916403:
                if (str.equals("PHONENUMBER_VALIDATEOTP")) {
                    return G1("PHONENUMBER_VALIDATEOTP", "phonenumber/validateotp", 1438, "phonenumber");
                }
                return null;
            case -315477715:
                if (str.equals("EXTERNAL_GOOGLE")) {
                    return A1();
                }
                return null;
            case -294664963:
                if (str.equals("COLLECTION_SONGS")) {
                    return G1("COLLECTION_SONGS", "collection/songs", 367, "collection");
                }
                return null;
            case -277586371:
                if (str.equals("GOLDENPATH_FEDERICAC")) {
                    return G1("GOLDENPATH_FEDERICAC", "goldenpath/federicac", 647, "goldenpath");
                }
                return null;
            case -254627699:
                if (str.equals("CACHED_FILES_SEARCH")) {
                    return G1("CACHED_FILES_SEARCH", "cached-files/search", 266, "cached-files");
                }
                return null;
            case -237995411:
                if (str.equals("MRKT_FRONTDOOR_ANALYTICS")) {
                    return G1("MRKT_FRONTDOOR_ANALYTICS", "mrkt/frontdoor/analytics", 1236, "mrkt");
                }
                return null;
            case -227080499:
                if (str.equals("FREE_TIER_PLAYLIST_ONDEMAND")) {
                    return G1("FREE_TIER_PLAYLIST_ONDEMAND", "free-tier-playlist/ondemand", 575, "free-tier-playlist");
                }
                return null;
            case -226391731:
                if (str.equals("S4P_ANALYTICS_WIDGET")) {
                    return G1("S4P_ANALYTICS_WIDGET", "s4p/analytics-widget", 1664, "s4p");
                }
                return null;
            case -203937843:
                if (str.equals("MRKT_TEAM_ACCESS_PENDING")) {
                    return G1("MRKT_TEAM_ACCESS_PENDING", "mrkt/team/access/pending", 1319, "mrkt");
                }
                return null;
            case -169247139:
                if (str.equals("MRKT_ARTIST_MUSIC_UPCOMING")) {
                    return G1("MRKT_ARTIST_MUSIC_UPCOMING", "mrkt/artist/music/upcoming", 1099, "mrkt");
                }
                return null;
            case -109010595:
                if (str.equals("FILTERANDSORT")) {
                    return E1();
                }
                return null;
            case -93298003:
                if (str.equals("ENHANCED_SESSION")) {
                    return G1("ENHANCED_SESSION", "enhanced-session", 513, "enhanced-session");
                }
                return null;
            case -92656035:
                if (str.equals("GOLDENPATH_NATHANB")) {
                    return G1("GOLDENPATH_NATHANB", "goldenpath/nathanb", 718, "goldenpath");
                }
                return null;
            case -1595507:
                if (str.equals("NOWPLAYING_LIVEROOMNOWPLAYINGBAR")) {
                    return G1("NOWPLAYING_LIVEROOMNOWPLAYINGBAR", "nowplaying/liveroomnowplayingbar", 1356, "nowplaying");
                }
                return null;
            case 11477261:
                if (str.equals("DIALOG_CONNECTXAUTH")) {
                    return G1("DIALOG_CONNECTXAUTH", "dialog/connectxauth", 479, "dialog");
                }
                return null;
            case 13325245:
                if (str.equals("RUNNING_SETUP")) {
                    return G1("RUNNING_SETUP", "running/setup", 1660, "running");
                }
                return null;
            case 29621021:
                if (str.equals("PLAYBACK_TIMEOUT")) {
                    return z3();
                }
                return null;
            case 43022717:
                if (str.equals("FREE_TIER_EDIT_PLAYLIST")) {
                    return G1("FREE_TIER_EDIT_PLAYLIST", "free-tier-edit-playlist", 568, "free-tier-edit-playlist");
                }
                return null;
            case 88691165:
                if (str.equals("MRKT_APP_SETTINGS_SELECT_ARTIST")) {
                    return G1("MRKT_APP_SETTINGS_SELECT_ARTIST", "mrkt/app-settings/select-artist", 1041, "mrkt");
                }
                return null;
            case 106845501:
                if (str.equals("JAM_CANCELJOINREQUESTSHEET")) {
                    return G1("JAM_CANCELJOINREQUESTSHEET", "jam/canceljoinrequestsheet", 853, "jam");
                }
                return null;
            case 161791581:
                if (str.equals("MRKT_LICENSOR_DISCOVERYMODE_EDIT")) {
                    return G1("MRKT_LICENSOR_DISCOVERYMODE_EDIT", "mrkt/licensor/discoverymode/edit", 1288, "mrkt");
                }
                return null;
            case 198425565:
                if (str.equals("ONLYYOU_DATASTORIES")) {
                    return G1("ONLYYOU_DATASTORIES", "onlyyou/datastories", 1381, "onlyyou");
                }
                return null;
            case 199608973:
                if (str.equals("CONCERTS")) {
                    return N0();
                }
                return null;
            case 236626381:
                if (str.equals("IRONCHEF_CREATE")) {
                    return G1("IRONCHEF_CREATE", "ironchef/create", 846, "ironchef");
                }
                return null;
            case 242815389:
                if (str.equals("PODCAST_EPISODE_DESCRIPTION")) {
                    return G1("PODCAST_EPISODE_DESCRIPTION", "podcast/episode/description", 1484, "podcast");
                }
                return null;
            case 246310989:
                if (str.equals("STUDIO_RESEARCH_PREVIEW")) {
                    return G1("STUDIO_RESEARCH_PREVIEW", "studio/research-preview", 1993, "studio");
                }
                return null;
            case 286621645:
                if (str.equals("MRKT_BILLING_DETAILS")) {
                    return G1("MRKT_BILLING_DETAILS", "mrkt/billing/details", 1178, "mrkt");
                }
                return null;
            case 288597357:
                if (str.equals("SIGNUP_AGECONFIRMATION")) {
                    return G1("SIGNUP_AGECONFIRMATION", "signup/ageconfirmation", 1884, "signup");
                }
                return null;
            case 428323053:
                if (str.equals("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DRAFT")) {
                    return G1("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DRAFT", "mrkt/third-party-agency/campaigns/draft", 1323, "mrkt");
                }
                return null;
            case 433120333:
                if (str.equals("VOTING_CONFIRMATION")) {
                    return G1("VOTING_CONFIRMATION", "voting/confirmation", 2084, "voting");
                }
                return null;
            case 444235693:
                if (str.equals("SHOWCASE")) {
                    return G1("SHOWCASE", "showcase", 1867, "showcase");
                }
                return null;
            case 451800349:
                if (str.equals("KID_ACCOUNT_CREATION_ENTRY")) {
                    return G1("KID_ACCOUNT_CREATION_ENTRY", "kid-account-creation/entry", 878, "kid-account-creation");
                }
                return null;
            case 451829997:
                if (str.equals("RADIO_STATION_CREATE_PLAYLISTS")) {
                    return G1("RADIO_STATION_CREATE_PLAYLISTS", "radio/station/create/playlists", 1619, "radio");
                }
                return null;
            case 476993517:
                if (str.equals("KID_ACCOUNT_CREATION_USER_INFO")) {
                    return G1("KID_ACCOUNT_CREATION_USER_INFO", "kid-account-creation/user-info", 884, "kid-account-creation");
                }
                return null;
            case 479397085:
                if (str.equals("ENTITYSEGMENTS_CLIP_EDIT")) {
                    return w1();
                }
                return null;
            case 485394573:
                if (str.equals("HIFI_METERED_SHEET")) {
                    return G1("HIFI_METERED_SHEET", "hifi/metered-sheet", 787, "hifi");
                }
                return null;
            case 496599581:
                if (str.equals("SHOWS_FORMAT_LIST")) {
                    return G1("SHOWS_FORMAT_LIST", "shows/format/list", 1873, "shows");
                }
                return null;
            case 528814557:
                if (str.equals("BOOKMARKS")) {
                    return G1("BOOKMARKS", "bookmarks", 238, "bookmarks");
                }
                return null;
            case 546412989:
                if (str.equals("TERMS_TERMSINFO")) {
                    return G1("TERMS_TERMSINFO", "terms/termsinfo", 2039, "terms");
                }
                return null;
            case 552323997:
                if (str.equals("EMAIL_EDIT_SSO")) {
                    return G1("EMAIL_EDIT_SSO", "email/edit/sso", 508, "email");
                }
                return null;
            case 588159533:
                if (str.equals("PARENTAL_CONTROL_REVIEW_ALLOWLISTING_REQUESTS")) {
                    return q3();
                }
                return null;
            case 596430045:
                if (str.equals("MEDIA_TRIMMER")) {
                    return P2();
                }
                return null;
            case 613070269:
                if (str.equals("CHALLENGE_HASHCASH")) {
                    return G1("CHALLENGE_HASHCASH", "challenge/hashcash", 296, "challenge");
                }
                return null;
            case 733922797:
                if (str.equals("MRKT_FRONTDOOR_DISPLAY_CAMPAIGNS")) {
                    return G1("MRKT_FRONTDOOR_DISPLAY_CAMPAIGNS", "mrkt/frontdoor/display-campaigns", 1248, "mrkt");
                }
                return null;
            case 759414125:
                if (str.equals("LISTENINGACTIVITY_GROUP_DETAILS")) {
                    return G1("LISTENINGACTIVITY_GROUP_DETAILS", "listeningactivity/group/details", 914, "listeningactivity");
                }
                return null;
            case 791908989:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY_CREATE")) {
                    return G1("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY_CREATE", "mrkt/dm-managed-service/eligibility/create", 1233, "mrkt");
                }
                return null;
            case 832990957:
                if (str.equals("PORTAL_SEARCH_DATA_ENDPOINTS")) {
                    return G1("PORTAL_SEARCH_DATA_ENDPOINTS", "portal/search-data-endpoints", 1529, "portal");
                }
                return null;
            case 845715501:
                if (str.equals("PLAYLIST_MIXING_LATER_IN_PLAYLIST")) {
                    return G1("PLAYLIST_MIXING_LATER_IN_PLAYLIST", "playlist/mixing-later-in-playlist", 1466, "playlist");
                }
                return null;
            case 856952109:
                if (str.equals("SPOTIFY_FOR_AUTHORS_ONBOARDING")) {
                    return G1("SPOTIFY_FOR_AUTHORS_ONBOARDING", "spotify-for-authors/onboarding", 1951, "spotify-for-authors");
                }
                return null;
            case 978049229:
                if (str.equals("SUPERBIRD_SETUP_CONNECTTOWIFI")) {
                    return G1("SUPERBIRD_SETUP_CONNECTTOWIFI", "superbird/setup/connecttowifi", 2005, "superbird");
                }
                return null;
            case 1009386941:
                if (str.equals("WEAR_ENTITY_PAGE_SUGGEST_TO_ENABLE_CELLULAR_DOWNLOADS")) {
                    return G1("WEAR_ENTITY_PAGE_SUGGEST_TO_ENABLE_CELLULAR_DOWNLOADS", "wear/entity_page/suggest_to_enable_cellular_downloads", 2145, "wear");
                }
                return null;
            case 1015050541:
                if (str.equals("MRKT_SONG_DNA_REPORTING")) {
                    return G1("MRKT_SONG_DNA_REPORTING", "mrkt/song-dna-reporting", 1301, "mrkt");
                }
                return null;
            case 1027645501:
                if (str.equals("MRKT_ARTIST_MUSIC_SONGS")) {
                    return G1("MRKT_ARTIST_MUSIC_SONGS", "mrkt/artist/music/songs", 1098, "mrkt");
                }
                return null;
            case 1038665437:
                if (str.equals("GOLDENPATH_TBREITZMAN")) {
                    return G1("GOLDENPATH_TBREITZMAN", "goldenpath/tbreitzman", 751, "goldenpath");
                }
                return null;
            case 1048759725:
                if (str.equals("GOLDENPATH_DANIELLEV")) {
                    return G1("GOLDENPATH_DANIELLEV", "goldenpath/daniellev", 631, "goldenpath");
                }
                return null;
            case 1071664685:
                if (str.equals("CONCERTS_GROUP")) {
                    return G1("CONCERTS_GROUP", "concerts/group", 391, "concerts");
                }
                return null;
            case 1149962813:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_STATUS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_STATUS", "spotify-for-authors/dvn-creation/status", 1947, "spotify-for-authors");
                }
                return null;
            case 1157450973:
                if (str.equals("AUDIOBOOK_CHAPTERPLAYBACKCONFIRMATION")) {
                    return S();
                }
                return null;
            case 1166725517:
                if (str.equals("PODCAST_PORTFOLIO")) {
                    return G1("PODCAST_PORTFOLIO", "podcast/portfolio", 1491, "podcast");
                }
                return null;
            case 1194561133:
                if (str.equals("SUPERBIRD_SETUP_DOWNLOADING")) {
                    return G1("SUPERBIRD_SETUP_DOWNLOADING", "superbird/setup/downloading", 2009, "superbird");
                }
                return null;
            case 1243496589:
                if (str.equals("MRKT_ARTIST_NMS")) {
                    return G1("MRKT_ARTIST_NMS", "mrkt/artist/nms", 1102, "mrkt");
                }
                return null;
            case 1270057741:
                if (str.equals("FANDOM_TOPTRACKS")) {
                    return G1("FANDOM_TOPTRACKS", "fandom/toptracks", 548, "fandom");
                }
                return null;
            case 1277088413:
                if (str.equals("S4P_SETTINGS_THEME")) {
                    return G1("S4P_SETTINGS_THEME", "s4p/settings/theme", 1748, "s4p");
                }
                return null;
            case 1302925373:
                if (str.equals("AGE_SIGNAL_SIGNUP_MANAGED_ACCOUNT")) {
                    return G1("AGE_SIGNAL_SIGNUP_MANAGED_ACCOUNT", "age-signal/signup/managed-account", 135, "age-signal");
                }
                return null;
            case 1306164205:
                if (str.equals("LOGIN_PHONENUMBER_OTP")) {
                    return G1("LOGIN_PHONENUMBER_OTP", "login/phonenumber/otp", 961, "login");
                }
                return null;
            case 1379410077:
                if (str.equals("AUDIO_LANGUAGE_SELECTOR")) {
                    return R();
                }
                return null;
            case 1403656877:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_READY")) {
                    return G1("SPOTIFYBUTTON_ACTIVATION_READY", "spotifybutton/activation/ready", 1962, "spotifybutton");
                }
                return null;
            case 1484169549:
                if (str.equals("FREETIER_TASTEONBOARDING_ARTISTSEARCH")) {
                    return G1("FREETIER_TASTEONBOARDING_ARTISTSEARCH", "freetier/tasteonboarding/artistsearch", 585, "freetier");
                }
                return null;
            case 1497168509:
                if (str.equals("MRKT_ARTIST_AUDIENCE_CITIES")) {
                    return G1("MRKT_ARTIST_AUDIENCE_CITIES", "mrkt/artist/audience/cities", 1046, "mrkt");
                }
                return null;
            case 1503207053:
                if (str.equals("CONTEXTDISPATCH_OFFLINE")) {
                    return G1("CONTEXTDISPATCH_OFFLINE", "contextdispatch/offline", 414, "contextdispatch");
                }
                return null;
            case 1507349277:
                if (str.equals("SOCIAL_LISTENING_JOINCONFIRMATIONDIALOG")) {
                    return G1("SOCIAL_LISTENING_JOINCONFIRMATIONDIALOG", "social-listening/joinconfirmationdialog", 1908, "social-listening");
                }
                return null;
            case 1527640237:
                if (str.equals("KID_ACCOUNT_CREATION_SUBMIT")) {
                    return m2();
                }
                return null;
            case 1568726253:
                if (str.equals("PLAYLIST_PARTICIPANTS")) {
                    return K3();
                }
                return null;
            case 1574680413:
                if (str.equals("WEAR_SECONDARY_CONTROLS_PLAYBACK_SPEED_SELECTOR")) {
                    return G1("WEAR_SECONDARY_CONTROLS_PLAYBACK_SPEED_SELECTOR", "wear/secondary_controls/playback_speed_selector", 2157, "wear");
                }
                return null;
            case 1580655405:
                if (str.equals("ARTIST_UNMAPPED_MUSIC_VIDEOS")) {
                    return G1("ARTIST_UNMAPPED_MUSIC_VIDEOS", "artist/unmapped-music-videos", 178, "artist");
                }
                return null;
            case 1598694253:
                if (str.equals("LISTENINGPARTY_MAIN_ROOM")) {
                    return G1("LISTENINGPARTY_MAIN_ROOM", "listeningparty/main-room", 922, "listeningparty");
                }
                return null;
            case 1621215085:
                if (str.equals("INAPPUSERFEEDBACK_JOURNEY")) {
                    return j2();
                }
                return null;
            case 1636782637:
                if (str.equals("DISCOVERNOW")) {
                    return G1("DISCOVERNOW", "discovernow", 493, "discovernow");
                }
                return null;
            case 1692655533:
                if (str.equals("PAGE_MATCH_LANDING")) {
                    return g3();
                }
                return null;
            case 1808937693:
                if (str.equals("WEAR_SLEEP_TIMER")) {
                    return G1("WEAR_SLEEP_TIMER", "wear/sleep_timer", 2167, "wear");
                }
                return null;
            case 1832884461:
                if (str.equals("EMAIL_EDIT")) {
                    return G1("EMAIL_EDIT", "email/edit", 506, "email");
                }
                return null;
            case 1897566509:
                if (str.equals("THESTAGE")) {
                    return G1("THESTAGE", "thestage", 2042, "thestage");
                }
                return null;
            case 1929904461:
                if (str.equals("PODCAST_PREVIEW")) {
                    return G1("PODCAST_PREVIEW", "podcast/preview", 1492, "podcast");
                }
                return null;
            case 1947429469:
                if (str.equals("TV_ENTITY_DESCRIPTION")) {
                    return G1("TV_ENTITY_DESCRIPTION", "tv/entity-description", 2052, "tv");
                }
                return null;
            case 1949703693:
                if (str.equals("MRKT_ARTIST_PROFILE_FANS_ALSO_LIKE")) {
                    return G1("MRKT_ARTIST_PROFILE_FANS_ALSO_LIKE", "mrkt/artist/profile/fans-also-like", 1126, "mrkt");
                }
                return null;
            case 1963373645:
                if (str.equals("CAMPAIGNS_DATASTORIES")) {
                    return G1("CAMPAIGNS_DATASTORIES", "campaigns/datastories", 270, "campaigns");
                }
                return null;
            case 2115486717:
                if (str.equals("HOME_DRILLDOWN")) {
                    return G1("HOME_DRILLDOWN", "home/drilldown", 799, "home");
                }
                return null;
            case 2122589069:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_LISTENLATER")) {
                    return G1("COLLECTION_PODCASTS_EPISODES_LISTENLATER", "collection/podcasts/episodes/listenlater", 358, "collection");
                }
                return null;
            case 2132602813:
                if (str.equals("GRADUATION_REQUESTED")) {
                    return G1("GRADUATION_REQUESTED", "graduation/requested", 771, "graduation");
                }
                return null;
            case 2145415421:
                if (str.equals("ADSTUDIO_DASHBOARD_AD_DRAFTS")) {
                    return G1("ADSTUDIO_DASHBOARD_AD_DRAFTS", "adstudio/dashboard/ad-drafts", 76, "adstudio");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 T() {
        return G1("AUDIOBOOK_CHAPTERSBOTTOMSHEET", "audiobook/chaptersbottomsheet", 197, "audiobook");
    }

    public static p6r0 T0() {
        return G1("CONNECT_DEVICEPICKER", "connect/devicepicker", 395, "connect");
    }

    public static p6r0 T1() {
        return G1("HOME_PODCASTS", "home/podcasts", 803, "home");
    }

    public static p6r0 T2() {
        return G1("MULTI_USER_PLAN_VERIFICATION_VERIFY", "multi-user-plan-verification/verify", 1340, "multi-user-plan-verification");
    }

    public static p6r0 T3() {
        return G1("PODCAST_SPONSORS", "podcast/sponsors", 1506, "podcast");
    }

    public static p6r0 T4() {
        return G1("SCANNABLES_SCANNER", "scannables/scanner", 1777, "scannables");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 T5(String str) {
        switch (str.hashCode()) {
            case -2080009970:
                if (str.equals("MRKT_ARTIST_LISTENING_PARTY_EDIT")) {
                    return G1("MRKT_ARTIST_LISTENING_PARTY_EDIT", "mrkt/artist/listening-party/edit", 1088, "mrkt");
                }
                return null;
            case -2060669506:
                if (str.equals("OFFLINE_USER_MIX_ENTITY")) {
                    return G1("OFFLINE_USER_MIX_ENTITY", "offline-user-mix/entity", 1376, "offline-user-mix");
                }
                return null;
            case -2038258722:
                if (str.equals("VOTING_FAQ")) {
                    return G1("VOTING_FAQ", "voting/faq", 2085, "voting");
                }
                return null;
            case -2037767298:
                if (str.equals("CONTRIBUTION_NOTES_DETAIL")) {
                    return e1();
                }
                return null;
            case -2036299890:
                if (str.equals("SUPPORT_CATEGORY")) {
                    return G1("SUPPORT_CATEGORY", "support/category", 2032, "support");
                }
                return null;
            case -1924631586:
                if (str.equals("PARENTAL_CONTROL_LOGIN_DIFFERENT_DEVICE")) {
                    return n3();
                }
                return null;
            case -1921881922:
                if (str.equals("CHALLENGE_TOTP_BACKUP_CODE")) {
                    return G1("CHALLENGE_TOTP_BACKUP_CODE", "challenge/totp-backup-code", 300, "challenge");
                }
                return null;
            case -1903644626:
                if (str.equals("WEAR_SETTINGS_LICENSES")) {
                    return G1("WEAR_SETTINGS_LICENSES", "wear/settings/licenses", 2165, "wear");
                }
                return null;
            case -1897492178:
                if (str.equals("CONTEXTMENU_SHOW")) {
                    return c1();
                }
                return null;
            case -1833795522:
                if (str.equals("WRAPPED_RECEIPT")) {
                    return G1("WRAPPED_RECEIPT", "wrapped/receipt", 2182, "wrapped");
                }
                return null;
            case -1814711650:
                if (str.equals("TOPBAR")) {
                    return G1("TOPBAR", "topbar", 2043, "topbar");
                }
                return null;
            case -1793331666:
                if (str.equals("MRKT_FRONTDOOR_ARTIST_PROGRAMS")) {
                    return G1("MRKT_FRONTDOOR_ARTIST_PROGRAMS", "mrkt/frontdoor/artist-programs", 1238, "mrkt");
                }
                return null;
            case -1753879282:
                if (str.equals("SETTINGS_APPS")) {
                    return G1("SETTINGS_APPS", "settings/apps", 1808, "settings");
                }
                return null;
            case -1750402338:
                if (str.equals("SIGNUP_PARENTALCONSENT")) {
                    return G1("SIGNUP_PARENTALCONSENT", "signup/parentalconsent", 1892, "signup");
                }
                return null;
            case -1736922018:
                if (str.equals("GOLDENPATH_JACKWEBB")) {
                    return G1("GOLDENPATH_JACKWEBB", "goldenpath/jackwebb", 660, "goldenpath");
                }
                return null;
            case -1727573746:
                if (str.equals("TV_DIALOG_PREMIUM_ONLY")) {
                    return G1("TV_DIALOG_PREMIUM_ONLY", "tv/dialog/premium-only", 2051, "tv");
                }
                return null;
            case -1716140162:
                if (str.equals("MRKT_WAITING_ROOM_STATS")) {
                    return G1("MRKT_WAITING_ROOM_STATS", "mrkt/waiting-room/stats", 1335, "mrkt");
                }
                return null;
            case -1683343458:
                if (str.equals("PUFFIN_SETUP_UNSUPPORTED")) {
                    return G1("PUFFIN_SETUP_UNSUPPORTED", "puffin/setup-unsupported", 1602, "puffin");
                }
                return null;
            case -1485393298:
                if (str.equals("SUPPORT_SITE_ARTICLE")) {
                    return G1("SUPPORT_SITE_ARTICLE", "support-site/article", 2019, "support-site");
                }
                return null;
            case -1479372450:
                if (str.equals("COLLECTION_SAVEDEPISODES")) {
                    return G1("COLLECTION_SAVEDEPISODES", "collection/savedepisodes", 366, "collection");
                }
                return null;
            case -1463302082:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIENCE_LOCATION")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUDIENCE_LOCATION", "spotify-for-authors/audience/location", 1936, "spotify-for-authors");
                }
                return null;
            case -1457106402:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_REVIEW_AND_SUBMIT")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_REVIEW_AND_SUBMIT", "adstudio/duplicate-ad-set-with-ads/review-and-submit", 90, "adstudio");
                }
                return null;
            case -1304999026:
                if (str.equals("BOOTCAMP_QUADRAPHONICS_NATTOP50")) {
                    return G1("BOOTCAMP_QUADRAPHONICS_NATTOP50", "bootcamp/quadraphonics/natTop50", 243, "bootcamp");
                }
                return null;
            case -1290360978:
                if (str.equals("SETTINGS_SIRIINTENTS")) {
                    return G1("SETTINGS_SIRIINTENTS", "settings/siriintents", 1845, "settings");
                }
                return null;
            case -1267526322:
                if (str.equals("WATCHAPP_ARTIST_ENTITY")) {
                    return G1("WATCHAPP_ARTIST_ENTITY", "watchapp/artist-entity", 2093, "watchapp");
                }
                return null;
            case -1261741282:
                if (str.equals("REMOTEDOWNLOADS_ONBOARDING_EDUCATION")) {
                    return S4();
                }
                return null;
            case -1256220002:
                if (str.equals("COLLECTION")) {
                    return G1("COLLECTION", "collection", 346, "collection");
                }
                return null;
            case -1210040418:
                if (str.equals("CHAT_INTERCEPTOR")) {
                    return w0();
                }
                return null;
            case -1196856658:
                if (str.equals("PROACTIVE_PLATFORMS_LOCK_SCREEN_WIDGET")) {
                    return G1("PROACTIVE_PLATFORMS_LOCK_SCREEN_WIDGET", "proactive-platforms/lock-screen-widget", 1564, "proactive-platforms");
                }
                return null;
            case -1195747378:
                if (str.equals("AUDIOBOOK_CHAPTERSBOTTOMSHEET")) {
                    return T();
                }
                return null;
            case -1152525730:
                if (str.equals("SETTINGS_NOTIFICATIONS_IMPORTANT_PUBLIC_NOTICE")) {
                    return G1("SETTINGS_NOTIFICATIONS_IMPORTANT_PUBLIC_NOTICE", "settings/notifications/important-public-notice", 1838, "settings");
                }
                return null;
            case -1136182034:
                if (str.equals("GOLDENPATH_CLUNA")) {
                    return G1("GOLDENPATH_CLUNA", "goldenpath/cluna", 629, "goldenpath");
                }
                return null;
            case -1130054962:
                if (str.equals("GOLDENPATH_JAKEP")) {
                    return G1("GOLDENPATH_JAKEP", "goldenpath/jakep", 661, "goldenpath");
                }
                return null;
            case -1127277746:
                if (str.equals("GOLDENPATH_MARCD")) {
                    return G1("GOLDENPATH_MARCD", "goldenpath/marcd", 690, "goldenpath");
                }
                return null;
            case -1124076178:
                if (str.equals("CONCERTS_CONCERT_WEBVIEW")) {
                    return G1("CONCERTS_CONCERT_WEBVIEW", "concerts/concert/webview", 390, "concerts");
                }
                return null;
            case -1118731378:
                if (str.equals("GOLDENPATH_VINIM")) {
                    return G1("GOLDENPATH_VINIM", "goldenpath/vinim", 757, "goldenpath");
                }
                return null;
            case -1096286514:
                if (str.equals("SEARCH_FILTERED")) {
                    return G1("SEARCH_FILTERED", "search/filtered", 1786, "search");
                }
                return null;
            case -1077213394:
                if (str.equals("JAM_STARTJAMWITHUSER")) {
                    return G1("JAM_STARTJAMWITHUSER", "jam/startjamwithuser", 872, "jam");
                }
                return null;
            case -1067686402:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_REVIEW")) {
                    return G1("MRKT_BULK_CAMPAIGNS_UPLOAD_REVIEW", "mrkt/bulk-campaigns/upload/review", 1193, "mrkt");
                }
                return null;
            case -1060156450:
                if (str.equals("MANAGE_INVITES_PAGE")) {
                    return G1("MANAGE_INVITES_PAGE", "manage/invites-page", 996, "manage");
                }
                return null;
            case -1048619410:
                if (str.equals("SIGNUP_ACCOUNTALREADYEXISTS")) {
                    return l5();
                }
                return null;
            case -1025106258:
                if (str.equals("FRIENDSHOME_ENTITY")) {
                    return G1("FRIENDSHOME_ENTITY", "friendshome/entity", 595, "friendshome");
                }
                return null;
            case -995299074:
                if (str.equals("DOWNLOAD_OVER_CELLULAR")) {
                    return t1();
                }
                return null;
            case -960172450:
                if (str.equals("MRKT_ARTIST_SONG_PLAYLISTS")) {
                    return G1("MRKT_ARTIST_SONG_PLAYLISTS", "mrkt/artist/song/playlists", 1146, "mrkt");
                }
                return null;
            case -950689250:
                if (str.equals("WATCHAPP_ESDK_TOOLS")) {
                    return G1("WATCHAPP_ESDK_TOOLS", "watchapp/esdk-tools", 2106, "watchapp");
                }
                return null;
            case -950337010:
                if (str.equals("S4P_EMAIL_VERIFICATION")) {
                    return G1("S4P_EMAIL_VERIFICATION", "s4p/email-verification", 1705, "s4p");
                }
                return null;
            case -923103890:
                if (str.equals("GOLDENPATH_AHMEDB")) {
                    return G1("GOLDENPATH_AHMEDB", "goldenpath/ahmedb", 614, "goldenpath");
                }
                return null;
            case -900660834:
                if (str.equals("ARTIST_ARTIST_LIST")) {
                    return G1("ARTIST_ARTIST_LIST", "artist/artist-list", 160, "artist");
                }
                return null;
            case -847101650:
                if (str.equals("BACKGROUND")) {
                    return a0();
                }
                return null;
            case -842483826:
                if (str.equals("LOGIN_DIALOG_GOOGLEERROR")) {
                    return G1("LOGIN_DIALOG_GOOGLEERROR", "login/dialog/googleerror", 948, "login");
                }
                return null;
            case -839787442:
                if (str.equals("SCANNABLES_IMAGEPICKERCONTROLLER")) {
                    return G1("SCANNABLES_IMAGEPICKERCONTROLLER", "scannables/imagepickercontroller", 1776, "scannables");
                }
                return null;
            case -802241570:
                if (str.equals("HIFI_SETTINGS_SHEET_QUALITY")) {
                    return G1("HIFI_SETTINGS_SHEET_QUALITY", "hifi/settings-sheet/quality", 792, "hifi");
                }
                return null;
            case -800707618:
                if (str.equals("MAGPIE_ASSISTANCE")) {
                    return F2();
                }
                return null;
            case -762579202:
                if (str.equals("REINVENTFREE_DOWNLOAD_UPSELL")) {
                    return H4();
                }
                return null;
            case -758213506:
                if (str.equals("GOLDENPATH_SYDNEYNICOLEACHINGER")) {
                    return G1("GOLDENPATH_SYDNEYNICOLEACHINGER", "goldenpath/sydneynicoleachinger", 750, "goldenpath");
                }
                return null;
            case -693393554:
                if (str.equals("WEAR_SETTINGS_LOGOUT_CONFIRMATION")) {
                    return G1("WEAR_SETTINGS_LOGOUT_CONFIRMATION", "wear/settings/logout_confirmation", 2166, "wear");
                }
                return null;
            case -640278130:
                if (str.equals("FREETIER_TASTEONBOARDING_ARTISTPICKERCONTAINER")) {
                    return G1("FREETIER_TASTEONBOARDING_ARTISTPICKERCONTAINER", "freetier/tasteonboarding/artistpickercontainer", 584, "freetier");
                }
                return null;
            case -625031538:
                if (str.equals("CONNECT_OVERLAY_SWITCHDEVICE")) {
                    return G1("CONNECT_OVERLAY_SWITCHDEVICE", "connect/overlay/switchdevice", 400, "connect");
                }
                return null;
            case -619664322:
                if (str.equals("ARTIST_DISCOVERED_ON")) {
                    return G1("ARTIST_DISCOVERED_ON", "artist/discovered-on", 167, "artist");
                }
                return null;
            case -604056402:
                if (str.equals("SEARCH_MUSIC")) {
                    return G1("SEARCH_MUSIC", "search/music", 1792, "search");
                }
                return null;
            case -597811522:
                if (str.equals("READALONG_LANGUAGEPICKER")) {
                    return G1("READALONG_LANGUAGEPICKER", "readalong/languagepicker", 1628, "readalong");
                }
                return null;
            case -516416866:
                if (str.equals("UNBOXING_MAIN_HUB")) {
                    return G1("UNBOXING_MAIN_HUB", "unboxing/main-hub", 2062, "unboxing");
                }
                return null;
            case -509317858:
                if (str.equals("MRKT_SUBMISSION_CREATE")) {
                    return G1("MRKT_SUBMISSION_CREATE", "mrkt/submission/create", 1303, "mrkt");
                }
                return null;
            case -499552738:
                if (str.equals("CONNECT_OVERLAY_VOLUME")) {
                    return G1("CONNECT_OVERLAY_VOLUME", "connect/overlay/volume", 401, "connect");
                }
                return null;
            case -497280482:
                if (str.equals("GOLDENPATH_PDOZSA")) {
                    return G1("GOLDENPATH_PDOZSA", "goldenpath/pdozsa", 729, "goldenpath");
                }
                return null;
            case -491553490:
                if (str.equals("DATASAVERMODE")) {
                    return G1("DATASAVERMODE", "datasavermode", 470, "datasavermode");
                }
                return null;
            case -474827746:
                if (str.equals("GOLDENPATH_MSIMSEK")) {
                    return G1("GOLDENPATH_MSIMSEK", "goldenpath/msimsek", 713, "goldenpath");
                }
                return null;
            case -450494978:
                if (str.equals("SEARCH_PODCASTS_AND_EPISODES_VIDEOS")) {
                    return G1("SEARCH_PODCASTS_AND_EPISODES_VIDEOS", "search/podcasts_and_episodes/videos", 1796, "search");
                }
                return null;
            case -440065394:
                if (str.equals("BUNDLING_PLACEBO_WEBVIEW")) {
                    return G1("BUNDLING_PLACEBO_WEBVIEW", "bundling/placebo/webview", 258, "bundling");
                }
                return null;
            case -436986850:
                if (str.equals("CATEGORIES_ONBOARDING")) {
                    return G1("CATEGORIES_ONBOARDING", "categories/onboarding", 287, "categories");
                }
                return null;
            case -385449458:
                if (str.equals("COMMENTS_SETTINGS")) {
                    return G1("COMMENTS_SETTINGS", "comments/settings", 381, "comments");
                }
                return null;
            case -378376274:
                if (str.equals("DIALOG_COLLECTION_INSUFFICIENTSTORAGE")) {
                    return G1("DIALOG_COLLECTION_INSUFFICIENTSTORAGE", "dialog/collection/insufficientstorage", 474, "dialog");
                }
                return null;
            case -332628610:
                if (str.equals("UPDATE_DIALOG")) {
                    return G1("UPDATE_DIALOG", "update-dialog", 2069, "update-dialog");
                }
                return null;
            case -329811282:
                if (str.equals("FREE_TIER_OTHER_USER_PROFILE")) {
                    return G1("FREE_TIER_OTHER_USER_PROFILE", "free-tier-other-user-profile", 573, "free-tier-other-user-profile");
                }
                return null;
            case -263243410:
                if (str.equals("RESETPASSWORD_SUCCESS")) {
                    return G1("RESETPASSWORD_SUCCESS", "resetpassword/success", 1657, "resetpassword");
                }
                return null;
            case -219279058:
                if (str.equals("MRKT_BILLING_OVERVIEW")) {
                    return G1("MRKT_BILLING_OVERVIEW", "mrkt/billing/overview", 1179, "mrkt");
                }
                return null;
            case -181957458:
                if (str.equals("MRKT_FRONTDOOR_VIDEO_AND_VISUALS")) {
                    return G1("MRKT_FRONTDOOR_VIDEO_AND_VISUALS", "mrkt/frontdoor/video-and-visuals", 1275, "mrkt");
                }
                return null;
            case -180893906:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_CUSTOMIZE")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_CUSTOMIZE", "mrkt/artist/campaigns/marquee-and-showcase/create/flights/customize", 1068, "mrkt");
                }
                return null;
            case -157203602:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_CONTENT")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_CONTENT", "spotify-for-authors/dvn-creation/content", 1942, "spotify-for-authors");
                }
                return null;
            case -95757538:
                if (str.equals("GOLDENPATH_PABLOMARTIN")) {
                    return G1("GOLDENPATH_PABLOMARTIN", "goldenpath/pablomartin", 726, "goldenpath");
                }
                return null;
            case -65512530:
                if (str.equals("HOMETHING_ACTIVATION_WIFI")) {
                    return G1("HOMETHING_ACTIVATION_WIFI", "homething/activation/wifi", 825, "homething");
                }
                return null;
            case -59534914:
                if (str.equals("SONG_DNA_UNAVAILABLE")) {
                    return s5();
                }
                return null;
            case -57431874:
                if (str.equals("VOTING_RESULTS")) {
                    return G1("VOTING_RESULTS", "voting/results", 2086, "voting");
                }
                return null;
            case 20271214:
                if (str.equals("DIALOG_MARKETOPPORTUNITIES_SHOWCASE")) {
                    return G1("DIALOG_MARKETOPPORTUNITIES_SHOWCASE", "dialog/marketopportunities/showcase", 485, "dialog");
                }
                return null;
            case 62296830:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD", "adstudio/add-to-existing-campaign/ad", 44, "adstudio");
                }
                return null;
            case 169677582:
                if (str.equals("WWW_ACCOUNT_PAGES_ORDER_HISTORY")) {
                    return G1("WWW_ACCOUNT_PAGES_ORDER_HISTORY", "www-account-pages/order-history", 2219, "www-account-pages");
                }
                return null;
            case 217583374:
                if (str.equals("CHARTS_ALBUMS")) {
                    return G1("CHARTS_ALBUMS", "charts/albums", 305, "charts");
                }
                return null;
            case 253353694:
                if (str.equals("PERMISSIONS_MIC_REQUEST_FULLSCREEN")) {
                    return G1("PERMISSIONS_MIC_REQUEST_FULLSCREEN", "permissions/mic/request/fullscreen", 1433, "permissions");
                }
                return null;
            case 274408878:
                if (str.equals("VOICE_LISTENING")) {
                    return G1("VOICE_LISTENING", "voice/listening", 2081, "voice");
                }
                return null;
            case 277480398:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS_DARK")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS_DARK", "mrkt/debug/hubs/component-reference/buttons-dark", 1204, "mrkt");
                }
                return null;
            case 346764590:
                if (str.equals("SPOTIFY_FOR_AUTHORS_ORGANIZATIONS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_ORGANIZATIONS", "spotify-for-authors/organizations", 1952, "spotify-for-authors");
                }
                return null;
            case 445641566:
                if (str.equals("CARS_ANDROIDAUTO")) {
                    return G1("CARS_ANDROIDAUTO", "cars/androidauto", 278, "cars");
                }
                return null;
            case 450207646:
                if (str.equals("RUNNING_CATEGORY")) {
                    return G1("RUNNING_CATEGORY", "running/category", 1659, "running");
                }
                return null;
            case 465155822:
                if (str.equals("LOGIN_MULTIUSER")) {
                    return G1("LOGIN_MULTIUSER", "login/multiuser", 957, "login");
                }
                return null;
            case 472294670:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_OVERVIEW")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_OVERVIEW", "mrkt/artist/campaigns/marquee-and-showcase/create/flights/overview", 1069, "mrkt");
                }
                return null;
            case 476936238:
                if (str.equals("ACCOUNTSWITCHING_PICKACCOUNT")) {
                    return G1("ACCOUNTSWITCHING_PICKACCOUNT", "accountswitching/pickaccount", 6, "accountswitching");
                }
                return null;
            case 498022910:
                if (str.equals("BROWSE_DISCOVER")) {
                    return G1("BROWSE_DISCOVER", "browse/discover", 249, "browse");
                }
                return null;
            case 578572302:
                if (str.equals("S4P_CREATION_RECORDER")) {
                    return G1("S4P_CREATION_RECORDER", "s4p/creation/recorder", 1696, "s4p");
                }
                return null;
            case 597356126:
                if (str.equals("YOURLIBRARY_FILTERS_SETTINGS")) {
                    return G1("YOURLIBRARY_FILTERS_SETTINGS", "yourlibrary/filters-settings", 2264, "yourlibrary");
                }
                return null;
            case 983191134:
                if (str.equals("CHALLENGE_CAPTCHA")) {
                    return G1("CHALLENGE_CAPTCHA", "challenge/captcha", 291, "challenge");
                }
                return null;
            case 998630878:
                if (str.equals("MRKT_ARTIST_MUSIC")) {
                    return G1("MRKT_ARTIST_MUSIC", "mrkt/artist/music", 1092, "mrkt");
                }
                return null;
            case 999959342:
                if (str.equals("DISCOVERYFEED")) {
                    return G1("DISCOVERYFEED", "discoveryfeed", 497, "discoveryfeed");
                }
                return null;
            case 1017013054:
                if (str.equals("SETTINGS_VOICE_ASSISTANTS")) {
                    return G1("SETTINGS_VOICE_ASSISTANTS", "settings/voice-assistants", 1851, "settings");
                }
                return null;
            case 1052105998:
                if (str.equals("GOLDENPATH_JOSEPHN")) {
                    return G1("GOLDENPATH_JOSEPHN", "goldenpath/josephn", 672, "goldenpath");
                }
                return null;
            case 1054789454:
                if (str.equals("MRKT_FRONTDOOR_SONGWRITING")) {
                    return G1("MRKT_FRONTDOOR_SONGWRITING", "mrkt/frontdoor/songwriting", 1270, "mrkt");
                }
                return null;
            case 1060339518:
                if (str.equals("PREMIUMHUB")) {
                    return G1("PREMIUMHUB", "premiumhub", 1558, "premiumhub");
                }
                return null;
            case 1135470878:
                if (str.equals("PAGE_MATCH_ERROR")) {
                    return G1("PAGE_MATCH_ERROR", "page-match/error", 1391, "page-match");
                }
                return null;
            case 1161532750:
                if (str.equals("VOICE_ALTERNATIVESEARCHRESULTS")) {
                    return G1("VOICE_ALTERNATIVESEARCHRESULTS", "voice/alternativesearchresults", 2080, "voice");
                }
                return null;
            case 1229803214:
                if (str.equals("WATCHAPP_REMOTE_CONFIG")) {
                    return G1("WATCHAPP_REMOTE_CONFIG", "watchapp/remote-config", 2119, "watchapp");
                }
                return null;
            case 1290767934:
                if (str.equals("CONTEXTMENU_ALBUM")) {
                    return G1("CONTEXTMENU_ALBUM", "contextmenu/album", 416, "contextmenu");
                }
                return null;
            case 1301656462:
                if (str.equals("CONTEXTMENU_MERCH")) {
                    return G1("CONTEXTMENU_MERCH", "contextmenu/merch", 433, "contextmenu");
                }
                return null;
            case 1307271086:
                if (str.equals("CONTEXTMENU_SHARE")) {
                    return G1("CONTEXTMENU_SHARE", "contextmenu/share", 439, "contextmenu");
                }
                return null;
            case 1361961758:
                if (str.equals("PARENTAL_CONTROL_LOGIN_CURRENT_DEVICE")) {
                    return m3();
                }
                return null;
            case 1365055902:
                if (str.equals("WEAR_SETTINGS_DOWNLOAD_SETTINGS")) {
                    return G1("WEAR_SETTINGS_DOWNLOAD_SETTINGS", "wear/settings/download_settings", 2164, "wear");
                }
                return null;
            case 1369408254:
                if (str.equals("ON_DEMAND_TRIAL_OPT_IN_UPSELL")) {
                    return e3();
                }
                return null;
            case 1388841198:
                if (str.equals("MRKT_ARTIST_NMS_CREATE")) {
                    return G1("MRKT_ARTIST_NMS_CREATE", "mrkt/artist/nms/create", 1103, "mrkt");
                }
                return null;
            case 1405488526:
                if (str.equals("OVERLAY_DATASAVERPLAYLIST")) {
                    return G1("OVERLAY_DATASAVERPLAYLIST", "overlay/datasaverplaylist", 1387, "overlay");
                }
                return null;
            case 1413465726:
                if (str.equals("PAYMENT_CALLBACK")) {
                    return G1("PAYMENT_CALLBACK", "payment/callback", 1425, "payment");
                }
                return null;
            case 1414520078:
                if (str.equals("CARS_MYSPIN")) {
                    return G1("CARS_MYSPIN", "cars/myspin", 285, "cars");
                }
                return null;
            case 1416488494:
                if (str.equals("GOLDENPATH_NATALIAA")) {
                    return G1("GOLDENPATH_NATALIAA", "goldenpath/nataliaa", 717, "goldenpath");
                }
                return null;
            case 1441019630:
                if (str.equals("YOURSPOTIFY_FORYOU")) {
                    return G1("YOURSPOTIFY_FORYOU", "yourspotify/foryou", 2277, "yourspotify");
                }
                return null;
            case 1484988350:
                if (str.equals("SKIP_LIMIT_PIVOT")) {
                    return G1("SKIP_LIMIT_PIVOT", "skip-limit-pivot", 1898, "skip-limit-pivot");
                }
                return null;
            case 1491106894:
                if (str.equals("WATCHAPP_PODCAST_SPEED_PICKER")) {
                    return G1("WATCHAPP_PODCAST_SPEED_PICKER", "watchapp/podcast-speed-picker", 2117, "watchapp");
                }
                return null;
            case 1494600158:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY")) {
                    return G1("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY", "mrkt/dm-managed-service/eligibility", 1232, "mrkt");
                }
                return null;
            case 1528325726:
                if (str.equals("WATCHAPP_LOGGED_OUT")) {
                    return G1("WATCHAPP_LOGGED_OUT", "watchapp/logged-out", 2111, "watchapp");
                }
                return null;
            case 1529010734:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_COUNTDOWN")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_COUNTDOWN", "mrkt/artist/campaigns/countdown", 1059, "mrkt");
                }
                return null;
            case 1534884206:
                if (str.equals("MRKT_FRONTDOOR_ROYALTIES_GUIDE")) {
                    return G1("MRKT_FRONTDOOR_ROYALTIES_GUIDE", "mrkt/frontdoor/royalties-guide", 1268, "mrkt");
                }
                return null;
            case 1540914942:
                if (str.equals("UBI_DEBUG_MONITOR_RAWDATA")) {
                    return G1("UBI_DEBUG_MONITOR_RAWDATA", "ubi/debug-monitor/rawdata", 2056, "ubi");
                }
                return null;
            case 1550221710:
                if (str.equals("MRKT_ARTIST_MUSIC_KALLAX")) {
                    return G1("MRKT_ARTIST_MUSIC_KALLAX", "mrkt/artist/music/kallax", 1094, "mrkt");
                }
                return null;
            case 1614792430:
                if (str.equals("GOLDENPATH_ANGELOM")) {
                    return G1("GOLDENPATH_ANGELOM", "goldenpath/angelom", 619, "goldenpath");
                }
                return null;
            case 1636808910:
                if (str.equals("BLEND_DATA_STORY")) {
                    return G1("BLEND_DATA_STORY", "blend/data-story", 215, "blend");
                }
                return null;
            case 1651524542:
                if (str.equals("REINVENTFREE_TRACK_PREVIEW_UPSELL")) {
                    return G1("REINVENTFREE_TRACK_PREVIEW_UPSELL", "reinventfree-track-preview-upsell", 1646, "reinventfree-track-preview-upsell");
                }
                return null;
            case 1707105662:
                if (str.equals("WATCHFEEDPIVOTS")) {
                    return i6();
                }
                return null;
            case 1744471118:
                if (str.equals("WATCHAPP_LIBRARY")) {
                    return G1("WATCHAPP_LIBRARY", "watchapp/library", 2109, "watchapp");
                }
                return null;
            case 1756099246:
                if (str.equals("PODCAST_STORYLINE")) {
                    return G1("PODCAST_STORYLINE", "podcast/storyline", 1507, "podcast");
                }
                return null;
            case 1770791918:
                if (str.equals("WWW_ACCOUNT_PAGES_OVERVIEW")) {
                    return G1("WWW_ACCOUNT_PAGES_OVERVIEW", "www-account-pages/overview", 2220, "www-account-pages");
                }
                return null;
            case 1832330590:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_PITCH")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_PITCH", "mrkt/artist/video/music-videos/pitch", 1162, "mrkt");
                }
                return null;
            case 1887092318:
                if (str.equals("JAM_LISTENALONGPARTICIPANTONBOARDINGSHEET")) {
                    return G1("JAM_LISTENALONGPARTICIPANTONBOARDINGSHEET", "jam/listenalongparticipantonboardingsheet", 863, "jam");
                }
                return null;
            case 1899432894:
                if (str.equals("WATCHAPP_DOWNLOADS")) {
                    return G1("WATCHAPP_DOWNLOADS", "watchapp/downloads", 2098, "watchapp");
                }
                return null;
            case 1901205950:
                if (str.equals("STUDIO_TERMS")) {
                    return G1("STUDIO_TERMS", "studio/terms", 1996, "studio");
                }
                return null;
            case 1906317150:
                if (str.equals("MRKT_CHARTS_VIEW")) {
                    return G1("MRKT_CHARTS_VIEW", "mrkt/charts/view", 1200, "mrkt");
                }
                return null;
            case 1909321118:
                if (str.equals("IMAGERECS")) {
                    return G1("IMAGERECS", "imagerecs", 829, "imagerecs");
                }
                return null;
            case 1951936334:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_PLAN_DETAILS")) {
                    return G1("PREMIUM_ACCOUNT_MANAGEMENT_PLAN_DETAILS", "premium-account-management/plan-details", 1546, "premium-account-management");
                }
                return null;
            case 2032639006:
                if (str.equals("PUSHOPTIN")) {
                    return G1("PUSHOPTIN", "pushoptin", 1604, "pushoptin");
                }
                return null;
            case 2050846574:
                if (str.equals("CONTEXTMENU")) {
                    return d1();
                }
                return null;
            case 2093758414:
                if (str.equals("PROFILE_EPISODES")) {
                    return G1("PROFILE_EPISODES", "profile/episodes", 1579, "profile");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 U() {
        return G1("AUDIOBOOK_CONSIDERATION", "audiobook/consideration", 198, "audiobook");
    }

    public static p6r0 U0() {
        return G1("CONSUMPTION", "consumption", 410, "consumption");
    }

    public static p6r0 U1() {
        return G1("HOME_PODCASTS_FOLLOWING", "home/podcasts-following", 805, "home");
    }

    public static p6r0 U2() {
        return G1("MUTUAL_FOLLOW_SEND_MESSAGE_SHEET", "mutual-follow-send-message-sheet", 1343, "mutual-follow-send-message-sheet");
    }

    public static p6r0 U3() {
        return G1("PODCASTCHARTS", "podcastcharts", 1509, "podcastcharts");
    }

    public static p6r0 U4() {
        return G1("SEARCH", "search", 1778, "search");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 U5(String str) {
        switch (str.hashCode()) {
            case -2133545198:
                if (str.equals("CHAT_MEMBERS")) {
                    return z0();
                }
                return null;
            case -1975173678:
                if (str.equals("KID_ACCOUNT_CREATION_BIRTHDAY")) {
                    return G1("KID_ACCOUNT_CREATION_BIRTHDAY", "kid-account-creation/birthday", 875, "kid-account-creation");
                }
                return null;
            case -1968552142:
                if (str.equals("SNOOZE_RECOMMENDATION")) {
                    return r5();
                }
                return null;
            case -1963798942:
                if (str.equals("OPEN_ACCESS_PREVIEW")) {
                    return G1("OPEN_ACCESS_PREVIEW", "open-access-preview", 1382, "open-access-preview");
                }
                return null;
            case -1905776142:
                if (str.equals("AUDIOBOOK_HYDE")) {
                    return G1("AUDIOBOOK_HYDE", "audiobook/hyde", 202, "audiobook");
                }
                return null;
            case -1894040302:
                if (str.equals("SOCIAL_LISTENING_EDUCATION")) {
                    return G1("SOCIAL_LISTENING_EDUCATION", "social-listening/education", 1904, "social-listening");
                }
                return null;
            case -1886072142:
                if (str.equals("FREE_TIER_LIKES")) {
                    return G1("FREE_TIER_LIKES", "free-tier-likes", 571, "free-tier-likes");
                }
                return null;
            case -1874678206:
                if (str.equals("CHAT_RECEIPTS")) {
                    return G1("CHAT_RECEIPTS", "chat/receipts", 329, "chat");
                }
                return null;
            case -1815863822:
                if (str.equals("SUPERBIRD_SETUP_CONTROLOTHERMEDIADECLINED")) {
                    return G1("SUPERBIRD_SETUP_CONTROLOTHERMEDIADECLINED", "superbird/setup/controlothermediadeclined", 2007, "superbird");
                }
                return null;
            case -1801318718:
                if (str.equals("YOURLIBRARY_IMPORT_MUSIC")) {
                    return G1("YOURLIBRARY_IMPORT_MUSIC", "yourlibrary/import-music", 2266, "yourlibrary");
                }
                return null;
            case -1758899470:
                if (str.equals("ADSTUDIO_SBL_EDIT")) {
                    return G1("ADSTUDIO_SBL_EDIT", "adstudio/sbl/edit", 113, "adstudio");
                }
                return null;
            case -1710023934:
                if (str.equals("S4P_CREATION_ENTRY")) {
                    return G1("S4P_CREATION_ENTRY", "s4p/creation/entry", 1694, "s4p");
                }
                return null;
            case -1708475614:
                if (str.equals("BLUEJAY_NOTIFICATION_SHEET")) {
                    return G1("BLUEJAY_NOTIFICATION_SHEET", "bluejay/notification-sheet", 233, "bluejay");
                }
                return null;
            case -1698902414:
                if (str.equals("GOLDENPATH_NADR")) {
                    return G1("GOLDENPATH_NADR", "goldenpath/nadr", 715, "goldenpath");
                }
                return null;
            case -1661181966:
                if (str.equals("MRKT_TEAM_ACCESS_CLAIM")) {
                    return G1("MRKT_TEAM_ACCESS_CLAIM", "mrkt/team/access/claim", 1317, "mrkt");
                }
                return null;
            case -1659530926:
                if (str.equals("MEDIAPICKER")) {
                    return Q2();
                }
                return null;
            case -1654670254:
                if (str.equals("DAILYMIXHUB")) {
                    return G1("DAILYMIXHUB", "dailymixhub", 468, "dailymixhub");
                }
                return null;
            case -1642397918:
                if (str.equals("WATCHAPP_VERSION_MISMATCH")) {
                    return G1("WATCHAPP_VERSION_MISMATCH", "watchapp/version-mismatch", 2126, "watchapp");
                }
                return null;
            case -1641235022:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_AVAILABLE_PLANS")) {
                    return a4();
                }
                return null;
            case -1632865838:
                if (str.equals("PLAYLIST")) {
                    return A3();
                }
                return null;
            case -1561298574:
                if (str.equals("NAVIGATION_NORMAL")) {
                    return G1("NAVIGATION_NORMAL", "navigation/normal", 1345, "navigation");
                }
                return null;
            case -1493205070:
                if (str.equals("GRADUATION_SUPERVISION")) {
                    return L1();
                }
                return null;
            case -1477637710:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS")) {
                    return G1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS", "mrkt/artist/video/other-videos", 1170, "mrkt");
                }
                return null;
            case -1438313566:
                if (str.equals("ALLBOARDING_CAROUSEL")) {
                    return G1("ALLBOARDING_CAROUSEL", "allboarding/carousel", 143, "allboarding");
                }
                return null;
            case -1417989934:
                if (str.equals("SEARCH_RECENT")) {
                    return G1("SEARCH_RECENT", "search/recent", 1798, "search");
                }
                return null;
            case -1373100414:
                if (str.equals("WEAR_VISUAL_MODE")) {
                    return G1("WEAR_VISUAL_MODE", "wear/visual_mode", 2170, "wear");
                }
                return null;
            case -1300352670:
                if (str.equals("AGE_ASSURANCE_SHARE_PARENTAL_CONSENT")) {
                    return F();
                }
                return null;
            case -1253576014:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM_CREATION")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_DM_CREATION", "mrkt/artist/campaigns/dm/creation", 1062, "mrkt");
                }
                return null;
            case -1211800030:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS_DARK")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS_DARK", "mrkt/debug/hubs/component-reference/rows-dark", 1209, "mrkt");
                }
                return null;
            case -1201933646:
                if (str.equals("MANAGE_TEAMS_PAGE")) {
                    return G1("MANAGE_TEAMS_PAGE", "manage/teams-page", 1003, "manage");
                }
                return null;
            case -1173625038:
                if (str.equals("GOLDENPATH_JAWAUNEL")) {
                    return G1("GOLDENPATH_JAWAUNEL", "goldenpath/jawaunel", 665, "goldenpath");
                }
                return null;
            case -1147915902:
                if (str.equals("MAGPIE_ERROR")) {
                    return I2();
                }
                return null;
            case -1136393598:
                if (str.equals("GOLDENPATH_CERIL")) {
                    return G1("GOLDENPATH_CERIL", "goldenpath/ceril", 627, "goldenpath");
                }
                return null;
            case -1131478094:
                if (str.equals("GOLDENPATH_HORIA")) {
                    return G1("GOLDENPATH_HORIA", "goldenpath/horia", 657, "goldenpath");
                }
                return null;
            case -1089119726:
                if (str.equals("S4P_SETUP_SHOW_DONE")) {
                    return G1("S4P_SETUP_SHOW_DONE", "s4p/setup-show/done", 1755, "s4p");
                }
                return null;
            case -1039359070:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_SELECT")) {
                    return G1("MRKT_BULK_CAMPAIGNS_UPLOAD_SELECT", "mrkt/bulk-campaigns/upload/select", 1194, "mrkt");
                }
                return null;
            case -1017922126:
                if (str.equals("MRKT_CHARTS_OVERVIEW")) {
                    return G1("MRKT_CHARTS_OVERVIEW", "mrkt/charts/overview", 1199, "mrkt");
                }
                return null;
            case -985309774:
                if (str.equals("GOLDENPATH_MANUELE")) {
                    return G1("GOLDENPATH_MANUELE", "goldenpath/manuele", 689, "goldenpath");
                }
                return null;
            case -870065230:
                if (str.equals("ADSTUDIO_DASHBOARD_CAMPAIGNS")) {
                    return G1("ADSTUDIO_DASHBOARD_CAMPAIGNS", "adstudio/dashboard/campaigns", 81, "adstudio");
                }
                return null;
            case -814846494:
                if (str.equals("PODCASTCHARTS_CATEGORIES")) {
                    return V3();
                }
                return null;
            case -811512638:
                if (str.equals("ADSTUDIO_EVENTS_PIXEL_INSTALL")) {
                    return G1("ADSTUDIO_EVENTS_PIXEL_INSTALL", "adstudio/events/pixel/install", 103, "adstudio");
                }
                return null;
            case -791298190:
                if (str.equals("BLUEJAY_BRIEF_PRESET_PICKER")) {
                    return G1("BLUEJAY_BRIEF_PRESET_PICKER", "bluejay/brief-preset-picker", 224, "bluejay");
                }
                return null;
            case -762143886:
                if (str.equals("MRKT_APP_SETTINGS")) {
                    return G1("MRKT_APP_SETTINGS", "mrkt/app-settings", 1039, "mrkt");
                }
                return null;
            case -694979758:
                if (str.equals("SHOWS_MIXED")) {
                    return G1("SHOWS_MIXED", "shows/mixed", 1876, "shows");
                }
                return null;
            case -686687278:
                if (str.equals("SHOWS_VIDEO")) {
                    return G1("SHOWS_VIDEO", "shows/video", 1879, "shows");
                }
                return null;
            case -679062478:
                if (str.equals("AGE_ASSURANCE_REQUEST_PARENTAL_CONSENT")) {
                    return E();
                }
                return null;
            case -671879902:
                if (str.equals("GOLDENPATH_JANANU")) {
                    return G1("GOLDENPATH_JANANU", "goldenpath/jananu", 664, "goldenpath");
                }
                return null;
            case -585892926:
                if (str.equals("GOLDENPATH_MOMENTS")) {
                    return G1("GOLDENPATH_MOMENTS", "goldenpath/moments", 710, "goldenpath");
                }
                return null;
            case -572852670:
                if (str.equals("ADSTUDIO_EVENTS_DETAILS")) {
                    return G1("ADSTUDIO_EVENTS_DETAILS", "adstudio/events/details", 101, "adstudio");
                }
                return null;
            case -548644062:
                if (str.equals("S4P_SETTINGS_PODCAST_PROFILE")) {
                    return G1("S4P_SETTINGS_PODCAST_PROFILE", "s4p/settings/podcast/profile", 1746, "s4p");
                }
                return null;
            case -500085838:
                if (str.equals("HIFI_SESSION_INFO")) {
                    return G1("HIFI_SESSION_INFO", "hifi/session-info", 791, "hifi");
                }
                return null;
            case -499866686:
                if (str.equals("GOLDENPATH_PAVANC")) {
                    return G1("GOLDENPATH_PAVANC", "goldenpath/pavanc", 728, "goldenpath");
                }
                return null;
            case -466347982:
                if (str.equals("CONSIDERATION_PAGE")) {
                    return G1("CONSIDERATION_PAGE", "consideration/page", 409, "consideration");
                }
                return null;
            case -457744990:
                if (str.equals("FRIENDSHOME_SEARCHFRIENDS")) {
                    return G1("FRIENDSHOME_SEARCHFRIENDS", "friendshome/searchfriends", 598, "friendshome");
                }
                return null;
            case -424684878:
                if (str.equals("KID_ACCOUNT_TRANSITION_PARENTAL_CONTROL")) {
                    return G1("KID_ACCOUNT_TRANSITION_PARENTAL_CONTROL", "kid-account-transition/parental-control", 895, "kid-account-transition");
                }
                return null;
            case -371296414:
                if (str.equals("GOLDENPATH_MARNUSHK")) {
                    return G1("GOLDENPATH_MARNUSHK", "goldenpath/marnushk", 694, "goldenpath");
                }
                return null;
            case -352884430:
                if (str.equals("KID_PARENTAL_BLOCKING_TRACK")) {
                    return G1("KID_PARENTAL_BLOCKING_TRACK", "kid-parental-blocking/track", 901, "kid-parental-blocking");
                }
                return null;
            case -309844430:
                if (str.equals("SOCIAL_LISTENING_IPLONBOARDINGDIALOG")) {
                    return G1("SOCIAL_LISTENING_IPLONBOARDINGDIALOG", "social-listening/iplonboardingdialog", 1906, "social-listening");
                }
                return null;
            case -234129998:
                if (str.equals("MANAGED_ACCOUNT_LINKING_INVITE_DEPENDENT")) {
                    return G1("MANAGED_ACCOUNT_LINKING_INVITE_DEPENDENT", "managed-account-linking/invite-dependent", 1004, "managed-account-linking");
                }
                return null;
            case -228298814:
                if (str.equals("PODCAST_SHOW_COMMUNITY")) {
                    return G1("PODCAST_SHOW_COMMUNITY", "podcast/show/community", 1495, "podcast");
                }
                return null;
            case -220417262:
                if (str.equals("MRKT_HELP")) {
                    return G1("MRKT_HELP", "mrkt/help", 1279, "mrkt");
                }
                return null;
            case -211412798:
                if (str.equals("SHARECARD_PLAYLIST")) {
                    return G1("SHARECARD_PLAYLIST", "sharecard/playlist", 1866, "sharecard");
                }
                return null;
            case -144405118:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_BILLING")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_BILLING", "mrkt/artist/campaigns/marquee-and-showcase/create/billing", 1066, "mrkt");
                }
                return null;
            case -120906974:
                if (str.equals("RADIO_STATION_CREATE_SHOWS")) {
                    return G1("RADIO_STATION_CREATE_SHOWS", "radio/station/create/shows", 1620, "radio");
                }
                return null;
            case -86411598:
                if (str.equals("S4P_WEB_VIEW_HOW_TO_GET_DISCOVERED_ON_SPOTIFY")) {
                    return G1("S4P_WEB_VIEW_HOW_TO_GET_DISCOVERED_ON_SPOTIFY", "s4p/web-view/how-to-get-discovered-on-spotify", 1769, "s4p");
                }
                return null;
            case -56147982:
                if (str.equals("LIVE_ERROR_DIALOG")) {
                    return G1("LIVE_ERROR_DIALOG", "live/error-dialog", 932, "live");
                }
                return null;
            case -15087006:
                if (str.equals("MAGPIE_NOTIFICATIONS")) {
                    return J2();
                }
                return null;
            case 82450:
                if (str.equals("STS")) {
                    return G1("STS", "sts", 1983, "sts");
                }
                return null;
            case 50719698:
                if (str.equals("BLUEJAY_VOICE_PICKER")) {
                    return l0();
                }
                return null;
            case 56380674:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_CANCEL_SWITCH_DIALOG")) {
                    return G1("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_CANCEL_SWITCH_DIALOG", "membership/consumer/manage/detail/cancel-switch-dialog", 1026, "membership");
                }
                return null;
            case 75408130:
                if (str.equals("WATCHAPP_DOWNLOAD_DEVICES_LIMIT_REACHED")) {
                    return G1("WATCHAPP_DOWNLOAD_DEVICES_LIMIT_REACHED", "watchapp/download-devices-limit-reached", 2097, "watchapp");
                }
                return null;
            case 75571378:
                if (str.equals("OURDJ")) {
                    return G1("OURDJ", "ourdj", 1383, "ourdj");
                }
                return null;
            case 79219778:
                if (str.equals("START")) {
                    return G1("START", "start", 1978, "start");
                }
                return null;
            case 81848594:
                if (str.equals("VOICE")) {
                    return G1("VOICE", "voice", 2079, "voice");
                }
                return null;
            case 82781042:
                if (str.equals("WORLD")) {
                    return G1("WORLD", "world", 2178, "world");
                }
                return null;
            case 85419922:
                if (str.equals("TV_ABOUT_ENTITY")) {
                    return G1("TV_ABOUT_ENTITY", "tv/about-entity", 2049, "tv");
                }
                return null;
            case 115176866:
                if (str.equals("JAM_JOINJAMLINKSHEET")) {
                    return G1("JAM_JOINJAMLINKSHEET", "jam/joinjamlinksheet", 859, "jam");
                }
                return null;
            case 167567026:
                if (str.equals("ON_DEMAND_TRIAL_PLAN_OVERVIEW")) {
                    return f3();
                }
                return null;
            case 184447778:
                if (str.equals("MRKT_ARTIST_PROFILE")) {
                    return G1("MRKT_ARTIST_PROFILE", "mrkt/artist/profile", 1112, "mrkt");
                }
                return null;
            case 218825538:
                if (str.equals("OFFLINE_MIX_ENTITY")) {
                    return G1("OFFLINE_MIX_ENTITY", "offline-mix/entity", 1373, "offline-mix");
                }
                return null;
            case 300457634:
                if (str.equals("SHARE_SNAPCHAT")) {
                    return G1("SHARE_SNAPCHAT", "share/snapchat", 1865, "share");
                }
                return null;
            case 325972130:
                if (str.equals("S4P_AUTHENTICATION_ABOUT_SPOTITY_ACCOUNTS")) {
                    return G1("S4P_AUTHENTICATION_ABOUT_SPOTITY_ACCOUNTS", "s4p/authentication/about-spotity-accounts", 1675, "s4p");
                }
                return null;
            case 340599026:
                if (str.equals("JAM_PARTICIPANTSETTINGSSHEET")) {
                    return G1("JAM_PARTICIPANTSETTINGSSHEET", "jam/participantsettingssheet", 866, "jam");
                }
                return null;
            case 390453666:
                if (str.equals("ADSTUDIO_COLD_START_CAMPAIGN")) {
                    return G1("ADSTUDIO_COLD_START_CAMPAIGN", "adstudio/cold-start/campaign", 71, "adstudio");
                }
                return null;
            case 395526130:
                if (str.equals("CONNECT_TUTORIALGAMECONSOLE")) {
                    return G1("CONNECT_TUTORIALGAMECONSOLE", "connect/tutorialgameconsole", 406, "connect");
                }
                return null;
            case 418986930:
                if (str.equals("ADSTUDIO_COLD_START_CAMPAIGN_CONFIRMATION")) {
                    return G1("ADSTUDIO_COLD_START_CAMPAIGN_CONFIRMATION", "adstudio/cold-start/campaign/confirmation", 72, "adstudio");
                }
                return null;
            case 439335794:
                if (str.equals("MRKT_FRONTDOOR_EVENTS")) {
                    return G1("MRKT_FRONTDOOR_EVENTS", "mrkt/frontdoor/events", 1249, "mrkt");
                }
                return null;
            case 441162066:
                if (str.equals("MRKT_ARTIST_FAN_ENGAGEMENT")) {
                    return G1("MRKT_ARTIST_FAN_ENGAGEMENT", "mrkt/artist/fan-engagement", 1085, "mrkt");
                }
                return null;
            case 453278578:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS", "mrkt/debug/hubs/component-reference/section-headers", 1210, "mrkt");
                }
                return null;
            case 496520338:
                if (str.equals("SHOWS_FORMAT_ITEM")) {
                    return G1("SHOWS_FORMAT_ITEM", "shows/format/item", 1872, "shows");
                }
                return null;
            case 526780178:
                if (str.equals("SHARE_INSTAGRAM")) {
                    return G1("SHARE_INSTAGRAM", "share/instagram", 1861, "share");
                }
                return null;
            case 551356722:
                if (str.equals("CONTEXTDISPATCH_ERROR")) {
                    return G1("CONTEXTDISPATCH_ERROR", "contextdispatch/error", 413, "contextdispatch");
                }
                return null;
            case 562510866:
                if (str.equals("PROFILE_ACTIVITY_REPLAYS")) {
                    return G1("PROFILE_ACTIVITY_REPLAYS", "profile/activity/replays", 1573, "profile");
                }
                return null;
            case 632694258:
                if (str.equals("CONTEXTMENU_EXPRESSIONVIDEO")) {
                    return G1("CONTEXTMENU_EXPRESSIONVIDEO", "contextMenu/expressionvideo", 412, "contextMenu");
                }
                return null;
            case 642831826:
                if (str.equals("MRKT_TEAM_SWITCHER")) {
                    return G1("MRKT_TEAM_SWITCHER", "mrkt/team-switcher", 1314, "mrkt");
                }
                return null;
            case 667627314:
                if (str.equals("HOMEMIX_GENREDETAIL")) {
                    return G1("HOMEMIX_GENREDETAIL", "homemix/genredetail", 815, "homemix");
                }
                return null;
            case 677175586:
                if (str.equals("MRKT_TEAM_MANAGEMENT_PAYOUTS")) {
                    return G1("MRKT_TEAM_MANAGEMENT_PAYOUTS", "mrkt/team-management/payouts", 1311, "mrkt");
                }
                return null;
            case 689260226:
                if (str.equals("S4P_DEBUG_S4P_COMPONENTS")) {
                    return G1("S4P_DEBUG_S4P_COMPONENTS", "s4p/debug/s4p-components", 1703, "s4p");
                }
                return null;
            case 712726066:
                if (str.equals("DATADOWNLOAD")) {
                    return q1();
                }
                return null;
            case 770931698:
                if (str.equals("MRKT_FRONTDOOR_YOUR_WRAPPED")) {
                    return G1("MRKT_FRONTDOOR_YOUR_WRAPPED", "mrkt/frontdoor/your-wrapped", 1278, "mrkt");
                }
                return null;
            case 824501890:
                if (str.equals("CONCERTS_CAMPAIGN")) {
                    return P0();
                }
                return null;
            case 835769122:
                if (str.equals("MRKT_BTC_BOOKING_CAMPAIGNS_SUCCESS")) {
                    return G1("MRKT_BTC_BOOKING_CAMPAIGNS_SUCCESS", "mrkt/btc/booking/campaigns-success", 1182, "mrkt");
                }
                return null;
            case 924243634:
                if (str.equals("ASSISTED_CURATION_SEARCH_SHOWS")) {
                    return G1("ASSISTED_CURATION_SEARCH_SHOWS", "assisted-curation/search/shows", 191, "assisted-curation");
                }
                return null;
            case 943178114:
                if (str.equals("MERCH_DETAILS")) {
                    return G1("MERCH_DETAILS", "merch-details", 1031, "merch-details");
                }
                return null;
            case 957701346:
                if (str.equals("WWW_ACCOUNT_PAGES_LANDING")) {
                    return G1("WWW_ACCOUNT_PAGES_LANDING", "www-account-pages/landing", 2210, "www-account-pages");
                }
                return null;
            case 976433042:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_REVIEW")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_REVIEW", "mrkt/discovery-mode/unified-buying/review", 1221, "mrkt");
                }
                return null;
            case 1030514898:
                if (str.equals("SHUFFLE_TOGGLE_UPSELL")) {
                    return k5();
                }
                return null;
            case 1041750562:
                if (str.equals("PARENTAL_CONTROL_ACCOUNT_DETAILS_VIDEO_SETTINGS")) {
                    return j3();
                }
                return null;
            case 1056083202:
                if (str.equals("SONG_DNA_HISTORY")) {
                    return G1("SONG_DNA_HISTORY", "song-dna-history", 1922, "song-dna-history");
                }
                return null;
            case 1059661938:
                if (str.equals("CONTEXTMENU_DJLANGUAGESETTINGS")) {
                    return W0();
                }
                return null;
            case 1117847746:
                if (str.equals("ADSTUDIO_EDIT_CAMPAIGN_RESERVED_BOOKING")) {
                    return G1("ADSTUDIO_EDIT_CAMPAIGN_RESERVED_BOOKING", "adstudio/edit/campaign/reserved-booking", 97, "adstudio");
                }
                return null;
            case 1148299026:
                if (str.equals("PODCAST_SHOW_GATEDACCESSEDUCATION")) {
                    return G1("PODCAST_SHOW_GATEDACCESSEDUCATION", "podcast/show/gatedaccesseducation", 1496, "podcast");
                }
                return null;
            case 1185606962:
                if (str.equals("TASTEPROFILE")) {
                    return w5();
                }
                return null;
            case 1196568066:
                if (str.equals("SETTINGS_CONTENT_PERSONALIZATION")) {
                    return G1("SETTINGS_CONTENT_PERSONALIZATION", "settings/content-personalization", 1813, "settings");
                }
                return null;
            case 1216579762:
                if (str.equals("GOLDENPATH_ABHIROOPKISHOREP")) {
                    return G1("GOLDENPATH_ABHIROOPKISHOREP", "goldenpath/abhiroopkishorep", 610, "goldenpath");
                }
                return null;
            case 1280356834:
                if (str.equals("SIGNUP_PASSWORD")) {
                    return G1("SIGNUP_PASSWORD", "signup/password", 1895, "signup");
                }
                return null;
            case 1306230802:
                if (str.equals("IMAGE_PICKER")) {
                    return a2();
                }
                return null;
            case 1381773474:
                if (str.equals("ADSTUDIO_BUSINESS_BILLING")) {
                    return G1("ADSTUDIO_BUSINESS_BILLING", "adstudio/business/billing", 53, "adstudio");
                }
                return null;
            case 1402036674:
                if (str.equals("PAYMENTFAILURE_RESUBSCRIPTIONMODAL")) {
                    return G1("PAYMENTFAILURE_RESUBSCRIPTIONMODAL", "paymentfailure/resubscriptionmodal", 1426, "paymentfailure");
                }
                return null;
            case 1442790770:
                if (str.equals("WWW_ACCOUNT_PAGES_RECOVERPLAYLISTS")) {
                    return G1("WWW_ACCOUNT_PAGES_RECOVERPLAYLISTS", "www-account-pages/recoverplaylists", 2240, "www-account-pages");
                }
                return null;
            case 1494617282:
                if (str.equals("CONTEXTMENU_ALBUMPRERELEASE")) {
                    return G1("CONTEXTMENU_ALBUMPRERELEASE", "contextmenu/albumprerelease", 417, "contextmenu");
                }
                return null;
            case 1497788146:
                if (str.equals("REINVENTFREE_INDIA_EDUCATION_UPSELL")) {
                    return G1("REINVENTFREE_INDIA_EDUCATION_UPSELL", "reinventfree-india-education-upsell", 1638, "reinventfree-india-education-upsell");
                }
                return null;
            case 1512388146:
                if (str.equals("HOME_MUSIC_VIDEOS")) {
                    return S1();
                }
                return null;
            case 1531961490:
                if (str.equals("MRKT_DISTRIBUTOR_INVITE")) {
                    return G1("MRKT_DISTRIBUTOR_INVITE", "mrkt/distributor-invite", 1228, "mrkt");
                }
                return null;
            case 1557427202:
                if (str.equals("MARQUEE")) {
                    return M2();
                }
                return null;
            case 1587669746:
                if (str.equals("PODCAST_SHOW_AUDIOBOOK_GATEDACCESSEDUCATION")) {
                    return G1("PODCAST_SHOW_AUDIOBOOK_GATEDACCESSEDUCATION", "podcast/show/audiobook/gatedaccesseducation", 1494, "podcast");
                }
                return null;
            case 1608881794:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_VIDEO_DETAILS")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_VIDEO_DETAILS", "mrkt/artist/video/music-videos/upload/video-details", 1169, "mrkt");
                }
                return null;
            case 1711947202:
                if (str.equals("TERMS_PRIVACYPOLICY")) {
                    return G1("TERMS_PRIVACYPOLICY", "terms/privacypolicy", 2038, "terms");
                }
                return null;
            case 1724306466:
                if (str.equals("WWW_ACCOUNT_PAGES_MANAGE_SUBSCRIPTION")) {
                    return G1("WWW_ACCOUNT_PAGES_MANAGE_SUBSCRIPTION", "www-account-pages/manage-subscription", 2216, "www-account-pages");
                }
                return null;
            case 1724769954:
                if (str.equals("BYOM_NOWPLAYING")) {
                    return G1("BYOM_NOWPLAYING", "byom/nowplaying", 261, "byom");
                }
                return null;
            case 1732016898:
                if (str.equals("PROFILE_PRONOUNS")) {
                    return s4();
                }
                return null;
            case 1770599186:
                if (str.equals("PROFILE_COMPLETION_SHEET")) {
                    return G1("PROFILE_COMPLETION_SHEET", "profile-completion-sheet", 1570, "profile-completion-sheet");
                }
                return null;
            case 1779511602:
                if (str.equals("DRIVING_DRIVINGMODE")) {
                    return G1("DRIVING_DRIVINGMODE", "driving/drivingMode", 502, "driving");
                }
                return null;
            case 1823901826:
                if (str.equals("MAGPIE_PRIVACY")) {
                    return K2();
                }
                return null;
            case 1830659698:
                if (str.equals("GOLDENPATH_HRICHARDSON")) {
                    return G1("GOLDENPATH_HRICHARDSON", "goldenpath/hrichardson", 658, "goldenpath");
                }
                return null;
            case 1832569282:
                if (str.equals("BOOTCAMP_TFB_TOPTRACKS")) {
                    return G1("BOOTCAMP_TFB_TOPTRACKS", "bootcamp/tfb/toptracks", 244, "bootcamp");
                }
                return null;
            case 1842769906:
                if (str.equals("ADSTUDIO_EDIT_AD")) {
                    return G1("ADSTUDIO_EDIT_AD", "adstudio/edit/ad", 92, "adstudio");
                }
                return null;
            case 1848254530:
                if (str.equals("MRKT_ARTIST_PROFILE_MERCH")) {
                    return G1("MRKT_ARTIST_PROFILE_MERCH", "mrkt/artist/profile/merch", 1132, "mrkt");
                }
                return null;
            case 1878718450:
                if (str.equals("AGE_SIGNAL_BLOCKED_PARENT_SETUP")) {
                    return G1("AGE_SIGNAL_BLOCKED_PARENT_SETUP", "age-signal/blocked/parent-setup", 132, "age-signal");
                }
                return null;
            case 1891663442:
                if (str.equals("CONNECT_OVERLAY_NEWDEVICE")) {
                    return G1("CONNECT_OVERLAY_NEWDEVICE", "connect/overlay/newdevice", 399, "connect");
                }
                return null;
            case 1936854226:
                if (str.equals("PORTAL_HOME")) {
                    return G1("PORTAL_HOME", "portal/home", 1526, "portal");
                }
                return null;
            case 1967708146:
                if (str.equals("TASTEPROFILE_FEEDBACK")) {
                    return G1("TASTEPROFILE_FEEDBACK", "tasteprofile/feedback", 2036, "tasteprofile");
                }
                return null;
            case 2017963842:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_REVIEW_AND_SUBMIT")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_REVIEW_AND_SUBMIT", "adstudio/add-to-existing-ad-set/review-and-submit", 43, "adstudio");
                }
                return null;
            case 2037021538:
                if (str.equals("CONNECT_EDUCATIONPAGE")) {
                    return G1("CONNECT_EDUCATIONPAGE", "connect/educationpage", 397, "connect");
                }
                return null;
            case 2046568290:
                if (str.equals("COLLECTION_PODCASTS_FOLLOWING")) {
                    return G1("COLLECTION_PODCASTS_FOLLOWING", "collection/podcasts/following", 362, "collection");
                }
                return null;
            case 2050617522:
                if (str.equals("CARS_DJSUGGESTEDPROMPTS")) {
                    return G1("CARS_DJSUGGESTEDPROMPTS", "cars/djsuggestedprompts", 281, "cars");
                }
                return null;
            case 2092150178:
                if (str.equals("HOMEMIX_FACEPILEDETAIL")) {
                    return G1("HOMEMIX_FACEPILEDETAIL", "homemix/facepiledetail", 814, "homemix");
                }
                return null;
            case 2117707330:
                if (str.equals("SETTINGS_LANGUAGES_ROOT")) {
                    return G1("SETTINGS_LANGUAGES_ROOT", "settings/languages/root", 1828, "settings");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 V() {
        return G1("AUDIOBOOK_CONSUMPTIONCAP", "audiobook/consumptioncap", 199, "audiobook");
    }

    public static p6r0 V0() {
        return G1("CONTEXTMENU_ARTIST", "contextmenu/artist", 418, "contextmenu");
    }

    public static p6r0 V1() {
        return G1("HOME_PODCASTS_VIDEOS", "home/podcasts-videos", 806, "home");
    }

    public static p6r0 V2() {
        return G1("NAVIGATION_BOTTOMSHEET", "navigation/bottomsheet", 1344, "navigation");
    }

    public static p6r0 V3() {
        return G1("PODCASTCHARTS_CATEGORIES", "podcastcharts/categories", 1510, "podcastcharts");
    }

    public static p6r0 V4() {
        return G1("SEARCH_LOADING_INSTANT_MIX", "search/loading_instant_mix", 1791, "search");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 V5(String str) {
        switch (str.hashCode()) {
            case -2120488989:
                if (str.equals("S4P_ONBOARDING_LANDING")) {
                    return G1("S4P_ONBOARDING_LANDING", "s4p/onboarding/landing", 1721, "s4p");
                }
                return null;
            case -2118018157:
                if (str.equals("BLEND_ENTITY_TRACKAFFILIATION")) {
                    return G1("BLEND_ENTITY_TRACKAFFILIATION", "blend/entity/trackaffiliation", 219, "blend");
                }
                return null;
            case -2114437645:
                if (str.equals("ADSTUDIO_PIXELS")) {
                    return G1("ADSTUDIO_PIXELS", "adstudio/pixels", 104, "adstudio");
                }
                return null;
            case -2111023837:
                if (str.equals("CHAT_REACTIONS_SHEET")) {
                    return G1("CHAT_REACTIONS_SHEET", "chat/reactions-sheet", 328, "chat");
                }
                return null;
            case -2096543949:
                if (str.equals("S4P_EPISODES_SELECT")) {
                    return G1("S4P_EPISODES_SELECT", "s4p/episodes/select", 1706, "s4p");
                }
                return null;
            case -2088553517:
                if (str.equals("S4P_SHOW_SWITCHER")) {
                    return G1("S4P_SHOW_SWITCHER", "s4p/show-switcher", 1762, "s4p");
                }
                return null;
            case -2078658733:
                if (str.equals("JAM_FREEUSERUPSELLSHUFFLESHEET")) {
                    return G1("JAM_FREEUSERUPSELLSHUFFLESHEET", "jam/freeuserupsellshufflesheet", 854, "jam");
                }
                return null;
            case -2077709277:
                if (str.equals("SETTINGS")) {
                    return W4();
                }
                return null;
            case -2027965325:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_REVIEW_AND_SUBMIT")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_REVIEW_AND_SUBMIT", "adstudio/duplicate-ad-set-only/review-and-submit", 87, "adstudio");
                }
                return null;
            case -1966007901:
                if (str.equals("USERPLAYLISTRESOLVER")) {
                    return G1("USERPLAYLISTRESOLVER", "userplaylistresolver", 2073, "userplaylistresolver");
                }
                return null;
            case -1922536685:
                if (str.equals("ARTIST_RELATED")) {
                    return G1("ARTIST_RELATED", "artist/related", 173, "artist");
                }
                return null;
            case -1905108253:
                if (str.equals("HIFI_DOWNLOAD_SHEET")) {
                    return G1("HIFI_DOWNLOAD_SHEET", "hifi/download-sheet", 786, "hifi");
                }
                return null;
            case -1843786221:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS", "mrkt/debug/hubs/component-reference/rows", 1208, "mrkt");
                }
                return null;
            case -1803105565:
                if (str.equals("MRKT_MOBILE_STATS_LATEST_ALBUM")) {
                    return G1("MRKT_MOBILE_STATS_LATEST_ALBUM", "mrkt/mobile-stats/latest-album", 1291, "mrkt");
                }
                return null;
            case -1789374205:
                if (str.equals("PROFILE_IMAGEPREVIEW")) {
                    return G1("PROFILE_IMAGEPREVIEW", "profile/imagepreview", 1585, "profile");
                }
                return null;
            case -1730851453:
                if (str.equals("PARTNERACCOUNTLINKING")) {
                    return G1("PARTNERACCOUNTLINKING", "partneraccountlinking", 1423, "partneraccountlinking");
                }
                return null;
            case -1701587405:
                if (str.equals("WWW_ACCOUNT_PAGES_EMAIL_VERIFICATION")) {
                    return G1("WWW_ACCOUNT_PAGES_EMAIL_VERIFICATION", "www-account-pages/email-verification", 2198, "www-account-pages");
                }
                return null;
            case -1651629005:
                if (str.equals("S4P_SETTINGS")) {
                    return G1("S4P_SETTINGS", "s4p/settings", 1741, "s4p");
                }
                return null;
            case -1617341581:
                if (str.equals("GOLDENPATH_GOKTUGG")) {
                    return G1("GOLDENPATH_GOKTUGG", "goldenpath/goktugg", 650, "goldenpath");
                }
                return null;
            case -1598815309:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SETUP")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SETUP", "mrkt/artist/campaigns/marquee-and-showcase/setup", 1072, "mrkt");
                }
                return null;
            case -1547976525:
                if (str.equals("CHALLENGE_TOTP")) {
                    return G1("CHALLENGE_TOTP", "challenge/totp", 299, "challenge");
                }
                return null;
            case -1481285917:
                if (str.equals("MANAGE_ORG_INFO")) {
                    return G1("MANAGE_ORG_INFO", "manage/org-info", 997, "manage");
                }
                return null;
            case -1448248189:
                if (str.equals("ENTITYSEGMENTS")) {
                    return u1();
                }
                return null;
            case -1414710557:
                if (str.equals("AD_BASED_ON_DEMAND")) {
                    return G1("AD_BASED_ON_DEMAND", "ad-based-on-demand", 8, "ad-based-on-demand");
                }
                return null;
            case -1284460653:
                if (str.equals("CHARTS_MERCHCOLLECTION")) {
                    return G1("CHARTS_MERCHCOLLECTION", "charts/merchcollection", 308, "charts");
                }
                return null;
            case -1279287309:
                if (str.equals("ADSTUDIO_EVENTS_CAPI_INSTALL")) {
                    return G1("ADSTUDIO_EVENTS_CAPI_INSTALL", "adstudio/events/capi/install", 100, "adstudio");
                }
                return null;
            case -1247778173:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA", "www-account-pages/genalpha", 2200, "www-account-pages");
                }
                return null;
            case -1198635805:
                if (str.equals("WEAR_SETTINGS")) {
                    return G1("WEAR_SETTINGS", "wear/settings", 2158, "wear");
                }
                return null;
            case -1136511501:
                if (str.equals("GOLDENPATH_CASSB")) {
                    return G1("GOLDENPATH_CASSB", "goldenpath/cassb", 626, "goldenpath");
                }
                return null;
            case -1132324797:
                if (str.equals("GOLDENPATH_GREGA")) {
                    return G1("GOLDENPATH_GREGA", "goldenpath/grega", 652, "goldenpath");
                }
                return null;
            case -1127035389:
                if (str.equals("GOLDENPATH_MIVIC")) {
                    return G1("GOLDENPATH_MIVIC", "goldenpath/mivic", 705, "goldenpath");
                }
                return null;
            case -1122533341:
                if (str.equals("GOLDENPATH_REZAN")) {
                    return G1("GOLDENPATH_REZAN", "goldenpath/rezan", 734, "goldenpath");
                }
                return null;
            case -1121389821:
                if (str.equals("KID_ACCOUNT_TRANSITION_WELCOME")) {
                    return G1("KID_ACCOUNT_TRANSITION_WELCOME", "kid-account-transition/welcome", 899, "kid-account-transition");
                }
                return null;
            case -1090286749:
                if (str.equals("DIALOG_PROFILE_ACTIVITY_ONDEMANDUNAVAILABLE")) {
                    return G1("DIALOG_PROFILE_ACTIVITY_ONDEMANDUNAVAILABLE", "dialog/profile/activity/ondemandunavailable", 487, "dialog");
                }
                return null;
            case -999992605:
                if (str.equals("TASTE_ONBOARDING")) {
                    return G1("TASTE_ONBOARDING", "taste-onboarding", 2034, "taste-onboarding");
                }
                return null;
            case -990074397:
                if (str.equals("YOUR_SOUND")) {
                    return G1("YOUR_SOUND", "your-sound", 2254, "your-sound");
                }
                return null;
            case -952308461:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD")) {
                    return G1("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD", "mrkt/artist/profile/image-gallery/add", 1129, "mrkt");
                }
                return null;
            case -938231181:
                if (str.equals("SHARE_MESSENGER")) {
                    return G1("SHARE_MESSENGER", "share/messenger", 1862, "share");
                }
                return null;
            case -916469197:
                if (str.equals("SETTINGS_NOTIFICATIONS_CHANNEL_DETAILS")) {
                    return G1("SETTINGS_NOTIFICATIONS_CHANNEL_DETAILS", "settings/notifications/channel-details", 1836, "settings");
                }
                return null;
            case -865844717:
                if (str.equals("MAGPIE_REFINE")) {
                    return G1("MAGPIE_REFINE", "magpie/refine", 985, "magpie");
                }
                return null;
            case -863195197:
                if (str.equals("CHAT_ENTITY_PICKER")) {
                    return u0();
                }
                return null;
            case -856218781:
                if (str.equals("WWW_ACCOUNT_PAGES_CHANGE_COUNTRY_CHANGECOUNTRY")) {
                    return G1("WWW_ACCOUNT_PAGES_CHANGE_COUNTRY_CHANGECOUNTRY", "www-account-pages/change-country/changecountry", 2192, "www-account-pages");
                }
                return null;
            case -830934061:
                if (str.equals("GOLDENPATH_DOGANK")) {
                    return G1("GOLDENPATH_DOGANK", "goldenpath/dogank", 636, "goldenpath");
                }
                return null;
            case -830629437:
                if (str.equals("OFFLINE")) {
                    return G1("OFFLINE", "offline", 1372, "offline");
                }
                return null;
            case -804055917:
                if (str.equals("READALONG_FULLSCREEN")) {
                    return D4();
                }
                return null;
            case -747406301:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS_DARK")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS_DARK", "mrkt/debug/hubs/component-reference/section-headers-dark", 1211, "mrkt");
                }
                return null;
            case -696911933:
                if (str.equals("MRKT_ARTIST_VIDEO_CANVAS")) {
                    return G1("MRKT_ARTIST_VIDEO_CANVAS", "mrkt/artist/video/canvas", 1150, "mrkt");
                }
                return null;
            case -688279277:
                if (str.equals("MRKT_FRONTDOOR_LIVE_EVENTS")) {
                    return G1("MRKT_FRONTDOOR_LIVE_EVENTS", "mrkt/frontdoor/live-events", 1260, "mrkt");
                }
                return null;
            case -679885645:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_OVERVIEW")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_OVERVIEW", "mrkt/debug/hubs/component-reference/overview", 1205, "mrkt");
                }
                return null;
            case -642488541:
                if (str.equals("EVENTSENDER_DEBUG")) {
                    return G1("EVENTSENDER_DEBUG", "eventsender/debug", 527, "eventsender");
                }
                return null;
            case -609297645:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_SELECTION")) {
                    return G1("MRKT_BTC_BOOKING_UPLOAD_SELECTION", "mrkt/btc/booking/upload/selection", 1185, "mrkt");
                }
                return null;
            case -607483757:
                if (str.equals("CHAT_LYRICS_STICKERS_PICKER")) {
                    return y0();
                }
                return null;
            case -519888813:
                if (str.equals("SETTINGS_CONNECTIVITY")) {
                    return G1("SETTINGS_CONNECTIVITY", "settings/connectivity", 1811, "settings");
                }
                return null;
            case -510361565:
                if (str.equals("MRKT_SONGWRITER_PROFILE")) {
                    return G1("MRKT_SONGWRITER_PROFILE", "mrkt/songwriter/profile", 1302, "mrkt");
                }
                return null;
            case -500451885:
                if (str.equals("GOLDENPATH_PABLOV")) {
                    return G1("GOLDENPATH_PABLOV", "goldenpath/pablov", 727, "goldenpath");
                }
                return null;
            case -498596717:
                if (str.equals("SETTINGS_APP_ICON")) {
                    return Z4();
                }
                return null;
            case -443006285:
                if (str.equals("GOLDENPATH_RAHULR")) {
                    return G1("GOLDENPATH_RAHULR", "goldenpath/rahulr", 731, "goldenpath");
                }
                return null;
            case -423615485:
                if (str.equals("LOGIN_WRONGEMAILORPASSWORD")) {
                    return C2();
                }
                return null;
            case -414210253:
                if (str.equals("GOLDENPATH_SANIAZ")) {
                    return G1("GOLDENPATH_SANIAZ", "goldenpath/saniaz", 742, "goldenpath");
                }
                return null;
            case -408508333:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_FULL_SERVICE_AUDIO")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_FULL_SERVICE_AUDIO", "adstudio/add-to-existing-ad-set/ad-full-service-audio", 40, "adstudio");
                }
                return null;
            case -364030733:
                if (str.equals("WATCHFEED_WRAPPED")) {
                    return j6();
                }
                return null;
            case -338968477:
                if (str.equals("SUBTITLES_SELECTOR")) {
                    return v5();
                }
                return null;
            case -294163757:
                if (str.equals("DIALOG_LOCALFILESIMPORT_OK")) {
                    return G1("DIALOG_LOCALFILESIMPORT_OK", "dialog/localfilesimport/ok", 483, "dialog");
                }
                return null;
            case -257274957:
                if (str.equals("SPOTIFY_FOR_AUTHORS_ACTIVITY_CENTER")) {
                    return G1("SPOTIFY_FOR_AUTHORS_ACTIVITY_CENTER", "spotify-for-authors/activity-center", 1932, "spotify-for-authors");
                }
                return null;
            case -220109645:
                if (str.equals("MRKT_ROOT")) {
                    return G1("MRKT_ROOT", "mrkt/root", 1297, "mrkt");
                }
                return null;
            case -217316845:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_ERROR")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_ERROR", "mrkt/discovery-mode/unified-buying/update/csv/error", 1224, "mrkt");
                }
                return null;
            case -205435245:
                if (str.equals("SPOTIFY_FOR_AUTHORS_WRAPPED")) {
                    return G1("SPOTIFY_FOR_AUTHORS_WRAPPED", "spotify-for-authors/wrapped", 1960, "spotify-for-authors");
                }
                return null;
            case -182520109:
                if (str.equals("KID_ACCOUNT_CREATION_EDUCATION")) {
                    return G1("KID_ACCOUNT_CREATION_EDUCATION", "kid-account-creation/education", 877, "kid-account-creation");
                }
                return null;
            case -181295165:
                if (str.equals("YOURLIBRARY_TAG")) {
                    return G1("YOURLIBRARY_TAG", "yourlibrary/tag", 2273, "yourlibrary");
                }
                return null;
            case -176298365:
                if (str.equals("S4P_UNIVERSAL_CREATION")) {
                    return G1("S4P_UNIVERSAL_CREATION", "s4p/universal-creation", 1768, "s4p");
                }
                return null;
            case -112673805:
                if (str.equals("LIVE_LEGALDISCLOSURE")) {
                    return G1("LIVE_LEGALDISCLOSURE", "live/legaldisclosure", 933, "live");
                }
                return null;
            case -106899373:
                if (str.equals("KID_ACCOUNT_TRANSITION_ENTRY")) {
                    return G1("KID_ACCOUNT_TRANSITION_ENTRY", "kid-account-transition/entry", 892, "kid-account-transition");
                }
                return null;
            case -101833933:
                if (str.equals("SSO_PARTNERACCOUNTLINKING")) {
                    return t5();
                }
                return null;
            case -96219965:
                if (str.equals("SETTINGS_QUALITY")) {
                    return G1("SETTINGS_QUALITY", "settings/quality", 1843, "settings");
                }
                return null;
            case -89102045:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_UPLOAD")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_UPLOAD", "mrkt/discovery-mode/unified-buying/create/csv/upload", 1219, "mrkt");
                }
                return null;
            case -55688365:
                if (str.equals("PORTAL_SEARCH_STREAMING_WORKFLOWS")) {
                    return G1("PORTAL_SEARCH_STREAMING_WORKFLOWS", "portal/search-streaming-workflows", 1536, "portal");
                }
                return null;
            case -54287117:
                if (str.equals("SIGNUP_PARENTALCONSENTLOGINOPTIONS")) {
                    return G1("SIGNUP_PARENTALCONSENTLOGINOPTIONS", "signup/parentalconsentloginoptions", 1894, "signup");
                }
                return null;
            case -27094317:
                if (str.equals("PARTNERSCOPESCONSENT")) {
                    return G1("PARTNERSCOPESCONSENT", "partnerscopesconsent", 1424, "partnerscopesconsent");
                }
                return null;
            case 24888995:
                if (str.equals("UNKNOWN_NOTLOADED")) {
                    return G1("UNKNOWN_NOTLOADED", "unknown/notloaded", 2065, "unknown");
                }
                return null;
            case 64921139:
                if (str.equals("DEBUG")) {
                    return r1();
                }
                return null;
            case 67703139:
                if (str.equals("GENRE")) {
                    return G1("GENRE", "genre", 604, "genre");
                }
                return null;
            case 126057075:
                if (str.equals("SETTINGS_LANGUAGE_SETTINGS_ROOT")) {
                    return G1("SETTINGS_LANGUAGE_SETTINGS_ROOT", "settings/language-settings-root", 1824, "settings");
                }
                return null;
            case 136435059:
                if (str.equals("MRKT_ARTIST_AUDIENCE_ENGAGEMENT")) {
                    return G1("MRKT_ARTIST_AUDIENCE_ENGAGEMENT", "mrkt/artist/audience/engagement", 1049, "mrkt");
                }
                return null;
            case 157276499:
                if (str.equals("MUTUAL_FOLLOW_SEND_MESSAGE_SHEET")) {
                    return U2();
                }
                return null;
            case 162056307:
                if (str.equals("MANAGE_AGREEMENT_DETAILS")) {
                    return G1("MANAGE_AGREEMENT_DETAILS", "manage/agreement-details", 994, "manage");
                }
                return null;
            case 192716483:
                if (str.equals("BYOM_NOWPLAYING_CHAPTERS")) {
                    return G1("BYOM_NOWPLAYING_CHAPTERS", "byom/nowplaying/chapters", 262, "byom");
                }
                return null;
            case 212931539:
                if (str.equals("PODCAST_EPISODE_COMMENTS")) {
                    return G1("PODCAST_EPISODE_COMMENTS", "podcast/episode/comments", 1483, "podcast");
                }
                return null;
            case 256281763:
                if (str.equals("GOLDENPATH_RBEAZLEY")) {
                    return G1("GOLDENPATH_RBEAZLEY", "goldenpath/rbeazley", 732, "goldenpath");
                }
                return null;
            case 321959171:
                if (str.equals("SETTINGS_NOTIFICATIONS_CHANNELS")) {
                    return G1("SETTINGS_NOTIFICATIONS_CHANNELS", "settings/notifications/channels", 1837, "settings");
                }
                return null;
            case 356862467:
                if (str.equals("CONTEXTMENU_DJCOMMENTARYSETTINGS")) {
                    return G1("CONTEXTMENU_DJCOMMENTARYSETTINGS", "contextmenu/djcommentarysettings", 423, "contextmenu");
                }
                return null;
            case 387005411:
                if (str.equals("REINVENTFREE_SCRUB_UPSELL")) {
                    return J4();
                }
                return null;
            case 409704899:
                if (str.equals("GOLDENPATH_JRAMBHIA")) {
                    return G1("GOLDENPATH_JRAMBHIA", "goldenpath/jrambhia", 674, "goldenpath");
                }
                return null;
            case 530023331:
                if (str.equals("WATCHAPP_PLAYLIST_ENTITY")) {
                    return G1("WATCHAPP_PLAYLIST_ENTITY", "watchapp/playlist-entity", 2114, "watchapp");
                }
                return null;
            case 540437283:
                if (str.equals("LOGIN_CONTINUEWITH")) {
                    return G1("LOGIN_CONTINUEWITH", "login/continuewith", 945, "login");
                }
                return null;
            case 594277827:
                if (str.equals("PHONENUMBER_PHONENUMBERENTRY")) {
                    return G1("PHONENUMBER_PHONENUMBERENTRY", "phonenumber/phonenumberentry", 1437, "phonenumber");
                }
                return null;
            case 600623747:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_UNFINISHED")) {
                    return G1("COLLECTION_PODCASTS_EPISODES_UNFINISHED", "collection/podcasts/episodes/unfinished", 360, "collection");
                }
                return null;
            case 605043939:
                if (str.equals("BOOTCAMP_CHORDS")) {
                    return G1("BOOTCAMP_CHORDS", "bootcamp/chords", 240, "bootcamp");
                }
                return null;
            case 693049651:
                if (str.equals("GOLDENPATH_SFERGUSON")) {
                    return G1("GOLDENPATH_SFERGUSON", "goldenpath/sferguson", 747, "goldenpath");
                }
                return null;
            case 695023235:
                if (str.equals("ALLBOARDING_CONTEXTUALAUDIO")) {
                    return G1("ALLBOARDING_CONTEXTUALAUDIO", "allboarding/contextualaudio", 145, "allboarding");
                }
                return null;
            case 695354963:
                if (str.equals("WWW_ACCOUNT_PAGES_PRIVACY")) {
                    return G1("WWW_ACCOUNT_PAGES_PRIVACY", "www-account-pages/privacy", 2237, "www-account-pages");
                }
                return null;
            case 737531139:
                if (str.equals("S4P_WEB_VIEW_SUBSCRIPTION_ANALYTICS")) {
                    return G1("S4P_WEB_VIEW_SUBSCRIPTION_ANALYTICS", "s4p/web-view/subscription-analytics", 1772, "s4p");
                }
                return null;
            case 743834995:
                if (str.equals("WATCHAPP_DOWNLOADS_REMOTE_ONBOARDING")) {
                    return G1("WATCHAPP_DOWNLOADS_REMOTE_ONBOARDING", "watchapp/downloads/remote-onboarding", 2101, "watchapp");
                }
                return null;
            case 759834483:
                if (str.equals("WWW_ACCOUNT_PAGES_NOTIFICATIONS")) {
                    return G1("WWW_ACCOUNT_PAGES_NOTIFICATIONS", "www-account-pages/notifications", 2218, "www-account-pages");
                }
                return null;
            case 772779907:
                if (str.equals("CONTEXTMENU_PLAYLIST")) {
                    return a1();
                }
                return null;
            case 838864307:
                if (str.equals("BLUEJAY_CREATE")) {
                    return G1("BLUEJAY_CREATE", "bluejay/create", 229, "bluejay");
                }
                return null;
            case 903803939:
                if (str.equals("GOLDENPATH_OENGLOF")) {
                    return G1("GOLDENPATH_OENGLOF", "goldenpath/oenglof", 724, "goldenpath");
                }
                return null;
            case 923149811:
                if (str.equals("BILLING_PAGE")) {
                    return b0();
                }
                return null;
            case 949366003:
                if (str.equals("JAM_FREEUSERUPSELLSKIPSHEET")) {
                    return G1("JAM_FREEUSERUPSELLSKIPSHEET", "jam/freeuserupsellskipsheet", 855, "jam");
                }
                return null;
            case 991259219:
                if (str.equals("MRKT_ARTIST_EVENT")) {
                    return G1("MRKT_ARTIST_EVENT", "mrkt/artist/event", 1082, "mrkt");
                }
                return null;
            case 993848147:
                if (str.equals("SRC_RIGHTSHOLDER_DISPUTES_DETAILS")) {
                    return G1("SRC_RIGHTSHOLDER_DISPUTES_DETAILS", "src/rightsholder/disputes/details", 1973, "src");
                }
                return null;
            case 1067596771:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_CREATE")) {
                    return G1("MRKT_ARTIST_VIDEO_CLIPS_CREATE", "mrkt/artist/video/clips/create", 1153, "mrkt");
                }
                return null;
            case 1108095395:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_REVIEW")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_REVIEW", "spotify-for-authors/dvn-creation/review", 1946, "spotify-for-authors");
                }
                return null;
            case 1117056899:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD", "mrkt/artist/video/music-videos/upload", 1164, "mrkt");
                }
                return null;
            case 1152170019:
                if (str.equals("KID_ACCOUNT_TRANSITION_USER_INFO")) {
                    return G1("KID_ACCOUNT_TRANSITION_USER_INFO", "kid-account-transition/user-info", 898, "kid-account-transition");
                }
                return null;
            case 1230590739:
                if (str.equals("HOMETHING_SETTINGS")) {
                    return G1("HOMETHING_SETTINGS", "homething/settings", 826, "homething");
                }
                return null;
            case 1397496483:
                if (str.equals("MRKT_FRONTDOOR_CLAIM")) {
                    return G1("MRKT_FRONTDOOR_CLAIM", "mrkt/frontdoor/claim", 1244, "mrkt");
                }
                return null;
            case 1402029107:
                if (str.equals("FREETIER_TASTEONBOARDING_ARTISTPICKER")) {
                    return G1("FREETIER_TASTEONBOARDING_ARTISTPICKER", "freetier/tasteonboarding/artistpicker", 583, "freetier");
                }
                return null;
            case 1402914915:
                if (str.equals("BLEND_ENTITY_EDITNAME")) {
                    return d0();
                }
                return null;
            case 1418802883:
                if (str.equals("PARENTAL_CONTROL_LOGIN_CHOICE")) {
                    return l3();
                }
                return null;
            case 1439542467:
                if (str.equals("SPOTIFY_FOR_AUTHORS_NAVIGATION_ELEMENT")) {
                    return G1("SPOTIFY_FOR_AUTHORS_NAVIGATION_ELEMENT", "spotify-for-authors/navigation/element", 1950, "spotify-for-authors");
                }
                return null;
            case 1478676867:
                if (str.equals("PODCASTMIX_CONTROLS_MUSIC")) {
                    return G1("PODCASTMIX_CONTROLS_MUSIC", "podcastmix/controls/music", 1516, "podcastmix");
                }
                return null;
            case 1519238403:
                if (str.equals("S4P_ORG_EPISODES")) {
                    return G1("S4P_ORG_EPISODES", "s4p/org-episodes", 1723, "s4p");
                }
                return null;
            case 1534060195:
                if (str.equals("GOLDENPATH_KANAKOA")) {
                    return G1("GOLDENPATH_KANAKOA", "goldenpath/kanakoa", 680, "goldenpath");
                }
                return null;
            case 1548467619:
                if (str.equals("S4P_AUTHENTICATION_ACCOUNT_INFORMATION")) {
                    return G1("S4P_AUTHENTICATION_ACCOUNT_INFORMATION", "s4p/authentication/account-information", 1676, "s4p");
                }
                return null;
            case 1581916019:
                if (str.equals("STS_KUNGSHOLMEN_SEARCH")) {
                    return G1("STS_KUNGSHOLMEN_SEARCH", "sts/kungsholmen/search", 1989, "sts");
                }
                return null;
            case 1596865123:
                if (str.equals("GOLDENPATH_ACESHIGH")) {
                    return G1("GOLDENPATH_ACESHIGH", "goldenpath/aceshigh", 612, "goldenpath");
                }
                return null;
            case 1640749331:
                if (str.equals("GOLDENPATH_DORA_EXPLORER")) {
                    return G1("GOLDENPATH_DORA_EXPLORER", "goldenpath/dora_explorer", 637, "goldenpath");
                }
                return null;
            case 1715973731:
                if (str.equals("MARTINI_HISTORY")) {
                    return G1("MARTINI_HISTORY", "martini/history", 1017, "martini");
                }
                return null;
            case 1793703539:
                if (str.equals("COLLECTION_YOURHIGHLIGHTS")) {
                    return G1("COLLECTION_YOURHIGHLIGHTS", "collection/yourhighlights", 375, "collection");
                }
                return null;
            case 1800435251:
                if (str.equals("BLEND_INVITATION_GROUPBLENDSJOIN")) {
                    return G1("BLEND_INVITATION_GROUPBLENDSJOIN", "blend/invitation/groupblendsjoin", 221, "blend");
                }
                return null;
            case 1800791587:
                if (str.equals("MRKT_REQUEST_ACCESS_MOBILE_LAUNCHER")) {
                    return G1("MRKT_REQUEST_ACCESS_MOBILE_LAUNCHER", "mrkt/request-access/mobile-launcher", 1296, "mrkt");
                }
                return null;
            case 1856105507:
                if (str.equals("CONTEXTMENU_EPISODE_SLEEPTIMER")) {
                    return Z0();
                }
                return null;
            case 1913054451:
                if (str.equals("PODCAST_SHOW_RECOMMENDATIONS")) {
                    return G1("PODCAST_SHOW_RECOMMENDATIONS", "podcast/show/recommendations", 1501, "podcast");
                }
                return null;
            case 1926378275:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_REVIEW_SUBMIT")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_REVIEW_SUBMIT", "mrkt/artist/video/music-videos/upload/review-submit", 1167, "mrkt");
                }
                return null;
            case 1952314515:
                if (str.equals("LISTENINGPARTY_END_ROOM")) {
                    return G1("LISTENINGPARTY_END_ROOM", "listeningparty/end-room", 920, "listeningparty");
                }
                return null;
            case 1953253971:
                if (str.equals("MOMENTS")) {
                    return G1("MOMENTS", "moments", 1035, "moments");
                }
                return null;
            case 2080049043:
                if (str.equals("MRKT_ARTIST_PROFILE_AVATAR_EDIT")) {
                    return G1("MRKT_ARTIST_PROFILE_AVATAR_EDIT", "mrkt/artist/profile/avatar/edit", 1119, "mrkt");
                }
                return null;
            case 2086770419:
                if (str.equals("GOLDENPATH_ZEYNEPO")) {
                    return G1("GOLDENPATH_ZEYNEPO", "goldenpath/zeynepo", 763, "goldenpath");
                }
                return null;
            case 2113724179:
                if (str.equals("PROACTIVE_PLATFORMS_MIUI_NPV_WIDGET")) {
                    return G1("PROACTIVE_PLATFORMS_MIUI_NPV_WIDGET", "proactive-platforms/miui-npv-widget", 1565, "proactive-platforms");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 W() {
        return G1("AUDIOBOOK_DIRECTSALES_INAPPWEBCHECKOUTOVERLAY", "audiobook/directsales/inappwebcheckoutoverlay", 200, "audiobook");
    }

    public static p6r0 W0() {
        return G1("CONTEXTMENU_DJLANGUAGESETTINGS", "contextmenu/djlanguagesettings", 424, "contextmenu");
    }

    public static p6r0 W1() {
        return G1("HOME_TRENDING", "home/trending", 807, "home");
    }

    public static p6r0 W2() {
        return G1("NOTIFICATIONS_CENTER", "notifications-center", 1350, "notifications-center");
    }

    public static p6r0 W3() {
        return G1("PODCASTCHARTS_CHART", "podcastcharts/chart", 1511, "podcastcharts");
    }

    public static p6r0 W4() {
        return G1("SETTINGS", "settings", 1802, "settings");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 W5(String str) {
        switch (str.hashCode()) {
            case -2141454556:
                if (str.equals("CULTURALMOMENTSHUB")) {
                    return n1();
                }
                return null;
            case -2110631404:
                if (str.equals("S4P_AUDIENCE")) {
                    return G1("S4P_AUDIENCE", "s4p/audience", 1674, "s4p");
                }
                return null;
            case -2107929884:
                if (str.equals("PROACTIVE_PLATFORMS_COVER_SCREEN_WIDGET")) {
                    return i4();
                }
                return null;
            case -2096580956:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ANALYTICS")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ANALYTICS", "mrkt/artist/video/music-videos/analytics", 1160, "mrkt");
                }
                return null;
            case -2085701516:
                if (str.equals("SETTINGS_LANGUAGES_CONTENT_SEEALL")) {
                    return G1("SETTINGS_LANGUAGES_CONTENT_SEEALL", "settings/languages/content/seeAll", 1826, "settings");
                }
                return null;
            case -2084872204:
                if (str.equals("HOME_AUDIOBOOKS")) {
                    return P1();
                }
                return null;
            case -2040919724:
                if (str.equals("GRADUATION_TEEN_EDUCATION")) {
                    return G1("GRADUATION_TEEN_EDUCATION", "graduation/teen/education", 774, "graduation");
                }
                return null;
            case -2040358604:
                if (str.equals("NOWPLAYINGV2")) {
                    return G1("NOWPLAYINGV2", "nowplayingv2", 1366, "nowplayingv2");
                }
                return null;
            case -2034443276:
                if (str.equals("LYRICS")) {
                    return G1("LYRICS", "lyrics", 967, "lyrics");
                }
                return null;
            case -1961106604:
                if (str.equals("MANAGED_ACCOUNT_LINKING_PARENT_ACCEPT_INVITE")) {
                    return G1("MANAGED_ACCOUNT_LINKING_PARENT_ACCEPT_INVITE", "managed-account-linking/parent-accept-invite", 1008, "managed-account-linking");
                }
                return null;
            case -1947764636:
                if (str.equals("BLUEJAY_DISCLOSURE_SHEET")) {
                    return G1("BLUEJAY_DISCLOSURE_SHEET", "bluejay/disclosure-sheet", 230, "bluejay");
                }
                return null;
            case -1940850396:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_UNPLAYED")) {
                    return G1("COLLECTION_PODCASTS_EPISODES_UNPLAYED", "collection/podcasts/episodes/unplayed", 361, "collection");
                }
                return null;
            case -1936165724:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REDEMPTION_CODES")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REDEMPTION_CODES", "spotify-for-authors/audiobook/redemption-codes", 1938, "spotify-for-authors");
                }
                return null;
            case -1901128556:
                if (str.equals("SUPERBIRD_SETUP_DOWNLOADED")) {
                    return G1("SUPERBIRD_SETUP_DOWNLOADED", "superbird/setup/downloaded", 2008, "superbird");
                }
                return null;
            case -1889875500:
                if (str.equals("SEARCH_AUDIOS")) {
                    return G1("SEARCH_AUDIOS", "search/audios", 1782, "search");
                }
                return null;
            case -1867722828:
                if (str.equals("LYRICS_SHARE")) {
                    return G1("LYRICS_SHARE", "lyrics/share", 971, "lyrics");
                }
                return null;
            case -1867719372:
                if (str.equals("LYRICS_SHEET")) {
                    return G1("LYRICS_SHEET", "lyrics/sheet", 973, "lyrics");
                }
                return null;
            case -1864941532:
                if (str.equals("PREMIUM_MINI_REWARDS")) {
                    return G1("PREMIUM_MINI_REWARDS", "premium-mini/rewards", 1555, "premium-mini");
                }
                return null;
            case -1838447148:
                if (str.equals("MRKT_ARTIST_AUDIENCE_SEGMENTS")) {
                    return G1("MRKT_ARTIST_AUDIENCE_SEGMENTS", "mrkt/artist/audience/segments", 1054, "mrkt");
                }
                return null;
            case -1820543516:
                if (str.equals("LEGACYSHARE_POSTTO")) {
                    return G1("LEGACYSHARE_POSTTO", "legacyshare/postto", 906, "legacyshare");
                }
                return null;
            case -1793502060:
                if (str.equals("AUDIOBOOK_TOPUP_SUCCESS")) {
                    return G1("AUDIOBOOK_TOPUP_SUCCESS", "audiobook/topup/success", 207, "audiobook");
                }
                return null;
            case -1769228796:
                if (str.equals("WWW_ACCOUNT_PAGES_DYNAMICHERO")) {
                    return G1("WWW_ACCOUNT_PAGES_DYNAMICHERO", "www-account-pages/dynamichero", 2197, "www-account-pages");
                }
                return null;
            case -1721634556:
                if (str.equals("MRKT_WAITING_ROOM_MUSIC")) {
                    return G1("MRKT_WAITING_ROOM_MUSIC", "mrkt/waiting-room/music", 1333, "mrkt");
                }
                return null;
            case -1684633244:
                if (str.equals("LOGIN_DIALOG_PASSKEY_NOT_FOUND")) {
                    return A2();
                }
                return null;
            case -1658207804:
                if (str.equals("S4P_DEBUG_TEST_ACCOUNT_SWITCHER")) {
                    return G1("S4P_DEBUG_TEST_ACCOUNT_SWITCHER", "s4p/debug/test-account-switcher", 1704, "s4p");
                }
                return null;
            case -1632946364:
                if (str.equals("WEAR_DOWNLOAD_UPSELL")) {
                    return G1("WEAR_DOWNLOAD_UPSELL", "wear/download_upsell", 2139, "wear");
                }
                return null;
            case -1611975004:
                if (str.equals("SUPERBIRD_SETUP_BLUETOOTHSETTINGS")) {
                    return G1("SUPERBIRD_SETUP_BLUETOOTHSETTINGS", "superbird/setup/bluetoothsettings", 2001, "superbird");
                }
                return null;
            case -1584801772:
                if (str.equals("MRKT_CHARTS_ONBOARDING")) {
                    return G1("MRKT_CHARTS_ONBOARDING", "mrkt/charts/onboarding", 1198, "mrkt");
                }
                return null;
            case -1542908700:
                if (str.equals("BROWSE_TOPPODCAST")) {
                    return G1("BROWSE_TOPPODCAST", "browse/toppodcast", 253, "browse");
                }
                return null;
            case -1527507436:
                if (str.equals("SPOTIFY_FOR_AUTHORS_ANALYTICS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_ANALYTICS", "spotify-for-authors/analytics", 1933, "spotify-for-authors");
                }
                return null;
            case -1493192396:
                if (str.equals("SMARTSHUFFLE_PLAYMODEPICKER")) {
                    return p5();
                }
                return null;
            case -1442050444:
                if (str.equals("SETTINGS_ADS")) {
                    return Y4();
                }
                return null;
            case -1430649660:
                if (str.equals("LISTENINGSTATS")) {
                    return t2();
                }
                return null;
            case -1346089660:
                if (str.equals("SETTINGS_SEARCH")) {
                    return g5();
                }
                return null;
            case -1258873548:
                if (str.equals("S4P_DEBUG_CONSOLE_LOGGER")) {
                    return G1("S4P_DEBUG_CONSOLE_LOGGER", "s4p/debug/console-logger", 1698, "s4p");
                }
                return null;
            case -1236453324:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTALLOWLISTINGREQUESTS")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTALLOWLISTINGREQUESTS", "www-account-pages/parental-settings/managedaccountallowlistingrequests", 2225, "www-account-pages");
                }
                return null;
            case -1127220668:
                if (str.equals("GOLDENPATH_MCOOK")) {
                    return G1("GOLDENPATH_MCOOK", "goldenpath/mcook", 701, "goldenpath");
                }
                return null;
            case -1116723772:
                if (str.equals("CONTENT_FEED")) {
                    return G1("CONTENT_FEED", "content-feed", 411, "content-feed");
                }
                return null;
            case -1069963820:
                if (str.equals("FREETIER_DATASAVER_LEARNMORE")) {
                    return G1("FREETIER_DATASAVER_LEARNMORE", "freetier/datasaver/learnmore", 581, "freetier");
                }
                return null;
            case -1055156540:
                if (str.equals("MRKT_BULK_CAMPAIGNS_FORECAST_REVIEW")) {
                    return G1("MRKT_BULK_CAMPAIGNS_FORECAST_REVIEW", "mrkt/bulk-campaigns/forecast/review", 1189, "mrkt");
                }
                return null;
            case -1045867500:
                if (str.equals("DATASAVERMODE_SETTINGS")) {
                    return G1("DATASAVERMODE_SETTINGS", "datasavermode/settings", 471, "datasavermode");
                }
                return null;
            case -1039543452:
                if (str.equals("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION")) {
                    return G1("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION", "s4p/claim-podcast/podcast-verification", 1686, "s4p");
                }
                return null;
            case -948330124:
                if (str.equals("WATCHAPP_DOWNLOADS_MIXED_MEDIA_AUDIOBOOKS")) {
                    return G1("WATCHAPP_DOWNLOADS_MIXED_MEDIA_AUDIOBOOKS", "watchapp/downloads/mixed-media-audiobooks", 2099, "watchapp");
                }
                return null;
            case -946566668:
                if (str.equals("CAR_MODE_ENTITY")) {
                    return G1("CAR_MODE_ENTITY", "car-mode/entity", 274, "car-mode");
                }
                return null;
            case -872390444:
                if (str.equals("STS_KUNGSHOLMEN")) {
                    return G1("STS_KUNGSHOLMEN", "sts/kungsholmen", 1986, "sts");
                }
                return null;
            case -869956988:
                if (str.equals("MRKT_ARTIST_PROFILE_CATALOG_RELEASE")) {
                    return G1("MRKT_ARTIST_PROFILE_CATALOG_RELEASE", "mrkt/artist/profile/catalog/release", 1122, "mrkt");
                }
                return null;
            case -864836716:
                if (str.equals("PODCAST_SPONSORS")) {
                    return T3();
                }
                return null;
            case -824490652:
                if (str.equals("WATCHAPP_QUEUE")) {
                    return G1("WATCHAPP_QUEUE", "watchapp/queue", 2118, "watchapp");
                }
                return null;
            case -789663212:
                if (str.equals("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS")) {
                    return f5();
                }
                return null;
            case -762145692:
                if (str.equals("MRKT_LABS_ARTIST_HISTORY")) {
                    return G1("MRKT_LABS_ARTIST_HISTORY", "mrkt/labs/artist-history", 1282, "mrkt");
                }
                return null;
            case -757521356:
                if (str.equals("GOLDENPATH_GAVIND")) {
                    return G1("GOLDENPATH_GAVIND", "goldenpath/gavind", 649, "goldenpath");
                }
                return null;
            case -753597324:
                if (str.equals("CONTEXTMENU_REMOTEDOWNLOADS")) {
                    return b1();
                }
                return null;
            case -744002492:
                if (str.equals("GOLDENPATH_ODIMITROV")) {
                    return G1("GOLDENPATH_ODIMITROV", "goldenpath/odimitrov", 723, "goldenpath");
                }
                return null;
            case -735641644:
                if (str.equals("FRIENDSHOME")) {
                    return G1("FRIENDSHOME", "friendshome", 594, "friendshome");
                }
                return null;
            case -731229644:
                if (str.equals("PROACTIVE_PLATFORMS_RECOMMENDATIONS_WIDGET")) {
                    return G1("PROACTIVE_PLATFORMS_RECOMMENDATIONS_WIDGET", "proactive-platforms/recommendations-widget", 1567, "proactive-platforms");
                }
                return null;
            case -714889724:
                if (str.equals("ADSTUDIO_SBL_DOWNLOAD_CHARTS")) {
                    return G1("ADSTUDIO_SBL_DOWNLOAD_CHARTS", "adstudio/sbl/download-charts", 112, "adstudio");
                }
                return null;
            case -705422764:
                if (str.equals("CONTEXTMENU_DJSUBMITFEEDBACK")) {
                    return G1("CONTEXTMENU_DJSUBMITFEEDBACK", "contextmenu/djsubmitfeedback", 426, "contextmenu");
                }
                return null;
            case -643672876:
                if (str.equals("S4P_PODCAST")) {
                    return G1("S4P_PODCAST", "s4p/podcast", 1724, "s4p");
                }
                return null;
            case -606254908:
                if (str.equals("BOOTCAMP_EASTEREGGS")) {
                    return G1("BOOTCAMP_EASTEREGGS", "bootcamp/eastereggs", 241, "bootcamp");
                }
                return null;
            case -592396652:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2")) {
                    return G1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2", "www-account-pages/login-methods-v2", 2212, "www-account-pages");
                }
                return null;
            case -582274476:
                if (str.equals("ADS_FEEDBACK")) {
                    return C();
                }
                return null;
            case -521702876:
                if (str.equals("WWW_ACCOUNT_PAGES_PAYMENT_METHODS")) {
                    return G1("WWW_ACCOUNT_PAGES_PAYMENT_METHODS", "www-account-pages/payment-methods", 2234, "www-account-pages");
                }
                return null;
            case -517982140:
                if (str.equals("AAA_CON")) {
                    return o();
                }
                return null;
            case -463710892:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DETAIL")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_DETAIL", "mrkt/artist/campaigns/detail", 1060, "mrkt");
                }
                return null;
            case -462240060:
                if (str.equals("FREETIER_TASTEONBOARDING_SWIPETRACKS")) {
                    return G1("FREETIER_TASTEONBOARDING_SWIPETRACKS", "freetier/tasteonboarding/swipetracks", 588, "freetier");
                }
                return null;
            case -454901996:
                if (str.equals("CHAT_EDIT_GROUP_DETAILS")) {
                    return t0();
                }
                return null;
            case -429709356:
                if (str.equals("ADDRESS")) {
                    return A();
                }
                return null;
            case -425984668:
                if (str.equals("EPISODECHAPTERS_NPV_FULLSCREEN")) {
                    return G1("EPISODECHAPTERS_NPV_FULLSCREEN", "episodechapters/npv/fullscreen", 526, "episodechapters");
                }
                return null;
            case -346283260:
                if (str.equals("PARENTAL_CONTROL_ACCOUNT_DETAILS")) {
                    return i3();
                }
                return null;
            case -298340604:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_TRACK")) {
                    return G1("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_TRACK", "mrkt/artist/video/clips/create/select-track", 1155, "mrkt");
                }
                return null;
            case -264791340:
                if (str.equals("CONCERTS_CONCERT")) {
                    return R0();
                }
                return null;
            case -209782908:
                if (str.equals("ADSTUDIO_EVENTS_CAPI_CREATE")) {
                    return G1("ADSTUDIO_EVENTS_CAPI_CREATE", "adstudio/events/capi/create", 99, "adstudio");
                }
                return null;
            case -205387212:
                if (str.equals("PLAYLIST_EDIT_COVERART")) {
                    return G3();
                }
                return null;
            case -147487452:
                if (str.equals("PRERELEASE_AUDIOBOOK")) {
                    return G1("PRERELEASE_AUDIOBOOK", "prerelease/audiobook", 1560, "prerelease");
                }
                return null;
            case -146998316:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_INFO")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_INFO", "mrkt/debug/hubs/component-info", 1202, "mrkt");
                }
                return null;
            case -55289900:
                if (str.equals("REINVENTFREE_UPNEXT")) {
                    return G1("REINVENTFREE_UPNEXT", "reinventfree-upnext", 1647, "reinventfree-upnext");
                }
                return null;
            case 3165572:
                if (str.equals("DIALOG_CONNECTOAUTH")) {
                    return G1("DIALOG_CONNECTOAUTH", "dialog/connectoauth", 478, "dialog");
                }
                return null;
            case 39151668:
                if (str.equals("GOLDENPATH_MBOWALLIUS")) {
                    return G1("GOLDENPATH_MBOWALLIUS", "goldenpath/mbowallius", 698, "goldenpath");
                }
                return null;
            case 139653972:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_DENOMINATION_SELECTION")) {
                    return G1("PREMIUM_ACCOUNT_MANAGEMENT_DENOMINATION_SELECTION", "premium-account-management/denomination-selection", 1542, "premium-account-management");
                }
                return null;
            case 180211188:
                if (str.equals("COMMENTS")) {
                    return G1("COMMENTS", "comments", 376, "comments");
                }
                return null;
            case 184054596:
                if (str.equals("ADSTUDIO_BUSINESS_PARTNERS")) {
                    return G1("ADSTUDIO_BUSINESS_PARTNERS", "adstudio/business/partners", 56, "adstudio");
                }
                return null;
            case 212493172:
                if (str.equals("BUNDLING_SURVEY_WEBVIEW")) {
                    return G1("BUNDLING_SURVEY_WEBVIEW", "bundling/survey/webview", 259, "bundling");
                }
                return null;
            case 215512676:
                if (str.equals("SOCIAL_LISTENING_MARACASDIALOG")) {
                    return G1("SOCIAL_LISTENING_MARACASDIALOG", "social-listening/maracasdialog", 1909, "social-listening");
                }
                return null;
            case 234616868:
                if (str.equals("ARTISTS_DNA")) {
                    return G1("ARTISTS_DNA", "artists-dna", 180, "artists-dna");
                }
                return null;
            case 252438516:
                if (str.equals("BUNDLING_PLACEBO")) {
                    return G1("BUNDLING_PLACEBO", "bundling/placebo", 257, "bundling");
                }
                return null;
            case 281520196:
                if (str.equals("SETTINGS_PARENTAL_CONTROLS")) {
                    return G1("SETTINGS_PARENTAL_CONTROLS", "settings/parental-controls", 1841, "settings");
                }
                return null;
            case 290645172:
                if (str.equals("IRONCHEF_ENTITY")) {
                    return G1("IRONCHEF_ENTITY", "ironchef/entity", 848, "ironchef");
                }
                return null;
            case 312413924:
                if (str.equals("PODCAST")) {
                    return G1("PODCAST", "podcast", 1477, "podcast");
                }
                return null;
            case 322560900:
                if (str.equals("MAGPIE_GENERATION_MODE")) {
                    return G1("MAGPIE_GENERATION_MODE", "magpie/generation-mode", 981, "magpie");
                }
                return null;
            case 329690372:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_FULL_SERVICE_AUDIO")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_FULL_SERVICE_AUDIO", "adstudio/duplicate-ad-set-only/ad-full-service-audio", 83, "adstudio");
                }
                return null;
            case 340333268:
                if (str.equals("INAPPMESSAGE_EXTERNAL_WEB")) {
                    return G1("INAPPMESSAGE_EXTERNAL_WEB", "inappmessage/external-web", 832, "inappmessage");
                }
                return null;
            case 426046980:
                if (str.equals("ARTIST_RELATED_VIDEOS")) {
                    return G1("ARTIST_RELATED_VIDEOS", "artist/related-videos", 174, "artist");
                }
                return null;
            case 434231668:
                if (str.equals("MAGPIE_REPORT_WEBVIEW")) {
                    return G1("MAGPIE_REPORT_WEBVIEW", "magpie/report-webview", 986, "magpie");
                }
                return null;
            case 440774756:
                if (str.equals("XRPROJECTED_NOW_PLAYING")) {
                    return G1("XRPROJECTED_NOW_PLAYING", "xrprojected/now_playing", 2249, "xrprojected");
                }
                return null;
            case 446663844:
                if (str.equals("WATCHAPP_LOCKED_AUDIOBOOK_POPUP")) {
                    return G1("WATCHAPP_LOCKED_AUDIOBOOK_POPUP", "watchapp/locked-audiobook-popup", 2110, "watchapp");
                }
                return null;
            case 459940308:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGES_EDIT")) {
                    return G1("MRKT_ARTIST_PROFILE_IMAGES_EDIT", "mrkt/artist/profile/images/edit", 1131, "mrkt");
                }
                return null;
            case 473239652:
                if (str.equals("PARROT_ONBOARDING")) {
                    return G1("PARROT_ONBOARDING", "parrot/onboarding", 1422, "parrot");
                }
                return null;
            case 478324612:
                if (str.equals("WWW_ACCOUNT_PAGES_PRICECHANGE")) {
                    return G1("WWW_ACCOUNT_PAGES_PRICECHANGE", "www-account-pages/pricechange", 2236, "www-account-pages");
                }
                return null;
            case 534046532:
                if (str.equals("ARTIST_RELEASES")) {
                    return G1("ARTIST_RELEASES", "artist/releases", 175, "artist");
                }
                return null;
            case 537108484:
                if (str.equals("BROWSE_PODCASTS")) {
                    return G1("BROWSE_PODCASTS", "browse/podcasts", 252, "browse");
                }
                return null;
            case 546993028:
                if (str.equals("FRIENDSACTIVITY")) {
                    return G1("FRIENDSACTIVITY", "friendsactivity", 591, "friendsactivity");
                }
                return null;
            case 669598772:
                if (str.equals("LISTENINGPARTY_TEST_ROOM")) {
                    return G1("LISTENINGPARTY_TEST_ROOM", "listeningparty/test-room", 924, "listeningparty");
                }
                return null;
            case 678089780:
                if (str.equals("MRKT_USER_SETTINGS_ACCOUNT")) {
                    return G1("MRKT_USER_SETTINGS_ACCOUNT", "mrkt/user-settings/account", 1325, "mrkt");
                }
                return null;
            case 711805700:
                if (str.equals("MRKT_ARTIST_AUDIENCE_WEB_VIEW")) {
                    return G1("MRKT_ARTIST_AUDIENCE_WEB_VIEW", "mrkt/artist/audience-web-view", 1043, "mrkt");
                }
                return null;
            case 734462836:
                if (str.equals("MRKT_LICENSOR_DISCOVERYMODE_TERMS")) {
                    return G1("MRKT_LICENSOR_DISCOVERYMODE_TERMS", "mrkt/licensor/discoverymode/terms", 1289, "mrkt");
                }
                return null;
            case 801488388:
                if (str.equals("GOLDENPATH_EHAMALAINEN")) {
                    return G1("GOLDENPATH_EHAMALAINEN", "goldenpath/ehamalainen", 638, "goldenpath");
                }
                return null;
            case 960789092:
                if (str.equals("AI_DISCLOSURE")) {
                    return H();
                }
                return null;
            case 1006570548:
                if (str.equals("MRKT_ARTIST_VIDEO")) {
                    return G1("MRKT_ARTIST_VIDEO", "mrkt/artist/video", 1149, "mrkt");
                }
                return null;
            case 1073760724:
                if (str.equals("LOGIN_CONNECT")) {
                    return G1("LOGIN_CONNECT", "login/connect", 944, "login");
                }
                return null;
            case 1079817220:
                if (str.equals("PRERELEASE")) {
                    return h4();
                }
                return null;
            case 1108976772:
                if (str.equals("GOLDENPATH_ALISHERS")) {
                    return G1("GOLDENPATH_ALISHERS", "goldenpath/alishers", 617, "goldenpath");
                }
                return null;
            case 1132747204:
                if (str.equals("SIGNUP_BIRTHDAY")) {
                    return G1("SIGNUP_BIRTHDAY", "signup/birthday", 1886, "signup");
                }
                return null;
            case 1136510724:
                if (str.equals("SEARCH_LOADING_INSTANT_MIX")) {
                    return V4();
                }
                return null;
            case 1179464676:
                if (str.equals("MRKT_ARTIST_PROFILE_PLAYLISTS")) {
                    return G1("MRKT_ARTIST_PROFILE_PLAYLISTS", "mrkt/artist/profile/playlists", 1134, "mrkt");
                }
                return null;
            case 1196553156:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_STATS")) {
                    return G1("MRKT_ARTIST_PRE_RELEASE_STATS", "mrkt/artist/pre-release/stats", 1110, "mrkt");
                }
                return null;
            case 1246929492:
                if (str.equals("YOURLIBRARY_DOWNLOADS")) {
                    return G1("YOURLIBRARY_DOWNLOADS", "yourlibrary/downloads", 2262, "yourlibrary");
                }
                return null;
            case 1255671636:
                if (str.equals("CHARTS_CHART")) {
                    return G1("CHARTS_CHART", "charts/chart", 306, "charts");
                }
                return null;
            case 1302680548:
                if (str.equals("SEARCH_LAST_24_HOURS")) {
                    return G1("SEARCH_LAST_24_HOURS", "search/last_24_hours", 1788, "search");
                }
                return null;
            case 1343024516:
                if (str.equals("PODCAST_SHOW_INTERACTIVEAUDIOBOOK")) {
                    return G1("PODCAST_SHOW_INTERACTIVEAUDIOBOOK", "podcast/show/interactiveaudiobook", 1497, "podcast");
                }
                return null;
            case 1344095988:
                if (str.equals("MRKT_WRAPPED")) {
                    return G1("MRKT_WRAPPED", "mrkt/wrapped", 1337, "mrkt");
                }
                return null;
            case 1363441124:
                if (str.equals("SHARE_FACEBOOKFEED")) {
                    return G1("SHARE_FACEBOOKFEED", "share/facebookfeed", 1860, "share");
                }
                return null;
            case 1375913652:
                if (str.equals("CHECKOUT_UNIFIEDCHECKOUT_WEB")) {
                    return G1("CHECKOUT_UNIFIEDCHECKOUT_WEB", "checkout/unifiedcheckout-web", 340, "checkout");
                }
                return null;
            case 1377694068:
                if (str.equals("CONTEXTMENU_ENTITYSEGMENTS")) {
                    return X0();
                }
                return null;
            case 1422973188:
                if (str.equals("FACEBOOK_WEBVIEWPERMISSIONS")) {
                    return G1("FACEBOOK_WEBVIEWPERMISSIONS", "facebook/webviewpermissions", 543, "facebook");
                }
                return null;
            case 1483827316:
                if (str.equals("PODCASTMIX_CONTROLS_SHOWS")) {
                    return G1("PODCASTMIX_CONTROLS_SHOWS", "podcastmix/controls/shows", 1517, "podcastmix");
                }
                return null;
            case 1492856420:
                if (str.equals("GOLDENPATH_GONZALOC")) {
                    return G1("GOLDENPATH_GONZALOC", "goldenpath/gonzaloc", 651, "goldenpath");
                }
                return null;
            case 1497854532:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_SUB_ACCOUNT_ALLOCATION_REQUEST_DIALOG")) {
                    return e4();
                }
                return null;
            case 1499400516:
                if (str.equals("BLUEJAY_BRIEF_PRESET_PREVIEW")) {
                    return G1("BLUEJAY_BRIEF_PRESET_PREVIEW", "bluejay/brief-preset-preview", 225, "bluejay");
                }
                return null;
            case 1512231796:
                if (str.equals("MANAGE_ACTIVITY_FEED")) {
                    return G1("MANAGE_ACTIVITY_FEED", "manage/activity-feed", 993, "manage");
                }
                return null;
            case 1557571572:
                if (str.equals("MRKT_INVITE_TOKEN")) {
                    return G1("MRKT_INVITE_TOKEN", "mrkt/invite/token", 1280, "mrkt");
                }
                return null;
            case 1579450644:
                if (str.equals("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_DOWNLOADS")) {
                    return G1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_DOWNLOADS", "wear/settings/audio_quality_settings/downloads", 2162, "wear");
                }
                return null;
            case 1609417508:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_ERRORS")) {
                    return G1("MRKT_BTC_BOOKING_UPLOAD_ERRORS", "mrkt/btc/booking/upload/errors", 1183, "mrkt");
                }
                return null;
            case 1619006564:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY")) {
                    return G1("MRKT_FRONTDOOR_FAN_STUDY", "mrkt/frontdoor/fan-study", 1250, "mrkt");
                }
                return null;
            case 1623116020:
                if (str.equals("CELEBRITYBLEND_ENTITY")) {
                    return G1("CELEBRITYBLEND_ENTITY", "celebrityblend/entity", 289, "celebrityblend");
                }
                return null;
            case 1650968964:
                if (str.equals("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_CELLULAR_STREAMING")) {
                    return G1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_CELLULAR_STREAMING", "wear/settings/audio_quality_settings/cellular_streaming", 2161, "wear");
                }
                return null;
            case 1676429188:
                if (str.equals("REMOTECONFIGURATION_DEBUG")) {
                    return G1("REMOTECONFIGURATION_DEBUG", "remoteconfiguration/debug", 1649, "remoteconfiguration");
                }
                return null;
            case 1693982404:
                if (str.equals("CONTEXTMENU_YOURUPDATES_NOTIFICATION")) {
                    return G1("CONTEXTMENU_YOURUPDATES_NOTIFICATION", "contextmenu/yourupdates/notification", 446, "contextmenu");
                }
                return null;
            case 1707342868:
                if (str.equals("SPOTIFY_FOR_AUTHORS_PAYMENT")) {
                    return G1("SPOTIFY_FOR_AUTHORS_PAYMENT", "spotify-for-authors/payment", 1953, "spotify-for-authors");
                }
                return null;
            case 1711767796:
                if (str.equals("NOWPLAYING_NOWPLAYINGBAR")) {
                    return Y2();
                }
                return null;
            case 1746926596:
                if (str.equals("COVERIMAGE")) {
                    return G1("COVERIMAGE", "coverimage", 461, "coverimage");
                }
                return null;
            case 1749009636:
                if (str.equals("MRKT_ARTIST_PROFILE_ARTISTPICK_EDIT")) {
                    return G1("MRKT_ARTIST_PROFILE_ARTISTPICK_EDIT", "mrkt/artist/profile/artistpick/edit", 1116, "mrkt");
                }
                return null;
            case 1780651236:
                if (str.equals("S4P_SETTINGS_PUSH_NOTIFICATION")) {
                    return G1("S4P_SETTINGS_PUSH_NOTIFICATION", "s4p/settings/push-notification", 1747, "s4p");
                }
                return null;
            case 1868301812:
                if (str.equals("CONTEXTMENU_SENDTO")) {
                    return G1("CONTEXTMENU_SENDTO", "contextmenu/sendto", 438, "contextmenu");
                }
                return null;
            case 1870260196:
                if (str.equals("ADSTUDIO_SBL_CREATE")) {
                    return G1("ADSTUDIO_SBL_CREATE", "adstudio/sbl/create", 110, "adstudio");
                }
                return null;
            case 1875115204:
                if (str.equals("MRKT_FRONTDOOR_NEW_RELEASES")) {
                    return G1("MRKT_FRONTDOOR_NEW_RELEASES", "mrkt/frontdoor/new-releases", 1265, "mrkt");
                }
                return null;
            case 1902907348:
                if (str.equals("CONTRIBUTION_NOTES_REPORT_ACTION")) {
                    return i1();
                }
                return null;
            case 1911560884:
                if (str.equals("MRKT_TEAM_MANAGEMENT_INVITE")) {
                    return G1("MRKT_TEAM_MANAGEMENT_INVITE", "mrkt/team-management/invite", 1310, "mrkt");
                }
                return null;
            case 1944073668:
                if (str.equals("SUPERBIRD_SETUP_CONTROLOTHERMEDIA")) {
                    return G1("SUPERBIRD_SETUP_CONTROLOTHERMEDIA", "superbird/setup/controlothermedia", 2006, "superbird");
                }
                return null;
            case 1972339428:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_REVIEW")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_REVIEW", "mrkt/artist/campaigns/marquee-and-showcase/update/review", 1079, "mrkt");
                }
                return null;
            case 1990866692:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_REVIEW")) {
                    return G1("SPOTIFY_FOR_AUTHORS_UPLOAD_REVIEW", "spotify-for-authors/upload/review", 1959, "spotify-for-authors");
                }
                return null;
            case 2016112820:
                if (str.equals("ADS_IN_APP_WEB_BROWSER")) {
                    return G1("ADS_IN_APP_WEB_BROWSER", "ads/in-app-web-browser", 22, "ads");
                }
                return null;
            case 2065893716:
                if (str.equals("COMMENTS_REACTION_SHEET")) {
                    return G1("COMMENTS_REACTION_SHEET", "comments/reaction-sheet", 378, "comments");
                }
                return null;
            case 2093818740:
                if (str.equals("FRIENDSHOME_LISTENERS")) {
                    return G1("FRIENDSHOME_LISTENERS", "friendshome/listeners", 597, "friendshome");
                }
                return null;
            case 2101448884:
                if (str.equals("PREMIUM_CONSIDERATION")) {
                    return G1("PREMIUM_CONSIDERATION", "premium-consideration", 1550, "premium-consideration");
                }
                return null;
            case 2102661044:
                if (str.equals("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION_COMPLETE")) {
                    return G1("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION_COMPLETE", "s4p/claim-podcast/podcast-verification-complete", 1687, "s4p");
                }
                return null;
            case 2110700660:
                if (str.equals("PLAYLIST_EDITORS_PICKER")) {
                    return H3();
                }
                return null;
            case 2127858420:
                if (str.equals("MRKT_TEAM_MANAGEMENT")) {
                    return G1("MRKT_TEAM_MANAGEMENT", "mrkt/team-management", 1304, "mrkt");
                }
                return null;
            case 2137382628:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ROOT")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ROOT", "mrkt/artist/video/music-videos/root", 1163, "mrkt");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 X() {
        return G1("AUDIOBOOK_SUPPLEMENTARYMATERIAL", "audiobook/supplementarymaterial", 205, "audiobook");
    }

    public static p6r0 X0() {
        return G1("CONTEXTMENU_ENTITYSEGMENTS", "contextmenu/entitysegments", 428, "contextmenu");
    }

    public static p6r0 X1() {
        return G1("HOME_UNKNOWN", "home/unknown", 808, "home");
    }

    public static p6r0 X2() {
        return G1("NOWPLAYING", "nowplaying", 1353, "nowplaying");
    }

    public static p6r0 X3() {
        return G1("PODCASTCHARTS_REGIONS", "podcastcharts/regions", 1512, "podcastcharts");
    }

    public static p6r0 X4() {
        return G1("SETTINGS_ACCOUNT", "settings/account", 1804, "settings");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 X5(String str) {
        switch (str.hashCode()) {
            case -2140865915:
                if (str.equals("PLAYLIST_FILTER")) {
                    return G1("PLAYLIST_FILTER", "playlist/filter", 1461, "playlist");
                }
                return null;
            case -1978607691:
                if (str.equals("S4P_QNA_EDIT")) {
                    return G1("S4P_QNA_EDIT", "s4p/qna/edit", 1740, "s4p");
                }
                return null;
            case -1971276075:
                if (str.equals("ADSTUDIO_EDIT_CAMPAIGN_CONFIRMATION")) {
                    return G1("ADSTUDIO_EDIT_CAMPAIGN_CONFIRMATION", "adstudio/edit/campaign/confirmation", 96, "adstudio");
                }
                return null;
            case -1932858987:
                if (str.equals("SIGNUP_EMAIL")) {
                    return m5();
                }
                return null;
            case -1929971707:
                if (str.equals("NOWPLAYING_PLAYBACKSETTINGS")) {
                    return b3();
                }
                return null;
            case -1896149659:
                if (str.equals("FREE_TIER_ALBUM")) {
                    return G1("FREE_TIER_ALBUM", "free-tier-album", 563, "free-tier-album");
                }
                return null;
            case -1888478443:
                if (str.equals("START_CHOOSELOGIN")) {
                    return u5();
                }
                return null;
            case -1831391931:
                if (str.equals("INAPPMESSAGE_WEBVIEW")) {
                    return h2();
                }
                return null;
            case -1830276555:
                if (str.equals("COLLECTION_ALBUMS_ALBUM")) {
                    return G1("COLLECTION_ALBUMS_ALBUM", "collection/albums/album", 348, "collection");
                }
                return null;
            case -1730409339:
                if (str.equals("PERMISSIONS_LOCATION_ALREADY_GRANTED")) {
                    return G1("PERMISSIONS_LOCATION_ALREADY_GRANTED", "permissions/location/already-granted", 1431, "permissions");
                }
                return null;
            case -1671396523:
                if (str.equals("PARENTAL_CONTROL_UPDATE_NAME")) {
                    return s3();
                }
                return null;
            case -1670278011:
                if (str.equals("HOME_TRENDING")) {
                    return W1();
                }
                return null;
            case -1659903323:
                if (str.equals("HOME_MUSIC")) {
                    return Q1();
                }
                return null;
            case -1645884139:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_MUSIC_AND_RIGHTS")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_MUSIC_AND_RIGHTS", "mrkt/artist/video/music-videos/upload/music-and-rights", 1166, "mrkt");
                }
                return null;
            case -1636233659:
                if (str.equals("MANAGE_PARTNERS")) {
                    return G1("MANAGE_PARTNERS", "manage/partners", 1000, "manage");
                }
                return null;
            case -1561651963:
                if (str.equals("NOWPLAYING_GENIUSCARDS")) {
                    return G1("NOWPLAYING_GENIUSCARDS", "nowplaying/geniuscards", 1354, "nowplaying");
                }
                return null;
            case -1553442779:
                if (str.equals("WWW_ACCOUNT_PAGES_FAMILYDUO")) {
                    return G1("WWW_ACCOUNT_PAGES_FAMILYDUO", "www-account-pages/familyduo", 2199, "www-account-pages");
                }
                return null;
            case -1551411963:
                if (str.equals("HOME_WRAPPED")) {
                    return Z1();
                }
                return null;
            case -1493336379:
                if (str.equals("PLAYLIST_CREATE_EUTERPE_REPORT_A_PROBLEM")) {
                    return F3();
                }
                return null;
            case -1448222699:
                if (str.equals("MRKT_TEAM_MANAGEMENT_ACCEPT_INVITE")) {
                    return G1("MRKT_TEAM_MANAGEMENT_ACCEPT_INVITE", "mrkt/team-management/accept-invite", 1305, "mrkt");
                }
                return null;
            case -1430655067:
                if (str.equals("S4P_BLOCKED_USERS")) {
                    return G1("S4P_BLOCKED_USERS", "s4p/blocked-users", 1679, "s4p");
                }
                return null;
            case -1410148795:
                if (str.equals("LINGO_HOME")) {
                    return G1("LINGO_HOME", "lingo/home", 909, "lingo");
                }
                return null;
            case -1385774139:
                if (str.equals("SHOWS_NETWORK")) {
                    return G1("SHOWS_NETWORK", "shows/network", 1877, "shows");
                }
                return null;
            case -1381827995:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_COLLECTEMAIL")) {
                    return G1("LOGIN_ACCOUNTRECOVERY_COLLECTEMAIL", "login/accountrecovery/collectemail", 939, "login");
                }
                return null;
            case -1357663499:
                if (str.equals("S4P_CREATION_IMPORT")) {
                    return G1("S4P_CREATION_IMPORT", "s4p/creation/import", 1695, "s4p");
                }
                return null;
            case -1349778923:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE", "mrkt/artist/campaigns/marquee-and-showcase", 1065, "mrkt");
                }
                return null;
            case -1318152811:
                if (str.equals("NOWPLAYING_UPNEXT")) {
                    return G1("NOWPLAYING_UPNEXT", "nowplaying/upnext", 1363, "nowplaying");
                }
                return null;
            case -1307605691:
                if (str.equals("USERS_NEARBY_CHECK_IN")) {
                    return G1("USERS_NEARBY_CHECK_IN", "users_nearby_check_in", 2075, "users_nearby_check_in");
                }
                return null;
            case -1294340971:
                if (str.equals("CARS_WAZE")) {
                    return G1("CARS_WAZE", "cars/waze", 286, "cars");
                }
                return null;
            case -1153625947:
                if (str.equals("MRKT_FRONTDOOR_SPOTIFY_MUSIC_STUDIOS")) {
                    return G1("MRKT_FRONTDOOR_SPOTIFY_MUSIC_STUDIOS", "mrkt/frontdoor/spotify-music-studios", 1272, "mrkt");
                }
                return null;
            case -1140409419:
                if (str.equals("YOUR_PLAN")) {
                    return G1("YOUR_PLAN", "your-plan", 2252, "your-plan");
                }
                return null;
            case -1132095883:
                if (str.equals("ADSTUDIO_EDIT_AD_SET")) {
                    return G1("ADSTUDIO_EDIT_AD_SET", "adstudio/edit/ad-set", 93, "adstudio");
                }
                return null;
            case -1129657595:
                if (str.equals("GOLDENPATH_MOHANNAZ")) {
                    return G1("GOLDENPATH_MOHANNAZ", "goldenpath/mohannaz", 709, "goldenpath");
                }
                return null;
            case -1129517931:
                if (str.equals("PORTAL_SEARCH_GROUPS_AND_ACCOUNTS")) {
                    return G1("PORTAL_SEARCH_GROUPS_AND_ACCOUNTS", "portal/search-groups-and-accounts", 1533, "portal");
                }
                return null;
            case -1083460379:
                if (str.equals("GOLDENPATH_EPORTELA")) {
                    return G1("GOLDENPATH_EPORTELA", "goldenpath/eportela", 644, "goldenpath");
                }
                return null;
            case -1063118683:
                if (str.equals("COLLECTION_ALBUMS")) {
                    return G1("COLLECTION_ALBUMS", "collection/albums", 347, "collection");
                }
                return null;
            case -1054635083:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS_REMOVE_MEMBER")) {
                    return c4();
                }
                return null;
            case -1024648523:
                if (str.equals("YOURLIBRARY_DOWNLOAD_CENTER")) {
                    return G1("YOURLIBRARY_DOWNLOAD_CENTER", "yourlibrary/download-center", 2261, "yourlibrary");
                }
                return null;
            case -1017671739:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_REPORTING")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_REPORTING", "mrkt/discovery-mode/unified-reporting", 1227, "mrkt");
                }
                return null;
            case -1001025419:
                if (str.equals("ARTIST_ABOUT")) {
                    return O();
                }
                return null;
            case -975277979:
                if (str.equals("SOULSEEKER_SIMILAR_PROFILES")) {
                    return G1("SOULSEEKER_SIMILAR_PROFILES", "soulseeker-similar-profiles", 1927, "soulseeker-similar-profiles");
                }
                return null;
            case -915167595:
                if (str.equals("LOGIN_SOMETHINGWENTWRONG")) {
                    return B2();
                }
                return null;
            case -913644331:
                if (str.equals("GOLDENPATH_ARTURD")) {
                    return G1("GOLDENPATH_ARTURD", "goldenpath/arturd", 621, "goldenpath");
                }
                return null;
            case -893287803:
                if (str.equals("WATCHAPP_SKIP_LIMIT_ALERT")) {
                    return G1("WATCHAPP_SKIP_LIMIT_ALERT", "watchapp/skip-limit-alert", 2124, "watchapp");
                }
                return null;
            case -871468219:
                if (str.equals("DOWNLOAD_DESKTOP")) {
                    return G1("DOWNLOAD_DESKTOP", "download/desktop", 499, "download");
                }
                return null;
            case -850606267:
                if (str.equals("DIALOG_SEARCH_FEEDBACK")) {
                    return G1("DIALOG_SEARCH_FEEDBACK", "dialog/search/feedback", 489, "dialog");
                }
                return null;
            case -799619915:
                if (str.equals("GOLDENPATH_ERDEMC")) {
                    return G1("GOLDENPATH_ERDEMC", "goldenpath/erdemc", 645, "goldenpath");
                }
                return null;
            case -748882731:
                if (str.equals("ADSTUDIO_EVENTS_PIXEL_CREATE")) {
                    return G1("ADSTUDIO_EVENTS_PIXEL_CREATE", "adstudio/events/pixel/create", 102, "adstudio");
                }
                return null;
            case -710742443:
                if (str.equals("MULTI_USER_PLAN_VERIFICATION_VERIFY")) {
                    return T2();
                }
                return null;
            case -696838027:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_REVERTTRANSITION")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_REVERTTRANSITION", "www-account-pages/genalpha/reverttransition", 2208, "www-account-pages");
                }
                return null;
            case -654877083:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS_DARK")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS_DARK", "mrkt/debug/hubs/component-reference/page-headers-dark", 1207, "mrkt");
                }
                return null;
            case -590449115:
                if (str.equals("GOLDENPATH_IBRAAHEEMR")) {
                    return G1("GOLDENPATH_IBRAAHEEMR", "goldenpath/ibraaheemr", 659, "goldenpath");
                }
                return null;
            case -549067659:
                if (str.equals("S4P_AUTHENTICATION_SELECTION")) {
                    return G1("S4P_AUTHENTICATION_SELECTION", "s4p/authentication/selection", 1677, "s4p");
                }
                return null;
            case -532313947:
                if (str.equals("FREETIER_TASTEONBOARDING_SKIPDIALOG")) {
                    return G1("FREETIER_TASTEONBOARDING_SKIPDIALOG", "freetier/tasteonboarding/skipdialog", 587, "freetier");
                }
                return null;
            case -504228619:
                if (str.equals("CONNECT_TUTORIALTV")) {
                    return G1("CONNECT_TUTORIALTV", "connect/tutorialtv", 408, "connect");
                }
                return null;
            case -494907339:
                if (str.equals("GOLDENPATH_SATURNINOC")) {
                    return G1("GOLDENPATH_SATURNINOC", "goldenpath/saturninoc", 743, "goldenpath");
                }
                return null;
            case -492712843:
                if (str.equals("TRENDING_NEAR_YOU_LOCATION_SEARCH")) {
                    return G1("TRENDING_NEAR_YOU_LOCATION_SEARCH", "trending-near-you/location-search", 2048, "trending-near-you");
                }
                return null;
            case -451274747:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_REMOVETEEN")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_REMOVETEEN", "www-account-pages/parental-settings/removeteen", 2229, "www-account-pages");
                }
                return null;
            case -442832827:
                if (str.equals("SMARTSHUFFLE_NPVRECOMMENDATIONS_FULLSCREEN")) {
                    return q5();
                }
                return null;
            case -278573115:
                if (str.equals("CONCERTS_CITYSEARCH")) {
                    return Q0();
                }
                return null;
            case -262191611:
                if (str.equals("CULTURALMOMENTS_STORIES")) {
                    return G1("CULTURALMOMENTS_STORIES", "culturalmoments/stories", 464, "culturalmoments");
                }
                return null;
            case -253816603:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_PITCHING")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_PITCHING", "mrkt/artist/campaigns/pitching", 1080, "mrkt");
                }
                return null;
            case -253328347:
                if (str.equals("WEAR_ENTITY_PAGE_REMOVE_DOWNLOAD_CONFIRMATION")) {
                    return G1("WEAR_ENTITY_PAGE_REMOVE_DOWNLOAD_CONFIRMATION", "wear/entity_page/remove_download_confirmation", 2144, "wear");
                }
                return null;
            case -91981979:
                if (str.equals("ADD_ON_MANAGEMENT")) {
                    return z();
                }
                return null;
            case -79554299:
                if (str.equals("NAVIGATION_OVERLAY")) {
                    return G1("NAVIGATION_OVERLAY", "navigation/overlay", 1346, "navigation");
                }
                return null;
            case -58538459:
                if (str.equals("EXTERNAL_CREDENTIALSMANAGER")) {
                    return y1();
                }
                return null;
            case -53096507:
                if (str.equals("CHANGEPIN")) {
                    return o0();
                }
                return null;
            case -23241579:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_DETAILS")) {
                    return G1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_DETAILS", "mrkt/artist/video/other-videos/details", 1172, "mrkt");
                }
                return null;
            case -10302395:
                if (str.equals("DISCOVERWEEKLY_SWIPE")) {
                    return G1("DISCOVERWEEKLY_SWIPE", "discoverweekly/swipe", 496, "discoverweekly");
                }
                return null;
            case 8195125:
                if (str.equals("MERCH_HUB")) {
                    return G1("MERCH_HUB", "merch-hub", 1032, "merch-hub");
                }
                return null;
            case 31069573:
                if (str.equals("CALIFORNIA_NOARGS")) {
                    return G1("CALIFORNIA_NOARGS", "california/noargs", 268, "california");
                }
                return null;
            case 40580965:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE")) {
                    return G1("MEMBERSHIP_CONSUMER_MANAGE", "membership/consumer/manage", 1021, "membership");
                }
                return null;
            case 54586373:
                if (str.equals("CALLING_CODE_PICKER")) {
                    return G1("CALLING_CODE_PICKER", "calling-code-picker", 269, "calling-code-picker");
                }
                return null;
            case 73725445:
                if (str.equals("MUSIC")) {
                    return G1("MUSIC", "music", 1341, "music");
                }
                return null;
            case 94086805:
                if (str.equals("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT")) {
                    return G1("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT", "adstudio/cold-start/review-and-submit", 74, "adstudio");
                }
                return null;
            case 94660389:
                if (str.equals("S4P_BETAMAXPLAYER")) {
                    return G1("S4P_BETAMAXPLAYER", "s4p/betamaxplayer", 1678, "s4p");
                }
                return null;
            case 112631493:
                if (str.equals("FAN_EVENTS_REDEMPTION")) {
                    return G1("FAN_EVENTS_REDEMPTION", "fan-events/redemption", 544, "fan-events");
                }
                return null;
            case 119283269:
                if (str.equals("SOULSEEKER_PROFILE_TRACKS")) {
                    return G1("SOULSEEKER_PROFILE_TRACKS", "soulseeker-profile-tracks", 1926, "soulseeker-profile-tracks");
                }
                return null;
            case 134819285:
                if (str.equals("PODCAST_EPISODE_TRANSCRIPT")) {
                    return G1("PODCAST_EPISODE_TRANSCRIPT", "podcast/episode/transcript", 1487, "podcast");
                }
                return null;
            case 141045029:
                if (str.equals("CHAT_LIST")) {
                    return x0();
                }
                return null;
            case 143458629:
                if (str.equals("MRKT_CONTENT_MISMATCH")) {
                    return G1("MRKT_CONTENT_MISMATCH", "mrkt/content-mismatch", 1201, "mrkt");
                }
                return null;
            case 166325077:
                if (str.equals("KID_ACCOUNT_TRANSITION_LEGAL_CONSENT")) {
                    return G1("KID_ACCOUNT_TRANSITION_LEGAL_CONSENT", "kid-account-transition/legal-consent", 893, "kid-account-transition");
                }
                return null;
            case 204293685:
                if (str.equals("ADSTUDIO_COLD_START_AD")) {
                    return G1("ADSTUDIO_COLD_START_AD", "adstudio/cold-start/ad", 64, "adstudio");
                }
                return null;
            case 252953493:
                if (str.equals("WATCHAPP_SEARCH")) {
                    return G1("WATCHAPP_SEARCH", "watchapp/search", 2120, "watchapp");
                }
                return null;
            case 260880965:
                if (str.equals("LOGIN_EMAILOTP")) {
                    return G1("LOGIN_EMAILOTP", "login/emailotp", 955, "login");
                }
                return null;
            case 377153877:
                if (str.equals("PIN_GATE")) {
                    return v3();
                }
                return null;
            case 381667941:
                if (str.equals("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DETAIL")) {
                    return G1("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DETAIL", "mrkt/third-party-agency/campaigns/detail", 1322, "mrkt");
                }
                return null;
            case 388910933:
                if (str.equals("REMOTEDOWNLOADS_ONBOARDING")) {
                    return R4();
                }
                return null;
            case 424429029:
                if (str.equals("ADSDISPLAY_DSA")) {
                    return G1("ADSDISPLAY_DSA", "adsdisplay/dsa", 28, "adsdisplay");
                }
                return null;
            case 466334789:
                if (str.equals("MANAGE_ACCEPT_INVITE_WELCOME_PAGE")) {
                    return G1("MANAGE_ACCEPT_INVITE_WELCOME_PAGE", "manage/accept-invite/welcome-page", 992, "manage");
                }
                return null;
            case 480341669:
                if (str.equals("BROWSE_GENRES")) {
                    return G1("BROWSE_GENRES", "browse/genres", 250, "browse");
                }
                return null;
            case 502327429:
                if (str.equals("ARTIST_CONCERTS")) {
                    return G1("ARTIST_CONCERTS", "artist/concerts", 166, "artist");
                }
                return null;
            case 523216021:
                if (str.equals("MRKT_ARTIST_SONG_PLAYLIST")) {
                    return G1("MRKT_ARTIST_SONG_PLAYLIST", "mrkt/artist/song/playlist", 1145, "mrkt");
                }
                return null;
            case 545540389:
                if (str.equals("MRKT_ARTIST_PROFILE_ARTISTPICK")) {
                    return G1("MRKT_ARTIST_PROFILE_ARTISTPICK", "mrkt/artist/profile/artistpick", 1115, "mrkt");
                }
                return null;
            case 623986517:
                if (str.equals("PODCAST_SHOW_LOADING")) {
                    return G1("PODCAST_SHOW_LOADING", "podcast/show/loading", 1498, "podcast");
                }
                return null;
            case 629510501:
                if (str.equals("HOMEMIX_ENTITY")) {
                    return G1("HOMEMIX_ENTITY", "homemix/entity", 813, "homemix");
                }
                return null;
            case 716555349:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION")) {
                    return G1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION", "login/accountrecovery/requestemailconfirmation", 941, "login");
                }
                return null;
            case 748473237:
                if (str.equals("ADSTUDIO_COLD_START_AB_TEST_NEW_CONFIRMATION")) {
                    return G1("ADSTUDIO_COLD_START_AB_TEST_NEW_CONFIRMATION", "adstudio/cold-start/ab-test/new/confirmation", 63, "adstudio");
                }
                return null;
            case 780420693:
                if (str.equals("WATCHAPP_CONNECT_DEVICE_PICKER")) {
                    return G1("WATCHAPP_CONNECT_DEVICE_PICKER", "watchapp/connect-device-picker", 2095, "watchapp");
                }
                return null;
            case 800828709:
                if (str.equals("ALLBOARDING_CONTENTPICKER")) {
                    return G1("ALLBOARDING_CONTENTPICKER", "allboarding/contentpicker", 144, "allboarding");
                }
                return null;
            case 826236069:
                if (str.equals("LOGIN_DIALOG_PASSKEY_LOGIN_FAILED")) {
                    return z2();
                }
                return null;
            case 858723301:
                if (str.equals("PHONENUMBERSIGNUP_VALIDATEOTP")) {
                    return G1("PHONENUMBERSIGNUP_VALIDATEOTP", "phonenumbersignup/validateotp", 1442, "phonenumbersignup");
                }
                return null;
            case 862370181:
                if (str.equals("MRKT_ARTIST_PROFILE_PLAYLISTS_EDIT")) {
                    return G1("MRKT_ARTIST_PROFILE_PLAYLISTS_EDIT", "mrkt/artist/profile/playlists/edit", 1135, "mrkt");
                }
                return null;
            case 869450277:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_EDIT")) {
                    return G1("MRKT_ARTIST_PRE_RELEASE_EDIT", "mrkt/artist/pre-release/edit", 1109, "mrkt");
                }
                return null;
            case 920837541:
                if (str.equals("FREETIER_CHARTS_CHART")) {
                    return G1("FREETIER_CHARTS_CHART", "freetier/charts/chart", 579, "freetier");
                }
                return null;
            case 963197749:
                if (str.equals("ADTRANSPARENCYTRACKINGPREPROMPT")) {
                    return G1("ADTRANSPARENCYTRACKINGPREPROMPT", "adtransparencytrackingpreprompt", 118, "adtransparencytrackingpreprompt");
                }
                return null;
            case 1023506357:
                if (str.equals("XRPROJECTED_LYRICS")) {
                    return G1("XRPROJECTED_LYRICS", "xrprojected/lyrics", 2248, "xrprojected");
                }
                return null;
            case 1061214277:
                if (str.equals("PORTAL_SEARCH_SOFTWARE_CATALOG")) {
                    return G1("PORTAL_SEARCH_SOFTWARE_CATALOG", "portal/search-software-catalog", 1535, "portal");
                }
                return null;
            case 1070737669:
                if (str.equals("PROFILE_ACTIVITY")) {
                    return G1("PROFILE_ACTIVITY", "profile/activity", 1572, "profile");
                }
                return null;
            case 1091707637:
                if (str.equals("MRKT_TEAM_MANAGEMENT_SELECT_TEAM")) {
                    return G1("MRKT_TEAM_MANAGEMENT_SELECT_TEAM", "mrkt/team-management/select-team", 1312, "mrkt");
                }
                return null;
            case 1108783429:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING", "mrkt/discovery-mode/unified-buying", 1216, "mrkt");
                }
                return null;
            case 1112982213:
                if (str.equals("MRKT_MOBILE_STATS_OVERVIEW")) {
                    return G1("MRKT_MOBILE_STATS_OVERVIEW", "mrkt/mobile-stats/overview", 1292, "mrkt");
                }
                return null;
            case 1127043749:
                if (str.equals("FANDOM_ARTISTMIX")) {
                    return G1("FANDOM_ARTISTMIX", "fandom/artistmix", 546, "fandom");
                }
                return null;
            case 1133676533:
                if (str.equals("PROACTIVE_PLATFORMS_HOME_SCREEN_CARD_WIDGET")) {
                    return G1("PROACTIVE_PLATFORMS_HOME_SCREEN_CARD_WIDGET", "proactive-platforms/home-screen-card-widget", 1563, "proactive-platforms");
                }
                return null;
            case 1137930469:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_FAN_CONNECTION")) {
                    return G1("MRKT_FRONTDOOR_FAN_STUDY_FAN_CONNECTION", "mrkt/frontdoor/fan-study/fan-connection", 1251, "mrkt");
                }
                return null;
            case 1139427845:
                if (str.equals("MRKT_FRONTDOOR_STREAM_ON")) {
                    return G1("MRKT_FRONTDOOR_STREAM_ON", "mrkt/frontdoor/stream-on", 1273, "mrkt");
                }
                return null;
            case 1173654933:
                if (str.equals("MRKT_ARTIST_EVENTS_NO_ARTIST_REDIRECT")) {
                    return G1("MRKT_ARTIST_EVENTS_NO_ARTIST_REDIRECT", "mrkt/artist/events/no-artist-redirect", 1084, "mrkt");
                }
                return null;
            case 1219982501:
                if (str.equals("SETTINGS_LANGUAGES_MUSIC")) {
                    return d5();
                }
                return null;
            case 1231281093:
                if (str.equals("CONTEXTMENU_ARTISTCONCERTS")) {
                    return G1("CONTEXTMENU_ARTISTCONCERTS", "contextmenu/artistconcerts", 419, "contextmenu");
                }
                return null;
            case 1253944805:
                if (str.equals("CHARTS_ALBUM")) {
                    return G1("CHARTS_ALBUM", "charts/album", 304, "charts");
                }
                return null;
            case 1256034549:
                if (str.equals("SUPERBIRD_SETUP_WELCOME")) {
                    return G1("SUPERBIRD_SETUP_WELCOME", "superbird/setup/welcome", 2017, "superbird");
                }
                return null;
            case 1264833333:
                if (str.equals("CHARTS_MERCH")) {
                    return G1("CHARTS_MERCH", "charts/merch", 307, "charts");
                }
                return null;
            case 1284844549:
                if (str.equals("ENTITYSEGMENTS_PODCASTCHAPTER")) {
                    return G1("ENTITYSEGMENTS_PODCASTCHAPTER", "entitysegments/podcastchapter", 521, "entitysegments");
                }
                return null;
            case 1415355797:
                if (str.equals("S4P_COMMON_WEBVIEW")) {
                    return G1("S4P_COMMON_WEBVIEW", "s4p/common-webview", 1692, "s4p");
                }
                return null;
            case 1416202917:
                if (str.equals("MRKT_WAITING_ROOM_AUDIENCE")) {
                    return G1("MRKT_WAITING_ROOM_AUDIENCE", "mrkt/waiting-room/audience", 1331, "mrkt");
                }
                return null;
            case 1439970229:
                if (str.equals("SPOTIFY_FOR_AUTHORS_SETTINGS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_SETTINGS", "spotify-for-authors/settings", 1954, "spotify-for-authors");
                }
                return null;
            case 1443032485:
                if (str.equals("MRKT_NOT_FOUND")) {
                    return G1("MRKT_NOT_FOUND", "mrkt/not-found", 1293, "mrkt");
                }
                return null;
            case 1470241685:
                if (str.equals("S4P_CLAIM_PODCAST_PAYOUTS_CONFIRMATION")) {
                    return G1("S4P_CLAIM_PODCAST_PAYOUTS_CONFIRMATION", "s4p/claim-podcast/payouts-confirmation", 1684, "s4p");
                }
                return null;
            case 1472294485:
                if (str.equals("SEARCH_ARTISTS")) {
                    return G1("SEARCH_ARTISTS", "search/artists", 1780, "search");
                }
                return null;
            case 1483666661:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_AD")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_AD", "adstudio/duplicate-ad/ad", 91, "adstudio");
                }
                return null;
            case 1539834805:
                if (str.equals("SEARCH_LIVE_EVENTS")) {
                    return G1("SEARCH_LIVE_EVENTS", "search/live_events", 1790, "search");
                }
                return null;
            case 1605316053:
                if (str.equals("ADSTUDIO_BUSINESS_CREATE")) {
                    return G1("ADSTUDIO_BUSINESS_CREATE", "adstudio/business/create", 54, "adstudio");
                }
                return null;
            case 1636281781:
                if (str.equals("YOURLIBRARY_ARTISTS")) {
                    return G1("YOURLIBRARY_ARTISTS", "yourlibrary/artists", 2257, "yourlibrary");
                }
                return null;
            case 1647711333:
                if (str.equals("MRKT_ARTIST_PROFILE_BANNER_IMAGE")) {
                    return G1("MRKT_ARTIST_PROFILE_BANNER_IMAGE", "mrkt/artist/profile/banner-image", 1120, "mrkt");
                }
                return null;
            case 1661051045:
                if (str.equals("GOOGLEASSISTANT")) {
                    return G1("GOOGLEASSISTANT", "googleassistant", 764, "googleassistant");
                }
                return null;
            case 1679244693:
                if (str.equals("GATEDCONTENT_BOTTOMSHEET")) {
                    return G1("GATEDCONTENT_BOTTOMSHEET", "gatedcontent/bottomsheet", 602, "gatedcontent");
                }
                return null;
            case 1749623781:
                if (str.equals("PARENTAL_CONTROL_DELETE_ACCOUNT")) {
                    return k3();
                }
                return null;
            case 1761083029:
                if (str.equals("REQUESTPERMISSIONS")) {
                    return G1("REQUESTPERMISSIONS", "requestpermissions", 1652, "requestpermissions");
                }
                return null;
            case 1771999765:
                if (str.equals("S4P_TERMS_OF_SERVICE")) {
                    return G1("S4P_TERMS_OF_SERVICE", "s4p/terms-of-service", 1767, "s4p");
                }
                return null;
            case 1871981589:
                if (str.equals("SOCIAL_LISTENING_SHAREOPTIONS")) {
                    return G1("SOCIAL_LISTENING_SHAREOPTIONS", "social-listening/shareoptions", 1913, "social-listening");
                }
                return null;
            case 1881679013:
                if (str.equals("PAGE_MATCH_ONBOARDING")) {
                    return h3();
                }
                return null;
            case 1907782005:
                if (str.equals("S4P_ACTIVITY_CENTER")) {
                    return G1("S4P_ACTIVITY_CENTER", "s4p/activity-center", 1662, "s4p");
                }
                return null;
            case 1940858965:
                if (str.equals("SOCIAL_LISTENING_IPLSESSIONSHARING")) {
                    return G1("SOCIAL_LISTENING_IPLSESSIONSHARING", "social-listening/iplsessionsharing", 1907, "social-listening");
                }
                return null;
            case 1986664533:
                if (str.equals("CHARTS")) {
                    return G1("CHARTS", "charts", 303, "charts");
                }
                return null;
            case 1993205749:
                if (str.equals("CAREPACKAGE")) {
                    return G1("CAREPACKAGE", "carepackage", 277, "carepackage");
                }
                return null;
            case 2135149653:
                if (str.equals("MRKT_FRONTDOOR_BLOG_CONTENT")) {
                    return G1("MRKT_FRONTDOOR_BLOG_CONTENT", "mrkt/frontdoor/blog/content", 1240, "mrkt");
                }
                return null;
            case 2138894197:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS_VIDEO_SETTINGS")) {
                    return d4();
                }
                return null;
            case 2145575717:
                if (str.equals("MRKT_ARTIST_PROFILE_MERCH_DETAILS")) {
                    return G1("MRKT_ARTIST_PROFILE_MERCH_DETAILS", "mrkt/artist/profile/merch/details", 1133, "mrkt");
                }
                return null;
            default:
                return null;
        }
    }

    public static p6r0 Y() {
        return G1("AUTHOR", "author", 208, "author");
    }

    public static p6r0 Y0() {
        return G1("CONTEXTMENU_EPISODE", "contextmenu/episode", 429, "contextmenu");
    }

    public static p6r0 Y1() {
        return G1("HOME_VIDEOS", "home/videos", 809, "home");
    }

    public static p6r0 Y2() {
        return G1("NOWPLAYING_NOWPLAYINGBAR", "nowplaying/nowplayingbar", 1357, "nowplaying");
    }

    public static p6r0 Y3() {
        return G1("PREMIUM_ACCOUNT_MANAGEMENT", "premium-account-management", 1538, "premium-account-management");
    }

    public static p6r0 Y4() {
        return G1("SETTINGS_ADS", "settings/ads", 1806, "settings");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 Y5(String str) {
        switch (str.hashCode()) {
            case -2093542906:
                if (str.equals("GOLDENPATH_JAMIELEE1")) {
                    return G1("GOLDENPATH_JAMIELEE1", "goldenpath/jamielee1", 663, "goldenpath");
                }
                return null;
            case -2078406602:
                if (str.equals("SUPPORT_SITE_OLD_ARTICLE")) {
                    return G1("SUPPORT_SITE_OLD_ARTICLE", "support-site/old/article", 2025, "support-site");
                }
                return null;
            case -2038734106:
                if (str.equals("SONG_DNA_REPORT")) {
                    return G1("SONG_DNA_REPORT", "song-dna-report", 1923, "song-dna-report");
                }
                return null;
            case -2004896634:
                if (str.equals("BOOKSHELFTOAUDIOBOOKRECS")) {
                    return G1("BOOKSHELFTOAUDIOBOOKRECS", "bookshelftoaudiobookrecs", 239, "bookshelftoaudiobookrecs");
                }
                return null;
            case -1985814730:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_UPLOAD")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_UPLOAD", "mrkt/discovery-mode/unified-buying/update/csv/upload", 1225, "mrkt");
                }
                return null;
            case -1975435962:
                if (str.equals("CHECKOUT")) {
                    return G1("CHECKOUT", "checkout", 332, "checkout");
                }
                return null;
            case -1818130842:
                if (str.equals("SUPPORT_SITE_CATEGORY")) {
                    return G1("SUPPORT_SITE_CATEGORY", "support-site/category", 2020, "support-site");
                }
                return null;
            case -1794725882:
                if (str.equals("USERHIGHLIGHT_LOADING")) {
                    return G1("USERHIGHLIGHT_LOADING", "userHighlight/loading", 2072, "userHighlight");
                }
                return null;
            case -1759381594:
                if (str.equals("CHECKOUT_CHOICESCREEN")) {
                    return G1("CHECKOUT_CHOICESCREEN", "checkout/choicescreen", 333, "checkout");
                }
                return null;
            case -1747043050:
                if (str.equals("GOLDENPATH_AWELANDER")) {
                    return G1("GOLDENPATH_AWELANDER", "goldenpath/awelander", 622, "goldenpath");
                }
                return null;
            case -1687834906:
                if (str.equals("MULTI_USER_PLAN_VERIFICATION_START")) {
                    return S2();
                }
                return null;
            case -1662801498:
                if (str.equals("MRKT_ARTIST_VIDEO_CANVAS_DETAILS")) {
                    return G1("MRKT_ARTIST_VIDEO_CANVAS_DETAILS", "mrkt/artist/video/canvas/details", 1151, "mrkt");
                }
                return null;
            case -1642966794:
                if (str.equals("FITNESS_HOME")) {
                    return G1("FITNESS_HOME", "fitness/home", 557, "fitness");
                }
                return null;
            case -1614235338:
                if (str.equals("PROFILE_ARTISTS")) {
                    return G1("PROFILE_ARTISTS", "profile/artists", 1574, "profile");
                }
                return null;
            case -1600741914:
                if (str.equals("LANGUAGEPICKER")) {
                    return G1("LANGUAGEPICKER", "languagepicker", 902, "languagepicker");
                }
                return null;
            case -1571863578:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSWORD")) {
                    return G1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSWORD", "www-account-pages/login-methods-v2-password", 2215, "www-account-pages");
                }
                return null;
            case -1516119434:
                if (str.equals("ARTIST_CATALOG_FILTER")) {
                    return G1("ARTIST_CATALOG_FILTER", "artist/catalog/filter", 163, "artist");
                }
                return null;
            case -1501078666:
                if (str.equals("MARTINI_FEEDBACK")) {
                    return O2();
                }
                return null;
            case -1496919722:
                if (str.equals("BUNDLING_OFFER_WEBVIEW")) {
                    return G1("BUNDLING_OFFER_WEBVIEW", "bundling/offer/webview", 256, "bundling");
                }
                return null;
            case -1488067066:
                if (str.equals("WEAR_WHAT_IS_NEW")) {
                    return G1("WEAR_WHAT_IS_NEW", "wear/what_is_new", 2172, "wear");
                }
                return null;
            case -1428915130:
                if (str.equals("S4P_BLOCKED_WORDS")) {
                    return G1("S4P_BLOCKED_WORDS", "s4p/blocked-words", 1680, "s4p");
                }
                return null;
            case -1425790634:
                if (str.equals("GRADUATION_TERMS")) {
                    return M1();
                }
                return null;
            case -1403058554:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_ERROR")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_ERROR", "mrkt/discovery-mode/unified-buying/create/csv/error", 1218, "mrkt");
                }
                return null;
            case -1401160250:
                if (str.equals("EXTERNAL_APPLE")) {
                    return G1("EXTERNAL_APPLE", "external/apple", 535, "external");
                }
                return null;
            case -1360982010:
                if (str.equals("GRADUATION_VIEW_REQUEST")) {
                    return N1();
                }
                return null;
            case -1342224170:
                if (str.equals("SPOTIT_ERROR")) {
                    return G1("SPOTIT_ERROR", "spotit/error", 1966, "spotit");
                }
                return null;
            case -1232216634:
                if (str.equals("GOLDENPATH_KAPILESHT")) {
                    return G1("GOLDENPATH_KAPILESHT", "goldenpath/kapilesht", 681, "goldenpath");
                }
                return null;
            case -1210883738:
                if (str.equals("PODCASTMIX_CONTROLS_TOPICS")) {
                    return G1("PODCASTMIX_CONTROLS_TOPICS", "podcastmix/controls/topics", 1518, "podcastmix");
                }
                return null;
            case -1198614906:
                if (str.equals("WEAR_CHAPTERS")) {
                    return G1("WEAR_CHAPTERS", "wear/chapters", 2136, "wear");
                }
                return null;
            case -1183995146:
                if (str.equals("S4P_SETUP_SHOW_SUMMARY")) {
                    return G1("S4P_SETUP_SHOW_SUMMARY", "s4p/setup-show/summary", 1758, "s4p");
                }
                return null;
            case -1128596874:
                if (str.equals("GOLDENPATH_KSIMS")) {
                    return G1("GOLDENPATH_KSIMS", "goldenpath/ksims", 685, "goldenpath");
                }
                return null;
            case -1100516154:
                if (str.equals("LISTENINGACTIVITY_GROUP_AUDIENCE_SELECTION")) {
                    return G1("LISTENINGACTIVITY_GROUP_AUDIENCE_SELECTION", "listeningactivity/group/audience-selection", 913, "listeningactivity");
                }
                return null;
            case -1054082026:
                if (str.equals("AGE_SIGNAL_BLOCKED_CONFIRM_AGE")) {
                    return G1("AGE_SIGNAL_BLOCKED_CONFIRM_AGE", "age-signal/blocked/confirm-age", 131, "age-signal");
                }
                return null;
            case -995797466:
                if (str.equals("SEARCH_LAST_WEEK")) {
                    return G1("SEARCH_LAST_WEEK", "search/last_week", 1789, "search");
                }
                return null;
            case -969634042:
                if (str.equals("S4P_ONBOARDING_HOSTING")) {
                    return G1("S4P_ONBOARDING_HOSTING", "s4p/onboarding/hosting", 1720, "s4p");
                }
                return null;
            case -961126330:
                if (str.equals("SEARCH_PODCASTS_AND_EPISODES_UPLOAD_DATE")) {
                    return G1("SEARCH_PODCASTS_AND_EPISODES_UPLOAD_DATE", "search/podcasts_and_episodes/upload_date", 1795, "search");
                }
                return null;
            case -953841002:
                if (str.equals("LIVE_ENTITY")) {
                    return x2();
                }
                return null;
            case -953101322:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS")) {
                    return H0();
                }
                return null;
            case -931290106:
                if (str.equals("PLAYLIST_ADDTOPLAYLIST_SORTING")) {
                    return G1("PLAYLIST_ADDTOPLAYLIST_SORTING", "playlist/addtoplaylist/sorting", 1451, "playlist");
                }
                return null;
            case -869292794:
                if (str.equals("WWW_ACCOUNT_PAGES_STUDENT")) {
                    return G1("WWW_ACCOUNT_PAGES_STUDENT", "www-account-pages/student", 2245, "www-account-pages");
                }
                return null;
            case -863089466:
                if (str.equals("MANAGE_ACCEPT_INVITE")) {
                    return G1("MANAGE_ACCEPT_INVITE", "manage/accept-invite", 991, "manage");
                }
                return null;
            case -782754026:
                if (str.equals("GOLDENPATH_FELIXA")) {
                    return G1("GOLDENPATH_FELIXA", "goldenpath/felixa", 648, "goldenpath");
                }
                return null;
            case -766826410:
                if (str.equals("GOLDENPATH_MICHALS")) {
                    return G1("GOLDENPATH_MICHALS", "goldenpath/michals", 703, "goldenpath");
                }
                return null;
            case -746691594:
                if (str.equals("WWW_ACCOUNT_PAGES_AVAILABLEPLANS")) {
                    return G1("WWW_ACCOUNT_PAGES_AVAILABLEPLANS", "www-account-pages/availableplans", 2189, "www-account-pages");
                }
                return null;
            case -729227594:
                if (str.equals("GOLDENPATH_HAKAND")) {
                    return G1("GOLDENPATH_HAKAND", "goldenpath/hakand", 654, "goldenpath");
                }
                return null;
            case -638412090:
                if (str.equals("UNBOXING_FEATURE_FLOW")) {
                    return G5();
                }
                return null;
            case -608391178:
                if (str.equals("WATCHAPP_SHUFFLE_RESTRICTION_ALERT")) {
                    return G1("WATCHAPP_SHUFFLE_RESTRICTION_ALERT", "watchapp/shuffle-restriction-alert", 2122, "watchapp");
                }
                return null;
            case -602203146:
                if (str.equals("SUPERBIRD_SETUP_READY")) {
                    return G1("SUPERBIRD_SETUP_READY", "superbird/setup/ready", 2013, "superbird");
                }
                return null;
            case -572153626:
                if (str.equals("LYRICS_FULLSCREEN")) {
                    return G1("LYRICS_FULLSCREEN", "lyrics/fullscreen", 968, "lyrics");
                }
                return null;
            case -550302970:
                if (str.equals("WWW_ACCOUNT_PAGES_PAYMENT_HISTORY")) {
                    return G1("WWW_ACCOUNT_PAGES_PAYMENT_HISTORY", "www-account-pages/payment-history", 2233, "www-account-pages");
                }
                return null;
            case -538357178:
                if (str.equals("ARTIST_PATRON")) {
                    return G1("ARTIST_PATRON", "artist/patron", 171, "artist");
                }
                return null;
            case -403347322:
                if (str.equals("SETTINGS_EMPLOYEE_TOOLS")) {
                    return b5();
                }
                return null;
            case -241185338:
                if (str.equals("CONTEXTMENU_YOURUPDATES")) {
                    return G1("CONTEXTMENU_YOURUPDATES", "contextmenu/yourupdates", 445, "contextmenu");
                }
                return null;
            case -224787338:
                if (str.equals("AUDIOBOOK_SUPPLEMENTARYMATERIAL")) {
                    return X();
                }
                return null;
            case -198910618:
                if (str.equals("MRKT_USER_SETTINGS")) {
                    return G1("MRKT_USER_SETTINGS", "mrkt/user-settings", 1324, "mrkt");
                }
                return null;
            case -193542778:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_INTERACTIVE")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_INTERACTIVE", "mrkt/discovery-mode/unified-buying/update/interactive", 1226, "mrkt");
                }
                return null;
            case -182725242:
                if (str.equals("SIGNUP_DISPLAYNAME")) {
                    return G1("SIGNUP_DISPLAYNAME", "signup/displayname", 1888, "signup");
                }
                return null;
            case -182033002:
                if (str.equals("SETTINGS_EQUALIZER")) {
                    return c5();
                }
                return null;
            case -160320522:
                if (str.equals("AUDIOBOOK_DIRECTSALES_INAPPWEBCHECKOUTOVERLAY")) {
                    return W();
                }
                return null;
            case -124279370:
                if (str.equals("PERMISSIONS_NOTIFICATIONS_PROMPT")) {
                    return G1("PERMISSIONS_NOTIFICATIONS_PROMPT", "permissions-notifications-prompt", 1427, "permissions-notifications-prompt");
                }
                return null;
            case -121668666:
                if (str.equals("CAPPED_OFFLINE_DIALOG")) {
                    return G1("CAPPED_OFFLINE_DIALOG", "capped-offline/dialog", 272, "capped-offline");
                }
                return null;
            case -117946282:
                if (str.equals("HOME_FUNKIS")) {
                    return G1("HOME_FUNKIS", "home-funkis", 796, "home-funkis");
                }
                return null;
            case -108720554:
                if (str.equals("KID_ACCOUNT_TRANSITION_COPPA")) {
                    return G1("KID_ACCOUNT_TRANSITION_COPPA", "kid-account-transition/coppa", 890, "kid-account-transition");
                }
                return null;
            case -106488346:
                if (str.equals("MRKT_ARTIST_HOME")) {
                    return G1("MRKT_ARTIST_HOME", "mrkt/artist/home", 1086, "mrkt");
                }
                return null;
            case -67835354:
                if (str.equals("UNBOXING_HUB")) {
                    return G1("UNBOXING_HUB", "unboxing/hub", 2061, "unboxing");
                }
                return null;
            case -15427626:
                if (str.equals("ARSENAL")) {
                    return G1("ARSENAL", "arsenal", 153, "arsenal");
                }
                return null;
            case -5511786:
                if (str.equals("LEGACYSHARE")) {
                    return G1("LEGACYSHARE", "legacyshare", 905, "legacyshare");
                }
                return null;
            case 77494:
                if (str.equals("NOW")) {
                    return G1("NOW", "now", 1352, "now");
                }
                return null;
            case 38768822:
                if (str.equals("USERS_NEARBY")) {
                    return G1("USERS_NEARBY", "users_nearby", 2074, "users_nearby");
                }
                return null;
            case 61098150:
                if (str.equals("NOTIFICATIONS_ACTIVITY")) {
                    return G1("NOTIFICATIONS_ACTIVITY", "notifications/activity", 1351, "notifications");
                }
                return null;
            case 62030774:
                if (str.equals("AAA_T")) {
                    return q();
                }
                return null;
            case 69806694:
                if (str.equals("INBOX")) {
                    return G1("INBOX", "inbox", 840, "inbox");
                }
                return null;
            case 78676534:
                if (str.equals("SAYIT")) {
                    return G1("SAYIT", "sayit", 1775, "sayit");
                }
                return null;
            case 78740022:
                if (str.equals("SUPPORT_SITE_PREMIUM_CLOSE_ACCOUNT")) {
                    return G1("SUPPORT_SITE_PREMIUM_CLOSE_ACCOUNT", "support-site/premium-close-account", 2029, "support-site");
                }
                return null;
            case 78875894:
                if (str.equals("SHOWS")) {
                    return G1("SHOWS", "shows", 1868, "shows");
                }
                return null;
            case 113828166:
                if (str.equals("REINVENTFREE_TIME_CAP_UPSELL")) {
                    return O4();
                }
                return null;
            case 200027558:
                if (str.equals("WWW_ACCOUNT_PAGES_COLLECT_ACCOUNT_DETAILS")) {
                    return G1("WWW_ACCOUNT_PAGES_COLLECT_ACCOUNT_DETAILS", "www-account-pages/collect-account-details", 2194, "www-account-pages");
                }
                return null;
            case 309040422:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_NEW_RELEASES")) {
                    return G1("MRKT_FRONTDOOR_FAN_STUDY_NEW_RELEASES", "mrkt/frontdoor/fan-study/new-releases", 1254, "mrkt");
                }
                return null;
            case 326308998:
                if (str.equals("GOLDENPATH_ABELTRAMI")) {
                    return G1("GOLDENPATH_ABELTRAMI", "goldenpath/abeltrami", 609, "goldenpath");
                }
                return null;
            case 353586374:
                if (str.equals("MRKT_ARTIST_PROFILE_FAN_SUPPORT")) {
                    return G1("MRKT_ARTIST_PROFILE_FAN_SUPPORT", "mrkt/artist/profile/fan-support", 1125, "mrkt");
                }
                return null;
            case 486135542:
                if (str.equals("MRKT_FRONTDOOR_SPOTIFY_FOR_ARTISTS_MARKETING_AWARDS")) {
                    return G1("MRKT_FRONTDOOR_SPOTIFY_FOR_ARTISTS_MARKETING_AWARDS", "mrkt/frontdoor/spotify-for-artists-marketing-awards", 1271, "mrkt");
                }
                return null;
            case 503757766:
                if (str.equals("MRKT_ARTIST_VIDEO_COUNTDOWN")) {
                    return G1("MRKT_ARTIST_VIDEO_COUNTDOWN", "mrkt/artist/video/countdown", 1158, "mrkt");
                }
                return null;
            case 513190726:
                if (str.equals("SHARE_FACEBOOK")) {
                    return G1("SHARE_FACEBOOK", "share/facebook", 1859, "share");
                }
                return null;
            case 514467926:
                if (str.equals("CONTEXTMENU_VIEWARTISTS")) {
                    return G1("CONTEXTMENU_VIEWARTISTS", "contextmenu/viewartists", 444, "contextmenu");
                }
                return null;
            case 519249238:
                if (str.equals("DIALOG_TERMS_TERMSPOSTPONED")) {
                    return G1("DIALOG_TERMS_TERMSPOSTPONED", "dialog/terms/termspostponed", 492, "dialog");
                }
                return null;
            case 559596662:
                if (str.equals("SETTINGS_DEFAULT_SAVE_LOCATIONS")) {
                    return G1("SETTINGS_DEFAULT_SAVE_LOCATIONS", "settings/default-save-locations", 1815, "settings");
                }
                return null;
            case 564081894:
                if (str.equals("GOLDENPATH_KNIFESQUAD")) {
                    return G1("GOLDENPATH_KNIFESQUAD", "goldenpath/knifesquad", 683, "goldenpath");
                }
                return null;
            case 649827974:
                if (str.equals("MRKT_ARTIST_VIDEO_WRAPPED_UPLOAD")) {
                    return G1("MRKT_ARTIST_VIDEO_WRAPPED_UPLOAD", "mrkt/artist/video/wrapped/upload", 1177, "mrkt");
                }
                return null;
            case 674282662:
                if (str.equals("GOLDENPATH_MRIBEIROMEIRELES")) {
                    return G1("GOLDENPATH_MRIBEIROMEIRELES", "goldenpath/mribeiromeireles", 712, "goldenpath");
                }
                return null;
            case 678376390:
                if (str.equals("MRKT_FRONTDOOR_SHOWCASE")) {
                    return G1("MRKT_FRONTDOOR_SHOWCASE", "mrkt/frontdoor/showcase", 1269, "mrkt");
                }
                return null;
            case 715120422:
                if (str.equals("MRKT_ARTIST_MUSIC_UPCOMING_PRERELEASE")) {
                    return G1("MRKT_ARTIST_MUSIC_UPCOMING_PRERELEASE", "mrkt/artist/music/upcoming/prerelease", 1101, "mrkt");
                }
                return null;
            case 715350582:
                if (str.equals("EPISODECHAPTERS_NPV")) {
                    return G1("EPISODECHAPTERS_NPV", "episodechapters/npv", 525, "episodechapters");
                }
                return null;
            case 726108246:
                if (str.equals("MRKT_FRONTDOOR_FEATURES")) {
                    return G1("MRKT_FRONTDOOR_FEATURES", "mrkt/frontdoor/features", 1256, "mrkt");
                }
                return null;
            case 749821206:
                if (str.equals("MRKT_FRONTDOOR_ARTIFICIAL_STREAMING")) {
                    return G1("MRKT_FRONTDOOR_ARTIFICIAL_STREAMING", "mrkt/frontdoor/artificial-streaming", 1237, "mrkt");
                }
                return null;
            case 779329398:
                if (str.equals("ADSTUDIO_CAMPAIGNS_REPORT")) {
                    return G1("ADSTUDIO_CAMPAIGNS_REPORT", "adstudio/campaigns/report", 61, "adstudio");
                }
                return null;
            case 796083798:
                if (str.equals("RECOMMENDED_MUSIC_VIDEOS")) {
                    return G1("RECOMMENDED_MUSIC_VIDEOS", "recommended-music-videos", 1632, "recommended-music-videos");
                }
                return null;
            case 817413670:
                if (str.equals("ADSTUDIO_COLD_START_AD_FULL_SERVICE_AUDIO")) {
                    return G1("ADSTUDIO_COLD_START_AD_FULL_SERVICE_AUDIO", "adstudio/cold-start/ad-full-service-audio", 65, "adstudio");
                }
                return null;
            case 822087926:
                if (str.equals("WWW_ACCOUNT_PAGES_MANAGEYOURPLAN")) {
                    return G1("WWW_ACCOUNT_PAGES_MANAGEYOURPLAN", "www-account-pages/manageyourplan", 2217, "www-account-pages");
                }
                return null;
            case 877000166:
                if (str.equals("PREMIUM_DESTINATION")) {
                    return f4();
                }
                return null;
            case 898866022:
                if (str.equals("ADSTUDIO_REPORT_DUPLICATE")) {
                    return G1("ADSTUDIO_REPORT_DUPLICATE", "adstudio/report/duplicate", Error.TOO_YOUNG_FIELD_NUMBER, "adstudio");
                }
                return null;
            case 967283750:
                if (str.equals("ADSTUDIO_ASSET_LIBRARY")) {
                    return G1("ADSTUDIO_ASSET_LIBRARY", "adstudio/asset-library", 49, "adstudio");
                }
                return null;
            case 968715142:
                if (str.equals("S4P_PODCAST_EPISODE_EDIT_THUMBNAIL")) {
                    return G1("S4P_PODCAST_EPISODE_EDIT_THUMBNAIL", "s4p/podcast/episode/edit-thumbnail", 1730, "s4p");
                }
                return null;
            case 1132975382:
                if (str.equals("MRKT_ARTIST_PROFILE_AVATAR")) {
                    return G1("MRKT_ARTIST_PROFILE_AVATAR", "mrkt/artist/profile/avatar", 1118, "mrkt");
                }
                return null;
            case 1148120678:
                if (str.equals("MARKETOPPORTUNITIES_PRECACHING")) {
                    return G1("MARKETOPPORTUNITIES_PRECACHING", "marketopportunities/precaching", 1012, "marketopportunities");
                }
                return null;
            case 1215970214:
                if (str.equals("SHARE_MESSENGER_COMPOSE")) {
                    return G1("SHARE_MESSENGER_COMPOSE", "share/messenger/compose", 1863, "share");
                }
                return null;
            case 1266600198:
                if (str.equals("WWW_ACCOUNT_PAGES_AUDIOBOOK_LISTENING_TIME")) {
                    return G1("WWW_ACCOUNT_PAGES_AUDIOBOOK_LISTENING_TIME", "www-account-pages/audiobook-listening-time", 2187, "www-account-pages");
                }
                return null;
            case 1304753350:
                if (str.equals("GENALPHA_LOGOUTALL")) {
                    return G1("GENALPHA_LOGOUTALL", "genalpha/logoutall", 603, "genalpha");
                }
                return null;
            case 1397929542:
                if (str.equals("CHALLENGE_MFA_SMS")) {
                    return G1("CHALLENGE_MFA_SMS", "challenge/mfa-sms", 297, "challenge");
                }
                return null;
            case 1406539302:
                if (str.equals("MRKT_FRONTDOOR_MERCH")) {
                    return G1("MRKT_FRONTDOOR_MERCH", "mrkt/frontdoor/merch", 1262, "mrkt");
                }
                return null;
            case 1417164118:
                if (str.equals("S4P_ANALYTICS")) {
                    return G1("S4P_ANALYTICS", "s4p/analytics", 1663, "s4p");
                }
                return null;
            case 1496782614:
                if (str.equals("CHALLENGE_EMAIL_PASSWORDLESSLOGIN")) {
                    return G1("CHALLENGE_EMAIL_PASSWORDLESSLOGIN", "challenge/email/passwordlesslogin", 294, "challenge");
                }
                return null;
            case 1521454822:
                if (str.equals("S4P_SHOWS")) {
                    return G1("S4P_SHOWS", "s4p/shows", 1763, "s4p");
                }
                return null;
            case 1569922454:
                if (str.equals("BOOTCAMP_TOP50PLAYLIST")) {
                    return G1("BOOTCAMP_TOP50PLAYLIST", "bootcamp/top50playlist", 245, "bootcamp");
                }
                return null;
            case 1603636550:
                if (str.equals("UPSELLS_SHEET")) {
                    return G1("UPSELLS_SHEET", "upsells/sheet", 2071, "upsells");
                }
                return null;
            case 1639270886:
                if (str.equals("PRERELEASE_MUSIC_VIDEO")) {
                    return G1("PRERELEASE_MUSIC_VIDEO", "prerelease/music-video", 1561, "prerelease");
                }
                return null;
            case 1665436278:
                if (str.equals("GOLDENPATH_CHRISTINAD")) {
                    return G1("GOLDENPATH_CHRISTINAD", "goldenpath/christinad", 628, "goldenpath");
                }
                return null;
            case 1683776518:
                if (str.equals("UBI_DEBUG_MONITOR_RECENTEVENTSLIST")) {
                    return G1("UBI_DEBUG_MONITOR_RECENTEVENTSLIST", "ubi/debug-monitor/recenteventslist", 2057, "ubi");
                }
                return null;
            case 1709529942:
                if (str.equals("PAGE_MATCH_OUTBOUND_SCANNING")) {
                    return G1("PAGE_MATCH_OUTBOUND_SCANNING", "page-match/outbound-scanning", 1395, "page-match");
                }
                return null;
            case 1735759638:
                if (str.equals("GOLDENPATH_EHENRIKSSON")) {
                    return G1("GOLDENPATH_EHENRIKSSON", "goldenpath/ehenriksson", 639, "goldenpath");
                }
                return null;
            case 1757242182:
                if (str.equals("MEMBERSHIP_CONSUMER_CHECKOUT")) {
                    return G1("MEMBERSHIP_CONSUMER_CHECKOUT", "membership/consumer/checkout", 1020, "membership");
                }
                return null;
            case 1767031270:
                if (str.equals("S4P_COMMENT_USER_REACTIONS")) {
                    return G1("S4P_COMMENT_USER_REACTIONS", "s4p/comment-user-reactions", 1690, "s4p");
                }
                return null;
            case 1779105350:
                if (str.equals("S4P_INTERACT")) {
                    return G1("S4P_INTERACT", "s4p/interact", 1713, "s4p");
                }
                return null;
            case 1847515734:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUTHORS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUTHORS", "spotify-for-authors/authors", 1940, "spotify-for-authors");
                }
                return null;
            case 1875087910:
                if (str.equals("LOCKSTATE")) {
                    return G1("LOCKSTATE", "lockstate", 936, "lockstate");
                }
                return null;
            case 1886767318:
                if (str.equals("LIVESTREAMING")) {
                    return G1("LIVESTREAMING", "livestreaming", 934, "livestreaming");
                }
                return null;
            case 1971252294:
                if (str.equals("SUPPORT_ARTICLE")) {
                    return G1("SUPPORT_ARTICLE", "support/article", 2031, "support");
                }
                return null;
            case 1987758006:
                if (str.equals("HIFI_ONBOARDING")) {
                    return G1("HIFI_ONBOARDING", "hifi/onboarding", 789, "hifi");
                }
                return null;
            case 1987974070:
                if (str.equals("ENTITYSEGMENTS_CLIP_NOTE_CREATE")) {
                    return G1("ENTITYSEGMENTS_CLIP_NOTE_CREATE", "entitysegments/clip/note/create", 520, "entitysegments");
                }
                return null;
            case 1993669174:
                if (str.equals("PORTAL_SEARCH_DOCUMENTATION")) {
                    return G1("PORTAL_SEARCH_DOCUMENTATION", "portal/search-documentation", 1530, "portal");
                }
                return null;
            case 2045093878:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_DETAILS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_UPLOAD_DETAILS", "spotify-for-authors/upload/details", 1957, "spotify-for-authors");
                }
                return null;
            case 2069170614:
                if (str.equals("KID_ACCOUNT_TRANSITION_PIN")) {
                    return G1("KID_ACCOUNT_TRANSITION_PIN", "kid-account-transition/pin", 896, "kid-account-transition");
                }
                return null;
            case 2089849238:
                if (str.equals("HACKWEEK2023_SYNC_LIGHTS")) {
                    return G1("HACKWEEK2023_SYNC_LIGHTS", "hackweek2023/sync-lights", 782, "hackweek2023");
                }
                return null;
            case 2104453702:
                if (str.equals("LOGIN_EMAILNOTLINKED")) {
                    return G1("LOGIN_EMAILNOTLINKED", "login/emailnotlinked", 954, "login");
                }
                return null;
            case 2142380742:
                if (str.equals("SPOTIT_STRONGRESULT")) {
                    return G1("SPOTIT_STRONGRESULT", "spotit/strongresult", 1967, "spotit");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Z(ay8 ay8Var, onm onmVar) throws ItemUnavailableException {
        lrg1 lrg1Var;
        if (onmVar instanceof lrg1) {
            lrg1Var = (lrg1) onmVar;
            int i = lrg1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrg1Var.b = i - Integer.MIN_VALUE;
            } else {
                lrg1Var = new lrg1(onmVar);
            }
        } else {
            lrg1Var = new lrg1(onmVar);
        }
        Object objJ = lrg1Var.a;
        int i2 = lrg1Var.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objJ);
            q1c1 q1c1Var = new q1c1(2, lnmVar, (byte) 15);
            lrg1Var.b = 1;
            objJ = b5p1.j(ay8Var, q1c1Var, lrg1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }

    public static p6r0 Z0() {
        return G1("CONTEXTMENU_EPISODE_SLEEPTIMER", "contextmenu/episode/sleeptimer", 430, "contextmenu");
    }

    public static p6r0 Z1() {
        return G1("HOME_WRAPPED", "home/wrapped", 810, "home");
    }

    public static p6r0 Z2() {
        return G1("NOWPLAYING_NOWPLAYINGSIDEBAR", "nowplaying/nowplayingsidebar", 1358, "nowplaying");
    }

    public static p6r0 Z3() {
        return G1("PREMIUM_ACCOUNT_MANAGEMENT_ALL_PLANS", "premium-account-management/all-plans", 1539, "premium-account-management");
    }

    public static p6r0 Z4() {
        return G1("SETTINGS_APP_ICON", "settings/app-icon", 1807, "settings");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 Z5(String str) {
        switch (str.hashCode()) {
            case -2097816057:
                if (str.equals("S4P_PODCAST_EPISODE_PREVIEW_PLAYER")) {
                    return G1("S4P_PODCAST_EPISODE_PREVIEW_PLAYER", "s4p/podcast/episode/preview-player", 1735, "s4p");
                }
                return null;
            case -2072591433:
                if (str.equals("SETTINGS_UPDATE_EMAIL_ADDRESS")) {
                    return G1("SETTINGS_UPDATE_EMAIL_ADDRESS", "settings/update-email-address", 1849, "settings");
                }
                return null;
            case -2054204249:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_ENTRY")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_ENTRY", "spotify-for-authors/dvn-creation/entry", 1944, "spotify-for-authors");
                }
                return null;
            case -2038485657:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_VOICE")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_VOICE", "spotify-for-authors/dvn-creation/voice", 1949, "spotify-for-authors");
                }
                return null;
            case -2021370281:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_CREATE")) {
                    return G1("MRKT_ARTIST_PRE_RELEASE_CREATE", "mrkt/artist/pre-release/create", 1107, "mrkt");
                }
                return null;
            case -2003769305:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_DETAILS")) {
                    return G1("MRKT_ARTIST_PRE_RELEASE_DETAILS", "mrkt/artist/pre-release/details", 1108, "mrkt");
                }
                return null;
            case -1995688473:
                if (str.equals("DIALOG_LOCALFILESIMPORT_DISCARD")) {
                    return G1("DIALOG_LOCALFILESIMPORT_DISCARD", "dialog/localfilesimport/discard", 482, "dialog");
                }
                return null;
            case -1976883801:
                if (str.equals("S4P_ANALYTICS_MILESTONE")) {
                    return G1("S4P_ANALYTICS_MILESTONE", "s4p/analytics/milestone", 1667, "s4p");
                }
                return null;
            case -1965419145:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VIDEOSETTINGS")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VIDEOSETTINGS", "www-account-pages/parental-settings/videosettings", 2231, "www-account-pages");
                }
                return null;
            case -1963807113:
                if (str.equals("CARS_LOCKSCREEN")) {
                    return G1("CARS_LOCKSCREEN", "cars/lockscreen", 283, "cars");
                }
                return null;
            case -1932835401:
                if (str.equals("MANAGE_SUBSCRIPTION")) {
                    return G1("MANAGE_SUBSCRIPTION", "manage-subscription", 990, "manage-subscription");
                }
                return null;
            case -1902864825:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_REVIEW")) {
                    return G1("MRKT_DM_MANAGED_SERVICE_REVIEW", "mrkt/dm-managed-service/review", 1234, "mrkt");
                }
                return null;
            case -1847592137:
                if (str.equals("PUFFIN_INTRO")) {
                    return G1("PUFFIN_INTRO", "puffin/intro", 1596, "puffin");
                }
                return null;
            case -1843968521:
                if (str.equals("MULTI_USER_PLAN_VERIFICATION_ONBOARDING")) {
                    return R2();
                }
                return null;
            case -1833275001:
                if (str.equals("WEAR_ENTITY_PAGE_EPISODE_PAGE")) {
                    return G1("WEAR_ENTITY_PAGE_EPISODE_PAGE", "wear/entity-page/episode_page", 2141, "wear");
                }
                return null;
            case -1772783369:
                if (str.equals("LEARNINGHUB")) {
                    return G1("LEARNINGHUB", "learninghub", 904, "learninghub");
                }
                return null;
            case -1732570681:
                if (str.equals("SEARCH_GENRES")) {
                    return G1("SEARCH_GENRES", "search/genres", 1787, "search");
                }
                return null;
            case -1725436857:
                if (str.equals("ONETAPBROWSE")) {
                    return G1("ONETAPBROWSE", "onetapbrowse", 1380, "onetapbrowse");
                }
                return null;
            case -1720716121:
                if (str.equals("RADIO_DAILY_MIX_SURVEY")) {
                    return G1("RADIO_DAILY_MIX_SURVEY", "radio/daily-mix-survey", 1612, "radio");
                }
                return null;
            case -1698330665:
                if (str.equals("SONG_DNA_ARTIST_ROLES")) {
                    return G1("SONG_DNA_ARTIST_ROLES", "song-dna-artist-roles", 1919, "song-dna-artist-roles");
                }
                return null;
            case -1695310457:
                if (str.equals("DIALOG_LOCALFILESIMPORT_SONGS")) {
                    return G1("DIALOG_LOCALFILESIMPORT_SONGS", "dialog/localfilesimport/songs", 484, "dialog");
                }
                return null;
            case -1677496137:
                if (str.equals("PLAYLIST_ONDEMAND")) {
                    return G1("PLAYLIST_ONDEMAND", "playlist/ondemand", 1469, "playlist");
                }
                return null;
            case -1668655081:
                if (str.equals("STS_EDIT")) {
                    return G1("STS_EDIT", "sts/edit", 1985, "sts");
                }
                return null;
            case -1643428361:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_GLOBAL_TRENDS")) {
                    return G1("MRKT_FRONTDOOR_FAN_STUDY_GLOBAL_TRENDS", "mrkt/frontdoor/fan-study/global-trends", 1252, "mrkt");
                }
                return null;
            case -1612299561:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_DRAFT")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_DRAFT", "mrkt/artist/campaigns/marquee-and-showcase/draft", 1071, "mrkt");
                }
                return null;
            case -1561466169:
                if (str.equals("COLLECTION_PODCASTS_EPISODES")) {
                    return G1("COLLECTION_PODCASTS_EPISODES", "collection/podcasts/episodes", 357, "collection");
                }
                return null;
            case -1560022841:
                if (str.equals("JAM_INVITESLEARNMORESHEET")) {
                    return G1("JAM_INVITESLEARNMORESHEET", "jam/inviteslearnmoresheet", 857, "jam");
                }
                return null;
            case -1523622793:
                if (str.equals("MARTINI_CONTENT_STORY_SOURCES")) {
                    return G1("MARTINI_CONTENT_STORY_SOURCES", "martini/content-story-sources", 1015, "martini");
                }
                return null;
            case -1505690201:
                if (str.equals("AUDIOBOOK_DIRECTSALES_SUCCESS")) {
                    return G1("AUDIOBOOK_DIRECTSALES_SUCCESS", "audiobook/directsales/success", 201, "audiobook");
                }
                return null;
            case -1497930985:
                if (str.equals("AUDIOBOOK_SERIES")) {
                    return G1("AUDIOBOOK_SERIES", "audiobook-series", 195, "audiobook-series");
                }
                return null;
            case -1490299481:
                if (str.equals("FREE_TIER_HOME_DRILLDOWN")) {
                    return G1("FREE_TIER_HOME_DRILLDOWN", "free-tier-home/drilldown", 570, "free-tier-home");
                }
                return null;
            case -1453766505:
                if (str.equals("AGE_ASSURANCE_CALLBACK")) {
                    return G1("AGE_ASSURANCE_CALLBACK", "age-assurance/callback", 120, "age-assurance");
                }
                return null;
            case -1436693129:
                if (str.equals("CREATORFOLLOW_SLATE")) {
                    return G1("CREATORFOLLOW_SLATE", "creatorfollow/slate", 463, "creatorfollow");
                }
                return null;
            case -1415442729:
                if (str.equals("MRKT_BULK_CAMPAIGNS_FORECAST_ERRORS")) {
                    return G1("MRKT_BULK_CAMPAIGNS_FORECAST_ERRORS", "mrkt/bulk-campaigns/forecast/errors", 1188, "mrkt");
                }
                return null;
            case -1354436457:
                if (str.equals("BROWSE_NEWRELEASES")) {
                    return G1("BROWSE_NEWRELEASES", "browse/newreleases", 251, "browse");
                }
                return null;
            case -1315860633:
                if (str.equals("SPOTIT_WEAKRESULT")) {
                    return G1("SPOTIT_WEAKRESULT", "spotit/weakresult", 1968, "spotit");
                }
                return null;
            case -1300516329:
                if (str.equals("MRKT_CANVAS_UPLOAD")) {
                    return G1("MRKT_CANVAS_UPLOAD", "mrkt/canvas/upload", 1197, "mrkt");
                }
                return null;
            case -1282089977:
                if (str.equals("PODCAST_SHOW_MEMBERSHIPSUCCESSMODAL")) {
                    return G1("PODCAST_SHOW_MEMBERSHIPSUCCESSMODAL", "podcast/show/membershipsuccessmodal", 1499, "podcast");
                }
                return null;
            case -1273463849:
                if (str.equals("MRKT_TEAM_MANAGEMENT_DETAILS")) {
                    return G1("MRKT_TEAM_MANAGEMENT_DETAILS", "mrkt/team-management/details", 1309, "mrkt");
                }
                return null;
            case -1272281561:
                if (str.equals("SHOWS_CATEGORY")) {
                    return G1("SHOWS_CATEGORY", "shows/category", 1871, "shows");
                }
                return null;
            case -1246781737:
                if (str.equals("PERMISSIONS_BLUETOOTH_REQUEST_FULLSCREEN")) {
                    return G1("PERMISSIONS_BLUETOOTH_REQUEST_FULLSCREEN", "permissions/bluetooth/request/fullscreen", 1430, "permissions");
                }
                return null;
            case -1159924153:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_TEAM")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_TEAM", "mrkt/artist/campaigns/marquee-and-showcase/team", 1074, "mrkt");
                }
                return null;
            case -1138014921:
                if (str.equals("GOLDENPATH_AMEET")) {
                    return G1("GOLDENPATH_AMEET", "goldenpath/ameet", 618, "goldenpath");
                }
                return null;
            case -1129643449:
                if (str.equals("GOLDENPATH_JOELD")) {
                    return G1("GOLDENPATH_JOELD", "goldenpath/joeld", 670, "goldenpath");
                }
                return null;
            case -1044605721:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS")) {
                    return G1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS", "mrkt/debug/hubs/component-reference/buttons", 1203, "mrkt");
                }
                return null;
            case -1036912585:
                if (str.equals("PHONENUMBER_CALLINGCODEPICKER")) {
                    return G1("PHONENUMBER_CALLINGCODEPICKER", "phonenumber/callingcodepicker", 1435, "phonenumber");
                }
                return null;
            case -1029379977:
                if (str.equals("MRKT_FRONTDOOR_MERCH_LIVE_AND_MORE")) {
                    return G1("MRKT_FRONTDOOR_MERCH_LIVE_AND_MORE", "mrkt/frontdoor/merch-live-and-more", 1263, "mrkt");
                }
                return null;
            case -952691673:
                if (str.equals("ADSTUDIO_BUSINESS_PARTNERS_DETAILS")) {
                    return G1("ADSTUDIO_BUSINESS_PARTNERS_DETAILS", "adstudio/business/partners/details", 57, "adstudio");
                }
                return null;
            case -869673225:
                if (str.equals("AUDIOBOOK_CONSUMPTIONCAP")) {
                    return V();
                }
                return null;
            case -802288985:
                if (str.equals("WATCHAPP_DEBUG_INFO")) {
                    return G1("WATCHAPP_DEBUG_INFO", "watchapp/debug-info", 2096, "watchapp");
                }
                return null;
            case -770721209:
                if (str.equals("SUPPORT_SITE_HOME")) {
                    return G1("SUPPORT_SITE_HOME", "support-site/home", 2023, "support-site");
                }
                return null;
            case -712562809:
                if (str.equals("MRKT_ARTIST_CAMPAIGN_ADMIN")) {
                    return G1("MRKT_ARTIST_CAMPAIGN_ADMIN", "mrkt/artist/campaign-admin", 1057, "mrkt");
                }
                return null;
            case -664925321:
                if (str.equals("FREETIER_DATASAVER_STATUS")) {
                    return G1("FREETIER_DATASAVER_STATUS", "freetier/datasaver/status", 582, "freetier");
                }
                return null;
            case -647123545:
                if (str.equals("MRKT_ARTIST_PROFILE_CATALOG_ALBUMS")) {
                    return G1("MRKT_ARTIST_PROFILE_CATALOG_ALBUMS", "mrkt/artist/profile/catalog/albums", 1121, "mrkt");
                }
                return null;
            case -598698873:
                if (str.equals("SEARCH_SONGS")) {
                    return G1("SEARCH_SONGS", "search/songs", 1800, "search");
                }
                return null;
            case -559423097:
                if (str.equals("MRKT_ARTIST_PROFILE_FUNDRAISING")) {
                    return G1("MRKT_ARTIST_PROFILE_FUNDRAISING", "mrkt/artist/profile/fundraising", 1127, "mrkt");
                }
                return null;
            case -556995385:
                if (str.equals("GOLDENPATH_NAZLIZ")) {
                    return G1("GOLDENPATH_NAZLIZ", "goldenpath/nazliz", 719, "goldenpath");
                }
                return null;
            case -555720265:
                if (str.equals("PROFILE_FOLLOW_SUGGESTIONS")) {
                    return G1("PROFILE_FOLLOW_SUGGESTIONS", "profile/follow-suggestions", 1580, "profile");
                }
                return null;
            case -526892201:
                if (str.equals("MRKT_ARTIST_AUDIENCE_RELATED")) {
                    return G1("MRKT_ARTIST_AUDIENCE_RELATED", "mrkt/artist/audience/related", 1051, "mrkt");
                }
                return null;
            case -482848585:
                if (str.equals("SONG_DNA_FEEDBACK")) {
                    return G1("SONG_DNA_FEEDBACK", "song-dna-feedback", 1921, "song-dna-feedback");
                }
                return null;
            case -475997081:
                if (str.equals("PODCAST_SHOW_SETTINGS_MARKASPLAYED")) {
                    return S3();
                }
                return null;
            case -395112921:
                if (str.equals("PROFILE_BLOCKED_LIST")) {
                    return l4();
                }
                return null;
            case -351205529:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CARDVERIFICATION")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_CARDVERIFICATION", "www-account-pages/genalpha/cardverification", 2201, "www-account-pages");
                }
                return null;
            case -330018457:
                if (str.equals("INVITE_HAVEINVITE")) {
                    return G1("INVITE_HAVEINVITE", "invite/haveinvite", 844, "invite");
                }
                return null;
            case -309697801:
                if (str.equals("S4P_ONBOARDING_PUSH_NOTIFICATIONS")) {
                    return G1("S4P_ONBOARDING_PUSH_NOTIFICATIONS", "s4p/onboarding/push-notifications", 1722, "s4p");
                }
                return null;
            case -303624681:
                if (str.equals("PLAYLIST_EDIT_METADATA")) {
                    return G1("PLAYLIST_EDIT_METADATA", "playlist/edit-metadata", 1459, "playlist");
                }
                return null;
            case -297105353:
                if (str.equals("CONTEXTMENU_NOTINTERESTEDFOLLOWUP")) {
                    return G1("CONTEXTMENU_NOTINTERESTEDFOLLOWUP", "contextmenu/notinterestedfollowup", 434, "contextmenu");
                }
                return null;
            case -267998441:
                if (str.equals("ADSTUDIO_AD_AD_SETS")) {
                    return G1("ADSTUDIO_AD_AD_SETS", "adstudio/ad/ad-sets", 36, "adstudio");
                }
                return null;
            case -257079961:
                if (str.equals("MAGPIE_UCP_PROMPT")) {
                    return L2();
                }
                return null;
            case -249343321:
                if (str.equals("VOTING_SHARE")) {
                    return f6();
                }
                return null;
            case -220302249:
                if (str.equals("MRKT_LABS")) {
                    return G1("MRKT_LABS", "mrkt/labs", 1281, "mrkt");
                }
                return null;
            case -219702425:
                if (str.equals("ADSTUDIO_AD_SET_REPORT")) {
                    return G1("ADSTUDIO_AD_SET_REPORT", "adstudio/ad-set/report", 35, "adstudio");
                }
                return null;
            case -194515145:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE_CHANGE_TIER")) {
                    return G1("MEMBERSHIP_CONSUMER_MANAGE_CHANGE_TIER", "membership/consumer/manage/change-tier", 1022, "membership");
                }
                return null;
            case -178090569:
                if (str.equals("CHALLENGE_EMAIL_SIGNUP")) {
                    return G1("CHALLENGE_EMAIL_SIGNUP", "challenge/email/signup", 295, "challenge");
                }
                return null;
            case -160852217:
                if (str.equals("PLAYLIST_HISTORY")) {
                    return G1("PLAYLIST_HISTORY", "playlist/history", 1463, "playlist");
                }
                return null;
            case -137995673:
                if (str.equals("DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE")) {
                    return G1("DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE", "dialog/requestpermissions/showrationale", 488, "dialog");
                }
                return null;
            case -82893401:
                if (str.equals("LISTENINGSTATS_DETAILS")) {
                    return u2();
                }
                return null;
            case -76529433:
                if (str.equals("HOMETHING_ACTIVATION_SCANDEVICES")) {
                    return G1("HOMETHING_ACTIVATION_SCANDEVICES", "homething/activation/scandevices", 823, "homething");
                }
                return null;
            case 79712615:
                if (str.equals("TERMS")) {
                    return G1("TERMS", "terms", 2037, "terms");
                }
                return null;
            case 118666903:
                if (str.equals("UNKNOWN_LEGACYHUB")) {
                    return G1("UNKNOWN_LEGACYHUB", "unknown/legacyhub", 2064, "unknown");
                }
                return null;
            case 154192247:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIENCE_DEMOGRAPHICS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_AUDIENCE_DEMOGRAPHICS", "spotify-for-authors/audience/demographics", 1935, "spotify-for-authors");
                }
                return null;
            case 183517879:
                if (str.equals("SETTINGS_PLAYBACK")) {
                    return G1("SETTINGS_PLAYBACK", "settings/playback", 1842, "settings");
                }
                return null;
            case 275855447:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_DROPZONE")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_DROPZONE", "mrkt/artist/video/music-videos/upload/dropzone", 1165, "mrkt");
                }
                return null;
            case 296335463:
                if (str.equals("BLEND_INVITATION")) {
                    return f0();
                }
                return null;
            case 323086311:
                if (str.equals("SRC_RIGHTSHOLDER_MATCH_DETAILS")) {
                    return G1("SRC_RIGHTSHOLDER_MATCH_DETAILS", "src/rightsholder/match/details", 1974, "src");
                }
                return null;
            case 352102903:
                if (str.equals("MRKT_FRONTDOOR_PLAYLISTING")) {
                    return G1("MRKT_FRONTDOOR_PLAYLISTING", "mrkt/frontdoor/playlisting", 1266, "mrkt");
                }
                return null;
            case 399530551:
                if (str.equals("PREMIUM")) {
                    return G1("PREMIUM", "premium", 1537, "premium");
                }
                return null;
            case 426265271:
                if (str.equals("MANAGED_ACCOUNT_LINKING_INVITE_PARENT")) {
                    return G1("MANAGED_ACCOUNT_LINKING_INVITE_PARENT", "managed-account-linking/invite-parent", 1006, "managed-account-linking");
                }
                return null;
            case 434384823:
                if (str.equals("WWW_ACCOUNT_PAGES_CHANGE_SUBSCRIPTION")) {
                    return G1("WWW_ACCOUNT_PAGES_CHANGE_SUBSCRIPTION", "www-account-pages/change-subscription", 2193, "www-account-pages");
                }
                return null;
            case 448987447:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_DETAILS")) {
                    return G1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_DETAILS", "spotify-for-authors/dvn-creation/details", 1943, "spotify-for-authors");
                }
                return null;
            case 462780951:
                if (str.equals("NOWPLAYING_VIDEOSETTINGS")) {
                    return d3();
                }
                return null;
            case 526971543:
                if (str.equals("ASSISTED_CURATION_SEARCH_ALBUM_ENTITY")) {
                    return G1("ASSISTED_CURATION_SEARCH_ALBUM_ENTITY", "assisted-curation/search/album-entity", 184, "assisted-curation");
                }
                return null;
            case 577539079:
                if (str.equals("SCANNABLES_SCANNER")) {
                    return T4();
                }
                return null;
            case 594254535:
                if (str.equals("OURSONG_INVITE")) {
                    return G1("OURSONG_INVITE", "oursong/invite", 1384, "oursong");
                }
                return null;
            case 638296567:
                if (str.equals("CHURNLOCK")) {
                    return F0();
                }
                return null;
            case 645142087:
                if (str.equals("SETTINGS_LOCAL_FILES")) {
                    return G1("SETTINGS_LOCAL_FILES", "settings/local-files", 1829, "settings");
                }
                return null;
            case 676359767:
                if (str.equals("WEAR_CAPPING_RECOVERY_DIALOG")) {
                    return G1("WEAR_CAPPING_RECOVERY_DIALOG", "wear/capping_recovery_dialog", 2135, "wear");
                }
                return null;
            case 681757319:
                if (str.equals("EXPERIMENTAL_COUNTRYTOPTEN")) {
                    return G1("EXPERIMENTAL_COUNTRYTOPTEN", "experimental/countrytopten", 531, "experimental");
                }
                return null;
            case 739981911:
                if (str.equals("WEAR_LOGIN_ACCOUNT")) {
                    return G1("WEAR_LOGIN_ACCOUNT", "wear/login_account", 2149, "wear");
                }
                return null;
            case 767442247:
                if (str.equals("AGE_ASSURANCE_WEBVIEW")) {
                    return G1("AGE_ASSURANCE_WEBVIEW", "age-assurance/webview", 128, "age-assurance");
                }
                return null;
            case 768507655:
                if (str.equals("PUFFIN_AUTODETECT")) {
                    return G1("PUFFIN_AUTODETECT", "puffin/autodetect", 1594, "puffin");
                }
                return null;
            case 780440919:
                if (str.equals("HOME_MUSIC_FOLLOWING")) {
                    return R1();
                }
                return null;
            case 831055159:
                if (str.equals("WEAR_BLUETOOTH_PAIRING")) {
                    return G1("WEAR_BLUETOOTH_PAIRING", "wear/bluetooth_pairing", 2134, "wear");
                }
                return null;
            case 917026247:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM_REPORT")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_DM_REPORT", "mrkt/artist/campaigns/dm/report", 1063, "mrkt");
                }
                return null;
            case 942663111:
                if (str.equals("SPEED_CONTROL_EDITOR")) {
                    return G1("SPEED_CONTROL_EDITOR", "speed-control/editor", 1928, "speed-control");
                }
                return null;
            case 943041879:
                if (str.equals("COURSE_HOME_ONBOARDING")) {
                    return G1("COURSE_HOME_ONBOARDING", "course/home/onboarding", 456, "course");
                }
                return null;
            case 949205431:
                if (str.equals("GOLDENPATH_OGALLON")) {
                    return G1("GOLDENPATH_OGALLON", "goldenpath/ogallon", 725, "goldenpath");
                }
                return null;
            case 961931639:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_RESETPASSWORD")) {
                    return G1("LOGIN_ACCOUNTRECOVERY_RESETPASSWORD", "login/accountrecovery/resetpassword", 942, "login");
                }
                return null;
            case 1052116999:
                if (str.equals("FANDOM_TOPARTISTS")) {
                    return G1("FANDOM_TOPARTISTS", "fandom/topartists", 547, "fandom");
                }
                return null;
            case 1054574999:
                if (str.equals("IMAGEGALLERY")) {
                    return b2();
                }
                return null;
            case 1059797207:
                if (str.equals("ADAPTIVEAUTHENTICATION_ERROR")) {
                    return w();
                }
                return null;
            case 1109802327:
                if (str.equals("MRKT_DEBUG_KAIZEN_COMPONENT_REFERENCE")) {
                    return G1("MRKT_DEBUG_KAIZEN_COMPONENT_REFERENCE", "mrkt/debug/kaizen/component-reference", 1214, "mrkt");
                }
                return null;
            case 1147912183:
                if (str.equals("GRADUATION_EDUCATION")) {
                    return I1();
                }
                return null;
            case 1152841751:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD", "adstudio/duplicate-ad-set-only/ad", 82, "adstudio");
                }
                return null;
            case 1182599159:
                if (str.equals("PLAYLIST_SORTING")) {
                    return G1("PLAYLIST_SORTING", "playlist/sorting", 1474, "playlist");
                }
                return null;
            case 1187955959:
                if (str.equals("WWW_ACCOUNT_PAGES_PRODUCT_CONSIDERATION")) {
                    return G1("WWW_ACCOUNT_PAGES_PRODUCT_CONSIDERATION", "www-account-pages/product-consideration", 2238, "www-account-pages");
                }
                return null;
            case 1313756055:
                if (str.equals("SUPERBOARDING")) {
                    return G1("SUPERBOARDING", "superboarding", 2018, "superboarding");
                }
                return null;
            case 1339484567:
                if (str.equals("CAR_MODE_YOURLIBRARY")) {
                    return G1("CAR_MODE_YOURLIBRARY", "car-mode/yourLibrary", 276, "car-mode");
                }
                return null;
            case 1371997159:
                if (str.equals("READALONG_SHARE")) {
                    return G1("READALONG_SHARE", "readalong/share", 1629, "readalong");
                }
                return null;
            case 1387818039:
                if (str.equals("KID_ACCOUNT_TRANSITION_SUBMIT")) {
                    return o2();
                }
                return null;
            case 1395057047:
                if (str.equals("ASSISTED_CURATION_SEARCH_ARTIST_ENTITY")) {
                    return G1("ASSISTED_CURATION_SEARCH_ARTIST_ENTITY", "assisted-curation/search/artist-entity", 186, "assisted-curation");
                }
                return null;
            case 1404599175:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_SETUP")) {
                    return G1("SPOTIFYBUTTON_ACTIVATION_SETUP", "spotifybutton/activation/setup", 1963, "spotifybutton");
                }
                return null;
            case 1421763943:
                if (str.equals("S4P_QNA_RESPONSES")) {
                    return G1("S4P_QNA_RESPONSES", "s4p/qna-responses", 1739, "s4p");
                }
                return null;
            case 1493182343:
                if (str.equals("MANAGED_ACCOUNT_LINKING_SHARE_INVITE_LINK")) {
                    return G1("MANAGED_ACCOUNT_LINKING_SHARE_INVITE_LINK", "managed-account-linking/share-invite-link", 1009, "managed-account-linking");
                }
                return null;
            case 1521400583:
                if (str.equals("YOURSPOTIFY")) {
                    return G1("YOURSPOTIFY", "yourspotify", 2275, "yourspotify");
                }
                return null;
            case 1524040151:
                if (str.equals("ADSTUDIO_SIGN_UP")) {
                    return G1("ADSTUDIO_SIGN_UP", "adstudio/sign-up", 115, "adstudio");
                }
                return null;
            case 1644604967:
                if (str.equals("GOLDENPATH_KEIWANM")) {
                    return G1("GOLDENPATH_KEIWANM", "goldenpath/keiwanm", 682, "goldenpath");
                }
                return null;
            case 1653330647:
                if (str.equals("SHOWS_FORMAT_NOWPLAYING")) {
                    return G1("SHOWS_FORMAT_NOWPLAYING", "shows/format/nowplaying", 1874, "shows");
                }
                return null;
            case 1674768999:
                if (str.equals("READALONG")) {
                    return G1("READALONG", "readalong", 1626, "readalong");
                }
                return null;
            case 1711000407:
                if (str.equals("S4P_PODCAST_EPISODE_ANALYTICS")) {
                    return G1("S4P_PODCAST_EPISODE_ANALYTICS", "s4p/podcast/episode/analytics", 1729, "s4p");
                }
                return null;
            case 1725103879:
                if (str.equals("CHALLENGE_MFA_SWITCH")) {
                    return G1("CHALLENGE_MFA_SWITCH", "challenge/mfa-switch", 298, "challenge");
                }
                return null;
            case 1730259543:
                if (str.equals("ADSTUDIO_SBL")) {
                    return G1("ADSTUDIO_SBL", "adstudio/sbl", 109, "adstudio");
                }
                return null;
            case 1744148295:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS")) {
                    return G1("WWW_ACCOUNT_PAGES_LOGIN_METHODS", "www-account-pages/login-methods", 2211, "www-account-pages");
                }
                return null;
            case 1774504983:
                if (str.equals("COLLECTION_EPISODES_REMOVEALL")) {
                    return G1("COLLECTION_EPISODES_REMOVEALL", "collection/episodes/removeall", 351, "collection");
                }
                return null;
            case 1784494919:
                if (str.equals("IRONCHEF_PREVIEWSONGS")) {
                    return G1("IRONCHEF_PREVIEWSONGS", "ironchef/previewsongs", 850, "ironchef");
                }
                return null;
            case 1834177287:
                if (str.equals("S4P_ANALYTICS_MILESTONE_PLAYS")) {
                    return G1("S4P_ANALYTICS_MILESTONE_PLAYS", "s4p/analytics/milestone/plays", 1669, "s4p");
                }
                return null;
            case 1921895335:
                if (str.equals("SUPPORT_SITE_SEARCH_RESULTS")) {
                    return G1("SUPPORT_SITE_SEARCH_RESULTS", "support-site/search-results", 2030, "support-site");
                }
                return null;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    return N();
                }
                return null;
            case 2033577543:
                if (str.equals("PARENTAL_CONTROL_UPDATE_BIRTHDAY")) {
                    return r3();
                }
                return null;
            case 2034970407:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_SUCCESS")) {
                    return G1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_SUCCESS", "mrkt/artist/video/music-videos/upload/success", 1168, "mrkt");
                }
                return null;
            case 2036137495:
                if (str.equals("LISTENINGACTIVITY_AUDIENCESETTING")) {
                    return q2();
                }
                return null;
            case 2043907527:
                if (str.equals("CHECKOUT_CHOICESCREEN_UC")) {
                    return G1("CHECKOUT_CHOICESCREEN_UC", "checkout/choicescreen-uc", 334, "checkout");
                }
                return null;
            case 2048506263:
                if (str.equals("PODCASTINTERACTIVITY_POLL")) {
                    return G1("PODCASTINTERACTIVITY_POLL", "podcastinteractivity/poll", 1514, "podcastinteractivity");
                }
                return null;
            case 2130135351:
                if (str.equals("GOLDENPATH_JENNALEE")) {
                    return G1("GOLDENPATH_JENNALEE", "goldenpath/jennalee", 666, "goldenpath");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(y7e1 y7e1Var, boolean z, qim0 qim0Var, fnv fnvVar, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(881594700);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(y7e1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? b0kVar3.g(fnvVar) : b0kVar3.i(fnvVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(function0) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT;
            boolean zI = b0kVar3.i(lz20Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new fx1(lz20Var, (lnm) null, (byte) 4);
                b0kVar3.s0(objT2);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT2);
            String strO0 = cwl1.o0(b0kVar3, 2131955182);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwr uwrVar = cbx.a;
            fyx fyxVar = new fyx(new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).b.c, cbx.a(b0kVar3).b.d, 384));
            boolean zG = b0kVar3.g(strO0);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new i3o(strO0, (byte) 25);
                b0kVar3.s0(objT3);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(vby0.p(s161.b(nim0Var, false, (iu30) objT3), lz20Var), 1.0f);
            int i3 = i2;
            rwo1.a(y7e1Var, fyxVar, qim0VarF, (max) null, cwl1.o0(b0kVar3, 2131955176), (vu30) null, (vu30) null, z || fnvVar != null, (dk80) null, (lee1) null, (kua0) null, (yta0) null, new c6e1(5, 0, 2), (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, b0kVar3, i2 & 14, 0, 0, 2088680);
            b0kVar2 = b0kVar3;
            String string = y7e1Var.d().d.toString();
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(string);
            int i4 = 0;
            while (characterInstance.next() != -1) {
                i4++;
            }
            cvx cvxVar = cbx.b(b0kVar2).b;
            b(i4, ((i3 << 3) & 896) | 48, b0kVar2, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), z);
            if (fnvVar != null) {
                b0kVar2.i0(938302241);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                j(fnvVar, function0, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar2, (i3 >> 9) & 126);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(938497324);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(y7e1Var, z, qim0Var, fnvVar, function0, i, (byte) 13);
        }
    }

    public static p6r0 a0() {
        return G1("BACKGROUND", "background", 211, "background");
    }

    public static p6r0 a1() {
        return G1("CONTEXTMENU_PLAYLIST", "contextmenu/playlist", 435, "contextmenu");
    }

    public static p6r0 a2() {
        return G1("IMAGE_PICKER", "image-picker", 827, "image-picker");
    }

    public static p6r0 a3() {
        return G1("NOWPLAYING_NOWPLAYINGSIDEBAREMPTY", "nowplaying/nowplayingsidebarempty", 1359, "nowplaying");
    }

    public static p6r0 a4() {
        return G1("PREMIUM_ACCOUNT_MANAGEMENT_AVAILABLE_PLANS", "premium-account-management/available-plans", 1540, "premium-account-management");
    }

    public static p6r0 a5() {
        return G1("SETTINGS_BUSINESS_INFORMATION", "settings/business-information", 1809, "settings");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 a6(String str) {
        switch (str.hashCode()) {
            case -2119734712:
                if (str.equals("S4P_DEBUG_PERMISSIONS")) {
                    return G1("S4P_DEBUG_PERMISSIONS", "s4p/debug/permissions", 1702, "s4p");
                }
                return null;
            case -2103385192:
                if (str.equals("WEAR_ADD_TO_PLAYLIST")) {
                    return G1("WEAR_ADD_TO_PLAYLIST", "wear/add_to_playlist", 2131, "wear");
                }
                return null;
            case -2062950984:
                if (str.equals("WATCHAPP_NOW_PLAYING")) {
                    return G1("WATCHAPP_NOW_PLAYING", "watchapp/now-playing", 2112, "watchapp");
                }
                return null;
            case -1973070696:
                if (str.equals("NOWPLAYING")) {
                    return X2();
                }
                return null;
            case -1925238360:
                if (str.equals("ASSISTED_CURATION_SEARCH_ALBUMS")) {
                    return G1("ASSISTED_CURATION_SEARCH_ALBUMS", "assisted-curation/search/albums", 185, "assisted-curation");
                }
                return null;
            case -1878908312:
                if (str.equals("WEAR_SEARCH")) {
                    return G1("WEAR_SEARCH", "wear/search", 2153, "wear");
                }
                return null;
            case -1876269224:
                if (str.equals("FRIENDSACTIVITY_FRIENDSLIST")) {
                    return G1("FRIENDSACTIVITY_FRIENDSLIST", "friendsactivity/friendslist", 592, "friendsactivity");
                }
                return null;
            case -1853007448:
                if (str.equals("SEARCH")) {
                    return U4();
                }
                return null;
            case -1849137896:
                if (str.equals("SIGNUP")) {
                    return G1("SIGNUP", "signup", 1882, "signup");
                }
                return null;
            case -1847251128:
                if (str.equals("PROFILE_TOP_TRACKS")) {
                    return G1("PROFILE_TOP_TRACKS", "profile/top-tracks", 1591, "profile");
                }
                return null;
            case -1846648200:
                if (str.equals("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT")) {
                    return G1("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT", "parental-control/manage-blocked-content", 1410, "parental-control");
                }
                return null;
            case -1821542984:
                if (str.equals("PLAYLIST_EDIT_ITEMS")) {
                    return G1("PLAYLIST_EDIT_ITEMS", "playlist/edit-items", 1458, "playlist");
                }
                return null;
            case -1770932264:
                if (str.equals("WATCHAPP_DOWNLOADS_REMOTE_ONBOARDING_PHONE_DISCONNECTED")) {
                    return G1("WATCHAPP_DOWNLOADS_REMOTE_ONBOARDING_PHONE_DISCONNECTED", "watchapp/downloads/remote-onboarding/phone-disconnected", 2102, "watchapp");
                }
                return null;
            case -1729017784:
                if (str.equals("WATCHAPP_APPLICATION_LOG")) {
                    return G1("WATCHAPP_APPLICATION_LOG", "watchapp/application-log", 2092, "watchapp");
                }
                return null;
            case -1608152472:
                if (str.equals("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT_SEARCH")) {
                    return G1("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT_SEARCH", "parental-control/manage-approved-content/search", 1409, "parental-control");
                }
                return null;
            case -1503149448:
                if (str.equals("PODCAST_NEW_EPISODE_NOTIFICATIONS_SETTINGS")) {
                    return P3();
                }
                return null;
            case -1485670072:
                if (str.equals("JAM_LISTENALONGEXPLAINERSHEET")) {
                    return G1("JAM_LISTENALONGEXPLAINERSHEET", "jam/listenalongexplainersheet", 862, "jam");
                }
                return null;
            case -1442048616:
                if (str.equals("SETTINGS_CAR")) {
                    return G1("SETTINGS_CAR", "settings/car", 1810, "settings");
                }
                return null;
            case -1416170472:
                if (str.equals("LISTENINGACTIVITY_SETTINGS")) {
                    return G1("LISTENINGACTIVITY_SETTINGS", "listeningactivity/settings", 916, "listeningactivity");
                }
                return null;
            case -1415849208:
                if (str.equals("PROFILE_IMAGE_PICKER")) {
                    return G1("PROFILE_IMAGE_PICKER", "profile/image-picker", 1584, "profile");
                }
                return null;
            case -1397440040:
                if (str.equals("JAM_JOINJAMLISTENINGACTIVITYSHEET")) {
                    return G1("JAM_JOINJAMLISTENINGACTIVITYSHEET", "jam/joinjamlisteningactivitysheet", 860, "jam");
                }
                return null;
            case -1337051752:
                if (str.equals("SRC_RIGHTSHOLDER_CATALOG")) {
                    return G1("SRC_RIGHTSHOLDER_CATALOG", "src/rightsholder/catalog", 1971, "src");
                }
                return null;
            case -1138326824:
                if (str.equals("GOLDENPATH_ABUSH")) {
                    return G1("GOLDENPATH_ABUSH", "goldenpath/abush", 611, "goldenpath");
                }
                return null;
            case -1134344040:
                if (str.equals("GOLDENPATH_ELLAE")) {
                    return G1("GOLDENPATH_ELLAE", "goldenpath/ellae", 640, "goldenpath");
                }
                return null;
            case -1134316792:
                if (str.equals("GOLDENPATH_EMILD")) {
                    return G1("GOLDENPATH_EMILD", "goldenpath/emild", 641, "goldenpath");
                }
                return null;
            case -1121701320:
                if (str.equals("PUFFIN_MANAGEMENT")) {
                    return G1("PUFFIN_MANAGEMENT", "puffin/management", 1597, "puffin");
                }
                return null;
            case -1094681832:
                if (str.equals("FAST_TRACK_PAGE_1")) {
                    return B1();
                }
                return null;
            case -1091488632:
                if (str.equals("FORMATLISTPLATFORM")) {
                    return G1("FORMATLISTPLATFORM", "formatlistplatform", 561, "formatlistplatform");
                }
                return null;
            case -1072008696:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_PREVIEW")) {
                    return G1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_PREVIEW", "mrkt/artist/video/other-videos/manage-associations/preview", 1174, "mrkt");
                }
                return null;
            case -1042897656:
                if (str.equals("ADSTUDIO_BUSINESS_PEOPLE_DETAIL")) {
                    return G1("ADSTUDIO_BUSINESS_PEOPLE_DETAIL", "adstudio/business/people/detail", 59, "adstudio");
                }
                return null;
            case -1042103064:
                if (str.equals("PODCAST_CREATOR_SHOWS")) {
                    return G1("PODCAST_CREATOR_SHOWS", "podcast/creator/shows", 1480, "podcast");
                }
                return null;
            case -1039606088:
                if (str.equals("S4P_EPISODES_SELECT_QNA")) {
                    return G1("S4P_EPISODES_SELECT_QNA", "s4p/episodes/select/qna", 1709, "s4p");
                }
                return null;
            case -1011259496:
                if (str.equals("MAGPIE_FIELD_EDITOR")) {
                    return G1("MAGPIE_FIELD_EDITOR", "magpie/field-editor", 980, "magpie");
                }
                return null;
            case -981241352:
                if (str.equals("S4P_WRAPPED_PRIMARY")) {
                    return G1("S4P_WRAPPED_PRIMARY", "s4p/wrapped-primary", 1773, "s4p");
                }
                return null;
            case -936669336:
                if (str.equals("VOICE_ONBOARDING")) {
                    return G1("VOICE_ONBOARDING", "voice/onboarding", 2082, "voice");
                }
                return null;
            case -892974312:
                if (str.equals("GRADUATION_TEEN_ACCESS")) {
                    return G1("GRADUATION_TEEN_ACCESS", "graduation/teen/access", 773, "graduation");
                }
                return null;
            case -879084808:
                if (str.equals("AUDIOBOOK_HYDE_GATE")) {
                    return G1("AUDIOBOOK_HYDE_GATE", "audiobook/hyde/gate", 203, "audiobook");
                }
                return null;
            case -841145080:
                if (str.equals("SIDEDRAWER")) {
                    return G1("SIDEDRAWER", "sidedrawer", 1881, "sidedrawer");
                }
                return null;
            case -806094600:
                if (str.equals("EMAIL_EDIT_RESETPASSWORD")) {
                    return G1("EMAIL_EDIT_RESETPASSWORD", "email/edit/resetpassword", 507, "email");
                }
                return null;
            case -800553144:
                if (str.equals("S4P_CLAIM_PODCAST_PODCAST_SEARCH_RESULTS")) {
                    return G1("S4P_CLAIM_PODCAST_PODCAST_SEARCH_RESULTS", "s4p/claim-podcast/podcast-search-results", 1685, "s4p");
                }
                return null;
            case -698696792:
                if (str.equals("KID_ACCOUNT_CREATION_PARENTAL_CONTROL")) {
                    return G1("KID_ACCOUNT_CREATION_PARENTAL_CONTROL", "kid-account-creation/parental-control", 881, "kid-account-creation");
                }
                return null;
            case -660437400:
                if (str.equals("SHARE_SHEET_ERROR")) {
                    return G1("SHARE_SHEET_ERROR", "share-sheet/error", 1858, "share-sheet");
                }
                return null;
            case -608634616:
                if (str.equals("YOURLIBRARY")) {
                    return G1("YOURLIBRARY", "yourlibrary", 2255, "yourlibrary");
                }
                return null;
            case -606313640:
                if (str.equals("ARTIST_SAVED_TRACKS")) {
                    return G1("ARTIST_SAVED_TRACKS", "artist/saved-tracks", 176, "artist");
                }
                return null;
            case -561304744:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_NEMO_CONSIDERATION")) {
                    return G1("PREMIUM_ACCOUNT_MANAGEMENT_NEMO_CONSIDERATION", "premium-account-management/nemo-consideration", 1545, "premium-account-management");
                }
                return null;
            case -515011768:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_SEARCH")) {
                    return G1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_SEARCH", "mrkt/artist/video/other-videos/manage-associations/search", 1175, "mrkt");
                }
                return null;
            case -455178168:
                if (str.equals("HOME_PODCASTS_VIDEOS")) {
                    return V1();
                }
                return null;
            case -438967048:
                if (str.equals("EPISODECHAPTERS_CONTENTS")) {
                    return G1("EPISODECHAPTERS_CONTENTS", "episodechapters/contents", 523, "episodechapters");
                }
                return null;
            case -430914456:
                if (str.equals("GRADUATION_APPROVED")) {
                    return H1();
                }
                return null;
            case -366196024:
                if (str.equals("PLAN_MEMBER_INVITATION")) {
                    return x3();
                }
                return null;
            case -338802744:
                if (str.equals("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS")) {
                    return G1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS", "wear/settings/audio_quality_settings", 2160, "wear");
                }
                return null;
            case -242285880:
                if (str.equals("GOLDENPATH_YASIRK")) {
                    return G1("GOLDENPATH_YASIRK", "goldenpath/yasirk", 759, "goldenpath");
                }
                return null;
            case -134547752:
                if (str.equals("S4P_SETTINGS_PODCAST")) {
                    return G1("S4P_SETTINGS_PODCAST", "s4p/settings/podcast", 1745, "s4p");
                }
                return null;
            case -110445528:
                if (str.equals("WWW_ACCOUNT_PAGES_RESUBSCRIPTIONMODAL")) {
                    return G1("WWW_ACCOUNT_PAGES_RESUBSCRIPTIONMODAL", "www-account-pages/resubscriptionmodal", 2241, "www-account-pages");
                }
                return null;
            case -86170408:
                if (str.equals("S4P_COMMENT_REPLIES")) {
                    return G1("S4P_COMMENT_REPLIES", "s4p/comment-replies", 1689, "s4p");
                }
                return null;
            case -49929496:
                if (str.equals("ACCOUNTSWITCHING_ADDACCOUNTTYPESELECTION")) {
                    return u();
                }
                return null;
            case -49548616:
                if (str.equals("CALIFORNIA")) {
                    return G1("CALIFORNIA", "california", 267, "california");
                }
                return null;
            case -33300424:
                if (str.equals("PODCASTCHARTS_CHART")) {
                    return W3();
                }
                return null;
            case -24347800:
                if (str.equals("SIGNUP_OTT")) {
                    return G1("SIGNUP_OTT", "signup/ott", 1891, "signup");
                }
                return null;
            case 2067288:
                if (str.equals("CHAT")) {
                    return p0();
                }
                return null;
            case 34831160:
                if (str.equals("RADIO_STATION_CREATE_ALBUMS")) {
                    return G1("RADIO_STATION_CREATE_ALBUMS", "radio/station/create/albums", 1617, "radio");
                }
                return null;
            case 54162008:
                if (str.equals("PUFFIN_WIRED_MANAGEMENT")) {
                    return G1("PUFFIN_WIRED_MANAGEMENT", "puffin/wired-management", 1603, "puffin");
                }
                return null;
            case 83846168:
                if (str.equals("CHAT_SHARE")) {
                    return C0();
                }
                return null;
            case 93629640:
                if (str.equals("NOTIFICATIONS")) {
                    return G1("NOTIFICATIONS", "notifications", 1349, "notifications");
                }
                return null;
            case 133980072:
                if (str.equals("MRKT_ARTIST_PROFILE_CATALOG_SINGLES")) {
                    return G1("MRKT_ARTIST_PROFILE_CATALOG_SINGLES", "mrkt/artist/profile/catalog/singles", 1123, "mrkt");
                }
                return null;
            case 187798328:
                if (str.equals("ADSTUDIO_COLD_START_AD_SET")) {
                    return G1("ADSTUDIO_COLD_START_AD_SET", "adstudio/cold-start/ad-set", 68, "adstudio");
                }
                return null;
            case 198511000:
                if (str.equals("SUPPORT_SITE_CONTACT")) {
                    return G1("SUPPORT_SITE_CONTACT", "support-site/contact", 2021, "support-site");
                }
                return null;
            case 215946968:
                if (str.equals("COURSE_LESSON_QUIZ")) {
                    return G1("COURSE_LESSON_QUIZ", "course/lesson/quiz", 457, "course");
                }
                return null;
            case 261166024:
                if (str.equals("SIGNUP_GENDER")) {
                    return G1("SIGNUP_GENDER", "signup/gender", 1890, "signup");
                }
                return null;
            case 296527448:
                if (str.equals("PERMISSIONS_BLUETOOTH_REQUEST_BOTTOMSHEET")) {
                    return G1("PERMISSIONS_BLUETOOTH_REQUEST_BOTTOMSHEET", "permissions/bluetooth/request/bottomsheet", 1429, "permissions");
                }
                return null;
            case 306538088:
                if (str.equals("UPCOMINGRELEASES")) {
                    return J5();
                }
                return null;
            case 311888248:
                if (str.equals("CONTEXTMENU_LIVEROOM")) {
                    return G1("CONTEXTMENU_LIVEROOM", "contextmenu/liveroom", 432, "contextmenu");
                }
                return null;
            case 328734392:
                if (str.equals("HOME_VIDEOS")) {
                    return Y1();
                }
                return null;
            case 386730984:
                if (str.equals("LIBRARY_IMPORT_MATCH_REVIEW")) {
                    return G1("LIBRARY_IMPORT_MATCH_REVIEW", "library-import/match-review", 908, "library-import");
                }
                return null;
            case 389832712:
                if (str.equals("ADS_EMBEDDED_NPV_FULLSCREEN_VIDEO")) {
                    return G1("ADS_EMBEDDED_NPV_FULLSCREEN_VIDEO", "ads/embedded-npv/fullscreen-video", 20, "ads");
                }
                return null;
            case 406312312:
                if (str.equals("DIALOG_CONNECT_NOMUSIC")) {
                    return G1("DIALOG_CONNECT_NOMUSIC", "dialog/connect/nomusic", 475, "dialog");
                }
                return null;
            case 469238344:
                if (str.equals("LOGIN_MAGICLINKAUTOSEND")) {
                    return G1("LOGIN_MAGICLINKAUTOSEND", "login/magiclinkautosend", 956, "login");
                }
                return null;
            case 544785016:
                if (str.equals("MRKT_ARTIST_SONG_LOCATION")) {
                    return G1("MRKT_ARTIST_SONG_LOCATION", "mrkt/artist/song/location", 1144, "mrkt");
                }
                return null;
            case 568620936:
                if (str.equals("FAST_TRACK")) {
                    return G1("FAST_TRACK", "fast-track", 550, "fast-track");
                }
                return null;
            case 610844024:
                if (str.equals("BYOM_NOWPLAYING_FULLSCREEN")) {
                    return G1("BYOM_NOWPLAYING_FULLSCREEN", "byom/nowplaying/fullscreen", 263, "byom");
                }
                return null;
            case 635199656:
                if (str.equals("ASSISTED_CURATION_SEARCH_ARTISTS")) {
                    return G1("ASSISTED_CURATION_SEARCH_ARTISTS", "assisted-curation/search/artists", 187, "assisted-curation");
                }
                return null;
            case 694721560:
                if (str.equals("ADD_MEMBER")) {
                    return G1("ADD_MEMBER", "add-member", 15, "add-member");
                }
                return null;
            case 699590632:
                if (str.equals("UNKNOWN_UNCOVERED")) {
                    return I5();
                }
                return null;
            case 761293896:
                if (str.equals("SETTINGS_MEDIA_QUALITY")) {
                    return G1("SETTINGS_MEDIA_QUALITY", "settings/media-quality", 1830, "settings");
                }
                return null;
            case 809125688:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS")) {
                    return G1("MRKT_ARTIST_VIDEO_CLIPS", "mrkt/artist/video/clips", 1152, "mrkt");
                }
                return null;
            case 876516728:
                if (str.equals("MRKT_FRONTDOOR_HOME")) {
                    return G1("MRKT_FRONTDOOR_HOME", "mrkt/frontdoor/home", 1259, "mrkt");
                }
                return null;
            case 966493496:
                if (str.equals("BLEND_PARTY")) {
                    return G1("BLEND_PARTY", "blend/party", 222, "blend");
                }
                return null;
            case 967006200:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS")) {
                    return G1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS", "www-account-pages/parental-settings", 2221, "www-account-pages");
                }
                return null;
            case 994893304:
                if (str.equals("MUSIC_CATEGORY")) {
                    return G1("MUSIC_CATEGORY", "music/category", 1342, "music");
                }
                return null;
            case 996910728:
                if (str.equals("GOLDENPATH_JOSHUAKELLY")) {
                    return G1("GOLDENPATH_JOSHUAKELLY", "goldenpath/joshuakelly", 673, "goldenpath");
                }
                return null;
            case 998153080:
                if (str.equals("MRKT_ARTIST_MERCH")) {
                    return G1("MRKT_ARTIST_MERCH", "mrkt/artist/merch", 1089, "mrkt");
                }
                return null;
            case 1033677640:
                if (str.equals("SIGNUP_CHALLENGE_CALLBACK")) {
                    return G1("SIGNUP_CHALLENGE_CALLBACK", "signup/challenge/callback", 1887, "signup");
                }
                return null;
            case 1058384904:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION_OPENEMAIL")) {
                    return G1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION_OPENEMAIL", "login/accountRecovery/requestemailconfirmation/openemail", 938, "login");
                }
                return null;
            case 1059507128:
                if (str.equals("GOLDENPATH_MHANSSON")) {
                    return G1("GOLDENPATH_MHANSSON", "goldenpath/mhansson", 702, "goldenpath");
                }
                return null;
            case 1060367688:
                if (str.equals("HOLIDAYCAMPAIGN")) {
                    return G1("HOLIDAYCAMPAIGN", "holidaycampaign", 794, "holidaycampaign");
                }
                return null;
            case 1065554248:
                if (str.equals("FREE_TIER_COLLECTION")) {
                    return G1("FREE_TIER_COLLECTION", "free-tier-collection", 567, "free-tier-collection");
                }
                return null;
            case 1137023064:
                if (str.equals("ARTIST_APPEARS_ON")) {
                    return G1("ARTIST_APPEARS_ON", "artist/appears-on", 158, "artist");
                }
                return null;
            case 1137280440:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_BILLING")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_BILLING", "mrkt/artist/campaigns/billing", 1058, "mrkt");
                }
                return null;
            case 1225644200:
                if (str.equals("S4P_SHOWS_ALL")) {
                    return G1("S4P_SHOWS_ALL", "s4p/shows/all", 1764, "s4p");
                }
                return null;
            case 1252563240:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD", "adstudio/add-to-existing-ad-set/ad", 39, "adstudio");
                }
                return null;
            case 1267812632:
                if (str.equals("RADIO_STATION_CREATE_ARTISTS")) {
                    return G1("RADIO_STATION_CREATE_ARTISTS", "radio/station/create/artists", 1618, "radio");
                }
                return null;
            case 1279202632:
                if (str.equals("PARENTALCONTROL")) {
                    return G1("PARENTALCONTROL", "parentalcontrol", 1421, "parentalcontrol");
                }
                return null;
            case 1349355400:
                if (str.equals("S4P_SETUP_SHOW_CLAIM_BLOCKING")) {
                    return G1("S4P_SETUP_SHOW_CLAIM_BLOCKING", "s4p/setup-show/claim-blocking", 1751, "s4p");
                }
                return null;
            case 1365166392:
                if (str.equals("CONTEXTMENU_ARTIST")) {
                    return V0();
                }
                return null;
            case 1439578488:
                if (str.equals("PORTAL_SEARCH_GABITO_EVENTS")) {
                    return G1("PORTAL_SEARCH_GABITO_EVENTS", "portal/search-gabito-events", 1531, "portal");
                }
                return null;
            case 1440562072:
                if (str.equals("PODCAST_SHOW_AUDIOBOOK")) {
                    return G1("PODCAST_SHOW_AUDIOBOOK", "podcast/show/audiobook", 1493, "podcast");
                }
                return null;
            case 1458584184:
                if (str.equals("EMAIL_VERIFY_BLOCKING")) {
                    return G1("EMAIL_VERIFY_BLOCKING", "email/verify/blocking", 509, "email");
                }
                return null;
            case 1479590600:
                if (str.equals("INTERACTIVEDJ")) {
                    return G1("INTERACTIVEDJ", "interactivedj", 842, "interactivedj");
                }
                return null;
            case 1508829960:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AI_AUDIO")) {
                    return G1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AI_AUDIO", "adstudio/add-to-existing-ad-set/ad-quick-ai-audio", 41, "adstudio");
                }
                return null;
            case 1513373528:
                if (str.equals("SUPERBIRD_SETUP_RECONNECTING")) {
                    return G1("SUPERBIRD_SETUP_RECONNECTING", "superbird/setup/reconnecting", 2014, "superbird");
                }
                return null;
            case 1526367976:
                if (str.equals("GOLDENPATH_JSIMFORS")) {
                    return G1("GOLDENPATH_JSIMFORS", "goldenpath/jsimfors", 676, "goldenpath");
                }
                return null;
            case 1594096824:
                if (str.equals("REINVENTFREE_FMA_UPSELL")) {
                    return I4();
                }
                return null;
            case 1644448968:
                if (str.equals("MRKT_WAITING_ROOM_PROFILE")) {
                    return G1("MRKT_WAITING_ROOM_PROFILE", "mrkt/waiting-room/profile", 1334, "mrkt");
                }
                return null;
            case 1691343560:
                if (str.equals("CONTRIBUTION_NOTES_ONBOARDING")) {
                    return G1("CONTRIBUTION_NOTES_ONBOARDING", "contribution/notes-onboarding", 451, "contribution");
                }
                return null;
            case 1760986520:
                if (str.equals("MRKT_LOGIN")) {
                    return G1("MRKT_LOGIN", "mrkt/login", 1290, "mrkt");
                }
                return null;
            case 1788702200:
                if (str.equals("JAM_PENDING_REQUESTS_INFO")) {
                    return G1("JAM_PENDING_REQUESTS_INFO", "jam/pending-requests-info", 868, "jam");
                }
                return null;
            case 1800278360:
                if (str.equals("RECENTS")) {
                    return E4();
                }
                return null;
            case 1875397928:
                if (str.equals("PHONENUMBER_CHECKERROR")) {
                    return u3();
                }
                return null;
            case 1882015368:
                if (str.equals("RUNNING_SETUP_MANUAL")) {
                    return G1("RUNNING_SETUP_MANUAL", "running/setup/manual", 1661, "running");
                }
                return null;
            case 1908064376:
                if (str.equals("FULLSCREEN_VIDEOPLAYER")) {
                    return G1("FULLSCREEN_VIDEOPLAYER", "fullscreen/videoplayer", 601, "fullscreen");
                }
                return null;
            case 1912718568:
                if (str.equals("EXPERIMENTAL")) {
                    return x1();
                }
                return null;
            case 1921546472:
                if (str.equals("LISTENINGPARTY_REPORT")) {
                    return G1("LISTENINGPARTY_REPORT", "listeningparty/report", 923, "listeningparty");
                }
                return null;
            case 1952244424:
                if (str.equals("CONTEXTMENU_AUDIOSETTINGS")) {
                    return G1("CONTEXTMENU_AUDIOSETTINGS", "contextmenu/audiosettings", 420, "contextmenu");
                }
                return null;
            case 1953985928:
                if (str.equals("ADD_CHILD_ACCOUNT_NUDGE")) {
                    return x();
                }
                return null;
            case 1964024984:
                if (str.equals("AIDJ_MIC_PERMISSION")) {
                    return J();
                }
                return null;
            case 1965801320:
                if (str.equals("ADSTUDIO_BUSINESS_PEOPLE")) {
                    return G1("ADSTUDIO_BUSINESS_PEOPLE", "adstudio/business/people", 58, "adstudio");
                }
                return null;
            case 1994066088:
                if (str.equals("S4P_PODCAST_EPISODE_MONETIZE")) {
                    return G1("S4P_PODCAST_EPISODE_MONETIZE", "s4p/podcast/episode/monetize", 1731, "s4p");
                }
                return null;
            case 2041226664:
                if (str.equals("CARS_INTERACTIVEDJ")) {
                    return G1("CARS_INTERACTIVEDJ", "cars/interactivedj", 282, "cars");
                }
                return null;
            case 2097915704:
                if (str.equals("ADSTUDIO_APPS")) {
                    return G1("ADSTUDIO_APPS", "adstudio/apps", 48, "adstudio");
                }
                return null;
            case 2105996344:
                if (str.equals("HOME_COURSES")) {
                    return G1("HOME_COURSES", "home/courses", 798, "home");
                }
                return null;
            case 2120415224:
                if (str.equals("DISCOVERNOWMUSIC")) {
                    return G1("DISCOVERNOWMUSIC", "discovernowmusic", 494, "discovernowmusic");
                }
                return null;
            default:
                return null;
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        b0k b0kVar2;
        long j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(26119966);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.e(150) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String strU = cwl1.U(2131820668, i, new Object[]{Integer.valueOf(i), 150}, b0kVar3);
            String str = i + "/150";
            boolean zG = b0kVar3.g(strU);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new i3o(strU, (byte) 26);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).j;
            if (z) {
                b0kVar3.i0(-668501114);
                j = cbx.a(b0kVar3).b.d;
            } else {
                b0kVar3.i0(-668499995);
                j = cbx.a(b0kVar3).b.b;
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            uwo1.e(str, qim0VarB, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nnv(i, z, qim0Var, i2, (byte) 0);
        }
    }

    public static p6r0 b0() {
        return G1("BILLING_PAGE", "billing-page", 212, "billing-page");
    }

    public static p6r0 b1() {
        return G1("CONTEXTMENU_REMOTEDOWNLOADS", "contextmenu/remotedownloads", 437, "contextmenu");
    }

    public static p6r0 b2() {
        return G1("IMAGEGALLERY", "imagegallery", 828, "imagegallery");
    }

    public static p6r0 b3() {
        return G1("NOWPLAYING_PLAYBACKSETTINGS", "nowplaying/playbacksettings", 1360, "nowplaying");
    }

    public static p6r0 b4() {
        return G1("PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS", "premium-account-management/member-details", 1543, "premium-account-management");
    }

    public static p6r0 b5() {
        return G1("SETTINGS_EMPLOYEE_TOOLS", "settings/employee-tools", 1817, "settings");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p6r0 b6(String str) {
        switch (str.hashCode()) {
            case -2036282551:
                if (str.equals("LISTENINGPARTY_USER_PROFILE_SHEET")) {
                    return G1("LISTENINGPARTY_USER_PROFILE_SHEET", "listeningparty/user-profile-sheet", 925, "listeningparty");
                }
                return null;
            case -1986309927:
                if (str.equals("SETTINGS_FEATURES")) {
                    return G1("SETTINGS_FEATURES", "settings/features", 1819, "settings");
                }
                return null;
            case -1978438599:
                if (str.equals("PODCASTCHARTS")) {
                    return U3();
                }
                return null;
            case -1935692935:
                if (str.equals("LISTENINGHISTORY")) {
                    return G1("LISTENINGHISTORY", "listeninghistory", 917, "listeninghistory");
                }
                return null;
            case -1877704695:
                if (str.equals("HOMETHING_ACTIVATION_WELCOME")) {
                    return G1("HOMETHING_ACTIVATION_WELCOME", "homething/activation/welcome", 824, "homething");
                }
                return null;
            case -1850625479:
                if (str.equals("STUDIO_VOICE_SETTINGS")) {
                    return G1("STUDIO_VOICE_SETTINGS", "studio/voice-settings", 1997, "studio");
                }
                return null;
            case -1811417719:
                if (str.equals("WEAR_UPDATE")) {
                    return G1("WEAR_UPDATE", "wear/update", 2169, "wear");
                }
                return null;
            case -1779325399:
                if (str.equals("SUPERBIRD_SETUP_BLUETOOTHCONNECT")) {
                    return G1("SUPERBIRD_SETUP_BLUETOOTHCONNECT", "superbird/setup/bluetoothconnect", AudioEpisode.SHOW_URI_FIELD_NUMBER, "superbird");
                }
                return null;
            case -1704634087:
                if (str.equals("NFT_MIX")) {
                    return G1("NFT_MIX", "nft-mix", 1348, "nft-mix");
                }
                return null;
            case -1701918087:
                if (str.equals("CONCERT_GALLERY")) {
                    return M0();
                }
                return null;
            case -1646729495:
                if (str.equals("GOLDENPATH_JUANANTONIOL")) {
                    return G1("GOLDENPATH_JUANANTONIOL", "goldenpath/juanantoniol", 678, "goldenpath");
                }
                return null;
            case -1634441847:
                if (str.equals("GOLDENPATH_GUSTAVOC")) {
                    return G1("GOLDENPATH_GUSTAVOC", "goldenpath/gustavoc", 653, "goldenpath");
                }
                return null;
            case -1589899815:
                if (str.equals("PODCASTCHARTS_REGIONS")) {
                    return X3();
                }
                return null;
            case -1524991687:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_INTERACTIVE")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_INTERACTIVE", "mrkt/discovery-mode/unified-buying/create/interactive", 1220, "mrkt");
                }
                return null;
            case -1502489015:
                if (str.equals("PORTAL_SEARCH_GCP_PROJECTS")) {
                    return G1("PORTAL_SEARCH_GCP_PROJECTS", "portal/search-gcp-projects", 1532, "portal");
                }
                return null;
            case -1476974999:
                if (str.equals("MESSAGE_STORE")) {
                    return G1("MESSAGE_STORE", "message-store", 1033, "message-store");
                }
                return null;
            case -1440404775:
                if (str.equals("PARENTAL_CONTROL_REMOVE_PARENT")) {
                    return G1("PARENTAL_CONTROL_REMOVE_PARENT", "parental-control/remove-parent", 1416, "parental-control");
                }
                return null;
            case -1418437671:
                if (str.equals("MANAGED_ACCOUNT_LINKING_LEARN_MORE")) {
                    return G1("MANAGED_ACCOUNT_LINKING_LEARN_MORE", "managed-account-linking/learn-more", 1007, "managed-account-linking");
                }
                return null;
            case -1393479367:
                if (str.equals("S4P_PODCAST_EPISODE_ADDITIONAL_DETAILS")) {
                    return G1("S4P_PODCAST_EPISODE_ADDITIONAL_DETAILS", "s4p/podcast/episode/additional-details", 1728, "s4p");
                }
                return null;
            case -1392572327:
                if (str.equals("SEARCH_PODCASTS_AND_EPISODES")) {
                    return G1("SEARCH_PODCASTS_AND_EPISODES", "search/podcasts_and_episodes", 1794, "search");
                }
                return null;
            case -1391318839:
                if (str.equals("PARENTAL_CONTROL_REMOVE_TEEN")) {
                    return G1("PARENTAL_CONTROL_REMOVE_TEEN", "parental-control/remove-teen", 1417, "parental-control");
                }
                return null;
            case -1364084103:
                if (str.equals("SETTINGS_CONTENT_LANGUAGES")) {
                    return G1("SETTINGS_CONTENT_LANGUAGES", "settings/content-languages", 1812, "settings");
                }
                return null;
            case -1361468567:
                if (str.equals("GOLDENPATH_VIKTORY")) {
                    return G1("GOLDENPATH_VIKTORY", "goldenpath/viktory", 756, "goldenpath");
                }
                return null;
            case -1344513847:
                if (str.equals("MRKT_FRONTDOOR_MARQUEE")) {
                    return G1("MRKT_FRONTDOOR_MARQUEE", "mrkt/frontdoor/marquee", 1261, "mrkt");
                }
                return null;
            case -1336803575:
                if (str.equals("SETTINGS_SOCIAL")) {
                    return G1("SETTINGS_SOCIAL", "settings/social", 1846, "settings");
                }
                return null;
            case -1324361127:
                if (str.equals("MANAGED_ACCOUNT_LINKING_SHARE_PARENTAL_CONSENT")) {
                    return G1("MANAGED_ACCOUNT_LINKING_SHARE_PARENTAL_CONSENT", "managed-account-linking/share-parental-consent", 1010, "managed-account-linking");
                }
                return null;
            case -1309770439:
                if (str.equals("CONCERTS_ARTIST")) {
                    return O0();
                }
                return null;
            case -1289348535:
                if (str.equals("SONG_DNA_CONTRIBUTOR")) {
                    return G1("SONG_DNA_CONTRIBUTOR", "song-dna-contributor", 1920, "song-dna-contributor");
                }
                return null;
            case -1262342903:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CHANGEPIN")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_CHANGEPIN", "www-account-pages/genalpha/changepin", 2202, "www-account-pages");
                }
                return null;
            case -1245642647:
                if (str.equals("ADSTUDIO_BUSINESS_DETAILS")) {
                    return G1("ADSTUDIO_BUSINESS_DETAILS", "adstudio/business/details", 55, "adstudio");
                }
                return null;
            case -1211482695:
                if (str.equals("YOURLIBRARYTAGS_YOURTAGSPAGE")) {
                    return n6();
                }
                return null;
            case -1205406855:
                if (str.equals("CONNECT_CONTEXTMENU")) {
                    return G1("CONNECT_CONTEXTMENU", "connect/contextmenu", 394, "connect");
                }
                return null;
            case -1202114359:
                if (str.equals("PODCASTCHAPTER")) {
                    return G1("PODCASTCHAPTER", "podcastchapter", 1508, "podcastchapter");
                }
                return null;
            case -1194959447:
                if (str.equals("S4P_DEBUG_KAIZEN_COMPONENTS")) {
                    return G1("S4P_DEBUG_KAIZEN_COMPONENTS", "s4p/debug/kaizen-components", 1700, "s4p");
                }
                return null;
            case -1179481143:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOWSUCCESS")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOWSUCCESS", "www-account-pages/genalpha/childaccountcreationflowsuccess", 2204, "www-account-pages");
                }
                return null;
            case -1095125943:
                if (str.equals("ADSTUDIO_COLD_START_AD_SET_RESERVED_BOOKING")) {
                    return G1("ADSTUDIO_COLD_START_AD_SET_RESERVED_BOOKING", "adstudio/cold-start/ad-set/reserved-booking", 69, "adstudio");
                }
                return null;
            case -1094681831:
                if (str.equals("FAST_TRACK_PAGE_2")) {
                    return C1();
                }
                return null;
            case -993272343:
                if (str.equals("MRKT_ARTIST_AUDIENCE_LOCATION")) {
                    return G1("MRKT_ARTIST_AUDIENCE_LOCATION", "mrkt/artist/audience/location", 1050, "mrkt");
                }
                return null;
            case -983865911:
                if (str.equals("ARTIST_STORE")) {
                    return G1("ARTIST_STORE", "artist/store", 177, "artist");
                }
                return null;
            case -965149511:
                if (str.equals("EDITORIAL_WORLDS")) {
                    return G1("EDITORIAL_WORLDS", "editorial-worlds", 505, "editorial-worlds");
                }
                return null;
            case -948331831:
                if (str.equals("SUPERBIRD_SETUP_EVERYTHINGCONNECTED")) {
                    return G1("SUPERBIRD_SETUP_EVERYTHINGCONNECTED", "superbird/setup/everythingconnected", 2010, "superbird");
                }
                return null;
            case -939688567:
                if (str.equals("WWW_ACCOUNT_PAGES_CONSENT_CAPTURING")) {
                    return G1("WWW_ACCOUNT_PAGES_CONSENT_CAPTURING", "www-account-pages/consent-capturing", 2195, "www-account-pages");
                }
                return null;
            case -928897511:
                if (str.equals("GOLDENPATH_ABDULB")) {
                    return G1("GOLDENPATH_ABDULB", "goldenpath/abdulb", 607, "goldenpath");
                }
                return null;
            case -919908119:
                if (str.equals("QUIZ_QUESTION_SOURCES")) {
                    return y4();
                }
                return null;
            case -798161287:
                if (str.equals("CARS_APPPROTOCOL")) {
                    return G1("CARS_APPPROTOCOL", "cars/appprotocol", 279, "cars");
                }
                return null;
            case -782200919:
                if (str.equals("REACTION_SHEET")) {
                    return C4();
                }
                return null;
            case -662311399:
                if (str.equals("PARENTAL_CONSENT_EDUCATION")) {
                    return G1("PARENTAL_CONSENT_EDUCATION", "parental-consent/education", 1397, "parental-consent");
                }
                return null;
            case -641189271:
                if (str.equals("MRKT_ARTIST_PROFILE_SOCIALS")) {
                    return G1("MRKT_ARTIST_PROFILE_SOCIALS", "mrkt/artist/profile/socials", 1136, "mrkt");
                }
                return null;
            case -612289031:
                if (str.equals("WATCHAPP_EVENT_SENDER_STATE")) {
                    return G1("WATCHAPP_EVENT_SENDER_STATE", "watchapp/event-sender-state", 2107, "watchapp");
                }
                return null;
            case -611295255:
                if (str.equals("BLEND_DNA")) {
                    return G1("BLEND_DNA", "blend-dna", 214, "blend-dna");
                }
                return null;
            case -601475943:
                if (str.equals("GOLDENPATH_LOUISD")) {
                    return G1("GOLDENPATH_LOUISD", "goldenpath/louisd", 687, "goldenpath");
                }
                return null;
            case -595915655:
                if (str.equals("WRAPPED_HOME")) {
                    return G1("WRAPPED_HOME", "wrapped/home", 2181, "wrapped");
                }
                return null;
            case -584050951:
                if (str.equals("SETTINGS_LANGUAGES_CONTENT")) {
                    return G1("SETTINGS_LANGUAGES_CONTENT", "settings/languages/content", 1825, "settings");
                }
                return null;
            case -580273895:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ANALYTICS")) {
                    return G1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ANALYTICS", "mrkt/artist/video/other-videos/analytics", 1171, "mrkt");
                }
                return null;
            case -557321639:
                if (str.equals("GOLDENPATH_NAOMYP")) {
                    return G1("GOLDENPATH_NAOMYP", "goldenpath/naomyp", 716, "goldenpath");
                }
                return null;
            case -537669559:
                if (str.equals("NAVIGATION_BOTTOMSHEET")) {
                    return V2();
                }
                return null;
            case -509828759:
                if (str.equals("CONNECT_TUTORIALDESKTOP")) {
                    return G1("CONNECT_TUTORIALDESKTOP", "connect/tutorialdesktop", 405, "connect");
                }
                return null;
            case -439301207:
                if (str.equals("GOLDENPATH_REIAZG")) {
                    return G1("GOLDENPATH_REIAZG", "goldenpath/reiazg", 733, "goldenpath");
                }
                return null;
            case -318156647:
                if (str.equals("GOLDENPATH_NIKOLAYM")) {
                    return G1("GOLDENPATH_NIKOLAYM", "goldenpath/nikolaym", 722, "goldenpath");
                }
                return null;
            case -219380503:
                if (str.equals("GOLDENPATH_AADESALU")) {
                    return G1("GOLDENPATH_AADESALU", "goldenpath/aadesalu", 606, "goldenpath");
                }
                return null;
            case -205318519:
                if (str.equals("WEAR_LOGIN")) {
                    return G1("WEAR_LOGIN", "wear/login", 2148, "wear");
                }
                return null;
            case -187165447:
                if (str.equals("GOLDENPATH_TOLSSONWIKLUND")) {
                    return G1("GOLDENPATH_TOLSSONWIKLUND", "goldenpath/tolssonwiklund", 753, "goldenpath");
                }
                return null;
            case -177364935:
                if (str.equals("DOWNLOAD_MOBILE")) {
                    return G1("DOWNLOAD_MOBILE", "download/mobile", 500, "download");
                }
                return null;
            case -122362471:
                if (str.equals("PAGE_MATCH_SUCCESS")) {
                    return G1("PAGE_MATCH_SUCCESS", "page-match/success", 1396, "page-match");
                }
                return null;
            case -24701351:
                if (str.equals("BIRTHDAYS_GIFT")) {
                    return G1("BIRTHDAYS_GIFT", "birthdays/gift", 213, "birthdays");
                }
                return null;
            case 2158009:
                if (str.equals("FIND")) {
                    return G1("FIND", "find", 555, "find");
                }
                return null;
            case 9684825:
                if (str.equals("MRKT_ARTIST_PLAYLIST")) {
                    return G1("MRKT_ARTIST_PLAYLIST", "mrkt/artist/playlist", 1106, "mrkt");
                }
                return null;
            case 35047209:
                if (str.equals("PROFILE_EDIT_BIO")) {
                    return n4();
                }
                return null;
            case 49247161:
                if (str.equals("CONNECT_DEVICEPICKER")) {
                    return T0();
                }
                return null;
            case 58170281:
                if (str.equals("SOCIAL_LISTENING_NOTIFICATIONDIALOG")) {
                    return G1("SOCIAL_LISTENING_NOTIFICATIONDIALOG", "social-listening/notificationdialog", 1910, "social-listening");
                }
                return null;
            case 59520473:
                if (str.equals("STUDIO_WELCOME")) {
                    return G1("STUDIO_WELCOME", "studio/welcome", 1998, "studio");
                }
                return null;
            case 72611657:
                if (str.equals("LOGIN")) {
                    return G1("LOGIN", "login", 937, "login");
                }
                return null;
            case 108009369:
                if (str.equals("HIFI_DOWNLOAD_OVER_CELLULAR_SHEET")) {
                    return G1("HIFI_DOWNLOAD_OVER_CELLULAR_SHEET", "hifi/download-over-cellular-sheet", 785, "hifi");
                }
                return null;
            case 113187401:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_WITHDRAW_DIALOG")) {
                    return G1("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_WITHDRAW_DIALOG", "membership/consumer/manage/detail/withdraw-dialog", 1028, "membership");
                }
                return null;
            case 132633849:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_PAYMENT_METHOD_DIALOG")) {
                    return G1("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_PAYMENT_METHOD_DIALOG", "membership/consumer/manage/detail/payment-method-dialog", 1027, "membership");
                }
                return null;
            case 157552841:
                if (str.equals("BLUEJAY_CONFIRM")) {
                    return h0();
                }
                return null;
            case 203137017:
                if (str.equals("PARENTAL_CONTROL_PARENT_DETAILS")) {
                    return G1("PARENTAL_CONTROL_PARENT_DETAILS", "parental-control/parent-details", 1415, "parental-control");
                }
                return null;
            case 255479769:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_CANCEL_DIALOG")) {
                    return G1("MEMBERSHIP_CONSUMER_MANAGE_DETAIL_CANCEL_DIALOG", "membership/consumer/manage/detail/cancel-dialog", 1025, "membership");
                }
                return null;
            case 257510617:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_BILLING")) {
                    return G1("PREMIUM_ACCOUNT_MANAGEMENT_BILLING", "premium-account-management/billing", 1541, "premium-account-management");
                }
                return null;
            case 263893977:
                if (str.equals("ADSTUDIO_APPROVE_CAMPAIGN_RESERVED_BOOKING")) {
                    return G1("ADSTUDIO_APPROVE_CAMPAIGN_RESERVED_BOOKING", "adstudio/approve/campaign/reserved-booking", 47, "adstudio");
                }
                return null;
            case 274533721:
                if (str.equals("SOCIAL_LISTENING_SETTINGS")) {
                    return G1("SOCIAL_LISTENING_SETTINGS", "social-listening/settings", 1912, "social-listening");
                }
                return null;
            case 277282809:
                if (str.equals("ENHANCED_SHARE_CARD")) {
                    return G1("ENHANCED_SHARE_CARD", "enhanced-share-card", 514, "enhanced-share-card");
                }
                return null;
            case 297216553:
                if (str.equals("ENDLESS_FEED")) {
                    return G1("ENDLESS_FEED", "endless-feed", 512, "endless-feed");
                }
                return null;
            case 317600233:
                if (str.equals("S4P_CATALOG")) {
                    return G1("S4P_CATALOG", "s4p/catalog", 1682, "s4p");
                }
                return null;
            case 332974665:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_PARENTALCONSENT")) {
                    return G1("WWW_ACCOUNT_PAGES_GENALPHA_PARENTALCONSENT", "www-account-pages/genalpha/parentalconsent", 2206, "www-account-pages");
                }
                return null;
            case 408556937:
                if (str.equals("PROFILE")) {
                    return k4();
                }
                return null;
            case 428643081:
                if (str.equals("GOLDENPATH_MLENEHAN")) {
                    return G1("GOLDENPATH_MLENEHAN", "goldenpath/mlenehan", 707, "goldenpath");
                }
                return null;
            case 435372825:
                if (str.equals("AAA_CON_T")) {
                    return p();
                }
                return null;
            case 484026681:
                if (str.equals("COLLECTION_OFFLINELIBRARY")) {
                    return G1("COLLECTION_OFFLINELIBRARY", "collection/offlinelibrary", 354, "collection");
                }
                return null;
            case 492656393:
                if (str.equals("KID_ACCOUNT_TRANSITION_EDUCATION")) {
                    return G1("KID_ACCOUNT_TRANSITION_EDUCATION", "kid-account-transition/education", 891, "kid-account-transition");
                }
                return null;
            case 493234953:
                if (str.equals("FREE_TIER_HOME")) {
                    return G1("FREE_TIER_HOME", "free-tier-home", 569, "free-tier-home");
                }
                return null;
            case 517859753:
                if (str.equals("SETTINGS_BUSINESS_INFORMATION")) {
                    return a5();
                }
                return null;
            case 525451273:
                if (str.equals("PLAYLIST_MIXING_REORDER_OVERVIEW")) {
                    return G1("PLAYLIST_MIXING_REORDER_OVERVIEW", "playlist/mixing-reorder-overview", 1467, "playlist");
                }
                return null;
            case 536093017:
                if (str.equals("IRONCHEF_NAMING")) {
                    return G1("IRONCHEF_NAMING", "ironchef/naming", 849, "ironchef");
                }
                return null;
            case 625861353:
                if (str.equals("SETTINGS_IGNORED_IN_RECOMMENDATIONS")) {
                    return G1("SETTINGS_IGNORED_IN_RECOMMENDATIONS", "settings/ignored-in-recommendations", 1820, "settings");
                }
                return null;
            case 682583673:
                if (str.equals("IRONCHEF_SEARCH")) {
                    return G1("IRONCHEF_SEARCH", "ironchef/search", 851, "ironchef");
                }
                return null;
            case 716758729:
                if (str.equals("CHARTS_REGIONAL")) {
                    return G1("CHARTS_REGIONAL", "charts/regional", 309, "charts");
                }
                return null;
            case 781573273:
                if (str.equals("DIALOG_CONNECTFACEBOOK")) {
                    return G1("DIALOG_CONNECTFACEBOOK", "dialog/connectfacebook", 477, "dialog");
                }
                return null;
            case 823425065:
                if (str.equals("SKIP_LIMIT_PIVOT_TRACKS")) {
                    return G1("SKIP_LIMIT_PIVOT_TRACKS", "skip-limit-pivot-tracks", 1899, "skip-limit-pivot-tracks");
                }
                return null;
            case 864339401:
                if (str.equals("HARMONYPLAYER_PLAYLISTS")) {
                    return G1("HARMONYPLAYER_PLAYLISTS", "harmonyplayer/playlists", 784, "harmonyplayer");
                }
                return null;
            case 876208841:
                if (str.equals("S4P_MONETIZE")) {
                    return G1("S4P_MONETIZE", "s4p/monetize", 1719, "s4p");
                }
                return null;
            case 907450249:
                if (str.equals("MRKT_FRONTDOOR_PROVIDERS")) {
                    return G1("MRKT_FRONTDOOR_PROVIDERS", "mrkt/frontdoor/providers", 1267, "mrkt");
                }
                return null;
            case 933974489:
                if (str.equals("SOCIAL_INVITE_CONFIRMATION")) {
                    return G1("SOCIAL_INVITE_CONFIRMATION", "social/invite-confirmation", 1916, "social");
                }
                return null;
            case 934348889:
                if (str.equals("LOGIN_SETTINGS")) {
                    return G1("LOGIN_SETTINGS", "login/settings", 963, "login");
                }
                return null;
            case 954520313:
                if (str.equals("INAPPMESSAGE_MODAL")) {
                    return g2();
                }
                return null;
            case 999520601:
                if (str.equals("GOLDENPATH_ALEXWALL")) {
                    return G1("GOLDENPATH_ALEXWALL", "goldenpath/alexwall", 616, "goldenpath");
                }
                return null;
            case 1001990617:
                if (str.equals("GOLDENPATH_KRISTINAC")) {
                    return G1("GOLDENPATH_KRISTINAC", "goldenpath/kristinac", 684, "goldenpath");
                }
                return null;
            case 1068600601:
                if (str.equals("LOGIN_OTT")) {
                    return G1("LOGIN_OTT", "login/ott", 958, "login");
                }
                return null;
            case 1074725049:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_EDIT")) {
                    return G1("MRKT_DM_MANAGED_SERVICE_EDIT", "mrkt/dm-managed-service/edit", 1231, "mrkt");
                }
                return null;
            case 1091350121:
                if (str.equals("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE")) {
                    return G1("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE", "mrkt/artist/audience/active-audience", 1044, "mrkt");
                }
                return null;
            case 1102060617:
                if (str.equals("S4P_CLAIM_PODCAST_WEB_MIGRATION_REQUIRED")) {
                    return G1("S4P_CLAIM_PODCAST_WEB_MIGRATION_REQUIRED", "s4p/claim-podcast/web-migration-required", 1688, "s4p");
                }
                return null;
            case 1110039449:
                if (str.equals("AI_SHARED_USAGE_LIMITS")) {
                    return G1("AI_SHARED_USAGE_LIMITS", "ai-shared/usage-limits", 138, "ai-shared");
                }
                return null;
            case 1113541833:
                if (str.equals("AGE_ASSURANCE_SELF_INPUT")) {
                    return G1("AGE_ASSURANCE_SELF_INPUT", "age-assurance/self/input", 124, "age-assurance");
                }
                return null;
            case 1136831433:
                if (str.equals("MARTINI_CHAT")) {
                    return N2();
                }
                return null;
            case 1181570457:
                if (str.equals("SOCIAL_LISTENING_ENDSESSIONDIALOG")) {
                    return G1("SOCIAL_LISTENING_ENDSESSIONDIALOG", "social-listening/endsessiondialog", 1905, "social-listening");
                }
                return null;
            case 1322818153:
                if (str.equals("COMMUNITY_LISTENING_ACTIVITY")) {
                    return G1("COMMUNITY_LISTENING_ACTIVITY", "community/listening-activity", 383, "community");
                }
                return null;
            case 1337643481:
                if (str.equals("SLEEP_TIMER_NUDGE")) {
                    return o5();
                }
                return null;
            case 1361088585:
                if (str.equals("WEB3_TOKENENABLED_PLAYLIST")) {
                    return G1("WEB3_TOKENENABLED_PLAYLIST", "web3/tokenenabled/playlist", 2177, "web3");
                }
                return null;
            case 1365727145:
                if (str.equals("PREMIUM_DESTINATION_PREMIUM_PLANS")) {
                    return G1("PREMIUM_DESTINATION_PREMIUM_PLANS", "premium-destination/premium-plans", 1552, "premium-destination");
                }
                return null;
            case 1374488793:
                if (str.equals("MRKT_ARTIST_PROFILE_ABOUT_EDIT")) {
                    return G1("MRKT_ARTIST_PROFILE_ABOUT_EDIT", "mrkt/artist/profile/about/edit", 1114, "mrkt");
                }
                return null;
            case 1378898761:
                if (str.equals("ADSTUDIO_BUSINESS_AD_ACCOUNTS")) {
                    return G1("ADSTUDIO_BUSINESS_AD_ACCOUNTS", "adstudio/business/ad-accounts", 51, "adstudio");
                }
                return null;
            case 1508147257:
                if (str.equals("MRKT_BTC_BOOKING_CAMPAIGNS_REVIEW")) {
                    return G1("MRKT_BTC_BOOKING_CAMPAIGNS_REVIEW", "mrkt/btc/booking/campaigns-review", 1181, "mrkt");
                }
                return null;
            case 1515190585:
                if (str.equals("S4P_LOGIN")) {
                    return G1("S4P_LOGIN", "s4p/login", 1717, "s4p");
                }
                return null;
            case 1532497641:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_SUCCESS")) {
                    return G1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_SUCCESS", "mrkt/discovery-mode/unified-buying/success", 1222, "mrkt");
                }
                return null;
            case 1551702681:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_REMOVEUNPLAYED")) {
                    return G1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEUNPLAYED", "collection/yourepisodes/settings/removeunplayed", 374, "collection");
                }
                return null;
            case 1578602425:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SUCCESS")) {
                    return G1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SUCCESS", "mrkt/artist/campaigns/marquee-and-showcase/success", 1073, "mrkt");
                }
                return null;
            case 1670751897:
                if (str.equals("OAUTH_ACCOUNT_SELECTOR")) {
                    return G1("OAUTH_ACCOUNT_SELECTOR", "oauth/account-selector", 1367, "oauth");
                }
                return null;
            case 1712246121:
                if (str.equals("MRKT_ARTIST_SHARE_MILESTONE")) {
                    return G1("MRKT_ARTIST_SHARE_MILESTONE", "mrkt/artist/share/milestone", 1140, "mrkt");
                }
                return null;
            case 1715104201:
                if (str.equals("ARTIST_PLAYLISTS")) {
                    return G1("ARTIST_PLAYLISTS", "artist/playlists", 172, "artist");
                }
                return null;
            case 1726821801:
                if (str.equals("S4P_PODCAST_EPISODE_OPTIONS_NON_HOSTED")) {
                    return G1("S4P_PODCAST_EPISODE_OPTIONS_NON_HOSTED", "s4p/podcast/episode/options/non-hosted", 1733, "s4p");
                }
                return null;
            case 1754615001:
                if (str.equals("MRKT_ARTIST_MUSIC_REVIEW")) {
                    return G1("MRKT_ARTIST_MUSIC_REVIEW", "mrkt/artist/music/review", 1097, "mrkt");
                }
                return null;
            case 1757868089:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AI_AUDIO")) {
                    return G1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AI_AUDIO", "adstudio/duplicate-ad-set-only/ad-quick-ai-audio", 84, "adstudio");
                }
                return null;
            case 1788760105:
                if (str.equals("S4P_CREATION_RECORDING_TERMS")) {
                    return G1("S4P_CREATION_RECORDING_TERMS", "s4p/creation/recording-terms", 1697, "s4p");
                }
                return null;
            case 1889069737:
                if (str.equals("UBI_DEBUG_MONITOR_EVENTGROUPDETAILS")) {
                    return G1("UBI_DEBUG_MONITOR_EVENTGROUPDETAILS", "ubi/debug-monitor/eventgroupdetails", 2054, "ubi");
                }
                return null;
            case 1914238153:
                if (str.equals("MANAGE_TEAM_MEMBER_DETAILS_PAGE")) {
                    return G1("MANAGE_TEAM_MEMBER_DETAILS_PAGE", "manage/team-member-details-page", 1001, "manage");
                }
                return null;
            case 1922990921:
                if (str.equals("CHILD_LED_SIGNUP_PARENTAL_CONSENT_EDUCATION")) {
                    return G1("CHILD_LED_SIGNUP_PARENTAL_CONSENT_EDUCATION", "child-led-signup/parental-consent-education", 341, "child-led-signup");
                }
                return null;
            case 1926607081:
                if (str.equals("S4P_SETUP_SHOW_CATEGORY_LANGUAGE")) {
                    return G1("S4P_SETUP_SHOW_CATEGORY_LANGUAGE", "s4p/setup-show/category-language", 1750, "s4p");
                }
                return null;
            case 1937376153:
                if (str.equals("INSPIRECREATION")) {
                    return G1("INSPIRECREATION", "inspirecreation", 841, "inspirecreation");
                }
                return null;
            case 1971086425:
                if (str.equals("BUNDLING_WEBVIEW")) {
                    return G1("BUNDLING_WEBVIEW", "bundling/webview", 260, "bundling");
                }
                return null;
            case 2070915625:
                if (str.equals("SOCIAL_LISTENING_TAPTOQUEUE")) {
                    return G1("SOCIAL_LISTENING_TAPTOQUEUE", "social-listening/taptoqueue", 1914, "social-listening");
                }
                return null;
            case 2076299273:
                if (str.equals("PLAYLIST_CREATE")) {
                    return D3();
                }
                return null;
            case 2099402745:
                if (str.equals("COURSE_QUIZ")) {
                    return G1("COURSE_QUIZ", "course/quiz", 458, "course");
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-88550448);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function1) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131955168);
            String strO1 = cwl1.o0(x340Var, 2131955167);
            String strO2 = cwl1.o0(x340Var, 2131955166);
            z50 z50Var = z50.c;
            function2 = function1;
            mqo1.d(function2, (i3u) null, (hux) null, strO0, strO1, new zgx(strO2, new gbx(z50Var, function1)), new zgx(cwl1.o0(x340Var, 2131955165), new gbx(z50Var, function0)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k16(function0, function2, i, (byte) 4);
        }
    }

    public static p6r0 c0() {
        return G1("BLEND_ENTITY", "blend/entity", 216, "blend");
    }

    public static p6r0 c1() {
        return G1("CONTEXTMENU_SHOW", "contextmenu/show", 440, "contextmenu");
    }

    public static p6r0 c2() {
        return G1("INAPPMESSAGE_BOTTOMSHEET", "inappmessage/bottomsheet", 831, "inappmessage");
    }

    public static p6r0 c3() {
        return G1("NOWPLAYING_QUEUE", "nowplaying/queue", 1361, "nowplaying");
    }

    public static p6r0 c4() {
        return G1("PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS_REMOVE_MEMBER", "premium-account-management/member-details/remove-member", 1544, "premium-account-management");
    }

    public static p6r0 c5() {
        return G1("SETTINGS_EQUALIZER", "settings/equalizer", 1818, "settings");
    }

    public static p6r0 c6() {
        return G1("VENUE", "venue", 2076, "venue");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(y7e1 y7e1Var, boolean z, ova ovaVar, c380 c380Var, iu30 iu30Var, qim0 qim0Var, fnv fnvVar, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(577168670);
        int i2 = i | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.e(ovaVar.ordinal()) ? 256 : 128) | (x340Var.g(c380Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536) | (x340Var.g(fnvVar) ? 1048576 : 524288) | (x340Var.i(function0) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            qim0 qim0VarH = l6o1.H(qim0Var, l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            int i3 = i2 >> 9;
            a(y7e1Var, z, uyn1.x(nim0Var, 16.0f), fnvVar, function0, x340Var, (i3 & 57344) | (i2 & 126) | (i3 & 7168));
            if (c380Var.size() > 1) {
                x340Var.i0(1408623284);
                rqo1.g(0, 0, x340Var, u291.f(nim0Var, 1.0f));
                cvx cvxVar2 = cbx.b(x340Var).b;
                m(ovaVar, c380Var, iu30Var, uyn1.z(0.0f, 16.0f, 1, nim0Var), x340Var, (i2 >> 6) & 1022);
                x340Var.r(false);
            } else {
                x340Var.i0(1408936570);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(y7e1Var, z, ovaVar, c380Var, iu30Var, qim0Var, fnvVar, function0, i);
        }
    }

    public static p6r0 d0() {
        return G1("BLEND_ENTITY_EDITNAME", "blend/entity/editname", 217, "blend");
    }

    public static p6r0 d1() {
        return G1("CONTEXTMENU", "contextmenu", 415, "contextmenu");
    }

    public static p6r0 d2() {
        return G1("INAPPMESSAGE_FULLSCREEN", "inappmessage/fullscreen", 833, "inappmessage");
    }

    public static p6r0 d3() {
        return G1("NOWPLAYING_VIDEOSETTINGS", "nowplaying/videosettings", 1364, "nowplaying");
    }

    public static p6r0 d4() {
        return G1("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS_VIDEO_SETTINGS", "premium-account-management/regular-member-sub-account-details/video-settings", 1548, "premium-account-management");
    }

    public static p6r0 d5() {
        return G1("SETTINGS_LANGUAGES_MUSIC", "settings/languages/music", 1827, "settings");
    }

    public static p6r0 d6() {
        return G1("VERSIONSUNSETTING_DIALOG", "versionsunsetting/dialog", 2077, "versionsunsetting");
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    public static final void e(String str, boolean z, boolean z2, boolean z3, fnv fnvVar, boolean z4, ova ovaVar, c380 c380Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, b0k b0kVar, int i) {
        b0k b0kVar2;
        ?? r1;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(751119207);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.h(z2) ? 256 : 128) | (b0kVar3.h(z3) ? 2048 : 1024) | (b0kVar3.g(fnvVar) ? 16384 : 8192) | (b0kVar3.h(z4) ? 131072 : 65536) | (b0kVar3.e(ovaVar.ordinal()) ? 1048576 : 524288) | (b0kVar3.g(c380Var) ? 8388608 : 4194304) | (b0kVar3.i(iu30Var) ? 67108864 : 33554432) | (b0kVar3.i(iu30Var2) ? 536870912 : 268435456);
        int i3 = (b0kVar3.i(function0) ? 4 : 2) | (b0kVar3.i(function1) ? 32 : 16) | (b0kVar3.i(function2) ? 256 : 128) | (b0kVar3.i(function3) ? 2048 : 1024) | (b0kVar3.i(function4) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 9363) == 9362) ? false : true)) {
            y7e1 y7e1VarD = c4p1.D(i2 & 14, 2, str, b0kVar3);
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            boolean zI = b0kVar3.i(y7e1VarD) | ((i2 & 234881024) == 67108864);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new qy5(y7e1VarD, iu30Var, (lnm) null, (byte) 4);
                b0kVar3.s0(objT);
            }
            qxd0.t(y7e1VarD, b0kVar3, (vu30) objT);
            if (z4) {
                b0kVar3.i0(-186455303);
                c(function3, function4, b0kVar3, (i3 >> 9) & 126);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-186361125);
                b0kVar3.r(false);
            }
            boolean zI2 = b0kVar3.i(k6a1Var) | ((i3 & 896) == 256);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                r1 = 0;
                objT2 = new onv(k6a1Var, function2, (byte) 0);
                b0kVar3.s0(objT2);
            } else {
                r1 = 0;
            }
            q3p1.b((int) r1, 1, (Function0) objT2, b0kVar3, (boolean) r1);
            b0kVar2 = b0kVar3;
            irn1.u((qim0) null, apo.r(1243142676, new hy((byte) 5, k6a1Var, function2, function0, z2, z3), b0kVar3), (vu30) null, (erl1) null, apo.r(1100708366, new pnv(y7e1VarD, z, ovaVar, c380Var, iu30Var2, fnvVar, function1), b0kVar3), b0kVar2, 24624, 13);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qnv(str, z, z2, z3, fnvVar, z4, ovaVar, c380Var, iu30Var, iu30Var2, function0, function1, function2, function3, function4, i);
        }
    }

    public static p6r0 e0() {
        return G1("BLEND_ENTITY_MEMBERS", "blend/entity/members", 218, "blend");
    }

    public static p6r0 e1() {
        return G1("CONTRIBUTION_NOTES_DETAIL", "contribution/notes-detail", 447, "contribution");
    }

    public static p6r0 e2() {
        return G1("INAPPMESSAGE_HTML_FULLSCREEN", "inappmessage/html-fullscreen", 834, "inappmessage");
    }

    public static p6r0 e3() {
        return G1("ON_DEMAND_TRIAL_OPT_IN_UPSELL", "on-demand-trial/opt-in-upsell", 1377, "on-demand-trial");
    }

    public static p6r0 e4() {
        return G1("PREMIUM_ACCOUNT_MANAGEMENT_SUB_ACCOUNT_ALLOCATION_REQUEST_DIALOG", "premium-account-management/sub-account-allocation-request-dialog", 1549, "premium-account-management");
    }

    public static p6r0 e5() {
        return G1("SETTINGS_NOTIFICATIONS_CATEGORIES", "settings/notifications/categories", 1833, "settings");
    }

    public static p6r0 e6() {
        return G1("VOTING_ROOT", "voting/root", 2087, "voting");
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-84072153);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            vex vexVar = (vex) zex.a.e;
            long j = vexVar.c;
            long j2 = vexVar.a;
            long j3 = vexVar.g;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), j, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            t1c.a(dug.e(u291.d(nim0Var, 1.0f), v9c.s(p7h.M(new u7h[]{new u7h(j2), new u7h(j3)}), 0.0f, Float.POSITIVE_INFINITY, 8), (hw61) null, 0.0f, 6), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 20);
        }
    }

    public static p6r0 f0() {
        return G1("BLEND_INVITATION", "blend/invitation", 220, "blend");
    }

    public static p6r0 f1() {
        return G1("CONTRIBUTION_NOTES_MANAGE_MENU", "contribution/notes-manage-menu", 448, "contribution");
    }

    public static p6r0 f2() {
        return G1("INAPPMESSAGE_HTML_MODAL", "inappmessage/html-modal", 835, "inappmessage");
    }

    public static p6r0 f3() {
        return G1("ON_DEMAND_TRIAL_PLAN_OVERVIEW", "on-demand-trial/plan-overview", 1378, "on-demand-trial");
    }

    public static p6r0 f4() {
        return G1("PREMIUM_DESTINATION", "premium-destination", 1551, "premium-destination");
    }

    public static p6r0 f5() {
        return G1("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS", "settings/notifications/category-details", 1834, "settings");
    }

    public static p6r0 f6() {
        return G1("VOTING_SHARE", "voting/share", 2088, "voting");
    }

    public static final void g(String str, hft0 hft0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        hft0 hft0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1020070479);
        int i3 = i & 6;
        pw31 pw31Var = pw31.a;
        if (i3 == 0) {
            i2 = (x340Var.g(pw31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            hft0Var2 = hft0Var;
            i2 |= x340Var.i(hft0Var2) ? 256 : 128;
        } else {
            hft0Var2 = hft0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarE = pw31Var.e(nim0.a, een.O0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarE, 0.0f, 0.0f, 8.0f, 8.0f, 3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, y580.Y);
            boolean z = (i2 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new h7w0(iu30Var, (byte) 15);
                x340Var.s0(objT);
            }
            otw.c(hft0Var2, new set0(str, true, "promov3-client-native", "home_feed", (Function0) objT, false, false, null, null, null, false, 2016), (qim0) null, (ipb1) null, x340Var, (i2 >> 6) & 14, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(str, hft0Var, iu30Var, i, (byte) 6);
        }
    }

    public static p6r0 g0() {
        return G1("BLEND_TASTE_MATCH", "blend/taste-match", 223, "blend");
    }

    public static p6r0 g1() {
        return G1("CONTRIBUTION_NOTES_MANAGE_PICKER", "contribution/notes-manage-picker", 449, "contribution");
    }

    public static p6r0 g2() {
        return G1("INAPPMESSAGE_MODAL", "inappmessage/modal", 836, "inappmessage");
    }

    public static p6r0 g3() {
        return G1("PAGE_MATCH_LANDING", "page-match/landing", 1393, "page-match");
    }

    public static p6r0 g4() {
        return G1("PREMIUM_SIGNUP", "premium-signup", 1556, "premium-signup");
    }

    public static p6r0 g5() {
        return G1("SETTINGS_SEARCH", "settings/search", 1844, "settings");
    }

    public static p6r0 g6() {
        return G1("VTEC", "vtec", 2089, "vtec");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void h(mox0 mox0Var, idm idmVar, hft0 hft0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        mox0 mox0Var2;
        hft0 hft0Var2 = hft0Var;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(393878472);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(mox0Var) ? 4 : 2) | (x340Var.i(idmVar) ? 32 : 16) | (x340Var.i(hft0Var2) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarW = u291.w(u291.h(qim0Var, 180.0f), 0.0f, dsa0.m(x340Var, 2131166901));
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarW, er31.b(8.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            boolean z = (57344 & i2) == 16384;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new h7w0(iu30Var2, (byte) 16);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Uri uri = Uri.parse(mox0Var.g);
            as80 as80Var = mif1.P0;
            nim0 nim0Var = nim0.a;
            cso1.d(uri, isl.a, u291.c(u291.f(nim0Var, 1.0f), 1.0f), as80Var, (jmr0) null, (jmr0) null, (tl3) null, x340Var, 3504, 240);
            f(x340Var, 0);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            mox0Var2 = mox0Var;
            String str = mox0Var2.e;
            lee1 lee1Var = cbx.d(x340Var).n;
            long j = cbx.a(x340Var).b.a;
            cjc0 cjc0Var = new cjc0(1);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.x(wnb0Var, 16.0f), lee1Var, j, new a0e1(5), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1696);
            String str2 = mox0Var2.b;
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new z6v0(mox0Var2, (byte) 25);
                x340Var.s0(objT2);
            }
            int i4 = i2 >> 3;
            otw.c(idmVar, new wcm(str2, (String) null, (String) null, (ucm) null, (Function0) null, (Function0) objT2, false, (String) null, (String) null, 990), (qim0) null, (ipb1) null, x340Var, i4 & 14, 12);
            x340Var.r(true);
            op71.g(x340Var, new wnb0(1.0f, true));
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var2 = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(wnb0Var2, 16.0f, 0.0f, 0.0f, 16.0f, 6);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            k(mox0Var2, x340Var, i3);
            uwo1.e(mox0Var2.d, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 1572864, 0, 1698);
            x340Var = x340Var;
            x340Var.r(true);
            String str3 = mox0Var2.h;
            if (str3 == null) {
                x340Var.i0(-628294376);
                x340Var.r(false);
                hft0Var2 = hft0Var;
                iu30Var2 = iu30Var;
            } else {
                x340Var.i0(-628294375);
                hft0Var2 = hft0Var;
                iu30Var2 = iu30Var;
                g(str3, hft0Var2, iu30Var2, x340Var, (i2 & 896) | 6 | (i4 & 7168));
                x340Var.r(false);
            }
            us71.m(x340Var, true, true, true);
        } else {
            mox0Var2 = mox0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0((Object) mox0Var2, (Object) idmVar, (Object) hft0Var2, (Object) qim0Var, (cv30) iu30Var2, i, (byte) 0);
        }
    }

    public static p6r0 h0() {
        return G1("BLUEJAY_CONFIRM", "bluejay/confirm", 226, "bluejay");
    }

    public static p6r0 h1() {
        return G1("CONTRIBUTION_NOTES_MANAGEMENT", "contribution/notes-management", 450, "contribution");
    }

    public static p6r0 h2() {
        return G1("INAPPMESSAGE_WEBVIEW", "inappmessage/webview", 837, "inappmessage");
    }

    public static p6r0 h3() {
        return G1("PAGE_MATCH_ONBOARDING", "page-match/onboarding", 1394, "page-match");
    }

    public static p6r0 h4() {
        return G1("PRERELEASE", "prerelease", 1559, "prerelease");
    }

    public static p6r0 h5() {
        return G1("SETTINGS_THIRD_PARTY_LIBRARIES", "settings/third-party-libraries", 1848, "settings");
    }

    public static p6r0 h6() {
        return G1("WATCHFEED", "watchfeed", 2127, "watchfeed");
    }

    public static final void i(boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0VarB;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1492801026);
        int i2 = (b0kVar3.h(z) ? 4 : 2) | i | (b0kVar3.h(z2) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131955179);
            String strO1 = cwl1.o0(b0kVar3, 2131955181);
            String strO2 = cwl1.o0(b0kVar3, 2131955180);
            gbx gbxVar = new gbx(z50.c, function0);
            jax haxVar = z ? jax.a : new hax(strO2);
            nim0 nim0Var = nim0.a;
            if (z) {
                b0kVar3.i0(62728315);
                boolean zG = b0kVar3.g(strO0);
                Object objT = b0kVar3.T();
                if (zG || objT == m4cVar) {
                    objT = new i3o(strO0, (byte) 27);
                    b0kVar3.s0(objT);
                }
                qim0VarB = s161.b(nim0Var, false, (iu30) objT);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(62730802);
                boolean zG2 = b0kVar3.g(strO1);
                Object objT2 = b0kVar3.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new i3o(strO1, (byte) 28);
                    b0kVar3.s0(objT2);
                }
                qim0VarB = s161.b(nim0Var, false, (iu30) objT2);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, ldx.c, qim0VarB, haxVar, yla.s(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-475518207, new dr0((byte) 19, z2), b0kVar3), b0kVar2, 0, 48, 1992);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ure(z, z2, function0, i);
        }
    }

    public static p6r0 i0() {
        return G1("BLUEJAY_CONNECTOR_APPS", "bluejay/connector-apps", 227, "bluejay");
    }

    public static p6r0 i1() {
        return G1("CONTRIBUTION_NOTES_REPORT_ACTION", "contribution/notes-report-action", 452, "contribution");
    }

    public static p6r0 i2() {
        return G1("INAPPUSERFEEDBACK_BOTTOMSHEET", "inappuserfeedback/bottomsheet", 838, "inappuserfeedback");
    }

    public static p6r0 i3() {
        return G1("PARENTAL_CONTROL_ACCOUNT_DETAILS", "parental-control/account-details", 1399, "parental-control");
    }

    public static p6r0 i4() {
        return G1("PROACTIVE_PLATFORMS_COVER_SCREEN_WIDGET", "proactive-platforms/cover-screen-widget", 1562, "proactive-platforms");
    }

    public static p6r0 i5() {
        return G1("SETTINGS_YOUR_LIBRARY", "settings/your-library", 1852, "settings");
    }

    public static p6r0 i6() {
        return G1("WATCHFEEDPIVOTS", "watchfeedpivots", 2129, "watchfeedpivots");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x01aa  */
    public static final void j(fnv fnvVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strN0;
        String strU;
        int i3;
        int i4;
        boolean z;
        Object objT;
        Object objT2;
        Object objT3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1546948253);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(fnvVar) : x340Var.i(fnvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (fnvVar.equals(anv.a)) {
                i3 = 558593516;
                i4 = 2131955169;
            } else if (fnvVar.equals(env.a)) {
                i3 = 558596397;
                i4 = 2131955174;
            } else {
                if (fnvVar.equals(cnv.a)) {
                    i3 = 558599474;
                    i4 = 2131955171;
                } else if (fnvVar instanceof dnv) {
                    x340Var.i0(558603102);
                    long j = ((dnv) fnvVar).a;
                    x340Var.i0(-284491961);
                    if (j <= 0) {
                        strU = x0d.k(x340Var, -1329454076, 2131955173, x340Var, false);
                    } else {
                        x340Var.i0(-1329370469);
                        x340Var.r(false);
                        int i5 = (int) (j / 3600);
                        int i6 = (int) ((j % 3600) / 60);
                        if (i6 < 1) {
                            i6 = 1;
                        }
                        if (i5 > 0) {
                            x340Var.i0(-1329229822);
                            strU = cwl1.U(2131820669, i5, new Object[]{Integer.valueOf(i5)}, x340Var);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-1329135396);
                            strU = cwl1.U(2131820670, i6, new Object[]{Integer.valueOf(i6)}, x340Var);
                            x340Var.r(false);
                        }
                    }
                    x340Var.r(false);
                    strN0 = cwl1.n0(2131955172, new Object[]{strU}, x340Var);
                    x340Var.r(false);
                } else {
                    if (!fnvVar.equals(bnv.a)) {
                        throw p3d1.k(x340Var, 558592191, false);
                    }
                    x340Var.i0(137003648);
                    x340Var.r(false);
                    strN0 = null;
                }
                if (strN0 != null) {
                    x340Var.i0(137046894);
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = jkv.e1;
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT3);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strN0, qim0VarB, cbx.d(x340Var).j, cbx.a(x340Var).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(137275767);
                    z = (i2 & 112) == 32;
                    objT = x340Var.T();
                    if (z || objT == m4cVar) {
                        objT = new xet(function0, (byte) 5);
                        x340Var.s0(objT);
                    }
                    af5 af5VarA = wmo1.A(2131955170, 2131955177, "https://www.spotify.com/platform-rules/plain", (zma1) null, (iu30) objT, x340Var, 384, 8);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = rnv.b;
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarB2 = s161.b(qim0Var, false, (iu30) objT2);
                    uwr uwrVar2 = cbx.a;
                    uwo1.d(af5VarA, cbx.a(x340Var).b.d, qim0VarB2, cbx.d(x340Var).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4080);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            }
            strN0 = x0d.k(x340Var, i3, i4, x340Var, false);
            if (strN0 != null) {
                x340Var.i0(137046894);
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = jkv.e1;
                    x340Var.s0(objT3);
                }
                qim0 qim0VarB3 = s161.b(qim0Var, false, (iu30) objT3);
                uwr uwrVar3 = cbx.a;
                uwo1.e(strN0, qim0VarB3, cbx.d(x340Var).j, cbx.a(x340Var).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(137275767);
                if ((i2 & 112) == 32) {
                }
                objT = x340Var.T();
                if (z) {
                    objT = new xet(function0, (byte) 5);
                    x340Var.s0(objT);
                } else {
                    objT = new xet(function0, (byte) 5);
                    x340Var.s0(objT);
                }
                af5 af5VarA2 = wmo1.A(2131955170, 2131955177, "https://www.spotify.com/platform-rules/plain", (zma1) null, (iu30) objT, x340Var, 384, 8);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = rnv.b;
                    x340Var.s0(objT2);
                }
                qim0 qim0VarB4 = s161.b(qim0Var, false, (iu30) objT2);
                uwr uwrVar4 = cbx.a;
                uwo1.d(af5VarA2, cbx.a(x340Var).b.d, qim0VarB4, cbx.d(x340Var).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4080);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(fnvVar, function0, qim0Var, i, (byte) 10);
        }
    }

    public static p6r0 j0() {
        return G1("BLUEJAY_CONNECTOR_APPS_AUTHENTICATION", "bluejay/connector-apps-authentication", 228, "bluejay");
    }

    public static p6r0 j1() {
        return G1("CONTRIBUTION_NOTES_REPORT_PICKER", "contribution/notes-report-picker", 453, "contribution");
    }

    public static p6r0 j2() {
        return G1("INAPPUSERFEEDBACK_JOURNEY", "inappuserfeedback/journey", 839, "inappuserfeedback");
    }

    public static p6r0 j3() {
        return G1("PARENTAL_CONTROL_ACCOUNT_DETAILS_VIDEO_SETTINGS", "parental-control/account-details/video-settings", 1401, "parental-control");
    }

    public static p6r0 j4() {
        return G1("PROACTIVE_PLATFORMS_NPV_WIDGET", "proactive-platforms/npv-widget", 1566, "proactive-platforms");
    }

    public static p6r0 j5() {
        return G1("SHOWS_AUDIO", "shows/audio", 1869, "shows");
    }

    public static p6r0 j6() {
        return G1("WATCHFEED_WRAPPED", "watchfeed-wrapped", 2128, "watchfeed-wrapped");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(mox0 mox0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        u7h m231Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1982857714);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mox0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            wxe1 wxe1Var = mox0Var.c;
            boolean z = wxe1Var instanceof wxe1;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(1666126024);
                Uri uri = Uri.parse(wxe1Var.d);
                h6m h6mVar = mif1.Q0;
                uwr uwrVar = cbx.a;
                qim0 qim0VarH = u291.h(nim0Var, cbx.b(x340Var).b.d);
                cvx cvxVar = cbx.b(x340Var).b;
                cso1.d(uri, isl.a, uyn1.B(qim0VarH, 0.0f, 0.0f, 0.0f, 4.0f, 7), h6mVar, (jmr0) null, (jmr0) null, (tl3) null, x340Var, 3120, 240);
                x340Var.r(false);
            } else {
                if (!(wxe1Var instanceof xxe1)) {
                    throw p3d1.k(x340Var, 1439218161, false);
                }
                x340Var.i0(1666491421);
                String str = ((xxe1) wxe1Var).d;
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).d;
                String str2 = mox0Var.i;
                x340Var.i0(-473354736);
                try {
                    m231Var = new u7h(z4p1.e(Color.parseColor(str2)));
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.e(thA, f4i1.f("PromoV3Card: Invalid hex color '", str2, "', using fallback"), new Object[0]);
                    uwr uwrVar3 = cbx.a;
                    m231Var = new u7h(cbx.a(x340Var).b.a);
                }
                x340Var.r(false);
                cjc0 cjc0Var = new cjc0(2);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.e(str, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), lee1Var, m231Var.a, new a0e1(5), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1696);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(mox0Var, i, (byte) 21);
        }
    }

    public static p6r0 k0() {
        return G1("BLUEJAY_SKIP_FORWARD", "bluejay/skip-forward", 236, "bluejay");
    }

    public static p6r0 k1() {
        return G1("CREATEMENU", "createmenu", 462, "createmenu");
    }

    public static p6r0 k2() {
        return G1("JAM_PENDINGREQUESTSSHEET", "jam/pendingrequestssheet", 869, "jam");
    }

    public static p6r0 k3() {
        return G1("PARENTAL_CONTROL_DELETE_ACCOUNT", "parental-control/delete-account", 1402, "parental-control");
    }

    public static p6r0 k4() {
        return G1("PROFILE", "profile", 1569, "profile");
    }

    public static p6r0 k5() {
        return G1("SHUFFLE_TOGGLE_UPSELL", "shuffle-toggle-upsell", 1880, "shuffle-toggle-upsell");
    }

    public static p6r0 k6() {
        return G1("YOURLIBRARY_EPISODES", "yourlibrary/episodes", 2263, "yourlibrary");
    }

    public static final void l(int i, int i2, boolean z, Function0 function0, b0k b0kVar, int i3) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2141510971);
        int i4 = i3 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.e(i2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z2 = (i4 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new gy((byte) 20, z);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, new uvx(0, (pgx) null, 0, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1042354803, new f13(i2, (byte) 5), b0kVar3), apo.r(1765645236, new aw1((byte) 23, z), b0kVar3), (xu30) null, (xu30) null, apo.r(-359450761, new f13(i, (byte) 6), b0kVar3), b0kVar2, 64, 197040, 26556);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new snv(i, i2, z, function0, i3, (byte) 0);
        }
    }

    public static p6r0 l0() {
        return G1("BLUEJAY_VOICE_PICKER", "bluejay/voice-picker", 237, "bluejay");
    }

    public static final gon0 l1(Context context) {
        gon0 gon0Var = new gon0(context);
        rzn0 rzn0Var = gon0Var.v;
        rzn0Var.a(new svj(rzn0Var));
        rzn0Var.a(new uvj());
        rzn0Var.a(new e3u());
        return gon0Var;
    }

    public static p6r0 l2() {
        return G1("KID_ACCOUNT_CREATION_AGE_VERIFICATION", "kid-account-creation/age-verification", 874, "kid-account-creation");
    }

    public static p6r0 l3() {
        return G1("PARENTAL_CONTROL_LOGIN_CHOICE", "parental-control/login-choice", 1403, "parental-control");
    }

    public static p6r0 l4() {
        return G1("PROFILE_BLOCKED_LIST", "profile/blocked-list", 1575, "profile");
    }

    public static p6r0 l5() {
        return G1("SIGNUP_ACCOUNTALREADYEXISTS", "signup/accountalreadyexists", 1883, "signup");
    }

    public static p6r0 l6() {
        return G1("YOURLIBRARY_MESSAGING", "yourlibrary/messaging", 2268, "yourlibrary");
    }

    public static final void m(ova ovaVar, c380 c380Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        int i4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1058769308);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(ovaVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = rnv.c;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131955189);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(nim0.a, 16.0f, 0.0f, 16.0f, 8.0f, 2);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = rnv.d;
                x340Var.s0(objT2);
            }
            uwo1.e(strO0, s161.b(qim0VarB2, false, (iu30) objT2), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.i0(-399442927);
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                ova ovaVar2 = (ova) it.next();
                int iOrdinal = ovaVar2.ordinal();
                if (iOrdinal == 0) {
                    i3 = 2131955188;
                } else if (iOrdinal == 1) {
                    i3 = 2131955186;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return;
                    }
                    i3 = 2131955184;
                }
                int iOrdinal2 = ovaVar2.ordinal();
                if (iOrdinal2 == 0) {
                    i4 = 2131955187;
                } else if (iOrdinal2 == 1) {
                    i4 = 2131955185;
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return;
                    }
                    i4 = 2131955183;
                }
                boolean z = ovaVar == ovaVar2;
                boolean zE = ((i2 & 896) == 256) | x340Var.e(ovaVar2.ordinal());
                Object objT3 = x340Var.T();
                if (zE || objT3 == m4cVar) {
                    objT3 = new f2t(iu30Var, ovaVar2, (byte) 20);
                    x340Var.s0(objT3);
                }
                l(i3, i4, z, (Function0) objT3, x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, ovaVar, c380Var, iu30Var, qim0Var, (byte) 5);
        }
    }

    public static final gm41 m0(mvh1 mvh1Var, xk41 xk41Var, boolean z) {
        boolean z2 = mvh1Var instanceof jvh1;
        if (z2 && !z) {
            return new gm41(3, (Boolean) null);
        }
        if (z2 && z) {
            return new gm41(1, Boolean.FALSE);
        }
        if (z2 || z) {
            return D5(mvh1Var).equals(xk41Var) ? new gm41(3, (Boolean) null) : new gm41(D5(mvh1Var), Boolean.TRUE);
        }
        return D5(mvh1Var).equals(xk41Var) ? new gm41(1, Boolean.TRUE) : new gm41(D5(mvh1Var), Boolean.TRUE);
    }

    public static xbk1 m1(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                jah.g(cy30.j(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (xbk1) objNewInstance;
            } catch (IllegalAccessException e) {
                bhn0.o(cy30.j(cls, "Cannot create an instance of "), e);
                return null;
            } catch (InstantiationException e2) {
                bhn0.o(cy30.j(cls, "Cannot create an instance of "), e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            bhn0.o(cy30.j(cls, "Cannot create an instance of "), e3);
            return null;
        }
    }

    public static p6r0 m2() {
        return G1("KID_ACCOUNT_CREATION_SUBMIT", "kid-account-creation/submit", 883, "kid-account-creation");
    }

    public static p6r0 m3() {
        return G1("PARENTAL_CONTROL_LOGIN_CURRENT_DEVICE", "parental-control/login-current-device", 1404, "parental-control");
    }

    public static p6r0 m4() {
        return G1("PROFILE_EDIT", "profile/edit", 1576, "profile");
    }

    public static p6r0 m5() {
        return G1("SIGNUP_EMAIL", "signup/email", 1889, "signup");
    }

    public static p6r0 m6() {
        return G1("YOURLIBRARY_SEARCH", "yourlibrary/search", 2271, "yourlibrary");
    }

    public static final void n(h7e h7eVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        long j;
        long jA;
        boolean z;
        boolean z2;
        e7e e7eVar = h7eVar.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(859706497);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h7eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(nim0.a) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            boolean zG = x340Var.g(lee1Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 12582911);
                x340Var.s0(objT);
            }
            lee1 lee1Var2 = (lee1) objT;
            u7h u7hVar = e7eVar != null ? e7eVar.a : null;
            if (u7hVar == null) {
                x340Var.i0(1544234277);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(1544232789);
                x340Var.r(false);
                j = u7hVar.a;
            }
            long j2 = j;
            u7h u7hVar2 = e7eVar != null ? e7eVar.b : null;
            if (u7hVar2 == null) {
                x340Var.i0(1544237413);
                jA = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            } else {
                x340Var.i0(1544235274);
                x340Var.r(false);
                jA = u7hVar2.a;
            }
            String str = h7eVar.d;
            if (str == null || !(!ihc1.y0(str))) {
                z = false;
                z2 = false;
            } else {
                z = false;
                z2 = true;
            }
            boolean z3 = x340Var.k(t4k.n) == flb0.a ? true : z;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            gfx.b(1, apo.r(-1160830228, new s3l(iu30Var, h7eVar, jA, z2, yae1VarQ, lee1Var2, z3, j2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l7e(h7eVar, iu30Var, i, (byte) 1);
        }
    }

    public static p6r0 n0() {
        return G1("CACHED_FILES", "cached-files", 265, "cached-files");
    }

    public static p6r0 n1() {
        return G1("CULTURALMOMENTSHUB", "culturalmomentshub", 466, "culturalmomentshub");
    }

    public static p6r0 n2() {
        return G1("KID_ACCOUNT_TRANSITION_CONSENT", "kid-account-transition/consent", 889, "kid-account-transition");
    }

    public static p6r0 n3() {
        return G1("PARENTAL_CONTROL_LOGIN_DIFFERENT_DEVICE", "parental-control/login-different-device", 1405, "parental-control");
    }

    public static p6r0 n4() {
        return G1("PROFILE_EDIT_BIO", "profile/edit/bio", 1577, "profile");
    }

    public static p6r0 n5() {
        return G1("SIGNUP_SIGNUPUNAVAILABLE", "signup/signupunavailable", 1896, "signup");
    }

    public static p6r0 n6() {
        return G1("YOURLIBRARYTAGS_YOURTAGSPAGE", "yourlibrarytags/yourtagspage", 2274, "yourlibrarytags");
    }

    public static p6r0 o() {
        return G1("AAA_CON", "aaa/con", 0, "aaa");
    }

    public static p6r0 o0() {
        return G1("CHANGEPIN", "changepin", 302, "changepin");
    }

    public static p6r0 o1() {
        return G1("CULTURALMOMENTS_UPSELL", "culturalmoments/upsell", 465, "culturalmoments");
    }

    public static p6r0 o2() {
        return G1("KID_ACCOUNT_TRANSITION_SUBMIT", "kid-account-transition/submit", 897, "kid-account-transition");
    }

    public static p6r0 o3() {
        return G1("PARENTAL_CONTROL_MANAGE_CONTENT", "parental-control/manage-content", 1412, "parental-control");
    }

    public static p6r0 o4() {
        return G1("PROFILE_EDIT_SOCIAL_HANDLE", "profile/edit/social-handle", 1578, "profile");
    }

    public static p6r0 o5() {
        return G1("SLEEP_TIMER_NUDGE", "sleep-timer-nudge", 1900, "sleep-timer-nudge");
    }

    public static p6r0 o6() {
        return G1("YOUR_PREMIUM", "your-premium", 2253, "your-premium");
    }

    public static p6r0 p() {
        return G1("AAA_CON_T", "aaa/con/t", 1, "aaa");
    }

    public static p6r0 p0() {
        return G1("CHAT", "chat", 313, "chat");
    }

    public static p6r0 p1() {
        return G1("CUSTOM_REACTIONS_PICKER", "custom-reactions-picker", 467, "custom-reactions-picker");
    }

    public static p6r0 p2() {
        return G1("LANGUAGEPICKER_NOSKIPDIALOG", "languagepicker/noskipdialog", 903, "languagepicker");
    }

    public static p6r0 p3() {
        return G1("PARENTAL_CONTROL_MY_ALLOWLISTING_REQUESTS", "parental-control/my-allowlisting-requests", 1414, "parental-control");
    }

    public static p6r0 p4() {
        return G1("PROFILE_FOLLOWERS", "profile/followers", 1581, "profile");
    }

    public static p6r0 p5() {
        return G1("SMARTSHUFFLE_PLAYMODEPICKER", "smartshuffle/playmodepicker", 1902, "smartshuffle");
    }

    public static p6r0 q() {
        return G1("AAA_T", "aaa/t", 2, "aaa");
    }

    public static p6r0 q0() {
        return G1("CHAT_CONTENT_PICKER", "chat/content-picker", 316, "chat");
    }

    public static p6r0 q1() {
        return G1("DATADOWNLOAD", "datadownload", 469, "datadownload");
    }

    public static p6r0 q2() {
        return G1("LISTENINGACTIVITY_AUDIENCESETTING", "listeningactivity/audiencesetting", 911, "listeningactivity");
    }

    public static p6r0 q3() {
        return G1("PARENTAL_CONTROL_REVIEW_ALLOWLISTING_REQUESTS", "parental-control/review-allowlisting-requests", 1418, "parental-control");
    }

    public static p6r0 q4() {
        return G1("PROFILE_FOLLOWING", "profile/following", 1582, "profile");
    }

    public static p6r0 q5() {
        return G1("SMARTSHUFFLE_NPVRECOMMENDATIONS_FULLSCREEN", "smartshuffle/npvrecommendations/fullscreen", 1901, "smartshuffle");
    }

    public static p6r0 r() {
        return G1("ABOUTENTITY", "aboutEntity", 3, "aboutEntity");
    }

    public static p6r0 r0() {
        return G1("CHAT_CONTRIBUTION_MEDIA_GALLERY", "chat/contribution-media-gallery", 317, "chat");
    }

    public static p6r0 r1() {
        return G1("DEBUG", "debug", 472, "debug");
    }

    public static p6r0 r2() {
        return G1("LISTENINGACTIVITY_ONBOARDING", "listeningactivity/onboarding", 915, "listeningactivity");
    }

    public static p6r0 r3() {
        return G1("PARENTAL_CONTROL_UPDATE_BIRTHDAY", "parental-control/update-birthday", 1419, "parental-control");
    }

    public static p6r0 r4() {
        return G1("PROFILE_PRIVACY_SETTINGS", "profile/privacy-settings", 1587, "profile");
    }

    public static p6r0 r5() {
        return G1("SNOOZE_RECOMMENDATION", "snooze-recommendation", 1903, "snooze-recommendation");
    }

    public static final boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static p6r0 s0() {
        return G1("CHAT_DETAILS", "chat/details", 318, "chat");
    }

    public static p6r0 s1() {
        return G1("DIALOG_CONNECT_PLAYBACK_ERROR", "dialog/connect/playback/error", 476, "dialog");
    }

    public static p6r0 s2() {
        return G1("LISTENINGPARTY_CHAT", "listeningparty/chat", 919, "listeningparty");
    }

    public static p6r0 s3() {
        return G1("PARENTAL_CONTROL_UPDATE_NAME", "parental-control/update-name", 1420, "parental-control");
    }

    public static p6r0 s4() {
        return G1("PROFILE_PRONOUNS", "profile/pronouns", 1588, "profile");
    }

    public static p6r0 s5() {
        return G1("SONG_DNA_UNAVAILABLE", "song-dna-unavailable", 1924, "song-dna-unavailable");
    }

    public static p6r0 t() {
        return G1("ACCOUNTSWITCHING_ADDACCOUNT", "accountswitching/addaccount", 4, "accountswitching");
    }

    public static p6r0 t0() {
        return G1("CHAT_EDIT_GROUP_DETAILS", "chat/edit-group-details", 319, "chat");
    }

    public static p6r0 t1() {
        return G1("DOWNLOAD_OVER_CELLULAR", "download-over-cellular", 498, "download-over-cellular");
    }

    public static p6r0 t2() {
        return G1("LISTENINGSTATS", "listeningstats", 926, "listeningstats");
    }

    public static p6r0 t3() {
        return G1("PERMISSIONS_LOCATION_REQUEST", "permissions/location/request", 1432, "permissions");
    }

    public static p6r0 t4() {
        return G1("PROMODISCLOSURE", "promodisclosure", 1592, "promodisclosure");
    }

    public static p6r0 t5() {
        return G1("SSO_PARTNERACCOUNTLINKING", "sso/partneraccountlinking", 1977, "sso");
    }

    public static p6r0 u() {
        return G1("ACCOUNTSWITCHING_ADDACCOUNTTYPESELECTION", "accountswitching/addaccounttypeselection", 5, "accountswitching");
    }

    public static p6r0 u0() {
        return G1("CHAT_ENTITY_PICKER", "chat/entity-picker", 320, "chat");
    }

    public static p6r0 u1() {
        return G1("ENTITYSEGMENTS", "entitysegments", 516, "entitysegments");
    }

    public static p6r0 u2() {
        return G1("LISTENINGSTATS_DETAILS", "listeningstats/details", 927, "listeningstats");
    }

    public static p6r0 u3() {
        return G1("PHONENUMBER_CHECKERROR", "phonenumber/checkerror", 1436, "phonenumber");
    }

    public static p6r0 u4() {
        return G1("PROMPTABLE_SECTION_INPUT", "promptable-section-input", 1593, "promptable-section-input");
    }

    public static p6r0 u5() {
        return G1("START_CHOOSELOGIN", "start/chooselogin", 1979, "start");
    }

    public static p6r0 v() {
        return G1("ADAPTIVEAUTHENTICATION_START", "adaptiveauthentication/start", 11, "adaptiveauthentication");
    }

    public static p6r0 v0() {
        return G1("CHAT_GIF_PICKER", "chat/gif-picker", 321, "chat");
    }

    public static p6r0 v1() {
        return G1("ENTITYSEGMENTS_CHAPTERSELECTOR", "entitysegments/chapterselector", 517, "entitysegments");
    }

    public static p6r0 v2() {
        return G1("LISTENINGSTATS_HIGHLIGHT_DETAILS", "listeningstats/highlight-details", 928, "listeningstats");
    }

    public static p6r0 v3() {
        return G1("PIN_GATE", "pin-gate", 1444, "pin-gate");
    }

    public static p6r0 v4() {
        return G1("PUFFIN_PIGEON_ONBOARDING", "puffin/pigeon-onboarding", 1601, "puffin");
    }

    public static p6r0 v5() {
        return G1("SUBTITLES_SELECTOR", "subtitles-selector", 1999, "subtitles-selector");
    }

    public static p6r0 w() {
        return G1("ADAPTIVEAUTHENTICATION_ERROR", "adaptiveauthentication/error", 10, "adaptiveauthentication");
    }

    public static p6r0 w0() {
        return G1("CHAT_INTERCEPTOR", "chat/interceptor", 322, "chat");
    }

    public static p6r0 w1() {
        return G1("ENTITYSEGMENTS_CLIP_EDIT", "entitysegments/clip/edit", 519, "entitysegments");
    }

    public static p6r0 w2() {
        return G1("LISTENINGSTATS_SUMMARY", "listeningstats/summary", 929, "listeningstats");
    }

    public static p6r0 w3() {
        return G1("PLAN_DETAILS", "plan-details", 1445, "plan-details");
    }

    public static p6r0 w4() {
        return G1("QUIZ_FEEDBACK", "quiz/feedback", 1606, "quiz");
    }

    public static p6r0 w5() {
        return G1("TASTEPROFILE", "tasteprofile", 2035, "tasteprofile");
    }

    public static p6r0 x() {
        return G1("ADD_CHILD_ACCOUNT_NUDGE", "add-child-account-nudge", 13, "add-child-account-nudge");
    }

    public static p6r0 x0() {
        return G1("CHAT_LIST", "chat/list", 324, "chat");
    }

    public static p6r0 x1() {
        return G1("EXPERIMENTAL", "experimental", 529, "experimental");
    }

    public static p6r0 x2() {
        return G1("LIVE_ENTITY", "live/entity", 931, "live");
    }

    public static p6r0 x3() {
        return G1("PLAN_MEMBER_INVITATION", "plan-member-invitation", 1446, "plan-member-invitation");
    }

    public static p6r0 x4() {
        return G1("QUIZ_GAMEPLAY", "quiz/gameplay", 1607, "quiz");
    }

    public static final int x5(AccountType accountType) {
        switch (wag0.a[accountType.ordinal()]) {
            case 1:
            case 6:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                eg.o();
                return 0;
        }
    }

    public static p6r0 y() {
        return G1("ADD_CHILD_PLAN_MEMBER", "add-child-plan-member", 14, "add-child-plan-member");
    }

    public static p6r0 y0() {
        return G1("CHAT_LYRICS_STICKERS_PICKER", "chat/lyrics-stickers-picker", 325, "chat");
    }

    public static p6r0 y1() {
        return G1("EXTERNAL_CREDENTIALSMANAGER", "external/credentialsmanager", 536, "external");
    }

    public static p6r0 y2() {
        return G1("LOGIN_DIALOG_OFFLINE_ERROR", "login/dialog/offline-error", 949, "login");
    }

    public static p6r0 y3() {
        return G1("PLAN_OVERVIEW", "plan-overview", 1447, "plan-overview");
    }

    public static p6r0 y4() {
        return G1("QUIZ_QUESTION_SOURCES", "quiz/question-sources", 1608, "quiz");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[PHI: r2
      0x0023: PHI (r2v1 int) = (r2v0 int), (r2v2 int), (r2v3 int) binds: [B:5:0x0012, B:7:0x0015, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public static final l6t y5(DeleteAction deleteAction) {
        int i = wag0.b[deleteAction.getState().ordinal()];
        int i2 = 1;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i == 4) {
                        i2 = i3;
                    } else if (i != 5) {
                        eg.o();
                        return null;
                    }
                } else {
                    i2 = i3;
                }
            } else {
                i2 = i3;
            }
        }
        return new l6t(i2);
    }

    public static p6r0 z() {
        return G1("ADD_ON_MANAGEMENT", "add-on-management", 16, "add-on-management");
    }

    public static p6r0 z0() {
        return G1("CHAT_MEMBERS", "chat/members", 326, "chat");
    }

    public static p6r0 z1() {
        return G1("EXTERNAL_FACEBOOK", "external/facebook", 537, "external");
    }

    public static p6r0 z2() {
        return G1("LOGIN_DIALOG_PASSKEY_LOGIN_FAILED", "login/dialog/passkey-login-failed", 950, "login");
    }

    public static p6r0 z3() {
        return G1("PLAYBACK_TIMEOUT", "playback-timeout", 1448, "playback-timeout");
    }

    public static p6r0 z4() {
        return G1("QUIZ_RECOMMENDATIONS", "quiz/recommendations", 1609, "quiz");
    }

    public static final j8t z5(GetDeleteManagedAccountViewResponse getDeleteManagedAccountViewResponse) {
        t8t t8tVar;
        int iX5 = x5(getDeleteManagedAccountViewResponse.getAccountType());
        if (getDeleteManagedAccountViewResponse.hasPlanDetails()) {
            DeletePlanDetails planDetails = getDeleteManagedAccountViewResponse.getPlanDetails();
            t8tVar = new t8t(planDetails.getPlanName(), planDetails.getIsExpiring());
        } else {
            t8tVar = null;
        }
        return new j8t(iX5, t8tVar);
    }
}
