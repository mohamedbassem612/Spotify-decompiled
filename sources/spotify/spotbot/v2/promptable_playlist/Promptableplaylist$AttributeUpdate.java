package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.e1y0;
import p.j1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Promptableplaylist$AttributeUpdate extends h implements v2j0 {
    private static final Promptableplaylist$AttributeUpdate DEFAULT_INSTANCE;
    public static final int GENERATION_MODE_FIELD_NUMBER = 13;
    public static final int IS_PRIVATE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_TITLE_FIELD_NUMBER = 2;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int PROMPT_SUMMARY_FIELD_NUMBER = 3;
    public static final int REFRESH_VALUE_FIELD_NUMBER = 4;
    public static final int STOP_PERSONALIZING_PLAYLIST_FIELD_NUMBER = 5;
    private int valueCase_ = 0;
    private Object value_;

    static {
        Promptableplaylist$AttributeUpdate promptableplaylist$AttributeUpdate = new Promptableplaylist$AttributeUpdate();
        DEFAULT_INSTANCE = promptableplaylist$AttributeUpdate;
        h.registerDefaultInstance(Promptableplaylist$AttributeUpdate.class, promptableplaylist$AttributeUpdate);
    }

    private Promptableplaylist$AttributeUpdate() {
    }

    public static e1y0 n() {
        return (e1y0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\r\u0007\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005:\u0000\u0006:\u0000\r?\u0000", new Object[]{"value_", "valueCase_", Promptableplaylist$RefreshMetadata.class});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$AttributeUpdate();
        }
        if (iOrdinal == 4) {
            return new e1y0(DEFAULT_INSTANCE);
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
        synchronized (Promptableplaylist$AttributeUpdate.class) {
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

    public final void o(j1y0 j1y0Var) {
        this.value_ = Integer.valueOf(j1y0Var.getNumber());
        this.valueCase_ = 13;
    }

    public final void p(String str) {
        str.getClass();
        this.valueCase_ = 1;
        this.value_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
