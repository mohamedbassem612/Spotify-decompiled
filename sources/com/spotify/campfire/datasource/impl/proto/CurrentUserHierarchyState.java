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
public final class CurrentUserHierarchyState extends h implements CurrentUserHierarchyStateOrBuilder {
    private static final CurrentUserHierarchyState DEFAULT_INSTANCE;
    public static final int MESSAGING_AVAILABILITY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PHASE_FIELD_NUMBER = 1;
    private int bitField0_;
    private HierarchyMessagingAvailability messagingAvailability_;
    private int phase_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyState$1, reason: invalid class name */
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
        CurrentUserHierarchyState currentUserHierarchyState = new CurrentUserHierarchyState();
        DEFAULT_INSTANCE = currentUserHierarchyState;
        h.registerDefaultInstance(CurrentUserHierarchyState.class, currentUserHierarchyState);
    }

    private CurrentUserHierarchyState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagingAvailability() {
        this.messagingAvailability_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhase() {
        this.phase_ = 0;
    }

    public static CurrentUserHierarchyState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessagingAvailability(HierarchyMessagingAvailability hierarchyMessagingAvailability) {
        hierarchyMessagingAvailability.getClass();
        HierarchyMessagingAvailability hierarchyMessagingAvailability2 = this.messagingAvailability_;
        if (hierarchyMessagingAvailability2 == null || hierarchyMessagingAvailability2 == HierarchyMessagingAvailability.getDefaultInstance()) {
            this.messagingAvailability_ = hierarchyMessagingAvailability;
        } else {
            this.messagingAvailability_ = (HierarchyMessagingAvailability) ((HierarchyMessagingAvailability.Builder) HierarchyMessagingAvailability.newBuilder(this.messagingAvailability_).mergeFrom(hierarchyMessagingAvailability)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CurrentUserHierarchyState parseDelimitedFrom(InputStream inputStream) {
        return (CurrentUserHierarchyState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CurrentUserHierarchyState parseFrom(ByteBuffer byteBuffer) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagingAvailability(HierarchyMessagingAvailability hierarchyMessagingAvailability) {
        hierarchyMessagingAvailability.getClass();
        this.messagingAvailability_ = hierarchyMessagingAvailability;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhase(CurrentUserHierarchyPhase currentUserHierarchyPhase) {
        this.phase_ = currentUserHierarchyPhase.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhaseValue(int i) {
        this.phase_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "phase_", "messagingAvailability_"});
        }
        if (iOrdinal == 3) {
            return new CurrentUserHierarchyState();
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
        synchronized (CurrentUserHierarchyState.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
    public HierarchyMessagingAvailability getMessagingAvailability() {
        HierarchyMessagingAvailability hierarchyMessagingAvailability = this.messagingAvailability_;
        return hierarchyMessagingAvailability == null ? HierarchyMessagingAvailability.getDefaultInstance() : hierarchyMessagingAvailability;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
    public CurrentUserHierarchyPhase getPhase() {
        CurrentUserHierarchyPhase currentUserHierarchyPhaseForNumber = CurrentUserHierarchyPhase.forNumber(this.phase_);
        return currentUserHierarchyPhaseForNumber == null ? CurrentUserHierarchyPhase.UNRECOGNIZED : currentUserHierarchyPhaseForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
    public int getPhaseValue() {
        return this.phase_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
    public boolean hasMessagingAvailability() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements CurrentUserHierarchyStateOrBuilder {
        private Builder() {
            super(CurrentUserHierarchyState.DEFAULT_INSTANCE);
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

        public Builder clearMessagingAvailability() {
            copyOnWrite();
            ((CurrentUserHierarchyState) ((g) this).instance).clearMessagingAvailability();
            return this;
        }

        public Builder clearPhase() {
            copyOnWrite();
            ((CurrentUserHierarchyState) ((g) this).instance).clearPhase();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
        public HierarchyMessagingAvailability getMessagingAvailability() {
            return ((CurrentUserHierarchyState) ((g) this).instance).getMessagingAvailability();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
        public CurrentUserHierarchyPhase getPhase() {
            return ((CurrentUserHierarchyState) ((g) this).instance).getPhase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
        public int getPhaseValue() {
            return ((CurrentUserHierarchyState) ((g) this).instance).getPhaseValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyStateOrBuilder
        public boolean hasMessagingAvailability() {
            return ((CurrentUserHierarchyState) ((g) this).instance).hasMessagingAvailability();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m176mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeMessagingAvailability(HierarchyMessagingAvailability hierarchyMessagingAvailability) {
            copyOnWrite();
            ((CurrentUserHierarchyState) ((g) this).instance).mergeMessagingAvailability(hierarchyMessagingAvailability);
            return this;
        }

        public Builder setMessagingAvailability(HierarchyMessagingAvailability.Builder builder) {
            copyOnWrite();
            ((CurrentUserHierarchyState) ((g) this).instance).setMessagingAvailability((HierarchyMessagingAvailability) builder.build());
            return this;
        }

        public Builder setPhase(CurrentUserHierarchyPhase currentUserHierarchyPhase) {
            copyOnWrite();
            ((CurrentUserHierarchyState) ((g) this).instance).setPhase(currentUserHierarchyPhase);
            return this;
        }

        public Builder setPhaseValue(int i) {
            copyOnWrite();
            ((CurrentUserHierarchyState) ((g) this).instance).setPhaseValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m175clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m177mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m174clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m178mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setMessagingAvailability(HierarchyMessagingAvailability hierarchyMessagingAvailability) {
            copyOnWrite();
            ((CurrentUserHierarchyState) ((g) this).instance).setMessagingAvailability(hierarchyMessagingAvailability);
            return this;
        }
    }

    public static Builder newBuilder(CurrentUserHierarchyState currentUserHierarchyState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(currentUserHierarchyState);
    }

    public static CurrentUserHierarchyState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CurrentUserHierarchyState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CurrentUserHierarchyState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CurrentUserHierarchyState parseFrom(phc phcVar) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CurrentUserHierarchyState parseFrom(phc phcVar, uz00 uz00Var) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CurrentUserHierarchyState parseFrom(byte[] bArr) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CurrentUserHierarchyState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CurrentUserHierarchyState parseFrom(InputStream inputStream) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CurrentUserHierarchyState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CurrentUserHierarchyState parseFrom(lwg lwgVar) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CurrentUserHierarchyState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CurrentUserHierarchyState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
