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
public final class HierarchyMessagingAvailability extends h implements HierarchyMessagingAvailabilityOrBuilder {
    public static final int ALLOWED_FIELD_NUMBER = 1;
    private static final HierarchyMessagingAvailability DEFAULT_INSTANCE;
    public static final int DISALLOWED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int availabilityCase_ = 0;
    private Object availability_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailability$1, reason: invalid class name */
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
        HierarchyMessagingAvailability hierarchyMessagingAvailability = new HierarchyMessagingAvailability();
        DEFAULT_INSTANCE = hierarchyMessagingAvailability;
        h.registerDefaultInstance(HierarchyMessagingAvailability.class, hierarchyMessagingAvailability);
    }

    private HierarchyMessagingAvailability() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowed() {
        if (this.availabilityCase_ == 1) {
            this.availabilityCase_ = 0;
            this.availability_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailability() {
        this.availabilityCase_ = 0;
        this.availability_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisallowed() {
        if (this.availabilityCase_ == 2) {
            this.availabilityCase_ = 0;
            this.availability_ = null;
        }
    }

    public static HierarchyMessagingAvailability getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAllowed(HierarchyMessagingAllowed hierarchyMessagingAllowed) {
        hierarchyMessagingAllowed.getClass();
        if (this.availabilityCase_ != 1 || this.availability_ == HierarchyMessagingAllowed.getDefaultInstance()) {
            this.availability_ = hierarchyMessagingAllowed;
        } else {
            this.availability_ = ((HierarchyMessagingAllowed.Builder) HierarchyMessagingAllowed.newBuilder((HierarchyMessagingAllowed) this.availability_).mergeFrom(hierarchyMessagingAllowed)).buildPartial();
        }
        this.availabilityCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisallowed(HierarchyMessagingDisallowed hierarchyMessagingDisallowed) {
        hierarchyMessagingDisallowed.getClass();
        if (this.availabilityCase_ != 2 || this.availability_ == HierarchyMessagingDisallowed.getDefaultInstance()) {
            this.availability_ = hierarchyMessagingDisallowed;
        } else {
            this.availability_ = ((HierarchyMessagingDisallowed.Builder) HierarchyMessagingDisallowed.newBuilder((HierarchyMessagingDisallowed) this.availability_).mergeFrom(hierarchyMessagingDisallowed)).buildPartial();
        }
        this.availabilityCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyMessagingAvailability parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyMessagingAvailability) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMessagingAvailability parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowed(HierarchyMessagingAllowed hierarchyMessagingAllowed) {
        hierarchyMessagingAllowed.getClass();
        this.availability_ = hierarchyMessagingAllowed;
        this.availabilityCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisallowed(HierarchyMessagingDisallowed hierarchyMessagingDisallowed) {
        hierarchyMessagingDisallowed.getClass();
        this.availability_ = hierarchyMessagingDisallowed;
        this.availabilityCase_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"availability_", "availabilityCase_", HierarchyMessagingAllowed.class, HierarchyMessagingDisallowed.class});
        }
        if (iOrdinal == 3) {
            return new HierarchyMessagingAvailability();
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
        synchronized (HierarchyMessagingAvailability.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
    public HierarchyMessagingAllowed getAllowed() {
        return this.availabilityCase_ == 1 ? (HierarchyMessagingAllowed) this.availability_ : HierarchyMessagingAllowed.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
    public AvailabilityCase getAvailabilityCase() {
        return AvailabilityCase.forNumber(this.availabilityCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
    public HierarchyMessagingDisallowed getDisallowed() {
        return this.availabilityCase_ == 2 ? (HierarchyMessagingDisallowed) this.availability_ : HierarchyMessagingDisallowed.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
    public boolean hasAllowed() {
        return this.availabilityCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
    public boolean hasDisallowed() {
        return this.availabilityCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyMessagingAvailabilityOrBuilder {
        private Builder() {
            super(HierarchyMessagingAvailability.DEFAULT_INSTANCE);
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

        public Builder clearAllowed() {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).clearAllowed();
            return this;
        }

        public Builder clearAvailability() {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).clearAvailability();
            return this;
        }

        public Builder clearDisallowed() {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).clearDisallowed();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
        public HierarchyMessagingAllowed getAllowed() {
            return ((HierarchyMessagingAvailability) ((g) this).instance).getAllowed();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
        public AvailabilityCase getAvailabilityCase() {
            return ((HierarchyMessagingAvailability) ((g) this).instance).getAvailabilityCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
        public HierarchyMessagingDisallowed getDisallowed() {
            return ((HierarchyMessagingAvailability) ((g) this).instance).getDisallowed();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
        public boolean hasAllowed() {
            return ((HierarchyMessagingAvailability) ((g) this).instance).hasAllowed();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailabilityOrBuilder
        public boolean hasDisallowed() {
            return ((HierarchyMessagingAvailability) ((g) this).instance).hasDisallowed();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeAllowed(HierarchyMessagingAllowed hierarchyMessagingAllowed) {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).mergeAllowed(hierarchyMessagingAllowed);
            return this;
        }

        public Builder mergeDisallowed(HierarchyMessagingDisallowed hierarchyMessagingDisallowed) {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).mergeDisallowed(hierarchyMessagingDisallowed);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m392mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAllowed(HierarchyMessagingAllowed.Builder builder) {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).setAllowed((HierarchyMessagingAllowed) builder.build());
            return this;
        }

        public Builder setDisallowed(HierarchyMessagingDisallowed.Builder builder) {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).setDisallowed((HierarchyMessagingDisallowed) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m391clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m393mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m390clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m394mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setAllowed(HierarchyMessagingAllowed hierarchyMessagingAllowed) {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).setAllowed(hierarchyMessagingAllowed);
            return this;
        }

        public Builder setDisallowed(HierarchyMessagingDisallowed hierarchyMessagingDisallowed) {
            copyOnWrite();
            ((HierarchyMessagingAvailability) ((g) this).instance).setDisallowed(hierarchyMessagingDisallowed);
            return this;
        }
    }

    public enum AvailabilityCase {
        ALLOWED(1),
        DISALLOWED(2),
        AVAILABILITY_NOT_SET(0);

        private final int value;

        AvailabilityCase(int i) {
            this.value = i;
        }

        public static AvailabilityCase forNumber(int i) {
            if (i == 0) {
                return AVAILABILITY_NOT_SET;
            }
            if (i == 1) {
                return ALLOWED;
            }
            if (i != 2) {
                return null;
            }
            return DISALLOWED;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AvailabilityCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(HierarchyMessagingAvailability hierarchyMessagingAvailability) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyMessagingAvailability);
    }

    public static HierarchyMessagingAvailability parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyMessagingAvailability) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyMessagingAvailability parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static HierarchyMessagingAvailability parseFrom(phc phcVar) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static HierarchyMessagingAvailability parseFrom(phc phcVar, uz00 uz00Var) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static HierarchyMessagingAvailability parseFrom(byte[] bArr) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyMessagingAvailability parseFrom(byte[] bArr, uz00 uz00Var) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static HierarchyMessagingAvailability parseFrom(InputStream inputStream) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyMessagingAvailability parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyMessagingAvailability parseFrom(lwg lwgVar) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static HierarchyMessagingAvailability parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (HierarchyMessagingAvailability) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
