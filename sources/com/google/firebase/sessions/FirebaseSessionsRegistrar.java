package com.google.firebase.sessions;

import com.google.firebase.components.ComponentRegistrar;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.List;
import kotlin.Metadata;
import p.fw9;
import p.g8b;
import p.gog1;
import p.hzh;
import p.if61;
import p.jd61;
import p.k220;
import p.kf61;
import p.lj61;
import p.lzy0;
import p.m0i;
import p.mf61;
import p.mj20;
import p.nd61;
import p.o8n;
import p.p7h;
import p.q8n;
import p.rj20;
import p.rmr;
import p.tf61;
import p.uf61;
import p.vzh;
import p.wct;
import p.wi20;
import p.wj20;
import p.wro1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lp/vzh;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "p/wj20", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final wj20 Companion = new wj20();
    private static final lzy0 firebaseApp = lzy0.a(wi20.class);
    private static final lzy0 firebaseInstallationsApi = lzy0.a(mj20.class);
    private static final lzy0 backgroundDispatcher = new lzy0(fw9.class, q8n.class);
    private static final lzy0 blockingDispatcher = new lzy0(g8b.class, q8n.class);
    private static final lzy0 transportFactory = lzy0.a(gog1.class);
    private static final lzy0 sessionsSettings = lzy0.a(lj61.class);
    private static final lzy0 sessionLifecycleServiceBinder = lzy0.a(tf61.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final rj20 getComponents$lambda$0(m0i m0iVar) {
        return new rj20((wi20) m0iVar.d(firebaseApp), (lj61) m0iVar.d(sessionsSettings), (o8n) m0iVar.d(backgroundDispatcher), (tf61) m0iVar.d(sessionLifecycleServiceBinder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf61 getComponents$lambda$1(m0i m0iVar) {
        return new mf61();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final if61 getComponents$lambda$2(m0i m0iVar) {
        return new kf61((wi20) m0iVar.d(firebaseApp), (mj20) m0iVar.d(firebaseInstallationsApi), (lj61) m0iVar.d(sessionsSettings), new rmr(m0iVar.e(transportFactory), (byte) 29), (o8n) m0iVar.d(backgroundDispatcher));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj61 getComponents$lambda$3(m0i m0iVar) {
        return new lj61((wi20) m0iVar.d(firebaseApp), (o8n) m0iVar.d(blockingDispatcher), (o8n) m0iVar.d(backgroundDispatcher), (mj20) m0iVar.d(firebaseInstallationsApi));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd61 getComponents$lambda$4(m0i m0iVar) {
        wi20 wi20Var = (wi20) m0iVar.d(firebaseApp);
        wi20Var.a();
        return new nd61(wi20Var.a, (o8n) m0iVar.d(backgroundDispatcher));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tf61 getComponents$lambda$5(m0i m0iVar) {
        return new uf61((wi20) m0iVar.d(firebaseApp));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vzh> getComponents() {
        hzh hzhVarA = vzh.a(rj20.class);
        hzhVarA.a = LIBRARY_NAME;
        lzy0 lzy0Var = firebaseApp;
        hzhVarA.a(wct.b(lzy0Var));
        lzy0 lzy0Var2 = sessionsSettings;
        hzhVarA.a(wct.b(lzy0Var2));
        lzy0 lzy0Var3 = backgroundDispatcher;
        hzhVarA.a(wct.b(lzy0Var3));
        hzhVarA.a(wct.b(sessionLifecycleServiceBinder));
        hzhVarA.f = new k220((byte) 9);
        hzhVarA.c(2);
        vzh vzhVarB = hzhVarA.b();
        hzh hzhVarA2 = vzh.a(mf61.class);
        hzhVarA2.a = "session-generator";
        hzhVarA2.f = new k220((byte) 10);
        vzh vzhVarB2 = hzhVarA2.b();
        hzh hzhVarA3 = vzh.a(if61.class);
        hzhVarA3.a = "session-publisher";
        hzhVarA3.a(new wct(lzy0Var, 1, 0));
        lzy0 lzy0Var4 = firebaseInstallationsApi;
        hzhVarA3.a(wct.b(lzy0Var4));
        hzhVarA3.a(new wct(lzy0Var2, 1, 0));
        hzhVarA3.a(new wct(transportFactory, 1, 1));
        hzhVarA3.a(new wct(lzy0Var3, 1, 0));
        hzhVarA3.f = new k220((byte) 11);
        vzh vzhVarB3 = hzhVarA3.b();
        hzh hzhVarA4 = vzh.a(lj61.class);
        hzhVarA4.a = "sessions-settings";
        hzhVarA4.a(new wct(lzy0Var, 1, 0));
        hzhVarA4.a(wct.b(blockingDispatcher));
        hzhVarA4.a(new wct(lzy0Var3, 1, 0));
        hzhVarA4.a(new wct(lzy0Var4, 1, 0));
        hzhVarA4.f = new k220((byte) 12);
        vzh vzhVarB4 = hzhVarA4.b();
        hzh hzhVarA5 = vzh.a(jd61.class);
        hzhVarA5.a = "sessions-datastore";
        hzhVarA5.a(new wct(lzy0Var, 1, 0));
        hzhVarA5.a(new wct(lzy0Var3, 1, 0));
        hzhVarA5.f = new k220((byte) 13);
        vzh vzhVarB5 = hzhVarA5.b();
        hzh hzhVarA6 = vzh.a(tf61.class);
        hzhVarA6.a = "sessions-service-binder";
        hzhVarA6.a(new wct(lzy0Var, 1, 0));
        hzhVarA6.f = new k220((byte) 14);
        return p7h.M(new vzh[]{vzhVarB, vzhVarB2, vzhVarB3, vzhVarB4, vzhVarB5, hzhVarA6.b(), wro1.H(LIBRARY_NAME, "2.0.1")});
    }
}
