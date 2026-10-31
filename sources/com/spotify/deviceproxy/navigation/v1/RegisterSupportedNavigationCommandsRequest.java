package com.spotify.deviceproxy.navigation.v1;

import com.google.protobuf.h;
import p.bf11;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RegisterSupportedNavigationCommandsRequest extends h implements v2j0 {
    public static final int COMMANDS_FIELD_NUMBER = 2;
    private static final RegisterSupportedNavigationCommandsRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String deviceId_ = "";
    private h290 commands_ = h.emptyProtobufList();

    static {
        RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest = new RegisterSupportedNavigationCommandsRequest();
        DEFAULT_INSTANCE = registerSupportedNavigationCommandsRequest;
        h.registerDefaultInstance(RegisterSupportedNavigationCommandsRequest.class, registerSupportedNavigationCommandsRequest);
    }

    private RegisterSupportedNavigationCommandsRequest() {
    }

    public static bf11 p() {
        return (bf11) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"deviceId_", "commands_", SupportedNavigationCommand.class});
        }
        if (iOrdinal == 3) {
            return new RegisterSupportedNavigationCommandsRequest();
        }
        if (iOrdinal == 4) {
            return new bf11(DEFAULT_INSTANCE);
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
        synchronized (RegisterSupportedNavigationCommandsRequest.class) {
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

    public final void n(SupportedNavigationCommand supportedNavigationCommand) {
        supportedNavigationCommand.getClass();
        h290 h290VarMutableCopy = this.commands_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.commands_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(supportedNavigationCommand);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.commands_.size();
    }

    public final void q(String str) {
        this.deviceId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
