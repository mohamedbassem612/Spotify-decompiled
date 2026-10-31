package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p.fw9;
import p.gys;
import p.h19;
import p.hzh;
import p.k220;
import p.lzy0;
import p.ofr;
import p.thn;
import p.v0s;
import p.v560;
import p.vzh;
import p.w560;
import p.wct;
import p.wi20;
import p.wro1;
import p.x560;
import p.y2o1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        hzh hzhVarA = vzh.a(gys.class);
        hzhVarA.a(new wct(h19.class, 2, 0));
        hzhVarA.f = new ofr((byte) 20);
        arrayList.add(hzhVarA.b());
        lzy0 lzy0Var = new lzy0(fw9.class, Executor.class);
        hzh hzhVar = new hzh(v0s.class, w560.class, x560.class);
        hzhVar.a(wct.a(Context.class));
        hzhVar.a(wct.a(wi20.class));
        hzhVar.a(new wct(v560.class, 2, 0));
        hzhVar.a(new wct(gys.class, 1, 1));
        hzhVar.a(new wct(lzy0Var, 1, 0));
        hzhVar.f = new thn(lzy0Var, (byte) 6);
        arrayList.add(hzhVar.b());
        arrayList.add(wro1.H("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(wro1.H("fire-core", "21.0.0"));
        arrayList.add(wro1.H("device-name", a(Build.PRODUCT)));
        arrayList.add(wro1.H("device-model", a(Build.DEVICE)));
        arrayList.add(wro1.H("device-brand", a(Build.BRAND)));
        arrayList.add(wro1.K("android-target-sdk", new k220((byte) 3)));
        arrayList.add(wro1.K("android-min-sdk", new k220((byte) 4)));
        arrayList.add(wro1.K("android-platform", new k220((byte) 5)));
        arrayList.add(wro1.K("android-installer", new k220((byte) 6)));
        String strU = y2o1.u();
        if (strU != null) {
            arrayList.add(wro1.H("kotlin", strU));
        }
        return arrayList;
    }
}
