package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p.gog1;
import p.hhg1;
import p.hzh;
import p.jog1;
import p.m0i;
import p.vzh;
import p.wct;
import p.wro1;
import p.xhc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gog1 lambda$getComponents$0(m0i m0iVar) {
        jog1.b((Context) m0iVar.a(Context.class));
        return jog1.a().c(xhc.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vzh> getComponents() {
        hzh hzhVarA = vzh.a(gog1.class);
        hzhVarA.a = LIBRARY_NAME;
        hzhVarA.a(wct.a(Context.class));
        hzhVarA.f = new hhg1((byte) 4);
        return Arrays.asList(hzhVarA.b(), wro1.H(LIBRARY_NAME, "18.1.8"));
    }
}
