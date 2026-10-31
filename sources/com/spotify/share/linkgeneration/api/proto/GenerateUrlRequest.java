package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.je40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class GenerateUrlRequest extends h implements v2j0 {
    public static final int CUSTOM_DATA_FIELD_NUMBER = 3;
    private static final GenerateUrlRequest DEFAULT_INSTANCE;
    public static final int LINK_PREVIEW_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SPOTIFY_URI_FIELD_NUMBER = 1;
    public static final int UTM_PARAMETERS_FIELD_NUMBER = 2;
    private int bitField0_;
    private LinkPreview linkPreview_;
    private UtmParameters utmParameters_;
    private String spotifyUri_ = "";
    private h290 customData_ = h.emptyProtobufList();

    static {
        GenerateUrlRequest generateUrlRequest = new GenerateUrlRequest();
        DEFAULT_INSTANCE = generateUrlRequest;
        h.registerDefaultInstance(GenerateUrlRequest.class, generateUrlRequest);
    }

    private GenerateUrlRequest() {
    }

    public static je40 p() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "spotifyUri_", "utmParameters_", "customData_", CustomData.class, "linkPreview_"});
        }
        if (iOrdinal == 3) {
            return new GenerateUrlRequest();
        }
        if (iOrdinal == 4) {
            return new je40();
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
        synchronized (GenerateUrlRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(CustomData customData) {
        customData.getClass();
        h290 h290VarMutableCopy = this.customData_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.customData_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(customData);
    }

    public final void q(LinkPreview linkPreview) {
        this.linkPreview_ = linkPreview;
        this.bitField0_ |= 2;
    }

    public final void r(String str) {
        str.getClass();
        this.spotifyUri_ = str;
    }

    public final void s(UtmParameters utmParameters) {
        this.utmParameters_ = utmParameters;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
