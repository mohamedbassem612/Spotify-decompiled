package p;

import android.util.Base64;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.familyviewservice.v1.GetAddChildToPlanPageResponse;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zjp1 implements Function, Predicate {
    public static final zjp1 c;
    public static final zjp1 d;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new zjp1("IEEE_P1363", b);
        d = new zjp1("DER", b);
    }

    public /* synthetic */ zjp1(byte b, Object obj, String str) {
        this.a = b;
        this.b = str;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 1:
                li8 li8Var = (mi8) obj;
                if (li8Var instanceof ki8) {
                    return ewe0.b;
                }
                if (li8Var instanceof li8) {
                    return new fwe0(new hwe0(str, li8Var.a.c));
                }
                eg.o();
                return null;
            case 2:
                return ((Boolean) obj).booleanValue() ? new iio(str) : gio.a;
            case 3:
                return Boolean.valueOf(((tc4) obj).a.contains(Base64.encodeToString(gto1.t(str.getBytes(nne.a)), 2)));
            case 4:
                GetAddChildToPlanPageResponse getAddChildToPlanPageResponse = (GetAddChildToPlanPageResponse) obj;
                return new fc1(this.b, getAddChildToPlanPageResponse.o(), new y0x0(getAddChildToPlanPageResponse.p().getColor().getValue(), getAddChildToPlanPageResponse.p().getDisplayName(), getAddChildToPlanPageResponse.p().getImageUrl()), getAddChildToPlanPageResponse.n().getTitle(), getAddChildToPlanPageResponse.n().getItemsList(), getAddChildToPlanPageResponse.q().getTitle(), getAddChildToPlanPageResponse.q().getItemsList());
            case 5:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused() && o4p1.o(playerState).equals(str));
            case 6:
                vnd0 vnd0Var = (vnd0) obj;
                Context.Builder builderPages = Context.builder("spotify:playlist:".concat(str)).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.builder("spotify:live:".concat(str)).metadata(sqg0.J(new mmr0[]{new mmr0("title", vnd0Var.a), new mmr0("media.type", "video"), new mmr0("is_backgroundable", "true"), new mmr0("media.live", "true"), new mmr0("media.manifest", f4i1.f("[{\"url\": \"", nhc1.W(nhc1.W(vnd0Var.b, "{eventid}", str), "{format}", ""), "\",\"mimeType\": \"video/mp4\",\"bitrate\": 216000}]"))})).build())).build()));
                Set setSingleton = Collections.singleton("live");
                return builderPages.restrictions(Restrictions.builder().disallowPeekingPrevReasons(setSingleton).disallowPeekingNextReasons(setSingleton).disallowSkippingPrevReasons(setSingleton).disallowSkippingNextReasons(setSingleton).disallowSeekingReasons(setSingleton).build()).build();
            case 7:
                ez00 ez00Var = ((uv00) obj).a(jo70.class, str).b;
                return ez00Var != null ? Maybe.e(ez00Var) : MaybeEmpty.a;
            case 8:
                return ((uv00) obj).a(jo70.class, str);
            default:
                return ((uv00) obj).a(jo70.class, str);
        }
    }

    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (!playerState.isPlaying() || playerState.isPaused()) {
            return false;
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return u890.j(contextTrack != null ? l4o1.b0(contextTrack) : null, this.b);
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zjp1(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
