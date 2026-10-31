package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vhc;
import p.vlz;
import p.ylz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsConnectionInfoReceiver$Connected extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 2;
    private static final EsConnectionInfoReceiver$Connected DEFAULT_INSTANCE;
    public static final int OS_INTERNET_VALIDATION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private static final c290 capabilities_converter_ = new vhc((byte) 9);
    private int bitField0_;
    private int capabilitiesMemoizedSerializedSize;
    private b290 capabilities_ = h.emptyIntList();
    private EsConnectionType$ConnectionType connectionType_;
    private int osInternetValidation_;

    static {
        EsConnectionInfoReceiver$Connected esConnectionInfoReceiver$Connected = new EsConnectionInfoReceiver$Connected();
        DEFAULT_INSTANCE = esConnectionInfoReceiver$Connected;
        h.registerDefaultInstance(EsConnectionInfoReceiver$Connected.class, esConnectionInfoReceiver$Connected);
    }

    private EsConnectionInfoReceiver$Connected() {
    }

    public static vlz o() {
        return (vlz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001,\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "capabilities_", "connectionType_", "osInternetValidation_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionInfoReceiver$Connected();
        }
        if (iOrdinal == 4) {
            return new vlz(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionInfoReceiver$Connected.class) {
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
        i9 i9Var = this.capabilities_;
        if (!i9Var.a) {
            this.capabilities_ = h.mutableCopy(i9Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.capabilities_.c(((Integer) it.next()).intValue());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(EsConnectionType$ConnectionType esConnectionType$ConnectionType) {
        this.connectionType_ = esConnectionType$ConnectionType;
        this.bitField0_ |= 1;
    }

    public final void q(ylz ylzVar) {
        this.osInternetValidation_ = ylzVar.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
