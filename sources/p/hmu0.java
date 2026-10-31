package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hmu0 implements sdm {
    public final f3b a;
    public final mzr0 b;
    public final f3b c;
    public final kl1 d;
    public final tzr0 e;
    public final dlg1 f;
    public final vqg g;

    public hmu0(f3b f3bVar, mzr0 mzr0Var, f3b f3bVar2, kl1 kl1Var, tzr0 tzr0Var, dlg1 dlg1Var, vqg vqgVar) {
        this.a = f3bVar;
        this.b = mzr0Var;
        this.c = f3bVar2;
        this.d = kl1Var;
        this.e = tzr0Var;
        this.f = dlg1Var;
        this.g = vqgVar;
    }

    public final kjm b(dmu0 dmu0Var, bmu0 bmu0Var) {
        String str = bmu0Var.a;
        String str2 = bmu0Var.b;
        int i = bmu0Var.c;
        if (str.length() == 0) {
            str = dmu0Var.g;
        }
        igm igmVar = new igm(str, new wfm(Uri.EMPTY, egm.c), str2);
        smc0 smc0VarN = k4p1.n();
        boolean z = dmu0Var.d;
        String str3 = dmu0Var.a;
        String str4 = dmu0Var.f;
        if (z) {
            int iC = l1d.C(i);
            e2t0 e2t0Var = e2t0.Z;
            if (iC == 0) {
                smc0VarN.add(this.f.i(str4, e2t0Var));
            } else if (iC != 3) {
                smc0VarN.add(this.e.g(str4, e2t0Var, new lik1(str3)));
            }
        }
        if (dmu0Var.h) {
            smc0VarN.add(this.a.a(str4, dmu0Var.e));
        }
        if (dmu0Var.c) {
            smc0VarN.add(new jhm("rename_folder_item_context_menu_item", xmx.c, (fhm) null, 2131954427, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(ma21.Y, new sc21(str4, (byte) 0)), new nt01(this.c, str4, (byte) 19)), 244));
        }
        fmu0 fmu0Var = dmu0Var.i;
        emu0 emu0Var = fmu0Var instanceof emu0 ? (emu0) fmu0Var : null;
        if (emu0Var != null) {
            smc0VarN.add(this.d.m(str4, emu0Var.a, str3));
        }
        if (dmu0Var.b) {
            smc0VarN.add(new jhm("delete_folder_item_context_menu_item", cmx.c, (fhm) null, 2131954347, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(i021.Q0, i021.R0), new gh1((byte) 23, this.b, str4, dmu0Var.g, dmu0Var.j)), 244));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(cmu0 cmu0Var, onm onmVar) {
        gmu0 gmu0Var;
        dmu0 dmu0Var;
        hmu0 hmu0Var = this;
        if (onmVar instanceof gmu0) {
            gmu0Var = (gmu0) onmVar;
            int i = gmu0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmu0Var.e = i - Integer.MIN_VALUE;
            } else {
                gmu0Var = new gmu0(hmu0Var, onmVar);
            }
        } else {
            gmu0Var = new gmu0(hmu0Var, onmVar);
        }
        Object objL = gmu0Var.c;
        int i2 = gmu0Var.e;
        if (i2 == 0) {
            hm5.M(objL);
            String str = cmu0Var.a.a;
            String str2 = cmu0Var.f;
            String str3 = cmu0Var.g;
            boolean z = cmu0Var.d;
            boolean z2 = cmu0Var.h;
            boolean z3 = cmu0Var.c;
            boolean z4 = cmu0Var.b;
            String str4 = cmu0Var.e;
            String str5 = cmu0Var.t;
            dmu0Var = new dmu0(str, z4, z3, z, str4, str2, str3, z2, str5 != null ? new emu0(str5) : c710.Z0, cmu0Var.i);
            Observable observableG1 = hmu0Var.g.g1(str2, str3);
            gmu0Var.a = hmu0Var;
            gmu0Var.b = dmu0Var;
            gmu0Var.e = 1;
            objL = fc11.l(observableG1, 1, (Object) null, gmu0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dmu0 dmu0Var2 = gmu0Var.b;
            hmu0 hmu0Var2 = gmu0Var.a;
            hm5.M(objL);
            dmu0Var = dmu0Var2;
            hmu0Var = hmu0Var2;
        }
        return hmu0Var.b(dmu0Var, (bmu0) objL);
    }
}
