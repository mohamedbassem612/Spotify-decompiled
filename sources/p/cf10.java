package p;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/cf10;", "Lp/t2u;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cf10 extends t2u {
    public ail1 V1;

    public final void E0() {
        ((zf30) this).h1 = true;
        ail1 ail1Var = this.V1;
        if (ail1Var != null) {
            ail1Var.d();
        }
    }

    public final Dialog c1(Bundle bundle) {
        ail1 ail1Var = this.V1;
        if (ail1Var != null) {
            return ail1Var;
        }
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 != null) {
            dg30VarF0.setResult(-1, omn0.e(dg30VarF0.getIntent(), (Bundle) null, (FacebookException) null));
            dg30VarF0.finish();
        }
        ((t2u) this).M1 = false;
        return super.c1(bundle);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ((zf30) this).h1 = true;
        if (this.V1 == null || ((zf30) this).a < 7) {
            return;
        }
        this.V1.d();
    }

    public final void w0(Bundle bundle) {
        dg30 dg30VarF0;
        ail1 ail1Var;
        super.w0(bundle);
        if (this.V1 == null && (dg30VarF0 = f0()) != null) {
            Bundle bundleH = omn0.h(dg30VarF0.getIntent());
            final byte b = 0;
            String string = null;
            if (bundleH != null ? bundleH.getBoolean("is_fallback", false) : false) {
                string = bundleH != null ? bundleH.getString("url") : null;
                if (fpi1.y(string)) {
                    wf10 wf10Var = wf10.a;
                    dg30VarF0.finish();
                    return;
                }
                final byte b2 = 1;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{wf10.b()}, 1));
                int i = eg10.O0;
                ail1.b(dg30VarF0);
                eg10 eg10Var = new eg10(dg30VarF0, string);
                eg10Var.b = str;
                eg10Var.c = new whl1(this) { // from class: p.bf10
                    public final /* synthetic */ cf10 b;

                    {
                        this.b = this;
                    }

                    public final void a(Bundle bundle2, FacebookException facebookException) {
                        byte b3 = b2;
                        cf10 cf10Var = this.b;
                        switch (b3) {
                            case 0:
                                dg30 dg30VarF1 = cf10Var.f0();
                                if (dg30VarF1 != null) {
                                    dg30VarF1.setResult(facebookException != null ? 0 : -1, omn0.e(dg30VarF1.getIntent(), bundle2, facebookException));
                                    dg30VarF1.finish();
                                    break;
                                }
                                break;
                            default:
                                dg30 dg30VarF2 = cf10Var.f0();
                                if (dg30VarF2 != null) {
                                    Intent intent = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent.putExtras(bundle2);
                                    dg30VarF2.setResult(-1, intent);
                                    dg30VarF2.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                ail1Var = eg10Var;
            } else {
                String string2 = bundleH != null ? bundleH.getString("action") : null;
                Bundle bundle2 = bundleH != null ? bundleH.getBundle("params") : null;
                if (fpi1.y(string2)) {
                    wf10 wf10Var2 = wf10.a;
                    dg30VarF0.finish();
                    return;
                }
                Date date = xd.Y;
                xd xdVarS = fuo1.s();
                if (!fuo1.w()) {
                    int i2 = w0h1.c;
                    string = wf10.b();
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                whl1 whl1Var = new whl1(this) { // from class: p.bf10
                    public final /* synthetic */ cf10 b;

                    {
                        this.b = this;
                    }

                    public final void a(Bundle bundle3, FacebookException facebookException) {
                        byte b3 = b;
                        cf10 cf10Var = this.b;
                        switch (b3) {
                            case 0:
                                dg30 dg30VarF1 = cf10Var.f0();
                                if (dg30VarF1 != null) {
                                    dg30VarF1.setResult(facebookException != null ? 0 : -1, omn0.e(dg30VarF1.getIntent(), bundle3, facebookException));
                                    dg30VarF1.finish();
                                    break;
                                }
                                break;
                            default:
                                dg30 dg30VarF2 = cf10Var.f0();
                                if (dg30VarF2 != null) {
                                    Intent intent = new Intent();
                                    if (bundle3 == null) {
                                        bundle3 = new Bundle();
                                    }
                                    intent.putExtras(bundle3);
                                    dg30VarF2.setResult(-1, intent);
                                    dg30VarF2.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (xdVarS != null) {
                    bundle2.putString("app_id", xdVarS.h);
                    bundle2.putString("access_token", xdVarS.e);
                } else {
                    bundle2.putString("app_id", string);
                }
                ail1.b(dg30VarF0);
                ail1Var = new ail1(dg30VarF0, string2, bundle2, 1, whl1Var);
            }
            this.V1 = ail1Var;
        }
    }

    public final void z0() {
        Dialog dialog = ((t2u) this).Q1;
        if (dialog != null) {
            vi30.e(this);
            if (((zf30) this).d1) {
                dialog.setDismissMessage(null);
            }
        }
        super.z0();
    }
}
