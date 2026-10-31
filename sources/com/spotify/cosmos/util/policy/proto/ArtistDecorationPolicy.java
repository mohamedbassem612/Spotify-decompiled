package com.spotify.cosmos.util.policy.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ArtistDecorationPolicy extends h implements ArtistDecorationPolicyOrBuilder {
    private static final ArtistDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_VARIOUS_ARTISTS_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PORTRAITS_FIELD_NUMBER = 4;
    private boolean isVariousArtists_;
    private boolean link_;
    private boolean name_;
    private boolean portraits_;

    static {
        ArtistDecorationPolicy artistDecorationPolicy = new ArtistDecorationPolicy();
        DEFAULT_INSTANCE = artistDecorationPolicy;
        h.registerDefaultInstance(ArtistDecorationPolicy.class, artistDecorationPolicy);
    }

    private ArtistDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVariousArtists() {
        this.isVariousArtists_ = false;
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
    public void clearPortraits() {
        this.portraits_ = false;
    }

    public static ArtistDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ArtistDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVariousArtists(boolean z) {
        this.isVariousArtists_ = z;
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
    public void setPortraits(boolean z) {
        this.portraits_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"link_", "name_", "isVariousArtists_", "portraits_"});
        }
        if (iOrdinal == 3) {
            return new ArtistDecorationPolicy();
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
        synchronized (ArtistDecorationPolicy.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
    public boolean getIsVariousArtists() {
        return this.isVariousArtists_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
    public boolean getPortraits() {
        return this.portraits_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ArtistDecorationPolicyOrBuilder {
        private Builder() {
            super(ArtistDecorationPolicy.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ r2j0 mo0clear() {
            return mo0clear();
        }

        public Builder clearIsVariousArtists() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearIsVariousArtists();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearPortraits() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearPortraits();
            return this;
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo3clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.v2j0
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
        public boolean getIsVariousArtists() {
            return ((ArtistDecorationPolicy) this.instance).getIsVariousArtists();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((ArtistDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
        public boolean getName() {
            return ((ArtistDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicyOrBuilder
        public boolean getPortraits() {
            return ((ArtistDecorationPolicy) this.instance).getPortraits();
        }

        @Override // com.google.protobuf.g, p.r8
        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        @Override // com.google.protobuf.g, p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setIsVariousArtists(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setIsVariousArtists(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setPortraits(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setPortraits(z);
            return this;
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ r8 mo2clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.r8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r8 mo4mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo4mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ r2j0 mo2clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.r8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r8 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mo5mergeFrom(bArr, i, i2, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super.mergeFrom(inputStream, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super.mergeFrom(phcVar);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super.mergeFrom(phcVar, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super.mergeFrom(lwgVar);
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        @Override // p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super.mergeFrom(s2j0Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super.mergeFrom(bArr);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r2j0 mo4mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo4mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r2j0 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mo5mergeFrom(bArr, i, i2, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(ArtistDecorationPolicy artistDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(artistDecorationPolicy);
    }

    public static ArtistDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ArtistDecorationPolicy parseFrom(phc phcVar) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ArtistDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ArtistDecorationPolicy parseFrom(byte[] bArr) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ArtistDecorationPolicy parseFrom(InputStream inputStream) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistDecorationPolicy parseFrom(lwg lwgVar) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ArtistDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ArtistDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
