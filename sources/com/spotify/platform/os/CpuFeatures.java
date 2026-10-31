package com.spotify.platform.os;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/platform/os/CpuFeatures;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_platform_os-os"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class CpuFeatures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int cpuFamily = 0;
    private static final long cpuFeatures = 0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00058Æ\u0001X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\b8Æ\u0001X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/spotify/platform/os/CpuFeatures$Companion;", "", "<init>", "()V", "cpuFeatures", "", "getCpuFeatures$annotations", "cpuFamily", "", "getCpuFamily$annotations", "src_main_java_com_spotify_platform_os-os"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCpuFamily$annotations() {
        }

        public static /* synthetic */ void getCpuFeatures$annotations() {
        }

        public final int getCpuFamily() {
            return CpuFeatures.getCpuFamily();
        }

        public final long getCpuFeatures() {
            return CpuFeatures.getCpuFeatures();
        }

        private Companion() {
        }
    }

    public static final native int getCpuFamily();

    public static final native long getCpuFeatures();
}
