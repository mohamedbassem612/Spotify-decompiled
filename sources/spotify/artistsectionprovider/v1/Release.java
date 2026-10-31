package spotify.artistsectionprovider.v1;

import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uic;
import p.v2j0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Release extends h implements v2j0 {
    private static final Release DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private static final c290 tags_converter_ = new uic((byte) 22);
    private int tagsMemoizedSerializedSize;
    private String uri_ = "";
    private b290 tags_ = h.emptyIntList();

    static {
        Release release = new Release();
        DEFAULT_INSTANCE = release;
        h.registerDefaultInstance(Release.class, release);
    }

    private Release() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"uri_", "tags_"});
        }
        if (iOrdinal == 3) {
            return new Release();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (Release.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final List n() {
        return new d290(this.tags_, tags_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
