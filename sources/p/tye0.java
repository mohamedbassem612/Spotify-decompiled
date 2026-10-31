package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.CustomTabMainActivity;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tye0 implements Parcelable {
    public static final Parcelable.Creator<tye0> CREATOR = new rwe0((byte) 5);
    public int X;
    public int Y;
    public t1f0[] a;
    public int b;
    public l1f0 c;
    public c8d0 d;
    public m4e0 e;
    public boolean f;
    public rye0 g;
    public Map h;
    public LinkedHashMap i;
    public m1f0 t;

    public final void a(String str, String str2, boolean z) {
        Map map = this.h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.h == null) {
            this.h = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f) {
            return true;
        }
        dg30 dg30VarJ = j();
        if ((dg30VarJ != null ? dg30VarJ.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f = true;
            return true;
        }
        dg30 dg30VarJ2 = j();
        String string = dg30VarJ2 != null ? dg30VarJ2.getString(2131954031) : null;
        String string2 = dg30VarJ2 != null ? dg30VarJ2.getString(2131954030) : null;
        rye0 rye0Var = this.g;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        g(new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(sye0 sye0Var) {
        tye0 tye0Var;
        int i = sye0Var.a;
        t1f0 t1f0VarK = k();
        if (t1f0VarK != null) {
            tye0Var = this;
            tye0Var.n(t1f0VarK.j(), g5d0.d(i), sye0Var.d, sye0Var.e, t1f0VarK.a);
        } else {
            tye0Var = this;
        }
        Map map = tye0Var.h;
        if (map != null) {
            sye0Var.g = map;
        }
        LinkedHashMap linkedHashMap = tye0Var.i;
        if (linkedHashMap != null) {
            sye0Var.h = linkedHashMap;
        }
        tye0Var.a = null;
        tye0Var.b = -1;
        tye0Var.g = null;
        tye0Var.h = null;
        tye0Var.X = 0;
        tye0Var.Y = 0;
        c8d0 c8d0Var = tye0Var.d;
        if (c8d0Var != null) {
            l1f0 l1f0Var = (l1f0) c8d0Var.b;
            l1f0Var.G1 = null;
            int i2 = i == 2 ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", sye0Var);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            dg30 dg30VarF0 = l1f0Var.f0();
            if (!l1f0Var.q0() || dg30VarF0 == null) {
                return;
            }
            dg30VarF0.setResult(i2, intent);
            dg30VarF0.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:8:0x0019, B:10:0x0023, B:14:0x0051, B:13:0x0038), top: B:23:0x0019 }] */
    public final void h(sye0 sye0Var) {
        sye0 sye0Var2;
        xd xdVar = sye0Var.b;
        if (xdVar != null) {
            Date date = xd.Y;
            if (fuo1.w()) {
                xd xdVarS = fuo1.s();
                if (xdVarS != null) {
                    try {
                        if (u890.j(xdVarS.i, xdVar.i)) {
                            sye0Var2 = new sye0(this.g, 1, sye0Var.b, sye0Var.c, null, null);
                        } else {
                            rye0 rye0Var = this.g;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("User logged in as different Facebook user.");
                            sye0Var2 = new sye0(rye0Var, 3, null, null, TextUtils.join(": ", arrayList), null);
                        }
                    } catch (Exception e) {
                        rye0 rye0Var2 = this.g;
                        String message = e.getMessage();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("Caught exception");
                        if (message != null) {
                            arrayList2.add(message);
                        }
                        g(new sye0(rye0Var2, 3, null, null, TextUtils.join(": ", arrayList2), null));
                        return;
                    }
                } else {
                    rye0 rye0Var3 = this.g;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("User logged in as different Facebook user.");
                    sye0Var2 = new sye0(rye0Var3, 3, null, null, TextUtils.join(": ", arrayList3), null);
                }
                g(sye0Var2);
                return;
            }
        }
        g(sye0Var);
    }

    public final dg30 j() {
        l1f0 l1f0Var = this.c;
        if (l1f0Var != null) {
            return l1f0Var.f0();
        }
        return null;
    }

    public final t1f0 k() {
        t1f0[] t1f0VarArr;
        int i = this.b;
        if (i < 0 || (t1f0VarArr = this.a) == null) {
            return null;
        }
        return t1f0VarArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    public final m1f0 l() {
        Context contextJ;
        rye0 rye0Var;
        String strB;
        String str;
        m1f0 m1f0Var = this.t;
        if (m1f0Var != null) {
            if (dhn.a.contains(m1f0Var)) {
                str = null;
            } else {
                try {
                    str = m1f0Var.a;
                } catch (Throwable th) {
                    dhn.a(m1f0Var, th);
                    str = null;
                }
            }
            rye0 rye0Var2 = this.g;
            if (!u890.j(str, rye0Var2 != null ? rye0Var2.d : null)) {
                contextJ = j();
                if (contextJ == null) {
                    contextJ = wf10.a();
                }
                rye0Var = this.g;
                if (rye0Var != null || (strB = rye0Var.d) == null) {
                    strB = wf10.b();
                }
                m1f0Var = new m1f0(contextJ, strB);
                this.t = m1f0Var;
            }
        } else {
            contextJ = j();
            if (contextJ == null) {
                contextJ = wf10.a();
            }
            rye0Var = this.g;
            if (rye0Var != null) {
                strB = wf10.b();
            } else {
                strB = wf10.b();
            }
            m1f0Var = new m1f0(contextJ, strB);
            this.t = m1f0Var;
        }
        return m1f0Var;
    }

    public final void n(String str, String str2, String str3, String str4, Map map) {
        rye0 rye0Var = this.g;
        if (rye0Var == null) {
            l().a("fb_mobile_login_method_complete", str);
            return;
        }
        m1f0 m1f0VarL = l();
        String str5 = rye0Var.g;
        String str6 = rye0Var.O0 ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (dhn.a.contains(m1f0VarL)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = m1f0.d;
            Bundle bundleO = qtg.o(str5);
            bundleO.putString("2_result", str2);
            if (str3 != null) {
                bundleO.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleO.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleO.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleO.putString("3_method", str);
            m1f0VarL.b.p(bundleO, str6);
        } catch (Throwable th) {
            dhn.a(m1f0VarL, th);
        }
    }

    public final void r(int i, int i2, Intent intent) {
        this.X++;
        if (this.g != null) {
            if (intent != null) {
                int i3 = CustomTabMainActivity.c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    s();
                    return;
                }
            }
            t1f0 t1f0VarK = k();
            if (t1f0VarK != null) {
                if ((t1f0VarK instanceof doa0) && intent == null && this.X < this.Y) {
                    return;
                }
                t1f0VarK.n(i, i2, intent);
            }
        }
    }

    public final void s() {
        tye0 tye0Var;
        t1f0 t1f0VarK = k();
        if (t1f0VarK != null) {
            tye0Var = this;
            tye0Var.n(t1f0VarK.j(), "skipped", null, null, t1f0VarK.a);
        } else {
            tye0Var = this;
        }
        t1f0[] t1f0VarArr = tye0Var.a;
        while (t1f0VarArr != null) {
            int i = tye0Var.b;
            if (i >= t1f0VarArr.length - 1) {
                break;
            }
            tye0Var.b = i + 1;
            t1f0 t1f0VarK2 = tye0Var.k();
            if (t1f0VarK2 != null) {
                if (!(t1f0VarK2 instanceof mjl1) || tye0Var.b()) {
                    rye0 rye0Var = tye0Var.g;
                    if (rye0Var == null) {
                        continue;
                    } else {
                        String str = rye0Var.g;
                        int iT = t1f0VarK2.t(rye0Var);
                        tye0Var.X = 0;
                        if (iT > 0) {
                            m1f0 m1f0VarL = tye0Var.l();
                            String strJ = t1f0VarK2.j();
                            String str2 = rye0Var.O0 ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!dhn.a.contains(m1f0VarL)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = m1f0.d;
                                    Bundle bundleO = qtg.o(str);
                                    bundleO.putString("3_method", strJ);
                                    m1f0VarL.b.p(bundleO, str2);
                                } catch (Throwable th) {
                                    dhn.a(m1f0VarL, th);
                                }
                            }
                            tye0Var.Y = iT;
                        } else {
                            m1f0 m1f0VarL2 = tye0Var.l();
                            String strJ2 = t1f0VarK2.j();
                            String str3 = rye0Var.O0 ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!dhn.a.contains(m1f0VarL2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = m1f0.d;
                                    Bundle bundleO2 = qtg.o(str);
                                    bundleO2.putString("3_method", strJ2);
                                    m1f0VarL2.b.p(bundleO2, str3);
                                } catch (Throwable th2) {
                                    dhn.a(m1f0VarL2, th2);
                                }
                            }
                            tye0Var.a("not_tried", t1f0VarK2.j(), true);
                        }
                        if (iT > 0) {
                            return;
                        }
                    }
                } else {
                    tye0Var.a("no_internet_permission", "1", false);
                }
            }
        }
        rye0 rye0Var2 = tye0Var.g;
        if (rye0Var2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            tye0Var.g(new sye0(rye0Var2, 3, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.g, i);
        fpi1.S(parcel, this.h);
        fpi1.S(parcel, this.i);
    }
}
