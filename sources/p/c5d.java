package p;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class c5d implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ d5d b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ mzc g;

    public /* synthetic */ c5d(d5d d5dVar, Context context, Executor executor, int i, mzc mzcVar, long j) {
        this.b = d5dVar;
        this.f = context;
        this.c = executor;
        this.e = i;
        this.g = mzcVar;
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x010a A[Catch: all -> 0x019b, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143 A[Catch: all -> 0x019b, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e A[Catch: all -> 0x019b, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x015c A[Catch: all -> 0x019b, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0160 A[Catch: all -> 0x019b, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0184 A[Catch: all -> 0x019b, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0188 A[Catch: all -> 0x019b, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x018d A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #7 {all -> 0x019b, blocks: (B:7:0x0038, B:9:0x0040, B:11:0x0060, B:13:0x006a, B:15:0x0083, B:17:0x008e, B:24:0x009d, B:26:0x00ab, B:28:0x00b1, B:29:0x00b7, B:30:0x00b9, B:33:0x00bd, B:37:0x00c7, B:38:0x00c8, B:39:0x00d4, B:40:0x00d5, B:41:0x00e1, B:50:0x00f9, B:52:0x010a, B:53:0x0111, B:57:0x011a, B:59:0x0134, B:60:0x0138, B:61:0x0143, B:62:0x0145, B:66:0x014a, B:68:0x014e, B:69:0x0150, B:72:0x0154, B:76:0x015b, B:77:0x015c, B:79:0x0160, B:80:0x0184, B:82:0x0188, B:83:0x018d, B:88:0x019a, B:48:0x00ea, B:49:0x00f8, B:64:0x0147, B:65:0x0149, B:70:0x0151, B:71:0x0153), top: B:98:0x0038, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0160, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        r4d r4dVar;
        uc31 uc31VarA;
        switch (this.a) {
            case 0:
                d5d d5dVar = this.b;
                Context context = this.f;
                Executor executor = this.c;
                int i = this.e;
                mzc mzcVar = this.g;
                long j = this.d;
                Trace.beginSection("CX:initAndRetryRecursively");
                Context contextP = o4o1.p(context);
                try {
                    try {
                        try {
                            if (d5dVar.c.b() == null) {
                                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                            }
                            ly8 ly8Var = new ly8(d5dVar.d, d5dVar.e);
                            u4d u4dVarA = d5dVar.c.a();
                            d5dVar.f = new e1d(contextP, ly8Var, u4dVarA, d5dVar.c.d());
                            if (d5dVar.c.n() == null) {
                                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                            }
                            e1d e1dVar = d5dVar.f;
                            d5dVar.g = x1d.a(contextP, e1dVar.e, new LinkedHashSet(e1dVar.f));
                            if (d5dVar.c.r() == null) {
                                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                            }
                            d5dVar.h = new b2d(contextP);
                            if (executor instanceof k3d) {
                                ((k3d) executor).a(d5dVar.f);
                            }
                            d5dVar.a.n(d5dVar.f);
                            b5d.a(contextP, d5dVar.a, u4dVarA);
                            if (i > 1 && mif1.g()) {
                                mif1.h(-1, "CX:CameraProvider-RetryStatus");
                            }
                            synchronized (d5dVar.b) {
                                d5dVar.k = 4;
                                break;
                            }
                            mzcVar.b((Object) null);
                            Trace.endSection();
                            return;
                        } catch (CameraValidator$CameraIdListIncorrectException e) {
                            e = e;
                            r4dVar = new r4d(j, e);
                            uc31VarA = d5dVar.i.a(r4dVar);
                            if (mif1.g()) {
                                mif1.h(r4dVar.a, "CX:CameraProvider-RetryStatus");
                            }
                            if (uc31VarA.b) {
                                synchronized (d5dVar.b) {
                                    d5dVar.k = 3;
                                    if (uc31VarA.c) {
                                        synchronized (d5dVar.b) {
                                            d5dVar.k = 4;
                                            mzcVar.b((Object) null);
                                        }
                                    } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                        String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                        j2h1.q("CameraX");
                                        mzcVar.c(new InitializationException(new CameraUnavailableException(str)));
                                    } else if (e instanceof InitializationException) {
                                        mzcVar.c(e);
                                    } else {
                                        mzcVar.c(new InitializationException(e));
                                    }
                                }
                            } else {
                                synchronized (d5dVar.b) {
                                    d5dVar.k = 3;
                                    if (uc31VarA.c) {
                                        synchronized (d5dVar.b) {
                                            d5dVar.k = 4;
                                            mzcVar.b((Object) null);
                                        }
                                    } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                        j2h1.q("CameraX");
                                        mzcVar.c(new InitializationException(new CameraUnavailableException(str2)));
                                    } else if (e instanceof InitializationException) {
                                        mzcVar.c(e);
                                    } else {
                                        mzcVar.c(new InitializationException(e));
                                    }
                                }
                            }
                        } catch (InitializationException e2) {
                            e = e2;
                            r4dVar = new r4d(j, e);
                            uc31VarA = d5dVar.i.a(r4dVar);
                            if (mif1.g()) {
                                mif1.h(r4dVar.a, "CX:CameraProvider-RetryStatus");
                            }
                            if (uc31VarA.b) {
                                synchronized (d5dVar.b) {
                                    d5dVar.k = 3;
                                    if (uc31VarA.c) {
                                        synchronized (d5dVar.b) {
                                            d5dVar.k = 4;
                                            mzcVar.b((Object) null);
                                        }
                                    } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                        j2h1.q("CameraX");
                                        mzcVar.c(new InitializationException(new CameraUnavailableException(str3)));
                                    } else if (e instanceof InitializationException) {
                                        mzcVar.c(e);
                                    } else {
                                        mzcVar.c(new InitializationException(e));
                                    }
                                }
                            } else {
                                synchronized (d5dVar.b) {
                                    d5dVar.k = 3;
                                    if (uc31VarA.c) {
                                        synchronized (d5dVar.b) {
                                            d5dVar.k = 4;
                                            mzcVar.b((Object) null);
                                        }
                                    } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                        j2h1.q("CameraX");
                                        mzcVar.c(new InitializationException(new CameraUnavailableException(str4)));
                                    } else if (e instanceof InitializationException) {
                                        mzcVar.c(e);
                                    } else {
                                        mzcVar.c(new InitializationException(e));
                                    }
                                }
                            }
                        } catch (RuntimeException e3) {
                            e = e3;
                            r4dVar = new r4d(j, e);
                            uc31VarA = d5dVar.i.a(r4dVar);
                            if (mif1.g()) {
                                mif1.h(r4dVar.a, "CX:CameraProvider-RetryStatus");
                            }
                            if (uc31VarA.b) {
                                synchronized (d5dVar.b) {
                                    d5dVar.k = 3;
                                    if (uc31VarA.c) {
                                        synchronized (d5dVar.b) {
                                            d5dVar.k = 4;
                                            mzcVar.b((Object) null);
                                        }
                                    } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                        j2h1.q("CameraX");
                                        mzcVar.c(new InitializationException(new CameraUnavailableException(str5)));
                                    } else if (e instanceof InitializationException) {
                                        mzcVar.c(e);
                                    } else {
                                        mzcVar.c(new InitializationException(e));
                                    }
                                }
                            } else {
                                synchronized (d5dVar.b) {
                                    d5dVar.k = 3;
                                    if (uc31VarA.c) {
                                        synchronized (d5dVar.b) {
                                            d5dVar.k = 4;
                                            mzcVar.b((Object) null);
                                        }
                                    } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                        String str6 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                        j2h1.q("CameraX");
                                        mzcVar.c(new InitializationException(new CameraUnavailableException(str6)));
                                    } else if (e instanceof InitializationException) {
                                        mzcVar.c(e);
                                    } else {
                                        mzcVar.c(new InitializationException(e));
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (CameraValidator$CameraIdListIncorrectException e4) {
                    e = e4;
                } catch (InitializationException e5) {
                    e = e5;
                } catch (RuntimeException e6) {
                    e = e6;
                }
                r4dVar = new r4d(j, e);
                uc31VarA = d5dVar.i.a(r4dVar);
                if (mif1.g()) {
                    mif1.h(r4dVar.a, "CX:CameraProvider-RetryStatus");
                }
                if (uc31VarA.b || i >= Integer.MAX_VALUE) {
                    synchronized (d5dVar.b) {
                        d5dVar.k = 3;
                        break;
                    }
                    if (uc31VarA.c) {
                        synchronized (d5dVar.b) {
                            d5dVar.k = 4;
                            break;
                        }
                        mzcVar.b((Object) null);
                    } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                        String str7 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                        j2h1.q("CameraX");
                        mzcVar.c(new InitializationException(new CameraUnavailableException(str7)));
                    } else if (e instanceof InitializationException) {
                        mzcVar.c(e);
                    } else {
                        mzcVar.c(new InitializationException(e));
                    }
                } else {
                    SystemClock.elapsedRealtime();
                    j2h1.N("CameraX");
                    Handler handler = d5dVar.e;
                    c5d c5dVar = new c5d(d5dVar, executor, j, i, contextP, mzcVar);
                    long j2 = uc31VarA.a;
                    if (Build.VERSION.SDK_INT >= 28) {
                        ph5.K(handler, c5dVar, j2);
                    } else {
                        Message messageObtain = Message.obtain(handler, c5dVar);
                        messageObtain.obj = "retry_token";
                        handler.sendMessageDelayed(messageObtain, j2);
                    }
                }
                Trace.endSection();
                return;
            default:
                d5d d5dVar2 = this.b;
                Executor executor2 = this.c;
                executor2.execute(new c5d(d5dVar2, this.f, executor2, this.e + 1, this.g, this.d));
                return;
        }
    }

    public /* synthetic */ c5d(d5d d5dVar, Executor executor, long j, int i, Context context, mzc mzcVar) {
        this.b = d5dVar;
        this.c = executor;
        this.d = j;
        this.e = i;
        this.f = context;
        this.g = mzcVar;
    }
}
