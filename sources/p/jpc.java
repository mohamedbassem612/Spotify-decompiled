package p;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.campfire.datasource.impl.proto.HierarchyMessageChangedNotification;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jpc extends hab0 implements iu30 {
    public static final jpc N0;
    public static final jpc O0;
    public static final jpc P0;
    public static final jpc Q0;
    public static final jpc R0;
    public static final jpc S0;
    public static final jpc T0;
    public static final jpc U0;
    public static final jpc V0;
    public static final jpc W0;
    public static final jpc X;
    public static final jpc X0;
    public static final jpc Y;
    public static final jpc Y0;
    public static final jpc Z;
    public static final jpc Z0;
    public static final jpc a1;
    public static final jpc b;
    public static final jpc b1;
    public static final jpc c;
    public static final jpc c1;
    public static final jpc d;
    public static final jpc d1;
    public static final jpc e;
    public static final jpc e1;
    public static final jpc f;
    public static final jpc g;
    public static final jpc h;
    public static final jpc i;
    public static final jpc t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jpc(i2, (byte) 0);
        c = new jpc(i2, (byte) 1);
        d = new jpc(i2, (byte) 2);
        e = new jpc(i2, (byte) 3);
        f = new jpc(i2, (byte) 4);
        g = new jpc(i2, (byte) 5);
        h = new jpc(i2, (byte) 6);
        i = new jpc(i2, (byte) 7);
        t = new jpc(i2, (byte) 8);
        X = new jpc(i2, (byte) 9);
        Y = new jpc(i2, (byte) 10);
        Z = new jpc(i2, (byte) 11);
        N0 = new jpc(i2, (byte) 12);
        O0 = new jpc(i2, (byte) 13);
        P0 = new jpc(i2, (byte) 14);
        Q0 = new jpc(i2, (byte) 15);
        R0 = new jpc(i2, (byte) 16);
        S0 = new jpc(i2, (byte) 17);
        T0 = new jpc(i2, (byte) 18);
        U0 = new jpc(i2, (byte) 19);
        V0 = new jpc(i2, (byte) 20);
        W0 = new jpc(i2, (byte) 21);
        X0 = new jpc(i2, (byte) 22);
        Y0 = new jpc(i2, (byte) 23);
        Z0 = new jpc(i2, (byte) 24);
        a1 = new jpc(i2, (byte) 25);
        b1 = new jpc(i2, (byte) 26);
        c1 = new jpc(i2, (byte) 27);
        d1 = new jpc(i2, (byte) 28);
        e1 = new jpc(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpc(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        ega1 ega1VarD = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ob31 ob31Var = (pb31) obj;
                qb31 qb31VarB = ob31Var.b();
                cfd1 cfd1Var = qb31VarB instanceof qb31 ? new cfd1(new nsn(qb31VarB.e, "")) : dfd1.a;
                if (ob31Var instanceof ob31) {
                    ega1VarD = ob31Var.d();
                } else if (ob31Var instanceof lb31) {
                    ega1VarD = ((lb31) ob31Var).d;
                } else if (!(ob31Var instanceof kb31)) {
                    eg.o();
                    return null;
                }
                return new mmr0(cfd1Var, ega1VarD);
            case 1:
                return (efd1) ((mmr0) obj).a;
            case 2:
                return rih1Var;
            case 3:
                return new crc((uqo) obj, urc.a, null, null, false);
            case 4:
                crc crcVar = (crc) obj;
                Bundle bundle = new Bundle();
                bundle.putParcelable("cacheLimitUiState", crcVar.b);
                bundle.putBoolean("showLearnMore", crcVar.e);
                Long l = crcVar.c;
                if (l != null) {
                    bundle.putLong("previewLimitBytes", l.longValue());
                }
                Long l2 = crcVar.d;
                if (l2 != null) {
                    bundle.putLong("pendingLimitBytes", l2.longValue());
                }
                return bundle;
            case 5:
                ((xas) obj).a(f, wnb.X);
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                c261.a((e261) obj);
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                return ((o3m0) obj).l();
            case 15:
                return ((o3m0) obj).l();
            case 16:
                return new gmw0((Context) obj);
            case 17:
                w3d w3dVar = (w3d) obj;
                return new x3d(w3dVar.d, w3dVar.e, w3dVar.g);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                af afVar = (af) obj;
                return Integer.valueOf((afVar.compareTo(af.i) > 0 || afVar.compareTo(af.e) < 0) ? 4 : 3);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((y5d) obj).a;
            case 20:
                return new FrameLayout((Context) obj);
            case 21:
                return new d2l0((i3l0) obj);
            case 22:
                return ((d2l0) obj).e();
            case 23:
                return ((kb61) obj).Y();
            case 24:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 25:
                for (byte[] bArr : ((c8r) obj).c) {
                    if (bArr.length != 0) {
                        return HierarchyMessageChangedNotification.parseFrom(bArr);
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case 26:
                return new ozk0((i3l0) obj);
            case 27:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), ((ozk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 28:
                return new wgd((uqo) obj);
            default:
                return fu1.b((fu1) obj, (String) null, (fo1) null, false, 0L, 3, false, new ma61((stu0) null, (ttu0) null, 127), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097007);
        }
    }
}
