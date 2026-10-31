package p;

import android.os.Handler;
import android.os.Message;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cv40 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ kv40 c;

    public cv40(kv40 kv40Var) {
        this.c = kv40Var;
    }

    public static void a(gwh0 gwh0Var, int i, Object obj, int i2) {
        lwh0 lwh0Var;
        f3a f3aVar;
        lwh0 lwh0Var2;
        owh0 owh0Var = gwh0Var.a;
        fwh0 fwh0Var = gwh0Var.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    fwh0Var.getClass();
                }
                return;
            }
            kwh0 kwh0Var = (kwh0) obj;
            switch (i) {
                case NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT /* 513 */:
                    fwh0Var.a(kwh0Var);
                    break;
                case NativeMediaProcessor.PROCESS_SAMPLE_RESULT_PROCESS_BYTE_COUNTS_TOO_SHORT /* 514 */:
                    fwh0Var.c(kwh0Var);
                    break;
                case NativeMediaProcessor.PROCESS_SAMPLE_RESULT_INVALID_CONTEXT_SIZE /* 515 */:
                    fwh0Var.b(kwh0Var);
                    break;
            }
        }
        if (i == 264 || i == 262) {
            jv40 jv40Var = (jv40) obj;
            lwh0 lwh0Var3 = jv40Var.b;
            lwh0Var = jv40Var.a;
            f3aVar = jv40Var.d;
            lwh0Var2 = lwh0Var3;
        } else {
            lwh0Var = null;
            if (i == 265 || i == 266) {
                iv40 iv40Var = (iv40) obj;
                lwh0 lwh0Var4 = iv40Var.a;
                lwh0Var = iv40Var.b;
                lwh0Var2 = lwh0Var4;
                f3aVar = null;
            } else {
                lwh0Var2 = (lwh0) obj;
                f3aVar = null;
            }
        }
        if (lwh0Var2 != null) {
            boolean zD = true;
            if ((gwh0Var.d & 2) == 0 && !lwh0Var2.g(gwh0Var.c)) {
                swh0 swh0Var = owh0.c().u;
                zD = ((swh0Var == null ? false : swh0Var.d) && lwh0Var2.d() && i == 262 && i2 == 3 && lwh0Var != null) ? true ^ lwh0Var.d() : false;
            }
            if (zD) {
                switch (i) {
                    case 257:
                        fwh0Var.d(owh0Var, lwh0Var2);
                        break;
                    case 258:
                        fwh0Var.h(owh0Var, lwh0Var2);
                        break;
                    case 259:
                        fwh0Var.e(owh0Var, lwh0Var2);
                        break;
                    case 260:
                        fwh0Var.getClass();
                        break;
                    case 261:
                        fwh0Var.getClass();
                        break;
                    case 262:
                        fwh0Var.j(owh0Var, lwh0Var2, lwh0Var2, f3aVar);
                        break;
                    case 263:
                        fwh0Var.k(owh0Var, lwh0Var2, i2);
                        break;
                    case 264:
                        fwh0Var.j(owh0Var, lwh0Var2, lwh0Var, f3aVar);
                        break;
                    case 265:
                        fwh0Var.f(lwh0Var, lwh0Var2);
                        break;
                    case 266:
                        fwh0Var.g(lwh0Var, lwh0Var2, i2);
                        break;
                }
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iL;
        ArrayList arrayList = this.a;
        kv40 kv40Var = this.c;
        ArrayList arrayList2 = kv40Var.h;
        adt0 adt0Var = kv40Var.s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && kv40Var.h().c.equals(((lwh0) obj).c)) {
            kv40Var.q(true);
        }
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            jv40 jv40Var = (jv40) obj;
            lwh0 lwh0Var = jv40Var.b;
            if (jv40Var.c) {
                adt0Var.q(lwh0Var);
            }
            if (kv40Var.v != null && lwh0Var.d()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    adt0Var.p((lwh0) it.next());
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    adt0Var.o((lwh0) obj);
                    break;
                case 258:
                    adt0Var.p((lwh0) obj);
                    break;
                case 259:
                    lwh0 lwh0Var2 = (lwh0) obj;
                    adt0Var.getClass();
                    if (lwh0Var2.b() != adt0Var && (iL = adt0Var.l(lwh0Var2)) >= 0) {
                        adt0.u((ddt0) adt0Var.R0.get(iL));
                    }
                    break;
            }
        } else {
            jv40 jv40Var2 = (jv40) obj;
            lwh0 lwh0Var3 = jv40Var2.b;
            arrayList3.add(lwh0Var3);
            adt0Var.o(lwh0Var3);
            if (jv40Var2.c) {
                adt0Var.q(lwh0Var3);
            }
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a((gwh0) it2.next(), i, obj, i2);
                    }
                    return;
                } else {
                    owh0 owh0Var = (owh0) ((WeakReference) arrayList2.get(size)).get();
                    if (owh0Var == null) {
                        arrayList2.remove(size);
                    } else {
                        arrayList.addAll(owh0Var.b);
                    }
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}
