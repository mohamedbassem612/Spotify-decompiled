package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PermissionsEsperanto$CanPlayContentResponse extends h implements v2j0 {
    private static final PermissionsEsperanto$CanPlayContentResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private h290 result_ = h.emptyProtobufList();

    static {
        PermissionsEsperanto$CanPlayContentResponse permissionsEsperanto$CanPlayContentResponse = new PermissionsEsperanto$CanPlayContentResponse();
        DEFAULT_INSTANCE = permissionsEsperanto$CanPlayContentResponse;
        h.registerDefaultInstance(PermissionsEsperanto$CanPlayContentResponse.class, permissionsEsperanto$CanPlayContentResponse);
    }

    private PermissionsEsperanto$CanPlayContentResponse() {
    }

    public static PermissionsEsperanto$CanPlayContentResponse p(byte[] bArr) {
        return (PermissionsEsperanto$CanPlayContentResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"result_", PermissionsEsperanto$CanPlayContentResult.class});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$CanPlayContentResponse();
        }
        if (iOrdinal == 4) {
            return new sas0((byte) 25);
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
        synchronized (PermissionsEsperanto$CanPlayContentResponse.class) {
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

    public final h290 o() {
        return this.result_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
