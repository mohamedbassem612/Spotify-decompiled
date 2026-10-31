package com.spotify.reflection.reflectionelement.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.id11;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ReflectionEvent extends h implements v2j0 {
    private static final ReflectionEvent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int FREE_TEXT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERCEPTIONS_FIELD_NUMBER = 1;
    private int bitField0_;
    private h290 perceptions_ = h.emptyProtobufList();
    private String entityUri_ = "";
    private String freeText_ = "";

    static {
        ReflectionEvent reflectionEvent = new ReflectionEvent();
        DEFAULT_INSTANCE = reflectionEvent;
        h.registerDefaultInstance(ReflectionEvent.class, reflectionEvent);
    }

    private ReflectionEvent() {
    }

    public static id11 o() {
        return (id11) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"bitField0_", "perceptions_", "entityUri_", "freeText_"});
        }
        if (iOrdinal == 3) {
            return new ReflectionEvent();
        }
        if (iOrdinal == 4) {
            return new id11(DEFAULT_INSTANCE);
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
        synchronized (ReflectionEvent.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.perceptions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.perceptions_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.entityUri_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.freeText_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
