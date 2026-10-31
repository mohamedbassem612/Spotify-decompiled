package com.spotify.campfire.datasource.impl.proto;

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
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class LeaveGroupRequest extends h implements LeaveGroupRequestOrBuilder {
    private static final LeaveGroupRequest DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    public static final int LEAVE_MODE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String hierarchyId_ = "";
    private int leaveMode_;

    static {
        LeaveGroupRequest leaveGroupRequest = new LeaveGroupRequest();
        DEFAULT_INSTANCE = leaveGroupRequest;
        h.registerDefaultInstance(LeaveGroupRequest.class, leaveGroupRequest);
    }

    private LeaveGroupRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeaveMode() {
        this.leaveMode_ = 0;
    }

    public static LeaveGroupRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LeaveGroupRequest parseDelimitedFrom(InputStream inputStream) {
        return (LeaveGroupRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LeaveGroupRequest parseFrom(ByteBuffer byteBuffer) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaveMode(LeaveMode leaveMode) {
        this.leaveMode_ = leaveMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaveModeValue(int i) {
        this.leaveMode_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"hierarchyId_", "leaveMode_"});
        }
        if (iOrdinal == 3) {
            return new LeaveGroupRequest();
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
        synchronized (LeaveGroupRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.LeaveGroupRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LeaveGroupRequestOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LeaveGroupRequestOrBuilder
    public LeaveMode getLeaveMode() {
        LeaveMode leaveModeForNumber = LeaveMode.forNumber(this.leaveMode_);
        return leaveModeForNumber == null ? LeaveMode.UNRECOGNIZED : leaveModeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LeaveGroupRequestOrBuilder
    public int getLeaveModeValue() {
        return this.leaveMode_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(LeaveGroupRequest leaveGroupRequest) {
        return DEFAULT_INSTANCE.createBuilder(leaveGroupRequest);
    }

    public static LeaveGroupRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (LeaveGroupRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static LeaveGroupRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static LeaveGroupRequest parseFrom(phc phcVar) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static LeaveGroupRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static LeaveGroupRequest parseFrom(byte[] bArr) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LeaveGroupRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static LeaveGroupRequest parseFrom(InputStream inputStream) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LeaveGroupRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static LeaveGroupRequest parseFrom(lwg lwgVar) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static LeaveGroupRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (LeaveGroupRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
