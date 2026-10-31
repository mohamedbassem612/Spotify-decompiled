package p;

import android.content.Context;
import android.graphics.Matrix;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class txn1 implements dvo1 {
    public final Context a;
    public final kce1 b;
    public boolean c;
    public boolean d;
    public final ecp1 e;
    public idp1 f;

    public txn1(Context context, kce1 kce1Var, ecp1 ecp1Var) {
        this.a = context;
        this.b = kce1Var;
        this.e = ecp1Var;
    }

    @Override // p.dvo1
    public final yzd1 a(mj80 mj80Var) throws MlKitException {
        if (this.f == null) {
            zzb();
        }
        idp1 idp1Var = this.f;
        zod.s(idp1Var);
        boolean z = this.c;
        kce1 kce1Var = this.b;
        if (!z) {
            try {
                idp1Var.h1();
                this.c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init text recognizer ".concat(kce1Var.b()), e);
            }
        }
        try {
            return new yzd1(idp1Var.g1(zj20.c(mj80Var), new zcp1(mj80Var.a(), mj80Var.e(), mj80Var.b(), x8p1.k(mj80Var.d()), SystemClock.elapsedRealtime())), (Matrix) null);
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run text recognizer ".concat(kce1Var.b()), e2);
        }
    }

    @Override // p.dvo1
    public final void zzb() throws MlKitException {
        idp1 idp1VarG1;
        ecp1 ecp1Var = this.e;
        Context context = this.a;
        kce1 kce1Var = this.b;
        if (this.f != null) {
            return;
        }
        try {
            if (kce1Var.a()) {
                idp1VarG1 = ndp1.b1(gjv.c(context, gjv.c, kce1Var.c()).b("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).h1(new qfp0(context), new kep1(1, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile", "optional-module-text-latin", (String) null, "en", true, false));
            } else {
                idp1VarG1 = ndp1.b1(gjv.c(context, gjv.b, kce1Var.c()).b("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator")).g1(new qfp0(context));
            }
            this.f = idp1VarG1;
            c8o.z(ecp1Var, kce1Var.a(), q0p1.b);
        } catch (RemoteException e) {
            c8o.z(ecp1Var, kce1Var.a(), q0p1.e);
            throw new MlKitException("Failed to create text recognizer ".concat(kce1Var.b()), e);
        } catch (DynamiteModule$LoadingException e2) {
            c8o.z(ecp1Var, kce1Var.a(), q0p1.d);
            if (kce1Var.a()) {
                throw new MlKitException(gvg.h("Failed to load text module ", kce1Var.b(), ". ", e2.getMessage()), e2);
            }
            if (!this.d) {
                vpq0.b(context, h5p1.I(kce1Var));
                this.d = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // p.dvo1
    public final void zzc() {
        idp1 idp1Var = this.f;
        if (idp1Var != null) {
            try {
                idp1Var.i1();
            } catch (RemoteException unused) {
                "Failed to release text recognizer ".concat(this.b.b());
            }
            this.f = null;
        }
        this.c = false;
    }
}
