package com.spotify.cosmos.util.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ImageGroup extends h implements ImageGroupOrBuilder {
    private static final ImageGroup DEFAULT_INSTANCE;
    public static final int LARGE_LINK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SMALL_LINK_FIELD_NUMBER = 2;
    public static final int STANDARD_LINK_FIELD_NUMBER = 1;
    public static final int XLARGE_LINK_FIELD_NUMBER = 4;
    private int bitField0_;
    private String standardLink_ = "";
    private String smallLink_ = "";
    private String largeLink_ = "";
    private String xlargeLink_ = "";

    static {
        ImageGroup imageGroup = new ImageGroup();
        DEFAULT_INSTANCE = imageGroup;
        h.registerDefaultInstance(ImageGroup.class, imageGroup);
    }

    private ImageGroup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLargeLink() {
        this.bitField0_ &= -5;
        this.largeLink_ = getDefaultInstance().getLargeLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallLink() {
        this.bitField0_ &= -3;
        this.smallLink_ = getDefaultInstance().getSmallLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStandardLink() {
        this.bitField0_ &= -2;
        this.standardLink_ = getDefaultInstance().getStandardLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearXlargeLink() {
        this.bitField0_ &= -9;
        this.xlargeLink_ = getDefaultInstance().getXlargeLink();
    }

    public static ImageGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ImageGroup parseDelimitedFrom(InputStream inputStream) {
        return (ImageGroup) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImageGroup parseFrom(ByteBuffer byteBuffer) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeLink(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.largeLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeLinkBytes(phc phcVar) {
        this.largeLink_ = phcVar.v();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallLink(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.smallLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallLinkBytes(phc phcVar) {
        this.smallLink_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStandardLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.standardLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStandardLinkBytes(phc phcVar) {
        this.standardLink_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXlargeLink(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.xlargeLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXlargeLinkBytes(phc phcVar) {
        this.xlargeLink_ = phcVar.v();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "standardLink_", "smallLink_", "largeLink_", "xlargeLink_"});
        }
        if (iOrdinal == 3) {
            return new ImageGroup();
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
        synchronized (ImageGroup.class) {
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

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public String getLargeLink() {
        return this.largeLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public phc getLargeLinkBytes() {
        return phc.i(this.largeLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public String getSmallLink() {
        return this.smallLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public phc getSmallLinkBytes() {
        return phc.i(this.smallLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public String getStandardLink() {
        return this.standardLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public phc getStandardLinkBytes() {
        return phc.i(this.standardLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public String getXlargeLink() {
        return this.xlargeLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public phc getXlargeLinkBytes() {
        return phc.i(this.xlargeLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public boolean hasLargeLink() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public boolean hasSmallLink() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public boolean hasStandardLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ImageGroupOrBuilder
    public boolean hasXlargeLink() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ImageGroup imageGroup) {
        return DEFAULT_INSTANCE.createBuilder(imageGroup);
    }

    public static ImageGroup parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ImageGroup) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ImageGroup parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ImageGroup parseFrom(phc phcVar) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ImageGroup parseFrom(phc phcVar, uz00 uz00Var) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ImageGroup parseFrom(byte[] bArr) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImageGroup parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ImageGroup parseFrom(InputStream inputStream) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImageGroup parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ImageGroup parseFrom(lwg lwgVar) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ImageGroup parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ImageGroup) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
