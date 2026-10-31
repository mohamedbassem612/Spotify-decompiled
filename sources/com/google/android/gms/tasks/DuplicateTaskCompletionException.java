package com.google.android.gms.tasks;

import p.hfp1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public static IllegalStateException a(hfp1 hfp1Var) {
        String strConcat;
        if (!hfp1Var.i()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excF = hfp1Var.f();
        if (excF != null) {
            strConcat = "failure";
        } else if (hfp1Var.j()) {
            strConcat = "result ".concat(String.valueOf(hfp1Var.g()));
        } else {
            strConcat = hfp1Var.d ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excF);
    }
}
