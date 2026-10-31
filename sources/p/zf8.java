package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateResult;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zf8 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fg8 b;
    public final /* synthetic */ Single c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ zf8(fg8 fg8Var, Single single, Function0 function0, byte b) {
        this.a = b;
        this.b = fg8Var;
        this.c = single;
        this.d = function0;
    }

    public final Object apply(Object obj) {
        u341 u341Var;
        iww iwwVar;
        byte b = this.a;
        Function0 function0 = this.d;
        Single single = this.c;
        fg8 fg8Var = this.b;
        switch (b) {
            case 0:
                sh8 sh8VarC = fg8Var.c((EsAuthenticateResult.AuthenticateResult) obj, single, function0);
                if (sh8VarC instanceof sh8) {
                    return new qm8(sh8VarC.a);
                }
                if (sh8VarC instanceof rh8) {
                    return new om8(new ug8(400, fg8.a(sh8VarC)));
                }
                if (sh8VarC instanceof jh8) {
                    return new lm8(((jh8) sh8VarC).a);
                }
                if (!(sh8VarC instanceof qh8)) {
                    eg.o();
                    return null;
                }
                qh8 qh8Var = (qh8) sh8VarC;
                if (!(qh8Var instanceof mh8)) {
                    if (qh8Var instanceof kh8) {
                        return mm8.a;
                    }
                    if (!(qh8Var instanceof oh8)) {
                        return new om8(new ug8(400, fg8.a(sh8VarC)));
                    }
                }
                return nm8.a;
            case 1:
                sh8 sh8VarC2 = fg8Var.c((EsAuthenticateResult.AuthenticateResult) obj, single, function0);
                if (sh8VarC2 instanceof sh8) {
                    return new q341(sh8VarC2.a);
                }
                if (sh8VarC2 instanceof rh8) {
                    return new p341(((rh8) sh8VarC2).a);
                }
                if (sh8VarC2 instanceof jh8) {
                    return new k341(((jh8) sh8VarC2).a);
                }
                if (!(sh8VarC2 instanceof qh8)) {
                    eg.o();
                    return null;
                }
                qh8 qh8Var2 = (qh8) sh8VarC2;
                if (qh8Var2 instanceof mh8) {
                    return l341.b;
                }
                if (qh8Var2 instanceof kh8) {
                    return l341.a;
                }
                return qh8Var2 instanceof oh8 ? m341.a : new n341(new ug8(400, fg8.a(sh8VarC2)));
            case 2:
                jh8 jh8VarC = fg8Var.c((EsAuthenticateResult.AuthenticateResult) obj, single, function0);
                if (jh8VarC instanceof jh8) {
                    zxo1 zxo1Var = jh8VarC.a;
                    if (zxo1Var instanceof uf8) {
                        return new s341((uf8) zxo1Var);
                    }
                    u341Var = new u341(new ug8(400, fg8.a(jh8VarC)));
                } else if (jh8VarC instanceof qh8) {
                    qh8 qh8Var3 = (qh8) jh8VarC;
                    if ((qh8Var3 instanceof mh8) || (qh8Var3 instanceof oh8)) {
                        return t341.a;
                    }
                    u341Var = new u341(new ug8(400, fg8.a(jh8VarC)));
                } else {
                    u341Var = new u341(new ug8(400, fg8.a(jh8VarC)));
                }
                return u341Var;
            case 3:
                sh8 sh8VarC3 = fg8Var.c((EsAuthenticateResult.AuthenticateResult) obj, single, function0);
                if (sh8VarC3 instanceof sh8) {
                    return new eww(sh8VarC3.a);
                }
                if (sh8VarC3 instanceof rh8) {
                    return new dww(((rh8) sh8VarC3).a);
                }
                if (sh8VarC3 instanceof jh8) {
                    return new yvw(((jh8) sh8VarC3).a);
                }
                if (!(sh8VarC3 instanceof qh8)) {
                    eg.o();
                    return null;
                }
                qh8 qh8Var4 = (qh8) sh8VarC3;
                if (qh8Var4 instanceof mh8) {
                    return zvw.b;
                }
                if (qh8Var4 instanceof kh8) {
                    return zvw.a;
                }
                return qh8Var4 instanceof oh8 ? aww.a : new bww(new ug8(400, fg8.a(sh8VarC3)));
            case 4:
                jh8 jh8VarC2 = fg8Var.c((EsAuthenticateResult.AuthenticateResult) obj, single, function0);
                if (jh8VarC2 instanceof jh8) {
                    zxo1 zxo1Var2 = jh8VarC2.a;
                    if (zxo1Var2 instanceof sf8) {
                        return new gww((sf8) zxo1Var2);
                    }
                    iwwVar = new iww(new ug8(400, fg8.a(jh8VarC2)));
                } else if (jh8VarC2 instanceof qh8) {
                    qh8 qh8Var5 = (qh8) jh8VarC2;
                    if ((qh8Var5 instanceof mh8) || (qh8Var5 instanceof oh8)) {
                        return hww.a;
                    }
                    iwwVar = new iww(new ug8(400, fg8.a(jh8VarC2)));
                } else {
                    iwwVar = new iww(new ug8(400, fg8.a(jh8VarC2)));
                }
                return iwwVar;
            default:
                EsAuthenticateResult.AuthenticateResult authenticateResult = (EsAuthenticateResult.AuthenticateResult) obj;
                wv80 wv80Var = wv80.b;
                if (authenticateResult.s() == 2 && authenticateResult.q().r() == 1 && authenticateResult.q().p() == alz.R0) {
                    return wv80.a;
                }
                sh8 sh8VarC4 = fg8Var.c(authenticateResult, single, function0);
                if (sh8VarC4 instanceof sh8) {
                    return new bw80(sh8VarC4.a);
                }
                if (!(sh8VarC4 instanceof qh8)) {
                    if (sh8VarC4 instanceof jh8) {
                        return new vv80(((jh8) sh8VarC4).a);
                    }
                    if (sh8VarC4 instanceof rh8) {
                        return new aw80(((rh8) sh8VarC4).a);
                    }
                    eg.o();
                    return null;
                }
                qh8 qh8Var6 = (qh8) sh8VarC4;
                if (!(qh8Var6 instanceof mh8)) {
                    if (qh8Var6 instanceof kh8) {
                        return xv80.a;
                    }
                    if (!(qh8Var6 instanceof oh8)) {
                        return new yv80(new ug8(400, fg8.a(sh8VarC4)));
                    }
                }
                return wv80Var;
        }
    }
}
