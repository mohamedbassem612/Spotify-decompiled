package p;

import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i330 extends hab0 implements iu30 {
    public static final i330 N0;
    public static final i330 O0;
    public static final i330 P0;
    public static final i330 Q0;
    public static final i330 R0;
    public static final i330 S0;
    public static final i330 T0;
    public static final i330 U0;
    public static final i330 V0;
    public static final i330 W0;
    public static final i330 X;
    public static final i330 X0;
    public static final i330 Y;
    public static final i330 Y0;
    public static final i330 Z;
    public static final i330 Z0;
    public static final i330 a1;
    public static final i330 b;
    public static final i330 b1;
    public static final i330 c;
    public static final i330 c1;
    public static final i330 d;
    public static final i330 d1;
    public static final i330 e;
    public static final i330 e1;
    public static final i330 f;
    public static final i330 g;
    public static final i330 h;
    public static final i330 i;
    public static final i330 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new i330(i2, (byte) 0);
        c = new i330(i2, (byte) 1);
        d = new i330(i2, (byte) 2);
        e = new i330(i2, (byte) 3);
        f = new i330(i2, (byte) 4);
        g = new i330(i2, (byte) 5);
        h = new i330(i2, (byte) 6);
        i = new i330(i2, (byte) 7);
        t = new i330(i2, (byte) 8);
        X = new i330(i2, (byte) 9);
        Y = new i330(i2, (byte) 10);
        Z = new i330(i2, (byte) 11);
        N0 = new i330(i2, (byte) 12);
        O0 = new i330(i2, (byte) 13);
        P0 = new i330(i2, (byte) 14);
        Q0 = new i330(i2, (byte) 15);
        R0 = new i330(i2, (byte) 16);
        S0 = new i330(i2, (byte) 17);
        T0 = new i330(i2, (byte) 18);
        U0 = new i330(i2, (byte) 19);
        V0 = new i330(i2, (byte) 20);
        W0 = new i330(i2, (byte) 21);
        X0 = new i330(i2, (byte) 22);
        Y0 = new i330(i2, (byte) 23);
        Z0 = new i330(i2, (byte) 24);
        a1 = new i330(i2, (byte) 25);
        b1 = new i330(i2, (byte) 26);
        c1 = new i330(i2, (byte) 27);
        d1 = new i330(i2, (byte) 28);
        e1 = new i330(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i330(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return ((p330) obj).a;
            case 1:
                vnb1 vnb1Var = (vnb1) obj;
                return vnb1Var == null ? new vnb1(false, false) : vnb1Var;
            case 2:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 4:
                return u330.a;
            case 5:
                return new t330(((p330) obj).b.a);
            case 6:
                return Boolean.valueOf(((k430) obj).b);
            case 7:
                return ((k430) obj).a;
            case 8:
                return ((k430) obj).a;
            case 9:
                return rih1.a;
            case 10:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 12:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                if (!(obj instanceof uwz0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uwz0) obj;
            case 16:
                return "";
            case 17:
                return b7xVar;
            case 18:
                return b7xVar;
            case 19:
                return b7xVar;
            case 20:
                return b7xVar;
            case 21:
                return b7xVar;
            case 22:
                return new bx21(2131954498);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new bx21(2131956086);
            case 24:
                return poo1.J((PlayerState) obj);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                List list = ((p530) obj).a;
                if (list == null) {
                    return w7x.a;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((uv11) it.next()).a);
                }
                return o7h.p1(arrayList);
            case 26:
                return new r2l0((i3l0) obj);
            case 27:
                d730 d730Var = (d730) obj;
                return new e730(d730Var.a, d730Var.b, false, true, true);
            case 28:
                i830 i830Var = (i830) obj;
                return new bjs0(i830Var.b, i830Var.c, i830Var.d, i830Var.h, i830Var.g, new tis0(i830Var.e, i830Var.f), 64);
            default:
                return new h830((zis0) obj);
        }
    }
}
