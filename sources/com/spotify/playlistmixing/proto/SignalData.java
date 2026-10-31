package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.pl81;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class SignalData extends h implements v2j0 {
    public static final int ADDITIONAL_DATA_FIELD_NUMBER = 4;
    private static final SignalData DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 3;
    public static final int LENS_IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private phc additionalData_;
    private phc itemId_;
    private String lensIdentifier_ = "";
    private String uri_ = "";

    static {
        SignalData signalData = new SignalData();
        DEFAULT_INSTANCE = signalData;
        h.registerDefaultInstance(SignalData.class, signalData);
    }

    private SignalData() {
        hhc hhcVar = phc.b;
        this.itemId_ = hhcVar;
        this.additionalData_ = hhcVar;
    }

    public static pl81 n() {
        return (pl81) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\n", new Object[]{"lensIdentifier_", "uri_", "itemId_", "additionalData_"});
        }
        if (iOrdinal == 3) {
            return new SignalData();
        }
        if (iOrdinal == 4) {
            return new pl81(DEFAULT_INSTANCE);
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
        synchronized (SignalData.class) {
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

    public final void o() {
        this.lensIdentifier_ = "mix";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
