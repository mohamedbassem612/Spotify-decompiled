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
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class InviteLinkOpenResponse extends h implements InviteLinkOpenResponseOrBuilder {
    private static final InviteLinkOpenResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECT_FIELD_NUMBER = 1;
    private int bitField0_;
    private Redirect redirect_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse$1, reason: invalid class name */
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

    public interface RedirectOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getHierarchyId();

        phc getHierarchyIdBytes();

        String getNodePathId();

        phc getNodePathIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    static {
        InviteLinkOpenResponse inviteLinkOpenResponse = new InviteLinkOpenResponse();
        DEFAULT_INSTANCE = inviteLinkOpenResponse;
        h.registerDefaultInstance(InviteLinkOpenResponse.class, inviteLinkOpenResponse);
    }

    private InviteLinkOpenResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRedirect() {
        this.redirect_ = null;
        this.bitField0_ &= -2;
    }

    public static InviteLinkOpenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRedirect(Redirect redirect) {
        redirect.getClass();
        Redirect redirect2 = this.redirect_;
        if (redirect2 == null || redirect2 == Redirect.getDefaultInstance()) {
            this.redirect_ = redirect;
        } else {
            this.redirect_ = (Redirect) ((Redirect.Builder) Redirect.newBuilder(this.redirect_).mergeFrom(redirect)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static InviteLinkOpenResponse parseDelimitedFrom(InputStream inputStream) {
        return (InviteLinkOpenResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteLinkOpenResponse parseFrom(ByteBuffer byteBuffer) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRedirect(Redirect redirect) {
        redirect.getClass();
        this.redirect_ = redirect;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "redirect_"});
        }
        if (iOrdinal == 3) {
            return new InviteLinkOpenResponse();
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
        synchronized (InviteLinkOpenResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
    public Redirect getRedirect() {
        Redirect redirect = this.redirect_;
        return redirect == null ? Redirect.getDefaultInstance() : redirect;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
    public boolean hasRedirect() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Redirect extends h implements RedirectOrBuilder {
        private static final Redirect DEFAULT_INSTANCE;
        public static final int HIERARCHY_ID_FIELD_NUMBER = 3;
        public static final int NODE_PATH_ID_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private String nodePathId_ = "";
        private String hierarchyId_ = "";

        static {
            Redirect redirect = new Redirect();
            DEFAULT_INSTANCE = redirect;
            h.registerDefaultInstance(Redirect.class, redirect);
        }

        private Redirect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHierarchyId() {
            this.hierarchyId_ = getDefaultInstance().getHierarchyId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNodePathId() {
            this.nodePathId_ = getDefaultInstance().getNodePathId();
        }

        public static Redirect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Redirect parseDelimitedFrom(InputStream inputStream) {
            return (Redirect) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Redirect parseFrom(ByteBuffer byteBuffer) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        public void setNodePathId(String str) {
            str.getClass();
            this.nodePathId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodePathIdBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.nodePathId_ = phcVar.v();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"nodePathId_", "hierarchyId_"});
            }
            if (iOrdinal == 3) {
                return new Redirect();
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
            synchronized (Redirect.class) {
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

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public String getHierarchyId() {
            return this.hierarchyId_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public phc getHierarchyIdBytes() {
            return phc.i(this.hierarchyId_);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public String getNodePathId() {
            return this.nodePathId_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
        public phc getNodePathIdBytes() {
            return phc.i(this.nodePathId_);
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements RedirectOrBuilder {
            private Builder() {
                super(Redirect.DEFAULT_INSTANCE);
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
                ((Redirect) ((g) this).instance).clearHierarchyId();
                return this;
            }

            public Builder clearNodePathId() {
                copyOnWrite();
                ((Redirect) ((g) this).instance).clearNodePathId();
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public String getHierarchyId() {
                return ((Redirect) ((g) this).instance).getHierarchyId();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public phc getHierarchyIdBytes() {
                return ((Redirect) ((g) this).instance).getHierarchyIdBytes();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public String getNodePathId() {
                return ((Redirect) ((g) this).instance).getNodePathId();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse.RedirectOrBuilder
            public phc getNodePathIdBytes() {
                return ((Redirect) ((g) this).instance).getNodePathIdBytes();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m443mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public Builder setHierarchyId(String str) {
                copyOnWrite();
                ((Redirect) ((g) this).instance).setHierarchyId(str);
                return this;
            }

            public Builder setHierarchyIdBytes(phc phcVar) {
                copyOnWrite();
                ((Redirect) ((g) this).instance).setHierarchyIdBytes(phcVar);
                return this;
            }

            public Builder setNodePathId(String str) {
                copyOnWrite();
                ((Redirect) ((g) this).instance).setNodePathId(str);
                return this;
            }

            public Builder setNodePathIdBytes(phc phcVar) {
                copyOnWrite();
                ((Redirect) ((g) this).instance).setNodePathIdBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m442clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m444mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m441clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m445mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public static Builder newBuilder(Redirect redirect) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(redirect);
        }

        public static Redirect parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Redirect) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Redirect parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Redirect parseFrom(phc phcVar) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Redirect parseFrom(phc phcVar, uz00 uz00Var) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static Redirect parseFrom(byte[] bArr) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Redirect parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Redirect parseFrom(InputStream inputStream) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Redirect parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Redirect parseFrom(lwg lwgVar) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Redirect parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Redirect) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Builder extends g implements InviteLinkOpenResponseOrBuilder {
        private Builder() {
            super(InviteLinkOpenResponse.DEFAULT_INSTANCE);
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

        public Builder clearRedirect() {
            copyOnWrite();
            ((InviteLinkOpenResponse) ((g) this).instance).clearRedirect();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
        public Redirect getRedirect() {
            return ((InviteLinkOpenResponse) ((g) this).instance).getRedirect();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponseOrBuilder
        public boolean hasRedirect() {
            return ((InviteLinkOpenResponse) ((g) this).instance).hasRedirect();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m438mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeRedirect(Redirect redirect) {
            copyOnWrite();
            ((InviteLinkOpenResponse) ((g) this).instance).mergeRedirect(redirect);
            return this;
        }

        public Builder setRedirect(Redirect.Builder builder) {
            copyOnWrite();
            ((InviteLinkOpenResponse) ((g) this).instance).setRedirect((Redirect) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m437clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m439mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m436clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m440mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setRedirect(Redirect redirect) {
            copyOnWrite();
            ((InviteLinkOpenResponse) ((g) this).instance).setRedirect(redirect);
            return this;
        }
    }

    public static Builder newBuilder(InviteLinkOpenResponse inviteLinkOpenResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(inviteLinkOpenResponse);
    }

    public static InviteLinkOpenResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (InviteLinkOpenResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static InviteLinkOpenResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static InviteLinkOpenResponse parseFrom(phc phcVar) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static InviteLinkOpenResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static InviteLinkOpenResponse parseFrom(byte[] bArr) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InviteLinkOpenResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static InviteLinkOpenResponse parseFrom(InputStream inputStream) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InviteLinkOpenResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static InviteLinkOpenResponse parseFrom(lwg lwgVar) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static InviteLinkOpenResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (InviteLinkOpenResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
