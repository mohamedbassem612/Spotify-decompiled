package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.ssm1;
import p.v2j0;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class YourLibraryContainsRequest extends h implements v2j0 {
    private static final YourLibraryContainsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREDEFINED_PLAYLIST_CONFIGS_FIELD_NUMBER = 4;
    public static final int REQUESTED_URI_FIELD_NUMBER = 3;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 5;
    private int bitField0_;
    private YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs predefinedPlaylistConfigs_;
    private h290 requestedUri_ = h.emptyProtobufList();
    private int updateThrottling_;

    static {
        YourLibraryContainsRequest yourLibraryContainsRequest = new YourLibraryContainsRequest();
        DEFAULT_INSTANCE = yourLibraryContainsRequest;
        h.registerDefaultInstance(YourLibraryContainsRequest.class, yourLibraryContainsRequest);
    }

    private YourLibraryContainsRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ssm1 q() {
        return (ssm1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0000\u0003Ț\u0004ဉ\u0000\u0005\u0004", new Object[]{"bitField0_", "requestedUri_", "predefinedPlaylistConfigs_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryContainsRequest();
        }
        if (iOrdinal == 4) {
            return new ssm1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryContainsRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.requestedUri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.requestedUri_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.requestedUri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.requestedUri_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final h290 p() {
        return this.requestedUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
