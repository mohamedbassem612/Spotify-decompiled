package p;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class h7o1 implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7o1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case 0:
                fvo1 fvo1Var = (fvo1) this.b;
                int i = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                synchronized (fvo1Var) {
                    try {
                        a1p1 a1p1Var = (a1p1) fvo1Var.e.get(i);
                        if (a1p1Var != null) {
                            fvo1Var.e.remove(i);
                            fvo1Var.c();
                            Bundle data = message.getData();
                            if (data.getBoolean("unsupported", false)) {
                                a1p1Var.c(new zzq("Not supported by GmsCore", (Throwable) null));
                            } else {
                                a1p1Var.a(data);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    b3p1 b3p1Var = (b3p1) this.b;
                    synchronized (b3p1Var.a) {
                        try {
                            rxo1 rxo1Var = (rxo1) message.obj;
                            pzo1 pzo1Var = (pzo1) b3p1Var.a.get(rxo1Var);
                            if (pzo1Var != null && pzo1Var.a.isEmpty()) {
                                if (pzo1Var.c) {
                                    rxo1 rxo1Var2 = pzo1Var.e;
                                    b3p1 b3p1Var2 = pzo1Var.g;
                                    b3p1Var2.c.removeMessages(1, rxo1Var2);
                                    b3p1Var2.d.b(b3p1Var2.b, pzo1Var);
                                    pzo1Var.c = false;
                                    pzo1Var.b = (byte) 2;
                                }
                                b3p1Var.a.remove(rxo1Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                b3p1 b3p1Var3 = (b3p1) this.b;
                synchronized (b3p1Var3.a) {
                    try {
                        rxo1 rxo1Var3 = (rxo1) message.obj;
                        pzo1 pzo1Var2 = (pzo1) b3p1Var3.a.get(rxo1Var3);
                        if (pzo1Var2 != null && pzo1Var2.b == 3) {
                            new StringBuilder(String.valueOf(rxo1Var3).length() + 47);
                            new Exception();
                            ComponentName componentName2 = pzo1Var2.f;
                            if (componentName2 == null) {
                                rxo1Var3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = rxo1Var3.b;
                                zod.s(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            pzo1Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return true;
        }
    }
}
