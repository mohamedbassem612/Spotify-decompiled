package spotify.artistsectionprovider.v1.popularreleases;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PopularReleases extends h implements v2j0 {
    private static final PopularReleases DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RELEASES_FIELD_NUMBER = 1;
    private h290 releases_ = h.emptyProtobufList();

    static {
        PopularReleases popularReleases = new PopularReleases();
        DEFAULT_INSTANCE = popularReleases;
        h.registerDefaultInstance(PopularReleases.class, popularReleases);
    }

    private PopularReleases() {
    }

    public static PopularReleases o(byte[] bArr) {
        return (PopularReleases) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"releases_", Release.class});
        }
        if (iOrdinal == 3) {
            return new PopularReleases();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (PopularReleases.class) {
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
        return this.releases_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
