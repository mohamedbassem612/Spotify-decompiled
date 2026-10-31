package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qs0 extends bmq0 {
    public final /* synthetic */ byte b;

    public qs0(rs0 rs0Var) {
        this.b = (byte) 0;
    }

    public final void h(d441 d441Var, Object obj) {
        Integer numValueOf;
        int i;
        int i2 = 1;
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zs0 zs0Var = (zs0) obj;
                d441Var.r(1, zs0Var.a.getTime());
                d441Var.r(2, zs0Var.b ? 1L : 0L);
                d441Var.r(3, zs0Var.c.getTime());
                break;
            case 1:
                fhb fhbVar = (fhb) obj;
                d441Var.K(1, fhbVar.a);
                d441Var.K(2, fhbVar.b);
                d441Var.K(3, fhbVar.c);
                d441Var.K(4, fhbVar.d);
                d441Var.K(5, fhbVar.e);
                d441Var.r(6, fhbVar.f ? 1L : 0L);
                String str = fhbVar.g;
                if (str == null) {
                    d441Var.t(7);
                } else {
                    d441Var.K(7, str);
                }
                d441Var.K(8, fhbVar.h);
                d441Var.r(9, fhbVar.i ? 1L : 0L);
                String str2 = fhbVar.j;
                if (str2 != null) {
                    d441Var.K(10, str2);
                } else {
                    d441Var.t(10);
                }
                break;
            case 2:
                vct vctVar = (vct) obj;
                d441Var.K(1, vctVar.a);
                d441Var.K(2, vctVar.b);
                break;
            case 3:
                zqt zqtVar = (zqt) obj;
                d441Var.K(1, zqtVar.a);
                d441Var.r(2, zqtVar.b);
                break;
            case 4:
                kd00 kd00Var = (kd00) obj;
                d441Var.K(1, kd00Var.a);
                d441Var.n(kd00Var.b, 2);
                d441Var.r(3, kd00Var.c);
                break;
            case 5:
                ba00 ba00Var = (ba00) obj;
                d441Var.r(1, ba00Var.a);
                Boolean bool = ba00Var.b;
                numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    d441Var.t(2);
                } else {
                    d441Var.r(2, numValueOf.intValue());
                }
                String str3 = ba00Var.c;
                if (str3 == null) {
                    d441Var.t(3);
                } else {
                    d441Var.K(3, str3);
                }
                byte[] bArr = ba00Var.d;
                if (bArr == null) {
                    d441Var.t(4);
                } else {
                    d441Var.n(bArr, 4);
                }
                d441Var.r(5, ba00Var.e);
                byte[] bArr2 = ba00Var.f;
                if (bArr2 == null) {
                    d441Var.t(6);
                } else {
                    d441Var.n(bArr2, 6);
                }
                String str4 = ba00Var.g;
                if (str4 == null) {
                    d441Var.t(7);
                } else {
                    d441Var.K(7, str4);
                }
                String str5 = ba00Var.h;
                if (str5 != null) {
                    d441Var.K(8, str5);
                } else {
                    d441Var.t(8);
                }
                break;
            case 6:
                ye20 ye20Var = (ye20) obj;
                d441Var.K(1, ye20Var.a);
                d441Var.K(2, ye20Var.b);
                d441Var.r(3, ye20Var.c);
                d441Var.r(4, ye20Var.d ? 1L : 0L);
                break;
            case 7:
                ctp0 ctp0Var = (ctp0) obj;
                d441Var.K(1, ctp0Var.a);
                d441Var.K(2, ctp0Var.b);
                break;
            case 8:
                hnv0 hnv0Var = (hnv0) obj;
                d441Var.K(1, hnv0Var.a);
                d441Var.r(2, hnv0Var.b.longValue());
                break;
            case 9:
                mrz0 mrz0Var = (mrz0) obj;
                d441Var.K(1, mrz0Var.a);
                d441Var.r(2, mrz0Var.b);
                d441Var.r(3, mrz0Var.c);
                break;
            case 10:
                hm01 hm01Var = (hm01) obj;
                d441Var.r(1, hm01Var.a);
                d441Var.K(2, hm01Var.b);
                d441Var.r(3, hm01Var.c);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                xdd1 xdd1Var = (xdd1) obj;
                d441Var.K(1, xdd1Var.a);
                d441Var.r(2, xdd1Var.b);
                d441Var.r(3, xdd1Var.c);
                break;
            case grn1.d /* 12 */:
                tul1 tul1Var = (tul1) obj;
                d441Var.K(1, tul1Var.a);
                d441Var.K(2, tul1Var.b);
                d441Var.K(3, tul1Var.c);
                d441Var.K(4, tul1Var.d);
                d441Var.r(5, tul1Var.e ? 1L : 0L);
                String str6 = tul1Var.f;
                if (str6 == null) {
                    d441Var.t(6);
                } else {
                    d441Var.K(6, str6);
                }
                d441Var.K(7, tul1Var.g);
                d441Var.r(8, tul1Var.h ? 1L : 0L);
                String str7 = tul1Var.i;
                if (str7 != null) {
                    d441Var.K(9, str7);
                } else {
                    d441Var.t(9);
                }
                break;
            case 13:
                fwl1 fwl1Var = (fwl1) obj;
                d441Var.K(1, fwl1Var.a);
                d441Var.K(2, fwl1Var.b);
                break;
            case 14:
                kwl1 kwl1Var = (kwl1) obj;
                d441Var.K(1, kwl1Var.a);
                ewq ewqVar = ewq.b;
                d441Var.n(o0c.N(kwl1Var.b), 2);
                break;
            case 15:
                vwl1 vwl1Var = (vwl1) obj;
                d441Var.K(1, vwl1Var.a);
                d441Var.r(2, cwl1.m0(vwl1Var.b));
                d441Var.K(3, vwl1Var.c);
                d441Var.K(4, vwl1Var.d);
                ewq ewqVar2 = ewq.b;
                d441Var.n(o0c.N(vwl1Var.e), 5);
                d441Var.n(o0c.N(vwl1Var.f), 6);
                d441Var.r(7, vwl1Var.g);
                d441Var.r(8, vwl1Var.h);
                d441Var.r(9, vwl1Var.i);
                d441Var.r(10, vwl1Var.k);
                int iOrdinal = vwl1Var.l.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal != 1) {
                    eg.o();
                } else {
                    i = 1;
                }
                d441Var.r(11, i);
                d441Var.r(12, vwl1Var.m);
                d441Var.r(13, vwl1Var.n);
                d441Var.r(14, vwl1Var.o);
                d441Var.r(15, vwl1Var.p);
                d441Var.r(16, vwl1Var.q ? 1L : 0L);
                int iC = l1d.C(vwl1Var.r);
                if (iC == 0) {
                    i2 = 0;
                } else if (iC != 1) {
                    eg.o();
                }
                d441Var.r(17, i2);
                d441Var.r(18, vwl1Var.s);
                d441Var.r(19, vwl1Var.t);
                d441Var.r(20, vwl1Var.u);
                d441Var.r(21, vwl1Var.v);
                d441Var.r(22, vwl1Var.w);
                String str8 = vwl1Var.x;
                if (str8 == null) {
                    d441Var.t(23);
                } else {
                    d441Var.K(23, str8);
                }
                Boolean bool2 = vwl1Var.y;
                numValueOf = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    d441Var.t(24);
                } else {
                    d441Var.r(24, numValueOf.intValue());
                }
                gjl gjlVar = vwl1Var.j;
                d441Var.r(25, cwl1.P(gjlVar.a));
                d441Var.n(cwl1.z(gjlVar.b), 26);
                d441Var.r(27, gjlVar.c ? 1L : 0L);
                d441Var.r(28, gjlVar.d ? 1L : 0L);
                d441Var.r(29, gjlVar.e ? 1L : 0L);
                d441Var.r(30, gjlVar.f ? 1L : 0L);
                d441Var.r(31, gjlVar.g);
                d441Var.r(32, gjlVar.h);
                d441Var.n(cwl1.k0(gjlVar.i), 33);
                break;
            default:
                s6n1 s6n1Var = (s6n1) obj;
                Integer num = s6n1Var.a;
                if (num == null) {
                    d441Var.t(1);
                } else {
                    d441Var.r(1, num.intValue());
                }
                String str9 = s6n1Var.b;
                if (str9 == null) {
                    d441Var.t(2);
                } else {
                    d441Var.K(2, str9);
                }
                String str10 = s6n1Var.c;
                if (str10 == null) {
                    d441Var.t(3);
                } else {
                    d441Var.K(3, str10);
                }
                String str11 = s6n1Var.d;
                if (str11 == null) {
                    d441Var.t(4);
                } else {
                    d441Var.K(4, str11);
                }
                String str12 = s6n1Var.e;
                if (str12 == null) {
                    d441Var.t(5);
                } else {
                    d441Var.K(5, str12);
                }
                String str13 = s6n1Var.f;
                if (str13 == null) {
                    d441Var.t(6);
                } else {
                    d441Var.K(6, str13);
                }
                String str14 = s6n1Var.g;
                if (str14 == null) {
                    d441Var.t(7);
                } else {
                    d441Var.K(7, str14);
                }
                String str15 = s6n1Var.h;
                if (str15 == null) {
                    d441Var.t(8);
                } else {
                    d441Var.K(8, str15);
                }
                String str16 = s6n1Var.i;
                if (str16 == null) {
                    d441Var.t(9);
                } else {
                    d441Var.K(9, str16);
                }
                Long l = s6n1Var.j;
                if (l != null) {
                    d441Var.r(10, l.longValue());
                } else {
                    d441Var.t(10);
                }
                break;
        }
    }

    public final String p() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "INSERT OR REPLACE INTO `AdOnAppOpenEntity` (`id`,`isShown`,`expiresAt`) VALUES (?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `BluetoothHeadphoneFilterStateEntity` (`headphoneIdentifier`,`owner`,`headphoneName`,`externalizationEnabledId`,`externalizationDisabledId`,`externalizationEnabled`,`specificEnabledId`,`specificDisabledId`,`specificEnabled`,`filterName`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `DeviceLastConnection` (`deviceIdentifier`,`timestamp`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `EventSequenceNumbers` (`eventName`,`sequenceId`,`sequenceNumberNext`) VALUES (?,?,?)";
            case 5:
                return "INSERT OR ABORT INTO `Events` (`id`,`authenticated`,`eventName`,`sequenceId`,`sequenceNumber`,`fragments`,`owner`,`deviceId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `liked_songs_filter_tags_entity` (`id`,`title`,`position`,`isSelected`) VALUES (?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `OfflineLicenseInfoEntity` (`media_id`,`key_set_id`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `RateLimitedEvents` (`eventName`,`count`,`timestamp`) VALUES (?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `recent_locations` (`geoNameId`,`city`,`timestamp`) VALUES (?,?,?)";
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case grn1.d /* 12 */:
                return "INSERT OR REPLACE INTO `WiredHeadphoneFilterStateEntity` (`headphoneIdentifier`,`owner`,`externalizationEnabledId`,`externalizationDisabledId`,`externalizationEnabled`,`specificEnabledId`,`specificDisabledId`,`specificEnabled`,`filterName`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 15:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `device_ids` (`id`,`one`,`two`,`three`,`four`,`five`,`six`,`seven`,`deviceIdProvider`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
