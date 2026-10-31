package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;
import p.yns0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PermissionsEsperanto$QueueQueryResponse extends h implements v2j0 {
    private static final PermissionsEsperanto$QueueQueryResponse DEFAULT_INSTANCE;
    public static final int IS_ALLOWED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean isAllowed_;
    private int result_;

    static {
        PermissionsEsperanto$QueueQueryResponse permissionsEsperanto$QueueQueryResponse = new PermissionsEsperanto$QueueQueryResponse();
        DEFAULT_INSTANCE = permissionsEsperanto$QueueQueryResponse;
        h.registerDefaultInstance(PermissionsEsperanto$QueueQueryResponse.class, permissionsEsperanto$QueueQueryResponse);
    }

    private PermissionsEsperanto$QueueQueryResponse() {
    }

    public static PermissionsEsperanto$QueueQueryResponse p(byte[] bArr) {
        return (PermissionsEsperanto$QueueQueryResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"result_", "isAllowed_"});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$QueueQueryResponse();
        }
        if (iOrdinal == 4) {
            return new sas0((byte) 27);
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
        synchronized (PermissionsEsperanto$QueueQueryResponse.class) {
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

    public final yns0 o() {
        yns0 yns0Var;
        int i = this.result_;
        if (i == 0) {
            yns0Var = yns0.QUEUE_PERMISSION_RESULTS_ALLOWED;
        } else if (i == 1) {
            yns0Var = yns0.QUEUE_PERMISSION_RESULTS_ALLOWED_UNCAPPED_PNS;
        } else if (i != 2) {
            yns0Var = i != 3 ? null : yns0.QUEUE_PERMISSION_RESULTS_DISALLOWED_CAPPED_PNS;
        } else {
            yns0Var = yns0.QUEUE_PERMISSION_RESULTS_DISALLOWED_MFT;
        }
        return yns0Var == null ? yns0.UNRECOGNIZED : yns0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
