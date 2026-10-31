package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dwe0 extends xbk1 implements g1f0 {
    public final fe41 b;
    public final i5u c;

    public dwe0(fe41 fe41Var, i5u i5uVar) {
        this.b = fe41Var;
        this.c = i5uVar;
        i5uVar.a = l();
    }

    @Override // p.g1f0
    public final boolean A() {
        Boolean bool = (Boolean) this.b.b.s("EMAIL_METHOD_CHOOSER_DIALOG_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean B() {
        Boolean bool = (Boolean) this.b.b.s("CREDENTIAL_MANAGER_DISABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final at80 C() {
        at80 at80Var = (at80) this.b.b.s("INTENT_INLINE_FORM");
        return at80Var == null ? at80.a : at80Var;
    }

    @Override // p.g1f0
    public final boolean E() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_GOOGLE_LOGIN_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean F() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_EMAIL_OTP_LOGIN_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean G() {
        Boolean bool = (Boolean) this.b.b.s("BRAZIL_PHONE_NUMBER_PLACEHOLDER_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean H() {
        Boolean bool = (Boolean) this.b.b.s("DIRECT_MANAGED_ACCOUNT_SIGNUP_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean I() {
        Boolean bool = (Boolean) this.b.b.s("USERNAME_LOGIN_HINT_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean J() {
        Boolean bool = (Boolean) this.b.b.s("MAGICLINK_AS_DEFAULT_FALLBACK_METHOD_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final int K() {
        Integer num = (Integer) this.b.b.s("RECAPTCHA_EMAIL_OTP_LOGIN_GRACE_PERIOD_MILLIS");
        if (num != null) {
            return num.intValue();
        }
        return 5000;
    }

    @Override // p.g1f0
    public final boolean L() {
        Boolean bool = (Boolean) this.b.b.s("AGE_CONFIRMATION_DIALOG_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean M() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_PHONE_SIGNUP_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean N() {
        Boolean bool = (Boolean) this.b.b.s("NEW_AGE_ENTRY_PAGE_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final int O() {
        Integer num = (Integer) this.b.b.s("RECAPTCHA_SMS_LOGIN_GRACE_PERIOD_MILLIS");
        if (num != null) {
            return num.intValue();
        }
        return 5000;
    }

    @Override // p.g1f0
    public final boolean a() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_MAGICLINK_GENERATION_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean b() {
        Boolean bool = (Boolean) this.b.b.s("IDENTITYLESS_LOGIN");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean c() {
        Boolean bool = (Boolean) this.b.b.s("ALLOW_RECAPTCHA_DUPES_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean d() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_SDK_ENABLED_V2");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // p.g1f0
    public final boolean e() {
        Boolean bool = (Boolean) this.b.b.s("EMAIL_OTP_LOGIN_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean f() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_SMS_LOGIN_GRACE_PERIOD_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean g() {
        Boolean bool = (Boolean) this.b.b.s("SIGNUP_STEP_INFO_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final int h() {
        Integer num = (Integer) this.b.b.s("RECAPTCHA_GOOGLE_LOGIN_GRACE_PERIOD_MILLIS");
        if (num != null) {
            return num.intValue();
        }
        return 5000;
    }

    @Override // p.g1f0
    public final boolean i() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_EMAIL_LOGIN_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // p.g1f0
    public final boolean j() {
        Boolean bool = (Boolean) this.b.b.s("AUTOFILL_MANAGER_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean k() {
        Boolean bool = (Boolean) this.b.b.s("WHATSAPP_OTP_AUTOFILL_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean l() {
        Boolean bool = (Boolean) this.b.b.s("DIRECT_AUTH_EVENT_PUBLISH_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean m() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_MAGICLINK_LOGIN_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean n() {
        Boolean bool = (Boolean) this.b.b.s("PASSKEY_REGISTRATION_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final int o() {
        Integer num = (Integer) this.b.b.s("RECAPTCHA_TOKEN_TIMEOUT_MILLIS");
        if (num != null) {
            return num.intValue();
        }
        return 5000;
    }

    @Override // p.g1f0
    public final boolean p() {
        Boolean bool = (Boolean) this.b.b.s("PASSKEYS_AUTHENTICATION_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean q() {
        Boolean bool = (Boolean) this.b.b.s("COMPOSE_AUTOFILL_DISABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean r() {
        Boolean bool = (Boolean) this.b.b.s("PREFER_WELCOME_SCREEN_CREDENTIAL_MANAGER");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final gb80 s() {
        gb80 gb80Var = (gb80) this.b.b.s("INFO_BUTTON");
        return gb80Var == null ? gb80.b : gb80Var;
    }

    @Override // p.g1f0
    public final int t() {
        Integer num = (Integer) this.b.b.s("RECAPTCHA_MAGICLINK_LOGIN_GRACE_PERIOD_MILLIS");
        if (num != null) {
            return num.intValue();
        }
        return 5000;
    }

    @Override // p.g1f0
    public final boolean u() {
        Boolean bool = (Boolean) this.b.b.s("CREDENTIAL_MANAGER_GOOGLE_SIGN_IN_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean v() {
        Boolean bool = (Boolean) this.b.b.s("EMAIL_OTP_SIGNUP_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean w() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_NON_BLOCKING_ALL_AUTH_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // p.g1f0
    public final boolean x() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_EMAIL_SIGNUP_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean y() {
        Boolean bool = (Boolean) this.b.b.s("RECAPTCHA_GOOGLE_SIGNUP_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p.g1f0
    public final boolean z() {
        Boolean bool = (Boolean) this.b.b.s("FREE_MANAGED_ACCOUNTS_UPGRADE_DIALOG_ENABLED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
