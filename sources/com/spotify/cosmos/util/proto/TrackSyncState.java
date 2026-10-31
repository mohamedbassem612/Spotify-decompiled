package com.spotify.cosmos.util.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TrackSyncState extends h implements TrackSyncStateOrBuilder {
    private static final TrackSyncState DEFAULT_INSTANCE;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String offline_ = "";
    private int syncProgress_;

    static {
        TrackSyncState trackSyncState = new TrackSyncState();
        DEFAULT_INSTANCE = trackSyncState;
        h.registerDefaultInstance(TrackSyncState.class, trackSyncState);
    }

    private TrackSyncState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffline() {
        this.bitField0_ &= -2;
        this.offline_ = getDefaultInstance().getOffline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.bitField0_ &= -3;
        this.syncProgress_ = 0;
    }

    public static TrackSyncState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackSyncState parseDelimitedFrom(InputStream inputStream) {
        return (TrackSyncState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackSyncState parseFrom(ByteBuffer byteBuffer) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffline(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.offline_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineBytes(phc phcVar) {
        this.offline_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncProgress(int i) {
        this.bitField0_ |= 2;
        this.syncProgress_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "offline_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new TrackSyncState();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (TrackSyncState.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackSyncStateOrBuilder
    public String getOffline() {
        return this.offline_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackSyncStateOrBuilder
    public phc getOfflineBytes() {
        return phc.i(this.offline_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackSyncStateOrBuilder
    public int getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackSyncStateOrBuilder
    public boolean hasOffline() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackSyncStateOrBuilder
    public boolean hasSyncProgress() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackSyncState trackSyncState) {
        return DEFAULT_INSTANCE.createBuilder(trackSyncState);
    }

    public static TrackSyncState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackSyncState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackSyncState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackSyncState parseFrom(phc phcVar) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackSyncState parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackSyncState parseFrom(byte[] bArr) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackSyncState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackSyncState parseFrom(InputStream inputStream) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackSyncState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackSyncState parseFrom(lwg lwgVar) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackSyncState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackSyncState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
