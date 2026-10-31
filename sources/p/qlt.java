package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qlt extends hab0 implements vu30 {
    public static final qlt N0;
    public static final qlt O0;
    public static final qlt P0;
    public static final qlt Q0;
    public static final qlt R0;
    public static final qlt S0;
    public static final qlt T0;
    public static final qlt U0;
    public static final qlt V0;
    public static final qlt W0;
    public static final qlt X;
    public static final qlt X0;
    public static final qlt Y;
    public static final qlt Y0;
    public static final qlt Z;
    public static final qlt Z0;
    public static final qlt a1;
    public static final qlt b;
    public static final qlt b1;
    public static final qlt c;
    public static final qlt c1;
    public static final qlt d;
    public static final qlt d1;
    public static final qlt e;
    public static final qlt e1;
    public static final qlt f;
    public static final qlt g;
    public static final qlt h;
    public static final qlt i;
    public static final qlt t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new qlt(i2, (byte) 0);
        c = new qlt(i2, (byte) 1);
        d = new qlt(i2, (byte) 2);
        e = new qlt(i2, (byte) 3);
        f = new qlt(i2, (byte) 4);
        g = new qlt(i2, (byte) 5);
        h = new qlt(i2, (byte) 6);
        i = new qlt(i2, (byte) 7);
        t = new qlt(i2, (byte) 8);
        X = new qlt(i2, (byte) 9);
        Y = new qlt(i2, (byte) 10);
        Z = new qlt(i2, (byte) 11);
        N0 = new qlt(i2, (byte) 12);
        O0 = new qlt(i2, (byte) 13);
        P0 = new qlt(i2, (byte) 14);
        Q0 = new qlt(i2, (byte) 15);
        R0 = new qlt(i2, (byte) 16);
        S0 = new qlt(i2, (byte) 17);
        T0 = new qlt(i2, (byte) 18);
        U0 = new qlt(i2, (byte) 19);
        V0 = new qlt(i2, (byte) 20);
        W0 = new qlt(i2, (byte) 21);
        X0 = new qlt(i2, (byte) 22);
        Y0 = new qlt(i2, (byte) 23);
        Z0 = new qlt(i2, (byte) 24);
        a1 = new qlt(i2, (byte) 25);
        b1 = new qlt(i2, (byte) 26);
        c1 = new qlt(i2, (byte) 27);
        d1 = new qlt(i2, (byte) 28);
        e1 = new qlt(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qlt(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jA;
        boolean z = false;
        hzu hzuVar = null;
        switch (this.a) {
            case 0:
                return new k3h1(((h460) obj).c);
            case 1:
                return new k3h1(((zv70) obj).e);
            case 2:
                return new k3h1(((bw70) obj).d);
            case 3:
                return new k3h1(((qox0) obj).c);
            case 4:
                return new k3h1(((hk51) obj).d);
            case 5:
                Object objT = jhc1.t((Bundle) obj, "parcelable", dnt.class);
                objT.getClass();
                return (Parcelable) objT;
            case 6:
                return new k3h1(((jcl1) obj).e);
            case 7:
                return (bqt) obj2;
            case 8:
                rxt rxtVar = (rxt) obj;
                return rxtVar.a ? rxtVar : (rxt) obj2;
            case 9:
                return Boolean.valueOf(nln.z(obj, obj2));
            case 10:
                return First.c((aju) obj2, Collections.singleton(new gc80(((jiu) obj).a)));
            case 11:
                return null;
            case 12:
                return ((mgu) obj).b;
            case 13:
                qxc0 qxc0Var = (qxc0) obj2;
                Map map = qxc0Var.X;
                ben benVar = qxc0Var.b;
                String strT = byo1.t(300, benVar.a);
                vp70 vp70Var = vp70.c;
                up70 up70VarP = byo1.p(strT, vp70Var);
                String str = benVar.b;
                up70 up70VarP2 = byo1.p(str != null ? byo1.t(64, str) : null, vp70.b);
                String str2 = benVar.c;
                up70 up70VarP3 = byo1.p(str2 != null ? byo1.t(640, str2) : null, vp70.d);
                String str3 = benVar.d;
                mq70 mq70Var = new mq70(f46.i0(new up70[]{up70VarP, up70VarP2, up70VarP3, byo1.p(str3 != null ? byo1.t(1280, str3) : null, vp70.e)}), 6);
                up70 up70VarP4 = byo1.p((String) map.get("header_image_url_desktop"), vp70Var);
                mq70 mq70Var2 = up70VarP4 != null ? new mq70(Collections.singletonList(up70VarP4), 6) : null;
                up70 up70VarP5 = byo1.p((String) map.get("image_url"), vp70Var);
                return new xkk1(mq70Var, mq70Var2, up70VarP5 != null ? new mq70(Collections.singletonList(up70VarP5), 6) : null, 14);
            case 14:
                ((Number) obj2).intValue();
                return new jh5(pwc0.b, new rxc0((String) obj));
            case 15:
                return true;
            case 16:
                return Boolean.TRUE;
            case 17:
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new jpg0(f6o1.A(new cx0((byte) 11), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), wiu.N0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                umu umuVar = (umu) obj;
                umu umuVar2 = (umu) obj2;
                if (umuVar.equals(umuVar2) || ((umuVar instanceof tmu) && (umuVar2 instanceof smu))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                return (nt81) obj;
            case 21:
                ixx ixxVar = ((afx) obj).a.b;
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
                return new u7h(jA);
            case 22:
                evu evuVar = (evu) obj;
                return new evu(evuVar.a, (g3d0) obj2, evuVar.c);
            case 23:
                qvu qvuVar = (qvu) obj2;
                return new hvu((fvu) obj, qvuVar.a, qvuVar.b);
            case 24:
                return new c1v((qxc0) obj, (String) obj2);
            case 25:
                izu izuVar = (izu) obj2;
                Float f2 = izuVar.a;
                Float fValueOf = Float.valueOf(0.03f);
                hzu hzuVar2 = izuVar.b;
                if (hzuVar2 != null && hzuVar2.b > 0) {
                    hzuVar = hzuVar2;
                }
                return new jzu(f2, fValueOf, hzuVar, hzuVar2 != null ? hzuVar2.c : false);
            case 26:
                return new mmr0((vnb1) obj, (h2v) obj2);
            case 27:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a);
                }
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(i3a.j("Failed to resolve downloadability: ", pla1Var.a)));
                }
                eg.o();
                return null;
            case 28:
                return zso1.c0(((rer0) obj).c, (op80) obj2);
            default:
                return Next.j();
        }
    }
}
