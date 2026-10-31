package com.spotify.kidsview.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ParentalControls extends h implements ParentalControlsOrBuilder {
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 1;
    public static final int ALLOW_VIDEO_FIELD_NUMBER = 2;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 5;
    private static final ParentalControls DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private boolean allowExplicitContent_;
    private boolean allowVideo_;
    private String dateOfBirth_ = "";
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.ParentalControls$1, reason: invalid class name */
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
        ParentalControls parentalControls = new ParentalControls();
        DEFAULT_INSTANCE = parentalControls;
        h.registerDefaultInstance(ParentalControls.class, parentalControls);
    }

    private ParentalControls() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowExplicitContent() {
        this.allowExplicitContent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowVideo() {
        this.allowVideo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirth() {
        this.dateOfBirth_ = getDefaultInstance().getDateOfBirth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirthMaxDate() {
        this.dateOfBirthMaxDate_ = getDefaultInstance().getDateOfBirthMaxDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirthMinDate() {
        this.dateOfBirthMinDate_ = getDefaultInstance().getDateOfBirthMinDate();
    }

    public static ParentalControls getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ParentalControls parseDelimitedFrom(InputStream inputStream) {
        return (ParentalControls) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParentalControls parseFrom(ByteBuffer byteBuffer) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowExplicitContent(boolean z) {
        this.allowExplicitContent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowVideo(boolean z) {
        this.allowVideo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirth(String str) {
        str.getClass();
        this.dateOfBirth_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.dateOfBirth_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthMaxDate(String str) {
        str.getClass();
        this.dateOfBirthMaxDate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthMaxDateBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.dateOfBirthMaxDate_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthMinDate(String str) {
        str.getClass();
        this.dateOfBirthMinDate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthMinDateBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.dateOfBirthMinDate_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"allowExplicitContent_", "allowVideo_", "dateOfBirth_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_"});
        }
        if (iOrdinal == 3) {
            return new ParentalControls();
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
        synchronized (ParentalControls.class) {
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

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public boolean getAllowVideo() {
        return this.allowVideo_;
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public phc getDateOfBirthBytes() {
        return phc.i(this.dateOfBirth_);
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public String getDateOfBirthMaxDate() {
        return this.dateOfBirthMaxDate_;
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public phc getDateOfBirthMaxDateBytes() {
        return phc.i(this.dateOfBirthMaxDate_);
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public String getDateOfBirthMinDate() {
        return this.dateOfBirthMinDate_;
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public phc getDateOfBirthMinDateBytes() {
        return phc.i(this.dateOfBirthMinDate_);
    }

    @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ParentalControlsOrBuilder {
        private Builder() {
            super(ParentalControls.DEFAULT_INSTANCE);
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

        public Builder clearAllowExplicitContent() {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).clearAllowExplicitContent();
            return this;
        }

        public Builder clearAllowVideo() {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).clearAllowVideo();
            return this;
        }

        public Builder clearDateOfBirth() {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).clearDateOfBirth();
            return this;
        }

        public Builder clearDateOfBirthMaxDate() {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).clearDateOfBirthMaxDate();
            return this;
        }

        public Builder clearDateOfBirthMinDate() {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).clearDateOfBirthMinDate();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public boolean getAllowExplicitContent() {
            return ((ParentalControls) ((g) this).instance).getAllowExplicitContent();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public boolean getAllowVideo() {
            return ((ParentalControls) ((g) this).instance).getAllowVideo();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public String getDateOfBirth() {
            return ((ParentalControls) ((g) this).instance).getDateOfBirth();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public phc getDateOfBirthBytes() {
            return ((ParentalControls) ((g) this).instance).getDateOfBirthBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public String getDateOfBirthMaxDate() {
            return ((ParentalControls) ((g) this).instance).getDateOfBirthMaxDate();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public phc getDateOfBirthMaxDateBytes() {
            return ((ParentalControls) ((g) this).instance).getDateOfBirthMaxDateBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public String getDateOfBirthMinDate() {
            return ((ParentalControls) ((g) this).instance).getDateOfBirthMinDate();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public phc getDateOfBirthMinDateBytes() {
            return ((ParentalControls) ((g) this).instance).getDateOfBirthMinDateBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ParentalControlsOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m128mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAllowExplicitContent(boolean z) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setAllowExplicitContent(z);
            return this;
        }

        public Builder setAllowVideo(boolean z) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setAllowVideo(z);
            return this;
        }

        public Builder setDateOfBirth(String str) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setDateOfBirth(str);
            return this;
        }

        public Builder setDateOfBirthBytes(phc phcVar) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setDateOfBirthBytes(phcVar);
            return this;
        }

        public Builder setDateOfBirthMaxDate(String str) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setDateOfBirthMaxDate(str);
            return this;
        }

        public Builder setDateOfBirthMaxDateBytes(phc phcVar) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setDateOfBirthMaxDateBytes(phcVar);
            return this;
        }

        public Builder setDateOfBirthMinDate(String str) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setDateOfBirthMinDate(str);
            return this;
        }

        public Builder setDateOfBirthMinDateBytes(phc phcVar) {
            copyOnWrite();
            ((ParentalControls) ((g) this).instance).setDateOfBirthMinDateBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m127clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m129mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m126clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m130mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ParentalControls parentalControls) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(parentalControls);
    }

    public static ParentalControls parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ParentalControls) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ParentalControls parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ParentalControls parseFrom(phc phcVar) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ParentalControls parseFrom(phc phcVar, uz00 uz00Var) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ParentalControls parseFrom(byte[] bArr) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ParentalControls parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ParentalControls parseFrom(InputStream inputStream) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParentalControls parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ParentalControls parseFrom(lwg lwgVar) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ParentalControls parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ParentalControls) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
