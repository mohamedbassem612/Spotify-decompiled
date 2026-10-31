package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rbm extends hab0 implements iu30 {
    public static final rbm N0;
    public static final rbm O0;
    public static final rbm P0;
    public static final rbm Q0;
    public static final rbm R0;
    public static final rbm S0;
    public static final rbm T0;
    public static final rbm U0;
    public static final rbm V0;
    public static final rbm W0;
    public static final rbm X;
    public static final rbm X0;
    public static final rbm Y;
    public static final rbm Y0;
    public static final rbm Z;
    public static final rbm Z0;
    public static final rbm a1;
    public static final rbm b;
    public static final rbm b1;
    public static final rbm c;
    public static final rbm c1;
    public static final rbm d;
    public static final rbm d1;
    public static final rbm e;
    public static final rbm e1;
    public static final rbm f;
    public static final rbm g;
    public static final rbm h;
    public static final rbm i;
    public static final rbm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rbm(i2, (byte) 0);
        c = new rbm(i2, (byte) 1);
        d = new rbm(i2, (byte) 2);
        e = new rbm(i2, (byte) 3);
        f = new rbm(i2, (byte) 4);
        g = new rbm(i2, (byte) 5);
        h = new rbm(i2, (byte) 6);
        i = new rbm(i2, (byte) 7);
        t = new rbm(i2, (byte) 8);
        X = new rbm(i2, (byte) 9);
        Y = new rbm(i2, (byte) 10);
        Z = new rbm(i2, (byte) 11);
        N0 = new rbm(i2, (byte) 12);
        O0 = new rbm(i2, (byte) 13);
        P0 = new rbm(i2, (byte) 14);
        Q0 = new rbm(i2, (byte) 15);
        R0 = new rbm(i2, (byte) 16);
        S0 = new rbm(i2, (byte) 17);
        T0 = new rbm(i2, (byte) 18);
        U0 = new rbm(i2, (byte) 19);
        V0 = new rbm(i2, (byte) 20);
        W0 = new rbm(i2, (byte) 21);
        X0 = new rbm(i2, (byte) 22);
        Y0 = new rbm(i2, (byte) 23);
        Z0 = new rbm(i2, (byte) 24);
        a1 = new rbm(i2, (byte) 25);
        b1 = new rbm(i2, (byte) 26);
        c1 = new rbm(i2, (byte) 27);
        d1 = new rbm(i2, (byte) 28);
        e1 = new rbm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        long j;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return (iix0) obj;
            case 1:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 3:
                return (pbm) obj;
            case 4:
                return (obm) obj;
            case 5:
                return new jcm((gcm) obj, 1, false, null);
            case 6:
                return "disable-blocked-content";
            case 7:
                return (String) obj;
            case 8:
                return "obfuscate-restricted-tracks";
            case 9:
                return (String) obj;
            case 10:
                return (String) obj;
            case 11:
                return (String) obj;
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 13:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 15:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 17:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 19:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 21:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 23:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                pem pemVar = (tem) obj;
                boolean z2 = pemVar instanceof pem;
                pem pemVar2 = z2 ? pemVar : null;
                int iB = pemVar2 != null ? pemVar2.b.b() : 0;
                pem pemVar3 = z2 ? pemVar : null;
                return new zdm(iB, (pemVar3 != null ? pemVar3.f : null) != null);
            case 25:
                return rih1Var;
            case 26:
                if (((hem) obj).a.c) {
                    j = cfm.i;
                } else {
                    ytw0 ytw0Var = jfv.b;
                    j = 0;
                }
                return new jfv(j);
            case 27:
                return new iem("", 0, false);
            case 28:
                return ((mem) obj).a;
            default:
                return rih1Var;
        }
    }
}
