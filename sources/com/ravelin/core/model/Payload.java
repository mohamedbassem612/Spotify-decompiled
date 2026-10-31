package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bb00;
import p.chc1;
import p.cy30;
import p.dar;
import p.grn1;
import p.gvg;
import p.h661;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.o661;
import p.p661;
import p.pf40;
import p.u890;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0081\b\u0018\u0000 R2\u00020\u0001:\u0002STB\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010+J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b9\u0010:\u001a\u0004\b6\u0010-\"\u0004\b7\u00108R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b?\u0010:\u001a\u0004\b \u0010=\"\u0004\b \u0010>R*\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u00105\u0012\u0004\bB\u0010:\u001a\u0004\bA\u0010-\"\u0004\b6\u00108R*\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u00105\u0012\u0004\bE\u0010:\u001a\u0004\bD\u0010-\"\u0004\b \u00108R*\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bK\u0010:\u001a\u0004\bH\u0010I\"\u0004\b \u0010JR*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bQ\u0010:\u001a\u0004\bN\u0010O\"\u0004\b \u0010P¨\u0006U"}, d2 = {"Lcom/ravelin/core/model/Payload;", "Landroid/os/Parcelable;", "", "libVer", "appVer", "deviceId", "fingerprintSource", "ravelinSessionId", "customerId", "tempCustomerId", "Lcom/ravelin/core/model/Fingerprint;", "android", "error", "orderId", "eventType", "Lcom/ravelin/core/model/EventData;", "eventData", "Lcom/ravelin/core/model/EventMeta;", "eventMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Fingerprint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/EventData;Lcom/ravelin/core/model/EventMeta;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Fingerprint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/EventData;Lcom/ravelin/core/model/EventMeta;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/Payload;Lp/z1k;Lp/h661;)V", "Lcom/ravelin/core/model/ResponsePayload;", "COM7", "()Lcom/ravelin/core/model/ResponsePayload;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "Lpt5", "setDeviceId", "(Ljava/lang/String;)V", "getDeviceId$annotations", "()V", "h", "Lcom/ravelin/core/model/Fingerprint;", "()Lcom/ravelin/core/model/Fingerprint;", "(Lcom/ravelin/core/model/Fingerprint;)V", "getAndroid$annotations", "t", "getOrderId", "getOrderId$annotations", "X", "getEventType", "getEventType$annotations", "Y", "Lcom/ravelin/core/model/EventData;", "getEventData", "()Lcom/ravelin/core/model/EventData;", "(Lcom/ravelin/core/model/EventData;)V", "getEventData$annotations", "Z", "Lcom/ravelin/core/model/EventMeta;", "getEventMeta", "()Lcom/ravelin/core/model/EventMeta;", "(Lcom/ravelin/core/model/EventMeta;)V", "getEventMeta$annotations", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class Payload implements Parcelable {

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String eventType;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public EventData eventData;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public EventMeta eventMeta;
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String deviceId;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Fingerprint android;
    public final String i;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public String orderId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Payload> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.Payload$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    public /* synthetic */ Payload(String str, String str2, String str3, String str4, String str5, String str6, String str7, Fingerprint fingerprint, String str8, String str9, String str10, EventData eventData, EventMeta eventMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : fingerprint, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : eventData, (i & 4096) != 0 ? null : eventMeta);
    }

    public static final /* synthetic */ void lpt2(Payload self, z1k output, h661 serialDesc) {
        if (output.d0() || !u890.j(self.a, "")) {
            output.G(serialDesc, 0, self.a);
        }
        if (output.d0() || !u890.j(self.b, "")) {
            output.G(serialDesc, 1, self.b);
        }
        if (output.d0() || !u890.j(self.deviceId, "")) {
            output.G(serialDesc, 2, self.deviceId);
        }
        if (output.d0() || !u890.j(self.d, "")) {
            output.G(serialDesc, 3, self.d);
        }
        if (output.d0() || !u890.j(self.e, "")) {
            output.G(serialDesc, 4, self.e);
        }
        if (output.d0() || self.f != null) {
            output.s(serialDesc, 5, chc1.a, self.f);
        }
        if (output.d0() || self.g != null) {
            output.s(serialDesc, 6, chc1.a, self.g);
        }
        if (output.d0() || self.android != null) {
            output.s(serialDesc, 7, Fingerprint.cOm9.lpt2, self.android);
        }
        if (output.d0() || self.i != null) {
            output.s(serialDesc, 8, chc1.a, self.i);
        }
        if (output.d0() || self.orderId != null) {
            output.s(serialDesc, 9, chc1.a, self.orderId);
        }
        if (output.d0() || self.eventType != null) {
            output.s(serialDesc, 10, chc1.a, self.eventType);
        }
        if (output.d0() || self.eventData != null) {
            output.s(serialDesc, 11, EventData.cOm9.lpt2, self.eventData);
        }
        if (!output.d0() && self.eventMeta == null) {
            return;
        }
        output.s(serialDesc, 12, EventMeta.cOm9.lpt2, self.eventMeta);
    }

    public final ResponsePayload COM7() {
        return new ResponsePayload(this.a, this.b, this.deviceId, this.f, this.g, this.android, this.eventType);
    }

    /* JADX INFO: renamed from: Lpt5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) other;
        return u890.j(this.a, payload.a) && u890.j(this.b, payload.b) && u890.j(this.deviceId, payload.deviceId) && u890.j(this.d, payload.d) && u890.j(this.e, payload.e) && u890.j(this.f, payload.f) && u890.j(this.g, payload.g) && u890.j(this.android, payload.android) && u890.j(this.i, payload.i) && u890.j(this.orderId, payload.orderId) && u890.j(this.eventType, payload.eventType) && u890.j(this.eventData, payload.eventData) && u890.j(this.eventMeta, payload.eventMeta);
    }

    public int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.deviceId), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Fingerprint fingerprint = this.android;
        int iHashCode3 = (iHashCode2 + (fingerprint == null ? 0 : fingerprint.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EventData eventData = this.eventData;
        int iHashCode7 = (iHashCode6 + (eventData == null ? 0 : eventData.hashCode())) * 31;
        EventMeta eventMeta = this.eventMeta;
        return iHashCode7 + (eventMeta != null ? eventMeta.hashCode() : 0);
    }

    public String toString() {
        Fingerprint fingerprint = this.android;
        String str = this.orderId;
        String str2 = this.eventType;
        EventData eventData = this.eventData;
        EventMeta eventMeta = this.eventMeta;
        StringBuilder sbN = gvg.n("Payload(libVer=", this.a, ", appVer=", this.b, ", deviceId=");
        bb00.j(sbN, this.deviceId, ", fingerprintSource=", this.d, ", ravelinSessionId=");
        bb00.j(sbN, this.e, ", customerId=", this.f, ", tempCustomerId=");
        sbN.append(this.g);
        sbN.append(", android=");
        sbN.append(fingerprint);
        sbN.append(", error=");
        bb00.j(sbN, this.i, ", orderId=", str, ", eventType=");
        sbN.append(str2);
        sbN.append(", eventData=");
        sbN.append(eventData);
        sbN.append(", eventMeta=");
        sbN.append(eventMeta);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.deviceId);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        Fingerprint fingerprint = this.android;
        if (fingerprint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fingerprint.writeToParcel(dest, flags);
        }
        dest.writeString(this.i);
        dest.writeString(this.orderId);
        dest.writeString(this.eventType);
        EventData eventData = this.eventData;
        if (eventData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventData.writeToParcel(dest, flags);
        }
        EventMeta eventMeta = this.eventMeta;
        if (eventMeta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventMeta.writeToParcel(dest, flags);
        }
    }

    public final void Lpt5(String str) {
        this.orderId = str;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Payload createFromParcel(Parcel parcel) {
            return new Payload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Fingerprint.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EventData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EventMeta.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Payload[] newArray(int i) {
            return new Payload[i];
        }
    }

    public Payload(String str, String str2, String str3, String str4, String str5, String str6, String str7, Fingerprint fingerprint, String str8, String str9, String str10, EventData eventData, EventMeta eventMeta) {
        this.a = str;
        this.b = str2;
        this.deviceId = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.android = fingerprint;
        this.i = str8;
        this.orderId = str9;
        this.eventType = str10;
        this.eventData = eventData;
        this.eventMeta = eventMeta;
    }

    public /* synthetic */ Payload(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Fingerprint fingerprint, String str8, String str9, String str10, EventData eventData, EventMeta eventMeta, p661 p661Var) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.deviceId = "";
        } else {
            this.deviceId = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.android = null;
        } else {
            this.android = fingerprint;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str9;
        }
        if ((i & 1024) == 0) {
            this.eventType = null;
        } else {
            this.eventType = str10;
        }
        if ((i & 2048) == 0) {
            this.eventData = null;
        } else {
            this.eventData = eventData;
        }
        if ((i & 4096) == 0) {
            this.eventMeta = null;
        } else {
            this.eventMeta = eventMeta;
        }
    }

    /* JADX INFO: renamed from: lpt2, reason: from getter */
    public final Fingerprint getAndroid() {
        return this.android;
    }

    public final void lpt2(Fingerprint fingerprint) {
        this.android = fingerprint;
    }

    public final void lpt2(String str) {
        this.eventType = str;
    }

    public final void lpt2(EventData eventData) {
        this.eventData = eventData;
    }

    public final void lpt2(EventMeta eventMeta) {
        this.eventMeta = eventMeta;
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.Payload", com9, 13);
            m0v0Var.j("libVer", true);
            m0v0Var.j("appVer", true);
            m0v0Var.j("deviceId", true);
            m0v0Var.j("fingerprintSource", true);
            m0v0Var.j("ravelinSessionId", true);
            m0v0Var.j("customerId", true);
            m0v0Var.j("tempCustomerId", true);
            m0v0Var.j("android", true);
            m0v0Var.j("error", true);
            m0v0Var.j("orderId", true);
            m0v0Var.j("eventType", true);
            m0v0Var.j("eventData", true);
            m0v0Var.j("eventMeta", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            nma0 nma0Var = chc1.a;
            return new nma0[]{nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(Fingerprint.cOm9.lpt2), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(EventData.cOm9.lpt2), m5n1.z(EventMeta.cOm9.lpt2)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Payload deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            EventData eventData = null;
            String str = null;
            String str2 = null;
            EventMeta eventMeta = null;
            String str3 = null;
            int i = 0;
            String strF = null;
            String strF2 = null;
            String strF3 = null;
            String strF4 = null;
            String strF5 = null;
            String str4 = null;
            String str5 = null;
            Fingerprint fingerprint = null;
            boolean z = true;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                switch (iP) {
                    case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        strF2 = strF2;
                        z = false;
                        strF2 = strF2;
                        break;
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        strF2 = strF2;
                        i |= 1;
                        strF = x1kVarB.f(m0v0Var, 0);
                        strF2 = strF2;
                        break;
                    case 1:
                        strF2 = x1kVarB.f(m0v0Var, 1);
                        i |= 2;
                        strF = strF;
                        break;
                    case 2:
                        strF3 = x1kVarB.f(m0v0Var, 2);
                        i |= 4;
                        strF = strF;
                        break;
                    case 3:
                        strF4 = x1kVarB.f(m0v0Var, 3);
                        i |= 8;
                        strF = strF;
                        break;
                    case 4:
                        strF5 = x1kVarB.f(m0v0Var, 4);
                        i |= 16;
                        strF = strF;
                        break;
                    case 5:
                        str4 = (String) x1kVarB.B(m0v0Var, 5, chc1.a, str4);
                        i |= 32;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    case 6:
                        str5 = (String) x1kVarB.B(m0v0Var, 6, chc1.a, str5);
                        i |= 64;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    case 7:
                        fingerprint = (Fingerprint) x1kVarB.B(m0v0Var, 7, Fingerprint.cOm9.lpt2, fingerprint);
                        i |= 128;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    case 8:
                        str3 = (String) x1kVarB.B(m0v0Var, 8, chc1.a, str3);
                        i |= 256;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    case 9:
                        str2 = (String) x1kVarB.B(m0v0Var, 9, chc1.a, str2);
                        i |= 512;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    case 10:
                        str = (String) x1kVarB.B(m0v0Var, 10, chc1.a, str);
                        i |= 1024;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        eventData = (EventData) x1kVarB.B(m0v0Var, 11, EventData.cOm9.lpt2, eventData);
                        i |= 2048;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    case grn1.d /* 12 */:
                        eventMeta = (EventMeta) x1kVarB.B(m0v0Var, 12, EventMeta.cOm9.lpt2, eventMeta);
                        i |= 4096;
                        strF = strF;
                        strF2 = strF2;
                        break;
                    default:
                        n9v.a(iP);
                        return null;
                }
            }
            x1kVarB.a(m0v0Var);
            return new Payload(i, strF, strF2, strF3, strF4, strF5, str4, str5, fingerprint, str3, str2, str, eventData, eventMeta, (p661) null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, Payload payload) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            Payload.lpt2(payload, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
