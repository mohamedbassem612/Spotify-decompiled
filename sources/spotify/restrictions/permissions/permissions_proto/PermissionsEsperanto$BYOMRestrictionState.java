package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.tns0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PermissionsEsperanto$BYOMRestrictionState extends h implements v2j0 {
    private static final PermissionsEsperanto$BYOMRestrictionState DEFAULT_INSTANCE;
    public static final int IS_ACTIVE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private boolean isActive_;
    private int reason_;

    static {
        PermissionsEsperanto$BYOMRestrictionState permissionsEsperanto$BYOMRestrictionState = new PermissionsEsperanto$BYOMRestrictionState();
        DEFAULT_INSTANCE = permissionsEsperanto$BYOMRestrictionState;
        h.registerDefaultInstance(PermissionsEsperanto$BYOMRestrictionState.class, permissionsEsperanto$BYOMRestrictionState);
    }

    private PermissionsEsperanto$BYOMRestrictionState() {
    }

    public static PermissionsEsperanto$BYOMRestrictionState p(byte[] bArr) {
        return (PermissionsEsperanto$BYOMRestrictionState) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"isActive_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$BYOMRestrictionState();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (PermissionsEsperanto$BYOMRestrictionState.class) {
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

    public final boolean n() {
        return this.isActive_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final tns0 o() {
        tns0 tns0Var;
        int i = this.reason_;
        if (i == 0) {
            tns0Var = tns0.REASON_UNSPECIFIED;
        } else if (i != 1) {
            tns0Var = i != 2 ? null : tns0.REASON_NON_MUSIC_CHOSEN;
        } else {
            tns0Var = tns0.REASON_CLIENT_REQUEST;
        }
        return tns0Var == null ? tns0.UNRECOGNIZED : tns0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
