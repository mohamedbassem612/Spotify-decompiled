package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p.bhn0;
import p.gog1;
import p.gys;
import p.hnc1;
import p.hzh;
import p.k220;
import p.m0i;
import p.mj20;
import p.nj20;
import p.vzh;
import p.wct;
import p.wi20;
import p.wro1;
import p.x560;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(m0i m0iVar) {
        wi20 wi20Var = (wi20) m0iVar.a(wi20.class);
        if (m0iVar.a(nj20.class) == null) {
            return new FirebaseMessaging(wi20Var, m0iVar.g(gys.class), m0iVar.g(x560.class), (mj20) m0iVar.a(mj20.class), (gog1) m0iVar.a(gog1.class), (hnc1) m0iVar.a(hnc1.class));
        }
        bhn0.d();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vzh> getComponents() {
        hzh hzhVarA = vzh.a(FirebaseMessaging.class);
        hzhVarA.a = LIBRARY_NAME;
        hzhVarA.a(wct.a(wi20.class));
        hzhVarA.a(new wct(nj20.class, 0, 0));
        hzhVarA.a(new wct(gys.class, 0, 1));
        hzhVarA.a(new wct(x560.class, 0, 1));
        hzhVarA.a(new wct(gog1.class, 0, 0));
        hzhVarA.a(wct.a(mj20.class));
        hzhVarA.a(wct.a(hnc1.class));
        hzhVarA.f = new k220((byte) 8);
        hzhVarA.c(1);
        return Arrays.asList(hzhVarA.b(), wro1.H(LIBRARY_NAME, "23.1.2"));
    }
}
