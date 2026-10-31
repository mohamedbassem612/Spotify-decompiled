package p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.view.View;
import android.view.Window;
import android.webkit.WebResourceResponse;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.pses.pses.PsesFetchException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class csj1 implements xhe1, Function, s891, n5r, xgn1, d5q0, vy11, i2q0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public csj1(Window window, View view) {
        this.a = (byte) 7;
        up41 up41Var = new up41(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.b = new nsl1(window, up41Var);
            return;
        }
        if (i >= 30) {
            this.b = new msl1(window, up41Var);
        } else if (i >= 26) {
            this.b = new lsl1(window, up41Var);
        } else {
            this.b = new ksl1(window, up41Var);
        }
    }

    public w7h1 a(String str) {
        rsk0 rsk0Var = (rsk0) this.b;
        x6h1 x6h1VarC = rsk0Var.c.c();
        x6h1VarC.i.add(new a7h1("thumbnail_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, rsk0Var.b, System.currentTimeMillis());
    }

    public void accept(Object obj, Object obj2) {
        cm00 cm00Var = (cm00) this.b;
        IBinder xlo1Var = new xlo1((bsd1) obj2, (byte) 0);
        b7o1 b7o1VarN = ((bvo1) obj).n();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i = ysn1.a;
        parcelObtain.writeStrongBinder(xlo1Var);
        parcelObtain.writeInt(1);
        cm00Var.writeToParcel(parcelObtain, 0);
        b7o1VarN.s(2, parcelObtain);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public Object apply(Object obj) throws NoWhenBranchMatchedException {
        boolean z;
        int i;
        Integer num;
        Observable observableJust;
        byte b = this.a;
        int i2 = 2;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                erk1 erk1Var = (erk1) obj;
                b32 b32Var = erk1Var.a;
                onr onrVar = (onr) obj2;
                double dA = onrVar.a();
                int iC = l1d.C(b32Var.a);
                if (iC == 0) {
                    i2 = 1;
                } else if (iC != 1) {
                    eg.o();
                    return null;
                }
                boolean z2 = erk1Var.b;
                try {
                    uw7 uw7Var = onrVar.a;
                    int iC2 = l1d.C(i2);
                    if (iC2 == 0) {
                        i = -1;
                    } else {
                        if (iC2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 1;
                    }
                    try {
                        uw7Var.a.adjustStreamVolume(3, i, z2 ? 1 : 0);
                        break;
                    } catch (NullPointerException unused) {
                    }
                    z = true;
                } catch (SecurityException e) {
                    Logger.e(e, "Volume adjustment not allowed to toggle Do Not Disturb", new Object[0]);
                    z = false;
                }
                return new nsk1(b32Var, z, dA, z ? Double.valueOf(onrVar.a()) : null);
            case 3:
                w0l1 w0l1Var = (w0l1) obj;
                j1l1 j1l1Var = (j1l1) obj2;
                b4l1 b4l1Var = w0l1Var.a;
                String str = b4l1Var.e;
                CommandOptions commandOptions = j1l1.x;
                return Single.zip(j1l1Var.a(str), j1l1Var.a(b4l1Var.i), e2x0.Y0).map(new dmj1(w0l1Var, (byte) 4)).toObservable();
            case 4:
                e331 e331Var = (e331) obj;
                e331Var.getClass();
                Object obj3 = e331Var.a;
                h5l1 h5l1Var = (h5l1) obj2;
                if (!(obj3 instanceof m231)) {
                    Observable map = h5l1Var.X.map(xpv0.X);
                    map.getClass();
                    return map;
                }
                PsesFetchException psesFetchExceptionA = e331.a(obj3);
                Observable observableJust2 = Observable.just(new e5l1((!(psesFetchExceptionA instanceof PsesFetchException) || (num = psesFetchExceptionA.a) == null) ? ((psesFetchExceptionA instanceof IOException) || (psesFetchExceptionA instanceof TimeoutException)) ? "no_connection" : "unknown" : String.valueOf(num)));
                observableJust2.getClass();
                return observableJust2;
            default:
                List list = (List) obj;
                lum1 lum1Var = (lum1) obj2;
                if (list.isEmpty()) {
                    return Observable.just(z6x.a);
                }
                List<ssp0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (ssp0 ssp0Var : list2) {
                    if (ssp0Var.d == 5 && lum1Var.a.b) {
                        qfc0 qfc0Var = (qfc0) lum1Var.c.get();
                        observableJust = Observable.combineLatest(qfc0Var.a.toObservable(), yoi1.i(new lt20(hu20.c(qfc0Var.b.k("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", rfc0.a), new fca0(2, (lnm) null, (byte) 4)), new i440(3, (lnm) null, (byte) 7), (byte) 0), o6x.a), new ouz(ssp0Var, (byte) 25));
                    } else {
                        observableJust = Observable.just(ssp0Var);
                    }
                    arrayList.add(observableJust);
                }
                return Observable.combineLatest(arrayList, f4x0.X0);
        }
    }

    public void b() {
        igl1 igl1Var = (igl1) this.b;
        if (igl1Var.j != null) {
            igl1Var.j = null;
        }
    }

    public String c(Long l, yqg yqgVar, Context context) {
        if (l == null) {
            return null;
        }
        return ((SimpleDateFormat) ((idd1) this.b).getValue()).format(new Date(l.longValue()));
    }

    public WebResourceResponse d(String str, String str2, String str3, Map map) throws Exception {
        String string;
        String str4;
        String string2;
        ne neVar = new ne((byte) 9);
        neVar.e0(str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str5 = (String) entry.getKey();
                String str6 = (String) entry.getValue();
                if (!nhc1.S(str5, "Authorization", true)) {
                    neVar.d(str5, str6);
                }
            }
        }
        if (str2.toUpperCase(Locale.ROOT).equals("HEAD")) {
            neVar.L("HEAD", (tn21) null);
        } else {
            neVar.t();
        }
        ry21 ry21VarE = ((w5b1) this.b).d.c().a(new ln21(neVar)).e();
        v360 v360Var = ry21VarE.f;
        uz21 uz21Var = ry21VarE.g;
        try {
            String strC = v360Var.c("Content-Type");
            String str7 = strC != null ? strC : null;
            String str8 = "text/plain";
            if (str7 == null) {
                str7 = "text/plain";
            }
            String str9 = (String) o7h.s0(ihc1.Q0(str7, new String[]{";"}, 0, 6));
            if (str9 != null && (string2 = ihc1.e1(str9).toString()) != null) {
                str8 = string2;
            }
            mbh0 mbh0VarM = mno1.m(Pattern.compile("charset=([^;]+)").matcher(str7), 0, str7);
            if (mbh0VarM == null || (str4 = (String) mbh0VarM.a().get(1)) == null || (string = ihc1.e1(str4).toString()) == null) {
                string = "utf-8";
            }
            TreeMap treeMapD = v360Var.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(treeMapD.size()));
            for (Object obj : treeMapD.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), o7h.y0((Iterable) ((Map.Entry) obj).getValue(), ", ", (String) null, (String) null, (iu30) null, 62));
            }
            InputStream byteArrayInputStream = (str3 != null && str8.equals("text/html") && ry21VarE.Q0) ? new ByteArrayInputStream(("<script>" + str3 + "</script>" + uz21Var.f()).getBytes(Charset.forName(string))) : uz21Var.a();
            String str10 = string;
            String str11 = str8;
            int i = ry21VarE.d;
            String str12 = ry21VarE.c;
            if (str12.length() == 0) {
                str12 = "OK";
            }
            return new WebResourceResponse(str11, str10, i, str12, linkedHashMap, byteArrayInputStream);
        } catch (Exception e) {
            ry21VarE.close();
            throw e;
        }
    }

    public void e(lal lalVar) {
        ((oz40) this.b).s(lalVar);
    }

    public void f(boolean z) {
        ((acq0) this.b).I(z);
    }

    public void g(boolean z) {
        ((acq0) this.b).J(z);
    }

    public void i(Exception exc) {
        Status status = new Status(8, "unknown error", (PendingIntent) null, (lal) null);
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            status = new Status(apiException.getStatusCode(), apiException.getMessage(), (PendingIntent) null, (lal) null);
        }
        jub1 jub1Var = (jub1) this.b;
        pue0 pue0Var = b4e.m;
        jub1Var.g(status);
    }

    public void onComplete(Task task) {
        switch (this.a) {
            case 14:
                ayh ayhVar = (ayh) this.b;
                Exception excF = task.f();
                if (excF != null) {
                    ayhVar.y0(excF);
                } else if (!((hfp1) task).d) {
                    ayhVar.m0(task.g());
                } else {
                    ayhVar.d((CancellationException) null);
                }
                break;
            default:
                ((wbp1) this.b).l.e("joinApplication", task);
                break;
        }
    }

    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((zgn1) this.b).a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public csj1() {
        this.a = (byte) 8;
        this.b = new idd1(wam1.i);
    }

    public /* synthetic */ csj1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
