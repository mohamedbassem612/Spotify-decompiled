package com.spotify.prereleases.extension;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.c8x;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Entity extends h implements v2j0 {
    public static final int AGENTS_FIELD_NUMBER = 4;
    public static final int COPYRIGHT_FIELD_NUMBER = 7;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final Entity DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean explicit_;
    private String uri_ = "";
    private String type_ = "";
    private String name_ = "";
    private h290 agents_ = h.emptyProtobufList();
    private h290 covers_ = h.emptyProtobufList();
    private h290 copyright_ = h.emptyProtobufList();

    static {
        Entity entity = new Entity();
        DEFAULT_INSTANCE = entity;
        h.registerDefaultInstance(Entity.class, entity);
    }

    private Entity() {
    }

    public static Entity o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004\u001b\u0005\u001b\u0006ဇ\u0001\u0007\u001b", new Object[]{"bitField0_", "uri_", "type_", "name_", "agents_", Agent.class, "covers_", Image.class, "explicit_", "copyright_", Copyright.class});
        }
        if (iOrdinal == 3) {
            return new Entity();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (Entity.class) {
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

    public final List getAgentsList() {
        return this.agents_;
    }

    public final List getCopyrightList() {
        return this.copyright_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final h290 n() {
        return this.covers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.explicit_;
    }

    public final String q() {
        return this.type_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
