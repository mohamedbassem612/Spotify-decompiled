package com.spotify.externalintegration.ubi;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/externalintegration/ubi/UbiSpecificationId;", "", "ANDROID_AUTO_CONTENT_LIST", "UNKNOWN", "src_main_java_com_spotify_externalintegration_ubi-ubi"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class UbiSpecificationId {
    public static final UbiSpecificationId ANDROID_AUTO_CONTENT_LIST;
    public static final UbiSpecificationId UNKNOWN;
    public static final /* synthetic */ UbiSpecificationId[] a;

    static {
        UbiSpecificationId ubiSpecificationId = new UbiSpecificationId("ANDROID_AUTO_CONTENT_LIST", 0);
        ANDROID_AUTO_CONTENT_LIST = ubiSpecificationId;
        UbiSpecificationId ubiSpecificationId2 = new UbiSpecificationId("UNKNOWN", 1);
        UNKNOWN = ubiSpecificationId2;
        a = new UbiSpecificationId[]{ubiSpecificationId, ubiSpecificationId2};
    }

    public static UbiSpecificationId valueOf(String str) {
        return (UbiSpecificationId) Enum.valueOf(UbiSpecificationId.class, str);
    }

    public static UbiSpecificationId[] values() {
        return (UbiSpecificationId[]) a.clone();
    }
}
