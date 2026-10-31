package p;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.SectionHeader;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class twa implements c290, ag51, Function, qwj1, mqr0, ete0, ya, Predicate, Init, gi80, w710, Function4 {
    public /* synthetic */ twa() {
    }

    public static final void k(Throwable th) {
        Logger.e(th, "Failed to listen for offline errors.", new Object[0]);
    }

    public static final int l(qq81 qq81Var) {
        int iOrdinal = qq81Var.i.ordinal();
        if (iOrdinal != 3) {
            return iOrdinal != 14 ? 0 : 1;
        }
        return 2;
    }

    public static String n(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static Bundle o(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
        return obj instanceof Bundle ? (Bundle) obj : Bundle.EMPTY;
    }

    public static KeyEvent p(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("android.intent.extra.KEY_EVENT")) {
                    return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
                }
            } catch (RuntimeException e) {
                oon1.I("Failed to get parcelable key event", e);
            }
        }
        return null;
    }

    public static boolean q(Intent intent) {
        return "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction());
    }

    public static boolean r(Intent intent) {
        return "android.intent.action.MEDIA_BUTTON".equals(intent.getAction());
    }

    public static ArrayList u(kw91 kw91Var) {
        List<jp51> list = kw91Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (jp51 jp51Var : list) {
            arrayList.add(new gp51(jp51Var.a, jp51Var.b));
        }
        return arrayList;
    }

    public static hy71 x(zei1 zei1Var) {
        Object next;
        Iterator it = zei1Var.e.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                yp70 yp70Var = (yp70) next;
                int i = yp70Var.c * yp70Var.b;
                do {
                    Object next2 = it.next();
                    yp70 yp70Var2 = (yp70) next2;
                    int i2 = yp70Var2.c * yp70Var2.b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        yp70 yp70Var3 = (yp70) next;
        String str = yp70Var3 != null ? yp70Var3.a : null;
        if (str == null) {
            str = "";
        }
        return new hy71(str, zei1Var.a, zei1Var.b);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        tvj1 tvj1Var = (tvj1) obj;
        tvj1 tvj1Var2 = (tvj1) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Optional optional = (Optional) obj4;
        if (optional.isPresent()) {
            return (tvj1) optional.get();
        }
        return zBooleanValue ? tvj1Var : tvj1Var2;
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.X0;
    }

    public Object apply(Object obj) {
        return jc9.s((sy21) obj);
    }

    public List c(fpd fpdVar, utj utjVar) {
        qg50 qg50Var = new qg50();
        SectionHeader sectionHeader = utjVar.f;
        if (sectionHeader != null) {
            ((af51) qg50Var).c = sectionHeader;
            return Collections.singletonList(new GridSection(qg50Var, 0));
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public Object convert(int i) {
        oig oigVar;
        if (i != 0) {
            oigVar = i != 1 ? null : oig.c;
        } else {
            oigVar = oig.b;
        }
        return oigVar == null ? oig.d : oigVar;
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        zw40 zw40Var = new zw40(parcel);
        zw40Var.a = parcel.readParcelable(classLoader);
        return zw40Var;
    }

    public First e0(Object obj) {
        return First.c((eux0) obj, Collections.singleton(iqx0.a));
    }

    public rqw f(u710 u710Var) {
        return new eih1();
    }

    public boolean g(jl00 jl00Var, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((ii80) jl00Var.b).f();
                Parcelable parcelable = (Parcelable) ((ii80) jl00Var.b).c();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        ClipDescription description = ((ii80) jl00Var.b).getDescription();
        ii80 ii80Var = (ii80) jl00Var.b;
        new ClipData(description, new ClipData.Item(ii80Var.a()));
        ii80Var.getDescription();
        ii80Var.b();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    public Object[] newArray(int i) {
        return new zw40[i];
    }

    public boolean test(Object obj) {
        List list = ((qmq0) obj).a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((mmq0) it.next()) == mmq0.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public xau w(s4b1 s4b1Var, Bundle bundle, tv80 tv80Var) {
        wjq0 wjq0Var;
        String string;
        Uri uri = s4b1Var.a;
        Boolean boolValueOf = null;
        if (uri == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        LinkedList linkedList = new LinkedList(pathSegments);
        if (linkedList.size() <= 1) {
            return null;
        }
        linkedList.pop();
        String str = (String) linkedList.pop();
        String str2 = linkedList.size() % 2 > 0 ? (String) linkedList.pop() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (linkedList.size() >= 2) {
            linkedHashMap.put((String) linkedList.pop(), (String) linkedList.pop());
        }
        for (String str3 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str3);
            if (queryParameter != null) {
                linkedHashMap.put(str3, nhc1.W(queryParameter, "/", ":"));
            }
        }
        boolean zJ = u890.j(uri.getQueryParameter("loadingPlaceholder"), "pageApiDefault");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.contains("startMuted")) {
            boolValueOf = Boolean.valueOf(u890.j(uri.getQueryParameter("startMuted"), "true"));
        }
        Boolean bool = boolValueOf;
        String str4 = (bundle == null || (string = bundle.getString("origin")) == null) ? "" : string;
        String queryParameter2 = uri.getQueryParameter("entrypointIdentifier");
        String str5 = queryParameter2 == null ? "" : queryParameter2;
        str.getClass();
        if (tv80Var == null) {
            wjq0Var = bbu.a;
        } else {
            wjq0 wjq0Var2 = bbu.a;
            wjq0Var = new wjq0(tv80Var);
        }
        return new xau(str, str2, linkedHashMap, zJ, bool, str4, str5, wjq0Var, e9k.s(s4b1Var), e9k.r(s4b1Var), true, khc.g());
    }

    public /* synthetic */ twa(Object obj) {
    }

    public /* synthetic */ twa(daq daqVar, teq teqVar) {
    }

    public void a(String str, String str2) {
    }

    public void i(String str, String str2, Throwable th) {
    }
}
