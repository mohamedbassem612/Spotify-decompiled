package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uns0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PermissionsEsperanto$CanPlayContentRequest extends h implements v2j0 {
    public static final int CALLER_SOURCE_FIELD_NUMBER = 2;
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final PermissionsEsperanto$CanPlayContentRequest DEFAULT_INSTANCE;
    public static final int FORCE_FETCH_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private boolean forceFetch_;
    private h290 contentUri_ = h.emptyProtobufList();
    private String callerSource_ = "";

    static {
        PermissionsEsperanto$CanPlayContentRequest permissionsEsperanto$CanPlayContentRequest = new PermissionsEsperanto$CanPlayContentRequest();
        DEFAULT_INSTANCE = permissionsEsperanto$CanPlayContentRequest;
        h.registerDefaultInstance(PermissionsEsperanto$CanPlayContentRequest.class, permissionsEsperanto$CanPlayContentRequest);
    }

    private PermissionsEsperanto$CanPlayContentRequest() {
    }

    public static uns0 o() {
        return (uns0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003\u0007", new Object[]{"contentUri_", "callerSource_", "forceFetch_"});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$CanPlayContentRequest();
        }
        if (iOrdinal == 4) {
            return new uns0(DEFAULT_INSTANCE);
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
        synchronized (PermissionsEsperanto$CanPlayContentRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.contentUri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.contentUri_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.callerSource_ = str;
    }

    public final void q(boolean z) {
        this.forceFetch_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
