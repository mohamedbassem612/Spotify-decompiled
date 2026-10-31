package p;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s8n1 extends q5n1 implements nz40, oz40 {
    public static final a8n1 s = v8n1.a;
    public final Context l;
    public final Handler m;
    public final a8n1 n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d520 f32p;
    public lj81 q;
    public kl1 r;

    public s8n1(Context context, jim0 jim0Var, d520 d520Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.l = context;
        this.m = jim0Var;
        this.f32p = d520Var;
        this.o = (Set) d520Var.c;
        this.n = s;
    }

    public final void B0(int i) {
        kl1 kl1Var = this.r;
        h8n1 h8n1Var = (h8n1) ((pz40) kl1Var.f).t.get((gi5) kl1Var.c);
        if (h8n1Var != null) {
            if (h8n1Var.s) {
                h8n1Var.k(new lal(17, (PendingIntent) null, (String) null));
            } else {
                h8n1Var.B0(i);
            }
        }
    }

    public final void Y0(kl1 kl1Var) {
        px40 px40Var = this.q;
        if (px40Var != null) {
            px40Var.c();
        }
        Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
        d520 d520Var = this.f32p;
        d520Var.h = numValueOf;
        Handler handler = this.m;
        this.q = (lj81) this.n.k(this.l, handler.getLooper(), d520Var, (mj81) d520Var.g, this, this);
        this.r = kl1Var;
        Set set = this.o;
        if (set == null || set.isEmpty()) {
            handler.post(new seg1(this, (byte) 14));
            return;
        }
        px40 px40Var2 = this.q;
        px40Var2.getClass();
        px40Var2.a(new lo9(px40Var2));
    }

    public final void Z0() {
        px40 px40Var = this.q;
        if (px40Var != null) {
            px40Var.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.lj81, p.xaa] */
    public final void onConnected() {
        ?? r0 = this.q;
        r0.getClass();
        try {
            try {
                r0.C.getClass();
                Account account = new Account("<<default account>>", "com.google");
                GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? l0c1.a(r0.c).b() : null;
                Integer num = r0.E;
                zod.s(num);
                u9n1 u9n1Var = new u9n1(2, account, num.intValue(), googleSignInAccountB);
                z8n1 z8n1Var = (z8n1) r0.n();
                f9n1 f9n1Var = new f9n1(1, u9n1Var);
                Parcel parcelS = z8n1Var.s();
                p8n1.b(parcelS, f9n1Var);
                parcelS.writeStrongBinder(this);
                z8n1Var.B0(12, parcelS);
            } catch (RemoteException unused) {
                this.m.post(new mqh1(this, new k9n1(1, new lal(8, (PendingIntent) null, (String) null), null), false, (byte) 9));
            }
        } catch (RemoteException unused2) {
        }
    }

    public final void s(lal lalVar) {
        this.r.I(lalVar);
    }
}
