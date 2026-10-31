package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p.czh;
import p.di61;
import p.fw9;
import p.g8b;
import p.hzh;
import p.lzy0;
import p.mj20;
import p.nz3;
import p.qj20;
import p.shn;
import p.tbc0;
import p.tj20;
import p.vj20;
import p.vzh;
import p.wct;
import p.wi20;
import p.wro1;
import p.xgn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final lzy0 a = new lzy0(fw9.class, ExecutorService.class);
    public final lzy0 b = new lzy0(g8b.class, ExecutorService.class);
    public final lzy0 c = new lzy0(tbc0.class, ExecutorService.class);

    static {
        Map map = vj20.b;
        di61 di61Var = di61.a;
        if (map.containsKey(di61Var)) {
            di61Var.toString();
        } else {
            map.put(di61Var, new tj20(new xgn0(true)));
            di61Var.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        hzh hzhVarA = vzh.a(FirebaseCrashlytics.class);
        hzhVarA.a = "fire-cls";
        hzhVarA.a(wct.a(wi20.class));
        hzhVarA.a(wct.a(mj20.class));
        hzhVarA.a(new wct(this.a, 1, 0));
        hzhVarA.a(new wct(this.b, 1, 0));
        hzhVarA.a(new wct(this.c, 1, 0));
        hzhVarA.a(new wct(shn.class, 0, 2));
        hzhVarA.a(new wct(nz3.class, 0, 2));
        hzhVarA.a(new wct(qj20.class, 0, 2));
        hzhVarA.f = new czh(this, (byte) 1);
        hzhVarA.c(2);
        return Arrays.asList(hzhVarA.b(), wro1.H("fire-cls", "19.3.0"));
    }
}
