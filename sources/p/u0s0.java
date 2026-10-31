package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class u0s0 extends hip {
    public c1s0 G1;
    public nl51 H1;
    public x0s0 I1;
    public v0s0 J1;
    public mka K1;
    public slc0 L1;
    public boolean M1;

    public final void H0() {
        if (this.M1) {
            N0().finish();
        }
        ((zf30) this).h1 = true;
    }

    public final void Y0(q19 q19Var) {
        Uri uriBuild;
        this.K1.getClass();
        String str = q19Var.b;
        boolean z = str != null;
        q0s0 q0s0Var = q19Var.c;
        if (!z) {
            dg30 dg30VarN0 = N0();
            this.K1.getClass();
            int i = q0s0Var == null ? -1 : 0;
            this.K1.getClass();
            dg30VarN0.setResult(i, mka.g(q19Var));
            N0().finish();
            return;
        }
        this.K1.getClass();
        if (str == null) {
            uriBuild = Uri.EMPTY;
        } else {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            String str2 = q19Var.a;
            if (str2 != null) {
                builderBuildUpon.appendQueryParameter("state", str2);
            }
            if (q0s0Var != null) {
                builderBuildUpon.appendQueryParameter("error_description", q0s0Var.b);
                builderBuildUpon.appendQueryParameter("error_code", jup0.i(q0s0Var.a));
            }
            uriBuild = builderBuildUpon.build();
        }
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        mka mkaVar = this.K1;
        dg30 dg30VarN1 = N0();
        mkaVar.getClass();
        if (intent.resolveActivity(dg30VarN1.getPackageManager()) != null) {
            X0(intent);
            this.M1 = true;
        } else {
            Logger.d("Failed to redirect to %s", new Object[]{uriBuild.toString()});
            N0().finish();
        }
    }

    public final void u0(int i, int i2, Intent intent) {
        super/*p.zf30*/.u0(i, i2, intent);
        if (this.I1.b.b(i, i2, intent)) {
            return;
        }
        c1s0 c1s0Var = this.G1;
        c1s0Var.getClass();
        if (i != 111 || i2 == -1) {
            return;
        }
        c1s0Var.a(c1s0Var.h, 1, "");
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
        N0().J().a(this, new ydb(this, (byte) 20));
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        Bundle bundleO0 = O0();
        this.L1 = bundleO0.getParcelable("account_linking_id");
        c1s0 c1s0Var = this.G1;
        String string = bundleO0.getString("data", null);
        slc0 slc0Var = this.L1;
        if (slc0Var == null) {
            c1s0Var.getClass();
            slc0 slc0Var2 = new slc0(UUID.randomUUID().toString());
            c1s0Var.h = slc0Var2;
            bjx bjxVar = c1s0Var.e;
            ((CompositeDisposable) bjxVar.g).b(fq7.C((xov0) bjxVar.b).subscribe(new p0s0(bjxVar, slc0Var2, "", 4)));
        } else {
            c1s0Var.h = slc0Var;
        }
        ix7 ix7Var = new ix7((byte) 13);
        if (string != null) {
            Uri uri = Uri.parse(string);
            ix7Var.b = uri.getQueryParameter("state");
            ix7Var.c = uri.getQueryParameter("redirect_uri");
        }
        c1s0Var.f = ix7Var;
        if (c1s0Var.a.d.b()) {
            boolean zD = c1s0Var.b.d();
            slc0 slc0Var3 = c1s0Var.h;
            if (zD) {
                rku rkuVar = c1s0Var.g;
                Flowable flowable = c1s0Var.d.a;
                rkuVar.b(x0d.j(flowable, flowable).filter(new qpp0((byte) 11)).flatMap(new qpp0((byte) 12)).distinctUntilChanged().takeUntil(new qpp0((byte) 10)).flatMap(new a1s0(c1s0Var, (byte) 0)).flatMapSingle(new a1s0(c1s0Var, (byte) 1)).subscribe(new b1s0(c1s0Var, slc0Var3, (byte) 0), new b1s0(c1s0Var, slc0Var3, (byte) 1)));
            } else {
                c1s0Var.a(slc0Var3, 5, "");
            }
        } else {
            c1s0Var.a(c1s0Var.h, 2, "");
        }
        this.I1.a = new pjq0(this, (byte) 3);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624656, viewGroup, false);
    }

    public final void y0() {
        this.G1.g.a();
        this.I1.a = new qpp0((byte) 9);
        ((zf30) this).h1 = true;
    }
}
