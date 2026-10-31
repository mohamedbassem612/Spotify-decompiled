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
public final class InviteOptions extends h implements InviteOptionsOrBuilder {
    private static final InviteOptions DEFAULT_INSTANCE;
    public static final int MAX_USAGE_COUNT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int maxUsageCount_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.InviteOptions$1, reason: invalid class name */
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
        InviteOptions inviteOptions = new InviteOptions();
        DEFAULT_INSTANCE = inviteOptions;
        h.registerDefaultInstance(InviteOptions.class, inviteOptions);
    }

    private InviteOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxUsageCount() {
        this.bitField0_ &= -2;
        this.maxUsageCount_ = 0;
    }

    public static InviteOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static InviteOptions parseDelimitedFrom(InputStream inputStream) {
        return (InviteOptions) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteOptions parseFrom(ByteBuffer byteBuffer) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxUsageCount(int i) {
        this.bitField0_ |= 1;
        this.maxUsageCount_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "maxUsageCount_"});
        }
        if (iOrdinal == 3) {
            return new InviteOptions();
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
        synchronized (InviteOptions.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.InviteOptionsOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.InviteOptionsOrBuilder
    public int getMaxUsageCount() {
        return this.maxUsageCount_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.InviteOptionsOrBuilder
    public boolean hasMaxUsageCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements InviteOptionsOrBuilder {
        private Builder() {
            super(InviteOptions.DEFAULT_INSTANCE);
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

        public Builder clearMaxUsageCount() {
            copyOnWrite();
            ((InviteOptions) ((g) this).instance).clearMaxUsageCount();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteOptionsOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteOptionsOrBuilder
        public int getMaxUsageCount() {
            return ((InviteOptions) ((g) this).instance).getMaxUsageCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteOptionsOrBuilder
        public boolean hasMaxUsageCount() {
            return ((InviteOptions) ((g) this).instance).hasMaxUsageCount();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m448mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setMaxUsageCount(int i) {
            copyOnWrite();
            ((InviteOptions) ((g) this).instance).setMaxUsageCount(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m447clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m449mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m446clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m450mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
    }

    public static Builder newBuilder(InviteOptions inviteOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(inviteOptions);
    }

    public static InviteOptions parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (InviteOptions) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static InviteOptions parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static InviteOptions parseFrom(phc phcVar) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static InviteOptions parseFrom(phc phcVar, uz00 uz00Var) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static InviteOptions parseFrom(byte[] bArr) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InviteOptions parseFrom(byte[] bArr, uz00 uz00Var) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static InviteOptions parseFrom(InputStream inputStream) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteOptions parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static InviteOptions parseFrom(lwg lwgVar) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static InviteOptions parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (InviteOptions) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
