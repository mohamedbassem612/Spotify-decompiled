package com.google.android.recaptcha.internal;

import java.util.Locale;
import java.util.Optional;
import p.bap1;
import p.ctn1;
import p.h2o1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zzf extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzf(h2o1 h2o1Var, ctn1 ctn1Var, long j) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j);
        super(String.format(locale, bap1.a("bk3t6gFTc30="), Long.valueOf(h2o1Var.a), Long.valueOf(ctn1Var.a), lValueOf));
        Optional.of(ctn1Var);
        Optional.of(lValueOf);
    }

    public zzf(h2o1 h2o1Var, Exception exc) {
        super(String.format(Locale.US, bap1.a("bk0="), Long.valueOf(h2o1Var.a)), exc);
        Optional.empty();
        Optional.empty();
    }
}
