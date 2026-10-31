package com.spotify.kidsview.v1.proto;

import com.google.protobuf.Int32Value;
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
import p.zq80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Profile extends h implements ProfileOrBuilder {
    public static final int ALLOWED_IN_MUSIC_APP_FIELD_NUMBER = 3;
    public static final int AVATAR_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final Profile DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int V2_AVATAR_FIELD_NUMBER = 5;
    private boolean allowedInMusicApp_;
    private int bitField0_;
    private Int32Value color_;
    private int v2Avatar_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String avatar_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.Profile$1, reason: invalid class name */
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
        Profile profile = new Profile();
        DEFAULT_INSTANCE = profile;
        h.registerDefaultInstance(Profile.class, profile);
    }

    private Profile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedInMusicApp() {
        this.allowedInMusicApp_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = getDefaultInstance().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOfBirth() {
        this.dateOfBirth_ = getDefaultInstance().getDateOfBirth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearV2Avatar() {
        this.bitField0_ &= -2;
        this.v2Avatar_ = 0;
    }

    public static Profile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColor(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.color_;
        if (int32Value2 == null || int32Value2 == Int32Value.o()) {
            this.color_ = int32Value;
        } else {
            this.color_ = ((zq80) Int32Value.q(this.color_).mergeFrom(int32Value)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Profile parseDelimitedFrom(InputStream inputStream) {
        return (Profile) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Profile parseFrom(ByteBuffer byteBuffer) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedInMusicApp(boolean z) {
        this.allowedInMusicApp_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        str.getClass();
        this.avatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.avatar_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(Int32Value int32Value) {
        int32Value.getClass();
        this.color_ = int32Value;
        this.bitField0_ |= 2;
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
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.name_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setV2Avatar(Avatar avatar) {
        this.v2Avatar_ = avatar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setV2AvatarValue(int i) {
        this.bitField0_ |= 1;
        this.v2Avatar_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005ဌ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "name_", "dateOfBirth_", "allowedInMusicApp_", "avatar_", "v2Avatar_", "color_"});
        }
        if (iOrdinal == 3) {
            return new Profile();
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
        synchronized (Profile.class) {
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

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public boolean getAllowedInMusicApp() {
        return this.allowedInMusicApp_;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public String getAvatar() {
        return this.avatar_;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public phc getAvatarBytes() {
        return phc.i(this.avatar_);
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.o() : int32Value;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public phc getDateOfBirthBytes() {
        return phc.i(this.dateOfBirth_);
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public Avatar getV2Avatar() {
        Avatar avatarForNumber = Avatar.forNumber(this.v2Avatar_);
        return avatarForNumber == null ? Avatar.UNRECOGNIZED : avatarForNumber;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public int getV2AvatarValue() {
        return this.v2Avatar_;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public boolean hasColor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
    public boolean hasV2Avatar() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ProfileOrBuilder {
        private Builder() {
            super(Profile.DEFAULT_INSTANCE);
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

        public Builder clearAllowedInMusicApp() {
            copyOnWrite();
            ((Profile) ((g) this).instance).clearAllowedInMusicApp();
            return this;
        }

        public Builder clearAvatar() {
            copyOnWrite();
            ((Profile) ((g) this).instance).clearAvatar();
            return this;
        }

        public Builder clearColor() {
            copyOnWrite();
            ((Profile) ((g) this).instance).clearColor();
            return this;
        }

        public Builder clearDateOfBirth() {
            copyOnWrite();
            ((Profile) ((g) this).instance).clearDateOfBirth();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Profile) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearV2Avatar() {
            copyOnWrite();
            ((Profile) ((g) this).instance).clearV2Avatar();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public boolean getAllowedInMusicApp() {
            return ((Profile) ((g) this).instance).getAllowedInMusicApp();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public String getAvatar() {
            return ((Profile) ((g) this).instance).getAvatar();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public phc getAvatarBytes() {
            return ((Profile) ((g) this).instance).getAvatarBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public Int32Value getColor() {
            return ((Profile) ((g) this).instance).getColor();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public String getDateOfBirth() {
            return ((Profile) ((g) this).instance).getDateOfBirth();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public phc getDateOfBirthBytes() {
            return ((Profile) ((g) this).instance).getDateOfBirthBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public String getName() {
            return ((Profile) ((g) this).instance).getName();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public phc getNameBytes() {
            return ((Profile) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public Avatar getV2Avatar() {
            return ((Profile) ((g) this).instance).getV2Avatar();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public int getV2AvatarValue() {
            return ((Profile) ((g) this).instance).getV2AvatarValue();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public boolean hasColor() {
            return ((Profile) ((g) this).instance).hasColor();
        }

        @Override // com.spotify.kidsview.v1.proto.ProfileOrBuilder
        public boolean hasV2Avatar() {
            return ((Profile) ((g) this).instance).hasV2Avatar();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeColor(Int32Value int32Value) {
            copyOnWrite();
            ((Profile) ((g) this).instance).mergeColor(int32Value);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m138mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAllowedInMusicApp(boolean z) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setAllowedInMusicApp(z);
            return this;
        }

        public Builder setAvatar(String str) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setAvatar(str);
            return this;
        }

        public Builder setAvatarBytes(phc phcVar) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setAvatarBytes(phcVar);
            return this;
        }

        public Builder setColor(zq80 zq80Var) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setColor(zq80Var.build());
            return this;
        }

        public Builder setDateOfBirth(String str) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setDateOfBirth(str);
            return this;
        }

        public Builder setDateOfBirthBytes(phc phcVar) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setDateOfBirthBytes(phcVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        public Builder setV2Avatar(Avatar avatar) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setV2Avatar(avatar);
            return this;
        }

        public Builder setV2AvatarValue(int i) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setV2AvatarValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m137clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m139mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m136clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m140mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setColor(Int32Value int32Value) {
            copyOnWrite();
            ((Profile) ((g) this).instance).setColor(int32Value);
            return this;
        }
    }

    public static Builder newBuilder(Profile profile) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(profile);
    }

    public static Profile parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Profile) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Profile parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Profile parseFrom(phc phcVar) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Profile parseFrom(phc phcVar, uz00 uz00Var) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Profile parseFrom(byte[] bArr) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Profile parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Profile parseFrom(InputStream inputStream) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Profile parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Profile parseFrom(lwg lwgVar) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Profile parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Profile) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
