package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.smz;
import p.tmz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsContextTrack$ContextTrack extends h implements v2j0 {
    private static final EsContextTrack$ContextTrack DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int UID_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private qng0 metadata_ = qng0.b;
    private String uri_ = "";
    private String uid_ = "";

    static {
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = new EsContextTrack$ContextTrack();
        DEFAULT_INSTANCE = esContextTrack$ContextTrack;
        h.registerDefaultInstance(EsContextTrack$ContextTrack.class, esContextTrack$ContextTrack);
    }

    private EsContextTrack$ContextTrack() {
    }

    public static EsContextTrack$ContextTrack o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static smz q() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"uri_", "uid_", "metadata_", tmz.a});
        }
        if (iOrdinal == 3) {
            return new EsContextTrack$ContextTrack();
        }
        if (iOrdinal == 4) {
            return new smz();
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
        synchronized (EsContextTrack$ContextTrack.class) {
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

    public final int getMetadataCount() {
        return this.metadata_.size();
    }

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    public final String getUid() {
        return this.uid_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 p() {
        qng0 qng0Var = this.metadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metadata_ = qng0VarH;
        return qng0VarH;
    }

    public final void r(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final void setUid(String str) {
        str.getClass();
        this.uid_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
