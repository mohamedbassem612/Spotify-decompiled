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
public final class AlbumDecorationPolicy extends h implements AlbumDecorationPolicyOrBuilder {
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final AlbumDecorationPolicy DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 5;
    private boolean covers_;
    private boolean link_;
    private boolean name_;
    private boolean year_;

    static {
        AlbumDecorationPolicy albumDecorationPolicy = new AlbumDecorationPolicy();
        DEFAULT_INSTANCE = albumDecorationPolicy;
        h.registerDefaultInstance(AlbumDecorationPolicy.class, albumDecorationPolicy);
    }

    private AlbumDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = false;
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
    public void setCovers(boolean z) {
        this.covers_ = z;
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
    public void setYear(boolean z) {
        this.year_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0004\u0007\u0005\u0007", new Object[]{"link_", "name_", "covers_", "year_"});
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

    @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
    public boolean getYear() {
        return this.year_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AlbumDecorationPolicyOrBuilder {
        private Builder() {
            super(AlbumDecorationPolicy.DEFAULT_INSTANCE);
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

        public Builder clearCovers() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearCovers();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearYear() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearYear();
            return this;
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo3clone() {
            return super.mo1clone();
        }

        @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((AlbumDecorationPolicy) this.instance).getCovers();
        }

        @Override // com.google.protobuf.g, p.v2j0
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((AlbumDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
        public boolean getName() {
            return ((AlbumDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicyOrBuilder
        public boolean getYear() {
            return ((AlbumDecorationPolicy) this.instance).getYear();
        }

        @Override // com.google.protobuf.g, p.r8
        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        @Override // com.google.protobuf.g, p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setCovers(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setYear(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setYear(z);
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
