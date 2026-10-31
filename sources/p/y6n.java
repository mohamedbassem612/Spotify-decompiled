package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.settings.esperanto.proto.SettingsOuterClass;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y6n extends hab0 implements iu30 {
    public static final y6n N0;
    public static final y6n O0;
    public static final y6n P0;
    public static final y6n Q0;
    public static final y6n R0;
    public static final y6n S0;
    public static final y6n T0;
    public static final y6n U0;
    public static final y6n V0;
    public static final y6n W0;
    public static final y6n X;
    public static final y6n X0;
    public static final y6n Y;
    public static final y6n Y0;
    public static final y6n Z;
    public static final y6n Z0;
    public static final y6n a1;
    public static final y6n b;
    public static final y6n b1;
    public static final y6n c;
    public static final y6n c1;
    public static final y6n d;
    public static final y6n d1;
    public static final y6n e;
    public static final y6n e1;
    public static final y6n f;
    public static final y6n g;
    public static final y6n h;
    public static final y6n i;
    public static final y6n t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new y6n(i2, (byte) 0);
        c = new y6n(i2, (byte) 1);
        d = new y6n(i2, (byte) 2);
        e = new y6n(i2, (byte) 3);
        f = new y6n(i2, (byte) 4);
        g = new y6n(i2, (byte) 5);
        h = new y6n(i2, (byte) 6);
        i = new y6n(i2, (byte) 7);
        t = new y6n(i2, (byte) 8);
        X = new y6n(i2, (byte) 9);
        Y = new y6n(i2, (byte) 10);
        Z = new y6n(i2, (byte) 11);
        N0 = new y6n(i2, (byte) 12);
        O0 = new y6n(i2, (byte) 13);
        P0 = new y6n(i2, (byte) 14);
        Q0 = new y6n(i2, (byte) 15);
        R0 = new y6n(i2, (byte) 16);
        S0 = new y6n(i2, (byte) 17);
        T0 = new y6n(i2, (byte) 18);
        U0 = new y6n(i2, (byte) 19);
        V0 = new y6n(i2, (byte) 20);
        W0 = new y6n(i2, (byte) 21);
        X0 = new y6n(i2, (byte) 22);
        Y0 = new y6n(i2, (byte) 23);
        Z0 = new y6n(i2, (byte) 24);
        a1 = new y6n(i2, (byte) 25);
        b1 = new y6n(i2, (byte) 26);
        c1 = new y6n(i2, (byte) 27);
        d1 = new y6n(i2, (byte) 28);
        e1 = new y6n(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6n(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).o());
            case 1:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).y());
            case 2:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).p());
            case 3:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).A());
            case 4:
                return Integer.valueOf(((SettingsOuterClass.SettingsState) obj).z());
            case 5:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).q());
            case 6:
                return Integer.valueOf(((SettingsOuterClass.SettingsState) obj).r());
            case 7:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).B());
            case 8:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).F());
            case 9:
                return ((SettingsOuterClass.SettingsState) obj).I();
            case 10:
                return Integer.valueOf(((SettingsOuterClass.SettingsState) obj).v());
            case 11:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).x());
            case 12:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).C());
            case 13:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).s());
            case 14:
                return Integer.valueOf(((SettingsOuterClass.SettingsState) obj).t());
            case 15:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).D());
            case 16:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).E());
            case 17:
                return Boolean.valueOf(((SettingsOuterClass.SettingsState) obj).u());
            case 18:
                return new qzk0((i3l0) obj);
            case 19:
                Parcelable parcelable = (adn) obj;
                parcelable.getClass();
                Bundle bundle = new Bundle();
                bundle.putParcelable("coverArtSnakeModel", parcelable);
                return bundle;
            case 20:
                return Boolean.valueOf(obj instanceof xkk1);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 22:
                return Boolean.valueOf(obj instanceof pjw0);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (obj != null) {
                    return (pjw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.previewplaybacktrait.PreviewPlaybackTrait");
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return (String) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return (String) obj;
            case 26:
                return new rzk0((i3l0) obj);
            case 27:
                return ((w4i1) obj).b;
            case 28:
                b261.d((e261) obj);
                return rih1.a;
            default:
                zkn zknVar = (bln) obj;
                Bundle bundle2 = new Bundle();
                if (zknVar instanceof zkn) {
                    zkn zknVar2 = zknVar;
                    bundle2.putParcelableArrayList("create_group_page_destinations", new ArrayList<>(zknVar2.b));
                    bundle2.putParcelable("create_group_page_current_user", zknVar2.i);
                    bundle2.putBoolean("create_group_page_suggested_contacts_disabled", zknVar2.j);
                    bundle2.putString("create_group_page_reserved_hierarchy_id", zknVar2.e);
                    bundle2.putString("create_group_page_request_token", zknVar2.f);
                }
                bundle2.putSerializable("create_group_page_selected_users", (HashMap) zknVar.a());
                return bundle2;
        }
    }
}
