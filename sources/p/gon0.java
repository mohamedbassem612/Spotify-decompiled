package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gon0 {
    public int A;
    public final ArrayList B;
    public final idd1 C;
    public final dt71 D;
    public final Context a;
    public final Activity b;
    public don0 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final n36 g;
    public final bpb1 h;
    public final bpb1 i;
    public final xe01 j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public iac0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public pnn0 f54p;
    public final CopyOnWriteArrayList q;
    public w8c0 r;
    public final rg s;
    public final ydb t;
    public final boolean u;
    public final rzn0 v;
    public final LinkedHashMap w;
    public iu30 x;
    public nnn0 y;
    public final LinkedHashMap z;

    public gon0(Context context) {
        this.a = context;
        for (Object obj : z561.c0(sbn0.Q0, context)) {
            if (((Context) obj) instanceof Activity) {
                this.b = (Activity) obj;
                this.g = new n36();
                z6x z6xVar = z6x.a;
                this.h = gio1.b(z6xVar);
                bpb1 bpb1VarB = gio1.b(z6xVar);
                this.i = bpb1VarB;
                this.j = d5p1.h(bpb1VarB);
                this.k = new LinkedHashMap();
                this.l = new LinkedHashMap();
                this.m = new LinkedHashMap();
                this.n = new LinkedHashMap();
                this.q = new CopyOnWriteArrayList();
                this.r = w8c0.b;
                this.s = new rg(this, (byte) 3);
                this.t = new ydb(this, false, (byte) 16);
                this.u = true;
                rzn0 rzn0Var = new rzn0();
                this.v = rzn0Var;
                this.w = new LinkedHashMap();
                this.z = new LinkedHashMap();
                rzn0Var.a(new fon0(rzn0Var));
                rzn0Var.a(new rg0(this.a));
                this.B = new ArrayList();
                this.C = new idd1(new zem0(this, (byte) 28));
                this.D = mgo1.e(1, 0, 2, 2);
            }
        }
        obj = null;
        this.b = (Activity) obj;
        this.g = new n36();
        z6x z6xVar2 = z6x.a;
        this.h = gio1.b(z6xVar2);
        bpb1 bpb1VarB2 = gio1.b(z6xVar2);
        this.i = bpb1VarB2;
        this.j = d5p1.h(bpb1VarB2);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new CopyOnWriteArrayList();
        this.r = w8c0.b;
        this.s = new rg(this, (byte) 3);
        this.t = new ydb(this, false, (byte) 16);
        this.u = true;
        rzn0 rzn0Var2 = new rzn0();
        this.v = rzn0Var2;
        this.w = new LinkedHashMap();
        this.z = new LinkedHashMap();
        rzn0Var2.a(new fon0(rzn0Var2));
        rzn0Var2.a(new rg0(this.a));
        this.B = new ArrayList();
        this.C = new idd1(new zem0(this, (byte) 28));
        this.D = mgo1.e(1, 0, 2, 2);
    }

    public static vnn0 g(vnn0 vnn0Var, int i, boolean z) {
        don0 don0Var;
        if (vnn0Var.h == i) {
            return vnn0Var;
        }
        if (vnn0Var instanceof don0) {
            don0Var = (don0) vnn0Var;
        } else {
            don0Var = vnn0Var.b;
            don0Var.getClass();
        }
        return don0Var.p(i, don0Var, z);
    }

    public static void s(gon0 gon0Var, jkm1 jkm1Var) {
        gon0Var.getClass();
        Class<?> cls = jkm1Var.getClass();
        jd11 jd11Var = rc11.a;
        int iN = up30.n(wmo1.t(jd11Var.b(cls)));
        don0 don0Var = gon0Var.c;
        String strO = null;
        if (don0Var != null) {
            vnn0 vnn0VarG = g(don0Var, iN, true);
            if (vnn0VarG != null) {
                Map mapU = sqg0.U(vnn0VarG.g);
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapU.size()));
                for (Map.Entry entry : mapU.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((dnn0) entry.getValue()).a);
                }
                strO = up30.o(jkm1Var, linkedHashMap);
            } else {
                bhn0.l("Destination with route ", jd11Var.b(jkm1Var.getClass()).r(), " cannot be found in navigation graph ", gon0Var.c);
            }
        } else {
            eg.m("You must call setGraph() before calling getGraph()");
        }
        gon0Var.q(strO);
    }

    public static /* synthetic */ void w(gon0 gon0Var, hnn0 hnn0Var) {
        gon0Var.v(hnn0Var, false, new n36());
    }

    public final Bundle A() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : sqg0.U(this.v.a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((mzn0) entry.getValue()).h();
            if (bundleH != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleH);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        n36 n36Var = this.g;
        if (!n36Var.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[n36Var.c];
            Iterator it = n36Var.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new jnn0((hnn0) it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = this.m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(str2);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = this.n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                n36 n36Var2 = (n36) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[n36Var2.c];
                int i3 = 0;
                for (Object obj : n36Var2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    parcelableArr2[i3] = (jnn0) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray(l1d.m("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f);
        }
        return bundle;
    }

    public final void B(don0 don0Var) {
        C(don0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, p.don0] */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, p.gon0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, p.don0] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable[], java.lang.Object, p.qon0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void C(don0 don0Var, Bundle bundle) {
        LinkedHashMap linkedHashMap;
        ?? r3;
        Context context;
        LinkedHashMap linkedHashMap2;
        Activity activity;
        Intent intent;
        ?? intArray;
        ?? r6;
        don0 don0VarM;
        tnn0 tnn0VarQ;
        ?? r7;
        ?? r8;
        ?? Y;
        ?? r9;
        ?? r10;
        ?? r2;
        vnn0 vnn0VarP;
        ?? r20;
        don0 don0Var2;
        Bundle bundle2;
        ?? P;
        ?? P2;
        don0 don0Var3;
        don0 don0Var4;
        Bundle bundle3;
        ?? r15;
        ArrayList<String> stringArrayList;
        ina1 ina1Var = don0Var.Y;
        boolean zJ = u890.j(this.c, don0Var);
        n36<hnn0> n36Var = this.g;
        if (zJ) {
            int iG = ina1Var.g();
            for (int i = 0; i < iG; i++) {
                vnn0 vnn0Var = (vnn0) ina1Var.h(i);
                don0 don0Var5 = this.c;
                don0Var5.getClass();
                int iD = don0Var5.Y.d(i);
                don0 don0Var6 = this.c;
                don0Var6.getClass();
                ina1 ina1Var2 = don0Var6.Y;
                if (ina1Var2.a) {
                    dio1.l(ina1Var2);
                }
                int iJ = mp10.j(ina1Var2.d, iD, ina1Var2.b);
                if (iJ >= 0) {
                    Object[] objArr = ina1Var2.c;
                    Object obj = objArr[iJ];
                    objArr[iJ] = vnn0Var;
                }
            }
            for (hnn0 hnn0Var : n36Var) {
                int i2 = vnn0.X;
                wd31 wd31Var = new wd31(z561.k0(z561.c0(sbn0.U0, hnn0Var.b)));
                vnn0 vnn0VarP2 = this.c;
                vnn0VarP2.getClass();
                Iterator it = wd31Var.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((ud31) it).b;
                    if (listIterator.hasPrevious()) {
                        vnn0 vnn0Var2 = (vnn0) listIterator.previous();
                        if (!u890.j(vnn0Var2, this.c) || !vnn0VarP2.equals(don0Var)) {
                            if (vnn0VarP2 instanceof don0) {
                                don0 don0Var7 = (don0) vnn0VarP2;
                                vnn0VarP2 = don0Var7.p(vnn0Var2.h, don0Var7, false);
                                vnn0VarP2.getClass();
                            }
                        }
                    }
                }
                hnn0Var.b = vnn0VarP2;
            }
            return;
        }
        don0 don0Var8 = this.c;
        LinkedHashMap linkedHashMap3 = this.w;
        ?? r11 = 1;
        Bundle bundle4 = null;
        if (don0Var8 != null) {
            Iterator it2 = new ArrayList(this.m.keySet()).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                Iterator it3 = linkedHashMap3.values().iterator();
                while (it3.hasNext()) {
                    ((mnn0) it3.next()).d = true;
                }
                Bundle bundle5 = bundle4;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                boolean z = z(iIntValue, bundle5, new qon0(false, true, -1, false, false, -1, -1, -1, -1));
                Iterator it4 = linkedHashMap4.values().iterator();
                while (it4.hasNext()) {
                    ((mnn0) it4.next()).d = false;
                }
                if (z) {
                    u(iIntValue, true, false);
                }
                bundle4 = bundle5;
                linkedHashMap3 = linkedHashMap4;
            }
            linkedHashMap = linkedHashMap3;
            r3 = bundle4;
            u(don0Var8.h, true, false);
        } else {
            linkedHashMap = linkedHashMap3;
            r3 = 0;
        }
        this.c = don0Var;
        Bundle bundle6 = this.d;
        rzn0 rzn0Var = this.v;
        if (bundle6 != null && (stringArrayList = bundle6.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                mzn0 mzn0VarB = rzn0Var.b(str);
                Bundle bundle7 = bundle6.getBundle(str);
                if (bundle7 != null) {
                    mzn0VarB.g(bundle7);
                }
            }
        }
        Parcelable[] parcelableArr = this.e;
        Context context2 = this.a;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i3 = 0;
            while (i3 < length) {
                jnn0 jnn0Var = (jnn0) parcelableArr[i3];
                int i4 = jnn0Var.b;
                int i5 = i3;
                vnn0 vnn0VarF = f(i4);
                if (vnn0VarF == null) {
                    int i6 = vnn0.X;
                    bhn0.h(i(), l1d.t("Restoring the Navigation back stack failed: destination ", oon1.y(context2, i4), " cannot be found from the current destination "));
                    return;
                }
                w8c0 w8c0VarJ = j();
                pnn0 pnn0Var = this.f54p;
                Bundle bundle8 = jnn0Var.c;
                if (bundle8 != null) {
                    bundle8.setClassLoader(context2.getClassLoader());
                    r15 = bundle8;
                } else {
                    r15 = r3;
                }
                int i7 = length;
                hnn0 hnn0Var2 = new hnn0(context2, vnn0VarF, (Bundle) r15, w8c0VarJ, pnn0Var, jnn0Var.a, jnn0Var.d);
                Context context3 = context2;
                mzn0 mzn0VarB2 = rzn0Var.b(vnn0VarF.a);
                LinkedHashMap linkedHashMap5 = linkedHashMap;
                Object mnn0Var = linkedHashMap5.get(mzn0VarB2);
                if (mnn0Var == null) {
                    mnn0Var = new mnn0(this, mzn0VarB2);
                    linkedHashMap5.put(mzn0VarB2, mnn0Var);
                }
                n36Var.addLast(hnn0Var2);
                ((mnn0) mnn0Var).a(hnn0Var2);
                don0 don0Var9 = hnn0Var2.b.b;
                if (don0Var9 != null) {
                    o(hnn0Var2, h(don0Var9.h));
                }
                linkedHashMap = linkedHashMap5;
                context2 = context3;
                length = i7;
                i3 = i5 + 1;
            }
            context = context2;
            linkedHashMap2 = linkedHashMap;
            H();
            this.e = r3;
        } else {
            context = context2;
            linkedHashMap2 = linkedHashMap;
        }
        Collection collectionValues = sqg0.U(rzn0Var.a).values();
        ArrayList<mzn0> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((mzn0) obj2).b) {
                arrayList.add(obj2);
            }
        }
        for (mzn0 mzn0Var : arrayList) {
            Object mnn0Var2 = linkedHashMap2.get(mzn0Var);
            if (mnn0Var2 == null) {
                mnn0Var2 = new mnn0(this, mzn0Var);
                linkedHashMap2.put(mzn0Var, mnn0Var2);
            }
            mzn0Var.e((mnn0) mnn0Var2);
        }
        if (this.c == null || !n36Var.isEmpty()) {
            e();
            return;
        }
        if (!this.f && (activity = this.b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception unused) {
                    intent.toString();
                    intArray = r3;
                }
            } else {
                intArray = r3;
            }
            ?? parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : r3;
            ?? bundle9 = new Bundle();
            if (extras != null) {
                bundle3 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
            } else {
                r6 = r3;
            }
            if (r6 != 0) {
                r6 = bundle3;
                bundle9.putAll(r6);
            }
            if ((intArray == 0 || intArray.length == 0) && (tnn0VarQ = (don0VarM = m(n36Var)).q(new kqi0(intent), true, don0VarM)) != null) {
                vnn0 vnn0Var3 = tnn0VarQ.a;
                n36 n36Var2 = new n36();
                vnn0 vnn0Var4 = vnn0Var3;
                while (true) {
                    don0 don0Var10 = vnn0Var4.b;
                    if (don0Var10 == null || don0Var10.Z != vnn0Var4.h) {
                        n36Var2.addFirst(vnn0Var4);
                    }
                    if (u890.j(don0Var10, (Object) r3) || don0Var10 == null) {
                        break;
                    } else {
                        vnn0Var4 = don0Var10;
                    }
                }
                List listL1 = o7h.l1(n36Var2);
                ArrayList arrayList2 = new ArrayList(q7h.U(listL1, 10));
                Iterator it5 = listL1.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(Integer.valueOf(((vnn0) it5.next()).h));
                }
                int[] iArrK1 = o7h.k1(arrayList2);
                Bundle bundleC = vnn0Var3.c(tnn0VarQ.b);
                if (bundleC != null) {
                    bundle9.putAll(bundleC);
                }
                r7 = iArrK1;
                r8 = r3;
            } else {
                r7 = intArray;
                r8 = parcelableArrayList;
            }
            if (r7 != 0 && r7.length != 0) {
                don0 don0Var11 = this.c;
                int length2 = r7.length;
                ?? r12 = don0Var11;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        Y = r3;
                        break;
                    }
                    ?? r13 = r7[i8];
                    if (i8 == 0) {
                        don0 don0Var12 = this.c;
                        don0Var12.getClass();
                        if (don0Var12.h == r13) {
                            don0Var4 = this.c;
                        } else {
                            P = r3;
                        }
                    } else {
                        r12.getClass();
                        P = r12.p(r13, r12, false);
                    }
                    if (P == 0) {
                        P = don0Var4;
                        int i9 = vnn0.X;
                        Y = oon1.y(context, (int) r13);
                        break;
                    }
                    if (i8 == r7.length - 1) {
                        P = don0Var4;
                    } else if (P instanceof don0) {
                        while (true) {
                            P = don0Var4;
                            P2 = P;
                            don0Var3 = (don0) P2;
                            don0Var3.getClass();
                            if (!(don0Var3.p(don0Var3.Z, don0Var3, false) instanceof don0)) {
                                break;
                            } else {
                                P2 = don0Var3.p(don0Var3.Z, don0Var3, false);
                            }
                        }
                        r12 = don0Var3;
                    } else {
                        P = don0Var4;
                        P2 = P;
                    }
                    i8++;
                    r12 = r12;
                }
                if (Y == 0) {
                    bundle9.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length3 = r7.length;
                    ?? r14 = new Bundle[length3];
                    for (int i10 = 0; i10 < length3; i10++) {
                        ?? bundle10 = new Bundle();
                        bundle10.putAll(bundle9);
                        if (r8 != 0 && (bundle2 = (Bundle) r8.get(i10)) != null) {
                            bundle10.putAll(bundle2);
                        }
                        r14[i10] = bundle10;
                    }
                    int flags = intent.getFlags();
                    int i11 = 268435456 & flags;
                    if (i11 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        rya1 rya1Var = new rya1(context);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(((Context) rya1Var.c).getPackageManager());
                        }
                        if (component != null) {
                            rya1Var.b(component);
                        }
                        ((ArrayList) rya1Var.b).add(intent);
                        rya1Var.e();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i11 != 0) {
                        if (!n36Var.isEmpty()) {
                            don0 don0Var13 = this.c;
                            don0Var13.getClass();
                            u(don0Var13.h, true, false);
                        }
                        int i12 = 0;
                        while (i12 < r7.length) {
                            ?? r4 = r7[i12];
                            int i13 = i12 + 1;
                            ?? r5 = r14[i12];
                            vnn0 vnn0VarF2 = f(r4);
                            if (vnn0VarF2 == null) {
                                int i14 = vnn0.X;
                                bhn0.h(i(), l1d.t("Deep Linking failed: destination ", oon1.y(context, (int) r4), " cannot be found from the current destination "));
                                return;
                            }
                            j9n0 j9n0Var = new j9n0(vnn0VarF2, (Object) this, (byte) 6);
                            ron0 ron0Var = new ron0();
                            j9n0Var.invoke(ron0Var);
                            pon0 pon0Var = ron0Var.a;
                            pon0Var.a = false;
                            pon0Var.b = false;
                            int i15 = ron0Var.b;
                            boolean z2 = ron0Var.c;
                            pon0Var.c = i15;
                            pon0Var.d = false;
                            pon0Var.e = z2;
                            r(vnn0VarF2, r5, pon0Var.a());
                            i12 = i13;
                        }
                        this.f = true;
                        return;
                    }
                    don0 don0Var14 = this.c;
                    int length4 = r7.length;
                    int i16 = 0;
                    while (i16 < length4) {
                        ?? r16 = r10[i16];
                        ?? r17 = r9[i16];
                        if (i16 == 0) {
                            vnn0VarP = this.c;
                        } else {
                            r2.getClass();
                            vnn0VarP = r2.p(r16, r2, false);
                        }
                        if (vnn0VarP == null) {
                            r2 = don0Var14;
                            r10 = r7;
                            r9 = r14;
                            r2 = don0Var14;
                            r10 = r7;
                            r9 = r14;
                            int i17 = vnn0.X;
                            ncn0.f("Deep Linking failed: destination ", oon1.y(context, (int) r16), " cannot be found in graph ", r2);
                            return;
                        }
                        r2 = don0Var14;
                        r10 = r7;
                        r9 = r14;
                        if (i16 == r10.length - r11) {
                            r2 = don0Var14;
                            r10 = r7;
                            r9 = r14;
                            don0 don0Var15 = this.c;
                            don0Var15.getClass();
                            r20 = r10;
                            r(vnn0VarP, r17, new qon0(false, false, don0Var15.h, true, false, 0, 0, -1, -1));
                        } else if (vnn0VarP instanceof don0) {
                            while (true) {
                                r2 = don0Var14;
                                r10 = r7;
                                r9 = r14;
                                don0Var2 = (don0) vnn0VarP;
                                don0Var2.getClass();
                                if (!(don0Var2.p(don0Var2.Z, don0Var2, false) instanceof don0)) {
                                    break;
                                } else {
                                    vnn0VarP = don0Var2.p(don0Var2.Z, don0Var2, false);
                                }
                            }
                            r20 = r10;
                            r2 = don0Var2;
                        } else {
                            r2 = don0Var14;
                            r10 = r7;
                            r9 = r14;
                            r20 = r10;
                        }
                        i16++;
                        length4 = length4;
                        r9 = r9;
                        r10 = r20;
                        r11 = 1;
                        r2 = r2;
                    }
                    r2 = don0Var14;
                    r10 = r7;
                    r9 = r14;
                    this.f = r11;
                    return;
                }
                intent.toString();
            }
        }
        don0 don0Var16 = this.c;
        don0Var16.getClass();
        r(don0Var16, bundle, r3);
    }

    public final void D(iac0 iac0Var) {
        x8c0 lifecycle;
        if (iac0Var.equals(this.o)) {
            return;
        }
        iac0 iac0Var2 = this.o;
        rg rgVar = this.s;
        if (iac0Var2 != null && (lifecycle = iac0Var2.getLifecycle()) != null) {
            lifecycle.d(rgVar);
        }
        this.o = iac0Var;
        iac0Var.getLifecycle().a(rgVar);
    }

    public final void E(rck1 rck1Var) {
        pnn0 pnn0Var = this.f54p;
        csn csnVar = csn.b;
        gzs gzsVar = pnn0.c;
        hce1 hce1Var = new hce1(rck1Var, gzsVar, csnVar);
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB = jd11Var.b(pnn0.class);
        String strO = tka0VarB.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            return;
        }
        if (u890.j(pnn0Var, (pnn0) hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB))) {
            return;
        }
        if (!this.g.isEmpty()) {
            eg.m("ViewModelStore should be set before setGraph call");
            return;
        }
        hce1 hce1Var2 = new hce1(rck1Var, gzsVar, csnVar);
        tka0 tka0VarB2 = jd11Var.b(pnn0.class);
        String strO2 = tka0VarB2.o();
        if (strO2 != null) {
            this.f54p = (pnn0) hce1Var2.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO2), tka0VarB2);
        } else {
            hhg1.n("Local and anonymous classes can not be ViewModels");
        }
    }

    public final void F(hnn0 hnn0Var) {
        hnn0 hnn0Var2 = (hnn0) this.k.remove(hnn0Var);
        if (hnn0Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(hnn0Var2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            mnn0 mnn0Var = (mnn0) this.w.get(this.v.b(hnn0Var2.b.a));
            if (mnn0Var != null) {
                mnn0Var.c(hnn0Var2);
            }
            linkedHashMap.remove(hnn0Var2);
        }
    }

    public final void G() {
        AtomicInteger atomicInteger;
        Set set;
        ArrayList<hnn0> arrayList = new ArrayList((Collection) this.g);
        if (arrayList.isEmpty()) {
            return;
        }
        vnn0 vnn0Var = ((hnn0) o7h.A0(arrayList)).b;
        ArrayList arrayList2 = new ArrayList();
        if (vnn0Var instanceof kr20) {
            Iterator it = o7h.T0(arrayList).iterator();
            while (it.hasNext()) {
                vnn0 vnn0Var2 = ((hnn0) it.next()).b;
                arrayList2.add(vnn0Var2);
                if (!(vnn0Var2 instanceof kr20) && !(vnn0Var2 instanceof don0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (hnn0 hnn0Var : o7h.T0(arrayList)) {
            w8c0 w8c0Var = hnn0Var.Y;
            vnn0 vnn0Var3 = hnn0Var.b;
            w8c0 w8c0Var2 = w8c0.e;
            w8c0 w8c0Var3 = w8c0.d;
            if (vnn0Var != null && vnn0Var3.h == vnn0Var.h) {
                if (w8c0Var != w8c0Var2) {
                    mnn0 mnn0Var = (mnn0) this.w.get(this.v.b(vnn0Var3.a));
                    if (u890.j((mnn0Var == null || (set = (Set) mnn0Var.f.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(hnn0Var)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.l.get(hnn0Var)) != null && atomicInteger.get() == 0)) {
                        map.put(hnn0Var, w8c0Var3);
                    } else {
                        map.put(hnn0Var, w8c0Var2);
                    }
                }
                vnn0 vnn0Var4 = (vnn0) o7h.s0(arrayList2);
                if (vnn0Var4 != null && vnn0Var4.h == vnn0Var3.h) {
                    r7h.b0(arrayList2);
                }
                vnn0Var = vnn0Var.b;
            } else if (arrayList2.isEmpty() || vnn0Var3.h != ((vnn0) o7h.q0(arrayList2)).h) {
                hnn0Var.b(w8c0.c);
            } else {
                vnn0 vnn0Var5 = (vnn0) r7h.b0(arrayList2);
                if (w8c0Var == w8c0Var2) {
                    hnn0Var.b(w8c0Var3);
                } else if (w8c0Var != w8c0Var3) {
                    map.put(hnn0Var, w8c0Var3);
                }
                don0 don0Var = vnn0Var5.b;
                if (don0Var != null && !arrayList2.contains(don0Var)) {
                    arrayList2.add(don0Var);
                }
            }
        }
        for (hnn0 hnn0Var2 : arrayList) {
            w8c0 w8c0Var4 = (w8c0) map.get(hnn0Var2);
            if (w8c0Var4 != null) {
                hnn0Var2.b(w8c0Var4);
            } else {
                hnn0Var2.c();
            }
        }
    }

    public final void H() {
        int i;
        boolean z = false;
        if (this.u) {
            n36 n36Var = this.g;
            if (n36Var == null || !n36Var.isEmpty()) {
                Iterator it = n36Var.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((hnn0) it.next()).b instanceof don0) && (i = i + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            }
        }
        this.t.f(z);
    }

    public final void c(vnn0 vnn0Var, Bundle bundle, hnn0 hnn0Var, List list) {
        Bundle bundle2;
        hnn0 hnn0Var2;
        don0 don0Var;
        Object objPrevious;
        Object objPrevious2;
        vnn0 vnn0Var2 = hnn0Var.b;
        boolean z = vnn0Var2 instanceof kr20;
        n36 n36Var = this.g;
        if (!z) {
            while (!n36Var.isEmpty() && (((hnn0) n36Var.last()).b instanceof kr20) && u(((hnn0) n36Var.last()).b.h, true, false)) {
            }
        }
        n36<hnn0> n36Var2 = new n36();
        Object obj = null;
        if (vnn0Var instanceof don0) {
            vnn0 vnn0Var3 = vnn0Var2;
            while (true) {
                vnn0Var3.getClass();
                don0 don0Var2 = vnn0Var3.b;
                if (don0Var2 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!u890.j(((hnn0) objPrevious2).b, don0Var2));
                    hnn0 hnn0Var3 = (hnn0) objPrevious2;
                    if (hnn0Var3 == null) {
                        bundle2 = bundle;
                        hnn0Var3 = new hnn0(this.a, don0Var2, bundle2, j(), this.f54p, UUID.randomUUID().toString(), (Bundle) null);
                    } else {
                        bundle2 = bundle;
                    }
                    n36Var2.addFirst(hnn0Var3);
                    if (!n36Var.isEmpty() && ((hnn0) n36Var.last()).b == don0Var2) {
                        w(this, (hnn0) n36Var.last());
                    }
                } else {
                    bundle2 = bundle;
                }
                if (don0Var2 == null || don0Var2 == vnn0Var) {
                    break;
                } else {
                    vnn0Var3 = don0Var2;
                }
            }
        } else {
            bundle2 = bundle;
        }
        vnn0 vnn0Var4 = n36Var2.isEmpty() ? vnn0Var2 : ((hnn0) n36Var2.first()).b;
        while (vnn0Var4 != null && f(vnn0Var4.h) != vnn0Var4) {
            don0 don0Var3 = vnn0Var4.b;
            if (don0Var3 != null) {
                Bundle bundle3 = (bundle2 == null || !bundle2.isEmpty()) ? bundle2 : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!u890.j(((hnn0) objPrevious).b, don0Var3));
                hnn0 hnn0Var4 = (hnn0) objPrevious;
                if (hnn0Var4 == null) {
                    don0Var = don0Var3;
                    hnn0Var4 = new hnn0(this.a, don0Var, don0Var3.c(bundle3), j(), this.f54p, UUID.randomUUID().toString(), (Bundle) null);
                } else {
                    don0Var = don0Var3;
                }
                n36Var2.addFirst(hnn0Var4);
            } else {
                don0Var = don0Var3;
            }
            vnn0Var4 = don0Var;
        }
        if (!n36Var2.isEmpty()) {
            vnn0Var2 = ((hnn0) n36Var2.first()).b;
        }
        while (!n36Var.isEmpty() && (((hnn0) n36Var.last()).b instanceof don0) && dio1.r(((don0) ((hnn0) n36Var.last()).b).Y, vnn0Var2.h) == null) {
            w(this, (hnn0) n36Var.last());
        }
        hnn0 hnn0Var5 = (hnn0) n36Var.f();
        if (hnn0Var5 == null) {
            hnn0Var5 = (hnn0) n36Var2.f();
        }
        if (!u890.j(hnn0Var5 != null ? hnn0Var5.b : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                vnn0 vnn0Var5 = ((hnn0) objPrevious3).b;
                don0 don0Var4 = this.c;
                don0Var4.getClass();
                if (u890.j(vnn0Var5, don0Var4)) {
                    obj = objPrevious3;
                    break;
                }
            }
            hnn0 hnn0Var6 = (hnn0) obj;
            if (hnn0Var6 == null) {
                don0 don0Var5 = this.c;
                don0Var5.getClass();
                don0 don0Var6 = this.c;
                don0Var6.getClass();
                hnn0Var2 = new hnn0(this.a, don0Var5, don0Var6.c(bundle2), j(), this.f54p, UUID.randomUUID().toString(), (Bundle) null);
            } else {
                hnn0Var2 = hnn0Var6;
            }
            n36Var2.addFirst(hnn0Var2);
        }
        for (hnn0 hnn0Var7 : n36Var2) {
            Object obj2 = this.w.get(this.v.b(hnn0Var7.b.a));
            if (obj2 == null) {
                bhn0.f(l1d.n(vnn0Var.a, " should already be created", new StringBuilder("NavigatorBackStack for ")));
                return;
            }
            ((mnn0) obj2).a(hnn0Var7);
        }
        n36Var.addAll(n36Var2);
        n36Var.addLast(hnn0Var);
        for (hnn0 hnn0Var8 : o7h.O0(hnn0Var, n36Var2)) {
            don0 don0Var7 = hnn0Var8.b.b;
            if (don0Var7 != null) {
                o(hnn0Var8, h(don0Var7.h));
            }
        }
    }

    public final boolean e() {
        n36 n36Var;
        while (true) {
            n36Var = this.g;
            if (n36Var.isEmpty() || !(((hnn0) n36Var.last()).b instanceof don0)) {
                break;
            }
            w(this, (hnn0) n36Var.last());
        }
        hnn0 hnn0Var = (hnn0) n36Var.k();
        ArrayList arrayList = this.B;
        if (hnn0Var != null) {
            arrayList.add(hnn0Var);
        }
        this.A++;
        G();
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            ArrayList<hnn0> arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            for (hnn0 hnn0Var2 : arrayList2) {
                for (ds3 ds3Var : this.q) {
                    vnn0 vnn0Var = hnn0Var2.b;
                    hnn0Var2.a();
                    ds3Var.a(vnn0Var);
                }
                this.D.a(hnn0Var2);
            }
            ArrayList arrayList3 = new ArrayList((Collection) n36Var);
            bpb1 bpb1Var = this.h;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, arrayList3);
            ArrayList arrayListX = x();
            bpb1 bpb1Var2 = this.i;
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, arrayListX);
        }
        return hnn0Var != null;
    }

    public final vnn0 f(int i) {
        vnn0 vnn0Var;
        don0 don0Var = this.c;
        if (don0Var == null) {
            return null;
        }
        if (don0Var.h == i) {
            return don0Var;
        }
        hnn0 hnn0Var = (hnn0) this.g.k();
        if (hnn0Var == null || (vnn0Var = hnn0Var.b) == null) {
            vnn0Var = this.c;
            vnn0Var.getClass();
        }
        return g(vnn0Var, i, false);
    }

    public final hnn0 h(int i) {
        Object objPrevious;
        n36 n36Var = this.g;
        ListIterator listIterator = n36Var.listIterator(n36Var.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((hnn0) objPrevious).b.h != i);
        hnn0 hnn0Var = (hnn0) objPrevious;
        if (hnn0Var != null) {
            return hnn0Var;
        }
        StringBuilder sbR = cy30.r(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbR.append(i());
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final vnn0 i() {
        hnn0 hnn0Var = (hnn0) this.g.k();
        if (hnn0Var != null) {
            return hnn0Var.b;
        }
        return null;
    }

    public final w8c0 j() {
        return this.o == null ? w8c0.c : this.r;
    }

    public final rzn0 k() {
        return this.v;
    }

    public final hnn0 l() {
        Object next;
        Iterator it = o7h.T0(this.g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = z561.Q(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((hnn0) next).b instanceof don0)) {
                return (hnn0) next;
            }
        }
        next = null;
        return (hnn0) next;
    }

    public final don0 m(n36 n36Var) {
        vnn0 vnn0Var;
        hnn0 hnn0Var = (hnn0) n36Var.k();
        if (hnn0Var == null || (vnn0Var = hnn0Var.b) == null) {
            vnn0Var = this.c;
            vnn0Var.getClass();
        }
        if (vnn0Var instanceof don0) {
            return (don0) vnn0Var;
        }
        don0 don0Var = vnn0Var.b;
        don0Var.getClass();
        return don0Var;
    }

    public final xe01 n() {
        return this.j;
    }

    public final void o(hnn0 hnn0Var, hnn0 hnn0Var2) {
        this.k.put(hnn0Var, hnn0Var2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(hnn0Var2) == null) {
            linkedHashMap.put(hnn0Var2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(hnn0Var2);
        obj.getClass();
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void p(int i, Bundle bundle, qon0 qon0Var) {
        int i2;
        n36 n36Var = this.g;
        vnn0 vnn0Var = n36Var.isEmpty() ? this.c : ((hnn0) n36Var.last()).b;
        if (vnn0Var == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        bnn0 bnn0VarD = vnn0Var.d(i);
        Bundle bundle2 = null;
        if (bnn0VarD != null) {
            if (qon0Var == null) {
                qon0Var = bnn0VarD.b;
            }
            i2 = bnn0VarD.a;
            Bundle bundle3 = bnn0VarD.c;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
        } else {
            i2 = i;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i2 == 0 && qon0Var != null) {
            boolean z = qon0Var.d;
            int i3 = qon0Var.c;
            if (i3 != -1) {
                if (i3 == -1 || !u(i3, z, false)) {
                    return;
                }
                e();
                return;
            }
        }
        if (i2 == 0) {
            hhg1.n("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        vnn0 vnn0VarF = f(i2);
        if (vnn0VarF != null) {
            r(vnn0VarF, bundle2, qon0Var);
            return;
        }
        int i4 = vnn0.X;
        Context context = this.a;
        String strY = oon1.y(context, i2);
        if (bnn0VarD == null) {
            hhg1.i("Navigation action/destination ", strY, " cannot be found from the current destination ", vnn0Var);
            return;
        }
        StringBuilder sbT = l1d.t("Navigation destination ", strY, " referenced from action ");
        sbT.append(oon1.y(context, i));
        sbT.append(" cannot be found from the current destination ");
        sbT.append(vnn0Var);
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public final void q(String str) {
        if (this.c == null) {
            k220.l("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        don0 don0VarM = m(this.g);
        tnn0 tnn0VarR = don0VarM.r(str, true, don0VarM);
        if (tnn0VarR == null) {
            q58.i(this.c, l1d.t("Navigation destination that matches route ", str, " cannot be found in the navigation graph "));
            return;
        }
        vnn0 vnn0Var = tnn0VarR.a;
        Bundle bundleC = vnn0Var.c(tnn0VarR.b);
        if (bundleC == null) {
            bundleC = new Bundle();
        }
        Intent intent = new Intent();
        int i = vnn0.X;
        String str2 = vnn0Var.i;
        intent.setDataAndType(Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : ""), null);
        intent.setAction(null);
        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        r(vnn0Var, bundleC, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[LOOP:4: B:50:0x00fc->B:52:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173 A[LOOP:6: B:61:0x016d->B:63:0x0173, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0165 A[SYNTHETIC] */
    public final void r(vnn0 vnn0Var, Bundle bundle, qon0 qon0Var) {
        boolean zU;
        rzn0 rzn0Var;
        l811 l811Var;
        boolean z;
        int iNextIndex;
        vnn0 vnn0Var2;
        n36<hnn0> n36Var;
        don0 don0Var;
        LinkedHashMap linkedHashMap = this.w;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((mnn0) it.next()).d = true;
        }
        l811 l811Var2 = new l811();
        if (qon0Var != null) {
            boolean z2 = qon0Var.e;
            boolean z3 = qon0Var.d;
            int i = qon0Var.c;
            if (i != -1) {
                zU = u(i, z3, z2);
            } else {
                zU = false;
            }
        } else {
            zU = false;
        }
        Bundle bundleC = vnn0Var.c(bundle);
        if (qon0Var == null || !qon0Var.b) {
            rzn0Var = this.v;
            if (qon0Var == null && qon0Var.a) {
                n36 n36Var2 = this.g;
                hnn0 hnn0Var = (hnn0) n36Var2.k();
                ListIterator listIterator = n36Var2.listIterator(n36Var2.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((hnn0) listIterator.previous()).b == vnn0Var) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    l811Var = l811Var2;
                    z = false;
                } else if (vnn0Var instanceof don0) {
                    int i2 = don0.P0;
                    List listK0 = z561.k0(new sgg1(sbn0.T0, z561.c0(sbn0.V0, (don0) vnn0Var)));
                    if (n36Var2.c - iNextIndex == listK0.size()) {
                        List listSubList = n36Var2.subList(iNextIndex, n36Var2.c);
                        ArrayList arrayList = new ArrayList(q7h.U(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((hnn0) it2.next()).b.h));
                        }
                        if (arrayList.equals(listK0)) {
                            n36Var = new n36();
                            while (p7h.L(n36Var2) >= iNextIndex) {
                                hnn0 hnn0Var2 = (hnn0) r7h.d0(n36Var2);
                                F(hnn0Var2);
                                hnn0 hnn0Var3 = new hnn0(hnn0Var2.a, hnn0Var2.b, hnn0Var2.b.c(bundle), hnn0Var2.d, hnn0Var2.e, hnn0Var2.f, hnn0Var2.g);
                                hnn0Var3.d = hnn0Var2.d;
                                hnn0Var3.b(hnn0Var2.Y);
                                n36Var.addFirst(hnn0Var3);
                                l811Var2 = l811Var2;
                            }
                            l811Var = l811Var2;
                            for (hnn0 hnn0Var4 : n36Var) {
                                don0Var = hnn0Var4.b.b;
                                if (don0Var != null) {
                                    o(hnn0Var4, h(don0Var.h));
                                }
                                n36Var2.addLast(hnn0Var4);
                            }
                            for (hnn0 hnn0Var5 : n36Var) {
                                rzn0Var.b(hnn0Var5.b.a).f(hnn0Var5);
                            }
                            z = true;
                        }
                    }
                    l811Var = l811Var2;
                    z = false;
                } else if (hnn0Var == null || (vnn0Var2 = hnn0Var.b) == null || vnn0Var.h != vnn0Var2.h) {
                    l811Var = l811Var2;
                    z = false;
                } else {
                    n36Var = new n36();
                    while (p7h.L(n36Var2) >= iNextIndex) {
                        hnn0 hnn0Var6 = (hnn0) r7h.d0(n36Var2);
                        F(hnn0Var6);
                        hnn0 hnn0Var7 = new hnn0(hnn0Var6.a, hnn0Var6.b, hnn0Var6.b.c(bundle), hnn0Var6.d, hnn0Var6.e, hnn0Var6.f, hnn0Var6.g);
                        hnn0Var7.d = hnn0Var6.d;
                        hnn0Var7.b(hnn0Var6.Y);
                        n36Var.addFirst(hnn0Var7);
                        l811Var2 = l811Var2;
                    }
                    l811Var = l811Var2;
                    while (r1.hasNext()) {
                        don0Var = hnn0Var4.b.b;
                        if (don0Var != null) {
                            o(hnn0Var4, h(don0Var.h));
                        }
                        n36Var2.addLast(hnn0Var4);
                    }
                    while (r0.hasNext()) {
                        rzn0Var.b(hnn0Var5.b.a).f(hnn0Var5);
                    }
                    z = true;
                }
            } else {
                l811Var = l811Var2;
                z = false;
            }
            if (z) {
                l811Var2 = l811Var;
            } else {
                hnn0 hnn0Var8 = new hnn0(this.a, vnn0Var, bundleC, j(), this.f54p, UUID.randomUUID().toString(), (Bundle) null);
                mzn0 mzn0VarB = rzn0Var.b(vnn0Var.a);
                List listSingletonList = Collections.singletonList(hnn0Var8);
                l811Var2 = l811Var;
                this.x = new o4u(l811Var2, this, vnn0Var, bundleC, (byte) 4);
                mzn0VarB.d(listSingletonList, qon0Var);
                this.x = null;
            }
        } else if (this.m.containsKey(Integer.valueOf(vnn0Var.h))) {
            l811Var2.a = z(vnn0Var.h, bundleC, qon0Var);
            z = false;
        } else {
            rzn0Var = this.v;
            if (qon0Var == null) {
                l811Var = l811Var2;
                z = false;
            } else {
                l811Var = l811Var2;
                z = false;
            }
            if (z) {
                hnn0 hnn0Var9 = new hnn0(this.a, vnn0Var, bundleC, j(), this.f54p, UUID.randomUUID().toString(), (Bundle) null);
                mzn0 mzn0VarB2 = rzn0Var.b(vnn0Var.a);
                List listSingletonList2 = Collections.singletonList(hnn0Var9);
                l811Var2 = l811Var;
                this.x = new o4u(l811Var2, this, vnn0Var, bundleC, (byte) 4);
                mzn0VarB2.d(listSingletonList2, qon0Var);
                this.x = null;
            } else {
                l811Var2 = l811Var;
            }
        }
        H();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((mnn0) it3.next()).d = false;
        }
        if (zU || l811Var2.a || z) {
            e();
        } else {
            G();
        }
    }

    public final boolean t() {
        if (this.g.isEmpty()) {
            return false;
        }
        vnn0 vnn0VarI = i();
        vnn0VarI.getClass();
        return u(vnn0VarI.h, true, false) && e();
    }

    public final boolean u(int i, boolean z, boolean z2) {
        vnn0 vnn0Var;
        gon0 gon0Var;
        boolean z3;
        n36 n36Var = this.g;
        byte b = 0;
        if (n36Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = o7h.T0(n36Var).iterator();
        do {
            if (!it.hasNext()) {
                vnn0Var = null;
                break;
            }
            vnn0Var = ((hnn0) it.next()).b;
            mzn0 mzn0VarB = this.v.b(vnn0Var.a);
            if (z || vnn0Var.h != i) {
                arrayList.add(mzn0VarB);
            }
        } while (vnn0Var.h != i);
        if (vnn0Var == null) {
            int i2 = vnn0.X;
            oon1.y(this.a, i);
            return false;
        }
        l811 l811Var = new l811();
        n36 n36Var2 = new n36();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                gon0Var = this;
                z3 = z2;
                break;
            }
            mzn0 mzn0Var = (mzn0) it2.next();
            l811 l811Var2 = new l811();
            hnn0 hnn0Var = (hnn0) n36Var.last();
            gon0Var = this;
            z3 = z2;
            gon0Var.y = new nnn0(l811Var2, l811Var, gon0Var, z3, n36Var2);
            mzn0Var.i(hnn0Var, z3);
            gon0Var.y = null;
            if (!l811Var2.a) {
                break;
            }
            this = gon0Var;
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = gon0Var.m;
            if (!z) {
                y9v y9vVar = new y9v(new rlu(z561.c0(sbn0.R0, vnn0Var), new onn0(gon0Var, b), (byte) 2), (byte) 0);
                while (y9vVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((vnn0) y9vVar.next()).h);
                    jnn0 jnn0Var = (jnn0) n36Var2.f();
                    linkedHashMap.put(numValueOf, jnn0Var != null ? jnn0Var.a : null);
                }
            }
            if (!n36Var2.isEmpty()) {
                jnn0 jnn0Var2 = (jnn0) n36Var2.first();
                int i3 = jnn0Var2.b;
                String str = jnn0Var2.a;
                y9v y9vVar2 = new y9v(new rlu(z561.c0(sbn0.S0, gon0Var.f(i3)), new onn0(gon0Var, (byte) 1), (byte) 2), (byte) 0);
                while (y9vVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((vnn0) y9vVar2.next()).h), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    gon0Var.n.put(str, n36Var2);
                }
            }
        }
        gon0Var.H();
        return l811Var.a;
    }

    public final void v(hnn0 hnn0Var, boolean z, n36 n36Var) {
        pnn0 pnn0Var;
        Set set;
        n36 n36Var2 = this.g;
        hnn0 hnn0Var2 = (hnn0) n36Var2.last();
        if (!u890.j(hnn0Var2, hnn0Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(hnn0Var.b);
            vnn0 vnn0Var = hnn0Var2.b;
            sb.append(", which is not the top of the back stack (");
            sb.append(vnn0Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        r7h.d0(n36Var2);
        mnn0 mnn0Var = (mnn0) this.w.get(this.v.b(hnn0Var2.b.a));
        boolean z2 = true;
        if ((mnn0Var == null || (set = (Set) mnn0Var.f.a.getValue()) == null || !set.contains(hnn0Var2)) && !this.l.containsKey(hnn0Var2)) {
            z2 = false;
        }
        w8c0 w8c0Var = hnn0Var2.h.i;
        w8c0 w8c0Var2 = w8c0.c;
        if (w8c0Var.a(w8c0Var2)) {
            if (z) {
                hnn0Var2.b(w8c0Var2);
                n36Var.addFirst(new jnn0(hnn0Var2));
            }
            if (z2) {
                hnn0Var2.b(w8c0Var2);
            } else {
                hnn0Var2.b(w8c0.a);
                F(hnn0Var2);
            }
        }
        if (z || z2 || (pnn0Var = this.f54p) == null) {
            return;
        }
        rck1 rck1Var = (rck1) pnn0Var.b.remove(hnn0Var2.f);
        if (rck1Var != null) {
            rck1Var.a();
        }
    }

    public final ArrayList x() {
        w8c0 w8c0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            w8c0Var = w8c0.d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((mnn0) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                hnn0 hnn0Var = (hnn0) obj;
                if (!arrayList.contains(hnn0Var) && !hnn0Var.Y.a(w8c0Var)) {
                    arrayList2.add(obj);
                }
            }
            r7h.W(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.g) {
            hnn0 hnn0Var2 = (hnn0) obj2;
            if (!arrayList.contains(hnn0Var2) && hnn0Var2.Y.a(w8c0Var)) {
                arrayList3.add(obj2);
            }
        }
        r7h.W(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((hnn0) obj3).b instanceof don0)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.a.getClassLoader());
        this.d = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.e = bundle.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = this.n;
        linkedHashMap.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.m.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    n36 n36Var = new n36(parcelableArray.length);
                    int i3 = 0;
                    while (i3 < parcelableArray.length) {
                        int i4 = i3 + 1;
                        try {
                            n36Var.addLast((jnn0) parcelableArray[i3]);
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            bhn0.t(e.getMessage());
                            return;
                        }
                    }
                    linkedHashMap.put(str, n36Var);
                }
            }
        }
        this.f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public final boolean z(int i, Bundle bundle, qon0 qon0Var) {
        vnn0 vnn0Var;
        hnn0 hnn0Var;
        vnn0 vnn0Var2;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        r7h.Z(linkedHashMap.values(), new fki0(str, (byte) 21), true);
        n36<jnn0> n36Var = (n36) w0h1.k(this.n).remove(str);
        ArrayList arrayList = new ArrayList();
        hnn0 hnn0Var2 = (hnn0) this.g.k();
        if ((hnn0Var2 == null || (vnn0Var = hnn0Var2.b) == null) && (vnn0Var = this.c) == null) {
            eg.m("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (n36Var != null) {
            for (jnn0 jnn0Var : n36Var) {
                vnn0 vnn0VarG = g(vnn0Var, jnn0Var.b, true);
                Context context = this.a;
                if (vnn0VarG == null) {
                    int i2 = vnn0.X;
                    ncn0.j("Restore State failed: destination ", oon1.y(context, jnn0Var.b), " cannot be found from the current destination ", vnn0Var);
                    return false;
                }
                w8c0 w8c0VarJ = j();
                pnn0 pnn0Var = this.f54p;
                Bundle bundle3 = jnn0Var.c;
                if (bundle3 != null) {
                    bundle3.setClassLoader(context.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new hnn0(context, vnn0VarG, bundle2, w8c0VarJ, pnn0Var, jnn0Var.a, jnn0Var.d));
                vnn0Var = vnn0VarG;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<hnn0> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((hnn0) obj).b instanceof don0)) {
                arrayList3.add(obj);
            }
        }
        for (hnn0 hnn0Var3 : arrayList3) {
            List list = (List) o7h.C0(arrayList2);
            if (u890.j((list == null || (hnn0Var = (hnn0) o7h.A0(list)) == null || (vnn0Var2 = hnn0Var.b) == null) ? null : vnn0Var2.a, hnn0Var3.b.a)) {
                list.add(hnn0Var3);
            } else {
                arrayList2.add(p7h.O(new hnn0[]{hnn0Var3}));
            }
        }
        l811 l811Var = new l811();
        for (List list2 : arrayList2) {
            mzn0 mzn0VarB = this.v.b(((hnn0) o7h.q0(list2)).b.a);
            this.x = new aw40(l811Var, arrayList, new n811(), this, bundle, (byte) 1);
            mzn0VarB.d(list2, qon0Var);
            this.x = null;
        }
        return l811Var.a;
    }
}
