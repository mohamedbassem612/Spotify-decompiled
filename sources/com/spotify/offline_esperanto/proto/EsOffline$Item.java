package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bpz;
import p.cpz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsOffline$Item extends h implements v2j0 {
    private static final EsOffline$Item DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_STATE_FIELD_NUMBER = 3;
    private int kind_;
    private int state_;
    private int syncProgress_;
    private String uri_ = "";
    private int videoState_;

    static {
        EsOffline$Item esOffline$Item = new EsOffline$Item();
        DEFAULT_INSTANCE = esOffline$Item;
        h.registerDefaultInstance(EsOffline$Item.class, esOffline$Item);
    }

    private EsOffline$Item() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u000b\u0005\f", new Object[]{"uri_", "state_", "videoState_", "syncProgress_", "kind_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Item();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 6);
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
        synchronized (EsOffline$Item.class) {
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

    public final int getSyncProgress() {
        return this.syncProgress_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final bpz o() {
        bpz bpzVarA = bpz.a(this.kind_);
        return bpzVarA == null ? bpz.d : bpzVarA;
    }

    public final cpz p() {
        cpz cpzVar;
        switch (this.state_) {
            case 0:
                cpzVar = cpz.NOT_DOWNLOADED;
                break;
            case 1:
                cpzVar = cpz.ERROR;
                break;
            case 2:
                cpzVar = cpz.DOWNLOADED_EXPIRED;
                break;
            case 3:
                cpzVar = cpz.DOWNLOADED;
                break;
            case 4:
                cpzVar = cpz.WAITING_FOR_REDOWNLOAD;
                break;
            case 5:
                cpzVar = cpz.DOWNLOADING;
                break;
            case 6:
                cpzVar = cpz.WAITING;
                break;
            case 7:
                cpzVar = cpz.WAITING_LIMIT_EXCEEDED;
                break;
            default:
                cpzVar = null;
                break;
        }
        return cpzVar == null ? cpz.UNRECOGNIZED : cpzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
