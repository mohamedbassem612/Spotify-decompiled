package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.CamcorderProfile;
import android.media.session.MediaSession;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$RelationsUsernameResponse;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$UsernameUser;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import com.spotify.searchview.proto.AudioEpisode;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ypa implements s0d, c290, Init, ps40, luo, Function, Predicate, rb, Function8 {
    public static ypa b;
    public final /* synthetic */ byte a;

    public ypa() {
        this.a = (byte) 14;
        hla0 hla0Var = hla0.b;
    }

    public static eyh0 f(Context context, PendingIntent pendingIntent) {
        byh0 ayh0Var;
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver");
        if (pendingIntent != null) {
            return new eyh0(context, "spotify-media-session", componentName, pendingIntent);
        }
        Logger.k("MediaSession created without a media button receiver", new Object[0]);
        MediaSession mediaSession = new MediaSession(context, "spotify-media-session");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            ayh0Var = new byh0(mediaSession);
        } else {
            ayh0Var = i >= 28 ? new ayh0(mediaSession) : new yxh0(mediaSession);
        }
        return new eyh0(context, ayh0Var);
    }

    public static long g() {
        return System.currentTimeMillis();
    }

    public static hux h(String str) {
        Object next;
        hux huxVar;
        t0z t0zVar = lfx.e;
        t0zVar.getClass();
        d7 d7Var = new d7(t0zVar, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (!((lfx) next).a.equals(str));
        lfx lfxVar = (lfx) next;
        return (lfxVar == null || (huxVar = lfxVar.b) == null) ? ilx.c : huxVar;
    }

    public static ypa i() {
        ypa ypaVar = b;
        if (ypaVar != null) {
            return ypaVar;
        }
        ypa ypaVar2 = new ypa((byte) 27, false);
        b = ypaVar2;
        return ypaVar2;
    }

    public static fvt0 l(y570 y570Var, y570 y570Var2) {
        String strN = yto.n(y570Var);
        String str = y570Var.n().a.a;
        String str2 = y570Var.n().a.b;
        String str3 = y570Var2 != null ? y570Var2.n().a.a : null;
        String str4 = y570Var.n().a.d;
        if (strN == null) {
            strN = "";
        }
        String str5 = strN;
        ld70 ld70Var = y570Var.k().a.c;
        dd70 dd70VarK = y570Var.k();
        ld70 ld70Var2 = ld70Var == null ? dd70VarK.a.d : dd70VarK.a.c;
        return new fvt0(0, "", str, str2, str3, str4, str5, ld70Var2 != null ? ld70Var2.a.c : null);
    }

    public static u800 m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new u800(layoutInflater, viewGroup);
    }

    public static ArrayList o(re70 re70Var) {
        List<y570> listK = re70Var.k();
        if (listK.size() == 1 && !((y570) listK.get(0)).s().isEmpty()) {
            y570 y570Var = (y570) listK.get(0);
            ArrayList arrayList = new ArrayList(y570Var.s().size());
            for (y570 y570Var2 : y570Var.s()) {
                if (yto.n(y570Var2) != null) {
                    arrayList.add(new r2k(y570Var2.a(), y570Var2.n().a.a, (String) null, l(y570Var2, null)));
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(re70Var.k().size());
        for (y570 y570Var3 : listK) {
            if (!y570Var3.s().isEmpty()) {
                ArrayList arrayList3 = new ArrayList(y570Var3.s().size());
                for (y570 y570Var4 : y570Var3.s()) {
                    if (yto.n(y570Var4) != null) {
                        arrayList3.add(l(y570Var4, y570Var3));
                    }
                }
                arrayList2.add(new y9b1(y570Var3.a(), y570Var3.n().a.a, arrayList3));
            } else if (yto.n(y570Var3) != null) {
                arrayList2.add(new r2k(y570Var3.a(), y570Var3.n().a.a, (String) null, l(y570Var3, null)));
            }
        }
        return arrayList2;
    }

    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public boolean accept(Object obj) {
        return true;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 15:
                return ((Boolean) obj).booleanValue() ? zfe0.a : zfe0.b;
            case 18:
                return skp0.a;
            default:
                BlockedlistResponse$RelationsUsernameResponse blockedlistResponse$RelationsUsernameResponse = (BlockedlistResponse$RelationsUsernameResponse) obj;
                String nextPageToken = blockedlistResponse$RelationsUsernameResponse.getNextPageToken();
                nextPageToken.getClass();
                String str = nextPageToken.length() > 0 ? nextPageToken : null;
                h290<BlockedlistResponse$UsernameUser> h290VarO = blockedlistResponse$RelationsUsernameResponse.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (BlockedlistResponse$UsernameUser blockedlistResponse$UsernameUser : h290VarO) {
                    Set set = s4b1.f;
                    String strZ = uic.C(blockedlistResponse$UsernameUser.getUsername(), (String) null).z();
                    strZ.getClass();
                    arrayList.add(new obx0(ebx0.a, strZ, (String) null, (String) null, (String) null, (q730) null, (String) null, 4092));
                }
                return new j8x0(3, arrayList, str, str == null, 104);
        }
    }

    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        PlayerState playerState = (PlayerState) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        Map map = (Map) obj4;
        boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
        md2 md2Var = (md2) obj7;
        return new e910(playerState, zBooleanValue, zBooleanValue2, y7y0.L(map), rh11.c(map), ((Map) obj5).containsValue(Boolean.TRUE), zBooleanValue3, false, md2Var.a, md2Var.b, (px3) obj8);
    }

    public boolean c(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public Object convert(int i) {
        wld wldVar;
        if (i != 0) {
            wldVar = i != 1 ? null : wld.CAPABILITY_WEB_INTERACTION_V1;
        } else {
            wldVar = wld.CAPABILITY_UNKNOWN;
        }
        return wldVar == null ? wld.UNRECOGNIZED : wldVar;
    }

    public po40 d() {
        return new po40("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", hqq0.n0(), hqq0.n0(), true, true, w7x.a, AudioEpisode.SHOW_URI_FIELD_NUMBER);
    }

    public Iterable e(Object obj) {
        return (Iterable) hla0.b.get((tka0) obj);
    }

    public First e0(Object obj) {
        return First.b((oll) obj);
    }

    public long n(long j) {
        return -1L;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 19:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (playerState.isPlaying() && contextTrack != null && l4o1.P(contextTrack)) {
                    String str = (String) contextTrack.metadata().get("media.external_url");
                    if (str == null) {
                        str = "";
                    }
                    if (!ihc1.y0(str) && playerState.playbackId().c()) {
                        return true;
                    }
                }
                return false;
            default:
                return dp01.e((RecentlyPlayedResponse) obj);
        }
    }

    public /* synthetic */ ypa(byte b2, boolean z) {
        this.a = b2;
    }

    public ypa(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
    }
}
