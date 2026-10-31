package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vg9 implements tf9, uf9, xg9, kh9 {
    public final Scheduler a;
    public final ni9 b;
    public final yqg c;
    public final qf9 d;
    public final rf9 e;
    public final ynb0 f;
    public final ae9 g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;
    public final CompositeDisposable j;
    public final it8 k;
    public final li9 l;
    public final Subject m;
    public final PublishSubject n;
    public final ConcurrentHashMap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f126p;

    public vg9(Scheduler scheduler, ni9 ni9Var, yqg yqgVar, qf9 qf9Var, rf9 rf9Var, ynb0 ynb0Var, ae9 ae9Var, it8 it8Var, li9 li9Var, tgb tgbVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.a = scheduler;
        this.b = ni9Var;
        this.c = yqgVar;
        this.d = qf9Var;
        this.e = rf9Var;
        this.f = ynb0Var;
        this.g = ae9Var;
        this.h = concurrentHashMap;
        this.i = concurrentHashMap2;
        this.j = compositeDisposable;
        this.k = it8Var;
        this.l = li9Var;
        this.m = tgbVar.isEnabled() ? new PublishSubject().c() : new PublishSubject();
        this.n = new PublishSubject();
        this.o = new ConcurrentHashMap();
        this.f126p = new ConcurrentHashMap();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static tg9 j(tg9 tg9Var, iu30 iu30Var) throws NoWhenBranchMatchedException {
        if (tg9Var instanceof sg9) {
            return (tg9) iu30Var.invoke(((sg9) tg9Var).a());
        }
        if (tg9Var instanceof rg9) {
            return tg9Var;
        }
        eg.o();
        return null;
    }

    public static tg9 k(Object obj, Object obj2) {
        return obj != null ? new sg9(obj) : new rg9(obj2);
    }

    public final Subject a() {
        return this.m;
    }

    public final void b() {
        ((lh9) this.f.get()).clear();
        this.j.g();
        for (String str : this.i.keySet()) {
            str.getClass();
            i(new bh9(str));
        }
        for (String str2 : this.h.keySet()) {
            str2.getClass();
            h(str2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c(jh9 jh9Var) throws NoWhenBranchMatchedException {
        rg9 rg9Var;
        BluetoothGattService bluetoothGattServiceB;
        BluetoothGattCharacteristic characteristic;
        Boolean m231Var;
        boolean z = jh9Var instanceof dh9;
        ConcurrentHashMap concurrentHashMap = this.i;
        boolean zBooleanValue = false;
        Subject subject = this.m;
        ConcurrentHashMap concurrentHashMap2 = this.h;
        if (z) {
            dh9 dh9Var = (dh9) jh9Var;
            BluetoothDevice bluetoothDeviceB = dh9Var.b();
            String address = bluetoothDeviceB.getAddress();
            if (concurrentHashMap2.containsKey(address) || concurrentHashMap.containsKey(address)) {
                l(dh9Var);
                return;
            }
            Logger.g("BLEConnection: event=connection_attempted peer=%s role=central outcome=pending", address);
            address.getClass();
            n5 n5Var = new n5(this);
            this.d.getClass();
            bf9 bf9Var = new bf9(address, n5Var);
            rf9 rf9Var = this.e;
            BluetoothGatt bluetoothGattConnectGatt = bluetoothDeviceB.connectGatt(rf9Var.a.getApplicationContext(), false, bf9Var, 2);
            concurrentHashMap.put(address, bluetoothGattConnectGatt == null ? qtg.a : new bi9(bluetoothGattConnectGatt, rf9Var.b));
            subject.onNext(new cg9(address));
            return;
        }
        boolean z2 = jh9Var instanceof hh9;
        it8 it8Var = this.k;
        ConcurrentHashMap concurrentHashMap3 = this.f126p;
        if (z2) {
            hh9 hh9Var = (hh9) jh9Var;
            ai9 ai9Var = (ai9) concurrentHashMap2.get(hh9Var.a());
            it8.m(it8Var, hh9Var.a(), "mtu_requested", (Integer) concurrentHashMap3.get(hh9Var.a()), (String) null, (String) null, f4i1.c(hh9Var.b(), "requestedMtu="), 24);
            if (ai9Var != null ? ai9Var.c(hh9Var.b()) : false) {
                return;
            }
            it8.m(it8Var, hh9Var.a(), "mtu_request_failed", (Integer) concurrentHashMap3.get(hh9Var.a()), (String) null, (String) null, (String) null, 56);
            l(hh9Var);
            i(new ch9(hh9Var.a()));
            return;
        }
        boolean z3 = jh9Var instanceof fh9;
        fi9 fi9Var = fi9.UNKNOWN;
        if (z3) {
            fh9 fh9Var = (fh9) jh9Var;
            ai9 ai9Var2 = (ai9) concurrentHashMap2.get(fh9Var.a());
            if (ai9Var2 != null && (bluetoothGattServiceB = ai9Var2.b()) != null && (characteristic = bluetoothGattServiceB.getCharacteristic(pe9.b)) != null) {
                try {
                    m231Var = Boolean.valueOf(ai9Var2.a(characteristic));
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Boolean bool = Boolean.FALSE;
                if (m231Var instanceof m231) {
                    m231Var = bool;
                }
                zBooleanValue = m231Var.booleanValue();
            }
            if (zBooleanValue) {
                return;
            }
            l(fh9Var);
            subject.onNext(new fg9(fh9Var.a(), fi9Var));
            return;
        }
        boolean z4 = jh9Var instanceof eh9;
        ConcurrentHashMap concurrentHashMap4 = this.o;
        hg9 hg9Var = hg9.a;
        if (z4) {
            eh9 eh9Var = (eh9) jh9Var;
            String strB = eh9Var.b();
            UUID uuidC = eh9Var.c();
            it8.m(it8Var, strB, "read_requested", (Integer) concurrentHashMap3.get(strB), (String) null, (String) null, eqq.m("characteristic=", uuidC), 24);
            ai9 ai9Var3 = (ai9) concurrentHashMap2.get(strB);
            tg9 tg9VarJ = j(j(j(j(k(ai9Var3, hg9Var), new rs7(this, (byte) 2)), new ug9(this, uuidC, (byte) 0)), new rs7(this, (byte) 3)), new uv8(ai9Var3, this));
            rg9Var = tg9VarJ instanceof rg9 ? (rg9) tg9VarJ : null;
            if (rg9Var != null) {
                it8.m(it8Var, strB, "read_rejected", (Integer) concurrentHashMap3.get(strB), (String) null, String.valueOf(rg9Var.a()), eqq.m("characteristic=", uuidC), 8);
                l(eh9Var);
                og9 og9Var = (og9) rg9Var.a();
                fi9 fi9Var2 = (fi9) concurrentHashMap4.get(strB);
                if (fi9Var2 == null) {
                    fi9Var2 = fi9Var;
                }
                subject.onNext(new wf9(strB, uuidC, og9Var, fi9Var2));
                return;
            }
            return;
        }
        if (jh9Var instanceof ih9) {
            ih9 ih9Var = (ih9) jh9Var;
            String strB2 = ih9Var.b();
            UUID uuidC2 = ih9Var.c();
            byte[] bArrD = ih9Var.d();
            it8.m(it8Var, strB2, "write_requested", (Integer) concurrentHashMap3.get(strB2), (String) null, (String) null, eqq.m("characteristic=", uuidC2), 24);
            ai9 ai9Var4 = (ai9) concurrentHashMap2.get(strB2);
            tg9 tg9VarJ2 = j(j(j(j(k(ai9Var4, hg9Var), new rs7(this, (byte) 4)), new ug9(this, uuidC2, (byte) 1)), new rs7(this, (byte) 5)), new kd8(ai9Var4, this, bArrD));
            rg9Var = tg9VarJ2 instanceof rg9 ? (rg9) tg9VarJ2 : null;
            if (rg9Var != null) {
                Logger.g("BLEConnection: event=write_rejected peer=%s characteristic=%s outcome=%s", strB2, uuidC2, rg9Var.a());
                it8.m(it8Var, strB2, "write_rejected", (Integer) concurrentHashMap3.get(strB2), (String) null, String.valueOf(rg9Var.a()), eqq.m("characteristic=", uuidC2), 8);
                l(ih9Var);
                og9 og9Var2 = (og9) rg9Var.a();
                fi9 fi9Var3 = (fi9) concurrentHashMap4.get(strB2);
                if (fi9Var3 == null) {
                    fi9Var3 = fi9Var;
                }
                subject.onNext(new yf9(strB2, uuidC2, og9Var2, fi9Var3));
                return;
            }
            return;
        }
        if (jh9Var instanceof ch9) {
            ch9 ch9Var = (ch9) jh9Var;
            ai9 ai9Var5 = (ai9) concurrentHashMap2.get(ch9Var.a());
            if (ai9Var5 != null ? ai9Var5.e() : false) {
                return;
            }
            l(ch9Var);
            h(ch9Var.a());
            return;
        }
        if (jh9Var instanceof gh9) {
            gh9 gh9Var = (gh9) jh9Var;
            ai9 ai9Var6 = (ai9) concurrentHashMap2.get(gh9Var.a());
            if (ai9Var6 != null ? ai9Var6.f() : false) {
                return;
            }
            l(gh9Var);
            h(gh9Var.a());
            return;
        }
        boolean z5 = jh9Var instanceof ah9;
        ae9 ae9Var = this.g;
        PublishSubject publishSubject = this.n;
        if (z5) {
            ah9 ah9Var = (ah9) jh9Var;
            Logger.g("BLEConnection: event=disconnect_requested peer=%s role=central outcome=pending", ah9Var.a());
            boolean zA = ae9Var.a.a();
            boolean zA2 = ae9Var.b.a();
            if (!zA || !zA2) {
                l(ah9Var);
                i(new yg9(ah9Var.a()));
                return;
            }
            publishSubject.onNext(ah9Var.a());
            ai9 ai9Var7 = (ai9) concurrentHashMap2.get(ah9Var.a());
            if (ai9Var7 == null) {
                l(ah9Var);
                return;
            } else {
                subject.onNext(new eg9(ah9Var.a()));
                ai9Var7.disconnect();
                return;
            }
        }
        if (jh9Var instanceof bh9) {
            bh9 bh9Var = (bh9) jh9Var;
            Logger.g("BLEConnection: event=disconnect_requested peer=%s role=central outcome=pending", bh9Var.a());
            boolean zA3 = ae9Var.a.a();
            boolean zA4 = ae9Var.b.a();
            if (!zA3 || !zA4) {
                l(bh9Var);
                i(new zg9(bh9Var.a()));
                return;
            }
            publishSubject.onNext(bh9Var.a());
            ai9 ai9Var8 = (ai9) concurrentHashMap.get(bh9Var.a());
            if (ai9Var8 == null) {
                l(bh9Var);
                return;
            } else {
                subject.onNext(new eg9(bh9Var.a()));
                ai9Var8.disconnect();
                return;
            }
        }
        if (jh9Var instanceof yg9) {
            yg9 yg9Var = (yg9) jh9Var;
            l(yg9Var);
            String strA = yg9Var.a();
            ai9 ai9Var9 = (ai9) concurrentHashMap2.get(strA);
            if (ai9Var9 == null) {
                return;
            }
            publishSubject.onNext(strA);
            ai9Var9.close();
            concurrentHashMap2.remove(strA);
            concurrentHashMap3.remove(strA);
            return;
        }
        if (!(jh9Var instanceof zg9)) {
            eg.o();
            return;
        }
        zg9 zg9Var = (zg9) jh9Var;
        l(zg9Var);
        String strA2 = zg9Var.a();
        ai9 ai9Var10 = (ai9) concurrentHashMap.get(strA2);
        if (ai9Var10 == null) {
            return;
        }
        publishSubject.onNext(strA2);
        ai9Var10.close();
        concurrentHashMap.remove(strA2);
        concurrentHashMap3.remove(strA2);
    }

    public final void d(jh9 jh9Var) {
        if (jh9Var instanceof ih9) {
            ih9 ih9Var = (ih9) jh9Var;
            Logger.g("BLEConnection: event=write_result peer=%s characteristic=%s outcome=operation_timeout", ih9Var.a(), ih9Var.e());
        }
        it8.m(this.k, jh9Var.a(), "operation_timeout", (Integer) this.f126p.get(jh9Var.a()), (String) null, (String) null, l1d.m("operation=", rc11.a.b(jh9Var.getClass()).r()), 24);
        if (jh9Var instanceof ah9) {
            i(new yg9(((ah9) jh9Var).a()));
        } else if (jh9Var instanceof bh9) {
            i(new zg9(((bh9) jh9Var).a()));
        } else if (jh9Var instanceof gh9) {
            h(((gh9) jh9Var).a());
        }
    }

    public final void e(String str, UUID uuid, byte[] bArr) {
        Logger.g("BLEConnection: event=write_requested peer=%s characteristic=%s outcome=pending", str, uuid);
        i(new ih9(str, uuid, bArr));
    }

    public final void f(String str, UUID uuid) {
        i(new eh9(str, uuid));
    }

    public final void g(BluetoothDevice bluetoothDevice) {
        i(new dh9(bluetoothDevice));
    }

    public final void h(String str) {
        i(new ah9(str));
    }

    public final void i(jh9 jh9Var) {
        ((lh9) this.f.get()).b(jh9Var);
    }

    public final void l(jh9 jh9Var) {
        ((lh9) this.f.get()).d(jh9Var);
    }
}
