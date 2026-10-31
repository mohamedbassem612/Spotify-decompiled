package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ghc0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ListAttributeCapabilities extends h implements v2j0 {
    public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 15;
    public static final int COLLABORATIVE_FIELD_NUMBER = 4;
    private static final ListAttributeCapabilities DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER = 6;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PICTURE_FIELD_NUMBER = 3;
    private AttributeCapabilities aiCurationReferenceId_;
    private int bitField0_;
    private AttributeCapabilities collaborative_;
    private AttributeCapabilities deletedByOwner_;
    private AttributeCapabilities description_;
    private AttributeCapabilities name_;
    private AttributeCapabilities picture_;

    static {
        ListAttributeCapabilities listAttributeCapabilities = new ListAttributeCapabilities();
        DEFAULT_INSTANCE = listAttributeCapabilities;
        h.registerDefaultInstance(ListAttributeCapabilities.class, listAttributeCapabilities);
    }

    private ListAttributeCapabilities() {
    }

    public static ListAttributeCapabilities n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0004\u000fဉ\u0005", new Object[]{"bitField0_", "name_", "description_", "picture_", "collaborative_", "deletedByOwner_", "aiCurationReferenceId_"});
        }
        if (iOrdinal == 3) {
            return new ListAttributeCapabilities();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (ListAttributeCapabilities.class) {
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

    public final AttributeCapabilities o() {
        AttributeCapabilities attributeCapabilities = this.description_;
        return attributeCapabilities == null ? AttributeCapabilities.o() : attributeCapabilities;
    }

    public final AttributeCapabilities p() {
        AttributeCapabilities attributeCapabilities = this.name_;
        return attributeCapabilities == null ? AttributeCapabilities.o() : attributeCapabilities;
    }

    public final AttributeCapabilities q() {
        AttributeCapabilities attributeCapabilities = this.picture_;
        return attributeCapabilities == null ? AttributeCapabilities.o() : attributeCapabilities;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
