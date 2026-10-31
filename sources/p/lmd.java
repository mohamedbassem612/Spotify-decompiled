package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lmd extends bmq0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lmd(Object obj, byte b) {
        this.b = b;
        this.c = obj;
    }

    public final void h(d441 d441Var, Object obj) {
        String str;
        byte b = this.b;
        String strB = "";
        byte[] bArrA = null;
        bArrA = null;
        bArrA = null;
        byte[] bArrA2 = null;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                k0j0 k0j0Var = (k0j0) obj;
                d441Var.K(1, k0j0Var.a);
                CappingState cappingState = k0j0Var.b;
                kmd kmdVar = (kmd) ((nmd) obj2).c.getValue();
                kmdVar.getClass();
                if (cappingState != null) {
                    try {
                        bArrA = kmdVar.a.a(CappingState.INSTANCE.serializer(), cappingState);
                    } catch (Exception e) {
                        Logger.d(l1d.m("ClientMessagingPlatform: Error encoding capping: ", e.getMessage()), new Object[0]);
                    }
                }
                if (bArrA != null) {
                    d441Var.n(bArrA, 2);
                } else {
                    d441Var.t(2);
                }
                break;
            case 1:
                ctc ctcVar = (ctc) obj;
                idd1 idd1Var = ((bbt) obj2).c;
                dhc1 dhc1Var = (dhc1) idd1Var.getValue();
                Set set = ctcVar.a;
                dhc1Var.getClass();
                d441Var.K(1, (set == null || set.isEmpty()) ? "" : dhc1Var.a.b(dhc1Var.b, set));
                dhc1 dhc1Var2 = (dhc1) idd1Var.getValue();
                Set set2 = ctcVar.b;
                dhc1Var2.getClass();
                if (set2 != null && !set2.isEmpty()) {
                    strB = dhc1Var2.a.b(dhc1Var2.b, set2);
                }
                d441Var.K(2, strB);
                d441Var.r(3, ctcVar.c);
                break;
            case 2:
                bb10 bb10Var = (bb10) obj;
                d441Var.K(1, bb10Var.a);
                xa20 xa20Var = (xa20) ((ab10) obj2).c.getValue();
                d441Var.K(2, xa20Var.a.b(xa20Var.b, bb10Var.b));
                d441Var.r(3, bb10Var.c);
                d441Var.r(4, bb10Var.d);
                break;
            case 3:
                hb10 hb10Var = (hb10) obj;
                d441Var.K(1, hb10Var.a);
                xa20 xa20Var2 = (xa20) ((gb10) obj2).c.getValue();
                d441Var.K(2, xa20Var2.a.b(xa20Var2.b, hb10Var.b));
                d441Var.r(3, hb10Var.c);
                d441Var.r(4, hb10Var.d);
                break;
            case 4:
                tj60 tj60Var = (tj60) obj;
                kh60 kh60Var = (kh60) obj2;
                d441Var.K(1, tj60Var.a);
                d441Var.K(2, tj60Var.b);
                String str2 = tj60Var.c;
                if (str2 == null) {
                    d441Var.t(3);
                } else {
                    d441Var.K(3, str2);
                }
                String str3 = tj60Var.d;
                if (str3 == null) {
                    d441Var.t(4);
                } else {
                    d441Var.K(4, str3);
                }
                String str4 = tj60Var.e;
                if (str4 == null) {
                    d441Var.t(5);
                } else {
                    d441Var.K(5, str4);
                }
                switch (l1d.C(tj60Var.f)) {
                    case 0:
                        str = "ALBUM";
                        break;
                    case 1:
                        str = "ARTIST";
                        break;
                    case 2:
                        str = "AUDIOBOOK";
                        break;
                    case 3:
                        str = "AUDIO_EPISODE";
                        break;
                    case 4:
                        str = "AUDIO_SHOW";
                        break;
                    case 5:
                        str = "GENRE";
                        break;
                    case 6:
                        str = "PLAYLIST";
                        break;
                    case 7:
                        str = "PROFILE";
                        break;
                    case 8:
                        str = "TRACK";
                        break;
                    case 9:
                        str = "AUTHOR";
                        break;
                    case 10:
                        str = "CONCERT";
                        break;
                    case 11:
                        str = "VENUE";
                        break;
                    default:
                        eg.o();
                        break;
                }
                d441Var.K(6, str);
                Boolean bool = tj60Var.g;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    d441Var.t(7);
                } else {
                    d441Var.r(7, numValueOf.intValue());
                }
                String str5 = tj60Var.h;
                if (str5 == null) {
                    d441Var.t(8);
                } else {
                    d441Var.K(8, str5);
                }
                Boolean bool2 = tj60Var.i;
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    d441Var.t(9);
                } else {
                    d441Var.r(9, numValueOf2.intValue());
                }
                Boolean bool3 = tj60Var.j;
                Integer numValueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    d441Var.t(10);
                } else {
                    d441Var.r(10, numValueOf3.intValue());
                }
                List list = tj60Var.k;
                zgc1 zgc1Var = (zgc1) kh60Var.c.getValue();
                zgc1Var.getClass();
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    strB = zgc1Var.a.b(zgc1Var.b, list);
                }
                d441Var.K(11, strB);
                d441Var.r(12, tj60Var.l);
                Boolean bool4 = tj60Var.m;
                Integer numValueOf4 = bool4 != null ? Integer.valueOf(bool4.booleanValue() ? 1 : 0) : null;
                if (numValueOf4 == null) {
                    d441Var.t(13);
                } else {
                    d441Var.r(13, numValueOf4.intValue());
                }
                Boolean bool5 = tj60Var.n;
                Integer numValueOf5 = bool5 != null ? Integer.valueOf(bool5.booleanValue() ? 1 : 0) : null;
                if (numValueOf5 != null) {
                    d441Var.r(14, numValueOf5.intValue());
                } else {
                    d441Var.t(14);
                }
                break;
            case 5:
                tug1 tug1Var = (tug1) obj;
                d441Var.K(1, tug1Var.a);
                d441Var.r(2, tug1Var.b);
                Message message = tug1Var.c;
                wxi0 wxi0Var = (wxi0) ((t6j0) obj2).c.getValue();
                wxi0Var.getClass();
                if (message != null) {
                    try {
                        bArrA2 = wxi0Var.a.a(Message.Companion.serializer(), message);
                    } catch (Exception e2) {
                        Logger.d(l1d.m("ClientMessagingPlatform: Error encoding message: ", e2.getMessage()), new Object[0]);
                    }
                }
                if (bArrA2 != null) {
                    d441Var.n(bArrA2, 3);
                } else {
                    d441Var.t(3);
                }
                break;
            case 6:
                poa1 poa1Var = (poa1) obj;
                d441Var.K(1, poa1Var.a);
                xa20 xa20Var3 = (xa20) ((ooa1) obj2).c.getValue();
                d441Var.K(2, xa20Var3.a.b(xa20Var3.b, poa1Var.b));
                d441Var.r(3, poa1Var.c);
                d441Var.r(4, poa1Var.d);
                break;
            default:
                yoa1 yoa1Var = (yoa1) obj;
                d441Var.K(1, yoa1Var.a);
                xa20 xa20Var4 = (xa20) ((xoa1) obj2).c.getValue();
                d441Var.K(2, xa20Var4.a.b(xa20Var4.b, yoa1Var.b));
                d441Var.K(3, yoa1Var.c);
                d441Var.K(4, yoa1Var.d);
                d441Var.K(5, yoa1Var.e);
                d441Var.r(6, yoa1Var.f);
                d441Var.r(7, yoa1Var.g);
                break;
        }
    }

    public final String p() {
        switch (this.b) {
            case 0:
                return "INSERT OR REPLACE INTO `message_id_and_capping` (`messageKey`,`capping`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `cachedDenylist` (`package_names`,`app_signatures`,`timestamp`) VALUES (?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `ExternalizationDisabledFilterEntity` (`id`,`paths`,`revision`,`format`) VALUES (?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `ExternalizationEnabledFilterEntity` (`id`,`paths`,`revision`,`format`) VALUES (?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `history` (`uri`,`title`,`subtitle`,`image_uri`,`video_image_uri`,`type`,`explicit`,`preview_id`,`mogef19`,`disabled`,`artist_uris`,`timestamp`,`has_video`,`is_verified`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `messages` (`trigger`,`messageId`,`message`) VALUES (?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `SpecificDisabledFilterEntity` (`id`,`paths`,`revision`,`format`) VALUES (?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `SpecificEnabledFilterEntity` (`id`,`paths`,`brand`,`model`,`deviceFormattedName`,`revision`,`format`) VALUES (?,?,?,?,?,?,?)";
        }
    }
}
