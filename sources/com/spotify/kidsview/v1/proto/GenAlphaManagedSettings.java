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
public final class GenAlphaManagedSettings extends h implements GenAlphaManagedSettingsOrBuilder {
    public static final int ALLOW_CONNECT_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int ALLOW_VIDEO_CONTENT_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final GenAlphaManagedSettings DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean allowConnect_;
    private boolean allowExplicitContent_;
    private boolean allowVideoContent_;
    private int bitField0_;
    private String displayName_ = "";
    private String dateOfBirth_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GenAlphaManagedSettings$1, reason: invalid class name */
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
        GenAlphaManagedSettings genAlphaManagedSettings = new GenAlphaManagedSettings();
        DEFAULT_INSTANCE = genAlphaManagedSettings;
        h.registerDefaultInstance(GenAlphaManagedSettings.class, genAlphaManagedSettings);
    }

    private GenAlphaManagedSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowConnect() {
        this.bitField0_ &= -17;
        this.allowConnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowExplicitContent() {
        this.bitField0_ &= -5;
        this.allowExplicitContent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowVideoContent() {
        this.bitField0_ &= -9;
        this.allowVideoContent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirth() {
        this.bitField0_ &= -3;
        this.dateOfBirth_ = getDefaultInstance().getDateOfBirth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.bitField0_ &= -2;
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    public static GenAlphaManagedSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenAlphaManagedSettings parseDelimitedFrom(InputStream inputStream) {
        return (GenAlphaManagedSettings) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenAlphaManagedSettings parseFrom(ByteBuffer byteBuffer) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowConnect(boolean z) {
        this.bitField0_ |= 16;
        this.allowConnect_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowExplicitContent(boolean z) {
        this.bitField0_ |= 4;
        this.allowExplicitContent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowVideoContent(boolean z) {
        this.bitField0_ |= 8;
        this.allowVideoContent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirth(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.dateOfBirth_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOfBirthBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.dateOfBirth_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.displayName_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "displayName_", "dateOfBirth_", "allowExplicitContent_", "allowVideoContent_", "allowConnect_"});
        }
        if (iOrdinal == 3) {
            return new GenAlphaManagedSettings();
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
        synchronized (GenAlphaManagedSettings.class) {
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

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean getAllowConnect() {
        return this.allowConnect_;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean getAllowVideoContent() {
        return this.allowVideoContent_;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public phc getDateOfBirthBytes() {
        return phc.i(this.dateOfBirth_);
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public phc getDisplayNameBytes() {
        return phc.i(this.displayName_);
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasAllowConnect() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasAllowExplicitContent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasAllowVideoContent() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasDateOfBirth() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
    public boolean hasDisplayName() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GenAlphaManagedSettingsOrBuilder {
        private Builder() {
            super(GenAlphaManagedSettings.DEFAULT_INSTANCE);
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

        public Builder clearAllowConnect() {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).clearAllowConnect();
            return this;
        }

        public Builder clearAllowExplicitContent() {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).clearAllowExplicitContent();
            return this;
        }

        public Builder clearAllowVideoContent() {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).clearAllowVideoContent();
            return this;
        }

        public Builder clearDateOfBirth() {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).clearDateOfBirth();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).clearDisplayName();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean getAllowConnect() {
            return ((GenAlphaManagedSettings) ((g) this).instance).getAllowConnect();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean getAllowExplicitContent() {
            return ((GenAlphaManagedSettings) ((g) this).instance).getAllowExplicitContent();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean getAllowVideoContent() {
            return ((GenAlphaManagedSettings) ((g) this).instance).getAllowVideoContent();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public String getDateOfBirth() {
            return ((GenAlphaManagedSettings) ((g) this).instance).getDateOfBirth();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public phc getDateOfBirthBytes() {
            return ((GenAlphaManagedSettings) ((g) this).instance).getDateOfBirthBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public String getDisplayName() {
            return ((GenAlphaManagedSettings) ((g) this).instance).getDisplayName();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public phc getDisplayNameBytes() {
            return ((GenAlphaManagedSettings) ((g) this).instance).getDisplayNameBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasAllowConnect() {
            return ((GenAlphaManagedSettings) ((g) this).instance).hasAllowConnect();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasAllowExplicitContent() {
            return ((GenAlphaManagedSettings) ((g) this).instance).hasAllowExplicitContent();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasAllowVideoContent() {
            return ((GenAlphaManagedSettings) ((g) this).instance).hasAllowVideoContent();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasDateOfBirth() {
            return ((GenAlphaManagedSettings) ((g) this).instance).hasDateOfBirth();
        }

        @Override // com.spotify.kidsview.v1.proto.GenAlphaManagedSettingsOrBuilder
        public boolean hasDisplayName() {
            return ((GenAlphaManagedSettings) ((g) this).instance).hasDisplayName();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m83mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAllowConnect(boolean z) {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).setAllowConnect(z);
            return this;
        }

        public Builder setAllowExplicitContent(boolean z) {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).setAllowExplicitContent(z);
            return this;
        }

        public Builder setAllowVideoContent(boolean z) {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).setAllowVideoContent(z);
            return this;
        }

        public Builder setDateOfBirth(String str) {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).setDateOfBirth(str);
            return this;
        }

        public Builder setDateOfBirthBytes(phc phcVar) {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).setDateOfBirthBytes(phcVar);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(phc phcVar) {
            copyOnWrite();
            ((GenAlphaManagedSettings) ((g) this).instance).setDisplayNameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m82clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m84mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m81clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m85mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GenAlphaManagedSettings genAlphaManagedSettings) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(genAlphaManagedSettings);
    }

    public static GenAlphaManagedSettings parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GenAlphaManagedSettings) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GenAlphaManagedSettings parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GenAlphaManagedSettings parseFrom(phc phcVar) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GenAlphaManagedSettings parseFrom(phc phcVar, uz00 uz00Var) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GenAlphaManagedSettings parseFrom(byte[] bArr) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenAlphaManagedSettings parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GenAlphaManagedSettings parseFrom(InputStream inputStream) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenAlphaManagedSettings parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GenAlphaManagedSettings parseFrom(lwg lwgVar) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GenAlphaManagedSettings parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GenAlphaManagedSettings) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
