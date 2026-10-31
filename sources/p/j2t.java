package p;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class j2t {
    public static final Size k = new Size(0, 0);
    public static final boolean l = j2h1.y("DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final AtomicInteger n = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public mzc d;
    public final pzc e;
    public mzc f;
    public final pzc g;
    public final Size h;
    public final int i;
    public Class j;

    public j2t(Size size, int i) {
        final byte b = 0;
        this.h = size;
        this.i = i;
        pzc pzcVarT = upn1.t(new nzc(this) { // from class: p.h2t
            public final /* synthetic */ j2t b;

            {
                this.b = this;
            }

            public final Object attachCompleter(mzc mzcVar) {
                byte b2 = b;
                j2t j2tVar = this.b;
                switch (b2) {
                    case 0:
                        synchronized (j2tVar.a) {
                            j2tVar.d = mzcVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + j2tVar + ")";
                    default:
                        synchronized (j2tVar.a) {
                            j2tVar.f = mzcVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + j2tVar + ")";
                }
            }
        });
        this.e = pzcVarT;
        final byte b2 = 1;
        this.g = upn1.t(new nzc(this) { // from class: p.h2t
            public final /* synthetic */ j2t b;

            {
                this.b = this;
            }

            public final Object attachCompleter(mzc mzcVar) {
                byte b3 = b2;
                j2t j2tVar = this.b;
                switch (b3) {
                    case 0:
                        synchronized (j2tVar.a) {
                            j2tVar.d = mzcVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + j2tVar + ")";
                    default:
                        synchronized (j2tVar.a) {
                            j2tVar.f = mzcVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + j2tVar + ")";
                }
            }
        });
        if (j2h1.y("DeferrableSurface")) {
            e(n.incrementAndGet(), m.get(), "Surface created");
            pzcVarT.b.b(new i2t(Log.getStackTraceString(new Exception()), this), n5u.a());
        }
    }

    public void a() {
        mzc mzcVar;
        synchronized (this.a) {
            try {
                if (this.c) {
                    mzcVar = null;
                } else {
                    this.c = true;
                    this.f.b((Object) null);
                    if (this.b == 0) {
                        mzcVar = this.d;
                        this.d = null;
                    } else {
                        mzcVar = null;
                    }
                    if (j2h1.y("DeferrableSurface")) {
                        toString();
                        j2h1.o("DeferrableSurface");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mzcVar != null) {
            mzcVar.b((Object) null);
        }
    }

    public final void b() {
        mzc mzcVar;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    mzcVar = this.d;
                    this.d = null;
                } else {
                    mzcVar = null;
                }
                if (j2h1.y("DeferrableSurface")) {
                    toString();
                    j2h1.o("DeferrableSurface");
                    if (this.b == 0) {
                        e(n.get(), m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mzcVar != null) {
            mzcVar.b((Object) null);
        }
    }

    public final n8d0 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new e280(new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.", this), (byte) 1);
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (j2h1.y("DeferrableSurface")) {
                    if (this.b == 1) {
                        e(n.get(), m.incrementAndGet(), "New surface in use");
                    }
                    toString();
                    j2h1.o("DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!l && j2h1.y("DeferrableSurface")) {
            j2h1.o("DeferrableSurface");
        }
        toString();
        j2h1.o("DeferrableSurface");
    }

    public abstract n8d0 f();
}
