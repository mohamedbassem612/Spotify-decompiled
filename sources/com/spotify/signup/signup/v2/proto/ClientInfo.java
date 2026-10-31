package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
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
import p.wld;
import p.yig;
import p.ypa;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ClientInfo extends h implements v2j0 {
    public static final int API_KEY_FIELD_NUMBER = 1;
    public static final int APP_VERSION_FIELD_NUMBER = 3;
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    public static final int CLIENT_ID_FIELD_NUMBER = 6;
    private static final ClientInfo DEFAULT_INSTANCE;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    private static final c290 capabilities_converter_ = new ypa((byte) 2, false);
    private int capabilitiesMemoizedSerializedSize;
    private String apiKey_ = "";
    private String platform_ = "";
    private String appVersion_ = "";
    private b290 capabilities_ = h.emptyIntList();
    private String installationId_ = "";
    private String clientId_ = "";

    static {
        ClientInfo clientInfo = new ClientInfo();
        DEFAULT_INSTANCE = clientInfo;
        h.registerDefaultInstance(ClientInfo.class, clientInfo);
    }

    private ClientInfo() {
    }

    public static yig o() {
        return (yig) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,\u0005Ȉ\u0006Ȉ", new Object[]{"apiKey_", "platform_", "appVersion_", "capabilities_", "installationId_", "clientId_"});
        }
        if (iOrdinal == 3) {
            return new ClientInfo();
        }
        if (iOrdinal == 4) {
            return new yig(DEFAULT_INSTANCE);
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
        synchronized (ClientInfo.class) {
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

    public final void n(Iterable iterable) {
        i9 i9Var = this.capabilities_;
        if (!i9Var.a) {
            this.capabilities_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            wld wldVar = (wld) it.next();
            this.capabilities_.c(wldVar.getNumber());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.apiKey_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.clientId_ = str;
    }

    public final void s(String str) {
        this.installationId_ = str;
    }

    public final void t() {
        this.platform_ = "Android-ARM";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
