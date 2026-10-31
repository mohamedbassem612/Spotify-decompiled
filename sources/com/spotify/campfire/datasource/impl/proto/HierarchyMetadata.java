package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.sve1;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class HierarchyMetadata extends h implements HierarchyMetadataOrBuilder {
    public static final int AGENTS_FIELD_NUMBER = 8;
    public static final int CREATED_AT_FIELD_NUMBER = 6;
    public static final int CURRENT_USER_CHANNEL_MUTED_FIELD_NUMBER = 7;
    public static final int CURRENT_USER_PARTICIPATION_STATUS_FIELD_NUMBER = 3;
    public static final int CURRENT_USER_STATE_FIELD_NUMBER = 9;
    private static final HierarchyMetadata DEFAULT_INSTANCE;
    public static final int HIERARCHY_STATUS_FIELD_NUMBER = 2;
    public static final int HIERARCHY_TYPE_FIELD_NUMBER = 5;
    public static final int INITIATOR_USERNAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp createdAt_;
    private boolean currentUserChannelMuted_;
    private int currentUserParticipationStatus_;
    private CurrentUserHierarchyState currentUserState_;
    private int hierarchyStatus_;
    private int hierarchyType_;
    private int source_;
    private String initiatorUsername_ = "";
    private h290 agents_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyMetadata$1, reason: invalid class name */
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
        HierarchyMetadata hierarchyMetadata = new HierarchyMetadata();
        DEFAULT_INSTANCE = hierarchyMetadata;
        h.registerDefaultInstance(HierarchyMetadata.class, hierarchyMetadata);
    }

    private HierarchyMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgents(HierarchyAgent hierarchyAgent) {
        hierarchyAgent.getClass();
        ensureAgentsIsMutable();
        this.agents_.add(hierarchyAgent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAgents(Iterable<? extends HierarchyAgent> iterable) {
        ensureAgentsIsMutable();
        s8.addAll(iterable, this.agents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgents() {
        this.agents_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentUserChannelMuted() {
        this.currentUserChannelMuted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentUserParticipationStatus() {
        this.currentUserParticipationStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentUserState() {
        this.currentUserState_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyStatus() {
        this.hierarchyStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyType() {
        this.hierarchyType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitiatorUsername() {
        this.initiatorUsername_ = getDefaultInstance().getInitiatorUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    private void ensureAgentsIsMutable() {
        i9 i9Var = this.agents_;
        if (i9Var.a) {
            return;
        }
        this.agents_ = h.mutableCopy(i9Var);
    }

    public static HierarchyMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.o()) {
            this.createdAt_ = timestamp;
        } else {
            this.createdAt_ = Timestamp.s(this.createdAt_).mergeFrom(timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentUserState(CurrentUserHierarchyState currentUserHierarchyState) {
        currentUserHierarchyState.getClass();
        CurrentUserHierarchyState currentUserHierarchyState2 = this.currentUserState_;
        if (currentUserHierarchyState2 == null || currentUserHierarchyState2 == CurrentUserHierarchyState.getDefaultInstance()) {
            this.currentUserState_ = currentUserHierarchyState;
        } else {
            this.currentUserState_ = (CurrentUserHierarchyState) ((CurrentUserHierarchyState.Builder) CurrentUserHierarchyState.newBuilder(this.currentUserState_).mergeFrom(currentUserHierarchyState)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyMetadata parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMetadata parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAgents(int i) {
        ensureAgentsIsMutable();
        this.agents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgents(int i, HierarchyAgent hierarchyAgent) {
        hierarchyAgent.getClass();
        ensureAgentsIsMutable();
        this.agents_.set(i, hierarchyAgent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.createdAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserChannelMuted(boolean z) {
        this.currentUserChannelMuted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserParticipationStatus(HierarchyUserParticipationStatus hierarchyUserParticipationStatus) {
        this.currentUserParticipationStatus_ = hierarchyUserParticipationStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserParticipationStatusValue(int i) {
        this.currentUserParticipationStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserState(CurrentUserHierarchyState currentUserHierarchyState) {
        currentUserHierarchyState.getClass();
        this.currentUserState_ = currentUserHierarchyState;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyStatus(HierarchyStatus hierarchyStatus) {
        this.hierarchyStatus_ = hierarchyStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyStatusValue(int i) {
        this.hierarchyStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyType(HierarchyType hierarchyType) {
        this.hierarchyType_ = hierarchyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyTypeValue(int i) {
        this.hierarchyType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsername(String str) {
        str.getClass();
        this.initiatorUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.initiatorUsername_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(HierarchySource hierarchySource) {
        this.source_ = hierarchySource.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i) {
        this.source_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\f\u0005\f\u0006ဉ\u0000\u0007\u0007\b\u001b\tဉ\u0001", new Object[]{"bitField0_", "initiatorUsername_", "hierarchyStatus_", "currentUserParticipationStatus_", "source_", "hierarchyType_", "createdAt_", "currentUserChannelMuted_", "agents_", HierarchyAgent.class, "currentUserState_"});
        }
        if (iOrdinal == 3) {
            return new HierarchyMetadata();
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
        synchronized (HierarchyMetadata.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyAgent getAgents(int i) {
        return (HierarchyAgent) this.agents_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getAgentsCount() {
        return this.agents_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public List<HierarchyAgent> getAgentsList() {
        return this.agents_;
    }

    public HierarchyAgentOrBuilder getAgentsOrBuilder(int i) {
        return (HierarchyAgentOrBuilder) this.agents_.get(i);
    }

    public List<? extends HierarchyAgentOrBuilder> getAgentsOrBuilderList() {
        return this.agents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public boolean getCurrentUserChannelMuted() {
        return this.currentUserChannelMuted_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyUserParticipationStatus getCurrentUserParticipationStatus() {
        HierarchyUserParticipationStatus hierarchyUserParticipationStatusForNumber = HierarchyUserParticipationStatus.forNumber(this.currentUserParticipationStatus_);
        return hierarchyUserParticipationStatusForNumber == null ? HierarchyUserParticipationStatus.UNRECOGNIZED : hierarchyUserParticipationStatusForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getCurrentUserParticipationStatusValue() {
        return this.currentUserParticipationStatus_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public CurrentUserHierarchyState getCurrentUserState() {
        CurrentUserHierarchyState currentUserHierarchyState = this.currentUserState_;
        return currentUserHierarchyState == null ? CurrentUserHierarchyState.getDefaultInstance() : currentUserHierarchyState;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyStatus getHierarchyStatus() {
        HierarchyStatus hierarchyStatusForNumber = HierarchyStatus.forNumber(this.hierarchyStatus_);
        return hierarchyStatusForNumber == null ? HierarchyStatus.UNRECOGNIZED : hierarchyStatusForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getHierarchyStatusValue() {
        return this.hierarchyStatus_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchyType getHierarchyType() {
        HierarchyType hierarchyTypeForNumber = HierarchyType.forNumber(this.hierarchyType_);
        return hierarchyTypeForNumber == null ? HierarchyType.UNRECOGNIZED : hierarchyTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getHierarchyTypeValue() {
        return this.hierarchyType_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public String getInitiatorUsername() {
        return this.initiatorUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public phc getInitiatorUsernameBytes() {
        return phc.i(this.initiatorUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public HierarchySource getSource() {
        HierarchySource hierarchySourceForNumber = HierarchySource.forNumber(this.source_);
        return hierarchySourceForNumber == null ? HierarchySource.UNRECOGNIZED : hierarchySourceForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public boolean hasCreatedAt() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
    public boolean hasCurrentUserState() {
        return (this.bitField0_ & 2) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyMetadataOrBuilder {
        private Builder() {
            super(HierarchyMetadata.DEFAULT_INSTANCE);
        }

        public Builder addAgents(HierarchyAgent.Builder builder) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).addAgents((HierarchyAgent) builder.build());
            return this;
        }

        public Builder addAllAgents(Iterable<? extends HierarchyAgent> iterable) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).addAllAgents(iterable);
            return this;
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

        public Builder clearAgents() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearAgents();
            return this;
        }

        public Builder clearCreatedAt() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearCreatedAt();
            return this;
        }

        public Builder clearCurrentUserChannelMuted() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearCurrentUserChannelMuted();
            return this;
        }

        public Builder clearCurrentUserParticipationStatus() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearCurrentUserParticipationStatus();
            return this;
        }

        public Builder clearCurrentUserState() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearCurrentUserState();
            return this;
        }

        public Builder clearHierarchyStatus() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearHierarchyStatus();
            return this;
        }

        public Builder clearHierarchyType() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearHierarchyType();
            return this;
        }

        public Builder clearInitiatorUsername() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearInitiatorUsername();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).clearSource();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyAgent getAgents(int i) {
            return ((HierarchyMetadata) ((g) this).instance).getAgents(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getAgentsCount() {
            return ((HierarchyMetadata) ((g) this).instance).getAgentsCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public List<HierarchyAgent> getAgentsList() {
            return Collections.unmodifiableList(((HierarchyMetadata) ((g) this).instance).getAgentsList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public Timestamp getCreatedAt() {
            return ((HierarchyMetadata) ((g) this).instance).getCreatedAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public boolean getCurrentUserChannelMuted() {
            return ((HierarchyMetadata) ((g) this).instance).getCurrentUserChannelMuted();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyUserParticipationStatus getCurrentUserParticipationStatus() {
            return ((HierarchyMetadata) ((g) this).instance).getCurrentUserParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getCurrentUserParticipationStatusValue() {
            return ((HierarchyMetadata) ((g) this).instance).getCurrentUserParticipationStatusValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public CurrentUserHierarchyState getCurrentUserState() {
            return ((HierarchyMetadata) ((g) this).instance).getCurrentUserState();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyStatus getHierarchyStatus() {
            return ((HierarchyMetadata) ((g) this).instance).getHierarchyStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getHierarchyStatusValue() {
            return ((HierarchyMetadata) ((g) this).instance).getHierarchyStatusValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchyType getHierarchyType() {
            return ((HierarchyMetadata) ((g) this).instance).getHierarchyType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getHierarchyTypeValue() {
            return ((HierarchyMetadata) ((g) this).instance).getHierarchyTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public String getInitiatorUsername() {
            return ((HierarchyMetadata) ((g) this).instance).getInitiatorUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public phc getInitiatorUsernameBytes() {
            return ((HierarchyMetadata) ((g) this).instance).getInitiatorUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public HierarchySource getSource() {
            return ((HierarchyMetadata) ((g) this).instance).getSource();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public int getSourceValue() {
            return ((HierarchyMetadata) ((g) this).instance).getSourceValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public boolean hasCreatedAt() {
            return ((HierarchyMetadata) ((g) this).instance).hasCreatedAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMetadataOrBuilder
        public boolean hasCurrentUserState() {
            return ((HierarchyMetadata) ((g) this).instance).hasCurrentUserState();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).mergeCreatedAt(timestamp);
            return this;
        }

        public Builder mergeCurrentUserState(CurrentUserHierarchyState currentUserHierarchyState) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).mergeCurrentUserState(currentUserHierarchyState);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m403mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeAgents(int i) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).removeAgents(i);
            return this;
        }

        public Builder setAgents(int i, HierarchyAgent.Builder builder) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setAgents(i, (HierarchyAgent) builder.build());
            return this;
        }

        public Builder setCreatedAt(sve1 sve1Var) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setCreatedAt(sve1Var.build());
            return this;
        }

        public Builder setCurrentUserChannelMuted(boolean z) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setCurrentUserChannelMuted(z);
            return this;
        }

        public Builder setCurrentUserParticipationStatus(HierarchyUserParticipationStatus hierarchyUserParticipationStatus) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setCurrentUserParticipationStatus(hierarchyUserParticipationStatus);
            return this;
        }

        public Builder setCurrentUserParticipationStatusValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setCurrentUserParticipationStatusValue(i);
            return this;
        }

        public Builder setCurrentUserState(CurrentUserHierarchyState.Builder builder) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setCurrentUserState((CurrentUserHierarchyState) builder.build());
            return this;
        }

        public Builder setHierarchyStatus(HierarchyStatus hierarchyStatus) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setHierarchyStatus(hierarchyStatus);
            return this;
        }

        public Builder setHierarchyStatusValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setHierarchyStatusValue(i);
            return this;
        }

        public Builder setHierarchyType(HierarchyType hierarchyType) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setHierarchyType(hierarchyType);
            return this;
        }

        public Builder setHierarchyTypeValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setHierarchyTypeValue(i);
            return this;
        }

        public Builder setInitiatorUsername(String str) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setInitiatorUsername(str);
            return this;
        }

        public Builder setInitiatorUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setInitiatorUsernameBytes(phcVar);
            return this;
        }

        public Builder setSource(HierarchySource hierarchySource) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setSource(hierarchySource);
            return this;
        }

        public Builder setSourceValue(int i) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setSourceValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m402clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m404mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m401clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m405mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addAgents(int i, HierarchyAgent hierarchyAgent) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).addAgents(i, hierarchyAgent);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setAgents(int i, HierarchyAgent hierarchyAgent) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setAgents(i, hierarchyAgent);
            return this;
        }

        public Builder setCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setCreatedAt(timestamp);
            return this;
        }

        public Builder setCurrentUserState(CurrentUserHierarchyState currentUserHierarchyState) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).setCurrentUserState(currentUserHierarchyState);
            return this;
        }

        public Builder addAgents(HierarchyAgent hierarchyAgent) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).addAgents(hierarchyAgent);
            return this;
        }

        public Builder addAgents(int i, HierarchyAgent.Builder builder) {
            copyOnWrite();
            ((HierarchyMetadata) ((g) this).instance).addAgents(i, (HierarchyAgent) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(HierarchyMetadata hierarchyMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyMetadata);
    }

    public static HierarchyMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static HierarchyMetadata parseFrom(phc phcVar) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static HierarchyMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgents(int i, HierarchyAgent hierarchyAgent) {
        hierarchyAgent.getClass();
        ensureAgentsIsMutable();
        this.agents_.add(i, hierarchyAgent);
    }

    public static HierarchyMetadata parseFrom(byte[] bArr) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static HierarchyMetadata parseFrom(InputStream inputStream) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyMetadata parseFrom(lwg lwgVar) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static HierarchyMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (HierarchyMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
