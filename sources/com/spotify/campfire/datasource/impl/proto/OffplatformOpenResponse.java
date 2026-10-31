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
public final class OffplatformOpenResponse extends h implements OffplatformOpenResponseOrBuilder {
    private static final OffplatformOpenResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_EXISTED_FIELD_NUMBER = 4;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 3;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECT_TO_CHAT_FIELD_NUMBER = 1;
    private boolean hierarchyExisted_;
    private boolean redirectToChat_;
    private String nodePathId_ = "";
    private String hierarchyId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponse$1, reason: invalid class name */
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
        OffplatformOpenResponse offplatformOpenResponse = new OffplatformOpenResponse();
        DEFAULT_INSTANCE = offplatformOpenResponse;
        h.registerDefaultInstance(OffplatformOpenResponse.class, offplatformOpenResponse);
    }

    private OffplatformOpenResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyExisted() {
        this.hierarchyExisted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRedirectToChat() {
        this.redirectToChat_ = false;
    }

    public static OffplatformOpenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static OffplatformOpenResponse parseDelimitedFrom(InputStream inputStream) {
        return (OffplatformOpenResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformOpenResponse parseFrom(ByteBuffer byteBuffer) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyExisted(boolean z) {
        this.hierarchyExisted_ = z;
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
    public void setNodePathId(String str) {
        str.getClass();
        this.nodePathId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.nodePathId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRedirectToChat(boolean z) {
        this.redirectToChat_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"redirectToChat_", "nodePathId_", "hierarchyId_", "hierarchyExisted_"});
        }
        if (iOrdinal == 3) {
            return new OffplatformOpenResponse();
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
        synchronized (OffplatformOpenResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
    public boolean getHierarchyExisted() {
        return this.hierarchyExisted_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
    public phc getNodePathIdBytes() {
        return phc.i(this.nodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
    public boolean getRedirectToChat() {
        return this.redirectToChat_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements OffplatformOpenResponseOrBuilder {
        private Builder() {
            super(OffplatformOpenResponse.DEFAULT_INSTANCE);
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

        public Builder clearHierarchyExisted() {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).clearHierarchyExisted();
            return this;
        }

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).clearHierarchyId();
            return this;
        }

        public Builder clearNodePathId() {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).clearNodePathId();
            return this;
        }

        public Builder clearRedirectToChat() {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).clearRedirectToChat();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
        public boolean getHierarchyExisted() {
            return ((OffplatformOpenResponse) ((g) this).instance).getHierarchyExisted();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
        public String getHierarchyId() {
            return ((OffplatformOpenResponse) ((g) this).instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
        public phc getHierarchyIdBytes() {
            return ((OffplatformOpenResponse) ((g) this).instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
        public String getNodePathId() {
            return ((OffplatformOpenResponse) ((g) this).instance).getNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
        public phc getNodePathIdBytes() {
            return ((OffplatformOpenResponse) ((g) this).instance).getNodePathIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponseOrBuilder
        public boolean getRedirectToChat() {
            return ((OffplatformOpenResponse) ((g) this).instance).getRedirectToChat();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m559mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setHierarchyExisted(boolean z) {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).setHierarchyExisted(z);
            return this;
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(phc phcVar) {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).setHierarchyIdBytes(phcVar);
            return this;
        }

        public Builder setNodePathId(String str) {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).setNodePathId(str);
            return this;
        }

        public Builder setNodePathIdBytes(phc phcVar) {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).setNodePathIdBytes(phcVar);
            return this;
        }

        public Builder setRedirectToChat(boolean z) {
            copyOnWrite();
            ((OffplatformOpenResponse) ((g) this).instance).setRedirectToChat(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m558clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m560mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m557clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m561mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(OffplatformOpenResponse offplatformOpenResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(offplatformOpenResponse);
    }

    public static OffplatformOpenResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (OffplatformOpenResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static OffplatformOpenResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static OffplatformOpenResponse parseFrom(phc phcVar) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static OffplatformOpenResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static OffplatformOpenResponse parseFrom(byte[] bArr) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OffplatformOpenResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static OffplatformOpenResponse parseFrom(InputStream inputStream) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformOpenResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static OffplatformOpenResponse parseFrom(lwg lwgVar) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static OffplatformOpenResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (OffplatformOpenResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
