package spotify.your_library_tags_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class YourLibraryTagsResponse extends h implements v2j0 {
    public static final int CLASS_GROUP_FIELD_NUMBER = 3;
    private static final YourLibraryTagsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 classGroup_ = h.emptyProtobufList();

    static {
        YourLibraryTagsResponse yourLibraryTagsResponse = new YourLibraryTagsResponse();
        DEFAULT_INSTANCE = yourLibraryTagsResponse;
        h.registerDefaultInstance(YourLibraryTagsResponse.class, yourLibraryTagsResponse);
    }

    private YourLibraryTagsResponse() {
    }

    public static YourLibraryTagsResponse o() {
        return DEFAULT_INSTANCE;
    }

    public static YourLibraryTagsResponse p(byte[] bArr) {
        return (YourLibraryTagsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"classGroup_", DecoratedClass.class});
        }
        if (iOrdinal == 3) {
            return new YourLibraryTagsResponse();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (YourLibraryTagsResponse.class) {
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

    public final h290 n() {
        return this.classGroup_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
