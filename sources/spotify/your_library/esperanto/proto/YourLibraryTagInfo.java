package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryTagInfo extends h implements v2j0 {
    private static final YourLibraryTagInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TAG_NAME_FIELD_NUMBER = 1;
    private String tagName_ = "";

    static {
        YourLibraryTagInfo yourLibraryTagInfo = new YourLibraryTagInfo();
        DEFAULT_INSTANCE = yourLibraryTagInfo;
        h.registerDefaultInstance(YourLibraryTagInfo.class, yourLibraryTagInfo);
    }

    private YourLibraryTagInfo() {
    }

    public static YourLibraryTagInfo n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"tagName_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryTagInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (YourLibraryTagInfo.class) {
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

    public final String getTagName() {
        return this.tagName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
