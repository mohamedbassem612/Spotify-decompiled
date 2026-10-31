package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CanMessageUsersRequest extends h implements CanMessageUsersRequestOrBuilder {
    private static final CanMessageUsersRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARED_HIERARCHY_TYPE_FILTER_FIELD_NUMBER = 2;
    public static final int TARGET_USERNAMES_FIELD_NUMBER = 1;
    private int bitField0_;
    private int sharedHierarchyTypeFilter_;
    private h290 targetUsernames_ = h.emptyProtobufList();

    static {
        CanMessageUsersRequest canMessageUsersRequest = new CanMessageUsersRequest();
        DEFAULT_INSTANCE = canMessageUsersRequest;
        h.registerDefaultInstance(CanMessageUsersRequest.class, canMessageUsersRequest);
    }

    private CanMessageUsersRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetUsernames(Iterable<String> iterable) {
        ensureTargetUsernamesIsMutable();
        s8.addAll(iterable, this.targetUsernames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetUsernames(String str) {
        str.getClass();
        ensureTargetUsernamesIsMutable();
        this.targetUsernames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetUsernamesBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureTargetUsernamesIsMutable();
        this.targetUsernames_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharedHierarchyTypeFilter() {
        this.bitField0_ &= -2;
        this.sharedHierarchyTypeFilter_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetUsernames() {
        this.targetUsernames_ = h.emptyProtobufList();
    }

    private void ensureTargetUsernamesIsMutable() {
        h290 h290Var = this.targetUsernames_;
        if (((i9) h290Var).a) {
            return;
        }
        this.targetUsernames_ = h.mutableCopy(h290Var);
    }

    public static CanMessageUsersRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CanMessageUsersRequest parseDelimitedFrom(InputStream inputStream) {
        return (CanMessageUsersRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersRequest parseFrom(ByteBuffer byteBuffer) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedHierarchyTypeFilter(HierarchyType hierarchyType) {
        this.sharedHierarchyTypeFilter_ = hierarchyType.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedHierarchyTypeFilterValue(int i) {
        this.bitField0_ |= 1;
        this.sharedHierarchyTypeFilter_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetUsernames(int i, String str) {
        str.getClass();
        ensureTargetUsernamesIsMutable();
        this.targetUsernames_.set(i, str);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဌ\u0000", new Object[]{"bitField0_", "targetUsernames_", "sharedHierarchyTypeFilter_"});
        }
        if (iOrdinal == 3) {
            return new CanMessageUsersRequest();
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
        synchronized (CanMessageUsersRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public HierarchyType getSharedHierarchyTypeFilter() {
        HierarchyType hierarchyTypeForNumber = HierarchyType.forNumber(this.sharedHierarchyTypeFilter_);
        return hierarchyTypeForNumber == null ? HierarchyType.UNRECOGNIZED : hierarchyTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public int getSharedHierarchyTypeFilterValue() {
        return this.sharedHierarchyTypeFilter_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public String getTargetUsernames(int i) {
        return (String) this.targetUsernames_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public phc getTargetUsernamesBytes(int i) {
        return phc.i((String) this.targetUsernames_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public int getTargetUsernamesCount() {
        return this.targetUsernames_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public List<String> getTargetUsernamesList() {
        return this.targetUsernames_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public boolean hasSharedHierarchyTypeFilter() {
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

    public static Builder newBuilder(CanMessageUsersRequest canMessageUsersRequest) {
        return DEFAULT_INSTANCE.createBuilder(canMessageUsersRequest);
    }

    public static CanMessageUsersRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CanMessageUsersRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CanMessageUsersRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CanMessageUsersRequest parseFrom(phc phcVar) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CanMessageUsersRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CanMessageUsersRequest parseFrom(byte[] bArr) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CanMessageUsersRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CanMessageUsersRequest parseFrom(InputStream inputStream) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CanMessageUsersRequest parseFrom(lwg lwgVar) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CanMessageUsersRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CanMessageUsersRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
