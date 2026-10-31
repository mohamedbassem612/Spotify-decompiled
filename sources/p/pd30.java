package p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.SparseArray;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pd30 {
    public final NotificationManager a;
    public final kqi0 b;
    public final wd30 c;
    public final ow3 d;
    public final Scheduler e;
    public final q8n f;
    public final SparseArray g = new SparseArray();
    public final PublishSubject h = new PublishSubject();
    public final CompositeDisposable i = new CompositeDisposable();
    public int j = -1;
    public t7y k;
    public llm l;
    public String m;

    public pd30(Context context, NotificationManager notificationManager, kqi0 kqi0Var, wd30 wd30Var, ow3 ow3Var, Scheduler scheduler, q8n q8nVar) {
        this.a = notificationManager;
        this.b = kqi0Var;
        this.c = wd30Var;
        this.d = ow3Var;
        this.e = scheduler;
        this.f = q8nVar;
        if (Build.VERSION.SDK_INT >= 26) {
            String string = context.getResources().getString(2131962879);
            String string2 = context.getResources().getString(2131962879);
            NotificationChannel notificationChannel = new NotificationChannel("spotify_updates_channel", string, 2);
            notificationChannel.setDescription(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final void a(ld30 ld30Var) {
        if (!u890.j(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.h.onNext(ld30Var);
            return;
        }
        t7y t7yVar = this.k;
        if (t7yVar != null) {
            t7yVar.m(ld30Var);
        }
    }

    public final synchronized void b(hpq hpqVar, int i) {
        try {
            Logger.b("hideNotification() private method: id=" + i + ", currentForegroundId=" + this.j, new Object[0]);
            this.a.cancel(i);
            this.g.remove(i);
            if (this.j == i) {
                if (this.g.size() != 0) {
                    Logger.b("Cancelled notification " + i + " was in foreground, will check other ongoing notifications", new Object[0]);
                    int size = this.g.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            Logger.b("No ongoing notifications require foreground state - stopping foreground", new Object[0]);
                            g(hpqVar, true);
                            break;
                        }
                        int iKeyAt = this.g.keyAt(i2);
                        md30 md30Var = (md30) this.g.get(iKeyAt);
                        if (md30Var.b()) {
                            Logger.b("Ongoing notification " + md30Var + " requires foreground state, so we keep it", new Object[0]);
                            e(iKeyAt, md30Var.c(), md30Var.a(), hpqVar);
                            break;
                        }
                        i2++;
                    }
                } else {
                    Logger.b("Cancelled notification " + i + " was in foreground and there are no more ongoing notifications - stopping foreground", new Object[0]);
                    g(hpqVar, true);
                }
            }
            c();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        SparseArray sparseArray = this.g;
        String string = sparseArray.toString();
        if (string.equals(this.m)) {
            sparseArray.size();
        } else {
            this.m = string;
            Logger.b("%d Ongoing notifications: %s", new Object[]{Integer.valueOf(sparseArray.size()), string});
        }
    }

    public final void d(int i, Notification notification) {
        llm llmVar = this.l;
        if (llmVar == null) {
            Logger.b(f4i1.c(i, "notifyNotification() skipped, coroutineScope is null "), new Object[0]);
        } else {
            c921.y(llmVar, this.f, 0, new v2b(this, i, notification, (lnm) null, (byte) 6), 2);
        }
    }

    public final void e(int i, Notification notification, Integer num, hpq hpqVar) {
        String str = i == 2131430173 ? "placeholder " : "";
        if (i != this.j) {
            Logger.b("Setting %s as foreground (fgsType=%s) with %snotification: %d", new Object[]{hpqVar.getClass().getSimpleName(), num, str, Integer.valueOf(i)});
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.n(hpqVar, hpqVar.getClass().getSimpleName(), new nd30(i, notification, num, hpqVar));
        } else {
            hpqVar.startForeground(i, notification);
        }
        this.c.a.onNext(0L);
        this.j = i;
        SparseArray sparseArray = this.g;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            if (iKeyAt != this.j) {
                d(iKeyAt, ((md30) sparseArray.get(iKeyAt)).c());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x002a A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:16:0x002a, B:30:0x0071, B:17:0x002e, B:19:0x0038, B:21:0x0048, B:23:0x0051, B:25:0x0061, B:27:0x0067, B:28:0x006b, B:29:0x006e), top: B:35:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:17:0x002e A[Catch: all -> 0x0022, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:16:0x002a, B:30:0x0071, B:17:0x002e, B:19:0x0038, B:21:0x0048, B:23:0x0051, B:25:0x0061, B:27:0x0067, B:28:0x006b, B:29:0x006e), top: B:35:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[Catch: all -> 0x0022, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:16:0x002a, B:30:0x0071, B:17:0x002e, B:19:0x0038, B:21:0x0048, B:23:0x0051, B:25:0x0061, B:27:0x0067, B:28:0x006b, B:29:0x006e), top: B:35:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[Catch: all -> 0x0022, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:16:0x002a, B:30:0x0071, B:17:0x002e, B:19:0x0038, B:21:0x0048, B:23:0x0051, B:25:0x0061, B:27:0x0067, B:28:0x006b, B:29:0x006e), top: B:35:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[Catch: all -> 0x0022, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:16:0x002a, B:30:0x0071, B:17:0x002e, B:19:0x0038, B:21:0x0048, B:23:0x0051, B:25:0x0061, B:27:0x0067, B:28:0x006b, B:29:0x006e), top: B:35:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[SYNTHETIC] */
    public final synchronized void f(hpq hpqVar, int i, Notification notification, boolean z, Integer num) {
        int i2;
        int size;
        int i3;
        int iKeyAt;
        md30 md30Var;
        if (!z || i == 2131430173) {
            i2 = this.j;
            if (z) {
                if (i == i2) {
                    size = this.g.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            g(hpqVar, false);
                            break;
                        }
                        iKeyAt = this.g.keyAt(i3);
                        md30 md30Var2 = (md30) this.g.get(iKeyAt);
                        if (iKeyAt == i && md30Var2.b()) {
                            e(iKeyAt, notification, num, hpqVar);
                            break;
                        }
                        i3++;
                    }
                }
            } else if (i2 == -1) {
                e(i, notification, num, hpqVar);
            } else {
                md30Var = (md30) this.g.get(i2);
                if (md30Var != null) {
                    e(this.j, md30Var.c(), md30Var.a(), hpqVar);
                }
            }
            d(i, notification);
            this.g.put(i, new md30(notification, z, num));
            c();
        } else {
            if (this.j == 2131430173) {
                Logger.b("Dismissing placeholder notification as real foreground notification is being shown", new Object[0]);
                this.g.remove(2131430173);
                this.a.cancel(2131430173);
                this.j = -1;
            }
            i2 = this.j;
            if (z) {
                if (i == i2) {
                    size = this.g.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            g(hpqVar, false);
                            break;
                        }
                        iKeyAt = this.g.keyAt(i3);
                        md30 md30Var3 = (md30) this.g.get(iKeyAt);
                        if (iKeyAt == i) {
                        }
                        i3++;
                    }
                }
            } else if (i2 == -1) {
                e(i, notification, num, hpqVar);
            } else {
                md30Var = (md30) this.g.get(i2);
                if (md30Var != null) {
                    e(this.j, md30Var.c(), md30Var.a(), hpqVar);
                }
            }
            d(i, notification);
            this.g.put(i, new md30(notification, z, num));
            c();
        }
        throw th;
    }

    public final void g(hpq hpqVar, boolean z) {
        Logger.b("Stopping " + hpqVar.getClass().getSimpleName() + " as foreground, removeNotification=" + z + ", lastForegroundId: " + this.j, new Object[0]);
        if (z) {
            hpqVar.stopForeground(1);
        } else {
            hpqVar.stopForeground(2);
        }
        this.c.a.onNext(0L);
        this.j = -1;
    }

    public final synchronized void h(hpq hpqVar) {
        try {
            i();
            this.k = new t7y(this, hpqVar, (byte) 28);
            llm llmVar = this.l;
            if (llmVar != null) {
                smo1.q(llmVar);
            }
            this.l = smo1.e(ha71.A(guo1.B(), new z8n("ForegroundNotifier")));
            this.i.b(this.h.observeOn(this.e).subscribe((Consumer) new od30(this, (byte) 0)));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        try {
            this.i.g();
            this.k = null;
            llm llmVar = this.l;
            if (llmVar != null) {
                smo1.q(llmVar);
            }
            this.l = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
