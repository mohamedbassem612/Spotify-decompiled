package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s7c0 {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final iph0 e;
    public final ke61 f;

    static {
        String str = zoi1.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public s7c0(int i2, long j2, iph0 iph0Var, ke61 ke61Var, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = iph0Var;
        this.f = ke61Var;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[LOOP:0: B:28:0x0060->B:30:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    public static s7c0 a(int i2, Bundle bundle) {
        ke61 ke61Var;
        ke61 ke61Var2;
        int i3;
        String str;
        Bundle bundle2;
        IBinder binder;
        b380 b380VarA;
        v280 v280VarM;
        int i4 = bundle.getInt(g, 0);
        long j2 = bundle.getLong(h, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(i);
        bg11 bg11VarB = null;
        iph0 iph0VarA = bundle3 == null ? null : iph0.a(bundle3);
        Bundle bundle4 = bundle.getBundle(l);
        if (bundle4 == null) {
            if (i4 != 0) {
                ke61Var2 = new ke61(i4);
            } else {
                ke61Var = null;
            }
            i3 = bundle.getInt(k);
            if (i3 != 1) {
                str = j;
                if (i3 != 2) {
                    bundle2 = bundle.getBundle(str);
                    if (bundle2 != null) {
                        bg11VarB = yoh0.b(i2, bundle2);
                    }
                } else if (i3 != 3) {
                    binder = bundle.getBinder(str);
                    if (binder != null) {
                        b380VarA = occ.a(binder);
                        v280VarM = b380.m();
                        for (int i5 = 0; i5 < b380VarA.size(); i5++) {
                            Bundle bundle5 = (Bundle) b380VarA.get(i5);
                            bundle5.getClass();
                            v280VarM.c(yoh0.b(i2, bundle5));
                        }
                        bg11VarB = v280VarM.g();
                    }
                } else if (i3 != 4) {
                    bhn0.w();
                    return null;
                }
            }
            return new s7c0(i4, j2, iph0VarA, ke61Var, bg11VarB, i3);
        }
        ke61Var2 = ke61.a(bundle4);
        ke61Var = ke61Var2;
        i3 = bundle.getInt(k);
        if (i3 != 1) {
            str = j;
            if (i3 != 2) {
                bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    bg11VarB = yoh0.b(i2, bundle2);
                }
            } else if (i3 != 3) {
                binder = bundle.getBinder(str);
                if (binder != null) {
                    b380VarA = occ.a(binder);
                    v280VarM = b380.m();
                    while (i5 < b380VarA.size()) {
                        Bundle bundle6 = (Bundle) b380VarA.get(i5);
                        bundle6.getClass();
                        v280VarM.c(yoh0.b(i2, bundle6));
                    }
                    bg11VarB = v280VarM.g();
                }
            } else if (i3 != 4) {
                bhn0.w();
                return null;
            }
        }
        return new s7c0(i4, j2, iph0VarA, ke61Var, bg11VarB, i3);
    }

    public static s7c0 b(int i2) {
        ke61 ke61Var = new ke61("no error message provided", i2, Bundle.EMPTY);
        return new s7c0(ke61Var.a, SystemClock.elapsedRealtime(), null, ke61Var, null, 4);
    }

    public static s7c0 c(yoh0 yoh0Var, iph0 iph0Var) {
        f(yoh0Var);
        return new s7c0(0, SystemClock.elapsedRealtime(), iph0Var, null, yoh0Var, 2);
    }

    public static s7c0 d(List list, iph0 iph0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f((yoh0) it.next());
        }
        return new s7c0(0, SystemClock.elapsedRealtime(), iph0Var, null, b380.p(list), 3);
    }

    public static s7c0 e() {
        return new s7c0(0, SystemClock.elapsedRealtime(), null, null, null, 1);
    }

    public static void f(yoh0 yoh0Var) {
        dm5.n(!TextUtils.isEmpty(yoh0Var.a), "mediaId must not be empty");
        tqh0 tqh0Var = yoh0Var.d;
        dm5.n(tqh0Var.r != null, "mediaMetadata must specify isBrowsable");
        dm5.n(tqh0Var.s != null, "mediaMetadata must specify isPlayable");
    }
}
