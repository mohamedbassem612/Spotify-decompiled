package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xj extends hab0 implements iu30 {
    public static final xj N0;
    public static final xj O0;
    public static final xj P0;
    public static final xj Q0;
    public static final xj R0;
    public static final xj S0;
    public static final xj T0;
    public static final xj U0;
    public static final xj V0;
    public static final xj W0;
    public static final xj X;
    public static final xj X0;
    public static final xj Y;
    public static final xj Y0;
    public static final xj Z;
    public static final xj Z0;
    public static final xj a1;
    public static final xj b;
    public static final xj b1;
    public static final xj c;
    public static final xj c1;
    public static final xj d;
    public static final xj d1;
    public static final xj e;
    public static final xj e1;
    public static final xj f;
    public static final xj g;
    public static final xj h;
    public static final xj i;
    public static final xj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xj(i2, (byte) 0);
        c = new xj(i2, (byte) 1);
        d = new xj(i2, (byte) 2);
        e = new xj(i2, (byte) 3);
        f = new xj(i2, (byte) 4);
        g = new xj(i2, (byte) 5);
        h = new xj(i2, (byte) 6);
        i = new xj(i2, (byte) 7);
        t = new xj(i2, (byte) 8);
        X = new xj(i2, (byte) 9);
        Y = new xj(i2, (byte) 10);
        Z = new xj(i2, (byte) 11);
        N0 = new xj(i2, (byte) 12);
        O0 = new xj(i2, (byte) 13);
        P0 = new xj(i2, (byte) 14);
        Q0 = new xj(i2, (byte) 15);
        R0 = new xj(i2, (byte) 16);
        S0 = new xj(i2, (byte) 17);
        T0 = new xj(i2, (byte) 18);
        U0 = new xj(i2, (byte) 19);
        V0 = new xj(i2, (byte) 20);
        W0 = new xj(i2, (byte) 21);
        X0 = new xj(i2, (byte) 22);
        Y0 = new xj(i2, (byte) 23);
        Z0 = new xj(i2, (byte) 24);
        a1 = new xj(i2, (byte) 25);
        b1 = new xj(i2, (byte) 26);
        c1 = new xj(i2, (byte) 27);
        d1 = new xj(i2, (byte) 28);
        e1 = new xj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = ((hi) obj).b;
                if (str == null) {
                    str = "";
                }
                return sqg0.J(oqn1.n("action_id", "spy_tap"), oqn1.n("device_name", str));
            case 1:
                k30 k30Var = ((g30) obj).c;
                c380 c380VarC = k30Var.c();
                ArrayList arrayList = new ArrayList(q7h.U(c380VarC, 10));
                Iterator<E> it = c380VarC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i30) it.next()).a());
                }
                mmr0 mmr0VarN = oqn1.n(1, o7h.p1(arrayList));
                c380 c380VarC2 = k30Var.c();
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it2 = c380VarC2.iterator();
                while (it2.hasNext()) {
                    r7h.W(((i30) it2.next()).b(), arrayList2);
                }
                mmr0 mmr0VarN2 = oqn1.n(2, o7h.p1(arrayList2));
                c380 c380VarC3 = k30Var.c();
                ArrayList arrayList3 = new ArrayList(q7h.U(c380VarC3, 10));
                Iterator<E> it3 = c380VarC3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((i30) it3.next()).a());
                }
                return sqg0.J(mmr0VarN, mmr0VarN2, oqn1.n(-1, alk1.b(arrayList3)));
            case 2:
                return new bx21(2131959889);
            case 3:
                List listA = ((v24) obj).a.a();
                ArrayList arrayList4 = new ArrayList(q7h.U(listA, 10));
                Iterator it4 = listA.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((x24) it4.next()).a());
                }
                return zno1.t(oqn1.n(1, o7h.p1(arrayList4)));
            case 4:
                return ((a48) obj).d();
            case 5:
                return fyo1.i((ui8) obj);
            case 6:
                return l4p1.n((nx9) obj);
            case 7:
                j6w0 j6w0Var = (j6w0) obj;
                if (j6w0Var != null) {
                    return j6w0Var.a;
                }
                return null;
            case 8:
                return String.valueOf(((n700) ((mmr0) obj).b).a);
            case 9:
                return null;
            case 10:
                return new kdn0(Boolean.TRUE);
            case 11:
                return new kdn0(Boolean.TRUE);
            case 12:
                return ((hoh0) obj).b();
            case 13:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
                return Boolean.valueOf((messagePresentationStatus instanceof MessagePresentationStatus.Presented) || (messagePresentationStatus instanceof MessagePresentationStatus.PendingPresentation));
            case 14:
                return zno1.t(oqn1.n(1, o7h.p1(((y5d) obj).a.b())));
            case 15:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 16:
                return ((o3m0) obj).l();
            case 17:
                PlayerState playerState = (PlayerState) obj;
                return new zkf(playerState.contextUri(), playerState.playOrigin().featureIdentifier());
            case 18:
                return rih1.a;
            case 19:
                return new p3v(((vzq0) obj).d());
            case 20:
                return ((n6k) obj).a;
            case 21:
                return ((udk) obj).a();
            case 22:
                return xqk.b(new da10((ioj0) null), (krk) obj);
            case 23:
                return zno1.t(oqn1.n(1, o7h.p1(((ynd0) obj).c.a())));
            case 24:
                return dsa0.l((vuk) obj);
            case 25:
                return ((ContextTrack) ((mmr0) obj).b).uri();
            case 26:
                c380 c380Var = ((usl) obj).b().c;
                ArrayList arrayList5 = new ArrayList(q7h.U(c380Var, 10));
                Iterator<E> it5 = c380Var.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((uv11) it5.next()).a);
                }
                return zno1.t(oqn1.n(1, o7h.p1(arrayList5)));
            case 27:
                return new cdm((wcm) obj, 1, false);
            case 28:
                return oem.a;
            default:
                return ((kb61) obj).x();
        }
    }
}
