package com.spotify.cosmos.util.policy.proto;

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
public final class TrackSyncDecorationPolicy extends h implements TrackSyncDecorationPolicyOrBuilder {
    private static final TrackSyncDecorationPolicy DEFAULT_INSTANCE;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private boolean offlineState_;
    private boolean syncProgress_;

    static {
        TrackSyncDecorationPolicy trackSyncDecorationPolicy = new TrackSyncDecorationPolicy();
        DEFAULT_INSTANCE = trackSyncDecorationPolicy;
        h.registerDefaultInstance(TrackSyncDecorationPolicy.class, trackSyncDecorationPolicy);
    }

    private TrackSyncDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfflineState() {
        this.offlineState_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.syncProgress_ = false;
    }

    public static TrackSyncDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackSyncDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (TrackSyncDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackSyncDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineState(boolean z) {
        this.offlineState_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncProgress(boolean z) {
        this.syncProgress_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"offlineState_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new TrackSyncDecorationPolicy();
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
        synchronized (TrackSyncDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicyOrBuilder
    public boolean getOfflineState() {
        return this.offlineState_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicyOrBuilder
    public boolean getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackSyncDecorationPolicy trackSyncDecorationPolicy) {
        return DEFAULT_INSTANCE.createBuilder(trackSyncDecorationPolicy);
    }

    public static TrackSyncDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackSyncDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackSyncDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackSyncDecorationPolicy parseFrom(phc phcVar) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackSyncDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackSyncDecorationPolicy parseFrom(byte[] bArr) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackSyncDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackSyncDecorationPolicy parseFrom(InputStream inputStream) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackSyncDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackSyncDecorationPolicy parseFrom(lwg lwgVar) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackSyncDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackSyncDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
