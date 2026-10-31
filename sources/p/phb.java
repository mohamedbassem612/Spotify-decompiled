package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class phb {
    public final Context a;
    public final mw7 b;
    public final xgn0 c = ygn0.a();
    public volatile ihb d;

    public phb(Context context, mw7 mw7Var) {
        this.a = context;
        this.b = mw7Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c0 A[PHI: r11
      0x00c0: PHI (r11v5 java.util.List) = (r11v1 java.util.List), (r11v2 java.util.List), (r11v11 java.util.List) binds: [B:65:0x00f2, B:67:0x00fb, B:51:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[Catch: all -> 0x0039, Exception -> 0x003c, CancellationException -> 0x003f, TimeoutCancellationException -> 0x0042, TRY_ENTER, TryCatch #5 {TimeoutCancellationException -> 0x0042, CancellationException -> 0x003f, Exception -> 0x003c, blocks: (B:15:0x0034, B:62:0x00ed, B:63:0x00ef, B:28:0x0051, B:58:0x00d9, B:53:0x00c2, B:55:0x00c8, B:59:0x00dc), top: B:75:0x0024, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8 A[Catch: all -> 0x0039, Exception -> 0x003c, CancellationException -> 0x003f, TimeoutCancellationException -> 0x0042, TryCatch #5 {TimeoutCancellationException -> 0x0042, CancellationException -> 0x003f, Exception -> 0x003c, blocks: (B:15:0x0034, B:62:0x00ed, B:63:0x00ef, B:28:0x0051, B:58:0x00d9, B:53:0x00c2, B:55:0x00c8, B:59:0x00dc), top: B:75:0x0024, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc A[Catch: all -> 0x0039, Exception -> 0x003c, CancellationException -> 0x003f, TimeoutCancellationException -> 0x0042, TryCatch #5 {TimeoutCancellationException -> 0x0042, CancellationException -> 0x003f, Exception -> 0x003c, blocks: (B:15:0x0034, B:62:0x00ed, B:63:0x00ef, B:28:0x0051, B:58:0x00d9, B:53:0x00c2, B:55:0x00c8, B:59:0x00dc), top: B:75:0x0024, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ea, code lost:
    
        if (r12 == r1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r11, p.onm r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.phb.a(java.util.List, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0206 A[Catch: Exception -> 0x020c, TRY_LEAVE, TryCatch #2 {Exception -> 0x020c, blocks: (B:100:0x01fc, B:102:0x0206), top: B:113:0x01fc }] */
    /* JADX WARN: Code duplicated, block: B:123:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(List list, onm onmVar) throws Exception {
        khb khbVar;
        qt7 qt7Var;
        int mode;
        Exception exc;
        zwg zwgVar;
        ayh ayhVar;
        zwg zwgVar2;
        qt7 qt7Var2;
        dt71 dt71Var;
        int i;
        AtomicBoolean atomicBoolean;
        AudioDeviceInfo audioDeviceInfo;
        Object next;
        char c;
        char c2;
        uw7 uw7Var;
        Object objRemove;
        if (onmVar instanceof khb) {
            khbVar = (khb) onmVar;
            int i2 = khbVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                khbVar.i = i2 - Integer.MIN_VALUE;
            } else {
                khbVar = new khb(this, onmVar);
            }
        } else {
            khbVar = new khb(this, onmVar);
        }
        Object obj = khbVar.g;
        int i3 = khbVar.i;
        pw7 pw7Var = pw7.a;
        uw7 uw7Var2 = this.b;
        Object obj2 = null;
        if (i3 != 0) {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mode = khbVar.f;
            zwgVar = khbVar.e;
            AtomicBoolean atomicBoolean2 = khbVar.d;
            ayh ayhVar2 = khbVar.c;
            dt71Var = khbVar.b;
            qt7 qt7Var3 = khbVar.a;
            try {
                hm5.M(obj);
                qt7Var2 = qt7Var3;
                zwgVar2 = zwgVar;
                ayhVar = ayhVar2;
                i = mode;
                atomicBoolean = atomicBoolean2;
                return new ihb(this, i, dt71Var, new ela((byte) 1, (Object) atomicBoolean, (Object) this, (Object) qt7Var2, (Object) ayhVar, (Object) zwgVar2, (lnm) null));
            } catch (Exception e) {
                exc = e;
                try {
                    pw7Var.b(uw7Var2.a);
                } catch (Exception e2) {
                    j2h1.h(exc, e2);
                }
                try {
                    uw7Var2.g(mode);
                } catch (Exception e3) {
                    j2h1.h(exc, e3);
                }
                try {
                    uw7Var = uw7Var2;
                    objRemove = uw7Var.e.remove(zwgVar);
                    if (objRemove != null) {
                        throw exc;
                    }
                    pw7Var.f(uw7Var.a, objRemove);
                    throw exc;
                } catch (Exception e4) {
                    j2h1.h(exc, e4);
                    throw exc;
                }
            }
        }
        hm5.M(obj);
        uw7 uw7Var3 = uw7Var2;
        List<AudioDeviceInfo> listC = pw7Var.c(uw7Var3.a);
        ArrayList arrayList = new ArrayList(q7h.U(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new rt7((AudioDeviceInfo) it.next()));
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                qt7Var = null;
                break;
            }
            mf20 mf20Var = new mf20(z561.T(new nb9(this, (String) it2.next()), new i46(arrayList, (byte) 1)));
            if (mf20Var.hasNext()) {
                next = mf20Var.next();
                if (mf20Var.hasNext()) {
                    int type = ((qt7) next).getType();
                    if (type == 7) {
                        c = 2;
                    } else if (type != 23) {
                        c = type != 26 ? (char) 65535 : (char) 0;
                    } else {
                        c = 1;
                    }
                    do {
                        Object next2 = mf20Var.next();
                        int type2 = ((qt7) next2).getType();
                        if (type2 == 7) {
                            c2 = 2;
                        } else if (type2 != 23) {
                            c2 = type2 != 26 ? (char) 65535 : (char) 0;
                        } else {
                            c2 = 1;
                        }
                        if (c > c2) {
                            c = c2;
                            next = next2;
                        }
                    } while (mf20Var.hasNext());
                }
            } else {
                next = obj2;
            }
            qt7 qt7Var4 = (qt7) next;
            if (qt7Var4 != null) {
                qt7Var = qt7Var4;
                break;
            }
            obj2 = null;
        }
        if (qt7Var == null) {
            throw new IllegalStateException(("Bluetooth communication device could not be resolved from " + list.size() + " identifiers and " + arrayList.size() + " available devices").toString());
        }
        new Integer(qt7Var.getType());
        new Integer(arrayList.size());
        mode = uw7Var3.a.getMode();
        ayh ayhVarA = sap1.a();
        dt71 dt71VarE = mgo1.e(1, 1, 0, 4);
        ayh ayhVarA2 = sap1.a();
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        zwg zwgVar3 = new zwg(qt7Var, ayhVarA, atomicBoolean3, dt71VarE, ayhVarA2);
        Executor executorN = x74.N(this.a);
        AudioManager audioManager = uw7Var3.a;
        Object objE = pw7Var.e(new rr6(zwgVar3, (byte) 17));
        Object objPut = uw7Var3.e.put(zwgVar3, objE);
        if (objPut != null) {
            pw7Var.f(audioManager, objPut);
        }
        pw7Var.a(audioManager, executorN, objE);
        try {
            uw7Var2.g(3);
            uw7 uw7Var4 = uw7Var2;
            uw7Var4.getClass();
            rt7 rt7Var = qt7Var instanceof rt7 ? (rt7) qt7Var : null;
            if (!((rt7Var == null || (audioDeviceInfo = rt7Var.a) == null) ? false : pw7Var.g(uw7Var4.a, audioDeviceInfo))) {
                throw new IllegalStateException("Communication-device request rejected");
            }
            AudioDeviceInfo audioDeviceInfoD = pw7Var.d(uw7Var2.a);
            rt7 rt7Var2 = audioDeviceInfoD != null ? new rt7(audioDeviceInfoD) : null;
            if (rt7Var2 != null && rt7Var2.a.getId() == qt7Var.getId()) {
                ayhVarA.m0(rih1.a);
            }
            lhb lhbVar = new lhb(ayhVarA, null, (byte) 0);
            khbVar.a = qt7Var;
            khbVar.b = dt71VarE;
            khbVar.c = ayhVarA2;
            khbVar.d = atomicBoolean3;
            khbVar.e = zwgVar3;
            khbVar.f = mode;
            khbVar.i = 1;
            Object objM = rc2.M(5000L, lhbVar, khbVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
            ayhVar = ayhVarA2;
            zwgVar2 = zwgVar3;
            qt7Var2 = qt7Var;
            dt71Var = dt71VarE;
            i = mode;
            atomicBoolean = atomicBoolean3;
            return new ihb(this, i, dt71Var, new ela((byte) 1, (Object) atomicBoolean, (Object) this, (Object) qt7Var2, (Object) ayhVar, (Object) zwgVar2, (lnm) null));
        } catch (Exception e5) {
            exc = e5;
            zwgVar = zwgVar3;
            pw7Var.b(uw7Var2.a);
            uw7Var2.g(mode);
            uw7Var = uw7Var2;
            objRemove = uw7Var.e.remove(zwgVar);
            if (objRemove != null) {
                throw exc;
            }
            pw7Var.f(uw7Var.a, objRemove);
            throw exc;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) throws Exception {
        mhb mhbVar;
        int mode;
        Exception exc;
        ohb ohbVar;
        dt71 dt71Var;
        ohb ohbVar2;
        ayh ayhVar;
        AtomicBoolean atomicBoolean;
        if (onmVar instanceof mhb) {
            mhbVar = (mhb) onmVar;
            int i = mhbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mhbVar.h = i - Integer.MIN_VALUE;
            } else {
                mhbVar = new mhb(this, onmVar);
            }
        } else {
            mhbVar = new mhb(this, onmVar);
        }
        Object obj = mhbVar.f;
        int i2 = mhbVar.h;
        Context context = this.a;
        uw7 uw7Var = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mode = mhbVar.a;
            ohbVar = mhbVar.e;
            AtomicBoolean atomicBoolean2 = mhbVar.d;
            ayh ayhVar2 = mhbVar.c;
            dt71Var = mhbVar.b;
            try {
                hm5.M(obj);
                atomicBoolean = atomicBoolean2;
                ayhVar = ayhVar2;
                ohbVar2 = ohbVar;
                return new ihb(this, mode, dt71Var, new nhb(atomicBoolean, this, ayhVar, ohbVar2, null, (byte) 0));
            } catch (Exception e) {
                exc = e;
                try {
                    uw7Var.a.stopBluetoothSco();
                } catch (Exception e2) {
                    j2h1.h(exc, e2);
                }
                try {
                    context.unregisterReceiver(ohbVar);
                } catch (Exception e3) {
                    j2h1.h(exc, e3);
                }
                try {
                    uw7Var.g(mode);
                    throw exc;
                } catch (Exception e4) {
                    j2h1.h(exc, e4);
                    throw exc;
                }
            }
        }
        hm5.M(obj);
        mode = uw7Var.a.getMode();
        ayh ayhVarA = sap1.a();
        dt71 dt71VarE = mgo1.e(1, 1, 0, 4);
        ayh ayhVarA2 = sap1.a();
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        ohb ohbVar3 = new ohb(ayhVarA, atomicBoolean3, dt71VarE, ayhVarA2);
        try {
            Intent intentG0 = x74.g0(context, ohbVar3, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), new Handler(Looper.getMainLooper()), 2);
            if (intentG0 != null && intentG0.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) == 1) {
                ayhVarA.m0(rih1.a);
            }
            uw7Var.g(3);
            uw7Var.a.startBluetoothSco();
            lhb lhbVar = new lhb(ayhVarA, null, (byte) 1);
            mhbVar.b = dt71VarE;
            mhbVar.c = ayhVarA2;
            mhbVar.d = atomicBoolean3;
            mhbVar.e = ohbVar3;
            mhbVar.a = mode;
            mhbVar.h = 1;
            Object objM = rc2.M(5000L, lhbVar, mhbVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
            dt71Var = dt71VarE;
            ohbVar2 = ohbVar3;
            ayhVar = ayhVarA2;
            atomicBoolean = atomicBoolean3;
            return new ihb(this, mode, dt71Var, new nhb(atomicBoolean, this, ayhVar, ohbVar2, null, (byte) 0));
        } catch (Exception e5) {
            exc = e5;
            ohbVar = ohbVar3;
            uw7Var.a.stopBluetoothSco();
            context.unregisterReceiver(ohbVar);
            uw7Var.g(mode);
            throw exc;
        }
    }
}
