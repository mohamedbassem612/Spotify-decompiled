package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;
import p.w831;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$MarkAsFinishedResponse extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$MarkAsFinishedResponse DEFAULT_INSTANCE;
    public static final int ITEM_RESULT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private h290 itemResult_ = h.emptyProtobufList();
    private int result_;

    static {
        ResumptionProgressEsperanto$MarkAsFinishedResponse resumptionProgressEsperanto$MarkAsFinishedResponse = new ResumptionProgressEsperanto$MarkAsFinishedResponse();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$MarkAsFinishedResponse;
        h.registerDefaultInstance(ResumptionProgressEsperanto$MarkAsFinishedResponse.class, resumptionProgressEsperanto$MarkAsFinishedResponse);
    }

    private ResumptionProgressEsperanto$MarkAsFinishedResponse() {
    }

    public static ResumptionProgressEsperanto$MarkAsFinishedResponse p(byte[] bArr) {
        return (ResumptionProgressEsperanto$MarkAsFinishedResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"result_", "itemResult_", ResumptionProgressEsperanto$ItemMarkResult.class});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$MarkAsFinishedResponse();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ResumptionProgressEsperanto$MarkAsFinishedResponse.class) {
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
        return this.itemResult_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final w831 o() {
        w831 w831VarA = w831.a(this.result_);
        return w831VarA == null ? w831.X : w831VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
