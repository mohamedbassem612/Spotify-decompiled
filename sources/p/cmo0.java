package p;

import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cmo0 extends hab0 implements iu30 {
    public static final cmo0 N0;
    public static final cmo0 O0;
    public static final cmo0 P0;
    public static final cmo0 Q0;
    public static final cmo0 R0;
    public static final cmo0 S0;
    public static final cmo0 T0;
    public static final cmo0 U0;
    public static final cmo0 V0;
    public static final cmo0 W0;
    public static final cmo0 X;
    public static final cmo0 X0;
    public static final cmo0 Y;
    public static final cmo0 Y0;
    public static final cmo0 Z;
    public static final cmo0 Z0;
    public static final cmo0 a1;
    public static final cmo0 b;
    public static final cmo0 b1;
    public static final cmo0 c;
    public static final cmo0 c1;
    public static final cmo0 d;
    public static final cmo0 d1;
    public static final cmo0 e;
    public static final cmo0 e1;
    public static final cmo0 f;
    public static final cmo0 g;
    public static final cmo0 h;
    public static final cmo0 i;
    public static final cmo0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new cmo0(i2, (byte) 0);
        c = new cmo0(i2, (byte) 1);
        d = new cmo0(i2, (byte) 2);
        e = new cmo0(i2, (byte) 3);
        f = new cmo0(i2, (byte) 4);
        g = new cmo0(i2, (byte) 5);
        h = new cmo0(i2, (byte) 6);
        i = new cmo0(i2, (byte) 7);
        t = new cmo0(i2, (byte) 8);
        X = new cmo0(i2, (byte) 9);
        Y = new cmo0(i2, (byte) 10);
        Z = new cmo0(i2, (byte) 11);
        N0 = new cmo0(i2, (byte) 12);
        O0 = new cmo0(i2, (byte) 13);
        P0 = new cmo0(i2, (byte) 14);
        Q0 = new cmo0(i2, (byte) 15);
        R0 = new cmo0(i2, (byte) 16);
        S0 = new cmo0(i2, (byte) 17);
        T0 = new cmo0(i2, (byte) 18);
        U0 = new cmo0(i2, (byte) 19);
        V0 = new cmo0(i2, (byte) 20);
        W0 = new cmo0(i2, (byte) 21);
        X0 = new cmo0(i2, (byte) 22);
        Y0 = new cmo0(i2, (byte) 23);
        Z0 = new cmo0(i2, (byte) 24);
        a1 = new cmo0(i2, (byte) 25);
        b1 = new cmo0(i2, (byte) 26);
        c1 = new cmo0(i2, (byte) 27);
        d1 = new cmo0(i2, (byte) 28);
        e1 = new cmo0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cmo0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof uwz0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uwz0) obj;
            case 2:
                boolean zBooleanValue = ((Boolean) ((zsq0) obj).a).booleanValue();
                if (zBooleanValue) {
                    return Observable.just(fmo0.a);
                }
                if (!zBooleanValue) {
                    return Observable.just(fmo0.b);
                }
                eg.o();
                return null;
            case 3:
                return null;
            case 4:
                return new joo0(1, false, "", 4, "");
            case 5:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return new dnc0(((jwo0) obj).a, (Function0) null, (Function0) null, (cc9) null, (guh0) null, 120);
            case 9:
                return rih1Var;
            case 10:
                return new yyo0(w7x.a, ((xyo0) obj).a);
            case 11:
                Set set = (Set) obj;
                if (set != null) {
                    return Boolean.valueOf(!set.isEmpty());
                }
                return null;
            case 12:
                return new jzo0(new s3g1(z6x.a, 0, zr7.I(Restrictions.EMPTY)), new v7u0(0L, 0L, ""), hzo0.b, true, null);
            case 13:
                return (String) obj;
            case 14:
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 15:
                return (String) obj;
            case 16:
                mtl mtlVar = (mtl) obj;
                return mtlVar == null ? new mtl() : mtlVar;
            case 17:
                return ((ho70) obj).a;
            case 18:
                return ((ho70) obj).a;
            case 19:
                return (String) obj;
            case 20:
                jo70 jo70Var = (jo70) obj;
                return jo70Var == null ? new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31) : jo70Var;
            case 21:
                return (String) obj;
            case 22:
                jo70 jo70Var2 = (jo70) obj;
                return jo70Var2 == null ? new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31) : jo70Var2;
            case 23:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 25:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 27:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            default:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
