package p;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mhg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mhg0(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dsh0 dsh0Var = dsh0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(vvm0.f);
                return rih1Var;
            case 1:
                iu30Var.invoke(new awm0((hji0) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke(zvm0.b);
                return rih1Var;
            case 3:
                iu30Var.invoke(zvm0.f);
                return rih1Var;
            case 4:
                iu30Var.invoke(zvm0.c);
                return rih1Var;
            case 5:
                iu30Var.invoke(zvm0.e);
                return rih1Var;
            case 6:
                iu30Var.invoke(awg0.a);
                return rih1Var;
            case 7:
                vh60 vh60Var = (vh60) obj;
                if (vh60Var instanceof oh60) {
                    iu30Var.invoke(new n2h0(((oh60) vh60Var).a));
                } else if (vh60Var.equals(rh60.a)) {
                    iu30Var.invoke(h3h0.a);
                } else if (!(vh60Var instanceof lh60) && !(vh60Var instanceof mh60) && !(vh60Var instanceof nh60) && !(vh60Var instanceof qh60) && !(vh60Var instanceof ph60) && !(vh60Var instanceof sh60) && !vh60Var.equals(th60.a) && !(vh60Var instanceof uh60)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 8:
                iu30Var.invoke(new r9h0((String) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new w9h0((List) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new mkh0(((Number) obj).floatValue() > 1.0f));
                return rih1Var;
            case 11:
                iu30Var.invoke(new yrh0((p8i0) obj));
                return rih1Var;
            case 12:
                iu30Var.invoke(new trh0((xoh0) obj));
                return rih1Var;
            case 13:
                iu30Var.invoke(dsh0Var);
                return rih1Var;
            case 14:
                Collection collectionValues = ((Map) obj).values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    iu30Var.invoke(ash0.a);
                } else {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            iu30Var.invoke(bsh0.a);
                        }
                    }
                    iu30Var.invoke(ash0.a);
                }
                return rih1Var;
            case 15:
                iu30Var.invoke(dsh0Var);
                return rih1Var;
            case 16:
                aue1 aue1Var = (aue1) obj;
                if (aue1Var instanceof ute1) {
                    iu30Var.invoke(x4i0.a);
                } else if (aue1Var instanceof vte1) {
                    iu30Var.invoke(y4i0.a);
                } else if (aue1Var instanceof zte1) {
                    uvg1 uvg1Var = ((zte1) aue1Var).a;
                    iu30Var.invoke(new i5i0(uvg1Var.a, uvg1Var.b));
                } else if (aue1Var instanceof wte1) {
                    iu30Var.invoke(new a5i0(((wte1) aue1Var).a));
                } else if (aue1Var instanceof xte1) {
                    iu30Var.invoke(new b5i0(((xte1) aue1Var).a));
                } else {
                    if (!(aue1Var instanceof yte1)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(c5i0.a);
                }
                return rih1Var;
            case 17:
                iu30Var.invoke((m5i0) obj);
                return rih1Var;
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    iu30Var.invoke(p8i0.b);
                }
                return rih1Var;
            case 19:
                if (((Boolean) obj).booleanValue()) {
                    iu30Var.invoke(p8i0.c);
                }
                return rih1Var;
            case 20:
                iu30Var.invoke(new pwz(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 21:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(i300.a);
                return rih1Var;
            case 22:
                iu30Var.invoke(new pwz(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 23:
                return (mr20) iu30Var.invoke((oii0) obj);
            case 24:
                iu30Var.invoke(new iii0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 25:
                iu30Var.invoke((rtb0) obj);
                return rih1Var;
            case 26:
                iu30Var.invoke(new nli0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 27:
                iu30Var.invoke(new cxi0((String) obj));
                return rih1Var;
            case 28:
                iu30Var.invoke(new mcj0((String) obj));
                return rih1Var;
            default:
                return Collections.singletonMap(rih1Var, iu30Var.invoke(obj));
        }
    }
}
