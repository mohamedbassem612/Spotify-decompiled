package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pm0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm0(vu30 vu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = vu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                return new m441(new om0(vu30Var, obj, null, (byte) 0));
            case 1:
                Context context = (Context) obj;
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                return (View) vu30Var.invoke(context, frameLayout);
            case 2:
                List list = (List) obj;
                return vu30Var.invoke(list.get(0), list.get(1));
            case 3:
                vu30Var.invoke(10, (String) obj);
                return rih1Var;
            case 4:
                ksf0 ksf0Var = (ksf0) obj;
                if (ksf0Var instanceof jsf0) {
                    jsf0 jsf0Var = (jsf0) ksf0Var;
                    Set set = jsf0Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((vhc0) it.next()).a));
                    }
                    vu30Var.invoke(o7h.p1(arrayList), Boolean.valueOf(jsf0Var.b));
                } else if (!(ksf0Var instanceof hsf0)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 5:
                vu30Var.invoke((tka0) obj, vuh1.i);
                return rih1Var;
            case 6:
                ((qtr) obj).b(new gz0(vu30Var, (lnm) null, (byte) 26));
                return rih1Var;
            case 7:
                return new m441(new om0(vu30Var, obj, null, (byte) 1));
            case 8:
                vu30Var.invoke((k7f1) obj, zqd1.d);
                return rih1Var;
            case 9:
                vu30Var.invoke((k7f1) obj, zqd1.e);
                return rih1Var;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                vu30Var.invoke(ijf1.a, bool);
                return rih1Var;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                vu30Var.invoke(ijf1.b, bool2);
                return rih1Var;
            default:
                elb0 elb0Var = (elb0) obj;
                int iU = jch0.U(Float.intBitsToFloat((int) (elb0Var.O(0L) & 4294967295L)));
                vu30Var.invoke(Integer.valueOf(iU), Integer.valueOf(((int) (elb0Var.b() & 4294967295L)) + iU));
                return rih1Var;
        }
    }
}
