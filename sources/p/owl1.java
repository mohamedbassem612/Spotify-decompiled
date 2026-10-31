package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class owl1 extends hab0 implements iu30 {
    public static final owl1 N0;
    public static final owl1 O0;
    public static final owl1 P0;
    public static final owl1 Q0;
    public static final owl1 R0;
    public static final owl1 S0;
    public static final owl1 T0;
    public static final owl1 U0;
    public static final owl1 V0;
    public static final owl1 W0;
    public static final owl1 X;
    public static final owl1 X0;
    public static final owl1 Y;
    public static final owl1 Y0;
    public static final owl1 Z;
    public static final owl1 Z0;
    public static final owl1 a1;
    public static final owl1 b;
    public static final owl1 b1;
    public static final owl1 c;
    public static final owl1 c1;
    public static final owl1 d;
    public static final owl1 d1;
    public static final owl1 e;
    public static final owl1 e1;
    public static final owl1 f;
    public static final owl1 g;
    public static final owl1 h;
    public static final owl1 i;
    public static final owl1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new owl1(i2, (byte) 0);
        c = new owl1(i2, (byte) 1);
        d = new owl1(i2, (byte) 2);
        e = new owl1(i2, (byte) 3);
        f = new owl1(i2, (byte) 4);
        g = new owl1(i2, (byte) 5);
        h = new owl1(i2, (byte) 6);
        i = new owl1(i2, (byte) 7);
        t = new owl1(i2, (byte) 8);
        X = new owl1(i2, (byte) 9);
        Y = new owl1(i2, (byte) 10);
        Z = new owl1(i2, (byte) 11);
        N0 = new owl1(i2, (byte) 12);
        O0 = new owl1(i2, (byte) 13);
        P0 = new owl1(i2, (byte) 14);
        Q0 = new owl1(i2, (byte) 15);
        R0 = new owl1(i2, (byte) 16);
        S0 = new owl1(i2, (byte) 17);
        T0 = new owl1(i2, (byte) 18);
        U0 = new owl1(i2, (byte) 19);
        V0 = new owl1(i2, (byte) 20);
        W0 = new owl1(i2, (byte) 21);
        X0 = new owl1(i2, (byte) 22);
        Y0 = new owl1(i2, (byte) 23);
        Z0 = new owl1(i2, (byte) 24);
        a1 = new owl1(i2, (byte) 25);
        b1 = new owl1(i2, (byte) 26);
        c1 = new owl1(i2, (byte) 27);
        d1 = new owl1(i2, (byte) 28);
        e1 = new owl1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owl1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    public final Object invoke(Object obj) {
        boolean z;
        int i2;
        puc pucVar;
        int i3;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 1:
                return ((uv11) obj).a;
            case 2:
                return new wxl1(((vxl1) obj).a, false);
            case 3:
                return (qxc0) obj;
            case 4:
                return new vxl1(((cxc0) obj).f.a);
            case 5:
                return Boolean.valueOf(obj instanceof qxc0);
            case 6:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 7:
                return Boolean.valueOf(obj instanceof qxc0);
            case 8:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof Boolean);
            case 10:
                if (obj != null) {
                    return (Boolean) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            case 11:
                return (qxc0) obj;
            case 12:
                return rih1Var;
            case 13:
                return Boolean.valueOf(obj instanceof qxc0);
            case 14:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 15:
                return new mq51(b7x.a, false);
            case 16:
                return hm5.P(xay.e(3, (ni20) null), xay.f(3, (ni20) null));
            case 17:
                d4m1 d4m1Var = (d4m1) obj;
                int i4 = d4m1Var.k;
                puc mucVar = d4m1Var.m;
                boolean z2 = d4m1Var.A;
                boolean z3 = !z2;
                ouc oucVar = ouc.a;
                int i5 = 160;
                if (!z2 && u890.j(mucVar, oucVar) && d4m1Var.E == gj4.DETAILED && d4m1Var.l && d4m1Var.r.length() > 0 && d4m1Var.q && (i3 = d4m1Var.f7p) > 0) {
                    int i6 = d4m1Var.n;
                    z = 160 <= d4m1Var.o && i6 <= 160 && (160 - i6) % i3 == 0;
                }
                muc mucVar2 = mucVar instanceof muc ? (muc) mucVar : null;
                if (z) {
                    i2 = i5;
                } else if (!z2 || mucVar2 == null) {
                    i2 = i4;
                } else {
                    i5 = mucVar2.a;
                    i2 = i5;
                }
                if (z) {
                    mucVar = new muc(i4);
                } else {
                    if (z2 || !u890.j(mucVar, oucVar)) {
                        if (z2 && mucVar2 != null) {
                            pucVar = oucVar;
                        }
                        return d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, i2, false, pucVar, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, z3, z2 ? false : d4m1Var.B, false, false, null, -201331713);
                    }
                    mucVar = nuc.a;
                }
                pucVar = mucVar;
                return d4m1.a(d4m1Var, null, null, false, 0, 0, 0, 0, i2, false, pucVar, 0, 0, 0, false, null, null, null, null, false, null, false, false, false, z3, z2 ? false : d4m1Var.B, false, false, null, -201331713);
            case 18:
                return ((f3n0) obj).a;
            case 19:
                return new d5m1(false, true, new b5m1(15, (Integer) null, (String) null, (List) null), false);
            case 20:
                return (String) obj;
            case 21:
                return (k1r) obj;
            case 22:
                return Boolean.valueOf(obj instanceof ro7);
            case 23:
                return (k1r) obj;
            case 24:
                return new i5m1((qxc0) obj);
            case 25:
                return rih1Var;
            case 26:
                return Boolean.valueOf(obj instanceof qxc0);
            case 27:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return Integer.valueOf(-((Number) obj).intValue());
            default:
                return Integer.valueOf(-((Number) obj).intValue());
        }
    }
}
