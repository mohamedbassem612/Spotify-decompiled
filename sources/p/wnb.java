package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.Next;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wnb extends hab0 implements vu30 {
    public static final wnb N0;
    public static final wnb O0;
    public static final wnb P0;
    public static final wnb Q0;
    public static final wnb R0;
    public static final wnb S0;
    public static final wnb T0;
    public static final wnb U0;
    public static final wnb V0;
    public static final wnb W0;
    public static final wnb X;
    public static final wnb X0;
    public static final wnb Y;
    public static final wnb Y0;
    public static final wnb Z;
    public static final wnb Z0;
    public static final wnb a1;
    public static final wnb b;
    public static final wnb b1;
    public static final wnb c;
    public static final wnb c1;
    public static final wnb d;
    public static final wnb d1;
    public static final wnb e;
    public static final wnb e1;
    public static final wnb f;
    public static final wnb g;
    public static final wnb h;
    public static final wnb i;
    public static final wnb t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new wnb(i2, (byte) 0);
        c = new wnb(i2, (byte) 1);
        d = new wnb(i2, (byte) 2);
        e = new wnb(i2, (byte) 3);
        f = new wnb(i2, (byte) 4);
        g = new wnb(i2, (byte) 5);
        h = new wnb(i2, (byte) 6);
        i = new wnb(i2, (byte) 7);
        t = new wnb(i2, (byte) 8);
        X = new wnb(i2, (byte) 9);
        Y = new wnb(i2, (byte) 10);
        Z = new wnb(i2, (byte) 11);
        N0 = new wnb(i2, (byte) 12);
        O0 = new wnb(i2, (byte) 13);
        P0 = new wnb(i2, (byte) 14);
        Q0 = new wnb(i2, (byte) 15);
        R0 = new wnb(i2, (byte) 16);
        S0 = new wnb(i2, (byte) 17);
        T0 = new wnb(i2, (byte) 18);
        U0 = new wnb(i2, (byte) 19);
        V0 = new wnb(i2, (byte) 20);
        W0 = new wnb(i2, (byte) 21);
        X0 = new wnb(i2, (byte) 22);
        Y0 = new wnb(i2, (byte) 23);
        Z0 = new wnb(i2, (byte) 24);
        a1 = new wnb(i2, (byte) 25);
        b1 = new wnb(i2, (byte) 26);
        c1 = new wnb(i2, (byte) 27);
        d1 = new wnb(i2, (byte) 28);
        e1 = new wnb(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wnb(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jA;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (tnb) obj2;
            case 1:
                return new dob((zc8) obj, (jo70) obj2);
            case 2:
                icx icxVar = ((afx) obj).a;
                ixx ixxVar = icxVar.b;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    jA = ixxVar.a();
                } else if (iOrdinal == 1) {
                    jA = ixxVar.b();
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    jA = ixxVar.c();
                }
                return new u7h(z4p1.t(jA, icxVar.c));
            case 3:
                ((j3x) obj).c = (gt40) obj2;
                return rih1Var;
            case 4:
                ((j3x) obj).d = (ql3) obj2;
                return rih1Var;
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.TRUE;
            case 7:
                return new onb1(((Boolean) obj2).booleanValue());
            case 8:
                return null;
            case 9:
                Bundle bundle = (Bundle) obj;
                uqo uqoVar = (uqo) obj2;
                vrc vrcVar = (vrc) jhc1.t(bundle, "cacheLimitUiState", vrc.class);
                if (vrcVar == null) {
                    vrcVar = urc.a;
                }
                return new crc(uqoVar, vrcVar, bundle.containsKey("previewLimitBytes") ? Long.valueOf(bundle.getLong("previewLimitBytes")) : null, bundle.containsKey("pendingLimitBytes") ? Long.valueOf(bundle.getLong("pendingLimitBytes")) : null, bundle.getBoolean("showLearnMore"));
            case 10:
                return new u7h(((afx) obj).b.a);
            case 11:
                icx icxVar2 = ((afx) obj).a;
                long j = icxVar2.c;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        j = icxVar2.e;
                    } else if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(j);
            case 12:
                return (o4d) obj2;
            case 13:
                return String.valueOf(!((Boolean) obj2).booleanValue());
            case 14:
                mnd mndVar = (mnd) obj2;
                boolean z = mndVar.a;
                String str = mndVar.c;
                List list = mndVar.e;
                String str2 = mndVar.b;
                if (!z) {
                    return new gnd(str2);
                }
                if (mndVar.f) {
                    return list.isEmpty() ? new fnd(str2, str) : new dnd(str2, new cnd(list, mndVar.d), str);
                }
                return new hnd(str2);
            case 15:
                return new k3h1(((kic1) obj).b);
            case 16:
                return null;
            case 17:
                jo70 jo70Var = (jo70) obj;
                String str3 = jo70Var.a;
                up70 up70VarA = ((xkk1) obj2).a.a(vp70.c);
                return new v0e(str3, up70VarA != null ? up70VarA.a.a : null, o7h.y0(jo70Var.d, ", ", (String) null, (String) null, fjd.e1, 30));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return null;
            case 20:
                d9e d9eVar = (d9e) obj;
                return new e9e(d9eVar.c, (String) u890.k((k1r) obj2, (d0r) null, (n4r) null), d9eVar.b);
            case 21:
                return ((h9e) obj).b;
            case 22:
                return ((i9e) obj).b;
            case 23:
                wee weeVar = (wee) obj2;
                e090 e090Var = weeVar.d;
                boolean z2 = ((e090Var instanceof zz80) || (e090Var instanceof c090)) ? false : true;
                boolean z3 = (e090Var instanceof b090) || (e090Var instanceof a090);
                String strUri = weeVar.b.uri();
                qpu qpuVar = weeVar.c;
                return new yee(z2, z3, true, strUri, qpuVar.g, qpuVar.f, qpuVar.h);
            case 24:
                return (qhe) obj2;
            case 25:
                return new mmr0((l631) obj, (List) obj2);
            case 26:
                return Next.h((ale) obj);
            case 27:
                return new nu((byte) 29);
            case 28:
                return null;
            default:
                return null;
        }
    }
}
