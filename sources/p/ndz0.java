package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ndz0 implements tf9, uf9, xg9, kh9 {
    public final ni9 a;
    public final yqg b;
    public final qf9 c;
    public final rf9 d;
    public final ynb0 e;
    public final ae9 f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final it8 i;
    public final li9 j;
    public final Subject k;
    public final ConcurrentHashMap l;
    public final ConcurrentHashMap m;
    public final ConcurrentHashMap n;
    public final ConcurrentHashMap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f44p;
    public final ConcurrentHashMap q;

    public ndz0(ni9 ni9Var, yqg yqgVar, qf9 qf9Var, rf9 rf9Var, ynb0 ynb0Var, ae9 ae9Var, it8 it8Var, li9 li9Var, tgb tgbVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.a = ni9Var;
        this.b = yqgVar;
        this.c = qf9Var;
        this.d = rf9Var;
        this.e = ynb0Var;
        this.f = ae9Var;
        this.g = concurrentHashMap;
        this.h = concurrentHashMap2;
        this.i = it8Var;
        this.j = li9Var;
        this.k = tgbVar.isEnabled() ? new PublishSubject().c() : new PublishSubject();
        this.l = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.f44p = new ConcurrentHashMap();
        this.q = new ConcurrentHashMap();
    }

    public static idz0 m(idz0 idz0Var, iu30 iu30Var) {
        if (idz0Var instanceof hdz0) {
            return (idz0) iu30Var.invoke(((hdz0) idz0Var).a);
        }
        if (idz0Var instanceof gdz0) {
            return idz0Var;
        }
        eg.o();
        return null;
    }

    public static idz0 n(Object obj, Object obj2) {
        return obj != null ? new hdz0(obj) : new gdz0(obj2);
    }

    public final Subject a() {
        return this.k;
    }

    @Override // p.tf9
    public final void b() {
        ((lh9) this.e.get()).clear();
        this.n.clear();
        this.o.clear();
        this.q.clear();
        for (String str : this.h.keySet()) {
            str.getClass();
            k(new bh9(str));
        }
        for (String str2 : this.g.keySet()) {
            str2.getClass();
            j(str2);
        }
    }

    @Override // p.kh9
    public final void c(jh9 jh9Var) {
        fdz0 fdz0Var;
        Map map;
        BluetoothGattService bluetoothGattServiceB;
        BluetoothGattCharacteristic characteristic;
        Boolean m231Var;
        boolean z = jh9Var instanceof dh9;
        ConcurrentHashMap concurrentHashMap = this.f44p;
        ConcurrentHashMap concurrentHashMap2 = this.h;
        boolean zBooleanValue = false;
        Subject subject = this.k;
        ConcurrentHashMap concurrentHashMap3 = this.g;
        if (z) {
            dh9 dh9Var = (dh9) jh9Var;
            BluetoothDevice bluetoothDevice = dh9Var.a;
            String address = bluetoothDevice.getAddress();
            if (concurrentHashMap3.containsKey(address) || concurrentHashMap2.containsKey(address)) {
                if (concurrentHashMap3.containsKey(address)) {
                    address.getClass();
                    j(address);
                } else {
                    address.getClass();
                    k(new bh9(address));
                }
                p(dh9Var);
                return;
            }
            Object obj = new Object();
            concurrentHashMap.put(address, obj);
            address.getClass();
            ozu0 ozu0Var = new ozu0(this, address, obj, (byte) 15);
            this.c.getClass();
            bf9 bf9Var = new bf9(address, ozu0Var);
            rf9 rf9Var = this.d;
            BluetoothGatt bluetoothGattConnectGatt = bluetoothDevice.connectGatt(rf9Var.a.getApplicationContext(), false, bf9Var, 2);
            concurrentHashMap2.put(address, bluetoothGattConnectGatt == null ? qtg.a : new bi9(bluetoothGattConnectGatt, rf9Var.b));
            subject.onNext(new cg9(address));
            return;
        }
        boolean z2 = jh9Var instanceof hh9;
        it8 it8Var = this.i;
        ConcurrentHashMap concurrentHashMap4 = this.m;
        if (z2) {
            hh9 hh9Var = (hh9) jh9Var;
            String str = hh9Var.a;
            ai9 ai9Var = (ai9) concurrentHashMap3.get(str);
            Integer num = (Integer) concurrentHashMap4.get(str);
            int i = hh9Var.b;
            it8.m(it8Var, str, "mtu_requested", num, (String) null, (String) null, f4i1.c(i, "requestedMtu="), 24);
            if (ai9Var != null ? ai9Var.c(i) : false) {
                return;
            }
            it8.m(it8Var, str, "mtu_request_failed", (Integer) concurrentHashMap4.get(str), (String) null, (String) null, (String) null, 56);
            p(hh9Var);
            k(new ch9(str));
            return;
        }
        boolean z3 = jh9Var instanceof fh9;
        fi9 fi9Var = fi9.b;
        if (z3) {
            fh9 fh9Var = (fh9) jh9Var;
            String str2 = fh9Var.a;
            ai9 ai9Var2 = (ai9) concurrentHashMap3.get(str2);
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
            p(fh9Var);
            subject.onNext(new fg9(str2, fi9Var));
            return;
        }
        boolean z4 = jh9Var instanceof eh9;
        ConcurrentHashMap concurrentHashMap5 = this.l;
        hg9 hg9Var = hg9.a;
        if (z4) {
            eh9 eh9Var = (eh9) jh9Var;
            String str3 = eh9Var.a;
            UUID uuid = eh9Var.b;
            it8.m(it8Var, str3, "read_requested", (Integer) concurrentHashMap4.get(str3), (String) null, (String) null, eqq.m("characteristic=", uuid), 24);
            ai9 ai9Var3 = (ai9) concurrentHashMap3.get(str3);
            idz0 idz0VarM = m(m(m(m(n(ai9Var3, hg9Var), new ldz0(this, (byte) 0)), new ug9(this, uuid, (byte) 4)), new ldz0(this, (byte) 1)), new vvu0(ai9Var3, this, str3, eh9Var, (byte) 8));
            gdz0 gdz0Var = idz0VarM instanceof gdz0 ? (gdz0) idz0VarM : null;
            if (gdz0Var != null) {
                Object obj2 = gdz0Var.a;
                edz0 edz0Var = (edz0) this.o.get(str3);
                cdz0 cdz0Var = (edz0Var == null || (map = edz0Var.b) == null) ? null : (cdz0) map.get(eh9Var);
                if (cdz0Var == null || cdz0Var.b.compareAndSet(false, true)) {
                    if (cdz0Var != null) {
                        AtomicReference atomicReference = edz0Var.c;
                        while (!atomicReference.compareAndSet(cdz0Var, null) && atomicReference.get() == cdz0Var) {
                        }
                    }
                    it8.m(it8Var, str3, "read_rejected", (Integer) concurrentHashMap4.get(str3), (String) null, String.valueOf(obj2), eqq.m("characteristic=", uuid), 8);
                    p(eh9Var);
                    og9 og9Var = (og9) obj2;
                    fi9 fi9Var2 = (fi9) concurrentHashMap5.get(str3);
                    if (fi9Var2 == null) {
                        fi9Var2 = fi9Var;
                    }
                    subject.onNext(new wf9(str3, uuid, og9Var, fi9Var2));
                    return;
                }
                return;
            }
            return;
        }
        if (jh9Var instanceof ih9) {
            ih9 ih9Var = (ih9) jh9Var;
            String str4 = ih9Var.a;
            UUID uuid2 = ih9Var.b;
            byte[] bArr = ih9Var.c;
            it8.m(it8Var, str4, "write_requested", (Integer) concurrentHashMap4.get(str4), (String) null, (String) null, eqq.m("characteristic=", uuid2), 24);
            ai9 ai9Var4 = (ai9) concurrentHashMap3.get(str4);
            l811 l811Var = new l811();
            idz0 idz0VarM2 = m(m(m(m(n(ai9Var4, hg9Var), new ldz0(this, (byte) 2)), new ug9(this, uuid2, (byte) 5)), new ldz0(this, (byte) 3)), new z1(ai9Var4, this, str4, uuid2, bArr, l811Var, ih9Var, (byte) 19));
            if (l811Var.a) {
                subject.onNext(new zf9(str4, uuid2));
                p(ih9Var);
                return;
            }
            gdz0 gdz0Var2 = idz0VarM2 instanceof gdz0 ? (gdz0) idz0VarM2 : null;
            if (gdz0Var2 != null) {
                Object obj3 = gdz0Var2.a;
                ConcurrentHashMap concurrentHashMap6 = this.n;
                fdz0 fdz0Var2 = (fdz0) concurrentHashMap6.get(str4);
                ddz0 ddz0Var = fdz0Var2 != null ? (ddz0) fdz0Var2.c.get() : null;
                if ((ddz0Var != null ? ddz0Var.a : null) == ih9Var && (fdz0Var = (fdz0) concurrentHashMap6.get(str4)) != null) {
                    AtomicReference atomicReference2 = fdz0Var.c;
                    while (!atomicReference2.compareAndSet(ddz0Var, null) && atomicReference2.get() == ddz0Var) {
                    }
                }
                it8.m(it8Var, str4, "write_rejected", (Integer) concurrentHashMap4.get(str4), (String) null, String.valueOf(obj3), eqq.m("characteristic=", uuid2), 8);
                p(ih9Var);
                og9 og9Var2 = (og9) obj3;
                fi9 fi9Var3 = (fi9) concurrentHashMap5.get(str4);
                if (fi9Var3 == null) {
                    fi9Var3 = fi9Var;
                }
                subject.onNext(new yf9(str4, uuid2, og9Var2, fi9Var3));
                return;
            }
            return;
        }
        if (jh9Var instanceof ch9) {
            ch9 ch9Var = (ch9) jh9Var;
            String str5 = ch9Var.a;
            ai9 ai9Var5 = (ai9) concurrentHashMap3.get(str5);
            if (ai9Var5 != null ? ai9Var5.e() : false) {
                return;
            }
            p(ch9Var);
            j(str5);
            return;
        }
        if (jh9Var instanceof gh9) {
            gh9 gh9Var = (gh9) jh9Var;
            String str6 = gh9Var.a;
            ai9 ai9Var6 = (ai9) concurrentHashMap3.get(str6);
            if (ai9Var6 != null ? ai9Var6.f() : false) {
                return;
            }
            p(gh9Var);
            j(str6);
            return;
        }
        boolean z5 = jh9Var instanceof ah9;
        ae9 ae9Var = this.f;
        if (z5) {
            ah9 ah9Var = (ah9) jh9Var;
            String str7 = ah9Var.a;
            boolean zA = ae9Var.a.a();
            boolean zA2 = ae9Var.b.a();
            if (!zA || !zA2) {
                k(new yg9(str7));
                p(ah9Var);
                return;
            }
            ai9 ai9Var7 = (ai9) concurrentHashMap3.get(str7);
            if (ai9Var7 != null) {
                subject.onNext(new eg9(str7));
                ai9Var7.disconnect();
                return;
            } else {
                k(new yg9(str7));
                p(ah9Var);
                return;
            }
        }
        if (jh9Var instanceof bh9) {
            bh9 bh9Var = (bh9) jh9Var;
            String str8 = bh9Var.a;
            boolean zA3 = ae9Var.a.a();
            boolean zA4 = ae9Var.b.a();
            if (!zA3 || !zA4) {
                h(str8);
                p(bh9Var);
                return;
            }
            ai9 ai9Var8 = (ai9) concurrentHashMap2.get(str8);
            if (ai9Var8 != null) {
                subject.onNext(new eg9(str8));
                ai9Var8.disconnect();
                return;
            } else {
                h(str8);
                p(bh9Var);
                return;
            }
        }
        if (jh9Var instanceof yg9) {
            yg9 yg9Var = (yg9) jh9Var;
            i(yg9Var.a);
            p(yg9Var);
        } else {
            if (!(jh9Var instanceof zg9)) {
                eg.o();
                return;
            }
            zg9 zg9Var = (zg9) jh9Var;
            String str9 = zg9Var.a;
            i(str9);
            concurrentHashMap.remove(str9);
            this.q.remove(str9);
            ai9 ai9Var9 = (ai9) concurrentHashMap2.remove(str9);
            if (ai9Var9 != null) {
                ai9Var9.close();
            }
            p(zg9Var);
        }
    }

    @Override // p.kh9
    public final void d(jh9 jh9Var) {
        Map map;
        fdz0 fdz0Var;
        ConcurrentHashMap concurrentHashMap = this.l;
        mg9 mg9Var = mg9.a;
        ConcurrentHashMap concurrentHashMap2 = this.n;
        fi9 fi9Var = fi9.b;
        Subject subject = this.k;
        it8.m(this.i, jh9Var.a(), "operation_timeout", (Integer) this.m.get(jh9Var.a()), (String) null, (String) null, l1d.m("operation=", rc11.a.b(jh9Var.getClass()).r()), 24);
        if (jh9Var instanceof dh9) {
            BluetoothDevice bluetoothDevice = ((dh9) jh9Var).a;
            String address = bluetoothDevice.getAddress();
            Object obj = this.f44p.get(address);
            if (obj != null) {
                synchronized (obj) {
                    this.f44p.remove(address, obj);
                }
            }
            h(bluetoothDevice.getAddress());
            return;
        }
        if (jh9Var instanceof hh9) {
            k(new ch9(((hh9) jh9Var).a));
            return;
        }
        if (jh9Var instanceof ch9) {
            j(((ch9) jh9Var).a);
            return;
        }
        if (jh9Var instanceof ah9) {
            k(new yg9(((ah9) jh9Var).a));
            return;
        }
        if (jh9Var instanceof bh9) {
            h(((bh9) jh9Var).a);
            return;
        }
        if (jh9Var instanceof gh9) {
            j(((gh9) jh9Var).a);
            return;
        }
        if (jh9Var instanceof ih9) {
            ih9 ih9Var = (ih9) jh9Var;
            String str = ih9Var.a;
            fdz0 fdz0Var2 = (fdz0) concurrentHashMap2.get(str);
            ddz0 ddz0Var = fdz0Var2 != null ? (ddz0) fdz0Var2.c.get() : null;
            if ((ddz0Var != null ? ddz0Var.a : null) == jh9Var && (fdz0Var = (fdz0) concurrentHashMap2.get(str)) != null) {
                AtomicReference atomicReference = fdz0Var.c;
                while (!atomicReference.compareAndSet(ddz0Var, null) && atomicReference.get() == ddz0Var) {
                }
            }
            UUID uuid = ih9Var.b;
            fi9 fi9Var2 = (fi9) concurrentHashMap.get(str);
            if (fi9Var2 != null) {
                fi9Var = fi9Var2;
            }
            subject.onNext(new yf9(str, uuid, mg9Var, fi9Var));
            return;
        }
        if (!(jh9Var instanceof eh9)) {
            if (jh9Var instanceof fh9) {
                subject.onNext(new fg9(((fh9) jh9Var).a, fi9Var));
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap3 = this.o;
        eh9 eh9Var = (eh9) jh9Var;
        String str2 = eh9Var.a;
        edz0 edz0Var = (edz0) concurrentHashMap3.get(str2);
        cdz0 cdz0Var = (edz0Var == null || (map = edz0Var.b) == null) ? null : (cdz0) map.get(jh9Var);
        if (cdz0Var == null || cdz0Var.b.compareAndSet(false, true)) {
            if (cdz0Var != null) {
                edz0Var.d.set(true);
                AtomicReference atomicReference2 = edz0Var.c;
                while (!atomicReference2.compareAndSet(cdz0Var, null) && atomicReference2.get() == cdz0Var) {
                }
            }
            UUID uuid2 = eh9Var.b;
            fi9 fi9Var3 = (fi9) concurrentHashMap.get(str2);
            if (fi9Var3 != null) {
                fi9Var = fi9Var3;
            }
            subject.onNext(new wf9(str2, uuid2, mg9Var, fi9Var));
        }
    }

    @Override // p.uf9
    public final void e(String str, UUID uuid, byte[] bArr) {
        k(new ih9(str, uuid, bArr));
    }

    @Override // p.uf9
    public final void f(String str, UUID uuid) {
        k(new eh9(str, uuid));
    }

    @Override // p.tf9
    public final void g(BluetoothDevice bluetoothDevice) {
        k(new dh9(bluetoothDevice));
    }

    public final void h(String str) {
        k(new zg9(str));
    }

    public final void i(String str) {
        Object obj = this.f44p.get(str);
        if (obj != null) {
            synchronized (obj) {
                this.f44p.remove(str, obj);
            }
        }
        this.n.remove(str);
        this.o.remove(str);
        this.q.remove(str);
        ai9 ai9Var = (ai9) this.g.remove(str);
        if (ai9Var != null) {
            ai9Var.close();
        }
    }

    public final void j(String str) {
        k(new ah9(str));
    }

    public final void k(jh9 jh9Var) {
        ((lh9) this.e.get()).b(jh9Var);
    }

    public final void l(String str) {
        it8.m(this.i, str, "connected", (Integer) this.m.get(str), (String) null, (String) null, (String) null, 56);
        this.k.onNext(new bg9(str));
        ni9 ni9Var = this.a;
        if (ni9Var.a.isEnabled()) {
            k(new hh9(str, ((Number) ni9Var.b.b()).intValue()));
        } else {
            k(new ch9(str));
        }
    }

    public final boolean o(String str) {
        ai9 ai9Var = (ai9) this.h.remove(str);
        if (ai9Var == null) {
            return false;
        }
        this.g.put(str, ai9Var);
        this.n.put(str, new fdz0(ai9Var));
        this.q.remove(str);
        return true;
    }

    public final void p(jh9 jh9Var) {
        ((lh9) this.e.get()).d(jh9Var);
    }
}
