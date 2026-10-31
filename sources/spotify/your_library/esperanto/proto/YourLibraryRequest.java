package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gvm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryRequest extends h implements v2j0 {
    private static final YourLibraryRequest DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PREDEFINED_PLAYLIST_CONFIGS_FIELD_NUMBER = 4;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 5;
    private int bitField0_;
    private YourLibraryRequestHeader header_;
    private YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs predefinedPlaylistConfigs_;
    private int updateThrottling_;

    static {
        YourLibraryRequest yourLibraryRequest = new YourLibraryRequest();
        DEFAULT_INSTANCE = yourLibraryRequest;
        h.registerDefaultInstance(YourLibraryRequest.class, yourLibraryRequest);
    }

    private YourLibraryRequest() {
    }

    public static gvm1 o() {
        return (gvm1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0001\u0005\u0004", new Object[]{"bitField0_", "header_", "predefinedPlaylistConfigs_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryRequest();
        }
        if (iOrdinal == 4) {
            return new gvm1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryRequest.class) {
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

    public final YourLibraryRequestHeader n() {
        YourLibraryRequestHeader yourLibraryRequestHeader = this.header_;
        return yourLibraryRequestHeader == null ? YourLibraryRequestHeader.o() : yourLibraryRequestHeader;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(YourLibraryRequestHeader yourLibraryRequestHeader) {
        yourLibraryRequestHeader.getClass();
        this.header_ = yourLibraryRequestHeader;
        this.bitField0_ |= 1;
    }

    public final void q(YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigs) {
        yourLibraryPredefinedPlaylistConfigs.getClass();
        this.predefinedPlaylistConfigs_ = yourLibraryPredefinedPlaylistConfigs;
        this.bitField0_ |= 2;
    }

    public final void r(int i) {
        this.updateThrottling_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
