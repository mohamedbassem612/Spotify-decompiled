package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.zpz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsPlayOrigin$PlayOrigin extends h implements v2j0 {
    private static final EsPlayOrigin$PlayOrigin DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER = 6;
    public static final int EXTERNAL_REFERRER_FIELD_NUMBER = 4;
    public static final int FEATURE_CLASSES_FIELD_NUMBER = 7;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int FEATURE_VERSION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REFERRER_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int RESTRICTION_IDENTIFIER_FIELD_NUMBER = 8;
    public static final int VIEW_URI_FIELD_NUMBER = 3;
    private String featureIdentifier_ = "";
    private String featureVersion_ = "";
    private String viewUri_ = "";
    private String externalReferrer_ = "";
    private String referrerIdentifier_ = "";
    private String deviceIdentifier_ = "";
    private h290 featureClasses_ = h.emptyProtobufList();
    private String restrictionIdentifier_ = "";

    static {
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = new EsPlayOrigin$PlayOrigin();
        DEFAULT_INSTANCE = esPlayOrigin$PlayOrigin;
        h.registerDefaultInstance(EsPlayOrigin$PlayOrigin.class, esPlayOrigin$PlayOrigin);
    }

    private EsPlayOrigin$PlayOrigin() {
    }

    public static EsPlayOrigin$PlayOrigin p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static zpz y() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(String str) {
        str.getClass();
        this.externalReferrer_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.featureIdentifier_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.featureVersion_ = str;
    }

    public final void D(String str) {
        str.getClass();
        this.referrerIdentifier_ = str;
    }

    public final void E(String str) {
        str.getClass();
        this.restrictionIdentifier_ = str;
    }

    public final void F(String str) {
        str.getClass();
        this.viewUri_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ț\bȈ", new Object[]{"featureIdentifier_", "featureVersion_", "viewUri_", "externalReferrer_", "referrerIdentifier_", "deviceIdentifier_", "featureClasses_", "restrictionIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsPlayOrigin$PlayOrigin();
        }
        if (iOrdinal == 4) {
            return new zpz();
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
        synchronized (EsPlayOrigin$PlayOrigin.class) {
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

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.featureClasses_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.featureClasses_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final String q() {
        return this.deviceIdentifier_;
    }

    public final String r() {
        return this.externalReferrer_;
    }

    public final h290 s() {
        return this.featureClasses_;
    }

    public final String t() {
        return this.featureIdentifier_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.featureVersion_;
    }

    public final String v() {
        return this.referrerIdentifier_;
    }

    public final String w() {
        return this.restrictionIdentifier_;
    }

    public final String x() {
        return this.viewUri_;
    }

    public final void z(String str) {
        str.getClass();
        this.deviceIdentifier_ = str;
    }
}
