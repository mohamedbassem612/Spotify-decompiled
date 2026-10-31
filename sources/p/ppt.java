package p;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.comscore.streaming.AdvertisementType;
import com.facebook.FacebookException;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lp/ppt;", "Lp/t2u;", "<init>", "()V", "p/mod", "p/l6s", "p/npt", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ppt extends t2u {
    public View V1;
    public TextView W1;
    public TextView X1;
    public qpt Y1;
    public final AtomicBoolean Z1 = new AtomicBoolean();
    public volatile nd50 a2;
    public volatile ScheduledFuture b2;
    public volatile npt c2;
    public boolean d2;
    public boolean e2;
    public rye0 f2;

    public final void F0(Bundle bundle) {
        super.F0(bundle);
        if (this.c2 != null) {
            bundle.putParcelable("request_state", this.c2);
        }
    }

    public final Dialog c1(Bundle bundle) {
        opt optVar = new opt(N0(), 2132018928);
        optVar.setContentView(j1(wvt.b() && !this.e2));
        return optVar;
    }

    public final void i1(String str, l6s l6sVar, String str2, Date date, Date date2) {
        qpt qptVar = this.Y1;
        if (qptVar != null) {
            qptVar.h().h(new sye0(qptVar.h().g, 1, new xd(str2, wf10.b(), str, (ArrayList) l6sVar.a, (ArrayList) l6sVar.b, (ArrayList) l6sVar.c, oe.f, date, (Date) null, date2), null, null, null));
        }
        Dialog dialog = ((t2u) this).Q1;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View j1(boolean z) {
        View viewInflate = N0().getLayoutInflater().inflate(z ? 2131624423 : 2131624421, (ViewGroup) null);
        this.V1 = viewInflate.findViewById(2131430530);
        this.W1 = (TextView) viewInflate.findViewById(2131428180);
        ((Button) viewInflate.findViewById(2131427887)).setOnClickListener(new kpt((Object) this, (byte) 0));
        TextView textView = (TextView) viewInflate.findViewById(2131428124);
        this.X1 = textView;
        textView.setText(Html.fromHtml(l0(2131954028)));
        return viewInflate;
    }

    public final void k1() {
        if (this.Z1.compareAndSet(false, true)) {
            npt nptVar = this.c2;
            if (nptVar != null) {
                wvt.a(nptVar.b);
            }
            qpt qptVar = this.Y1;
            if (qptVar != null) {
                qptVar.h().h(new sye0(qptVar.h().g, 2, null, null, "User canceled log in.", null));
            }
            Dialog dialog = ((t2u) this).Q1;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void l1(FacebookException facebookException) {
        if (this.Z1.compareAndSet(false, true)) {
            npt nptVar = this.c2;
            if (nptVar != null) {
                wvt.a(nptVar.b);
            }
            qpt qptVar = this.Y1;
            if (qptVar != null) {
                rye0 rye0Var = qptVar.h().g;
                String message = facebookException.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                qptVar.h().h(new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = ((t2u) this).Q1;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void m1(long j, Long l, String str) {
        Date date;
        Bundle bundleG = cy30.g("fields", "id,permissions,name");
        if (j != 0) {
            date = new Date((j * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        Date date2 = l.longValue() != 0 ? new Date(l.longValue() * 1000) : null;
        Date date3 = date;
        xd xdVar = new xd(str, wf10.b(), "0", (Collection) null, (Collection) null, (Collection) null, (oe) null, date3, (Date) null, date2);
        String str2 = md50.j;
        md50 md50VarQ = cwl1.Q(xdVar, "me", new ge(this, str, date3, date2, (byte) 1));
        md50VarQ.h = a370.a;
        md50VarQ.d = bundleG;
        md50VarQ.d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final void n1() throws FacebookException {
        npt nptVar = this.c2;
        if (nptVar != null) {
            nptVar.e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        npt nptVar2 = this.c2;
        bundle.putString("code", nptVar2 != null ? nptVar2.c : null);
        StringBuilder sb = new StringBuilder(wf10.b());
        sb.append('|');
        w0h1.H();
        String str = wf10.h;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb.append(str);
        bundle.putString("access_token", sb.toString());
        this.a2 = new md50((xd) null, "device/login_status", bundle, a370.b, new lpt(this, (byte) 0), 32).d();
    }

    public final void o1() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        npt nptVar = this.c2;
        Long lValueOf = nptVar != null ? Long.valueOf(nptVar.d) : null;
        if (lValueOf != null) {
            synchronized (qpt.c) {
                scheduledThreadPoolExecutor = qpt.d;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    qpt.d = scheduledThreadPoolExecutor;
                }
            }
            this.b2 = scheduledThreadPoolExecutor.schedule(new fss((Object) this, (byte) 10), lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.d2) {
            return;
        }
        k1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final void p1(npt nptVar) throws FacebookException {
        Bitmap bitmapCreateBitmap;
        this.c2 = nptVar;
        TextView textView = this.W1;
        if (textView == null) {
            u890.C("confirmationCode");
            throw null;
        }
        textView.setText(nptVar.b);
        String str = nptVar.a;
        wvt wvtVar = wvt.a;
        boolean zC = false;
        if (dhn.a.contains(wvt.class)) {
            bitmapCreateBitmap = null;
        } else {
            try {
                EnumMap enumMap = new EnumMap(qax.class);
                enumMap.put(qax.f, 2);
                try {
                    qwa qwaVarJ = new lhc((byte) 16).j(str, 12, AdvertisementType.OTHER, AdvertisementType.OTHER, enumMap);
                    int i = qwaVarJ.b;
                    int i2 = qwaVarJ.a;
                    int[] iArr = new int[i * i2];
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = i3 * i2;
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i4 + i5] = qwaVarJ.a(i5, i3) ? -16777216 : -1;
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    } catch (WriterException unused) {
                    }
                } catch (WriterException unused2) {
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th) {
                dhn.a(wvt.class, th);
            }
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(k0(), bitmapCreateBitmap);
        TextView textView2 = this.X1;
        if (textView2 == null) {
            u890.C("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.W1;
        if (textView3 == null) {
            u890.C("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.V1;
        if (view == null) {
            u890.C("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.e2) {
            String str2 = nptVar.b;
            if (!dhn.a.contains(wvt.class)) {
                try {
                    if (wvt.b()) {
                        zC = wvt.a.c(str2);
                    }
                } catch (Throwable th2) {
                    dhn.a(wvt.class, th2);
                }
            }
            if (zC) {
                rm5 rm5Var = new rm5(h0(), (String) null);
                wf10 wf10Var = wf10.a;
                if (wgi1.c()) {
                    rm5Var.B((Bundle) null, "fb_smart_login_service");
                }
            }
        }
        if (nptVar.e != 0 && (new Date().getTime() - nptVar.e) - (nptVar.d * 1000) < 0) {
            o1();
        } else {
            n1();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final void q1(rye0 rye0Var) throws FacebookException {
        this.f2 = rye0Var;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", rye0Var.b));
        String str = rye0Var.i;
        if (!fpi1.y(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = rye0Var.X;
        if (!fpi1.y(str2)) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder(wf10.b());
        sb.append('|');
        w0h1.H();
        String str3 = wf10.h;
        if (str3 == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb.append(str3);
        bundle.putString("access_token", sb.toString());
        wvt wvtVar = wvt.a;
        String string = null;
        if (!dhn.a.contains(wvt.class)) {
            try {
                HashMap map = new HashMap();
                map.put("device", Build.DEVICE);
                map.put("model", Build.MODEL);
                string = new JSONObject(map).toString();
            } catch (Throwable th) {
                dhn.a(wvt.class, th);
            }
        }
        bundle.putString("device_info", string);
        new md50((xd) null, "device/login", bundle, a370.b, new lpt(this, (byte) 1), 32).d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws FacebookException {
        npt nptVar;
        View viewX0 = super/*p.zf30*/.x0(layoutInflater, viewGroup, bundle);
        l1f0 l1f0Var = (l1f0) N0().Z0;
        this.Y1 = (qpt) (l1f0Var != null ? l1f0Var.Y0().k() : null);
        if (bundle != null && (nptVar = (npt) bundle.getParcelable("request_state")) != null) {
            p1(nptVar);
        }
        return viewX0;
    }

    public final void z0() {
        this.d2 = true;
        this.Z1.set(true);
        super.z0();
        nd50 nd50Var = this.a2;
        if (nd50Var != null) {
            nd50Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.b2;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }
}
