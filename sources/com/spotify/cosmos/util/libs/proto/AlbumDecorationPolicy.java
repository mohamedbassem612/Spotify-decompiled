package com.spotify.cosmos.util.libs.proto;

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
public final class AlbumDecorationPolicy extends h implements AlbumDecorationPolicyOrBuilder {
    public static final int COPYRIGHTS_FIELD_NUMBER = 3;
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final AlbumDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 9;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_DISCS_FIELD_NUMBER = 6;
    public static final int NUM_TRACKS_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 5;
    private boolean copyrights_;
    private boolean covers_;
    private boolean isPremiumOnly_;
    private boolean link_;
    private boolean name_;
    private boolean numDiscs_;
    private boolean numTracks_;
    private boolean playability_;
    private boolean year_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicy$1, reason: invalid class name */
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
        AlbumDecorationPolicy albumDecorationPolicy = new AlbumDecorationPolicy();
        DEFAULT_INSTANCE = albumDecorationPolicy;
        h.registerDefaultInstance(AlbumDecorationPolicy.class, albumDecorationPolicy);
    }

    private AlbumDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyrights() {
        this.copyrights_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPremiumOnly() {
        this.isPremiumOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumDiscs() {
        this.numDiscs_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracks() {
        this.numTracks_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayability() {
        this.playability_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.year_ = false;
    }

    public static AlbumDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlbumDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (AlbumDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrights(boolean z) {
        this.copyrights_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(boolean z) {
        this.covers_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPremiumOnly(boolean z) {
        this.isPremiumOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(boolean z) {
        this.link_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(boolean z) {
        this.name_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumDiscs(boolean z) {
        this.numDiscs_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracks(boolean z) {
        this.numTracks_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayability(boolean z) {
        this.playability_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(boolean z) {
        this.year_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007", new Object[]{"link_", "name_", "copyrights_", "covers_", "year_", "numDiscs_", "numTracks_", "playability_", "isPremiumOnly_"});
        }
        if (iOrdinal == 3) {
            return new AlbumDecorationPolicy();
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
        synchronized (AlbumDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getCopyrights() {
        return this.copyrights_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getNumDiscs() {
        return this.numDiscs_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getNumTracks() {
        return this.numTracks_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getPlayability() {
        return this.playability_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
    public boolean getYear() {
        return this.year_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AlbumDecorationPolicyOrBuilder {
        private Builder() {
            super(AlbumDecorationPolicy.DEFAULT_INSTANCE);
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

        public Builder clearCopyrights() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearCopyrights();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearCovers();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearNumDiscs() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearNumDiscs();
            return this;
        }

        public Builder clearNumTracks() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearNumTracks();
            return this;
        }

        public Builder clearPlayability() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearPlayability();
            return this;
        }

        public Builder clearYear() {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).clearYear();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getCopyrights() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getCopyrights();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getIsPremiumOnly() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getName() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getNumDiscs() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getNumDiscs();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getNumTracks() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getNumTracks();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getPlayability() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getPlayability();
        }

        @Override // com.spotify.cosmos.util.libs.proto.AlbumDecorationPolicyOrBuilder
        public boolean getYear() {
            return ((AlbumDecorationPolicy) ((g) this).instance).getYear();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1284mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setCopyrights(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setCopyrights(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setCovers(z);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setLink(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setName(z);
            return this;
        }

        public Builder setNumDiscs(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setNumDiscs(z);
            return this;
        }

        public Builder setNumTracks(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setNumTracks(z);
            return this;
        }

        public Builder setPlayability(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setPlayability(z);
            return this;
        }

        public Builder setYear(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) ((g) this).instance).setYear(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1283clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1285mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1282clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1286mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(AlbumDecorationPolicy albumDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(albumDecorationPolicy);
    }

    public static AlbumDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AlbumDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AlbumDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AlbumDecorationPolicy parseFrom(phc phcVar) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AlbumDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static AlbumDecorationPolicy parseFrom(byte[] bArr) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlbumDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AlbumDecorationPolicy parseFrom(InputStream inputStream) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AlbumDecorationPolicy parseFrom(lwg lwgVar) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AlbumDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AlbumDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
