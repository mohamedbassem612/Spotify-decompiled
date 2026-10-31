package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p.aob0;
import p.fw9;
import p.g8b;
import p.hm5;
import p.hzh;
import p.i1i;
import p.jah;
import p.lro;
import p.lzy0;
import p.sdh1;
import p.tbc0;
import p.vzh;
import p.w5t;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final aob0 a = new aob0(new i1i((byte) 1));
    public static final aob0 b = new aob0(new i1i((byte) 2));
    public static final aob0 c = new aob0(new i1i((byte) 3));
    public static final aob0 d = new aob0(new i1i((byte) 4));

    public static w5t a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new w5t(Executors.newFixedThreadPool(4, new lro("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        lzy0 lzy0Var = new lzy0(fw9.class, ScheduledExecutorService.class);
        lzy0[] lzy0VarArr = {new lzy0(fw9.class, ExecutorService.class), new lzy0(fw9.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lzy0Var);
        for (int i = 0; i < 2; i++) {
            hm5.m(lzy0VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, lzy0VarArr);
        vzh vzhVar = new vzh(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new jah((byte) 19), hashSet3);
        lzy0 lzy0Var2 = new lzy0(g8b.class, ScheduledExecutorService.class);
        lzy0[] lzy0VarArr2 = {new lzy0(g8b.class, ExecutorService.class), new lzy0(g8b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(lzy0Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            hm5.m(lzy0VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, lzy0VarArr2);
        vzh vzhVar2 = new vzh(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new jah((byte) 20), hashSet6);
        lzy0 lzy0Var3 = new lzy0(tbc0.class, ScheduledExecutorService.class);
        lzy0[] lzy0VarArr3 = {new lzy0(tbc0.class, ExecutorService.class), new lzy0(tbc0.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(lzy0Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            hm5.m(lzy0VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, lzy0VarArr3);
        vzh vzhVar3 = new vzh(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new jah((byte) 21), hashSet9);
        hzh hzhVarB = vzh.b(new lzy0(sdh1.class, Executor.class));
        hzhVarB.f = new jah((byte) 22);
        return Arrays.asList(vzhVar, vzhVar2, vzhVar3, hzhVarB.b());
    }
}
