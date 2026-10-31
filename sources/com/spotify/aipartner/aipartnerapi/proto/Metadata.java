package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eij0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Metadata extends h implements v2j0 {
    public static final int ARTWORK_FIELD_NUMBER = 3;
    public static final int CONTRIBUTORS_FIELD_NUMBER = 4;
    public static final int DEEPLINK_URI_FIELD_NUMBER = 2;
    private static final Metadata DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PARENT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 6;
    private int bitField0_;
    private int type_;
    private String name_ = "";
    private String deeplinkUri_ = "";
    private h290 artwork_ = h.emptyProtobufList();
    private h290 contributors_ = h.emptyProtobufList();
    private String parent_ = "";

    static {
        Metadata metadata = new Metadata();
        DEFAULT_INSTANCE = metadata;
        h.registerDefaultInstance(Metadata.class, metadata);
    }

    private Metadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Metadata s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ț\u0005ለ\u0000\u0006\f", new Object[]{"bitField0_", "name_", "deeplinkUri_", "artwork_", Image.class, "contributors_", "parent_", "type_"});
        }
        if (iOrdinal == 3) {
            return new Metadata();
        }
        if (iOrdinal == 4) {
            return new eij0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (Metadata.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final int getTypeValue() {
        return this.type_;
    }

    public final int n() {
        return this.artwork_.size();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.artwork_;
    }

    public final int p() {
        return this.contributors_.size();
    }

    public final h290 q() {
        return this.contributors_;
    }

    public final String r() {
        return this.deeplinkUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
