package p;

import android.webkit.WebView;
import com.spotify.settings.esperanto.proto.SettingsOuterClass;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zxm extends hab0 implements iu30 {
    public static final zxm N0;
    public static final zxm O0;
    public static final zxm P0;
    public static final zxm Q0;
    public static final zxm R0;
    public static final zxm S0;
    public static final zxm T0;
    public static final zxm U0;
    public static final zxm V0;
    public static final zxm W0;
    public static final zxm X;
    public static final zxm X0;
    public static final zxm Y;
    public static final zxm Y0;
    public static final zxm Z;
    public static final zxm Z0;
    public static final zxm a1;
    public static final zxm b;
    public static final zxm b1;
    public static final zxm c;
    public static final zxm c1;
    public static final zxm d;
    public static final zxm d1;
    public static final zxm e;
    public static final zxm e1;
    public static final zxm f;
    public static final zxm g;
    public static final zxm h;
    public static final zxm i;
    public static final zxm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zxm(i2, (byte) 0);
        c = new zxm(i2, (byte) 1);
        d = new zxm(i2, (byte) 2);
        e = new zxm(i2, (byte) 3);
        f = new zxm(i2, (byte) 4);
        g = new zxm(i2, (byte) 5);
        h = new zxm(i2, (byte) 6);
        i = new zxm(i2, (byte) 7);
        t = new zxm(i2, (byte) 8);
        X = new zxm(i2, (byte) 9);
        Y = new zxm(i2, (byte) 10);
        Z = new zxm(i2, (byte) 11);
        N0 = new zxm(i2, (byte) 12);
        O0 = new zxm(i2, (byte) 13);
        P0 = new zxm(i2, (byte) 14);
        Q0 = new zxm(i2, (byte) 15);
        R0 = new zxm(i2, (byte) 16);
        S0 = new zxm(i2, (byte) 17);
        T0 = new zxm(i2, (byte) 18);
        U0 = new zxm(i2, (byte) 19);
        V0 = new zxm(i2, (byte) 20);
        W0 = new zxm(i2, (byte) 21);
        X0 = new zxm(i2, (byte) 22);
        Y0 = new zxm(i2, (byte) 23);
        Z0 = new zxm(i2, (byte) 24);
        a1 = new zxm(i2, (byte) 25);
        b1 = new zxm(i2, (byte) 26);
        c1 = new zxm(i2, (byte) 27);
        d1 = new zxm(i2, (byte) 28);
        e1 = new zxm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zxm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 2:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 4:
                return Boolean.valueOf(obj instanceof f7a1);
            case 5:
                if (obj != null) {
                    return (f7a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnacredits.SongDNACredits");
                return null;
            case 6:
                return Boolean.valueOf(obj instanceof jo70);
            case 7:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 8:
                return Boolean.valueOf(obj instanceof xkk1);
            case 9:
                return (k1r) obj;
            case 10:
                return Boolean.valueOf(obj instanceof xkk1);
            case 11:
                return (k1r) obj;
            case 12:
                String str = ((sxm) obj).b;
                if (str != null) {
                    return str;
                }
                hhg1.n("Required value was null.");
                return null;
            case 13:
                return ((sxm) obj).a;
            case 14:
                return ((sxm) obj).a;
            case 15:
                return ((sxm) obj).b;
            case 16:
                return new qvc0(l1d.m("spotify:list:popular-release-segments:artist_", blo1.l(((fym) obj).a)), (c3d0) null, Collections.singleton(yqc0.a), (mqz0) null, 10);
            case 17:
                return (List) obj;
            case 18:
                return Boolean.valueOf(obj instanceof List);
            case 19:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                return o7h.y0(p7h.M(new String[]{(String) entry.getKey(), String.valueOf(((Number) entry.getValue()).longValue())}), "\t", (String) null, (String) null, (iu30) null, 62);
            case 21:
                wfb0 wfb0Var = (wfb0) obj;
                String strReplace = wfb0Var.a.replace('\n', ' ').replace('\t', ' ');
                String str2 = wfb0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                return o7h.y0(p7h.M(new String[]{wfb0Var.c, str2.replace('\n', ' ').replace('\t', ' '), wfb0Var.d ? "1" : "0", strReplace}), "\t", (String) null, (String) null, (iu30) null, 62);
            case 22:
                Map.Entry entry2 = (Map.Entry) obj;
                return o7h.y0(o7h.N0((Set) entry2.getValue(), Collections.singletonList((String) entry2.getKey())), "\t", (String) null, (String) null, (iu30) null, 62);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                b261.c((e261) obj);
                return rih1Var;
            case 24:
                ((WebView) obj).setOnScrollChangeListener(null);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((WebView) obj).loadUrl("https://www.spotify.com/us/legal/managed-accounts-coppa-notice/plain/");
                return rih1Var;
            case 26:
                return null;
            case 27:
                return Integer.valueOf(((SettingsOuterClass.SettingsState) obj).w());
            case 28:
                return Integer.valueOf(((SettingsOuterClass.SettingsState) obj).H());
            default:
                return Integer.valueOf(((SettingsOuterClass.SettingsState) obj).G());
        }
    }
}
