package com.spotify.home.evopage.mobius;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import p.c0k1;
import p.d0k1;
import p.e0k1;
import p.m441;
import p.mr20;
import p.p241;
import p.r6x;
import p.w25;
import p.ynb0;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class g {
    public static final m441 a(mr20 mr20Var, ynb0 ynb0Var) {
        return new m441(new f(mr20Var, ynb0Var, null));
    }

    public static final mr20 b(w25 w25Var, ynb0 ynb0Var) {
        if (w25Var.O()) {
            e0k1 e0k1Var = (c0k1) ynb0Var.get();
            p241 p241Var = e0k1Var.a;
            w25 w25Var2 = e0k1Var.b;
            if (w25Var2.O()) {
                p241 p241Var2 = p241Var;
                return yoi1.g(Observable.merge(p241Var2.b("music-video-disabled"), p241Var2.b("other-video-disabled")).skip(2L).debounce(w25Var2.k0(), TimeUnit.SECONDS).map(d0k1.a));
            }
        }
        return r6x.a;
    }
}
