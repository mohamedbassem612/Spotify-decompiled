package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class h150 implements Update {
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    public final Next a(Object obj, Object obj2) {
        g150 g150Var = (g150) obj;
        z050 z050Var = (z050) obj2;
        a250 a250Var = g150Var.d;
        i050 i050Var = g150Var.a;
        boolean z = z050Var instanceof x050;
        a250 a250Var2 = y150.a;
        z150 z150Var = z150.a;
        if (z) {
            boolean z2 = ((x050) z050Var).a;
            boolean z3 = g150Var.c instanceof e150;
            if (z3 && z2) {
                a250Var = z150Var;
            } else if (z3 && !z2) {
                a250Var = a250Var2;
            }
            return Next.h(g150.a(g150Var, z2, null, a250Var, 5));
        }
        boolean z4 = z050Var instanceof u050;
        boolean z5 = true;
        d250 d250Var = d250.a;
        c250 c250Var = c250.a;
        if (!z4) {
            if (!(z050Var instanceof w050)) {
                if (z050Var instanceof y050) {
                    u150 u150Var = a250Var instanceof u150 ? (u150) a250Var : null;
                    return (u150Var == null || !u150Var.a) ? Next.j() : Next.i(g150.a(g150Var, false, d150.a, z150Var, 3), Collections.singleton(new j050(i050Var)));
                }
                if (z050Var instanceof v050) {
                    return Next.a(Collections.singleton(new m050(((v050) z050Var).a)));
                }
                if (z050Var instanceof t050) {
                    return Next.a(Collections.singleton(new l050(c250Var)));
                }
                if (!(z050Var instanceof s050)) {
                    eg.o();
                    return null;
                }
                ata ataVar = i050Var.c;
                if (ataVar != null) {
                    return Next.a(Collections.singleton(new l050(new b250(ataVar.b))));
                }
                Logger.d("Received ChangeCountryClicked while args.billingCountry == null", new Object[0]);
                return Next.j();
            }
            j331 j331Var = ((w050) z050Var).a;
            if (j331Var instanceof v231) {
                return Next.a(Collections.singleton(new l050(new f250(i050Var.b, (uuy0) ((v231) j331Var).a))));
            }
            if (j331Var instanceof c331) {
                return Next.a(Collections.singleton(new l050(d250Var)));
            }
            if (j331Var instanceof b231) {
                return Next.a(Collections.singleton(new l050(c250Var)));
            }
            if ((j331Var instanceof e231) || (j331Var instanceof z131) || (j331Var instanceof f231) || (j331Var instanceof c231) || (j331Var instanceof d231) || (j331Var instanceof a231) || (j331Var instanceof g231)) {
                return b610.e(g150Var, new u150(false, j331Var.getClass().getSimpleName()));
            }
            if (j331Var instanceof h231) {
                return b610.e(g150Var, new u150(false, ((h231) j331Var).b.toString()));
            }
            eg.o();
            return null;
        }
        j331 j331Var2 = ((u050) z050Var).a;
        if (j331Var2 instanceof v231) {
            if (g150Var.b) {
                a250Var2 = z150Var;
            }
            return Next.i(g150.a(g150Var, false, e150.a, a250Var2, 3), Collections.singleton(new k050(i050Var)));
        }
        if (j331Var2 instanceof c331) {
            return Next.a(Collections.singleton(new l050(d250Var)));
        }
        if (!(j331Var2 instanceof b231)) {
            if (j331Var2 instanceof e231) {
                ata ataVar2 = i050Var.c;
                return ataVar2 != null ? b610.e(g150Var, new p150(ataVar2.a, ataVar2.b)) : b610.e(g150Var, r150.INSTANCE);
            }
            if (j331Var2 instanceof a231) {
                return b610.e(g150Var, m150.INSTANCE);
            }
            if (j331Var2 instanceof g231) {
                return b610.e(g150Var, w150.INSTANCE);
            }
            if ((j331Var2 instanceof z131) || (j331Var2 instanceof f231) || (j331Var2 instanceof c231) || (j331Var2 instanceof d231)) {
                return b610.e(g150Var, new u150(false, j331Var2.getClass().getSimpleName()));
            }
            if (j331Var2 instanceof h231) {
                return b610.e(g150Var, new u150(false, ((h231) j331Var2).b.toString()));
            }
            eg.o();
            return null;
        }
        b231 b231Var = (b231) j331Var2;
        int i = b231Var.b;
        if (i == 7) {
            return Next.a(Collections.singleton(new l050(c250Var)));
        }
        String str = b231Var.c;
        if (i == -2) {
            z5 = false;
        } else if (i != -1 && i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                z5 = false;
            } else if (i != 6 && i != 8 && i != 12) {
                n57.e("Got unexpected BillingResponseCode -> " + i);
            }
        }
        return b610.e(g150Var, new u150(z5, ab80.n("BillingResponseCode: ", " - msg: ", i, str)));
    }
}
