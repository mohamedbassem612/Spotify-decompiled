package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dd2 implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public dd2(ed2 ed2Var, Consumer consumer) {
        this.a = (byte) 4;
        this.b = consumer;
    }

    public final void accept(Object obj) {
        ArrayList arrayList;
        byte b = this.a;
        boolean z = false;
        ic91 ic91Var = ic91.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                jc91 jc91Var = (jc91) obj;
                hc91 hc91Var = jc91Var instanceof hc91 ? (hc91) jc91Var : null;
                if (hc91Var != null) {
                    consumer.accept(new vc2(hc91Var.b));
                }
                break;
            case 1:
                jc91 jc91Var2 = (jc91) obj;
                if (jc91Var2 instanceof hc91) {
                    consumer.accept(new y450(o7h.p1(((hc91) jc91Var2).b)));
                    break;
                } else if (!jc91Var2.equals(ic91Var)) {
                    eg.o();
                    break;
                }
                break;
            case 2:
                pb31 pb31Var = (pb31) obj;
                boolean z2 = pb31Var instanceof lb31;
                if (z2) {
                    List list = ((lb31) pb31Var).c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof nsn) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nsn) it.next()).a);
                    }
                } else {
                    arrayList = z6x.a;
                }
                dwn dwnVar = cwn.a;
                if ((!z2 || ((lb31) pb31Var).d.b != l620.a) && z2) {
                    dwnVar = cq41.T0;
                }
                lb31 lb31Var = z2 ? (lb31) pb31Var : null;
                if (lb31Var != null) {
                    ega1 ega1Var = lb31Var.d;
                    if (u890.j(ega1Var.a, aga1.a) || u890.j(ega1Var.a, yfa1.a)) {
                        z = true;
                    }
                }
                consumer.accept(new zvn(arrayList, dwnVar, z));
                break;
            case 3:
                pb31 pb31Var2 = (pb31) obj;
                if (!(pb31Var2 instanceof kb31) && !(pb31Var2 instanceof ob31)) {
                    if (pb31Var2 instanceof lb31) {
                        List list2 = ((lb31) pb31Var2).c;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof nsn) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((nsn) it2.next()).a);
                        }
                        consumer.accept(new dc91(arrayList4));
                    } else {
                        eg.o();
                    }
                    break;
                }
                break;
            case 4:
                jc91 jc91Var3 = (jc91) obj;
                if (jc91Var3 instanceof hc91) {
                    Set setP1 = o7h.p1(((hc91) jc91Var3).b);
                    Iterator it3 = p7h.M(new Object[]{new ewu(setP1, false), new kae(setP1), new z421(setP1), new g9v0(setP1)}).iterator();
                    while (it3.hasNext()) {
                        consumer.accept(it3.next());
                    }
                    break;
                } else if (!jc91Var3.equals(ic91Var)) {
                    eg.o();
                    break;
                }
                break;
            case 5:
                jc91 jc91Var4 = (jc91) obj;
                if (jc91Var4 instanceof hc91) {
                    consumer.accept(new vc2(o7h.l1(((hc91) jc91Var4).a)));
                    break;
                } else if (!jc91Var4.equals(ic91Var)) {
                    eg.o();
                    break;
                }
                break;
            default:
                jc91 jc91Var5 = (jc91) obj;
                if (jc91Var5 instanceof hc91) {
                    consumer.accept(new qvn(((hc91) jc91Var5).b));
                    break;
                } else if (!jc91Var5.equals(ic91Var)) {
                    eg.o();
                    break;
                }
                break;
        }
    }

    public final void dispose() {
        byte b = this.a;
    }

    public /* synthetic */ dd2(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
