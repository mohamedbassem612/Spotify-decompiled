package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class t5t implements x5t {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w5t b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ t5t(w5t w5tVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = w5tVar;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // p.x5t
    public final ScheduledFuture a(final h9n h9nVar) {
        byte b = this.a;
        final Runnable runnable = this.c;
        final w5t w5tVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                final byte b2 = 0;
                return w5tVar.b.scheduleAtFixedRate(new Runnable() { // from class: p.u5t
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        final h9n h9nVar2 = h9nVar;
                        final Runnable runnable2 = runnable;
                        w5t w5tVar2 = w5tVar;
                        switch (b3) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                final byte b4 = 0;
                                w5tVar2.a.execute(new Runnable() { // from class: p.s5t
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        byte b5 = b4;
                                        h9n h9nVar3 = h9nVar2;
                                        Runnable runnable3 = runnable2;
                                        switch (b5) {
                                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    h9nVar3.c(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    h9nVar3.c(e2);
                                                    return;
                                                }
                                            default:
                                                try {
                                                    runnable3.run();
                                                    h9nVar3.b((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    h9nVar3.c(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final byte b5 = 2;
                                w5tVar2.a.execute(new Runnable() { // from class: p.s5t
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        byte b6 = b5;
                                        h9n h9nVar3 = h9nVar2;
                                        Runnable runnable3 = runnable2;
                                        switch (b6) {
                                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    h9nVar3.c(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    h9nVar3.c(e2);
                                                    return;
                                                }
                                            default:
                                                try {
                                                    runnable3.run();
                                                    h9nVar3.b((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    h9nVar3.c(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b6 = 1;
                                w5tVar2.a.execute(new Runnable() { // from class: p.s5t
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        byte b7 = b6;
                                        h9n h9nVar3 = h9nVar2;
                                        Runnable runnable3 = runnable2;
                                        switch (b7) {
                                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    h9nVar3.c(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    h9nVar3.c(e2);
                                                    return;
                                                }
                                            default:
                                                try {
                                                    runnable3.run();
                                                    h9nVar3.b((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    h9nVar3.c(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, this.d, this.e, this.f);
            default:
                final byte b3 = 2;
                return w5tVar.b.scheduleWithFixedDelay(new Runnable() { // from class: p.u5t
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        final h9n h9nVar2 = h9nVar;
                        final Runnable runnable2 = runnable;
                        w5t w5tVar2 = w5tVar;
                        switch (b4) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                final byte b5 = 0;
                                w5tVar2.a.execute(new Runnable() { // from class: p.s5t
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        byte b7 = b5;
                                        h9n h9nVar3 = h9nVar2;
                                        Runnable runnable3 = runnable2;
                                        switch (b7) {
                                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    h9nVar3.c(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    h9nVar3.c(e2);
                                                    return;
                                                }
                                            default:
                                                try {
                                                    runnable3.run();
                                                    h9nVar3.b((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    h9nVar3.c(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final byte b6 = 2;
                                w5tVar2.a.execute(new Runnable() { // from class: p.s5t
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        byte b7 = b6;
                                        h9n h9nVar3 = h9nVar2;
                                        Runnable runnable3 = runnable2;
                                        switch (b7) {
                                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    h9nVar3.c(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    h9nVar3.c(e2);
                                                    return;
                                                }
                                            default:
                                                try {
                                                    runnable3.run();
                                                    h9nVar3.b((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    h9nVar3.c(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b7 = 1;
                                w5tVar2.a.execute(new Runnable() { // from class: p.s5t
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        byte b8 = b7;
                                        h9n h9nVar3 = h9nVar2;
                                        Runnable runnable3 = runnable2;
                                        switch (b8) {
                                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    h9nVar3.c(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    h9nVar3.c(e2);
                                                    return;
                                                }
                                            default:
                                                try {
                                                    runnable3.run();
                                                    h9nVar3.b((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    h9nVar3.c(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, this.d, this.e, this.f);
        }
    }
}
