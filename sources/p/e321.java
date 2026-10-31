package p;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e321 implements o2e {
    public static final pue0 j = new pue0("RemoteMediaClient", (String) null);
    public final Object a;
    public final jim0 b;
    public final knn1 c;
    public final zrj1 d;
    public final koh0 e;
    public arn1 f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final ConcurrentHashMap i;

    static {
        String str = knn1.u;
    }

    public e321(knn1 knn1Var) {
        new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.a = new Object();
        this.b = new jim0(Looper.getMainLooper(), (byte) 5);
        zrj1 zrj1Var = new zrj1(this);
        this.d = zrj1Var;
        this.c = knn1Var;
        knn1Var.h = new hql1(this);
        ((sxn1) knn1Var).c = zrj1Var;
        koh0 koh0Var = new koh0();
        koh0Var.m = Collections.synchronizedSet(new HashSet());
        koh0Var.b = new pue0("MediaQueue", (String) null);
        koh0Var.c = this;
        koh0Var.d = new ArrayList();
        koh0Var.e = new SparseIntArray();
        koh0Var.g = new ArrayList();
        koh0Var.h = new ArrayDeque(20);
        koh0Var.i = new jim0(Looper.getMainLooper(), (byte) 5);
        koh0Var.j = new kbk1(koh0Var, (byte) 1);
        l(new oxo1(koh0Var, (byte) 0));
        koh0Var.f = new xoa(koh0Var);
        koh0Var.a = koh0Var.g();
        koh0Var.e();
        this.e = koh0Var;
    }

    public static jub1 q() {
        jub1 jub1Var = new jub1(null, (byte) 1);
        jub1Var.g(new won1(jub1Var, new Status(17, (String) null, (PendingIntent) null, (lal) null)));
        return jub1Var;
    }

    public static final void s(wpn1 wpn1Var) {
        try {
            wpn1Var.n();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            wpn1Var.g(new won1(wpn1Var, new Status(2100, (String) null, (PendingIntent) null, (lal) null)));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p.o2e
    public final void a(CastDevice castDevice, String str) {
        int i;
        int iJ;
        boolean z;
        j3i0 j3i0Var;
        int[] iArrH;
        knn1 knn1Var = this.c;
        mon1 mon1Var = knn1Var.j;
        List list = ((sxn1) knn1Var).d;
        pue0 pue0Var = ((sxn1) knn1Var).a;
        pue0Var.a("message received: %s", new Object[]{str});
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long jOptLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        mon1Var.d(jOptLong, 2101, knn1.n(jSONObject));
                    }
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        knn1Var.s.d(jOptLong, 0, null);
                        knn1Var.g("QUEUE_ITEMS", jSONObject);
                        if (knn1Var.h != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            quh0[] quh0VarArr = new quh0[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                quh0VarArr[i2] = new ruc0(jSONArray.getJSONObject(i2)).b();
                            }
                            Iterator it = ((e321) knn1Var.h.a).h.iterator();
                            while (it.hasNext()) {
                                ((oxo1) it.next()).o(quh0VarArr);
                            }
                        }
                    }
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        pue0Var.c("received unexpected error: Invalid Request.", new Object[0]);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((mon1) it2.next()).d(jOptLong, 2001, knn1.n(jSONObject));
                        }
                    }
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        mon1Var.d(jOptLong, 2100, knn1.n(jSONObject));
                    }
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((mon1) it3.next()).d(jOptLong, 2100, knn1.n(jSONObject));
                        }
                        if (knn1Var.h != null) {
                            MediaError.j(jSONObject);
                            Iterator it4 = ((e321) knn1Var.h.a).h.iterator();
                            while (it4.hasNext()) {
                                ((oxo1) it4.next()).getClass();
                            }
                        }
                    }
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        knn1Var.t.d(jOptLong, 0, null);
                        knn1Var.g("QUEUE_CHANGE", jSONObject);
                        if (knn1Var.h != null) {
                            String string2 = jSONObject.getString("changeType");
                            int[] iArrH2 = knn1.h(jSONObject.getJSONArray("itemIds"));
                            int iOptInt = jSONObject.optInt("insertBefore", 0);
                            if (iArrH2 != null) {
                                switch (string2.hashCode()) {
                                    case -2130463047:
                                        if (string2.equals("INSERT")) {
                                            Iterator it5 = ((e321) knn1Var.h.a).h.iterator();
                                            while (it5.hasNext()) {
                                                ((oxo1) it5.next()).i(iArrH2, iOptInt);
                                            }
                                        }
                                        break;
                                    case -1881281404:
                                        if (string2.equals("REMOVE")) {
                                            Iterator it6 = ((e321) knn1Var.h.a).h.iterator();
                                            while (it6.hasNext()) {
                                                ((oxo1) it6.next()).m(iArrH2);
                                            }
                                        }
                                        break;
                                    case -1785516855:
                                        if (string2.equals("UPDATE")) {
                                            int[] iArrH3 = knn1.h(jSONObject.getJSONArray("itemIds"));
                                            zod.t(iArrH3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                            if (jSONArrayOptJSONArray != null) {
                                                ArrayList arrayListE = o4e.e(iArrH3);
                                                int iOptInt2 = jSONObject.optInt("insertBefore", 0);
                                                int[] iArrH4 = knn1.h(jSONArrayOptJSONArray);
                                                zod.s(iArrH4);
                                                ArrayList arrayListE2 = o4e.e(iArrH4);
                                                Iterator it7 = ((e321) knn1Var.h.a).h.iterator();
                                                while (it7.hasNext()) {
                                                    ((oxo1) it7.next()).q(arrayListE, arrayListE2, iOptInt2);
                                                }
                                            } else {
                                                Iterator it8 = ((e321) knn1Var.h.a).h.iterator();
                                                while (it8.hasNext()) {
                                                    ((oxo1) it8.next()).g(iArrH3);
                                                }
                                            }
                                        }
                                        break;
                                    case 1122976047:
                                        if (string2.equals("ITEMS_CHANGE")) {
                                            Iterator it9 = ((e321) knn1Var.h.a).h.iterator();
                                            while (it9.hasNext()) {
                                                ((oxo1) it9.next()).k(iArrH2);
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        pue0Var.c("received unexpected error: Invalid Player State.", new Object[0]);
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            ((mon1) it10.next()).d(jOptLong, 2100, knn1.n(jSONObject));
                        }
                    }
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                            boolean zC = mon1Var.c(jOptLong);
                            mon1 mon1Var2 = knn1Var.n;
                            boolean z2 = true;
                            if (!mon1Var2.b() || mon1Var2.c(jOptLong)) {
                                mon1 mon1Var3 = knn1Var.o;
                                i = (!mon1Var3.b() || mon1Var3.c(jOptLong)) ? 0 : 1;
                            }
                            if (zC || (j3i0Var = knn1Var.f) == null) {
                                j3i0 j3i0Var2 = new j3i0(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                j3i0Var2.j(jSONObject2, 0);
                                knn1Var.f = j3i0Var2;
                                knn1Var.e = SystemClock.elapsedRealtime();
                                iJ = 127;
                            } else {
                                iJ = j3i0Var.j(jSONObject2, i);
                            }
                            if ((iJ & 1) != 0) {
                                knn1Var.e = SystemClock.elapsedRealtime();
                                knn1Var.i = -1;
                                z = true;
                            } else {
                                z = false;
                            }
                            if ((iJ & 2) != 0) {
                                knn1Var.e = SystemClock.elapsedRealtime();
                            } else {
                                z2 = z;
                            }
                            if ((iJ & 128) != 0) {
                                knn1Var.e = SystemClock.elapsedRealtime();
                            }
                            if ((iJ & 4) != 0) {
                                knn1Var.j();
                            }
                            if ((iJ & 8) != 0) {
                                knn1Var.k();
                            }
                            if ((iJ & 16) != 0) {
                                knn1Var.l();
                            }
                            if ((iJ & 32) != 0) {
                                knn1Var.e = SystemClock.elapsedRealtime();
                                hql1 hql1Var = knn1Var.h;
                                if (hql1Var != null) {
                                    hql1Var.c();
                                }
                            }
                            if ((iJ & 64) != 0) {
                                knn1Var.e = SystemClock.elapsedRealtime();
                            } else if (z2) {
                            }
                            knn1Var.i();
                        } else {
                            knn1Var.f = null;
                            knn1Var.i();
                            knn1Var.j();
                            knn1Var.k();
                            knn1Var.l();
                        }
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            ((mon1) it11.next()).d(jOptLong, 0, null);
                        }
                    }
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        knn1Var.r.d(jOptLong, 0, null);
                        knn1Var.g("QUEUE_ITEM_IDS", jSONObject);
                        if (knn1Var.h != null && (iArrH = knn1.h(jSONObject.getJSONArray("itemIds"))) != null) {
                            Iterator it12 = ((e321) knn1Var.h.a).h.iterator();
                            while (it12.hasNext()) {
                                ((oxo1) it12.next()).g(iArrH);
                            }
                            break;
                        }
                    }
                    break;
            }
        } catch (JSONException e) {
            pue0Var.c("Message is malformed (%s); ignoring: %s", new Object[]{e.getMessage(), str});
        }
    }

    public final long b() {
        long jO;
        synchronized (this.a) {
            zod.n("Must be called from the main thread.");
            jO = this.c.o();
        }
        return jO;
    }

    public final MediaInfo c() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            zod.n("Must be called from the main thread.");
            j3i0 j3i0Var = this.c.f;
            mediaInfo = j3i0Var == null ? null : j3i0Var.a;
        }
        return mediaInfo;
    }

    public final j3i0 d() {
        j3i0 j3i0Var;
        synchronized (this.a) {
            zod.n("Must be called from the main thread.");
            j3i0Var = this.c.f;
        }
        return j3i0Var;
    }

    public final int e() {
        int i;
        synchronized (this.a) {
            try {
                zod.n("Must be called from the main thread.");
                j3i0 j3i0VarD = d();
                i = j3i0VarD != null ? j3i0VarD.e : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final long f() {
        long j2;
        synchronized (this.a) {
            zod.n("Must be called from the main thread.");
            j3i0 j3i0Var = this.c.f;
            MediaInfo mediaInfo = j3i0Var == null ? null : j3i0Var.a;
            j2 = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j2;
    }

    public final boolean g() {
        zod.n("Must be called from the main thread.");
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD = d();
        if (j3i0VarD != null && j3i0VarD.e == 4) {
            return true;
        }
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD2 = d();
        if (j3i0VarD2 != null && j3i0VarD2.e == 5) {
            return true;
        }
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD3 = d();
        return (j3i0VarD3 != null && j3i0VarD3.e == 2) || j() || i();
    }

    public final boolean h() {
        zod.n("Must be called from the main thread.");
        MediaInfo mediaInfoC = c();
        return mediaInfoC != null && mediaInfoC.b == 2;
    }

    public final boolean i() {
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD = d();
        return (j3i0VarD == null || j3i0VarD.Y == 0) ? false : true;
    }

    public final boolean j() {
        int i;
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD = d();
        if (j3i0VarD == null) {
            return false;
        }
        if (j3i0VarD.e == 3) {
            return true;
        }
        if (!h()) {
            return false;
        }
        synchronized (this.a) {
            try {
                zod.n("Must be called from the main thread.");
                j3i0 j3i0VarD2 = d();
                i = j3i0VarD2 != null ? j3i0VarD2.f : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i == 2;
    }

    public final boolean k() {
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD = d();
        return j3i0VarD != null && j3i0VarD.R0;
    }

    public final void l(oxo1 oxo1Var) {
        zod.n("Must be called from the main thread.");
        if (oxo1Var != null) {
            this.h.add(oxo1Var);
        }
    }

    public final void m() {
        zod.n("Must be called from the main thread.");
        int iE = e();
        if (iE == 4 || iE == 2) {
            zod.n("Must be called from the main thread.");
            if (r()) {
                s(new ren1(this, (byte) 3, false));
                return;
            } else {
                q();
                return;
            }
        }
        zod.n("Must be called from the main thread.");
        if (r()) {
            s(new ren1(this, (byte) 4, false));
        } else {
            q();
        }
    }

    public final void n(arn1 arn1Var) {
        zrj1 zrj1Var = this.d;
        arn1 arn1Var2 = this.f;
        if (arn1Var2 == arn1Var) {
            return;
        }
        if (arn1Var2 != null) {
            knn1 knn1Var = this.c;
            List list = ((sxn1) knn1Var).d;
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mon1) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            knn1Var.m();
            this.e.d();
            zod.n("Must be called from the main thread.");
            arn1Var2.t(((sxn1) this.c).b);
            zrj1Var.b = null;
            this.b.removeCallbacksAndMessages(null);
        }
        this.f = arn1Var;
        if (arn1Var != null) {
            zrj1Var.b = arn1Var;
        }
    }

    public final void o() {
        arn1 arn1Var = this.f;
        if (arn1Var == null) {
            return;
        }
        zod.n("Must be called from the main thread.");
        arn1Var.s(((sxn1) this.c).b, this);
        zod.n("Must be called from the main thread.");
        if (r()) {
            s(new ren1(this, (byte) 5));
        } else {
            q();
        }
    }

    public final int p() {
        if (c() == null || !g()) {
            return 0;
        }
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD = d();
        if (j3i0VarD != null && j3i0VarD.e == 4) {
            return 6;
        }
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD2 = d();
        if (j3i0VarD2 != null && j3i0VarD2.e == 2) {
            return 3;
        }
        if (j()) {
            return 2;
        }
        if (!i()) {
            return 0;
        }
        zod.n("Must be called from the main thread.");
        j3i0 j3i0VarD3 = d();
        quh0 quh0Var = null;
        if (j3i0VarD3 != null) {
            Integer num = (Integer) j3i0VarD3.X0.get(j3i0VarD3.Y);
            if (num != null) {
                quh0Var = (quh0) j3i0VarD3.Q0.get(num.intValue());
            }
        }
        return (quh0Var == null || quh0Var.a == null) ? 0 : 6;
    }

    public final boolean r() {
        return this.f != null;
    }
}
