package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.dw0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AddressRow extends h implements v2j0 {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    private static final AddressRow DEFAULT_INSTANCE;
    public static final int MAP_LINKS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String name_ = "";
    private String address_ = "";
    private h290 mapLinks_ = h.emptyProtobufList();

    static {
        AddressRow addressRow = new AddressRow();
        DEFAULT_INSTANCE = addressRow;
        h.registerDefaultInstance(AddressRow.class, addressRow);
    }

    private AddressRow() {
    }

    public static AddressRow o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "address_", "mapLinks_", MapLink.class});
        }
        if (iOrdinal == 3) {
            return new AddressRow();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (AddressRow.class) {
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

    public final String n() {
        return this.address_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.mapLinks_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
