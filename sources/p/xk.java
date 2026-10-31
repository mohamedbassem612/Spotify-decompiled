package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xk {
    public final lzn0 a;
    public final gza0 b;
    public yk c = yk.N0;
    public final ArrayList d = new ArrayList();

    public xk(qe41 qe41Var, lzn0 lzn0Var, gza0 gza0Var) {
        this.a = lzn0Var;
        this.b = gza0Var;
        qe41Var.p().e("account_creation_flow_state");
        qe41Var.p().c("account_creation_flow_state", new uk(this, (byte) 0));
        if (qe41Var.p().a.g) {
            i(qe41Var);
        }
        qe41Var.getLifecycle().a(new vk(this, qe41Var, (byte) 0));
    }

    public final void a() {
        this.d.clear();
        this.c = yk.N0;
    }

    public final void b(String str, tv80 tv80Var) {
        a();
        lzn0 lzn0Var = this.a;
        lzn0Var.c();
        lzn0Var.f(new dwn0(!ihc1.y0(str) ? nik1.T3.b("spotify:internal:managed-account-details:child:".concat(str)).a : nik1.Z0.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null));
    }

    public final void c(kl klVar, tv80 tv80Var, Bundle bundle) {
        if (this.d.isEmpty()) {
            n57.e("completeStep(" + klVar + ") called with no steps, flow state lost. Aborting flow.");
            a();
            this.a.c();
            return;
        }
        String string = bundle.getString("pin");
        if (string != null) {
            this.c = yk.a(this.c, string, null, null, null, null, null, null, null, null, null, false, 0, null, 8190);
        }
        String string2 = bundle.getString("name");
        if (string2 != null) {
            this.c = yk.a(this.c, null, string2, null, null, null, null, null, null, null, null, false, 0, null, 8189);
        }
        String string3 = bundle.getString("birthday");
        if (string3 != null) {
            this.c = yk.a(this.c, null, null, string3, null, null, null, null, null, null, null, false, 0, null, 8187);
        }
        dxr0 parcelable = bundle.getParcelable("default_control");
        if (parcelable != null) {
            this.c = yk.a(this.c, null, null, null, parcelable, null, null, null, null, null, null, false, 0, null, 8183);
        }
        h(e(klVar), tv80Var);
    }

    public final kl e(kl klVar) {
        ArrayList arrayList = this.d;
        kl klVar2 = (kl) o7h.t0(arrayList.indexOf(klVar) + 1, arrayList);
        if (klVar2 != null) {
            return klVar2;
        }
        Logger.d("No next step for %s (steps size=%d)", new Object[]{klVar, Integer.valueOf(arrayList.size())});
        return klVar;
    }

    public final lik1 f(kl klVar) {
        return z5p1.o(e(klVar), this.c.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r4 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r4 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(p.xxa0 r25, boolean r26, p.vur0 r27, p.onm r28) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xk.g(p.xxa0, boolean, p.vur0, p.onm):java.lang.Object");
    }

    public final void h(kl klVar, tv80 tv80Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.d) {
            if (((kl) obj).a) {
                arrayList.add(obj);
            }
        }
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("key_flow_type", this.c.h), new mmr0("pages", new okr0(arrayList.indexOf(klVar) + 1, arrayList.size()))});
        if (klVar.equals(zk.b)) {
            bundleH.putParcelableArrayList("verification_methods", new ArrayList<>(this.c.i));
            bundleH.putInt("parental_consent_minimum_age", this.c.Y);
        } else if (klVar instanceof gl) {
            bundleH.putParcelable("expected_account_type", this.c.t);
            bundleH.putBoolean("has_addons_terminated_by_transition", this.c.X);
        } else if (klVar.equals(cl.b)) {
            bundleH.putParcelable("key_privacy_policy_consent_type", this.c.g);
            bundleH.putParcelable("expected_account_type", this.c.t);
        } else if (klVar.equals(el.b)) {
            bundleH.putString("pin", this.c.a);
        } else if (klVar.equals(dl.b)) {
            bundleH.putParcelable("default_control", this.c.d);
            bundleH.putParcelable("expected_account_type", this.c.t);
        } else if (klVar.equals(il.b)) {
            bundleH.putString("minBirthday", this.c.f);
            bundleH.putString("maxBirthday", this.c.e);
        } else if (klVar.equals(fl.b)) {
            bundleH.putString("name", this.c.b);
            bundleH.putString("pin", this.c.a);
            bundleH.putString("birthday", this.c.c);
            bundleH.putParcelable("parental_controls", this.c.d);
            bundleH.putParcelable("expected_account_type", this.c.t);
        } else if (klVar.equals(hl.b)) {
            bundleH.putParcelable("flow_type", this.c.h);
            bundleH.putString("kid_name", this.c.b);
            bundleH.putString("kid_birthday", this.c.c);
            bundleH.putString("pin", this.c.a);
            bundleH.putParcelable("parental_controls", this.c.d);
            bundleH.putString("source", this.c.Z.a);
            bundleH.putParcelable("expected_account_type", this.c.t);
        }
        this.a.i(new dwn0(z5p1.o(klVar, this.c.h).a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), bundleH);
    }

    public final void i(qe41 qe41Var) {
        ArrayList parcelableArrayList;
        Bundle bundleA = qe41Var.p().a("account_creation_flow_state");
        if (bundleA != null) {
            ClassLoader classLoader = yk.class.getClassLoader();
            if (classLoader == null) {
                eg.m("Required value was null.");
                return;
            }
            bundleA.setClassLoader(classLoader);
            yk ykVar = this.c;
            yk ykVar2 = yk.N0;
            if (u890.j(ykVar, ykVar2)) {
                yk ykVar3 = (yk) bundleA.getParcelable("account_creation_flow_model");
                if (ykVar3 != null) {
                    ykVar2 = ykVar3;
                }
                this.c = ykVar2;
            }
            ArrayList arrayList = this.d;
            if (!arrayList.isEmpty() || (parcelableArrayList = bundleA.getParcelableArrayList("account_creation_flow_steps")) == null) {
                return;
            }
            arrayList.addAll(parcelableArrayList);
        }
    }
}
