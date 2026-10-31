package com.ravelin.core.model;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.MediaDrm;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.chc1;
import p.dar;
import p.eqq;
import p.f46;
import p.h661;
import p.ihc1;
import p.ike1;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.nne;
import p.o5f0;
import p.o5n1;
import p.o661;
import p.o6p1;
import p.p661;
import p.pf40;
import p.rih1;
import p.rzn1;
import p.s6n1;
import p.sug;
import p.tug;
import p.u890;
import p.uax;
import p.utw0;
import p.w0h1;
import p.x1k;
import p.x74;
import p.y6n1;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\b\u0001\u0018\u0000 M2\u00020\u0001:\u0002NOB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Bu\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0004\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010)R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010)R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00100\u0012\u0004\b>\u00103\u001a\u0004\b=\u0010)R\"\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00100\u0012\u0004\bA\u00103\u001a\u0004\b@\u0010)R\"\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u00100\u0012\u0004\bD\u00103\u001a\u0004\bC\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u00100\u0012\u0004\bG\u00103\u001a\u0004\bF\u0010)R\"\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u00100\u0012\u0004\bI\u00103\u001a\u0004\b!\u0010)R\"\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u00100\u0012\u0004\bL\u00103\u001a\u0004\bK\u0010)¨\u0006P"}, d2 = {"Lcom/ravelin/core/model/DeviceId;", "Landroid/os/Parcelable;", "Lp/s6n1;", "deviceIds", "<init>", "(Lp/s6n1;)V", "", "seen0", "", "id", "deviceIdProvider", "", "createdAt", "imei", "imsi", "bluetoothMAC", "wiFiMAC", "androidId", "mediaDrmId", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/DeviceId;Lp/z1k;Lp/h661;)V", "describeContents", "()I", "other", "Lpt5", "(Lcom/ravelin/core/model/DeviceId;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "LPT3", "getId$annotations", "()V", "b", "cON", "getDeviceIdProvider$annotations", "c", "Ljava/lang/Long;", "Com8", "()Ljava/lang/Long;", "getCreatedAt$annotations", "d", "COM5", "getImei$annotations", "e", "COM6", "getImsi$annotations", "f", "COM7", "getBluetoothMAC$annotations", "g", "cOM4", "getWiFiMAC$annotations", "h", "getAndroidId$annotations", "i", "prN", "getMediaDrmId$annotations", "Companion", "CoM4", "cOm9", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final class DeviceId implements Parcelable {
    public static volatile DeviceId t;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String deviceIdProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Long createdAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String imei;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String imsi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String bluetoothMAC;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String wiFiMAC;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String androidId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String mediaDrmId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeviceId> CREATOR = new CoM6();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ DeviceId(int i, String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, p661 p661Var) throws MissingFieldException {
        if (505 != (i & 505)) {
            o6p1.t(i, 505, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.deviceIdProvider = null;
        } else {
            this.deviceIdProvider = str2;
        }
        if ((i & 4) == 0) {
            this.createdAt = 0L;
        } else {
            this.createdAt = l;
        }
        this.imei = str3;
        this.imsi = str4;
        this.bluetoothMAC = str5;
        this.wiFiMAC = str6;
        this.androidId = str7;
        this.mediaDrmId = str8;
    }

    public static final /* synthetic */ void lpt2(DeviceId self, z1k output, h661 serialDesc) {
        String str = self.id;
        Long l = self.createdAt;
        String str2 = self.deviceIdProvider;
        output.G(serialDesc, 0, str);
        if (output.d0() || str2 != null) {
            output.s(serialDesc, 1, chc1.a, str2);
        }
        if (output.d0() || l == null || l.longValue() != 0) {
            output.s(serialDesc, 2, o5f0.a, l);
        }
        chc1 chc1Var = chc1.a;
        output.s(serialDesc, 3, chc1Var, self.imei);
        output.s(serialDesc, 4, chc1Var, self.imsi);
        output.s(serialDesc, 5, chc1Var, self.bluetoothMAC);
        output.s(serialDesc, 6, chc1Var, self.wiFiMAC);
        output.s(serialDesc, 7, chc1Var, self.androidId);
        output.s(serialDesc, 8, chc1Var, self.mediaDrmId);
    }

    /* JADX INFO: renamed from: COM5, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    /* JADX INFO: renamed from: COM6, reason: from getter */
    public final String getImsi() {
        return this.imsi;
    }

    /* JADX INFO: renamed from: COM7, reason: from getter */
    public final String getBluetoothMAC() {
        return this.bluetoothMAC;
    }

    /* JADX INFO: renamed from: Com8, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: LPT3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int Lpt5(DeviceId other) {
        if (other == null) {
            return 1;
        }
        return a() - other.a();
    }

    public final int a() {
        String[] strArr = {this.imei, this.imsi, this.bluetoothMAC, this.wiFiMAC, this.androidId, this.mediaDrmId, this.deviceIdProvider, String.valueOf(this.createdAt)};
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            String str = strArr[i2];
            i += (str == null || ihc1.y0(str) || str.equals("02:00:00:00:00:00")) ? 0 : 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: cOM4, reason: from getter */
    public final String getWiFiMAC() {
        return this.wiFiMAC;
    }

    /* JADX INFO: renamed from: cON, reason: from getter */
    public final String getDeviceIdProvider() {
        return this.deviceIdProvider;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DeviceId.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DeviceId deviceId = (DeviceId) other;
        return u890.j(this.id, deviceId.id) && u890.j(this.imei, deviceId.imei) && u890.j(this.imsi, deviceId.imsi) && u890.j(this.bluetoothMAC, deviceId.bluetoothMAC) && u890.j(this.wiFiMAC, deviceId.wiFiMAC) && u890.j(this.androidId, deviceId.androidId) && u890.j(this.mediaDrmId, deviceId.mediaDrmId);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.imei;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.imsi;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bluetoothMAC;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.wiFiMAC;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.androidId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mediaDrmId;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.deviceIdProvider;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Long l = this.createdAt;
        return iHashCode8 + (l != null ? l.hashCode() : 0);
    }

    /* JADX INFO: renamed from: prN, reason: from getter */
    public final String getMediaDrmId() {
        return this.mediaDrmId;
    }

    public String toString() {
        return w0h1.d(new o5n1((byte) 1)).b(INSTANCE.serializer(), this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.deviceIdProvider);
        Long l = this.createdAt;
        if (l == null) {
            dest.writeInt(0);
        } else {
            eqq.u(dest, 1, l);
        }
        dest.writeString(this.imei);
        dest.writeString(this.imsi);
        dest.writeString(this.bluetoothMAC);
        dest.writeString(this.wiFiMAC);
        dest.writeString(this.androidId);
        dest.writeString(this.mediaDrmId);
    }

    /* JADX INFO: renamed from: Lpt5, reason: from getter */
    public final String getAndroidId() {
        return this.androidId;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceId createFromParcel(Parcel parcel) {
            return new DeviceId(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceId[] newArray(int i) {
            return new DeviceId[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceId(s6n1 s6n1Var) {
        String str = s6n1Var.b;
        this(str == null ? "" : str, s6n1Var.i, s6n1Var.j, s6n1Var.c, s6n1Var.d, s6n1Var.e, s6n1Var.f, s6n1Var.g, s6n1Var.h);
    }

    public /* synthetic */ DeviceId(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l, str3, str4, str5, str6, str7, str8);
    }

    public DeviceId(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.id = str;
        this.deviceIdProvider = str2;
        this.createdAt = l;
        this.imei = str3;
        this.imsi = str4;
        this.bluetoothMAC = str5;
        this.wiFiMAC = str6;
        this.androidId = str7;
        this.mediaDrmId = str8;
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.DeviceId", com9, 9);
            m0v0Var.j("id", false);
            m0v0Var.j("deviceIdProvider", true);
            m0v0Var.j("createdAt", true);
            m0v0Var.j("imei", false);
            m0v0Var.j("imsi", false);
            m0v0Var.j("bluetoothMAC", false);
            m0v0Var.j("wiFiMAC", false);
            m0v0Var.j("androidId", false);
            m0v0Var.j("mediaDrmId", false);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            nma0 nma0Var = chc1.a;
            return new nma0[]{nma0Var, m5n1.z(nma0Var), m5n1.z(o5f0.a), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceId deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            DeviceId deviceId = null;
            boolean z = true;
            String str = null;
            String strF = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i = 0;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                switch (iP) {
                    case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        z = false;
                        continue;
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        strF = x1kVarB.f(m0v0Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        str2 = (String) x1kVarB.B(m0v0Var, 1, chc1.a, str2);
                        i |= 2;
                        break;
                    case 2:
                        l = (Long) x1kVarB.B(m0v0Var, 2, o5f0.a, l);
                        i |= 4;
                        break;
                    case 3:
                        str3 = (String) x1kVarB.B(m0v0Var, 3, chc1.a, str3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = (String) x1kVarB.B(m0v0Var, 4, chc1.a, str4);
                        i |= 16;
                        break;
                    case 5:
                        str5 = (String) x1kVarB.B(m0v0Var, 5, chc1.a, str5);
                        i |= 32;
                        break;
                    case 6:
                        str6 = (String) x1kVarB.B(m0v0Var, 6, chc1.a, str6);
                        i |= 64;
                        break;
                    case 7:
                        str7 = (String) x1kVarB.B(m0v0Var, 7, chc1.a, str7);
                        i |= 128;
                        break;
                    case 8:
                        str = (String) x1kVarB.B(m0v0Var, 8, chc1.a, str);
                        i |= 256;
                        break;
                    default:
                        n9v.a(iP);
                        return deviceId;
                }
                deviceId = null;
            }
            x1kVarB.a(m0v0Var);
            return new DeviceId(i, strF, str2, l, str3, str4, str5, str6, str7, str, null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, DeviceId deviceId) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            DeviceId.lpt2(deviceId, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }

    /* JADX INFO: renamed from: com.ravelin.core.model.DeviceId$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static String a() {
            MediaDrm mediaDrm;
            String strR0 = null;
            try {
                mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                try {
                    strR0 = f46.r0(mediaDrm.getPropertyByteArray("deviceUniqueId"), new o5n1((byte) 3), 30);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                mediaDrm = null;
            }
            if (mediaDrm != null) {
                mediaDrm.release();
            }
            return strR0;
        }

        public static String b() {
            return f46.r0(Build.MODEL.getBytes(nne.a), new o5n1((byte) 3), 30);
        }

        public final boolean COM7() {
            try {
                new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).release();
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.UninitializedPropertyAccessException */
        public final DeviceId Lpt5() throws UninitializedPropertyAccessException {
            DeviceId deviceId = DeviceId.t;
            if (deviceId != null) {
                return deviceId;
            }
            throw new UninitializedPropertyAccessException("Instance has not been previously initialized with application");
        }

        /* JADX WARN: Code duplicated, block: B:131:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:158:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:163:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:208:0x0283  */
        /* JADX WARN: Code duplicated, block: B:209:0x0285  */
        /* JADX WARN: Code duplicated, block: B:215:0x0295 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:216:0x0297  */
        /* JADX WARN: Code duplicated, block: B:220:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:222:0x02ab A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:223:0x02ad  */
        /* JADX WARN: Code duplicated, block: B:224:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:226:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
        public final DeviceId lpt2(String str, String str2, Long l, String str3, tug tugVar, sug sugVar, Context context) throws NoSuchAlgorithmException {
            Boolean boolValueOf;
            String meid;
            String macAddress;
            String packageName;
            Long l2;
            Long lValueOf;
            byte[] bArrA;
            BluetoothAdapter defaultAdapter;
            String strY = str;
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (sugVar != null) {
                try {
                    boolValueOf = Boolean.valueOf(x74.j(context, "android.permission.READ_PHONE_STATE") == 0);
                } catch (SecurityException e) {
                    utw0 utw0Var = ike1.a;
                    utw0Var.y("DeviceId");
                    utw0Var.m(e, new Object[0]);
                }
            } else {
                boolValueOf = null;
            }
            String subscriberId = (!u890.j(boolValueOf, Boolean.TRUE) || Build.VERSION.SDK_INT > 28) ? null : ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            Boolean boolValueOf2 = sugVar != null ? Boolean.valueOf(x74.j(context, "android.permission.READ_PHONE_STATE") == 0) : null;
            Boolean bool = Boolean.TRUE;
            if (u890.j(boolValueOf2, bool)) {
                Object systemService = context.getApplicationContext().getSystemService("phone");
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                int i = Build.VERSION.SDK_INT;
                if (i < 26) {
                    Integer numValueOf = telephonyManager != null ? Integer.valueOf(telephonyManager.getDataNetworkType()) : null;
                    if (numValueOf != null && numValueOf.intValue() == 16) {
                        meid = telephonyManager.getDeviceId();
                    } else {
                        meid = null;
                    }
                } else if (26 > i || i >= 29 || telephonyManager == null) {
                    meid = null;
                } else {
                    meid = telephonyManager.getImei();
                }
            } else {
                meid = null;
            }
            if (meid == null) {
                if (u890.j(sugVar != null ? Boolean.valueOf(x74.j(context, "android.permission.READ_PHONE_STATE") == 0) : null, bool)) {
                    Object systemService2 = context.getApplicationContext().getSystemService("phone");
                    TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 26) {
                        Integer numValueOf2 = telephonyManager2 != null ? Integer.valueOf(telephonyManager2.getDataNetworkType()) : null;
                        if (numValueOf2 != null && numValueOf2.intValue() == 4) {
                            meid = telephonyManager2.getDeviceId();
                        } else {
                            meid = null;
                        }
                    } else if (26 > i2 || i2 >= 29 || telephonyManager2 == null) {
                        meid = null;
                    } else {
                        meid = telephonyManager2.getMeid();
                    }
                } else {
                    meid = null;
                }
            }
            String address = (!u890.j(sugVar != null ? Boolean.valueOf(x74.j(context, "android.permission.BLUETOOTH") == 0) : null, bool) || Build.VERSION.SDK_INT >= 29 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) ? null : defaultAdapter.getAddress();
            if (Build.VERSION.SDK_INT >= 29) {
                macAddress = null;
            } else {
                if (u890.j(sugVar != null ? Boolean.valueOf(x74.j(context, "android.permission.ACCESS_WIFI_STATE") == 0) : null, bool)) {
                    if (u890.j(sugVar != null ? Boolean.valueOf(x74.j(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) : null, bool)) {
                        if (u890.j(sugVar != null ? Boolean.valueOf(x74.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0) : null, bool)) {
                            if (u890.j(sugVar != null ? Boolean.valueOf(x74.j(context, "android.permission.ACCESS_NETWORK_STATE") == 0) : null, bool)) {
                                macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                            } else {
                                macAddress = null;
                            }
                        } else {
                            macAddress = null;
                        }
                    } else {
                        macAddress = null;
                    }
                } else {
                    macAddress = null;
                }
            }
            String strA = a();
            String strConcat = strA != null ? strA.concat(b()) : null;
            if (str3 != null && !ihc1.y0(str3) && !ihc1.y0(str3)) {
                boolean z = true;
                for (int i3 = 0; i3 < str3.length(); i3++) {
                    char cCharAt = str3.charAt(i3);
                    z = z && '!' <= cCharAt && cCharAt < 127;
                }
                if (z && str3.length() <= 128) {
                    packageName = "external provider";
                } else if (str2 != null) {
                    packageName = context.getPackageName();
                } else {
                    packageName = context.getPackageName();
                }
            } else if (str2 != null || ihc1.y0(str2)) {
                packageName = context.getPackageName();
            } else {
                packageName = str2;
            }
            if (str3 == null || ihc1.y0(str3) || u890.j(str2, "external provider")) {
                if (!u890.j(str2, "external provider")) {
                    if ((l != null ? l.longValue() : 0L) == 0) {
                        lValueOf = Long.valueOf(System.currentTimeMillis());
                    } else {
                        l2 = l;
                    }
                    if (str3 == null && !ihc1.y0(str3) && !ihc1.y0(str3)) {
                        boolean z2 = true;
                        for (int i4 = 0; i4 < str3.length(); i4++) {
                            char cCharAt2 = str3.charAt(i4);
                            z2 = z2 && '!' <= cCharAt2 && cCharAt2 < 127;
                        }
                        if (z2 && str3.length() <= 128) {
                            strY = "extand-".concat(str3);
                        } else if (strY != null) {
                            if (strConcat == null) {
                                if (string.length() == 0) {
                                    if (tugVar != null) {
                                        bArrA = ((y6n1) tugVar).a(32);
                                    } else {
                                        bArrA = null;
                                    }
                                    strY = rzn1.y("5", String.valueOf(bArrA));
                                } else {
                                    strY = rzn1.y("4", string);
                                }
                            } else if (string.length() == 0) {
                                if (tugVar != null) {
                                    bArrA = ((y6n1) tugVar).a(32);
                                } else {
                                    bArrA = null;
                                }
                                strY = rzn1.y("5", String.valueOf(bArrA));
                            } else {
                                strY = rzn1.y("4", string);
                            }
                        } else if (strConcat == null) {
                            if (string.length() == 0) {
                                if (tugVar != null) {
                                    bArrA = ((y6n1) tugVar).a(32);
                                } else {
                                    bArrA = null;
                                }
                                strY = rzn1.y("5", String.valueOf(bArrA));
                            } else {
                                strY = rzn1.y("4", string);
                            }
                        } else if (string.length() == 0) {
                            if (tugVar != null) {
                                bArrA = ((y6n1) tugVar).a(32);
                            } else {
                                bArrA = null;
                            }
                            strY = rzn1.y("5", String.valueOf(bArrA));
                        } else {
                            strY = rzn1.y("4", string);
                        }
                    } else if (strY != null || ihc1.y0(strY) || strY.equals("rvnand-3-C248C629AF1FE0A8C46B95668064C1D2952A9E91D207BC0CC3C5D584C2F7553A")) {
                        if (strConcat == null && !ihc1.y0(strConcat)) {
                            strY = rzn1.y("6", strConcat);
                        } else if (string.length() == 0) {
                            if (tugVar != null) {
                                bArrA = ((y6n1) tugVar).a(32);
                            } else {
                                bArrA = null;
                            }
                            strY = rzn1.y("5", String.valueOf(bArrA));
                        } else {
                            strY = rzn1.y("4", string);
                        }
                    }
                    return new DeviceId(strY, packageName, l2, meid, subscriberId, address, macAddress, string, strConcat, null);
                }
                lValueOf = Long.valueOf(l != null ? l.longValue() : System.currentTimeMillis());
            } else {
                lValueOf = Long.valueOf(System.currentTimeMillis());
            }
            l2 = lValueOf;
            if (str3 == null) {
                if (strY != null) {
                    if (strConcat == null) {
                        if (string.length() == 0) {
                            if (tugVar != null) {
                                bArrA = ((y6n1) tugVar).a(32);
                            } else {
                                bArrA = null;
                            }
                            strY = rzn1.y("5", String.valueOf(bArrA));
                        } else {
                            strY = rzn1.y("4", string);
                        }
                    } else if (string.length() == 0) {
                        if (tugVar != null) {
                            bArrA = ((y6n1) tugVar).a(32);
                        } else {
                            bArrA = null;
                        }
                        strY = rzn1.y("5", String.valueOf(bArrA));
                    } else {
                        strY = rzn1.y("4", string);
                    }
                } else if (strConcat == null) {
                    if (string.length() == 0) {
                        if (tugVar != null) {
                            bArrA = ((y6n1) tugVar).a(32);
                        } else {
                            bArrA = null;
                        }
                        strY = rzn1.y("5", String.valueOf(bArrA));
                    } else {
                        strY = rzn1.y("4", string);
                    }
                } else if (string.length() == 0) {
                    if (tugVar != null) {
                        bArrA = ((y6n1) tugVar).a(32);
                    } else {
                        bArrA = null;
                    }
                    strY = rzn1.y("5", String.valueOf(bArrA));
                } else {
                    strY = rzn1.y("4", string);
                }
            } else if (strY != null) {
                if (strConcat == null) {
                    if (string.length() == 0) {
                        if (tugVar != null) {
                            bArrA = ((y6n1) tugVar).a(32);
                        } else {
                            bArrA = null;
                        }
                        strY = rzn1.y("5", String.valueOf(bArrA));
                    } else {
                        strY = rzn1.y("4", string);
                    }
                } else if (string.length() == 0) {
                    if (tugVar != null) {
                        bArrA = ((y6n1) tugVar).a(32);
                    } else {
                        bArrA = null;
                    }
                    strY = rzn1.y("5", String.valueOf(bArrA));
                } else {
                    strY = rzn1.y("4", string);
                }
            } else if (strConcat == null) {
                if (string.length() == 0) {
                    if (tugVar != null) {
                        bArrA = ((y6n1) tugVar).a(32);
                    } else {
                        bArrA = null;
                    }
                    strY = rzn1.y("5", String.valueOf(bArrA));
                } else {
                    strY = rzn1.y("4", string);
                }
            } else if (string.length() == 0) {
                if (tugVar != null) {
                    bArrA = ((y6n1) tugVar).a(32);
                } else {
                    bArrA = null;
                }
                strY = rzn1.y("5", String.valueOf(bArrA));
            } else {
                strY = rzn1.y("4", string);
            }
            return new DeviceId(strY, packageName, l2, meid, subscriberId, address, macAddress, string, strConcat, null);
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }

        public final void lpt2(DeviceId deviceId) {
            synchronized (this) {
                if (!u890.j(DeviceId.t, deviceId)) {
                    DeviceId.t = deviceId;
                }
            }
        }

        public final DeviceId lpt2(Context context, tug tugVar, sug sugVar, s6n1 s6n1Var, String str) throws NoSuchAlgorithmException {
            DeviceId deviceId = new DeviceId(s6n1Var);
            DeviceId deviceIdLpt2 = lpt2(deviceId.getId(), deviceId.getDeviceIdProvider(), deviceId.getCreatedAt(), str, tugVar, sugVar, context);
            return (deviceId.Lpt5(deviceIdLpt2) <= 0 || !(str == null || ihc1.y0(str))) ? deviceIdLpt2 : deviceId;
        }

        public final Object lpt2(Context context) throws NoSuchAlgorithmException {
            String strY;
            try {
                return Lpt5().getId();
            } catch (UninitializedPropertyAccessException unused) {
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                String strA = a();
                String strConcat = strA != null ? strA.concat(b()) : null;
                if (strA == null) {
                    strY = rzn1.y("4", Settings.Secure.getString(context.getContentResolver(), "android_id"));
                } else {
                    strY = rzn1.y("6", strA.concat(b()));
                }
                lpt2(new DeviceId(strY, null, 0L, null, null, null, null, string, strConcat, null));
                return rih1.a;
            }
        }
    }
}
