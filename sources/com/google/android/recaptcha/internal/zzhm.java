package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import p.ij81;
import p.mmr0;
import p.sqg0;
import p.tgo1;
import p.u890;
import p.znn1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzhm extends Exception {
    public static final Map f;
    public final tgo1 a;
    public final ij81 b;
    public final String c;
    public final Exception d;
    public final Map e = sqg0.J(new mmr0[]{new mmr0(tgo1.d, new RecaptchaException(2)), new mmr0(tgo1.i, new RecaptchaException(2)), new mmr0(tgo1.j, new RecaptchaException(2)), new mmr0(tgo1.e, new RecaptchaException(3)), new mmr0(tgo1.f, new RecaptchaException(4)), new mmr0(tgo1.g, new RecaptchaException(5)), new mmr0(tgo1.h, new RecaptchaException(6)), new mmr0(tgo1.c, new RecaptchaException(9)), new mmr0(tgo1.k, new RecaptchaException(7))});

    static {
        mmr0 mmr0Var = new mmr0(znn1.JS_NETWORK_ERROR, new zzhm(tgo1.d, ij81.g, null, null));
        ij81 ij81Var = ij81.f;
        tgo1 tgo1Var = tgo1.c;
        f = sqg0.J(new mmr0[]{mmr0Var, new mmr0(znn1.JS_INTERNAL_ERROR, new zzhm(tgo1Var, ij81Var, null, null)), new mmr0(znn1.JS_INVALID_SITE_KEY, new zzhm(tgo1.e, ij81.h, null, null)), new mmr0(znn1.JS_INVALID_SITE_KEY_TYPE, new zzhm(tgo1.f, ij81.i, null, null)), new mmr0(znn1.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzhm(tgo1.g, ij81.t, null, null)), new mmr0(znn1.JS_INVALID_ACTION, new zzhm(tgo1.h, ij81.X, null, null)), new mmr0(znn1.JS_PROGRAM_ERROR, new zzhm(tgo1Var, ij81.Z, null, null))});
    }

    public zzhm(tgo1 tgo1Var, ij81 ij81Var, String str, Exception exc) {
        this.a = tgo1Var;
        this.b = ij81Var;
        this.c = str;
        this.d = exc;
    }

    public final tgo1 a() {
        return this.a;
    }

    public final ij81 b() {
        return this.b;
    }

    public final RecaptchaException c() {
        ij81 ij81Var = ij81.P0;
        ij81 ij81Var2 = this.b;
        if (u890.j(ij81Var2, ij81Var)) {
            return new RecaptchaException(7);
        }
        if (u890.j(ij81Var2, ij81.b1)) {
            return new RecaptchaException(8);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.e.get(this.a);
        return recaptchaException == null ? new RecaptchaException(9) : recaptchaException;
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.d;
    }
}
