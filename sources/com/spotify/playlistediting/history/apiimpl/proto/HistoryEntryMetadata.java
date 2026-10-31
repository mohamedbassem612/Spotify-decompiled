package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tla1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class HistoryEntryMetadata extends h implements v2j0 {
    public static final int CHANGE_MADE_BY_USERNAME_FIELD_NUMBER = 2;
    public static final int CREATION_INFO_FIELD_NUMBER = 3;
    public static final int DECISION_ID_FIELD_NUMBER = 7;
    private static final HistoryEntryMetadata DEFAULT_INSTANCE;
    public static final int HISTORY_RESTORE_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_TOOL_FIELD_NUMBER = 6;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int bitField0_;
    private CreationInfo creationInfo_;
    private HistoryRestore historyRestore_;
    private int sourceTool_;
    private Timestamp timestamp_;
    private String changeMadeByUsername_ = "";
    private String interactionId_ = "";
    private String decisionId_ = "";

    static {
        HistoryEntryMetadata historyEntryMetadata = new HistoryEntryMetadata();
        DEFAULT_INSTANCE = historyEntryMetadata;
        h.registerDefaultInstance(HistoryEntryMetadata.class, historyEntryMetadata);
    }

    private HistoryEntryMetadata() {
    }

    public static HistoryEntryMetadata p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ለ\u0004\u0006ဌ\u0005\u0007ለ\u0006", new Object[]{"bitField0_", "timestamp_", "changeMadeByUsername_", "creationInfo_", "historyRestore_", "interactionId_", "sourceTool_", "decisionId_"});
        }
        if (iOrdinal == 3) {
            return new HistoryEntryMetadata();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (HistoryEntryMetadata.class) {
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

    public final boolean hasCreationInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public final String n() {
        return this.changeMadeByUsername_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CreationInfo o() {
        CreationInfo creationInfo = this.creationInfo_;
        return creationInfo == null ? CreationInfo.n() : creationInfo;
    }

    public final HistoryRestore q() {
        HistoryRestore historyRestore = this.historyRestore_;
        return historyRestore == null ? HistoryRestore.n() : historyRestore;
    }

    public final tla1 r() {
        tla1 tla1Var;
        int i = this.sourceTool_;
        if (i == 0) {
            tla1Var = tla1.SOURCE_TOOL_UNSPECIFIED;
        } else if (i != 1) {
            tla1Var = i != 2 ? null : tla1.SOURCE_TOOL_STUDIO_AGENT;
        } else {
            tla1Var = tla1.SOURCE_TOOL_PROMPT;
        }
        return tla1Var == null ? tla1.UNRECOGNIZED : tla1Var;
    }

    public final Timestamp s() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean t() {
        return (this.bitField0_ & 8) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
