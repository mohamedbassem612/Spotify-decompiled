package p;

import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vfl1 extends AsyncTask {
    public final /* synthetic */ byte a;
    public final String b;
    public final Object c;
    public Object d;
    public final Object e;

    public vfl1(ail1 ail1Var, String str, Bundle bundle) {
        this.a = (byte) 1;
        this.e = ail1Var;
        this.b = str;
        this.c = bundle;
        this.d = new Exception[0];
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [p.xhl1] */
    public String[] a() {
        if (!dhn.a.contains(this)) {
            try {
                String[] stringArray = ((Bundle) this.c).getStringArray("media");
                if (stringArray != null) {
                    final String[] strArr = new String[stringArray.length];
                    this.d = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    Date date = xd.Y;
                    xd xdVarS = fuo1.s();
                    try {
                        int length = stringArray.length;
                        for (final int i = 0; i < length; i++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((nd50) it.next()).cancel(true);
                                }
                            } else {
                                Uri uri = Uri.parse(stringArray[i]);
                                if (fpi1.z(uri)) {
                                    strArr[i] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    concurrentLinkedQueue.add(xzo1.q(xdVarS, uri, (xhl1) new id50() { // from class: p.xhl1
                                        /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
                                        @Override // p.id50
                                        public final void a(pd50 pd50Var) throws FacebookException {
                                            String[] strArr2 = strArr;
                                            int i2 = i;
                                            try {
                                                lf10 lf10Var = pd50Var.c;
                                                String str = "Error staging photo.";
                                                if (lf10Var != null) {
                                                    String strA = lf10Var.a();
                                                    if (strA != null) {
                                                        str = strA;
                                                    }
                                                    throw new FacebookGraphResponseException(pd50Var, str);
                                                }
                                                JSONObject jSONObject = pd50Var.b;
                                                if (jSONObject == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                String strOptString = jSONObject.optString("uri");
                                                if (strOptString == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                strArr2[i2] = strOptString;
                                                countDownLatch.countDown();
                                            } catch (Exception e) {
                                                ((Exception[]) this.d)[i2] = e;
                                            }
                                        }
                                    }).d());
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((nd50) it2.next()).cancel(true);
                        }
                    }
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public void b(String[] strArr) {
        Bundle bundle = (Bundle) this.c;
        ail1 ail1Var = (ail1) this.e;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            ProgressDialog progressDialog = ail1Var.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            for (Exception exc : (Exception[]) this.d) {
                if (exc != null) {
                    ail1Var.e(exc);
                    return;
                }
            }
            if (strArr == null) {
                ail1Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List listAsList = Arrays.asList(strArr);
            if (listAsList.contains(null)) {
                ail1Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            fpi1.F(bundle, new JSONArray((Collection) listAsList));
            ail1Var.a = fpi1.a(kno1.r(), wf10.d() + "/dialog/" + this.b, bundle).toString();
            ImageView imageView = ail1Var.f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ail1Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.a) {
            case 0:
                try {
                    ek70 ek70Var = ((gk70[]) objArr)[0];
                    String str = this.b;
                    t8r0 t8r0Var = (t8r0) this.d;
                    t8r0Var.getClass();
                    Bundle bundle = new Bundle();
                    PendingIntent pendingIntent = (PendingIntent) t8r0Var.a;
                    if (pendingIntent != null) {
                        bundle.putParcelable("openMeIntent", pendingIntent);
                    }
                    Integer num = (Integer) t8r0Var.b;
                    if (num != null) {
                        bundle.putInt("themeColor", num.intValue());
                    }
                    bundle.putInt("versionCode", 10);
                    return ek70Var.s(str, bundle, (Messenger) this.e);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            default:
                if (dhn.a.contains(this)) {
                    return null;
                }
                try {
                    return a();
                } catch (Throwable th) {
                    dhn.a(this, th);
                    return null;
                }
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.a) {
            case 0:
                Messenger messenger = (Messenger) obj;
                ffl1 ffl1Var = (ffl1) this.c;
                if (messenger == null) {
                    ffl1Var.f(2);
                } else {
                    ffl1Var.d = messenger;
                    ffl1Var.g = true;
                    ffl1Var.h = false;
                    ffl1Var.p();
                    xfl1 xfl1Var = ffl1.m;
                    xfl1Var.getClass();
                    Iterator it = xfl1Var.a.iterator();
                    while (it.hasNext()) {
                        pze0.m(((WeakReference) it.next()).get());
                        it.remove();
                    }
                    qpj1 qpj1Var = ffl1Var.i;
                    if (qpj1Var != null) {
                        ((BehaviorSubject) qpj1Var.c).onNext(Boolean.TRUE);
                        yfl1 yfl1Var = (yfl1) ((qeh1) qpj1Var.b).b;
                        sfl1 sfl1Var = yfl1Var.d;
                        sfl1Var.e = "";
                        sfl1Var.d.onNext(Boolean.valueOf(sfl1Var.a()));
                        yfl1Var.e();
                    }
                }
                break;
            default:
                if (!dhn.a.contains(this)) {
                    try {
                        b((String[]) obj);
                    } catch (Throwable th) {
                        dhn.a(this, th);
                    }
                    break;
                }
                break;
        }
    }

    public vfl1(ffl1 ffl1Var, String str, t8r0 t8r0Var, Messenger messenger) {
        this.a = (byte) 0;
        this.c = ffl1Var;
        this.b = str;
        this.d = t8r0Var;
        this.e = messenger;
    }
}
