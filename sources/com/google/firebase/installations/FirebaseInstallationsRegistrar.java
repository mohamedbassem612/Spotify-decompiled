package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p.dio1;
import p.f2p1;
import p.fw9;
import p.g8b;
import p.hzh;
import p.k220;
import p.lj20;
import p.lzy0;
import p.m0i;
import p.mj20;
import p.vzh;
import p.w560;
import p.wct;
import p.wi20;
import p.wro1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static mj20 lambda$getComponents$0(m0i m0iVar) {
        return new lj20((wi20) m0iVar.a(wi20.class), m0iVar.g(w560.class), (ExecutorService) m0iVar.d(new lzy0(fw9.class, ExecutorService.class)), f2p1.t((Executor) m0iVar.d(new lzy0(g8b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vzh> getComponents() {
        hzh hzhVarA = vzh.a(mj20.class);
        hzhVarA.a = LIBRARY_NAME;
        hzhVarA.a(wct.a(wi20.class));
        hzhVarA.a(new wct(w560.class, 0, 1));
        hzhVarA.a(new wct(new lzy0(fw9.class, ExecutorService.class), 1, 0));
        hzhVarA.a(new wct(new lzy0(g8b.class, Executor.class), 1, 0));
        hzhVarA.f = new k220((byte) 7);
        return Arrays.asList(hzhVarA.b(), dio1.s(), wro1.H(LIBRARY_NAME, "18.0.0"));
    }
}
