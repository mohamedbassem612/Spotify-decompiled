package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w831;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ResumptionProgressEsperanto$GetDetailsResponse extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$GetDetailsResponse DEFAULT_INSTANCE;
    public static final int ITEM_DETAILS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private h290 itemDetails_ = h.emptyProtobufList();
    private int result_;

    static {
        ResumptionProgressEsperanto$GetDetailsResponse resumptionProgressEsperanto$GetDetailsResponse = new ResumptionProgressEsperanto$GetDetailsResponse();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetDetailsResponse;
        h.registerDefaultInstance(ResumptionProgressEsperanto$GetDetailsResponse.class, resumptionProgressEsperanto$GetDetailsResponse);
    }

    private ResumptionProgressEsperanto$GetDetailsResponse() {
    }

    public static ResumptionProgressEsperanto$GetDetailsResponse p(byte[] bArr) {
        return (ResumptionProgressEsperanto$GetDetailsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"result_", "itemDetails_", ResumptionProgressEsperanto.ItemDetails.class});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetDetailsResponse();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ResumptionProgressEsperanto$GetDetailsResponse.class) {
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
        return this.itemDetails_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final w831 o() {
        w831 w831VarA = w831.a(this.result_);
        return w831VarA == null ? w831.UNRECOGNIZED : w831VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
