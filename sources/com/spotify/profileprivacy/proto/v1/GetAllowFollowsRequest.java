package com.spotify.profileprivacy.proto.v1;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetAllowFollowsRequest extends h implements GetAllowFollowsRequestOrBuilder {
    private static final GetAllowFollowsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_ = "";

    /* JADX INFO: renamed from: com.spotify.profileprivacy.proto.v1.GetAllowFollowsRequest$1, reason: invalid class name */
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
        GetAllowFollowsRequest getAllowFollowsRequest = new GetAllowFollowsRequest();
        DEFAULT_INSTANCE = getAllowFollowsRequest;
        h.registerDefaultInstance(GetAllowFollowsRequest.class, getAllowFollowsRequest);
    }

    private GetAllowFollowsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }

    public static GetAllowFollowsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetAllowFollowsRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetAllowFollowsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetAllowFollowsRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        str.getClass();
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.username_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"username_"});
        }
        if (iOrdinal == 3) {
            return new GetAllowFollowsRequest();
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
        synchronized (GetAllowFollowsRequest.class) {
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

    @Override // com.spotify.profileprivacy.proto.v1.GetAllowFollowsRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetAllowFollowsRequestOrBuilder
    public String getUsername() {
        return this.username_;
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetAllowFollowsRequestOrBuilder
    public phc getUsernameBytes() {
        return phc.i(this.username_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetAllowFollowsRequestOrBuilder {
        private Builder() {
            super(GetAllowFollowsRequest.DEFAULT_INSTANCE);
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

        public Builder clearUsername() {
            copyOnWrite();
            ((GetAllowFollowsRequest) ((g) this).instance).clearUsername();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetAllowFollowsRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetAllowFollowsRequestOrBuilder
        public String getUsername() {
            return ((GetAllowFollowsRequest) ((g) this).instance).getUsername();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetAllowFollowsRequestOrBuilder
        public phc getUsernameBytes() {
            return ((GetAllowFollowsRequest) ((g) this).instance).getUsernameBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m914mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setUsername(String str) {
            copyOnWrite();
            ((GetAllowFollowsRequest) ((g) this).instance).setUsername(str);
            return this;
        }

        public Builder setUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((GetAllowFollowsRequest) ((g) this).instance).setUsernameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m913clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m915mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m912clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m916mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GetAllowFollowsRequest getAllowFollowsRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getAllowFollowsRequest);
    }

    public static GetAllowFollowsRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetAllowFollowsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetAllowFollowsRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetAllowFollowsRequest parseFrom(phc phcVar) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetAllowFollowsRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetAllowFollowsRequest parseFrom(byte[] bArr) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetAllowFollowsRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetAllowFollowsRequest parseFrom(InputStream inputStream) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetAllowFollowsRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetAllowFollowsRequest parseFrom(lwg lwgVar) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetAllowFollowsRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetAllowFollowsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
