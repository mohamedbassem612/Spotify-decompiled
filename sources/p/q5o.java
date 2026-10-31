package p;

import android.content.Context;
import androidx.credentials.exceptions.CreateCredentialException;
import com.spotify.login.credentialmanager.passkeys.PasskeysApiException;
import com.spotify.passkeys.v1.StartRegistrationResponse;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q5o {
    public final w5o a;
    public final r5o b;
    public final tzr0 c;
    public final g1f0 d;
    public final llm e;
    public final dt71 f = mgo1.e(0, 0, 0, 7);
    public final dt71 g = mgo1.e(0, 0, 0, 7);
    public final dt71 h = mgo1.e(0, 0, 0, 7);
    public xab1 i;

    public q5o(Context context, w5o w5oVar, q8n q8nVar, r5o r5oVar, tzr0 tzr0Var, g1f0 g1f0Var) {
        this.a = w5oVar;
        this.b = r5oVar;
        this.c = tzr0Var;
        this.d = g1f0Var;
        this.e = i3a.k(q8nVar);
        r5oVar.b.a(new khv0(r5oVar.a.a, "google_play_services_status", Collections.singletonMap("value", String.valueOf(lz40.e.c(context, mz40.a)))));
    }

    public static final void d(q5o q5oVar, CreateCredentialException createCredentialException) {
        String string;
        CharSequence charSequence = createCredentialException.b;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "Unknown Error";
        }
        r5o r5oVar = q5oVar.b;
        r5oVar.b.a(new khv0(r5oVar.a.a, "credential_manager_save_credentials_failure", sqg0.J(new mmr0[]{new mmr0("errorMsg", string), new mmr0("errorType", createCredentialException.a())})));
    }

    public static void h(q5o q5oVar) {
        xab1 xab1Var = q5oVar.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        q5oVar.i = fn31.T(q5oVar.e, (o8n) null, 0, new hxn(q5oVar, c6o.a, (lnm) null, (byte) 1), 3);
    }

    public final void e() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(non nonVar, n4s0 n4s0Var, onm onmVar) {
        o5o o5oVar;
        Object objJ;
        r5o r5oVar = this.b;
        gp41 gp41Var = r5oVar.a;
        ohv0 ohv0Var = r5oVar.b;
        if (onmVar instanceof o5o) {
            o5oVar = (o5o) onmVar;
            int i = o5oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o5oVar.c = i - Integer.MIN_VALUE;
            } else {
                o5oVar = new o5o(this, onmVar);
            }
        } else {
            o5oVar = new o5o(this, onmVar);
        }
        Object obj = o5oVar.a;
        int i2 = o5oVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            String str = nonVar.a;
            StartRegistrationResponse startRegistrationResponse = n4s0Var.b;
            o5oVar.c = 1;
            objJ = this.c.j(str, startRegistrationResponse, o5oVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objJ = ((e331) obj).a;
        }
        Throwable thA = e331.a(objJ);
        if (thA == null) {
            ohv0Var.a(new khv0(gp41Var.a, 4, (Map) null, "credential_manager_register_passkey_success"));
        } else {
            ohv0Var.a(new khv0(gp41Var.a, 4, (Map) null, "credential_manager_register_passkey_failure"));
            if (thA instanceof PasskeysApiException) {
                r5oVar.d(((PasskeysApiException) thA).a, "error_endpoint_passkeys-v1_passkey_register_finish");
            }
        }
        return rih1.a;
    }

    public final Observable g() {
        return yoi1.i(this.h, o6x.a);
    }
}
