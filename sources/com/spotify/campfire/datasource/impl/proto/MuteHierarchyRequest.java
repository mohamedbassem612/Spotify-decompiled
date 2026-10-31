package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.ifv;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class MuteHierarchyRequest extends h implements MuteHierarchyRequestOrBuilder {
    private static final MuteHierarchyRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Duration duration_;
    private String hierarchyId_ = "";

    static {
        MuteHierarchyRequest muteHierarchyRequest = new MuteHierarchyRequest();
        DEFAULT_INSTANCE = muteHierarchyRequest;
        h.registerDefaultInstance(MuteHierarchyRequest.class, muteHierarchyRequest);
    }

    private MuteHierarchyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    public static MuteHierarchyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDuration(Duration duration) {
        duration.getClass();
        Duration duration2 = this.duration_;
        if (duration2 == null || duration2 == Duration.n()) {
            this.duration_ = duration;
        } else {
            this.duration_ = (Duration) ((ifv) Duration.r(this.duration_).mergeFrom((h) duration)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MuteHierarchyRequest parseDelimitedFrom(InputStream inputStream) {
        return (MuteHierarchyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MuteHierarchyRequest parseFrom(ByteBuffer byteBuffer) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(Duration duration) {
        duration.getClass();
        this.duration_ = duration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.hierarchyId_ = phcVar.v();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "hierarchyId_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new MuteHierarchyRequest();
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
        synchronized (MuteHierarchyRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequestOrBuilder
    public boolean hasDuration() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(MuteHierarchyRequest muteHierarchyRequest) {
        return DEFAULT_INSTANCE.createBuilder(muteHierarchyRequest);
    }

    public static MuteHierarchyRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (MuteHierarchyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static MuteHierarchyRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static MuteHierarchyRequest parseFrom(phc phcVar) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static MuteHierarchyRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static MuteHierarchyRequest parseFrom(byte[] bArr) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MuteHierarchyRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static MuteHierarchyRequest parseFrom(InputStream inputStream) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MuteHierarchyRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static MuteHierarchyRequest parseFrom(lwg lwgVar) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static MuteHierarchyRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (MuteHierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
