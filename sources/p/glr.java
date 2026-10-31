package p;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class glr implements x2e {
    public final elr a;
    public final q8n b;
    public final jo20 c;
    public wcr e;
    public gg61 f;
    public c9n h;
    public final dt71 d = mgo1.e(0, 1, 0, 5);
    public j4e g = j4e.c;

    public glr(elr elrVar, q8n q8nVar, jo20 jo20Var) {
        this.a = elrVar;
        this.b = q8nVar;
        this.c = jo20Var;
        this.h = cy30.t(q8nVar);
    }

    @Override // p.x2e
    public final void a() {
        gg61 gg61Var;
        wcr wcrVar = this.e;
        if (wcrVar != null && (gg61Var = this.f) != null) {
            wf61 wf61Var = gg61Var.b;
            eg61 eg61VarB = gg61Var.b(wcrVar, true);
            zod.n("Must be called from the main thread.");
            try {
                pon1 pon1Var = wf61Var.a;
                mh70 gqn1Var = new gqn1(eg61VarB);
                Parcel parcelA1 = pon1Var.a1();
                osn1.c(parcelA1, gqn1Var);
                pon1Var.c1(3, parcelA1);
            } catch (RemoteException unused) {
                wf61.c.b("Unable to call %s on %s.", "removeSessionManagerListener", pon1.class.getSimpleName());
            }
        }
        this.e = null;
        this.f = null;
        if (this.c.isEnabled()) {
            this.g = j4e.c;
        }
        smo1.q(this.h);
    }

    @Override // p.x2e
    public final void b() {
        c9n c9nVarV = qmo1.v(this.h, new z5o(this, (byte) 28));
        this.h = c9nVarV;
        wcr wcrVar = new wcr(this, (byte) 2);
        c921.y(c9nVarV, (o8n) null, 0, new hxn(this, wcrVar, (lnm) null, (byte) 8), 3);
        this.e = wcrVar;
    }

    public final void c(j4e j4eVar, String str) {
        dt71 dt71Var = this.d;
        boolean z = ((Number) dt71Var.j().getValue()).intValue() > 0;
        if (z && d(j4eVar, str)) {
            return;
        }
        if (z) {
            this.g = j4eVar;
        }
        dt71Var.a(new xe61(j4eVar, str));
    }

    public final boolean d(j4e j4eVar, String str) {
        if (this.g.d(j4eVar)) {
            return true;
        }
        return (str == null || str.length() == 0 || !u890.j(this.g.c(), str)) ? false : true;
    }
}
