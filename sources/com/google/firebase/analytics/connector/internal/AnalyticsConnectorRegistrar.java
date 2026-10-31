package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p.bbn1;
import p.gen1;
import p.hnc1;
import p.hzh;
import p.m0i;
import p.m5u;
import p.nz3;
import p.oz3;
import p.u6o1;
import p.v800;
import p.vzh;
import p.wct;
import p.wi20;
import p.wro1;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static nz3 lambda$getComponents$0(m0i m0iVar) {
        wi20 wi20Var = (wi20) m0iVar.a(wi20.class);
        Context context = (Context) m0iVar.a(Context.class);
        hnc1 hnc1Var = (hnc1) m0iVar.a(hnc1.class);
        zod.s(wi20Var);
        zod.s(context);
        zod.s(hnc1Var);
        zod.s(context.getApplicationContext());
        if (oz3.c == null) {
            synchronized (oz3.class) {
                try {
                    if (oz3.c == null) {
                        Bundle bundle = new Bundle(1);
                        wi20Var.a();
                        if ("[DEFAULT]".equals(wi20Var.b)) {
                            ((v800) hnc1Var).a(m5u.d, bbn1.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", wi20Var.g());
                        }
                        oz3.c = new oz3(u6o1.c(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oz3.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vzh> getComponents() {
        hzh hzhVarA = vzh.a(nz3.class);
        hzhVarA.a(wct.a(wi20.class));
        hzhVarA.a(wct.a(Context.class));
        hzhVarA.a(wct.a(hnc1.class));
        hzhVarA.f = gen1.c;
        hzhVarA.c(2);
        return Arrays.asList(hzhVarA.b(), wro1.H("fire-analytics", "23.2.0"));
    }
}
