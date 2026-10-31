package p;

import com.spotify.scrollsita.v1.Section;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z6w extends hab0 implements iu30 {
    public static final z6w N0;
    public static final z6w O0;
    public static final z6w P0;
    public static final z6w Q0;
    public static final z6w R0;
    public static final z6w S0;
    public static final z6w T0;
    public static final z6w U0;
    public static final z6w V0;
    public static final z6w W0;
    public static final z6w X;
    public static final z6w X0;
    public static final z6w Y;
    public static final z6w Y0;
    public static final z6w Z;
    public static final z6w Z0;
    public static final z6w a1;
    public static final z6w b;
    public static final z6w b1;
    public static final z6w c;
    public static final z6w c1;
    public static final z6w d;
    public static final z6w d1;
    public static final z6w e;
    public static final z6w e1;
    public static final z6w f;
    public static final z6w g;
    public static final z6w h;
    public static final z6w i;
    public static final z6w t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new z6w(i2, (byte) 0);
        c = new z6w(i2, (byte) 1);
        d = new z6w(i2, (byte) 2);
        e = new z6w(i2, (byte) 3);
        f = new z6w(i2, (byte) 4);
        g = new z6w(i2, (byte) 5);
        h = new z6w(i2, (byte) 6);
        i = new z6w(i2, (byte) 7);
        t = new z6w(i2, (byte) 8);
        X = new z6w(i2, (byte) 9);
        Y = new z6w(i2, (byte) 10);
        Z = new z6w(i2, (byte) 11);
        N0 = new z6w(i2, (byte) 12);
        O0 = new z6w(i2, (byte) 13);
        P0 = new z6w(i2, (byte) 14);
        Q0 = new z6w(i2, (byte) 15);
        R0 = new z6w(i2, (byte) 16);
        S0 = new z6w(i2, (byte) 17);
        T0 = new z6w(i2, (byte) 18);
        U0 = new z6w(i2, (byte) 19);
        V0 = new z6w(i2, (byte) 20);
        W0 = new z6w(i2, (byte) 21);
        X0 = new z6w(i2, (byte) 22);
        Y0 = new z6w(i2, (byte) 23);
        Z0 = new z6w(i2, (byte) 24);
        a1 = new z6w(i2, (byte) 25);
        b1 = new z6w(i2, (byte) 26);
        c1 = new z6w(i2, (byte) 27);
        d1 = new z6w(i2, (byte) 28);
        e1 = new z6w(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6w(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        List list = null;
        switch (b2) {
            case 0:
                return (String) obj;
            case 1:
                return (xkk1) obj;
            case 2:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 4:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 6:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 8:
                return Boolean.valueOf(obj instanceof List);
            case 9:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 10:
                return (String) obj;
            case 11:
                return (String) obj;
            case 12:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 14:
                kby kbyVar = ((cxc0) obj).f;
                String str = kbyVar.a;
                String str2 = (String) kbyVar.q.get("editor_usernames");
                List list2 = z6x.a;
                if (str2 != null) {
                    try {
                        list = (List) nfa0.d.a(str2, new r36(chc1.a, (byte) 0));
                    } catch (SerializationException unused) {
                        list = list2;
                    }
                    break;
                }
                if (list != null) {
                    list2 = list;
                }
                return new d5w(str, list2, kbyVar.e);
            case 15:
                b261.c((e261) obj);
                return rih1Var;
            case 16:
                b261.c((e261) obj);
                return rih1Var;
            case 17:
                b261.c((e261) obj);
                return rih1Var;
            case 18:
                return ((mbh0) obj).a.group();
            case 19:
                ((Number) obj).intValue();
                return null;
            case 20:
                return (qvl) obj;
            case 21:
                return ((bvl) obj).a;
            case 22:
                return (bvl) obj;
            case 23:
                return ((hvl) obj).a;
            case 24:
                return (hvl) obj;
            case 25:
                return ((avl) obj).a;
            case 26:
                return (avl) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((oul) obj).a;
            case 28:
                return (oul) obj;
            default:
                return ((kvl) obj).a;
        }
    }
}
