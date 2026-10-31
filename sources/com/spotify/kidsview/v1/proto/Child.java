package com.spotify.kidsview.v1.proto;

import com.google.protobuf.StringValue;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.fhc1;
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
public final class Child extends h implements ChildOrBuilder {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final Child DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int IS_FREE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private StringValue imageUri_;
    private boolean isFree_;
    private Profile profile_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.Child$1, reason: invalid class name */
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
        Child child = new Child();
        DEFAULT_INSTANCE = child;
        h.registerDefaultInstance(Child.class, child);
    }

    private Child() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildId() {
        this.childId_ = getDefaultInstance().getChildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUri() {
        this.imageUri_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFree() {
        this.isFree_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfile() {
        this.profile_ = null;
        this.bitField0_ &= -2;
    }

    public static Child getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImageUri(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.imageUri_;
        if (stringValue2 == null || stringValue2 == StringValue.o()) {
            this.imageUri_ = stringValue;
        } else {
            this.imageUri_ = StringValue.q(this.imageUri_).mergeFrom(stringValue).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProfile(Profile profile) {
        profile.getClass();
        Profile profile2 = this.profile_;
        if (profile2 == null || profile2 == Profile.getDefaultInstance()) {
            this.profile_ = profile;
        } else {
            this.profile_ = (Profile) ((Profile.Builder) Profile.newBuilder(this.profile_).mergeFrom(profile)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Child parseDelimitedFrom(InputStream inputStream) {
        return (Child) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Child parseFrom(ByteBuffer byteBuffer) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildId(String str) {
        str.getClass();
        this.childId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.childId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUri(StringValue stringValue) {
        stringValue.getClass();
        this.imageUri_ = stringValue;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFree(boolean z) {
        this.isFree_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfile(Profile profile) {
        profile.getClass();
        this.profile_ = profile;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007", new Object[]{"bitField0_", "childId_", "profile_", "imageUri_", "isFree_"});
        }
        if (iOrdinal == 3) {
            return new Child();
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
        synchronized (Child.class) {
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

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public String getChildId() {
        return this.childId_;
    }

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public phc getChildIdBytes() {
        return phc.i(this.childId_);
    }

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public StringValue getImageUri() {
        StringValue stringValue = this.imageUri_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public boolean getIsFree() {
        return this.isFree_;
    }

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public Profile getProfile() {
        Profile profile = this.profile_;
        return profile == null ? Profile.getDefaultInstance() : profile;
    }

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public boolean hasImageUri() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
    public boolean hasProfile() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ChildOrBuilder {
        private Builder() {
            super(Child.DEFAULT_INSTANCE);
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

        public Builder clearChildId() {
            copyOnWrite();
            ((Child) ((g) this).instance).clearChildId();
            return this;
        }

        public Builder clearImageUri() {
            copyOnWrite();
            ((Child) ((g) this).instance).clearImageUri();
            return this;
        }

        public Builder clearIsFree() {
            copyOnWrite();
            ((Child) ((g) this).instance).clearIsFree();
            return this;
        }

        public Builder clearProfile() {
            copyOnWrite();
            ((Child) ((g) this).instance).clearProfile();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public String getChildId() {
            return ((Child) ((g) this).instance).getChildId();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public phc getChildIdBytes() {
            return ((Child) ((g) this).instance).getChildIdBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public StringValue getImageUri() {
            return ((Child) ((g) this).instance).getImageUri();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public boolean getIsFree() {
            return ((Child) ((g) this).instance).getIsFree();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public Profile getProfile() {
            return ((Child) ((g) this).instance).getProfile();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public boolean hasImageUri() {
            return ((Child) ((g) this).instance).hasImageUri();
        }

        @Override // com.spotify.kidsview.v1.proto.ChildOrBuilder
        public boolean hasProfile() {
            return ((Child) ((g) this).instance).hasProfile();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m58mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeImageUri(StringValue stringValue) {
            copyOnWrite();
            ((Child) ((g) this).instance).mergeImageUri(stringValue);
            return this;
        }

        public Builder mergeProfile(Profile profile) {
            copyOnWrite();
            ((Child) ((g) this).instance).mergeProfile(profile);
            return this;
        }

        public Builder setChildId(String str) {
            copyOnWrite();
            ((Child) ((g) this).instance).setChildId(str);
            return this;
        }

        public Builder setChildIdBytes(phc phcVar) {
            copyOnWrite();
            ((Child) ((g) this).instance).setChildIdBytes(phcVar);
            return this;
        }

        public Builder setImageUri(fhc1 fhc1Var) {
            copyOnWrite();
            ((Child) ((g) this).instance).setImageUri(fhc1Var.build());
            return this;
        }

        public Builder setIsFree(boolean z) {
            copyOnWrite();
            ((Child) ((g) this).instance).setIsFree(z);
            return this;
        }

        public Builder setProfile(Profile.Builder builder) {
            copyOnWrite();
            ((Child) ((g) this).instance).setProfile((Profile) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m57clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m59mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m56clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m60mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setImageUri(StringValue stringValue) {
            copyOnWrite();
            ((Child) ((g) this).instance).setImageUri(stringValue);
            return this;
        }

        public Builder setProfile(Profile profile) {
            copyOnWrite();
            ((Child) ((g) this).instance).setProfile(profile);
            return this;
        }
    }

    public static Builder newBuilder(Child child) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(child);
    }

    public static Child parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Child) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Child parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Child parseFrom(phc phcVar) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Child parseFrom(phc phcVar, uz00 uz00Var) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Child parseFrom(byte[] bArr) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Child parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Child parseFrom(InputStream inputStream) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Child parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Child parseFrom(lwg lwgVar) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Child parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Child) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
