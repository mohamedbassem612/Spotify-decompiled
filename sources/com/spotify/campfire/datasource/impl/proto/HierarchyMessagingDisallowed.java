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
public final class HierarchyMessagingDisallowed extends h implements HierarchyMessagingDisallowedOrBuilder {
    private static final HierarchyMessagingDisallowed DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyMessagingDisallowed$1, reason: invalid class name */
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
        HierarchyMessagingDisallowed hierarchyMessagingDisallowed = new HierarchyMessagingDisallowed();
        DEFAULT_INSTANCE = hierarchyMessagingDisallowed;
        h.registerDefaultInstance(HierarchyMessagingDisallowed.class, hierarchyMessagingDisallowed);
    }

    private HierarchyMessagingDisallowed() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static HierarchyMessagingDisallowed getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyMessagingDisallowed parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyMessagingDisallowed) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMessagingDisallowed parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(HierarchyMessagingUnavailableReason hierarchyMessagingUnavailableReason) {
        this.reason_ = hierarchyMessagingUnavailableReason.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i) {
        this.reason_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
        }
        if (iOrdinal == 3) {
            return new HierarchyMessagingDisallowed();
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
        synchronized (HierarchyMessagingDisallowed.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingDisallowedOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingDisallowedOrBuilder
    public HierarchyMessagingUnavailableReason getReason() {
        HierarchyMessagingUnavailableReason hierarchyMessagingUnavailableReasonForNumber = HierarchyMessagingUnavailableReason.forNumber(this.reason_);
        return hierarchyMessagingUnavailableReasonForNumber == null ? HierarchyMessagingUnavailableReason.UNRECOGNIZED : hierarchyMessagingUnavailableReasonForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingDisallowedOrBuilder
    public int getReasonValue() {
        return this.reason_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyMessagingDisallowedOrBuilder {
        private Builder() {
            super(HierarchyMessagingDisallowed.DEFAULT_INSTANCE);
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

        public Builder clearReason() {
            copyOnWrite();
            ((HierarchyMessagingDisallowed) ((g) this).instance).clearReason();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingDisallowedOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingDisallowedOrBuilder
        public HierarchyMessagingUnavailableReason getReason() {
            return ((HierarchyMessagingDisallowed) ((g) this).instance).getReason();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingDisallowedOrBuilder
        public int getReasonValue() {
            return ((HierarchyMessagingDisallowed) ((g) this).instance).getReasonValue();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m397mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setReason(HierarchyMessagingUnavailableReason hierarchyMessagingUnavailableReason) {
            copyOnWrite();
            ((HierarchyMessagingDisallowed) ((g) this).instance).setReason(hierarchyMessagingUnavailableReason);
            return this;
        }

        public Builder setReasonValue(int i) {
            copyOnWrite();
            ((HierarchyMessagingDisallowed) ((g) this).instance).setReasonValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m396clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m398mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m395clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m399mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(HierarchyMessagingDisallowed hierarchyMessagingDisallowed) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyMessagingDisallowed);
    }

    public static HierarchyMessagingDisallowed parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyMessagingDisallowed) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyMessagingDisallowed parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static HierarchyMessagingDisallowed parseFrom(phc phcVar) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static HierarchyMessagingDisallowed parseFrom(phc phcVar, uz00 uz00Var) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static HierarchyMessagingDisallowed parseFrom(byte[] bArr) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyMessagingDisallowed parseFrom(byte[] bArr, uz00 uz00Var) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static HierarchyMessagingDisallowed parseFrom(InputStream inputStream) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMessagingDisallowed parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyMessagingDisallowed parseFrom(lwg lwgVar) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static HierarchyMessagingDisallowed parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (HierarchyMessagingDisallowed) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
