package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.psm1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs extends h implements v2j0 {
    public static final int ALL_AVAILABLE_CONFIGS_PROVIDED_FIELD_NUMBER = 99;
    public static final int CACHED_FILES_FIELD_NUMBER = 5;
    private static final YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_FIELD_NUMBER = 6;
    public static final int KALLAX_FIELD_NUMBER = 7;
    public static final int LIKED_SONGS_FIELD_NUMBER = 1;
    public static final int LOCAL_FILES_FIELD_NUMBER = 8;
    public static final int NEW_EPISODES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int YOUR_EPISODES_FIELD_NUMBER = 2;
    private boolean allAvailableConfigsProvided_;
    private int bitField0_;
    private YourLibraryConfig.YourLibraryPredefinedPlaylistConfig cachedFiles_;
    private YourLibraryConfig.YourLibraryPredefinedPlaylistConfig highlights_;
    private YourLibraryConfig.YourLibraryPredefinedPlaylistConfig kallax_;
    private YourLibraryConfig.YourLibraryPredefinedPlaylistConfig likedSongs_;
    private YourLibraryConfig.YourLibraryPredefinedPlaylistConfig localFiles_;
    private YourLibraryConfig.YourLibraryLabelAndImage newEpisodes_;
    private YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourEpisodes_;

    static {
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs = new YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;
        h.registerDefaultInstance(YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.class, yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs);
    }

    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs() {
    }

    public static YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs o() {
        return DEFAULT_INSTANCE;
    }

    public static psm1 p() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001c\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006c\u0007", new Object[]{"bitField0_", "likedSongs_", "yourEpisodes_", "newEpisodes_", "cachedFiles_", "highlights_", "kallax_", "localFiles_", "allAvailableConfigsProvided_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs();
        }
        if (iOrdinal == 4) {
            return new psm1();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(boolean z) {
        this.allAvailableConfigsProvided_ = z;
    }

    public final void r(YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfig) {
        yourLibraryPredefinedPlaylistConfig.getClass();
        this.cachedFiles_ = yourLibraryPredefinedPlaylistConfig;
        this.bitField0_ |= 8;
    }

    public final void s(YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfig) {
        yourLibraryPredefinedPlaylistConfig.getClass();
        this.highlights_ = yourLibraryPredefinedPlaylistConfig;
        this.bitField0_ |= 16;
    }

    public final void t(YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfig) {
        yourLibraryPredefinedPlaylistConfig.getClass();
        this.kallax_ = yourLibraryPredefinedPlaylistConfig;
        this.bitField0_ |= 32;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfig) {
        yourLibraryPredefinedPlaylistConfig.getClass();
        this.likedSongs_ = yourLibraryPredefinedPlaylistConfig;
        this.bitField0_ |= 1;
    }

    public final void v(YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfig) {
        yourLibraryPredefinedPlaylistConfig.getClass();
        this.localFiles_ = yourLibraryPredefinedPlaylistConfig;
        this.bitField0_ |= 64;
    }

    public final void w(YourLibraryConfig.YourLibraryLabelAndImage yourLibraryLabelAndImage) {
        yourLibraryLabelAndImage.getClass();
        this.newEpisodes_ = yourLibraryLabelAndImage;
        this.bitField0_ |= 4;
    }

    public final void x(YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfig) {
        yourLibraryPredefinedPlaylistConfig.getClass();
        this.yourEpisodes_ = yourLibraryPredefinedPlaylistConfig;
        this.bitField0_ |= 2;
    }
}
