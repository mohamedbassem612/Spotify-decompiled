package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xt21 extends hab0 implements iu30 {
    public static final xt21 N0;
    public static final xt21 O0;
    public static final xt21 P0;
    public static final xt21 Q0;
    public static final xt21 R0;
    public static final xt21 S0;
    public static final xt21 T0;
    public static final xt21 U0;
    public static final xt21 V0;
    public static final xt21 W0;
    public static final xt21 X;
    public static final xt21 X0;
    public static final xt21 Y;
    public static final xt21 Y0;
    public static final xt21 Z;
    public static final xt21 Z0;
    public static final xt21 a1;
    public static final xt21 b;
    public static final xt21 b1;
    public static final xt21 c;
    public static final xt21 c1;
    public static final xt21 d;
    public static final xt21 d1;
    public static final xt21 e;
    public static final xt21 e1;
    public static final xt21 f;
    public static final xt21 g;
    public static final xt21 h;
    public static final xt21 i;
    public static final xt21 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xt21(i2, (byte) 0);
        c = new xt21(i2, (byte) 1);
        d = new xt21(i2, (byte) 2);
        e = new xt21(i2, (byte) 3);
        f = new xt21(i2, (byte) 4);
        g = new xt21(i2, (byte) 5);
        h = new xt21(i2, (byte) 6);
        i = new xt21(i2, (byte) 7);
        t = new xt21(i2, (byte) 8);
        X = new xt21(i2, (byte) 9);
        Y = new xt21(i2, (byte) 10);
        Z = new xt21(i2, (byte) 11);
        N0 = new xt21(i2, (byte) 12);
        O0 = new xt21(i2, (byte) 13);
        P0 = new xt21(i2, (byte) 14);
        Q0 = new xt21(i2, (byte) 15);
        R0 = new xt21(i2, (byte) 16);
        S0 = new xt21(i2, (byte) 17);
        T0 = new xt21(i2, (byte) 18);
        U0 = new xt21(i2, (byte) 19);
        V0 = new xt21(i2, (byte) 20);
        W0 = new xt21(i2, (byte) 21);
        X0 = new xt21(i2, (byte) 22);
        Y0 = new xt21(i2, (byte) 23);
        Z0 = new xt21(i2, (byte) 24);
        a1 = new xt21(i2, (byte) 25);
        b1 = new xt21(i2, (byte) 26);
        c1 = new xt21(i2, (byte) 27);
        d1 = new xt21(i2, (byte) 28);
        e1 = new xt21(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt21(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Object next;
        Object next2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = null;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof zei1) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zei1) obj;
            case 2:
                return l1d.m("spotify:user:", Uri.encode((String) obj));
            case 3:
                zei1 zei1Var = (zei1) obj;
                String str2 = zei1Var != null ? zei1Var.b : null;
                if (zei1Var != null) {
                    o3r o3rVar = yt21.a;
                    Iterator it = zei1Var.e.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            yp70 yp70Var = (yp70) next;
                            int i2 = yp70Var.c * yp70Var.b;
                            do {
                                Object next3 = it.next();
                                yp70 yp70Var2 = (yp70) next3;
                                int i3 = yp70Var2.c * yp70Var2.b;
                                if (i2 < i3) {
                                    next = next3;
                                    i2 = i3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    yp70 yp70Var3 = (yp70) next;
                    if (yp70Var3 != null) {
                        str = yp70Var3.a;
                    }
                }
                return new g8i1(str2, str);
            case 4:
                return Boolean.valueOf((obj instanceof zei1) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zei1) obj;
            case 6:
                return l1d.m("spotify:user:", Uri.encode((String) obj));
            case 7:
                zei1 zei1Var2 = (zei1) obj;
                String str3 = zei1Var2 != null ? zei1Var2.b : null;
                if (zei1Var2 != null) {
                    o3r o3rVar2 = bu21.a;
                    Iterator it2 = zei1Var2.e.iterator();
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (it2.hasNext()) {
                            yp70 yp70Var4 = (yp70) next2;
                            int i4 = yp70Var4.c * yp70Var4.b;
                            do {
                                Object next4 = it2.next();
                                yp70 yp70Var5 = (yp70) next4;
                                int i5 = yp70Var5.c * yp70Var5.b;
                                if (i4 < i5) {
                                    next2 = next4;
                                    i4 = i5;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    yp70 yp70Var6 = (yp70) next2;
                    if (yp70Var6 != null) {
                        str = yp70Var6.a;
                    }
                }
                return new f8i1(str3, str);
            case 8:
                return l1d.m("Error: ", ((jy21) obj).b());
            case 9:
                return new d3l0((i3l0) obj);
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), ((d3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 11:
                return new e2l0((i3l0) obj);
            case 12:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), ((e2l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 13:
                return rih1Var;
            case 14:
                l431 l431Var = (l431) obj;
                return new a0x0(l431Var.d, l431Var.e, l431Var.a, l431Var.b, l431Var.c);
            case 15:
                zzw0 zzw0Var = (zzw0) obj;
                if (zzw0Var instanceof yzw0) {
                    return j431.a;
                }
                if (zzw0Var instanceof xzw0) {
                    return i431.a;
                }
                eg.o();
                return null;
            case 16:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, -100000.0f);
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                ja31 ja31Var = (ka31) obj;
                ja31Var.getClass();
                Bundle bundle = new Bundle();
                if (ja31Var instanceof ja31) {
                    bundle.putBoolean("isAudioMuted", ja31Var.g);
                } else if (!(ja31Var instanceof ia31)) {
                    eg.o();
                    return null;
                }
                return bundle;
            case 19:
                return w7x.a;
            case 20:
                return Boolean.TRUE;
            case 21:
                return new ne31();
            case 22:
                return (String) obj;
            case 23:
                return (String) obj;
            case 24:
                return (String) obj;
            case 25:
                return Collections.singletonList(((ke31) obj).a);
            case 26:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 28:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
        }
    }
}
