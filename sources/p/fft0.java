package p;

import android.content.Intent;
import android.util.Base64;
import com.google.protobuf.Empty;
import com.spotify.messages.ZeroFrictionAuthentication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fft0 extends hab0 implements iu30 {
    public static final fft0 N0;
    public static final fft0 O0;
    public static final fft0 P0;
    public static final fft0 Q0;
    public static final fft0 R0;
    public static final fft0 S0;
    public static final fft0 T0;
    public static final fft0 U0;
    public static final fft0 V0;
    public static final fft0 W0;
    public static final fft0 X;
    public static final fft0 X0;
    public static final fft0 Y;
    public static final fft0 Y0;
    public static final fft0 Z;
    public static final fft0 Z0;
    public static final fft0 a1;
    public static final fft0 b;
    public static final fft0 b1;
    public static final fft0 c;
    public static final fft0 c1;
    public static final fft0 d;
    public static final fft0 d1;
    public static final fft0 e;
    public static final fft0 e1;
    public static final fft0 f;
    public static final fft0 g;
    public static final fft0 h;
    public static final fft0 i;
    public static final fft0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fft0(i2, (byte) 0);
        c = new fft0(i2, (byte) 1);
        d = new fft0(i2, (byte) 2);
        e = new fft0(i2, (byte) 3);
        f = new fft0(i2, (byte) 4);
        g = new fft0(i2, (byte) 5);
        h = new fft0(i2, (byte) 6);
        i = new fft0(i2, (byte) 7);
        t = new fft0(i2, (byte) 8);
        X = new fft0(i2, (byte) 9);
        Y = new fft0(i2, (byte) 10);
        Z = new fft0(i2, (byte) 11);
        N0 = new fft0(i2, (byte) 12);
        O0 = new fft0(i2, (byte) 13);
        P0 = new fft0(i2, (byte) 14);
        Q0 = new fft0(i2, (byte) 15);
        R0 = new fft0(i2, (byte) 16);
        S0 = new fft0(i2, (byte) 17);
        T0 = new fft0(i2, (byte) 18);
        U0 = new fft0(i2, (byte) 19);
        V0 = new fft0(i2, (byte) 20);
        W0 = new fft0(i2, (byte) 21);
        X0 = new fft0(i2, (byte) 22);
        Y0 = new fft0(i2, (byte) 23);
        Z0 = new fft0(i2, (byte) 24);
        a1 = new fft0(i2, (byte) 25);
        b1 = new fft0(i2, (byte) 26);
        c1 = new fft0(i2, (byte) 27);
        d1 = new fft0(i2, (byte) 28);
        e1 = new fft0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fft0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                set0 set0Var = (set0) obj;
                return new uet0(set0Var.b(), set0Var.d());
            case 1:
                return u0p1.r((lnt0) obj, new ant0());
            case 2:
                return ((r2t) obj).l().c;
            case 3:
                return pdp1.h((mlv0) obj);
            case 4:
                return z6x.a;
            case 5:
                return o7h.y0(((c8r) obj).c, null, null, null, p7w0.X0, 31);
            case 6:
                return oon1.G((tmx0) obj);
            case 7:
                return upn1.D((xnx0) obj);
            case 8:
                return ((tnx0) obj).c;
            case 9:
                return new a0y0(((wzx0) obj).a());
            case 10:
                return b7xVar;
            case 11:
                return new h5y0(rqt0.u(new h5y0(((omy0) obj).callStream("spotify.connectivity.pubsub.esperanto.proto.PubSub", "addOnNewConnectionID", Empty.n()), (byte) 2)), (byte) 1);
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                return b7xVar;
            case 15:
                int iOrdinal = ((dq01) obj).ordinal();
                if (iOrdinal == 0) {
                    return ot01.a;
                }
                if (iOrdinal == 1) {
                    return pt01.a;
                }
                eg.o();
                return null;
            case 16:
                return ((yif1) obj).a();
            case 17:
                return ((cd11) obj).a();
            case 18:
                uv11 uv11Var = (uv11) obj;
                return new uho(uv11Var.a, uv11Var.b, qho.a, (nho) null, (String) null, (Function0) null, 248);
            case 19:
                int iOrdinal2 = ((ldq0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    return ue31.a;
                }
                if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    return ve31.a;
                }
                eg.o();
                return null;
            case 20:
                return b7xVar;
            case 21:
                return w7x.a;
            case 22:
                gg.s();
                return j82.C();
            case 23:
                gg.s();
                return j82.C();
            case 24:
                return new mjl0((owl0) obj).h();
            case 25:
                n57.e("Usage of deprecated settings URI: " + ((Intent) obj).getData());
                return rih1Var;
            case 26:
                return (String) obj;
            case 27:
                return Base64.encodeToString(((ZeroFrictionAuthentication) obj).toByteArray(), 0);
            case 28:
                List listA = ((y081) obj).a.a();
                ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d181) it.next()).a());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    r7h.W(((d181) it2.next()).b(), arrayList2);
                }
                return sqg0.J(oqn1.n(1, o7h.p1(arrayList)), oqn1.n(2, o7h.p1(arrayList2)), oqn1.n(-1, alk1.b(o7h.N0(arrayList2, arrayList))));
            default:
                return (e090) ((mmr0) obj).a;
        }
    }
}
