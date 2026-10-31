package app.p000rive;

import kotlin.Metadata;
import p.bb00;
import p.cy30;
import p.fd21;
import p.gvg;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lapp/rive/RiveFileAsset;", "", "name", "", "registrationKey", "assetId", "", "cdnUuid", "cdnBaseUrl", "fileExtension", "typeKey", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAssetId", "()J", "getCdnBaseUrl", "()Ljava/lang/String;", "getCdnUuid", "getFileExtension", "getName", "getRegistrationKey", "getTypeKey", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RiveFileAsset {
    public static final int $stable = 0;
    private final long assetId;
    private final String cdnBaseUrl;
    private final String cdnUuid;
    private final String fileExtension;
    private final String name;
    private final String registrationKey;
    private final int typeKey;

    public RiveFileAsset(String str, String str2, long j, String str3, String str4, String str5, int i) {
        this.name = str;
        this.registrationKey = str2;
        this.assetId = j;
        this.cdnUuid = str3;
        this.cdnBaseUrl = str4;
        this.fileExtension = str5;
        this.typeKey = i;
    }

    public static /* synthetic */ RiveFileAsset copy$default(RiveFileAsset riveFileAsset, String str, String str2, long j, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = riveFileAsset.name;
        }
        if ((i2 & 2) != 0) {
            str2 = riveFileAsset.registrationKey;
        }
        if ((i2 & 4) != 0) {
            j = riveFileAsset.assetId;
        }
        if ((i2 & 8) != 0) {
            str3 = riveFileAsset.cdnUuid;
        }
        if ((i2 & 16) != 0) {
            str4 = riveFileAsset.cdnBaseUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = riveFileAsset.fileExtension;
        }
        if ((i2 & 64) != 0) {
            i = riveFileAsset.typeKey;
        }
        long j2 = j;
        return riveFileAsset.copy(str, str2, j2, str3, str4, str5, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegistrationKey() {
        return this.registrationKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAssetId() {
        return this.assetId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCdnUuid() {
        return this.cdnUuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCdnBaseUrl() {
        return this.cdnBaseUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTypeKey() {
        return this.typeKey;
    }

    public final RiveFileAsset copy(String name, String registrationKey, long assetId, String cdnUuid, String cdnBaseUrl, String fileExtension, int typeKey) {
        return new RiveFileAsset(name, registrationKey, assetId, cdnUuid, cdnBaseUrl, fileExtension, typeKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiveFileAsset)) {
            return false;
        }
        RiveFileAsset riveFileAsset = (RiveFileAsset) other;
        return u890.j(this.name, riveFileAsset.name) && u890.j(this.registrationKey, riveFileAsset.registrationKey) && this.assetId == riveFileAsset.assetId && u890.j(this.cdnUuid, riveFileAsset.cdnUuid) && u890.j(this.cdnBaseUrl, riveFileAsset.cdnBaseUrl) && u890.j(this.fileExtension, riveFileAsset.fileExtension) && this.typeKey == riveFileAsset.typeKey;
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public final String getCdnBaseUrl() {
        return this.cdnBaseUrl;
    }

    public final String getCdnUuid() {
        return this.cdnUuid;
    }

    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRegistrationKey() {
        return this.registrationKey;
    }

    public final int getTypeKey() {
        return this.typeKey;
    }

    public int hashCode() {
        return Integer.hashCode(this.typeKey) + cy30.d(cy30.d(cy30.d(cy30.f(cy30.d(this.name.hashCode() * 31, 31, this.registrationKey), this.assetId, 31), 31, this.cdnUuid), 31, this.cdnBaseUrl), 31, this.fileExtension);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.registrationKey;
        long j = this.assetId;
        String str3 = this.cdnUuid;
        String str4 = this.cdnBaseUrl;
        String str5 = this.fileExtension;
        int i = this.typeKey;
        StringBuilder sbN = gvg.n("RiveFileAsset(name=", str, ", registrationKey=", str2, ", assetId=");
        sbN.append(j);
        sbN.append(", cdnUuid=");
        sbN.append(str3);
        bb00.j(sbN, ", cdnBaseUrl=", str4, ", fileExtension=", str5);
        return fd21.h(sbN, ", typeKey=", i, ")");
    }
}
