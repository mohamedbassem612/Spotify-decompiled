package p;

import j$.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class svu0 extends hab0 implements iu30 {
    public static final svu0 N0;
    public static final svu0 O0;
    public static final svu0 P0;
    public static final svu0 Q0;
    public static final svu0 R0;
    public static final svu0 S0;
    public static final svu0 T0;
    public static final svu0 U0;
    public static final svu0 V0;
    public static final svu0 W0;
    public static final svu0 X;
    public static final svu0 X0;
    public static final svu0 Y;
    public static final svu0 Y0;
    public static final svu0 Z;
    public static final svu0 Z0;
    public static final svu0 a1;
    public static final svu0 b;
    public static final svu0 b1;
    public static final svu0 c;
    public static final svu0 c1;
    public static final svu0 d;
    public static final svu0 d1;
    public static final svu0 e;
    public static final svu0 e1;
    public static final svu0 f;
    public static final svu0 g;
    public static final svu0 h;
    public static final svu0 i;
    public static final svu0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new svu0(i2, (byte) 0);
        c = new svu0(i2, (byte) 1);
        d = new svu0(i2, (byte) 2);
        e = new svu0(i2, (byte) 3);
        f = new svu0(i2, (byte) 4);
        g = new svu0(i2, (byte) 5);
        h = new svu0(i2, (byte) 6);
        i = new svu0(i2, (byte) 7);
        t = new svu0(i2, (byte) 8);
        X = new svu0(i2, (byte) 9);
        Y = new svu0(i2, (byte) 10);
        Z = new svu0(i2, (byte) 11);
        N0 = new svu0(i2, (byte) 12);
        O0 = new svu0(i2, (byte) 13);
        P0 = new svu0(i2, (byte) 14);
        Q0 = new svu0(i2, (byte) 15);
        R0 = new svu0(i2, (byte) 16);
        S0 = new svu0(i2, (byte) 17);
        T0 = new svu0(i2, (byte) 18);
        U0 = new svu0(i2, (byte) 19);
        V0 = new svu0(i2, (byte) 20);
        W0 = new svu0(i2, (byte) 21);
        X0 = new svu0(i2, (byte) 22);
        Y0 = new svu0(i2, (byte) 23);
        Z0 = new svu0(i2, (byte) 24);
        a1 = new svu0(i2, (byte) 25);
        b1 = new svu0(i2, (byte) 26);
        c1 = new svu0(i2, (byte) 27);
        d1 = new svu0(i2, (byte) 28);
        e1 = new svu0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ svu0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 2:
                if (!(obj instanceof z1g1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (z1g1) obj;
            case 4:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 6:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 8:
                if (!(obj instanceof zei1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return new rxc0(((dvu0) obj).a.getPlaylistUri());
            case 10:
                return ((dvu0) obj).a.d();
            case 11:
                return new qvc0(((dvu0) obj).a.getPlaylistUri(), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 12:
                return (String) obj;
            case 13:
                zei1 zei1Var = (zei1) obj;
                if (zei1Var != null) {
                    return zei1Var.b;
                }
                return null;
            case 14:
                return ((xvu0) obj).a;
            case 15:
                return new lnl0(new fjl0(((i3l0) obj).b(), (byte) 16));
            case 16:
                return new n1l0((i3l0) obj);
            case 17:
                return Long.valueOf(((Number) obj).longValue());
            case 18:
                b261.c((e261) obj);
                return rih1Var;
            case 19:
                return rih1Var;
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                return pze0.i("=", entry.getKey(), entry.getValue());
            case 21:
                u2v0 u2v0Var = (u2v0) obj;
                return new v2v0(u2v0Var.a, u2v0Var.b, u2v0Var.c, u2v0Var.d, u2v0Var.e, u2v0Var.f, u2v0Var.g, u2v0Var.h, u2v0Var.i, false, u2v0Var.k, false, u2v0Var.l, null, u2v0Var.m, u2v0Var.n, u2v0Var.o, u2v0Var.f16p, u2v0Var.q, u2v0Var.r, u2v0Var.s);
            case 22:
                return (String) obj;
            case 23:
                return (String) obj;
            case 24:
                return (String) obj;
            case 25:
                return (v740) obj;
            case 26:
                if (!(obj instanceof v740) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (v740) obj;
            case 28:
                return URLEncoder.encode(((mbh0) obj).a.group(), StandardCharsets.UTF_8.name());
            default:
                mbh0 mbh0Var = (mbh0) obj;
                List listM = p7h.M(new String[]{mbh0Var.a().get(1), mbh0Var.a().get(2), mbh0Var.a().get(3)});
                ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    arrayList.add(ihc1.e1((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                return f4i1.f("<li>", o7h.y0(arrayList2, "<br/>", (String) null, (String) null, (iu30) null, 62), "</li>");
        }
    }
}
