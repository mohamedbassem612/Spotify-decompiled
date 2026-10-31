package p;

import com.spotify.player.model.PlayerState;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class qq5 extends cv5 {
    public static final pq5 Companion = new pq5();
    public static final qq5 m = new qq5("", "", null, null, "no_context", null, null, null, null, null, null);
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;

    /* JADX WARN: Illegal instructions before constructor call */
    public qq5(iun0 iun0Var, PlayerState playerState) {
        nq5 nq5Var = cv5.Companion;
        String strContextUri = playerState.contextUri();
        nq5Var.getClass();
        String strA = nq5.a(strContextUri);
        String strA2 = nq5.a(playerState.contextUri());
        String str = iun0Var.b;
        String str2 = iun0Var.a;
        Companion.getClass();
        dzy.c.getClass();
        this(strA, strA2, str, str2, gtv0.c(playerState).name().toLowerCase(Locale.US), Boolean.valueOf(playerState.options().repeatingTrack()), Boolean.valueOf(playerState.options().repeatingContext()), Boolean.valueOf(playerState.options().shufflingContext()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq5)) {
            return false;
        }
        qq5 qq5Var = (qq5) obj;
        return u890.j(this.b, qq5Var.b) && u890.j(this.c, qq5Var.c) && u890.j(this.d, qq5Var.d) && u890.j(this.e, qq5Var.e) && u890.j(this.f, qq5Var.f) && u890.j(this.g, qq5Var.g) && u890.j(this.h, qq5Var.h) && u890.j(this.i, qq5Var.i) && u890.j(this.j, qq5Var.j) && u890.j(this.k, qq5Var.k) && u890.j(this.l, qq5Var.l);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.k;
        int iHashCode10 = (iHashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.l;
        return iHashCode10 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public qq5(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bool;
        this.h = bool2;
        this.i = bool3;
        this.j = bool4;
        this.k = bool5;
        this.l = bool6;
    }
}
