package com.ravelin.core.model;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bb00;
import p.cy30;
import p.gvg;
import p.l1d;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ^\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010\u000e¨\u00060"}, d2 = {"Lcom/ravelin/core/model/ResponsePayload;", "", "", "libVer", "appVer", "deviceId", "customerId", "tempCustomerId", "Lcom/ravelin/core/model/Fingerprint;", "fingerprint", "eventType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Fingerprint;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/ravelin/core/model/Fingerprint;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Fingerprint;Ljava/lang/String;)Lcom/ravelin/core/model/ResponsePayload;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLibVer", "b", "getAppVer", "c", "getDeviceId", "d", "getCustomerId", "e", "getTempCustomerId", "f", "Lcom/ravelin/core/model/Fingerprint;", "getFingerprint", "g", "getEventType", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final /* data */ class ResponsePayload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String libVer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String appVer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String deviceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String customerId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String tempCustomerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Fingerprint fingerprint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String eventType;

    public /* synthetic */ ResponsePayload(String str, String str2, String str3, String str4, String str5, Fingerprint fingerprint, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : fingerprint, (i & 64) != 0 ? null : str6);
    }

    public static /* synthetic */ ResponsePayload copy$default(ResponsePayload responsePayload, String str, String str2, String str3, String str4, String str5, Fingerprint fingerprint, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responsePayload.libVer;
        }
        if ((i & 2) != 0) {
            str2 = responsePayload.appVer;
        }
        if ((i & 4) != 0) {
            str3 = responsePayload.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = responsePayload.customerId;
        }
        if ((i & 16) != 0) {
            str5 = responsePayload.tempCustomerId;
        }
        if ((i & 32) != 0) {
            fingerprint = responsePayload.fingerprint;
        }
        if ((i & 64) != 0) {
            str6 = responsePayload.eventType;
        }
        Fingerprint fingerprint2 = fingerprint;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return responsePayload.copy(str, str2, str9, str4, str8, fingerprint2, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLibVer() {
        return this.libVer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppVer() {
        return this.appVer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTempCustomerId() {
        return this.tempCustomerId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Fingerprint getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final ResponsePayload copy(String libVer, String appVer, String deviceId, String customerId, String tempCustomerId, Fingerprint fingerprint, String eventType) {
        return new ResponsePayload(libVer, appVer, deviceId, customerId, tempCustomerId, fingerprint, eventType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponsePayload)) {
            return false;
        }
        ResponsePayload responsePayload = (ResponsePayload) other;
        return u890.j(this.libVer, responsePayload.libVer) && u890.j(this.appVer, responsePayload.appVer) && u890.j(this.deviceId, responsePayload.deviceId) && u890.j(this.customerId, responsePayload.customerId) && u890.j(this.tempCustomerId, responsePayload.tempCustomerId) && u890.j(this.fingerprint, responsePayload.fingerprint) && u890.j(this.eventType, responsePayload.eventType);
    }

    public final String getAppVer() {
        return this.appVer;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final Fingerprint getFingerprint() {
        return this.fingerprint;
    }

    public final String getLibVer() {
        return this.libVer;
    }

    public final String getTempCustomerId() {
        return this.tempCustomerId;
    }

    public int hashCode() {
        int iD = cy30.d(cy30.d(this.libVer.hashCode() * 31, 31, this.appVer), 31, this.deviceId);
        String str = this.customerId;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tempCustomerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Fingerprint fingerprint = this.fingerprint;
        int iHashCode3 = (iHashCode2 + (fingerprint == null ? 0 : fingerprint.hashCode())) * 31;
        String str3 = this.eventType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbN = gvg.n("ResponsePayload(libVer=", this.libVer, ", appVer=", this.appVer, ", deviceId=");
        bb00.j(sbN, this.deviceId, ", customerId=", this.customerId, ", tempCustomerId=");
        sbN.append(this.tempCustomerId);
        sbN.append(", fingerprint=");
        sbN.append(this.fingerprint);
        sbN.append(", eventType=");
        return l1d.n(this.eventType, ")", sbN);
    }

    public ResponsePayload(String str, String str2, String str3, String str4, String str5, Fingerprint fingerprint, String str6) {
        this.libVer = str;
        this.appVer = str2;
        this.deviceId = str3;
        this.customerId = str4;
        this.tempCustomerId = str5;
        this.fingerprint = fingerprint;
        this.eventType = str6;
    }

    public ResponsePayload() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
