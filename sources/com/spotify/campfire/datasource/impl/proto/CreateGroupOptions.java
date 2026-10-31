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
public final class CreateGroupOptions extends h implements CreateGroupOptionsOrBuilder {
    private static final CreateGroupOptions DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_TOKEN_FIELD_NUMBER = 2;
    private String hierarchyId_ = "";
    private String requestToken_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CreateGroupOptions$1, reason: invalid class name */
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
        CreateGroupOptions createGroupOptions = new CreateGroupOptions();
        DEFAULT_INSTANCE = createGroupOptions;
        h.registerDefaultInstance(CreateGroupOptions.class, createGroupOptions);
    }

    private CreateGroupOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestToken() {
        this.requestToken_ = getDefaultInstance().getRequestToken();
    }

    public static CreateGroupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateGroupOptions parseDelimitedFrom(InputStream inputStream) {
        return (CreateGroupOptions) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupOptions parseFrom(ByteBuffer byteBuffer) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setRequestToken(String str) {
        str.getClass();
        this.requestToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTokenBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.requestToken_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"hierarchyId_", "requestToken_"});
        }
        if (iOrdinal == 3) {
            return new CreateGroupOptions();
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
        synchronized (CreateGroupOptions.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public String getRequestToken() {
        return this.requestToken_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
    public phc getRequestTokenBytes() {
        return phc.i(this.requestToken_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements CreateGroupOptionsOrBuilder {
        private Builder() {
            super(CreateGroupOptions.DEFAULT_INSTANCE);
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

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((CreateGroupOptions) ((g) this).instance).clearHierarchyId();
            return this;
        }

        public Builder clearRequestToken() {
            copyOnWrite();
            ((CreateGroupOptions) ((g) this).instance).clearRequestToken();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public String getHierarchyId() {
            return ((CreateGroupOptions) ((g) this).instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public phc getHierarchyIdBytes() {
            return ((CreateGroupOptions) ((g) this).instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public String getRequestToken() {
            return ((CreateGroupOptions) ((g) this).instance).getRequestToken();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupOptionsOrBuilder
        public phc getRequestTokenBytes() {
            return ((CreateGroupOptions) ((g) this).instance).getRequestTokenBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m145mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((CreateGroupOptions) ((g) this).instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(phc phcVar) {
            copyOnWrite();
            ((CreateGroupOptions) ((g) this).instance).setHierarchyIdBytes(phcVar);
            return this;
        }

        public Builder setRequestToken(String str) {
            copyOnWrite();
            ((CreateGroupOptions) ((g) this).instance).setRequestToken(str);
            return this;
        }

        public Builder setRequestTokenBytes(phc phcVar) {
            copyOnWrite();
            ((CreateGroupOptions) ((g) this).instance).setRequestTokenBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m144clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m146mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m143clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m147mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(CreateGroupOptions createGroupOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(createGroupOptions);
    }

    public static CreateGroupOptions parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateGroupOptions) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateGroupOptions parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CreateGroupOptions parseFrom(phc phcVar) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CreateGroupOptions parseFrom(phc phcVar, uz00 uz00Var) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CreateGroupOptions parseFrom(byte[] bArr) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateGroupOptions parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CreateGroupOptions parseFrom(InputStream inputStream) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupOptions parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateGroupOptions parseFrom(lwg lwgVar) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CreateGroupOptions parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CreateGroupOptions) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
