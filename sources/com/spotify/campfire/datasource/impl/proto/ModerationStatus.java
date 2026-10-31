package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ModerationStatus extends h implements ModerationStatusOrBuilder {
    private static final ModerationStatus DEFAULT_INSTANCE;
    public static final int DELETED_FOR_ALL_FIELD_NUMBER = 5;
    public static final int DELETED_FOR_USER_FIELD_NUMBER = 4;
    public static final int HIDDEN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVED_FIELD_NUMBER = 2;
    public static final int REPORTED_FIELD_NUMBER = 1;
    private int statusCase_ = 0;
    private Object status_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ModerationStatus$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ModerationStatus moderationStatus = new ModerationStatus();
        DEFAULT_INSTANCE = moderationStatus;
        h.registerDefaultInstance(ModerationStatus.class, moderationStatus);
    }

    private ModerationStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedForAll() {
        if (this.statusCase_ == 5) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedForUser() {
        if (this.statusCase_ == 4) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        if (this.statusCase_ == 3) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoved() {
        if (this.statusCase_ == 2) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReported() {
        if (this.statusCase_ == 1) {
            this.statusCase_ = 0;
            this.status_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.statusCase_ = 0;
        this.status_ = null;
    }

    public static ModerationStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeletedForAll(DeletedForAll deletedForAll) {
        deletedForAll.getClass();
        if (this.statusCase_ != 5 || this.status_ == DeletedForAll.getDefaultInstance()) {
            this.status_ = deletedForAll;
        } else {
            this.status_ = ((DeletedForAll.Builder) DeletedForAll.newBuilder((DeletedForAll) this.status_).mergeFrom(deletedForAll)).buildPartial();
        }
        this.statusCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeletedForUser(DeletedForUser deletedForUser) {
        deletedForUser.getClass();
        if (this.statusCase_ != 4 || this.status_ == DeletedForUser.getDefaultInstance()) {
            this.status_ = deletedForUser;
        } else {
            this.status_ = ((DeletedForUser.Builder) DeletedForUser.newBuilder((DeletedForUser) this.status_).mergeFrom(deletedForUser)).buildPartial();
        }
        this.statusCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHidden(Hidden hidden) {
        hidden.getClass();
        if (this.statusCase_ != 3 || this.status_ == Hidden.getDefaultInstance()) {
            this.status_ = hidden;
        } else {
            this.status_ = ((Hidden.Builder) Hidden.newBuilder((Hidden) this.status_).mergeFrom(hidden)).buildPartial();
        }
        this.statusCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoved(Removed removed) {
        removed.getClass();
        if (this.statusCase_ != 2 || this.status_ == Removed.getDefaultInstance()) {
            this.status_ = removed;
        } else {
            this.status_ = ((Removed.Builder) Removed.newBuilder((Removed) this.status_).mergeFrom(removed)).buildPartial();
        }
        this.statusCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReported(Reported reported) {
        reported.getClass();
        if (this.statusCase_ != 1 || this.status_ == Reported.getDefaultInstance()) {
            this.status_ = reported;
        } else {
            this.status_ = ((Reported.Builder) Reported.newBuilder((Reported) this.status_).mergeFrom(reported)).buildPartial();
        }
        this.statusCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ModerationStatus parseDelimitedFrom(InputStream inputStream) {
        return (ModerationStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModerationStatus parseFrom(ByteBuffer byteBuffer) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedForAll(DeletedForAll deletedForAll) {
        deletedForAll.getClass();
        this.status_ = deletedForAll;
        this.statusCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedForUser(DeletedForUser deletedForUser) {
        deletedForUser.getClass();
        this.status_ = deletedForUser;
        this.statusCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(Hidden hidden) {
        hidden.getClass();
        this.status_ = hidden;
        this.statusCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoved(Removed removed) {
        removed.getClass();
        this.status_ = removed;
        this.statusCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReported(Reported reported) {
        reported.getClass();
        this.status_ = reported;
        this.statusCase_ = 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"status_", "statusCase_", Reported.class, Removed.class, Hidden.class, DeletedForUser.class, DeletedForAll.class});
        }
        if (iOrdinal == 3) {
            return new ModerationStatus();
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
        synchronized (ModerationStatus.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public DeletedForAll getDeletedForAll() {
        return this.statusCase_ == 5 ? (DeletedForAll) this.status_ : DeletedForAll.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public DeletedForUser getDeletedForUser() {
        return this.statusCase_ == 4 ? (DeletedForUser) this.status_ : DeletedForUser.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public Hidden getHidden() {
        return this.statusCase_ == 3 ? (Hidden) this.status_ : Hidden.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public Removed getRemoved() {
        return this.statusCase_ == 2 ? (Removed) this.status_ : Removed.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public Reported getReported() {
        return this.statusCase_ == 1 ? (Reported) this.status_ : Reported.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public StatusCase getStatusCase() {
        return StatusCase.forNumber(this.statusCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasDeletedForAll() {
        return this.statusCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasDeletedForUser() {
        return this.statusCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasHidden() {
        return this.statusCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasRemoved() {
        return this.statusCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
    public boolean hasReported() {
        return this.statusCase_ == 1;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ModerationStatusOrBuilder {
        private Builder() {
            super(ModerationStatus.DEFAULT_INSTANCE);
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearDeletedForAll() {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).clearDeletedForAll();
            return this;
        }

        public Builder clearDeletedForUser() {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).clearDeletedForUser();
            return this;
        }

        public Builder clearHidden() {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).clearHidden();
            return this;
        }

        public Builder clearRemoved() {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).clearRemoved();
            return this;
        }

        public Builder clearReported() {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).clearReported();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).clearStatus();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public DeletedForAll getDeletedForAll() {
            return ((ModerationStatus) ((g) this).instance).getDeletedForAll();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public DeletedForUser getDeletedForUser() {
            return ((ModerationStatus) ((g) this).instance).getDeletedForUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public Hidden getHidden() {
            return ((ModerationStatus) ((g) this).instance).getHidden();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public Removed getRemoved() {
            return ((ModerationStatus) ((g) this).instance).getRemoved();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public Reported getReported() {
            return ((ModerationStatus) ((g) this).instance).getReported();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public StatusCase getStatusCase() {
            return ((ModerationStatus) ((g) this).instance).getStatusCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasDeletedForAll() {
            return ((ModerationStatus) ((g) this).instance).hasDeletedForAll();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasDeletedForUser() {
            return ((ModerationStatus) ((g) this).instance).hasDeletedForUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasHidden() {
            return ((ModerationStatus) ((g) this).instance).hasHidden();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasRemoved() {
            return ((ModerationStatus) ((g) this).instance).hasRemoved();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModerationStatusOrBuilder
        public boolean hasReported() {
            return ((ModerationStatus) ((g) this).instance).hasReported();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeDeletedForAll(DeletedForAll deletedForAll) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).mergeDeletedForAll(deletedForAll);
            return this;
        }

        public Builder mergeDeletedForUser(DeletedForUser deletedForUser) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).mergeDeletedForUser(deletedForUser);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m514mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeHidden(Hidden hidden) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).mergeHidden(hidden);
            return this;
        }

        public Builder mergeRemoved(Removed removed) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).mergeRemoved(removed);
            return this;
        }

        public Builder mergeReported(Reported reported) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).mergeReported(reported);
            return this;
        }

        public Builder setDeletedForAll(DeletedForAll.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setDeletedForAll((DeletedForAll) builder.build());
            return this;
        }

        public Builder setDeletedForUser(DeletedForUser.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setDeletedForUser((DeletedForUser) builder.build());
            return this;
        }

        public Builder setHidden(Hidden.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setHidden((Hidden) builder.build());
            return this;
        }

        public Builder setRemoved(Removed.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setRemoved((Removed) builder.build());
            return this;
        }

        public Builder setReported(Reported.Builder builder) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setReported((Reported) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m513clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m515mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m512clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m516mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setDeletedForAll(DeletedForAll deletedForAll) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setDeletedForAll(deletedForAll);
            return this;
        }

        public Builder setDeletedForUser(DeletedForUser deletedForUser) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setDeletedForUser(deletedForUser);
            return this;
        }

        public Builder setHidden(Hidden hidden) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setHidden(hidden);
            return this;
        }

        public Builder setRemoved(Removed removed) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setRemoved(removed);
            return this;
        }

        public Builder setReported(Reported reported) {
            copyOnWrite();
            ((ModerationStatus) ((g) this).instance).setReported(reported);
            return this;
        }
    }

    public enum StatusCase {
        REPORTED(1),
        REMOVED(2),
        HIDDEN(3),
        DELETED_FOR_USER(4),
        DELETED_FOR_ALL(5),
        STATUS_NOT_SET(0);

        private final int value;

        StatusCase(int i) {
            this.value = i;
        }

        public static StatusCase forNumber(int i) {
            if (i == 0) {
                return STATUS_NOT_SET;
            }
            if (i == 1) {
                return REPORTED;
            }
            if (i == 2) {
                return REMOVED;
            }
            if (i == 3) {
                return HIDDEN;
            }
            if (i == 4) {
                return DELETED_FOR_USER;
            }
            if (i != 5) {
                return null;
            }
            return DELETED_FOR_ALL;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static StatusCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ModerationStatus moderationStatus) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(moderationStatus);
    }

    public static ModerationStatus parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ModerationStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ModerationStatus parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ModerationStatus parseFrom(phc phcVar) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ModerationStatus parseFrom(phc phcVar, uz00 uz00Var) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ModerationStatus parseFrom(byte[] bArr) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModerationStatus parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ModerationStatus parseFrom(InputStream inputStream) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModerationStatus parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ModerationStatus parseFrom(lwg lwgVar) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ModerationStatus parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ModerationStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
