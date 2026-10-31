package p;

import android.os.Bundle;
import com.spotify.player.model.SleepTimer;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ryh0 {
    public final Boolean A;
    public final String B;
    public final String C;
    public final String D;
    public final List E;
    public final Set F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final Boolean j;
    public final String k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f76p;
    public final Boolean q;
    public final String r;
    public final String s;
    public final String t;
    public final SleepTimer u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final Boolean y;
    public final Boolean z;

    public ryh0(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, String str8, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str9, String str10, String str11, SleepTimer sleepTimer, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, String str12, String str13, String str14, List list, Set set, String str15, String str16, String str17) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = num;
        this.j = bool;
        this.k = str8;
        this.l = bool2;
        this.m = bool3;
        this.n = bool4;
        this.o = bool5;
        this.f76p = bool6;
        this.q = bool7;
        this.r = str9;
        this.s = str10;
        this.t = str11;
        this.u = sleepTimer;
        this.v = bool8;
        this.w = bool9;
        this.x = bool10;
        this.y = bool11;
        this.z = bool12;
        this.A = bool13;
        this.B = str12;
        this.C = str13;
        this.D = str14;
        this.E = list;
        this.F = set;
        this.G = str15;
        this.H = str16;
        this.I = str17;
    }

    public static ryh0 a(ryh0 ryh0Var, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, String str8, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str9, String str10, String str11, SleepTimer sleepTimer, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, String str12, String str13, String str14, b380 b380Var, Set set, String str15, String str16, String str17, int i, int i2) {
        boolean z2 = (i & 1) != 0 ? ryh0Var.a : z;
        return new ryh0(z2, (i & 2) != 0 ? ryh0Var.b : str, (i & 4) != 0 ? ryh0Var.c : str2, (i & 8) != 0 ? ryh0Var.d : str3, (i & 16) != 0 ? ryh0Var.e : str4, (i & 32) != 0 ? ryh0Var.f : str5, (i & 64) != 0 ? ryh0Var.g : str6, (i & 128) != 0 ? ryh0Var.h : str7, (i & 256) != 0 ? ryh0Var.i : num, (i & 512) != 0 ? ryh0Var.j : bool, (i & 1024) != 0 ? ryh0Var.k : str8, (i & 2048) != 0 ? ryh0Var.l : bool2, (i & 4096) != 0 ? ryh0Var.m : bool3, (i & 8192) != 0 ? ryh0Var.n : bool4, (i & 16384) != 0 ? ryh0Var.o : bool5, (i & 32768) != 0 ? ryh0Var.f76p : bool6, (i & 65536) != 0 ? ryh0Var.q : bool7, (i & 131072) != 0 ? ryh0Var.r : str9, (i & 262144) != 0 ? ryh0Var.s : str10, (i & 524288) != 0 ? ryh0Var.t : str11, (i & 1048576) != 0 ? ryh0Var.u : sleepTimer, (i & 2097152) != 0 ? ryh0Var.v : bool8, (i & 4194304) != 0 ? ryh0Var.w : bool9, (i & 8388608) != 0 ? ryh0Var.x : bool10, (i & 16777216) != 0 ? ryh0Var.y : bool11, (i & 33554432) != 0 ? ryh0Var.z : bool12, (i & 67108864) != 0 ? ryh0Var.A : bool13, (i & 134217728) != 0 ? ryh0Var.B : str12, (i & 268435456) != 0 ? ryh0Var.C : str13, (i & 536870912) != 0 ? ryh0Var.D : str14, (i & 1073741824) != 0 ? ryh0Var.E : b380Var, (i & Integer.MIN_VALUE) != 0 ? ryh0Var.F : set, (i2 & 1) != 0 ? ryh0Var.G : str15, (i2 & 2) != 0 ? ryh0Var.H : str16, (i2 & 4) != 0 ? ryh0Var.I : str17);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        if (!this.a) {
            bundle.putBoolean("android.media.session.extra.NEED_CONNECT", true);
        }
        bundle.putBoolean("watch_app_auto_launch_enabled", true);
        Bundle bundle2 = new Bundle();
        Boolean bool = this.o;
        if (bool != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_CURATED", bool.booleanValue());
        }
        String str = this.b;
        if (str != null) {
            bundle2.putString("com.spotify.music.extra.CONTEXT_TITLE", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            bundle2.putString("com.spotify.music.extra.ALBUM_TITLE", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            bundle2.putString("com.spotify.music.extra.STATION_SUBTITLE", str3);
        }
        String str4 = this.e;
        if (str4 != null) {
            bundle2.putString("com.spotify.music.extra.CONTEXT_URI", str4);
        }
        String str5 = this.f;
        if (str5 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_URI", str5);
        }
        String str6 = this.g;
        if (str6 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_UID", str6);
        }
        String str7 = this.h;
        if (str7 != null) {
            bundle2.putString("com.spotify.music.extra.ALBUM_URI", str7);
        }
        Integer num = this.i;
        if (num != null) {
            bundle2.putInt("com.spotify.music.extra.EPISODE_PLAYBACK_SPEED", num.intValue());
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SEEK_ENABLED", bool2.booleanValue());
        }
        String str8 = this.k;
        if (str8 != null) {
            bundle2.putString("com.spotify.music.extra.CONTENT_EXPERIENCE", str8);
        }
        Boolean bool3 = this.l;
        if (bool3 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_YOUR_DJ_NARRATOR", bool3.booleanValue());
        }
        Boolean bool4 = this.m;
        if (bool4 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_AUDIOBOOK", bool4.booleanValue());
        }
        Boolean bool5 = this.n;
        if (bool5 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_AUDIOBOOK_IN_COLLECTION", bool5.booleanValue());
        }
        Boolean bool6 = this.f76p;
        if (bool6 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_RECOMMENDATION", bool6.booleanValue());
        }
        Boolean bool7 = this.q;
        if (bool7 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_EXPLICIT", bool7.booleanValue());
        }
        String str9 = this.r;
        if (str9 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_EXTRACTED_COLOR", str9);
        }
        String str10 = this.s;
        if (str10 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_IMAGE_URL", str10);
        }
        String str11 = this.t;
        if (str11 != null) {
            bundle2.putString("com.spotify.music.extra.ARTIST_URI", str11);
        }
        String str12 = this.B;
        if (str12 != null) {
            bundle2.putString("com.spotify.music.extra.REFERRER_IDENTIFIER", str12);
        }
        SleepTimer sleepTimer = this.u;
        if (sleepTimer != null) {
            if (sleepTimer instanceof SleepTimer.Timestamp) {
                bundle2.putString("com.spotify.music.extra.SLEEP_TIMER_TYPE", "com.spotify.music.extra.SLEEP_TIMER_TYPE_TIMESTAMP");
                bundle2.putLong("com.spotify.music.extra.SLEEP_TIMER_TIMESTAMP_VALUE", ((SleepTimer.Timestamp) sleepTimer).timestamp);
            } else if (sleepTimer instanceof SleepTimer.EndOfTrack) {
                bundle2.putString("com.spotify.music.extra.SLEEP_TIMER_TYPE", "com.spotify.music.extra.SLEEP_TIMER_TYPE_END_OF_TRACK");
            } else if (sleepTimer instanceof SleepTimer.None) {
                bundle2.putString("com.spotify.music.extra.SLEEP_TIMER_TYPE", "com.spotify.music.extra.SLEEP_TIMER_TYPE_NONE");
            }
        }
        Boolean bool8 = this.v;
        if (bool8 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SLEEP_TIMER_CLEAR_DISALLOWED", bool8.booleanValue());
        }
        Boolean bool9 = this.w;
        if (bool9 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SLEEP_TIMER_DURATION_DISALLOWED", bool9.booleanValue());
        }
        Boolean bool10 = this.x;
        if (bool10 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SLEEP_TIMER_END_OF_TRACK_DISALLOWED", bool10.booleanValue());
        }
        Boolean bool11 = this.y;
        if (bool11 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_MIX_MODE_ACTIVE", bool11.booleanValue());
        }
        Boolean bool12 = this.z;
        if (bool12 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SHUFFLE_ACTIVE", bool12.booleanValue());
        }
        Boolean bool13 = this.A;
        if (bool13 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_ADDING_TO_QUEUE_DISALLOWED", bool13.booleanValue());
        }
        String str13 = this.C;
        if (str13 != null) {
            bundle2.putString("com.spotify.music.extra.POINTER_NPV_MODE", str13);
        }
        String str14 = this.D;
        if (str14 != null) {
            bundle2.putString("com.spotify.music.extra.POINTER_URI", str14);
        }
        List list = this.E;
        if (list != null) {
            bundle2.putString("com.spotify.music.extra.SIGNALS", o7h.y0(list, ",", null, null, null, 62));
        }
        Set set = this.F;
        if (set != null) {
            bundle2.putString("com.spotify.music.extra.DISALLOW_SIGNALS", o7h.y0(set, ",", null, null, null, 62));
        }
        String str15 = this.G;
        if (str15 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_SAVE_TRACK_URI", str15);
        }
        String str16 = this.H;
        if (str16 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_AUDIO_ASSOCIATION", str16);
        }
        String str17 = this.I;
        if (str17 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_IS_MUSIC_VIDEO", str17);
        }
        bundle.putBundle("wear_media_bundle", bundle2);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryh0)) {
            return false;
        }
        ryh0 ryh0Var = (ryh0) obj;
        return this.a == ryh0Var.a && u890.j(this.b, ryh0Var.b) && u890.j(this.c, ryh0Var.c) && u890.j(this.d, ryh0Var.d) && u890.j(this.e, ryh0Var.e) && u890.j(this.f, ryh0Var.f) && u890.j(this.g, ryh0Var.g) && u890.j(this.h, ryh0Var.h) && u890.j(this.i, ryh0Var.i) && u890.j(this.j, ryh0Var.j) && u890.j(this.k, ryh0Var.k) && u890.j(this.l, ryh0Var.l) && u890.j(this.m, ryh0Var.m) && u890.j(this.n, ryh0Var.n) && u890.j(this.o, ryh0Var.o) && u890.j(this.f76p, ryh0Var.f76p) && u890.j(this.q, ryh0Var.q) && u890.j(this.r, ryh0Var.r) && u890.j(this.s, ryh0Var.s) && u890.j(this.t, ryh0Var.t) && u890.j(this.u, ryh0Var.u) && u890.j(this.v, ryh0Var.v) && u890.j(this.w, ryh0Var.w) && u890.j(this.x, ryh0Var.x) && u890.j(this.y, ryh0Var.y) && u890.j(this.z, ryh0Var.z) && u890.j(this.A, ryh0Var.A) && u890.j(this.B, ryh0Var.B) && u890.j(this.C, ryh0Var.C) && u890.j(this.D, ryh0Var.D) && u890.j(this.E, ryh0Var.E) && u890.j(this.F, ryh0Var.F) && u890.j(this.G, ryh0Var.G) && u890.j(this.H, ryh0Var.H) && u890.j(this.I, ryh0Var.I);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.k;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.l;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.m;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.n;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.o;
        int iHashCode15 = (iHashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f76p;
        int iHashCode16 = (iHashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.q;
        int iHashCode17 = (iHashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str9 = this.r;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.s;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.t;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        SleepTimer sleepTimer = this.u;
        int iHashCode21 = (iHashCode20 + (sleepTimer == null ? 0 : sleepTimer.hashCode())) * 31;
        Boolean bool8 = this.v;
        int iHashCode22 = (iHashCode21 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.w;
        int iHashCode23 = (iHashCode22 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.x;
        int iHashCode24 = (iHashCode23 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.y;
        int iHashCode25 = (iHashCode24 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.z;
        int iHashCode26 = (iHashCode25 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.A;
        int iHashCode27 = (iHashCode26 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        String str12 = this.B;
        int iHashCode28 = (iHashCode27 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.C;
        int iHashCode29 = (iHashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.D;
        int iHashCode30 = (iHashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List list = this.E;
        int iHashCode31 = (iHashCode30 + (list == null ? 0 : list.hashCode())) * 31;
        Set set = this.F;
        int iHashCode32 = (iHashCode31 + (set == null ? 0 : set.hashCode())) * 31;
        String str15 = this.G;
        int iHashCode33 = (iHashCode32 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.H;
        int iHashCode34 = (iHashCode33 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.I;
        return iHashCode34 + (str17 != null ? str17.hashCode() : 0);
    }

    public /* synthetic */ ryh0() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
