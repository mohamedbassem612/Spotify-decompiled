package p;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kv40 {
    public static final k220 F;
    public hvh0 A;
    public hvh0 B;
    public int C;
    public lc20 D;
    public final h9d0 c;
    public lwh0 d;
    public nvh0 e;
    public jwh0 f;
    public final Context g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f65p;
    public final boolean q;
    public bvh0 r;
    public final adt0 s;
    public final pwh0 t;
    public swh0 u;
    public lwh0 v;
    public lwh0 w;
    public lwh0 x;
    public mvh0 y;
    public final cv40 a = new cv40(this);
    public final HashMap b = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final j89 n = new j89();
    public final fv40 o = new fv40(this);
    public int z = 0;
    public final j3v E = new j3v(this, (byte) 24);

    static {
        Log.isLoggable("AxMediaRouter", 3);
        F = new k220((byte) 18);
    }

    public kv40(Context context) {
        boolean z = false;
        this.g = context;
        this.f65p = m1p1.s((ActivityManager) context.getSystemService("activity"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            F.getClass();
            int i2 = MediaTransferReceiver.a;
            Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
            intent.setPackage(context.getPackageName());
            if (!context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                z = true;
            }
        }
        this.q = z;
        qed1.a(context);
        this.r = (i < 30 || !z) ? null : new bvh0(context, new hl00(this, (byte) 9));
        context.getPackageName();
        adt0 adt0Var = new adt0(context, this);
        this.s = adt0Var;
        if (i < 36 || ibc.a() < 3600001 || !oo20.a() || this.r == null) {
            Map map = Collections.EMPTY_MAP;
            new ArrayList();
            context.getPackageName();
        }
        this.t = new pwh0(new fss(this, (byte) 29));
        a(adt0Var, true);
        rvh0 rvh0Var = this.r;
        if (rvh0Var != null) {
            a(rvh0Var, true);
        }
        h9d0 h9d0Var = new h9d0(context, this);
        this.c = h9d0Var;
        h9d0Var.i();
    }

    public final void a(rvh0 rvh0Var, boolean z) {
        if (d(rvh0Var) == null) {
            kwh0 kwh0Var = new kwh0(rvh0Var, z);
            this.l.add(kwh0Var);
            this.a.b(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT, kwh0Var);
            o(kwh0Var, rvh0Var.g);
            owh0.b();
            rvh0Var.d = this.o;
            rvh0Var.h(this.A);
        }
    }

    public final String b(kwh0 kwh0Var, String str) {
        String strFlattenToShortString = kwh0Var.d.d().flattenToShortString();
        boolean z = kwh0Var.c;
        String strI = z ? str : xcg1.i(strFlattenToShortString, ":", str);
        HashMap map = this.k;
        if (!z) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((lwh0) arrayList.get(i)).c.equals(strI)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = strI + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((lwh0) arrayList.get(i3)).c.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        map.put(new nmr0(strFlattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        map.put(new nmr0(strFlattenToShortString, str), strI);
        return strI;
    }

    public final lwh0 c() {
        for (lwh0 lwh0Var : this.i) {
            if (lwh0Var != this.v && lwh0Var.b() == this.s && lwh0Var.l("android.media.intent.category.LIVE_AUDIO") && !lwh0Var.l("android.media.intent.category.LIVE_VIDEO") && lwh0Var.e()) {
                return lwh0Var;
            }
        }
        return this.v;
    }

    public final kwh0 d(rvh0 rvh0Var) {
        for (kwh0 kwh0Var : this.l) {
            if (kwh0Var.a == rvh0Var) {
                return kwh0Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (hv40 hv40Var : this.j.values()) {
            if (hv40.b(hv40Var) != null) {
                arrayList.add(hv40.b(hv40Var));
            }
        }
        return arrayList;
    }

    public final hv40 f(iwh0 iwh0Var) {
        for (hv40 hv40Var : this.j.values()) {
            if (hv40.b(hv40Var) == iwh0Var) {
                return hv40Var;
            }
        }
        return null;
    }

    public final nvh0 g(lwh0 lwh0Var) {
        nvh0 nvh0Var;
        if (lwh0Var == this.d && (nvh0Var = this.e) != null) {
            return nvh0Var;
        }
        if (lwh0Var instanceof iwh0) {
            iwh0 iwh0Var = (iwh0) lwh0Var;
            if (iwh0Var.n()) {
                hv40 hv40VarF = f(iwh0Var);
                if (hv40VarF != null) {
                    return hv40.a(hv40VarF);
                }
                return null;
            }
        }
        nvh0 nvh0Var2 = (nvh0) this.b.get(lwh0Var.c);
        if (nvh0Var2 != null) {
            return nvh0Var2;
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext() && (nvh0Var2 = (nvh0) hv40.d((hv40) it.next()).get(lwh0Var.c)) == null) {
        }
        return nvh0Var2;
    }

    public final lwh0 h() {
        lwh0 lwh0Var = this.d;
        if (lwh0Var != null) {
            return lwh0Var;
        }
        eg.m("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean i() {
        swh0 swh0Var = this.u;
        if (this.q) {
            return swh0Var == null || swh0Var.a;
        }
        if (swh0Var == null || !swh0Var.b) {
            return false;
        }
        return swh0Var.a;
    }

    public final void j() {
        nvh0 nvh0VarD;
        if (this.d.v.isEmpty()) {
            return;
        }
        List<lwh0> listUnmodifiableList = Collections.unmodifiableList(this.d.v);
        HashSet hashSet = new HashSet();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            hashSet.add(((lwh0) it.next()).c);
        }
        HashMap map = this.b;
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains(entry.getKey())) {
                nvh0 nvh0Var = (nvh0) entry.getValue();
                nvh0Var.i(0);
                nvh0Var.e();
                it2.remove();
            }
        }
        for (lwh0 lwh0Var : listUnmodifiableList) {
            if (!map.containsKey(lwh0Var.c) && (nvh0VarD = lwh0Var.b().d(lwh0Var.b, this.d.b)) != null) {
                nvh0VarD.f();
                map.put(lwh0Var.c, nvh0VarD);
            }
        }
    }

    public final void k(lwh0 lwh0Var, int i, int i2, boolean z) {
        int iM;
        if (!this.i.contains(lwh0Var)) {
            Objects.toString(lwh0Var);
            return;
        }
        if (!lwh0Var.g) {
            lwh0Var.toString();
            return;
        }
        iwh0 iwh0Var = this.d;
        if (iwh0Var != lwh0Var) {
            iwh0 iwh0Var2 = null;
            if (iwh0Var != null && (iwh0Var instanceof iwh0)) {
                iwh0Var2 = iwh0Var;
            }
            if (iwh0Var2 == null || Collections.unmodifiableList(iwh0Var2.v).size() != 1 || ((iM = iwh0Var2.m(lwh0Var)) != 3 && iM != 2)) {
                if (Build.VERSION.SDK_INT >= 30) {
                    rvh0 rvh0VarB = lwh0Var.b();
                    bvh0 bvh0Var = this.r;
                    if (rvh0VarB == bvh0Var && this.d != lwh0Var) {
                        bvh0Var.n(lwh0Var.b);
                        return;
                    }
                }
                l(lwh0Var, i, i2, z);
                return;
            }
        }
        lwh0Var.toString();
    }

    public final void l(lwh0 lwh0Var, int i, int i2, boolean z) {
        jqd0 jqd0Var;
        if (this.d == lwh0Var) {
            return;
        }
        boolean z2 = lwh0Var == this.v;
        lwh0 lwh0Var2 = this.w;
        Context context = this.g;
        if (lwh0Var2 != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i3 = 3; i3 < stackTrace.length; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                stackTraceElement.getLineNumber();
            }
            if (this.d != null) {
                Locale locale = Locale.US;
                owh0.b();
                lwh0 lwh0Var3 = owh0.c().w;
            }
            context.getPackageName();
        }
        if (this.x != null) {
            this.x = null;
            mvh0 mvh0Var = this.y;
            if (mvh0Var != null) {
                mvh0Var.i(3);
                this.y.e();
                this.y = null;
            }
            this.z = 0;
        }
        if (i() && (jqd0Var = lwh0Var.a.e) != null && jqd0Var.C()) {
            rvh0 rvh0VarB = lwh0Var.b();
            String str = lwh0Var.b;
            d4e0 d4e0Var = new d4e0((byte) 11);
            d4e0Var.p(context.getPackageName());
            mvh0 mvh0VarB = rvh0VarB.b(str, d4e0Var.d());
            if (mvh0VarB != null) {
                mvh0VarB.o(x74.N(context), this.E);
                this.x = lwh0Var;
                this.y = mvh0VarB;
                this.z = i2;
                mvh0VarB.f();
                return;
            }
            lwh0Var.toString();
        }
        rvh0 rvh0VarB2 = lwh0Var.b();
        String str2 = lwh0Var.b;
        d4e0 d4e0Var2 = new d4e0((byte) 11);
        d4e0Var2.p(context.getPackageName());
        nvh0 nvh0VarE = rvh0VarB2.e(str2, d4e0Var2.d());
        if (nvh0VarE != null) {
            nvh0VarE.f();
        }
        if (this.d != null) {
            jwh0 jwh0Var = this.f;
            if (jwh0Var != null) {
                jwh0Var.a();
                this.f = null;
            }
            jwh0 jwh0Var2 = new jwh0(this, lwh0Var, nvh0VarE, i, i2, z, (lwh0) null, (Collection) null);
            this.f = jwh0Var2;
            jwh0Var2.b();
            return;
        }
        this.d = lwh0Var;
        this.e = nvh0VarE;
        f3a f3aVar = new f3a();
        f3aVar.o(i);
        f3aVar.n(i2);
        f3a f3aVarB = f3aVar.b();
        cv40 cv40Var = this.a;
        cv40Var.getClass();
        Message messageObtainMessage = cv40Var.obtainMessage(262, new jv40(null, lwh0Var, f3aVarB, z));
        messageObtainMessage.arg1 = f3aVarB.h();
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    public final void m() {
        hvh0 hvh0Var;
        cwh0 cwh0Var = new cwh0();
        pwh0 pwh0Var = this.t;
        pwh0Var.c();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (true) {
            size--;
            if (size < 0) {
                boolean zA = pwh0Var.a();
                this.C = i;
                dwh0 dwh0VarD = z ? cwh0Var.d() : dwh0.c;
                dwh0 dwh0VarD2 = cwh0Var.d();
                if (i()) {
                    hvh0 hvh0Var2 = this.B;
                    if (hvh0Var2 != null) {
                        hvh0Var2.a();
                        if (!hvh0Var2.c.equals(dwh0VarD2) || this.B.b() != zA) {
                            dwh0VarD2.a();
                            if (dwh0VarD2.b.isEmpty() || zA) {
                                hvh0Var = new hvh0(dwh0VarD2, zA, false);
                                this.B = hvh0Var;
                            } else if (this.B != null) {
                                this.B = null;
                                hvh0Var = null;
                            }
                            this.r.h(hvh0Var);
                        }
                    } else {
                        dwh0VarD2.a();
                        if (dwh0VarD2.b.isEmpty()) {
                            hvh0Var = new hvh0(dwh0VarD2, zA, false);
                            this.B = hvh0Var;
                            this.r.h(hvh0Var);
                        } else {
                            hvh0Var = new hvh0(dwh0VarD2, zA, false);
                            this.B = hvh0Var;
                            this.r.h(hvh0Var);
                        }
                    }
                }
                hvh0 hvh0Var3 = this.A;
                if (hvh0Var3 != null) {
                    hvh0Var3.a();
                    if (hvh0Var3.c.equals(dwh0VarD) && this.A.b() == zA) {
                        return;
                    }
                }
                dwh0VarD.a();
                if (!dwh0VarD.b.isEmpty() || zA) {
                    this.A = new hvh0(dwh0VarD, zA, false);
                } else if (this.A == null) {
                    return;
                } else {
                    this.A = null;
                }
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    rvh0 rvh0Var = ((kwh0) it.next()).a;
                    if (rvh0Var != this.r) {
                        rvh0Var.h(this.A);
                    }
                }
                return;
            }
            owh0 owh0Var = (owh0) ((WeakReference) arrayList.get(size)).get();
            if (owh0Var == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList2 = owh0Var.b;
                int size2 = arrayList2.size();
                i += size2;
                for (int i2 = 0; i2 < size2; i2++) {
                    gwh0 gwh0Var = (gwh0) arrayList2.get(i2);
                    dwh0 dwh0Var = gwh0Var.c;
                    if (dwh0Var == null) {
                        hhg1.n("selector must not be null");
                        return;
                    }
                    cwh0Var.a(dwh0Var.b());
                    boolean z2 = (gwh0Var.d & 1) != 0;
                    pwh0Var.b(gwh0Var.e, z2);
                    if (z2) {
                        z = true;
                    }
                    int i3 = gwh0Var.d;
                    if ((i3 & 4) != 0 && !this.f65p) {
                        z = true;
                    }
                    if ((i3 & 8) != 0) {
                        z = true;
                    }
                }
            }
        }
    }

    public final void n() {
        lwh0 lwh0Var = this.d;
        if (lwh0Var == null) {
            lc20 lc20Var = this.D;
            if (lc20Var != null) {
                lc20Var.h();
                return;
            }
            return;
        }
        int i = lwh0Var.f69p;
        j89 j89Var = this.n;
        j89Var.a = i;
        j89Var.b = lwh0Var.q;
        j89Var.c = lwh0Var.c();
        j89Var.d = this.d.m;
        if (i() && this.d.b() == this.r) {
            j89Var.e = bvh0.k(this.e);
        } else {
            j89Var.e = null;
        }
        Iterator it = this.m.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
        lc20 lc20Var2 = this.D;
        if (lc20Var2 != null) {
            lwh0 lwh0Var2 = this.d;
            lwh0 lwh0Var3 = this.v;
            if (lwh0Var3 == null) {
                eg.m("There is no default route.  The media router has not yet been fully initialized.");
            } else if (lwh0Var2 == lwh0Var3 || lwh0Var2 == this.w) {
                lc20Var2.h();
            } else {
                lc20Var2.i(j89Var.c == 1 ? 2 : 0, j89Var.b, j89Var.a, j89Var.e);
            }
        }
    }

    public final void o(kwh0 kwh0Var, jqd0 jqd0Var) {
        boolean z;
        Iterator it;
        jqd0 jqd0Var2 = kwh0Var.e;
        ArrayList arrayList = kwh0Var.b;
        if (jqd0Var2 != jqd0Var) {
            kwh0Var.e = jqd0Var;
            ArrayList arrayList2 = this.i;
            int i = 0;
            cv40 cv40Var = this.a;
            if (jqd0Var == null || !(jqd0Var.x() || jqd0Var == this.s.g)) {
                if (jqd0Var != null) {
                    jqd0Var.toString();
                } else {
                    Objects.toString(kwh0Var.d.d());
                }
                z = false;
            } else {
                List listV = jqd0Var.v();
                ArrayList<nmr0> arrayList3 = new ArrayList();
                ArrayList<nmr0> arrayList4 = new ArrayList();
                Iterator it2 = listV.iterator();
                int i2 = 0;
                boolean z2 = false;
                while (it2.hasNext()) {
                    gvh0 gvh0Var = (gvh0) it2.next();
                    if (gvh0Var == null || !gvh0Var.n()) {
                        it = it2;
                        Objects.toString(gvh0Var);
                    } else {
                        String strG = gvh0Var.g();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i3 = -1;
                                break;
                            } else if (((lwh0) arrayList.get(i3)).b.equals(strG)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            it = it2;
                            lwh0 lwh0Var = new lwh0(kwh0Var, strG, b(kwh0Var, strG), gvh0Var.a.getBoolean("isSystemRoute", false));
                            int i4 = i2 + 1;
                            arrayList.add(i2, lwh0Var);
                            arrayList2.add(lwh0Var);
                            if (gvh0Var.e().isEmpty()) {
                                lwh0Var.h(gvh0Var);
                                cv40Var.b(257, lwh0Var);
                            } else {
                                arrayList3.add(new nmr0(lwh0Var, gvh0Var));
                            }
                            i2 = i4;
                        } else {
                            it = it2;
                            if (i3 < i2) {
                                gvh0Var.toString();
                            } else {
                                lwh0 lwh0Var2 = (lwh0) arrayList.get(i3);
                                int i5 = i2 + 1;
                                Collections.swap(arrayList, i3, i2);
                                if (!gvh0Var.e().isEmpty()) {
                                    arrayList4.add(new nmr0(lwh0Var2, gvh0Var));
                                } else if (p(lwh0Var2, gvh0Var) != 0 && lwh0Var2 == this.d) {
                                    i2 = i5;
                                    z2 = true;
                                }
                                i2 = i5;
                            }
                        }
                    }
                    it2 = it;
                }
                for (nmr0 nmr0Var : arrayList3) {
                    lwh0 lwh0Var3 = (lwh0) nmr0Var.a;
                    lwh0Var3.h((gvh0) nmr0Var.b);
                    cv40Var.b(257, lwh0Var3);
                }
                boolean z3 = z2;
                for (nmr0 nmr0Var2 : arrayList4) {
                    lwh0 lwh0Var4 = (lwh0) nmr0Var2.a;
                    if (p(lwh0Var4, (gvh0) nmr0Var2.b) != 0 && lwh0Var4 == this.d) {
                        z3 = true;
                    }
                }
                z = z3;
                i = i2;
            }
            for (int size2 = arrayList.size() - 1; size2 >= i; size2--) {
                lwh0 lwh0Var5 = (lwh0) arrayList.get(size2);
                lwh0Var5.h(null);
                arrayList2.remove(lwh0Var5);
            }
            q(z);
            for (int size3 = arrayList.size() - 1; size3 >= i; size3--) {
                cv40Var.b(258, (lwh0) arrayList.remove(size3));
            }
            cv40Var.b(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_INVALID_CONTEXT_SIZE, kwh0Var);
        }
    }

    public final int p(lwh0 lwh0Var, gvh0 gvh0Var) {
        int iH = lwh0Var.h(gvh0Var);
        if (iH != 0) {
            int i = iH & 1;
            cv40 cv40Var = this.a;
            if (i != 0) {
                cv40Var.b(259, lwh0Var);
            }
            if ((iH & 2) != 0) {
                cv40Var.b(260, lwh0Var);
            }
            if ((iH & 4) != 0) {
                cv40Var.b(261, lwh0Var);
            }
        }
        return iH;
    }

    public final void q(boolean z) {
        lwh0 lwh0Var = this.v;
        if (lwh0Var != null && !lwh0Var.e()) {
            Objects.toString(this.v);
            this.v = null;
        }
        lwh0 lwh0Var2 = this.v;
        adt0 adt0Var = this.s;
        ArrayList<lwh0> arrayList = this.i;
        if (lwh0Var2 == null) {
            for (lwh0 lwh0Var3 : arrayList) {
                if (lwh0Var3.b() == adt0Var && lwh0Var3.b.equals("DEFAULT_ROUTE") && lwh0Var3.e()) {
                    this.v = lwh0Var3;
                    Objects.toString(lwh0Var3);
                    break;
                }
            }
        }
        lwh0 lwh0Var4 = this.w;
        if (lwh0Var4 != null && !lwh0Var4.e()) {
            Objects.toString(this.w);
            this.w = null;
        }
        if (this.w == null) {
            for (lwh0 lwh0Var5 : arrayList) {
                if (lwh0Var5.b() == adt0Var && lwh0Var5.l("android.media.intent.category.LIVE_AUDIO") && !lwh0Var5.l("android.media.intent.category.LIVE_VIDEO") && lwh0Var5.e()) {
                    this.w = lwh0Var5;
                    Objects.toString(lwh0Var5);
                    break;
                }
            }
        }
        lwh0 lwh0Var6 = this.d;
        if (lwh0Var6 == null || !lwh0Var6.e()) {
            Objects.toString(this.d);
            l(c(), 1, 3, false);
        } else if (z) {
            j();
            n();
        }
    }
}
