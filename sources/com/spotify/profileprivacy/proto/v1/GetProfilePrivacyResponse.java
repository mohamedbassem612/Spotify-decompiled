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
public final class GetProfilePrivacyResponse extends h implements GetProfilePrivacyResponseOrBuilder {
    public static final int ALLOW_FOLLOWS_FIELD_NUMBER = 3;
    private static final GetProfilePrivacyResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_FOLLOWS_FIELD_NUMBER = 4;
    public static final int SHOW_PUBLISHED_PLAYLISTS_FIELD_NUMBER = 5;
    private boolean allowFollows_;
    private boolean showFollows_;
    private boolean showPublishedPlaylists_;

    /* JADX INFO: renamed from: com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponse$1, reason: invalid class name */
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
        GetProfilePrivacyResponse getProfilePrivacyResponse = new GetProfilePrivacyResponse();
        DEFAULT_INSTANCE = getProfilePrivacyResponse;
        h.registerDefaultInstance(GetProfilePrivacyResponse.class, getProfilePrivacyResponse);
    }

    private GetProfilePrivacyResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowFollows() {
        this.allowFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowFollows() {
        this.showFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowPublishedPlaylists() {
        this.showPublishedPlaylists_ = false;
    }

    public static GetProfilePrivacyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetProfilePrivacyResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetProfilePrivacyResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetProfilePrivacyResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowFollows(boolean z) {
        this.allowFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowFollows(boolean z) {
        this.showFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowPublishedPlaylists(boolean z) {
        this.showPublishedPlaylists_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"allowFollows_", "showFollows_", "showPublishedPlaylists_"});
        }
        if (iOrdinal == 3) {
            return new GetProfilePrivacyResponse();
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
        synchronized (GetProfilePrivacyResponse.class) {
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

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
    public boolean getAllowFollows() {
        return this.allowFollows_;
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
    public boolean getShowFollows() {
        return this.showFollows_;
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
    public boolean getShowPublishedPlaylists() {
        return this.showPublishedPlaylists_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetProfilePrivacyResponseOrBuilder {
        private Builder() {
            super(GetProfilePrivacyResponse.DEFAULT_INSTANCE);
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

        public Builder clearAllowFollows() {
            copyOnWrite();
            ((GetProfilePrivacyResponse) ((g) this).instance).clearAllowFollows();
            return this;
        }

        public Builder clearShowFollows() {
            copyOnWrite();
            ((GetProfilePrivacyResponse) ((g) this).instance).clearShowFollows();
            return this;
        }

        public Builder clearShowPublishedPlaylists() {
            copyOnWrite();
            ((GetProfilePrivacyResponse) ((g) this).instance).clearShowPublishedPlaylists();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
        public boolean getAllowFollows() {
            return ((GetProfilePrivacyResponse) ((g) this).instance).getAllowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
        public boolean getShowFollows() {
            return ((GetProfilePrivacyResponse) ((g) this).instance).getShowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponseOrBuilder
        public boolean getShowPublishedPlaylists() {
            return ((GetProfilePrivacyResponse) ((g) this).instance).getShowPublishedPlaylists();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m929mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAllowFollows(boolean z) {
            copyOnWrite();
            ((GetProfilePrivacyResponse) ((g) this).instance).setAllowFollows(z);
            return this;
        }

        public Builder setShowFollows(boolean z) {
            copyOnWrite();
            ((GetProfilePrivacyResponse) ((g) this).instance).setShowFollows(z);
            return this;
        }

        public Builder setShowPublishedPlaylists(boolean z) {
            copyOnWrite();
            ((GetProfilePrivacyResponse) ((g) this).instance).setShowPublishedPlaylists(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m928clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m930mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m927clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m931mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GetProfilePrivacyResponse getProfilePrivacyResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getProfilePrivacyResponse);
    }

    public static GetProfilePrivacyResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetProfilePrivacyResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetProfilePrivacyResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetProfilePrivacyResponse parseFrom(phc phcVar) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetProfilePrivacyResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetProfilePrivacyResponse parseFrom(byte[] bArr) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetProfilePrivacyResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetProfilePrivacyResponse parseFrom(InputStream inputStream) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetProfilePrivacyResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetProfilePrivacyResponse parseFrom(lwg lwgVar) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetProfilePrivacyResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetProfilePrivacyResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
