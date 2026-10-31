package p;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class lwh0 {
    public final kwh0 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f69p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public gvh0 u;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public lwh0(kwh0 kwh0Var, String str, String str2, boolean z) {
        this.a = kwh0Var;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public final void a() {
        owh0.b();
        HashMap map = owh0.c().j;
        String str = this.c;
        hv40 hv40Var = (hv40) map.get(str);
        if (hv40Var != null) {
            hv40Var.e();
            map.remove(str);
        }
    }

    public final rvh0 b() {
        owh0.b();
        return this.a.a;
    }

    public final int c() {
        Bundle bundle;
        if (!this.v.isEmpty()) {
            if (owh0.c == null) {
                return 0;
            }
            if (owh0.c().u != null && (bundle = Bundle.EMPTY) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
                return 0;
            }
        }
        return this.o;
    }

    public final boolean d() {
        owh0.b();
        lwh0 lwh0Var = owh0.c().v;
        if (lwh0Var != null) {
            return lwh0Var == this || this.n == 3 || (TextUtils.equals(b().b.e(), "android") && l("android.media.intent.category.LIVE_AUDIO") && !l("android.media.intent.category.LIVE_VIDEO"));
        }
        eg.m("There is no default route.  The media router has not yet been fully initialized.");
        return false;
    }

    public final boolean e() {
        return this.u != null && this.g;
    }

    public final boolean f() {
        owh0.b();
        return owh0.c().h() == this;
    }

    public final boolean g(dwh0 dwh0Var) {
        if (dwh0Var == null) {
            hhg1.n("selector must not be null");
            return false;
        }
        owh0.b();
        dwh0Var.a();
        if (!dwh0Var.b.isEmpty()) {
            for (IntentFilter intentFilter : this.k) {
                if (intentFilter != null) {
                    Iterator it = dwh0Var.b.iterator();
                    while (it.hasNext()) {
                        if (intentFilter.hasCategory((String) it.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int h(gvh0 gvh0Var) {
        int i;
        lwh0 lwh0Var;
        int iCountActions;
        if (this.u != gvh0Var) {
            this.u = gvh0Var;
            if (gvh0Var != null) {
                Bundle bundle = gvh0Var.a;
                if (n8p1.o(this.d, gvh0Var.j())) {
                    i = 0;
                } else {
                    this.d = gvh0Var.j();
                    i = 1;
                }
                if (!n8p1.o(this.e, bundle.getString("status"))) {
                    this.e = bundle.getString("status");
                    i = 1;
                }
                if (!n8p1.o(this.f, gvh0Var.f())) {
                    this.f = gvh0Var.f();
                    i = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList arrayListB = gvh0Var.b();
                ArrayList arrayList = this.k;
                if (arrayList != arrayListB) {
                    ListIterator listIterator = arrayList.listIterator();
                    ListIterator listIterator2 = arrayListB.listIterator();
                    while (true) {
                        if (listIterator.hasNext() && listIterator2.hasNext()) {
                            IntentFilter intentFilter = (IntentFilter) listIterator.next();
                            IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                            if (intentFilter != intentFilter2) {
                                if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= iCountActions) {
                                            int iCountCategories = intentFilter.countCategories();
                                            if (iCountCategories == intentFilter2.countCategories()) {
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 >= iCountCategories) {
                                                        continue;
                                                    } else if (intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                                        i3++;
                                                    }
                                                }
                                            }
                                        } else if (intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                            i2++;
                                        }
                                    }
                                }
                            }
                        } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                        }
                        arrayList.clear();
                        arrayList.addAll(gvh0Var.b());
                        i = 1;
                    }
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.n != gvh0Var.c()) {
                    this.n = gvh0Var.c();
                    i = 1;
                }
                int i4 = 3;
                if (this.o != gvh0Var.l()) {
                    this.o = gvh0Var.l();
                    i = 3;
                }
                if (this.f69p != gvh0Var.k()) {
                    this.f69p = gvh0Var.k();
                    i = 3;
                }
                if (this.q != gvh0Var.m()) {
                    this.q = gvh0Var.m();
                } else {
                    i4 = i;
                }
                if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                    this.r = bundle.getInt("presentationDisplayId", -1);
                    i4 |= 5;
                }
                if (!n8p1.o(this.s, gvh0Var.d())) {
                    this.s = gvh0Var.d();
                    i4 |= 1;
                }
                if (!n8p1.o(this.t, (IntentSender) jhc1.t(bundle, "settingsIntent", IntentSender.class))) {
                    this.t = (IntentSender) jhc1.t(bundle, "settingsIntent", IntentSender.class);
                    i4 |= 1;
                }
                if (this.j != bundle.getBoolean("canDisconnect", false)) {
                    this.j = bundle.getBoolean("canDisconnect", false);
                    i4 |= 5;
                }
                ArrayList<String> arrayListE = gvh0Var.e();
                ArrayList arrayList2 = new ArrayList();
                boolean z = arrayListE.size() != this.v.size();
                if (!arrayListE.isEmpty()) {
                    kv40 kv40VarC = owh0.c();
                    for (String str : arrayListE) {
                        kv40VarC.getClass();
                        String str2 = (String) kv40VarC.k.get(new nmr0(this.a.d.d().flattenToShortString(), str));
                        Iterator it = kv40VarC.i.iterator();
                        do {
                            if (!it.hasNext()) {
                                lwh0Var = null;
                                break;
                            }
                            lwh0Var = (lwh0) it.next();
                        } while (!lwh0Var.c.equals(str2));
                        if (lwh0Var != null) {
                            arrayList2.add(lwh0Var);
                            if (!z && !this.v.contains(lwh0Var)) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    return i4;
                }
                this.v = arrayList2;
                return i4 | 1;
            }
        }
        return 0;
    }

    public final void i(int i) {
        owh0.b();
        kv40 kv40VarC = owh0.c();
        int iMin = Math.min(this.q, Math.max(0, i));
        nvh0 nvh0VarG = kv40VarC.g(this);
        if (nvh0VarG != null) {
            nvh0VarG.g(iMin);
        }
    }

    public final void j(int i) {
        nvh0 nvh0VarG;
        owh0.b();
        if (i == 0 || (nvh0VarG = owh0.c().g(this)) == null) {
            return;
        }
        nvh0VarG.j(i);
    }

    public final void k(boolean z) {
        owh0.b();
        owh0.c().k(this, 3, 1, z);
    }

    public final boolean l(String str) {
        owh0.b();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.f69p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(this.a.d.e());
        if (!this.v.isEmpty()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((lwh0) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
