package com.spotify.connect.artisanalcastgroupcontrolesperanto.proto;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.jf40;
import p.ma6;
import p.na6;
import p.pa6;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ArtisanalCastGroupControlMutation extends h implements v2j0 {
    private static final ArtisanalCastGroupControlMutation DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int OPERATION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RAW_ENDPOINT_ID_FIELD_NUMBER = 5;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int error_;
    private int operation_;
    private String rawEndpointId_ = "";
    private long requestId_;
    private int status_;

    static {
        ArtisanalCastGroupControlMutation artisanalCastGroupControlMutation = new ArtisanalCastGroupControlMutation();
        DEFAULT_INSTANCE = artisanalCastGroupControlMutation;
        h.registerDefaultInstance(ArtisanalCastGroupControlMutation.class, artisanalCastGroupControlMutation);
    }

    private ArtisanalCastGroupControlMutation() {
    }

    public static ArtisanalCastGroupControlMutation n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003\f\u0004\f\u0005Ȉ", new Object[]{"requestId_", "operation_", "status_", "error_", "rawEndpointId_"});
        }
        if (iOrdinal == 3) {
            return new ArtisanalCastGroupControlMutation();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (ArtisanalCastGroupControlMutation.class) {
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

    public final ma6 o() {
        ma6 ma6VarA = ma6.a(this.error_);
        return ma6VarA == null ? ma6.UNRECOGNIZED : ma6VarA;
    }

    public final na6 p() {
        na6 na6Var;
        int i = this.operation_;
        if (i == 0) {
            na6Var = na6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_OPERATION_NONE;
        } else if (i != 1) {
            na6Var = i != 2 ? null : na6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_OPERATION_REMOVE_MEMBER;
        } else {
            na6Var = na6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_OPERATION_ADD_MEMBER;
        }
        return na6Var == null ? na6.UNRECOGNIZED : na6Var;
    }

    public final String q() {
        return this.rawEndpointId_;
    }

    public final long r() {
        return this.requestId_;
    }

    public final pa6 s() {
        pa6 pa6Var;
        int i = this.status_;
        if (i == 0) {
            pa6Var = pa6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_IDLE;
        } else if (i == 1) {
            pa6Var = pa6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_PENDING;
        } else if (i == 2) {
            pa6Var = pa6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_ACCEPTED;
        } else if (i == 3) {
            pa6Var = pa6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_MIGRATING;
        } else if (i != 4) {
            pa6Var = i != 5 ? null : pa6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_FAILED;
        } else {
            pa6Var = pa6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_COMPLETED;
        }
        return pa6Var == null ? pa6.UNRECOGNIZED : pa6Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
