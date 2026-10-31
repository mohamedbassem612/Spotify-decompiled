package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Promptableplaylist$Status extends h implements v2j0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Promptableplaylist$Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int code_;
    private String message_ = "";
    private h290 details_ = h.emptyProtobufList();

    static {
        Promptableplaylist$Status promptableplaylist$Status = new Promptableplaylist$Status();
        DEFAULT_INSTANCE = promptableplaylist$Status;
        h.registerDefaultInstance(Promptableplaylist$Status.class, promptableplaylist$Status);
    }

    private Promptableplaylist$Status() {
    }

    public static Promptableplaylist$Status o(byte[] bArr) {
        return (Promptableplaylist$Status) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", Any.class});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$Status();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (Promptableplaylist$Status.class) {
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
        return this.details_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
