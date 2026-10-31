package com.spotify.lyrics.sharecard.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ppf0;
import p.qng0;
import p.qpf0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LyricsSharingV3 extends h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 3;
    public static final int CARD_BACKGROUND_VISIBLE_FIELD_NUMBER = 4;
    private static final LyricsSharingV3 DEFAULT_INSTANCE;
    public static final int DESTINATION_NETWORK_FIELD_NUMBER = 7;
    public static final int LYRICS_LINES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 5;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 6;
    public static final int SHARE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean cardBackgroundVisible_;
    private qng0 lyricsLines_ = qng0.b;
    private String shareId_ = "";
    private String background_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String destinationNetwork_ = "";

    static {
        LyricsSharingV3 lyricsSharingV3 = new LyricsSharingV3();
        DEFAULT_INSTANCE = lyricsSharingV3;
        h.registerDefaultInstance(LyricsSharingV3.class, lyricsSharingV3);
    }

    private LyricsSharingV3() {
    }

    public static ppf0 o() {
        return (ppf0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဈ\u0000\u00022\u0003ဈ\u0001\u0004ဇ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"bitField0_", "shareId_", "lyricsLines_", qpf0.a, "background_", "cardBackgroundVisible_", "provider_", "providerLyricsId_", "destinationNetwork_"});
        }
        if (iOrdinal == 3) {
            return new LyricsSharingV3();
        }
        if (iOrdinal == 4) {
            return new ppf0(DEFAULT_INSTANCE);
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
        synchronized (LyricsSharingV3.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final qng0 n() {
        qng0 qng0Var = this.lyricsLines_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.lyricsLines_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.background_ = str;
    }

    public final void q() {
        this.bitField0_ |= 4;
        this.cardBackgroundVisible_ = true;
    }

    public final void r(String str) {
        this.bitField0_ |= 32;
        this.destinationNetwork_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.provider_ = str;
    }

    public final void setShareId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.shareId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.providerLyricsId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
