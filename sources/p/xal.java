package p;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xal {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f168p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final int a;
    public final int b;
    public final kh70 c;
    public final PendingIntent d;
    public final qa61 e;
    public final m8u0 f;
    public final m8u0 g;
    public final Bundle h;
    public final Bundle i;
    public final jbu0 j;
    public final b380 k;
    public final b380 l;
    public final MediaSession.Token m;
    public final b380 n;
    public final String o;

    static {
        String str = zoi1.a;
        f168p = Integer.toString(0, 36);
        q = Integer.toString(1, 36);
        r = Integer.toString(2, 36);
        s = Integer.toString(9, 36);
        t = Integer.toString(14, 36);
        u = Integer.toString(13, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = Integer.toString(11, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(15, 36);
    }

    public xal(int i, int i2, kh70 kh70Var, PendingIntent pendingIntent, b380 b380Var, b380 b380Var2, b380 b380Var3, qa61 qa61Var, m8u0 m8u0Var, m8u0 m8u0Var2, Bundle bundle, Bundle bundle2, jbu0 jbu0Var, MediaSession.Token token, String str) {
        this.a = i;
        this.b = i2;
        this.c = kh70Var;
        this.d = pendingIntent;
        this.k = b380Var;
        this.l = b380Var2;
        this.n = b380Var3;
        this.e = qa61Var;
        this.f = m8u0Var;
        this.g = m8u0Var2;
        this.h = bundle;
        this.i = bundle2;
        this.j = jbu0Var;
        this.m = token;
        this.o = str;
    }

    public static xal a(Bundle bundle) {
        bg11 bg11VarG;
        bg11 bg11VarG2;
        bg11 bg11VarG3;
        kh70 kh70Var;
        kh70 kh70Var2;
        oal binder = bundle.getBinder(C);
        if (binder instanceof oal) {
            return binder.a;
        }
        int i = bundle.getInt(f168p, 0);
        int i2 = bundle.getInt(B, 0);
        IBinder binder2 = bundle.getBinder(q);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(r);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(s);
        if (parcelableArrayList != null) {
            v280 v280VarM = b380.m();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                v280VarM.c(udh.h(i2, bundle2));
            }
            bg11VarG = v280VarM.g();
        } else {
            w280 w280Var = b380.b;
            bg11VarG = bg11.e;
        }
        bg11 bg11Var = bg11VarG;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList2 != null) {
            v280 v280VarM2 = b380.m();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                v280VarM2.c(udh.h(i2, bundle3));
            }
            bg11VarG2 = v280VarM2.g();
        } else {
            w280 w280Var2 = b380.b;
            bg11VarG2 = bg11.e;
        }
        bg11 bg11Var2 = bg11VarG2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(u);
        if (parcelableArrayList3 != null) {
            v280 v280VarM3 = b380.m();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                v280VarM3.c(udh.h(i2, bundle4));
            }
            bg11VarG3 = v280VarM3.g();
        } else {
            w280 w280Var3 = b380.b;
            bg11VarG3 = bg11.e;
        }
        bg11 bg11Var3 = bg11VarG3;
        Bundle bundle5 = bundle.getBundle(v);
        qa61 qa61VarB = bundle5 == null ? qa61.b : qa61.b(bundle5);
        Bundle bundle6 = bundle.getBundle(x);
        m8u0 m8u0VarB = bundle6 == null ? m8u0.b : m8u0.b(bundle6);
        Bundle bundle7 = bundle.getBundle(w);
        m8u0 m8u0VarB2 = bundle7 == null ? m8u0.b : m8u0.b(bundle7);
        Bundle bundleP = zoi1.p(bundle.getBundle(y));
        Bundle bundleP2 = zoi1.p(bundle.getBundle(z));
        Bundle bundle8 = bundle.getBundle(A);
        jbu0 jbu0VarQ = bundle8 == null ? jbu0.H : jbu0.q(i2, bundle8);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(D);
        String string = bundle.getString(E);
        Bundle bundle9 = bundleP2;
        int i6 = jh70.a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kh70)) {
            hh70 hh70Var = new hh70();
            hh70Var.a = iBinder;
            kh70Var = hh70Var;
        } else {
            kh70Var2 = (kh70) iInterfaceQueryLocalInterface;
        }
        if (bundleP == null) {
            kh70Var = kh70Var2;
            bundleP = Bundle.EMPTY;
        }
        kh70Var = kh70Var2;
        Bundle bundle10 = bundleP;
        if (bundle9 == null) {
            bundle9 = Bundle.EMPTY;
        }
        return new xal(i, i2, kh70Var, pendingIntent, bg11Var, bg11Var2, bg11Var3, qa61VarB, m8u0VarB2, m8u0VarB, bundle10, bundle9, jbu0VarQ, token, string);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(f168p, this.a);
        bundle.putBinder(q, this.c.asBinder());
        bundle.putParcelable(r, this.d);
        b380 b380Var = this.k;
        boolean zIsEmpty = b380Var.isEmpty();
        String str = s;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(b380Var.size());
            Iterator it = b380Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((udh) it.next()).m(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        b380 b380Var2 = this.l;
        if (!b380Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(b380Var2.size());
                Iterator it2 = b380Var2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((udh) it2.next()).m(i));
                }
                bundle.putParcelableArrayList(t, arrayList2);
            } else {
                bg11 bg11VarI = udh.i(10, b380Var2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(bg11VarI.d);
                w280 w280VarR = bg11VarI.r(0);
                while (w280VarR.hasNext()) {
                    arrayList3.add(((udh) w280VarR.next()).m(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        b380 b380Var3 = this.n;
        if (!b380Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(b380Var3.size());
            Iterator it3 = b380Var3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((udh) it3.next()).m(i));
            }
            bundle.putParcelableArrayList(u, arrayList4);
        }
        bundle.putBundle(v, this.e.c());
        String str2 = w;
        m8u0 m8u0Var = this.f;
        bundle.putBundle(str2, m8u0Var.c());
        String str3 = x;
        m8u0 m8u0Var2 = this.g;
        bundle.putBundle(str3, m8u0Var2.c());
        bundle.putBundle(y, this.h);
        bundle.putBundle(z, this.i);
        bundle.putBundle(A, this.j.p(bai0.d(m8u0Var, m8u0Var2), false, false).s(i));
        bundle.putInt(B, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(D, token);
        }
        String str4 = this.o;
        if (str4 != null) {
            bundle.putString(E, str4);
        }
        return bundle;
    }
}
