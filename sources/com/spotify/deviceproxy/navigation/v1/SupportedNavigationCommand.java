package com.spotify.deviceproxy.navigation.v1;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.h2d1;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SupportedNavigationCommand extends h implements v2j0 {
    public static final int COMMAND_FIELD_NUMBER = 1;
    private static final SupportedNavigationCommand DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int URI_PATTERNS_FIELD_NUMBER = 2;
    private String command_ = "";
    private h290 uriPatterns_ = h.emptyProtobufList();

    static {
        SupportedNavigationCommand supportedNavigationCommand = new SupportedNavigationCommand();
        DEFAULT_INSTANCE = supportedNavigationCommand;
        h.registerDefaultInstance(SupportedNavigationCommand.class, supportedNavigationCommand);
    }

    private SupportedNavigationCommand() {
    }

    public static h2d1 o() {
        return (h2d1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"command_", "uriPatterns_", UriPattern.class});
        }
        if (iOrdinal == 3) {
            return new SupportedNavigationCommand();
        }
        if (iOrdinal == 4) {
            return new h2d1(DEFAULT_INSTANCE);
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
        synchronized (SupportedNavigationCommand.class) {
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
        h290 h290VarMutableCopy = this.uriPatterns_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uriPatterns_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p() {
        this.command_ = "open";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
