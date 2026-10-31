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
public final class MessagePayload extends h implements MessagePayloadOrBuilder {
    public static final int ACTIVITY_PAYLOAD_FIELD_NUMBER = 2;
    public static final int CONTRIBUTION_PAYLOAD_FIELD_NUMBER = 1;
    private static final MessagePayload DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int cmpCase_ = 0;
    private Object cmp_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.MessagePayload$1, reason: invalid class name */
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
        MessagePayload messagePayload = new MessagePayload();
        DEFAULT_INSTANCE = messagePayload;
        h.registerDefaultInstance(MessagePayload.class, messagePayload);
    }

    private MessagePayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityPayload() {
        if (this.cmpCase_ == 2) {
            this.cmpCase_ = 0;
            this.cmp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmp() {
        this.cmpCase_ = 0;
        this.cmp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContributionPayload() {
        if (this.cmpCase_ == 1) {
            this.cmpCase_ = 0;
            this.cmp_ = null;
        }
    }

    public static MessagePayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivityPayload(ActivityPayload activityPayload) {
        activityPayload.getClass();
        if (this.cmpCase_ != 2 || this.cmp_ == ActivityPayload.getDefaultInstance()) {
            this.cmp_ = activityPayload;
        } else {
            this.cmp_ = ((ActivityPayload.Builder) ActivityPayload.newBuilder((ActivityPayload) this.cmp_).mergeFrom(activityPayload)).buildPartial();
        }
        this.cmpCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContributionPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        if (this.cmpCase_ != 1 || this.cmp_ == ContributionPayload.getDefaultInstance()) {
            this.cmp_ = contributionPayload;
        } else {
            this.cmp_ = ((ContributionPayload.Builder) ContributionPayload.newBuilder((ContributionPayload) this.cmp_).mergeFrom(contributionPayload)).buildPartial();
        }
        this.cmpCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagePayload parseDelimitedFrom(InputStream inputStream) {
        return (MessagePayload) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagePayload parseFrom(ByteBuffer byteBuffer) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityPayload(ActivityPayload activityPayload) {
        activityPayload.getClass();
        this.cmp_ = activityPayload;
        this.cmpCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        this.cmp_ = contributionPayload;
        this.cmpCase_ = 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"cmp_", "cmpCase_", ContributionPayload.class, ActivityPayload.class});
        }
        if (iOrdinal == 3) {
            return new MessagePayload();
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
        synchronized (MessagePayload.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public ActivityPayload getActivityPayload() {
        return this.cmpCase_ == 2 ? (ActivityPayload) this.cmp_ : ActivityPayload.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public CmpCase getCmpCase() {
        return CmpCase.forNumber(this.cmpCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public ContributionPayload getContributionPayload() {
        return this.cmpCase_ == 1 ? (ContributionPayload) this.cmp_ : ContributionPayload.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public boolean hasActivityPayload() {
        return this.cmpCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public boolean hasContributionPayload() {
        return this.cmpCase_ == 1;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements MessagePayloadOrBuilder {
        private Builder() {
            super(MessagePayload.DEFAULT_INSTANCE);
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

        public Builder clearActivityPayload() {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).clearActivityPayload();
            return this;
        }

        public Builder clearCmp() {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).clearCmp();
            return this;
        }

        public Builder clearContributionPayload() {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).clearContributionPayload();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public ActivityPayload getActivityPayload() {
            return ((MessagePayload) ((g) this).instance).getActivityPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public CmpCase getCmpCase() {
            return ((MessagePayload) ((g) this).instance).getCmpCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public ContributionPayload getContributionPayload() {
            return ((MessagePayload) ((g) this).instance).getContributionPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public boolean hasActivityPayload() {
            return ((MessagePayload) ((g) this).instance).hasActivityPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public boolean hasContributionPayload() {
            return ((MessagePayload) ((g) this).instance).hasContributionPayload();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeActivityPayload(ActivityPayload activityPayload) {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).mergeActivityPayload(activityPayload);
            return this;
        }

        public Builder mergeContributionPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).mergeContributionPayload(contributionPayload);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m504mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setActivityPayload(ActivityPayload.Builder builder) {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).setActivityPayload((ActivityPayload) builder.build());
            return this;
        }

        public Builder setContributionPayload(ContributionPayload.Builder builder) {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).setContributionPayload((ContributionPayload) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m503clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m505mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m502clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m506mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setActivityPayload(ActivityPayload activityPayload) {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).setActivityPayload(activityPayload);
            return this;
        }

        public Builder setContributionPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((MessagePayload) ((g) this).instance).setContributionPayload(contributionPayload);
            return this;
        }
    }

    public enum CmpCase {
        CONTRIBUTION_PAYLOAD(1),
        ACTIVITY_PAYLOAD(2),
        CMP_NOT_SET(0);

        private final int value;

        CmpCase(int i) {
            this.value = i;
        }

        public static CmpCase forNumber(int i) {
            if (i == 0) {
                return CMP_NOT_SET;
            }
            if (i == 1) {
                return CONTRIBUTION_PAYLOAD;
            }
            if (i != 2) {
                return null;
            }
            return ACTIVITY_PAYLOAD;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CmpCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(MessagePayload messagePayload) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(messagePayload);
    }

    public static MessagePayload parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (MessagePayload) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static MessagePayload parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static MessagePayload parseFrom(phc phcVar) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static MessagePayload parseFrom(phc phcVar, uz00 uz00Var) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static MessagePayload parseFrom(byte[] bArr) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagePayload parseFrom(byte[] bArr, uz00 uz00Var) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static MessagePayload parseFrom(InputStream inputStream) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagePayload parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static MessagePayload parseFrom(lwg lwgVar) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static MessagePayload parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (MessagePayload) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
