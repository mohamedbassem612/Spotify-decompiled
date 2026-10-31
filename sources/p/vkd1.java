package p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vkd1 extends hab0 implements iu30 {
    public static final vkd1 N0;
    public static final vkd1 O0;
    public static final vkd1 P0;
    public static final vkd1 Q0;
    public static final vkd1 R0;
    public static final vkd1 S0;
    public static final vkd1 T0;
    public static final vkd1 U0;
    public static final vkd1 V0;
    public static final vkd1 W0;
    public static final vkd1 X;
    public static final vkd1 X0;
    public static final vkd1 Y;
    public static final vkd1 Y0;
    public static final vkd1 Z;
    public static final vkd1 Z0;
    public static final vkd1 a1;
    public static final vkd1 b;
    public static final vkd1 b1;
    public static final vkd1 c;
    public static final vkd1 c1;
    public static final vkd1 d;
    public static final vkd1 d1;
    public static final vkd1 e;
    public static final vkd1 e1;
    public static final vkd1 f;
    public static final vkd1 g;
    public static final vkd1 h;
    public static final vkd1 i;
    public static final vkd1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vkd1(i2, (byte) 0);
        c = new vkd1(i2, (byte) 1);
        d = new vkd1(i2, (byte) 2);
        e = new vkd1(i2, (byte) 3);
        f = new vkd1(i2, (byte) 4);
        g = new vkd1(i2, (byte) 5);
        h = new vkd1(i2, (byte) 6);
        i = new vkd1(i2, (byte) 7);
        t = new vkd1(i2, (byte) 8);
        X = new vkd1(i2, (byte) 9);
        Y = new vkd1(i2, (byte) 10);
        Z = new vkd1(i2, (byte) 11);
        N0 = new vkd1(i2, (byte) 12);
        O0 = new vkd1(i2, (byte) 13);
        P0 = new vkd1(i2, (byte) 14);
        Q0 = new vkd1(i2, (byte) 15);
        R0 = new vkd1(i2, (byte) 16);
        S0 = new vkd1(i2, (byte) 17);
        T0 = new vkd1(i2, (byte) 18);
        U0 = new vkd1(i2, (byte) 19);
        V0 = new vkd1(i2, (byte) 20);
        W0 = new vkd1(i2, (byte) 21);
        X0 = new vkd1(i2, (byte) 22);
        Y0 = new vkd1(i2, (byte) 23);
        Z0 = new vkd1(i2, (byte) 24);
        a1 = new vkd1(i2, (byte) 25);
        b1 = new vkd1(i2, (byte) 26);
        c1 = new vkd1(i2, (byte) 27);
        d1 = new vkd1(i2, (byte) 28);
        e1 = new vkd1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vkd1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                return new c7v0(1, true);
            case 1:
                return new y691(false);
            case 2:
                return new sl1(true);
            case 3:
                return l4o1.b0((ContextTrack) obj);
            case 4:
                return new eil0((r6h1) obj);
            case 5:
                return new dil0((eil0) obj, (byte) 3);
            case 6:
                return new dil0((eil0) obj, (byte) 1);
            case 7:
                return new dil0((eil0) obj, (byte) 4);
            case 8:
                return new dil0((eil0) obj, (byte) 2);
            case 9:
                return new dil0((eil0) obj, (byte) 0);
            case 10:
                return w7xVar;
            case 11:
                return w7xVar;
            case 12:
                return rih1Var;
            case 13:
                return w7xVar;
            case 14:
                return rih1Var;
            case 15:
                return w7xVar;
            case 16:
                return rih1Var;
            case 17:
                return w7xVar;
            case 18:
                return ((rid1) obj).a;
            case 19:
                pid1 pid1Var = (pid1) obj;
                String str = pid1Var.a;
                String str2 = pid1Var.c;
                ArrayList<rid1> arrayList = pid1Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (rid1 rid1Var : arrayList) {
                    arrayList2.add(new qm31(rid1Var.a, rid1Var.b));
                }
                return new pw2(20, str, str2, (String) null, arrayList2);
            case 20:
                return dm61.A0(((pid1) obj).c);
            case 21:
                return w7xVar;
            case 22:
                return w7xVar;
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                return w7xVar;
            case 26:
                return w7xVar;
            case 27:
                return w7xVar;
            case 28:
                return w7xVar;
            default:
                return w7xVar;
        }
    }
}
