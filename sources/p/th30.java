package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class th30 {
    public zf30 A;
    public rh0 E;
    public rh0 F;
    public rh0 G;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ArrayList P;
    public di30 Q;
    public boolean b;
    public ArrayList e;
    public r1q0 g;
    public final gh30 r;
    public final gh30 s;
    public final gh30 t;
    public final gh30 u;
    public tg30 x;
    public jch0 y;
    public zf30 z;
    public final ArrayList a = new ArrayList();
    public final zsc c = new zsc((byte) 10);
    public ArrayList d = new ArrayList();
    public final bh30 f = new bh30(this);
    public nu9 h = null;
    public boolean i = false;
    public final hh30 j = new hh30(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dh30 f116p = new dh30(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final ih30 v = new ih30(this);
    public int w = -1;
    public rg30 B = null;
    public final jh30 C = new jh30(this);
    public final q3c D = new q3c();
    public ArrayDeque H = new ArrayDeque();
    public final a6n R = new a6n(this, (byte) 24);

    /* JADX WARN: Type inference failed for: r1v13, types: [p.gh30] */
    /* JADX WARN: Type inference failed for: r1v14, types: [p.gh30] */
    /* JADX WARN: Type inference failed for: r1v15, types: [p.gh30] */
    /* JADX WARN: Type inference failed for: r1v16, types: [p.gh30] */
    public th30() {
        final byte b = 0;
        this.r = new dkl(this) { // from class: p.gh30
            public final /* synthetic */ th30 b;

            {
                this.b = this;
            }

            @Override // p.dkl
            public final void accept(Object obj) {
                byte b2 = b;
                th30 th30Var = this.b;
                switch (b2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (th30Var.R()) {
                            th30Var.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (th30Var.R() && num.intValue() == 80) {
                            th30Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ewm0 ewm0Var = (ewm0) obj;
                        if (th30Var.R()) {
                            ewm0Var.getClass();
                            th30Var.o(false);
                        }
                        break;
                    default:
                        xxs0 xxs0Var = (xxs0) obj;
                        if (th30Var.R()) {
                            xxs0Var.getClass();
                            th30Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.s = new dkl(this) { // from class: p.gh30
            public final /* synthetic */ th30 b;

            {
                this.b = this;
            }

            @Override // p.dkl
            public final void accept(Object obj) {
                byte b3 = b2;
                th30 th30Var = this.b;
                switch (b3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (th30Var.R()) {
                            th30Var.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (th30Var.R() && num.intValue() == 80) {
                            th30Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ewm0 ewm0Var = (ewm0) obj;
                        if (th30Var.R()) {
                            ewm0Var.getClass();
                            th30Var.o(false);
                        }
                        break;
                    default:
                        xxs0 xxs0Var = (xxs0) obj;
                        if (th30Var.R()) {
                            xxs0Var.getClass();
                            th30Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.t = new dkl(this) { // from class: p.gh30
            public final /* synthetic */ th30 b;

            {
                this.b = this;
            }

            @Override // p.dkl
            public final void accept(Object obj) {
                byte b4 = b3;
                th30 th30Var = this.b;
                switch (b4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (th30Var.R()) {
                            th30Var.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (th30Var.R() && num.intValue() == 80) {
                            th30Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ewm0 ewm0Var = (ewm0) obj;
                        if (th30Var.R()) {
                            ewm0Var.getClass();
                            th30Var.o(false);
                        }
                        break;
                    default:
                        xxs0 xxs0Var = (xxs0) obj;
                        if (th30Var.R()) {
                            xxs0Var.getClass();
                            th30Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.u = new dkl(this) { // from class: p.gh30
            public final /* synthetic */ th30 b;

            {
                this.b = this;
            }

            @Override // p.dkl
            public final void accept(Object obj) {
                byte b5 = b4;
                th30 th30Var = this.b;
                switch (b5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (th30Var.R()) {
                            th30Var.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (th30Var.R() && num.intValue() == 80) {
                            th30Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ewm0 ewm0Var = (ewm0) obj;
                        if (th30Var.R()) {
                            ewm0Var.getClass();
                            th30Var.o(false);
                        }
                        break;
                    default:
                        xxs0 xxs0Var = (xxs0) obj;
                        if (th30Var.R()) {
                            xxs0Var.getClass();
                            th30Var.t(false);
                        }
                        break;
                }
            }
        };
    }

    public static th30 H(View view) {
        dg30 dg30Var;
        zf30 zf30VarI = I(view);
        if (zf30VarI != null) {
            if (zf30VarI.q0()) {
                return zf30VarI.g0();
            }
            tw20.v("The Fragment ", zf30VarI, " that owns View ", view, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            return null;
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                dg30Var = null;
                break;
            }
            if (context instanceof dg30) {
                dg30Var = (dg30) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (dg30Var != null) {
            return dg30Var.e0();
        }
        bhn0.u("View ", view, " is not within a subclass of FragmentActivity.");
        return null;
    }

    public static zf30 I(View view) {
        while (view != null) {
            Object tag = view.getTag(2131428955);
            zf30 zf30Var = tag instanceof zf30 ? (zf30) tag : null;
            if (zf30Var != null) {
                return zf30Var;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet K(nu9 nu9Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < nu9Var.c.size(); i++) {
            zf30 zf30Var = ((wi30) nu9Var.c.get(i)).b;
            if (zf30Var != null && nu9Var.i) {
                hashSet.add(zf30Var);
            }
        }
        return hashSet;
    }

    public static boolean P(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean Q(zf30 zf30Var) {
        if (zf30Var.f1 && zf30Var.g1) {
            return true;
        }
        boolean zQ = false;
        for (zf30 zf30Var2 : zf30Var.W0.c.p()) {
            if (zf30Var2 != null) {
                zQ = Q(zf30Var2);
            }
            if (zQ) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(zf30 zf30Var) {
        if (zf30Var == null) {
            return true;
        }
        if (zf30Var.g1) {
            return zf30Var.U0 == null || S(zf30Var.X0);
        }
        return false;
    }

    public static boolean T(zf30 zf30Var) {
        if (zf30Var == null) {
            return true;
        }
        th30 th30Var = zf30Var.U0;
        return zf30Var == th30Var.A && T(th30Var.z);
    }

    public final boolean A(boolean z) {
        boolean zA;
        ArrayList arrayList;
        nu9 nu9Var;
        z(z);
        if (!this.i && (nu9Var = this.h) != null) {
            nu9Var.u = false;
            nu9Var.e();
            if (P(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.g(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.c.iterator();
            while (it.hasNext()) {
                zf30 zf30Var = ((wi30) it.next()).b;
                if (zf30Var != null) {
                    zf30Var.Z = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.N;
            ArrayList arrayList3 = this.O;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((ph30) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.x.f.removeCallbacks(this.R);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.x.f.removeCallbacks(this.R);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                c0(this.N, this.O);
                e();
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        p0();
        if (this.M) {
            this.M = false;
            n0();
        }
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void B(nu9 nu9Var, boolean z) {
        if (z && (this.x == null || this.L)) {
            return;
        }
        z(z);
        nu9 nu9Var2 = this.h;
        if (nu9Var2 != null) {
            nu9Var2.u = false;
            nu9Var2.e();
            if (P(3)) {
                Objects.toString(this.h);
                Objects.toString(nu9Var);
            }
            this.h.g(false, false);
            this.h.a(this.N, this.O);
            Iterator it = this.h.c.iterator();
            while (it.hasNext()) {
                zf30 zf30Var = ((wi30) it.next()).b;
                if (zf30Var != null) {
                    zf30Var.Z = false;
                }
            }
            this.h = null;
        }
        nu9Var.a(this.N, this.O);
        this.b = true;
        try {
            c0(this.N, this.O);
            e();
            p0();
            if (this.M) {
                this.M = false;
                n0();
            }
            ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0241 A[PHI: r15
      0x0241: PHI (r15v23 int) = (r15v21 int), (r15v25 int) binds: [B:105:0x022e, B:109:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    public final void C(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5 = i;
        zsc zscVar = this.c;
        ArrayList arrayList4 = this.o;
        boolean z3 = ((nu9) arrayList.get(i5)).r;
        ArrayList arrayList5 = this.P;
        if (arrayList5 == null) {
            this.P = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.P.addAll(zscVar.u());
        zf30 zf30Var = this.A;
        int i6 = i5;
        boolean z4 = false;
        while (i6 < i2) {
            nu9 nu9Var = (nu9) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.P;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z3;
                i3 = i6;
                z2 = z4;
                int i7 = 1;
                ArrayList arrayList7 = nu9Var.c;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    wi30 wi30Var = (wi30) arrayList7.get(size);
                    int i8 = wi30Var.a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(wi30Var.b);
                                    break;
                                case 8:
                                    zf30Var = null;
                                    break;
                                case 9:
                                    zf30Var = wi30Var.b;
                                    break;
                                case 10:
                                    wi30Var.i = wi30Var.h;
                                    break;
                            }
                        } else {
                            arrayList6.add(wi30Var.b);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(wi30Var.b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = nu9Var.c;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    wi30 wi30Var2 = (wi30) arrayList8.get(i9);
                    boolean z5 = z3;
                    int i10 = wi30Var2.a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                z4 = z4;
                                arrayList6.remove(wi30Var2.b);
                                zf30 zf30Var2 = wi30Var2.b;
                                if (zf30Var2 == zf30Var) {
                                    arrayList8.add(i9, new wi30(9, zf30Var2));
                                    i9++;
                                    zf30Var = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 != 8) {
                                z4 = z4;
                            } else {
                                z4 = z4;
                                arrayList8.add(i9, new wi30(9, zf30Var, 0));
                                wi30Var2.c = true;
                                i9++;
                                zf30Var = wi30Var2.b;
                            }
                            i12 = 1;
                        } else {
                            z4 = z4;
                            zf30 zf30Var3 = wi30Var2.b;
                            int i13 = zf30Var3.Z0;
                            int size2 = arrayList6.size() - 1;
                            boolean z6 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                zf30 zf30Var4 = (zf30) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (zf30Var4.Z0 != i13) {
                                    i13 = i13;
                                } else if (zf30Var4 == zf30Var3) {
                                    i13 = i13;
                                    z6 = true;
                                } else {
                                    if (zf30Var4 == zf30Var) {
                                        arrayList8.add(i9, new wi30(9, zf30Var4, 0));
                                        i9++;
                                        i4 = 0;
                                        zf30Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    wi30 wi30Var3 = new wi30(3, zf30Var4, i4);
                                    wi30Var3.d = wi30Var2.d;
                                    wi30Var3.f = wi30Var2.f;
                                    wi30Var3.e = wi30Var2.e;
                                    wi30Var3.g = wi30Var2.g;
                                    arrayList8.add(i9, wi30Var3);
                                    arrayList6.remove(zf30Var4);
                                    i9++;
                                    zf30Var = zf30Var;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z6) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                wi30Var2.a = 1;
                                wi30Var2.c = true;
                                arrayList6.add(zf30Var3);
                            }
                        }
                        i9 += i12;
                        z3 = z5;
                        i6 = i11;
                        z4 = z4;
                        arrayList4 = arrayList4;
                    }
                    arrayList6.add(wi30Var2.b);
                    i9 += i12;
                    z3 = z5;
                    i6 = i11;
                    z4 = z4;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z3;
                i3 = i6;
                z2 = z4;
            }
            z4 = z2 || nu9Var.i;
            i6 = i3 + 1;
            z3 = z;
            arrayList4 = arrayList3;
        }
        ArrayList<oh30> arrayList10 = arrayList4;
        boolean z7 = z3;
        boolean z8 = z4;
        this.P.clear();
        if (!z7 && this.w >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((nu9) arrayList.get(i15)).c.iterator();
                while (it.hasNext()) {
                    zf30 zf30Var5 = ((wi30) it.next()).b;
                    if (zf30Var5 != null && zf30Var5.U0 != null) {
                        zscVar.z(h(zf30Var5));
                    }
                }
            }
        }
        int i16 = i5;
        while (i16 < i2) {
            nu9 nu9Var2 = (nu9) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                nu9Var2.d(-1);
                th30 th30Var = nu9Var2.t;
                ArrayList arrayList11 = nu9Var2.c;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    wi30 wi30Var4 = (wi30) arrayList11.get(size3);
                    zf30 zf30Var6 = wi30Var4.b;
                    if (zf30Var6 != null) {
                        zf30Var6.N0 = nu9Var2.w;
                        if (zf30Var6.m1 != null) {
                            zf30Var6.e0().a = true;
                        }
                        int i17 = nu9Var2.h;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (zf30Var6.m1 != null || i18 != 0) {
                            zf30Var6.e0();
                            zf30Var6.m1.f = i18;
                        }
                        ArrayList arrayList12 = nu9Var2.q;
                        ArrayList arrayList13 = nu9Var2.f83p;
                        zf30Var6.e0();
                        vf30 vf30Var = zf30Var6.m1;
                        vf30Var.g = arrayList12;
                        vf30Var.h = arrayList13;
                    }
                    switch (wi30Var4.a) {
                        case 1:
                            zf30Var6.S0(wi30Var4.d, wi30Var4.e, wi30Var4.f, wi30Var4.g);
                            th30Var.h0(zf30Var6, true);
                            th30Var.b0(zf30Var6);
                            break;
                        case 2:
                        default:
                            bhn0.e(wi30Var4.a, "Unknown cmd: ");
                            return;
                        case 3:
                            zf30Var6.S0(wi30Var4.d, wi30Var4.e, wi30Var4.f, wi30Var4.g);
                            th30Var.a(zf30Var6);
                            break;
                        case 4:
                            zf30Var6.S0(wi30Var4.d, wi30Var4.e, wi30Var4.f, wi30Var4.g);
                            th30Var.getClass();
                            if (P(2)) {
                                Objects.toString(zf30Var6);
                            }
                            if (zf30Var6.b1) {
                                zf30Var6.b1 = false;
                                zf30Var6.n1 = !zf30Var6.n1;
                            }
                            break;
                        case 5:
                            zf30Var6.S0(wi30Var4.d, wi30Var4.e, wi30Var4.f, wi30Var4.g);
                            th30Var.h0(zf30Var6, true);
                            if (P(2)) {
                                Objects.toString(zf30Var6);
                            }
                            if (!zf30Var6.b1) {
                                zf30Var6.b1 = true;
                                zf30Var6.n1 = !zf30Var6.n1;
                                th30Var.m0(zf30Var6);
                            }
                            break;
                        case 6:
                            zf30Var6.S0(wi30Var4.d, wi30Var4.e, wi30Var4.f, wi30Var4.g);
                            th30Var.c(zf30Var6);
                            break;
                        case 7:
                            zf30Var6.S0(wi30Var4.d, wi30Var4.e, wi30Var4.f, wi30Var4.g);
                            th30Var.h0(zf30Var6, true);
                            th30Var.i(zf30Var6);
                            break;
                        case 8:
                            th30Var.l0(null);
                            break;
                        case 9:
                            th30Var.l0(zf30Var6);
                            break;
                        case 10:
                            wi30Var4.i = zf30Var6.r1;
                            th30Var.k0(zf30Var6, wi30Var4.h);
                            break;
                    }
                }
            } else {
                nu9Var2.d(1);
                th30 th30Var2 = nu9Var2.t;
                ArrayList arrayList14 = nu9Var2.c;
                int size4 = arrayList14.size();
                int i20 = 0;
                while (i20 < size4) {
                    wi30 wi30Var5 = (wi30) arrayList14.get(i20);
                    zf30 zf30Var7 = wi30Var5.b;
                    if (zf30Var7 != null) {
                        zf30Var7.N0 = nu9Var2.w;
                        if (zf30Var7.m1 != null) {
                            zf30Var7.e0().a = false;
                        }
                        int i21 = nu9Var2.h;
                        if (zf30Var7.m1 != null || i21 != 0) {
                            zf30Var7.e0();
                            zf30Var7.m1.f = i21;
                        }
                        ArrayList arrayList15 = nu9Var2.f83p;
                        ArrayList arrayList16 = nu9Var2.q;
                        zf30Var7.e0();
                        vf30 vf30Var2 = zf30Var7.m1;
                        vf30Var2.g = arrayList15;
                        vf30Var2.h = arrayList16;
                    }
                    switch (wi30Var5.a) {
                        case 1:
                            zf30Var7.S0(wi30Var5.d, wi30Var5.e, wi30Var5.f, wi30Var5.g);
                            th30Var2.h0(zf30Var7, false);
                            th30Var2.a(zf30Var7);
                            break;
                        case 2:
                        default:
                            bhn0.e(wi30Var5.a, "Unknown cmd: ");
                            return;
                        case 3:
                            zf30Var7.S0(wi30Var5.d, wi30Var5.e, wi30Var5.f, wi30Var5.g);
                            th30Var2.b0(zf30Var7);
                            break;
                        case 4:
                            zf30Var7.S0(wi30Var5.d, wi30Var5.e, wi30Var5.f, wi30Var5.g);
                            th30Var2.getClass();
                            if (P(2)) {
                                Objects.toString(zf30Var7);
                            }
                            if (!zf30Var7.b1) {
                                zf30Var7.b1 = true;
                                zf30Var7.n1 = !zf30Var7.n1;
                                th30Var2.m0(zf30Var7);
                            }
                            break;
                        case 5:
                            zf30Var7.S0(wi30Var5.d, wi30Var5.e, wi30Var5.f, wi30Var5.g);
                            th30Var2.h0(zf30Var7, false);
                            if (P(2)) {
                                Objects.toString(zf30Var7);
                            }
                            if (zf30Var7.b1) {
                                zf30Var7.b1 = false;
                                zf30Var7.n1 = !zf30Var7.n1;
                            }
                            break;
                        case 6:
                            zf30Var7.S0(wi30Var5.d, wi30Var5.e, wi30Var5.f, wi30Var5.g);
                            th30Var2.i(zf30Var7);
                            break;
                        case 7:
                            zf30Var7.S0(wi30Var5.d, wi30Var5.e, wi30Var5.f, wi30Var5.g);
                            th30Var2.h0(zf30Var7, false);
                            th30Var2.c(zf30Var7);
                            break;
                        case 8:
                            th30Var2.l0(zf30Var7);
                            break;
                        case 9:
                            th30Var2.l0(null);
                            break;
                        case 10:
                            wi30Var5.h = zf30Var7.r1;
                            th30Var2.k0(zf30Var7, wi30Var5.i);
                            break;
                    }
                    i20++;
                    i16 = i16;
                }
            }
            i16++;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z8 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(K((nu9) it2.next()));
            }
            if (this.h == null) {
                for (oh30 oh30Var : arrayList10) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        oh30Var.b((zf30) it3.next(), zBooleanValue2);
                    }
                }
                for (oh30 oh30Var2 : arrayList10) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        oh30Var2.a((zf30) it4.next(), zBooleanValue2);
                    }
                }
            }
        }
        for (int i22 = i5; i22 < i2; i22++) {
            nu9 nu9Var3 = (nu9) arrayList.get(i22);
            if (zBooleanValue2) {
                for (int size5 = nu9Var3.c.size() - 1; size5 >= 0; size5--) {
                    zf30 zf30Var8 = ((wi30) nu9Var3.c.get(size5)).b;
                    if (zf30Var8 != null) {
                        h(zf30Var8).k();
                    }
                }
            } else {
                Iterator it5 = nu9Var3.c.iterator();
                while (it5.hasNext()) {
                    zf30 zf30Var9 = ((wi30) it5.next()).b;
                    if (zf30Var9 != null) {
                        h(zf30Var9).k();
                    }
                }
            }
        }
        V(this.w, true);
        for (kss kssVar : g(arrayList, i5, i2)) {
            kssVar.e = zBooleanValue2;
            synchronized (kssVar.b) {
                try {
                    kssVar.l();
                    ArrayList arrayList17 = kssVar.b;
                    ListIterator listIterator = arrayList17.listIterator(arrayList17.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            foa1 foa1Var = (foa1) objPrevious;
                            int iE = w6d1.e(foa1Var.c.j1);
                            if (foa1Var.a != 2 || iE == 2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    kssVar.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            kssVar.e();
        }
        while (i5 < i2) {
            nu9 nu9Var4 = (nu9) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && nu9Var4.v >= 0) {
                nu9Var4.v = -1;
            }
            if (nu9Var4.s != null) {
                for (int i23 = 0; i23 < nu9Var4.s.size(); i23++) {
                    ((Runnable) nu9Var4.s.get(i23)).run();
                }
                nu9Var4.s = null;
            }
            i5++;
        }
        if (z8) {
            for (int i24 = 0; i24 < arrayList10.size(); i24++) {
                ((oh30) arrayList10.get(i24)).onBackStackChanged();
            }
        }
    }

    public final void D() {
        A(true);
        J();
    }

    public final int E(String str, int i, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            nu9 nu9Var = (nu9) this.d.get(size);
            if ((str != null && str.equals(nu9Var.k)) || (i >= 0 && i == nu9Var.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            nu9 nu9Var2 = (nu9) this.d.get(size - 1);
            if ((str == null || !str.equals(nu9Var2.k)) && (i < 0 || i != nu9Var2.v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final zf30 F(int i) {
        zsc zscVar = this.c;
        ArrayList arrayList = (ArrayList) zscVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zf30 zf30Var = (zf30) arrayList.get(size);
            if (zf30Var != null && zf30Var.Y0 == i) {
                return zf30Var;
            }
        }
        for (si30 si30Var : ((HashMap) zscVar.c).values()) {
            if (si30Var != null) {
                zf30 zf30Var2 = si30Var.c;
                if (zf30Var2.Y0 == i) {
                    return zf30Var2;
                }
            }
        }
        return null;
    }

    public final zf30 G(String str) {
        zsc zscVar = this.c;
        ArrayList arrayList = (ArrayList) zscVar.b;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                zf30 zf30Var = (zf30) arrayList.get(size);
                if (zf30Var != null && str.equals(zf30Var.a1)) {
                    return zf30Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (si30 si30Var : ((HashMap) zscVar.c).values()) {
            if (si30Var != null) {
                zf30 zf30Var2 = si30Var.c;
                if (str.equals(zf30Var2.a1)) {
                    return zf30Var2;
                }
            }
        }
        return null;
    }

    public final void J() {
        for (kss kssVar : f()) {
            if (kssVar.f) {
                P(2);
                kssVar.f = false;
                kssVar.e();
            }
        }
    }

    public final int L() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final ViewGroup M(zf30 zf30Var) {
        ViewGroup viewGroup = zf30Var.i1;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (zf30Var.Z0 <= 0 || !this.y.O()) {
            return null;
        }
        View viewN = this.y.N(zf30Var.Z0);
        if (viewN instanceof ViewGroup) {
            return (ViewGroup) viewN;
        }
        return null;
    }

    public final rg30 N() {
        rg30 rg30Var = this.B;
        if (rg30Var != null) {
            return rg30Var;
        }
        zf30 zf30Var = this.z;
        return zf30Var != null ? zf30Var.U0.N() : this.C;
    }

    public final q3c O() {
        zf30 zf30Var = this.z;
        return zf30Var != null ? zf30Var.U0.O() : this.D;
    }

    public final boolean R() {
        zf30 zf30Var = this.z;
        if (zf30Var == null) {
            return true;
        }
        return zf30Var.q0() && this.z.j0().R();
    }

    public final boolean U() {
        return this.J || this.K;
    }

    public final void V(int i, boolean z) {
        tg30 tg30Var;
        if (this.x == null && i != -1) {
            eg.m("No activity");
            return;
        }
        if (z || i != this.w) {
            this.w = i;
            zsc zscVar = this.c;
            HashMap map = (HashMap) zscVar.c;
            Iterator it = ((ArrayList) zscVar.b).iterator();
            while (it.hasNext()) {
                si30 si30Var = (si30) map.get(((zf30) it.next()).e);
                if (si30Var != null) {
                    si30Var.k();
                }
            }
            for (si30 si30Var2 : map.values()) {
                if (si30Var2 != null) {
                    si30Var2.k();
                    zf30 zf30Var = si30Var2.c;
                    if (zf30Var.Y && !zf30Var.s0()) {
                        if (zf30Var.N0 && !((HashMap) zscVar.d).containsKey(zf30Var.e)) {
                            zscVar.H(si30Var2.o(), zf30Var.e);
                        }
                        zscVar.A(si30Var2);
                    }
                }
            }
            n0();
            if (this.I && (tg30Var = this.x) != null && this.w == 7) {
                tg30Var.o0();
                this.I = false;
            }
        }
    }

    public final void W() {
        if (this.x == null) {
            return;
        }
        this.J = false;
        this.K = false;
        this.Q.g = false;
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null) {
                zf30Var.W0.W();
            }
        }
    }

    public final void X(FragmentContainerView fragmentContainerView) {
        View view;
        for (si30 si30Var : this.c.o()) {
            zf30 zf30Var = si30Var.c;
            if (zf30Var.Z0 == fragmentContainerView.getId() && (view = zf30Var.j1) != null && view.getParent() == null) {
                zf30Var.i1 = fragmentContainerView;
                si30Var.b();
                si30Var.k();
            }
        }
    }

    public final boolean Y() {
        return Z(-1, 0);
    }

    public final boolean Z(int i, int i2) {
        A(false);
        z(true);
        zf30 zf30Var = this.A;
        if (zf30Var != null && i < 0 && zf30Var.g0().Y()) {
            return true;
        }
        boolean zA0 = a0(this.N, this.O, null, i, i2);
        if (zA0) {
            this.b = true;
            try {
                c0(this.N, this.O);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        p0();
        if (this.M) {
            this.M = false;
            n0();
        }
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return zA0;
    }

    public final si30 a(zf30 zf30Var) {
        String str = zf30Var.q1;
        if (str != null) {
            vi30.c(str, zf30Var);
        }
        if (P(2)) {
            zf30Var.toString();
        }
        si30 si30VarH = h(zf30Var);
        zf30Var.U0 = this;
        zsc zscVar = this.c;
        zscVar.z(si30VarH);
        if (!zf30Var.c1) {
            zscVar.a(zf30Var);
            zf30Var.Y = false;
            if (zf30Var.j1 == null) {
                zf30Var.n1 = false;
            }
            if (Q(zf30Var)) {
                this.I = true;
            }
        }
        return si30VarH;
    }

    public final boolean a0(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iE = E(str, i, (i2 & 1) != 0);
        if (iE < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iE; size--) {
            arrayList.add((nu9) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(tg30 tg30Var, jch0 jch0Var, zf30 zf30Var) {
        di30 di30Var;
        String strN;
        iac0 iac0Var;
        if (this.x != null) {
            eg.m("Already attached");
            return;
        }
        this.x = tg30Var;
        this.y = jch0Var;
        this.z = zf30Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (zf30Var != null) {
            copyOnWriteArrayList.add(new lh30(zf30Var));
        } else if (tg30Var instanceof li30) {
            copyOnWriteArrayList.add((li30) tg30Var);
        }
        if (this.z != null) {
            p0();
        }
        if (tg30Var instanceof s1q0) {
            s1q0 s1q0Var = (s1q0) tg30Var;
            r1q0 r1q0VarJ = s1q0Var.J();
            this.g = r1q0VarJ;
            if (zf30Var != null) {
                iac0Var = s1q0Var;
                iac0Var = zf30Var;
            }
            iac0Var = s1q0Var;
            r1q0VarJ.a(iac0Var, this.j);
        }
        if (zf30Var != null) {
            di30 di30Var2 = zf30Var.U0.Q;
            HashMap map = di30Var2.c;
            di30Var = (di30) map.get(zf30Var.e);
            if (di30Var == null) {
                di30Var = new di30(di30Var2.e);
                map.put(zf30Var.e, di30Var);
            }
            this.Q = di30Var;
        } else if (tg30Var instanceof sck1) {
            di30Var = (di30) new hck1(((sck1) tg30Var).o(), di30.h).a(di30.class);
            this.Q = di30Var;
        } else {
            di30Var = new di30(false);
            this.Q = di30Var;
        }
        di30Var.g = U();
        this.c.e = this.Q;
        jch0 jch0Var2 = this.x;
        if ((jch0Var2 instanceof qe41) && zf30Var == null) {
            oe41 oe41VarP = ((qe41) jch0Var2).p();
            oe41VarP.c("android:support:fragments", new xzh((ai30) this, (byte) 1));
            Bundle bundleA = oe41VarP.a("android:support:fragments");
            if (bundleA != null) {
                d0(bundleA);
            }
        }
        jch0 jch0Var3 = this.x;
        if (jch0Var3 instanceof vh0) {
            sh0 sh0VarM = ((vh0) jch0Var3).m();
            if (zf30Var != null) {
                strN = l1d.n(zf30Var.e, ":", new StringBuilder());
            } else {
                strN = "";
            }
            String strConcat = "FragmentManager:".concat(strN);
            ai30 ai30Var = (ai30) this;
            this.E = sh0VarM.h(strConcat.concat("StartActivityForResult"), new e1r0((byte) 5), new xi8(ai30Var, (byte) 1));
            this.F = sh0VarM.h(strConcat.concat("StartIntentSenderForResult"), new e1r0((byte) 9), new fh30(ai30Var, (byte) 1));
            this.G = sh0VarM.h(strConcat.concat("RequestPermissions"), new e1r0((byte) 3), new fh30(ai30Var, (byte) 0));
        }
        jch0 jch0Var4 = this.x;
        if (jch0Var4 instanceof j2q0) {
            ((j2q0) jch0Var4).Z(this.r);
        }
        jch0 jch0Var5 = this.x;
        if (jch0Var5 instanceof taq0) {
            ((taq0) jch0Var5).Y(this.s);
        }
        jch0 jch0Var6 = this.x;
        if (jch0Var6 instanceof q5q0) {
            ((q5q0) jch0Var6).V(this.t);
        }
        jch0 jch0Var7 = this.x;
        if (jch0Var7 instanceof s5q0) {
            ((s5q0) jch0Var7).C(this.u);
        }
        jch0 jch0Var8 = this.x;
        if ((jch0Var8 instanceof psi0) && zf30Var == null) {
            ((psi0) jch0Var8).G(this.v);
        }
    }

    public final void b0(zf30 zf30Var) {
        if (P(2)) {
            Objects.toString(zf30Var);
        }
        boolean zS0 = zf30Var.s0();
        if (zf30Var.c1 && zS0) {
            return;
        }
        zsc zscVar = this.c;
        synchronized (((ArrayList) zscVar.b)) {
            ((ArrayList) zscVar.b).remove(zf30Var);
        }
        zf30Var.X = false;
        if (Q(zf30Var)) {
            this.I = true;
        }
        zf30Var.Y = true;
        m0(zf30Var);
    }

    public final void c(zf30 zf30Var) {
        if (P(2)) {
            Objects.toString(zf30Var);
        }
        if (zf30Var.c1) {
            zf30Var.c1 = false;
            if (zf30Var.X) {
                return;
            }
            this.c.a(zf30Var);
            if (P(2)) {
                zf30Var.toString();
            }
            if (Q(zf30Var)) {
                this.I = true;
            }
        }
    }

    public final void c0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            eg.m("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((nu9) arrayList.get(i)).r) {
                if (i2 != i) {
                    C(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((nu9) arrayList.get(i2)).r) {
                        i2++;
                    }
                }
                C(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            C(arrayList, arrayList2, i2, size);
        }
    }

    public final void d() {
        if (P(3)) {
            Objects.toString(this.h);
        }
        nu9 nu9Var = this.h;
        if (nu9Var != null) {
            nu9Var.u = false;
            nu9Var.e();
            nu9 nu9Var2 = this.h;
            fss fssVar = new fss(this, (byte) 25);
            ArrayList arrayList = nu9Var2.s;
            if (arrayList == null) {
                arrayList = new ArrayList();
                nu9Var2.s = arrayList;
            }
            arrayList.add(fssVar);
            this.h.f();
            this.i = true;
            D();
            this.i = false;
            this.h = null;
        }
    }

    public final void d0(Parcelable parcelable) {
        dh30 dh30Var;
        si30 si30Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.x.e.getClassLoader());
                this.m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.x.e.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        zsc zscVar = this.c;
        HashMap map2 = (HashMap) zscVar.d;
        HashMap map3 = (HashMap) zscVar.c;
        map2.clear();
        map2.putAll(map);
        bi30 parcelable2 = bundle3.getParcelable("state");
        if (parcelable2 == null) {
            return;
        }
        map3.clear();
        Iterator it = parcelable2.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dh30Var = this.f116p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleH = zscVar.H(null, (String) it.next());
            if (bundleH != null) {
                zf30 zf30Var = (zf30) this.Q.b.get(bundleH.getParcelable("state").b);
                if (zf30Var != null) {
                    if (P(2)) {
                        zf30Var.toString();
                    }
                    si30Var = new si30(dh30Var, zscVar, zf30Var, bundleH);
                } else {
                    si30Var = new si30(this.f116p, this.c, this.x.e.getClassLoader(), N(), bundleH);
                }
                zf30 zf30Var2 = si30Var.c;
                zf30Var2.b = bundleH;
                zf30Var2.U0 = this;
                if (P(2)) {
                    zf30Var2.toString();
                }
                si30Var.m(this.x.e.getClassLoader());
                zscVar.z(si30Var);
                si30Var.e = this.w;
            }
        }
        di30 di30Var = this.Q;
        di30Var.getClass();
        for (zf30 zf30Var3 : new ArrayList(di30Var.b.values())) {
            if (map3.get(zf30Var3.e) == null) {
                if (P(2)) {
                    zf30Var3.toString();
                    Objects.toString(parcelable2.a);
                }
                this.Q.W(zf30Var3);
                zf30Var3.U0 = this;
                si30 si30Var2 = new si30(dh30Var, zscVar, zf30Var3);
                si30Var2.e = 1;
                si30Var2.k();
                zf30Var3.Y = true;
                si30Var2.k();
            }
        }
        ArrayList<String> arrayList = parcelable2.b;
        ((ArrayList) zscVar.b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                zf30 zf30VarM = zscVar.m(str3);
                if (zf30VarM == null) {
                    eg.m(f4i1.f("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (P(2)) {
                        zf30VarM.toString();
                    }
                    zscVar.a(zf30VarM);
                }
            }
        }
        if (parcelable2.c != null) {
            this.d = new ArrayList(parcelable2.c.length);
            int i = 0;
            while (true) {
                ou9[] ou9VarArr = parcelable2.c;
                if (i >= ou9VarArr.length) {
                    break;
                }
                nu9 nu9VarB = ou9VarArr[i].b(this);
                if (P(2)) {
                    nu9VarB.toString();
                    PrintWriter printWriter = new PrintWriter((Writer) new fte0());
                    nu9VarB.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(nu9VarB);
                i++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(parcelable2.d);
        String str4 = parcelable2.e;
        if (str4 != null) {
            zf30 zf30VarM2 = zscVar.m(str4);
            this.A = zf30VarM2;
            s(zf30VarM2);
        }
        ArrayList arrayList2 = parcelable2.f;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.l.put((String) arrayList2.get(i2), (su9) parcelable2.g.get(i2));
            }
        }
        this.H = new ArrayDeque(parcelable2.h);
    }

    public final void e() {
        this.b = false;
        this.O.clear();
        this.N.clear();
    }

    public final Bundle e0() {
        ou9[] ou9VarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        J();
        x();
        A(true);
        this.J = true;
        this.Q.g = true;
        zsc zscVar = this.c;
        zscVar.getClass();
        HashMap map = (HashMap) zscVar.c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (si30 si30Var : map.values()) {
            if (si30Var != null) {
                zf30 zf30Var = si30Var.c;
                zscVar.H(si30Var.o(), zf30Var.e);
                arrayList2.add(zf30Var.e);
                if (P(2)) {
                    zf30Var.toString();
                    Objects.toString(zf30Var.b);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.d;
        if (map2.isEmpty()) {
            P(2);
            return bundle;
        }
        zsc zscVar2 = this.c;
        synchronized (((ArrayList) zscVar2.b)) {
            try {
                ou9VarArr = null;
                if (((ArrayList) zscVar2.b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) zscVar2.b).size());
                    for (zf30 zf30Var2 : (ArrayList) zscVar2.b) {
                        arrayList.add(zf30Var2.e);
                        if (P(2)) {
                            zf30Var2.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = this.d.size();
        if (size > 0) {
            ou9VarArr = new ou9[size];
            for (int i = 0; i < size; i++) {
                ou9VarArr[i] = new ou9((nu9) this.d.get(i));
                if (P(2)) {
                    Objects.toString(this.d.get(i));
                }
            }
        }
        bi30 bi30Var = new bi30();
        bi30Var.a = arrayList2;
        bi30Var.b = arrayList;
        bi30Var.c = ou9VarArr;
        bi30Var.d = this.k.get();
        zf30 zf30Var3 = this.A;
        if (zf30Var3 != null) {
            bi30Var.e = zf30Var3.e;
        }
        bi30Var.f.addAll(this.l.keySet());
        bi30Var.g.addAll(this.l.values());
        bi30Var.h = new ArrayList(this.H);
        bundle.putParcelable("state", bi30Var);
        for (String str : this.m.keySet()) {
            bundle.putBundle(l1d.m("result_", str), (Bundle) this.m.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(l1d.m("fragment_", str2), (Bundle) map2.get(str2));
        }
        return bundle;
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.o().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((si30) it.next()).c.i1;
            if (viewGroup != null) {
                O();
                hashSet.add(sgc1.z(viewGroup));
            }
        }
        return hashSet;
    }

    public final yf30 f0(zf30 zf30Var) {
        zf30 zf30Var2;
        si30 si30Var = (si30) ((HashMap) this.c.c).get(zf30Var.e);
        if (si30Var == null || (zf30Var2 = si30Var.c) != zf30Var) {
            o0(new IllegalStateException(gvg.i("Fragment ", zf30Var, " is not currently in the FragmentManager")));
            throw null;
        }
        if (zf30Var2.a > -1) {
            return new yf30(si30Var.o());
        }
        return null;
    }

    public final HashSet g(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((nu9) arrayList.get(i)).c.iterator();
            while (it.hasNext()) {
                zf30 zf30Var = ((wi30) it.next()).b;
                if (zf30Var != null && (viewGroup = zf30Var.i1) != null) {
                    hashSet.add(sgc1.A(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void g0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.f.removeCallbacks(this.R);
                    this.x.f.post(this.R);
                    p0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final si30 h(zf30 zf30Var) {
        String str = zf30Var.e;
        zsc zscVar = this.c;
        si30 si30Var = (si30) ((HashMap) zscVar.c).get(str);
        if (si30Var != null) {
            return si30Var;
        }
        si30 si30Var2 = new si30(this.f116p, zscVar, zf30Var);
        si30Var2.m(this.x.e.getClassLoader());
        si30Var2.e = this.w;
        return si30Var2;
    }

    public final void h0(zf30 zf30Var, boolean z) {
        ViewGroup viewGroupM = M(zf30Var);
        if (viewGroupM == null || !(viewGroupM instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM).setDrawDisappearingViewsLast(!z);
    }

    public final void i(zf30 zf30Var) {
        if (P(2)) {
            Objects.toString(zf30Var);
        }
        if (zf30Var.c1) {
            return;
        }
        zf30Var.c1 = true;
        if (zf30Var.X) {
            if (P(2)) {
                zf30Var.toString();
            }
            zsc zscVar = this.c;
            synchronized (((ArrayList) zscVar.b)) {
                ((ArrayList) zscVar.b).remove(zf30Var);
            }
            zf30Var.X = false;
            if (Q(zf30Var)) {
                this.I = true;
            }
            m0(zf30Var);
        }
    }

    public final void i0(Bundle bundle, String str) {
        nh30 nh30Var = (nh30) this.n.get(str);
        if (nh30Var == null || !nh30Var.a.b().a(w8c0.d)) {
            this.m.put(str, bundle);
        } else {
            nh30Var.q(bundle, str);
        }
        if (P(2)) {
            Objects.toString(bundle);
        }
    }

    public final void j(boolean z, Configuration configuration) {
        if (z && (this.x instanceof j2q0)) {
            o0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null) {
                zf30Var.onConfigurationChanged(configuration);
                if (z) {
                    zf30Var.W0.j(true, configuration);
                }
            }
        }
    }

    public final void j0(String str, iac0 iac0Var, oi30 oi30Var) {
        x8c0 lifecycle = iac0Var.getLifecycle();
        if (lifecycle.b() == w8c0.a) {
            return;
        }
        kh30 kh30Var = new kh30(this, str, oi30Var, lifecycle);
        nh30 nh30Var = (nh30) this.n.put(str, new nh30(lifecycle, oi30Var, kh30Var));
        if (nh30Var != null) {
            nh30Var.a.d(nh30Var.c);
        }
        if (P(2)) {
            lifecycle.toString();
            Objects.toString(oi30Var);
        }
        lifecycle.a(kh30Var);
    }

    public final boolean k() {
        if (this.w >= 1) {
            for (zf30 zf30Var : this.c.u()) {
                if (zf30Var != null) {
                    if (!zf30Var.b1 ? zf30Var.W0.k() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void k0(zf30 zf30Var, w8c0 w8c0Var) {
        if (zf30Var == this.c.m(zf30Var.e) && (zf30Var.V0 == null || zf30Var.U0 == this)) {
            zf30Var.r1 = w8c0Var;
        } else {
            hhg1.i("Fragment ", zf30Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final boolean l() {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null && S(zf30Var)) {
                if (zf30Var.b1 ? false : (zf30Var.f1 && zf30Var.g1) | zf30Var.W0.l()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(zf30Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                zf30 zf30Var2 = (zf30) this.e.get(i);
                if (arrayList == null || !arrayList.contains(zf30Var2)) {
                    zf30Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l0(zf30 zf30Var) {
        if (zf30Var != null) {
            if (zf30Var != this.c.m(zf30Var.e) || (zf30Var.V0 != null && zf30Var.U0 != this)) {
                hhg1.i("Fragment ", zf30Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        zf30 zf30Var2 = this.A;
        this.A = zf30Var;
        s(zf30Var2);
        s(this.A);
    }

    public final void m() {
        boolean zIsChangingConfigurations = true;
        this.L = true;
        A(true);
        x();
        tg30 tg30Var = this.x;
        boolean z = tg30Var instanceof sck1;
        zsc zscVar = this.c;
        if (z) {
            zIsChangingConfigurations = ((di30) zscVar.e).f;
        } else {
            Context context = tg30Var.e;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((su9) it.next()).a.iterator();
                while (it2.hasNext()) {
                    ((di30) zscVar.e).U((String) it2.next(), false);
                }
            }
        }
        v(-1);
        jch0 jch0Var = this.x;
        if (jch0Var instanceof taq0) {
            ((taq0) jch0Var).X(this.s);
        }
        jch0 jch0Var2 = this.x;
        if (jch0Var2 instanceof j2q0) {
            ((j2q0) jch0Var2).T(this.r);
        }
        jch0 jch0Var3 = this.x;
        if (jch0Var3 instanceof q5q0) {
            ((q5q0) jch0Var3).W(this.t);
        }
        jch0 jch0Var4 = this.x;
        if (jch0Var4 instanceof s5q0) {
            ((s5q0) jch0Var4).n(this.u);
        }
        jch0 jch0Var5 = this.x;
        if ((jch0Var5 instanceof psi0) && this.z == null) {
            ((psi0) jch0Var5).l(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        rh0 rh0Var = this.E;
        if (rh0Var != null) {
            rh0Var.b();
            this.F.b();
            this.G.b();
        }
    }

    public final void m0(zf30 zf30Var) {
        ViewGroup viewGroupM = M(zf30Var);
        if (viewGroupM != null) {
            vf30 vf30Var = zf30Var.m1;
            if ((vf30Var == null ? 0 : vf30Var.e) + (vf30Var == null ? 0 : vf30Var.d) + (vf30Var == null ? 0 : vf30Var.c) + (vf30Var == null ? 0 : vf30Var.b) > 0) {
                if (viewGroupM.getTag(2131431647) == null) {
                    viewGroupM.setTag(2131431647, zf30Var);
                }
                zf30 zf30Var2 = (zf30) viewGroupM.getTag(2131431647);
                vf30 vf30Var2 = zf30Var.m1;
                boolean z = vf30Var2 != null ? vf30Var2.a : false;
                if (zf30Var2.m1 == null) {
                    return;
                }
                zf30Var2.e0().a = z;
            }
        }
    }

    public final void n(boolean z) {
        if (z && (this.x instanceof taq0)) {
            o0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null) {
                zf30Var.h1 = true;
                if (z) {
                    zf30Var.W0.n(true);
                }
            }
        }
    }

    public final void n0() {
        for (si30 si30Var : this.c.o()) {
            zf30 zf30Var = si30Var.c;
            if (zf30Var.k1) {
                if (this.b) {
                    this.M = true;
                } else {
                    zf30Var.k1 = false;
                    si30Var.k();
                }
            }
        }
    }

    public final void o(boolean z) {
        if (z && (this.x instanceof q5q0)) {
            o0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null && z) {
                zf30Var.W0.o(true);
            }
        }
    }

    public final void o0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter((Writer) new fte0());
        tg30 tg30Var = this.x;
        try {
            if (tg30Var != null) {
                tg30Var.l0(printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final void p() {
        for (zf30 zf30Var : this.c.p()) {
            if (zf30Var != null) {
                zf30Var.r0();
                zf30Var.W0.p();
            }
        }
    }

    public final void p0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (P(3)) {
                        toString();
                    }
                } else {
                    boolean z = L() > 0 && T(this.z);
                    if (P(3)) {
                        toString();
                    }
                    this.j.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q() {
        if (this.w >= 1) {
            for (zf30 zf30Var : this.c.u()) {
                if (zf30Var != null) {
                    if (!zf30Var.b1 ? zf30Var.W0.q() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void r() {
        if (this.w < 1) {
            return;
        }
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null && !zf30Var.b1) {
                zf30Var.W0.r();
            }
        }
    }

    public final void s(zf30 zf30Var) {
        if (zf30Var != null) {
            if (zf30Var != this.c.m(zf30Var.e)) {
                return;
            }
            zf30Var.U0.getClass();
            boolean zT = T(zf30Var);
            Boolean bool = zf30Var.t;
            if (bool == null || bool.booleanValue() != zT) {
                zf30Var.t = Boolean.valueOf(zT);
                ai30 ai30Var = zf30Var.W0;
                ai30Var.p0();
                ai30Var.s(ai30Var.A);
            }
        }
    }

    public final void t(boolean z) {
        if (z && (this.x instanceof s5q0)) {
            o0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null && z) {
                zf30Var.W0.t(true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        zf30 zf30Var = this.z;
        if (zf30Var != null) {
            sb.append(zf30Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            tg30 tg30Var = this.x;
            if (tg30Var != null) {
                sb.append(tg30Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final boolean u() {
        if (this.w < 1) {
            return false;
        }
        boolean z = false;
        for (zf30 zf30Var : this.c.u()) {
            if (zf30Var != null && S(zf30Var)) {
                if (zf30Var.b1 ? false : zf30Var.W0.u() | (zf30Var.f1 && zf30Var.g1)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void v(int i) {
        try {
            this.b = true;
            for (si30 si30Var : ((HashMap) this.c.c).values()) {
                if (si30Var != null) {
                    si30Var.e = i;
                }
            }
            V(i, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((kss) it.next()).i();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strE = f4i1.e(str, "    ");
        zsc zscVar = this.c;
        ArrayList arrayList = (ArrayList) zscVar.b;
        String strE2 = f4i1.e(str, "    ");
        HashMap map = (HashMap) zscVar.c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (si30 si30Var : map.values()) {
                printWriter.print(str);
                if (si30Var != null) {
                    zf30 zf30Var = si30Var.c;
                    printWriter.println(zf30Var);
                    zf30Var.d0(strE2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                zf30 zf30Var2 = (zf30) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(zf30Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                zf30 zf30Var3 = (zf30) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(zf30Var3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                nu9 nu9Var = (nu9) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(nu9Var.toString());
                nu9Var.l(strE, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (ph30) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.L);
        if (this.I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.I);
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((kss) it.next()).i();
        }
    }

    public final void y(ph30 ph30Var, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.L) {
                    eg.m("FragmentManager has been destroyed");
                    return;
                } else {
                    eg.m("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (U()) {
                eg.m("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(ph30Var);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            eg.m("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.L) {
                eg.m("FragmentManager has been destroyed");
                return;
            } else {
                eg.m("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.f.getLooper()) {
            eg.m("Must be called from main thread of fragment host");
            return;
        }
        if (!z && U()) {
            eg.m("Can not perform this action after onSaveInstanceState");
        } else if (this.N == null) {
            this.N = new ArrayList();
            this.O = new ArrayList();
        }
    }
}
