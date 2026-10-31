package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ccj0 {
    public final Context a;
    public final Resources b;
    public final kwg1 c;
    public final ynb0 d;
    public final ynb0 e;
    public final ynb0 f;
    public final ynb0 g;
    public final xcj0 h;
    public final q8n i;

    public ccj0(Context context, Resources resources, kwg1 kwg1Var, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, xcj0 xcj0Var, q8n q8nVar) {
        this.a = context;
        this.b = resources;
        this.c = kwg1Var;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = ynb0Var3;
        this.g = ynb0Var4;
        this.h = xcj0Var;
        this.i = q8nVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) throws NoWhenBranchMatchedException {
        acj0 acj0Var;
        if (onmVar instanceof acj0) {
            acj0Var = (acj0) onmVar;
            int i = acj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acj0Var.c = i - Integer.MIN_VALUE;
            } else {
                acj0Var = new acj0(this, onmVar);
            }
        } else {
            acj0Var = new acj0(this, onmVar);
        }
        Object objA = acj0Var.a;
        int i2 = acj0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                kwg1 kwg1Var = this.c;
                acj0Var.c = 1;
                objA = kwg1Var.a(50, acj0Var);
                Object obj = d9n.a;
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            List list = (List) objA;
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                int i3 = 2;
                if (!it.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((lo30) obj2).e == 2) {
                            arrayList2.add(obj2);
                        }
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(((lo30) it2.next()).a);
                    }
                    return new pcj0(arrayList, linkedHashSet);
                }
                lo30 lo30Var = (lo30) it.next();
                w4i1 w4i1Var = new w4i1(lo30Var.a, lo30Var.b, 8, lo30Var.c);
                lwg1 lwg1Var = (lwg1) o7h.s0(lo30Var.d);
                switch (lwg1Var == null ? -1 : sbj0.a[lwg1Var.ordinal()]) {
                    case -1:
                    case 9:
                        i3 = 1;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        break;
                    case 2:
                        i3 = 3;
                        break;
                    case 3:
                        i3 = 4;
                        break;
                    case 4:
                        i3 = 5;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 8;
                        break;
                    case 8:
                        i3 = 9;
                        break;
                }
                arrayList.add(new vcj0(i3, w4i1Var));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "MessagingInvites: Failed to load suggestions", new Object[0]);
            return ocj0.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fcj0 fcj0Var, onm onmVar) {
        bcj0 bcj0Var;
        if (onmVar instanceof bcj0) {
            bcj0Var = (bcj0) onmVar;
            int i = bcj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bcj0Var.d = i - Integer.MIN_VALUE;
            } else {
                bcj0Var = new bcj0(this, onmVar);
            }
        } else {
            bcj0Var = new bcj0(this, onmVar);
        }
        Object objG = bcj0Var.b;
        int i2 = bcj0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                bfd bfdVar = (bfd) this.d.get();
                String str = fcj0Var.a;
                bcj0Var.a = fcj0Var;
                bcj0Var.d = 1;
                objG = bfdVar.g(str, bcj0Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fcj0Var = bcj0Var.a;
                hm5.M(objG);
            }
            return new lcj0(fcj0Var.a, ((goe) objG).a, fcj0Var.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "MessagingInvites: Failed to send invite", new Object[0]);
            return new kcj0(fcj0Var.a);
        }
    }
}
