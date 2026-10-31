package com.google.android.gms.internal.meet_coactivities;

import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p.bid0;
import p.l5u;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzir {
    public static final Executor zza = l5u.a;

    public static bid0 zza(Optional optional) {
        return yoi1.F(optional.isPresent() ? (ExecutorService) optional.get() : Executors.newSingleThreadExecutor());
    }
}
