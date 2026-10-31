package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.session.legacy.MediaSessionManager;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fzh0 {
    public static final ch61 F = new ch61(1);
    public static final v0d1 G = zno1.u(new p58((byte) 7));
    public final short A;
    public boolean B;
    public final b380 C;
    public b380 D;
    public Bundle E;
    public final Object a = new Object();
    public final Uri b;
    public final bzh0 c;
    public final azh0 d;
    public final uph0 e;
    public final Context f;
    public final h2i0 g;
    public final e0i0 h;
    public final String i;
    public final hi61 j;
    public final kph0 k;
    public final Handler l;
    public final nxa m;
    public final xyh0 n;
    public final Handler o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f50p;
    public final boolean q;
    public final b380 r;
    public jbu0 s;
    public ffu0 t;
    public PendingIntent u;
    public dzh0 v;
    public upa0 w;
    public ixh0 x;
    public tph0 y;
    public boolean z;

    /* JADX WARN: Type inference failed for: r14v3, types: [p.xyh0] */
    public fzh0(kph0 kph0Var, Context context, String str, r8u0 r8u0Var, b380 b380Var, b380 b380Var2, b380 b380Var3, uph0 uph0Var, Bundle bundle, Bundle bundle2, nxa nxaVar) {
        String str2 = str;
        oon1.A("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + zoi1.a + "]");
        this.k = kph0Var;
        this.f = context;
        this.i = str2;
        this.u = null;
        this.C = b380Var;
        this.D = b380Var2;
        this.r = b380Var3;
        this.e = uph0Var;
        this.E = bundle2;
        this.m = nxaVar;
        final byte b = 1;
        this.f50p = true;
        this.q = true;
        h2i0 h2i0Var = new h2i0(this);
        this.g = h2i0Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper looperE0 = r8u0Var.e0();
        Handler handler = new Handler(looperE0);
        this.l = handler;
        this.s = jbu0.H;
        this.c = new bzh0(this, looperE0);
        this.d = new azh0(this, looperE0);
        Uri uriBuild = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.b = uriBuild;
        e0i0 e0i0Var = new e0i0(this, uriBuild, handler, bundle, b380Var, b380Var2, gxh0.g, gxh0.h, bundle2);
        this.h = e0i0Var;
        this.j = new hi61(Process.myUid(), 1011000300, 10, context.getPackageName(), h2i0Var, bundle, e0i0Var.j.getSessionToken().getToken(), null);
        ffu0 ffu0Var = new ffu0(r8u0Var);
        this.t = ffu0Var;
        zoi1.c0(handler, new ag20(this, ffu0Var, (byte) 29));
        this.A = (short) 3000;
        final byte b2 = 0;
        this.n = new Runnable(this) { // from class: p.xyh0
            public final /* synthetic */ fzh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                fzh0 fzh0Var = this.b;
                switch (b3) {
                    case 0:
                        synchronized (fzh0Var.a) {
                            try {
                                if (fzh0Var.z) {
                                    return;
                                }
                                final xg61 xg61VarG1 = fzh0Var.t.g1();
                                if (!fzh0Var.c.hasMessages(1) && bai0.a(xg61VarG1, fzh0Var.s.c)) {
                                    v1k v1kVar = fzh0Var.g.m;
                                    b380 b380VarM = v1kVar.m();
                                    for (int i = 0; i < b380VarM.size(); i++) {
                                        final ixh0 ixh0Var = (ixh0) b380VarM.get(i);
                                        v1kVar.J();
                                        final boolean zV = v1kVar.v(ixh0Var, 16);
                                        final boolean zV2 = v1kVar.v(ixh0Var, 17);
                                        fzh0Var.c(ixh0Var, new ezh0() { // from class: p.yyh0
                                            public final void h(hxh0 hxh0Var, int i2) {
                                                hxh0Var.e(i2, xg61VarG1, zV, zV2, ixh0Var.c);
                                            }
                                        });
                                    }
                                    try {
                                        fzh0Var.h.f.e(0, xg61VarG1, true, true, 0);
                                    } catch (RemoteException e) {
                                        oon1.w("Exception in using media1 API", e);
                                    }
                                    break;
                                }
                                fzh0Var.B();
                                return;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    case 1:
                        fzh0Var.B();
                        return;
                    default:
                        upa0 upa0Var = fzh0Var.w;
                        if (upa0Var != null) {
                            ((d1i0) upa0Var.b).o(false);
                            return;
                        }
                        return;
                }
            }
        };
        zoi1.c0(handler, new Runnable(this) { // from class: p.xyh0
            public final /* synthetic */ fzh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                fzh0 fzh0Var = this.b;
                switch (b3) {
                    case 0:
                        synchronized (fzh0Var.a) {
                            try {
                                if (fzh0Var.z) {
                                    return;
                                }
                                final xg61 xg61VarG1 = fzh0Var.t.g1();
                                if (!fzh0Var.c.hasMessages(1) && bai0.a(xg61VarG1, fzh0Var.s.c)) {
                                    v1k v1kVar = fzh0Var.g.m;
                                    b380 b380VarM = v1kVar.m();
                                    for (int i = 0; i < b380VarM.size(); i++) {
                                        final ixh0 ixh0Var = (ixh0) b380VarM.get(i);
                                        v1kVar.J();
                                        final boolean zV = v1kVar.v(ixh0Var, 16);
                                        final boolean zV2 = v1kVar.v(ixh0Var, 17);
                                        fzh0Var.c(ixh0Var, new ezh0() { // from class: p.yyh0
                                            public final void h(hxh0 hxh0Var, int i2) {
                                                hxh0Var.e(i2, xg61VarG1, zV, zV2, ixh0Var.c);
                                            }
                                        });
                                    }
                                    try {
                                        fzh0Var.h.f.e(0, xg61VarG1, true, true, 0);
                                    } catch (RemoteException e) {
                                        oon1.w("Exception in using media1 API", e);
                                    }
                                    break;
                                }
                                fzh0Var.B();
                                return;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    case 1:
                        fzh0Var.B();
                        return;
                    default:
                        upa0 upa0Var = fzh0Var.w;
                        if (upa0Var != null) {
                            ((d1i0) upa0Var.b).o(false);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static String i(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        return (Objects.equals(uri.getScheme(), "androidx") && Objects.equals(uri.getAuthority(), "media3.session") && !pathSegments.isEmpty()) ? pathSegments.get(0) : "";
    }

    public static boolean q(ixh0 ixh0Var) {
        return ixh0Var != null && Objects.equals(ixh0Var.a.getPackageName(), "com.android.systemui");
    }

    public final ixh0 A(ixh0 ixh0Var) {
        ixh0 ixh0VarG;
        return (this.B && q(ixh0Var) && (ixh0VarG = g()) != null) ? ixh0VarG : ixh0Var;
    }

    public final void B() {
        long j = this.A;
        Handler handler = this.l;
        xyh0 xyh0Var = this.n;
        handler.removeCallbacks(xyh0Var);
        if (!this.q || j <= 0) {
            return;
        }
        if (this.t.i() || this.t.b()) {
            handler.postDelayed(xyh0Var, j);
        }
    }

    public final void C() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        eg.m("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    public final boolean a(KeyEvent keyEvent, boolean z, boolean z2) {
        Runnable runnable;
        fzh0 fzh0Var;
        final ixh0 ixh0VarG = this.k.a.g();
        if (ixh0VarG == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        final byte b = 1;
        if (keyCode == 79) {
            C();
            if (!this.t.q()) {
                final byte b2 = 5;
                runnable = new Runnable(this) { // from class: p.o8l
                    public final /* synthetic */ fzh0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Set setUnmodifiableSet;
                        switch (b2) {
                            case 0:
                                fzh0 fzh0Var2 = this.b;
                                ixh0 ixh0Var = ixh0VarG;
                                if (fzh0Var2.p()) {
                                    return;
                                }
                                iqh0 iqh0Var = (iqh0) fzh0Var2;
                                hxh0 hxh0Var = ixh0Var.e;
                                hxh0Var.getClass();
                                synchronized (iqh0Var) {
                                    try {
                                        zt50 zt50Var = iqh0Var.K;
                                        Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                        if (collection == null) {
                                            setUnmodifiableSet = Collections.EMPTY_SET;
                                        } else {
                                            ouh ouhVarB = ouh.b(zt50Var.g);
                                            ouhVarB.addAll(collection);
                                            ((b8) zt50Var).f -= collection.size();
                                            collection.clear();
                                            setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                        }
                                        Iterator it = setUnmodifiableSet.iterator();
                                        while (it.hasNext()) {
                                            iqh0Var.J.l((String) it.next(), ixh0Var);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                    break;
                                }
                                if (iqh0Var.B) {
                                    if (fzh0.q(ixh0Var)) {
                                        return;
                                    }
                                    if (iqh0Var.o(ixh0Var)) {
                                        iqh0Var.B = false;
                                    }
                                }
                                iqh0Var.e.getClass();
                                return;
                            case 1:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                return;
                            case 2:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                return;
                            case 3:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                return;
                            case 4:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                return;
                            case 5:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                return;
                            case 6:
                                this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                return;
                            case 7:
                                this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                return;
                            case 8:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                return;
                            default:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                return;
                        }
                    }
                };
            } else {
                final byte b3 = 6;
                runnable = new Runnable(this) { // from class: p.o8l
                    public final /* synthetic */ fzh0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Set setUnmodifiableSet;
                        switch (b3) {
                            case 0:
                                fzh0 fzh0Var2 = this.b;
                                ixh0 ixh0Var = ixh0VarG;
                                if (fzh0Var2.p()) {
                                    return;
                                }
                                iqh0 iqh0Var = (iqh0) fzh0Var2;
                                hxh0 hxh0Var = ixh0Var.e;
                                hxh0Var.getClass();
                                synchronized (iqh0Var) {
                                    try {
                                        zt50 zt50Var = iqh0Var.K;
                                        Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                        if (collection == null) {
                                            setUnmodifiableSet = Collections.EMPTY_SET;
                                        } else {
                                            ouh ouhVarB = ouh.b(zt50Var.g);
                                            ouhVarB.addAll(collection);
                                            ((b8) zt50Var).f -= collection.size();
                                            collection.clear();
                                            setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                        }
                                        Iterator it = setUnmodifiableSet.iterator();
                                        while (it.hasNext()) {
                                            iqh0Var.J.l((String) it.next(), ixh0Var);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                    break;
                                }
                                if (iqh0Var.B) {
                                    if (fzh0.q(ixh0Var)) {
                                        return;
                                    }
                                    if (iqh0Var.o(ixh0Var)) {
                                        iqh0Var.B = false;
                                    }
                                }
                                iqh0Var.e.getClass();
                                return;
                            case 1:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                return;
                            case 2:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                return;
                            case 3:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                return;
                            case 4:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                return;
                            case 5:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                return;
                            case 6:
                                this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                return;
                            case 7:
                                this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                return;
                            case 8:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                return;
                            default:
                                this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                return;
                        }
                    }
                };
            }
        } else if (keyCode == 126) {
            final byte b4 = 7;
            runnable = new Runnable(this) { // from class: p.o8l
                public final /* synthetic */ fzh0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Set setUnmodifiableSet;
                    switch (b4) {
                        case 0:
                            fzh0 fzh0Var2 = this.b;
                            ixh0 ixh0Var = ixh0VarG;
                            if (fzh0Var2.p()) {
                                return;
                            }
                            iqh0 iqh0Var = (iqh0) fzh0Var2;
                            hxh0 hxh0Var = ixh0Var.e;
                            hxh0Var.getClass();
                            synchronized (iqh0Var) {
                                try {
                                    zt50 zt50Var = iqh0Var.K;
                                    Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                    if (collection == null) {
                                        setUnmodifiableSet = Collections.EMPTY_SET;
                                    } else {
                                        ouh ouhVarB = ouh.b(zt50Var.g);
                                        ouhVarB.addAll(collection);
                                        ((b8) zt50Var).f -= collection.size();
                                        collection.clear();
                                        setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                    }
                                    Iterator it = setUnmodifiableSet.iterator();
                                    while (it.hasNext()) {
                                        iqh0Var.J.l((String) it.next(), ixh0Var);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (iqh0Var.B) {
                                if (fzh0.q(ixh0Var)) {
                                    return;
                                }
                                if (iqh0Var.o(ixh0Var)) {
                                    iqh0Var.B = false;
                                }
                            }
                            iqh0Var.e.getClass();
                            return;
                        case 1:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                            return;
                        case 2:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                            return;
                        case 3:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                            return;
                        case 4:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                            return;
                        case 5:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        case 6:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 7:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 8:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        default:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                            return;
                    }
                }
            };
        } else if (keyCode == 127) {
            final byte b5 = 8;
            runnable = new Runnable(this) { // from class: p.o8l
                public final /* synthetic */ fzh0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Set setUnmodifiableSet;
                    switch (b5) {
                        case 0:
                            fzh0 fzh0Var2 = this.b;
                            ixh0 ixh0Var = ixh0VarG;
                            if (fzh0Var2.p()) {
                                return;
                            }
                            iqh0 iqh0Var = (iqh0) fzh0Var2;
                            hxh0 hxh0Var = ixh0Var.e;
                            hxh0Var.getClass();
                            synchronized (iqh0Var) {
                                try {
                                    zt50 zt50Var = iqh0Var.K;
                                    Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                    if (collection == null) {
                                        setUnmodifiableSet = Collections.EMPTY_SET;
                                    } else {
                                        ouh ouhVarB = ouh.b(zt50Var.g);
                                        ouhVarB.addAll(collection);
                                        ((b8) zt50Var).f -= collection.size();
                                        collection.clear();
                                        setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                    }
                                    Iterator it = setUnmodifiableSet.iterator();
                                    while (it.hasNext()) {
                                        iqh0Var.J.l((String) it.next(), ixh0Var);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (iqh0Var.B) {
                                if (fzh0.q(ixh0Var)) {
                                    return;
                                }
                                if (iqh0Var.o(ixh0Var)) {
                                    iqh0Var.B = false;
                                }
                            }
                            iqh0Var.e.getClass();
                            return;
                        case 1:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                            return;
                        case 2:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                            return;
                        case 3:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                            return;
                        case 4:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                            return;
                        case 5:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        case 6:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 7:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 8:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        default:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                            return;
                    }
                }
            };
        } else if (keyCode == 272) {
            final byte b6 = 9;
            runnable = new Runnable(this) { // from class: p.o8l
                public final /* synthetic */ fzh0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Set setUnmodifiableSet;
                    switch (b6) {
                        case 0:
                            fzh0 fzh0Var2 = this.b;
                            ixh0 ixh0Var = ixh0VarG;
                            if (fzh0Var2.p()) {
                                return;
                            }
                            iqh0 iqh0Var = (iqh0) fzh0Var2;
                            hxh0 hxh0Var = ixh0Var.e;
                            hxh0Var.getClass();
                            synchronized (iqh0Var) {
                                try {
                                    zt50 zt50Var = iqh0Var.K;
                                    Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                    if (collection == null) {
                                        setUnmodifiableSet = Collections.EMPTY_SET;
                                    } else {
                                        ouh ouhVarB = ouh.b(zt50Var.g);
                                        ouhVarB.addAll(collection);
                                        ((b8) zt50Var).f -= collection.size();
                                        collection.clear();
                                        setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                    }
                                    Iterator it = setUnmodifiableSet.iterator();
                                    while (it.hasNext()) {
                                        iqh0Var.J.l((String) it.next(), ixh0Var);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (iqh0Var.B) {
                                if (fzh0.q(ixh0Var)) {
                                    return;
                                }
                                if (iqh0Var.o(ixh0Var)) {
                                    iqh0Var.B = false;
                                }
                            }
                            iqh0Var.e.getClass();
                            return;
                        case 1:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                            return;
                        case 2:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                            return;
                        case 3:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                            return;
                        case 4:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                            return;
                        case 5:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        case 6:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 7:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 8:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        default:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                            return;
                    }
                }
            };
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    C();
                    if (!this.t.q()) {
                        final byte b7 = 6;
                        runnable = new Runnable(this) { // from class: p.o8l
                            public final /* synthetic */ fzh0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Set setUnmodifiableSet;
                                switch (b7) {
                                    case 0:
                                        fzh0 fzh0Var2 = this.b;
                                        ixh0 ixh0Var = ixh0VarG;
                                        if (fzh0Var2.p()) {
                                            return;
                                        }
                                        iqh0 iqh0Var = (iqh0) fzh0Var2;
                                        hxh0 hxh0Var = ixh0Var.e;
                                        hxh0Var.getClass();
                                        synchronized (iqh0Var) {
                                            try {
                                                zt50 zt50Var = iqh0Var.K;
                                                Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                                if (collection == null) {
                                                    setUnmodifiableSet = Collections.EMPTY_SET;
                                                } else {
                                                    ouh ouhVarB = ouh.b(zt50Var.g);
                                                    ouhVarB.addAll(collection);
                                                    ((b8) zt50Var).f -= collection.size();
                                                    collection.clear();
                                                    setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                                }
                                                Iterator it = setUnmodifiableSet.iterator();
                                                while (it.hasNext()) {
                                                    iqh0Var.J.l((String) it.next(), ixh0Var);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        if (iqh0Var.B) {
                                            if (fzh0.q(ixh0Var)) {
                                                return;
                                            }
                                            if (iqh0Var.o(ixh0Var)) {
                                                iqh0Var.B = false;
                                            }
                                        }
                                        iqh0Var.e.getClass();
                                        return;
                                    case 1:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                        return;
                                    case 2:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                        return;
                                    case 3:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                        return;
                                    case 4:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                        return;
                                    case 5:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                        return;
                                    case 6:
                                        this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                        return;
                                    case 7:
                                        this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                        return;
                                    case 8:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                        return;
                                    default:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                        return;
                                }
                            }
                        };
                    } else {
                        final byte b8 = 5;
                        runnable = new Runnable(this) { // from class: p.o8l
                            public final /* synthetic */ fzh0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Set setUnmodifiableSet;
                                switch (b8) {
                                    case 0:
                                        fzh0 fzh0Var2 = this.b;
                                        ixh0 ixh0Var = ixh0VarG;
                                        if (fzh0Var2.p()) {
                                            return;
                                        }
                                        iqh0 iqh0Var = (iqh0) fzh0Var2;
                                        hxh0 hxh0Var = ixh0Var.e;
                                        hxh0Var.getClass();
                                        synchronized (iqh0Var) {
                                            try {
                                                zt50 zt50Var = iqh0Var.K;
                                                Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                                if (collection == null) {
                                                    setUnmodifiableSet = Collections.EMPTY_SET;
                                                } else {
                                                    ouh ouhVarB = ouh.b(zt50Var.g);
                                                    ouhVarB.addAll(collection);
                                                    ((b8) zt50Var).f -= collection.size();
                                                    collection.clear();
                                                    setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                                }
                                                Iterator it = setUnmodifiableSet.iterator();
                                                while (it.hasNext()) {
                                                    iqh0Var.J.l((String) it.next(), ixh0Var);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        if (iqh0Var.B) {
                                            if (fzh0.q(ixh0Var)) {
                                                return;
                                            }
                                            if (iqh0Var.o(ixh0Var)) {
                                                iqh0Var.B = false;
                                            }
                                        }
                                        iqh0Var.e.getClass();
                                        return;
                                    case 1:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                        return;
                                    case 2:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                        return;
                                    case 3:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                        return;
                                    case 4:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                        return;
                                    case 5:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                        return;
                                    case 6:
                                        this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                        return;
                                    case 7:
                                        this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                        return;
                                    case 8:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                        return;
                                    default:
                                        this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                        return;
                                }
                            }
                        };
                    }
                    break;
                case 86:
                    final byte b9 = 4;
                    runnable = new Runnable(this) { // from class: p.o8l
                        public final /* synthetic */ fzh0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Set setUnmodifiableSet;
                            switch (b9) {
                                case 0:
                                    fzh0 fzh0Var2 = this.b;
                                    ixh0 ixh0Var = ixh0VarG;
                                    if (fzh0Var2.p()) {
                                        return;
                                    }
                                    iqh0 iqh0Var = (iqh0) fzh0Var2;
                                    hxh0 hxh0Var = ixh0Var.e;
                                    hxh0Var.getClass();
                                    synchronized (iqh0Var) {
                                        try {
                                            zt50 zt50Var = iqh0Var.K;
                                            Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                            if (collection == null) {
                                                setUnmodifiableSet = Collections.EMPTY_SET;
                                            } else {
                                                ouh ouhVarB = ouh.b(zt50Var.g);
                                                ouhVarB.addAll(collection);
                                                ((b8) zt50Var).f -= collection.size();
                                                collection.clear();
                                                setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                            }
                                            Iterator it = setUnmodifiableSet.iterator();
                                            while (it.hasNext()) {
                                                iqh0Var.J.l((String) it.next(), ixh0Var);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    if (iqh0Var.B) {
                                        if (fzh0.q(ixh0Var)) {
                                            return;
                                        }
                                        if (iqh0Var.o(ixh0Var)) {
                                            iqh0Var.B = false;
                                        }
                                    }
                                    iqh0Var.e.getClass();
                                    return;
                                case 1:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                    return;
                                case 2:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                    return;
                                case 3:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                    return;
                                case 4:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                    return;
                                case 5:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                case 6:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 7:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 8:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                default:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                    return;
                            }
                        }
                    };
                    break;
                case 87:
                    final byte b10 = 9;
                    runnable = new Runnable(this) { // from class: p.o8l
                        public final /* synthetic */ fzh0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Set setUnmodifiableSet;
                            switch (b10) {
                                case 0:
                                    fzh0 fzh0Var2 = this.b;
                                    ixh0 ixh0Var = ixh0VarG;
                                    if (fzh0Var2.p()) {
                                        return;
                                    }
                                    iqh0 iqh0Var = (iqh0) fzh0Var2;
                                    hxh0 hxh0Var = ixh0Var.e;
                                    hxh0Var.getClass();
                                    synchronized (iqh0Var) {
                                        try {
                                            zt50 zt50Var = iqh0Var.K;
                                            Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                            if (collection == null) {
                                                setUnmodifiableSet = Collections.EMPTY_SET;
                                            } else {
                                                ouh ouhVarB = ouh.b(zt50Var.g);
                                                ouhVarB.addAll(collection);
                                                ((b8) zt50Var).f -= collection.size();
                                                collection.clear();
                                                setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                            }
                                            Iterator it = setUnmodifiableSet.iterator();
                                            while (it.hasNext()) {
                                                iqh0Var.J.l((String) it.next(), ixh0Var);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    if (iqh0Var.B) {
                                        if (fzh0.q(ixh0Var)) {
                                            return;
                                        }
                                        if (iqh0Var.o(ixh0Var)) {
                                            iqh0Var.B = false;
                                        }
                                    }
                                    iqh0Var.e.getClass();
                                    return;
                                case 1:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                    return;
                                case 2:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                    return;
                                case 3:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                    return;
                                case 4:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                    return;
                                case 5:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                case 6:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 7:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 8:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                default:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                    return;
                            }
                        }
                    };
                    break;
                case 88:
                    runnable = new Runnable(this) { // from class: p.o8l
                        public final /* synthetic */ fzh0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Set setUnmodifiableSet;
                            switch (b) {
                                case 0:
                                    fzh0 fzh0Var2 = this.b;
                                    ixh0 ixh0Var = ixh0VarG;
                                    if (fzh0Var2.p()) {
                                        return;
                                    }
                                    iqh0 iqh0Var = (iqh0) fzh0Var2;
                                    hxh0 hxh0Var = ixh0Var.e;
                                    hxh0Var.getClass();
                                    synchronized (iqh0Var) {
                                        try {
                                            zt50 zt50Var = iqh0Var.K;
                                            Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                            if (collection == null) {
                                                setUnmodifiableSet = Collections.EMPTY_SET;
                                            } else {
                                                ouh ouhVarB = ouh.b(zt50Var.g);
                                                ouhVarB.addAll(collection);
                                                ((b8) zt50Var).f -= collection.size();
                                                collection.clear();
                                                setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                            }
                                            Iterator it = setUnmodifiableSet.iterator();
                                            while (it.hasNext()) {
                                                iqh0Var.J.l((String) it.next(), ixh0Var);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    if (iqh0Var.B) {
                                        if (fzh0.q(ixh0Var)) {
                                            return;
                                        }
                                        if (iqh0Var.o(ixh0Var)) {
                                            iqh0Var.B = false;
                                        }
                                    }
                                    iqh0Var.e.getClass();
                                    return;
                                case 1:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                    return;
                                case 2:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                    return;
                                case 3:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                    return;
                                case 4:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                    return;
                                case 5:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                case 6:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 7:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 8:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                default:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                    return;
                            }
                        }
                    };
                    break;
                case 89:
                    final byte b11 = 3;
                    runnable = new Runnable(this) { // from class: p.o8l
                        public final /* synthetic */ fzh0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Set setUnmodifiableSet;
                            switch (b11) {
                                case 0:
                                    fzh0 fzh0Var2 = this.b;
                                    ixh0 ixh0Var = ixh0VarG;
                                    if (fzh0Var2.p()) {
                                        return;
                                    }
                                    iqh0 iqh0Var = (iqh0) fzh0Var2;
                                    hxh0 hxh0Var = ixh0Var.e;
                                    hxh0Var.getClass();
                                    synchronized (iqh0Var) {
                                        try {
                                            zt50 zt50Var = iqh0Var.K;
                                            Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                            if (collection == null) {
                                                setUnmodifiableSet = Collections.EMPTY_SET;
                                            } else {
                                                ouh ouhVarB = ouh.b(zt50Var.g);
                                                ouhVarB.addAll(collection);
                                                ((b8) zt50Var).f -= collection.size();
                                                collection.clear();
                                                setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                            }
                                            Iterator it = setUnmodifiableSet.iterator();
                                            while (it.hasNext()) {
                                                iqh0Var.J.l((String) it.next(), ixh0Var);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    if (iqh0Var.B) {
                                        if (fzh0.q(ixh0Var)) {
                                            return;
                                        }
                                        if (iqh0Var.o(ixh0Var)) {
                                            iqh0Var.B = false;
                                        }
                                    }
                                    iqh0Var.e.getClass();
                                    return;
                                case 1:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                    return;
                                case 2:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                    return;
                                case 3:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                    return;
                                case 4:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                    return;
                                case 5:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                case 6:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 7:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 8:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                default:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                    return;
                            }
                        }
                    };
                    break;
                case 90:
                    final byte b12 = 2;
                    runnable = new Runnable(this) { // from class: p.o8l
                        public final /* synthetic */ fzh0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Set setUnmodifiableSet;
                            switch (b12) {
                                case 0:
                                    fzh0 fzh0Var2 = this.b;
                                    ixh0 ixh0Var = ixh0VarG;
                                    if (fzh0Var2.p()) {
                                        return;
                                    }
                                    iqh0 iqh0Var = (iqh0) fzh0Var2;
                                    hxh0 hxh0Var = ixh0Var.e;
                                    hxh0Var.getClass();
                                    synchronized (iqh0Var) {
                                        try {
                                            zt50 zt50Var = iqh0Var.K;
                                            Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                            if (collection == null) {
                                                setUnmodifiableSet = Collections.EMPTY_SET;
                                            } else {
                                                ouh ouhVarB = ouh.b(zt50Var.g);
                                                ouhVarB.addAll(collection);
                                                ((b8) zt50Var).f -= collection.size();
                                                collection.clear();
                                                setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                            }
                                            Iterator it = setUnmodifiableSet.iterator();
                                            while (it.hasNext()) {
                                                iqh0Var.J.l((String) it.next(), ixh0Var);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    if (iqh0Var.B) {
                                        if (fzh0.q(ixh0Var)) {
                                            return;
                                        }
                                        if (iqh0Var.o(ixh0Var)) {
                                            iqh0Var.B = false;
                                        }
                                    }
                                    iqh0Var.e.getClass();
                                    return;
                                case 1:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                                    return;
                                case 2:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                                    return;
                                case 3:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                                    return;
                                case 4:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                                    return;
                                case 5:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                case 6:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 7:
                                    this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                                    return;
                                case 8:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                                    return;
                                default:
                                    this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                                    return;
                            }
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            runnable = new Runnable(this) { // from class: p.o8l
                public final /* synthetic */ fzh0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Set setUnmodifiableSet;
                    switch (b) {
                        case 0:
                            fzh0 fzh0Var2 = this.b;
                            ixh0 ixh0Var = ixh0VarG;
                            if (fzh0Var2.p()) {
                                return;
                            }
                            iqh0 iqh0Var = (iqh0) fzh0Var2;
                            hxh0 hxh0Var = ixh0Var.e;
                            hxh0Var.getClass();
                            synchronized (iqh0Var) {
                                try {
                                    zt50 zt50Var = iqh0Var.K;
                                    Collection collection = (Collection) ((b8) zt50Var).e.remove(hxh0Var);
                                    if (collection == null) {
                                        setUnmodifiableSet = Collections.EMPTY_SET;
                                    } else {
                                        ouh ouhVarB = ouh.b(zt50Var.g);
                                        ouhVarB.addAll(collection);
                                        ((b8) zt50Var).f -= collection.size();
                                        collection.clear();
                                        setUnmodifiableSet = Collections.unmodifiableSet(ouhVarB);
                                    }
                                    Iterator it = setUnmodifiableSet.iterator();
                                    while (it.hasNext()) {
                                        iqh0Var.J.l((String) it.next(), ixh0Var);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (iqh0Var.B) {
                                if (fzh0.q(ixh0Var)) {
                                    return;
                                }
                                if (iqh0Var.o(ixh0Var)) {
                                    iqh0Var.B = false;
                                }
                            }
                            iqh0Var.e.getClass();
                            return;
                        case 1:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 7, h2i0.j1(new czh0((byte) 9)));
                            return;
                        case 2:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 12, h2i0.j1(new czh0((byte) 12)));
                            return;
                        case 3:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 11, h2i0.j1(new czh0((byte) 8)));
                            return;
                        case 4:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 3, h2i0.j1(new czh0((byte) 17)));
                            return;
                        case 5:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        case 6:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 7:
                            this.b.g.c1(ixh0VarG, os00.INVALID_ID);
                            return;
                        case 8:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 1, h2i0.j1(new czh0((byte) 5)));
                            return;
                        default:
                            this.b.g.e1(ixh0VarG, os00.INVALID_ID, 9, h2i0.j1(new czh0((byte) 13)));
                            return;
                    }
                }
            };
        }
        if (z2) {
            c8d0 c8d0Var = new c8d0(new pa61("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY));
            if (this.l.getLooper() == Looper.myLooper()) {
                b(ixh0VarG, c8d0Var);
                fzh0Var = this;
            } else {
                fzh0Var = this;
                fzh0Var.y(new m2d((Object) fzh0Var, (Object) new it21(), (Object) ixh0VarG, (Object) c8d0Var, (byte) 16));
            }
        } else {
            fzh0Var = this;
        }
        runnable.run();
        fzh0Var.g.m.j(ixh0VarG);
        return true;
    }

    public final n8d0 b(ixh0 ixh0Var, c8d0 c8d0Var) {
        int i;
        w561 w561VarJ;
        h2i0 h2i0Var = this.g;
        try {
            xen0 xen0VarQ = h2i0Var.m.q(ixh0Var);
            if (xen0VarQ != null) {
                w561VarJ = xen0VarQ.c(F);
                i = w561VarJ.e;
            } else {
                if (!n(ixh0Var)) {
                    return fc11.J(new ch61(-100));
                }
                i = 0;
                w561VarJ = fc11.J(new ch61(0));
            }
            hxh0 hxh0Var = ixh0Var.e;
            if (hxh0Var != null) {
                pa61 pa61Var = (pa61) c8d0Var.b;
                Bundle bundle = Bundle.EMPTY;
                hxh0Var.j(i, pa61Var);
            }
            return w561VarJ;
        } catch (DeadObjectException unused) {
            h2i0Var.m.D(ixh0Var);
            return fc11.J(new ch61(-100));
        } catch (RemoteException e) {
            oon1.I("Exception in " + ixh0Var, e);
            return fc11.J(new ch61(-1));
        }
    }

    public final void c(ixh0 ixh0Var, ezh0 ezh0Var) {
        int iD;
        h2i0 h2i0Var = this.g;
        try {
            xen0 xen0VarQ = h2i0Var.m.q(ixh0Var);
            if (xen0VarQ != null) {
                iD = xen0VarQ.d();
            } else if (!n(ixh0Var)) {
                return;
            } else {
                iD = 0;
            }
            hxh0 hxh0Var = ixh0Var.e;
            if (hxh0Var != null) {
                ezh0Var.h(hxh0Var, iD);
            }
        } catch (DeadObjectException unused) {
            h2i0Var.m.D(ixh0Var);
        } catch (RemoteException e) {
            oon1.I("Exception in " + ixh0Var, e);
        }
    }

    public final void d(ezh0 ezh0Var) {
        b380 b380VarM = this.g.m.m();
        for (int i = 0; i < b380VarM.size(); i++) {
            c((ixh0) b380VarM.get(i), ezh0Var);
        }
        try {
            ezh0Var.h(this.h.f, 0);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final Handler e() {
        return this.l;
    }

    public bg11 f() {
        C();
        b380 b380VarM = this.g.m.m();
        b380 b380VarM2 = this.h.a.m();
        v280 v280VarN = b380.n(b380VarM2.size() + b380VarM.size());
        if (!this.B) {
            v280VarN.e(b380VarM);
            v280VarN.e(b380VarM2);
            return v280VarN.g();
        }
        for (int i = 0; i < b380VarM.size(); i++) {
            ixh0 ixh0Var = (ixh0) b380VarM.get(i);
            if (!q(ixh0Var)) {
                v280VarN.c(ixh0Var);
            }
        }
        for (int i2 = 0; i2 < b380VarM2.size(); i2++) {
            ixh0 ixh0Var2 = (ixh0) b380VarM2.get(i2);
            if (!q(ixh0Var2)) {
                v280VarN.c(ixh0Var2);
            }
        }
        return v280VarN.g();
    }

    public final ixh0 g() {
        C();
        b380 b380VarM = this.g.m.m();
        for (int i = 0; i < b380VarM.size(); i++) {
            ixh0 ixh0Var = (ixh0) b380VarM.get(i);
            if (o(ixh0Var)) {
                return ixh0Var;
            }
        }
        return null;
    }

    public final MediaSession.Token h() {
        return this.h.j.getSessionToken().getToken();
    }

    public final ixh0 j() {
        b380 b380VarM = this.h.a.m();
        for (int i = 0; i < b380VarM.size(); i++) {
            ixh0 ixh0Var = (ixh0) b380VarM.get(i);
            if (q(ixh0Var)) {
                return ixh0Var;
            }
        }
        b380 b380VarM2 = this.g.m.m();
        for (int i2 = 0; i2 < b380VarM2.size(); i2++) {
            ixh0 ixh0Var2 = (ixh0) b380VarM2.get(i2);
            if (q(ixh0Var2)) {
                return ixh0Var2;
            }
        }
        return null;
    }

    public final Uri k() {
        return this.b;
    }

    public final void l(m8u0 m8u0Var) {
        this.c.a(false, false);
        d(new slh0(m8u0Var));
        try {
            c0i0 c0i0Var = this.h.f;
            xqt xqtVar = this.s.s;
            c0i0Var.p();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void m(ixh0 ixh0Var, boolean z) {
        upa0 upa0Var = this.w;
        n8d0 n8d0VarJ = upa0Var != null ? upa0Var.j(this.k) : fc11.J(Boolean.TRUE);
        n8d0VarJ.b(new nx30((Object) n8d0VarJ, (Object) new jqd0(this, ixh0Var, z), (byte) 24), new wkh0(this, (byte) 3));
    }

    public boolean n(ixh0 ixh0Var) {
        tph0 tph0Var;
        if (this.g.m.u(ixh0Var) || this.h.a.u(ixh0Var)) {
            return true;
        }
        synchronized (this.a) {
            tph0Var = this.y;
        }
        return tph0Var != null && tph0Var.c.u(ixh0Var);
    }

    public final boolean o(ixh0 ixh0Var) {
        return Objects.equals(ixh0Var.a.getPackageName(), this.f.getPackageName()) && ixh0Var.b != 0 && ixh0Var.b().getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean p() {
        boolean z;
        synchronized (this.a) {
            z = this.z;
        }
        return z;
    }

    public final n8d0 r(ixh0 ixh0Var, bg11 bg11Var) {
        c280 c280VarJ;
        A(ixh0Var);
        this.e.getClass();
        w280 w280VarR = bg11Var.r(0);
        while (w280VarR.hasNext()) {
            if (((yoh0) w280VarR.next()).b == null) {
                c280VarJ = new c280(new UnsupportedOperationException());
                return (n8d0) c280VarJ;
            }
        }
        c280VarJ = fc11.J(bg11Var);
        return (n8d0) c280VarJ;
    }

    public final f280 s(ixh0 ixh0Var) {
        b380 b380VarP;
        b380 b380VarP2;
        MediaSessionManager.RemoteUserInfo remoteUserInfo = ixh0Var.a;
        boolean z = this.B;
        e0i0 e0i0Var = this.h;
        if (z && q(ixh0Var)) {
            e0i0Var.getClass();
            qa61 qa61Var = qa61.b;
            m8u0 m8u0Var = m8u0.b;
            qa61 qa61Var2 = e0i0Var.v;
            qa61Var2.getClass();
            m8u0 m8u0Var2 = e0i0Var.w;
            m8u0Var2.getClass();
            if (e0i0Var.u.isEmpty()) {
                b380 b380Var = e0i0Var.t;
                b380VarP = b380Var == null ? null : b380.p(b380Var);
                b380VarP2 = null;
            } else {
                b380 b380Var2 = e0i0Var.u;
                b380VarP2 = b380Var2 == null ? null : b380.p(b380Var2);
                b380VarP = null;
            }
            return fc11.J(new gxh0(true, qa61Var2, m8u0Var2, b380VarP, b380VarP2, null));
        }
        this.e.getClass();
        Logger.b("MLS: onConnect: package=%s, uid=%d", new Object[]{remoteUserInfo.getPackageName(), Integer.valueOf(remoteUserInfo.getUid())});
        qa61 qa61Var3 = gxh0.g;
        qa61Var3.getClass();
        HashSet hashSet = new HashSet((Collection) qa61Var3.a);
        kph0 kph0Var = this.k;
        b380 b380VarE = kph0Var.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = b380VarE.iterator();
        while (it.hasNext()) {
            pa61 pa61Var = ((udh) it.next()).a;
            if (pa61Var != null) {
                arrayList.add(pa61Var);
            }
        }
        hashSet.addAll(arrayList);
        qa61 qa61Var4 = new qa61(hashSet);
        l8u0 l8u0Var = new l8u0();
        l8u0Var.b();
        gxh0 gxh0VarA = gxh0.a(qa61Var4, l8u0Var.d());
        if (o(ixh0Var)) {
            this.B = true;
            b380 b380VarE2 = kph0Var.e();
            if (b380VarE2.isEmpty()) {
                iqh0 iqh0Var = kph0Var.a;
                iqh0Var.C();
                e0i0Var.t = iqh0Var.C;
            } else {
                e0i0Var.u = b380VarE2;
                e0i0Var.m();
            }
            e0i0Var.k(gxh0VarA.b, gxh0VarA.c);
        }
        return fc11.J(gxh0VarA);
    }

    public final s8d0 t(ixh0 ixh0Var, pa61 pa61Var, Bundle bundle) {
        return this.e.a.b(A(ixh0Var).a.getPackageName(), pa61Var.b, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean u(ixh0 ixh0Var, Intent intent) {
        boolean z;
        e0i0 e0i0Var;
        int i = ixh0Var.b;
        KeyEvent keyEventP = twa.p(intent);
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
            Context context = this.f;
            if ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEventP != null) {
                C();
                this.e.getClass();
                if (keyEventP.getAction() != 0) {
                    int keyCode = keyEventP.getKeyCode();
                    if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                        switch (keyCode) {
                        }
                    }
                    return true;
                }
                int keyCode2 = keyEventP.getKeyCode();
                boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
                vqh0 vqh0Var = null;
                azh0 azh0Var = this.d;
                if (keyCode2 == 79 || keyCode2 == 85) {
                    if (!zHasSystemFeature && i == 0 && keyEventP.getRepeatCount() == 0) {
                        vqh0 vqh0Var2 = azh0Var.a;
                        if (vqh0Var2 == null) {
                            vqh0 vqh0Var3 = new vqh0((Object) azh0Var, (Object) ixh0Var, (Object) keyEventP, (byte) 4);
                            azh0Var.a = vqh0Var3;
                            azh0Var.postDelayed(vqh0Var3, ViewConfiguration.getDoubleTapTimeout());
                            return true;
                        }
                        if (vqh0Var2 != null) {
                            azh0Var.removeCallbacks(vqh0Var2);
                            azh0Var.a = null;
                        }
                        z = true;
                    } else {
                        vqh0 vqh0Var4 = azh0Var.a;
                        if (vqh0Var4 != null) {
                            azh0Var.removeCallbacks(vqh0Var4);
                            vqh0 vqh0Var5 = azh0Var.a;
                            azh0Var.a = null;
                            vqh0Var = vqh0Var5;
                        }
                        if (vqh0Var != null) {
                            zoi1.c0(azh0Var, vqh0Var);
                        }
                    }
                    if (!this.B) {
                        boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                        if (keyEventP.getRepeatCount() <= 0 || a(keyEventP, z, booleanExtra)) {
                            return true;
                        }
                    } else {
                        e0i0Var = this.h;
                        if ((keyCode2 != 85 || keyCode2 == 79) && z) {
                            e0i0Var.onSkipToNext();
                            return true;
                        }
                        if (i != 0) {
                            e0i0Var.j.getController().dispatchMediaButtonEvent(keyEventP);
                            return true;
                        }
                    }
                } else {
                    vqh0 vqh0Var6 = azh0Var.a;
                    if (vqh0Var6 != null) {
                        azh0Var.removeCallbacks(vqh0Var6);
                        vqh0 vqh0Var7 = azh0Var.a;
                        azh0Var.a = null;
                        vqh0Var = vqh0Var7;
                    }
                    if (vqh0Var != null) {
                        zoi1.c0(azh0Var, vqh0Var);
                    }
                }
                z = false;
                if (!this.B) {
                    boolean booleanExtra2 = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEventP.getRepeatCount() <= 0) {
                    }
                    return true;
                }
                e0i0Var = this.h;
                if (keyCode2 != 85) {
                    e0i0Var.onSkipToNext();
                    return true;
                }
                e0i0Var.onSkipToNext();
                return true;
                if (i != 0) {
                    e0i0Var.j.getController().dispatchMediaButtonEvent(keyEventP);
                    return true;
                }
            }
        }
        return false;
    }

    public final void v(ixh0 ixh0Var, m8u0 m8u0Var) {
        ixh0 ixh0VarA = A(ixh0Var);
        uph0 uph0Var = this.e;
        wph0 wph0Var = uph0Var.a;
        MediaSessionManager.RemoteUserInfo remoteUserInfo = ixh0VarA.a;
        lhs0 lhs0Var = uph0Var.b;
        List list = lhs0Var.a;
        if (list != null && !list.isEmpty()) {
            if (list.size() != 1) {
                hhg1.n("Adding multiple media items is not supported");
                return;
            }
            boolean zA = m8u0Var.a(1);
            if (!m8u0Var.a(2) && !zA) {
                hhg1.n("Play and/or prepare is required when setting media items");
                return;
            }
            yoh0 yoh0Var = (yoh0) list.get(0);
            String str = yoh0Var.a;
            toh0 toh0Var = yoh0Var.f;
            Uri uri = toh0Var.a;
            String str2 = toh0Var.b;
            Bundle bundle = toh0Var.c;
            int i = bundle != null ? bundle.getInt("android.media.session.extra.LEGACY_STREAM_TYPE", 3) : 3;
            if (!ihc1.y0(str)) {
                String packageName = remoteUserInfo.getPackageName();
                if (zA) {
                    wph0Var.getClass();
                    wph0Var.a(packageName, kxh0.h, new nbf0(str, i, bundle));
                } else {
                    Logger.g("MLS: prepare from media id is not supported for package %s", new Object[]{packageName});
                }
            } else if (uri != null) {
                String packageName2 = remoteUserInfo.getPackageName();
                if (zA) {
                    wph0Var.getClass();
                    wph0Var.a(packageName2, kxh0.X, new vph0(uri, bundle, (byte) 0));
                } else {
                    wph0Var.getClass();
                    wph0Var.a(packageName2, kxh0.Y, new vph0(uri, bundle, (byte) 1));
                }
            } else {
                if (str2 == null) {
                    hhg1.n("Set media item without playing is not supported.");
                    return;
                }
                String packageName3 = remoteUserInfo.getPackageName();
                if (zA) {
                    wph0Var.getClass();
                    wph0Var.a(packageName3, kxh0.i, new q0g0(str2, bundle, (byte) 14));
                } else {
                    Logger.g("MLS: prepare from search is not supported for package %s", new Object[]{packageName3});
                }
            }
        }
        lhs0Var.a = null;
    }

    public final void w(ixh0 ixh0Var) {
        h1i0 h1i0Var;
        r0i0 r0i0Var;
        y490 y490Var;
        if ((this.B && q(ixh0Var)) || (r0i0Var = (h1i0Var = this.e.d).g) == null || (y490Var = h1i0Var.h) == null) {
            return;
        }
        y490Var.b(r0i0Var);
    }

    public final f280 x(ixh0 ixh0Var, bg11 bg11Var, int i, long j) {
        A(ixh0Var);
        this.e.b.a = bg11Var;
        return fc11.J(new jxh0(bg11Var, i, j));
    }

    public final void y(Runnable runnable) {
        zoi1.c0(this.l, runnable);
    }

    public final void z() {
        boolean zAwait;
        oon1.A("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + zoi1.a + "] [" + hph0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.z) {
                    return;
                }
                this.z = true;
                azh0 azh0Var = this.d;
                vqh0 vqh0Var = azh0Var.a;
                if (vqh0Var != null) {
                    azh0Var.removeCallbacks(vqh0Var);
                    azh0Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    if (this.l.getLooper().getThread().isAlive()) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        y(new vqh0(this, (Object) atomicBoolean, (Object) countDownLatch, (byte) 2));
                        zAwait = countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                    } else {
                        zAwait = false;
                    }
                } catch (Exception e) {
                    oon1.I("Exception thrown while closing", e);
                }
                if (zAwait || !atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                try {
                    this.h.j();
                    this.g.f1();
                } catch (RuntimeException e2) {
                    oon1.I("Exception thrown during emergency main thread release fallback", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
