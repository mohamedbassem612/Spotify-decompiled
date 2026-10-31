package p;

import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import com.spotify.mobius.Next;
import com.spotify.offline_esperanto.proto.EsOffline$EstimateMusicVideoDownloadSizeResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yty extends hab0 implements vu30 {
    public static final yty N0;
    public static final yty O0;
    public static final yty P0;
    public static final yty Q0;
    public static final yty R0;
    public static final yty S0;
    public static final yty T0;
    public static final yty U0;
    public static final yty V0;
    public static final yty W0;
    public static final yty X;
    public static final yty X0;
    public static final yty Y;
    public static final yty Y0;
    public static final yty Z;
    public static final yty Z0;
    public static final yty a1;
    public static final yty b;
    public static final yty b1;
    public static final yty c;
    public static final yty c1;
    public static final yty d;
    public static final yty d1;
    public static final yty e;
    public static final yty e1;
    public static final yty f;
    public static final yty g;
    public static final yty h;
    public static final yty i;
    public static final yty t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new yty(i2, (byte) 0);
        c = new yty(i2, (byte) 1);
        d = new yty(i2, (byte) 2);
        e = new yty(i2, (byte) 3);
        f = new yty(i2, (byte) 4);
        g = new yty(i2, (byte) 5);
        h = new yty(i2, (byte) 6);
        i = new yty(i2, (byte) 7);
        t = new yty(i2, (byte) 8);
        X = new yty(i2, (byte) 9);
        Y = new yty(i2, (byte) 10);
        Z = new yty(i2, (byte) 11);
        N0 = new yty(i2, (byte) 12);
        O0 = new yty(i2, (byte) 13);
        P0 = new yty(i2, (byte) 14);
        Q0 = new yty(i2, (byte) 15);
        R0 = new yty(i2, (byte) 16);
        S0 = new yty(i2, (byte) 17);
        T0 = new yty(i2, (byte) 18);
        U0 = new yty(i2, (byte) 19);
        V0 = new yty(i2, (byte) 20);
        W0 = new yty(i2, (byte) 21);
        X0 = new yty(i2, (byte) 22);
        Y0 = new yty(i2, (byte) 23);
        Z0 = new yty(i2, (byte) 24);
        a1 = new yty(i2, (byte) 25);
        b1 = new yty(i2, (byte) 26);
        c1 = new yty(i2, (byte) 27);
        d1 = new yty(i2, (byte) 28);
        e1 = new yty(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yty(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        f7l1 f7l1Var;
        List<rmr0> listUnmodifiableList;
        boolean z = false;
        y6l1 y6l1Var = null;
        switch (this.a) {
            case 0:
                qxc0 qxc0Var = (qxc0) obj2;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pvc0) it.next()).c);
                }
                y6l1 y6l1Var2 = qxc0Var.a;
                return new gwq(y6l1Var2.length() > 0 ? y6l1Var2 : null, arrayList, u890.j(qxc0Var.X.get("ml_generated"), LocalFilesProperties$TestHelper.TRUE));
            case 1:
                return (huy) obj2;
            case 2:
                return new avy((y4m) obj, (r840) obj2);
            case 3:
                return null;
            case 4:
                f7l1 f7l1Var2 = (f7l1) obj;
                sqe sqeVar = f7l1Var2 != null ? f7l1Var2.a : null;
                y6l1Var = sqeVar instanceof y6l1 ? (y6l1) sqeVar : null;
                return y6l1Var != null ? new b7e0("episode_page:entity_explorer", y6l1Var) : c7e0.a;
            case 5:
                String str = (String) obj;
                i1r i1rVar = (k1r) obj2;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 != null && (f7l1Var = (f7l1) i1rVar2.a) != null) {
                    y6l1Var = f7l1Var.a;
                }
                return new ka10(str, y6l1Var != null);
            case 6:
                return new ka10((String) obj, ((Boolean) obj2).booleanValue());
            case 7:
                o2z o2zVar = (o2z) obj;
                n910 n910Var = (n910) obj2;
                return new p2z(o2zVar.a, o2zVar.b, o2zVar.c, o2zVar.d, o2zVar.e, o2zVar.f, o2zVar.g, o2zVar.h, o2zVar.i, o2zVar.j, o2zVar.k, o2zVar.l, o2zVar.m, n910Var.b, n910Var.a, o2zVar.n, n910Var.c, n910Var.d, n910Var.e, n910Var.f, o2zVar.r);
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return (n4z) obj2;
            case 11:
                r7z r7zVar = (r7z) obj2;
                cot0 cot0Var = r7zVar.a;
                return new s7z(cot0Var.a, cot0Var.c, r7zVar.b);
            case 12:
                gz51 gz51Var = (gz51) obj2;
                if (!u890.j((Boolean) obj, Boolean.FALSE) && (gz51Var == null || !gz51Var.a)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                haz hazVar = (haz) obj;
                b910 b910Var = (b910) obj2;
                String str2 = hazVar.a;
                return new iaz(str2, hazVar.b, hazVar.c, hazVar.d, hazVar.e, hazVar.f, hazVar.j, hazVar.g, b910Var.c, b910Var.b, hazVar.i, hazVar.h, hazVar.k, b910Var.d, o0c.Q(b910Var.a, str2), hazVar.l, b910Var.e, b910Var.f, hazVar.n);
            case 14:
                qla1 qla1Var = (rla1) obj2;
                if (!(qla1Var instanceof qla1)) {
                    if (qla1Var instanceof pla1) {
                        return new h3r(new d3r(((pla1) qla1Var).a.toString()));
                    }
                    eg.o();
                    return null;
                }
                EsOffline$EstimateMusicVideoDownloadSizeResponse esOffline$EstimateMusicVideoDownloadSizeResponse = (EsOffline$EstimateMusicVideoDownloadSizeResponse) qla1Var.a;
                long jN = esOffline$EstimateMusicVideoDownloadSizeResponse.n();
                y6l1 y6l1VarValueOf = Long.valueOf(jN);
                if (esOffline$EstimateMusicVideoDownloadSizeResponse.o() && jN > 0) {
                    y6l1Var = y6l1VarValueOf;
                }
                return new j3r(new fvz(y6l1Var));
            case 15:
                return Boolean.valueOf(u890.j(((pf3) obj).d, ((pf3) obj2).d));
            case 16:
                return zso1.c0(((ser0) obj).b, (op80) obj2);
            case 17:
                return (yp00) obj2;
            case 18:
                return ((s4t0) obj).e;
            case 19:
                return Next.j();
            case 20:
                return (cxc0) obj;
            case 21:
                return new ja10(obj, obj2);
            case 22:
                smr0 smr0VarA = ((xb10) obj2).a();
                if (smr0VarA == null || (listUnmodifiableList = Collections.unmodifiableList(smr0VarA.a)) == null) {
                    return z6x.a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (rmr0 rmr0Var : listUnmodifiableList) {
                    r7h.W(p7h.M(new Integer[]{Integer.valueOf(rmr0Var.d), Integer.valueOf(rmr0Var.e)}), arrayList2);
                }
                return arrayList2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return null;
            case 24:
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return null;
            case 26:
                return null;
            case 27:
                return zso1.c0(((ter0) obj).b, (op80) obj2);
            case 28:
                return zso1.c0(((uer0) obj).b, (op80) obj2);
            default:
                return zso1.c0(((ver0) obj).b, (op80) obj2);
        }
    }
}
