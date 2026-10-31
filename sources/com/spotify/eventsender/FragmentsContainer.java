package com.spotify.eventsender;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qj30;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class FragmentsContainer extends h implements v2j0 {
    private static final FragmentsContainer DEFAULT_INSTANCE;
    public static final int FRAGMENT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 fragment_ = h.emptyProtobufList();

    static {
        FragmentsContainer fragmentsContainer = new FragmentsContainer();
        DEFAULT_INSTANCE = fragmentsContainer;
        h.registerDefaultInstance(FragmentsContainer.class, fragmentsContainer);
    }

    private FragmentsContainer() {
    }

    public static FragmentsContainer p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static qj30 r() {
        return (qj30) DEFAULT_INSTANCE.createBuilder();
    }

    public static FragmentsContainer s(byte[] bArr) {
        return (FragmentsContainer) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fragment_", Fragment.class});
        }
        if (iOrdinal == 3) {
            return new FragmentsContainer();
        }
        if (iOrdinal == 4) {
            return new qj30(DEFAULT_INSTANCE);
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
        synchronized (FragmentsContainer.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.fragment_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.fragment_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(Fragment fragment) {
        h290 h290VarMutableCopy = this.fragment_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.fragment_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(fragment);
    }

    public final h290 q() {
        return this.fragment_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
