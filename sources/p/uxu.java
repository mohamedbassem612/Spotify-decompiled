package p;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.database.DatabaseIOException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uxu extends Handler {
    public final HandlerThread a;
    public final qvr b;
    public final toj0 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public uxu(HandlerThread handlerThread, qvr qvrVar, toj0 toj0Var, Handler handler, int i, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = qvrVar;
        this.c = toj0Var;
        this.d = handler;
        this.i = i;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static kru a(kru kruVar, int i, int i2) {
        return new kru(kruVar.a, i, kruVar.c, System.currentTimeMillis(), kruVar.e, i2, 0, kruVar.h);
    }

    public final kru b(String str, boolean z) {
        int iC = c(str);
        if (iC != -1) {
            return (kru) this.e.get(iC);
        }
        if (!z) {
            return null;
        }
        try {
            return this.b.d(str);
        } catch (IOException e) {
            oon1.w("Failed to load download: " + str, e);
            return null;
        }
    }

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((kru) arrayList.get(i)).a.a.equals(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void d(kru kruVar) throws DatabaseIOException {
        int i = kruVar.b;
        dm5.y((i == 3 || i == 4) ? false : true);
        int iC = c(kruVar.a.a);
        ArrayList arrayList = this.e;
        if (iC == -1) {
            arrayList.add(kruVar);
            Collections.sort(arrayList, new m((byte) 14));
        } else {
            boolean z = kruVar.c != ((kru) arrayList.get(iC)).c;
            arrayList.set(iC, kruVar);
            if (z) {
                Collections.sort(arrayList, new m((byte) 14));
            }
        }
        try {
            this.b.i(kruVar);
        } catch (IOException e) {
            oon1.w("Failed to update index.", e);
        }
        this.d.obtainMessage(3, new txu(kruVar, false, new ArrayList(arrayList), (Exception) null)).sendToTarget();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final kru e(kru kruVar, int i, int i2) throws DatabaseIOException {
        dm5.y((i == 3 || i == 4) ? false : true);
        kru kruVarA = a(kruVar, i, i2);
        d(kruVarA);
        return kruVarA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void f(kru kruVar, int i) throws DatabaseIOException {
        if (i == 0) {
            if (kruVar.b == 1) {
                e(kruVar, 0, 0);
            }
        } else if (i != kruVar.f) {
            int i2 = kruVar.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new kru(kruVar.a, i2, kruVar.c, System.currentTimeMillis(), kruVar.e, i, 0, kruVar.h));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void g() throws DatabaseIOException {
        vxu vxuVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            kru kruVar = (kru) arrayList.get(i);
            j0v j0vVar = kruVar.a;
            String str = j0vVar.a;
            HashMap map = this.f;
            vxu vxuVar2 = (vxu) map.get(str);
            int i3 = kruVar.b;
            toj0 toj0Var = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        vxuVar2.getClass();
                        dm5.y(!vxu.a(vxuVar2));
                        if (this.h || this.g != 0 || i2 >= this.i) {
                            e(kruVar, 0, 0);
                            vxuVar2.e(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            bhn0.w();
                            return;
                        }
                        if (vxuVar2 != null) {
                            if (!vxu.a(vxuVar2)) {
                                vxuVar2.e(false);
                            }
                        } else if (!this.l) {
                            vxu vxuVar3 = new vxu(kruVar.a, toj0Var.i(j0vVar), kruVar.h, true, this.j, this);
                            map.put(j0vVar.a, vxuVar3);
                            this.l = true;
                            vxuVar3.start();
                        }
                    }
                } else if (vxuVar2 != null) {
                    dm5.y(!vxu.a(vxuVar2));
                    vxuVar2.e(false);
                }
            } else if (vxuVar2 != null) {
                dm5.y(!vxu.a(vxuVar2));
                vxuVar2.e(false);
            } else {
                if (this.h || this.g != 0 || this.k >= this.i) {
                    vxuVar = null;
                } else {
                    kru kruVarE = e(kruVar, 2, 0);
                    j0v j0vVar2 = kruVarE.a;
                    vxuVar = new vxu(kruVarE.a, toj0Var.i(j0vVar2), kruVarE.h, false, this.j, this);
                    map.put(j0vVar2.a, vxuVar);
                    int i4 = this.k;
                    this.k = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(12, 5000L);
                    }
                    vxuVar.start();
                }
                vxuVar2 = vxuVar;
            }
            if (vxuVar2 != null && !vxu.a(vxuVar2)) {
                i2++;
            }
            i++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        int i = 7;
        Closeable closeable = null;
        i = 0;
        int i2 = 0;
        switch (message.what) {
            case 1:
                int i3 = message.arg1;
                qvr qvrVar = this.b;
                ArrayList arrayList = this.e;
                this.g = i3;
                try {
                    try {
                        qvrVar.k();
                        qvrVar.b();
                        Closeable pvrVar = new pvr(qvrVar.c(qvr.g(0, 1, 2, 5, 7), null));
                        while (pvrVar.moveToNext()) {
                            try {
                                arrayList.add(pvrVar.a());
                            } catch (IOException e) {
                                e = e;
                                closeable = pvrVar;
                                oon1.w("Failed to load index.", e);
                                arrayList.clear();
                                zoi1.h(closeable);
                            } catch (Throwable th) {
                                th = th;
                                closeable = pvrVar;
                                zoi1.h(closeable);
                                throw th;
                            }
                        }
                        zoi1.h(pvrVar);
                    } catch (IOException e2) {
                        e = e2;
                    }
                    this.d.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                    g();
                    i2 = 1;
                    this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            case 2:
                this.h = message.arg1 != 0;
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 3:
                this.g = message.arg1;
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 4:
                String str = (String) message.obj;
                int i4 = message.arg1;
                qvr qvrVar2 = this.b;
                ArrayList arrayList2 = this.e;
                if (str != null) {
                    kru kruVarB = b(str, false);
                    if (kruVarB != null) {
                        f(kruVarB, i4);
                    } else {
                        try {
                            qvrVar2.m(i4, str);
                        } catch (IOException e3) {
                            oon1.w("Failed to set manual stop reason: ".concat(str), e3);
                        }
                    }
                    break;
                } else {
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        f((kru) arrayList2.get(i5), i4);
                    }
                    try {
                        qvrVar2.b();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i4));
                            qvrVar2.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, qvr.e, null);
                        } catch (SQLException e4) {
                            throw new DatabaseIOException(e4);
                        }
                    } catch (IOException e5) {
                        oon1.w("Failed to set manual stop reason", e5);
                    }
                    break;
                }
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 5:
                this.i = message.arg1;
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 6:
                this.j = message.arg1;
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 7:
                j0v j0vVar = (j0v) message.obj;
                int i6 = message.arg1;
                kru kruVarB2 = b(j0vVar.a, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (kruVarB2 != null) {
                    int i7 = kruVarB2.b;
                    long j = (i7 == 5 || kruVarB2.c()) ? jCurrentTimeMillis : kruVarB2.c;
                    if (i7 != 5 && i7 != 7) {
                        i = i6 != 0 ? 1 : 0;
                    }
                    d(new kru(kruVarB2.a.a(j0vVar), i, j, jCurrentTimeMillis, i6));
                } else {
                    d(new kru(j0vVar, i6 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i6));
                }
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 8:
                String str2 = (String) message.obj;
                kru kruVarB3 = b(str2, true);
                if (kruVarB3 == null) {
                    oon1.v("Failed to remove nonexistent download: " + str2);
                } else {
                    e(kruVarB3, 5, 0);
                    g();
                }
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 9:
                qvr qvrVar3 = this.b;
                ArrayList arrayList3 = this.e;
                ArrayList arrayList4 = new ArrayList();
                try {
                    qvrVar3.b();
                    pvr pvrVar2 = new pvr(qvrVar3.c(qvr.g(3, 4), null));
                    while (pvrVar2.moveToNext()) {
                        try {
                            arrayList4.add(pvrVar2.a());
                        } catch (Throwable th3) {
                            try {
                                pvrVar2.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    pvrVar2.close();
                } catch (IOException unused) {
                    oon1.v("Failed to load downloads.");
                }
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    arrayList3.set(i8, a((kru) arrayList3.get(i8), 5, 0));
                }
                for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                    arrayList3.add(a((kru) arrayList4.get(i9), 5, 0));
                }
                Collections.sort(arrayList3, new m((byte) 14));
                try {
                    qvrVar3.l();
                    break;
                } catch (IOException e6) {
                    oon1.w("Failed to update index.", e6);
                }
                ArrayList arrayList5 = new ArrayList(arrayList3);
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    this.d.obtainMessage(3, new txu((kru) arrayList3.get(i10), false, arrayList5, (Exception) null)).sendToTarget();
                }
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 10:
                vxu vxuVar = (vxu) message.obj;
                Handler handler = this.d;
                qvr qvrVar4 = this.b;
                ArrayList arrayList6 = this.e;
                String str3 = vxu.b(vxuVar).a;
                this.f.remove(str3);
                boolean zA = vxu.a(vxuVar);
                if (zA) {
                    this.l = false;
                } else {
                    int i11 = this.k - 1;
                    this.k = i11;
                    if (i11 == 0) {
                        removeMessages(12);
                    }
                }
                if (vxu.c(vxuVar)) {
                    g();
                } else {
                    Exception excD = vxu.d(vxuVar);
                    if (excD != null) {
                        oon1.w("Task failed: " + vxu.b(vxuVar) + ", " + zA, excD);
                    }
                    kru kruVarB4 = b(str3, false);
                    kruVarB4.getClass();
                    int i12 = kruVarB4.b;
                    if (i12 == 2) {
                        dm5.y(!zA);
                        kru kruVar = new kru(kruVarB4.a, excD == null ? 3 : 4, kruVarB4.c, System.currentTimeMillis(), kruVarB4.e, kruVarB4.f, excD == null ? 0 : 1, kruVarB4.h);
                        arrayList6.remove(c(kruVar.a.a));
                        try {
                            qvrVar4.i(kruVar);
                        } catch (IOException e7) {
                            oon1.w("Failed to update index.", e7);
                        }
                        handler.obtainMessage(3, new txu(kruVar, false, new ArrayList(arrayList6), excD)).sendToTarget();
                        break;
                    } else {
                        if (i12 != 5 && i12 != 7) {
                            bhn0.w();
                            return;
                        }
                        dm5.y(zA);
                        j0v j0vVar2 = kruVarB4.a;
                        if (i12 == 7) {
                            int i13 = kruVarB4.f;
                            e(kruVarB4, i13 == 0 ? 0 : 1, i13);
                            g();
                        } else {
                            arrayList6.remove(c(j0vVar2.a));
                            try {
                                String str4 = j0vVar2.a;
                                qvrVar4.b();
                                try {
                                    qvrVar4.b.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str4});
                                    handler.obtainMessage(3, new txu(kruVarB4, true, new ArrayList(arrayList6), (Exception) null)).sendToTarget();
                                } catch (SQLiteException e8) {
                                    throw new DatabaseIOException(e8);
                                }
                            } catch (IOException unused2) {
                                oon1.v("Failed to remove from database");
                            }
                        }
                    }
                    g();
                }
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 11:
                vxu vxuVar2 = (vxu) message.obj;
                int i14 = message.arg1;
                int i15 = message.arg2;
                String str5 = zoi1.a;
                long j2 = ((((long) i14) & 4294967295L) << 32) | (4294967295L & ((long) i15));
                kru kruVarB5 = b(vxu.b(vxuVar2).a, false);
                kruVarB5.getClass();
                if (j2 == kruVarB5.e || j2 == -1) {
                    return;
                }
                d(new kru(kruVarB5.a, kruVarB5.b, kruVarB5.c, System.currentTimeMillis(), j2, kruVarB5.f, kruVarB5.g, kruVarB5.h));
                return;
            case 12:
                ArrayList arrayList7 = this.e;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    kru kruVar2 = (kru) arrayList7.get(i16);
                    if (kruVar2.b == 2) {
                        try {
                            this.b.i(kruVar2);
                        } catch (IOException e9) {
                            oon1.w("Failed to update index.", e9);
                        }
                    }
                }
                sendEmptyMessageDelayed(12, 5000L);
                return;
            case 13:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((vxu) it.next()).e(true);
                }
                try {
                    this.b.k();
                    break;
                } catch (IOException e10) {
                    oon1.w("Failed to update index.", e10);
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                bhn0.w();
                return;
        }
    }
}
