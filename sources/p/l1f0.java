package p;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/l1f0;", "Lp/zf30;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class l1f0 extends zf30 {
    public String F1;
    public rye0 G1;
    public tye0 H1;
    public pf30 I1;
    public View J1;

    public final void D0() {
        ((zf30) this).h1 = true;
        View view = ((zf30) this).j1;
        View viewFindViewById = view != null ? view.findViewById(2131428126) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final void E0() throws FacebookException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        ((zf30) this).h1 = true;
        if (this.F1 == null) {
            dg30 dg30VarF0 = f0();
            if (dg30VarF0 != null) {
                dg30VarF0.finish();
                return;
            }
            return;
        }
        tye0 tye0VarY0 = Y0();
        rye0 rye0Var = this.G1;
        rye0 rye0Var2 = tye0VarY0.g;
        if ((rye0Var2 == null || tye0VarY0.b < 0) && rye0Var != null) {
            int i = rye0Var.N0;
            if (rye0Var2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = xd.Y;
            if (!fuo1.w() || tye0VarY0.b()) {
                tye0VarY0.g = rye0Var;
                ArrayList arrayList = new ArrayList();
                int i2 = rye0Var.a;
                if (i != 2) {
                    switch (i2) {
                        case 1:
                        case 2:
                            z = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            z = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z) {
                        arrayList.add(new rq40(tye0VarY0));
                    }
                    if (!wf10.p) {
                        switch (i2) {
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                                z2 = true;
                                break;
                            case 4:
                            case 6:
                                z2 = false;
                                break;
                            default:
                                throw null;
                        }
                        if (z2) {
                            arrayList.add(new doa0(tye0VarY0));
                        }
                    }
                } else if (!wf10.p) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 5:
                            z4 = true;
                            break;
                        case 3:
                        case 4:
                        case 6:
                            z4 = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z4) {
                        arrayList.add(new fn80(tye0VarY0));
                    }
                }
                if (g5d0.c(i2)) {
                    arrayList.add(new aro(tye0VarY0));
                }
                switch (i2) {
                    case 1:
                    case 4:
                    case 5:
                        z3 = true;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        z3 = false;
                        break;
                    default:
                        throw null;
                }
                if (z3) {
                    arrayList.add(new mjl1(tye0VarY0));
                }
                if (i != 2) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            z5 = false;
                        case 6:
                            if (z5) {
                                arrayList.add(new qpt(tye0VarY0));
                            }
                            break;
                        default:
                            throw null;
                    }
                }
                tye0VarY0.a = (t1f0[]) arrayList.toArray(new t1f0[0]);
                tye0VarY0.s();
            }
        }
    }

    public final void F0(Bundle bundle) {
        bundle.putParcelable("loginClient", Y0());
    }

    public final tye0 Y0() {
        tye0 tye0Var = this.H1;
        if (tye0Var != null) {
            return tye0Var;
        }
        u890.C("loginClient");
        throw null;
    }

    public final void u0(int i, int i2, Intent intent) {
        super.u0(i, i2, intent);
        Y0().r(i, i2, intent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final void w0(Bundle bundle) throws FacebookException {
        Bundle bundleExtra;
        super.w0(bundle);
        tye0 tye0Var = bundle != null ? (tye0) bundle.getParcelable("loginClient") : null;
        if (tye0Var == null) {
            tye0Var = new tye0();
            tye0Var.b = -1;
            if (tye0Var.c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            tye0Var.c = this;
        } else {
            if (tye0Var.c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            tye0Var.c = this;
        }
        this.H1 = tye0Var;
        Y0().d = new c8d0(this, (byte) 9);
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null) {
            return;
        }
        ComponentName callingActivity = dg30VarF0.getCallingActivity();
        if (callingActivity != null) {
            this.F1 = callingActivity.getPackageName();
        }
        Intent intent = dg30VarF0.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.G1 = (rye0) bundleExtra.getParcelable("request");
        }
        e1r0 e1r0Var = new e1r0((byte) 5, false);
        final j2d0 j2d0Var = new j2d0(this, dg30VarF0, (byte) 11);
        final byte b = 1;
        this.I1 = a0(new bh0() { // from class: p.th0
            public final void a(Object obj) {
                byte b2 = b;
                Object obj2 = j2d0Var;
                switch (b2) {
                    case 0:
                        ((iu30) ((ven0) obj2).getValue()).invoke(obj);
                        break;
                    default:
                        ((j2d0) obj2).invoke((ah0) obj);
                        break;
                }
            }
        }, e1r0Var);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131624422, viewGroup, false);
        this.J1 = viewInflate.findViewById(2131428126);
        Y0().e = new m4e0(this, (byte) 2);
        return viewInflate;
    }

    public final void y0() {
        t1f0 t1f0VarK = Y0().k();
        if (t1f0VarK != null) {
            t1f0VarK.b();
        }
        ((zf30) this).h1 = true;
    }
}
