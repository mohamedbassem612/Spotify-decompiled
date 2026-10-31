package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ewy0 {
    public final Context a;
    public final dma1 b;
    public final nfa0 c;
    public final Object d = new Object();

    public ewy0(Context context, dma1 dma1Var, nfa0 nfa0Var) {
        this.a = context;
        this.b = dma1Var;
        this.c = nfa0Var;
    }

    public static bma1 a(int i) {
        return bma1.b.k("push_notification_pending_intents_" + i);
    }

    public final void b(int i) {
        synchronized (this.d) {
            try {
                Iterator it = d(i).iterator();
                while (it.hasNext()) {
                    c(i, (dwy0) it.next());
                }
                g(Collections.singleton(Integer.valueOf(i)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, dwy0 dwy0Var) {
        PendingIntent activity;
        Intent intent = new Intent(dwy0Var.a);
        intent.addCategory(dwy0Var.b);
        String str = dwy0Var.c;
        Context context = this.a;
        intent.setClassName(context, str);
        String str2 = dwy0Var.e;
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        }
        String str3 = dwy0Var.d;
        int i2 = 0;
        if (str3 == null) {
            bhn0.i("Name is null");
        } else if (str3.equals("ACTIVITY")) {
            i2 = 1;
        } else if (str3.equals("BROADCAST")) {
            i2 = 2;
        } else {
            hhg1.n("No enum constant com.spotify.musicappplatform.state.processor.PendingIntentType.".concat(str3));
        }
        int iC = l1d.C(i2);
        if (iC == 0) {
            activity = PendingIntent.getActivity(context, i, intent, 603979776);
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            activity = PendingIntent.getBroadcast(context, i, intent, 603979776);
        }
        if (activity != null) {
            activity.cancel();
        }
    }

    public final Set d(int i) {
        dwy0 m231Var;
        bma1 bma1VarA = a(i);
        dma1 dma1Var = this.b;
        w7x w7xVar = w7x.a;
        w7x w7xVarB = dma1Var.b(bma1VarA, w7xVar);
        if (w7xVarB != null) {
            w7xVar = w7xVarB;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) w7xVar).iterator();
        while (it.hasNext()) {
            try {
                m231Var = (dwy0) this.c.a((String) it.next(), dwy0.Companion.serializer());
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            dwy0 dwy0Var = m231Var;
            if (dwy0Var != null) {
                arrayList.add(dwy0Var);
            }
        }
        return o7h.p1(arrayList);
    }

    public final List e() {
        List m231Var;
        String strE = this.b.e(fwy0.a, (String) null);
        List list = z6x.a;
        if (strE == null) {
            return list;
        }
        try {
            m231Var = (List) this.c.a(strE, fwy0.b);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            list = m231Var;
        }
        return list;
    }

    public final PendingIntent f(int i, int i2, Intent intent) {
        PendingIntent activity;
        String str;
        ComponentName component;
        String className;
        String str2;
        synchronized (this.d) {
            try {
                int iC = l1d.C(i2);
                if (iC == 0) {
                    activity = PendingIntent.getActivity(this.a, i, intent, 201326592);
                } else {
                    if (iC != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    activity = PendingIntent.getBroadcast(this.a, i, intent, 201326592);
                }
                String action = intent.getAction();
                dwy0 dwy0Var = null;
                if (action != null) {
                    Set<String> categories = intent.getCategories();
                    if (categories == null || (str = (String) o7h.W0(categories)) == null || (component = intent.getComponent()) == null || (className = component.getClassName()) == null) {
                        dwy0Var = null;
                    } else {
                        if (i2 == 1) {
                            str2 = "ACTIVITY";
                        } else {
                            if (i2 != 2) {
                                throw null;
                            }
                            str2 = "BROADCAST";
                        }
                        Uri data = intent.getData();
                        dwy0Var = new dwy0(action, str, className, str2, data != null ? data.toString() : null);
                    }
                }
                if (dwy0Var != null) {
                    h(i, dwy0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activity;
    }

    public final void g(Set set) {
        List listE = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (!set.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        hma1 hma1VarEdit = this.b.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hma1VarEdit.f(a(((Number) it.next()).intValue()));
        }
        if (arrayList.isEmpty()) {
            hma1VarEdit.f(fwy0.a);
        } else {
            hma1VarEdit.d(fwy0.a, this.c.b(fwy0.b, arrayList));
        }
        hma1VarEdit.h();
    }

    public final void h(int i, dwy0 dwy0Var) {
        bma1 bma1VarA = a(i);
        dma1 dma1Var = this.b;
        w7x w7xVar = w7x.a;
        w7x w7xVarB = dma1Var.b(bma1VarA, w7xVar);
        if (w7xVarB != null) {
            w7xVar = w7xVarB;
        }
        Set setO1 = o7h.o1((Iterable) w7xVar);
        nma0 nma0VarSerializer = dwy0.Companion.serializer();
        nfa0 nfa0Var = this.c;
        setO1.add(nfa0Var.b(nma0VarSerializer, dwy0Var));
        List listE = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (((Number) obj).intValue() != i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListO0 = o7h.O0(Integer.valueOf(i), arrayList);
        int size = arrayListO0.size() - 30;
        if (size < 0) {
            size = 0;
        }
        Set setP1 = o7h.p1(o7h.d1(arrayListO0, size));
        List listE1 = o7h.e1(30, arrayListO0);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.e(bma1VarA, setO1);
        hma1VarEdit.d(fwy0.a, nfa0Var.b(fwy0.b, listE1));
        Iterator it = setP1.iterator();
        while (it.hasNext()) {
            hma1VarEdit.f(a(((Number) it.next()).intValue()));
        }
        hma1VarEdit.h();
    }
}
