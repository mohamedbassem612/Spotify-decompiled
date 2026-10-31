package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p.fzq;
import p.i92;
import p.j8n1;
import p.jim0;
import p.kyn1;
import p.mdy;
import p.ohs0;
import p.p331;
import p.pze0;
import p.q9n1;
import p.vba;
import p.vso1;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class BasePendingResult<R extends p331> {
    public static final i92 m = new i92((byte) 17);
    public final vba b;
    public vso1 e;
    public p331 g;
    public Status h;
    public volatile boolean i;
    public boolean j;
    public boolean k;
    private q9n1 resultGuardian;
    public final Object a = new Object();
    public final CountDownLatch c = new CountDownLatch(1);
    public final ArrayList d = new ArrayList();
    public final AtomicReference f = new AtomicReference();
    public boolean l = false;

    public BasePendingResult(j8n1 j8n1Var) {
        this.b = new vba(j8n1Var != null ? j8n1Var.a.g : Looper.getMainLooper(), (byte) 2);
        new WeakReference(j8n1Var);
    }

    public static void k(p331 p331Var) {
        if (p331Var instanceof mdy) {
            try {
                ((mdy) p331Var).d();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(p331Var));
            }
        }
    }

    public final void b(ohs0 ohs0Var) {
        synchronized (this.a) {
            try {
                if (f()) {
                    ohs0Var.a(this.h);
                } else {
                    this.d.add(ohs0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            try {
                if (!this.j && !this.i) {
                    k(this.g);
                    this.j = true;
                    j(d(Status.i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ p331 d(Status status) {
        return new kyn1(status, (fzq) null);
    }

    public final void e(Status status) {
        synchronized (this.a) {
            try {
                if (!f()) {
                    a(d(status));
                    this.k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        return this.c.getCount() == 0;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void a(p331 p331Var) {
        synchronized (this.a) {
            try {
                if (this.k || this.j) {
                    k(p331Var);
                    return;
                }
                f();
                zod.v("Results have already been set", !f());
                zod.v("Result has already been consumed", !this.i);
                j(p331Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(vso1 vso1Var) {
        boolean z;
        synchronized (this.a) {
            try {
                zod.v("Result has already been consumed.", !this.i);
                synchronized (this.a) {
                    z = this.j;
                }
                if (z) {
                    return;
                }
                if (f()) {
                    jim0 jim0Var = this.b;
                    jim0Var.sendMessage(jim0Var.obtainMessage(1, new Pair(vso1Var, i())));
                } else {
                    this.e = vso1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p331 i() {
        p331 p331Var;
        synchronized (this.a) {
            zod.v("Result has already been consumed.", !this.i);
            zod.v("Result is not ready.", f());
            p331Var = this.g;
            this.g = null;
            this.e = null;
            this.i = true;
        }
        pze0.m(this.f.getAndSet(null));
        zod.s(p331Var);
        return p331Var;
    }

    public final void j(p331 p331Var) {
        this.g = p331Var;
        this.h = p331Var.getStatus();
        this.c.countDown();
        if (this.j) {
            this.e = null;
        } else {
            vso1 vso1Var = this.e;
            if (vso1Var != null) {
                jim0 jim0Var = this.b;
                jim0Var.removeMessages(2);
                jim0Var.sendMessage(jim0Var.obtainMessage(1, new Pair(vso1Var, i())));
            } else if (this.g instanceof mdy) {
                this.resultGuardian = new q9n1(this);
            }
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ohs0) arrayList.get(i)).a(this.h);
        }
        arrayList.clear();
    }

    public BasePendingResult(Looper looper) {
        this.b = new vba(looper, (byte) 2);
        new WeakReference(null);
    }
}
