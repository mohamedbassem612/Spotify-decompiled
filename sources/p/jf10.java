package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jf10 extends h471 {
    public final /* synthetic */ byte g;
    public final efr h;
    public final c9 i;
    public final d471 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf10(zg0 zg0Var, efr efrVar, byte b) {
        super(zg0Var, mqo1.s(new String[]{"com.facebook.orca"}), "android.intent.action.SEND", "text/plain", null, 48);
        this.g = b;
        yy61 yy61Var = yy61.LINK;
        yy61 yy61Var2 = yy61.MESSAGE;
        switch (b) {
            case 1:
                super(zg0Var, mqo1.s(new String[]{"com.instagram.android"}), "android.intent.action.SEND", "text/plain", null, 48);
                this.h = efrVar;
                this.i = mqo1.s(new yy61[]{yy61Var2, yy61Var});
                u471 u471Var = u471.d;
                this.j = new d471(2131233910, false);
                break;
            case 2:
                super(zg0Var, mqo1.s(new String[]{"jp.naver.line.android"}), "android.intent.action.SEND", "text/plain", null, 48);
                this.h = efrVar;
                this.i = mqo1.s(new yy61[]{yy61Var2, yy61Var});
                x471 x471Var = x471.d;
                this.j = new d471(2131233911, false);
                break;
            case 3:
                super(zg0Var, mqo1.s(new String[]{"org.thoughtcrime.securesms"}), "android.intent.action.SEND", "text/plain", null, 48);
                this.h = efrVar;
                this.i = mqo1.s(new yy61[]{yy61Var2, yy61Var});
                c571 c571Var = c571.d;
                this.j = new d471(2131233914, true);
                break;
            default:
                this.h = efrVar;
                this.i = mqo1.s(new yy61[]{yy61Var2, yy61Var});
                r471 r471Var = r471.d;
                this.j = new d471(2131233913, false);
                break;
        }
    }

    public final o571 a() {
        switch (this.g) {
            case 0:
                return r471.d;
            case 1:
                return u471.d;
            case 2:
                return x471.d;
            default:
                return c571.d;
        }
    }

    public final c9 b() {
        switch (this.g) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.i;
    }

    public final int c() {
        switch (this.g) {
            case 0:
                return 2131962210;
            case 1:
                return 2131962216;
            case 2:
                return 2131962222;
            default:
                return 2131962226;
        }
    }

    public final hyo1 d() {
        byte b = this.g;
        return this.j;
    }

    public final int e() {
        switch (this.g) {
            case 0:
                return 2131962209;
            case 1:
                return 2131962215;
            case 2:
                return 2131962221;
            default:
                return 2131962225;
        }
    }

    @Override // p.h471
    public final Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        byte b = this.g;
        efr efrVar = this.h;
        switch (b) {
            case 0:
                efrVar.f(intent, x871Var);
                break;
            case 1:
                efrVar.f(intent, x871Var);
                break;
            case 2:
                efrVar.f(intent, x871Var);
                break;
            default:
                efrVar.f(intent, x871Var);
                break;
        }
        return intent;
    }
}
