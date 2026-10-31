package com.spotify.authentication.credentials;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.gvg;
import p.l1d;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/spotify/authentication/credentials/SerializableCredentials;", "", "username", "", "authBlob", "", "deviceId", "<init>", "(Ljava/lang/String;[BLjava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "getAuthBlob", "()[B", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_authentication_credentials-credentials"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final /* data */ class SerializableCredentials {
    private final byte[] authBlob;
    private final String deviceId;
    private final String username;

    public /* synthetic */ SerializableCredentials(String str, byte[] bArr, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getDeviceId() {
        return this.deviceId;
    }

    public static /* synthetic */ SerializableCredentials copy$default(SerializableCredentials serializableCredentials, String str, byte[] bArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serializableCredentials.username;
        }
        if ((i & 2) != 0) {
            bArr = serializableCredentials.authBlob;
        }
        if ((i & 4) != 0) {
            str2 = serializableCredentials.deviceId;
        }
        return serializableCredentials.copy(str, bArr, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getAuthBlob() {
        return this.authBlob;
    }

    public final SerializableCredentials copy(String username, byte[] authBlob, String deviceId) {
        return new SerializableCredentials(username, authBlob, deviceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerializableCredentials)) {
            return false;
        }
        SerializableCredentials serializableCredentials = (SerializableCredentials) other;
        return u890.j(this.username, serializableCredentials.username) && u890.j(this.authBlob, serializableCredentials.authBlob) && u890.j(this.deviceId, serializableCredentials.deviceId);
    }

    public final byte[] getAuthBlob() {
        return this.authBlob;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        byte[] bArr = this.authBlob;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        String str2 = this.deviceId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return l1d.n(this.deviceId, ")", gvg.n("SerializableCredentials(username=", this.username, ", authBlob=", Arrays.toString(this.authBlob), ", deviceId="));
    }

    public SerializableCredentials(String str, byte[] bArr, String str2) {
        this.username = str;
        this.authBlob = bArr;
        this.deviceId = str2;
    }

    public SerializableCredentials() {
        this(null, null, null, 7, null);
    }
}
