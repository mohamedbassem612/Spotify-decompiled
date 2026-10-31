package p;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.media3.muxer.MuxerException;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.MuxerWrapper$AppendTrackFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pgg1 {
    public int A;
    public boolean B;
    public final Context a;
    public final b3k b;
    public final boolean c;
    public final cab d;
    public final lqr e;
    public final wdd1 f;
    public final long g;
    public final HandlerThread h;
    public final wdd1 i;
    public final ArrayList j;
    public final Object k;
    public final hce1 l;
    public final ArrayList m;
    public final dhn0 n;
    public final hsk o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f112p;
    public final Object q;
    public final ij81 r;
    public final Object s;
    public final b380 t;
    public final boolean u;
    public boolean v;
    public long w;
    public int x;
    public RuntimeException y;
    public int z;

    public pgg1(Context context, b3k b3kVar, zfg1 zfg1Var, z57 z57Var, hfb hfbVar, yys yysVar, gwg gwgVar, b380 b380Var, dhn0 dhn0Var, lqr lqrVar, yjq yjqVar, wdd1 wdd1Var, long j, LogSessionId logSessionId, boolean z) {
        LogSessionId logSessionId2;
        z57 igrVar;
        this.a = context;
        this.b = b3kVar;
        this.d = new cab(gwgVar, (byte) 22);
        this.t = b380Var;
        this.e = lqrVar;
        this.f = wdd1Var;
        this.g = j;
        this.n = dhn0Var;
        this.u = z;
        StringBuilder sbT = l1d.t("Init ", Integer.toHexString(System.identityHashCode(this)), " [AndroidXMedia3/1.11.0] [");
        sbT.append(zoi1.a);
        sbT.append("]");
        oon1.A(sbT.toString());
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        this.h = handlerThread;
        handlerThread.start();
        this.j = new ArrayList();
        Looper looper = handlerThread.getLooper();
        this.k = new Object();
        hce1 hce1Var = new hce1(b3kVar);
        b380 b380Var2 = (b380) b3kVar.b;
        this.l = hce1Var;
        byte b = 5;
        if (z57Var == null) {
            logSessionId2 = logSessionId;
            igrVar = new igr(context, new dn3(new zfr(context, (byte) 5)), logSessionId2);
        } else {
            logSessionId2 = logSessionId;
            igrVar = z57Var;
        }
        int i = 0;
        while (i < b380Var2.size()) {
            z57 z57Var2 = igrVar;
            this.j.add(new q561((f4w) b380Var2.get(i), z57Var2, new y57(zfg1Var.d, b3kVar.h), new ogg1(this, i, b3kVar, zfg1Var, hfbVar, yysVar, yjqVar, logSessionId2), looper));
            this.x++;
            i++;
            logSessionId2 = logSessionId;
            igrVar = z57Var2;
        }
        this.c = this.x != b380Var2.size();
        this.f112p = new Object();
        this.o = new hsk();
        this.q = new Object();
        this.r = new ij81((byte) 25);
        this.s = new Object();
        this.m = new ArrayList();
        this.i = new wdd1(new Handler(looper, new owu(this, b)));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017f  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:168:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:91:0x0163 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:94:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX WARN: Code duplicated, block: B:96:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final void a() {
        int i;
        gar garVarK;
        dhn0 dhn0Var;
        int i2;
        ByteBuffer byteBuffer;
        dhn0 dhn0Var2;
        int iG0;
        int i3;
        bt00 bt00Var;
        String str;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        long jN0;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        boolean z7;
        int i8 = 0;
        int i9 = 0;
        while (i9 < this.m.size()) {
            while (true) {
                h541 h541Var = (h541) this.m.get(i9);
                if (!h541Var.d) {
                    ie30 ie30VarL = h541Var.l();
                    if (ie30VarL != null) {
                        if (h541Var.c != null) {
                            ge30 ge30VarA = ie30VarL.a();
                            ge30VarA.l = h541Var.c;
                            ie30VarL = new ie30(ge30VarA);
                        }
                        if (!h541Var.a.d(ie30VarL.f66p)) {
                            String strC = hkh0.c(ie30VarL);
                            if (h541Var.a.d(strC)) {
                                ge30 ge30VarA2 = ie30VarL.a();
                                ge30VarA2.o = asj0.p(strC);
                                ie30VarL = new ie30(ge30VarA2);
                            }
                        }
                        try {
                            h541Var.a.a(ie30VarL);
                            h541Var.d = true;
                            if (h541Var.m()) {
                                dhn0Var2 = h541Var.a;
                                int i10 = h541Var.b;
                                if (dhn0Var2.f) {
                                    i = i9;
                                } else {
                                    i = i9;
                                }
                            } else {
                                i = i9;
                                garVarK = h541Var.k();
                                if (garVarK == null) {
                                    dhn0Var = h541Var.a;
                                    i2 = h541Var.b;
                                    byteBuffer = garVarK.d;
                                    byteBuffer.getClass();
                                    if (!dhn0Var.e(i2, byteBuffer, garVarK.f(1), garVarK.f)) {
                                        h541Var.p();
                                    }
                                }
                            }
                        } catch (MuxerException e) {
                            throw new ExportException("Muxer error", e, 7001, i8);
                        } catch (MuxerWrapper$AppendTrackFormatException e2) {
                            throw new ExportException("Muxer error", e2, 7003, i8);
                        }
                    } else {
                        i = i9;
                    }
                    if (!h541Var.m()) {
                        break;
                        break;
                    }
                    break;
                }
                if (h541Var.m()) {
                    dhn0Var2 = h541Var.a;
                    int i11 = h541Var.b;
                    if (dhn0Var2.f || dhn0Var2.d.indexOfKey(i11) < 0) {
                        i = i9;
                    } else {
                        chn0 chn0Var = (chn0) dhn0Var2.d.get(i11);
                        dhn0Var2.j = Math.max(0L, Math.min(dhn0Var2.j, chn0Var.c));
                        dhn0Var2.k = Math.max(dhn0Var2.k, chn0Var.f);
                        lqr lqrVar = dhn0Var2.c;
                        ie30 ie30Var = chn0Var.a;
                        long j = chn0Var.f;
                        if (j > 0) {
                            i = i9;
                            long j2 = chn0Var.d;
                            if (j2 > 0) {
                                long j3 = chn0Var.c;
                                if (j != j3) {
                                    iG0 = (int) zoi1.g0(j2, 8000000L, j - j3, RoundingMode.DOWN);
                                }
                            }
                            i3 = chn0Var.e;
                            bt00Var = ((myr) lqrVar.b).f98p;
                            str = ie30Var.f66p;
                            if (i11 == 1) {
                                bt00Var.h = str;
                                i6 = ie30Var.J;
                                if (i6 <= 0 || i6 == -1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                dm5.m(z5);
                                bt00Var.e = i6;
                                i7 = ie30Var.L;
                                if (i7 <= 0 || i7 == -2147483647) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                dm5.m(z6);
                                bt00Var.f = i7;
                                if (iG0 <= 0 || iG0 == -2147483647) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                dm5.m(z7);
                                bt00Var.d = iG0;
                            } else if (i11 == 2) {
                                bt00Var.o = str;
                                i4 = ie30Var.w;
                                if (i4 <= 0 || i4 == -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                dm5.m(z);
                                bt00Var.l = i4;
                                i5 = ie30Var.x;
                                if (i5 <= 0 || i5 == -1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                dm5.m(z2);
                                bt00Var.k = i5;
                                bt00Var.j = ie30Var.H;
                                if (iG0 <= 0 || iG0 == -2147483647) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                dm5.m(z3);
                                bt00Var.i = iG0;
                                if (i3 >= 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                dm5.m(z4);
                                bt00Var.m = i3;
                            }
                            zoi1.L(i11);
                            LinkedHashMap linkedHashMap = x8r.a;
                            synchronized (x8r.class) {
                            }
                            if (dhn0Var2.m == 1) {
                                dhn0Var2.d.delete(i11);
                                if (dhn0Var2.d.size() == 0) {
                                    dhn0Var2.g = true;
                                    x8r.a();
                                }
                            } else if (i11 == 2) {
                                dhn0Var2.n = true;
                            } else if (i11 == 1) {
                                dhn0Var2.o = true;
                            }
                            jN0 = zoi1.n0(dhn0Var2.k - dhn0Var2.j);
                            if ((dhn0Var2.m != 1 && dhn0Var2.n && (dhn0Var2.o || dhn0Var2.s == 1)) || dhn0Var2.g) {
                                dhn0Var2.c.l(jN0);
                            }
                        } else {
                            i = i9;
                        }
                        iG0 = -2147483647;
                        i3 = chn0Var.e;
                        bt00Var = ((myr) lqrVar.b).f98p;
                        str = ie30Var.f66p;
                        if (i11 == 1) {
                            bt00Var.h = str;
                            i6 = ie30Var.J;
                            if (i6 <= 0) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            dm5.m(z5);
                            bt00Var.e = i6;
                            i7 = ie30Var.L;
                            if (i7 <= 0) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            dm5.m(z6);
                            bt00Var.f = i7;
                            if (iG0 <= 0) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            dm5.m(z7);
                            bt00Var.d = iG0;
                        } else if (i11 == 2) {
                            bt00Var.o = str;
                            i4 = ie30Var.w;
                            if (i4 <= 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            dm5.m(z);
                            bt00Var.l = i4;
                            i5 = ie30Var.x;
                            if (i5 <= 0) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            dm5.m(z2);
                            bt00Var.k = i5;
                            bt00Var.j = ie30Var.H;
                            if (iG0 <= 0) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            dm5.m(z3);
                            bt00Var.i = iG0;
                            if (i3 >= 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            dm5.m(z4);
                            bt00Var.m = i3;
                        }
                        zoi1.L(i11);
                        LinkedHashMap linkedHashMap2 = x8r.a;
                        synchronized (x8r.class) {
                            if (dhn0Var2.m == 1) {
                                dhn0Var2.d.delete(i11);
                                if (dhn0Var2.d.size() == 0) {
                                    dhn0Var2.g = true;
                                    x8r.a();
                                }
                            } else if (i11 == 2) {
                                dhn0Var2.n = true;
                            } else if (i11 == 1) {
                                dhn0Var2.o = true;
                            }
                            jN0 = zoi1.n0(dhn0Var2.k - dhn0Var2.j);
                            if (dhn0Var2.m != 1) {
                                dhn0Var2.c.l(jN0);
                            } else {
                                dhn0Var2.c.l(jN0);
                            }
                        }
                    }
                } else {
                    i = i9;
                    garVarK = h541Var.k();
                    if (garVarK == null) {
                        try {
                            dhn0Var = h541Var.a;
                            i2 = h541Var.b;
                            byteBuffer = garVarK.d;
                            byteBuffer.getClass();
                            if (!dhn0Var.e(i2, byteBuffer, garVarK.f(1), garVarK.f)) {
                                h541Var.p();
                            }
                        } catch (MuxerException e3) {
                            throw new ExportException("Muxer error", e3, 7001, 0);
                        }
                    }
                }
                if (!h541Var.m() || !h541Var.n()) {
                    break;
                }
                i9 = i;
                i8 = 0;
            }
            i9 = i + 1;
            i8 = 0;
        }
        if (!this.B) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= this.j.size()) {
                    synchronized (this.q) {
                        this.z = 2;
                        this.A = i12 / i13;
                        break;
                    }
                }
                ((f4w) ((b380) this.b.b).get(i14)).getClass();
                this.r.b = 0;
                int iC = ((q561) this.j.get(i14)).c(this.r);
                if (iC != 2) {
                    synchronized (this.q) {
                        this.z = iC;
                        this.A = 0;
                    }
                    break;
                }
                i12 += this.r.b;
                i13++;
                i14++;
            }
        }
        dhn0 dhn0Var3 = this.n;
        if (dhn0Var3.g) {
            return;
        }
        if (dhn0Var3.m == 1 && dhn0Var3.n && (dhn0Var3.o || dhn0Var3.s == 1)) {
            return;
        }
        this.i.k(3, 10);
    }

    public final void b(int i, ExportException exportException) {
        v280 v280Var = new v280(4);
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            q561 q561Var = (q561) this.j.get(i2);
            q561Var.h();
            v280Var.e(q561Var.i.g());
        }
        int i3 = 1;
        boolean z = i == 1;
        boolean z2 = this.B;
        ExportException exportException2 = null;
        if (!z2) {
            synchronized (this.s) {
                this.B = true;
            }
            oon1.A("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + zoi1.a + "] [" + hph0.b() + "]");
            for (int i4 = 0; i4 < this.m.size(); i4++) {
                try {
                    ((h541) this.m.get(i4)).o();
                } catch (RuntimeException e) {
                    if (exportException2 == null) {
                        exportException2 = ExportException.d(e);
                        this.y = e;
                    }
                }
            }
            for (int i5 = 0; i5 < this.j.size(); i5++) {
                try {
                    ((q561) this.j.get(i5)).release();
                } catch (RuntimeException e2) {
                    if (exportException2 == null) {
                        exportException2 = ExportException.d(e2);
                        this.y = e2;
                    }
                }
            }
            try {
                dhn0 dhn0Var = this.n;
                if (i == 0) {
                    i3 = 0;
                } else if (i != 1) {
                    i3 = 2;
                    if (i != 2) {
                        eg.m(f4i1.c(i, "Unexpected end reason "));
                        i3 = 0;
                    }
                }
                dhn0Var.b(i3);
            } catch (MuxerException e3) {
                if (exportException2 == null) {
                    exportException2 = new ExportException("Muxer error", e3, 7001, 0);
                }
            } catch (RuntimeException e4) {
                if (exportException2 == null) {
                    ExportException exportExceptionD = ExportException.d(e4);
                    this.y = e4;
                    exportException2 = exportExceptionD;
                }
            }
            wdd1 wdd1Var = this.i;
            HandlerThread handlerThread = this.h;
            Objects.requireNonNull(handlerThread);
            wdd1Var.f(new v241(handlerThread, (byte) 16));
        }
        if (z) {
            this.o.f();
            return;
        }
        if (exportException == null) {
            exportException = exportException2;
        }
        if (exportException == null) {
            if (z2) {
                return;
            }
            dm5.y(this.f.a.post(new qub1(this, v280Var, (byte) 5)));
            return;
        }
        if (z2) {
            oon1.I("Export error after export ended", exportException);
        } else {
            dm5.y(this.f.a.post(new vqh0((Object) this, (Object) v280Var, (Object) exportException, (byte) 15)));
        }
    }

    public final void c(ExportException exportException) {
        synchronized (this.s) {
            try {
                if (this.B) {
                    oon1.I("Export error after export ended", exportException);
                } else {
                    d();
                    this.i.d(exportException, 4, 2, 0).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        dm5.z(this.h.isAlive(), "Internal thread is dead.");
    }
}
