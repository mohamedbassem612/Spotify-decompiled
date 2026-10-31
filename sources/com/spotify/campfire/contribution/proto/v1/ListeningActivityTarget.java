package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.ghd0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ListeningActivityTarget extends h implements v2j0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final ListeningActivityTarget DEFAULT_INSTANCE;
    public static final int OWNER_USER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp timestamp_;
    private String ownerUser_ = "";
    private String trackUri_ = "";
    private String contextUri_ = "";

    static {
        ListeningActivityTarget listeningActivityTarget = new ListeningActivityTarget();
        DEFAULT_INSTANCE = listeningActivityTarget;
        h.registerDefaultInstance(ListeningActivityTarget.class, listeningActivityTarget);
    }

    private ListeningActivityTarget() {
    }

    public static ListeningActivityTarget o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ghd0 t() {
        return (ghd0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "ownerUser_", "trackUri_", "contextUri_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new ListeningActivityTarget();
        }
        if (iOrdinal == 4) {
            return new ghd0(DEFAULT_INSTANCE);
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
        synchronized (ListeningActivityTarget.class) {
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

    public final boolean hasTimestamp() {
        return (this.bitField0_ & 2) != 0;
    }

    public final String n() {
        return this.contextUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.ownerUser_;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final String r() {
        return this.trackUri_;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.contextUri_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.ownerUser_ = str;
    }

    public final void w(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
        this.bitField0_ |= 2;
    }

    public final void x(String str) {
        str.getClass();
        this.trackUri_ = str;
    }
}
