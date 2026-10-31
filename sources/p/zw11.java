package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zw11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw11(l041 l041Var, uv00 uv00Var) {
        super(1);
        this.a = (byte) 21;
        this.b = uv00Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0258  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d8  */
    public final Object invoke(Object obj) {
        String str;
        String str2;
        mq70 mq70Var;
        Object next;
        Object next2;
        long length;
        String strN;
        byte b = this.a;
        byte b2 = 3;
        boolean z = true;
        String str3 = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((ax11) obj2).b;
            case 1:
                return new uv11(((tx11) obj).b, ((kx11) ((s880) obj2).g).b.a, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 2:
                return new xwm0((ys50) obj2, (byte) 18);
            case 3:
                return new xm61(2131961979, (String) null, 2131961976, (String) null, 2131961978, (String) null, 2131961977, (String) null, new bz0(3, (lnm) null, (byte) 27), new lok0((kdy0) obj2, (lnm) null, (byte) 25), new wm61(ou11.a1, ou11.b1, ou11.c1), 170);
            case 4:
                return new nc21(((e960) obj2).a((esm1) obj).a);
            case 5:
                return new xwm0((rkb) obj2, (byte) 19);
            case 6:
                return Boolean.valueOf(((oe21) obj).a.a != ((oe21) obj2).a.a);
            case 7:
                rwq0.z((qtr) obj, new z821((dx0) obj2, b2));
                return rih1Var;
            case 8:
                return new ieb0((loq) ((jly0) ((jnq) ((cj21) obj2).e.a.c).b).get(), (cir0) obj, (byte) 2);
            case 9:
                return new xi21(((bj21) obj2).b.a, false);
            case 10:
                return ((dgx) ((bs0) obj2).d).a((l0i) null);
            case 11:
                smo1.p((llm) obj2, (CancellationException) null);
                return rih1Var;
            case 12:
                qv00 qv00Var = (qv00) obj;
                g281 g281Var = (g281) obj2;
                qv00Var.a(g281Var.a, w281.class, false);
                qv00Var.a(g281Var.a, v740.class, false);
                return rih1Var;
            case 13:
                je31 je31Var = (je31) obj2;
                return Double.valueOf(yoi1.n(je31Var.k.c(((Number) obj).doubleValue()), je31Var.e, je31Var.f));
            case 14:
                nfx nfxVar = ((ye31) obj2).a;
                return new yir(((ufx) nfxVar.b).a, (gw70) nfxVar.c, false);
            case 15:
                ((gg31) obj2).x.invoke(new pf31((String) obj));
                return rih1Var;
            case 16:
                return new xwm0((jfe) obj2, (byte) 22);
            case 17:
                ((MobiusLoop) obj2).a((cuj1) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                mmr0 mmr0Var = (mmr0) obj;
                return Boolean.valueOf(u890.j(((ts31) obj2).o.remove((jh5) mmr0Var.a), (k3r) mmr0Var.b));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                jh5 jh5Var = (jh5) obj;
                us31 us31Var = (us31) obj2;
                List list = us31Var.b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((or31) it.next()).a.invoke(jh5Var)).booleanValue()) {
                        }
                    }
                    if (!ob51.f(us31Var.a, jh5Var)) {
                        z = false;
                    }
                } else if (!ob51.f(us31Var.a, jh5Var)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                jh5 jh5Var2 = (jh5) obj;
                return Boolean.valueOf(u890.j(jh5Var2.a, pwc0.x) && ((Boolean) ((zqu0) obj2).invoke(jh5Var2.b)).booleanValue());
            case 21:
                String str4 = (String) obj;
                uv00 uv00Var = (uv00) obj2;
                jo70 jo70Var = uv00Var.a(jo70.class, str4).b;
                if (jo70Var == null) {
                    return null;
                }
                xkk1 xkk1Var = uv00Var.a(xkk1.class, str4).b;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null) {
                    str = null;
                } else {
                    List list2 = mq70Var.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((up70) obj3).a.a.length() > 0) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (((up70) obj4).b.compareTo(l041.h) >= 0) {
                            arrayList2.add(obj4);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            Enum r4 = ((up70) next).b;
                            do {
                                Object next3 = it2.next();
                                Enum r7 = ((up70) next3).b;
                                if (r4.compareTo(r7) > 0) {
                                    next = next3;
                                    r4 = r7;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    up70 up70Var = (up70) next;
                    if (up70Var == null) {
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                Enum r3 = ((up70) next2).b;
                                do {
                                    Object next4 = it3.next();
                                    Enum r5 = ((up70) next4).b;
                                    if (r3.compareTo(r5) < 0) {
                                        next2 = next4;
                                        r3 = r5;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        up70Var = (up70) next2;
                    }
                    if (up70Var != null) {
                        str = up70Var.a.a;
                    } else {
                        str = null;
                    }
                }
                String str5 = jo70Var.a;
                ho70 ho70Var = (ho70) o7h.s0(jo70Var.d);
                if (ho70Var != null && (str2 = ho70Var.a) != null && !ihc1.y0(str2)) {
                    str3 = str2;
                }
                return new xz31(str5, str, str3);
            case 22:
                return (v231) obj2;
            case 23:
                h641 h641Var = (h641) obj;
                return new i641(h641Var.a, h641Var.b, h641Var.c, h641Var.d, h641Var.e, (qtt0) u890.G((k1r) obj2));
            case 24:
                long jLongValue = ((Number) obj).longValue();
                rn21 rn21Var = (rn21) obj2;
                try {
                    length = ((File) ((rn21) rn21Var.b).c).length();
                    break;
                } catch (IOException unused) {
                    Logger.d("Error getting content length", new Object[0]);
                    length = 0;
                }
                float f = jLongValue;
                if (length < 1) {
                    length = 1;
                }
                ((PublishSubject) rn21Var.c).onNext(Float.valueOf(yoi1.o(f / length, 0.0f, 1.0f)));
                return rih1Var;
            case 25:
                return new vm61(2131953412, 2131953411, 2131953410, new vm0((e821) obj2, (lnm) null, (byte) 29), new um61(new sl11(2, (byte) 7), new n601(o641.T0, (byte) 28), fft0.Z0));
            case 26:
                pcf.a(((wd41) obj2).b, pro1.t("chatFeatureSavedReceipts"), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 27:
                String str6 = (String) obj;
                if (u890.j(str6, "k")) {
                    strN = "redacted";
                } else {
                    str6.getClass();
                    strN = ((s4b1) obj2).n(str6);
                }
                return xcg1.i(str6, "=", strN);
            case 28:
                ((kd31) obj).b(((Number) ((hg41) obj2).Q0.e()).floatValue());
                return rih1Var;
            default:
                return obj == ((oen0) obj2) ? "(this)" : String.valueOf(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw11(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
