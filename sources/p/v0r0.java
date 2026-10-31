package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v0r0 extends hab0 implements Function0 {
    public static final v0r0 N0;
    public static final v0r0 O0;
    public static final v0r0 P0;
    public static final v0r0 Q0;
    public static final v0r0 R0;
    public static final v0r0 S0;
    public static final v0r0 T0;
    public static final v0r0 U0;
    public static final v0r0 V0;
    public static final v0r0 W0;
    public static final v0r0 X;
    public static final v0r0 X0;
    public static final v0r0 Y;
    public static final v0r0 Y0;
    public static final v0r0 Z;
    public static final v0r0 Z0;
    public static final v0r0 a1;
    public static final v0r0 b;
    public static final v0r0 b1;
    public static final v0r0 c;
    public static final v0r0 c1;
    public static final v0r0 d;
    public static final v0r0 d1;
    public static final v0r0 e;
    public static final v0r0 e1;
    public static final v0r0 f;
    public static final v0r0 g;
    public static final v0r0 h;
    public static final v0r0 i;
    public static final v0r0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new v0r0(i2, (byte) 0);
        c = new v0r0(i2, (byte) 1);
        d = new v0r0(i2, (byte) 2);
        e = new v0r0(i2, (byte) 3);
        f = new v0r0(i2, (byte) 4);
        g = new v0r0(i2, (byte) 5);
        h = new v0r0(i2, (byte) 6);
        i = new v0r0(i2, (byte) 7);
        t = new v0r0(i2, (byte) 8);
        X = new v0r0(i2, (byte) 9);
        Y = new v0r0(i2, (byte) 10);
        Z = new v0r0(i2, (byte) 11);
        N0 = new v0r0(i2, (byte) 12);
        O0 = new v0r0(i2, (byte) 13);
        P0 = new v0r0(i2, (byte) 14);
        Q0 = new v0r0(i2, (byte) 15);
        R0 = new v0r0(i2, (byte) 16);
        S0 = new v0r0(i2, (byte) 17);
        T0 = new v0r0(i2, (byte) 18);
        U0 = new v0r0(i2, (byte) 19);
        V0 = new v0r0(i2, (byte) 20);
        W0 = new v0r0(i2, (byte) 21);
        X0 = new v0r0(i2, (byte) 22);
        Y0 = new v0r0(i2, (byte) 23);
        Z0 = new v0r0(i2, (byte) 24);
        a1 = new v0r0(i2, (byte) 25);
        b1 = new v0r0(i2, (byte) 26);
        c1 = new v0r0(i2, (byte) 27);
        d1 = new v0r0(i2, (byte) 28);
        e1 = new v0r0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0r0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
            case 1:
                return rih1Var;
            case 2:
                throw new IllegalStateException("No page DataPool available in this composition");
            case 3:
                throw new IllegalStateException("no page properties available - is your composable really in a Page?");
            case 4:
                throw new IllegalStateException("no PageUiContext available - is your composable really in a Page?");
            case 5:
                return "";
            case 6:
                return v8r.q((Object) null);
            case 7:
                return null;
            case 8:
                return fc11.v("com.spotify.blend.tastematch.api.group.PageType", dhr0.values(), new String[]{"PENDING_INVITATION", "READY_TO_JOIN_EMPTY_BLEND", "READY_TO_JOIN_ALREADY_CREATED_BLEND", "MAX_MEMBERS", "ALREADY_JOINED", "DELETED"}, new Annotation[][]{null, null, null, null, null, null});
            case 9:
                throw new IllegalStateException("no LocalPageUIEventProviderOwner available - is your composable really in a Page?");
            case 10:
                hhp0 hhp0Var = hhp0.a;
                return Boolean.valueOf(hhp0.y());
            case 11:
                return v8r.q(Boolean.FALSE);
            case 12:
                return rih1Var;
            case 13:
                return v8r.q(Boolean.FALSE);
            case 14:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : jwr0.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 15:
                return new a1z("com.spotify.partnerapps.domain.api.PartnerIntegrationsEntry.ConnectionStatus", q2s0.values());
            case 16:
                return new r36(o2s0.a, (byte) 0);
            case 17:
            case 18:
                return rih1Var;
            case 19:
                return new r36(chc1.a, (byte) 0);
            case 20:
                return mno1.g();
            case 21:
                return new pfp0("com.spotify.blend.tastematch.api.PendingInvitation", hgs0.INSTANCE, new Annotation[0]);
            case 22:
                return new r36(jos0.a, (byte) 0);
            case 23:
                return new nlc0(chc1.a, o5f0.a);
            case 24:
                a3i1 a3i1Var2 = new a3i1();
                for (t2i1 t2i1Var2 : ess0.b) {
                    a3i1Var2.b(t2i1Var2.a, t2i1Var2.b);
                }
                return a3i1Var2;
            case 25:
                a3i1 a3i1Var3 = new a3i1();
                for (t2i1 t2i1Var3 : jss0.b) {
                    a3i1Var3.b(t2i1Var3.a, t2i1Var3.b);
                }
                return a3i1Var3;
            case 26:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 27:
                return v8r.q("");
            case 28:
                return mco0.a;
            default:
                return "";
        }
    }
}
