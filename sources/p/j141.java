package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.datasource.HttpDataSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickActionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ImageStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.AccessoryImage;
import com.spotify.pendragon.v1.proto.Capping;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j141 implements iu30 {
    public final /* synthetic */ byte a;
    public static final j141 b = new j141((byte) 0);
    public static final j141 c = new j141((byte) 1);
    public static final j141 d = new j141((byte) 2);
    public static final j141 e = new j141((byte) 3);
    public static final j141 f = new j141((byte) 4);
    public static final j141 g = new j141((byte) 5);
    public static final j141 h = new j141((byte) 6);
    public static final j141 i = new j141((byte) 7);
    public static final j141 t = new j141((byte) 8);
    public static final j141 X = new j141((byte) 9);
    public static final j141 Y = new j141((byte) 10);
    public static final j141 Z = new j141((byte) 11);
    public static final j141 N0 = new j141((byte) 12);
    public static final j141 O0 = new j141((byte) 13);
    public static final j141 P0 = new j141((byte) 14);
    public static final j141 Q0 = new j141((byte) 15);
    public static final j141 R0 = new j141((byte) 16);
    public static final j141 S0 = new j141((byte) 17);
    public static final j141 T0 = new j141((byte) 18);
    public static final j141 U0 = new j141((byte) 19);
    public static final j141 V0 = new j141((byte) 20);

    public j141(jit jitVar) {
        this.a = (byte) 21;
    }

    public static x59 a(h59 h59Var) {
        int i2;
        ldr0 ldr0Var = h59Var.a;
        if (ldr0Var.equals(zdr0.b)) {
            return new w59();
        }
        if (ldr0Var instanceof ldr0) {
            woa1 woa1Var = ldr0Var.b.c;
            woa1Var.getClass();
            return new t59(2131960662, woa1Var.e, true, false);
        }
        if (ldr0Var.equals(odr0.b)) {
            return new u59();
        }
        if (!(ldr0Var instanceof sdr0)) {
            if (!(ldr0Var instanceof kdr0)) {
                eg.o();
                return null;
            }
            woa1 woa1Var2 = ((kdr0) ldr0Var).b.c;
            woa1Var2.getClass();
            return new t59(null, woa1Var2.e, false, true);
        }
        int iC = l1d.C(((sdr0) ldr0Var).b);
        if (iC == 0) {
            i2 = 2131960682;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            i2 = 2131960690;
        }
        gkz gkzVar = new gkz(u49.a);
        o49 o49Var = o49.a;
        return new v59(new hkz(i2, o49Var, gkzVar, new gkz(o49Var)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    public final Object invoke(Object obj) throws MessageParsingException {
        jyc jycVarB;
        String strN;
        Enum r7;
        byte b2 = 8;
        Enum r2 = null;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        z = false;
        z = false;
        boolean z4 = false;
        z = false;
        boolean z5 = false;
        z = false;
        switch (this.a) {
            case 0:
                Class cls = (Class) obj;
                cls.getClass();
                return bb11.b(cls);
            case 1:
                String str = (String) obj;
                return str.length() > 1 ? cy30.n("L", str, ';') : str;
            case 2:
                rob0 rob0VarL = ((jyc) obj).L();
                rob0VarL.getClass();
                return rob0VarL.getType();
            case 3:
                a8b0 returnType = ((jyc) obj).getReturnType();
                returnType.getClass();
                return returnType;
            case 4:
                return Boolean.valueOf(((gmh1) obj) instanceof nwz0);
            case 5:
                jfg jfgVarS = ((gmh1) obj).t0().s();
                if (jfgVarS == null) {
                    return Boolean.FALSE;
                }
                ajn0 name = jfgVarS.getName();
                kf30 kf30Var = j8a0.f;
                if (u890.j(name, kf30Var.a.g()) && u890.j(kht.c(jfgVarS), kf30Var)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return Boolean.valueOf(zzo1.j(kht.i((jyc) obj)));
            case 7:
                int i2 = ccc.l;
                xw81 xw81Var = (xw81) ((jyc) obj);
                if (g6b0.A(xw81Var) && kht.b(xw81Var, new p5(xw81Var, b2)) != null) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 8:
                jyc jycVar = (jyc) obj;
                if (g6b0.A(jycVar)) {
                    int i3 = dcc.l;
                    if (koa1.e.contains(jycVar.getName()) && (jycVarB = kht.b(jycVar, ye3.f)) != null && (strN = h0p1.n(jycVarB)) != null) {
                        if (!koa1.b.contains(strN)) {
                        }
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 9:
                return Boolean.valueOf(obj instanceof TextView);
            case 10:
                return Integer.valueOf(((rgy0) obj).d.size());
            case 11:
                return (xw81) obj;
            case 12:
                return (tdy0) obj;
            case 13:
                return (hyc) obj;
            case 14:
                return Boolean.valueOf(((n9r) obj) instanceof hyc);
            case 15:
                return Boolean.valueOf(!(((n9r) obj) instanceof pjl));
            case 16:
                return new i46(((hyc) ((n9r) obj)).getTypeParameters(), (byte) 1);
            case 17:
                jfg jfgVarS2 = ((gmh1) obj).t0().s();
                if (jfgVarS2 != null && (jfgVarS2 instanceof y0h1) && (((y0h1) jfgVarS2).k() instanceof jit)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 18:
                jfg jfgVarS3 = ((gmh1) obj).t0().s();
                if (jfgVarS3 != null && ((jfgVarS3 instanceof jit) || (jfgVarS3 instanceof y0h1))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 19:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new d7(viewGroup, (byte) 8);
                }
                return null;
            case 20:
                return Boolean.valueOf(obj instanceof HttpDataSource.InvalidResponseCodeException);
            case 21:
                ((g8b0) obj).getClass();
                return null;
            case 22:
                int iOrdinal = ((mi) obj).ordinal();
                if (iOrdinal == 1) {
                    return AccessoryContentSize.LARGE;
                }
                if (iOrdinal == 2) {
                    return AccessoryContentSize.MEDIUM;
                }
                if (iOrdinal != 3) {
                    return iOrdinal != 4 ? AccessoryContentSize.UNKNOWN : AccessoryContentSize.XSMALL;
                }
                return AccessoryContentSize.SMALL;
            case 23:
                AccessoryImage accessoryImage = (AccessoryImage) obj;
                String imageUrl = accessoryImage.getImageUrl();
                String strName = accessoryImage.p().name();
                Enum r0 = ImageStyle.UNKNOWN_IMAGE_STYLE;
                for (Enum r5 : ImageStyle.values()) {
                    if (u890.j(r5.name(), strName)) {
                        r2 = r5;
                        if (r2 != null) {
                            r0 = r2;
                        }
                        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage(imageUrl, r0);
                    }
                }
                if (r2 != null) {
                    r0 = r2;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage(imageUrl, r0);
            case 24:
                return a((h59) obj);
            case 25:
                return new n3a(((a120) obj).a);
            case 26:
                int iOrdinal2 = ((yec) obj).ordinal();
                if (iOrdinal2 != 1) {
                    return iOrdinal2 != 2 ? ButtonIconAlignment.LEADING : ButtonIconAlignment.TRAILING;
                }
                return ButtonIconAlignment.LEADING;
            case 27:
                d290 d290VarP = ((Capping) obj).p();
                ArrayList arrayList = new ArrayList(q7h.U(d290VarP, 10));
                Iterator it = d290VarP.iterator();
                while (it.hasNext()) {
                    String strName2 = ((wd00) it.next()).name();
                    Enum r1 = EventType.EVENT_TYPE_UNKNOWN;
                    Enum[] enumArrValues = EventType.values();
                    int length = enumArrValues.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            r7 = enumArrValues[i4];
                            if (!u890.j(r7.name(), strName2)) {
                                i4++;
                            }
                        } else {
                            r7 = null;
                        }
                    }
                    if (r7 != null) {
                        r1 = r7;
                    }
                    arrayList.add(r1);
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Capping(arrayList);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                switch (((pgg) obj).ordinal()) {
                    case 0:
                    case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                        throw new MessageParsingException(g4j0.c);
                    case 1:
                        return ClickActionType.ADD_TO_QUEUE;
                    case 2:
                        return ClickActionType.ADD_TO_YOUR_EPISODES;
                    case 3:
                        return ClickActionType.PRESENT_SSO_EMAIL_COLLECTION;
                    case 4:
                        return ClickActionType.DOWNLOAD_ENTITY;
                    case 5:
                        return ClickActionType.CREATE_PLAYLIST;
                    case 6:
                        return ClickActionType.ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2;
                    case 7:
                        return ClickActionType.EMAIL_VERIFICATION;
                    case 8:
                        return ClickActionType.OPT_OUT_BRAND_LIFT;
                    case 9:
                        return ClickActionType.OPT_IN;
                    case 10:
                        return ClickActionType.OPT_OUT;
                    case 11:
                        return ClickActionType.SELECT_OPTION;
                    case 12:
                        return ClickActionType.OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE;
                    case 13:
                        return ClickActionType.SHARE_ENTITY;
                    case 14:
                        return ClickActionType.ADD_TO_PLAYLIST;
                    case 15:
                        return ClickActionType.PDP_URL;
                    case 16:
                        return ClickActionType.DISMISS;
                    case 17:
                        return ClickActionType.SAVE_ENTITY;
                    case 18:
                        return ClickActionType.SHARE_CONTENT;
                    case 19:
                        return ClickActionType.INTERNAL_WEBVIEW;
                    case 20:
                        return ClickActionType.TOGGLE_NOTIFICATION_PREFERENCE;
                    case 21:
                        return ClickActionType.OPEN_PUSH_PERMISSIONS_DIALOG;
                    case 22:
                        return ClickActionType.URL;
                    case 23:
                        return ClickActionType.EXTERNAL_URL;
                    case 24:
                        return ClickActionType.OPEN_ADS_TRACKING_PERMISSIONS_DIALOG;
                    case 25:
                        return ClickActionType.START_PLAYBACK;
                    case 26:
                        return ClickActionType.SAVE_AND_NAVIGATE;
                    case 27:
                        return ClickActionType.IAP;
                    default:
                        eg.o();
                        return null;
                }
            default:
                return vql.a[((uql) obj).ordinal()] == 1 ? ContentAlignment.BOTTOM : ContentAlignment.CENTER;
        }
    }

    public /* synthetic */ j141(byte b2) {
        this.a = b2;
    }
}
