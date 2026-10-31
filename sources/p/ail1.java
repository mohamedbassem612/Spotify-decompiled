package p;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.p000rive.semantics.SemanticState;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ail1 extends Dialog {
    public static volatile int Z;
    public boolean X;
    public WindowManager.LayoutParams Y;
    public String a;
    public String b;
    public whl1 c;
    public zhl1 d;
    public ProgressDialog e;
    public ImageView f;
    public FrameLayout g;
    public final vfl1 h;
    public boolean i;
    public boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ail1(dg30 dg30Var, String str, Bundle bundle, int i, whl1 whl1Var) {
        Uri uriA;
        super(dg30Var, Z);
        w0h1.H();
        this.b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = fpi1.u(dg30Var) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", wf10.b());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.2.3"}, 1)));
        this.c = whl1Var;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.h = new vfl1(this, str, bundle);
            return;
        }
        if (yhl1.a[l1d.C(i)] == 1) {
            uriA = fpi1.a(kno1.w(), "oauth/authorize", bundle);
        } else {
            uriA = fpi1.a(kno1.r(), wf10.d() + "/dialog/" + str, bundle);
        }
        this.a = uriA.toString();
    }

    public static int a(float f, int i, int i2, int i3) {
        double d;
        int i4 = (int) (i / f);
        if (i4 <= i2) {
            d = 1.0d;
        } else {
            d = i4 >= i3 ? 0.5d : ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i) * d);
    }

    public static final void b(dg30 dg30Var) {
        if (dg30Var == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = dg30Var.getPackageManager().getApplicationInfo(dg30Var.getPackageName(), SemanticState.Focused);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && Z == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = 2132018927;
                }
                Z = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleE = fpi1.E(uri.getQuery());
        bundleE.putAll(fpi1.E(uri.getFragment()));
        return bundleE;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.i) {
            return;
        }
        e(new FacebookOperationCanceledException());
    }

    public final void d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int iMin = Math.min(a(displayMetrics.density, i3, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(a(displayMetrics.density, i, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        zhl1 zhl1Var = this.d;
        if (zhl1Var != null) {
            zhl1Var.stopLoading();
        }
        if (!this.t && (progressDialog = this.e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.c == null || this.i) {
            return;
        }
        this.i = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        whl1 whl1Var = this.c;
        if (whl1Var != null) {
            whl1Var.a((Bundle) null, facebookException);
        }
        dismiss();
    }

    public final void f(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        zhl1 zhl1Var = new zhl1(getContext());
        this.d = zhl1Var;
        zhl1Var.setVerticalScrollBarEnabled(false);
        zhl1 zhl1Var2 = this.d;
        if (zhl1Var2 != null) {
            zhl1Var2.setHorizontalScrollBarEnabled(false);
        }
        zhl1 zhl1Var3 = this.d;
        if (zhl1Var3 != null) {
            zhl1Var3.setWebViewClient(new q78(this, (byte) 3));
        }
        zhl1 zhl1Var4 = this.d;
        WebSettings settings = zhl1Var4 != null ? zhl1Var4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        zhl1 zhl1Var5 = this.d;
        if (zhl1Var5 != null) {
            String str = this.a;
            if (str == null) {
                eg.m("Required value was null.");
                return;
            }
            zhl1Var5.loadUrl(str);
        }
        zhl1 zhl1Var6 = this.d;
        if (zhl1Var6 != null) {
            zhl1Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        zhl1 zhl1Var7 = this.d;
        if (zhl1Var7 != null) {
            zhl1Var7.setVisibility(4);
        }
        zhl1 zhl1Var8 = this.d;
        WebSettings settings2 = zhl1Var8 != null ? zhl1Var8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        zhl1 zhl1Var9 = this.d;
        WebSettings settings3 = zhl1Var9 != null ? zhl1Var9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        zhl1 zhl1Var10 = this.d;
        if (zhl1Var10 != null) {
            zhl1Var10.setFocusable(true);
        }
        zhl1 zhl1Var11 = this.d;
        if (zhl1Var11 != null) {
            zhl1Var11.setFocusableInTouchMode(true);
        }
        zhl1 zhl1Var12 = this.d;
        if (zhl1Var12 != null) {
            zhl1Var12.setOnTouchListener(new vhl1());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.t = false;
        if (fpi1.D(getContext()) && (layoutParams = this.Y) != null && layoutParams.token == null) {
            Activity ownerActivity = getOwnerActivity();
            layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            WindowManager.LayoutParams layoutParams2 = this.Y;
            Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
            wf10 wf10Var = wf10.a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.e = progressDialog;
        final byte b = 1;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(2131954034));
        }
        ProgressDialog progressDialog3 = this.e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: p.yqp0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    byte b2 = b;
                    Object obj = this;
                    switch (b2) {
                        case 0:
                            int i = OfflineDeviceLimitReachedActivity.k1;
                            ((OfflineDeviceLimitReachedActivity) obj).finish();
                            break;
                        default:
                            ((ail1) obj).cancel();
                            break;
                    }
                }
            });
        }
        requestWindowFeature(1);
        this.g = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f = imageView;
        imageView.setOnClickListener(new kpt((Object) this, (byte) 7));
        Drawable drawable = getContext().getResources().getDrawable(2131231228);
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.a != null) {
            ImageView imageView4 = this.f;
            if (imageView4 == null) {
                eg.m("Required value was null.");
                return;
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            eg.m("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.t = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            zhl1 zhl1Var = this.d;
            if (zhl1Var != null && zhl1Var.canGoBack()) {
                zhl1 zhl1Var2 = this.d;
                if (zhl1Var2 != null) {
                    zhl1Var2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        vfl1 vfl1Var = this.h;
        if (vfl1Var != null) {
            if ((vfl1Var != null ? vfl1Var.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (vfl1Var != null) {
                    vfl1Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        vfl1 vfl1Var = this.h;
        if (vfl1Var != null) {
            vfl1Var.cancel(true);
            ProgressDialog progressDialog = this.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.Y = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ail1(Context context, String str) {
        w0h1.H();
        int i = Z;
        if (i == 0) {
            w0h1.H();
            i = Z;
        }
        super(context, i);
        this.b = "fbconnect://success";
        this.a = str;
    }
}
