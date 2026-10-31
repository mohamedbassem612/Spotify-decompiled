package p;

import android.net.Uri;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class koh0 {
    public long a;
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f = new loh0();
    public Object g = new ooh0();
    public Object h = Collections.EMPTY_LIST;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public koh0() {
        w280 w280Var = b380.b;
        this.i = bg11.e;
        this.l = new qoh0();
        this.m = toh0.d;
        this.a = -9223372036854775807L;
    }

    public yoh0 a() {
        soh0 soh0Var;
        ooh0 ooh0Var = (ooh0) this.g;
        dm5.y(((Uri) ooh0Var.e) == null || ((UUID) ooh0Var.d) != null);
        Uri uri = (Uri) this.e;
        if (uri != null) {
            String str = (String) this.c;
            ooh0 ooh0Var2 = (ooh0) this.g;
            soh0Var = new soh0(uri, str, ((UUID) ooh0Var2.d) != null ? new poh0(ooh0Var2) : null, (joh0) this.j, (List) this.h, (String) this.d, (b380) this.i, this.a);
        } else {
            soh0Var = null;
        }
        String str2 = (String) this.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        loh0 loh0Var = (loh0) this.f;
        loh0Var.getClass();
        noh0 noh0Var = new noh0(loh0Var);
        qoh0 qoh0Var = (qoh0) this.l;
        qoh0Var.getClass();
        roh0 roh0Var = new roh0(qoh0Var);
        tqh0 tqh0Var = (tqh0) this.k;
        if (tqh0Var == null) {
            tqh0Var = tqh0.M;
        }
        return new yoh0(str3, noh0Var, soh0Var, roh0Var, tqh0Var, (toh0) this.m);
    }

    public void b(List list) {
        this.h = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
    }

    public void c(String str) {
        this.e = str == null ? null : Uri.parse(str);
    }

    public void d() {
        h();
        ((ArrayList) this.d).clear();
        ((SparseIntArray) this.e).clear();
        ((xoa) this.f).evictAll();
        ((ArrayList) this.g).clear();
        ((jim0) this.i).removeCallbacks((kbk1) this.j);
        ((ArrayDeque) this.h).clear();
        BasePendingResult basePendingResult = (BasePendingResult) this.l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = (BasePendingResult) this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.k = null;
        }
        j();
        i();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [p.vso1] */
    public void e() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResultQ;
        zod.n("Must be called from the main thread.");
        if (this.a != 0 && (basePendingResult = (BasePendingResult) this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.l = null;
            }
            BasePendingResult basePendingResult2 = (BasePendingResult) this.k;
            if (basePendingResult2 != null) {
                basePendingResult2.c();
                this.k = null;
            }
            e321 e321Var = (e321) this.c;
            e321Var.getClass();
            zod.n("Must be called from the main thread.");
            if (e321Var.r()) {
                ren1 ren1Var = new ren1(e321Var, (byte) 2);
                e321.s(ren1Var);
                basePendingResultQ = ren1Var;
            } else {
                basePendingResultQ = e321.q();
            }
            this.l = basePendingResultQ;
            final byte b = 1;
            basePendingResultQ.h((vso1) new Object(this) { // from class: p.vso1
                public final /* synthetic */ koh0 b;

                {
                    this.b = this;
                }

                public final void a(p331 p331Var) {
                    byte b2 = b;
                    koh0 koh0Var = this.b;
                    won1 won1Var = (won1) p331Var;
                    switch (b2) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            Status status = won1Var.getStatus();
                            int i = status.a;
                            if (i != 0) {
                                ((pue0) koh0Var.b).c(ab80.n("Error fetching queue items, statusCode=", ", statusMessage=", i, status.b), new Object[0]);
                            }
                            koh0Var.k = null;
                            if (!((ArrayDeque) koh0Var.h).isEmpty()) {
                                jim0 jim0Var = (jim0) koh0Var.i;
                                kbk1 kbk1Var = (kbk1) koh0Var.j;
                                jim0Var.removeCallbacks(kbk1Var);
                                jim0Var.postDelayed(kbk1Var, 500L);
                            }
                            break;
                        default:
                            Status status2 = won1Var.getStatus();
                            int i2 = status2.a;
                            if (i2 != 0) {
                                ((pue0) koh0Var.b).c(ab80.n("Error fetching queue item ids, statusCode=", ", statusMessage=", i2, status2.b), new Object[0]);
                            }
                            koh0Var.l = null;
                            if (!((ArrayDeque) koh0Var.h).isEmpty()) {
                                jim0 jim0Var2 = (jim0) koh0Var.i;
                                kbk1 kbk1Var2 = (kbk1) koh0Var.j;
                                jim0Var2.removeCallbacks(kbk1Var2);
                                jim0Var2.postDelayed(kbk1Var2, 500L);
                            }
                            break;
                    }
                }
            });
        }
    }

    public /* synthetic */ void f() {
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        sparseIntArray.clear();
        for (int i = 0; i < ((ArrayList) this.d).size(); i++) {
            sparseIntArray.put(((Integer) ((ArrayList) this.d).get(i)).intValue(), i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public long g() {
        j3i0 j3i0VarD = ((e321) this.c).d();
        if (j3i0VarD == null) {
            return 0L;
        }
        MediaInfo mediaInfo = j3i0VarD.a;
        int i = mediaInfo == null ? -1 : mediaInfo.b;
        int i2 = j3i0VarD.e;
        int i3 = j3i0VarD.f;
        int i4 = j3i0VarD.Y;
        if (i2 == 1) {
            if (i3 == 1) {
                if (i4 == 0) {
                    return 0L;
                }
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return 0L;
                }
                if (i4 == 0) {
                    return 0L;
                }
            } else if (i != 2) {
                return 0L;
            }
        }
        return j3i0VarD.b;
    }

    public void h() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
