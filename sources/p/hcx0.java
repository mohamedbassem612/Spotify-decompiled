package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hcx0 implements Predicate, Init, Function, b8k0, t2n, Function4, com.spotify.mobius.functions.Function, v891, av30 {
    public final /* synthetic */ byte a;
    public static final hcx0 b = new hcx0(0);
    public static final hcx0 c = new hcx0(1);
    public static final hcx0 d = new hcx0(2);
    public static final hcx0 e = new hcx0(3);
    public static final hcx0 f = new hcx0(4);
    public static final hcx0 g = new hcx0(5);
    public static final hcx0 h = new hcx0(6);
    public static final hcx0 i = new hcx0(7);
    public static final hcx0 t = new hcx0(8);
    public static final hcx0 X = new hcx0(9);
    public static final hcx0 Y = new hcx0(10);
    public static final hcx0 Z = new hcx0(11);
    public static final hcx0 N0 = new hcx0(12);
    public static final hcx0 O0 = new hcx0(13);
    public static final hcx0 P0 = new hcx0(14);
    public static final hcx0 Q0 = new hcx0(15);
    public static final hcx0 R0 = new hcx0(16);
    public static final hcx0 S0 = new hcx0(17);
    public static final hcx0 T0 = new hcx0(18);
    public static final hcx0 U0 = new hcx0(19);
    public static final hcx0 V0 = new hcx0(20);
    public static final hcx0 W0 = new hcx0(21);
    public static final hcx0 X0 = new hcx0(22);
    public static final hcx0 Y0 = new hcx0(23);
    public static final hcx0 Z0 = new hcx0(24);
    public static final hcx0 a1 = new hcx0(25);
    public static final hcx0 b1 = new hcx0(26);

    public /* synthetic */ hcx0(byte b2) {
        this.a = b2;
    }

    public static String a(ji0 ji0Var) {
        Object obj = ji0Var.f.get("coverImageUrl");
        if (obj != null) {
            return (String) obj;
        }
        hhg1.n("Required value was null.");
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static p.iug0 d(p.ji0 r24) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hcx0.d(p.ji0):p.iug0");
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new mr61((ir61) obj, ((Integer) obj2).intValue() > 0, (eq61) obj4, (zq61) obj3);
    }

    public Object apply(Object obj) {
        Object objInvoke;
        boolean z = false;
        switch (this.a) {
            case 5:
                return new ki21((String) obj);
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 15:
            default:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.track().c() && l4o1.P((ContextTrack) playerState.track().b())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return new xsq0((Throwable) obj);
            case 11:
                return new io81((vww) obj);
            case 13:
                oy21 oy21Var = (py21) obj;
                fe91 fe91Var = fe91.V0;
                if (oy21Var instanceof ly21) {
                    objInvoke = z6x.a;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = fe91Var.invoke(oy21Var.a);
                }
                return (List) objInvoke;
            case 14:
                return ((l0l) ((spq0) obj).b()).d();
            case 16:
                return new sfc1((zfc1) obj);
            case 17:
                return ((yze1) obj).c();
            case 18:
                return (Completable) obj;
            case 19:
                return (khm0) obj;
            case 20:
                return n3o1.t((Throwable) obj);
            case 21:
                return Boolean.valueOf(((nta1) obj).equals(jta1.a));
            case 22:
                return ((irk1) obj).a;
            case 23:
                return Boolean.valueOf(((jfl1) obj).a == 3);
        }
    }

    @Override // p.v891
    public boolean c(int i2) {
        return true;
    }

    public First e0(Object obj) {
        return First.b((gty0) obj);
    }

    public Object g(Object obj) throws IOException {
        String strF = ((uz21) obj).f();
        if (strF.length() == 1) {
            return Character.valueOf(strF.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strF.length());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                String str = ((th61) obj).a;
                return !(str == null || ihc1.y0(str));
            case 2:
                return ((Boolean) obj).booleanValue();
            case 3:
                return !((uv00) obj).f;
            case 4:
                return !((Boolean) ((mmr0) obj).b).booleanValue();
            case 8:
                return ((spq0) obj).c();
            case 15:
                return ((cma1) obj).b == 1;
            default:
                return !((YourLibraryResponse) obj).q().r();
        }
    }

    public void b(c8k0 c8k0Var, tv80 tv80Var) {
    }
}
