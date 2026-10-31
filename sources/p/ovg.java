package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase;
import com.ravelin.core.repository.db.AppDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ovg implements bep0, g7n1 {
    public static final String m;
    public final BroadcastsDatabase a;
    public final g7n1 b;
    public final SharedPreferences c;
    public final o9b0 d;
    public final f7n1 e;
    public final wug f;
    public volatile int g;
    public volatile int h;
    public volatile String i;
    public volatile long j;
    public volatile String k;
    public volatile DeviceId l;

    static {
        String canonicalName = ovg.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = ovg.class.getSimpleName();
        }
        m = canonicalName;
    }

    public ovg(AppDatabase appDatabase, BroadcastsDatabase broadcastsDatabase, g7n1 g7n1Var, SharedPreferences sharedPreferences, o9b0 o9b0Var) {
        this.a = broadcastsDatabase;
        this.b = g7n1Var;
        this.c = sharedPreferences;
        this.d = o9b0Var;
        this.e = appDatabase.u();
        this.f = broadcastsDatabase.u();
    }

    public static boolean h(List list) {
        Long l;
        String str;
        if (list.isEmpty()) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nvg nvgVar = (nvg) it.next();
            String str2 = nvgVar.c;
            if (str2 == null || str2.length() == 0 || (l = nvgVar.d) == null || l.longValue() == 0 || (str = nvgVar.b) == null || str.length() == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p.g7n1
    public final int a() {
        return this.b.a();
    }

    @Override // p.bep0
    public final boolean b() {
        return this.c.getLong("last-synchronization", 0L) == 0;
    }

    @Override // p.g7n1
    public final z6n1 c(String str) {
        return this.b.c(str);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019b, code lost:
    
        if (l(r9, r8, r5) == r7) goto L72;
     */
    @Override // p.bep0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r21, java.util.List r22, java.lang.Long r23, p.lnm r24) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ovg.d(android.content.Context, java.util.List, java.lang.Long, p.lnm):java.lang.Object");
    }

    @Override // p.g7n1
    public final void e(Context context, String str) {
        this.b.e(context, str);
    }

    @Override // p.g7n1
    public final boolean f(String str) {
        return this.b.f(str);
    }

    @Override // p.g7n1
    public final ServiceConnection g(String str) {
        return this.b.g(str);
    }

    public final void i(Context context, List list) {
        g7n1 g7n1Var;
        String strL = l1d.l(System.currentTimeMillis(), "***Debug starting to send request for ID at: ");
        utw0 utw0Var = ike1.a;
        utw0Var.y(m);
        int i = 0;
        utw0Var.o(strL, new Object[0]);
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!u890.j(((ComponentName) obj).getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            g7n1Var = this.b;
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            if (g7n1Var.f(((ComponentName) obj2).getPackageName())) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            z6n1 z6n1VarC = g7n1Var.c(((ComponentName) obj3).getPackageName());
            if (z6n1VarC != null) {
                z6n1VarC.v0(new hvg(this));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.String[]] */
    public final Serializable j(onm onmVar) {
        dvg dvgVar;
        ovg ovgVar = this;
        if (onmVar instanceof dvg) {
            dvgVar = (dvg) onmVar;
            int i = dvgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvgVar.d = i - Integer.MIN_VALUE;
            } else {
                dvgVar = new dvg(ovgVar, onmVar);
            }
        } else {
            dvgVar = new dvg(ovgVar, onmVar);
        }
        Object objZ = dvgVar.b;
        d9n d9nVar = d9n.a;
        int i2 = dvgVar.d;
        byte b = 1;
        if (i2 == 0) {
            hm5.M(objZ);
            wug wugVar = ovgVar.f;
            dvgVar.a = ovgVar;
            dvgVar.d = 1;
            objZ = qyo1.z(dvgVar, new u1c((byte) 8), wugVar.a, true, false);
            if (objZ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ovgVar = dvgVar.a;
            hm5.M(objZ);
        }
        List list = (List) objZ;
        s6n1 s6n1VarA = ovgVar.e.a();
        String str = m;
        utw0 utw0Var = ike1.a;
        utw0Var.y(str);
        utw0Var.o("***Debug broadcasts: " + list, new Object[0]);
        String str2 = "***Debug broadcasts valid: " + h(list);
        utw0Var.y(str);
        utw0Var.o(str2, new Object[0]);
        boolean zH = h(list);
        if (!zH) {
            return new String[0];
        }
        if (!zH) {
            eg.o();
            return null;
        }
        List listA1 = o7h.a1(list, new zbg(b));
        if (s6n1VarA != null) {
            nvg nvgVar = (nvg) listA1.get(0);
            if (!u890.j(nvgVar.b, s6n1VarA.i) || !u890.j(nvgVar.c, s6n1VarA.b)) {
                Long l = nvgVar.d;
                long jLongValue = l != null ? l.longValue() : 0L;
                Long l2 = s6n1VarA.j;
                if (jLongValue < (l2 != null ? l2.longValue() : 0L)) {
                    String str3 = nvgVar.c;
                    String str4 = s6n1VarA.c;
                    String str5 = s6n1VarA.d;
                    String str6 = s6n1VarA.e;
                    String str7 = s6n1VarA.f;
                    String str8 = s6n1VarA.g;
                    String str9 = s6n1VarA.h;
                    String str10 = nvgVar.b;
                    Long l3 = nvgVar.d;
                    s6n1 s6n1Var = new s6n1(str3, str4, str5, str6, str7, str8, str9, str10, Long.valueOf(l3 != null ? l3.longValue() : 0L), 1);
                    ovgVar.l = new DeviceId(s6n1Var);
                    f7n1 f7n1Var = ovgVar.e;
                    qyo1.x(f7n1Var.a, false, true, new vae1(f7n1Var, s6n1Var, (byte) 18));
                }
            }
        }
        nvg nvgVar2 = (nvg) listA1.get(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA1) {
            nvg nvgVar3 = (nvg) obj;
            if (!u890.j(nvgVar3.d, nvgVar2.d) || !u890.j(nvgVar3.c, nvgVar2.c) || !u890.j(nvgVar3.b, nvgVar2.b)) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return new String[0];
        }
        ovgVar.i = nvgVar2.c;
        Long l4 = nvgVar2.d;
        ovgVar.j = l4 != null ? l4.longValue() : 0L;
        ovgVar.k = nvgVar2.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(((nvg) obj2).b);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            if (((String) obj3) != null) {
                arrayList3.add(obj3);
            }
        }
        return (String[]) arrayList3.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object k(Context context, List list, long j, onm onmVar) {
        fvg fvgVar;
        Context context2 = context;
        long j2 = j;
        if (onmVar instanceof fvg) {
            fvgVar = (fvg) onmVar;
            int i = fvgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fvgVar.f = i - Integer.MIN_VALUE;
            } else {
                fvgVar = new fvg(this, onmVar);
            }
        } else {
            fvgVar = new fvg(this, onmVar);
        }
        Object obj = fvgVar.d;
        d9n d9nVar = d9n.a;
        int i2 = fvgVar.f;
        if (i2 == 0) {
            hm5.M(obj);
            try {
                jvg jvgVar = new jvg(this, context2, list, null);
                fvgVar.a = context2;
                fvgVar.b = list;
                fvgVar.c = j2;
                fvgVar.f = 1;
                if (rc2.M(j2, jvgVar, fvgVar) == d9nVar) {
                    return d9nVar;
                }
            } catch (TimeoutCancellationException e) {
                e = e;
                this.h = this.b.a();
                if (this.h == 0 && j2 >= 5000) {
                    DeviceId.Companion.lpt2(context2);
                    this.d.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", (String) null, new ErrorMetadata(107, "Initialization", "Binding to server app timed out", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                }
                String str = m;
                String strM = l1d.m("Timeout binding services: ", e.getMessage());
                utw0 utw0Var = ike1.a;
                utw0Var.y(str);
                utw0Var.A(strM, new Object[0]);
                String str2 = "***Debug binding process has reached timeout: " + e.getMessage();
                utw0Var.y(str);
                utw0Var.o(str2, new Object[0]);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = fvgVar.c;
            List list2 = fvgVar.b;
            Context context3 = fvgVar.a;
            try {
                hm5.M(obj);
            } catch (TimeoutCancellationException e2) {
                e = e2;
                context2 = context3;
                j2 = j3;
                this.h = this.b.a();
                if (this.h == 0) {
                    DeviceId.Companion.lpt2(context2);
                    this.d.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", (String) null, new ErrorMetadata(107, "Initialization", "Binding to server app timed out", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                }
                String str3 = m;
                String strM2 = l1d.m("Timeout binding services: ", e.getMessage());
                utw0 utw0Var2 = ike1.a;
                utw0Var2.y(str3);
                utw0Var2.A(strM2, new Object[0]);
                String str4 = "***Debug binding process has reached timeout: " + e.getMessage();
                utw0Var2.y(str3);
                utw0Var2.o(str4, new Object[0]);
            }
        }
        return rih1.a;
    }

    public final Object l(Context context, List list, ivg ivgVar) {
        String str = m;
        utw0 utw0Var = ike1.a;
        utw0Var.y(str);
        utw0Var.o("***Debug DeviceIdServiceHelper cleanup ", new Object[0]);
        String str2 = "***Debug components size: " + list.size();
        utw0Var.y(str);
        utw0Var.o(str2, new Object[0]);
        String str3 = "***Debug valid services count: " + this.h;
        utw0Var.y(str);
        utw0Var.o(str3, new Object[0]);
        if (b() && (list.size() == 1 || this.h >= 1)) {
            this.c.edit().putLong("last-synchronization", System.currentTimeMillis()).apply();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e(context, ((ComponentName) it.next()).getPackageName());
        }
        this.g = 0;
        rih1 rih1Var = rih1.a;
        Object objZ = qyo1.z(ivgVar, new u1c((byte) 7), this.f.a, false, true);
        d9n d9nVar = d9n.a;
        if (objZ != d9nVar) {
            objZ = rih1Var;
        }
        if (objZ != d9nVar) {
            objZ = rih1Var;
        }
        return objZ == d9nVar ? objZ : rih1Var;
    }

    public final void m(String[] strArr) {
        String str = m;
        String str2 = "***Debug toUpdate list: " + f46.Q0(strArr);
        utw0 utw0Var = ike1.a;
        utw0Var.y(str);
        utw0Var.o(str2, new Object[0]);
        if (this.i == null || this.j == 0 || this.k == null || strArr.length == 0) {
            return;
        }
        nqt nqtVar = new nqt();
        nqtVar.b = this.i;
        nqtVar.c = this.j;
        nqtVar.a = this.k;
        for (String str3 : strArr) {
            z6n1 z6n1VarC = this.b.c(str3);
            boolean zF = this.b.f(str3);
            Boolean boolValueOf = Boolean.valueOf(zF);
            if (!zF) {
                boolValueOf = null;
            }
            if (boolValueOf != null && z6n1VarC != null) {
                z6n1VarC.m0(nqtVar);
            }
        }
    }
}
