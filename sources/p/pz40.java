package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pz40 implements Handler.Callback {
    public static final Status P0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status Q0 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object R0 = new Object();
    public static pz40 S0;
    public final jim0 N0;
    public volatile boolean O0;
    public c8n1 X;
    public final d46 Y;
    public final d46 Z;
    public long a;
    public boolean b;
    public dxd1 c;
    public o9n1 d;
    public final Context e;
    public final lz40 f;
    public final i2i1 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap t;

    public pz40(Context context, Looper looper) {
        lz40 lz40Var = lz40.e;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.t = new ConcurrentHashMap(5, 0.75f, 1);
        this.X = null;
        this.Y = new d46(0);
        this.Z = new d46(0);
        this.O0 = true;
        this.e = context;
        jim0 jim0Var = new jim0(looper, this);
        this.N0 = jim0Var;
        this.f = lz40Var;
        this.g = new i2i1((byte) 13);
        if (e9k.u(context)) {
            this.O0 = false;
        }
        jim0Var.sendMessage(jim0Var.obtainMessage(6));
    }

    public static Status c(gi5 gi5Var, lal lalVar) {
        String strA = gi5Var.b.A();
        String strValueOf = String.valueOf(lalVar);
        return new Status(17, rjx.o(new StringBuilder(strA.length() + 63 + strValueOf.length()), "API: ", strA, " is not available on this device. Connection failed with: ", strValueOf), lalVar.c, lalVar);
    }

    public static pz40 d(Context context) {
        pz40 pz40Var;
        HandlerThread handlerThread;
        synchronized (R0) {
            pz40Var = S0;
            if (pz40Var == null) {
                synchronized (b3p1.g) {
                    try {
                        handlerThread = b3p1.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            b3p1.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = b3p1.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = lz40.d;
                pz40 pz40Var2 = new pz40(applicationContext, looper);
                S0 = pz40Var2;
                pz40Var = pz40Var2;
            }
        }
        return pz40Var;
    }

    public final h8n1 a(kz40 kz40Var) {
        gi5 gi5Var = kz40Var.f;
        ConcurrentHashMap concurrentHashMap = this.t;
        h8n1 h8n1Var = (h8n1) concurrentHashMap.get(gi5Var);
        if (h8n1Var == null) {
            h8n1Var = new h8n1(this, kz40Var);
            concurrentHashMap.put(gi5Var, h8n1Var);
        }
        if (h8n1Var.l.B()) {
            this.Z.add(gi5Var);
        }
        h8n1Var.o();
        return h8n1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public final void b(bsd1 bsd1Var, int i, kz40 kz40Var) {
        l8n1 l8n1Var;
        pz40 pz40Var;
        if (i != 0) {
            gi5 gi5Var = kz40Var.f;
            if (f()) {
                zo31 zo31VarF = yo31.g().f();
                boolean zD0 = true;
                if (zo31VarF != null) {
                    if (zo31VarF.b) {
                        boolean z = zo31VarF.c;
                        h8n1 h8n1Var = (h8n1) this.t.get(gi5Var);
                        if (h8n1Var != null) {
                            px40 px40Var = h8n1Var.l;
                            if (px40Var instanceof xaa) {
                                px40 px40Var2 = px40Var;
                                if (!px40Var2.t() || px40Var2.v()) {
                                    zD0 = z;
                                } else {
                                    cbl cblVarA = l8n1.a(h8n1Var, px40Var2, i);
                                    if (cblVarA != null) {
                                        h8n1Var.v++;
                                        zD0 = cblVarA.d0();
                                    }
                                }
                            }
                        } else {
                            zD0 = z;
                        }
                    }
                    l8n1Var = null;
                    pz40Var = this;
                }
                pz40Var = this;
                l8n1Var = new l8n1(pz40Var, i, gi5Var, zD0 ? System.currentTimeMillis() : 0L, zD0 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                l8n1Var = null;
                pz40Var = this;
            }
            if (l8n1Var != null) {
                hfp1 hfp1Var = bsd1Var.a;
                jim0 jim0Var = pz40Var.N0;
                Objects.requireNonNull(jim0Var);
                hfp1Var.l(new vi7(jim0Var, (byte) 5), l8n1Var);
            }
        }
    }

    public final void e(c8n1 c8n1Var) {
        synchronized (R0) {
            try {
                if (this.X != c8n1Var) {
                    this.X = c8n1Var;
                    this.Y.clear();
                }
                this.Y.addAll(c8n1Var.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        if (this.b) {
            return false;
        }
        zo31 zo31VarF = yo31.g().f();
        if (zo31VarF != null && !zo31VarF.b) {
            return false;
        }
        int iG = this.g.g(203400000);
        return iG == -1 || iG == 0;
    }

    public final boolean g(lal lalVar, int i) {
        lz40 lz40Var = this.f;
        lz40Var.getClass();
        Context context = this.e;
        if (!no80.z(context)) {
            int i2 = lalVar.b;
            PendingIntent pendingIntentD = lalVar.c;
            if (!((i2 == 0 || pendingIntentD == null) ? false : true)) {
                pendingIntentD = null;
                Intent intentA = lz40Var.a(i2, context, null);
                if (intentA != null) {
                    pendingIntentD = fqo1.D(context, intentA);
                }
            }
            if (pendingIntentD != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntentD);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                lz40Var.h(context, i2, j9n1.a(context, intent, j9n1.a | 134217728));
                lz40Var.i(context, lalVar, false);
                return true;
            }
        }
        return false;
    }

    public final void h(lal lalVar, int i) {
        if (g(lalVar, i)) {
            return;
        }
        jim0 jim0Var = this.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(5, i, 0, lalVar));
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:157:0x032b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v14 p.h8n1, still in use, count: 2, list:
          (r2v14 p.h8n1) from 0x02ef: IGET (r2v14 p.h8n1) A[WRAPPED] (LINE:752) p.h8n1.q int
          (r2v14 p.h8n1) from 0x02f5: PHI (r2 I:??) = (r2v11 p.h8n1), (r2v14 p.h8n1) binds: [B:151:0x02f4, B:217:0x02f5] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pz40.handleMessage(android.os.Message):boolean");
    }
}
