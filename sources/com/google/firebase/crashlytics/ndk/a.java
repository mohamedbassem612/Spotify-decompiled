package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import p.d520;
import p.dxy;
import p.eth;
import p.fjn;
import p.gj20;
import p.v0i;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class a implements v0i {
    @Override // p.v0i
    public final Object m(dxy dxyVar) {
        Context context = (Context) dxyVar.a(Context.class);
        return new gj20(new fjn(context, new JniNativeApi(context), new d520(context)), !(eth.x(context, "com.google.firebase.crashlytics.unity_version", "string") != 0));
    }
}
