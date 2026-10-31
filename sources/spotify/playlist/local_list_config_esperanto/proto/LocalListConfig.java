package spotify.playlist.local_list_config_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kfe0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class LocalListConfig extends h implements v2j0 {
    private static final LocalListConfig DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String name_ = "";
    private String imageUri_ = "";
    private String description_ = "";

    static {
        LocalListConfig localListConfig = new LocalListConfig();
        DEFAULT_INSTANCE = localListConfig;
        h.registerDefaultInstance(LocalListConfig.class, localListConfig);
    }

    private LocalListConfig() {
    }

    public static kfe0 n() {
        return (kfe0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "name_", "imageUri_", "description_"});
        }
        if (iOrdinal == 3) {
            return new LocalListConfig();
        }
        if (iOrdinal == 4) {
            return new kfe0(DEFAULT_INSTANCE);
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
        synchronized (LocalListConfig.class) {
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

    public final void o(String str) {
        this.description_ = str;
    }

    public final void p(String str) {
        this.imageUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.name_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
