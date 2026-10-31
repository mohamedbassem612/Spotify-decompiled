package p;

import android.content.Context;
import android.content.SharedPreferences;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wza0 {
    public final Context a;
    public final yqg b;
    public final h0b0 c;
    public final v6a0 d;
    public final uh8 e;
    public final Flowable f;
    public final Observable g;
    public final Observable h;
    public final vnr i;
    public final f0b0 j;
    public final zmj0 k;
    public final idd1 l;
    public final ExecutorService m = Executors.newSingleThreadExecutor();
    public final idd1 n = new idd1(new pr90(this, (byte) 14));

    public wza0(Context context, yqg yqgVar, nfa0 nfa0Var, h0b0 h0b0Var, v6a0 v6a0Var, uh8 uh8Var, Flowable flowable, Observable observable, Observable observable2, vnr vnrVar, f0b0 f0b0Var, zmj0 zmj0Var) {
        this.a = context;
        this.b = yqgVar;
        this.c = h0b0Var;
        this.d = v6a0Var;
        this.e = uh8Var;
        this.f = flowable;
        this.g = observable;
        this.h = observable2;
        this.i = vnrVar;
        this.j = f0b0Var;
        this.k = zmj0Var;
        this.l = new idd1(new pr90(nfa0Var, (byte) 15));
    }

    public static o0b0 c(p0b0 p0b0Var) {
        return new o0b0(p0b0Var.f, p0b0Var.a.a, p0b0Var.c, p0b0Var.b, p0b0Var.d);
    }

    public static void d(String str, Exception exc) {
        if (exc.getMessage() == null) {
            exc = new Exception(str);
        }
        String message = exc.getMessage();
        if (message != null) {
            Logger.e(exc, f4i1.f(str, ": ", message), new Object[0]);
        }
    }

    public final hzx a() {
        Context context = this.i.a;
        Context applicationContext = context.getApplicationContext();
        sw9 sw9Var = new sw9(context.getApplicationContext());
        sw9Var.H();
        return hzx.a(applicationContext, "genalpha_account_graduation_encrypted_sharedprefs", sw9Var.v(), fzx.b, gzx.b);
    }

    public final p0b0 b(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        if (str2 != null) {
            try {
                q0b0 q0b0Var = (q0b0) this.l.getValue();
                q0b0Var.getClass();
                try {
                    n0b0 n0b0Var = (n0b0) q0b0Var.a.a(str2, m5n1.z(n0b0.Companion.serializer()));
                    if (n0b0Var != null) {
                        return hfb.k(n0b0Var);
                    }
                } catch (SerializationException e) {
                    throw new IOException("Failed to deserialize KidsGraduationUserInfo", e);
                }
            } catch (IOException e2) {
                SharedPreferences sharedPreferences = (SharedPreferences) this.n.getValue();
                if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorRemove = editorEdit.remove(str)) != null) {
                    editorRemove.apply();
                }
                Logger.e(e2, l1d.m("Account Graduation: Could not read user info for ", str), new Object[0]);
            }
        }
        return null;
    }

    public final Single e(p0b0 p0b0Var) {
        Single singleJust;
        v6a0 v6a0Var = this.d;
        di8 di8Var = p0b0Var.a;
        synchronized (v6a0Var) {
            try {
                yqg yqgVar = (yqg) v6a0Var.c;
                wd wdVar = di8Var.b;
                if (wdVar != null && yqgVar.d().getTimeInMillis() + 30000 <= wdVar.c.getTime()) {
                    singleJust = Single.just(new ii8(di8Var));
                    singleJust.getClass();
                } else {
                    wve0 wve0Var = (wve0) v6a0Var.b;
                    of8 of8Var = di8Var.c;
                    zkz zkzVarN = EsAuthenticateRequest.AuthenticateRequest.n();
                    if (of8Var == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nkz nkzVarN = EsAuthenticateCredentials.AuthenticateCredentials.n();
                    vsz vszVarP = EsUnencryptedStoredCredentials.UnencryptedStoredCredentials.p();
                    byte[] bArr = of8Var.b;
                    hhc hhcVar = phc.b;
                    vszVarP.n(phc.e(0, bArr, bArr.length));
                    vszVarP.q(of8Var.a);
                    nkzVarN.B(vszVarP);
                    zkzVarN.n(nkzVarN.build());
                    singleJust = wve0Var.a(zkzVarN.build()).take(1L).map(mi10.i).singleOrError();
                    singleJust.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return singleJust.map(new v6a0(this, p0b0Var, (byte) 4)).onErrorReturn(new zc80(p0b0Var, (byte) 5)).flatMap(new ye90(this, p0b0Var, (byte) 9)).doOnSuccess(new w090(p0b0Var, this, (byte) 5));
    }

    public final p941 f(p0b0 p0b0Var) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorPutString;
        j941 j941Var = j941.a;
        String str = p0b0Var.a.a;
        try {
            q0b0 q0b0Var = (q0b0) this.l.getValue();
            q0b0Var.getClass();
            try {
                n0b0 n0b0VarO = hfb.o(p0b0Var);
                String strB = n0b0VarO != null ? q0b0Var.a.b(n0b0.Companion.serializer(), n0b0VarO) : null;
                if (strB != null && (sharedPreferences = (SharedPreferences) this.n.getValue()) != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (editorEdit == null || (editorPutString = editorEdit.putString(str, strB)) == null) {
                        return j941Var;
                    }
                    editorPutString.commit();
                }
                return new l941(c(p0b0Var));
            } catch (SerializationException e) {
                throw new IOException("Failed to serialize KidsGraduationUserInfo", e);
            }
        } catch (IOException e2) {
            Logger.e(e2, l1d.m("Account Graduation: Could not serialize user info for ", str), new Object[0]);
            return j941Var;
        }
    }
}
