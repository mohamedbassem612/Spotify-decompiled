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
public final class RenameGroupResponse extends h implements RenameGroupResponseOrBuilder {
    private static final RenameGroupResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Hierarchy hierarchy_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.RenameGroupResponse$1, reason: invalid class name */
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
        RenameGroupResponse renameGroupResponse = new RenameGroupResponse();
        DEFAULT_INSTANCE = renameGroupResponse;
        h.registerDefaultInstance(RenameGroupResponse.class, renameGroupResponse);
    }

    private RenameGroupResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchy() {
        this.hierarchy_ = null;
        this.bitField0_ &= -2;
    }

    public static RenameGroupResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        Hierarchy hierarchy2 = this.hierarchy_;
        if (hierarchy2 == null || hierarchy2 == Hierarchy.getDefaultInstance()) {
            this.hierarchy_ = hierarchy;
        } else {
            this.hierarchy_ = (Hierarchy) ((Hierarchy.Builder) Hierarchy.newBuilder(this.hierarchy_).mergeFrom(hierarchy)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RenameGroupResponse parseDelimitedFrom(InputStream inputStream) {
        return (RenameGroupResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RenameGroupResponse parseFrom(ByteBuffer byteBuffer) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        this.hierarchy_ = hierarchy;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "hierarchy_"});
        }
        if (iOrdinal == 3) {
            return new RenameGroupResponse();
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
        synchronized (RenameGroupResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupResponseOrBuilder
    public Hierarchy getHierarchy() {
        Hierarchy hierarchy = this.hierarchy_;
        return hierarchy == null ? Hierarchy.getDefaultInstance() : hierarchy;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupResponseOrBuilder
    public boolean hasHierarchy() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements RenameGroupResponseOrBuilder {
        private Builder() {
            super(RenameGroupResponse.DEFAULT_INSTANCE);
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

        public Builder clearHierarchy() {
            copyOnWrite();
            ((RenameGroupResponse) ((g) this).instance).clearHierarchy();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupResponseOrBuilder
        public Hierarchy getHierarchy() {
            return ((RenameGroupResponse) ((g) this).instance).getHierarchy();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupResponseOrBuilder
        public boolean hasHierarchy() {
            return ((RenameGroupResponse) ((g) this).instance).hasHierarchy();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m648mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((RenameGroupResponse) ((g) this).instance).mergeHierarchy(hierarchy);
            return this;
        }

        public Builder setHierarchy(Hierarchy.Builder builder) {
            copyOnWrite();
            ((RenameGroupResponse) ((g) this).instance).setHierarchy((Hierarchy) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m647clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m649mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m646clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m650mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((RenameGroupResponse) ((g) this).instance).setHierarchy(hierarchy);
            return this;
        }
    }

    public static Builder newBuilder(RenameGroupResponse renameGroupResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(renameGroupResponse);
    }

    public static RenameGroupResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RenameGroupResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RenameGroupResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RenameGroupResponse parseFrom(phc phcVar) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RenameGroupResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static RenameGroupResponse parseFrom(byte[] bArr) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RenameGroupResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RenameGroupResponse parseFrom(InputStream inputStream) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RenameGroupResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RenameGroupResponse parseFrom(lwg lwgVar) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RenameGroupResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RenameGroupResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
