package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gbm1 extends hab0 implements iu30 {
    public static final gbm1 N0;
    public static final gbm1 O0;
    public static final gbm1 P0;
    public static final gbm1 Q0;
    public static final gbm1 R0;
    public static final gbm1 S0;
    public static final gbm1 T0;
    public static final gbm1 U0;
    public static final gbm1 V0;
    public static final gbm1 W0;
    public static final gbm1 X;
    public static final gbm1 X0;
    public static final gbm1 Y;
    public static final gbm1 Y0;
    public static final gbm1 Z;
    public static final gbm1 Z0;
    public static final gbm1 a1;
    public static final gbm1 b;
    public static final gbm1 b1;
    public static final gbm1 c;
    public static final gbm1 c1;
    public static final gbm1 d;
    public static final gbm1 d1;
    public static final gbm1 e;
    public static final gbm1 e1;
    public static final gbm1 f;
    public static final gbm1 g;
    public static final gbm1 h;
    public static final gbm1 i;
    public static final gbm1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gbm1(i2, (byte) 0);
        c = new gbm1(i2, (byte) 1);
        d = new gbm1(i2, (byte) 2);
        e = new gbm1(i2, (byte) 3);
        f = new gbm1(i2, (byte) 4);
        g = new gbm1(i2, (byte) 5);
        h = new gbm1(i2, (byte) 6);
        i = new gbm1(i2, (byte) 7);
        t = new gbm1(i2, (byte) 8);
        X = new gbm1(i2, (byte) 9);
        Y = new gbm1(i2, (byte) 10);
        Z = new gbm1(i2, (byte) 11);
        N0 = new gbm1(i2, (byte) 12);
        O0 = new gbm1(i2, (byte) 13);
        P0 = new gbm1(i2, (byte) 14);
        Q0 = new gbm1(i2, (byte) 15);
        R0 = new gbm1(i2, (byte) 16);
        S0 = new gbm1(i2, (byte) 17);
        T0 = new gbm1(i2, (byte) 18);
        U0 = new gbm1(i2, (byte) 19);
        V0 = new gbm1(i2, (byte) 20);
        W0 = new gbm1(i2, (byte) 21);
        X0 = new gbm1(i2, (byte) 22);
        Y0 = new gbm1(i2, (byte) 23);
        Z0 = new gbm1(i2, (byte) 24);
        a1 = new gbm1(i2, (byte) 25);
        b1 = new gbm1(i2, (byte) 26);
        c1 = new gbm1(i2, (byte) 27);
        d1 = new gbm1(i2, (byte) 28);
        e1 = new gbm1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbm1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        CharSequence charSequence;
        Map map;
        String str;
        byte b2 = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new abm1(((cxc0) obj).f);
            case 1:
                vhc1 vhc1Var = (vhc1) obj;
                if (vhc1Var instanceof thc1) {
                    Set set = s4b1.f;
                    thc1 thc1Var = (thc1) vhc1Var;
                    Map map2 = thc1Var.j;
                    if (uic.x(thc1Var.d).c == blc0.ti && (((charSequence = (CharSequence) map2.get("playCount")) != null && !ihc1.y0(charSequence)) || u890.j(map2.get("isFirstStreamedTrack"), "true"))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                return ((o3m0) obj).m();
            case 3:
                return ((o3m0) obj).m();
            case 4:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("take_screenshot", 1, b7xVar), ((o3m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 5:
                return rih1Var;
            case 6:
                b261.c((e261) obj);
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                ((kd31) obj).f(true);
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                b261.c((e261) obj);
                return rih1Var;
            case 11:
                return ((Throwable) obj).getCause();
            case 12:
                g271 g271Var = (g271) obj;
                u771 u771Var = g271Var.a;
                return new tfm1(g271Var.b, u771Var.a.b, g271Var.d, u771Var.b());
            case 13:
                tfm1 tfm1Var = (tfm1) obj;
                return new ufm1(tfm1Var.d, tfm1Var.c, tfm1Var.b, tfm1Var.a);
            case 14:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 15:
                vhc1 vhc1Var2 = (vhc1) obj;
                thc1 thc1Var2 = vhc1Var2 instanceof thc1 ? (thc1) vhc1Var2 : null;
                if (thc1Var2 != null && (map = thc1Var2.j) != null && (str = (String) map.get("recsplanation")) != null && (!ihc1.y0(str))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                return (smm1) ((kb61) obj).I().b.getValue();
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", aom1.class);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return pom1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                b261.d((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.d((e261) obj);
                return rih1Var;
            case 22:
                return Integer.valueOf(((q5t0) obj).X());
            case 23:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                return new mmr0(contextTrack != null ? contextTrack.uri() : null, Boolean.valueOf(playerState.isPaused()));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                PlayerState playerState2 = (PlayerState) obj;
                return new qe30(2131959891, new Object[]{poo1.H(playerState2, "album_title"), poo1.H(playerState2, "artist_name")});
            case 25:
                return new ugc1(poo1.H((PlayerState) obj, "artist_name"));
            case 26:
                PlayerState playerState3 = (PlayerState) obj;
                String strJ = poo1.J(playerState3);
                return (strJ == null || strJ.length() == 0) ? poo1.z(playerState3) : strJ;
            case 27:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            default:
                return new loa0((String) obj);
        }
    }
}
