package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p.hzh;
import p.shn;
import p.vzh;
import p.wct;
import p.wro1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        hzh hzhVarA = vzh.a(shn.class);
        hzhVarA.a = "fire-cls-ndk";
        hzhVarA.a(wct.a(Context.class));
        hzhVarA.f = new a();
        hzhVarA.c(2);
        return Arrays.asList(hzhVarA.b(), wro1.H("fire-cls-ndk", "19.3.0"));
    }
}
